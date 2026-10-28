package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rqk implements zvv {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ rqk(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, xrc, zws] */
    @Override // defpackage.zvv
    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            zws zwsVar = ((rql) this.a).a;
            if (zwsVar != null) {
                zwsVar.d();
                return;
            }
            return;
        }
        ?? r2 = this.a;
        if (i != 1) {
            r2.a();
        } else if (r2 != 0) {
            r2.d();
        }
    }
}
