package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum amyv implements aihr {
    MDX_SESSION_SOURCE_UNKNOWN(0),
    MDX_SESSION_SOURCE_ROUTE_BUTTON(1),
    MDX_SESSION_SOURCE_SMART_REMOTE_MEALBAR(2),
    MDX_SESSION_SOURCE_CONTENT_RECOMMENDATION_NOTIFICATION(3),
    MDX_SESSION_SOURCE_MEMENTO_MEALBAR(4),
    MDX_SESSION_SOURCE_LIVE_STREAM_MEALBAR(5),
    MDX_SESSION_SOURCE_SMART_PAIRING_SELECT_DEVICE(6),
    MDX_SESSION_SOURCE_TV_CODE(7),
    MDX_SESSION_SOURCE_AUTOCONNECT(8),
    MDX_SESSION_SOURCE_NITRATE_MEALBAR(9),
    MDX_SESSION_SOURCE_AUTOCONNECT_COMMENTS(10),
    MDX_SESSION_SOURCE_STREAM_TRANSFER(11),
    MDX_SESSION_SOURCE_ALWAYS_AUTOCONNECT(12),
    MDX_SESSION_SOURCE_QR(13),
    MDX_SESSION_SOURCE_STC(14),
    MDX_SESSION_SOURCE_SEARCH(15),
    MDX_SESSION_SOURCE_SEARCH_NOTIFICATION(19),
    MDX_SESSION_SOURCE_LIVE_CHAT(16),
    MDX_SESSION_SOURCE_SUGGESTED_DEVICE(17),
    MDX_SESSION_SOURCE_YTV_AUTOCONNECT(18),
    MDX_SESSION_SOURCE_MEDIAHUB_WATCH_COMPANION_COMMENTS(20),
    MDX_SESSION_SOURCE_MEDIAHUB_WATCH_COMPANION_VIDEO_THUMBNAIL(21),
    MDX_SESSION_SOURCE_WATCH_COMPANION_LIKE(22),
    MDX_SESSION_SOURCE_WATCH_COMPANION_DISLIKE(23),
    MDX_SESSION_SOURCE_WATCH_COMPANION_REMOVE_LIKE(24),
    MDX_SESSION_SOURCE_WATCH_COMPANION_SUBSCRIBE(25),
    MDX_SESSION_SOURCE_WATCH_COMPANION_UNSUBSCRIBE(26),
    MDX_SESSION_SOURCE_WATCH_COMPANION_YOUCHAT(27),
    MDX_SESSION_SOURCE_FEEDBACK_SNACKBAR_FROM_THREE_DOT_MENU(28),
    MDX_SESSION_SOURCE_OUTPUT_SWITCHER(29);

    public final int E;

    amyv(int i) {
        this.E = i;
    }

    public static amyv a(int i) {
        switch (i) {
            case 0:
                return MDX_SESSION_SOURCE_UNKNOWN;
            case 1:
                return MDX_SESSION_SOURCE_ROUTE_BUTTON;
            case 2:
                return MDX_SESSION_SOURCE_SMART_REMOTE_MEALBAR;
            case 3:
                return MDX_SESSION_SOURCE_CONTENT_RECOMMENDATION_NOTIFICATION;
            case 4:
                return MDX_SESSION_SOURCE_MEMENTO_MEALBAR;
            case 5:
                return MDX_SESSION_SOURCE_LIVE_STREAM_MEALBAR;
            case 6:
                return MDX_SESSION_SOURCE_SMART_PAIRING_SELECT_DEVICE;
            case 7:
                return MDX_SESSION_SOURCE_TV_CODE;
            case 8:
                return MDX_SESSION_SOURCE_AUTOCONNECT;
            case 9:
                return MDX_SESSION_SOURCE_NITRATE_MEALBAR;
            case 10:
                return MDX_SESSION_SOURCE_AUTOCONNECT_COMMENTS;
            case 11:
                return MDX_SESSION_SOURCE_STREAM_TRANSFER;
            case 12:
                return MDX_SESSION_SOURCE_ALWAYS_AUTOCONNECT;
            case 13:
                return MDX_SESSION_SOURCE_QR;
            case 14:
                return MDX_SESSION_SOURCE_STC;
            case 15:
                return MDX_SESSION_SOURCE_SEARCH;
            case 16:
                return MDX_SESSION_SOURCE_LIVE_CHAT;
            case 17:
                return MDX_SESSION_SOURCE_SUGGESTED_DEVICE;
            case 18:
                return MDX_SESSION_SOURCE_YTV_AUTOCONNECT;
            case 19:
                return MDX_SESSION_SOURCE_SEARCH_NOTIFICATION;
            case 20:
                return MDX_SESSION_SOURCE_MEDIAHUB_WATCH_COMPANION_COMMENTS;
            case 21:
                return MDX_SESSION_SOURCE_MEDIAHUB_WATCH_COMPANION_VIDEO_THUMBNAIL;
            case 22:
                return MDX_SESSION_SOURCE_WATCH_COMPANION_LIKE;
            case 23:
                return MDX_SESSION_SOURCE_WATCH_COMPANION_DISLIKE;
            case 24:
                return MDX_SESSION_SOURCE_WATCH_COMPANION_REMOVE_LIKE;
            case 25:
                return MDX_SESSION_SOURCE_WATCH_COMPANION_SUBSCRIBE;
            case 26:
                return MDX_SESSION_SOURCE_WATCH_COMPANION_UNSUBSCRIBE;
            case 27:
                return MDX_SESSION_SOURCE_WATCH_COMPANION_YOUCHAT;
            case 28:
                return MDX_SESSION_SOURCE_FEEDBACK_SNACKBAR_FROM_THREE_DOT_MENU;
            case 29:
                return MDX_SESSION_SOURCE_OUTPUT_SWITCHER;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.E;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.E);
    }
}
