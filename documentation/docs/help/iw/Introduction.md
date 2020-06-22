# היכרות עם וספוצ׳י

וספוצ׳י הוא עורך שמכיל את רוב התכונות שיש בעורכים למחשב שולחני לטובת עריכת OpenStreetMap. האפשרות להפעיל את העורך נבדקה על גבי Android 2.3 עד 7.0 ושלל הגוונים של AOSP ונמצאה חיובית. רק אזהרה קטנה: על אף שיכולות המכשירים הניידים משתכללות ומתקרבות לאלו של עמיתיהם השולחניים, למכשירים ישנים במיוחד יש כמות זיכרון מוגבלת מאוד והם נוטים להיות מאוד אטיים. כדאי לקחת זאת בחשבון בעת השימוש בווספוצ׳י ולהגביל, למשל, את האזורים שבעריכה לגודל סביר. 

## שימוש ראשון

בהפעלה יציג בפניך וספוצ׳י את תיבת הדו־שיח „הורדת מיקום אחר”/„טעינת אזור”. אם נקודות הציון מופיעות בפניך וברצונך להוריד מיידית, ניתן לבחור את האפשרות המתאימה ולהגדיר את הרדיוס מסביב למיקום אותו ברצונך להוריד. במכשירים אטיים אין לבחור בשטחים גדולים. 

לחלופין ניתן להתעלם מתיבת הדו־שיח על ידי לחיצה על הכפתור „מעבר למפה” ולשוטט ולהתקרב למיקום אותו ברצונך לערוך ואז להוריד את הנתונים (לעיון נוסף: „עריכה עם וספוצ׳י”).

## עריכה עם וספוצ׳י

בהתאם לגודל המסך וגיל המכשיר שלך פעולות העריכה עשויות להיות נגישות באופן ישיר באמצעות סמלים בסרגל העליון, דרך תפריט נפתח מימין לסרגל העליון, מהסרגל התחתון (אם קיים) או דרך מקש התפריט.

<a id="download"></a>

### נתוני OSM מתקבלים

יש לבחור את סמל ההעברה ![העברה](../images/menu_transfer.png) או את הפריט „העברה” בתפריט. פעולה זו תציג שבע אפשרויות:

* **Download current view** - download the area visible on the screen and merge it with existing data *(requires network connectivity)*
* **Clear and download current view** - clear any data in memory and then download the area visible on the screen *(requires network connectivity)*
* **Upload data to OSM server** - upload edits to OpenStreetMap *(requires authentication)* *(requires network connectivity)*
* **Auto download** - download an area around the current geographic location automatically *(requires network connectivity)* *(requires GPS)*
* **File...** - saving and loading OSM data to/from on device files.
* **Note/Bugs...** - download (automatically and manually) OSM Notes and "Bugs" from QA tools (currently OSMOSE) *(requires network connectivity)*

הדרך הקלה ביותר להוריד נתונים למכשיר היא להתקרב ולגרור למיקום שברצונך לערוך ואז לבחור ב־„הורדת התצוגה הנוכחית”. ניתן להתקרב באמצעות המחוות, כפתורי התקריב או כפתורי עצמת השמע שבמכשיר. וספוצ׳י אמור להוריד את הנתונים בהתאם עבור התצוגה הנוכחית. לא נדרש אימות כדי להוריד נתונים למכשיר שלך.

### עריכה

<a id="lock"></a>

#### נעילה, שחרור, החלפת מצבים

To avoid accidental edits Vespucci starts in "locked" mode, a mode that only allows zooming and moving the map. Tap the ![Locked](../images/locked.png) icon to unlock the screen. 

נגיעה ארוכה בכפתור המנעול תציג תפריט שמציג 4 אפשרויות נכון לעכשיו:

* **Normal** - the default editing mode, new objects can be added, existing ones edited, moved and removed. Simple white lock icon displayed.
* **Tag only** - selecting an existing object will start the Property Editor, a long press on the main screen will add objects, but no other geometry operations will work. White lock icon with a "T" is displayed.
* **Indoor** - enables Indoor mode, see [Indoor mode](#indoor). White lock icon with a "I" is displayed.
* **C-Mode** - enables C-Mode, only objects that have a warning flag set will be displayed, see [C-Mode](#c-mode). White lock icon with a "C" is displayed.

#### נגיעה בודדה, כפולה וארוכה

By default, selectable nodes and ways have an orange area around them indicating roughly where you have to touch to select an object. You have three options:

* Single tap: Selects object. 
    * An isolated node/way is highlighted immediately. 
    * However, if you try to select an object and Vespucci determines that the selection could mean multiple objects it will present a selection menu, enabling you to choose the object you wish to select. 
    * Selected objects are highlighted in yellow. 
    * For further information see [Node selected](Node%20selected.md), [Way selected](Way%20selected.md) and [Relation selected](Relation%20selected.md).
* Double tap: Start [Multiselect mode](Multiselect.md)
* Long press: Creates a "crosshair", enabling you to add nodes, see below and [Creating new objects](Creating%20new%20objects.md). This is only enabled if "Simple mode" is deactivated.

התקרבות בעת ניסיון לערוך אזור צפוף במיוחד נחשבת לאסטרטגיה טובה.

לווספוצ׳י יש מערכת „ביטול/שחזור” טובה כך שאין חשש בנוגע להתנסות עם ההתקן שלך, עם זאת, נא לא להעלות ולשמור נתונים שנועדו לבדיקה בלבד.

#### בחירה / ביטול בחירה (נגיעה בודדת ו־„תפריט בחירה”)

Touch an object to select and highlight it. Touching the screen in an empty region will de-select. If you have selected an object and you need to select something else, simply touch the object in question, there is no need to de-select first. A double tap on an object will start [Multiselect mode](Multiselect.md).

Note that if you try to select an object and Vespucci determines that the selection could mean multiple objects (such as a node on a way or other overlapping objects) it will present a selection menu: Tap the object you wish to select and the object is selected. 

Selected objects are indicated through a thin yellow border. The yellow border may be hard to spot, depending on map background and zoom factor. Once a selection has been made, you will see a notification confirming the selection.

Once the selection has completed you will see (either as buttons or as menu items) a list of supported operations for the selected object: For further information see [Node selected](Node%20selected.md), [Way selected](Way%20selected.md) and [Relation selected](Relation%20selected.md).

#### פריטים נבחרים: עריכת תגיות

A second touch on the selected object opens the tag editor and you can edit the tags associated with the object.

Note that for overlapping objects (such as a node on a way) the selection menu comes back up for a second time. Selecting the same object brings up the tag editor; selecting another object simply selects the other object.

#### פריטים נבחרים: העברת צומת או דרך

Once you have selected an object, it can be moved. Note that objects can be dragged/moved only when they are selected. Simply drag near (i.e. within the tolerance zone of) the selected object to move it. If you select the large drag area in the preferences, you get a large area around the selected node that makes it easier to position the object. 

#### Adding a new Node/Point or Way 

On first start the app launches in "Simple mode", this can be changed in the main menu by un-checking the corresponding checkbox.

##### Simple mode

Tapping the large green floating button on the map screen will show a menu. After you've selected one of the items, you will be asked to tap the screen at the location where you want to create the object, pan and zoom continues to work if you need to adjust the map view. 

See [Creating new objects in simple actions mode](Creating%20new%20objects%20in%20simple%20actions%20mode.md) for more information.

##### Advanced (long press) mode
 
Long press where you want the node to be or the way to start. You will see a black "crosshair" symbol. 
* If you want to create a new node (not connected to an object), click away from existing objects.
* If you want to extend a way, click within the "tolerance zone" of the way (or a node on the way). The tolerance zone is indicated by the areas around a node or way.

לאחר שמופיע סמל הצלב, עומדות בפניך האפשרויות הבאות:

* Touch in the same place.
    * If the crosshair is not near a node, touching the same location again creates a new node. If you are near a way (but not near a node), the new node will be on the way (and connected to the way).
    * If the crosshair is near a node (i.e. within the tolerance zone of the node), touching the same location just selects the node (and the tag editor opens. No new node is created. The action is the same as the selection above.
* Touch another place. Touching another location (outside of the tolerance zone of the crosshair) adds a way segment from the original position to the current position. If the crosshair was near a way or node, the new segment will be connected to that node or way.

Simply touch the screen where you want to add further nodes of the way. To finish, touch the final node twice. If the final node is  located on a way or node, the segment will be connected to the way or node automatically. 

You can also use a menu item: See [Creating new objects](Creating%20new%20objects.md) for more information.

#### הוספת שטח

ל־OpenStreetMap אין סוג פריט „שטח” בניגוד למערכות נתונים גאוגרפיים אחרות. העורך המקוון „iD” מנסה ליצור הפשטה של שטח מרכיבי ה־OSM שמתחת לפני השטח, שיטה שעובדת מצוין בתנאי מסוימים אך באחרים לא כל כך. ווספוצ׳י לא מנסה לעשות משהו דומה, לכן כדאי להכיר את האופן בו שטחים מיוצגים:

* _closed ways (*polygons")_: the simplest and most common area variant, are ways that have a shared first and last node forming a closed "ring" (for example most buildings are of this type). These are very easy to create in Vespucci, simply connect back to the first node when you are finished with drawing the area. Note: the interpretation of the closed way depends on its tagging: for example if a closed way is tagged as a building it will be considered an area, if it is tagged as a roundabout it wont. In some situations in which both interpretations may be valid, an "area" tag can clarify the intended use.
* _multi-ploygons_: some areas have multiple parts, holes and rings that can't be represented with just one way. OSM uses a specific type of relation (our general purpose object that can model relations between elements) to get around this, a multi-polygon. A multi-polygon can have multiple "outer" rings, and multiple "inner" rings. Each ring can either be a closed way as described above, or multiple individual ways that have common end nodes. While large multi-polygons are difficult to handle with any tool, small ones are not difficult to create in Vespucci. 
* _coastlines_: for very large objects, continents and islands, even the multi-polygon model doesn't work in a satisfactory way. For natural=coastline ways we assume direction dependent semantics: the land is on the left side of the way, the water on the right side. A side effect of this is that, in general, you shouldn't reverse the direction of a way with coastline tagging. More information can be found on the [OSM wiki](http://wiki.openstreetmap.org/wiki/Tag:natural%3Dcoastline).

#### שיפור צורות דרכים

If you zoom in far enough on a selected way you will see a small "x" in the middle of the way segments that are long enough. Dragging the "x" will create a node in the way at that location. Note: to avoid accidentally creating nodes, the touch tolerance area for this operation is fairly small.

#### גזירה, העתקה והדבקה

You can copy or cut selected nodes and ways, and then paste once or multiple times to a new location. Cutting will retain the osm id and version. To paste long press the location you want to paste to (you will see a cross hair marking the location). Then select "Paste" from the menu.

#### הוספת כתובות ביעילות

Vespucci has an ![Address](../images/address.png) "add address tags" function that tries to make surveying addresses more efficient by predicting the current house number. It can be selected:

* after a long press (_non-simple mode only:): Vespucci will add a node at the location and make a best guess at the house number and add address tags that you have been lately been using. If the node is on a building outline it will automatically add a "entrance=yes" tag to the node. The tag editor will open for the object in question and let you make any necessary further changes.
* in the node/way selected modes: Vespucci will add address tags as above and start the tag editor.
* in the property editor.

House number prediction typically requires at least two house numbers on each side of the road to be entered to work, the more numbers present in the data the better.

כדאי להשתמש באפשרות זו יחד עם המצב [הורדה אוטומטית](#download).  

#### הוספת הגבלות פנייה

Vespucci has a fast way to add turn restrictions. if necessary it will split ways automatically and ask you to re-select elements. 

* select a way with a highway tag (turn restrictions can only be added to highways, if you need to do this for other ways, please use the generic "create relation" mode)
* select "Add restriction" from the menu
* select the "via" node or way (only possible "via" elements will have the touch area shown)
* select the "to" way (it is possible to double back and set the "to" element to the "from" element, Vespucci will assume that you are adding an no_u_turn restriction)
* set the restriction type

### וספוצ׳י במצב נעול

כשהמנעול האדום מוצג כל הפעולות שאינן כרוכות בעריכה זמינות. בנוסף, לחיצה ארוכה על או ליד פריט תציג את מסך פירוט אם מדובר בפריט OSM.

### שמירת השינויים שערכת

*(נדרש חיבור לרשת)*

נא לבחור את אותו הכפתור או הפריט בתפריט לטובת ההורדה ועתה לבחור ב־„העלאת נתונים לשרת OSM”.

Vespucci supports OAuth authorization and the classical username and password method. OAuth is preferable since it avoids sending passwords in the clear.

New Vespucci installs will have OAuth enabled by default. On your first attempt to upload modified data, a page from the OSM website loads. After you have logged on (over an encrypted connection) you will be asked to authorize Vespucci to edit using your account. If you want to or need to authorize the OAuth access to your account before editing there is a corresponding item in the "Tools" menu.

If you want to save your work and do not have Internet access, you can save to a JOSM compatible .osm file and either upload later with Vespucci or with JOSM. 

#### פתרון סתירות בהעלאה

Vespucci has a simple conflict resolver. However if you suspect that there are major issues with your edits, export your changes to a .osc file ("Export" menu item in the "Transfer" menu) and fix and upload them with JOSM. See the detailed help on [conflict resolution](Conflict%20resolution.md).  

## שימוש ב־GPS

You can use Vespucci to create a GPX track and display it on your device. Further you can display the current GPS position (set "Show location" in the GPS menu) and/or have the screen center around and follow the position (set "Follow GPS Position" in the GPS menu). 

If you have the latter set, moving the screen manually or editing will cause the "follow GPS" mode to be disabled and the blue GPS arrow will change from an outline to a filled arrow. To quickly return to the "follow" mode, simply touch GPS button or re-check the menu option.

## הערות ותקלות

Vespucci supports downloading, commenting and closing of OSM Notes (formerly OSM Bugs) and the equivalent functionality for "Bugs" produced by the [OSMOSE quality assurance tool](http://osmose.openstreetmap.fr/en/map/). Both have to either be down loaded explicitly or you can use the auto download facility to access the items in your immediate area. Once edited or closed, you can either upload the bug or Note immediately or upload all at once.

On the map the Notes and bugs are represented by a small bug icon ![Bug](../images/bug_open.png), green ones are closed/resolved, blue ones have been created or edited by you, and yellow indicates that it is still active and hasn't been changed. 

The OSMOSE bug display will provide a link to the affected object in blue, touching the link will select the object, center the screen on it and down load the area beforehand if necessary. 

### סינון

Besides globally enabling the notes and bugs display you can set a coarse grain display filter to reduce clutter. In the [Advanced preferences](Advanced%20preferences.md) you can individually select:

* Notes
* Osmose error
* Osmose warning
* Osmose minor issue
* Custom

<a id="indoor"></a>

## מצב ניווט במבנה

Mapping indoors is challenging due to the high number of objects that very often will overlay each other. Vespucci has a dedicated indoor mode that allows you to filter out all objects that are not on the same level and which will automatically add the current level to new objects created there.

The mode can be enabled by long pressing on the lock item, see [Lock, unlock, mode switching](#lock) and selecting the corresponding menu entry.

<a id="c-mode"></a>

## מצב תיקון (C)

במצב תיקון (מיוצג בסמל האות C) מוצגים פריטים עבורם מוגדרים דגלוני אזהרה, אלו מקלים על איתור הפריטים שיש להם תקלות מסוימות או שתואמים לבדיקות מוגדרות. אם נבחר פריט ועורך התכונות התחיל במצב תיקון תחול הערכה המוגדרת המתאימה ביותר אוטומטית.

The mode can be enabled by long pressing on the lock item, see [Lock, unlock, mode switching](#lock) and selecting the corresponding menu entry.

### הגדרת בדיקות

Currently there are two configurable checks (there is a check for FIXME tags and a test for missing type tags on relations that are currently not configurable) both can be configured by selecting "Validator settings" in the "Preferences". 

רשימת הרשומות מחולקת לשתיים, החלק העליון מציג רשומות „תשאול מחדש” והחלק השני מציג „רשומות שנבדקו”. ניתן לערוך רשומות על ידי לחיצה עליהן, התפריט הירוק בתפריט מאפשר הוספת רשומות.

#### תשאול רשומות מחדש

לתשאול של רשומות מחדש יש את המאפיינים הבאים:

* **Key** - Key of the tag of interest.
* **Value** - Value the tag of interest should have, if empty the tag value will be ignored.
* **Age** - how many days after the element was last changed the element should be re-surveyed, if a check_date field is present that will be the used, otherwise the date the current version was create. Setting the value to zero will lead to the check simply matching against key and value.
* **Regular expression** - if checked **Value** is assumed to be a JAVA regular expression.

**מפתח** ו**ערך** מאומתים מול תגיות _קיימות_ של הפריטים המבוקשים.

#### רשומות בדיקה

לרשומות בדיקה יש את שני המאפיינים הבאים:

* **Key** - Key that should be present on the object according to the matching preset.
* **Require optional** - Require the key even if the key is in the optional tags of the matching preset .

This check works by first determining the matching preset and then checking if **Key** is a "recommended" key for this object according to the preset, **Require optional** will expand the check to tags that are "optional* on the object. Note: currently linked presets are not checked.

## מסננים

### מסנן על בסיס תגיות

The filter can be enabled from the main menu, it can then be changed by tapping the filter icon. More documentation can be found here [Tag filter](Tag%20filter.md).

### מסנן על בסיס ערכות מוגדרות

An alternative to the above, objects are filtered either on individual presets or on preset groups. Tapping on the filter icon will display a preset selection dialog similar to that used elsewhere in Vespucci. Individual presets can be selected by a normal click, preset groups by a long click (normal click enters the group). More documentation can be found here [Preset filter](Preset%20filter.md).

## התאמת וספוצ׳י לטעמך

Many aspects of the app can be customized, if you are looking for something specific and can't find it, [the Vespucci website](https://vespucci.io/) is searchable and contains additional information over what is available on device.

### Layer settings

Layer settings can be changed via the layer control (upper right corner), all other setting are reachable via the main menu preferences button.

* Background layer - there is a wide range of aerial and satellite background imagery available, , the default value for this is the "standard style" map from openstreetmap.org.
* Overlay layer - these are semi-transparent layers with additional information, for example GPX tracks. Adding an overlay may cause issues with older devices and such with limited memory. Default: none.
* Notes/Bugs display. Open Notes and bugs will be displayed as a yellow bug icon, closed ones the same in green. Default: on.
* Photo layer. Displays geo-referenced photographs as red camera icons, if direction information is available the icon will be rotated. Default: off.

#### Preferences

* Keep screen on. Default: off.
* Large node drag area. Moving nodes on a device with touch input is problematic since your fingers will obscure the current position on the display. Turning this on will provide a large area which can be used for off-center dragging (selection and other operations still use the normal touch tolerance area). Default: off.

The full description can be found here [Preferences](Preferences.md)

#### העדפות מתקדמות

* Node icons. Default: on.
* Always show context menu. When turned on every selection process will show the context menu, turned off the menu is displayed only when no unambiguous selection can be determined. Default: off (used to be on).
* Enable light theme. On modern devices this is turned on by default. While you can enable it for older Android versions the style is likely to be inconsistent. 

The full description can be found here [Advanced preferences](Advanced%20preferences.md)

## דיווח על תקלות

If Vespucci crashes, or it detects an inconsistent state, you will be asked to send in the crash dump. Please do so if that happens, but please only once per specific situation. If you want to give further input or open an issue for a feature request or similar, please do so here: [Vespucci issue tracker](https://github.com/MarcusWolschon/osmeditor4android/issues). The "Provide feedback" function from the main menu will open a new issue and include the relevant app and device information without extra typing.

If you want to discuss something related to Vespucci, you can either start a discussion on the [Vespucci Google group](https://groups.google.com/forum/#!forum/osmeditor4android) or on the [OpenStreetMap Android forum](http://forum.openstreetmap.org/viewforum.php?id=56)

