package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ogh extends ofk {
    public long g;
    public long h;
    public long i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final List m;
    public double n;
    public int o;
    public int p;
    public boolean q;
    public final boolean r;
    public final ofv s;
    public int t;
    public int u;
    public int v;
    private WeakReference w;
    private int x;
    private final ogl[] y;

    public ogh(ofv ofvVar, ofe ofeVar) {
        super(new ogl(ofeVar.f));
        this.u = 1;
        this.v = 1;
        this.i = -1L;
        this.x = 1;
        this.y = new ogl[4];
        this.m = new ArrayList();
        this.s = ofvVar;
        this.t = true == ofeVar.a ? 2 : 1;
        this.r = ofeVar.e;
    }

    @Override // defpackage.ofk
    public final int a() {
        if (m() != null) {
            return m().getHeight();
        }
        return 0;
    }

    @Override // defpackage.ofk
    public final int b() {
        if (m() != null) {
            return m().getWidth();
        }
        return 0;
    }

    @Override // defpackage.ofk
    public final Rect c() {
        Rect rect = new Rect();
        View viewM = m();
        if (viewM != null && viewM.isAttachedToWindow()) {
            viewM.getLocalVisibleRect(rect);
        }
        return rect;
    }

    @Override // defpackage.ofk
    public final DisplayMetrics d() {
        View viewM = m();
        if (viewM != null) {
            return viewM.getContext().getResources().getDisplayMetrics();
        }
        return null;
    }

    @Override // defpackage.ofk
    public final Pair e() {
        if (m() == null) {
            return null;
        }
        int[] iArr = new int[2];
        m().getLocationInWindow(iArr);
        return new Pair(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }

    @Override // defpackage.ofk
    public final boolean g() {
        return (m() == null || m().getDisplay() == null) ? false : true;
    }

    @Override // defpackage.ofk
    public final boolean h() {
        return m() != null && m().hasWindowFocus();
    }

    @Override // defpackage.ofk
    public final boolean i() {
        return m() != null;
    }

    @Override // defpackage.ofk
    public final boolean j(Activity activity) {
        return a.t(m()) == activity;
    }

    @Override // defpackage.ofk
    public final boolean k() {
        View viewM = m();
        if (viewM == null) {
            return false;
        }
        while (viewM != null) {
            if (viewM.getVisibility() != 0) {
                return false;
            }
            viewM = viewM.getParent() instanceof View ? (View) viewM.getParent() : null;
        }
        return true;
    }

    @Override // defpackage.ofk
    public final DisplayMetrics l(oml omlVar) {
        if (m() == null) {
            return null;
        }
        int i = ogd.d;
        Object obj = omlVar.a;
        Display display = m().getDisplay();
        if (display == null) {
            return null;
        }
        ogd ogdVar = (ogd) obj;
        HashMap map = ogdVar.a;
        Integer numValueOf = Integer.valueOf(display.getDisplayId());
        return map.containsKey(numValueOf) ? (DisplayMetrics) map.get(numValueOf) : ogdVar.a(display);
    }

    public final View m() {
        return (View) this.w.get();
    }

    public final ofg n(ogj ogjVar) {
        return this.s.d(ogjVar, this);
    }

    public final ogl o() {
        int i = this.x - 1;
        ogl[] oglVarArr = this.y;
        if (oglVarArr[i] == null) {
            oglVarArr[i] = new ogl(false);
        }
        return oglVarArr[this.x - 1];
    }

    final void p(ofo ofoVar) {
        this.s.b(ofoVar, this);
    }

    final void q() {
        this.s.c(this);
    }

    public final void r(ogj ogjVar) {
        this.s.b.add(ogjVar);
    }

    public final void s(ogj ogjVar) {
        int i = ogjVar.w;
        if (i >= 0) {
            List list = this.m;
            for (int size = list.size(); size <= i; size++) {
                list.add(ogg.a().a());
            }
            ofl oflVar = this.f;
            if (oflVar != null) {
                ogl oglVarO = o();
                ogf ogfVarA = ogg.a();
                double d = oflVar.a;
                ogfVarA.b(d);
                ogfVarA.k(this.n);
                double d2 = oflVar.b;
                ogfVarA.j(d2);
                ogfVarA.a = oflVar.c;
                ogfVarA.b = oflVar.d;
                ogfVarA.c = Integer.valueOf(((ogl) this.e).w.H());
                if (ogjVar.equals(ogj.START)) {
                    ogfVarA.f(d);
                    ogfVarA.c(d);
                    ogfVarA.h(this.n);
                    ogfVarA.e(this.n);
                    ogfVarA.g(d2);
                    ogfVarA.d(d2);
                } else {
                    ogfVarA.f(oglVarO.a);
                    ogfVarA.c(oglVarO.b);
                    ogfVarA.h(oglVarO.i);
                    ogfVarA.e(oglVarO.j);
                    ogfVarA.g(oglVarO.c);
                    ogfVarA.d(oglVarO.d);
                    ogfVarA.i(agke.p(oglVarO.c(false)));
                }
                list.set(i, ogfVarA.a());
            }
        }
    }

    public final void t(View view) {
        this.w = new WeakReference(view);
    }

    public final void u(int i) {
        if (i <= 0 || i > 4) {
            return;
        }
        this.x = i;
    }

    public final void v() {
        this.k = true;
    }

    public final void w(int i) {
        int i2 = this.v;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i - 1 > i3) {
            this.v = i;
        }
    }

    public final void x(int i) {
        int i2 = this.u;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i - 1 > i3) {
            this.u = i;
        }
    }
}
