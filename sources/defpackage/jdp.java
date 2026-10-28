package defpackage;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jdp implements adma {
    private final inn a;
    private final View b;
    private final Toolbar c;
    private final TextView d;
    private final AppBarLayout e;
    private MenuItem f;

    public jdp(inn innVar, View view) {
        this.a = innVar;
        this.b = view;
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.detail_page_toolbar);
        this.c = toolbar;
        TextView textView = (TextView) view.findViewById(R.id.title_place_holder);
        this.d = textView;
        textView.setVisibility(0);
        this.e = (AppBarLayout) view.findViewById(R.id.detail_page_app_bar);
        if (toolbar.f().findItem(R.id.action_search) == null && toolbar.f().findItem(R.id.media_route_button) == null) {
            toolbar.l(R.menu.entity_browse_page_menu);
        }
        if (toolbar.f() != null) {
            this.f = toolbar.f().findItem(R.id.action_search);
        }
        toolbar.setBackgroundColor(view.getContext().getColor(R.color.black_header_color));
    }

    @Override // defpackage.adma
    public final View a() {
        return this.b;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        gzj.N(this.c);
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        alay alayVar;
        anpf anpfVar = (anpf) obj;
        if ((anpfVar.b & 1) != 0) {
            alayVar = anpfVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        TextView textView = this.d;
        textView.setText(ackj.k(null, alayVar, null, false));
        textView.setVisibility(1 != (anpfVar.b & 1) ? 4 : 0);
        this.c.setFocusable(true);
        gzj.J(this.e);
        this.a.a(this.f);
    }
}
