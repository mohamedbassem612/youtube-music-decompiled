package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class uie extends aevq {
    final /* synthetic */ uii a;

    public uie(uii uiiVar) {
        this.a = uiiVar;
    }

    @Override // defpackage.aevq
    public final void b(View view, int i) {
        View view2;
        uii uiiVar = this.a;
        if (uiiVar.m == null || (view2 = uiiVar.l) == null) {
            return;
        }
        if (i != 3 || view2.getHeight() < uiiVar.B) {
            uiiVar.m.setElevation(0.0f);
        } else {
            uiiVar.m.setElevation(uiiVar.A);
        }
    }

    @Override // defpackage.aevq
    public final void a(View view, float f) {
    }
}
