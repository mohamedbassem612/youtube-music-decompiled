package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import defpackage.a;
import defpackage.abi;
import defpackage.bac;
import defpackage.jvj;
import defpackage.jvk;
import defpackage.jvl;
import defpackage.jvm;
import defpackage.jvn;
import defpackage.jvs;
import defpackage.zh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class FlexboxLayout extends ViewGroup implements jvj {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private Drawable g;
    private Drawable h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int[] m;
    private SparseIntArray n;
    private List o;
    private abi p;
    private zh q;

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = -1;
        this.p = new abi(this);
        this.o = new ArrayList();
        this.q = new zh((byte[]) null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jvs.a, i, 0);
        this.a = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.b = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.c = typedArrayObtainStyledAttributes.getInt(7, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(1, 4);
        this.e = typedArrayObtainStyledAttributes.getInt(0, 5);
        this.f = typedArrayObtainStyledAttributes.getInt(8, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            v(drawable);
            w(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            v(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            w(drawable3);
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(9, 0);
        if (i2 != 0) {
            this.j = i2;
            this.i = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(11, 0);
        if (i3 != 0) {
            this.j = i3;
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(10, 0);
        if (i4 != 0) {
            this.i = i4;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void A(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setBounds(i, i2, this.l + i, i3 + i2);
            this.h.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d6  */
    private final void B(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float measuredWidth;
        float f2;
        int i5;
        View viewU;
        int i6;
        int i7;
        int i8;
        jvn jvnVar;
        View view;
        boolean z2;
        boolean z3;
        jvl jvlVar;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.o.size();
        int i9 = 0;
        while (i9 < size) {
            jvl jvlVar2 = (jvl) this.o.get(i9);
            if (G(i9)) {
                int i10 = this.k;
                paddingBottom -= i10;
                paddingTop += i10;
            }
            int i11 = paddingBottom;
            int i12 = i3 - i;
            int i13 = this.c;
            if (i13 == 0) {
                f = paddingLeft;
                measuredWidth = i12 - paddingRight;
            } else if (i13 != 1) {
                if (i13 == 2) {
                    int i14 = i12 - paddingRight;
                    float f3 = (i12 - jvlVar2.e) / 2.0f;
                    measuredWidth = i14 - f3;
                    f = paddingLeft + f3;
                } else if (i13 == 3) {
                    int i15 = i12 - paddingRight;
                    f = paddingLeft;
                    int iA = jvlVar2.a();
                    measuredWidth = i15;
                    f2 = (i12 - jvlVar2.e) / (iA != 1 ? iA - 1 : 1.0f);
                } else if (i13 == 4) {
                    int i16 = i12 - paddingRight;
                    float f4 = paddingLeft;
                    int iA2 = jvlVar2.a();
                    f2 = iA2 != 0 ? (i12 - jvlVar2.e) / iA2 : 0.0f;
                    float f5 = f2 / 2.0f;
                    f = f4 + f5;
                    measuredWidth = i16 - f5;
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(a.bR(i13, "Invalid justifyContent is set: "));
                    }
                    int i17 = i12 - paddingRight;
                    float f6 = paddingLeft;
                    int iA3 = jvlVar2.a();
                    f2 = iA3 != 0 ? (i12 - jvlVar2.e) / (iA3 + 1) : 0.0f;
                    f = f6 + f2;
                    measuredWidth = i17 - f2;
                }
                float fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < jvlVar2.h) {
                    int i18 = jvlVar2.o + i5;
                    viewU = u(i18);
                    if (viewU != null || viewU.getVisibility() == 8) {
                        i6 = paddingLeft;
                        i7 = i11;
                    } else {
                        jvn jvnVar2 = (jvn) viewU.getLayoutParams();
                        float f7 = f + jvnVar2.leftMargin;
                        float f8 = measuredWidth - jvnVar2.rightMargin;
                        if (F(i18, i5)) {
                            int i19 = this.l;
                            float f9 = i19;
                            f7 += f9;
                            f8 -= f9;
                            i8 = i19;
                        } else {
                            i8 = 0;
                        }
                        float f10 = f7;
                        int i20 = (i5 != jvlVar2.h + (-1) || (this.j & 4) <= 0) ? 0 : this.l;
                        if (this.b == 2) {
                            abi abiVar = this.p;
                            if (z) {
                                view = viewU;
                                i6 = paddingLeft;
                                jvnVar = jvnVar2;
                                z2 = true;
                                abiVar.k(view, jvlVar2, Math.round(f8) - viewU.getMeasuredWidth(), i11 - viewU.getMeasuredHeight(), Math.round(f8), i11);
                                i7 = i11;
                                z3 = z2;
                            } else {
                                i6 = paddingLeft;
                                jvnVar = jvnVar2;
                                view = viewU;
                                abiVar.k(view, jvlVar2, Math.round(f10), i11 - view.getMeasuredHeight(), Math.round(f10) + view.getMeasuredWidth(), i11);
                                i7 = i11;
                                z3 = false;
                            }
                        } else {
                            i6 = paddingLeft;
                            jvnVar = jvnVar2;
                            view = viewU;
                            i7 = i11;
                            z2 = true;
                            abi abiVar2 = this.p;
                            if (z) {
                                abiVar2.k(view, jvlVar2, Math.round(f8) - view.getMeasuredWidth(), paddingTop, Math.round(f8), paddingTop + view.getMeasuredHeight());
                                z3 = z2;
                            } else {
                                int i21 = paddingTop;
                                abiVar2.k(view, jvlVar2, Math.round(f10), i21, view.getMeasuredWidth() + Math.round(f10), i21 + view.getMeasuredHeight());
                                paddingTop = i21;
                                z3 = false;
                            }
                        }
                        float measuredWidth2 = f10 + view.getMeasuredWidth() + fMax + jvnVar.rightMargin;
                        measuredWidth = f8 - ((view.getMeasuredWidth() + fMax) + jvnVar.leftMargin);
                        if (z3) {
                            jvlVar = jvlVar2;
                            jvlVar.b(view, i20, 0, i8, 0);
                        } else {
                            jvlVar = jvlVar2;
                            jvlVar.b(view, i8, 0, i20, 0);
                        }
                        jvlVar2 = jvlVar;
                        f = measuredWidth2;
                    }
                    i5++;
                    paddingLeft = i6;
                    i11 = i7;
                }
                int i22 = paddingLeft;
                int i23 = jvlVar2.g;
                paddingTop += i23;
                paddingBottom = i11 - i23;
                i9++;
                paddingLeft = i22;
            } else {
                int i24 = jvlVar2.e;
                int i25 = (i12 - i24) + paddingRight;
                measuredWidth = i24 - paddingLeft;
                f = i25;
            }
            f2 = 0.0f;
            float fMax2 = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < jvlVar2.h) {
                int i110 = jvlVar2.o + i5;
                viewU = u(i110);
                if (viewU != null) {
                    i6 = paddingLeft;
                    i7 = i11;
                } else {
                    i6 = paddingLeft;
                    i7 = i11;
                }
                i5++;
                paddingLeft = i6;
                i11 = i7;
            }
            int i26 = paddingLeft;
            int i27 = jvlVar2.g;
            paddingTop += i27;
            paddingBottom = i11 - i27;
            i9++;
            paddingLeft = i26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e0  */
    private final void C(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float f;
        float measuredHeight;
        float f2;
        float fMax;
        int i5;
        View viewU;
        char c;
        float f3;
        int i6;
        int i7;
        int i8;
        View view;
        jvn jvnVar;
        boolean z3;
        boolean z4;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int size = this.o.size();
        for (int i9 = 0; i9 < size; i9++) {
            jvl jvlVar = (jvl) this.o.get(i9);
            if (G(i9)) {
                int i10 = this.l;
                paddingLeft += i10;
                paddingRight -= i10;
            }
            int i11 = paddingRight;
            int i12 = i4 - i2;
            int i13 = this.c;
            char c2 = 4;
            if (i13 == 0) {
                f = paddingTop;
                measuredHeight = i12 - paddingBottom;
            } else if (i13 != 1) {
                if (i13 == 2) {
                    int i14 = i12 - paddingBottom;
                    float f4 = (i12 - jvlVar.e) / 2.0f;
                    measuredHeight = i14 - f4;
                    f = paddingTop + f4;
                } else if (i13 == 3) {
                    c2 = 4;
                    int i15 = i12 - paddingBottom;
                    f = paddingTop;
                    int iA = jvlVar.a();
                    measuredHeight = i15;
                    f2 = (i12 - jvlVar.e) / (iA != 1 ? iA - 1 : 1.0f);
                } else if (i13 == 4) {
                    int i16 = i12 - paddingBottom;
                    float f5 = paddingTop;
                    int iA2 = jvlVar.a();
                    c2 = 4;
                    f2 = iA2 != 0 ? (i12 - jvlVar.e) / iA2 : 0.0f;
                    float f6 = f2 / 2.0f;
                    f = f5 + f6;
                    measuredHeight = i16 - f6;
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(a.bR(i13, "Invalid justifyContent is set: "));
                    }
                    int i17 = i12 - paddingBottom;
                    float f7 = paddingTop;
                    int iA3 = jvlVar.a();
                    f2 = iA3 != 0 ? (i12 - jvlVar.e) / (iA3 + 1) : 0.0f;
                    f = f7 + f2;
                    measuredHeight = i17 - f2;
                    c2 = 4;
                }
                fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < jvlVar.h) {
                    int i18 = jvlVar.o + i5;
                    viewU = u(i18);
                    if (viewU != null || viewU.getVisibility() == 8) {
                        c = c2;
                        f3 = fMax;
                        i6 = i5;
                        i7 = i11;
                    } else {
                        jvn jvnVar2 = (jvn) viewU.getLayoutParams();
                        float f8 = f + jvnVar2.topMargin;
                        float f9 = measuredHeight - jvnVar2.bottomMargin;
                        if (F(i18, i5)) {
                            int i19 = this.k;
                            float f10 = i19;
                            f8 += f10;
                            f9 -= f10;
                            i8 = i19;
                        } else {
                            i8 = 0;
                        }
                        float f11 = f8;
                        int i20 = (i5 != jvlVar.h + (-1) || (this.i & 4) <= 0) ? 0 : this.k;
                        if (z) {
                            int i21 = i5;
                            abi abiVar = this.p;
                            if (z2) {
                                i6 = i21;
                                view = viewU;
                                c = c2;
                                f3 = fMax;
                                jvnVar = jvnVar2;
                                z3 = true;
                                abiVar.l(view, jvlVar, true, i11 - viewU.getMeasuredWidth(), Math.round(f9) - viewU.getMeasuredHeight(), i11, Math.round(f9));
                                i7 = i11;
                                z4 = z3;
                            } else {
                                c = c2;
                                f3 = fMax;
                                i6 = i21;
                                view = viewU;
                                jvnVar = jvnVar2;
                                abiVar.l(view, jvlVar, true, i11 - view.getMeasuredWidth(), Math.round(f11), i11, view.getMeasuredHeight() + Math.round(f11));
                                i7 = i11;
                                z4 = false;
                            }
                        } else {
                            c = c2;
                            f3 = fMax;
                            i6 = i5;
                            view = viewU;
                            jvnVar = jvnVar2;
                            i7 = i11;
                            z3 = true;
                            abi abiVar2 = this.p;
                            if (z2) {
                                abiVar2.l(view, jvlVar, false, paddingLeft, Math.round(f9) - view.getMeasuredHeight(), paddingLeft + view.getMeasuredWidth(), Math.round(f9));
                                z4 = z3;
                            } else {
                                int i22 = paddingLeft;
                                abiVar2.l(view, jvlVar, false, i22, Math.round(f11), i22 + view.getMeasuredWidth(), Math.round(f11) + view.getMeasuredHeight());
                                paddingLeft = i22;
                                z4 = false;
                            }
                        }
                        float measuredHeight2 = f11 + view.getMeasuredHeight() + f3 + jvnVar.bottomMargin;
                        measuredHeight = f9 - ((view.getMeasuredHeight() + f3) + jvnVar.topMargin);
                        jvl jvlVar2 = jvlVar;
                        if (z4) {
                            jvlVar2.b(view, 0, i20, 0, i8);
                        } else {
                            jvlVar2.b(view, 0, i8, 0, i20);
                        }
                        jvlVar = jvlVar2;
                        f = measuredHeight2;
                    }
                    i5 = i6 + 1;
                    fMax = f3;
                    c2 = c;
                    i11 = i7;
                }
                int i23 = jvlVar.g;
                paddingLeft += i23;
                paddingRight = i11 - i23;
            } else {
                int i24 = jvlVar.e;
                int i25 = (i12 - i24) + paddingBottom;
                measuredHeight = i24 - paddingTop;
                f = i25;
            }
            f2 = 0.0f;
            fMax = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < jvlVar.h) {
                int i110 = jvlVar.o + i5;
                viewU = u(i110);
                if (viewU != null) {
                    c = c2;
                    f3 = fMax;
                    i6 = i5;
                    i7 = i11;
                } else {
                    c = c2;
                    f3 = fMax;
                    i6 = i5;
                    i7 = i11;
                }
                i5 = i6 + 1;
                fMax = f3;
                c2 = c;
                i11 = i7;
            }
            int i26 = jvlVar.g;
            paddingLeft += i26;
            paddingRight = i11 - i26;
        }
    }

    private final void D(int i, int i2, int i3, int i4) {
        int iL;
        int iJ;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            iL = l() + getPaddingTop() + getPaddingBottom();
            iJ = j();
        } else {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(a.bR(i, "Invalid flex direction: "));
            }
            iL = j();
            iJ = l() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < iJ) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = iJ;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(iJ, i2, i4);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException(a.bR(mode, "Unknown width mode is set: "));
            }
            if (size < iJ) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < iL) {
                i4 = View.combineMeasuredStates(i4, SemanticState.Hidden);
            } else {
                size2 = iL;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(iL, i3, i4);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException(a.bR(mode2, "Unknown height mode is set: "));
            }
            if (size2 < iL) {
                i4 = View.combineMeasuredStates(i4, SemanticState.Hidden);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private final void E() {
        if (this.g == null && this.h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private final boolean F(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewU = u(i - i3);
            if (viewU != null && viewU.getVisibility() != 8) {
                if (t()) {
                    if ((this.j & 2) != 0) {
                        return true;
                    }
                } else if ((this.i & 2) != 0) {
                    return true;
                }
                return false;
            }
        }
        if (t()) {
            if ((this.j & 1) != 0) {
                return true;
            }
        } else if ((this.i & 1) != 0) {
            return true;
        }
        return false;
    }

    private final boolean G(int i) {
        if (i < 0 || i >= this.o.size()) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (((jvl) this.o.get(i2)).a() > 0) {
                if (t()) {
                    if ((this.i & 2) == 0) {
                        return false;
                    }
                } else if ((this.j & 2) == 0) {
                    return false;
                }
                return true;
            }
        }
        if (t()) {
            if ((this.i & 1) == 0) {
                return false;
            }
        } else if ((this.j & 1) == 0) {
            return false;
        }
        return true;
    }

    private final boolean H(int i) {
        if (i < 0 || i >= this.o.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.o.size(); i2++) {
            if (((jvl) this.o.get(i2)).a() > 0) {
                return false;
            }
        }
        if (t()) {
            if ((this.i & 4) == 0) {
                return false;
            }
        } else if ((this.j & 4) == 0) {
            return false;
        }
        return true;
    }

    private final void x(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.o.size();
        for (int i = 0; i < size; i++) {
            jvl jvlVar = (jvl) this.o.get(i);
            for (int i2 = 0; i2 < jvlVar.h; i2++) {
                int i3 = jvlVar.o + i2;
                View viewU = u(i3);
                if (viewU != null && viewU.getVisibility() != 8) {
                    jvn jvnVar = (jvn) viewU.getLayoutParams();
                    if (F(i3, i2)) {
                        A(canvas, z ? viewU.getRight() + jvnVar.rightMargin : (viewU.getLeft() - jvnVar.leftMargin) - this.l, jvlVar.b, jvlVar.g);
                    }
                    if (i2 == jvlVar.h - 1 && (this.j & 4) > 0) {
                        A(canvas, z ? (viewU.getLeft() - jvnVar.leftMargin) - this.l : viewU.getRight() + jvnVar.rightMargin, jvlVar.b, jvlVar.g);
                    }
                }
            }
            if (G(i)) {
                z(canvas, paddingLeft, z2 ? jvlVar.d : jvlVar.b - this.k, iMax);
            }
            if (H(i) && (this.i & 4) > 0) {
                z(canvas, paddingLeft, z2 ? jvlVar.b - this.k : jvlVar.d, iMax);
            }
        }
    }

    private final void y(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.o.size();
        for (int i = 0; i < size; i++) {
            jvl jvlVar = (jvl) this.o.get(i);
            for (int i2 = 0; i2 < jvlVar.h; i2++) {
                int i3 = jvlVar.o + i2;
                View viewU = u(i3);
                if (viewU != null && viewU.getVisibility() != 8) {
                    jvn jvnVar = (jvn) viewU.getLayoutParams();
                    if (F(i3, i2)) {
                        z(canvas, jvlVar.a, z2 ? viewU.getBottom() + jvnVar.bottomMargin : (viewU.getTop() - jvnVar.topMargin) - this.k, jvlVar.g);
                    }
                    if (i2 == jvlVar.h - 1 && (this.i & 4) > 0) {
                        z(canvas, jvlVar.a, z2 ? (viewU.getTop() - jvnVar.topMargin) - this.k : viewU.getBottom() + jvnVar.bottomMargin, jvlVar.g);
                    }
                }
            }
            if (G(i)) {
                A(canvas, z ? jvlVar.c : jvlVar.a - this.l, paddingTop, iMax);
            }
            if (H(i) && (this.j & 4) > 0) {
                A(canvas, z ? jvlVar.a - this.l : jvlVar.c, paddingTop, iMax);
            }
        }
    }

    private final void z(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3 + i, this.k + i2);
            this.g.draw(canvas);
        }
    }

    @Override // defpackage.jvj
    public final int a() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, jvj] */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        SparseIntArray sparseIntArray = this.n;
        if (sparseIntArray == null) {
            sparseIntArray = new SparseIntArray(getChildCount());
            this.n = sparseIntArray;
        }
        abi abiVar = this.p;
        ?? r2 = abiVar.b;
        int iH = r2.h();
        List listD = abiVar.d(iH);
        jvm jvmVar = new jvm();
        if (view == null || !(layoutParams instanceof jvk)) {
            jvmVar.b = 1;
        } else {
            jvmVar.b = ((jvk) layoutParams).n();
        }
        if (i == -1 || i == iH || i >= r2.h()) {
            jvmVar.a = iH;
        } else {
            jvmVar.a = i;
            for (int i2 = i; i2 < iH; i2++) {
                ((jvm) listD.get(i2)).a++;
            }
        }
        listD.add(jvmVar);
        this.m = abi.p(iH + 1, listD, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    @Override // defpackage.jvj
    public final int b() {
        return this.d;
    }

    @Override // defpackage.jvj
    public final int c(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof jvn;
    }

    @Override // defpackage.jvj
    public final int d(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // defpackage.jvj
    public final int e(View view) {
        return 0;
    }

    @Override // defpackage.jvj
    public final int f(View view, int i, int i2) {
        int i3;
        int i4;
        if (t()) {
            i3 = F(i, i2) ? this.l : 0;
            if ((this.j & 4) <= 0) {
                return i3;
            }
            i4 = this.l;
        } else {
            i3 = F(i, i2) ? this.k : 0;
            if ((this.i & 4) <= 0) {
                return i3;
            }
            i4 = this.k;
        }
        return i3 + i4;
    }

    @Override // defpackage.jvj
    public final int g() {
        return this.a;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof jvn) {
            return new jvn((jvn) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new jvn((ViewGroup.MarginLayoutParams) layoutParams) : new jvn(layoutParams);
    }

    @Override // defpackage.jvj
    public final int h() {
        return getChildCount();
    }

    @Override // defpackage.jvj
    public final int i() {
        return this.b;
    }

    @Override // defpackage.jvj
    public final int j() {
        Iterator it = this.o.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((jvl) it.next()).e);
        }
        return iMax;
    }

    @Override // defpackage.jvj
    public final int k() {
        return this.f;
    }

    @Override // defpackage.jvj
    public final int l() {
        int size = this.o.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jvl jvlVar = (jvl) this.o.get(i2);
            if (G(i2)) {
                i += t() ? this.k : this.l;
            }
            if (H(i2)) {
                i += t() ? this.k : this.l;
            }
            i += jvlVar.g;
        }
        return i;
    }

    @Override // defpackage.jvj
    public final View m(int i) {
        return getChildAt(i);
    }

    @Override // defpackage.jvj
    public final View n(int i) {
        return u(i);
    }

    @Override // defpackage.jvj
    public final List o() {
        return this.o;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.h == null && this.g == null) {
            return;
        }
        if (this.i == 0 && this.j == 0) {
            return;
        }
        int i = bac.a;
        int layoutDirection = getLayoutDirection();
        int i2 = this.a;
        if (i2 == 0) {
            x(canvas, layoutDirection == 1, this.b == 2);
            return;
        }
        if (i2 == 1) {
            x(canvas, layoutDirection != 1, this.b == 2);
            return;
        }
        if (i2 == 2) {
            boolean z = layoutDirection != 1;
            boolean z2 = layoutDirection == 1;
            if (this.b != 2) {
                z = z2;
            }
            y(canvas, z, false);
            return;
        }
        if (i2 == 3) {
            boolean z3 = layoutDirection != 1;
            boolean z4 = layoutDirection == 1;
            if (this.b != 2) {
                z3 = z4;
            }
            y(canvas, z3, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = bac.a;
        int layoutDirection = getLayoutDirection();
        int i6 = this.a;
        if (i6 == 0) {
            B(layoutDirection == 1, i, i2, i3, i4);
            return;
        }
        if (i6 == 1) {
            B(layoutDirection != 1, i, i2, i3, i4);
            return;
        }
        if (i6 == 2) {
            C(this.b != 2 ? layoutDirection == 1 : layoutDirection != 1, false, i, i2, i3, i4);
        } else {
            if (i6 != 3) {
                throw new IllegalStateException(a.bR(i6, "Invalid flex direction is set: "));
            }
            C(this.b != 2 ? layoutDirection == 1 : layoutDirection != 1, true, i, i2, i3, i4);
        }
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, jvj] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, jvj] */
    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        SparseIntArray sparseIntArray = this.n;
        if (sparseIntArray == null) {
            sparseIntArray = new SparseIntArray(getChildCount());
            this.n = sparseIntArray;
        }
        ?? r1 = this.p.b;
        int iH = r1.h();
        if (sparseIntArray.size() != iH) {
            abi abiVar = this.p;
            SparseIntArray sparseIntArray2 = this.n;
            int iH2 = abiVar.b.h();
            this.m = abi.p(iH2, abiVar.d(iH2), sparseIntArray2);
            break;
        }
        for (int i3 = 0; i3 < iH; i3++) {
            View viewM = r1.m(i3);
            if (viewM != null && ((jvk) viewM.getLayoutParams()).n() != sparseIntArray.get(i3)) {
                abi abiVar2 = this.p;
                SparseIntArray sparseIntArray3 = this.n;
                int iH3 = abiVar2.b.h();
                this.m = abi.p(iH3, abiVar2.d(iH3), sparseIntArray3);
                break;
            }
        }
        int i4 = this.a;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                throw new IllegalStateException(a.bR(i4, "Invalid value for the flex direction is set: "));
            }
            this.o.clear();
            this.q.h();
            this.p.q(this.q, i2, i, Alert.DURATION_SHOW_INDEFINITELY, 0, -1, null);
            this.o = this.q.b;
            this.p.g(i, i2, 0);
            this.p.f(i, i2, getPaddingLeft() + getPaddingRight());
            this.p.m(0);
            D(this.a, i, i2, this.q.a);
            return;
        }
        this.o.clear();
        this.q.h();
        this.p.q(this.q, i, i2, Alert.DURATION_SHOW_INDEFINITELY, 0, -1, null);
        this.o = this.q.b;
        this.p.g(i, i2, 0);
        if (this.d == 3) {
            for (jvl jvlVar : this.o) {
                int iMax = Integer.MIN_VALUE;
                for (int i5 = 0; i5 < jvlVar.h; i5++) {
                    View viewU = u(jvlVar.o + i5);
                    if (viewU != null && viewU.getVisibility() != 8) {
                        jvn jvnVar = (jvn) viewU.getLayoutParams();
                        iMax = this.b != 2 ? Math.max(iMax, viewU.getMeasuredHeight() + Math.max(jvlVar.l - viewU.getBaseline(), jvnVar.topMargin) + jvnVar.bottomMargin) : Math.max(iMax, viewU.getMeasuredHeight() + jvnVar.topMargin + Math.max((jvlVar.l - viewU.getMeasuredHeight()) + viewU.getBaseline(), jvnVar.bottomMargin));
                    }
                }
                jvlVar.g = iMax;
            }
        }
        this.p.f(i, i2, getPaddingTop() + getPaddingBottom());
        this.p.m(0);
        D(this.a, i, i2, this.q.a);
    }

    @Override // defpackage.jvj
    public final void p(View view, int i, int i2, jvl jvlVar) {
        int i3;
        int i4;
        if (F(i, i2)) {
            if (t()) {
                i3 = jvlVar.e;
                i4 = this.l;
            } else {
                i3 = jvlVar.e;
                i4 = this.k;
            }
            jvlVar.e = i3 + i4;
            jvlVar.f += i4;
        }
    }

    @Override // defpackage.jvj
    public final void q(jvl jvlVar) {
        int i;
        int i2;
        if (t()) {
            if ((this.j & 4) <= 0) {
                return;
            }
            i = jvlVar.e;
            i2 = this.l;
        } else {
            if ((this.i & 4) <= 0) {
                return;
            }
            i = jvlVar.e;
            i2 = this.k;
        }
        jvlVar.e = i + i2;
        jvlVar.f += i2;
    }

    @Override // defpackage.jvj
    public final void r(List list) {
        this.o = list;
    }

    @Override // defpackage.jvj
    public final boolean t() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    public final View u(int i) {
        if (i >= 0) {
            int[] iArr = this.m;
            if (i < iArr.length) {
                return getChildAt(iArr[i]);
            }
        }
        return null;
    }

    public final void v(Drawable drawable) {
        if (drawable != this.g) {
            this.g = drawable;
            this.k = drawable.getIntrinsicHeight();
            E();
            requestLayout();
        }
    }

    public final void w(Drawable drawable) {
        if (drawable != this.h) {
            this.h = drawable;
            this.l = drawable.getIntrinsicWidth();
            E();
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new jvn(getContext(), attributeSet);
    }

    @Override // defpackage.jvj
    public final void s(int i, View view) {
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }
}
