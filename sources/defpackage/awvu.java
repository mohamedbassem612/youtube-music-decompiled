package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awvu {
    public static final axdy a = new axdy("REMOVED_TASK");
    public static final axdy b = new axdy("CLOSED_EMPTY");

    public static final long a(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j;
    }
}
