package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.car.app.model.Alert;
import defpackage.hhb;
import defpackage.io;
import defpackage.ip;
import defpackage.iq;
import defpackage.is;
import defpackage.ja;
import defpackage.jd;
import defpackage.jx;
import defpackage.jy;
import defpackage.jz;
import defpackage.ka;
import defpackage.kb;
import defpackage.mo;
import defpackage.mp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends mp implements ip, jd {
    public iq a;
    public boolean b;
    public jx c;
    public io d;
    public hhb e;
    private Context i;
    private int j;
    private ja k;
    private boolean l;
    private int m;
    private int n;
    private int o;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t();
        float f = context.getResources().getDisplayMetrics().density;
        this.n = (int) (56.0f * f);
        this.o = (int) (f * 4.0f);
        this.i = context;
        this.j = 0;
    }

    protected static final ka n() {
        ka kaVar = new ka();
        kaVar.gravity = 16;
        return kaVar;
    }

    public static final ka o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            ka kaVar = new ka();
            kaVar.gravity = 16;
            return kaVar;
        }
        ka kaVar2 = layoutParams instanceof ka ? new ka((ka) layoutParams) : new ka(layoutParams);
        if (kaVar2.gravity > 0) {
            return kaVar2;
        }
        kaVar2.gravity = 16;
        return kaVar2;
    }

    @Override // defpackage.jd
    public final void a(iq iqVar) {
        this.a = iqVar;
    }

    @Override // defpackage.ip
    public final boolean b(is isVar) {
        return this.a.z(isVar, null, 0);
    }

    @Override // defpackage.mp
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ka generateLayoutParams(AttributeSet attributeSet) {
        return new ka(getContext(), attributeSet);
    }

    @Override // defpackage.mp, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ka;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mp
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ mo generateDefaultLayoutParams() {
        return n();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final Menu g() {
        if (this.a == null) {
            Context context = getContext();
            iq iqVar = new iq(context);
            this.a = iqVar;
            iqVar.p(new kb(this, 0));
            jx jxVar = new jx(context);
            this.c = jxVar;
            jxVar.p();
            jx jxVar2 = this.c;
            ja jzVar = this.k;
            if (jzVar == null) {
                jzVar = new jz();
            }
            jxVar2.e = jzVar;
            this.a.h(this.c, this.i);
            this.c.j(this);
        }
        return this.a;
    }

    @Override // defpackage.mp, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return n();
    }

    public final void h() {
        jx jxVar = this.c;
        if (jxVar != null) {
            jxVar.n();
        }
    }

    public final void i(ja jaVar, io ioVar) {
        this.k = jaVar;
        this.d = ioVar;
    }

    public final void j(int i) {
        if (this.j != i) {
            this.j = i;
            if (i == 0) {
                this.i = getContext();
            } else {
                this.i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void k(jx jxVar) {
        this.c = jxVar;
        jxVar.j(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mp
    /* JADX INFO: renamed from: kf */
    public final /* bridge */ /* synthetic */ mo generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return o(layoutParams);
    }

    protected final boolean l(int i) {
        boolean zC = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof jy)) {
            zC = ((jy) childAt).c();
        }
        return (i <= 0 || !(childAt2 instanceof jy)) ? zC : zC | ((jy) childAt2).d();
    }

    public final boolean m() {
        jx jxVar = this.c;
        return jxVar != null && jxVar.l();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        jx jxVar = this.c;
        if (jxVar != null) {
            jxVar.i();
            if (this.c.l()) {
                this.c.k();
                this.c.m();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // defpackage.mp, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int paddingLeft;
        if (!this.l) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = this.h;
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        int layoutDirection = getLayoutDirection();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i5 = i6 / 2;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                ka kaVar = (ka) childAt.getLayoutParams();
                if (kaVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i9)) {
                        measuredWidth += i7;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (layoutDirection == 1) {
                        paddingLeft = getPaddingLeft() + kaVar.leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - kaVar.rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i12 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + kaVar.leftMargin) + kaVar.rightMargin;
                    l(i9);
                    i11++;
                }
            }
            i9++;
        }
        if (childCount == 1) {
            if (i10 == 0) {
                View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i13 = i5 - (measuredHeight2 / 2);
                int i14 = (i8 / 2) - (measuredWidth2 / 2);
                childAt2.layout(i14, i13, measuredWidth2 + i14, measuredHeight2 + i13);
                return;
            }
            childCount = 1;
        }
        int i15 = i11 - (i10 ^ 1);
        int iMax = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (layoutDirection == 1) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                ka kaVar2 = (ka) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !kaVar2.a) {
                    int i17 = width2 - kaVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + kaVar2.leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            ka kaVar3 = (ka) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !kaVar3.a) {
                int i20 = paddingLeft2 + kaVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft2 = i20 + measuredWidth4 + kaVar3.rightMargin + iMax;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v46 */
    @Override // defpackage.mp, android.view.View
    protected final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        boolean z2;
        ?? r3;
        boolean z3;
        int i7;
        int i8;
        int i9;
        int i10;
        iq iqVar;
        boolean z4 = this.l;
        boolean z5 = View.MeasureSpec.getMode(i) == 1073741824;
        this.l = z5;
        if (z4 != z5) {
            this.m = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.l && (iqVar = this.a) != null && size != this.m) {
            this.m = size;
            iqVar.l(true);
        }
        int childCount = getChildCount();
        if (!this.l || childCount <= 0) {
            for (int i11 = 0; i11 < childCount; i11++) {
                ka kaVar = (ka) getChildAt(i11).getLayoutParams();
                kaVar.rightMargin = 0;
                kaVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int i12 = size2 - paddingLeft;
        int i13 = this.n;
        int i14 = i12 / i13;
        int i15 = i12 % i13;
        if (i14 == 0) {
            setMeasuredDimension(i12, 0);
            return;
        }
        int i16 = i13 + (i15 / i14);
        int childCount2 = getChildCount();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        boolean z6 = false;
        int iMax = 0;
        int iMax2 = 0;
        long j2 = 0;
        while (i19 < childCount2) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() == 8) {
                i7 = size3;
                i8 = i16;
                i9 = paddingTop;
            } else {
                boolean z7 = childAt instanceof ActionMenuItemView;
                i17++;
                if (z7) {
                    int i20 = this.o;
                    r3 = 0;
                    childAt.setPadding(i20, 0, i20, 0);
                    z3 = true;
                } else {
                    r3 = 0;
                    z3 = false;
                }
                boolean z8 = z3;
                ka kaVar2 = (ka) childAt.getLayoutParams();
                kaVar2.f = r3;
                kaVar2.c = r3;
                kaVar2.b = r3;
                kaVar2.d = r3;
                kaVar2.leftMargin = r3;
                kaVar2.rightMargin = r3;
                kaVar2.e = z8 && ((ActionMenuItemView) childAt).b();
                i7 = size3;
                int i21 = true != kaVar2.a ? i14 : 1;
                ka kaVar3 = (ka) childAt.getLayoutParams();
                i8 = i16;
                i9 = paddingTop;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingTop, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z7 ? (ActionMenuItemView) childAt : null;
                boolean z9 = actionMenuItemView != null && actionMenuItemView.b();
                boolean z10 = z9;
                if (i21 <= 0 || (z9 && i21 < 2)) {
                    i10 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i21 * i8, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i10 = measuredWidth / i8;
                    if (measuredWidth % i8 != 0) {
                        i10++;
                    }
                    if (z10 && i10 < 2) {
                        i10 = 2;
                    }
                }
                kaVar3.d = !kaVar3.a && z10;
                kaVar3.b = i10;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i8, 1073741824), iMakeMeasureSpec);
                iMax = Math.max(iMax, i10);
                if (kaVar2.d) {
                    i18++;
                }
                z6 |= kaVar2.a;
                i14 -= i10;
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight());
                if (i10 == 1) {
                    j2 |= (long) (1 << i19);
                }
            }
            i19++;
            size3 = i7;
            paddingTop = i9;
            i16 = i8;
        }
        int i22 = size3;
        int i23 = i16;
        int i24 = iMax;
        int i25 = iMax2;
        if (z6 && i17 == 2) {
            z = true;
            i17 = 2;
        } else {
            z = false;
        }
        boolean z11 = false;
        while (true) {
            if (i18 <= 0 || i14 <= 0) {
                i3 = i25;
                i4 = 1;
                j = 1;
                break;
            }
            int i26 = Alert.DURATION_SHOW_INDEFINITELY;
            long j3 = 0;
            int i27 = 0;
            int i28 = 0;
            j = 1;
            while (i28 < childCount2) {
                int i29 = i25;
                ka kaVar4 = (ka) getChildAt(i28).getLayoutParams();
                boolean z12 = z;
                if (kaVar4.d) {
                    int i30 = kaVar4.b;
                    if (i30 < i26) {
                        j3 = 1 << i28;
                        i26 = i30;
                        i27 = 1;
                    } else if (i30 == i26) {
                        j3 |= 1 << i28;
                        i27++;
                    }
                }
                i28++;
                z = z12;
                i25 = i29;
            }
            i3 = i25;
            boolean z13 = z;
            j2 |= j3;
            if (i27 > i14) {
                i4 = 1;
                break;
            }
            int i31 = i26 + 1;
            for (int i32 = 0; i32 < childCount2; i32++) {
                View childAt2 = getChildAt(i32);
                ka kaVar5 = (ka) childAt2.getLayoutParams();
                long j4 = 1 << i32;
                if ((j3 & j4) != 0) {
                    if (!z13 || !kaVar5.e) {
                        z2 = true;
                    } else if (i14 == 1) {
                        int i33 = this.o;
                        z2 = true;
                        childAt2.setPadding(i33 + i23, 0, i33, 0);
                        i14 = 1;
                    } else {
                        z2 = true;
                    }
                    kaVar5.b++;
                    kaVar5.f = z2;
                    i14--;
                } else if (kaVar5.b == i31) {
                    j2 |= j4;
                }
            }
            z11 = true;
            z = z13;
            i25 = i3;
        }
        if (z6 || i17 != i4) {
            i5 = i17;
            i6 = 0;
        } else {
            i6 = i4;
            i5 = i6;
        }
        if (i14 > 0 && j2 != 0 && (i14 < i5 - 1 || i6 != 0 || i24 > i4)) {
            float fBitCount = Long.bitCount(j2);
            if (i6 == 0) {
                int i34 = childCount2 - 1;
                if ((j2 & j) != 0 && !((ka) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                if ((j2 & ((long) (1 << i34))) != 0 && !((ka) getChildAt(i34).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i35 = fBitCount > 0.0f ? (int) ((i14 * i23) / fBitCount) : 0;
            int i36 = 0;
            while (i36 < childCount2) {
                if ((j2 & ((long) (1 << i36))) != 0) {
                    View childAt3 = getChildAt(i36);
                    ka kaVar6 = (ka) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        kaVar6.c = i35;
                        kaVar6.f = true;
                        if (i36 == 0) {
                            if (!kaVar6.e) {
                                kaVar6.leftMargin = (-i35) / 2;
                            }
                            i36 = 0;
                        }
                    } else if (kaVar6.a) {
                        kaVar6.c = i35;
                        kaVar6.f = true;
                        kaVar6.rightMargin = (-i35) / 2;
                    } else {
                        int i37 = childCount2 - 1;
                        if (i36 != 0) {
                            kaVar6.leftMargin = i35 / 2;
                        }
                        if (i36 != i37) {
                            kaVar6.rightMargin = i35 / 2;
                        }
                    }
                    z11 = true;
                }
                i36++;
            }
        }
        if (z11) {
            for (int i38 = 0; i38 < childCount2; i38++) {
                View childAt4 = getChildAt(i38);
                ka kaVar7 = (ka) childAt4.getLayoutParams();
                if (kaVar7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((kaVar7.b * i23) + kaVar7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i12, mode == 1073741824 ? i22 : i3);
    }

    @Override // defpackage.mp, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return o(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
