package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbn {
    public static final bbn a;
    public final bbk b;

    static {
        if (Build.VERSION.SDK_INT >= 34) {
            a = bbi.h;
        } else if (Build.VERSION.SDK_INT >= 30) {
            a = bbg.g;
        } else {
            a = bbk.i;
        }
    }

    public bbn(bbn bbnVar) {
        if (bbnVar == null) {
            this.b = new bbk(this);
            return;
        }
        bbk bbkVar = bbnVar.b;
        if (Build.VERSION.SDK_INT >= 35 && (bbkVar instanceof bbj)) {
            this.b = new bbj(this, (bbj) bbkVar);
        } else if (Build.VERSION.SDK_INT >= 34 && (bbkVar instanceof bbi)) {
            this.b = new bbi(this, (bbi) bbkVar);
        } else if (Build.VERSION.SDK_INT >= 31 && (bbkVar instanceof bbh)) {
            this.b = new bbh(this, (bbh) bbkVar);
        } else if (Build.VERSION.SDK_INT >= 30 && (bbkVar instanceof bbg)) {
            this.b = new bbg(this, (bbg) bbkVar);
        } else if (Build.VERSION.SDK_INT >= 29 && (bbkVar instanceof bbf)) {
            this.b = new bbf(this, (bbf) bbkVar);
        } else if (Build.VERSION.SDK_INT >= 28 && (bbkVar instanceof bbe)) {
            this.b = new bbe(this, (bbe) bbkVar);
        } else if (bbkVar instanceof bbd) {
            this.b = new bbd(this, (bbd) bbkVar);
        } else if (bbkVar instanceof bbc) {
            this.b = new bbc(this, (bbc) bbkVar);
        } else {
            this.b = new bbk(this);
        }
        bbkVar.i(this);
    }

    static avw i(avw avwVar, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, avwVar.b - i);
        int iMax2 = Math.max(0, avwVar.c - i2);
        int iMax3 = Math.max(0, avwVar.d - i3);
        int iMax4 = Math.max(0, avwVar.e - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? avwVar : avw.d(iMax, iMax2, iMax3, iMax4);
    }

    public static bbn o(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        bbn bbnVar = new bbn(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i = bac.a;
            bbnVar.s(azt.a(view));
            bbnVar.p(view.getRootView());
            bbnVar.t(view.getWindowSystemUiVisibility());
        }
        return bbnVar;
    }

    @Deprecated
    public final int a() {
        return this.b.d().e;
    }

    @Deprecated
    public final int b() {
        return this.b.d().b;
    }

    @Deprecated
    public final int c() {
        return this.b.d().d;
    }

    @Deprecated
    public final int d() {
        return this.b.d().c;
    }

    public final WindowInsets e() {
        bbk bbkVar = this.b;
        if (bbkVar instanceof bbc) {
            return ((bbc) bbkVar).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bbn) {
            return Objects.equals(this.b, ((bbn) obj).b);
        }
        return false;
    }

    public final avw f(int i) {
        return this.b.a(i);
    }

    public final avw g(int i) {
        return this.b.c(i);
    }

    @Deprecated
    public final avw h() {
        return this.b.w();
    }

    public final int hashCode() {
        bbk bbkVar = this.b;
        if (bbkVar == null) {
            return 0;
        }
        return bbkVar.hashCode();
    }

    public final ayi j() {
        return this.b.B();
    }

    @Deprecated
    public final bbn k() {
        return this.b.C();
    }

    @Deprecated
    public final bbn l() {
        return this.b.x();
    }

    @Deprecated
    public final bbn m() {
        return this.b.y();
    }

    public final bbn n(int i, int i2, int i3, int i4) {
        return this.b.e(i, i2, i3, i4);
    }

    final void p(View view) {
        bbk bbkVar = this.b;
        bbkVar.h(view);
        bbkVar.j(view);
        bbkVar.k();
    }

    final void q(ayk aykVar) {
        this.b.l(aykVar);
    }

    final void r(avw[] avwVarArr) {
        this.b.m(avwVarArr);
    }

    final void s(bbn bbnVar) {
        this.b.o(bbnVar);
    }

    final void t(int i) {
        this.b.p(i);
    }

    final void u(Rect[][] rectArr) {
        this.b.q(rectArr);
    }

    final void v(Rect[][] rectArr) {
        this.b.r(rectArr);
    }

    public final boolean w() {
        return this.b.A();
    }

    public final boolean x() {
        return this.b.u(8);
    }

    public bbn(WindowInsets windowInsets) {
        bbk bbfVar;
        if (Build.VERSION.SDK_INT >= 35) {
            this.b = new bbj(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            this.b = new bbi(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            this.b = new bbh(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            bbfVar = new bbg(this, windowInsets);
        } else {
            bbfVar = Build.VERSION.SDK_INT >= 29 ? new bbf(this, windowInsets) : Build.VERSION.SDK_INT >= 28 ? new bbe(this, windowInsets) : new bbd(this, windowInsets);
        }
        this.b = bbfVar;
    }
}
