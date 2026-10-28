package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cba {
    public final float a = 0.97f;
    public final float b = 1.03f;
    public final long c = 1000;
    public final float d = 1.0E-7f;
    public final long e = 20000;
    public final float f = 0.999f;
    public long g = -9223372036854775807L;
    private long r = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public long j = -9223372036854775807L;
    public float m = 0.97f;
    public float l = 1.03f;
    public float n = 1.0f;
    public long o = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long k = -9223372036854775807L;
    public long p = -9223372036854775807L;
    public long q = -9223372036854775807L;

    public static long c(long j, long j2) {
        return (long) ((j * 0.999f) + (j2 * 9.999871E-4f));
    }

    public final void a() {
        long j;
        long j2 = this.g;
        if (j2 != -9223372036854775807L) {
            j = this.r;
            if (j == -9223372036854775807L) {
                long j3 = this.i;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.j;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.h != j) {
            this.h = j;
            this.k = j;
            this.p = -9223372036854775807L;
            this.q = -9223372036854775807L;
            this.o = -9223372036854775807L;
        }
    }

    public final void b(long j) {
        this.r = j;
        a();
    }
}
