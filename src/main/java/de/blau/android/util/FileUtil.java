package de.blau.android.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Environment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import de.blau.android.contract.Paths;
import de.blau.android.contract.Schemes;

public abstract class FileUtil {

    public static final String FILE_SCHEME_PREFIX = Schemes.FILE + ":";

    /**
     * Private constructor to stop instantiation
     */
    private FileUtil() {
        // private
    }

    /**
     * Get our public directory, creating it if it doesn't exist
     * 
     * @return a File object for the public directory
     * @throws IOException if we can't create the directory
     */
    public static @NonNull File getPublicDirectory() throws IOException {
        return getPublicDirectory(Environment.getExternalStorageDirectory(), Paths.DIRECTORY_PATH_VESPUCCI);
    }

    /**
     * Get a File for directoryName in baseDirectory, if it doesn't exist create it
     * 
     * @param baseDirectory the base directory
     * @param directoryName the new sub-directory
     * @return a File object for the sub-director of the public directory
     * @throws IOException if we can't create the directory
     */
    public static @NonNull File getPublicDirectory(@NonNull File baseDirectory, @NonNull String directoryName) throws IOException {
        if (directoryName.length() == 0) {
            throw new IllegalArgumentException("Directory path is empty.");
        }
        File outDir = new File(baseDirectory, directoryName);
        // noinspection ResultOfMethodCallIgnored
        outDir.mkdir(); // ensure directory exists
        if (!outDir.isDirectory()) {
            throw new IOException("Unable to create directory: " + outDir.getPath());
        }
        return outDir;
    }

    /**
     * Open a local file for writing generating any necessary directories
     * 
     * @param fileName name of the filw we want to write to
     * @return a File object
     * @throws IOException if we can't create the directories
     */
    @NonNull
    public static File openFileForWriting(@NonNull final String fileName) throws IOException {
        File outfile = new File(fileName);
        String parent = outfile.getParent();
        if (parent == null) { // no directory specified, save to standard location
            outfile = new File(FileUtil.getPublicDirectory(), fileName);
        } else { // ensure directory exists
            File outdir = new File(parent);
            // noinspection ResultOfMethodCallIgnored
            outdir.mkdirs();
            if (!outdir.isDirectory()) {
                throw new IOException("Unable to create directory " + outdir.getPath());
            }
        }
        return outfile;
    }

    /**
     * Copy a file from the assets to a (public) destination
     * 
     * @param context Android Context
     * @param assetFileName the filename in the assets
     * @param destinationDir destination directory
     * @param destinationFilename destination filename
     * @throws IOException if we can't copy or write the file
     */
    public static void copyFileFromAssets(@NonNull Context context, @NonNull String assetFileName, @NonNull File destinationDir,
            @NonNull String destinationFilename) throws IOException {
        AssetManager assetManager = context.getAssets();

        try (InputStream in = assetManager.open(assetFileName); FileOutputStream out = new FileOutputStream(new File(destinationDir, destinationFilename));) {
            byte[] buffer = new byte[1024];
            int read;
            while ((read = in.read(buffer)) != -1) {
                out.write(buffer, 0, read);
            }
            out.flush();
        }
    }

    /**
     * Try to convert a content Uri to a file Uri (will handle file uris gracefully)
     * 
     * @param ctx Android Context
     * @param uri the content Uri
     * @return the converted Uri or null
     */
    @Nullable
    public static Uri contentUriToFileUri(@NonNull Context ctx, @NonNull Uri uri) {
        String path = SelectFile.getPath(ctx, uri);
        if (path != null) {
            return Uri.parse(FILE_SCHEME_PREFIX + path);
        }
        return null;
    }

    /**
     * Get the extension of the file, aka the last . separated bit
     * 
     * @param path the path including the filename and extension
     * @return the extension or the full path
     */
    @NonNull
    public static String getExtension(@Nullable String path) {
        if (path == null) {
            return "";
        }
        return path.substring(path.lastIndexOf('.') + 1);
    }

    /**
     * Check if a directory has more that the maxCacheSize contents and reduce that to 90% by deleting oldest files
     * 
     * @param dir the cache directory
     * @param maxCacheSize the maximum cache size
     */
    public static void pruneCache(@NonNull File dir, long maxCacheSize) {
        long result = 0;

        List<File> fileList = Arrays.asList(dir.listFiles());
        for (File f : fileList) {
            result += f.length();
        }
        if (result > maxCacheSize) {
            maxCacheSize = (long) (0.9 * maxCacheSize); // make 10% free
            Collections.sort(fileList, (f0, f1) -> Long.compare(f0.lastModified(), f1.lastModified()));
            for (File f : fileList) {
                long len = f.length();
                if (f.delete()) { // NOSONAR
                    result -= len;
                }
                if (result < maxCacheSize) {
                    break;
                }
            }
        }
    }
}
