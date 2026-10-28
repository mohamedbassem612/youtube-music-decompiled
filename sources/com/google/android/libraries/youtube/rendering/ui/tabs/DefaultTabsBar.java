package com.google.android.libraries.youtube.rendering.ui.tabs;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import defpackage.aedi;
import defpackage.aeej;
import defpackage.aeek;
import defpackage.aeel;
import defpackage.avbi;
import defpackage.dty;
import defpackage.ttk;
import defpackage.tzk;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class DefaultTabsBar extends aeej implements dty {
    private int A;
    private int B;
    public Context f;
    public LayoutInflater g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public int l;
    int m;
    public ColorStateList n;
    public int o;
    public int p;
    public ttk q;
    public Optional r;
    aeel s;
    public avbi t;
    private float u;
    private Rect v;
    private Paint w;
    private Rect x;
    private Paint y;
    private int z;

    public DefaultTabsBar(Context context) {
        super(context);
        this.r = Optional.empty();
        q(context, null);
    }

    private final int p(View view) {
        View viewFindViewById;
        ViewGroup.LayoutParams layoutParams;
        if (!this.h || view.equals(e(0)) || (viewFindViewById = view.findViewById(R.id.tabs_bar_text_tab_separator)) == null || viewFindViewById.getVisibility() != 0 || (layoutParams = viewFindViewById.getLayoutParams()) == null || layoutParams.width <= 0) {
            return 0;
        }
        return layoutParams.width;
    }

    private final void q(Context context, AttributeSet attributeSet) {
        this.f = context;
        this.g = LayoutInflater.from(context);
        Resources resources = context.getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aeek.a);
        this.B = resources.getDimensionPixelSize(R.dimen.default_tabs_separator_width);
        this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, resources.getDimensionPixelSize(R.dimen.default_tabs_scroll_margin));
        l(typedArrayObtainStyledAttributes.getColorStateList(3));
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, resources.getDimensionPixelSize(R.dimen.default_tabs_highlight_height));
        int color = typedArrayObtainStyledAttributes.getColor(4, resources.getColor(android.R.color.white));
        this.i = typedArrayObtainStyledAttributes.getResourceId(7, R.layout.tabs_bar_text_tab);
        this.j = typedArrayObtainStyledAttributes.getResourceId(7, R.layout.tabs_bar_text_tab_pre_modern);
        this.k = typedArrayObtainStyledAttributes.getResourceId(8, R.id.text);
        typedArrayObtainStyledAttributes.getResourceId(2, R.layout.tabs_bar_image_tab);
        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, resources.getDimensionPixelSize(R.dimen.default_tabs_bottom_divider_height));
        int color2 = typedArrayObtainStyledAttributes.getColor(0, resources.getColor(android.R.color.transparent));
        typedArrayObtainStyledAttributes.recycle();
        this.x = new Rect();
        Paint paint = new Paint();
        this.y = paint;
        paint.setStyle(Paint.Style.FILL);
        this.y.setColor(color2);
        resources.getDimensionPixelSize(R.dimen.tabs_bar_brand_indicator_width);
        resources.getDimensionPixelSize(R.dimen.tabs_bar_brand_indicator_offset);
        this.v = new Rect();
        Paint paint2 = new Paint();
        this.w = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.w.setColor(color);
        tzk.n(context, R.attr.ytStaticBrandRed).orElse(color);
        setFillViewport(true);
        this.t = new avbi(this, this.a);
        this.s = new aeel(this);
    }

    private static final void r(View view, boolean z) {
        View viewFindViewById = view.findViewById(R.id.tabs_bar_text_tab_separator);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(true != z ? 8 : 0);
        }
    }

    @Override // defpackage.dty
    public final void b(int i, float f, int i2) {
        o(i, f, true);
    }

    @Override // defpackage.dty
    public final void c(int i) {
        h(i);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        View viewE;
        Canvas canvas2;
        View viewE2;
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (view == this.a && d() != 0 && (i = this.l) != this.t.b && (viewE = e(i)) != null) {
            int layoutDirection = getLayoutDirection();
            int iJ = j(viewE, layoutDirection);
            int i2 = i(viewE, layoutDirection);
            int i3 = this.l;
            int i4 = layoutDirection == 1 ? i3 - 1 : i3 + 1;
            int i5 = i3 + 1;
            int i6 = this.t.b;
            if (this.u > 0.0f && i4 >= 0 && i4 < d() && i5 != i6 && (viewE2 = e(i4)) != null) {
                int iJ2 = j(viewE2, layoutDirection);
                int i7 = i(viewE2, layoutDirection);
                iJ += Math.round((iJ2 - iJ) * this.u);
                i2 += Math.round((i7 - i2) * this.u);
            }
            if (this.h) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawRect(this.x.left, this.x.top, this.x.right, this.x.bottom, this.y);
            }
            aeel aeelVar = this.s;
            this.w.getClass();
            float f = aeelVar.b;
            RectF rectF = new RectF(iJ, this.v.top, i2, this.v.bottom);
            if (this.h) {
                float f2 = this.m * 0.5f;
                canvas2.drawRoundRect(rectF, f2, f2, this.w);
            } else {
                canvas2.drawRect(rectF, this.w);
            }
            Paint paint = this.w;
            paint.getClass();
            paint.clearShadowLayer();
        }
        return zDrawChild;
    }

    @Override // defpackage.aeej
    protected final void g(int i, boolean z) {
        View viewE;
        if (i >= 0 && i < d() && (viewE = e(i)) != null) {
            viewE.setActivated(z);
            viewE.setSelected(z);
            aedi.i(viewE);
        }
        avbi avbiVar = this.t;
        if (i == avbiVar.b) {
            Object obj = avbiVar.d;
        }
    }

    @Override // defpackage.aeej
    public final void h(int i) {
        int i2 = this.b;
        if (i2 != i) {
            this.b = i;
            g(i2, false);
            g(this.b, true);
        }
    }

    final int i(View view, int i) {
        return (this.h && i == 1 && this.l > 0) ? view.getRight() - p(view) : view.getRight();
    }

    final int j(View view, int i) {
        return (this.h && i == 0 && this.l > 0) ? view.getLeft() + p(view) : view.getLeft();
    }

    public final void k(int i, int i2) {
        ttk ttkVar = this.q;
        ttkVar.getClass();
        this.o = i;
        this.p = i2;
        if (ttkVar != null) {
            float fAlpha = Color.alpha(i2);
            TypedValue typedValue = ttkVar.i;
            ttkVar.h.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true);
            l(new ColorStateList(new int[][]{ttk.a, ttk.b, ttk.c, ttk.d, ttk.e, ttk.f, ttk.g}, new int[]{(16777215 & i2) | (Math.round(fAlpha * typedValue.getFloat()) << 24), i, i, i, i, i, i2}));
        }
    }

    public final void l(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        colorStateList.getClass();
        this.n = colorStateList;
        for (int i = 0; i < d(); i++) {
            View viewE = e(i);
            if (viewE != null && (colorStateList2 = this.n) != null) {
                m(viewE, colorStateList2);
                View viewFindViewById = viewE.findViewById(this.k);
                if (viewFindViewById != null) {
                    m(viewFindViewById, this.n);
                }
                View viewFindViewById2 = viewE.findViewById(R.id.image);
                if (viewFindViewById2 != null) {
                    m(viewFindViewById2, this.n);
                }
                if (viewE instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) viewE;
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        m(viewGroup.getChildAt(i2), this.n);
                    }
                }
            }
        }
    }

    public final void m(View view, ColorStateList colorStateList) {
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(colorStateList);
        }
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            if (this.q != null) {
                imageView.setImageDrawable(ttk.c(imageView.getDrawable(), colorStateList));
            }
        }
    }

    public final void n() {
        if (this.h) {
            int i = 0;
            while (i < d()) {
                View viewE = e(i);
                if (viewE != null) {
                    if (i != 0) {
                        if (i == 1) {
                            i = 1;
                        }
                        r(viewE, true);
                        View viewFindViewById = viewE.findViewById(R.id.tabs_bar_text_tab_separator);
                        if (viewFindViewById != null) {
                            int i2 = this.B;
                            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                            if (layoutParams != null && layoutParams.width != i2) {
                                layoutParams.width = i2;
                                viewFindViewById.setLayoutParams(layoutParams);
                            }
                        }
                    } else {
                        r(viewE, false);
                        i = 0;
                    }
                }
                i++;
            }
        }
    }

    public final void o(int i, float f, boolean z) {
        View viewE;
        this.l = i;
        this.u = f;
        invalidate(this.v);
        avbi avbiVar = this.t;
        int i2 = avbiVar.b;
        avbiVar.e();
        getLayoutDirection();
        if (!z || (viewE = e(this.l)) == null) {
            return;
        }
        int left = viewE.getLeft() + ((int) (viewE.getWidth() * f));
        avbi avbiVar2 = this.t;
        if (avbiVar2 != null) {
            avbiVar2.e();
        }
        int i3 = this.z;
        scrollTo(i != 0 ? left - i3 : left - ((int) (i3 * f)), 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.s.c;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.t.e();
        int i5 = i4 - i2;
        this.v.set(0, i5 - this.m, i3 - i, i5);
        this.x.set(i, i5 - this.A, this.a.getWidth() + i, i5);
        this.t.e();
        d();
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        avbi avbiVar = this.t;
        if (avbiVar != null) {
            avbiVar.e();
        }
    }

    public DefaultTabsBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = Optional.empty();
        q(context, attributeSet);
    }

    public DefaultTabsBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = Optional.empty();
        q(context, attributeSet);
    }

    @Override // defpackage.dty
    public final void a(int i) {
    }
}
