package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xol implements xzf {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public xol(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.xzf
    public final void g(xzc xzcVar) {
        int i = this.$cid;
        Object obj = this.a;
        if (i == 0) {
            ((xom) obj).a(xzcVar);
            return;
        }
        xlc xlcVar = (xlc) obj;
        if (xlcVar.g == null || xlcVar.k) {
            return;
        }
        xlcVar.c(3, xzcVar);
    }

    @Override // defpackage.xzf
    public final void h(xzc xzcVar) {
        int i = this.$cid;
        Object obj = this.a;
        if (i == 0) {
            ((xom) obj).a(xzcVar);
            return;
        }
        xlc xlcVar = (xlc) obj;
        if (xlcVar.g == null) {
            xzcVar = null;
        }
        xlcVar.j = xzcVar;
    }

    @Override // defpackage.xzf
    public final void jv(xzc xzcVar) {
        int i = this.$cid;
        Object obj = this.a;
        if (i == 0) {
            ((xom) obj).a(xzcVar);
            return;
        }
        xlc xlcVar = (xlc) obj;
        if (xlcVar.g != null) {
            xlj xljVar = xlcVar.m;
            xljVar.d();
            xljVar.d = null;
            xljVar.b.b(null, 6, xljVar.b(false, null).a());
            xljVar.c();
            elq elqVar = xlcVar.p;
            xlg xlgVar = xlcVar.g;
            elqVar.z(3, xlgVar.e, xlcVar.i, xlgVar.d.g);
            xlcVar.a();
        }
    }
}
