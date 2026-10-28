package defpackage;

import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cwz implements cux {
    private final cvn a;
    private final int b;
    private final qha c = new qha();

    public cwz(cvn cvnVar, int i) {
        this.a = cvnVar;
        this.b = i;
    }

    private final long c(cvj cvjVar) {
        cvb cvbVar;
        long j;
        long j2;
        boolean z;
        while (true) {
            long jE = cvjVar.e();
            cvbVar = (cvb) cvjVar;
            j = cvbVar.a;
            j2 = (-6) + j;
            if (jE >= j2) {
                z = false;
                break;
            }
            cvn cvnVar = this.a;
            int i = this.b;
            qha qhaVar = this.c;
            long jE2 = cvjVar.e();
            bwb bwbVar = new bwb(17);
            cvbVar.n(bwbVar.b, 0, 2, false);
            if (bwbVar.b(ByteOrder.BIG_ENDIAN, 0) == i) {
                bwbVar.O(azz.f(cvjVar, bwbVar.b, 2, 15) + 2);
                cvjVar.k();
                int i2 = (int) (jE2 - cvbVar.b);
                z = false;
                cvbVar.m(i2, false);
                if (bbm.k(bwbVar, cvnVar, i, qhaVar)) {
                    break;
                }
            } else {
                cvjVar.k();
                cvbVar.m((int) (jE2 - cvbVar.b), false);
                z = false;
            }
            cvbVar.m(1, z);
        }
        if (cvjVar.e() < j2) {
            return this.c.a;
        }
        cvbVar.m((int) (j - cvjVar.e()), z);
        return this.a.j;
    }

    @Override // defpackage.cux
    public final cuw a(cvj cvjVar, long j) {
        cvb cvbVar = (cvb) cvjVar;
        long j2 = cvbVar.b;
        int i = this.a.c;
        long jC = c(cvjVar);
        long jE = cvjVar.e();
        cvbVar.m(Math.max(6, i), false);
        long jC2 = c(cvjVar);
        long jE2 = cvjVar.e();
        if (jC > j || jC2 <= j) {
            return jC2 <= j ? new cuw(-2, jC2, jE2) : new cuw(-1, jC, j2);
        }
        return new cuw(0, -9223372036854775807L, jE);
    }

    @Override // defpackage.cux
    public final /* synthetic */ void b() {
    }
}
