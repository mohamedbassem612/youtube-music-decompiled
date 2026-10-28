package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import app.rive.semantics.SemanticState;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class np {
    boolean mAutoMeasure;
    lm mChildHelper;
    private int mHeight;
    private int mHeightMode;
    public pj mHorizontalBoundCheck;
    private final pi mHorizontalBoundCheckCallback;
    boolean mIsAttachedToWindow;
    private boolean mItemPrefetchEnabled;
    private boolean mMeasurementCacheEnabled;
    public int mPrefetchMaxCountObserved;
    public boolean mPrefetchMaxObservedInInitialPrefetch;
    public RecyclerView mRecyclerView;
    public boolean mRequestedSimpleAnimations;
    od mSmoothScroller;
    public pj mVerticalBoundCheck;
    private final pi mVerticalBoundCheckCallback;
    private int mWidth;
    private int mWidthMode;

    public np() {
        nm nmVar = new nm(this, 1);
        this.mHorizontalBoundCheckCallback = nmVar;
        nm nmVar2 = new nm(this, 0);
        this.mVerticalBoundCheckCallback = nmVar2;
        this.mHorizontalBoundCheck = new pj(nmVar);
        this.mVerticalBoundCheck = new pj(nmVar2);
        this.mRequestedSimpleAnimations = false;
        this.mIsAttachedToWindow = false;
        this.mAutoMeasure = false;
        this.mMeasurementCacheEnabled = true;
        this.mItemPrefetchEnabled = true;
    }

    private void addViewInt(View view, int i, boolean z) {
        int i2 = RecyclerView.ad;
        oh ohVar = view == null ? null : ((nq) view.getLayoutParams()).c;
        if (z || ohVar.v()) {
            this.mRecyclerView.aa.c(ohVar);
        } else {
            this.mRecyclerView.aa.f(ohVar);
        }
        nq nqVar = (nq) view.getLayoutParams();
        if (ohVar.B() || ohVar.w()) {
            if (ohVar.w()) {
                ohVar.p();
            } else {
                ohVar.i();
            }
            this.mChildHelper.g(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            lm lmVar = this.mChildHelper;
            if (parent == recyclerView) {
                int iC = lmVar.c(view);
                if (i == -1) {
                    i = this.mChildHelper.a();
                }
                if (iC == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.o());
                }
                if (iC != i) {
                    this.mRecyclerView.n.moveView(iC, i);
                }
            } else {
                lmVar.f(view, i, false);
                nqVar.e = true;
                od odVar = this.mSmoothScroller;
                if (odVar != null && odVar.f && odVar.d(view) == odVar.b) {
                    odVar.g = view;
                }
            }
        }
        if (nqVar.f) {
            ohVar.a.invalidate();
            nqVar.f = false;
        }
    }

    public static int chooseSize(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    private void detachViewInternal(int i, View view) {
        this.mChildHelper.h(i);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:20:0x002d  */
    public static int getChildMeasureSpec(int i, int i2, int i3, int i4, boolean z) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i2 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 == -1) {
            i4 = iMax;
        } else if (i4 != -2) {
            i2 = 0;
            i4 = 0;
        } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
            i4 = iMax;
            i2 = Integer.MIN_VALUE;
        } else {
            i4 = iMax;
            i2 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - paddingLeft;
        int i2 = top - paddingTop;
        int i3 = iHeight - height;
        int iMin = Math.min(0, i);
        int i4 = iWidth - width;
        int iMin2 = Math.min(0, i2);
        int iMax = Math.max(0, i4);
        int iMax2 = Math.max(0, i3);
        if (getLayoutDirection() == 1) {
            iMin = iMax != 0 ? iMax : Math.max(iMin, i4);
        } else if (iMin == 0) {
            iMin = Math.min(i, iMax);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        return new int[]{iMin, iMin2};
    }

    public static no getProperties(Context context, AttributeSet attributeSet, int i, int i2) {
        no noVar = new no();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hg.a, i, i2);
        noVar.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        noVar.b = typedArrayObtainStyledAttributes.getInt(11, 1);
        noVar.c = typedArrayObtainStyledAttributes.getBoolean(10, false);
        noVar.d = typedArrayObtainStyledAttributes.getBoolean(12, false);
        typedArrayObtainStyledAttributes.recycle();
        return noVar;
    }

    private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i, int i2) {
        View focusedChild = recyclerView.getFocusedChild();
        if (focusedChild == null) {
            return false;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        Rect rect = this.mRecyclerView.k;
        getDecoratedBoundsWithMargins(focusedChild, rect);
        return rect.left - i < width && rect.right - i > paddingLeft && rect.top - i2 < height && rect.bottom - i2 > paddingTop;
    }

    private static boolean isMeasurementUpToDate(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0 && (mode != 1073741824 || size != i)) {
                return false;
            }
        } else if (size < i) {
            return false;
        }
        return true;
    }

    private void scrapOrRecycleView(nv nvVar, int i, View view) {
        int i2 = RecyclerView.ad;
        oh ohVar = view == null ? null : ((nq) view.getLayoutParams()).c;
        if (ohVar.A()) {
            return;
        }
        if (ohVar.t() && !ohVar.v() && !this.mRecyclerView.m.c) {
            removeViewAt(i);
            nvVar.j(ohVar);
        } else {
            detachViewAt(i);
            nvVar.k(view);
            this.mRecyclerView.aa.f(ohVar);
        }
    }

    public void addDisappearingView(View view) {
        addDisappearingView(view, -1);
    }

    public void addView(View view) {
        addView(view, -1);
    }

    public void assertInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || recyclerView.au()) {
            return;
        }
        if (str != null) {
            throw new IllegalStateException(str.concat(recyclerView.o()));
        }
        throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling".concat(recyclerView.o()));
    }

    public void assertNotInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.x(str);
        }
    }

    public void attachView(View view, int i, nq nqVar) {
        oh ohVarK = RecyclerView.k(view);
        boolean zV = ohVarK.v();
        RecyclerView recyclerView = this.mRecyclerView;
        if (zV) {
            recyclerView.aa.c(ohVarK);
        } else {
            recyclerView.aa.f(ohVarK);
        }
        this.mChildHelper.g(view, i, nqVar, ohVarK.v());
    }

    public void calculateItemDecorationsForChild(View view, Rect rect) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.g(view));
        }
    }

    public boolean canScrollHorizontally() {
        return false;
    }

    public boolean canScrollVertically() {
        return false;
    }

    public boolean checkLayoutParams(nq nqVar) {
        return nqVar != null;
    }

    public int computeHorizontalScrollExtent(oe oeVar) {
        return 0;
    }

    public int computeHorizontalScrollOffset(oe oeVar) {
        return 0;
    }

    public int computeHorizontalScrollRange(oe oeVar) {
        return 0;
    }

    public int computeVerticalScrollExtent(oe oeVar) {
        return 0;
    }

    public int computeVerticalScrollOffset(oe oeVar) {
        return 0;
    }

    public int computeVerticalScrollRange(oe oeVar) {
        return 0;
    }

    public void detachAndScrapAttachedViews(nv nvVar) {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                scrapOrRecycleView(nvVar, childCount, getChildAt(childCount));
            }
        }
    }

    public void detachAndScrapView(View view, nv nvVar) {
        scrapOrRecycleView(nvVar, this.mChildHelper.c(view), view);
    }

    public void detachAndScrapViewAt(int i, nv nvVar) {
        scrapOrRecycleView(nvVar, i, getChildAt(i));
    }

    public void detachView(View view) {
        int iC = this.mChildHelper.c(view);
        if (iC >= 0) {
            detachViewInternal(iC, view);
        }
    }

    public void detachViewAt(int i) {
        detachViewInternal(i, getChildAt(i));
    }

    public void dispatchAttachedToWindow(RecyclerView recyclerView) {
        this.mIsAttachedToWindow = true;
        onAttachedToWindow(recyclerView);
    }

    public void dispatchDetachedFromWindow(RecyclerView recyclerView, nv nvVar) {
        this.mIsAttachedToWindow = false;
        onDetachedFromWindow(recyclerView, nvVar);
    }

    public void endAnimation(View view) {
        nl nlVar = this.mRecyclerView.E;
        if (nlVar != null) {
            nlVar.b(RecyclerView.k(view));
        }
    }

    public View findContainingItemView(View view) {
        View viewN;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (viewN = recyclerView.n(view)) == null || this.mChildHelper.k(viewN)) {
            return null;
        }
        return viewN;
    }

    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            oh ohVarK = RecyclerView.k(childAt);
            if (ohVarK != null && ohVarK.c() == i && !ohVarK.A() && (this.mRecyclerView.O.g || !ohVarK.v())) {
                return childAt;
            }
        }
        return null;
    }

    public abstract nq generateDefaultLayoutParams();

    public nq generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof nq) {
            return new nq((nq) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new nq((ViewGroup.MarginLayoutParams) layoutParams) : new nq(layoutParams);
    }

    public int getBaseline() {
        return -1;
    }

    public int getBottomDecorationHeight(View view) {
        return ((nq) view.getLayoutParams()).d.bottom;
    }

    public View getChildAt(int i) {
        lm lmVar = this.mChildHelper;
        if (lmVar != null) {
            return lmVar.d(i);
        }
        return null;
    }

    public int getChildCount() {
        lm lmVar = this.mChildHelper;
        if (lmVar != null) {
            return lmVar.a();
        }
        return 0;
    }

    public boolean getClipToPadding() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.i;
    }

    public int getColumnCountForAccessibility(nv nvVar, oe oeVar) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || recyclerView.m == null || !canScrollHorizontally()) {
            return 1;
        }
        return this.mRecyclerView.m.a();
    }

    public int getDecoratedBottom(View view) {
        return view.getBottom() + getBottomDecorationHeight(view);
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        RecyclerView.N(view, rect);
    }

    public int getDecoratedLeft(View view) {
        return view.getLeft() - getLeftDecorationWidth(view);
    }

    public int getDecoratedMeasuredHeight(View view) {
        Rect rect = ((nq) view.getLayoutParams()).d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public int getDecoratedMeasuredWidth(View view) {
        Rect rect = ((nq) view.getLayoutParams()).d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public int getDecoratedRight(View view) {
        return view.getRight() + getRightDecorationWidth(view);
    }

    public int getDecoratedTop(View view) {
        return view.getTop() - getTopDecorationHeight(view);
    }

    public View getFocusedChild() {
        View focusedChild;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.k(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getHeightMode() {
        return this.mHeightMode;
    }

    public int getItemCount() {
        RecyclerView recyclerView = this.mRecyclerView;
        nh nhVar = recyclerView != null ? recyclerView.m : null;
        if (nhVar != null) {
            return nhVar.a();
        }
        return 0;
    }

    public int getItemViewType(View view) {
        return RecyclerView.k(view).f;
    }

    public int getLayoutDirection() {
        return this.mRecyclerView.getLayoutDirection();
    }

    public int getLeftDecorationWidth(View view) {
        return ((nq) view.getLayoutParams()).d.left;
    }

    public int getMinimumHeight() {
        RecyclerView recyclerView = this.mRecyclerView;
        int i = bac.a;
        return recyclerView.getMinimumHeight();
    }

    public int getMinimumWidth() {
        RecyclerView recyclerView = this.mRecyclerView;
        int i = bac.a;
        return recyclerView.getMinimumWidth();
    }

    public int getPaddingBottom() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public int getPaddingEnd() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            return 0;
        }
        int i = bac.a;
        return recyclerView.getPaddingEnd();
    }

    public int getPaddingLeft() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int getPaddingRight() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public int getPaddingStart() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            return 0;
        }
        int i = bac.a;
        return recyclerView.getPaddingStart();
    }

    public int getPaddingTop() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int getPosition(View view) {
        return ((nq) view.getLayoutParams()).gL();
    }

    public int getRightDecorationWidth(View view) {
        return ((nq) view.getLayoutParams()).d.right;
    }

    public int getRowCountForAccessibility(nv nvVar, oe oeVar) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || recyclerView.m == null || !canScrollVertically()) {
            return 1;
        }
        return this.mRecyclerView.m.a();
    }

    public int getSelectionModeForAccessibility(nv nvVar, oe oeVar) {
        return 0;
    }

    public int getTopDecorationHeight(View view) {
        return ((nq) view.getLayoutParams()).d.top;
    }

    public void getTransformedBoundingBox(View view, boolean z, Rect rect) {
        Matrix matrix;
        if (z) {
            Rect rect2 = ((nq) view.getLayoutParams()).d;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.mRecyclerView.l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getWidthMode() {
        return this.mWidthMode;
    }

    public boolean hasFlexibleChildInBothOrientations() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFocus() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.hasFocus();
    }

    public void ignoreView(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.mRecyclerView;
        if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
            throw new IllegalArgumentException("View should be fully attached to be ignored".concat(this.mRecyclerView.o()));
        }
        oh ohVarK = RecyclerView.k(view);
        ohVarK.f(SemanticState.Focused);
        this.mRecyclerView.aa.g(ohVarK);
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttachedToWindow;
    }

    public boolean isAutoMeasureEnabled() {
        return this.mAutoMeasure;
    }

    public boolean isFocused() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.isFocused();
    }

    public final boolean isItemPrefetchEnabled() {
        return this.mItemPrefetchEnabled;
    }

    public boolean isLayoutHierarchical(nv nvVar, oe oeVar) {
        return false;
    }

    public boolean isLayoutReversed() {
        return false;
    }

    public boolean isMeasurementCacheEnabled() {
        return this.mMeasurementCacheEnabled;
    }

    public boolean isSmoothScrolling() {
        od odVar = this.mSmoothScroller;
        return odVar != null && odVar.f;
    }

    public boolean isViewPartiallyVisible(View view, boolean z, boolean z2) {
        boolean z3 = this.mHorizontalBoundCheck.b(view) && this.mVerticalBoundCheck.b(view);
        if (z) {
            return z3;
        }
        return !z3;
    }

    public void layoutDecorated(View view, int i, int i2, int i3, int i4) {
        Rect rect = ((nq) view.getLayoutParams()).d;
        view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
    }

    public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
        nq nqVar = (nq) view.getLayoutParams();
        Rect rect = nqVar.d;
        view.layout(i + rect.left + nqVar.leftMargin, i2 + rect.top + nqVar.topMargin, (i3 - rect.right) - nqVar.rightMargin, (i4 - rect.bottom) - nqVar.bottomMargin);
    }

    public void measureChild(View view, int i, int i2) {
        nq nqVar = (nq) view.getLayoutParams();
        Rect rectG = this.mRecyclerView.g(view);
        int i3 = rectG.left + rectG.right;
        int i4 = rectG.top + rectG.bottom;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i + i3, nqVar.width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i2 + i4, nqVar.height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, nqVar)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void measureChildWithMargins(View view, int i, int i2) {
        nq nqVar = (nq) view.getLayoutParams();
        Rect rectG = this.mRecyclerView.g(view);
        int i3 = rectG.left + rectG.right;
        int i4 = rectG.top + rectG.bottom;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + nqVar.leftMargin + nqVar.rightMargin + i + i3, nqVar.width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + nqVar.topMargin + nqVar.bottomMargin + i2 + i4, nqVar.height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, nqVar)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void moveView(int i, int i2) {
        View childAt = getChildAt(i);
        if (childAt != null) {
            detachViewAt(i);
            attachView(childAt, i2);
        } else {
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.mRecyclerView.toString());
        }
    }

    public void offsetChildrenHorizontal(int i) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            int iA = recyclerView.h.a();
            for (int i2 = 0; i2 < iA; i2++) {
                recyclerView.h.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void offsetChildrenVertical(int i) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            int iA = recyclerView.h.a();
            for (int i2 = 0; i2 < iA; i2++) {
                recyclerView.h.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public boolean onAddFocusables(RecyclerView recyclerView, ArrayList arrayList, int i, int i2) {
        return false;
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, nv nvVar) {
        onDetachedFromWindow(recyclerView);
    }

    public View onFocusEnter(int i, nv nvVar, oe oeVar) {
        return null;
    }

    public View onFocusSearchFailed(View view, int i, nv nvVar, oe oeVar) {
        return null;
    }

    public void onInitializeAccessibilityEvent(nv nvVar, oe oeVar, AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        nh nhVar = this.mRecyclerView.m;
        if (nhVar != null) {
            accessibilityEvent.setItemCount(nhVar.a());
        }
    }

    public void onInitializeAccessibilityNodeInfo(nv nvVar, oe oeVar, bbz bbzVar) {
        if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
            bbzVar.j(SemanticState.Multiline);
            bbzVar.L(true);
            bbzVar.p(67108864, true);
        }
        if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
            bbzVar.j(SemanticState.Obscured);
            bbzVar.L(true);
            bbzVar.p(67108864, true);
        }
        bbzVar.x(zs.h(getRowCountForAccessibility(nvVar, oeVar), getColumnCountForAccessibility(nvVar, oeVar), isLayoutHierarchical(nvVar, oeVar), getSelectionModeForAccessibility(nvVar, oeVar)));
    }

    public void onInitializeAccessibilityNodeInfoForItem(nv nvVar, oe oeVar, View view, bbz bbzVar) {
        bbzVar.y(zs.g(canScrollVertically() ? getPosition(view) : 0, 1, canScrollHorizontally() ? getPosition(view) : 0, 1, false));
    }

    public View onInterceptFocusSearch(View view, int i) {
        return null;
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        onItemsUpdated(recyclerView, i, i2);
    }

    public void onLayoutChildren(nv nvVar, oe oeVar) {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public void onMeasure(nv nvVar, oe oeVar, int i, int i2) {
        this.mRecyclerView.D(i, i2);
    }

    @Deprecated
    public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
        return isSmoothScrolling() || recyclerView.au();
    }

    public Parcelable onSaveInstanceState() {
        return null;
    }

    public void onSmoothScrollerStopped(od odVar) {
        if (this.mSmoothScroller == odVar) {
            this.mSmoothScroller = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[PHI: r9
      0x008b: PHI (r9v8 int) = (r9v5 int), (r9v20 int) binds: [B:25:0x007e, B:18:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean performAccessibilityAction(nv nvVar, oe oeVar, int i, Bundle bundle) {
        int paddingTop;
        int paddingLeft;
        float f;
        if (this.mRecyclerView == null) {
            return false;
        }
        int height = getHeight();
        int width = getWidth();
        Rect rect = new Rect();
        if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
            height = rect.height();
            width = rect.width();
        }
        if (i == 4096) {
            paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
            if (this.mRecyclerView.canScrollHorizontally(1)) {
                paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
            } else {
                paddingLeft = 0;
            }
        } else if (i != 8192) {
            paddingTop = 0;
            paddingLeft = 0;
        } else {
            paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
            if (this.mRecyclerView.canScrollHorizontally(-1)) {
                paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
            } else {
                paddingLeft = 0;
            }
        }
        if (paddingTop == 0) {
            if (paddingLeft == 0) {
                return false;
            }
            paddingTop = 0;
        }
        if (bundle != null) {
            f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
            if (f < 0.0f) {
                return false;
            }
        } else {
            f = 1.0f;
        }
        if (Float.compare(f, Float.POSITIVE_INFINITY) == 0) {
            RecyclerView recyclerView = this.mRecyclerView;
            nh nhVar = recyclerView.m;
            if (nhVar == null) {
                return false;
            }
            if (i == 4096) {
                recyclerView.aj(nhVar.a() - 1);
            } else if (i == 8192) {
                recyclerView.aj(0);
            }
        } else {
            if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                paddingTop = (int) (paddingTop * f);
                paddingLeft = (int) (paddingLeft * f);
            }
            this.mRecyclerView.aA(paddingLeft, paddingTop, true);
        }
        return true;
    }

    public boolean performAccessibilityActionForItem(View view, int i, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityActionForItem(recyclerView.e, recyclerView.O, view, i, bundle);
    }

    public void postOnAnimation(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            int i = bac.a;
            recyclerView.postOnAnimation(runnable);
        }
    }

    public void removeAllViews() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                this.mChildHelper.j(childCount);
            }
        }
    }

    public void removeAndRecycleAllViews(nv nvVar) {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt = getChildAt(childCount);
            int i = RecyclerView.ad;
            if (!(childAt == null ? null : ((nq) childAt.getLayoutParams()).c).A()) {
                removeAndRecycleViewAt(childCount, nvVar);
            }
        }
    }

    public void removeAndRecycleScrapInt(nv nvVar) {
        ArrayList arrayList = nvVar.a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((oh) arrayList.get(i)).a;
            int i2 = RecyclerView.ad;
            oh ohVar = ((nq) view.getLayoutParams()).c;
            if (!ohVar.A()) {
                ohVar.n(false);
                if (ohVar.x()) {
                    this.mRecyclerView.removeDetachedView(view, false);
                }
                nl nlVar = this.mRecyclerView.E;
                if (nlVar != null) {
                    nlVar.b(ohVar);
                }
                ohVar.n(true);
                nvVar.f(view);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = nvVar.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.mRecyclerView.invalidate();
        }
    }

    public void removeAndRecycleView(View view, nv nvVar) {
        removeView(view);
        nvVar.i(view);
    }

    public void removeAndRecycleViewAt(int i, nv nvVar) {
        View childAt = getChildAt(i);
        removeViewAt(i);
        nvVar.i(childAt);
    }

    public boolean removeCallbacks(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.removeCallbacks(runnable);
        }
        return false;
    }

    public void removeDetachedView(View view) {
        this.mRecyclerView.removeDetachedView(view, false);
    }

    public void removeView(View view) {
        lm lmVar = this.mChildHelper;
        int i = lmVar.c;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            lmVar.c = 1;
            lmVar.d = view;
            hhb hhbVar = lmVar.e;
            int iB = hhbVar.B(view);
            if (iB >= 0) {
                if (lmVar.a.g(iB)) {
                    lmVar.l(view);
                }
                hhbVar.E(iB);
            }
        } finally {
            lmVar.c = 0;
            lmVar.d = null;
        }
    }

    public void removeViewAt(int i) {
        if (getChildAt(i) != null) {
            this.mChildHelper.j(i);
        }
    }

    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
        int i = childRectangleOnScreenScrollAmount[0];
        int i2 = childRectangleOnScreenScrollAmount[1];
        if (z2 && !isFocusedChildVisibleAfterScrolling(recyclerView, i, i2)) {
            return false;
        }
        if (i == 0) {
            if (i2 == 0) {
                return false;
            }
            i = 0;
        }
        if (z) {
            recyclerView.scrollBy(i, i2);
        } else {
            recyclerView.aA(i, i2, false);
        }
        return true;
    }

    public void requestLayout() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public void requestSimpleAnimationsInNextLayout() {
        this.mRequestedSimpleAnimations = true;
    }

    public int scrollHorizontallyBy(int i, nv nvVar, oe oeVar) {
        return 0;
    }

    public void scrollToPosition(int i) {
        int i2 = RecyclerView.ad;
    }

    public int scrollVerticallyBy(int i, nv nvVar, oe oeVar) {
        return 0;
    }

    @Deprecated
    public void setAutoMeasureEnabled(boolean z) {
        this.mAutoMeasure = z;
    }

    public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
        setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void setItemPrefetchEnabled(boolean z) {
        if (z != this.mItemPrefetchEnabled) {
            this.mItemPrefetchEnabled = z;
            this.mPrefetchMaxCountObserved = 0;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.e.m();
            }
        }
    }

    public void setMeasureSpecs(int i, int i2) {
        this.mWidth = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.mWidthMode = mode;
        if (mode == 0 && !RecyclerView.a) {
            this.mWidth = 0;
        }
        this.mHeight = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.mHeightMode = mode2;
        if (mode2 != 0 || RecyclerView.a) {
            return;
        }
        this.mHeight = 0;
    }

    public void setMeasuredDimension(Rect rect, int i, int i2) {
        setMeasuredDimension(chooseSize(i, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i2, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
    }

    public void setMeasuredDimensionFromChildren(int i, int i2) {
        int childCount = getChildCount();
        if (childCount == 0) {
            this.mRecyclerView.D(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            Rect rect = this.mRecyclerView.k;
            getDecoratedBoundsWithMargins(childAt, rect);
            if (rect.left < i4) {
                i4 = rect.left;
            }
            if (rect.right > i3) {
                i3 = rect.right;
            }
            if (rect.top < i5) {
                i5 = rect.top;
            }
            if (rect.bottom > i6) {
                i6 = rect.bottom;
            }
        }
        this.mRecyclerView.k.set(i4, i5, i3, i6);
        setMeasuredDimension(this.mRecyclerView.k, i, i2);
    }

    public void setMeasurementCacheEnabled(boolean z) {
        this.mMeasurementCacheEnabled = z;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.mRecyclerView = null;
            this.mChildHelper = null;
            this.mWidth = 0;
            this.mHeight = 0;
        } else {
            this.mRecyclerView = recyclerView;
            this.mChildHelper = recyclerView.h;
            this.mWidth = recyclerView.getWidth();
            this.mHeight = recyclerView.getHeight();
        }
        this.mWidthMode = 1073741824;
        this.mHeightMode = 1073741824;
    }

    public boolean shouldMeasureChild(View view, int i, int i2, nq nqVar) {
        return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i, nqVar.width) && isMeasurementUpToDate(view.getHeight(), i2, nqVar.height)) ? false : true;
    }

    public boolean shouldMeasureTwice() {
        return false;
    }

    public boolean shouldReMeasureChild(View view, int i, int i2, nq nqVar) {
        return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i, nqVar.width) && isMeasurementUpToDate(view.getMeasuredHeight(), i2, nqVar.height)) ? false : true;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, oe oeVar, int i) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    public void startSmoothScroll(od odVar) {
        od odVar2 = this.mSmoothScroller;
        if (odVar2 != null && odVar != odVar2 && odVar2.f) {
            odVar2.g();
        }
        this.mSmoothScroller = odVar;
        RecyclerView recyclerView = this.mRecyclerView;
        recyclerView.L.d();
        if (odVar.h) {
            Log.w("RecyclerView", "An instance of " + odVar.getClass().getSimpleName() + " was started more than once. Each instance of" + odVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        odVar.c = recyclerView;
        odVar.d = this;
        int i = odVar.b;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        RecyclerView recyclerView2 = odVar.c;
        recyclerView2.O.a = i;
        odVar.f = true;
        odVar.e = true;
        odVar.g = recyclerView2.n.findViewByPosition(odVar.b);
        odVar.c.L.b();
        odVar.h = true;
    }

    public void stopIgnoringView(View view) {
        oh ohVarK = RecyclerView.k(view);
        ohVarK.j &= -129;
        ohVarK.l();
        ohVarK.f(4);
    }

    public void stopSmoothScroller() {
        od odVar = this.mSmoothScroller;
        if (odVar != null) {
            odVar.g();
        }
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    @Deprecated
    public void onDetachedFromWindow(RecyclerView recyclerView) {
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
    }

    public void addDisappearingView(View view, int i) {
        addViewInt(view, i, true);
    }

    public void addView(View view, int i) {
        addViewInt(view, i, false);
    }

    public boolean performAccessibilityActionForItem(nv nvVar, oe oeVar, View view, int i, Bundle bundle) {
        return false;
    }

    public boolean onRequestChildFocus(RecyclerView recyclerView, oe oeVar, View view, View view2) {
        return onRequestChildFocus(recyclerView, view, view2);
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
    }

    public void onItemsChanged(RecyclerView recyclerView) {
    }

    public void onLayoutCompleted(oe oeVar) {
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    public void onScrollStateChanged(int i) {
    }

    public nq generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new nq(context, attributeSet);
    }

    public void attachView(View view, int i) {
        attachView(view, i, (nq) view.getLayoutParams());
    }

    public void attachView(View view) {
        attachView(view, -1);
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, bbz bbzVar) {
        oh ohVarK = RecyclerView.k(view);
        if (ohVarK == null || ohVarK.v() || this.mChildHelper.k(ohVarK.a)) {
            return;
        }
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfoForItem(recyclerView.e, recyclerView.O, view, bbzVar);
    }

    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
    }

    public void setMeasuredDimension(int i, int i2) {
        this.mRecyclerView.setMeasuredDimension(i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0014 A[PHI: r3
      0x0014: PHI (r3v3 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:6:0x000d, B:10:0x0013, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x001d  */
    @Deprecated
    public static int getChildMeasureSpec(int i, int i2, int i3, boolean z) {
        int i4 = i - i2;
        int i5 = 0;
        int iMax = Math.max(0, i4);
        if (z) {
            if (i3 >= 0) {
                i5 = 1073741824;
            } else {
                i3 = 0;
            }
        } else if (i3 >= 0) {
            i5 = 1073741824;
        } else if (i3 == -1) {
            i3 = iMax;
            i5 = 1073741824;
        } else if (i3 == -2) {
            i5 = Integer.MIN_VALUE;
            i3 = iMax;
        } else {
            i3 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i3, i5);
    }

    public void collectInitialPrefetchPositions(int i, nn nnVar) {
    }

    public void onAdapterChanged(nh nhVar, nh nhVar2) {
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityEvent(recyclerView.e, recyclerView.O, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(bbz bbzVar) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfo(recyclerView.e, recyclerView.O, bbzVar);
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, oe oeVar, nn nnVar) {
    }

    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityAction(recyclerView.e, recyclerView.O, i, bundle);
    }
}
