package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum apbw implements aihr {
    QOE_HOT_CONFIG_FEATURES_UNSPECIFIED(0),
    QOE_HOT_CONFIG_FEATURES_USE_STRING_FORMAT_FOR_ELAPSED_TIME(1),
    QOE_HOT_CONFIG_FEATURES_DISABLE_ECATCHER_PINGS(2),
    QOE_HOT_CONFIG_FEATURES_REMOVE_EXPIDS_AFTER_FIRST_PING(4),
    QOE_HOT_CONFIG_FEATURES_PUSH_DROPPED_FRAMES(5),
    QOE_HOT_CONFIG_FEATURES_PUSH_BUFFER_HEALTH(6),
    QOE_HOT_CONFIG_FEATURES_DO_NOT_CHANGE_FATAL_ERROR_CODE(8),
    UNRECOGNIZED(-1);

    private final int j;

    apbw(int i2) {
        this.j = i2;
    }

    public static apbw a(int i2) {
        if (i2 == 0) {
            return QOE_HOT_CONFIG_FEATURES_UNSPECIFIED;
        }
        if (i2 == 1) {
            return QOE_HOT_CONFIG_FEATURES_USE_STRING_FORMAT_FOR_ELAPSED_TIME;
        }
        if (i2 == 2) {
            return QOE_HOT_CONFIG_FEATURES_DISABLE_ECATCHER_PINGS;
        }
        if (i2 == 4) {
            return QOE_HOT_CONFIG_FEATURES_REMOVE_EXPIDS_AFTER_FIRST_PING;
        }
        if (i2 == 5) {
            return QOE_HOT_CONFIG_FEATURES_PUSH_DROPPED_FRAMES;
        }
        if (i2 == 6) {
            return QOE_HOT_CONFIG_FEATURES_PUSH_BUFFER_HEALTH;
        }
        if (i2 != 8) {
            return null;
        }
        return QOE_HOT_CONFIG_FEATURES_DO_NOT_CHANGE_FATAL_ERROR_CODE;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this == UNRECOGNIZED ? aiif.a() : this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
