package defpackage;

import android.graphics.drawable.Drawable;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fgv {
    private final fhd a;
    public final fgy b;
    public final ayq c;

    protected fgv(fhd fhdVar, fgy fgyVar) {
        this.c = fhdVar.k;
        this.b = fgyVar;
        this.a = fhdVar;
        if (fhdVar.c != null) {
            fgyVar.k = fhdVar.m();
        }
        fgyVar.o = fhdVar.a;
    }

    public final void A(fwl fwlVar) {
        fgs fgsVar = (fgs) this.b.k().E();
        fgsVar.a |= SemanticState.Obscured;
        fgsVar.s = fwlVar;
    }

    public final void B(float f) {
        fgs fgsVar = (fgs) this.b.k().E();
        fgsVar.a |= 8;
        fgsVar.e = f;
    }

    public final void C(int i) {
        fgs fgsVar = (fgs) this.b.k().E();
        fgsVar.a |= 4;
        fgsVar.d = i;
    }

    public final void D(float f) {
        fgu fguVarK = this.b.k();
        fguVarK.G();
        fguVarK.F().A(f);
    }

    public final void E(float f) {
        fgu fguVarK = this.b.k();
        fguVarK.G();
        fguVarK.F().B(f);
    }

    public final void F(String str) {
        fgu fguVarK = this.b.k();
        fguVarK.a = (byte) (fguVarK.a | 2);
        fguVarK.f = str;
    }

    public final void G(fln flnVar) {
        fgt fgtVarD = this.b.k().D();
        fgtVarD.a |= 131072;
        fgtVarD.h = flnVar;
    }

    public final void H(Object obj) {
        this.b.k().F().F(obj);
    }

    public final void I(fip fipVar) {
        fgt fgtVarD = this.b.k().D();
        fgtVarD.a |= 8;
        fgtVarD.b = fipVar;
    }

    public final void J(int i, float f) {
        M(i, this.c.z(f));
    }

    public final void K(int i, float f) {
        int iZ = this.c.z(f);
        fgt fgtVarD = this.b.k().D();
        fgtVarD.a |= SemanticState.Hidden;
        if (fgtVarD.e == null) {
            fgtVarD.e = new fik();
        }
        fgtVarD.e.e(i, iZ);
    }

    public final void L(int i) {
        fgs fgsVar = (fgs) this.b.k().E();
        fgsVar.a |= 64;
        fgsVar.h = i;
    }

    public final void M(int i, int i2) {
        fgs fgsVar = (fgs) this.b.k().E();
        fgsVar.a |= 8388608;
        if (fgsVar.w == null) {
            fgsVar.w = new fik();
        }
        fgsVar.w.e(i, i2);
    }

    public final void N(Object obj) {
        this.b.k().g = obj;
    }

    public final void O(float f) {
        fgs fgsVar = (fgs) this.b.k().E();
        fgsVar.a |= 32768;
        fgsVar.n = f;
    }

    public final void P(float f) {
        fgs fgsVar = (fgs) this.b.k().E();
        fgsVar.a |= 65536;
        fgsVar.o = f;
    }

    public final void Q(int i, int i2) {
        fgs fgsVar = (fgs) this.b.k().E();
        fgsVar.a |= 33554432;
        if (fgsVar.u == null) {
            fgsVar.u = new fik();
        }
        fgsVar.u.e(i, i2);
    }

    public final void R(int i) {
        fgs fgsVar = (fgs) this.b.k().E();
        fgsVar.a |= SemanticState.Hidden;
        fgsVar.j = i;
    }

    public final void S(fip fipVar) {
        this.b.k().F().w(fipVar);
    }

    public final void T(int i, int i2) {
        fgs fgsVar = (fgs) this.b.k().E();
        fgsVar.a |= 2097152;
        if (fgsVar.t == null) {
            fgsVar.t = new fik();
        }
        fgsVar.t.e(i, i2);
    }

    public final void U(int i) {
        fgs fgsVar = (fgs) this.b.k().E();
        fgsVar.a |= 1048576;
        fgsVar.D = i;
    }

    public final void V(fip fipVar) {
        this.b.k().F().C(fipVar);
    }

    public final void W(float f) {
        fgs fgsVar = (fgs) this.b.k().E();
        fgsVar.a |= 2;
        fgsVar.c = f;
    }

    public final void X(int i) {
        fgs fgsVar = (fgs) this.b.k().E();
        fgsVar.a |= 1;
        fgsVar.b = i;
    }

    public final void Y() {
        this.b.k().G();
    }

    public abstract fgy a();

    public final fgv k(float f) {
        X(this.c.z(f));
        return this;
    }

    public final void l(int i) {
        fgs fgsVar = (fgs) this.b.k().E();
        fgsVar.a |= SemanticState.Multiline;
        fgsVar.C = i;
    }

    public void m(float f) {
        fgu fguVarK = this.b.k();
        fguVarK.F().g(f);
        fguVarK.a = (byte) (f == 1.0f ? fguVarK.a & (-9) : fguVarK.a | 8);
    }

    public final void n(float f) {
        fgs fgsVar = (fgs) this.b.k().E();
        fgsVar.a |= 524288;
        fgsVar.r = f;
    }

    public final void o(Drawable drawable) {
        fgu fguVarK = this.b.k();
        fguVarK.a = (byte) (fguVarK.a | 1);
        fguVarK.e = drawable;
    }

    public final void p(fgp fgpVar) {
        fgt fgtVarD = this.b.k().D();
        fgtVarD.a |= SemanticState.Multiline;
        fgtVarD.j = fgpVar;
    }

    public final void q(fip fipVar) {
        this.b.k().F().h(fipVar);
    }

    public void r(boolean z) {
        this.b.k().F().j(z);
    }

    public void s() {
        this.b.k().F().j = false;
    }

    public void t(CharSequence charSequence) {
        this.b.k().F().l(charSequence);
    }

    public final void u(float f) {
        fgs fgsVar = (fgs) this.b.k().E();
        fgsVar.a |= 262144;
        fgsVar.q = f;
    }

    public final void v(int i) {
        fgs fgsVar = (fgs) this.b.k().E();
        fgsVar.a |= 131072;
        fgsVar.p = i;
    }

    public final void w(boolean z) {
        this.b.k().F().q(z);
    }

    public final void x(float f) {
        L(this.c.z(f));
    }

    public final void y(float f) {
        fgs fgsVar = (fgs) this.b.k().E();
        fgsVar.a |= SemanticState.Focused;
        fgsVar.i = f;
    }

    public final void z(String str) {
        if (str == null) {
            fhd fhdVar = this.a;
            fgy fgyVar = fhdVar.c;
            gzj.bs(2, a.bT(fgyVar != null ? fgyVar.c() : "unknown component", "Setting a null key from ", " which is usually a mistake! If it is not, explicitly set the String 'null'"), fpr.a(fhdVar));
            str = "null";
        }
        fgy fgyVar2 = this.b;
        fgyVar2.m = true;
        fgyVar2.l = str;
    }
}
