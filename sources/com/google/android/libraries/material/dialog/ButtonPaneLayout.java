package com.google.android.libraries.material.dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import defpackage.bac;
import defpackage.ohc;
import defpackage.ohd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ButtonPaneLayout extends ViewGroup {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private int i;
    private int j;
    private final int k;
    private final int l;
    private final int m;
    private final boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private SparseIntArray s;
    private ohc t;

    public ButtonPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = true;
        this.s = new SparseIntArray();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ohd.a, i, R.style.Material_ButtonPaneLayout);
        this.n = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.o = typedArrayObtainStyledAttributes.getBoolean(1, false);
        this.p = typedArrayObtainStyledAttributes.getBoolean(3, false);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, Integer.MIN_VALUE);
        if (dimensionPixelSize == Integer.MIN_VALUE) {
            this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
            this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
            this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        } else {
            this.a = dimensionPixelSize;
            this.b = dimensionPixelSize;
            this.c = dimensionPixelSize;
            this.d = dimensionPixelSize;
        }
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, Integer.MIN_VALUE);
        if (dimensionPixelSize2 == Integer.MIN_VALUE) {
            this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, 0);
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 0);
            this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0);
            this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        } else {
            this.e = dimensionPixelSize2;
            this.f = dimensionPixelSize2;
            this.g = dimensionPixelSize2;
            this.h = dimensionPixelSize2;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.l = getResources().getDimensionPixelSize(R.dimen.mtrl_button_pane_layout_touch_dimen);
    }

    private final Rect a(int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        int i6 = i3 - i;
        int i7 = this.l;
        if (i5 > i7 && i6 > i7) {
            return null;
        }
        if (i6 < i7) {
            i -= (i7 - i6) / 2;
            i3 = i + i7;
        }
        if (i5 < i7) {
            i2 -= (i7 - i5) / 2;
            i4 = i2 + i7;
        }
        return new Rect(i, i2, i3, i4);
    }

    private final void b(View view, Rect rect) {
        View view2;
        TouchDelegate touchDelegate;
        ohc ohcVar;
        ohc ohcVar2 = this.t;
        if (ohcVar2 == null) {
            ohcVar2 = new ohc(this);
            this.t = ohcVar2;
        }
        ohcVar2.a.add(new TouchDelegate(rect, view));
        if (!(getParent() instanceof View) || (touchDelegate = (view2 = (View) getParent()).getTouchDelegate()) == (ohcVar = this.t)) {
            return;
        }
        ohcVar.b = touchDelegate;
        view2.setTouchDelegate(ohcVar);
    }

    private final void c() {
        ohc ohcVar = this.t;
        if (ohcVar != null) {
            ohcVar.a.clear();
        }
    }

    private final void d(View view, int i) {
        if (this.o || !(view instanceof TextView)) {
            return;
        }
        ((TextView) view).setGravity(i);
    }

    private final void e() {
        this.r = false;
        if (g()) {
            int i = this.e;
            int i2 = this.f;
            int i3 = this.g;
            int i4 = this.h;
            int i5 = bac.a;
            setPaddingRelative(i, i2, i3, i4);
            return;
        }
        int i6 = this.a;
        int i7 = this.b;
        int i8 = this.c;
        int i9 = this.d;
        int i10 = bac.a;
        setPaddingRelative(i6, i7, i8, i9);
    }

    private final boolean f() {
        int i = bac.a;
        return getLayoutDirection() == 1;
    }

    private final boolean g() {
        return this.q || this.p;
    }

    private static final int h(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != Integer.MIN_VALUE) {
            return mode == 1073741824 ? i2 : i;
        }
        return Math.min(i2, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        if (g()) {
            int i8 = i4 - i2;
            boolean z2 = true;
            if (!f() && !this.n) {
                z2 = false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingBottom = i8 - getPaddingBottom();
            c();
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() != 8) {
                    if (!z2) {
                        paddingLeft = (i7 - getPaddingRight()) - childAt.getMeasuredWidth();
                    }
                    int paddingLeft2 = this.n ? (i7 - getPaddingLeft()) - getPaddingRight() : childAt.getMeasuredWidth();
                    int measuredHeight = paddingBottom - childAt.getMeasuredHeight();
                    int i10 = paddingLeft2 + paddingLeft;
                    childAt.layout(paddingLeft, measuredHeight, i10, paddingBottom);
                    Rect rectA = a(paddingLeft, measuredHeight, i10, paddingBottom);
                    if (rectA != null) {
                        int i11 = rectA.bottom - rectA.top;
                        int i12 = this.j;
                        if (i11 > (paddingBottom - measuredHeight) + i12) {
                            int i13 = i12 / 2;
                            rectA.top = measuredHeight - i13;
                            rectA.bottom = paddingBottom + i13;
                        }
                        b(childAt, rectA);
                    }
                    paddingBottom = measuredHeight - this.j;
                }
            }
            return;
        }
        boolean zF = f();
        int paddingLeft3 = zF ? getPaddingLeft() : i7 - getPaddingRight();
        int paddingTop = getPaddingTop();
        c();
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt2 = getChildAt(childCount);
            if (childAt2.getVisibility() != 8) {
                int iMax = Math.max(this.m, childAt2.getMeasuredWidth());
                int i14 = this.i;
                if (zF) {
                    i6 = paddingLeft3 + iMax;
                    i5 = iMax + i14 + paddingLeft3;
                } else {
                    int i15 = paddingLeft3 - iMax;
                    i5 = paddingLeft3 - (iMax + i14);
                    i6 = paddingLeft3;
                    paddingLeft3 = i15;
                }
                int measuredHeight2 = childAt2.getMeasuredHeight() + paddingTop;
                childAt2.layout(paddingLeft3, paddingTop, i6, measuredHeight2);
                Rect rectA2 = a(paddingLeft3, paddingTop, i6, measuredHeight2);
                if (rectA2 != null) {
                    int i16 = rectA2.right - rectA2.left;
                    int i17 = this.i;
                    if (i16 > (i6 - paddingLeft3) + i17) {
                        int i18 = i17 / 2;
                        rectA2.left = paddingLeft3 - i18;
                        rectA2.right = i6 + i18;
                    }
                    b(childAt2, rectA2);
                }
                paddingLeft3 = i5;
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        int i3 = this.k;
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if (getChildAt(i5).getVisibility() != 8) {
                i4++;
            }
        }
        this.s.clear();
        int measuredWidth = (getMeasuredWidth() - this.a) - this.c;
        int i6 = i4 > 0 ? (measuredWidth - ((i4 - 1) * this.i)) / i4 : 0;
        boolean zG = g();
        this.q = i6 < this.m;
        int measuredWidth2 = 0;
        int measuredWidth3 = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                childAt.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                if (measuredWidth3 < childAt.getMeasuredWidth()) {
                    measuredWidth3 = childAt.getMeasuredWidth();
                }
                this.s.append(i7, childAt.getMeasuredWidth());
                measuredWidth2 += childAt.getMeasuredWidth() + this.i;
            }
        }
        this.q = measuredWidth < measuredWidth2;
        if (zG != g() || this.r) {
            e();
        }
        if (!g()) {
            int paddingLeft = (getPaddingLeft() + getPaddingRight()) - this.i;
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                View childAt2 = getChildAt(i8);
                if (childAt2.getVisibility() != 8) {
                    int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(this.s.get(i8), Integer.MIN_VALUE);
                    d(childAt2, 17);
                    childAt2.measure(iMakeMeasureSpec4, iMakeMeasureSpec3);
                    paddingLeft += childAt2.getMeasuredWidth() + this.i;
                }
            }
            setMeasuredDimension(h(paddingLeft, getMeasuredWidth(), i), h(paddingTop + i3, getMeasuredHeight(), i2));
            return;
        }
        if (this.n) {
            int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(h(measuredWidth3, getMeasuredWidth(), i), 1073741824);
            int iMakeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            int paddingTop2 = (getPaddingTop() + getPaddingBottom()) - this.j;
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                View childAt3 = getChildAt(i9);
                if (childAt3.getVisibility() != 8) {
                    d(childAt3, 8388629);
                    childAt3.measure(iMakeMeasureSpec5, iMakeMeasureSpec6);
                    paddingTop2 += childAt3.getMeasuredHeight() + this.j;
                }
            }
            setMeasuredDimension(h(measuredWidth3 + getPaddingLeft() + getPaddingRight(), getMeasuredWidth(), i), h(paddingTop2, getMeasuredHeight(), i2));
            return;
        }
        int paddingLeft2 = getPaddingLeft() + getPaddingRight();
        int iMakeMeasureSpec7 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - paddingLeft2, Integer.MIN_VALUE);
        int iMakeMeasureSpec8 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int paddingTop3 = (getPaddingTop() + getPaddingBottom()) - this.j;
        int measuredWidth4 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt4 = getChildAt(i10);
            if (childAt4.getVisibility() != 8) {
                d(childAt4, 8388629);
                childAt4.measure(iMakeMeasureSpec7, iMakeMeasureSpec8);
                paddingTop3 += childAt4.getMeasuredHeight() + this.j;
                if (childAt4.getMeasuredWidth() > measuredWidth4) {
                    measuredWidth4 = childAt4.getMeasuredWidth();
                }
            }
        }
        setMeasuredDimension(h(measuredWidth4 + paddingLeft2, getMeasuredWidth(), i), h(paddingTop3, getMeasuredHeight(), i2));
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        e();
    }

    public ButtonPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ButtonPaneLayout(Context context) {
        this(context, null);
    }
}
