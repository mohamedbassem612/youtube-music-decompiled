package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class twd implements tcr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ twd(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [awmd, java.lang.Object] */
    @Override // defpackage.tcr
    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            ((wmy) this.a).a = true;
            return;
        }
        ?? r2 = this.a;
        if (i != 1) {
            ((xfn) r2).h(false);
            return;
        }
        ((awkv) ((tfm) r2.io()).b).kk(Boolean.TRUE);
    }

    public twd(xfn xfnVar, int i) {
        this.$cid = i;
        this.a = xfnVar;
    }
}
