package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum ahza implements aihr {
    REMOVE_REASON_UNKNOWN(0),
    CLICKED_IN_SYSTEM_TRAY(1),
    ACTION_CLICK_IN_SYSTEM_TRAY(2),
    DISMISSED_IN_SYSTEM_TRAY(3),
    CLICKED_IN_INBOX(4),
    ACTION_CLICK_IN_INBOX(5),
    DISMISSED_IN_INBOX(6),
    DISMISSED_REMOTE(7),
    DISMISSED_BY_API(8),
    EXPIRED(9),
    ACCOUNT_DATA_CLEANED(10),
    LIMIT_REACHED(11),
    USER_FEEDBACK_ACTION_CLICK(12),
    CHANNEL_OPT_OUT(13),
    CHANNEL_GROUP_OPT_OUT(14),
    GLOBAL_APP_OPT_OUT(15),
    UNKNOWN_REASON(16);

    public final int r;

    ahza(int i) {
        this.r = i;
    }

    public static ahza a(int i) {
        switch (i) {
            case 0:
                return REMOVE_REASON_UNKNOWN;
            case 1:
                return CLICKED_IN_SYSTEM_TRAY;
            case 2:
                return ACTION_CLICK_IN_SYSTEM_TRAY;
            case 3:
                return DISMISSED_IN_SYSTEM_TRAY;
            case 4:
                return CLICKED_IN_INBOX;
            case 5:
                return ACTION_CLICK_IN_INBOX;
            case 6:
                return DISMISSED_IN_INBOX;
            case 7:
                return DISMISSED_REMOTE;
            case 8:
                return DISMISSED_BY_API;
            case 9:
                return EXPIRED;
            case 10:
                return ACCOUNT_DATA_CLEANED;
            case 11:
                return LIMIT_REACHED;
            case 12:
                return USER_FEEDBACK_ACTION_CLICK;
            case 13:
                return CHANNEL_OPT_OUT;
            case 14:
                return CHANNEL_GROUP_OPT_OUT;
            case 15:
                return GLOBAL_APP_OPT_OUT;
            case 16:
                return UNKNOWN_REASON;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.r;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.r);
    }
}
