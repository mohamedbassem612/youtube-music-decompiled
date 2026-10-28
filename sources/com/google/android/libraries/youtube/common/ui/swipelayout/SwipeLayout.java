package com.google.android.libraries.youtube.common.ui.swipelayout;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.adgm;
import defpackage.bac;
import defpackage.bdq;
import defpackage.bdr;
import defpackage.ble;
import defpackage.blf;
import defpackage.blg;
import defpackage.jfk;
import defpackage.saa;
import defpackage.tvo;
import defpackage.tvq;
import defpackage.tvt;
import defpackage.tvu;
import defpackage.tvv;
import defpackage.twm;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class SwipeLayout extends FrameLayout {
    private static final int[] x = {R.attr.state_enabled, R.attr.state_pressed};
    private static final int[] y = new int[0];
    private static final blg z;
    private int A;
    private bdr B;
    private blf C;
    private GestureDetector D;
    private final PointF E;
    private final blg F;
    private final GestureDetector.SimpleOnGestureListener G;
    public int a;
    public int b;
    public boolean c;
    public View d;
    public VelocityTracker e;
    public int f;
    public View g;
    public Drawable h;
    public boolean i;
    public View j;
    public Drawable k;
    public boolean l;
    public float m;
    public boolean n;
    public boolean o;
    public float p;
    public boolean q;
    public float r;
    public Drawable s;
    public Drawable t;
    final bdq u;
    public jfk v;
    public jfk w;

    static {
        blg blgVar = new blg(0.0f);
        blgVar.e(1500.0f);
        blgVar.c(1.0f);
        z = blgVar;
    }

    public SwipeLayout(Context context) {
        super(context);
        this.c = false;
        this.i = true;
        this.l = true;
        this.E = new PointF();
        this.F = z;
        this.u = new tvt(this);
        this.G = new tvu(this);
        w(context, null, 0, 0);
    }

    private final void w(Context context, AttributeSet attributeSet, int i, int i2) {
        this.D = new GestureDetector(getContext(), this.G);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.a = twm.c(getResources().getDisplayMetrics(), 40);
        this.b = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A = twm.c(getResources().getDisplayMetrics(), 5);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tvo.a, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
            this.g = viewInflate;
            n(viewInflate);
        }
        this.h = typedArrayObtainStyledAttributes.getDrawable(2);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            View viewInflate2 = LayoutInflater.from(getContext()).inflate(resourceId2, (ViewGroup) this, false);
            this.j = viewInflate2;
            l(viewInflate2);
        }
        this.k = typedArrayObtainStyledAttributes.getDrawable(0);
        this.m = 0.3f;
        this.n = false;
        this.o = false;
        this.p = Float.MAX_VALUE;
        this.q = false;
        this.r = Float.MAX_VALUE;
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void x(int i) {
        View view = this.d;
        if (view != null) {
            int left = i - view.getLeft();
            int i2 = bac.a;
            view.offsetLeftAndRight(left);
            if (!e().l) {
                e().h(i);
            }
            y();
        }
    }

    private final void y() {
        int i = this.f;
        boolean z2 = i > 0;
        Drawable drawable = z2 ? this.h : null;
        int i2 = i >>> 31;
        if (i < 0) {
            drawable = this.k;
        }
        setBackground(drawable);
        View view = this.g;
        if (view != null) {
            view.setVisibility(true != z2 ? 8 : 0);
        }
        View view2 = this.j;
        if (view2 != null) {
            view2.setVisibility(1 != i2 ? 8 : 0);
        }
    }

    public final int a() {
        View viewC = c();
        if (viewC != null) {
            return viewC.getWidth();
        }
        return 0;
    }

    public final int b() {
        View viewD = d();
        if (viewD != null) {
            return viewD.getWidth();
        }
        return 0;
    }

    public final View c() {
        return t() ? this.j : this.g;
    }

    public final View d() {
        return t() ? this.g : this.j;
    }

    public final blf e() {
        blf blfVar = this.C;
        if (blfVar != null) {
            return blfVar;
        }
        blf blfVar2 = new blf(new ble());
        blfVar2.p = this.F;
        blfVar2.f(new adgm(this, 1));
        blfVar2.h(0.0f);
        this.C = blfVar2;
        return blfVar2;
    }

    public final Optional f() {
        return Optional.ofNullable(t() ? this.v : this.w);
    }

    public final Optional g() {
        return Optional.ofNullable(t() ? this.w : this.v);
    }

    public final void h() {
        e().j();
        o(0);
    }

    public final void i(View view, tvv tvvVar, float f) {
        if (view != null) {
            if (view.getWidth() == 0) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(new tvq(this, getClass().getSimpleName(), view, tvvVar, f));
            } else {
                p(((Integer) tvvVar.a()).intValue(), f);
            }
        }
    }

    public final void j() {
        Drawable background = this.d.getBackground();
        Drawable drawable = this.t;
        if (background != drawable) {
            this.d.setBackground(drawable);
        }
    }

    public final void k(Drawable drawable) {
        this.k = drawable;
        y();
    }

    public final void l(View view) {
        View view2 = this.j;
        if (view != view2) {
            if (view2 != null) {
                removeView(view2);
            }
            this.j = view;
            if (view != null) {
                addView(view, 0);
            } else if (this.f < 0) {
                o(0);
            }
        }
    }

    public final void m(Drawable drawable) {
        this.h = drawable;
        y();
    }

    public final void n(View view) {
        View view2 = this.g;
        if (view != view2) {
            if (view2 != null) {
                removeView(view2);
            }
            this.g = view;
            if (view != null) {
                addView(view, 0);
            } else if (this.f > 0) {
                o(0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    public final void o(int i) {
        Optional optionalF;
        saa saaVar;
        boolean z2 = (i > 0 && !v()) || (i < 0 && !s());
        if (z2 && this.c) {
            this.f = (int) (i * 0.3f);
            boolean zT = t();
            int i2 = this.f;
            if (zT) {
                i2 = -i2;
            }
            x(i2);
            return;
        }
        int i3 = this.f;
        if (true == z2) {
            i = 0;
        }
        this.f = i;
        if (i3 == 0) {
            if (i < 0) {
                Optional optionalG = g();
                saa saaVar2 = new saa(this, 12);
                if (true == optionalG.isPresent()) {
                    ((jfk) optionalG.get()).a(0, ((SwipeLayout) saaVar2.a).f);
                }
            } else if (i > 0) {
                optionalF = f();
                saaVar = new saa(this, 13);
                if (true == optionalF.isPresent()) {
                    ((jfk) optionalF.get()).a(0, ((SwipeLayout) saaVar.a).f);
                }
            }
        } else if (i3 == 0) {
            if (i > 0) {
                optionalF = f();
                saaVar = new saa(this, 13);
                if (true == optionalF.isPresent()) {
                    ((jfk) optionalF.get()).a(0, ((SwipeLayout) saaVar.a).f);
                }
            }
        }
        boolean zT2 = t();
        int i4 = this.f;
        if (zT2) {
            i4 = -i4;
        }
        x(i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View childAt = getChildAt(getChildCount() - 1);
        this.d = childAt;
        this.t = childAt.getBackground();
        bdr bdrVarB = bdr.b(this, this.u);
        bdrVarB.b = bdrVarB.b;
        this.B = bdrVarB;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (v() || s()) ? this.B.j(motionEvent) : super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        View view = this.g;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity = 8388611;
            this.g.setVisibility(4);
        }
        View view2 = this.j;
        if (view2 != null) {
            ((FrameLayout.LayoutParams) view2.getLayoutParams()).gravity = 8388613;
            this.j.setVisibility(4);
        }
        super.onLayout(z2, i, i2, i3, i4);
        int i5 = this.f;
        if (t()) {
            i5 = -i5;
        }
        x(i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0074, code lost:
    
        if (r0 != 3) goto L53;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i, float f) {
        int left = this.d.getLeft();
        if (left != i || e().l) {
            if (!e().l) {
                blf blfVarE = e();
                blfVarE.h(left);
                blfVarE.g = f;
            }
            e().i(i);
        }
    }

    public final void q(float f, float f2) {
        Drawable background = this.d.getBackground();
        if (background instanceof RippleDrawable) {
            this.d.drawableHotspotChanged(f, f2);
            ((RippleDrawable) background).setState(x);
        }
    }

    public final void r() {
        Drawable background = this.d.getBackground();
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setState(y);
        }
    }

    public final boolean s() {
        return this.l && this.j != null;
    }

    public final boolean t() {
        int i = bac.a;
        return getLayoutDirection() == 1;
    }

    public final boolean u() {
        return this.f != 0;
    }

    public final boolean v() {
        return this.i && this.g != null;
    }

    public SwipeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
        this.i = true;
        this.l = true;
        this.E = new PointF();
        this.F = z;
        this.u = new tvt(this);
        this.G = new tvu(this);
        w(context, attributeSet, 0, 0);
    }

    public SwipeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
        this.i = true;
        this.l = true;
        this.E = new PointF();
        this.F = z;
        this.u = new tvt(this);
        this.G = new tvu(this);
        w(context, attributeSet, i, 0);
    }

    public SwipeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = false;
        this.i = true;
        this.l = true;
        this.E = new PointF();
        this.F = z;
        this.u = new tvt(this);
        this.G = new tvu(this);
        w(context, attributeSet, i, i2);
    }
}
