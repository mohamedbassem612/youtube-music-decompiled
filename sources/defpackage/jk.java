package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jk implements baj {
    int a;
    final /* synthetic */ jl b;
    private boolean c = false;

    protected jk(jl jlVar) {
        this.b = jlVar;
    }

    @Override // defpackage.baj
    public final void a(View view) {
        if (this.c) {
            return;
        }
        jl jlVar = this.b;
        jlVar.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.a);
    }

    @Override // defpackage.baj
    public final void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.c = false;
    }

    @Override // defpackage.baj
    public final void c() {
        this.c = true;
    }

    public final void d(ci ciVar, int i) {
        this.b.f = ciVar;
        this.a = i;
    }
}
