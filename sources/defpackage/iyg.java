package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class iyg implements aevj {
    final /* synthetic */ iyk a;

    public iyg(iyk iykVar) {
        this.a = iykVar;
    }

    @Override // defpackage.aevj
    public final void a(View view) {
        this.a.c();
    }

    @Override // defpackage.aevj
    public final void b(int i) {
        iyk iykVar = this.a;
        if (i != 0) {
            jit.a().e(iykVar.f);
        } else {
            jit.a().f(iykVar.f);
        }
    }
}
