package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum ajij implements aihr {
    AUTOMATED_LOG_EVENT_SOURCE_UNKNOWN(0),
    AUTOMATED_LOG_EVENT_SOURCE_NOT_AUTOMATED(1),
    AUTOMATED_LOG_EVENT_SOURCE_PAGE_SYSTEM(2),
    AUTOMATED_LOG_EVENT_SOURCE_WEB_SCREEN_MANAGER(3),
    AUTOMATED_LOG_EVENT_SOURCE_WEB_COMMAND_HANDLER(4),
    AUTOMATED_LOG_EVENT_SOURCE_WEB_APP_INIT(5),
    AUTOMATED_LOG_EVENT_SOURCE_MWEB_LOAD_INITIAL_RESPONSE(6),
    AUTOMATED_LOG_EVENT_SOURCE_WEB_VISIBILITY_MONITOR(7),
    AUTOMATED_LOG_EVENT_SOURCE_ELEMENTS(8),
    AUTOMATED_LOG_EVENT_SOURCE_WEB_CREATE_SCREEN_CHUNK_PROCESSOR(9);

    public final int k;

    ajij(int i) {
        this.k = i;
    }

    public static ajij a(int i) {
        switch (i) {
            case 0:
                return AUTOMATED_LOG_EVENT_SOURCE_UNKNOWN;
            case 1:
                return AUTOMATED_LOG_EVENT_SOURCE_NOT_AUTOMATED;
            case 2:
                return AUTOMATED_LOG_EVENT_SOURCE_PAGE_SYSTEM;
            case 3:
                return AUTOMATED_LOG_EVENT_SOURCE_WEB_SCREEN_MANAGER;
            case 4:
                return AUTOMATED_LOG_EVENT_SOURCE_WEB_COMMAND_HANDLER;
            case 5:
                return AUTOMATED_LOG_EVENT_SOURCE_WEB_APP_INIT;
            case 6:
                return AUTOMATED_LOG_EVENT_SOURCE_MWEB_LOAD_INITIAL_RESPONSE;
            case 7:
                return AUTOMATED_LOG_EVENT_SOURCE_WEB_VISIBILITY_MONITOR;
            case 8:
                return AUTOMATED_LOG_EVENT_SOURCE_ELEMENTS;
            case 9:
                return AUTOMATED_LOG_EVENT_SOURCE_WEB_CREATE_SCREEN_CHUNK_PROCESSOR;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
