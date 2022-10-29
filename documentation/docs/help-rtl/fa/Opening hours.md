# ویرایشگر ساعت کاری برای اوپن‌استریت‌مپ

تعاریف فنی ساعت کاری در اوپن‌استریت‌مپ نسبتاً پیچیده است و ارائهٔ آن در قالب یک واسط کاربری سرراست و ساده چندان آسان و سهل نیست.

البته بیشتر اوقات معمولاً فقط بخش کوچکی از تعاریف نیازتان می‌شود. این ویرایشگر با در نظر گرفتن همین موضوع، قابلیت‌های پیچیده‌تر را در منوها پنهان می‌کند و بیشتر وقت‌ها برای کاربردهای معمول به اندکی دستکاری در الگوهای ازپیش‌تعریف‌شده نیاز دارید.

_این سند مقدماتی است و در حال بهبود آن هستیم_

## استفاده از ویرایشگر ساعت کاری

به‌طور معمول شیئی که ویرایش می‌کنید یا تگ ساعت کاری دارد (opening_hours،‏ service_times و collection_times) یا می‌توانید با به‌کارگیری پیش‌تنظیمی برای آن شیء، یک خانه برای ساعت کاری اضافه کنید. اگر لازم باشد که خانهٔ ساعت کاری را دستی اضافه نمایید و از وسپوچی استفاده می‌کنید، باید در زبانهٔ جزئیات، کلید آن را وارد کنید و سپس به زبانهٔ فرم (زبانهٔ خصوصیات) برگردید و آن را ویرایش نمایید. اگر معتقدید که تگ ساعت کاری باید در پیش‌تنظیم بخصوصی وجود داشته باشد، لطفاً برای ویرایشگر مدنظر گزارش بدهید.

If you have defined a default template (do this via the "Manage templates" menu item) it will be loaded automatically when the editor is started with an empty value. With the "Load template" function you can load any saved template and with the "Save template" menu you can save the current value as a template. You can define separate templates and defaults for specific key, for example "opening_hours", "collection_times" and "service_times" or custom values. Further you can limit applicability of a template to a region and a specific identifier, typically an OSM top-level tag (for example amenity=restaurant). 

به‌طور طبیعی می‌توانید مقدار ساعت کاری را از صفر بنویسید. اما پیشنهاد می‌کنیم یکی از الگوهای موجود نقطهٔ آغازتان باشد.

هنگامی که یک مقدار ساعت کاری موجود بار می‌شود، برای پیروی از تعاریف فنی ساعت کاری، تلاشی برای اصلاح خودکار آن انجام می‌شود. اگر اصلاح خودکار میسر نشود، مکان تقریبی رخداد خطا در قسمت نمایش خام ساعت کاری، مشخص می‌شود و می‌توانید به‌طور دستی آن را اصلاح نمایید. به‌طور تقریبی یک‌چهارم ساعت‌های کاری ثبت‌شده در پایگاه‌دادهٔ اوپن‌استریت‌مپ مشکل دارند، اما کمتر از ۱۰٪ آن‌ها اصلاح‌نشدنی هستند. برای اینکه بدانید کدام انحراف از تعاریف قابل‌مدارا هستند، [OpeningHoursParser](https://github.com/simonpoole/OpeningHoursParser) را ببینید.

### دکمهٔ منوی اصلی

* __افزودن قاعده__: قاعدهٔ جدیدی اضافه کنید.
* __افزودن قاعده برای تعطیلات__: برای تعطیلات و تغییر وضعیت آن قاعده‌ای اضافه کنید.
* __افزودن قاعده برای ۲۴/۷__: برای جایی که همیشه باز است قاعده‌ای اضافه کنید. تعاریف ساعت کاری از هیچ زیرمقداری برای 24/7 پشتیبانی نمی‌کند، اما افزودن انتخابگرهای سطح بالاتر (مثل بازهٔ سال) امکان‌پذیر است.
* __بارکردن الگو__: یک الگوی موجود را بار می‌کند.
* __ذخیره در الگو__: مقدار کنونی ساعت کاری را به‌عنوان الگو برای استفاده در آینده ذخیره کنید.
* __مدیریت الگوها__: الگوهای موجود را ویرایش (مثلاً تغییر نام) و حذف کنید.
* __تازه‌سازی__: تجزیه و بررسی دوبارهٔ مقدار ساعت کاری
* __حذف همه__: همهٔ قواعد را حذف کنید.

### قواعد

قواعد پیشفرض به‌عنوان قاعدهٔ _عادی_ اضافه می‌شوند که یعنی بر مقادیر قاعده‌های قبلی برای همان روزها چیرگی دارند. هنگام استفاده از زمان‌های گسترده باید به این نکته توجه داشت. در این مواقع معمولاً باید نوع قاعده را با استفاده از گزینهٔ _نمایش نوع قاعده_ به _افزودنی_ تغییر دهید.

#### منوی قاعده

* __افزودن اصلاحگر/توضیح__: تأثیر قاعده را تغییر دهید و توضیح اختیاری اضافه کنید.
* __افزودن تعطیلات__: انتخابگر برای تعطیلات عمومی یا مدارس اضافه کنید.
* __افزودن بازهٔ زمان...__
    * __زمان - زمان__: زمان آغاز تا زمان پایان برای یک روز.
    * __زمان - زمان گسترده__: زمان آغاز تا زمان پایان در روز بعد (مثال: ۲۶:۰۰ یعنی ۰۲:۰۰ (ق.ظ.) در روز بعد).
    * __زمان متغیر - زمان__: از زمان آغاز غیرثابت (فلق، طلوع، غروب، شفق) تا زمان پایان در همان روز
    * __زمان متغیر - زمان گسترده__: از زمان آغاز غیرثابت تا زمان پایان در روز بعد.
    * __زمان - زمان متغیر__: زمان آغاز تا زمان پایان غیرثابت.
    * __زمان متغیر - زمان متغیر__: زمان آغاز غیرثابت تا زمان پایان غیرثابت.
    * __زمان__: لحظه‌ای در زمان.
    * __زمان-پایان باز__: از یک لحظهٔ آغاز به بعد.
    * __زمان متغیر__: در زمان غیرثابت مشخص
    * __زمان متغیر-پایان باز__: از یک زمان آغاز غیرثابت به بعد
* __افزودن بازهٔ روز هفته__: انتخابگری بر اساس هفته اضافه کنید.
* __افزودن بازهٔ تاریخ...__
    * __تاریخ - تاریخ__: از تاریخ آغاز (سال، ماه، روز) تا تاریخ پایان.
    * __تاریخ متغیر - تاریخ__: از تاریخ آغاز غیرثابت (فعلاً در تعارف فنی فقط _easter_ آمده است) تا تاریخ پایان.
    * __تاریخ - تاریخ متغیر__: از تاریخ آغاز تا تاریخ غیرثابت.
    * __تاریخ متغیر - تاریخ متغیر__: از تاریخ آغاز غیرثابت تا تاریخ پایان غیرثابت.
    * __وقوع در ماه - وقوع در ماه__: از وقوع یک روز هفته در ماه تا همان روز.
    * __وقوع در ماه - تاریخ__: از وقوع یک روز هفته در ماه تا تاریخ پایان.
    * __تاریخ - وقوع در ماه__: از تاریخ آغاز تا وقوع یک روز هفته در ماه.
    * __وقوع در ماه - تاریخ متغیر__: از وقوع یک روز هفته در ماه تا تاریخ پایان غیرثابت.
    * __تاریخ متغیر - وقوع در ماه__: از تاریخ آغاز غیرثابت تا وقوع یک روز هفته در ماه.
    * __تاریخ - پایان باز__: از تاریخ آغاز به بعد.
    * __تاریخ متغیر - پایان باز__: از تاریخ آغاز غیرثابت به بعد.
    * __وقوع در ماه - پایان باز__: از وقوع یک روز هفته در ماه به بعد.
    * __با آفست...__: همان مدخل‌هایی که پیشتر گفته شد با مشخص‌کردن آفست (به‌ندرت استفاده می‌شود).
* __Add year range...__    
    * __افزودن بازهٔ سال__: انتخابگری بر اساس سال اضافه کنید.
    * __Add starting year__: add an open ended year range.
* __افزودن بازهٔ هفته__: انتخابگری بر اساس شمارهٔ هفته اضافه کنید.
* __تکرار__: از این قاعده کپی بگیرید و پس از موقعیت کنونی درج کنید.
* __نمایش نوع قاعده__: نمایش و تغییر نوع قاعده (_عادی_،‏ _افزودنی_ و _fallback_ (برای قاعدهٔ اول امکان‌پذیر نیست).
* __برو بالا__: این قاعده را یک پله بالا ببرید (برای قاعدهٔ اول امکان‌پذیر نیست).
* __برو پایین__: این قاعده را یک پله پایین ببرید.
* __حذف__: این قاعده را حذف کنید.

### بازه‌های زمان

برای اینکه ویرایش بازه‌های زمانی تا حد ممکن آسان باشد، هنگامی که مقادیر موجود بار می‌شوند یک بازهٔ زمانی و گام بهینه برای نوارهای بازه انتخاب می‌کنیم. برای بازه‌های زمانی جدید، نوار از ۰۶:۰۰ ق.ظ. آغاز می‌شود و گام‌های افزایشی ۱۵ دقیقه‌ای دارد. این را می‌توانید از منو تغییر دهید.

اگر استفادهٔ مستقیم از نوارها خیلی دشوار است، با زدن روی نوار زمان (نه روی دسته‌ها) زمان‌گزین بزرگ باز می‌شود. زمان‌گزین‌ها به روز بعد گسترش می‌یابند، بنابراین راه ساده‌ای برای گسترش بازهٔ زمان هستند بدون اینکه مجبور باشید بازه را حذف و دوباره اضافه کنید.

#### منوی بازهٔ زمان

* __نمایش زمان‌گزین__: برای انتخاب زمان آغاز و پایان یک کادر بزرگ نمایش می‌دهد. در نمایشگرهای خیلی کوچک روش مناسبی برای تغییر زمان است.
* __پرش به خط‌نشان‌های ۱۵ دقیقه‌ای__: استفاده از گام‌های ۱۵ دقیقه‌ای برای نوار بازه.
* __پرش به خط‌نشان‌های ۵ دقیقه‌ای__: استفاده از گام‌های ۵ دقیقه‌ای برای نوار بازه.
* __پرش به خط‌نشان‌های ۱ دقیقه‌ای__: استفاده از گام‌های ۱ دقیقه‌ای برای نوار بازه. استفاده روی گوشی خیلی راحت نیست.
* __آغاز از نیمه‌شب__: نوار بازه از نیمه‌شب آغاز می‌شود.
* __نمایش دوره__: برای مشخص‌کردن دوره به دقیقه خانهٔ دوره را نمایش می‌دهد.
* __حذف__: این بازهٔ زمان را حذف کنید.

### مدیریت الگوها

The template management dialog allows you to add, edit and delete templates.

In Android 4.4 and later the following additional functionality is available from the menu button. 

* __Show all__: display all templates in the database.
* __Save to file__: write the contents of the template database to a file.
* __Load from file (replace)__: load templates from a file replacing the current contents of the database.
* __Load from file__: load templates from a file retaining the current contents.

#### Save and edit template dialogs

The dialog allows you to set

* __Name__ a descriptive name for the template.
* __Default__ if checked this will be consider as a default template (typically further constrained by the other fields).
* __Key__ the key this template is relevant for, if set to _Custom key_ you can add a non-standard value in the field below. The key values support SQL wild cards, that is _%_ matches zero or more characters, *_* matches a single character. Both wild card characters can be escaped with _\\_ for literal matches.
* __Region__ the region the template is applicable to.
* __Object__ an application specific string to use for matching.
