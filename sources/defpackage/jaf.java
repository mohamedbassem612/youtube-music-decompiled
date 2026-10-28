package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jaf {
    public advn a;
    public int b;
    private adxd c;
    private RecyclerView d;
    private np e;
    private advn f;
    private wnf g;
    private advd h;
    private admk i;
    private xgn j;
    private adtq k;
    private adww l;
    private ViewGroup m;
    private jau n;
    private adwj o;
    private ExtendedFloatingActionButton p;
    private aeod q;
    private vwt r;

    public final jaw a() {
        int i = ~this.b;
        if ((i & 3682) == 0) {
            return new jaw(this.c, this.d, this.e, this.f, this.a, this.q, this.r, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, i & 258461);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.b & 2) == 0) {
            sb.append(" view");
        }
        if ((this.b & 32) == 0) {
            sb.append(" sectionListLayoutControllerFactory");
        }
        if ((this.b & 64) == 0) {
            sb.append(" rxLifecycle");
        }
        if ((this.b & SemanticState.LiveRegion) == 0) {
            sb.append(" uiControllerFactory");
        }
        if ((this.b & SemanticState.ReadOnly) == 0) {
            sb.append(" viewPool");
        }
        if ((this.b & SemanticState.Modal) == 0) {
            sb.append(" interactionLogger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(adtq adtqVar) {
        this.k = adtqVar;
        this.b |= SemanticState.Obscured;
    }

    public final void c(ExtendedFloatingActionButton extendedFloatingActionButton) {
        this.p = extendedFloatingActionButton;
        this.b |= 131072;
    }

    public final void d(ViewGroup viewGroup) {
        this.m = viewGroup;
        this.b |= 16384;
    }

    public final void e(xgn xgnVar) {
        if (xgnVar == null) {
            throw new NullPointerException("Null interactionLogger");
        }
        this.j = xgnVar;
        this.b |= SemanticState.Modal;
    }

    public final void f(np npVar) {
        if (npVar == null) {
            throw new NullPointerException("Null layoutManager");
        }
        this.e = npVar;
        this.b |= 4;
    }

    public final void g(advn advnVar) {
        this.f = advnVar;
        this.b |= 8;
    }

    public final void h(adwj adwjVar) {
        if (adwjVar == null) {
            throw new NullPointerException("Null refreshUiController");
        }
        this.o = adwjVar;
        this.b |= 65536;
    }

    public final void i(adww adwwVar) {
        if (adwwVar == null) {
            throw new NullPointerException("Null sectionListRefresher");
        }
        this.l = adwwVar;
        this.b |= SemanticState.Multiline;
    }

    public final void j(wnf wnfVar) {
        if (wnfVar == null) {
            throw new NullPointerException("Null service");
        }
        this.g = wnfVar;
        this.b |= SemanticState.Hidden;
    }

    public final void k(jau jauVar) {
        this.n = jauVar;
        this.b |= 32768;
    }

    public final void l(advd advdVar) {
        if (advdVar == null) {
            throw new NullPointerException("Null uiControllerFactory");
        }
        this.h = advdVar;
        this.b |= SemanticState.LiveRegion;
    }

    public final void m(admk admkVar) {
        if (admkVar == null) {
            throw new NullPointerException("Null viewPool");
        }
        this.i = admkVar;
        this.b |= SemanticState.ReadOnly;
    }

    public final void n(adxd adxdVar) {
        this.c = adxdVar;
        this.b |= 1;
    }

    public final void o(RecyclerView recyclerView) {
        if (recyclerView == null) {
            throw new NullPointerException("Null view");
        }
        this.d = recyclerView;
        this.b |= 2;
    }

    public final void p(aeod aeodVar) {
        if (aeodVar == null) {
            throw new NullPointerException("Null sectionListLayoutControllerFactory");
        }
        this.q = aeodVar;
        this.b |= 32;
    }

    public final void q(vwt vwtVar) {
        if (vwtVar == null) {
            throw new NullPointerException("Null rxLifecycle");
        }
        this.r = vwtVar;
        this.b |= 64;
    }
}
