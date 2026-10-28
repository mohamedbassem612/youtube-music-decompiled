package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vki implements ugc {
    final /* synthetic */ vkl a;
    private ufz b = null;

    public vki(vkl vklVar) {
        this.a = vklVar;
    }

    @Override // defpackage.ugc
    public final uga a() {
        return new vkh(this.a);
    }

    @Override // defpackage.ugc
    public final void b(ufz ufzVar) {
        this.b = ufzVar;
        vkl vklVar = this.a;
        if (vklVar.O == 2) {
            vklVar.n(false);
        } else {
            vklVar.d();
        }
    }

    @Override // defpackage.ugc
    public final void c() {
        ufz ufzVar = this.b;
        if (ufzVar != null) {
            ufzVar.a();
        }
    }

    @Override // defpackage.ugc
    public final void d(ufz ufzVar) {
        this.b = ufzVar;
        vkl vklVar = this.a;
        if (vklVar.O == 2) {
            vklVar.G = vkw.a();
            vklVar.m(true);
            return;
        }
        ahno.F(false);
        vklVar.k.h = true;
        vklVar.F = false;
        vklVar.q.setEnabled(false);
        View view = vklVar.n;
        view.getClass();
        if (vklVar.o == null) {
            vklVar.o = Integer.valueOf(view.getBottom());
        }
        vklVar.n(true);
    }
}
