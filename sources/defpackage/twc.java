package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class twc implements tcq {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ twc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [awmd, java.lang.Object] */
    @Override // defpackage.tcq
    public final void t() {
        int i = this.$cid;
        if (i == 0) {
            ((wmy) this.a).a = false;
            return;
        }
        ?? r2 = this.a;
        if (i != 1) {
            ((xfn) r2).g();
            return;
        }
        ((awkv) ((tfm) r2.io()).b).kk(Boolean.FALSE);
    }

    public twc(xfn xfnVar, int i) {
        this.$cid = i;
        this.a = xfnVar;
    }
}
