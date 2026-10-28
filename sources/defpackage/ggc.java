package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ggc implements baj {
    final /* synthetic */ ggd a;

    public ggc(ggd ggdVar) {
        this.a = ggdVar;
    }

    @Override // defpackage.baj
    public final void a(View view) {
        this.a.a = false;
        view.setVisibility(4);
    }

    @Override // defpackage.baj
    public final void b() {
        this.a.a = true;
    }

    @Override // defpackage.baj
    public final void c() {
        this.a.a = false;
    }
}
