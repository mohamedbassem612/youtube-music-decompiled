package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nzd {
    public long a;
    public long b;
    public long c;
    public final Object d;

    public nzd(long j) {
        this.d = new ThreadLocal();
        i(j);
    }

    public static long g(long j) {
        return bwp.C(j, 1000000L, 90000L);
    }

    public static long h(long j) {
        return bwp.C(j, 90000L, 1000000L);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c A[DONT_GENERATE] */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x002c, please report this as an issue */
    public final synchronized long a(long j) {
        long j2;
        j2 = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            if (!j()) {
                long jLongValue = this.b;
                if (jLongValue == 9223372036854775806L) {
                    Long l = (Long) ((ThreadLocal) this.d).get();
                    if (l != null) {
                        jLongValue = l.longValue();
                    }
                }
                this.a = jLongValue - j;
                notifyAll();
            }
            this.c = j;
            j2 = this.a + j;
        }
        return j2;
    }

    public final synchronized long b(long j) {
        long jA;
        jA = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            long j2 = this.c;
            if (j2 != -9223372036854775807L) {
                long jH = h(j2);
                long j3 = (4294967296L + jH) / 8589934592L;
                long j4 = (((-1) + j3) * 8589934592L) + j;
                j += j3 * 8589934592L;
                if (Math.abs(j4 - jH) < Math.abs(j - jH)) {
                    j = j4;
                }
            }
            jA = a(g(j));
        }
        return jA;
    }

    public final synchronized long c(long j) {
        long jA;
        jA = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            long j2 = this.c;
            if (j2 != -9223372036854775807L) {
                long jH = h(j2);
                long j3 = jH / 8589934592L;
                Long.signum(j3);
                long j4 = (j3 * 8589934592L) + j;
                j += (j3 + 1) * 8589934592L;
                if (j4 >= jH) {
                    j = j4;
                }
            }
            jA = a(g(j));
        }
        return jA;
    }

    public final synchronized long d() {
        long j = this.b;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long e() {
        long j;
        j = this.c;
        return j != -9223372036854775807L ? j + this.a : d();
    }

    public final synchronized long f() {
        return this.a;
    }

    public final synchronized void i(long j) {
        this.b = j;
        this.a = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = -9223372036854775807L;
        ((ThreadLocal) this.d).remove();
    }

    public final synchronized boolean j() {
        return this.a != -9223372036854775807L;
    }

    public nzd(aslg aslgVar) {
        this.d = aslgVar;
    }
}
