package com.google.android.material.tabs;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.car.app.model.Alert;
import com.google.android.apps.youtube.music.R;
import defpackage.aetz;
import defpackage.aeym;
import defpackage.afba;
import defpackage.afbe;
import defpackage.afcg;
import defpackage.afda;
import defpackage.afdb;
import defpackage.afdc;
import defpackage.afdd;
import defpackage.afde;
import defpackage.afdf;
import defpackage.afdh;
import defpackage.afdj;
import defpackage.afdk;
import defpackage.afdl;
import defpackage.afdm;
import defpackage.afdp;
import defpackage.afev;
import defpackage.axr;
import defpackage.axs;
import defpackage.axt;
import defpackage.bbz;
import defpackage.dts;
import defpackage.dtu;
import defpackage.duc;
import defpackage.he;
import defpackage.zs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@dtu
public class TabLayout extends HorizontalScrollView {
    private static final int D = 2132085084;
    private static final axr E = new axt(16);
    public duc A;
    public int B;
    public afba C;
    private final ArrayList F;
    private afdk G;
    private int H;
    private final int I;
    private final int J;
    private final int K;
    private int L;
    private final ArrayList M;
    private afdf N;
    private ValueAnimator O;
    private dts P;
    private DataSetObserver Q;
    private afdl R;
    private afde S;
    private boolean T;
    private final axr U;
    public int a;
    public final afdj b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public final int h;
    public int i;
    public ColorStateList j;
    public ColorStateList k;
    public Drawable l;
    public float m;
    public float n;
    public float o;
    public final int p;
    public int q;
    public int r;
    int s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public int x;
    public boolean y;
    public final TimeInterpolator z;

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        afba afdaVar;
        int i2 = D;
        int i3 = afev.a;
        super(afev.b(context, attributeSet, i, i2, new int[0]), attributeSet, i);
        this.a = -1;
        this.F = new ArrayList();
        this.i = -1;
        this.H = 0;
        this.q = Alert.DURATION_SHOW_INDEFINITELY;
        this.x = -1;
        this.M = new ArrayList();
        this.U = new axs(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        afdj afdjVar = new afdj(this, context2);
        this.b = afdjVar;
        super.addView(afdjVar, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = afdc.a;
        aeym.b(context2, attributeSet, i, i2);
        aeym.c(context2, attributeSet, iArr, i, i2, 24);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        ColorStateList colorStateListD = afba.D(getBackground());
        if (colorStateListD != null) {
            afbe afbeVar = new afbe();
            afbeVar.q(colorStateListD);
            afbeVar.n(context2);
            afbeVar.p(getElevation());
            setBackground(afbeVar);
        }
        Drawable drawableG = afba.g(context2, typedArrayObtainStyledAttributes, 5);
        Drawable drawableMutate = (drawableG == null ? new GradientDrawable() : drawableG).mutate();
        this.l = drawableMutate;
        afba.F(drawableMutate, this.H);
        int i4 = this.x;
        afdjVar.b(i4 == -1 ? this.l.getIntrinsicHeight() : i4);
        o(typedArrayObtainStyledAttributes.getColor(8, 0));
        afdjVar.b(typedArrayObtainStyledAttributes.getDimensionPixelSize(11, -1));
        int i5 = typedArrayObtainStyledAttributes.getInt(10, 0);
        if (this.t != i5) {
            this.t = i5;
            afdjVar.postInvalidateOnAnimation();
        }
        int i6 = typedArrayObtainStyledAttributes.getInt(7, 0);
        if (i6 != 0) {
            if (i6 == 1) {
                afdaVar = new afda();
            } else {
                if (i6 != 2) {
                    throw new IllegalArgumentException(i6 + " is not a valid TabIndicatorAnimationMode");
                }
                afdaVar = new afdb();
            }
            this.C = afdaVar;
        } else {
            this.C = new afba();
        }
        this.w = typedArrayObtainStyledAttributes.getBoolean(9, true);
        afdjVar.a();
        afdjVar.postInvalidateOnAnimation();
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, 0);
        this.f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.d = dimensionPixelSize;
        this.c = dimensionPixelSize;
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(19, dimensionPixelSize);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(20, this.d);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(18, this.e);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, this.f);
        this.g = true != afba.x(context2.getTheme(), R.attr.isMaterial3Theme, false) ? R.attr.textAppearanceButton : R.attr.textAppearanceTitleSmall;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.h = resourceId;
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(resourceId, he.w);
        try {
            this.m = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
            this.j = afba.f(context2, typedArrayObtainStyledAttributes2, 3);
            typedArrayObtainStyledAttributes2.recycle();
            if (typedArrayObtainStyledAttributes.hasValue(22)) {
                this.i = typedArrayObtainStyledAttributes.getResourceId(22, resourceId);
            }
            int i7 = this.i;
            if (i7 != -1) {
                TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(i7, he.w);
                try {
                    this.n = typedArrayObtainStyledAttributes3.getDimensionPixelSize(0, (int) this.m);
                    ColorStateList colorStateListF = afba.f(context2, typedArrayObtainStyledAttributes3, 3);
                    if (colorStateListF != null) {
                        this.j = v(this.j.getDefaultColor(), colorStateListF.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListF.getDefaultColor()));
                    }
                    typedArrayObtainStyledAttributes3.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes3.recycle();
                    throw th;
                }
            }
            if (typedArrayObtainStyledAttributes.hasValue(25)) {
                this.j = afba.f(context2, typedArrayObtainStyledAttributes, 25);
            }
            if (typedArrayObtainStyledAttributes.hasValue(23)) {
                this.j = v(this.j.getDefaultColor(), typedArrayObtainStyledAttributes.getColor(23, 0));
            }
            afba.f(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.getInt(4, -1);
            this.k = afba.f(context2, typedArrayObtainStyledAttributes, 21);
            this.s = typedArrayObtainStyledAttributes.getInt(6, 300);
            this.z = afba.y(context2, R.attr.motionEasingEmphasizedInterpolator, aetz.b);
            this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, -1);
            this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
            this.p = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.u = typedArrayObtainStyledAttributes.getInt(15, 1);
            this.r = typedArrayObtainStyledAttributes.getInt(2, 0);
            this.v = typedArrayObtainStyledAttributes.getBoolean(12, false);
            this.y = typedArrayObtainStyledAttributes.getBoolean(26, false);
            typedArrayObtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.o = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.K = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            h();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    private final boolean A() {
        int i = this.u;
        return i == 0 || i == 2;
    }

    private final int t(int i, float f) {
        afdj afdjVar;
        View childAt;
        int i2 = this.u;
        if ((i2 != 0 && i2 != 2) || (childAt = (afdjVar = this.b).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < afdjVar.getChildCount() ? afdjVar.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    private final int u() {
        int i = this.I;
        if (i != -1) {
            return i;
        }
        int i2 = this.u;
        if (i2 == 0 || i2 == 2) {
            return this.K;
        }
        return 0;
    }

    private static ColorStateList v(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private final void w(View view) {
        if (!(view instanceof afdd)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        afdd afddVar = (afdd) view;
        afdk afdkVarD = d();
        CharSequence charSequence = afddVar.a;
        Drawable drawable = afddVar.b;
        int i = afddVar.c;
        if (!TextUtils.isEmpty(afddVar.getContentDescription())) {
            afdkVarD.b = afddVar.getContentDescription();
            afdkVarD.b();
        }
        f(afdkVarD, this.F.isEmpty());
    }

    private final void x(int i) {
        if (i != -1) {
            if (getWindowToken() != null && isLaidOut()) {
                afdj afdjVar = this.b;
                int childCount = afdjVar.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (afdjVar.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iT = t(i, 0.0f);
                if (scrollX != iT) {
                    if (this.O == null) {
                        ValueAnimator valueAnimator = new ValueAnimator();
                        this.O = valueAnimator;
                        valueAnimator.setInterpolator(this.z);
                        this.O.setDuration(this.s);
                        this.O.addUpdateListener(new afcg(this, 5));
                    }
                    this.O.setIntValues(scrollX, iT);
                    this.O.start();
                }
                int i3 = this.s;
                ValueAnimator valueAnimator2 = afdjVar.a;
                if (valueAnimator2 != null && valueAnimator2.isRunning() && afdjVar.b.a != i) {
                    afdjVar.a.cancel();
                }
                afdjVar.d(true, i, i3);
                return;
            }
            n(i, 0.0f, true, true, true);
        }
    }

    private final void y(int i) {
        afdj afdjVar = this.b;
        int childCount = afdjVar.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = afdjVar.getChildAt(i2);
                boolean z = i2 == i;
                boolean zIsSelected = childAt.isSelected();
                if (i2 != i ? !zIsSelected : zIsSelected) {
                    childAt.setSelected(z);
                    childAt.setActivated(z);
                } else {
                    childAt.setSelected(z);
                    childAt.setActivated(z);
                    if (childAt instanceof afdm) {
                        ((afdm) childAt).c();
                    }
                }
                i2++;
            }
        }
    }

    private final void z(LinearLayout.LayoutParams layoutParams) {
        if (this.u == 1 && this.r == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    public final int a() {
        afdk afdkVar = this.G;
        if (afdkVar != null) {
            return afdkVar.c;
        }
        return -1;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        w(view);
    }

    public final int b() {
        return this.F.size();
    }

    public final afdk c(int i) {
        if (i < 0 || i >= b()) {
            return null;
        }
        return (afdk) this.F.get(i);
    }

    public final afdk d() {
        afdk afdkVar = (afdk) E.a();
        if (afdkVar == null) {
            afdkVar = new afdk();
        }
        afdkVar.f = this;
        axr axrVar = this.U;
        afdm afdmVar = axrVar != null ? (afdm) axrVar.a() : null;
        if (afdmVar == null) {
            afdmVar = new afdm(this, getContext());
        }
        afdmVar.a(afdkVar);
        afdmVar.setFocusable(true);
        afdmVar.setMinimumWidth(u());
        if (TextUtils.isEmpty(afdkVar.b)) {
            afdmVar.setContentDescription(afdkVar.a);
        } else {
            afdmVar.setContentDescription(afdkVar.b);
        }
        afdkVar.g = afdmVar;
        if (afdkVar.h != -1) {
            afdkVar.g.setId(0);
        }
        return afdkVar;
    }

    @Deprecated
    public final void e(afdf afdfVar) {
        ArrayList arrayList = this.M;
        if (arrayList.contains(afdfVar)) {
            return;
        }
        arrayList.add(afdfVar);
    }

    public final void f(afdk afdkVar, boolean z) {
        g(afdkVar, this.F.size(), z);
    }

    public final void g(afdk afdkVar, int i, boolean z) {
        if (afdkVar.f != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        afdkVar.c = i;
        ArrayList arrayList = this.F;
        arrayList.add(i, afdkVar);
        int size = arrayList.size();
        int i2 = -1;
        for (int i3 = i + 1; i3 < size; i3++) {
            if (((afdk) arrayList.get(i3)).c == this.a) {
                i2 = i3;
            }
            ((afdk) arrayList.get(i3)).c = i3;
        }
        this.a = i2;
        afdm afdmVar = afdkVar.g;
        afdmVar.setSelected(false);
        afdmVar.setActivated(false);
        afdj afdjVar = this.b;
        int i4 = afdkVar.c;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        z(layoutParams);
        afdjVar.addView(afdmVar, i4, layoutParams);
        if (z) {
            afdkVar.a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public final void h() {
        int i = this.u;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.L - this.c) : 0;
        afdj afdjVar = this.b;
        afdjVar.setPaddingRelative(iMax, 0, 0, 0);
        int i2 = this.u;
        if (i2 == 0) {
            int i3 = this.r;
            if (i3 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i3 == 1) {
                afdjVar.setGravity(1);
            } else if (i3 == 2) {
            }
            afdjVar.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            if (this.r == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            afdjVar.setGravity(1);
        }
        r(true);
    }

    public final void i() {
        int iA;
        j();
        dts dtsVar = this.P;
        if (dtsVar != null) {
            int iG = dtsVar.g();
            for (int i = 0; i < iG; i++) {
                afdk afdkVarD = d();
                afdkVarD.e(this.P.i(i));
                f(afdkVarD, false);
            }
            duc ducVar = this.A;
            if (ducVar == null || iG <= 0 || (iA = ducVar.a()) == a() || iA >= b()) {
                return;
            }
            l(c(iA), true);
        }
    }

    public final void j() {
        afdj afdjVar = this.b;
        for (int childCount = afdjVar.getChildCount() - 1; childCount >= 0; childCount--) {
            afdm afdmVar = (afdm) afdjVar.getChildAt(childCount);
            afdjVar.removeViewAt(childCount);
            if (afdmVar != null) {
                afdmVar.a(null);
                afdmVar.setSelected(false);
                this.U.b(afdmVar);
            }
            requestLayout();
        }
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            afdk afdkVar = (afdk) it.next();
            it.remove();
            afdkVar.f = null;
            afdkVar.g = null;
            afdkVar.h = -1;
            afdkVar.a = null;
            afdkVar.b = null;
            afdkVar.c = -1;
            afdkVar.d = null;
            E.b(afdkVar);
        }
        this.G = null;
    }

    @Deprecated
    public final void k(afdf afdfVar) {
        this.M.remove(afdfVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    public final void l(afdk afdkVar, boolean z) {
        TabLayout tabLayout;
        afdk afdkVar2 = this.G;
        if (afdkVar2 == afdkVar) {
            if (afdkVar2 != null) {
                ArrayList arrayList = this.M;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((afdf) arrayList.get(size)).e(afdkVar);
                }
                x(afdkVar.c);
                return;
            }
            return;
        }
        int i = afdkVar != null ? afdkVar.c : -1;
        if (z) {
            if (afdkVar2 != null) {
                if (afdkVar2.c != -1) {
                    tabLayout = this;
                    tabLayout.x(i);
                }
                if (i != -1) {
                    tabLayout.y(i);
                }
            } else {
                afdkVar2 = null;
            }
            if (i != -1) {
                tabLayout = this;
                tabLayout.n(i, 0.0f, true, true, true);
            } else {
                i = -1;
                tabLayout = this;
                tabLayout.x(i);
            }
            if (i != -1) {
                tabLayout.y(i);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.G = afdkVar;
        if (afdkVar2 != null && afdkVar2.f != null) {
            ArrayList arrayList2 = tabLayout.M;
            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                ((afdf) arrayList2.get(size2)).g(afdkVar2);
            }
        }
        if (afdkVar != null) {
            ArrayList arrayList3 = tabLayout.M;
            for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                ((afdf) arrayList3.get(size3)).f(afdkVar);
            }
        }
    }

    public final void m(dts dtsVar, boolean z) {
        DataSetObserver dataSetObserver;
        dts dtsVar2 = this.P;
        if (dtsVar2 != null && (dataSetObserver = this.Q) != null) {
            dtsVar2.o(dataSetObserver);
        }
        this.P = dtsVar;
        if (z && dtsVar != null) {
            if (this.Q == null) {
                this.Q = new afdh(this);
            }
            dtsVar.m(this.Q);
        }
        i();
    }

    public final void n(int i, float f, boolean z, boolean z2, boolean z3) {
        float f2 = i + f;
        int iRound = Math.round(f2);
        if (iRound >= 0) {
            afdj afdjVar = this.b;
            if (iRound < afdjVar.getChildCount()) {
                if (z2) {
                    afdjVar.b.a = Math.round(f2);
                    ValueAnimator valueAnimator = afdjVar.a;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        afdjVar.a.cancel();
                    }
                    afdjVar.c(afdjVar.getChildAt(i), afdjVar.getChildAt(i + 1), f);
                }
                ValueAnimator valueAnimator2 = this.O;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.O.cancel();
                }
                int iT = t(i, f);
                int scrollX = getScrollX();
                boolean z4 = (i < a() && iT >= scrollX) || (i > a() && iT <= scrollX) || i == a();
                if (getLayoutDirection() == 1) {
                    z4 = (i < a() && iT <= scrollX) || (i > a() && iT >= scrollX) || i == a();
                }
                if (z4 || this.B == 1 || z3) {
                    if (i < 0) {
                        iT = 0;
                    }
                    scrollTo(iT, 0);
                }
                if (z) {
                    y(iRound);
                }
            }
        }
    }

    public final void o(int i) {
        this.H = i;
        afba.F(this.l, i);
        r(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        afba.o(this);
        if (this.A == null) {
            ViewParent parent = getParent();
            if (parent instanceof duc) {
                s((duc) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.T) {
            s(null, false);
            this.T = false;
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        afdm afdmVar;
        Drawable drawable;
        int i = 0;
        while (true) {
            afdj afdjVar = this.b;
            if (i >= afdjVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = afdjVar.getChildAt(i);
            if ((childAt instanceof afdm) && (drawable = (afdmVar = (afdm) childAt).d) != null) {
                drawable.setBounds(afdmVar.getLeft(), afdmVar.getTop(), afdmVar.getRight(), afdmVar.getBottom());
                drawable.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new bbz(accessibilityNodeInfo).x(zs.h(1, b(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return A() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        ArrayList arrayList = this.F;
        Context context = getContext();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
        }
        int iRound = Math.round(TypedValue.applyDimension(1, 48.0f, context.getResources().getDisplayMetrics()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(iRound + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size2 = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iApplyDimension = this.J;
            if (iApplyDimension <= 0) {
                iApplyDimension = (int) (size2 - TypedValue.applyDimension(1, 56.0f, getContext().getResources().getDisplayMetrics()));
            }
            this.q = iApplyDimension;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.u;
            if (i4 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i4 != 1) {
                if (i4 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || A()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p(int i) {
        if (i != this.u) {
            this.u = i;
            h();
        }
    }

    public final void q(int i, int i2) {
        ColorStateList colorStateListV = v(i, i2);
        if (this.j != colorStateListV) {
            this.j = colorStateListV;
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((afdk) arrayList.get(i3)).b();
            }
        }
    }

    public final void r(boolean z) {
        int i = 0;
        while (true) {
            afdj afdjVar = this.b;
            if (i >= afdjVar.getChildCount()) {
                return;
            }
            View childAt = afdjVar.getChildAt(i);
            childAt.setMinimumWidth(u());
            z((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    public final void s(duc ducVar, boolean z) {
        List list;
        duc ducVar2 = this.A;
        if (ducVar2 != null) {
            afdl afdlVar = this.R;
            if (afdlVar != null) {
                ducVar2.j(afdlVar);
            }
            afde afdeVar = this.S;
            if (afdeVar != null && (list = this.A.h) != null) {
                list.remove(afdeVar);
            }
        }
        afdf afdfVar = this.N;
        if (afdfVar != null) {
            k(afdfVar);
            this.N = null;
        }
        if (ducVar != null) {
            this.A = ducVar;
            afdl afdlVar2 = this.R;
            if (afdlVar2 == null) {
                afdlVar2 = new afdl(this);
                this.R = afdlVar2;
            }
            afdlVar2.b = 0;
            afdlVar2.a = 0;
            ducVar.e(afdlVar2);
            afdp afdpVar = new afdp(ducVar, 1);
            this.N = afdpVar;
            e(afdpVar);
            dts dtsVar = ducVar.b;
            if (dtsVar != null) {
                m(dtsVar, true);
            }
            afde afdeVar2 = this.S;
            if (afdeVar2 == null) {
                afdeVar2 = new afde(this);
                this.S = afdeVar2;
            }
            afdeVar2.a = true;
            if (ducVar.h == null) {
                ducVar.h = new ArrayList();
            }
            ducVar.h.add(afdeVar2);
            n(ducVar.a(), 0.0f, true, true, true);
        } else {
            this.A = null;
            m(null, false);
        }
        this.T = z;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        afba.n(this, f);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return Math.max(0, ((this.b.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        w(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        w(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        w(view);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    public TabLayout(Context context) {
        this(context, null);
    }
}
