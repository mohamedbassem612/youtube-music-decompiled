package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vty implements tuu {
    final /* synthetic */ vua a;

    public vty(vua vuaVar) {
        this.a = vuaVar;
    }

    private final int e(View view) {
        int iWidth = this.a.c.c().width();
        return vpo.d(view.getContext()) ? -iWidth : iWidth;
    }

    private final void f(View view, long j, tut tutVar, int i, vun vunVar) {
        int iA = vuk.a(e(view), 0, 0, 0, vunVar);
        avlh avlhVarG = avlh.G(0);
        vua vuaVar = this.a;
        vuaVar.d.b(vunVar, vuaVar.a(i, iA, j, avlhVarG, tutVar));
    }

    @Override // defpackage.tuu
    public final void a(View view, long j, tut tutVar) {
        f(view, j, tutVar, this.a.g, vun.d);
    }

    @Override // defpackage.tuu
    public final void b(View view, long j, tut tutVar) {
        f(view, j, tutVar, e(view), vun.c);
    }

    @Override // defpackage.tuu
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.tuu
    public final void c(View view) {
    }
}
