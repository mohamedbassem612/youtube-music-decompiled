package defpackage;

import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gru extends grm {
    private final adxj n;

    public gru(cc ccVar, CoordinatorLayout coordinatorLayout, iwe iweVar, avlh avlhVar, avmb avmbVar, adxj adxjVar) {
        super(ccVar, coordinatorLayout, iweVar, avlhVar, avmbVar, Optional.empty());
        this.n = adxjVar;
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
        almd almdVar;
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
        String string = null;
        if (toolbar != null) {
            toolbar.o(R.string.navigate_back);
            this.d.n(null);
        }
        CollapsingToolbarLayout collapsingToolbarLayout2 = this.c;
        if (collapsingToolbarLayout2 != null && (viewFindViewById = collapsingToolbarLayout2.findViewById(R.id.collapsing_toolbar_layout_background_container)) != null) {
            viewFindViewById.setVisibility(8);
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
            gzj.L(this.d, this.n.b(arqz.er));
            this.d.C();
            this.d.s(new jn(this.f, 13, null));
        }
        if (this.c != null) {
            heh hehVar = groVar.a;
            Object obj = hehVar.h;
            if (obj != null && (almdVar = ((wfy) obj).a) != null && (almdVar.b & 2) != 0) {
                allx allxVar = almdVar.d;
                if (allxVar == null) {
                    allxVar = allx.a;
                }
                if (allxVar.b == 99965204) {
                    allx allxVar2 = ((wfy) hehVar.h).a.d;
                    if (allxVar2 == null) {
                        allxVar2 = allx.a;
                    }
                    if (((allxVar2.b == 99965204 ? (anpf) allxVar2.c : anpf.a).b & 1) != 0) {
                        allx allxVar3 = ((wfy) hehVar.h).a.d;
                        if (allxVar3 == null) {
                            allxVar3 = allx.a;
                        }
                        alay alayVar = (allxVar3.b == 99965204 ? (anpf) allxVar3.c : anpf.a).c;
                        if (alayVar == null) {
                            alayVar = alay.a;
                        }
                        string = ackj.k(null, alayVar, null, false).toString();
                    }
                }
            }
            TextView textView = (TextView) this.c.findViewById(R.id.toolbar_title);
            if (string != null) {
                if (textView != null) {
                    textView.setText(string);
                    textView.setVisibility(0);
                }
            } else if (textView != null) {
                textView.setVisibility(8);
            }
            aeuj aeujVar = (aeuj) this.c.getLayoutParams();
            if (aeujVar != null) {
                aeujVar.a = 3;
                this.c.setLayoutParams(aeujVar);
            }
        }
    }
}
