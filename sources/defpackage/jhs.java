package defpackage;

import android.content.res.Configuration;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jhs implements jhu, jhv, twn {
    public final TabbedView a;
    public final xgn b;
    public final Map c;

    public jhs(TabbedView tabbedView, jhu jhuVar, jhv jhvVar, xgn xgnVar) {
        tabbedView.getClass();
        this.a = tabbedView;
        this.c = new HashMap();
        tabbedView.k(this);
        if (jhuVar != null) {
            tabbedView.k(jhuVar);
        }
        tabbedView.l(this);
        if (jhvVar != null) {
            tabbedView.l(jhvVar);
        }
        this.b = xgnVar;
    }

    @Override // defpackage.jhu
    public final void a(int i, boolean z) {
        xgn xgnVar;
        adsr adsrVar = (adsr) this.c.get(this.a.D(i));
        if (adsrVar != null) {
            adsrVar.R();
        }
        if (z || (xgnVar = this.b) == null) {
            return;
        }
        h(xgnVar, i);
    }

    public final int b() {
        return this.a.h();
    }

    public final int c() {
        return this.a.d();
    }

    public final adsr d(int i) {
        TabbedView tabbedView = this.a;
        if (i >= tabbedView.d() || i < 0) {
            return null;
        }
        return (adsr) this.c.get(tabbedView.D(i));
    }

    public final agke e() {
        agjz agjzVar = new agjz(4);
        int i = 0;
        while (true) {
            TabbedView tabbedView = this.a;
            if (i >= tabbedView.d()) {
                return agjzVar.g();
            }
            aftj aftjVarD = tabbedView.D(i);
            if (aftjVarD != null) {
                agjzVar.h(aftjVarD);
            }
            i++;
        }
    }

    public final void f() {
        g();
        TabbedView tabbedView = this.a;
        tabbedView.p(new iqc(tabbedView, 3));
    }

    public final void g() {
        Map map = this.c;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((adsr) it.next()).i();
        }
        map.clear();
    }

    public final void h(xgn xgnVar, int i) {
        aftj aftjVarD;
        if (l(i) || (aftjVarD = this.a.D(i)) == null) {
            return;
        }
        byte[] bArrG = ((aqjj) aftjVarD.b).k.G();
        if (xgnVar != null) {
            xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(bArrG), null);
        }
    }

    @Override // defpackage.twn
    public final void i() {
        f();
        TabbedView tabbedView = this.a;
        tabbedView.d.clear();
        tabbedView.f.clear();
        tabbedView.e.clear();
    }

    public final void j(xgn xgnVar, int i) {
        aftj aftjVarD;
        if (l(i) || (aftjVarD = this.a.D(i)) == null) {
            return;
        }
        byte[] bArrG = ((aqjj) aftjVarD.b).k.G();
        if (xgnVar != null) {
            xgnVar.w(new xgj(bArrG), null);
        }
    }

    public final void k(Configuration configuration) {
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((adsr) it.next()).p(configuration);
        }
    }

    public final boolean l(int i) {
        return i >= this.a.d() || i < 0;
    }

    public final void m(int i) {
        TabbedView tabbedView = this.a;
        tabbedView.p(new awu(tabbedView, i, 10));
    }

    public final yvh n() {
        np npVar;
        Parcelable parcelableOnSaveInstanceState;
        agke agkeVarE = e();
        int iB = b();
        agkh agkhVar = new agkh(4);
        Map map = this.c;
        for (aftj aftjVar : map.keySet()) {
            adsr adsrVar = (adsr) map.get(aftjVar);
            if (adsrVar != null) {
                adsrVar.hq();
                agkhVar.e(aftjVar, adsrVar.hq());
            }
        }
        agkj agkjVarD = agkhVar.d(true);
        agkh agkhVar2 = new agkh(4);
        for (aftj aftjVar2 : map.keySet()) {
            adsr adsrVar2 = (adsr) map.get(aftjVar2);
            if (adsrVar2 != null && (npVar = ((RecyclerView) adsrVar2.l).n) != null && (parcelableOnSaveInstanceState = npVar.onSaveInstanceState()) != null) {
                agkhVar2.e(aftjVar2, parcelableOnSaveInstanceState);
            }
        }
        return new yvh(agkeVarE, iB, agkjVarD, agkhVar2.d(true));
    }

    public final void o(aftj aftjVar, View view, View view2, adsr adsrVar) {
        p(aftjVar, view, view2, adsrVar, this.a.d());
    }

    public final void p(final aftj aftjVar, final View view, final View view2, adsr adsrVar, final int i) {
        if (adsrVar != null) {
            this.c.put(aftjVar, adsrVar);
        }
        final TabbedView tabbedView = this.a;
        tabbedView.p(new Runnable() { // from class: jht
            @Override // java.lang.Runnable
            public final void run() {
                aftj aftjVar2 = aftjVar;
                if (aftjVar2 == null || aftjVar2.b == null) {
                    return;
                }
                int i2 = i;
                View view3 = view2;
                View view4 = view;
                TabbedView tabbedView2 = tabbedView;
                jhq jhqVarC = tabbedView2.C(aftjVar2, view4, view3);
                if (tabbedView2.getLayoutDirection() != 1 || tabbedView2.B()) {
                    tabbedView2.a.d(i2, jhqVarC);
                } else {
                    jic jicVar = tabbedView2.a;
                    jicVar.d(jicVar.c().size() - i2, jhqVarC);
                }
            }
        });
        for (int i2 = 0; i2 < tabbedView.d(); i2++) {
            View viewJ = tabbedView.j(i2);
            if (viewJ != null) {
                viewJ.setTooltipText(null);
            }
            if (tabbedView.D(i2) == aftjVar) {
                j(this.b, i2);
                return;
            }
        }
    }

    public final void q(aftj aftjVar) {
        TabbedView tabbedView = this.a;
        tabbedView.p(new hqa(tabbedView, aftjVar, 20));
        adsr adsrVar = (adsr) this.c.remove(aftjVar);
        if (adsrVar != null) {
            adsrVar.i();
        }
    }

    @Override // defpackage.jhv
    public final void hA() {
    }
}
