package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class gd extends bak {
    final /* synthetic */ gp a;

    public gd(gp gpVar) {
        this.a = gpVar;
    }

    @Override // defpackage.bak, defpackage.baj
    public final void a(View view) {
        gp gpVar = this.a;
        gpVar.q.setAlpha(1.0f);
        gpVar.H.t(null);
        gpVar.H = null;
    }

    @Override // defpackage.bak, defpackage.baj
    public final void b() {
        gp gpVar = this.a;
        gpVar.q.setVisibility(0);
        if (gpVar.q.getParent() instanceof View) {
            View view = (View) gpVar.q.getParent();
            int i = bac.a;
            view.requestApplyInsets();
        }
    }
}
