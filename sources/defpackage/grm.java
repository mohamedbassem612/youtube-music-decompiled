package defpackage;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class grm implements grn {
    protected final iwe a;
    protected AppBarLayout b;
    protected CollapsingToolbarLayout c;
    public Toolbar d;
    protected LoadingFrameLayout e;
    protected cc f;
    protected CoordinatorLayout g;
    protected final avmb h;
    protected RecyclerView j;
    protected ggd k;
    private final avlh n;
    private avmn o;
    boolean i = false;
    public boolean l = false;
    public final qa m = new grl(this);

    protected grm(cc ccVar, CoordinatorLayout coordinatorLayout, iwe iweVar, avlh avlhVar, avmb avmbVar, Optional optional) {
        this.a = iweVar;
        this.n = avlhVar;
        this.h = avmbVar;
        m();
        this.f = ccVar;
        this.g = coordinatorLayout;
        LayoutInflater.from(coordinatorLayout.getContext()).inflate(R.layout.treatment_loading_frame_layout, coordinatorLayout);
        this.e = (LoadingFrameLayout) coordinatorLayout.findViewById(R.id.browse_content);
        LayoutInflater.from(coordinatorLayout.getContext()).inflate(optional.isEmpty() ? R.layout.treatment_app_bar_layout : ((Integer) optional.get()).intValue(), coordinatorLayout);
        if (optional.isEmpty()) {
            AppBarLayout appBarLayout = (AppBarLayout) coordinatorLayout.findViewById(R.id.app_bar_layout);
            this.b = appBarLayout;
            if (appBarLayout != null) {
                this.c = (CollapsingToolbarLayout) appBarLayout.findViewById(R.id.collapsing_toolbar_layout);
                this.d = (Toolbar) this.b.findViewById(R.id.toolbar);
                View viewFindViewById = this.b.findViewById(R.id.toolbar_divider);
                if (viewFindViewById != null) {
                    this.k = new ggd(viewFindViewById);
                }
            }
        }
    }

    private final void m() {
        this.o = this.n.L(this.h).al(new gks(this, 16), new glg(5));
    }

    @Override // defpackage.grn
    public final cc a() {
        cc ccVar = this.f;
        ccVar.getClass();
        return ccVar;
    }

    @Override // defpackage.grn
    public final Toolbar b() {
        return this.d;
    }

    @Override // defpackage.grn
    public final CoordinatorLayout c() {
        CoordinatorLayout coordinatorLayout = this.g;
        coordinatorLayout.getClass();
        return coordinatorLayout;
    }

    @Override // defpackage.grn
    public final LoadingFrameLayout d() {
        return this.e;
    }

    @Override // defpackage.grn
    public final AppBarLayout e() {
        return this.b;
    }

    @Override // defpackage.grn
    public final CollapsingToolbarLayout f() {
        return this.c;
    }

    @Override // defpackage.grn
    public void g() {
        Object obj = this.o;
        if (obj != null) {
            awka.f((AtomicReference) obj);
        }
        RecyclerView recyclerView = this.j;
        if (recyclerView != null) {
            recyclerView.aE(this.m);
        }
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.i = true;
        this.j = null;
    }

    @Override // defpackage.grn
    public void h(Menu menu, MenuInflater menuInflater) {
        if (this.i) {
            throw new IllegalStateException("Cannot call onCreateOptionsMenu on a disposed AppBarTreatment.");
        }
    }

    public abstract void i(boolean z);

    protected final void j() {
        CoordinatorLayout coordinatorLayout = this.g;
        if (coordinatorLayout != null) {
            coordinatorLayout.requestApplyInsets();
        }
    }

    protected final void k() {
        AppBarLayout appBarLayout = this.b;
        if (appBarLayout != null) {
            appBarLayout.setTouchscreenBlocksFocus(false);
        }
    }

    @Override // defpackage.grn
    public void l(gro groVar) {
        if (this.i) {
            throw new IllegalStateException("Cannot change model statue for a disposed AppBarTreatment.");
        }
    }

    protected final boolean n() {
        cc ccVar = this.f;
        return (ccVar == null || ccVar.isHidden() || kro.M(ccVar)) ? false : true;
    }

    @Override // defpackage.grn
    public final boolean o() {
        return this.i;
    }

    protected final void p(RecyclerView recyclerView, qa qaVar) {
        RecyclerView recyclerView2 = this.j;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.aE(qaVar);
                this.j = null;
            }
            if (recyclerView != null) {
                recyclerView.aC(qaVar);
                this.j = recyclerView;
            }
        }
    }

    protected grm(grn grnVar, iwe iweVar, avlh avlhVar, avmb avmbVar) {
        View viewFindViewById;
        this.a = iweVar;
        this.n = avlhVar;
        this.h = avmbVar;
        m();
        if (!grnVar.o()) {
            this.f = grnVar.a();
            this.e = grnVar.d();
            this.b = grnVar.e();
            this.c = grnVar.f();
            this.d = grnVar.b();
            this.g = grnVar.c();
            AppBarLayout appBarLayout = this.b;
            if (appBarLayout == null || (viewFindViewById = appBarLayout.findViewById(R.id.toolbar_divider)) == null) {
                return;
            }
            this.k = new ggd(viewFindViewById);
            return;
        }
        throw new IllegalStateException("Cannot initialize with a disposed fragment.");
    }
}
