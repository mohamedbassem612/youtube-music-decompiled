package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;
import defpackage.a;
import defpackage.aav;
import defpackage.ace;
import defpackage.asz;
import defpackage.ayg;
import defpackage.ays;
import defpackage.ayt;
import defpackage.ayv;
import defpackage.ayw;
import defpackage.bac;
import defpackage.bcz;
import defpackage.bda;
import defpackage.bdb;
import defpackage.bdc;
import defpackage.zf;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class NestedScrollView extends FrameLayout implements ayv, ays {
    private static final float h = 2.3582017f;
    private static final bcz i = new bcz();
    private static final int[] j = {R.attr.fillViewport};
    private final int[] A;
    private final int[] B;
    private int C;
    private int D;
    private bdc E;
    private final ayw F;
    private final ayt G;
    private float H;
    private boolean I;
    public OverScroller a;
    public EdgeEffect b;
    public EdgeEffect c;
    public bdb d;
    final bda e;
    ayg f;
    zf g;
    private final float k;
    private long l;
    private final Rect m;
    private int n;
    private boolean o;
    private boolean p;
    private View q;
    private boolean r;
    private boolean s;
    private VelocityTracker t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private int y;
    private int z;

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.m = new Rect();
        this.o = true;
        this.p = false;
        this.q = null;
        this.r = false;
        this.s = false;
        this.v = true;
        this.z = -1;
        this.A = new int[2];
        this.B = new int[2];
        this.I = true;
        bda bdaVar = new bda(this);
        this.e = bdaVar;
        this.f = new ayg(getContext(), bdaVar);
        this.b = ace.m(context, attributeSet);
        this.c = ace.m(context, attributeSet);
        this.k = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.a = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.w = viewConfiguration.getScaledTouchSlop();
        this.x = viewConfiguration.getScaledMinimumFlingVelocity();
        this.y = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j, i2, 0);
        k(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        int[] iArr = asz.g;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        bac.o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i2, 0);
        this.I = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        this.F = new ayw();
        this.G = new ayt(this);
        setNestedScrollingEnabled(true);
        bac.p(this, i);
    }

    private final void A() {
        if (this.s) {
            return;
        }
        System.identityHashCode(this);
        this.s = true;
    }

    private final void B() {
        if (this.s) {
            System.identityHashCode(this);
            this.s = false;
        }
    }

    private final void C() {
        this.z = -1;
        this.r = false;
        B();
        G();
        l(0);
        this.b.onRelease();
        this.c.onRelease();
    }

    private final void D() {
        if (this.t == null) {
            this.t = VelocityTracker.obtain();
        }
    }

    private final void E(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.G.f(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    private final void F(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.z) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.n = (int) motionEvent.getY(i2);
            this.z = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private final void G() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.t = null;
        }
    }

    private final void H(boolean z) {
        if (z) {
            r(2, 1);
        } else {
            l(1);
        }
        this.D = getScrollY();
        postInvalidateOnAnimation();
    }

    private final void I(View view) {
        Rect rect = this.m;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int iB = b(rect);
        if (iB != 0) {
            scrollBy(0, iB);
        }
    }

    private final boolean J(View view) {
        return !L(view, 0, getHeight());
    }

    private static boolean K(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && K((View) parent, view2);
    }

    private final boolean L(View view, int i2, int i3) {
        Rect rect = this.m;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i2 >= getScrollY() && rect.top - i2 <= getScrollY() + i3;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    private final boolean M(int i2, int i3, int i4) {
        int i5;
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = height + scrollY;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = (View) focusables.get(i7);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i3 < bottom && top < i4) {
                boolean z3 = i3 < top && bottom < i4;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = i2 != 33 ? bottom > view.getBottom() : top < view.getTop();
                    if (!z2) {
                        if (z3) {
                            z2 = true;
                        } else if (z4) {
                        }
                        view = view2;
                    } else if (z3 && z4) {
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i3 < scrollY) {
            if (i2 == 33) {
                i5 = i3 - scrollY;
            } else {
                i5 = i4 - i6;
            }
            i(i5, -1, null, 0, 1, true);
            z = true;
        } else if (i4 <= i6) {
            z = false;
        } else {
            if (i2 == 33) {
                i5 = i3 - scrollY;
            } else {
                i5 = i4 - i6;
            }
            i(i5, -1, null, 0, 1, true);
            z = true;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i2);
        }
        return z;
    }

    private final boolean N(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        float fK = ace.k(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i2);
        float f = this.k * 0.015f;
        double dLog = Math.log((fAbs * 0.35f) / f);
        double d = h;
        return ((float) (((double) f) * Math.exp((d / ((-1.0d) + d)) * dLog))) < fK;
    }

    private final boolean O(MotionEvent motionEvent) {
        boolean z;
        if (ace.k(this.b) != 0.0f) {
            ace.l(this.b, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (ace.k(this.c) == 0.0f) {
            return z;
        }
        ace.l(this.c, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private final zf P() {
        zf zfVar = this.g;
        if (zfVar != null) {
            return zfVar;
        }
        zf zfVar2 = new zf((View) this, (byte[]) null);
        this.g = zfVar2;
        return zfVar2;
    }

    private static int y(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private final void z() {
        this.a.abortAnimation();
        l(1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    protected final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        if (rect.bottom > i3 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i3, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        if (rect.top >= scrollY || rect.bottom >= i3) {
            return 0;
        }
        return Math.max(rect.height() > height ? -(i3 - rect.bottom) : -(scrollY - rect.top), -getScrollY());
    }

    public final int c() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0089  */
    /* JADX WARN: Code duplicated, block: B:22:0x0098  */
    /* JADX WARN: Code duplicated, block: B:24:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:32:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ff  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i2;
        int iC;
        int overScrollMode;
        if (this.a.isFinished()) {
            return;
        }
        this.a.computeScrollOffset();
        int currY = this.a.getCurrY();
        int i3 = currY - this.D;
        int height = getHeight();
        if (i3 <= 0 || ace.k(this.b) == 0.0f) {
            if (i3 < 0 && ace.k(this.c) != 0.0f) {
                float f = height;
                iRound = Math.round((f / 4.0f) * ace.l(this.c, (i3 * 4.0f) / f, 0.5f));
                if (iRound != i3) {
                    this.c.finish();
                }
            }
            int i4 = i3;
            this.D = currY;
            iArr = this.B;
            iArr[1] = 0;
            n(0, i4, iArr, null, 1);
            i2 = i4 - iArr[1];
            iC = c();
            if (Build.VERSION.SDK_INT >= 35) {
                ace.j(this, Math.abs(this.a.getCurrVelocity()));
            }
            if (i2 != 0) {
                int scrollY = getScrollY();
                u(i2, getScrollX(), scrollY, iC);
                int scrollY2 = getScrollY() - scrollY;
                iArr[1] = 0;
                int i5 = i2 - scrollY2;
                s(scrollY2, i5, this.A, 1, iArr);
                i2 = i5 - iArr[1];
            }
            if (i2 != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && iC > 0)) {
                    if (i2 < 0) {
                        if (this.b.isFinished()) {
                            this.b.onAbsorb((int) this.a.getCurrVelocity());
                        }
                    } else if (this.c.isFinished()) {
                        this.c.onAbsorb((int) this.a.getCurrVelocity());
                    }
                }
                z();
            }
            if (this.a.isFinished()) {
                l(1);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(((-height) / 4.0f) * ace.l(this.b, ((-i3) * 4.0f) / height, 0.5f));
        if (iRound != i3) {
            this.b.finish();
        }
        i3 -= iRound;
        int i6 = i3;
        this.D = currY;
        iArr = this.B;
        iArr[1] = 0;
        n(0, i6, iArr, null, 1);
        i2 = i6 - iArr[1];
        iC = c();
        if (Build.VERSION.SDK_INT >= 35) {
            ace.j(this, Math.abs(this.a.getCurrVelocity()));
        }
        if (i2 != 0) {
            int scrollY3 = getScrollY();
            u(i2, getScrollX(), scrollY3, iC);
            int scrollY4 = getScrollY() - scrollY3;
            iArr[1] = 0;
            int i7 = i2 - scrollY4;
            s(scrollY4, i7, this.A, 1, iArr);
            i2 = i7 - iArr[1];
        }
        if (i2 != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i2 < 0) {
                    if (this.b.isFinished()) {
                        this.b.onAbsorb((int) this.a.getCurrVelocity());
                    }
                } else if (this.c.isFinished()) {
                    this.c.onAbsorb((int) this.a.getCurrVelocity());
                }
            } else if (i2 < 0) {
                if (this.b.isFinished()) {
                    this.b.onAbsorb((int) this.a.getCurrVelocity());
                }
            } else if (this.c.isFinished()) {
                this.c.onAbsorb((int) this.a.getCurrVelocity());
            }
            z();
        }
        if (this.a.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            l(1);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY <= iMax ? bottom : bottom + (scrollY - iMax);
    }

    @Override // defpackage.ayu
    public final void d(View view, int i2, int i3, int[] iArr, int i4) {
        n(i2, i3, iArr, null, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || o(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.G.c(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.G.d(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return n(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.G.f(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.b.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            } else {
                paddingLeft = 0;
            }
            canvas.translate(paddingLeft, iMin);
            this.b.setSize(width, height);
            if (this.b.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.c.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(c(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.c.setSize(width2, height2);
        if (this.c.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // defpackage.ayu
    public final void e(View view, int i2, int i3, int i4, int i5, int i6) {
        E(i5, i6, null);
    }

    @Override // defpackage.ayv
    public final void f(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        E(i5, i6, iArr);
    }

    @Override // defpackage.ayu
    public final void g(View view, View view2, int i2, int i3) {
        this.F.b(i2, i3);
        r(2, i3);
    }

    public final float gO() {
        float f = this.H;
        if (f != 0.0f) {
            return f;
        }
        TypedValue typedValue = new TypedValue();
        Context context = getContext();
        if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
        }
        float dimension = typedValue.getDimension(context.getResources().getDisplayMetrics());
        this.H = dimension;
        return dimension;
    }

    public final void gP(int i2, int i3, boolean z) {
        w(i2 - getScrollX(), i3 - getScrollY(), z);
    }

    @Override // android.view.View
    protected final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.F.a();
    }

    @Override // android.view.View
    protected final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // defpackage.ayu
    public final void h(View view, int i2) {
        this.F.c(i2);
        l(i2);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return q(0);
    }

    /* JADX WARN: Failed to calculate best type for var: r10v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r18v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 'this'  ??, new type: androidx.core.widget.NestedScrollView
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r19v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v28 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v28 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v29 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v0 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v0 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v11 ??, new type: zf
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r18v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 'this'  ??, new type: androidx.core.widget.NestedScrollView
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r19v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v0 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    final int i(int r19, int r20, android.view.MotionEvent r21, int r22, int r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.i(int, int, android.view.MotionEvent, int, int, boolean):int");
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.G.a;
    }

    public void j(int i2) {
        if (getChildCount() > 0) {
            this.a.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY, 0, 0);
            H(true);
            if (Build.VERSION.SDK_INT >= 35) {
                ace.j(this, Math.abs(this.a.getCurrVelocity()));
            }
        }
    }

    public final void k(boolean z) {
        if (z != this.u) {
            this.u = z;
            requestLayout();
        }
    }

    public final void l(int i2) {
        this.G.b(i2);
    }

    public final boolean m(int i2) {
        NestedScrollView nestedScrollView;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        int height = (int) (getHeight() * 0.5f);
        if (viewFindNextFocus == null || !L(viewFindNextFocus, height, getHeight())) {
            if (i2 == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                height = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), height);
            }
            if (height == 0) {
                return false;
            }
            if (i2 != 130) {
                height = -height;
            }
            int i3 = height;
            nestedScrollView = this;
            nestedScrollView.i(i3, -1, null, 0, 1, true);
        } else {
            Rect rect = this.m;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            int iB = b(rect);
            nestedScrollView = this;
            nestedScrollView.i(iB, -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i2);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && nestedScrollView.J(viewFindFocus)) {
            int descendantFocusability = nestedScrollView.getDescendantFocusability();
            nestedScrollView.setDescendantFocusability(131072);
            nestedScrollView.requestFocus();
            nestedScrollView.setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    protected final void measureChild(View view, int i2, int i3) {
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), 0);
    }

    @Override // android.view.ViewGroup
    protected final void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.G.e(i2, i3, iArr, iArr2, i4);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0099  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    public final boolean o(KeyEvent keyEvent) {
        View viewFindFocus;
        View viewFindNextFocus;
        this.m.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? p(33) : m(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? p(130) : m(130);
                    }
                    if (keyCode == 62) {
                        v(true == keyEvent.isShiftPressed() ? 33 : 130);
                    } else {
                        if (keyCode == 92) {
                            return p(33);
                        }
                        if (keyCode == 93) {
                            return p(130);
                        }
                        if (keyCode == 122) {
                            v(33);
                        } else if (keyCode == 123) {
                            v(130);
                        }
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i2;
        int width;
        float axisValue;
        if (motionEvent.getAction() != 8 || this.r) {
            return false;
        }
        if (aav.b(motionEvent, 2)) {
            axisValue = motionEvent.getAxisValue(9);
            i2 = 9;
            width = (int) motionEvent.getX();
        } else if (aav.b(motionEvent, 4194304)) {
            float axisValue2 = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            i2 = 26;
            axisValue = axisValue2;
        } else {
            i2 = 0;
            width = 0;
            axisValue = 0.0f;
        }
        if (axisValue == 0.0f) {
            return false;
        }
        i(-((int) (axisValue * gO())), i2, motionEvent, width, 1, aav.b(motionEvent, 8194));
        if (i2 != 0) {
            this.f.a(motionEvent, i2);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0108  */
    /* JADX WARN: Code duplicated, block: B:64:0x011b  */
    /* JADX WARN: Code duplicated, block: B:65:0x011f  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2) {
            if (this.r) {
                return true;
            }
            action = 2;
        }
        int i2 = action & 255;
        if (i2 == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    if (!O(motionEvent) && this.a.isFinished()) {
                        z = false;
                    }
                    this.r = z;
                    if (z) {
                        A();
                    } else {
                        B();
                    }
                    G();
                } else {
                    this.n = y;
                    this.z = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker = this.t;
                    if (velocityTracker == null) {
                        this.t = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    this.t.addMovement(motionEvent);
                    this.a.computeScrollOffset();
                    if (!O(motionEvent) && this.a.isFinished()) {
                        z = false;
                    }
                    this.r = z;
                    if (z) {
                        A();
                    } else {
                        B();
                    }
                    r(2, 0);
                }
            } else {
                if (!O(motionEvent)) {
                    z = false;
                }
                this.r = z;
                if (z) {
                    A();
                } else {
                    B();
                }
                G();
            }
        } else if (i2 == 1) {
            this.r = false;
            B();
            this.z = -1;
            G();
            if (this.a.springBack(getScrollX(), getScrollY(), 0, 0, 0, c())) {
                postInvalidateOnAnimation();
            }
            l(0);
        } else if (i2 == 2) {
            int i3 = this.z;
            if (i3 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", a.bP(i3, "Invalid pointerId=", " in onInterceptTouchEvent"));
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.n) > this.w && (getNestedScrollAxes() & 2) == 0) {
                        this.r = true;
                        A();
                        this.n = y2;
                        D();
                        this.t.addMovement(motionEvent);
                        this.C = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i2 == 3) {
            this.r = false;
            B();
            this.z = -1;
            G();
            if (this.a.springBack(getScrollX(), getScrollY(), 0, 0, 0, c())) {
                postInvalidateOnAnimation();
            }
            l(0);
        } else if (i2 == 6) {
            F(motionEvent);
        }
        return this.r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        int measuredHeight = 0;
        this.o = false;
        View view = this.q;
        if (view != null && K(view, this)) {
            I(this.q);
        }
        this.q = null;
        if (!this.p) {
            if (this.E != null) {
                scrollTo(getScrollX(), this.E.a);
                this.E = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iY = y(scrollY, paddingTop, measuredHeight);
            if (iY != scrollY) {
                scrollTo(getScrollX(), iY);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.p = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (!this.u || View.MeasureSpec.getMode(i3) == 0 || getChildCount() <= 0) {
            return;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int measuredHeight = childAt.getMeasuredHeight();
        int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
        if (measuredHeight < measuredHeight2) {
            childAt.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        j((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        n(i2, i3, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        E(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        g(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected final void onOverScrolled(int i2, int i3, boolean z, boolean z2) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (viewFindNextFocus == null || J(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i2, rect);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof bdc)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        bdc bdcVar = (bdc) parcelable;
        super.onRestoreInstanceState(bdcVar.getSuperState());
        this.E = bdcVar;
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        bdc bdcVar = new bdc(super.onSaveInstanceState());
        bdcVar.a = getScrollY();
        return bdcVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        bdb bdbVar = this.d;
        if (bdbVar != null) {
            bdbVar.a(this, i2, i3);
        }
    }

    public final boolean onScrollToTop(int i2) {
        if (!this.I || !canScrollVertically(-1)) {
            return false;
        }
        gP(getScrollX(), 0, false);
        return true;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !L(viewFindFocus, 0, i5)) {
            return;
        }
        Rect rect = this.m;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iB = b(rect);
        if (iB != 0) {
            if (this.v) {
                w(0, iB, false);
            } else {
                scrollBy(0, iB);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return t(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        h(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0104  */
    /* JADX WARN: Code duplicated, block: B:49:0x011a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0126  */
    /* JADX WARN: Code duplicated, block: B:53:0x0128  */
    /* JADX WARN: Code duplicated, block: B:56:0x012e  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        NestedScrollView nestedScrollView;
        ViewParent parent;
        float fL;
        int iRound;
        int i2;
        int i3;
        ViewParent parent2;
        int i4;
        D();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = 0;
            actionMasked = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.C);
        if (actionMasked == 0) {
            nestedScrollView = this;
            if (nestedScrollView.getChildCount() == 0) {
                return false;
            }
            if (nestedScrollView.r && (parent = nestedScrollView.getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!nestedScrollView.a.isFinished()) {
                nestedScrollView.z();
            }
            int y = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            nestedScrollView.n = y;
            nestedScrollView.z = pointerId;
            nestedScrollView.r(2, 0);
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.z);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.z + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    int i5 = this.n - y2;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i5 / getHeight();
                    if (ace.k(this.b) != 0.0f) {
                        fL = -ace.l(this.b, -height, x);
                        if (ace.k(this.b) == 0.0f) {
                            this.b.onRelease();
                        }
                    } else if (ace.k(this.c) != 0.0f) {
                        fL = ace.l(this.c, height, 1.0f - x);
                        if (ace.k(this.c) == 0.0f) {
                            this.c.onRelease();
                        }
                    } else {
                        iRound = Math.round(f * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i2 = i5 - iRound;
                        if (!this.r && Math.abs(i2) > this.w) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.r = true;
                            A();
                            i4 = this.w;
                            if (i2 > 0) {
                                i2 -= i4;
                            } else {
                                i2 += i4;
                            }
                        }
                        i3 = i2;
                        if (this.r) {
                            nestedScrollView = this;
                            int i6 = nestedScrollView.i(i3, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            nestedScrollView.n = y2 - i6;
                            nestedScrollView.C += i6;
                        }
                    }
                    f = fL;
                    iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i2 = i5 - iRound;
                    if (!this.r) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.r = true;
                        A();
                        i4 = this.w;
                        if (i2 > 0) {
                            i2 -= i4;
                        } else {
                            i2 += i4;
                        }
                    }
                    i3 = i2;
                    if (this.r) {
                        nestedScrollView = this;
                        int i7 = nestedScrollView.i(i3, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        nestedScrollView.n = y2 - i7;
                        nestedScrollView.C += i7;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.r && getChildCount() > 0 && this.a.springBack(getScrollX(), getScrollY(), 0, 0, 0, c())) {
                    postInvalidateOnAnimation();
                }
                C();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.n = (int) motionEvent.getY(actionIndex);
                this.z = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                F(motionEvent);
                this.n = (int) motionEvent.getY(motionEvent.findPointerIndex(this.z));
            }
            nestedScrollView = this;
        } else {
            nestedScrollView = this;
            VelocityTracker velocityTracker = nestedScrollView.t;
            velocityTracker.computeCurrentVelocity(1000, nestedScrollView.y);
            int yVelocity = (int) velocityTracker.getYVelocity(nestedScrollView.z);
            if (Math.abs(yVelocity) >= nestedScrollView.x) {
                if (ace.k(nestedScrollView.b) == 0.0f) {
                    int i8 = -yVelocity;
                    if (ace.k(nestedScrollView.c) == 0.0f) {
                        float f2 = i8;
                        if (!nestedScrollView.dispatchNestedPreFling(0.0f, f2)) {
                            nestedScrollView.dispatchNestedFling(0.0f, f2, true);
                            nestedScrollView.j(i8);
                        }
                    } else if (nestedScrollView.N(nestedScrollView.c, i8)) {
                        nestedScrollView.c.onAbsorb(i8);
                    } else {
                        nestedScrollView.j(i8);
                    }
                } else if (nestedScrollView.N(nestedScrollView.b, yVelocity)) {
                    nestedScrollView.b.onAbsorb(yVelocity);
                } else {
                    nestedScrollView.j(-yVelocity);
                }
            } else if (nestedScrollView.a.springBack(nestedScrollView.getScrollX(), nestedScrollView.getScrollY(), 0, 0, 0, nestedScrollView.c())) {
                nestedScrollView.postInvalidateOnAnimation();
            }
            nestedScrollView.C();
        }
        VelocityTracker velocityTracker2 = nestedScrollView.t;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final boolean p(int i2) {
        int childCount;
        Rect rect = this.m;
        int height = getHeight();
        rect.top = 0;
        rect.bottom = height;
        if (i2 == 130 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            rect.top = rect.bottom - height;
        }
        return M(i2, rect.top, rect.bottom);
    }

    public final boolean q(int i2) {
        return this.G.g(i2);
    }

    public final boolean r(int i2, int i3) {
        return this.G.h(i2, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.o) {
            this.q = view2;
        } else {
            I(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iB = b(rect);
        boolean z2 = iB != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iB);
            } else {
                w(0, iB, false);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            G();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.o = true;
        super.requestLayout();
    }

    public final void s(int i2, int i3, int[] iArr, int i4, int[] iArr2) {
        this.G.f(0, i2, 0, i3, iArr, i4, iArr2);
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iY = y(i2, width, width2);
            int iY2 = y(i3, height, height2);
            if (iY == getScrollX() && iY2 == getScrollY()) {
                return;
            }
            super.scrollTo(iY, iY2);
        }
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        this.G.a(z);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return r(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        l(0);
    }

    @Override // defpackage.ayu
    public final boolean t(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    final boolean u(int i2, int i3, int i4, int i5) {
        int i6;
        boolean z;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        boolean z2 = i3 > 0 || i3 < 0;
        int i7 = i4 + i2;
        if (i7 <= i5) {
            if (i7 < 0) {
                i6 = 0;
            } else {
                i6 = i7;
                z = false;
            }
            if (z && !q(1)) {
                this.a.springBack(0, i6, 0, 0, 0, c());
            }
            super.scrollTo(0, i6);
            return !z2 || z;
        }
        i6 = i5;
        z = true;
        if (z) {
            this.a.springBack(0, i6, 0, 0, 0, c());
        }
        super.scrollTo(0, i6);
        if (z2) {
        }
    }

    public final void v(int i2) {
        int height = getHeight();
        Rect rect = this.m;
        if (i2 == 130) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            rect.top = getScrollY() - height;
            if (rect.top < 0) {
                rect.top = 0;
            }
        }
        Rect rect2 = this.m;
        rect2.bottom = rect2.top + height;
        M(i2, rect2.top, rect2.bottom);
    }

    public final void w(int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.l > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                this.a.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
                H(z);
            } else {
                if (!this.a.isFinished()) {
                    z();
                }
                scrollBy(i2, i3);
            }
            this.l = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.youtube.music.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }
}
