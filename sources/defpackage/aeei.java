package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeei {
    private float A;
    private final qa B;
    public final RecyclerView a;
    public final nh b;
    public final ViewGroup c;
    public final aeea d;
    public final nt e;
    public final float f;
    public final aeeh g;
    public final boolean h;
    public View i;
    public long j;
    public boolean k;
    public View l;
    public float m;
    public int n;
    public int o;
    public Runnable p;
    public boolean q;
    public boolean r;
    public final vxz s;
    public final qa t;
    public qa u;
    private final nr v;
    private float w;
    private View x;
    private boolean y;
    private float z;

    public aeei(ViewGroup viewGroup, RecyclerView recyclerView, nh nhVar, vxz vxzVar) {
        this.b = nhVar;
        this.c = viewGroup;
        this.a = recyclerView;
        this.s = vxzVar;
        this.h = vxzVar.l(207, 45807449L, false);
        this.f = vxzVar.l(145, 45712196L, false) ? recyclerView.getContext().getResources().getDimension(R.dimen.compact_collapsible_metadata_expansion_start) : vxzVar.l(131, 45687965L, false) ? recyclerView.getContext().getResources().getDimension(R.dimen.collapsible_metadata_expansion_start) : recyclerView.getContext().getResources().getDimension(R.dimen.expansion_start);
        aeec aeecVar = new aeec(this);
        this.B = aeecVar;
        nhVar.x(aeecVar);
        this.e = new aeed(this, 0);
        this.t = new aeee(this);
        this.g = new aeeh(recyclerView.getContext());
        aeea aeeaVar = new aeea(nhVar);
        this.d = aeeaVar;
        aeeaVar.d = new avgj(this, null);
        aeeaVar.t();
        if (!vxzVar.l(248, 45835904L, false)) {
            this.v = null;
            return;
        }
        acne acneVar = new acne(this, 2);
        this.v = acneVar;
        recyclerView.v(acneVar);
    }

    private final int l() {
        return j() ? 4 : 8;
    }

    private final void m() {
        if (this.y) {
            return;
        }
        this.a.ae(new aeeb());
        this.y = true;
    }

    private final void n() {
        View view = this.i;
        if (view != null) {
            view.setVisibility(8);
            this.c.post(new aead(this, this.i, 6, null));
            this.i = null;
            this.j = 0L;
        }
    }

    private final void o(np npVar) {
        if (npVar instanceof FlowLayoutManager) {
            q();
        }
    }

    private final void p() {
        if (this.y) {
            this.a.ae(null);
            this.y = false;
        }
    }

    private final void q() {
        View view = this.x;
        if (view != null) {
            view.setAlpha(this.w);
            this.x.setVisibility(this.w == 0.0f ? l() : 0);
            this.x = null;
        }
    }

    public final float a(int i, View view, float f) {
        float fMax;
        if (aedi.c(i, 64) && this.q && this.A < view.getTop()) {
            float f2 = this.z;
            if (f2 <= 0.0f) {
                return 1.0f;
            }
            fMax = Math.max(0.0f, Math.min(1.0f, this.A / f2));
        } else {
            fMax = Math.max(0.0f, Math.min(1.0f, view.getTop() / f));
        }
        return 1.0f - fMax;
    }

    public final View b(np npVar) {
        aeea aeeaVar;
        int i;
        if (npVar == null || ((i = (aeeaVar = this.d).b) != -1 ? i >= aeeaVar.a.size() - 1 : !aeeaVar.v())) {
            return null;
        }
        return npVar.findViewByPosition(aeeaVar.r());
    }

    public final void c(int i, View view, float f) {
        if (aedi.c(i, 16)) {
            q();
            if (this.s.l(248, 45835904L, false)) {
                this.w = view.getAlpha();
                this.x = view;
                view.setAlpha(f);
                view.setVisibility(f <= 0.0f ? l() : 0);
            } else {
                this.w = view.getAlpha();
                this.x = view;
                view.setAlpha(f);
                float f2 = this.w;
                if (f2 == 0.0f && f > 0.0f) {
                    view.setVisibility(0);
                } else if (f2 > 0.0f && f == 0.0f) {
                    view.setVisibility(l());
                }
            }
        }
        if (aedi.e(i)) {
            if (f > 0.0f) {
                m();
            } else {
                p();
            }
        }
    }

    public final void d() {
        boolean z = this.q;
        boolean zI = i();
        this.q = zI;
        if (zI) {
            RecyclerView recyclerView = this.a;
            np npVar = recyclerView.n;
            View viewFindViewByPosition = npVar == null ? null : npVar.findViewByPosition(npVar.getItemCount() - 1);
            if (viewFindViewByPosition != null) {
                float bottom = viewFindViewByPosition.getBottom() - recyclerView.getHeight();
                this.A = bottom;
                if (z) {
                    return;
                }
                this.z = bottom;
                return;
            }
        }
        this.q = false;
    }

    public final void e() {
        g();
        RecyclerView recyclerView = this.a;
        recyclerView.Z(this.e);
        this.b.y(this.B);
        nr nrVar = this.v;
        if (nrVar != null) {
            recyclerView.Y(nrVar);
        }
    }

    public final void f() {
        qa qaVar = this.u;
        if (qaVar != null) {
            RecyclerView recyclerView = this.a;
            recyclerView.aH(qaVar);
            recyclerView.Z(this.e);
            this.u = null;
        }
    }

    public final void g() {
        if (this.i != null) {
            n();
        }
        RecyclerView recyclerView = this.a;
        recyclerView.aE(this.t);
        this.d.u();
        if (this.u != null) {
            recyclerView.post(new acqu(this, 17));
        }
        q();
        p();
        this.l = null;
        this.p = null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:69:0x010c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0126  */
    /* JADX WARN: Code duplicated, block: B:74:0x012c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0130  */
    public final void h() {
        int iC;
        boolean z;
        List list;
        int iMin;
        int iO;
        int i;
        int i2;
        View view;
        int iQ;
        View viewB;
        View viewFindViewByPosition;
        d();
        RecyclerView recyclerView = this.a;
        np npVar = recyclerView.n;
        aeea aeeaVar = this.d;
        long jS = aeeaVar.s();
        np npVar2 = recyclerView.n;
        if (npVar2 instanceof GridLayoutManager) {
            iC = ((GridLayoutManager) npVar2).findFirstVisibleItemPosition();
        } else if (npVar2 instanceof LinearLayoutManager) {
            iC = ((LinearLayoutManager) npVar2).findFirstVisibleItemPosition();
        } else if (npVar2 instanceof FlowLayoutManager) {
            iC = ((FlowLayoutManager) npVar2).c();
        } else {
            Log.w("StickyHeaders", "A LinearLayoutManager or FlowLayoutManager is required for sticky headers to work");
            iC = 0;
        }
        vxz vxzVar = this.s;
        if (vxzVar.l(214, 45816306L, false)) {
            if (iC != 0) {
                z = false;
            } else if (npVar == null || (viewFindViewByPosition = npVar.findViewByPosition(0)) == null || viewFindViewByPosition.getTop() >= 0) {
                iC = 0;
                z = false;
            } else {
                iC = 0;
                z = true;
            }
            k();
        } else {
            z = false;
        }
        int i3 = aeeaVar.c;
        if (iC != i3) {
            aeeaVar.c = iC;
            int iM = aeeaVar.m(iC);
            list = aeeaVar.a;
            iMin = Math.min(iM, list.size() - 1);
            if (iMin < 0) {
                if (((aedz) list.get(iMin)).b <= iC || (iC == 0 && !z)) {
                    if (iMin > 0) {
                        iMin--;
                    } else {
                        iMin = -1;
                    }
                }
                if (iMin != aeeaVar.b) {
                    aeeaVar.b = iMin;
                } else if (i3 == -1) {
                }
                q();
                if (this.u != null) {
                    recyclerView.post(new acqu(this, 17));
                }
                iO = aeeaVar.o();
                if (aedi.d(iO)) {
                    if (this.i != null) {
                        if (jS != Long.MAX_VALUE) {
                            npVar.findViewByPosition(aeeaVar.p());
                        }
                        n();
                    }
                } else if (aedi.c(iO, 2)) {
                    i = aeeaVar.b;
                    if (i == -1) {
                        i2 = -1;
                    } else {
                        i2 = ((aedz) list.get(i)).b;
                    }
                    view = this.i;
                    if (!this.k) {
                        this.k = true;
                        this.c.post(new ikm(this, view, i2, npVar, 6));
                    }
                }
                iQ = aeeaVar.q();
                if (aedi.c(iQ, 8)) {
                    p();
                } else if (!aedi.e(iQ)) {
                    m();
                }
            } else if (i3 == -1) {
                q();
                if (this.u != null) {
                    recyclerView.post(new acqu(this, 17));
                }
                iO = aeeaVar.o();
                if (aedi.d(iO)) {
                    if (this.i != null) {
                        if (jS != Long.MAX_VALUE && aeeaVar.v() && jS == ((aedz) list.get(0)).c) {
                            npVar.findViewByPosition(aeeaVar.p());
                        }
                        n();
                    }
                } else if (aedi.c(iO, 2) && (this.i == null || this.j != aeeaVar.s())) {
                    i = aeeaVar.b;
                    if (i == -1) {
                        i2 = -1;
                    } else {
                        i2 = ((aedz) list.get(i)).b;
                    }
                    view = this.i;
                    if (!this.k) {
                        this.k = true;
                        this.c.post(new ikm(this, view, i2, npVar, 6));
                    }
                }
                iQ = aeeaVar.q();
                if (aedi.c(iQ, 8)) {
                    p();
                } else if (!aedi.e(iQ)) {
                    m();
                }
            }
        } else if (z) {
            z = true;
            aeeaVar.c = iC;
            int iM2 = aeeaVar.m(iC);
            list = aeeaVar.a;
            iMin = Math.min(iM2, list.size() - 1);
            if (iMin < 0) {
                if (((aedz) list.get(iMin)).b <= iC) {
                    if (iMin > 0) {
                        iMin--;
                    } else {
                        iMin = -1;
                    }
                } else if (iMin > 0) {
                    iMin--;
                } else {
                    iMin = -1;
                }
                if (iMin != aeeaVar.b) {
                    aeeaVar.b = iMin;
                } else if (i3 == -1) {
                }
                q();
                if (this.u != null) {
                    recyclerView.post(new acqu(this, 17));
                }
                iO = aeeaVar.o();
                if (aedi.d(iO)) {
                    if (this.i != null) {
                        if (jS != Long.MAX_VALUE) {
                            npVar.findViewByPosition(aeeaVar.p());
                        }
                        n();
                    }
                } else if (aedi.c(iO, 2)) {
                    i = aeeaVar.b;
                    if (i == -1) {
                        i2 = -1;
                    } else {
                        i2 = ((aedz) list.get(i)).b;
                    }
                    view = this.i;
                    if (!this.k) {
                        this.k = true;
                        this.c.post(new ikm(this, view, i2, npVar, 6));
                    }
                }
                iQ = aeeaVar.q();
                if (aedi.c(iQ, 8)) {
                    p();
                } else if (!aedi.e(iQ)) {
                    m();
                }
            } else if (i3 == -1) {
                q();
                if (this.u != null) {
                    recyclerView.post(new acqu(this, 17));
                }
                iO = aeeaVar.o();
                if (aedi.d(iO)) {
                    if (this.i != null) {
                        if (jS != Long.MAX_VALUE) {
                            npVar.findViewByPosition(aeeaVar.p());
                        }
                        n();
                    }
                } else if (aedi.c(iO, 2)) {
                    i = aeeaVar.b;
                    if (i == -1) {
                        i2 = -1;
                    } else {
                        i2 = ((aedz) list.get(i)).b;
                    }
                    view = this.i;
                    if (!this.k) {
                        this.k = true;
                        this.c.post(new ikm(this, view, i2, npVar, 6));
                    }
                }
                iQ = aeeaVar.q();
                if (aedi.c(iQ, 8)) {
                    p();
                } else if (!aedi.e(iQ)) {
                    m();
                }
            }
        }
        if (this.i != null) {
            if (!aedi.c(aeeaVar.q(), 1) || (viewB = b(npVar)) == null) {
                View view2 = this.i;
                float f = 0.0f;
                if (aeeaVar.v()) {
                    List list2 = aeeaVar.a;
                    int size = list2.size() - 1;
                    aedz aedzVar = (aedz) list2.get(size);
                    if ((aeeaVar.b != size || !aedi.c(aedzVar.a, 2)) && aeeaVar.c >= aedzVar.b && aedi.c(aedzVar.a, 1)) {
                        f = -this.i.getHeight();
                    }
                }
                view2.setTranslationY(f);
            } else {
                this.i.setTranslationY(Math.min(0, viewB.getTop() - this.i.getHeight()));
            }
        }
        int iQ2 = aeeaVar.q();
        if (!aedi.c(iQ2, 20)) {
            o(npVar);
            return;
        }
        View viewB2 = b(npVar);
        if (viewB2 == null) {
            o(npVar);
            return;
        }
        float fA = a(iQ2, viewB2, this.f);
        if (!aedi.c(iQ2, 4)) {
            c(iQ2, viewB2, fA);
            return;
        }
        recyclerView.post(new qd(this, viewB2, iQ2, 18));
        if (vxzVar.l(214, 45816306L, false)) {
            return;
        }
        c(iQ2, viewB2, fA);
    }

    public final boolean i() {
        np npVar = this.a.n;
        if (npVar == null) {
            return false;
        }
        if (npVar instanceof GridLayoutManager) {
            if (((GridLayoutManager) npVar).findLastVisibleItemPosition() != npVar.getItemCount() - 1) {
                return false;
            }
        } else if (npVar instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) npVar).findLastVisibleItemPosition() != npVar.getItemCount() - 1) {
                return false;
            }
        } else if (!(npVar instanceof FlowLayoutManager) || ((FlowLayoutManager) npVar).e() != npVar.getItemCount() - 1) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        return (this.a.n instanceof FlowLayoutManager) && this.s.l(214, 45816306L, false);
    }

    public final void k() {
        aeea aeeaVar = this.d;
        aeeaVar.o();
        aeeaVar.q();
    }
}
