package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class deq implements cux {
    private final bwb a = new bwb();
    private final int b;
    private final nzd c;

    public deq(int i, nzd nzdVar) {
        this.b = i;
        this.c = nzdVar;
    }

    @Override // defpackage.cux
    public final cuw a(cvj cvjVar, long j) {
        int iE;
        int iE2;
        cuw cuwVar;
        cvb cvbVar = (cvb) cvjVar;
        long j2 = cvbVar.a;
        long j3 = cvbVar.b;
        int iMin = (int) Math.min(112800L, j2 - j3);
        bwb bwbVar = this.a;
        bwbVar.L(iMin);
        cvbVar.n(bwbVar.b, 0, iMin, false);
        int i = bwbVar.d;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        long j6 = -1;
        while (bwbVar.d() >= 188 && (iE2 = (iE = rx.e(bwbVar.b, bwbVar.c, i)) + 188) <= i) {
            long jF = rx.f(bwbVar, iE, this.b);
            if (jF != -9223372036854775807L) {
                long jB = this.c.b(jF);
                if (jB <= j) {
                    j6 = iE;
                    if (100000 + jB > j) {
                        cuwVar = new cuw(0, -9223372036854775807L, j3 + j6);
                    } else {
                        j5 = jB;
                    }
                } else {
                    if (j5 == -9223372036854775807L) {
                        return new cuw(-1, jB, j3);
                    }
                    cuwVar = new cuw(0, -9223372036854775807L, j3 + j6);
                }
                return cuwVar;
            }
            bwbVar.P(iE2);
            j4 = iE2;
        }
        return j5 != -9223372036854775807L ? new cuw(-2, j5, j3 + j4) : cuw.a;
    }

    @Override // defpackage.cux
    public final void b() {
        this.a.M(bwp.e);
    }
}
