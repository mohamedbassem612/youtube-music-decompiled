package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jkc implements jjs, jju {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/userengagement/presenters/TastebuilderSearchPresenter");
    public final Context b;
    public final String c;
    public final xgn d;
    public final adlq e;
    public jjq f;
    public final xow g;
    private final RecyclerView h;
    private final boolean i;
    private final Executor j;
    private final admo k;
    private final GridLayoutManager l;
    private final jjm m;

    public jkc(Context context, RecyclerView recyclerView, aqjz aqjzVar, jjm jjmVar, xgn xgnVar, jer jerVar, ahek ahekVar, xow xowVar, Executor executor) {
        this.b = context;
        this.h = recyclerView;
        this.m = jjmVar;
        this.d = xgnVar;
        this.g = xowVar;
        this.j = executor;
        aqkb aqkbVar = aqjzVar.d;
        this.c = (aqkbVar == null ? aqkb.a : aqkbVar).b;
        this.i = aqjzVar.e;
        int i = bac.a;
        recyclerView.setNestedScrollingEnabled(false);
        adlq adlqVar = new adlq(false);
        this.e = adlqVar;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 3);
        this.l = gridLayoutManager;
        gridLayoutManager.g = new jjr(adlqVar);
        admo admoVarD = ahekVar.d(jerVar.a);
        this.k = admoVarD;
        admoVarD.D(adlqVar, null);
        admoVarD.jR(new adlk(xgnVar, 0));
    }

    public final void b() {
        jjq jjqVar = this.f;
        if (jjqVar == null || jjqVar.a() <= 0) {
            return;
        }
        jjq jjqVar2 = this.f;
        jjqVar2.a.clear();
        jjqVar2.w();
    }

    @Override // defpackage.jju
    public final void hW(jjv jjvVar) {
        int iFindFirstCompletelyVisibleItemPosition;
        b();
        jjm jjmVar = this.m;
        jjmVar.t();
        jjy jjyVar = jjmVar.w;
        if (jjyVar != null) {
            jjyVar.j();
        }
        RecyclerView recyclerView = jjmVar.v;
        if (recyclerView != null) {
            np npVar = recyclerView.n;
            if ((npVar instanceof LinearLayoutManager) && (iFindFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) npVar).findFirstCompletelyVisibleItemPosition()) != -1) {
                jjv jjvVar2 = new jjv(jjvVar.a);
                jjvVar2.d.onClick(new View(jjmVar.requireContext()));
                final jjp jjpVar = jjmVar.x;
                if (jjpVar != null) {
                    int iB = jjpVar.b(jjvVar2);
                    if (iB >= 0) {
                        jjpVar.a.remove(iB);
                    }
                    jjvVar2.e = new jju() { // from class: jjo
                        @Override // defpackage.jju
                        public final void hW(jjv jjvVar3) {
                            jjp jjpVar2 = jjpVar;
                            boolean z = jjvVar3.b;
                            ahgb ahgbVar = jjpVar2.f;
                            if (z) {
                                ahgbVar.T(jjvVar3);
                            } else {
                                ahgbVar.U(jjvVar3);
                            }
                        }
                    };
                    jjpVar.a.add(iFindFirstCompletelyVisibleItemPosition, jjvVar2);
                    ahgb ahgbVar = jjpVar.f;
                    ahgbVar.T(jjvVar2);
                    ahgbVar.S(jjvVar2);
                    jjpVar.w();
                }
            }
        }
        if (this.i) {
            jjmVar.n(true);
        }
    }

    @Override // defpackage.jjs
    public final void o() {
        b();
        RecyclerView recyclerView = this.h;
        recyclerView.ah(null);
        recyclerView.ad(null);
    }

    @Override // defpackage.jjs
    public final void q() {
        b();
    }

    @Override // defpackage.jjs
    public final void r() {
        RecyclerView recyclerView = this.h;
        recyclerView.ah(this.l);
        recyclerView.ad(this.k);
    }

    @Override // defpackage.jjs
    public final void u(String str) {
        ahev ahevVar = new ahev(new jkb(this, str, 0));
        Executor executor = this.j;
        executor.execute(ahevVar);
        ahng.x(ahevVar, afwl.g(new hfb(this, 17)), executor);
    }
}
