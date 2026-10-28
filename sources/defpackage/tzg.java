package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tzg implements avlv {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ tzg(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.avlv
    public final avlu a(avlr avlrVar) {
        if (this.$cid == 0) {
            return avlrVar.Z(((avlb) this.a).C(new Object()).k());
        }
        awdi awdiVar = new awdi(avlrVar, new omj(this.a));
        avnn avnnVar = atqp.l;
        return awdiVar;
    }
}
