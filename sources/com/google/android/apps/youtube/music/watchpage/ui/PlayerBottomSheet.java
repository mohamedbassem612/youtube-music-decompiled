package com.google.android.apps.youtube.music.watchpage.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;
import com.google.android.material.tabs.TabLayout;
import defpackage.avt;
import defpackage.hww;
import defpackage.jnj;
import defpackage.jpf;
import defpackage.jpj;
import defpackage.jpl;
import defpackage.kjc;
import defpackage.tuk;
import defpackage.vxz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PlayerBottomSheet extends jpf {
    public final int a;
    public View b;
    public TabbedView c;
    public View d;
    public final float e;
    public hww f;
    public vxz g;
    public jnj h;
    public kjc i;
    private final int j;
    private final int k;

    public PlayerBottomSheet(Context context, AttributeSet attributeSet) {
        float f;
        super(context, attributeSet);
        this.f = hww.a;
        setOutlineProvider(new jpj(this));
        Resources resources = context.getResources();
        int i = avt.a;
        if (Build.VERSION.SDK_INT >= 29) {
            f = resources.getFloat(R.dimen.tab_divider_alpha);
        } else {
            TypedValue typedValueC = avt.c();
            resources.getValue(R.dimen.tab_divider_alpha, typedValueC, true);
            if (typedValueC.type != 4) {
                throw new Resources.NotFoundException("Resource ID #0x7f07100a type #0x" + Integer.toHexString(typedValueC.type) + " is not valid");
            }
            f = typedValueC.getFloat();
        }
        this.e = f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jpl.a);
        this.j = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.k = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.a = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void i() {
        setClipToOutline(!h());
    }

    private final void j() {
        tuk.l(this.b, !h());
        if (this.h.r() || this.b == null || h()) {
            return;
        }
        this.b.setVisibility(4);
    }

    public final View c() {
        return this.c.i();
    }

    final View d() {
        return this.c.b;
    }

    public final void e(float f) {
        if (true != h()) {
            f = 1.0f;
        }
        this.c.setAlpha(f);
        this.c.setImportantForAccessibility(f == 0.0f ? 4 : 0);
    }

    public final void f() {
        if (this.h.r()) {
            return;
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.page_margin);
        View viewD = d();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewD.getLayoutParams();
        if (h() || dimensionPixelSize <= 0) {
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.tab_strip_margin);
        }
        if (layoutParams != null) {
            layoutParams.leftMargin = dimensionPixelSize;
            layoutParams.rightMargin = dimensionPixelSize;
        }
        viewD.requestLayout();
    }

    public final boolean g() {
        return this.h.s() && !h();
    }

    public final boolean h() {
        return this.i.n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j();
        i();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j();
        i();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        int i;
        super.onFinishInflate();
        this.b = findViewById(this.j);
        this.c = (TabbedView) findViewById(this.k);
        if (this.h.r()) {
            this.c.v();
        }
        this.c.u(false);
        TabbedView tabbedView = this.c;
        tabbedView.g = true;
        tabbedView.y(0);
        this.c.i().forceHasOverlappingRendering(false);
        if (this.g.l(132, 45845054L, false)) {
            this.c.forceHasOverlappingRendering(false);
        }
        if (this.h.r()) {
            this.c.i().setImportantForAccessibility(2);
        }
        j();
        TabLayout tabLayout = this.c.b;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tabLayout.getLayoutParams();
        Resources resources = getContext().getResources();
        if (this.g.l(42, 45681452L, false)) {
            i = R.dimen.tab_strip_margin_small;
        } else {
            i = this.h.r() ? R.dimen.tab_strip_margin_extra_small : R.dimen.tab_strip_margin;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        if (layoutParams != null) {
            layoutParams.leftMargin = dimensionPixelSize;
            layoutParams.rightMargin = dimensionPixelSize;
        }
        tabLayout.requestLayout();
        this.c.o();
        if (this.h.r()) {
            return;
        }
        View viewInflate = View.inflate(getContext(), R.layout.player_tab_divider, null);
        this.d = viewInflate;
        TabbedView tabbedView2 = this.c;
        tabbedView2.addView(viewInflate, tabbedView2.indexOfChild(tabLayout) + 1);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.d.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = -1;
            layoutParams2.height = getContext().getResources().getDimensionPixelSize(R.dimen.tab_divider_height);
        }
        this.d.requestLayout();
    }
}
