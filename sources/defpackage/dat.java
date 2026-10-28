package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dat {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    private final bwb g = new bwb(255);

    public final void a() {
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public final boolean b(cvj cvjVar, boolean z) throws bsz {
        a();
        bwb bwbVar = this.g;
        bwbVar.L(27);
        if (!azz.j(cvjVar, bwbVar.b, 27, z) || bwbVar.w() != 1332176723) {
            return false;
        }
        if (bwbVar.n() != 0) {
            if (z) {
                return false;
            }
            throw new bsz("unsupported bit stream revision", null, false, 1);
        }
        this.a = bwbVar.n();
        this.b = bwbVar.t();
        bwbVar.u();
        bwbVar.u();
        bwbVar.u();
        int iN = bwbVar.n();
        this.c = iN;
        this.d = iN + 27;
        bwbVar.L(iN);
        if (!azz.j(cvjVar, bwbVar.b, this.c, z)) {
            return false;
        }
        for (int i = 0; i < this.c; i++) {
            int[] iArr = this.f;
            int iN2 = bwbVar.n();
            iArr[i] = iN2;
            this.e += iN2;
        }
        return true;
    }

    public final boolean c(cvj cvjVar, long j) {
        cvb cvbVar = (cvb) cvjVar;
        ahno.F(cvbVar.b == cvjVar.e());
        bwb bwbVar = this.g;
        bwbVar.L(4);
        while (true) {
            if ((j != -1 && cvbVar.b + 4 >= j) || !azz.j(cvjVar, bwbVar.b, 4, true)) {
                break;
            }
            bwbVar.P(0);
            if (bwbVar.w() == 1332176723) {
                cvjVar.k();
                return true;
            }
            cvbVar.p(1, false);
        }
        do {
            if (j != -1 && cvbVar.b >= j) {
                return false;
            }
        } while (cvjVar.c(1) != -1);
        return false;
    }
}
