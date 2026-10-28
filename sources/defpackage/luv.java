package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum luv implements lxx {
    UNKNOWN(0),
    LITE(1),
    FULL(2),
    RECOVERY_PROOF(3),
    SHUTDOWN(4),
    DESTRUCTOR(5);

    public final int g;

    luv(int i) {
        this.g = i;
    }

    public static luv a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return LITE;
        }
        if (i == 2) {
            return FULL;
        }
        if (i == 3) {
            return RECOVERY_PROOF;
        }
        if (i == 4) {
            return SHUTDOWN;
        }
        if (i != 5) {
            return null;
        }
        return DESTRUCTOR;
    }
}
