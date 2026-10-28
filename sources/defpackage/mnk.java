package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mnk implements mnm {
    private final /* synthetic */ int $cid;
    private final nry a;
    private final omj b;

    public mnk(nry nryVar, omj omjVar, int i) {
        this.$cid = i;
        this.a = nryVar;
        this.b = omjVar;
    }

    @Override // defpackage.mnm
    public final mep a() {
        return this.$cid != 0 ? nct.aa : ncw.ab;
    }

    @Override // defpackage.mnm
    public final /* synthetic */ mnl b(met metVar, nrv nrvVar) {
        return this.$cid != 0 ? new mni((nct) metVar, this.a, nrvVar, this.b) : new mnj((ncw) metVar, this.a, nrvVar, this.b);
    }
}
