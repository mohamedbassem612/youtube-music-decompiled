package defpackage;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vnl implements vnv {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ vmz a;

    public /* synthetic */ vnl(vmz vmzVar, int i) {
        this.$cid = i;
        this.a = vmzVar;
    }

    @Override // defpackage.vnv
    public final void a() {
        int i = this.$cid;
        vmz vmzVar = this.a;
        if (i == 0) {
            vnr vnrVar = (vnr) vmzVar;
            vnx vnxVar = vnrVar.j;
            int height = vnxVar != null ? ((vnw) vnxVar).a.getHeight() : 0;
            vpt vptVar = (vpt) vnrVar.z.c;
            vptVar.n = height;
            vptVar.s();
            if (vnrVar.q) {
                vnrVar.h();
                return;
            }
            return;
        }
        vta vtaVar = (vta) vmzVar;
        SwipeRefreshLayout swipeRefreshLayout = vtaVar.m;
        if (swipeRefreshLayout != null) {
            int paddingLeft = swipeRefreshLayout.getPaddingLeft();
            int paddingTop = vtaVar.m.getPaddingTop();
            int paddingRight = vtaVar.m.getPaddingRight();
            vnx vnxVar2 = vtaVar.r;
            vnxVar2.getClass();
            swipeRefreshLayout.setPadding(paddingLeft, paddingTop, paddingRight, ((vnw) vnxVar2).a.getHeight());
        }
    }
}
