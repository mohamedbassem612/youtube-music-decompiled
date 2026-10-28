package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum amjo implements aihr {
    LATENCY_AD_BREAK_TYPE_UNKNOWN(0),
    LATENCY_AD_BREAK_TYPE_PREROLL(1),
    LATENCY_AD_BREAK_TYPE_MIDROLL(2),
    LATENCY_AD_BREAK_TYPE_POSTROLL(3);

    public final int e;

    amjo(int i) {
        this.e = i;
    }

    public static amjo a(int i) {
        if (i == 0) {
            return LATENCY_AD_BREAK_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return LATENCY_AD_BREAK_TYPE_PREROLL;
        }
        if (i == 2) {
            return LATENCY_AD_BREAK_TYPE_MIDROLL;
        }
        if (i != 3) {
            return null;
        }
        return LATENCY_AD_BREAK_TYPE_POSTROLL;
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
