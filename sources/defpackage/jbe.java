package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.toolbar.TouchPassThroughToolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class jbe implements adma, aeum, gdy {
    private final inn A;
    protected final Context a;
    protected final izr b;
    protected final iwe c;
    protected adia d;
    protected final View e;
    protected final View f;
    protected final TextView g;
    protected final TextView h;
    protected final LinearLayout i;
    protected final RelativeLayout j;
    protected final RecyclerView k;
    protected final View l;
    protected final RecyclerView m;
    protected final View n;
    protected final View o;
    protected final TouchPassThroughToolbar p;
    protected final View q;
    protected final TextView r;
    protected MenuItem s;
    protected boolean t;
    protected final ggd u;
    protected xgn v;
    protected final hfn w;
    private final View x;
    private final View y;
    private final View z;

    protected jbe(Context context, izr izrVar, View view, inn innVar, iwe iweVar, hfn hfnVar) {
        this.a = context;
        this.b = izrVar;
        this.e = view;
        this.A = innVar;
        this.c = iweVar;
        this.w = hfnVar;
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) view.findViewById(R.id.detail_page_collapsing_toolbar);
        collapsingToolbarLayout.setBackgroundColor(context.getColor(R.color.black_header_color));
        TouchPassThroughToolbar touchPassThroughToolbar = (TouchPassThroughToolbar) view.findViewById(R.id.detail_page_toolbar);
        this.p = touchPassThroughToolbar;
        touchPassThroughToolbar.setBackground(new ColorDrawable(context.getColor(R.color.black_header_color)));
        View viewFindViewById = view.findViewById(R.id.toolbar_divider);
        this.q = viewFindViewById;
        TextView textView = (TextView) view.findViewById(R.id.title_place_holder);
        this.r = textView;
        this.u = new ggd(textView);
        new ggd(viewFindViewById);
        if (!(this instanceof jdj) ? view.findViewById(R.id.header_info_container) == null : view.findViewById(R.id.music_element_header_container) == null) {
            if (touchPassThroughToolbar.f() != null && touchPassThroughToolbar.f().size() == 0) {
                touchPassThroughToolbar.l(R.menu.entity_browse_page_menu);
            }
            LayoutInflater.from(context).inflate(d(), (ViewGroup) collapsingToolbarLayout, true);
            collapsingToolbarLayout.bringChildToFront(touchPassThroughToolbar);
            if (touchPassThroughToolbar.f() != null) {
                this.s = touchPassThroughToolbar.f().findItem(R.id.action_search);
            }
        }
        View viewFindViewById2 = view.findViewById(R.id.header_info_container);
        this.f = viewFindViewById2;
        this.y = viewFindViewById2 != null ? viewFindViewById2.findViewById(R.id.header_info) : null;
        this.x = view.findViewById(R.id.header_additional_info_container);
        this.z = view.findViewById(R.id.entity_info_container);
        TextView textView2 = (TextView) view.findViewById(R.id.entity_header_title);
        this.g = textView2;
        if (textView2 != null) {
            textView2.setTextAppearance(R.style.TextAppearance_YouTubeMusic_VisualHeader_TitleModern);
        }
        this.h = (TextView) view.findViewById(R.id.entity_header_subtitle);
        this.i = (LinearLayout) view.findViewById(R.id.subtitle_badges_container);
        this.j = (RelativeLayout) view.findViewById(R.id.entity_thumbnail_container);
        this.k = (RecyclerView) view.findViewById(R.id.top_level_menu_buttons_anchor);
        this.m = (RecyclerView) view.findViewById(R.id.toolbar_top_level_menu_buttons_anchor);
        View viewFindViewById3 = view.findViewById(R.id.contextual_menu_anchor);
        this.l = viewFindViewById3;
        if (viewFindViewById3 != null) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.item_medium_spacing);
            viewFindViewById3.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        }
        View viewFindViewById4 = view.findViewById(R.id.toolbar_contextual_menu_anchor);
        this.n = viewFindViewById4;
        if (viewFindViewById4 != null) {
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.item_medium_spacing);
            viewFindViewById4.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        }
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(R.id.detail_page_app_bar);
        if (appBarLayout != null) {
            appBarLayout.setBackgroundColor(context.getColor(R.color.black_header_color));
        }
        View viewFindViewById5 = view.findViewById(e());
        this.o = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setBackgroundColor(context.getColor(R.color.black_header_color));
        }
        h();
    }

    @Override // defpackage.adma
    public View a() {
        throw null;
    }

    @Override // defpackage.adma
    public void b(admh admhVar) {
        RecyclerView recyclerView = this.k;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
            recyclerView.ad(null);
        }
        View view = this.l;
        if (view != null) {
            view.setVisibility(8);
        }
        RecyclerView recyclerView2 = this.m;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
            recyclerView2.ad(null);
        }
        View view2 = this.n;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    protected abstract int d();

    protected int e() {
        return R.id.entity_header_scrim;
    }

    protected int f() {
        TouchPassThroughToolbar touchPassThroughToolbar = this.p;
        int[] iArr = new int[2];
        touchPassThroughToolbar.getLocationInWindow(iArr);
        return iArr[1] + touchPassThroughToolbar.getHeight();
    }

    final void g() {
        this.t = false;
        TouchPassThroughToolbar touchPassThroughToolbar = this.p;
        touchPassThroughToolbar.getBackground().setAlpha(255);
        touchPassThroughToolbar.C = false;
    }

    final void h() {
        this.t = true;
    }

    @Override // defpackage.gdy
    public void hS(Configuration configuration) {
        ViewGroup.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        View view = this.y;
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), this.a.getResources().getDimensionPixelOffset(R.dimen.item_small_spacing));
        }
        RelativeLayout relativeLayout = this.j;
        if (relativeLayout != null && (layoutParams2 = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams()) != null) {
            Context context = this.a;
            layoutParams2.weight = context.getResources().getInteger(R.integer.music_entity_thumbnail_weight);
            layoutParams2.width = context.getResources().getDimensionPixelSize(R.dimen.music_entity_thumbnail_size);
        }
        View view2 = this.z;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
            layoutParams.width = this.a.getResources().getDimensionPixelSize(R.dimen.music_entity_title_view_size);
        }
        if (view != null) {
            view.requestLayout();
        }
    }

    @Override // defpackage.adma
    public void hU(adly adlyVar, Object obj) {
        this.v = adlyVar.b;
        MenuItem menuItem = this.s;
        if (menuItem != null) {
            this.A.a(menuItem);
        }
    }

    @Override // defpackage.aeum, defpackage.aeui
    public void m(AppBarLayout appBarLayout, int i) {
        if (i == 0) {
            if (this.t) {
                View view = this.o;
                if (view != null) {
                    view.setAlpha(0.0f);
                }
                TouchPassThroughToolbar touchPassThroughToolbar = this.p;
                touchPassThroughToolbar.getBackground().setAlpha(0);
                TextView textView = this.r;
                if (textView != null) {
                    textView.setVisibility(4);
                }
                touchPassThroughToolbar.C = true;
                this.c.a(0);
            }
            this.q.setVisibility(8);
            return;
        }
        if (appBarLayout.f() + i <= 0) {
            if (this.t) {
                View view2 = this.o;
                if (view2 != null) {
                    view2.setAlpha(1.0f);
                }
                View view3 = this.x;
                if (view3 != null) {
                    view3.setAlpha(0.0f);
                }
                this.p.getBackground().setAlpha(255);
            }
            this.u.b();
            this.p.C = false;
            this.c.a(this.a.getColor(R.color.black_header_color));
            return;
        }
        View view4 = this.f;
        TouchPassThroughToolbar touchPassThroughToolbar2 = this.p;
        int height = view4.getHeight() - touchPassThroughToolbar2.getHeight();
        View view5 = this.x;
        float fMax = Math.max(((Math.max((view4.getHeight() + i) + (view5 != null ? view5.getHeight() : 0), 0) - touchPassThroughToolbar2.getHeight()) - this.w.K()) / height, 0.0f);
        boolean z = fMax != 0.0f;
        if (this.t) {
            View view6 = this.o;
            if (view6 != null) {
                view6.setAlpha(1.0f - fMax);
            }
            if (view5 != null) {
                view5.setAlpha(fMax);
            }
            touchPassThroughToolbar2.getBackground().setAlpha(fMax != 0.0f ? 0 : 255);
            TextView textView2 = this.r;
            if (textView2 == null || textView2.getAlpha() == 0.0f || TextUtils.isEmpty(textView2.getText())) {
                touchPassThroughToolbar2.C = z;
            }
        }
        iwe iweVar = this.c;
        if (z) {
            iweVar.a(0);
        } else {
            iweVar.a(this.a.getColor(R.color.black_header_color));
        }
        TextView textView3 = this.g;
        if (textView3 != null) {
            int[] iArr = new int[2];
            textView3.getLocationInWindow(iArr);
            int height2 = iArr[1] + textView3.getHeight();
            int iF = f();
            ggd ggdVar = this.u;
            if (height2 < iF) {
                ggdVar.b();
                touchPassThroughToolbar2.C = false;
            } else {
                ggdVar.a();
                if (this.t) {
                    touchPassThroughToolbar2.C = z;
                }
            }
        }
    }
}
