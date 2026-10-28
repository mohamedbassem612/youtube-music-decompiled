package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum amjp implements aihr {
    LATENCY_PLAYER_PREFETCH_TYPE_UNKNOWN(0),
    LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE(1),
    LATENCY_PLAYER_PREFETCH_TYPE_CACHE(2);

    public final int d;

    amjp(int i) {
        this.d = i;
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
