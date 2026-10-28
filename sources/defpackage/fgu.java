package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgu implements fjb, fil {
    public byte a;
    public fgt b;
    public fkl c;
    public fgs d;
    public Drawable e;
    public String f;
    public Object g;
    public boolean h;

    @Override // defpackage.fjb
    public final void A(int i, float f) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void B(int i, int i2) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void C() {
        throw null;
    }

    public final fgt D() {
        fgt fgtVar = this.b;
        if (fgtVar != null) {
            return fgtVar;
        }
        fgt fgtVar2 = new fgt();
        this.b = fgtVar2;
        return fgtVar2;
    }

    public final fjb E() {
        fgs fgsVar = this.d;
        if (fgsVar != null) {
            return fgsVar;
        }
        fgs fgsVar2 = new fgs();
        this.d = fgsVar2;
        return fgsVar2;
    }

    public final fkl F() {
        fkl fklVar = this.c;
        if (fklVar != null) {
            return fklVar;
        }
        fkl fklVar2 = new fkl();
        this.c = fklVar2;
        return fklVar2;
    }

    public final void G() {
        this.h = true;
    }

    @Override // defpackage.fil
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        fgu fguVar = (fgu) obj;
        if (this != fguVar) {
            return fguVar != null && this.a == fguVar.a && this.h == fguVar.h && gzj.aR(this.e, fguVar.e) && gzj.bI(this.b, fguVar.b) && gzj.bI(this.c, fguVar.c) && gzj.bI(this.d, fguVar.d) && gzj.bH(this.f, fguVar.f) && gzj.bH(this.g, fguVar.g);
        }
        return true;
    }

    @Override // defpackage.fjb
    public final void b(float f) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void c(float f) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void d(int i) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void e(float f) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void f(float f) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void g(float f) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void h(int i) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void i(fwl fwlVar) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void j(float f) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void k(int i) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void l(float f) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void m(int i) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void n(float f) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void o(int i) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void p(float f) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void q(int i) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void r(float f) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void s(int i) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void t(int i) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void u(int i) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void v(int i, float f) {
        fjb fjbVarE = E();
        int i2 = i - 1;
        if (i2 == 0) {
            ((fgs) fjbVarE).z = f;
            return;
        }
        fgs fgsVar = (fgs) fjbVarE;
        if (i2 != 1) {
            fgsVar.B = f;
        } else {
            fgsVar.A = f;
        }
    }

    @Override // defpackage.fjb
    public final void w(int i, float f) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void x(int i, int i2) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void y(int i, float f) {
        throw null;
    }

    @Override // defpackage.fjb
    public final void z(int i, int i2) {
        throw null;
    }
}
