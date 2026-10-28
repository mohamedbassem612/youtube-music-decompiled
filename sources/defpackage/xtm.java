package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xtm implements xzf {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public xtm(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.xzf
    public final void g(xzc xzcVar) {
        int i = this.$cid;
        if (i == 0) {
            ((xto) this.a).n(false);
        } else if (i != 1) {
            xuy xuyVar = (xuy) this.a;
            xuyVar.b = false;
            xuyVar.b(0L);
        }
    }

    @Override // defpackage.xzf
    public final void h(xzc xzcVar) {
        int i = this.$cid;
        if (i == 0) {
            ((xto) this.a).m(dij.j());
        } else {
            Object obj = this.a;
            if (i != 1) {
                ((xuy) obj).b = true;
            } else {
                ((igk) obj).d();
            }
        }
    }

    @Override // defpackage.xzf
    public final void jv(xzc xzcVar) {
        int i = this.$cid;
        if (i == 0) {
            ((xto) this.a).n(true);
            return;
        }
        Object obj = this.a;
        if (i == 1) {
            ((igk) obj).d();
            return;
        }
        xuy xuyVar = (xuy) obj;
        xuyVar.b = true;
        xuyVar.b(0L);
    }
}
