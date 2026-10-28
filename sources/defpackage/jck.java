package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jck implements ixy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ jck(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, vxe] */
    @Override // defpackage.ixy
    public final void a() {
        int i = this.$cid;
        ?? r2 = this.a;
        if (i != 0) {
            r2.c(vxh.b("FEmusic_offline"), null);
        } else {
            ((jcl) r2).a.a(vxh.b("FEmusic_offline"));
        }
    }
}
