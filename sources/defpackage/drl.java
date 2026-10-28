package defpackage;

import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class drl extends dsb {
    boolean a = false;
    final ViewGroup b;

    public drl(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.dsb, defpackage.drx
    public final void a(dsa dsaVar) {
        dsl.a(this.b, false);
        this.a = true;
    }

    @Override // defpackage.dsb, defpackage.drx
    public final void b(dsa dsaVar) {
        if (!this.a) {
            dsl.a(this.b, false);
        }
        dsaVar.F(this);
    }

    @Override // defpackage.dsb, defpackage.drx
    public final void c() {
        dsl.a(this.b, false);
    }

    @Override // defpackage.dsb, defpackage.drx
    public final void d() {
        dsl.a(this.b, true);
    }
}
