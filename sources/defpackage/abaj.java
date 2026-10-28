package defpackage;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abaj extends zkl {
    protected Surface e;
    protected ctl f;
    public final boolean g;
    private final abbd h;
    private final Context i;
    private boolean j;
    private View k;
    private boolean l;

    public abaj(Context context, abbd abbdVar, boolean z, zjr zjrVar) {
        super(context, zjrVar);
        this.e = null;
        this.f = null;
        this.i = context;
        this.j = z;
        this.g = zjrVar.ak();
        this.h = abbdVar;
        int i = zic.a;
        View viewA = abbdVar.a(context, new abai(this), z);
        addView(viewA);
        setSystemUiVisibility(SemanticState.Obscured);
        this.k = viewA;
    }

    @Override // defpackage.zkl, defpackage.zlm
    public final boolean A(int i) {
        abbd abbdVar = this.h;
        abbu abbuVar = abbdVar.f;
        if (abbuVar != null) {
            abbuVar.h(i);
        }
        abbdVar.r = i;
        return true;
    }

    @Override // defpackage.zlm
    public final zlo B() {
        return zlo.GL_CARDBOARD;
    }

    @Override // defpackage.zlm
    public final void H() {
        if (this.g) {
            removeView(this.k);
            View viewA = this.h.a(this.i, new abai(this), this.j);
            this.k = viewA;
            addView(viewA);
        }
    }

    @Override // defpackage.zki
    public final Surface f() {
        return this.e;
    }

    @Override // defpackage.zki
    public final void i() {
        abbd abbdVar = this.h;
        abap abapVar = abbdVar.d;
        if (abapVar != null) {
            abapVar.j();
            abbdVar.d.c();
        }
        abbs abbsVar = abbdVar.h;
        abbu abbuVar = abbdVar.f;
        if (abbuVar != null) {
            abbuVar.g();
            abbdVar.f = null;
            abbdVar.h = null;
        }
        abap abapVar2 = abbdVar.d;
        if (abapVar2 != null) {
            abapVar2.g();
            abbdVar.d = null;
        }
        abbdVar.e = null;
        boolean z = abbdVar.l;
    }

    @Override // defpackage.zkl, defpackage.zki
    public final void k(int i, int i2) {
        float f = i / i2;
        abbd abbdVar = this.h;
        wiz wizVar = abbdVar.p;
        wiz wizVar2 = wiz.d;
        if (wizVar == wizVar2 && abbz.b(f, 3.5555556f, 0.01f)) {
            i2 = (int) Math.floor((((double) i) * 9.0d) / 16.0d);
        } else if (abbdVar.p == wizVar2 && abbz.b(f, 0.8888889f, 0.01f)) {
            i = (int) Math.floor((((double) i2) * 16.0d) / 9.0d);
        }
        super.k(i, i2);
        abbdVar.m = i;
        abbdVar.n = i2;
        abbdVar.g(new ywe(abbdVar, i / i2, 2));
        abbdVar.i(abbdVar.b());
    }

    @Override // defpackage.zki
    public final boolean m() {
        return (this.e == null && this.f == null) ? false : true;
    }

    @Override // defpackage.zkl, defpackage.zlm
    public final SurfaceHolder n() {
        return null;
    }

    @Override // defpackage.zkl, defpackage.zlm
    public final ctl o() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (this.g && this.l) {
                H();
                this.l = false;
            }
        } catch (RuntimeException e) {
            twu.c(6, "onAttachedToWindow", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        if (this.g) {
            this.e = null;
            this.l = true;
            zll zllVar = this.c;
            if (zllVar != null) {
                zllVar.d();
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        boolean zJ = this.h.j();
        View view = this.k;
        if (zJ) {
            p(view, i5, i6);
        } else {
            view.layout(0, 0, i5, i6);
        }
    }

    @Override // defpackage.zkl, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        measureChild(this.k, View.MeasureSpec.makeMeasureSpec(((zkl) this).a, 1073741824), View.MeasureSpec.makeMeasureSpec(this.b, 1073741824));
    }

    @Override // defpackage.zkl
    public final void r() {
        abbu abbuVar;
        if (this.f != null || (abbuVar = this.h.f) == null) {
            return;
        }
        abbuVar.f.j = false;
    }

    @Override // defpackage.zkl
    public final void t() {
        abbu abbuVar = this.h.f;
        if (abbuVar != null) {
            abbuVar.f.j = true;
        }
    }

    @Override // defpackage.zkl, defpackage.zlm
    public final void u(boolean z, byte[] bArr, long j, long j2) {
        abbp abbpVar = this.h.g;
        if (abbpVar != null) {
            abbpVar.l.b(z, bArr, j, j2);
        }
    }

    @Override // defpackage.zkl, defpackage.zlm
    public final void x(zlp zlpVar) {
        abbd abbdVar = this.h;
        abbp abbpVar = abbdVar.g;
        if (abbpVar != null) {
            abbpVar.j(zlpVar);
        }
        abbdVar.i = zlpVar;
    }

    @Override // defpackage.zkl, defpackage.zlm
    public final void y(boolean z, yib yibVar) {
        this.j = z;
        abbd abbdVar = this.h;
        abbe abbeVar = abbdVar.c;
        boolean z2 = abbeVar.b;
        try {
            abbeVar.d(z);
        } catch (abbx e) {
            abbdVar.l(e);
        }
        abbdVar.o = yibVar;
        abbp abbpVar = abbdVar.g;
        if (abbpVar != null) {
            abbe abbeVar2 = abbdVar.c;
            abbpVar.h(abbeVar2.a(), abbeVar2.b(), abbeVar2.a, yibVar);
        }
        if (z2 != z) {
            abbdVar.d();
            abbdVar.e();
        }
    }

    @Override // defpackage.zkl
    protected final boolean z() {
        return this.h.j();
    }
}
