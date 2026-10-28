package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class zaj extends daa {
    private final boolean b;

    public zaj(List list, boolean z) {
        super(dbl.a, 32, list, null);
        this.b = z;
    }

    @Override // defpackage.daa
    public final daj h(daj dajVar) {
        ahbp ahbpVar;
        ahbp ahbpVar2;
        if (dajVar == null || dajVar.b != 1 || (ahbpVar = dajVar.i) == null || ahbpVar.b != 1 || ahbpVar.a(0) <= 0 || (ahbpVar2 = dajVar.j) == null || ahbpVar2.b != 1 || ahbpVar2.a(0) < 0) {
            return dajVar;
        }
        dai daiVar = new dai(dajVar);
        zkf.d(ahbpVar2);
        zkf.d(ahbpVar);
        long jA = ahbpVar2.a(0);
        bse bseVar = dajVar.g;
        long j = dajVar.c;
        long j2 = bseVar.K;
        long jC = bwp.C(jA, j2, j);
        long jC2 = bwp.C(ahbpVar2.a(0) + ahbpVar.a(0), j2, j) % 1024;
        bsd bsdVar = new bsd(bseVar);
        bsdVar.K = (int) jC;
        bsdVar.L = (int) (1024 - jC2);
        daiVar.g = new bse(bsdVar);
        daj dajVarA = daiVar.a();
        if (!this.b) {
            return dajVarA;
        }
        dai daiVar2 = new dai(dajVarA);
        daiVar2.j = null;
        daiVar2.k = null;
        return daiVar2.a();
    }
}
