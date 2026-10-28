package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum ajtk implements aihr {
    CLEARCUT_LOG_ACTION_UNKNOWN(0),
    CLEARCUT_LOG_ACTION_PASS_THROUGH(1),
    CLEARCUT_LOG_ACTION_BLOCK(2),
    CLEARCUT_LOG_ACTION_GEL(3);

    public final int e;

    ajtk(int i) {
        this.e = i;
    }

    public static ajtk a(int i) {
        if (i == 0) {
            return CLEARCUT_LOG_ACTION_UNKNOWN;
        }
        if (i == 1) {
            return CLEARCUT_LOG_ACTION_PASS_THROUGH;
        }
        if (i == 2) {
            return CLEARCUT_LOG_ACTION_BLOCK;
        }
        if (i != 3) {
            return null;
        }
        return CLEARCUT_LOG_ACTION_GEL;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
