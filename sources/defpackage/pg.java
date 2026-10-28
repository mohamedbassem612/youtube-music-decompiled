package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pg extends bak {
    final /* synthetic */ int a;
    final /* synthetic */ ph b;
    private boolean c = false;

    public pg(ph phVar, int i) {
        this.b = phVar;
        this.a = i;
    }

    @Override // defpackage.bak, defpackage.baj
    public final void a(View view) {
        if (this.c) {
            return;
        }
        ph phVar = this.b;
        phVar.a.setVisibility(this.a);
    }

    @Override // defpackage.bak, defpackage.baj
    public final void b() {
        this.b.a.setVisibility(0);
    }

    @Override // defpackage.bak, defpackage.baj
    public final void c() {
        this.c = true;
    }
}
