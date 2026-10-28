package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dez implements dey {
    private final cvk a;
    private final cwj b;
    private final dfb c;
    private final bse d;
    private final int e;
    private long f;
    private int g;
    private long h;

    public dez(cvk cvkVar, cwj cwjVar, dfb dfbVar, String str, int i) throws bsz {
        this.a = cvkVar;
        this.b = cwjVar;
        this.c = dfbVar;
        int i2 = dfbVar.b * dfbVar.e;
        int i3 = dfbVar.d;
        int i4 = i2 / 8;
        if (i3 != i4) {
            throw new bsz(a.bQ(i3, i4, "Expected block size: ", "; got: "), null, true, 1);
        }
        int i5 = dfbVar.c * i4;
        int i6 = i5 << 3;
        int iMax = Math.max(i4, i5 / 10);
        this.e = iMax;
        bsd bsdVar = new bsd();
        bsdVar.a("audio/wav");
        bsdVar.e(str);
        bsdVar.i = i6;
        bsdVar.j = i6;
        bsdVar.p = iMax;
        bsdVar.G = dfbVar.b;
        bsdVar.H = aty.k(dfbVar.g);
        bsdVar.I = dfbVar.c;
        bsdVar.J = i;
        this.d = new bse(bsdVar);
    }

    @Override // defpackage.dey
    public final void a(int i, long j) {
        this.a.z(new dfd(this.c, 1, i, j));
        cwj cwjVar = this.b;
        cwjVar.b(this.d);
        cwjVar.f();
    }

    @Override // defpackage.dey
    public final void b(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // defpackage.dey
    public final boolean c(cvj cvjVar, long j) {
        int i;
        int i2;
        while (j > 0 && (i = this.g) < (i2 = this.e)) {
            int iA = this.b.a(cvjVar, (int) Math.min(i2 - i, j), true);
            if (iA == -1) {
                j = 0;
            } else {
                this.g += iA;
                j -= (long) iA;
            }
        }
        dfb dfbVar = this.c;
        int i3 = this.g;
        int i4 = dfbVar.d;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long jC = this.f + bwp.C(this.h, 1000000L, dfbVar.c);
            int i6 = i5 * i4;
            int i7 = this.g - i6;
            this.b.e(jC, 1, i6, i7, null);
            this.h += (long) i5;
            this.g = i7;
        }
        return j <= 0;
    }
}
