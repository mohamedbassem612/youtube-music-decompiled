package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vog implements tuv {
    public FrameLayout a;
    public ViewGroup b;
    public View c;
    public tuu d;
    public tuu e;
    public tuu f;
    public tuu g;
    public tuu h;
    public int i;
    public Optional j;
    public Optional k;
    public boolean l;
    public tss n;
    public tss o;
    public tss p;
    public tss q;
    private final vxz s;
    private final Set r = new HashSet();
    public final awku m = new awku(Boolean.FALSE);

    public vog(vxz vxzVar) {
        this.s = vxzVar;
    }

    public static float b(View view, float f) {
        int i = bac.a;
        return view.getLayoutDirection() == 1 ? -f : f;
    }

    private final void l(boolean z) {
        tuk.l(this.c, !z);
    }

    private final void m(vot votVar) {
        ((FrameLayout) this.o.a).removeAllViews();
        this.j = Optional.ofNullable(votVar);
        if (votVar != null) {
            ViewGroup viewGroup = (ViewGroup) this.n.a;
            vob vobVar = votVar.b;
            vpo.a(viewGroup, vobVar.T());
            vpo.b((ViewGroup) this.o.a, vobVar.c());
        }
    }

    private final void n(vot votVar) {
        ((FrameLayout) this.q.a).removeAllViews();
        this.k = Optional.ofNullable(votVar);
        if (votVar != null) {
            ViewGroup viewGroup = (ViewGroup) this.p.a;
            vob vobVar = votVar.b;
            vpo.a(viewGroup, vobVar.T());
            vpo.b((ViewGroup) this.q.a, vobVar.c());
        }
    }

    private final void o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            this.n.g(this.h);
            this.o.g(this.h);
            return;
        }
        tss tssVar = this.n;
        if (i2 != 1) {
            tssVar.g(this.d);
            this.o.g(this.e);
        } else {
            tssVar.g(this.g);
            this.o.g(this.g);
            this.b.setTranslationZ(this.i);
        }
    }

    @Override // defpackage.tuv
    public final void a(int i, tss tssVar) {
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            ((tuv) it.next()).a(i, tssVar);
        }
        if (i == 0) {
            if (this.s.l(15, 45400573L, false)) {
                ((FrameLayout) this.o.a).removeAllViews();
            }
            this.b.setTranslationZ(0.0f);
            this.m.kk(Boolean.FALSE);
            l(true);
            return;
        }
        if (i != 2) {
            this.m.kk(Boolean.TRUE);
            l(false);
            return;
        }
        this.q.h(false, false);
        if (this.s.l(15, 45400573L, false)) {
            ((FrameLayout) this.q.a).removeAllViews();
        }
        this.b.setTranslationZ(0.0f);
        this.m.kk(Boolean.FALSE);
        l(true);
    }

    public final Optional c(vot votVar) {
        Optional optional = this.j;
        if (optional != null && votVar.equals(optional.orElse(null))) {
            return Optional.of((ViewGroup) this.n.a);
        }
        Optional optional2 = this.k;
        return (optional2 == null || !votVar.equals(optional2.orElse(null))) ? Optional.empty() : Optional.of((ViewGroup) this.p.a);
    }

    public final void d() {
        if (this.n != null) {
            this.o.f(this);
            ((LinearLayout) this.n.a).animate().cancel();
            ((FrameLayout) this.o.a).animate().cancel();
            ((LinearLayout) this.p.a).animate().cancel();
            m(null);
            n(null);
            l(true);
            this.m.kk(Boolean.FALSE);
        }
    }

    public final void e() {
        if (this.o.b()) {
            g(false);
        } else {
            f(false);
        }
    }

    public final void f(boolean z) {
        if (z) {
            this.p.h(false, false);
            this.n.h(true, false);
            this.o.f(this);
            this.o.h(true, false);
            this.o.d(this);
        }
        this.p.h(true, z);
        this.q.h(true, false);
        this.n.h(false, z);
        this.o.h(false, z);
    }

    public final void g(boolean z) {
        if (z) {
            this.p.h(true, false);
            this.q.h(true, false);
            this.n.h(false, false);
            this.o.f(this);
            this.o.h(false, false);
            this.o.d(this);
        }
        this.p.h(false, z);
        this.n.h(true, z);
        this.o.h(true, z);
    }

    public final void h(vot votVar) {
        FrameLayout frameLayout = (FrameLayout) this.q.a;
        vob vobVar = votVar.b;
        if (frameLayout.indexOfChild(vobVar.c()) >= 0) {
            i();
        } else if (((FrameLayout) this.o.a).indexOfChild(vobVar.c()) < 0) {
            m(votVar);
        }
        g(false);
    }

    public final void i() {
        this.a.bringChildToFront(this.p.a);
        this.b.bringChildToFront(this.q.a);
        tss tssVar = this.n;
        tss tssVar2 = this.p;
        this.n = tssVar2;
        this.p = tssVar;
        tss tssVar3 = this.o;
        this.o = this.q;
        this.q = tssVar3;
        tssVar2.g(this.d);
        this.p.g(this.f);
        this.q.f(this);
        this.o.d(this);
    }

    public final void j(vot votVar, vot votVar2, int i) {
        FrameLayout frameLayout = (FrameLayout) this.q.a;
        vob vobVar = votVar.b;
        if (frameLayout.indexOfChild(vobVar.c()) >= 0) {
            i();
        } else if (((FrameLayout) this.o.a).indexOfChild(vobVar.c()) < 0) {
            m(votVar);
        }
        if (((FrameLayout) this.q.a).indexOfChild(votVar2.b.c()) < 0) {
            n(votVar2);
        }
        o(i);
        f(this.l);
    }

    public final void k(vot votVar, vot votVar2, int i) {
        FrameLayout frameLayout = (FrameLayout) this.o.a;
        vob vobVar = votVar.b;
        if (frameLayout.indexOfChild(vobVar.c()) >= 0) {
            i();
        } else if (((FrameLayout) this.q.a).indexOfChild(vobVar.c()) < 0) {
            n(votVar);
        }
        m(votVar2);
        o(i);
        g(this.l);
    }
}
