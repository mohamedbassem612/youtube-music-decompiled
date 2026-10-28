package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;
import defpackage.aetz;
import defpackage.aeum;
import defpackage.aeun;
import defpackage.aeuo;
import defpackage.aeup;
import defpackage.aeut;
import defpackage.aeuv;
import defpackage.aewq;
import defpackage.aeyb;
import defpackage.aeyc;
import defpackage.aeym;
import defpackage.afba;
import defpackage.afcg;
import defpackage.afev;
import defpackage.azs;
import defpackage.bac;
import defpackage.bbn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    private final TimeInterpolator A;
    private int B;
    private aeum C;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private boolean J;
    private int K;
    public final aeyb a;
    public final aeyb b;
    final aewq c;
    public Drawable d;
    public int e;
    public bbn f;
    private boolean g;
    private int h;
    private ViewGroup i;
    private View j;
    private View k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private final Rect q;
    private boolean r;
    private boolean s;
    private final int t;
    private Drawable u;
    private int v;
    private boolean w;
    private ValueAnimator x;
    private long y;
    private final TimeInterpolator z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(afev.b(context, attributeSet, i, R.style.Widget_Design_CollapsingToolbar, new int[0]), attributeSet, i);
        int i2 = afev.a;
        this.g = true;
        this.q = new Rect();
        this.B = -1;
        this.F = 0;
        this.H = 0;
        this.I = 0;
        this.K = 0;
        Context context2 = getContext();
        this.D = getResources().getConfiguration().orientation;
        aeyb aeybVar = new aeyb(this);
        this.a = aeybVar;
        TimeInterpolator timeInterpolator = aetz.e;
        aeybVar.D(timeInterpolator);
        aeybVar.J();
        aewq aewqVar = new aewq(context2);
        this.c = aewqVar;
        int[] iArr = aeut.c;
        aeym.b(context2, attributeSet, i, R.style.Widget_Design_CollapsingToolbar);
        aeym.c(context2, attributeSet, iArr, i, R.style.Widget_Design_CollapsingToolbar, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, R.style.Widget_Design_CollapsingToolbar);
        int i3 = typedArrayObtainStyledAttributes.getInt(9, 8388691);
        int i4 = typedArrayObtainStyledAttributes.getInt(2, 8388627);
        this.t = typedArrayObtainStyledAttributes.getInt(3, 1);
        aeybVar.x(i3);
        aeybVar.s(i4);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        this.o = dimensionPixelSize;
        this.n = dimensionPixelSize;
        this.m = dimensionPixelSize;
        this.l = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(13)) {
            this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(12)) {
            this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 0);
        }
        this.r = typedArrayObtainStyledAttributes.getBoolean(28, true);
        g(typedArrayObtainStyledAttributes.getText(26));
        aeybVar.v(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        aeybVar.q(2132083775);
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            aeybVar.v(typedArrayObtainStyledAttributes.getResourceId(16, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            aeybVar.q(typedArrayObtainStyledAttributes.getResourceId(4, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(31)) {
            int i5 = typedArrayObtainStyledAttributes.getInt(31, -1);
            aeybVar.j = i5 != 0 ? i5 != 1 ? i5 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START;
            aeybVar.l(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            aeybVar.w(afba.f(context2, typedArrayObtainStyledAttributes, 17));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            aeybVar.r(afba.f(context2, typedArrayObtainStyledAttributes, 5));
        }
        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(22, -1);
        if (typedArrayObtainStyledAttributes.hasValue(29)) {
            aeybVar.u(typedArrayObtainStyledAttributes.getInt(29, 1));
        } else if (typedArrayObtainStyledAttributes.hasValue(20)) {
            aeybVar.u(typedArrayObtainStyledAttributes.getInt(20, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(30)) {
            aeybVar.B(AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(30, 0)));
        }
        aeyb aeybVar2 = new aeyb(this);
        this.b = aeybVar2;
        aeybVar2.D(timeInterpolator);
        aeybVar2.J();
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            f(typedArrayObtainStyledAttributes.getText(24));
        }
        aeybVar2.x(i3);
        aeybVar2.s(i4);
        aeybVar2.v(2132083752);
        aeybVar2.q(2132083773);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            aeybVar2.v(typedArrayObtainStyledAttributes.getResourceId(7, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            aeybVar2.q(typedArrayObtainStyledAttributes.getResourceId(0, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            aeybVar2.w(afba.f(context2, typedArrayObtainStyledAttributes, 8));
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            aeybVar2.r(afba.f(context2, typedArrayObtainStyledAttributes, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(25)) {
            aeybVar2.u(typedArrayObtainStyledAttributes.getInt(25, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(30)) {
            aeybVar2.B(AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(30, 0)));
        }
        this.y = typedArrayObtainStyledAttributes.getInt(21, 600);
        this.z = afba.y(context2, R.attr.motionEasingStandardInterpolator, aetz.c);
        this.A = afba.y(context2, R.attr.motionEasingStandardInterpolator, aetz.d);
        d(typedArrayObtainStyledAttributes.getDrawable(6));
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(23);
        Drawable drawable2 = this.d;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.d = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.d.setState(getDrawableState());
                }
                this.d.setLayoutDirection(getLayoutDirection());
                this.d.setVisible(getVisibility() == 0, false);
                this.d.setCallback(this);
                this.d.setAlpha(this.v);
            }
            postInvalidateOnAnimation();
        }
        this.E = typedArrayObtainStyledAttributes.getInt(27, 0);
        boolean zQ = q();
        aeybVar.b = zQ;
        aeybVar2.b = zQ;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            j((AppBarLayout) parent);
        }
        if (zQ && this.u == null) {
            ColorStateList colorStateListN = afba.N(getContext(), R.attr.colorSurfaceContainer);
            d(new ColorDrawable(colorStateListN != null ? colorStateListN.getDefaultColor() : aewqVar.a(aewqVar.b, getResources().getDimension(R.dimen.design_appbar_elevation))));
        }
        this.h = typedArrayObtainStyledAttributes.getResourceId(32, -1);
        this.G = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.J = typedArrayObtainStyledAttributes.getBoolean(18, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        aeun aeunVar = new aeun(this);
        int i6 = bac.a;
        azs.c(this, aeunVar);
    }

    public static aeuv c(View view) {
        aeuv aeuvVar = (aeuv) view.getTag(R.id.view_offset_helper);
        if (aeuvVar != null) {
            return aeuvVar;
        }
        aeuv aeuvVar2 = new aeuv(view);
        view.setTag(R.id.view_offset_helper, aeuvVar2);
        return aeuvVar2;
    }

    private static int i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final void j(AppBarLayout appBarLayout) {
        if (q()) {
            appBarLayout.e = false;
        }
    }

    private final void k() {
        View view;
        View view2;
        if (this.g) {
            ViewGroup viewGroup = null;
            this.i = null;
            this.j = null;
            int i = this.h;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.i = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    while (true) {
                        if (parent == this) {
                            view2 = viewGroup2;
                            break;
                        } else {
                            if (parent == null) {
                                break;
                            }
                            if (parent instanceof View) {
                                view2 = (View) parent;
                            }
                            parent = parent.getParent();
                            view2 = view2;
                        }
                    }
                    this.j = view2;
                }
            }
            if (this.i == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.i = viewGroup;
            }
            if (!this.r && (view = this.k) != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(this.k);
                }
            }
            if (this.r && this.i != null) {
                View view3 = this.k;
                if (view3 == null) {
                    view3 = new View(getContext());
                    this.k = view3;
                }
                if (view3.getParent() == null) {
                    this.i.addView(this.k, -1, -1);
                }
            }
            this.g = false;
        }
    }

    private final void l() {
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (appBarLayout.b == 0) {
                appBarLayout.b = 2;
            }
        }
    }

    private final void m(Drawable drawable, int i, int i2) {
        n(drawable, this.i, i, i2);
    }

    private final void n(Drawable drawable, View view, int i, int i2) {
        if (q() && view != null && this.r) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    private final void o(int i, int i2, int i3, int i4, boolean z) {
        View view;
        boolean z2;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.r || (view = this.k) == null) {
            return;
        }
        int titleMarginStart = 0;
        boolean z3 = view.isAttachedToWindow() && this.k.getVisibility() == 0;
        this.s = z3;
        if (z3) {
            z2 = z;
        } else if (!z) {
            return;
        } else {
            z2 = true;
        }
        int layoutDirection = getLayoutDirection();
        boolean z4 = layoutDirection == 1;
        View view2 = this.j;
        if (view2 == null) {
            view2 = this.i;
        }
        int iA = a(view2);
        View view3 = this.k;
        Rect rect = this.q;
        aeyc.a(this, view3, rect);
        ViewGroup viewGroup = this.i;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            titleMarginStart = toolbar.n;
            titleMarginEnd = toolbar.o;
            titleMarginTop = toolbar.p;
            titleMarginBottom = toolbar.q;
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            titleMarginStart = toolbar2.getTitleMarginStart();
            titleMarginEnd = toolbar2.getTitleMarginEnd();
            titleMarginTop = toolbar2.getTitleMarginTop();
            titleMarginBottom = toolbar2.getTitleMarginBottom();
        } else {
            titleMarginBottom = 0;
            titleMarginEnd = 0;
            titleMarginTop = 0;
        }
        int i5 = rect.left;
        int i6 = layoutDirection == 1 ? titleMarginEnd : titleMarginStart;
        int i7 = i5 + i6;
        int i8 = rect.right;
        if (layoutDirection != 1) {
            titleMarginStart = titleMarginEnd;
        }
        int i9 = i8 - titleMarginStart;
        int i10 = rect.top + iA;
        int i11 = rect.bottom + iA;
        aeyb aeybVar = this.b;
        int i12 = i11 - titleMarginBottom;
        float fA = i12 - aeybVar.a();
        aeyb aeybVar2 = this.a;
        int i13 = i10 + titleMarginTop;
        int iA2 = (int) (i13 + aeybVar2.a());
        int i14 = (int) fA;
        if (TextUtils.isEmpty(aeybVar.k)) {
            aeybVar2.o(i7, i13, i9, i12);
        } else {
            aeybVar2.o(i7, i13, i9, i14);
            aeybVar.o(i7, iA2, i9, i12);
        }
        if (this.t == 0) {
            aeyc.a(this, this, rect);
            int i15 = rect.left + i6;
            int i16 = rect.right - titleMarginStart;
            if (TextUtils.isEmpty(aeybVar.k)) {
                aeybVar2.p(i15, i13, i16, i12);
            } else {
                aeybVar2.p(i15, i13, i16, i14);
                aeybVar.p(i15, iA2, i16, i12);
            }
        }
        int i17 = z4 ? this.n : this.l;
        int i18 = rect.top + this.m;
        int i19 = (i3 - i) - (z4 ? this.l : this.n);
        int i20 = (i4 - i2) - this.o;
        if (TextUtils.isEmpty(aeybVar.k)) {
            aeybVar2.t(i17, i18, i19, i20, true);
            aeybVar2.l(z2);
        } else {
            aeybVar2.t(i17, i18, i19, (int) ((i20 - (aeybVar.d() + this.I)) - this.p), false);
            aeybVar.t(i17, (int) (i18 + aeybVar2.d() + this.H + this.p), i19, i20, false);
            aeybVar2.l(z2);
            aeybVar.l(z2);
        }
    }

    private final void p() {
        CharSequence title;
        ViewGroup viewGroup = this.i;
        if (viewGroup == null || !this.r) {
            return;
        }
        CharSequence subtitle = null;
        if (viewGroup instanceof Toolbar) {
            title = ((Toolbar) viewGroup).r;
        } else {
            title = viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
        }
        if (TextUtils.isEmpty(this.a.k) && !TextUtils.isEmpty(title)) {
            g(title);
        }
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 instanceof Toolbar) {
            subtitle = ((Toolbar) viewGroup2).s;
        } else if (viewGroup2 instanceof android.widget.Toolbar) {
            subtitle = ((android.widget.Toolbar) viewGroup2).getSubtitle();
        }
        if (!TextUtils.isEmpty(this.b.k) || TextUtils.isEmpty(subtitle)) {
            return;
        }
        f(subtitle);
    }

    private final boolean q() {
        return this.E == 1;
    }

    public final int a(View view) {
        return ((getHeight() - c(view).a) - view.getHeight()) - ((aeuo) view.getLayoutParams()).bottomMargin;
    }

    public final int b() {
        int i = this.B;
        if (i >= 0) {
            return i + this.F + this.H + this.I + this.K;
        }
        bbn bbnVar = this.f;
        int iD = bbnVar != null ? bbnVar.d() : 0;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight << 1) + iD, getHeight()) : getHeight() / 3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof aeuo;
    }

    public final void d(Drawable drawable) {
        Drawable drawable2 = this.u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.u = drawableMutate;
            if (drawableMutate != null) {
                m(drawableMutate, getWidth(), getHeight());
                this.u.setCallback(this);
                this.u.setAlpha(this.v);
            }
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        k();
        if (this.i == null && (drawable = this.u) != null && this.v > 0) {
            drawable.mutate().setAlpha(this.v);
            this.u.draw(canvas);
        }
        if (this.r && this.s) {
            if (this.i == null || this.u == null || this.v <= 0 || !q()) {
                this.a.h(canvas);
                this.b.h(canvas);
            } else {
                aeyb aeybVar = this.a;
                if (aeybVar.a < aeybVar.c) {
                    int iSave = canvas.save();
                    canvas.clipRect(this.u.getBounds(), Region.Op.DIFFERENCE);
                    aeybVar.h(canvas);
                    this.b.h(canvas);
                    canvas.restoreToCount(iSave);
                } else {
                    this.a.h(canvas);
                    this.b.h(canvas);
                }
            }
        }
        if (this.d == null || this.v <= 0) {
            return;
        }
        bbn bbnVar = this.f;
        int iD = bbnVar != null ? bbnVar.d() : 0;
        if (iD > 0) {
            this.d.setBounds(0, -this.e, getWidth(), iD - this.e);
            this.d.mutate().setAlpha(this.v);
            this.d.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.u;
        if (drawable == null || this.v <= 0 || ((view2 = this.j) == null || view2 == this ? view != this.i : view != view2)) {
            z = false;
        } else {
            n(drawable, view, getWidth(), getHeight());
            this.u.mutate().setAlpha(this.v);
            this.u.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.d;
        boolean zH = false;
        if (drawable != null && drawable.isStateful()) {
            zH = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.u;
        if (drawable2 != null && drawable2.isStateful()) {
            zH |= drawable2.setState(drawableState);
        }
        aeyb aeybVar = this.a;
        if (aeybVar != null) {
            zH |= aeybVar.H(drawableState);
        }
        if (zH) {
            invalidate();
        }
    }

    public final void e(int i) {
        ViewGroup viewGroup;
        if (i != this.v) {
            if (this.u != null && (viewGroup = this.i) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.v = i;
            postInvalidateOnAnimation();
        }
    }

    public final void f(CharSequence charSequence) {
        this.b.C(charSequence);
    }

    public final void g(CharSequence charSequence) {
        aeyb aeybVar = this.a;
        aeybVar.C(charSequence);
        setContentDescription(this.r ? aeybVar.k : null);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new aeuo();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aeuo(getContext(), attributeSet);
    }

    public final void h() {
        if (this.u == null && this.d == null) {
            return;
        }
        int height = getHeight() + this.e;
        int iB = b();
        boolean z = height < iB;
        boolean z2 = isLaidOut() && !isInEditMode();
        if (this.w != z) {
            int i = height < iB ? 255 : 0;
            if (z2) {
                k();
                ValueAnimator valueAnimator = this.x;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.x = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.v ? this.z : this.A);
                    this.x.addUpdateListener(new afcg(this, 1));
                } else if (valueAnimator.isRunning()) {
                    this.x.cancel();
                }
                this.x.setDuration(this.y);
                this.x.setIntValues(this.v, i);
                this.x.start();
            } else {
                e(i);
            }
            this.w = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            j(appBarLayout);
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.C == null) {
                this.C = new aeup(this, 0);
            }
            appBarLayout.h(this.C);
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        aeyb aeybVar = this.a;
        aeybVar.k(configuration);
        if (this.D != configuration.orientation && this.J && aeybVar.a == 1.0f) {
            l();
        }
        this.D = configuration.orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        ViewParent parent = getParent();
        aeum aeumVar = this.C;
        if (aeumVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).j(aeumVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        bbn bbnVar = this.f;
        if (bbnVar != null) {
            int iD = bbnVar.d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iD) {
                    int i6 = bac.a;
                    childAt.offsetTopAndBottom(iD);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            c(getChildAt(i7)).b();
        }
        o(i, i2, i3, i4, false);
        p();
        h();
        int childCount3 = getChildCount();
        for (int i8 = 0; i8 < childCount3; i8++) {
            c(getChildAt(i8)).a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        CollapsingToolbarLayout collapsingToolbarLayout;
        k();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        bbn bbnVar = this.f;
        int iD = bbnVar != null ? bbnVar.d() : 0;
        if ((mode == 0 || this.G) && iD > 0) {
            this.F = iD;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iD, 1073741824));
        }
        p();
        if (this.r) {
            aeyb aeybVar = this.a;
            if (TextUtils.isEmpty(aeybVar.k)) {
                collapsingToolbarLayout = this;
            } else {
                int measuredHeight = getMeasuredHeight();
                collapsingToolbarLayout = this;
                collapsingToolbarLayout.o(0, 0, getMeasuredWidth(), measuredHeight, true);
                float fD = collapsingToolbarLayout.F + collapsingToolbarLayout.m + aeybVar.d();
                aeyb aeybVar2 = collapsingToolbarLayout.b;
                int iD2 = (int) (fD + (TextUtils.isEmpty(aeybVar2.k) ? 0.0f : collapsingToolbarLayout.p + aeybVar2.d()) + collapsingToolbarLayout.o);
                if (iD2 > measuredHeight) {
                    collapsingToolbarLayout.K = iD2 - measuredHeight;
                } else {
                    collapsingToolbarLayout.K = 0;
                }
                if (collapsingToolbarLayout.J) {
                    if (aeybVar.q > 1) {
                        int i3 = aeybVar.i;
                        if (i3 > 1) {
                            collapsingToolbarLayout.H = Math.round(aeybVar.d()) * (i3 - 1);
                        } else {
                            collapsingToolbarLayout.H = 0;
                        }
                    }
                    if (aeybVar2.q > 1) {
                        int i4 = aeybVar2.i;
                        if (i4 > 1) {
                            collapsingToolbarLayout.I = Math.round(aeybVar2.d()) * (i4 - 1);
                        } else {
                            collapsingToolbarLayout.I = 0;
                        }
                    }
                }
                int i5 = collapsingToolbarLayout.K;
                int i6 = collapsingToolbarLayout.H;
                int i7 = collapsingToolbarLayout.I;
                if (i5 + i6 + i7 > 0) {
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight + i5 + i6 + i7, 1073741824));
                }
            }
        } else {
            collapsingToolbarLayout = this;
        }
        ViewGroup viewGroup = collapsingToolbarLayout.i;
        if (viewGroup != null) {
            View view = collapsingToolbarLayout.j;
            if (view == null || view == collapsingToolbarLayout) {
                collapsingToolbarLayout.setMinimumHeight(i(viewGroup));
            } else {
                collapsingToolbarLayout.setMinimumHeight(i(view));
            }
        }
        if (collapsingToolbarLayout.J) {
            aeyb aeybVar3 = collapsingToolbarLayout.a;
            if (aeybVar3.q <= 1 || aeybVar3.a != 1.0f) {
                return;
            }
            collapsingToolbarLayout.l();
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.u;
        if (drawable != null) {
            m(drawable, i, i2);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.d;
        boolean z = i == 0;
        if (drawable != null && drawable.isVisible() != z) {
            this.d.setVisible(z, false);
        }
        Drawable drawable2 = this.u;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.u.setVisible(z, false);
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u || drawable == this.d;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new aeuo();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new aeuo(layoutParams);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }
}
