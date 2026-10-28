package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum amec implements aihr {
    INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_UNKNOWN(0),
    INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_FIRST_SHOWN(1),
    INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_FIRST_HIDDEN(2),
    INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_SHOWN(4),
    INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_HIDDEN(8),
    INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_DESTROYED(16),
    INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_SCREEN_CLOSED(32),
    INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_SCREEN_DESTROYED(64);

    public final int i;

    amec(int i) {
        this.i = i;
    }

    public static amec a(int i) {
        if (i == 0) {
            return INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_FIRST_SHOWN;
        }
        if (i == 2) {
            return INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_FIRST_HIDDEN;
        }
        if (i == 4) {
            return INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_SHOWN;
        }
        if (i == 8) {
            return INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_HIDDEN;
        }
        if (i == 16) {
            return INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_DESTROYED;
        }
        if (i == 32) {
            return INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_SCREEN_CLOSED;
        }
        if (i != 64) {
            return null;
        }
        return INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_SCREEN_DESTROYED;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
