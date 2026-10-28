package defpackage;

import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class grv extends grm implements aeum {
    private final adxj n;
    private aeum o;

    public grv(cc ccVar, CoordinatorLayout coordinatorLayout, iwe iweVar, avlh avlhVar, avmb avmbVar, adxj adxjVar) {
        super(ccVar, coordinatorLayout, iweVar, avlhVar, avmbVar, Optional.empty());
        this.n = adxjVar;
    }

    public static boolean q(heh hehVar) {
        return TextUtils.equals("FEmusic_new_releases", hehVar.b()) || TextUtils.equals("FEmusic_moods_and_genres", hehVar.b()) || TextUtils.equals("FEmusic_charts", hehVar.b()) || TextUtils.equals("FEmusic_non_music_audio", hehVar.b()) || TextUtils.equals("FEmusic_hashtag", hehVar.b());
    }

    @Override // defpackage.grm, defpackage.grn
    public final void g() {
        AppBarLayout appBarLayout = this.b;
        if (appBarLayout != null) {
            appBarLayout.j(this);
        }
        super.g();
    }

    @Override // defpackage.grm, defpackage.grn
    public final void h(Menu menu, MenuInflater menuInflater) {
        super.h(menu, menuInflater);
        menu.removeItem(R.id.action_avatar);
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
        Toolbar toolbar = this.d;
        if (toolbar != null) {
            toolbar.o(R.string.navigate_back);
            this.d.n(null);
        }
        CollapsingToolbarLayout collapsingToolbarLayout2 = this.c;
        if (collapsingToolbarLayout2 != null) {
            collapsingToolbarLayout2.setBackgroundColor(this.f.requireContext().getColor(R.color.black_header_color));
        }
        AppBarLayout appBarLayout = this.b;
        if (appBarLayout != null) {
            appBarLayout.setBackgroundColor(this.f.requireContext().getColor(R.color.black_header_color));
        }
        Toolbar toolbar2 = this.d;
        if (toolbar2 != null) {
            toolbar2.setBackgroundColor(this.f.requireContext().getColor(R.color.black_header_color));
        }
        CollapsingToolbarLayout collapsingToolbarLayout3 = this.c;
        if (collapsingToolbarLayout3 != null && (viewFindViewById = collapsingToolbarLayout3.findViewById(R.id.collapsing_toolbar_layout_background_container)) != null) {
            if (q(groVar.a)) {
                viewFindViewById.setVisibility(0);
            } else {
                viewFindViewById.setVisibility(8);
            }
        }
        Toolbar toolbar3 = this.d;
        if (toolbar3 != null) {
            gzj.L(toolbar3, this.n.b(arqz.er));
            this.d.C();
            this.d.s(new jn(this.f, 14, null));
        }
        AppBarLayout appBarLayout2 = this.b;
        if (appBarLayout2 != null) {
            appBarLayout2.j(this);
            this.b.h(this);
        }
        CollapsingToolbarLayout collapsingToolbarLayout4 = this.c;
        if (collapsingToolbarLayout4 != null && (aeujVar = (aeuj) collapsingToolbarLayout4.getLayoutParams()) != null) {
            aeujVar.a = 3;
            this.c.setLayoutParams(aeujVar);
        }
        this.o = (aeum) groVar.b;
    }

    @Override // defpackage.aeum, defpackage.aeui
    public final void m(AppBarLayout appBarLayout, int i) {
        if (this.o == null || appBarLayout.f() <= 0) {
            return;
        }
        this.o.m(appBarLayout, i);
    }
}
