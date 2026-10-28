package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lm {
    public View d;
    public final hhb e;
    public int c = 0;
    public final ll a = new ll();
    public final List b = new ArrayList();

    public lm(hhb hhbVar) {
        this.e = hhbVar;
    }

    private final int m(int i) {
        int i2 = -1;
        if (i >= 0) {
            int iA = this.e.A();
            int i3 = i;
            while (i3 < iA) {
                ll llVar = this.a;
                int iA2 = i - (i3 - llVar.a(i3));
                if (iA2 == 0) {
                    i2 = i3;
                    while (llVar.f(i2)) {
                        i2++;
                    }
                    break;
                }
                i3 += iA2;
            }
        }
        return i2;
    }

    public final int a() {
        return this.e.A() - this.b.size();
    }

    public final int b() {
        return this.e.A();
    }

    final int c(View view) {
        int iB = this.e.B(view);
        if (iB == -1) {
            return -1;
        }
        ll llVar = this.a;
        if (llVar.f(iB)) {
            return -1;
        }
        return iB - llVar.a(iB);
    }

    public final View d(int i) {
        return this.e.C(m(i));
    }

    public final View e(int i) {
        return this.e.C(i);
    }

    public final void f(View view, int i, boolean z) {
        int iA = i < 0 ? this.e.A() : m(i);
        this.a.c(iA, z);
        if (z) {
            i(view);
        }
        RecyclerView recyclerView = (RecyclerView) this.e.a;
        recyclerView.addView(view, iA);
        oh ohVar = view == null ? null : ((nq) view.getLayoutParams()).c;
        nh nhVar = recyclerView.m;
        if (nhVar != null && ohVar != null) {
            nhVar.q(ohVar);
        }
        List list = recyclerView.x;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((nr) recyclerView.x.get(size)).hO(view);
            }
        }
    }

    public final void g(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iA = i < 0 ? this.e.A() : m(i);
        this.a.c(iA, z);
        if (z) {
            i(view);
        }
        hhb hhbVar = this.e;
        int i2 = RecyclerView.ad;
        oh ohVar = view == null ? null : ((nq) view.getLayoutParams()).c;
        if (ohVar != null) {
            if (!ohVar.x() && !ohVar.A()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + ohVar + ((RecyclerView) hhbVar.a).o());
            }
            ohVar.j();
        }
        ((RecyclerView) hhbVar.a).attachViewToParent(view, iA, layoutParams);
    }

    final void h(int i) {
        ll llVar = this.a;
        int iM = m(i);
        llVar.g(iM);
        hhb hhbVar = this.e;
        View viewC = hhbVar.C(iM);
        if (viewC != null) {
            int i2 = RecyclerView.ad;
            oh ohVar = ((nq) viewC.getLayoutParams()).c;
            if (ohVar != null) {
                if (ohVar.x() && !ohVar.A()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + ohVar + ((RecyclerView) hhbVar.a).o());
                }
                ohVar.f(SemanticState.Hidden);
            }
        } else {
            int i3 = RecyclerView.ad;
        }
        ((RecyclerView) hhbVar.a).detachViewFromParent(iM);
    }

    public final void i(View view) {
        this.b.add(view);
        int i = RecyclerView.ad;
        oh ohVar = view == null ? null : ((nq) view.getLayoutParams()).c;
        if (ohVar != null) {
            hhb hhbVar = this.e;
            int i2 = ohVar.p;
            if (i2 != -1) {
                ohVar.o = i2;
            } else {
                ohVar.o = ohVar.a.getImportantForAccessibility();
            }
            ((RecyclerView) hhbVar.a).ay(ohVar, 4);
        }
    }

    final void j(int i) {
        int i2 = this.c;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iM = m(i);
            hhb hhbVar = this.e;
            View viewC = hhbVar.C(iM);
            if (viewC != null) {
                this.c = 1;
                this.d = viewC;
                if (this.a.g(iM)) {
                    l(viewC);
                }
                hhbVar.E(iM);
            }
        } finally {
            this.c = 0;
            this.d = null;
        }
    }

    public final boolean k(View view) {
        return this.b.contains(view);
    }

    public final void l(View view) {
        if (this.b.remove(view)) {
            this.e.D(view);
        }
    }

    public final String toString() {
        return this.a.toString() + ", hidden list:" + this.b.size();
    }
}
