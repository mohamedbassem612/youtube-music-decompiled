package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum amwn implements aihr {
    MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_UNKNOWN(0),
    MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_NORMAL(1),
    MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_LOW(2),
    MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_ULTRA_LOW(3);

    public final int e;

    amwn(int i) {
        this.e = i;
    }

    public static amwn a(int i) {
        if (i == 0) {
            return MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_UNKNOWN;
        }
        if (i == 1) {
            return MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_NORMAL;
        }
        if (i == 2) {
            return MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_LOW;
        }
        if (i != 3) {
            return null;
        }
        return MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_ULTRA_LOW;
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
