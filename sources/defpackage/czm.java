package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class czm implements czk {
    private final long a;
    private final int b;
    private final long c;
    private final int d;
    private final long e;
    private final long f;
    private final long[] g;

    public czm(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = nj.l(j3 - ((long) i), j2);
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    private final long i(int i) {
        return (this.c * ((long) i)) / 100;
    }

    @Override // defpackage.cvz
    public final long a() {
        return this.c;
    }

    @Override // defpackage.cvz
    public final cvx b(long j) {
        if (!d()) {
            cwa cwaVar = new cwa(0L, this.a + ((long) this.b));
            return new cvx(cwaVar, cwaVar);
        }
        long j2 = this.c;
        long jT = bwp.t(j, 0L, j2);
        double d = (jT * 100.0d) / j2;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.g;
                jArr.getClass();
                double d3 = jArr[i];
                d2 = d3 + ((d - ((double) i)) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        long j3 = this.e;
        cwa cwaVar2 = new cwa(jT, this.a + bwp.t(Math.round((d2 / 256.0d) * j3), this.b, (-1) + j3));
        return new cvx(cwaVar2, cwaVar2);
    }

    @Override // defpackage.cvz
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.cvz
    public final boolean d() {
        return this.g != null;
    }

    @Override // defpackage.czk
    public final int e() {
        return this.d;
    }

    @Override // defpackage.czk
    public final long f() {
        return this.f;
    }

    @Override // defpackage.czk
    public final long g() {
        return this.a + ((long) this.b);
    }

    @Override // defpackage.czk
    public final long h(long j) {
        if (d()) {
            long j2 = j - this.a;
            if (j2 > this.b) {
                long[] jArr = this.g;
                jArr.getClass();
                double d = (j2 * 256.0d) / this.e;
                int iAn = bwp.an(jArr, (long) d, true);
                long jI = i(iAn);
                long j3 = jArr[iAn];
                int i = iAn + 1;
                long jI2 = i(i);
                long j4 = iAn == 99 ? 256L : jArr[i];
                return jI + Math.round((j3 == j4 ? 0.0d : (d - j3) / (j4 - j3)) * (jI2 - jI));
            }
        }
        return 0L;
    }
}
