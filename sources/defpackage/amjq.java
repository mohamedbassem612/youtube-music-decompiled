package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum amjq implements aihr {
    LATENCY_PLAYER_PRELOAD_TYPE_UNKNOWN(0),
    LATENCY_PLAYER_PRELOAD_TYPE_CONFIG(1),
    LATENCY_PLAYER_PRELOAD_TYPE_PREBUFFER(2);

    public final int d;

    amjq(int i) {
        this.d = i;
    }

    public static amjq a(int i) {
        if (i == 0) {
            return LATENCY_PLAYER_PRELOAD_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return LATENCY_PLAYER_PRELOAD_TYPE_CONFIG;
        }
        if (i != 2) {
            return null;
        }
        return LATENCY_PLAYER_PRELOAD_TYPE_PREBUFFER;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
