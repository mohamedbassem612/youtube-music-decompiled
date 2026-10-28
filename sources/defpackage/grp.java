package defpackage;

import android.support.v7.widget.Toolbar;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class grp extends grm {
    public grp(cc ccVar, CoordinatorLayout coordinatorLayout, iwe iweVar, avlh avlhVar, avmb avmbVar) {
        super(ccVar, coordinatorLayout, iweVar, avlhVar, avmbVar, Optional.empty());
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
        cc ccVar;
        aeuj aeujVar;
        View viewFindViewById;
        super.l(groVar);
        if (!n() || (ccVar = this.f) == null) {
            return;
        }
        this.a.a(ccVar.requireContext().getColor(R.color.black_header_color));
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
            this.b.setFitsSystemWindows(!this.l);
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
        }
        CollapsingToolbarLayout collapsingToolbarLayout3 = this.c;
        if (collapsingToolbarLayout3 != null) {
            collapsingToolbarLayout3.setBackgroundColor(this.f.requireContext().getColor(R.color.black_header_color));
        }
        AppBarLayout appBarLayout = this.b;
        if (appBarLayout != null) {
            appBarLayout.setBackgroundColor(this.f.requireContext().getColor(R.color.black_header_color));
        }
        Toolbar toolbar2 = this.d;
        if (toolbar2 != null) {
            toolbar2.setBackgroundColor(this.f.requireContext().getColor(R.color.black_header_color));
        }
        CollapsingToolbarLayout collapsingToolbarLayout4 = this.c;
        if (collapsingToolbarLayout4 != null && (aeujVar = (aeuj) collapsingToolbarLayout4.getLayoutParams()) != null) {
            aeujVar.a = 5;
            this.c.setLayoutParams(aeujVar);
        }
        p(groVar.c, this.m);
    }
}
