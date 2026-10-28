package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class duc extends ViewGroup {
    static final int[] a = {R.attr.layout_gravity};
    private static final Comparator i = new asx(2);
    private static final Interpolator j = new bdp(2);
    private boolean A;
    private int B;
    private int C;
    private int D;
    private final boolean E;
    private float F;
    private float G;
    private float H;
    private float I;
    private int J;
    private VelocityTracker K;
    private int L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private boolean Q;
    private int R;
    private List S;
    private final Runnable T;
    private int U;
    public dts b;
    public int c;
    public int d;
    public EdgeEffect e;
    public EdgeEffect f;
    public dty g;
    public List h;
    private int k;
    private final ArrayList l;
    private final dtv m;
    private final Rect n;
    private int o;
    private Parcelable p;
    private ClassLoader q;
    private Scroller r;
    private boolean s;
    private dtz t;
    private float u;
    private float v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public duc(Context context) {
        super(context);
        this.l = new ArrayList();
        this.m = new dtv();
        this.n = new Rect();
        this.o = -1;
        this.p = null;
        this.q = null;
        this.u = -3.4028235E38f;
        this.v = Float.MAX_VALUE;
        this.d = 1;
        this.E = true;
        this.J = -1;
        this.P = true;
        this.T = new px(this, 8, null);
        this.U = 0;
        u(context);
    }

    private final void A(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.J) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.F = motionEvent.getX(i2);
            this.J = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.K;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private final void B(int i2, boolean z, int i3, boolean z2) {
        int scrollX;
        int i4;
        int iAbs;
        dtv dtvVarD = d(i2);
        int iV = dtvVarD != null ? (int) (v() * Math.max(this.u, Math.min(dtvVarD.e, this.v))) : 0;
        if (!z) {
            if (z2) {
                z(i2);
            }
            y(false);
            scrollTo(iV, 0);
            D(iV);
            return;
        }
        if (getChildCount() == 0) {
            C(false);
        } else {
            Scroller scroller = this.r;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                boolean z3 = this.s;
                Scroller scroller2 = this.r;
                scrollX = z3 ? scroller2.getCurrX() : scroller2.getStartX();
                this.r.abortAnimation();
                C(false);
            }
            int i5 = scrollX;
            int scrollY = getScrollY();
            int i6 = iV - i5;
            int i7 = -scrollY;
            if (i6 != 0) {
                i4 = i6;
            } else if (i7 == 0) {
                y(false);
                h();
                o(0);
            } else {
                i4 = 0;
            }
            C(true);
            o(2);
            int iV2 = v();
            int i8 = iV2 / 2;
            float f = iV2;
            float fSin = (float) Math.sin((Math.min(1.0f, Math.abs(i4) / f) - 0.5f) * 0.47123894f);
            int iAbs2 = Math.abs(i3);
            if (iAbs2 > 0) {
                float f2 = i8;
                iAbs = Math.round(Math.abs((f2 + (fSin * f2)) / iAbs2) * 1000.0f) << 2;
            } else {
                iAbs = (int) (((Math.abs(i4) / (f + 0.0f)) + 1.0f) * 100.0f);
            }
            int iMin = Math.min(iAbs, 600);
            this.s = false;
            this.r.startScroll(i5, scrollY, i4, i7, iMin);
            postInvalidateOnAnimation();
        }
        if (z2) {
            z(i2);
        }
    }

    private final void C(boolean z) {
        if (this.x != z) {
            this.x = z;
        }
    }

    private final boolean D(int i2) {
        if (this.l.size() == 0) {
            if (this.P) {
                return false;
            }
            this.Q = false;
            g(0, 0.0f, 0);
            if (this.Q) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        dtv dtvVarX = x();
        float fV = v();
        int i3 = dtvVarX.b;
        float f = (i2 / fV) - dtvVarX.e;
        float f2 = dtvVarX.d;
        this.Q = false;
        float f3 = f / (f2 + (0.0f / fV));
        g(i3, f3, (int) (fV * f3));
        if (this.Q) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private final boolean E(float f, float f2) {
        float fL;
        boolean z;
        float f3 = this.F - f;
        this.F = f;
        float height = getHeight();
        float width = f3 / getWidth();
        float f4 = f2 / height;
        if (ace.k(this.e) != 0.0f) {
            fL = -ace.l(this.e, -width, 1.0f - f4);
        } else {
            fL = ace.k(this.f) != 0.0f ? ace.l(this.f, width, f4) : 0.0f;
        }
        float width2 = fL * getWidth();
        float f5 = f3 - width2;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = width2 != 0.0f;
        if (Math.abs(f5) < 1.0E-4f) {
            return z4;
        }
        float scrollX = getScrollX() + f5;
        float fV = v();
        float f6 = this.u * fV;
        float f7 = this.v * fV;
        ArrayList arrayList = this.l;
        dtv dtvVar = (dtv) arrayList.get(0);
        dtv dtvVar2 = (dtv) arrayList.get(arrayList.size() - 1);
        if (dtvVar.b != 0) {
            f6 = dtvVar.e * fV;
            z = false;
        } else {
            z = true;
        }
        if (dtvVar2.b != this.b.g() - 1) {
            f7 = dtvVar2.e * fV;
        } else {
            z2 = true;
        }
        if (scrollX < f6) {
            if (z) {
                ace.l(this.e, (f6 - scrollX) / fV, 1.0f - (f2 / getHeight()));
            } else {
                z3 = z4;
            }
            scrollX = f6;
        } else if (scrollX > f7) {
            if (z2) {
                ace.l(this.f, (scrollX - f7) / fV, f2 / getHeight());
            } else {
                z3 = z4;
            }
            scrollX = f7;
        } else {
            z3 = z4;
        }
        int i2 = (int) scrollX;
        this.F += scrollX - i2;
        scrollTo(i2, getScrollY());
        D(i2);
        return z3;
    }

    private final boolean F() {
        this.J = -1;
        this.z = false;
        this.A = false;
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.K = null;
        }
        this.e.onRelease();
        this.f.onRelease();
        return (this.e.isFinished() && this.f.isFinished()) ? false : true;
    }

    private final void G() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private final int v() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private final Rect w(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.left = view.getLeft();
            rect.right = view.getRight();
            rect.top = view.getTop();
            rect.bottom = view.getBottom();
            ViewParent parent = view.getParent();
            while ((parent instanceof ViewGroup) && parent != this) {
                ViewGroup viewGroup = (ViewGroup) parent;
                rect.left += viewGroup.getLeft();
                rect.right += viewGroup.getRight();
                rect.top += viewGroup.getTop();
                rect.bottom += viewGroup.getBottom();
                parent = viewGroup.getParent();
            }
        }
        return rect;
    }

    private final dtv x() {
        float f;
        float scrollX;
        int i2;
        int iV = v();
        float f2 = 0.0f;
        if (iV > 0) {
            scrollX = getScrollX() / iV;
            f = 0.0f / iV;
        } else {
            f = 0.0f;
            scrollX = 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        boolean z = true;
        dtv dtvVar = null;
        float f3 = 0.0f;
        while (true) {
            ArrayList arrayList = this.l;
            if (i3 >= arrayList.size()) {
                return dtvVar;
            }
            dtv dtvVar2 = (dtv) arrayList.get(i3);
            if (!z && dtvVar2.b != (i2 = i4 + 1)) {
                dtvVar2 = this.m;
                dtvVar2.e = f2 + f3 + f;
                dtvVar2.b = i2;
                dtvVar2.d = 1.0f;
                i3--;
            }
            dtv dtvVar3 = dtvVar2;
            f2 = dtvVar3.e;
            float f4 = dtvVar3.d + f2 + f;
            if (!z && scrollX < f2) {
                return dtvVar;
            }
            if (scrollX < f4 || i3 == arrayList.size() - 1) {
                return dtvVar3;
            }
            i4 = dtvVar3.b;
            i3++;
            dtvVar = dtvVar3;
            f3 = dtvVar3.d;
            z = false;
        }
    }

    private final void y(boolean z) {
        boolean z2 = this.U == 2;
        if (z2) {
            C(false);
            if (!this.r.isFinished()) {
                this.r.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.r.getCurrX();
                int currY = this.r.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        D(currX);
                    }
                }
            }
        }
        this.y = false;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i2 >= arrayList.size()) {
                break;
            }
            dtv dtvVar = (dtv) arrayList.get(i2);
            if (dtvVar.c) {
                dtvVar.c = false;
                z2 = true;
            }
            i2++;
        }
        if (z2) {
            Runnable runnable = this.T;
            if (!z) {
                runnable.run();
            } else {
                int i3 = bac.a;
                postOnAnimation(runnable);
            }
        }
    }

    private final void z(int i2) {
        dty dtyVar = this.g;
        if (dtyVar != null) {
            dtyVar.c(i2);
        }
        List list = this.S;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                dty dtyVar2 = (dty) this.S.get(i3);
                if (dtyVar2 != null) {
                    dtyVar2.c(i2);
                }
            }
        }
    }

    public int a() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        dtv dtvVarC;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (dtvVarC = c(childAt)) != null && dtvVarC.b == this.c) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (isFocusable()) {
            if (((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        dtv dtvVarC;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (dtvVarC = c(childAt)) != null && dtvVarC.b == this.c) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new dtw();
        }
        dtw dtwVar = (dtw) layoutParams;
        boolean z = dtwVar.a | (view.getClass().getAnnotation(dtu.class) != null);
        dtwVar.a = z;
        if (!this.w) {
            super.addView(view, i2, layoutParams);
        } else {
            if (dtwVar != null && z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            dtwVar.d = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    final dtv b(int i2, int i3) {
        dtv dtvVar = new dtv();
        dtvVar.b = i2;
        dtvVar.a = this.b.j(this, i2);
        dtvVar.d = 1.0f;
        if (i3 >= 0) {
            ArrayList arrayList = this.l;
            if (i3 < arrayList.size()) {
                arrayList.add(i3, dtvVar);
            } else {
                this.l.add(dtvVar);
            }
        } else {
            this.l.add(dtvVar);
        }
        return dtvVar;
    }

    final dtv c(View view) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i2 >= arrayList.size()) {
                return null;
            }
            dtv dtvVar = (dtv) arrayList.get(i2);
            if (this.b.d(view, dtvVar.a)) {
                return dtvVar;
            }
            i2++;
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.b == null) {
            return false;
        }
        int iV = v();
        int scrollX = getScrollX();
        if (i2 < 0) {
            if (scrollX <= ((int) (iV * this.u))) {
                return false;
            }
        } else if (i2 <= 0 || scrollX >= ((int) (iV * this.v))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof dtw) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.s = true;
        if (this.r.isFinished() || !this.r.computeScrollOffset()) {
            y(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.r.getCurrX();
        int currY = this.r.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!D(currX)) {
                this.r.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    final dtv d(int i2) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i3 >= arrayList.size()) {
                return null;
            }
            dtv dtvVar = (dtv) arrayList.get(i3);
            if (dtvVar.b == i2) {
                return dtvVar;
            }
            i3++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || r(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        dtv dtvVarC;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (dtvVarC = c(childAt)) != null && dtvVarC.b == this.c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean zDraw;
        dts dtsVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (dtsVar = this.b) == null || dtsVar.g() <= 1)) {
            this.e.finish();
            this.f.finish();
            return;
        }
        if (this.e.isFinished()) {
            zDraw = false;
        } else {
            int iSave = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.u * width);
            this.e.setSize(height, width);
            zDraw = this.e.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        if (!this.f.isFinished()) {
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.v + 1.0f)) * width2);
            this.f.setSize(height2, width2);
            zDraw |= this.f.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    public void e(dty dtyVar) {
        if (this.S == null) {
            this.S = new ArrayList();
        }
        this.S.add(dtyVar);
    }

    final void f() {
        int iG = this.b.g();
        this.k = iG;
        ArrayList arrayList = this.l;
        boolean z = arrayList.size() < (this.d << 1) + 1 && arrayList.size() < iG;
        int iMax = this.c;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < arrayList.size()) {
            dtv dtvVar = (dtv) arrayList.get(i2);
            int iH = this.b.h(dtvVar.a);
            if (iH != -1) {
                if (iH == -2) {
                    arrayList.remove(i2);
                    i2--;
                    if (!z2) {
                        this.b.c(this);
                    }
                    this.b.k(this, dtvVar.b, dtvVar.a);
                    int i3 = this.c;
                    if (i3 == dtvVar.b) {
                        iMax = Math.max(0, Math.min(i3, (-1) + iG));
                    }
                    z = true;
                    z2 = true;
                } else {
                    int i4 = dtvVar.b;
                    if (i4 != iH) {
                        if (i4 == this.c) {
                            iMax = iH;
                        }
                        dtvVar.b = iH;
                        z = true;
                    }
                }
            }
            i2++;
        }
        if (z2) {
            this.b.e();
        }
        Collections.sort(arrayList, i);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                dtw dtwVar = (dtw) getChildAt(i5).getLayoutParams();
                if (!dtwVar.a) {
                    dtwVar.c = 0.0f;
                }
            }
            n(iMax, false, true, 0);
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    protected final void g(int i2, float f, int i3) {
        int iMax;
        int width;
        int left;
        if (this.R > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                dtw dtwVar = (dtw) childAt.getLayoutParams();
                if (dtwVar.a) {
                    int i5 = dtwVar.b & 7;
                    if (i5 != 1) {
                        if (i5 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i5 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i6 = iMax;
                    width = paddingLeft;
                    paddingLeft = i6;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        dty dtyVar = this.g;
        if (dtyVar != null) {
            dtyVar.b(i2, f, i3);
        }
        List list = this.S;
        if (list != null) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                dty dtyVar2 = (dty) this.S.get(i7);
                if (dtyVar2 != null) {
                    dtyVar2.b(i2, f, i3);
                }
            }
        }
        this.Q = true;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new dtw();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new dtw(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i2, int i3) {
        throw null;
    }

    public final void h() {
        i(this.c);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00e5 A[PHI: r5 r7 r11
      0x00e5: PHI (r5v58 float) = (r5v57 float), (r5v60 float) binds: [B:57:0x00db, B:54:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r7v13 int) = (r7v12 int), (r7v4 int) binds: [B:57:0x00db, B:54:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r11v30 int) = (r11v1 int), (r11v32 int) binds: [B:57:0x00db, B:54:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x016c A[PHI: r4
      0x016c: PHI (r4v15 float) = (r4v14 float), (r4v17 float) binds: [B:93:0x0163, B:90:0x014f] A[DONT_GENERATE, DONT_INLINE]] */
    final void i(int i2) {
        dtv dtvVarD;
        String hexString;
        ArrayList arrayList;
        dtv dtvVarB;
        float f;
        dtv dtvVarC;
        dtv dtvVarC2;
        int i3;
        int i4;
        dtv dtvVar;
        dtv dtvVar2;
        dtv dtvVar3;
        int i5 = this.c;
        if (i5 != i2) {
            dtvVarD = d(i5);
            this.c = i2;
        } else {
            dtvVarD = null;
        }
        if (this.b == null || this.y || getWindowToken() == null) {
            return;
        }
        this.b.c(this);
        int i6 = this.d;
        int iMax = Math.max(0, this.c - i6);
        int iG = this.b.g();
        int iMin = Math.min(iG - 1, this.c + i6);
        if (iG != this.k) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.k + ", found: " + iG + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.b.getClass());
        }
        int i7 = 0;
        while (true) {
            arrayList = this.l;
            if (i7 < arrayList.size()) {
                dtvVarB = (dtv) arrayList.get(i7);
                int i8 = dtvVarB.b;
                int i9 = this.c;
                if (i8 >= i9) {
                    if (i8 != i9) {
                        break;
                    } else {
                        break;
                    }
                }
                i7++;
            }
            dtvVarB = null;
            break;
        }
        if (dtvVarB == null && iG > 0) {
            dtvVarB = b(this.c, i7);
        }
        if (dtvVarB != null) {
            int i10 = i7 - 1;
            dtv dtvVar4 = i10 >= 0 ? (dtv) arrayList.get(i10) : null;
            int iV = v();
            float paddingLeft = iV <= 0 ? 0.0f : (2.0f - dtvVarB.d) + (getPaddingLeft() / iV);
            float f2 = 0.0f;
            for (int i11 = this.c - 1; i11 >= 0; i11--) {
                if (f2 >= paddingLeft && i11 < iMax) {
                    if (dtvVar4 == null) {
                        break;
                    }
                    if (i11 == dtvVar4.b && !dtvVar4.c) {
                        int i12 = i10 - 1;
                        i7--;
                        arrayList.remove(i10);
                        this.b.k(this, i11, dtvVar4.a);
                        dtvVar4 = i12 >= 0 ? (dtv) arrayList.get(i12) : null;
                        i10 = i12;
                    }
                } else if (dtvVar4 == null || i11 != dtvVar4.b) {
                    i7++;
                    f2 += b(i11, i10 + 1).d;
                    if (i10 >= 0) {
                        dtvVar3 = (dtv) arrayList.get(i10);
                        dtvVar4 = dtvVar3;
                    } else {
                        dtvVar4 = null;
                    }
                } else {
                    i10--;
                    f2 += dtvVar4.d;
                    if (i10 >= 0) {
                        dtvVar3 = (dtv) arrayList.get(i10);
                        dtvVar4 = dtvVar3;
                    } else {
                        dtvVar4 = null;
                    }
                }
            }
            f = 0.0f;
            int i13 = i7 + 1;
            float f3 = dtvVarB.d;
            if (f3 < 2.0f) {
                dtv dtvVar5 = i13 < arrayList.size() ? (dtv) arrayList.get(i13) : null;
                float paddingRight = iV <= 0 ? 0.0f : (getPaddingRight() / iV) + 2.0f;
                int i14 = i13;
                for (int i15 = this.c + 1; i15 < iG; i15++) {
                    if (f3 >= paddingRight && i15 > iMin) {
                        if (dtvVar5 == null) {
                            break;
                        }
                        if (i15 == dtvVar5.b && !dtvVar5.c) {
                            arrayList.remove(i14);
                            this.b.k(this, i15, dtvVar5.a);
                            dtvVar5 = i14 < arrayList.size() ? (dtv) arrayList.get(i14) : null;
                        }
                    } else {
                        int i16 = i14 + 1;
                        if (dtvVar5 == null || i15 != dtvVar5.b) {
                            f3 += b(i15, i14).d;
                            if (i16 < arrayList.size()) {
                                dtvVar5 = (dtv) arrayList.get(i16);
                            } else {
                                dtvVar5 = null;
                            }
                        } else {
                            f3 += dtvVar5.d;
                            if (i16 < arrayList.size()) {
                                dtvVar5 = (dtv) arrayList.get(i16);
                            } else {
                                dtvVar5 = null;
                            }
                        }
                        i14 = i16;
                    }
                }
            }
            int iG2 = this.b.g();
            int iV2 = v();
            float f4 = iV2 > 0 ? 0.0f / iV2 : 0.0f;
            if (dtvVarD != null) {
                int i17 = dtvVarD.b;
                int i18 = dtvVarB.b;
                if (i17 < i18) {
                    float f5 = dtvVarD.e + dtvVarD.d + f4;
                    int i19 = i17 + 1;
                    int i20 = 0;
                    while (i19 <= dtvVarB.b && i20 < arrayList.size()) {
                        Object obj = arrayList.get(i20);
                        while (true) {
                            dtvVar2 = (dtv) obj;
                            if (i19 <= dtvVar2.b || i20 >= arrayList.size() - 1) {
                                break;
                            }
                            i20++;
                            obj = arrayList.get(i20);
                        }
                        while (i19 < dtvVar2.b) {
                            f5 += f4 + 1.0f;
                            i19++;
                        }
                        dtvVar2.e = f5;
                        f5 += dtvVar2.d + f4;
                        i19++;
                    }
                } else if (i17 > i18) {
                    int size = arrayList.size() - 1;
                    float f6 = dtvVarD.e;
                    while (true) {
                        i17--;
                        if (i17 < dtvVarB.b || size < 0) {
                            break;
                        }
                        Object obj2 = arrayList.get(size);
                        while (true) {
                            dtvVar = (dtv) obj2;
                            if (i17 >= dtvVar.b || size <= 0) {
                                break;
                            }
                            size--;
                            obj2 = arrayList.get(size);
                        }
                        while (i17 > dtvVar.b) {
                            f6 -= f4 + 1.0f;
                            i17--;
                        }
                        f6 -= dtvVar.d + f4;
                        dtvVar.e = f6;
                    }
                }
            }
            int size2 = arrayList.size();
            float f7 = dtvVarB.e;
            int i21 = dtvVarB.b;
            int i22 = i21 - 1;
            this.u = i21 == 0 ? f7 : -3.4028235E38f;
            int i23 = iG2 - 1;
            this.v = i21 == i23 ? (dtvVarB.d + f7) - 1.0f : Float.MAX_VALUE;
            for (int i24 = i7 - 1; i24 >= 0; i24--) {
                dtv dtvVar6 = (dtv) arrayList.get(i24);
                while (true) {
                    i4 = dtvVar6.b;
                    if (i22 <= i4) {
                        break;
                    }
                    f7 -= f4 + 1.0f;
                    i22--;
                }
                f7 -= dtvVar6.d + f4;
                dtvVar6.e = f7;
                if (i4 == 0) {
                    this.u = f7;
                }
                i22--;
            }
            float f8 = dtvVarB.e + dtvVarB.d + f4;
            int i25 = dtvVarB.b + 1;
            while (i13 < size2) {
                dtv dtvVar7 = (dtv) arrayList.get(i13);
                while (true) {
                    i3 = dtvVar7.b;
                    if (i25 >= i3) {
                        break;
                    }
                    f8 += f4 + 1.0f;
                    i25++;
                }
                if (i3 == i23) {
                    this.v = (dtvVar7.d + f8) - 1.0f;
                }
                dtvVar7.e = f8;
                f8 += dtvVar7.d + f4;
                i25++;
                i13++;
            }
            this.b.f(dtvVarB.a);
        } else {
            f = 0.0f;
        }
        this.b.e();
        int childCount = getChildCount();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt = getChildAt(i26);
            dtw dtwVar = (dtw) childAt.getLayoutParams();
            dtwVar.f = i26;
            if (!dtwVar.a && dtwVar.c == f && (dtvVarC2 = c(childAt)) != null) {
                dtwVar.c = dtvVarC2.d;
                dtwVar.e = dtvVarC2.b;
            }
        }
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == null) {
                dtvVarC = null;
                break;
            }
            while (true) {
                Object parent = viewFindFocus.getParent();
                if (parent == this) {
                    dtvVarC = c(viewFindFocus);
                    break;
                } else {
                    if (!(parent instanceof View)) {
                        dtvVarC = null;
                        break;
                    }
                    viewFindFocus = (View) parent;
                }
            }
            if (dtvVarC == null || dtvVarC.b != this.c) {
                for (int i27 = 0; i27 < getChildCount(); i27++) {
                    View childAt2 = getChildAt(i27);
                    dtv dtvVarC3 = c(childAt2);
                    if (dtvVarC3 != null && dtvVarC3.b == this.c && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public void j(dty dtyVar) {
        List list = this.S;
        if (list != null) {
            list.remove(dtyVar);
        }
    }

    public final void k(dts dtsVar) {
        ArrayList arrayList;
        dts dtsVar2 = this.b;
        if (dtsVar2 != null) {
            dtsVar2.n(null);
            this.b.c(this);
            int i2 = 0;
            while (true) {
                arrayList = this.l;
                if (i2 >= arrayList.size()) {
                    break;
                }
                dtv dtvVar = (dtv) arrayList.get(i2);
                this.b.k(this, dtvVar.b, dtvVar.a);
                i2++;
            }
            this.b.e();
            arrayList.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((dtw) getChildAt(i3).getLayoutParams()).a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.c = 0;
            scrollTo(0, 0);
        }
        this.b = dtsVar;
        this.k = 0;
        if (dtsVar != null) {
            dtz dtzVar = this.t;
            if (dtzVar == null) {
                dtzVar = new dtz(this);
                this.t = dtzVar;
            }
            this.b.n(dtzVar);
            this.y = false;
            boolean z = this.P;
            this.P = true;
            this.k = this.b.g();
            if (this.o >= 0) {
                this.b.b(this.p, this.q);
                n(this.o, false, true, 0);
                this.o = -1;
                this.p = null;
                this.q = null;
            } else if (z) {
                requestLayout();
            } else {
                h();
            }
        }
        List list = this.h;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.h.size();
        for (int i4 = 0; i4 < size; i4++) {
            afde afdeVar = (afde) this.h.get(i4);
            TabLayout tabLayout = afdeVar.b;
            if (tabLayout.A == this) {
                tabLayout.m(dtsVar, afdeVar.a);
            }
        }
    }

    public void l(int i2) {
        this.y = false;
        n(i2, !this.P, false, 0);
    }

    public void m(int i2, boolean z) {
        this.y = false;
        n(i2, z, false, 0);
    }

    final void n(int i2, boolean z, boolean z2, int i3) {
        dts dtsVar = this.b;
        if (dtsVar == null || dtsVar.g() <= 0) {
            C(false);
            return;
        }
        if (!z2 && this.c == i2 && this.l.size() != 0) {
            C(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.b.g()) {
            i2 = this.b.g() - 1;
        }
        int i4 = this.d;
        int i5 = this.c;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            int i6 = 0;
            while (true) {
                ArrayList arrayList = this.l;
                if (i6 >= arrayList.size()) {
                    break;
                }
                ((dtv) arrayList.get(i6)).c = true;
                i6++;
            }
        }
        boolean z3 = this.c != i2;
        if (!this.P) {
            i(i2);
            B(i2, z, i3, z3);
        } else {
            this.c = i2;
            if (z3) {
                z(i2);
            }
            requestLayout();
        }
    }

    public final void o(int i2) {
        if (this.U != i2) {
            this.U = i2;
            dty dtyVar = this.g;
            if (dtyVar != null) {
                dtyVar.a(i2);
            }
            List list = this.S;
            if (list != null) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    dty dtyVar2 = (dty) this.S.get(i3);
                    if (dtyVar2 != null) {
                        dtyVar2.a(i2);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.T);
        Scroller scroller = this.r;
        if (scroller != null && !scroller.isFinished()) {
            this.r.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            F();
            return false;
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.H = x;
            this.F = x;
            float y = motionEvent.getY();
            this.I = y;
            this.G = y;
            this.J = motionEvent.getPointerId(0);
            this.A = false;
            this.s = true;
            this.r.computeScrollOffset();
            if (this.U == 2 && Math.abs(this.r.getFinalX() - this.r.getCurrX()) > this.O) {
                this.r.abortAnimation();
                this.y = false;
                h();
                this.z = true;
                G();
                o(1);
            } else if (ace.k(this.e) == 0.0f && ace.k(this.f) == 0.0f) {
                y(false);
                this.z = false;
            } else {
                this.z = true;
                o(1);
                if (ace.k(this.e) != 0.0f) {
                    ace.l(this.e, 0.0f, 1.0f - (this.G / getHeight()));
                }
                if (ace.k(this.f) != 0.0f) {
                    ace.l(this.f, 0.0f, this.G / getHeight());
                }
            }
        } else {
            if (this.z) {
                return true;
            }
            if (this.A) {
                return false;
            }
            if (action == 2) {
                int i2 = this.J;
                if (i2 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float f = x2 - this.F;
                    float fAbs = Math.abs(f);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.I);
                    if (f != 0.0f) {
                        float f2 = this.F;
                        if ((this.E || ((f2 >= this.C || f <= 0.0f) && (f2 <= getWidth() - this.C || f >= 0.0f))) && q(this, false, (int) f, (int) x2, (int) y2)) {
                            this.F = x2;
                            this.G = y2;
                            this.A = true;
                            return false;
                        }
                    }
                    float f3 = this.D;
                    if (fAbs > f3 && fAbs * 0.5f > fAbs2) {
                        this.z = true;
                        G();
                        o(1);
                        float f4 = this.H;
                        this.F = f > 0.0f ? f4 + this.D : f4 - this.D;
                        this.G = y2;
                        C(true);
                    } else if (fAbs2 > f3) {
                        this.A = true;
                    }
                    if (this.z && E(x2, y2)) {
                        postInvalidateOnAnimation();
                    }
                }
            } else if (action == 6) {
                A(motionEvent);
            }
        }
        VelocityTracker velocityTrackerObtain = this.K;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.K = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        return this.z;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        dtv dtvVarC;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i6 = i5 - i3;
            i7 = i4 - i2;
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                dtw dtwVar = (dtw) childAt.getLayoutParams();
                if (dtwVar.a) {
                    int i10 = dtwVar.b;
                    int i11 = i10 & 7;
                    int i12 = i10 & 112;
                    if (i11 != 1) {
                        if (i11 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i11 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i7 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i12 != 16) {
                            if (i12 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i12 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i13 = paddingLeft + scrollX;
                            childAt.layout(i13, paddingTop, childAt.getMeasuredWidth() + i13, childAt.getMeasuredHeight() + paddingTop);
                            i9++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i14 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i14;
                        int i15 = paddingLeft + scrollX;
                        childAt.layout(i15, paddingTop, childAt.getMeasuredWidth() + i15, childAt.getMeasuredHeight() + paddingTop);
                        i9++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i7 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i16 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i16;
                    if (i12 != 16) {
                        if (i12 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i12 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i17 = paddingLeft + scrollX;
                        childAt.layout(i17, paddingTop, childAt.getMeasuredWidth() + i17, childAt.getMeasuredHeight() + paddingTop);
                        i9++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i18 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i18;
                    int i19 = paddingLeft + scrollX;
                    childAt.layout(i19, paddingTop, childAt.getMeasuredWidth() + i19, childAt.getMeasuredHeight() + paddingTop);
                    i9++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
            i8++;
        }
        int i20 = (i7 - paddingLeft) - paddingRight;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8) {
                dtw dtwVar2 = (dtw) childAt2.getLayoutParams();
                if (!dtwVar2.a && (dtvVarC = c(childAt2)) != null) {
                    float f = i20;
                    int i22 = ((int) (dtvVarC.e * f)) + paddingLeft;
                    if (dtwVar2.d) {
                        dtwVar2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * dtwVar2.c), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i22, paddingTop, childAt2.getMeasuredWidth() + i22, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.R = i9;
        if (this.P) {
            B(this.c, false, 0, false);
        }
        this.P = false;
    }

    @Override // android.view.View
    protected final void onMeasure(int i2, int i3) {
        dtw dtwVar;
        dtw dtwVar2;
        int i4;
        int i5;
        int i6;
        boolean z = false;
        setMeasuredDimension(getDefaultSize(0, i2), getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.C = Math.min(measuredWidth / 10, this.B);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            boolean z2 = true;
            int i8 = 1073741824;
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8 && (dtwVar2 = (dtw) childAt.getLayoutParams()) != null && dtwVar2.a) {
                int i9 = dtwVar2.b;
                int i10 = i9 & 7;
                int i11 = i9 & 112;
                boolean z3 = (i11 == 48 || i11 == 80) ? true : z;
                if (i10 != 3 && i10 != 5) {
                    z2 = z;
                }
                int i12 = Integer.MIN_VALUE;
                if (z3) {
                    i4 = Integer.MIN_VALUE;
                    i12 = 1073741824;
                } else {
                    i4 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                if (dtwVar2.width != -2) {
                    i5 = dtwVar2.width != -1 ? dtwVar2.width : paddingLeft;
                    i12 = 1073741824;
                } else {
                    i5 = paddingLeft;
                }
                if (dtwVar2.height != -2) {
                    i6 = dtwVar2.height != -1 ? dtwVar2.height : measuredHeight;
                } else {
                    i6 = measuredHeight;
                    i8 = i4;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, i12), View.MeasureSpec.makeMeasureSpec(i6, i8));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i7++;
            z = false;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.w = true;
        h();
        this.w = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((dtwVar = (dtw) childAt2.getLayoutParams()) == null || !dtwVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * dtwVar.c), 1073741824), iMakeMeasureSpec);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        int i5;
        dtv dtvVarC;
        int i6 = i2 & 2;
        int childCount = getChildCount();
        if (i6 != 0) {
            i5 = childCount;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
            i5 = -1;
        }
        while (i3 != i5) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (dtvVarC = c(childAt)) != null && dtvVarC.b == this.c && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof dua)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        dua duaVar = (dua) parcelable;
        super.onRestoreInstanceState(duaVar.d);
        dts dtsVar = this.b;
        if (dtsVar != null) {
            dtsVar.b(duaVar.b, duaVar.e);
            n(duaVar.a, false, true, 0);
        } else {
            this.o = duaVar.a;
            this.p = duaVar.b;
            this.q = duaVar.e;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        dua duaVar = new dua(super.onSaveInstanceState());
        duaVar.a = this.c;
        dts dtsVar = this.b;
        if (dtsVar != null) {
            duaVar.b = dtsVar.a();
        }
        return duaVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            if (i4 > 0 && !this.l.isEmpty()) {
                if (!this.r.isFinished()) {
                    this.r.setFinalX(a() * v());
                    return;
                }
                scrollTo((int) ((getScrollX() / ((i4 - getPaddingLeft()) - getPaddingRight())) * ((i2 - getPaddingLeft()) - getPaddingRight())), getScrollY());
                return;
            }
            dtv dtvVarD = d(this.c);
            int iMin = (int) ((dtvVarD != null ? Math.min(dtvVarD.e, this.v) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
            if (iMin != getScrollX()) {
                y(false);
                scrollTo(iMin, getScrollY());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ad  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        dts dtsVar;
        int iMax;
        boolean zE;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (dtsVar = this.b) == null || dtsVar.g() == 0) {
            return false;
        }
        VelocityTracker velocityTrackerObtain = this.K;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.K = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.r.abortAnimation();
            this.y = false;
            h();
            float x = motionEvent.getX();
            this.H = x;
            this.F = x;
            float y = motionEvent.getY();
            this.I = y;
            this.G = y;
            this.J = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.F = motionEvent.getX(actionIndex);
                        this.J = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        A(motionEvent);
                        this.F = motionEvent.getX(motionEvent.findPointerIndex(this.J));
                    }
                } else if (this.z) {
                    B(this.c, true, 0, false);
                    zE = F();
                    if (zE) {
                        postInvalidateOnAnimation();
                    }
                }
            } else if (!this.z) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.J);
                if (iFindPointerIndex == -1) {
                    zE = F();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x2 - this.F);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.G);
                    if (fAbs > this.D && fAbs > fAbs2) {
                        this.z = true;
                        G();
                        float f = this.H;
                        float f2 = x2 - f;
                        int i2 = this.D;
                        this.F = f2 > 0.0f ? f + i2 : f - i2;
                        this.G = y2;
                        o(1);
                        C(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.z) {
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.J);
                        zE = E(motionEvent.getX(iFindPointerIndex2), motionEvent.getY(iFindPointerIndex2));
                    }
                }
                if (zE) {
                    postInvalidateOnAnimation();
                }
            } else if (this.z) {
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.J);
                zE = E(motionEvent.getX(iFindPointerIndex3), motionEvent.getY(iFindPointerIndex3));
                if (zE) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (this.z) {
            VelocityTracker velocityTracker = this.K;
            velocityTracker.computeCurrentVelocity(1000, this.M);
            int xVelocity = (int) velocityTracker.getXVelocity(this.J);
            this.y = true;
            int iV = v();
            int scrollX = getScrollX();
            dtv dtvVarX = x();
            float f3 = iV;
            int i3 = dtvVarX.b;
            float f4 = (scrollX / f3) - dtvVarX.e;
            float f5 = dtvVarX.d + (0.0f / f3);
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.J)) - this.H)) <= this.N || Math.abs(xVelocity) <= this.L || ace.k(this.e) != 0.0f || ace.k(this.f) != 0.0f) {
                iMax = ((int) ((f4 / f5) + (i3 >= this.c ? 0.4f : 0.6f))) + i3;
            } else {
                iMax = xVelocity > 0 ? i3 : i3 + 1;
            }
            ArrayList arrayList = this.l;
            if (arrayList.size() > 0) {
                iMax = Math.max(((dtv) arrayList.get(0)).b, Math.min(iMax, ((dtv) arrayList.get(arrayList.size() - 1)).b));
            }
            n(iMax, true, true, xVelocity);
            boolean zF = F();
            if (iMax == i3 && zF) {
                if (ace.k(this.f) != 0.0f) {
                    this.f.onAbsorb(-xVelocity);
                } else if (ace.k(this.e) != 0.0f) {
                    this.e.onAbsorb(xVelocity);
                }
            }
            zE = zF;
            if (zE) {
                postInvalidateOnAnimation();
            }
        }
        return true;
    }

    public final boolean p(int i2) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view ".concat(sb.toString()));
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        boolean zS = false;
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i2 == 17 || i2 == 1) {
                zS = s();
            } else if (i2 == 66 || i2 == 2) {
                zS = t();
            }
        } else if (i2 == 17) {
            Rect rect = this.n;
            zS = (viewFindFocus == null || w(rect, viewFindNextFocus).left < w(rect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : s();
        } else if (i2 == 66) {
            Rect rect2 = this.n;
            zS = (viewFindFocus == null || w(rect2, viewFindNextFocus).left > w(rect2, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : t();
        }
        if (zS) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return zS;
    }

    protected final boolean q(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && q(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    public boolean r(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            return keyEvent.hasModifiers(2) ? s() : p(17);
        }
        if (keyCode == 22) {
            return keyEvent.hasModifiers(2) ? t() : p(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return p(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return p(1);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.w) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    final boolean s() {
        int i2 = this.c;
        if (i2 <= 0) {
            return false;
        }
        m(i2 - 1, true);
        return true;
    }

    final boolean t() {
        dts dtsVar = this.b;
        if (dtsVar == null || this.c >= dtsVar.g() - 1) {
            return false;
        }
        m(this.c + 1, true);
        return true;
    }

    final void u(Context context) {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        this.r = new Scroller(context, j);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.D = viewConfiguration.getScaledPagingTouchSlop();
        this.L = (int) (400.0f * f);
        this.M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.e = new EdgeEffect(context);
        this.f = new EdgeEffect(context);
        this.N = (int) (25.0f * f);
        this.O = (int) (f + f);
        this.B = (int) (f * 16.0f);
        dtx dtxVar = new dtx(this);
        bac.s(this);
        setAccessibilityDelegate(dtxVar.getBridge());
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        azs.c(this, new dtt(this));
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new dtw();
    }

    public duc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = new ArrayList();
        this.m = new dtv();
        this.n = new Rect();
        this.o = -1;
        this.p = null;
        this.q = null;
        this.u = -3.4028235E38f;
        this.v = Float.MAX_VALUE;
        this.d = 1;
        this.E = true;
        this.J = -1;
        this.P = true;
        this.T = new px(this, 8, null);
        this.U = 0;
        u(context);
    }
}
