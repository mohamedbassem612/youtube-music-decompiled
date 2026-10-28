package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class czt implements czr {
    private final int a;
    private final int b;
    private final bwb c;

    public czt(bwx bwxVar, bse bseVar) {
        bwb bwbVar = bwxVar.a;
        this.c = bwbVar;
        bwbVar.P(12);
        int iQ = bwbVar.q();
        if ("audio/raw".equals(bseVar.q)) {
            int iJ = bwp.j(bseVar.L) * bseVar.I;
            if (iQ % iJ != 0) {
                bvx.e("BoxParsers", a.bQ(iQ, iJ, "Audio sample size mismatch. stsd sample size: ", ", stsz sample size: "));
                iQ = iJ;
            }
        }
        this.a = iQ == 0 ? -1 : iQ;
        this.b = bwbVar.q();
    }

    @Override // defpackage.czr
    public final int a() {
        return this.a;
    }

    @Override // defpackage.czr
    public final int b() {
        return this.b;
    }

    @Override // defpackage.czr
    public final int c() {
        int i = this.a;
        return i == -1 ? this.c.q() : i;
    }
}
