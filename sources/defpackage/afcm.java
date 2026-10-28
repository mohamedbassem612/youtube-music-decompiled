package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class afcm implements aevj {
    final /* synthetic */ afcr a;

    public afcm(afcr afcrVar) {
        this.a = afcrVar;
    }

    @Override // defpackage.aevj
    public final void a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.a.e(0);
    }

    @Override // defpackage.aevj
    public final void b(int i) {
        afcr afcrVar = this.a;
        if (i != 0) {
            afcy.a().g(afcrVar.x);
        } else {
            afcy.a().h(afcrVar.x);
        }
    }
}
