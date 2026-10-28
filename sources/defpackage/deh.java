package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class deh implements dem {
    private bse a;
    private cwj b;
    private nzd c;

    public deh(String str) {
        bsd bsdVar = new bsd();
        bsdVar.a("video/mp2t");
        bsdVar.e(str);
        this.a = new bse(bsdVar);
    }

    @Override // defpackage.dem
    public final void a(bwb bwbVar) {
        this.c.getClass();
        int i = bwp.a;
        long jE = this.c.e();
        long jF = this.c.f();
        if (jE == -9223372036854775807L || jF == -9223372036854775807L) {
            return;
        }
        bse bseVar = this.a;
        if (jF != bseVar.v) {
            bsd bsdVar = new bsd(bseVar);
            bsdVar.t = jF;
            bse bseVar2 = new bse(bsdVar);
            this.a = bseVar2;
            this.b.b(bseVar2);
        }
        int iD = bwbVar.d();
        this.b.c(bwbVar, iD);
        this.b.e(jE, 1, iD, 0, null);
    }

    @Override // defpackage.dem
    public final void b(nzd nzdVar, cvk cvkVar, dev devVar) {
        this.c = nzdVar;
        devVar.c();
        cwj cwjVarS = cvkVar.s(devVar.a(), 5);
        this.b = cwjVarS;
        cwjVarS.b(this.a);
    }
}
