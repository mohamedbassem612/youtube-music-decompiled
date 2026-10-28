package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mnw implements mnm {
    private final nry a;
    private final boolean b;
    private final omj c;

    public mnw(nry nryVar, omj omjVar, agev agevVar) {
        this.a = nryVar;
        this.c = omjVar;
        this.b = ((Boolean) agevVar.e(Boolean.FALSE)).booleanValue();
    }

    @Override // defpackage.mnm
    public final mep a() {
        return ndg.ad;
    }

    @Override // defpackage.mnm
    public final /* bridge */ /* synthetic */ mnl b(met metVar, nrv nrvVar) {
        return new mnv((ndg) metVar, this.a, nrvVar, this.c, this.b);
    }
}
