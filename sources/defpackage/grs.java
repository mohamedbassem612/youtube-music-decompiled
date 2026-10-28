package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class grs extends grm {
    private final AppBarLayout.ScrollingViewBehavior n;
    private final ivz o;
    private grt p;
    private final qa q;

    public grs(cc ccVar, CoordinatorLayout coordinatorLayout, iwe iweVar, avlh avlhVar, avmb avmbVar) {
        super(ccVar, coordinatorLayout, iweVar, avlhVar, avmbVar, Optional.empty());
        this.n = new grq();
        this.o = new ivz(new gpd(this, 2));
        this.q = new grr(this);
    }

    public static boolean q(heh hehVar) {
        almd almdVar;
        Object obj = hehVar.h;
        if (obj != null && (almdVar = ((wfy) obj).a) != null && (almdVar.b & 2) != 0) {
            allx allxVar = almdVar.d;
            if (allxVar == null) {
                allxVar = allx.a;
            }
            if (allxVar.b == 361650780) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.grm, defpackage.grn
    public final void g() {
        asv asvVar;
        RecyclerView recyclerView = this.j;
        if (recyclerView != null) {
            recyclerView.aE(this.q);
        }
        AppBarLayout appBarLayout = this.b;
        if (appBarLayout != null) {
            appBarLayout.j(this.o);
        }
        LoadingFrameLayout loadingFrameLayout = this.e;
        if (loadingFrameLayout != null && (asvVar = (asv) loadingFrameLayout.getLayoutParams()) != null) {
            asvVar.b(new AppBarLayout.ScrollingViewBehavior());
            this.e.setLayoutParams(asvVar);
        }
        super.g();
    }

    @Override // defpackage.grm
    public final void i(boolean z) {
        AppBarLayout appBarLayout = this.b;
        if (appBarLayout != null) {
            appBarLayout.setFitsSystemWindows(!z);
            this.b.requestLayout();
        }
    }

    @Override // defpackage.grm, defpackage.grn
    public final void l(gro groVar) {
        aeuj aeujVar;
        View viewFindViewById;
        asv asvVar;
        super.l(groVar);
        if (!n() || this.f == null) {
            return;
        }
        this.p = groVar.d;
        m();
        this.a.a(0);
        if (this.d != null) {
            ((fx) this.f.requireActivity()).setSupportActionBar(this.d);
            fl supportActionBar = ((fx) this.f.requireActivity()).getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.h(true);
                supportActionBar.j(false);
            }
        }
        CollapsingToolbarLayout collapsingToolbarLayout = this.c;
        if (collapsingToolbarLayout != null) {
            gzj.K(collapsingToolbarLayout);
        }
        if (this.b != null) {
            k();
            this.b.setKeyboardNavigationCluster(false);
            AppBarLayout appBarLayout = this.b;
            ivz ivzVar = this.o;
            appBarLayout.j(ivzVar);
            this.b.h(ivzVar);
        }
        LoadingFrameLayout loadingFrameLayout = this.e;
        if (loadingFrameLayout != null && (asvVar = (asv) loadingFrameLayout.getLayoutParams()) != null) {
            asvVar.b(this.n);
            this.e.setLayoutParams(asvVar);
        }
        AppBarLayout appBarLayout2 = this.b;
        if (appBarLayout2 != null) {
            appBarLayout2.setFitsSystemWindows(!this.l);
        }
        j();
        CollapsingToolbarLayout collapsingToolbarLayout2 = this.c;
        if (collapsingToolbarLayout2 != null && (viewFindViewById = collapsingToolbarLayout2.findViewById(R.id.collapsing_toolbar_layout_background_container)) != null) {
            viewFindViewById.setVisibility(8);
        }
        Toolbar toolbar = this.d;
        if (toolbar != null) {
            toolbar.D();
            this.d.r(null);
            View viewFindViewById2 = this.d.findViewById(R.id.toolbar_title);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(8);
            }
            this.d.setBackgroundColor(0);
        }
        CollapsingToolbarLayout collapsingToolbarLayout3 = this.c;
        if (collapsingToolbarLayout3 != null) {
            collapsingToolbarLayout3.setBackgroundColor(0);
        }
        AppBarLayout appBarLayout3 = this.b;
        if (appBarLayout3 != null) {
            appBarLayout3.setBackgroundColor(0);
        }
        CollapsingToolbarLayout collapsingToolbarLayout4 = this.c;
        if (collapsingToolbarLayout4 != null && (aeujVar = (aeuj) collapsingToolbarLayout4.getLayoutParams()) != null) {
            aeujVar.a = 5;
            this.c.setLayoutParams(aeujVar);
        }
        p(groVar.c, this.q);
    }

    public final void m() {
        if (this.b != null) {
            grt grtVar = this.p;
            if (grtVar == null || grtVar.b() == null) {
                gzj.M(this.b, this.a, 1.0f);
                return;
            }
            AppBarLayout appBarLayout = this.b;
            iwe iweVar = this.a;
            View viewB = this.p.b();
            Rect rect = new Rect();
            boolean globalVisibleRect = viewB.getGlobalVisibleRect(rect);
            int height = viewB.getHeight();
            boolean zIsShown = viewB.isShown();
            if (globalVisibleRect && height > 0 && zIsShown) {
                gzj.M(appBarLayout, iweVar, Math.max(0.0f, Math.min(1.0f, 1.0f - ((rect.bottom - rect.top) / height))));
            } else {
                gzj.M(appBarLayout, iweVar, 1.0f);
            }
        }
    }

    public grs(grn grnVar, iwe iweVar, avlh avlhVar, avmb avmbVar) {
        super(grnVar, iweVar, avlhVar, avmbVar);
        this.n = new grq();
        this.o = new ivz(new gpd(this, 2));
        this.q = new grr(this);
    }
}
