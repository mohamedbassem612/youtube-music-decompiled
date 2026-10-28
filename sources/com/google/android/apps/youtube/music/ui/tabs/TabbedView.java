package com.google.android.apps.youtube.music.ui.tabs;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.tabs.TabLayout;
import defpackage.afdg;
import defpackage.afdk;
import defpackage.aftj;
import defpackage.aliz;
import defpackage.alja;
import defpackage.aqjj;
import defpackage.avt;
import defpackage.bac;
import defpackage.ggd;
import defpackage.hxh;
import defpackage.izf;
import defpackage.jhn;
import defpackage.jhp;
import defpackage.jhq;
import defpackage.jhu;
import defpackage.jhv;
import defpackage.jic;
import defpackage.jkl;
import defpackage.jnd;
import defpackage.jol;
import defpackage.ok;
import defpackage.tuk;
import defpackage.vxz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class TabbedView extends jhn implements afdg {
    public jic a;
    public TabLayout b;
    public View c;
    public List d;
    public List e;
    public List f;
    public boolean g;
    public boolean h;
    public vxz i;
    private View j;
    private Context k;
    private AttributeSet l;
    private boolean m;
    private izf n;
    private boolean o;
    private ggd p;

    public TabbedView(Context context) {
        super(context);
        F(context, null);
    }

    private final void E(TabLayout tabLayout) {
        TypedArray typedArrayObtainStyledAttributes = this.k.obtainStyledAttributes(this.l, jhp.a);
        int color = typedArrayObtainStyledAttributes.getColor(2, this.k.getColor(R.color.header_color));
        typedArrayObtainStyledAttributes.recycle();
        int color2 = this.k.getColor(R.color.ytm_color_white);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.tabs_highlight_height);
        int color3 = this.k.getColor(R.color.ytm_color_white);
        int color4 = this.k.getColor(R.color.ytm_text_color_secondary_translucent);
        tabLayout.setBackgroundColor(color);
        tabLayout.q(color4, color3);
        tabLayout.o(color2);
        tabLayout.x = dimensionPixelSize;
        tabLayout.b.b(dimensionPixelSize);
    }

    private final void F(Context context, AttributeSet attributeSet) {
        TabLayout tabLayout;
        context.getClass();
        this.k = context;
        this.l = attributeSet;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jhp.a);
        this.o = typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        setOrientation(1);
        if (B()) {
            tabLayout = (TabLayout) LayoutInflater.from(this.k).inflate(R.layout.scrollable_tab_layout, (ViewGroup) null);
        } else {
            tabLayout = new TabLayout(this.k);
            if (tabLayout.r != 0) {
                tabLayout.r = 0;
                tabLayout.h();
            }
            tabLayout.p(1);
        }
        E(tabLayout);
        addView(tabLayout, new LinearLayout.LayoutParams(-1, -2));
        LayoutInflater.from(context).inflate(R.layout.toolbar_divider, this);
        this.c = findViewById(R.id.toolbar_divider);
        this.p = new ggd(this.c);
        this.a.l(new hxh(this, null));
        addView(this.a.b(), new LinearLayout.LayoutParams(-1, -1));
        z(tabLayout);
    }

    private final void G() {
        TabLayout tabLayout;
        if (!B() || (tabLayout = this.b) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = tabLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.page_margin) - getResources().getDimensionPixelSize(R.dimen.tab_padding_horizontal);
            marginLayoutParams.leftMargin = dimensionPixelSize;
            marginLayoutParams.rightMargin = dimensionPixelSize;
            this.b.setLayoutParams(layoutParams);
        }
    }

    public final boolean A() {
        return this.g || this.a.c().size() > 1;
    }

    public final boolean B() {
        return this.o && this.i.l(204, 45733885L, false);
    }

    public final jhq C(aftj aftjVar, View view, View view2) {
        Object obj = aftjVar.b;
        AppCompatImageView appCompatImageView = null;
        drawableMutate = null;
        Drawable drawableMutate = null;
        appCompatImageView = null;
        if (obj != null && (((aqjj) obj).b & 64) != 0) {
            AppCompatImageView appCompatImageView2 = new AppCompatImageView(this.k);
            appCompatImageView2.setContentDescription(((aqjj) aftjVar.b).e);
            appCompatImageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            alja aljaVar = ((aqjj) aftjVar.b).h;
            if (aljaVar == null) {
                aljaVar = alja.a;
            }
            aliz alizVarA = aliz.a(aljaVar.c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
            Context context = this.k;
            int iA = this.n.a(alizVarA);
            int i = jkl.a;
            if (context != null) {
                Drawable drawableC = ok.e().c(context, iA);
                ColorStateList colorStateListA = avt.a(context.getResources(), R.color.tab_header_color_tint_list, context.getTheme());
                if (drawableC != null) {
                    drawableMutate = drawableC.mutate();
                    drawableMutate.setTintList(colorStateListA);
                }
            }
            appCompatImageView2.setImageDrawable(drawableMutate);
            appCompatImageView = appCompatImageView2;
        }
        return new jhq(appCompatImageView, view, view2, aftjVar);
    }

    public final aftj D(int i) {
        if (i < 0 || i >= this.a.c().size()) {
            return null;
        }
        return ((jhq) this.a.c().get(c(i))).d;
    }

    public final int c(int i) {
        return (getLayoutDirection() != 1 || B()) ? i : (this.a.a() - i) - 1;
    }

    public final int d() {
        return this.a.c().size();
    }

    @Override // defpackage.afdf
    public final void e(afdk afdkVar) {
        int iC = afdkVar == null ? -1 : c(afdkVar.c);
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((jol) ((jnd) it.next()).a).j(iC, this.m);
        }
    }

    @Override // defpackage.afdf
    public final void f(afdk afdkVar) {
        w(((jhq) this.a.c().get(afdkVar.c)).b);
        q(c(afdkVar.c));
    }

    @Override // defpackage.afdf
    public final void g(afdk afdkVar) {
        w(null);
        c(afdkVar.c);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((jhv) it.next()).hA();
        }
    }

    public final int h() {
        return c(this.b.a());
    }

    public final View i() {
        return this.a.b();
    }

    public final View j(int i) {
        int iC = c(i);
        if (iC < 0 || iC >= this.b.b()) {
            return null;
        }
        afdk afdkVarC = this.b.c(iC);
        afdkVarC.getClass();
        return afdkVarC.g;
    }

    public final void k(jhu jhuVar) {
        this.d.add(jhuVar);
    }

    public final void l(jhv jhvVar) {
        this.e.add(jhvVar);
    }

    public final void m() {
        this.p.b();
    }

    public final void n() {
        this.p.a();
    }

    public final void o() {
        this.h = true;
        this.c.setVisibility(8);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        G();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.j();
    }

    public final void p(Runnable runnable) {
        this.m = true;
        runnable.run();
        this.m = false;
    }

    public final void q(int i) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((jhu) it.next()).a(i, this.m);
        }
    }

    public final void r(int i) {
        if (this.b.b() == this.a.c().size()) {
            boolean z = false;
            int iC = i != -1 ? c(i) : c(0);
            int i2 = 0;
            while (true) {
                if (i2 >= this.a.c().size()) {
                    break;
                }
                jhq jhqVar = (jhq) this.a.c().get(i2);
                afdk afdkVarC = this.b.c(i2);
                afdkVarC.getClass();
                afdkVarC.d(jhqVar.a);
                if (i == -1 && ((aqjj) jhqVar.d.b).f) {
                    iC = i2;
                }
                boolean z2 = ((aqjj) jhqVar.d.b).g;
                boolean z3 = !z2;
                afdk afdkVarC2 = this.b.c(i2);
                if (afdkVarC2 != null) {
                    afdkVarC2.g.setEnabled(z3);
                    afdkVarC2.g.setAlpha(true != z2 ? 1.0f : 0.3f);
                }
                i2++;
            }
            boolean zA = A();
            tuk.l(this.b, zA);
            View view = this.c;
            if (zA && !this.h) {
                z = true;
            }
            tuk.l(view, z);
            this.a.k(iC);
            if (B()) {
                return;
            }
            this.b.p(this.a.c().size() > 3 ? 2 : 1);
        }
    }

    @Deprecated
    public final void s(TabLayout tabLayout) {
        TabLayout tabLayout2 = this.b;
        int iIndexOfChild = tabLayout2 != null ? indexOfChild(tabLayout2) : 0;
        E(tabLayout);
        addView(tabLayout, iIndexOfChild);
        z(tabLayout);
    }

    public final void t(izf izfVar) {
        izfVar.getClass();
        this.n = izfVar;
    }

    public final void u(boolean z) {
        this.a.g(z);
    }

    public final void v() {
        if (B()) {
            return;
        }
        s((TabLayout) LayoutInflater.from(this.k).inflate(R.layout.always_gravity_fill_sentence_case_tab_layout, (ViewGroup) null));
    }

    public final void w(View view) {
        View view2 = this.j;
        if (view2 != null) {
            removeView(view2);
        }
        if (view != null) {
            int i = 0;
            while (i < getChildCount()) {
                int i2 = i + 1;
                if (getChildAt(i) == this.b) {
                    addView(view, i2);
                    this.j = view;
                    return;
                }
                i = i2;
            }
        }
    }

    public final void x(int i, int i2) {
        this.b.q(i, i2);
    }

    public final void y(int i) {
        this.b.setBackgroundColor(i);
    }

    public final void z(TabLayout tabLayout) {
        tabLayout.getClass();
        TabLayout tabLayout2 = this.b;
        if (tabLayout2 != null) {
            removeView(tabLayout2);
            this.b.k(this);
        }
        this.b = tabLayout;
        G();
        if (!B()) {
            TabLayout tabLayout3 = this.b;
            int i = bac.a;
            tabLayout3.setLayoutDirection(0);
        }
        this.b.e(this);
        this.a.h(this.b);
    }

    public TabbedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        F(context, attributeSet);
    }

    public TabbedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        F(context, attributeSet);
    }
}
