package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class gg implements hu {
    final /* synthetic */ gp a;
    private final hu b;

    public gg(gp gpVar, hu huVar) {
        this.a = gpVar;
        this.b = huVar;
    }

    @Override // defpackage.hu
    public final void a(hv hvVar) {
        this.b.a(hvVar);
        gp gpVar = this.a;
        if (gpVar.r != null) {
            gpVar.k.getDecorView().removeCallbacks(gpVar.s);
        }
        if (gpVar.q != null) {
            gpVar.N();
            ci ciVarX = bac.x(gpVar.q);
            ciVarX.q(0.0f);
            gpVar.H = ciVarX;
            gpVar.H.t(new gf(this));
        }
        fy fyVar = gpVar.l;
        if (fyVar != null) {
            fyVar.onSupportActionModeFinished(gpVar.p);
        }
        gpVar.p = null;
        ViewGroup viewGroup = gpVar.u;
        int i = bac.a;
        viewGroup.requestApplyInsets();
        gpVar.P();
    }

    @Override // defpackage.hu
    public final boolean b(hv hvVar, MenuItem menuItem) {
        return this.b.b(hvVar, menuItem);
    }

    @Override // defpackage.hu
    public final boolean c(hv hvVar, Menu menu) {
        return this.b.c(hvVar, menu);
    }

    @Override // defpackage.hu
    public final boolean d(hv hvVar, Menu menu) {
        ViewGroup viewGroup = this.a.u;
        int i = bac.a;
        viewGroup.requestApplyInsets();
        return this.b.d(hvVar, menu);
    }
}
