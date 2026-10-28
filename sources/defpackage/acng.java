package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.libraries.youtube.reel.internal.pager.ReelRecyclerView;
import com.google.android.libraries.youtube.reel.internal.player.ReelPlayerView;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acng {
    public final aunn a;
    public final acqz b;
    public boolean d;
    ReelPlayerView i;
    ReelRecyclerView j;
    public final adif n;
    public final hno o;
    vwt p;
    private final aunn q;
    private final acvf r;
    public avlh c = avlh.G(Boolean.FALSE);
    public boolean e = false;
    public int f = 0;
    public final awku g = awku.aC(0);
    nr h = null;
    public vtl k = null;
    public boolean l = false;
    public ViewTreeObserver.OnGlobalLayoutListener m = null;

    public acng(hno hnoVar, adif adifVar, aunn aunnVar, aunn aunnVar2, acqz acqzVar, acvf acvfVar) {
        this.o = hnoVar;
        this.n = adifVar;
        this.a = aunnVar;
        this.q = aunnVar2;
        this.b = acqzVar;
        this.r = acvfVar;
    }

    private final int m() {
        ReelRecyclerView reelRecyclerView = this.j;
        if (reelRecyclerView != null) {
            return reelRecyclerView.getHeight();
        }
        return 0;
    }

    private final void n(Callable callable) {
        if (this.p != null) {
            aizx aizxVar = ((vyo) this.o.d).b().o;
            if (aizxVar == null) {
                aizxVar = aizx.a;
            }
            boolean z = aizxVar.cr;
            vwt vwtVar = this.p;
            if (z) {
                vwtVar.F(callable);
            } else {
                vwtVar.E(callable);
            }
        }
    }

    public final acrp a() {
        return acmo.b(this.b.j());
    }

    public final void b(int i) {
        ViewGroup viewGroup;
        ReelPlayerView reelPlayerView = this.i;
        if (reelPlayerView != null) {
            reelPlayerView.k = i > 0;
            tym.h(reelPlayerView, new tyi(i, 1), ViewGroup.MarginLayoutParams.class);
            acrp acrpVarA = a();
            if (acrpVarA == null || (viewGroup = acrpVarA.u) == null) {
                return;
            }
            tym.h(viewGroup, new tyi(i, 1), ViewGroup.MarginLayoutParams.class);
        }
    }

    public final void c(int i) {
        ReelPlayerView reelPlayerView = this.i;
        if (reelPlayerView != null) {
            tym.h(reelPlayerView, new tyj(i == 0 ? 1 : 0, 1, null), FrameLayout.LayoutParams.class);
            tym.h(this.i, new tyi(i, 0), ViewGroup.MarginLayoutParams.class);
            this.f = i;
            f(a());
            boolean zK = k();
            if (zK || this.n.b(this.i.getContext())) {
                this.r.an();
            }
            if (this.o.aA()) {
                awku awkuVar = this.g;
                if (true != zK) {
                    i = 0;
                }
                awkuVar.kk(Integer.valueOf(i));
            }
        }
    }

    public final void d(int i) {
        ViewGroup viewGroup;
        ReelPlayerView reelPlayerView = this.i;
        if (reelPlayerView != null) {
            reelPlayerView.k = i > 0;
            tym.h(reelPlayerView, new tyj(i, 2), ViewGroup.MarginLayoutParams.class);
            acrp acrpVarA = a();
            if (acrpVarA == null || (viewGroup = acrpVarA.u) == null) {
                return;
            }
            tym.h(viewGroup, new tyj(i, 2), ViewGroup.MarginLayoutParams.class);
        }
    }

    final void e(int i) {
        RelativeLayout relativeLayout = ((vor) this.a.io()).i;
        if (relativeLayout != null) {
            int width = relativeLayout.getWidth();
            d((int) ((((double) Math.max(width - i, 0)) / ((double) width)) * ((double) this.r.q())));
        }
    }

    public final void f(acrp acrpVar) {
        View view;
        if (acrpVar != null) {
            ViewGroup viewGroup = acrpVar.u;
            if (viewGroup != null) {
                tym.h(viewGroup, new tyi(this.f, 0), ViewGroup.MarginLayoutParams.class);
            }
            ReelPlayerView reelPlayerView = this.i;
            if (reelPlayerView == null || !this.n.b(reelPlayerView.getContext()) || (view = acrpVar.v) == null) {
                return;
            }
            acoq acoqVar = (acoq) this.q.io();
            int i = this.f;
            String str = acoqVar.d;
            boolean zA = str != null ? acoqVar.h.a(acoqVar.a, str) : false;
            int i2 = true != zA ? 0 : i;
            tym.h(view, new tyj((!zA || i == 0) ? 1 : 0, 1, null), FrameLayout.LayoutParams.class);
            tym.h(view, new tyi(i2, 0), ViewGroup.MarginLayoutParams.class);
        }
    }

    public final void g() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        ReelRecyclerView reelRecyclerView = this.j;
        if (reelRecyclerView != null) {
            ViewTreeObserver viewTreeObserver = reelRecyclerView.getViewTreeObserver();
            if (!viewTreeObserver.isAlive() || (onGlobalLayoutListener = this.m) == null) {
                return;
            }
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            this.m = null;
        }
    }

    public final void h(int i) {
        RelativeLayout relativeLayout = ((vor) this.a.io()).i;
        if (relativeLayout != null) {
            c(Math.max(relativeLayout.getWidth() - i, 0));
        }
    }

    public final void i(int i) {
        int iMax = (!this.o.aQ() || this.d) ? Math.max(m() - i, 0) : Math.max((m() - i) - this.r.q(), 0);
        if (((vor) this.a.io()).I()) {
            d(Math.max(this.r.q() - i, 0));
        }
        if (i > 0) {
            b(iMax);
        }
    }

    public final void j() {
        if (this.j != null) {
            g();
            nr nrVar = this.h;
            if (nrVar != null) {
                this.j.Y(nrVar);
                this.h = null;
            }
        }
        this.k = null;
        this.l = false;
        this.g.kk(0);
        if (this.o.X()) {
            this.j = null;
            this.i = null;
            this.p = null;
        }
    }

    public final boolean k() {
        if (this.i == null) {
            return false;
        }
        vob vobVarD = ((vor) this.a.io()).d();
        String strW = vobVarD != null ? vobVarD.w() : null;
        return strW != null && this.n.a(this.i.getContext(), strW);
    }

    public final void l(ReelPlayerView reelPlayerView, ReelRecyclerView reelRecyclerView, vwt vwtVar) {
        ReelRecyclerView reelRecyclerView2;
        this.i = reelPlayerView;
        this.j = reelRecyclerView;
        this.p = vwtVar;
        aunn aunnVar = this.a;
        Object obj = ((vor) aunnVar.io()).w.c;
        avlh avlhVar = ((vor) aunnVar.io()).d.i;
        avrp avrpVar = new avrp(((avlh) obj).U(agdf.a));
        avnn avnnVar = atqp.j;
        int i = 2;
        this.c = avlh.f(avrpVar, avlhVar, new abiw(i)).p();
        int i2 = 0;
        if (this.p != null) {
            hno hnoVar = this.o;
            if (hnoVar.aN()) {
                if (!hnoVar.aM()) {
                    this.p.D(new acnd(this, i2));
                }
                n(new acnd(this, i));
            } else if (hnoVar.aK()) {
                n(new acnd(this, 3));
            } else {
                n(new acnd(this, 4));
            }
            ReelPlayerView reelPlayerView2 = this.i;
            if (reelPlayerView2 != null && this.n.b(reelPlayerView2.getContext())) {
                n(new acnd(this, 5));
                n(new acnd(this, 6));
            }
        }
        if (!this.n.b(reelPlayerView.getContext()) || (reelRecyclerView2 = this.j) == null) {
            return;
        }
        nr nrVar = this.h;
        if (nrVar != null) {
            reelRecyclerView2.Y(nrVar);
        }
        acne acneVar = new acne(this, 0);
        this.h = acneVar;
        this.j.v(acneVar);
    }
}
