package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.car.app.model.Alert;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.music.R;
import defpackage.aetz;
import defpackage.aeuf;
import defpackage.aeuh;
import defpackage.aeui;
import defpackage.aeuj;
import defpackage.aeur;
import defpackage.aeus;
import defpackage.aeut;
import defpackage.aeuw;
import defpackage.aeym;
import defpackage.afba;
import defpackage.afbe;
import defpackage.afdi;
import defpackage.afev;
import defpackage.ahtv;
import defpackage.ass;
import defpackage.ast;
import defpackage.asv;
import defpackage.avgj;
import defpackage.ays;
import defpackage.azs;
import defpackage.bac;
import defpackage.bbn;
import defpackage.bdh;
import defpackage.gge;
import defpackage.jjy;
import defpackage.ttf;
import defpackage.vod;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements ass {
    public boolean a;
    public int b;
    public bbn c;
    public boolean d;
    public boolean e;
    public final List f;
    public final LinkedHashSet g;
    public int h;
    public Drawable i;
    public Integer j;
    public final float k;
    private int l;
    private int m;
    private int n;
    private int o;
    private List p;
    private boolean q;
    private ColorStateList r;
    private int s;
    private WeakReference t;
    private ValueAnimator u;
    private ValueAnimator.AnimatorUpdateListener v;
    private final long w;
    private final TimeInterpolator x;
    private int[] y;
    private Behavior z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(afev.b(context, attributeSet, i, R.style.Widget_Design_AppBarLayout, new int[0]), attributeSet, i);
        int i2 = afev.a;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.b = 0;
        this.f = new ArrayList();
        this.g = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            int[] iArr = aeuw.a;
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        int[] iArr2 = aeuw.a;
        Context context3 = getContext();
        int[] iArr3 = aeuw.a;
        aeym.b(context3, attributeSet, i, R.style.Widget_Design_AppBarLayout);
        aeym.c(context3, attributeSet, iArr3, i, R.style.Widget_Design_AppBarLayout, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr3, i, R.style.Widget_Design_AppBarLayout);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayObtainStyledAttributes.getResourceId(0, 0)));
            }
            typedArrayObtainStyledAttributes.recycle();
            int[] iArr4 = aeut.a;
            aeym.b(context2, attributeSet, i, R.style.Widget_Design_AppBarLayout);
            aeym.c(context2, attributeSet, iArr4, i, R.style.Widget_Design_AppBarLayout, new int[0]);
            TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr4, i, R.style.Widget_Design_AppBarLayout);
            this.r = afba.f(context2, typedArrayObtainStyledAttributes2, 6);
            this.w = afba.s(context2.getTheme(), R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.x = afba.y(context2, R.attr.motionEasingStandardInterpolator, aetz.a);
            if (typedArrayObtainStyledAttributes2.hasValue(4)) {
                l(typedArrayObtainStyledAttributes2.getBoolean(4, false), false, false);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(3)) {
                aeuw.a(this, typedArrayObtainStyledAttributes2.getDimensionPixelSize(3, 0));
            }
            setBackground(typedArrayObtainStyledAttributes2.getDrawable(0));
            if (typedArrayObtainStyledAttributes2.hasValue(2)) {
                setKeyboardNavigationCluster(typedArrayObtainStyledAttributes2.getBoolean(2, false));
            }
            if (typedArrayObtainStyledAttributes2.hasValue(1)) {
                setTouchscreenBlocksFocus(typedArrayObtainStyledAttributes2.getBoolean(1, false));
            }
            this.k = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.e = typedArrayObtainStyledAttributes2.getBoolean(5, false);
            this.s = typedArrayObtainStyledAttributes2.getResourceId(7, -1);
            Drawable drawable = typedArrayObtainStyledAttributes2.getDrawable(8);
            Drawable drawable2 = this.i;
            if (drawable2 != drawable) {
                Integer numValueOf = null;
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                }
                Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
                this.i = drawableMutate;
                if (drawableMutate instanceof afbe) {
                    numValueOf = Integer.valueOf(((afbe) drawableMutate).h);
                } else {
                    ColorStateList colorStateListD = afba.D(drawableMutate);
                    if (colorStateListD != null) {
                        numValueOf = Integer.valueOf(colorStateListD.getDefaultColor());
                    }
                }
                this.j = numValueOf;
                Drawable drawable3 = this.i;
                if (drawable3 != null) {
                    if (drawable3.isStateful()) {
                        this.i.setState(getDrawableState());
                    }
                    this.i.setLayoutDirection(getLayoutDirection());
                    this.i.setVisible(getVisibility() == 0, false);
                    this.i.setCallback(this);
                }
                m();
                postInvalidateOnAnimation();
            }
            typedArrayObtainStyledAttributes2.recycle();
            ttf ttfVar = new ttf(this, 2);
            int i3 = bac.a;
            azs.c(this, ttfVar);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    protected static final aeuj o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new aeuj((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new aeuj((ViewGroup.MarginLayoutParams) layoutParams) : new aeuj(layoutParams);
    }

    private final void q() {
        Behavior behavior = this.z;
        aeuh aeuhVarV = null;
        if (behavior != null && this.m != -1 && this.b == 0) {
            aeuhVarV = behavior.v(bdh.c, this);
        }
        this.m = -1;
        this.n = -1;
        this.o = -1;
        if (aeuhVarV != null) {
            this.z.x(aeuhVarV, false);
        }
    }

    private final void r(float f, float f2) {
        ValueAnimator valueAnimator = this.u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.w);
        this.u.setInterpolator(this.x);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.v;
        if (animatorUpdateListener != null) {
            this.u.addUpdateListener(animatorUpdateListener);
        }
        this.u.start();
    }

    private final boolean s() {
        return this.i != null && e() > 0;
    }

    private final boolean t() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || childAt.getFitsSystemWindows()) ? false : true;
    }

    @Override // defpackage.ass
    public final ast a() {
        Behavior behavior = new Behavior();
        this.z = behavior;
        return behavior;
    }

    public final int b() {
        int iMin;
        int minimumHeight;
        int i = this.n;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                aeuj aeujVar = (aeuj) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = aeujVar.a;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = aeujVar.topMargin + aeujVar.bottomMargin;
                    if ((i3 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i3 & 2) != 0) {
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i4 + measuredHeight;
                        }
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - e());
                        }
                        i2 += iMin;
                    }
                    iMin = i4 + minimumHeight;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - e());
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.n = iMax;
        return iMax;
    }

    final int c() {
        int i = this.o;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                aeuj aeujVar = (aeuj) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + aeujVar.topMargin + aeujVar.bottomMargin;
                int i3 = aeujVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.o = iMax;
        return iMax;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof aeuj;
    }

    public final int d() {
        int iE = e();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i = (minimumHeight << 1) + iE;
            if (i < getHeight()) {
                return i;
            }
        } else {
            int childCount = getChildCount();
            minimumHeight = childCount > 0 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
            int i2 = (minimumHeight << 1) + iE;
            if (i2 < getHeight()) {
                return i2;
            }
        }
        return minimumHeight + iE;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (s()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.l);
            this.i.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.i;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    final int e() {
        bbn bbnVar = this.c;
        if (bbnVar != null) {
            return bbnVar.d();
        }
        return 0;
    }

    public final int f() {
        int i = this.m;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (i2 < childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                aeuj aeujVar = (aeuj) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = aeujVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight + aeujVar.topMargin + aeujVar.bottomMargin;
                if (i2 == 0) {
                    if (childAt.getFitsSystemWindows()) {
                        minimumHeight -= e();
                    }
                    i2 = 0;
                }
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.m = iMax;
        return iMax;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final aeuj generateLayoutParams(AttributeSet attributeSet) {
        return new aeuj(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new aeuj();
    }

    public final void h(aeui aeuiVar) {
        if (this.p == null) {
            this.p = new ArrayList();
        }
        if (aeuiVar == null || this.p.contains(aeuiVar)) {
            return;
        }
        this.p.add(aeuiVar);
    }

    final void i(int i) {
        this.l = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List list = this.p;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                aeui aeuiVar = (aeui) this.p.get(i2);
                if (aeuiVar != null) {
                    aeuiVar.m(this, i);
                }
            }
        }
    }

    public final void j(aeui aeuiVar) {
        List list = this.p;
        if (list == null || aeuiVar == null) {
            return;
        }
        list.remove(aeuiVar);
    }

    public final void k(boolean z) {
        l(z, isLaidOut(), true);
    }

    public final void l(boolean z, boolean z2, boolean z3) {
        this.b = (true != z ? 2 : 1) | (true != z2 ? 0 : 4) | (true == z3 ? 8 : 0);
        requestLayout();
    }

    public final void m() {
        setWillNotDraw(!s());
    }

    final boolean n(View view) {
        int i;
        if (this.t == null && (i = this.s) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.s);
            }
            if (viewFindViewById != null) {
                this.t = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.t;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        afba.o(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArr = this.y;
        if (iArr == null) {
            iArr = new int[4];
            this.y = iArr;
        }
        int length = iArr.length;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 4);
        boolean z = this.q;
        boolean z2 = false;
        iArr[0] = true != z ? -2130970513 : R.attr.state_liftable;
        int i2 = -2130970514;
        if (!z) {
            z2 = true;
        } else if (this.d) {
            i2 = R.attr.state_lifted;
        }
        iArr[1] = i2;
        iArr[2] = true != z2 ? R.attr.state_collapsible : -2130970509;
        int i3 = -2130970508;
        if (z && this.d) {
            i3 = R.attr.state_collapsed;
        }
        iArr[3] = i3;
        return mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.t;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.t = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getFitsSystemWindows() && t()) {
            int iE = e();
            int childCount = getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = getChildAt(childCount);
                int i5 = bac.a;
                childAt.offsetTopAndBottom(iE);
            }
        }
        q();
        boolean z2 = false;
        this.a = false;
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            if (((aeuj) getChildAt(i6).getLayoutParams()).b != null) {
                this.a = true;
                break;
            }
        }
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), e());
        }
        if (this.e) {
            z2 = true;
            break;
        }
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            int i8 = ((aeuj) getChildAt(i7).getLayoutParams()).a;
            if ((i8 & 1) == 1 && (i8 & 10) != 0) {
                z2 = true;
                break;
            }
        }
        if (this.q != z2) {
            this.q = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && t()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = e() + getMeasuredHeight();
                int size = View.MeasureSpec.getSize(i2);
                if (measuredHeight < 0) {
                    measuredHeight = 0;
                } else if (measuredHeight > size) {
                    measuredHeight = size;
                }
            } else if (mode == 0) {
                measuredHeight += e();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        q();
    }

    final boolean p(boolean z) {
        if (this.d == z) {
            return false;
        }
        this.d = z;
        refreshDrawableState();
        if (!(getBackground() instanceof afbe)) {
            return true;
        }
        float f = 0.0f;
        if (this.r != null) {
            r(true != z ? 1.0f : 0.0f, true == z ? 1.0f : 0.0f);
            return true;
        }
        if (!this.e) {
            return true;
        }
        float f2 = this.k;
        if (z) {
            f = f2;
            f2 = 0.0f;
        }
        r(f2, f);
        return true;
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        afbe afbeVar;
        AppBarLayout appBarLayout;
        boolean z = drawable instanceof afbe;
        Context context = getContext();
        if (z) {
            afbeVar = (afbe) drawable;
        } else {
            ColorStateList colorStateListD = afba.D(drawable);
            if (colorStateListD == null) {
                afbeVar = null;
            } else {
                afbe afbeVar2 = new afbe();
                afbeVar2.q(colorStateListD);
                afbeVar = afbeVar2;
            }
        }
        if (afbeVar == null || afbeVar.j() == null) {
            appBarLayout = this;
        } else {
            this.h = afbeVar.j().getDefaultColor();
            ColorStateList colorStateList = this.r;
            if (colorStateList != null) {
                Context context2 = getContext();
                TypedValue typedValueU = afba.u(context2.getTheme(), R.attr.colorSurface);
                appBarLayout = this;
                appBarLayout.v = new vod(appBarLayout, colorStateList, afbeVar, typedValueU != null ? Integer.valueOf(afba.M(context2, typedValueU)) : null, 2);
            } else {
                appBarLayout = this;
                afbeVar.n(context);
                appBarLayout.v = new gge(appBarLayout, afbeVar, 2);
            }
            drawable = afbeVar;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        afba.n(this, f);
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(1);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setVisible(i == 0, false);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.i;
    }

    /* JADX INFO: compiled from: PG */
    public class BaseBehavior extends aeur {
        public int b;
        public avgj c;
        private int e;
        private ValueAnimator f;
        private aeuh g;
        private WeakReference h;

        public BaseBehavior() {
        }

        private final void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (bac.b(coordinatorLayout) == null) {
                aeuf aeufVar = new aeuf(this, appBarLayout, coordinatorLayout);
                bac.s(coordinatorLayout);
                coordinatorLayout.setAccessibilityDelegate(aeufVar.getBridge());
            }
        }

        private final void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int iE = appBarLayout.e() + appBarLayout.getPaddingTop();
            int iT = t() - iE;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                aeuj aeujVar = (aeuj) childAt.getLayoutParams();
                if (D(aeujVar.a, 32)) {
                    top -= aeujVar.topMargin;
                    bottom += aeujVar.bottomMargin;
                }
                int i2 = -iT;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                aeuj aeujVar2 = (aeuj) childAt2.getLayoutParams();
                int i3 = aeujVar2.a;
                if ((i3 & 17) == 17) {
                    int iE2 = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        iE2 -= appBarLayout.e();
                    }
                    if (D(i3, 2)) {
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if (D(i3, 5)) {
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iT < minimumHeight2) {
                            iE2 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if (D(i3, 32)) {
                        iE2 += aeujVar2.topMargin;
                        minimumHeight -= aeujVar2.bottomMargin;
                    }
                    if (iT < (minimumHeight + iE2) / 2) {
                        iE2 = minimumHeight;
                    }
                    E(coordinatorLayout, appBarLayout, ast.c(iE2 + iE, -appBarLayout.f(), 0));
                }
            }
        }

        private static boolean D(int i, int i2) {
            return (i & i2) == i2;
        }

        private final void E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int iAbs = (int) (((Math.abs(t() - i) / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iT = t();
            ValueAnimator valueAnimator = this.f;
            if (iT == i) {
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f.cancel();
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.f = valueAnimator2;
                valueAnimator2.setInterpolator(aetz.e);
                this.f.addUpdateListener(new afdi(this, coordinatorLayout, appBarLayout, 1));
            } else {
                valueAnimator.cancel();
            }
            this.f.setDuration(Math.min(iAbs, 600));
            this.f.setIntValues(iT, i);
            this.f.start();
        }

        private static final View F(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof ays) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0059  */
        private static final void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View childAt;
            boolean zN;
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (childAt != null) {
                int i4 = ((aeuj) childAt.getLayoutParams()).a;
                if ((i4 & 1) != 0) {
                    int minimumHeight = childAt.getMinimumHeight();
                    zN = true;
                    if (i2 <= 0 || (i4 & 12) == 0 ? (i4 & 2) == 0 || (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.e() : (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.e()) {
                        zN = false;
                    }
                } else {
                    zN = false;
                }
            } else {
                zN = false;
            }
            if (appBarLayout.e) {
                zN = appBarLayout.n(F(coordinatorLayout));
            }
            boolean zP = appBarLayout.p(zN);
            if (!z) {
                if (zP) {
                    ArrayList arrayListF = coordinatorLayout.h.f(appBarLayout);
                    List arrayList = arrayListF != null ? new ArrayList(arrayListF) : null;
                    if (arrayList == null) {
                        arrayList = Collections.EMPTY_LIST;
                    }
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        ast astVar = ((asv) ((View) arrayList.get(i5)).getLayoutParams()).a;
                        if (astVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) astVar).getOverlayTop() == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        public static final View z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((asv) childAt.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // defpackage.aeuu, defpackage.ast
        public final /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            BaseBehavior baseBehavior;
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.onLayoutChild(coordinatorLayout, appBarLayout, i);
            int i2 = appBarLayout.b;
            aeuh aeuhVar = this.g;
            if (aeuhVar == null || (i2 & 8) != 0) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                if (i2 != 0) {
                    int i3 = i2 & 4;
                    if ((i2 & 2) != 0) {
                        int i4 = -appBarLayout.f();
                        if (i3 != 0) {
                            baseBehavior.E(coordinatorLayout2, appBarLayout, i4);
                        } else {
                            baseBehavior.u(coordinatorLayout2, appBarLayout, i4, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
                        }
                    } else if ((i2 & 1) != 0) {
                        if (i3 != 0) {
                            baseBehavior.E(coordinatorLayout2, appBarLayout, 0);
                        } else {
                            baseBehavior.u(coordinatorLayout2, appBarLayout, 0, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
                        }
                    }
                }
            } else if (aeuhVar.a) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                baseBehavior.u(coordinatorLayout2, appBarLayout, -appBarLayout.f(), Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
            } else {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                if (aeuhVar.b) {
                    baseBehavior.u(coordinatorLayout2, appBarLayout, 0, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
                } else {
                    View childAt = appBarLayout.getChildAt(aeuhVar.e);
                    baseBehavior.u(coordinatorLayout2, appBarLayout, (-childAt.getBottom()) + (baseBehavior.g.g ? childAt.getMinimumHeight() + appBarLayout.e() : Math.round(childAt.getHeight() * baseBehavior.g.f)), Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
                }
            }
            appBarLayout.b = 0;
            baseBehavior.g = null;
            int topAndBottomOffset = baseBehavior.getTopAndBottomOffset();
            int i5 = -appBarLayout.f();
            if (topAndBottomOffset < i5) {
                topAndBottomOffset = i5;
            } else if (topAndBottomOffset > 0) {
                topAndBottomOffset = 0;
            }
            baseBehavior.setTopAndBottomOffset(topAndBottomOffset);
            G(coordinatorLayout2, appBarLayout, baseBehavior.getTopAndBottomOffset(), 0, true);
            appBarLayout.i(baseBehavior.getTopAndBottomOffset());
            baseBehavior.B(coordinatorLayout2, appBarLayout);
            return true;
        }

        @Override // defpackage.ast
        public final /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((asv) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.k(appBarLayout, i, i2, 0, i4);
            return true;
        }

        @Override // defpackage.ast
        public final /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            int i6;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i4 < 0) {
                i6 = i4;
                iArr[1] = A(coordinatorLayout, appBarLayout, i6, -appBarLayout.c(), 0);
            } else {
                i6 = i4;
            }
            if (i6 == 0) {
                B(coordinatorLayout, appBarLayout);
            }
        }

        @Override // defpackage.ast
        public final /* bridge */ /* synthetic */ void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            if (!(parcelable instanceof aeuh)) {
                this.g = null;
            } else {
                x((aeuh) parcelable, true);
                Parcelable parcelable2 = this.g.d;
            }
        }

        @Override // defpackage.ast
        public final /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, appBarLayout);
            aeuh aeuhVarV = v(parcelableOnSaveInstanceState, appBarLayout);
            return aeuhVarV != null ? aeuhVarV : parcelableOnSaveInstanceState;
        }

        @Override // defpackage.ast
        public final /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = false;
            if ((i & 2) != 0 && (appBarLayout.e || appBarLayout.d || (appBarLayout.f() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()))) {
                z = true;
            }
            if (z && (valueAnimator = this.f) != null) {
                valueAnimator.cancel();
            }
            this.h = null;
            this.e = i2;
            return z;
        }

        @Override // defpackage.ast
        public final /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.e == 0 || i == 1) {
                C(coordinatorLayout, appBarLayout);
                if (appBarLayout.e) {
                    appBarLayout.p(appBarLayout.n(view2));
                }
            }
            this.h = new WeakReference(view2);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0026  */
        @Override // defpackage.ast
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            AppBarLayout appBarLayout2;
            int i4;
            int iB;
            if (i2 == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i2 < 0) {
                    i4 = -appBarLayout.f();
                    iB = appBarLayout.b() + i4;
                } else {
                    i4 = -appBarLayout.f();
                    iB = 0;
                }
                int i5 = i4;
                int i6 = iB;
                if (i5 != i6) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = A(coordinatorLayout, appBarLayout2, i2, i5, i6);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.e) {
                appBarLayout2.p(appBarLayout2.n(view));
            }
        }

        @Override // defpackage.aeur
        public final /* bridge */ /* synthetic */ int r(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return (-appBarLayout.c()) + appBarLayout.e();
        }

        @Override // defpackage.aeur
        public final /* synthetic */ int s(View view) {
            return ((AppBarLayout) view).f();
        }

        @Override // defpackage.aeur
        public final int t() {
            return getTopAndBottomOffset() + this.b;
        }

        @Override // defpackage.aeur
        public final /* bridge */ /* synthetic */ int u(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int iSignum;
            int iE;
            int i4 = i;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iT = t();
            int i5 = 0;
            if (i2 == 0 || iT < i2 || iT > i3) {
                this.b = 0;
            } else {
                if (i4 < i2) {
                    i4 = i2;
                } else if (i4 > i3) {
                    i4 = i3;
                }
                if (iT != i4) {
                    if (!appBarLayout.a) {
                        iSignum = i4;
                        break;
                    }
                    int iAbs = Math.abs(i4);
                    int childCount = appBarLayout.getChildCount();
                    int i6 = 0;
                    while (true) {
                        if (i6 < childCount) {
                            View childAt = appBarLayout.getChildAt(i6);
                            aeuj aeujVar = (aeuj) childAt.getLayoutParams();
                            Interpolator interpolator = aeujVar.b;
                            if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                                i6++;
                            } else if (interpolator != null) {
                                int i7 = aeujVar.a;
                                if ((i7 & 1) != 0) {
                                    iE = childAt.getHeight() + aeujVar.topMargin + aeujVar.bottomMargin;
                                    if ((i7 & 2) != 0) {
                                        iE -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    iE = 0;
                                }
                                if (childAt.getFitsSystemWindows()) {
                                    iE -= appBarLayout.e();
                                }
                                if (iE > 0) {
                                    float f = iE;
                                    iSignum = Integer.signum(i4) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation((iAbs - childAt.getTop()) / f)));
                                    break;
                                }
                            }
                        }
                        iSignum = i4;
                        break;
                    }
                    boolean topAndBottomOffset = setTopAndBottomOffset(iSignum);
                    int i8 = iT - i4;
                    this.b = i4 - iSignum;
                    if (topAndBottomOffset) {
                        for (int i9 = 0; i9 < appBarLayout.getChildCount(); i9++) {
                            aeuj aeujVar2 = (aeuj) appBarLayout.getChildAt(i9).getLayoutParams();
                            ahtv ahtvVar = aeujVar2.c;
                            if (ahtvVar != null && (aeujVar2.a & 1) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i9);
                                float topAndBottomOffset2 = getTopAndBottomOffset();
                                Rect rect = (Rect) ahtvVar.b;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.e());
                                float fAbs = rect.top - Math.abs(topAndBottomOffset2);
                                if (fAbs <= 0.0f) {
                                    float fB = 1.0f - ast.b(Math.abs(fAbs / rect.height()), 0.0f, 1.0f);
                                    float fHeight = (-fAbs) - ((rect.height() * 0.3f) * (1.0f - (fB * fB)));
                                    childAt2.setTranslationY(fHeight);
                                    Rect rect2 = (Rect) ahtvVar.a;
                                    childAt2.getDrawingRect(rect2);
                                    rect2.offset(0, (int) (-fHeight));
                                    if (fHeight >= rect2.height()) {
                                        childAt2.setAlpha(0.0f);
                                    } else {
                                        childAt2.setAlpha(1.0f);
                                    }
                                    childAt2.setClipBounds(rect2);
                                } else {
                                    childAt2.setClipBounds(null);
                                    childAt2.setTranslationY(0.0f);
                                    childAt2.setAlpha(1.0f);
                                }
                            }
                        }
                    } else if (appBarLayout.a) {
                        coordinatorLayout.b(appBarLayout);
                    }
                    appBarLayout.i(getTopAndBottomOffset());
                    G(coordinatorLayout, appBarLayout, i4, i4 < iT ? -1 : 1, false);
                    i5 = i8;
                }
            }
            B(coordinatorLayout, appBarLayout);
            return i5;
        }

        final aeuh v(Parcelable parcelable, AppBarLayout appBarLayout) {
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = bdh.c;
                    }
                    aeuh aeuhVar = new aeuh(parcelable);
                    boolean z = topAndBottomOffset == 0;
                    aeuhVar.b = z;
                    aeuhVar.a = !z && (-topAndBottomOffset) >= appBarLayout.f();
                    aeuhVar.e = i;
                    aeuhVar.g = bottom == childAt.getMinimumHeight() + appBarLayout.e();
                    aeuhVar.f = bottom / childAt.getHeight();
                    return aeuhVar;
                }
            }
            return null;
        }

        @Override // defpackage.aeur
        public final /* bridge */ /* synthetic */ void w(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            C(coordinatorLayout, appBarLayout);
            if (appBarLayout.e) {
                appBarLayout.p(appBarLayout.n(F(coordinatorLayout)));
            }
        }

        final void x(aeuh aeuhVar, boolean z) {
            if (this.g == null || z) {
                this.g = aeuhVar;
            }
        }

        @Override // defpackage.aeur
        public final /* bridge */ /* synthetic */ boolean y(View view) {
            avgj avgjVar = this.c;
            if (avgjVar == null) {
                WeakReference weakReference = this.h;
                if (weakReference == null) {
                    return true;
                }
                View view2 = (View) weakReference.get();
                if (view2 != null && view2.isShown() && !view2.canScrollVertically(-1)) {
                    return true;
                }
            } else if (((jjy) avgjVar.a).q != 2) {
                return true;
            }
            return false;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: compiled from: PG */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new aeuj();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return o(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return o(layoutParams);
    }

    /* JADX INFO: compiled from: PG */
    public class ScrollingViewBehavior extends aeus {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aeut.f);
            setOverlayTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }

        private static int getAppBarLayoutOffset(AppBarLayout appBarLayout) {
            ast astVar = ((asv) appBarLayout.getLayoutParams()).a;
            if (astVar instanceof BaseBehavior) {
                return ((BaseBehavior) astVar).t();
            }
            return 0;
        }

        private void offsetChildAsNeeded(View view, View view2) {
            ast astVar = ((asv) view2.getLayoutParams()).a;
            if (astVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) astVar).b) + getVerticalLayoutGap()) - getOverlapPixelsForOffset(view2);
                int i = bac.a;
                view.offsetTopAndBottom(bottom);
            }
        }

        private void updateLiftedStateIfNeeded(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.e) {
                    appBarLayout.p(appBarLayout.n(view));
                }
            }
        }

        @Override // defpackage.aeus
        public AppBarLayout findFirstDependency(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.aeuu
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // defpackage.aeus
        public float getOverlapRatioForOffset(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int iF = appBarLayout.f();
                int iB = appBarLayout.b();
                int appBarLayoutOffset = getAppBarLayoutOffset(appBarLayout);
                if ((iB == 0 || iF + appBarLayoutOffset > iB) && (i = iF - iB) != 0) {
                    return (appBarLayoutOffset / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // defpackage.aeus
        public int getScrollRange(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).f() : super.getScrollRange(view);
        }

        @Override // defpackage.aeuu
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // defpackage.aeuu
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // defpackage.aeuu
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // defpackage.ast
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // defpackage.ast
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            offsetChildAsNeeded(view, view2);
            updateLiftedStateIfNeeded(view, view2);
            return false;
        }

        @Override // defpackage.ast
        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                bac.p(coordinatorLayout, null);
            }
        }

        @Override // defpackage.aeuu, defpackage.ast
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            super.onLayoutChild(coordinatorLayout, view, i);
            return true;
        }

        @Override // defpackage.aeus, defpackage.ast
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
        }

        @Override // defpackage.ast
        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutFindFirstDependency = findFirstDependency(coordinatorLayout.a(view));
            if (appBarLayoutFindFirstDependency == null) {
                return false;
            }
            Rect rect2 = new Rect(rect);
            rect2.offset(view.getLeft(), view.getTop());
            Rect rect3 = this.tempRect1;
            rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
            if (rect3.contains(rect2)) {
                return false;
            }
            appBarLayoutFindFirstDependency.l(false, !z, true);
            return true;
        }

        @Override // defpackage.aeuu
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        @Override // defpackage.aeuu
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        @Override // defpackage.aeuu
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        @Override // defpackage.aeuu
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }

        public ScrollingViewBehavior() {
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }
}
