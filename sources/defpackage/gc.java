package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gc extends bak {
    final /* synthetic */ bh a;

    public gc(bh bhVar) {
        this.a = bhVar;
    }

    @Override // defpackage.bak, defpackage.baj
    public final void a(View view) {
        gp gpVar = (gp) this.a.a;
        gpVar.q.setAlpha(1.0f);
        gpVar.H.t(null);
        gpVar.H = null;
    }

    @Override // defpackage.bak, defpackage.baj
    public final void b() {
        ((gp) this.a.a).q.setVisibility(0);
    }
}
