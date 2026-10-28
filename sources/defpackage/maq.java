package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v58 maq[], still in use, count: 1, list:
  (r1v58 maq[]) from 0x0503: INVOKE (r1v58 maq[]) STATIC call: internal.org.jni_zero.JniZero.m(java.lang.Enum[]):awpl A[MD:(java.lang.Enum[]):awpl (m)] (LINE:1284)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class maq {
    ARTIST_OF_THE_DAY("GAC: Artist of the day"),
    BATTERY("Battery"),
    BARD_ON_PIXEL("Bard on Pixel"),
    BETTERBUG_BUG_REPORT_SHORTCUT("BetterBug - Bug report shortcut"),
    CALENDAR_MONTH("Calendar - Month"),
    CALENDAR_MONTH_GM3("Calendar - Month GM3"),
    CALENDAR_MONTH_V3_2025("Calendar - Month v3_2025"),
    CALENDAR_SCHEDULE("Calendar - Schedule"),
    CALENDAR_SCHEDULE_GM3("Calendar - Schedule GM3"),
    CALENDAR_SCHEDULE_V3_2025("Calendar - Schedule v3_2025"),
    CONTACTS_BESTIES("Contacts - Besties"),
    CONTACTS_BESTIES_GROUP_CONTACT("Contacts - Besties Group Contact"),
    CONTACTS_BESTIES_SINGLE_CONTACT("Contacts - Besties Single Contact"),
    CONTACTS_FAVORITE_CONTACTS_GRID("Contacts - Favorite Contacts Grid"),
    CONTACTS_SINGLE_CONTACT("Contacts - Single Contact"),
    CONTACTS_SINGLE_CONTACT_PIXEL("Contacts - Single Contact Pixel"),
    DEMO_SIMPLE_LIST("Demo Simple List"),
    DEMO_ANALOG_CLOCK("Demo Analog Clock"),
    DEMO_TOOLBAR("Demo Toolbar"),
    DRIVE_QUICK_ACTION_TOOLBAR("Drive Quick Action Toolbar"),
    DRIVE_SUGGESTIONS("Drive Suggestions"),
    FI_USAGE("Fi - Usage"),
    FI_USAGE_LEGACY("Fi - Usage (Legacy)"),
    GEMINI("Gemini"),
    GMAIL_INBOX_GLANCE("Gmail Inbox: Glance"),
    GMAIL_INBOX_MATERIAL_YOU("Gmail Inbox: Material You"),
    GMAIL_INBOX_LEGACY("Gmail Inbox: Legacy"),
    GOOGLE_APP_SEARCH_WIDGET("AGA Search Widget"),
    GOOGLE_TV_TOP_PICKS("Google TV - Top Picks"),
    HEALTH_QUICK_ACCESS("Health - Quick Access"),
    HEALTH_STEPS("Health - Steps"),
    KEEP_NOTES_GM3("Keep Notes GM3"),
    KEEP_NOTES_LEGACY("Keep Notes Legacy"),
    KEEP_SINGLE_NOTE("Keep Single Note"),
    KEEP_TOOLBAR_GM3("Keep Toolbar GM3"),
    KEEP_TOOLBAR_LEGACY("Keep Toolbar Legacy"),
    MAPS_SEARCH_WIDGET("Maps Search Widget"),
    MAPS_TRAFFIC_WIDGET("Maps Nearby Traffic"),
    NEWS_LEGACY_WIDGET("News - Legacy"),
    NEWS_GLANCE_WIDGET("News - Glance"),
    PHOTOS_MEMORIES("Photos - Memories"),
    PHOTOS_PEOPLE_AND_PETS("Photos - People & Pets"),
    PIXEL_WEATHER_CURRENT_FORECAST("Pixel Weather - Current Forecast"),
    PIXEL_WEATHER_FULL_FORECAST("Pixel Weather - Full Forecast"),
    PLAY_BOOKS_LEGACY("PlayBooks: Legacy"),
    PLAY_BOOKS_MY_BOOKS("PlayBooks: MyBooks"),
    PLAY_BOOKS_READING_PROGRESS("PlayBooks: Reading Progress"),
    SMARTSPACE("Ambient Assistant: At a Glance"),
    STOCKS("Stocks"),
    TRANSLATE_CLIPBOARD("Translate Clipboard"),
    TRANSLATE_DICTATION("Translate Dictation"),
    TRANSLATE_LANGUAGE_LEARNING_STREAK("Translate Language Learning Streak"),
    TRANSLATE_LENS("Translate Lens"),
    TRANSLATE_LIVE_TRANSLATION("Translate Live Translation"),
    TRANSLATE_OPEN_MIC("Translate Open Mic"),
    TRANSLATE_SPEAK_EASY("Translate Speak Easy"),
    TRANSLATE_QUICK_ACTIONS("Translate Quick Actions"),
    TRANSLATE_SAVED_HISTORY("Translate Saved History"),
    TRANSLATE_TEXT_TRANSLATION("Translate Text Translation"),
    TEST("Test widget"),
    WEATHER("Weather"),
    WEATHER_FREEFORM("Weather - Freeform"),
    YTM_FLIP("YTM Flip"),
    YTM_FREEFORM("YTM  Freeform"),
    YTM_NOW_PLAYING("YTM Now Playing"),
    YTM_NOW_PLAYING_LEGACY("YTM Now Playing Legacy"),
    FL_LOCK_UNLOCK("Family Link Lock Unlock"),
    YT_MAIN_QUICK_ACTIONS("YouTube - Quick Actions"),
    YT_MAIN_SEARCH("YouTube - Search");

    public final String ar;

    static {
        JniZero.m(maqVarArr);
    }

    private maq(String str) {
        super(str, i);
        this.ar = str;
    }

    public static maq[] values() {
        return (maq[]) as.clone();
    }
}
