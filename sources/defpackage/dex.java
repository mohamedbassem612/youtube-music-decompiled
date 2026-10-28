package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dex implements dey {
    private static final int[] a = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] b = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final cvk c;
    private final cwj d;
    private final dfb e;
    private final int f;
    private final byte[] g;
    private final bwb h;
    private final int i;
    private final bse j;
    private int k;
    private long l;
    private int m;
    private long n;

    public dex(cvk cvkVar, cwj cwjVar, dfb dfbVar) throws bsz {
        this.c = cvkVar;
        this.d = cwjVar;
        this.e = dfbVar;
        int iMax = Math.max(1, dfbVar.c / 10);
        this.i = iMax;
        bwb bwbVar = new bwb(dfbVar.f);
        bwbVar.l();
        int iL = bwbVar.l();
        this.f = iL;
        int i = dfbVar.b;
        int i2 = (((dfbVar.d - (i << 2)) << 3) / (dfbVar.e * i)) + 1;
        if (iL != i2) {
            throw new bsz(a.bQ(iL, i2, "Expected frames per block: ", "; got: "), null, true, 1);
        }
        int i3 = bwp.a;
        int i4 = ((iMax + iL) - 1) / iL;
        this.g = new byte[dfbVar.d * i4];
        this.h = new bwb(i4 * (iL << 1) * i);
        int i5 = ((dfbVar.c * dfbVar.d) << 3) / iL;
        bsd bsdVar = new bsd();
        bsdVar.e("audio/raw");
        bsdVar.i = i5;
        bsdVar.j = i5;
        bsdVar.p = (iMax << 1) * i;
        bsdVar.G = dfbVar.b;
        bsdVar.H = aty.k(dfbVar.g);
        bsdVar.I = dfbVar.c;
        bsdVar.J = 2;
        this.j = new bse(bsdVar);
    }

    private final int d(int i) {
        return i / (this.e.b << 1);
    }

    private final int e(int i) {
        return (i << 1) * this.e.b;
    }

    private final void f(int i) {
        long jC = this.l + bwp.C(this.n, 1000000L, this.e.c);
        int iE = e(i);
        this.d.e(jC, 1, iE, this.m - iE, null);
        this.n += (long) i;
        this.m -= iE;
    }

    @Override // defpackage.dey
    public final void a(int i, long j) {
        this.c.z(new dfd(this.e, this.f, i, j));
        cwj cwjVar = this.d;
        cwjVar.b(this.j);
        cwjVar.f();
    }

    @Override // defpackage.dey
    public final void b(long j) {
        this.k = 0;
        this.l = j;
        this.m = 0;
        this.n = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0022, code lost:
    
        r9 = true;
     */
    @Override // defpackage.dey
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.cvj r26, long r27) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dex.c(cvj, long):boolean");
    }
}
