package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import defpackage.a;
import defpackage.bby;
import defpackage.bbz;
import defpackage.mq;
import defpackage.mr;
import defpackage.ms;
import defpackage.mt;
import defpackage.nd;
import defpackage.nh;
import defpackage.nn;
import defpackage.no;
import defpackage.np;
import defpackage.nq;
import defpackage.nv;
import defpackage.oc;
import defpackage.od;
import defpackage.oe;
import defpackage.oh;
import defpackage.pu;
import defpackage.qa;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends np implements pu, oc {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final mq mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final mr mLayoutChunkResult;
    private ms mLayoutState;
    int mOrientation;
    nd mOrientationHelper;
    mt mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new mq();
        this.mLayoutChunkResult = new mr();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        no properties = getProperties(context, attributeSet, i, i2);
        setOrientation(properties.a);
        setReverseLayout(properties.c);
        setStackFromEnd(properties.d);
    }

    private int computeScrollExtent(oe oeVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return qa.x(oeVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(oe oeVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return qa.y(oeVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(oe oeVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return qa.z(oeVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        return this.mShouldReverseLayout ? findFirstPartiallyOrCompletelyInvisibleChild() : findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        return this.mShouldReverseLayout ? findLastPartiallyOrCompletelyInvisibleChild() : findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private int fixLayoutEndGap(int i, nv nvVar, oe oeVar, boolean z) {
        int iF;
        int iF2 = this.mOrientationHelper.f() - i;
        if (iF2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-iF2, nvVar, oeVar);
        int i3 = i + i2;
        if (!z || (iF = this.mOrientationHelper.f() - i3) <= 0) {
            return i2;
        }
        this.mOrientationHelper.n(iF);
        return i2 + iF;
    }

    private int fixLayoutStartGap(int i, nv nvVar, oe oeVar, boolean z) {
        int iJ;
        int iJ2 = i - this.mOrientationHelper.j();
        if (iJ2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(iJ2, nvVar, oeVar);
        int i3 = i + i2;
        if (!z || (iJ = i3 - this.mOrientationHelper.j()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.n(-iJ);
        return i2 - iJ;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(nv nvVar, oe oeVar, int i, int i2) {
        if (!oeVar.k || getChildCount() == 0 || oeVar.g || !supportsPredictiveItemAnimations()) {
            return;
        }
        List list = nvVar.d;
        int size = list.size();
        int position = getPosition(getChildAt(0));
        int iB = 0;
        int iB2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            oh ohVar = (oh) list.get(i3);
            if (!ohVar.v()) {
                boolean z = ohVar.c() < position;
                boolean z2 = this.mShouldReverseLayout;
                nd ndVar = this.mOrientationHelper;
                if (z != z2) {
                    iB += ndVar.b(ohVar.a);
                } else {
                    iB2 += ndVar.b(ohVar.a);
                }
            }
        }
        this.mLayoutState.l = list;
        if (iB > 0) {
            updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
            ms msVar = this.mLayoutState;
            msVar.h = iB;
            msVar.c = 0;
            msVar.b(null);
            fill(nvVar, this.mLayoutState, oeVar, false);
        }
        if (iB2 > 0) {
            updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i2);
            ms msVar2 = this.mLayoutState;
            msVar2.h = iB2;
            msVar2.c = 0;
            msVar2.b(null);
            fill(nvVar, this.mLayoutState, oeVar, false);
        }
        this.mLayoutState.l = null;
    }

    private void logChildren() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            getPosition(childAt);
            this.mOrientationHelper.d(childAt);
        }
    }

    private View onFocusSearchFailedInternal(int i, nv nvVar, oe oeVar) {
        int iConvertFocusDirectionToLayoutDirection;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.k() * MAX_SCROLL_FACTOR), false, oeVar);
        ms msVar = this.mLayoutState;
        msVar.g = Integer.MIN_VALUE;
        msVar.a = false;
        fill(nvVar, msVar, oeVar, true);
        View viewFindPartiallyOrCompletelyInvisibleChildClosestToStart = iConvertFocusDirectionToLayoutDirection == -1 ? findPartiallyOrCompletelyInvisibleChildClosestToStart() : findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        View childClosestToStart = iConvertFocusDirectionToLayoutDirection == -1 ? getChildClosestToStart() : getChildClosestToEnd();
        if (!childClosestToStart.hasFocusable()) {
            return viewFindPartiallyOrCompletelyInvisibleChildClosestToStart;
        }
        if (viewFindPartiallyOrCompletelyInvisibleChildClosestToStart != null) {
            return childClosestToStart;
        }
        return null;
    }

    private void onLayoutChildrenInt(nv nvVar, oe oeVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int iFixLayoutEndGap;
        int i5;
        View viewFindViewByPosition;
        int iD;
        int iF;
        int i6 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && oeVar.a() == 0) {
            removeAndRecycleAllViews(nvVar);
            return;
        }
        mt mtVar = this.mPendingSavedState;
        if (mtVar != null && mtVar.b()) {
            this.mPendingScrollPosition = mtVar.a;
        }
        ensureLayoutState();
        this.mLayoutState.a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        mq mqVar = this.mAnchorInfo;
        if (!mqVar.e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            mqVar.d();
            mq mqVar2 = this.mAnchorInfo;
            mqVar2.d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(nvVar, oeVar, mqVar2);
            this.mAnchorInfo.e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.d(focusedChild) >= this.mOrientationHelper.f() || this.mOrientationHelper.a(focusedChild) <= this.mOrientationHelper.j())) {
            this.mAnchorInfo.c(focusedChild, getPosition(focusedChild));
        }
        ms msVar = this.mLayoutState;
        msVar.f = msVar.k >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(oeVar, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.j();
        int iMax2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.g();
        if (oeVar.g && (i5 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i5)) != null) {
            boolean z = this.mShouldReverseLayout;
            nd ndVar = this.mOrientationHelper;
            if (z) {
                iF = ndVar.f() - this.mOrientationHelper.a(viewFindViewByPosition);
                iD = this.mPendingScrollPositionOffset;
            } else {
                iD = ndVar.d(viewFindViewByPosition) - this.mOrientationHelper.j();
                iF = this.mPendingScrollPositionOffset;
            }
            int i7 = iF - iD;
            if (i7 > 0) {
                iMax += i7;
            } else {
                iMax2 -= i7;
            }
        }
        mq mqVar3 = this.mAnchorInfo;
        boolean z2 = mqVar3.d;
        boolean z3 = this.mShouldReverseLayout;
        if (!z2 ? true != z3 : true == z3) {
            i6 = 1;
        }
        onAnchorReady(nvVar, oeVar, mqVar3, i6);
        detachAndScrapAttachedViews(nvVar);
        this.mLayoutState.m = resolveIsInfinite();
        ms msVar2 = this.mLayoutState;
        msVar2.j = oeVar.g;
        msVar2.i = 0;
        mq mqVar4 = this.mAnchorInfo;
        if (mqVar4.d) {
            updateLayoutStateToFillStart(mqVar4);
            ms msVar3 = this.mLayoutState;
            msVar3.h = iMax;
            fill(nvVar, msVar3, oeVar, false);
            ms msVar4 = this.mLayoutState;
            i2 = msVar4.b;
            int i8 = msVar4.d;
            int i9 = msVar4.c;
            if (i9 > 0) {
                iMax2 += i9;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            ms msVar5 = this.mLayoutState;
            msVar5.h = iMax2;
            msVar5.d += msVar5.e;
            fill(nvVar, msVar5, oeVar, false);
            ms msVar6 = this.mLayoutState;
            i = msVar6.b;
            int i10 = msVar6.c;
            if (i10 > 0) {
                updateLayoutStateToFillStart(i8, i2);
                ms msVar7 = this.mLayoutState;
                msVar7.h = i10;
                fill(nvVar, msVar7, oeVar, false);
                i2 = this.mLayoutState.b;
            }
        } else {
            updateLayoutStateToFillEnd(mqVar4);
            ms msVar8 = this.mLayoutState;
            msVar8.h = iMax2;
            fill(nvVar, msVar8, oeVar, false);
            ms msVar9 = this.mLayoutState;
            i = msVar9.b;
            int i11 = msVar9.d;
            int i12 = msVar9.c;
            if (i12 > 0) {
                iMax += i12;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            ms msVar10 = this.mLayoutState;
            msVar10.h = iMax;
            msVar10.d += msVar10.e;
            fill(nvVar, msVar10, oeVar, false);
            ms msVar11 = this.mLayoutState;
            i2 = msVar11.b;
            int i13 = msVar11.c;
            if (i13 > 0) {
                updateLayoutStateToFillEnd(i11, i);
                ms msVar12 = this.mLayoutState;
                msVar12.h = i13;
                fill(nvVar, msVar12, oeVar, false);
                i = this.mLayoutState.b;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iFixLayoutEndGap2 = fixLayoutEndGap(i, nvVar, oeVar, true);
                i3 = i2 + iFixLayoutEndGap2;
                i4 = i + iFixLayoutEndGap2;
                iFixLayoutEndGap = fixLayoutStartGap(i3, nvVar, oeVar, false);
            } else {
                int iFixLayoutStartGap = fixLayoutStartGap(i2, nvVar, oeVar, true);
                i3 = i2 + iFixLayoutStartGap;
                i4 = i + iFixLayoutStartGap;
                iFixLayoutEndGap = fixLayoutEndGap(i4, nvVar, oeVar, false);
            }
            i2 = i3 + iFixLayoutEndGap;
            i = i4 + iFixLayoutEndGap;
        }
        layoutForPredictiveAnimations(nvVar, oeVar, i2, i);
        if (oeVar.g) {
            this.mAnchorInfo.d();
        } else {
            this.mOrientationHelper.q();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    private void recycleByLayoutState(nv nvVar, ms msVar) {
        if (!msVar.a || msVar.m) {
            return;
        }
        int i = msVar.g;
        int i2 = msVar.i;
        if (msVar.f == -1) {
            recycleViewsFromEnd(nvVar, i, i2);
        } else {
            recycleViewsFromStart(nvVar, i, i2);
        }
    }

    private void recycleChildren(nv nvVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                removeAndRecycleViewAt(i, nvVar);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    removeAndRecycleViewAt(i2, nvVar);
                }
            }
        }
    }

    private void recycleViewsFromEnd(nv nvVar, int i, int i2) {
        int childCount = getChildCount();
        if (i >= 0) {
            int iE = (this.mOrientationHelper.e() - i) + i2;
            if (this.mShouldReverseLayout) {
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (this.mOrientationHelper.d(childAt) < iE || this.mOrientationHelper.m(childAt) < iE) {
                        recycleChildren(nvVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = childCount - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View childAt2 = getChildAt(i5);
                if (this.mOrientationHelper.d(childAt2) < iE || this.mOrientationHelper.m(childAt2) < iE) {
                    recycleChildren(nvVar, i4, i5);
                    return;
                }
            }
        }
    }

    private void recycleViewsFromStart(nv nvVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int childCount = getChildCount();
            if (!this.mShouldReverseLayout) {
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (this.mOrientationHelper.a(childAt) > i3 || this.mOrientationHelper.l(childAt) > i3) {
                        recycleChildren(nvVar, 0, i4);
                        return;
                    }
                }
                return;
            }
            int i5 = childCount - 1;
            for (int i6 = i5; i6 >= 0; i6--) {
                View childAt2 = getChildAt(i6);
                if (this.mOrientationHelper.a(childAt2) > i3 || this.mOrientationHelper.l(childAt2) > i3) {
                    recycleChildren(nvVar, i5, i6);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    private boolean updateAnchorFromChildren(nv nvVar, oe oeVar, mq mqVar) {
        boolean z;
        View viewFindReferenceChild;
        boolean z2 = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild == null) {
            boolean z3 = this.mLastStackFromEnd;
            z = this.mStackFromEnd;
            return z3 != z ? false : false;
        }
        nq nqVar = (nq) focusedChild.getLayoutParams();
        if (nqVar.gN() || nqVar.gL() < 0 || nqVar.gL() >= oeVar.a()) {
            boolean z4 = this.mLastStackFromEnd;
            z = this.mStackFromEnd;
            if (z4 != z && (viewFindReferenceChild = findReferenceChild(nvVar, oeVar, mqVar.d, z)) != null) {
                mqVar.b(viewFindReferenceChild, getPosition(viewFindReferenceChild));
                if (!oeVar.g && supportsPredictiveItemAnimations()) {
                    int iD = this.mOrientationHelper.d(viewFindReferenceChild);
                    int iA = this.mOrientationHelper.a(viewFindReferenceChild);
                    int iJ = this.mOrientationHelper.j();
                    int iF = this.mOrientationHelper.f();
                    boolean z5 = iA <= iJ && iD < iJ;
                    if (iD >= iF && iA > iF) {
                        z2 = true;
                    }
                    if (z5 || z2) {
                        if (true == mqVar.d) {
                            iJ = iF;
                        }
                        mqVar.c = iJ;
                    }
                }
            }
        } else {
            mqVar.c(focusedChild, getPosition(focusedChild));
        }
        return true;
    }

    private boolean updateAnchorFromPendingData(oe oeVar, mq mqVar) {
        int i;
        if (oeVar.g || (i = this.mPendingScrollPosition) == -1) {
            return false;
        }
        if (i < 0 || i >= oeVar.a()) {
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
            return false;
        }
        int i2 = this.mPendingScrollPosition;
        mqVar.b = i2;
        mt mtVar = this.mPendingSavedState;
        if (mtVar != null && mtVar.b()) {
            boolean z = mtVar.c;
            mqVar.d = z;
            nd ndVar = this.mOrientationHelper;
            if (z) {
                mqVar.c = ndVar.f() - this.mPendingSavedState.b;
            } else {
                mqVar.c = ndVar.j() + this.mPendingSavedState.b;
            }
        } else if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
            View viewFindViewByPosition = findViewByPosition(i2);
            if (viewFindViewByPosition == null) {
                if (getChildCount() > 0) {
                    mqVar.d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                }
                mqVar.a();
            } else if (this.mOrientationHelper.b(viewFindViewByPosition) > this.mOrientationHelper.k()) {
                mqVar.a();
            } else {
                int iD = this.mOrientationHelper.d(viewFindViewByPosition) - this.mOrientationHelper.j();
                nd ndVar2 = this.mOrientationHelper;
                if (iD < 0) {
                    mqVar.c = ndVar2.j();
                    mqVar.d = false;
                } else if (ndVar2.f() - this.mOrientationHelper.a(viewFindViewByPosition) < 0) {
                    mqVar.c = this.mOrientationHelper.f();
                    mqVar.d = true;
                } else {
                    boolean z2 = mqVar.d;
                    nd ndVar3 = this.mOrientationHelper;
                    mqVar.c = z2 ? ndVar3.a(viewFindViewByPosition) + this.mOrientationHelper.o() : ndVar3.d(viewFindViewByPosition);
                }
            }
        } else {
            boolean z3 = this.mShouldReverseLayout;
            mqVar.d = z3;
            nd ndVar4 = this.mOrientationHelper;
            if (z3) {
                mqVar.c = ndVar4.f() - this.mPendingScrollPositionOffset;
            } else {
                mqVar.c = ndVar4.j() + this.mPendingScrollPositionOffset;
            }
        }
        return true;
    }

    private void updateAnchorInfoForLayout(nv nvVar, oe oeVar, mq mqVar) {
        if (updateAnchorFromPendingData(oeVar, mqVar) || updateAnchorFromChildren(nvVar, oeVar, mqVar)) {
            return;
        }
        mqVar.a();
        mqVar.b = this.mStackFromEnd ? oeVar.a() - 1 : 0;
    }

    private void updateLayoutState(int i, int i2, boolean z, oe oeVar) {
        int iJ;
        this.mLayoutState.m = resolveIsInfinite();
        this.mLayoutState.f = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(oeVar, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        int i3 = i == 1 ? iMax2 : iMax;
        ms msVar = this.mLayoutState;
        msVar.h = i3;
        if (i != 1) {
            iMax = iMax2;
        }
        msVar.i = iMax;
        if (i == 1) {
            msVar.h = i3 + this.mOrientationHelper.g();
            View childClosestToEnd = getChildClosestToEnd();
            ms msVar2 = this.mLayoutState;
            msVar2.e = true == this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            ms msVar3 = this.mLayoutState;
            msVar2.d = position + msVar3.e;
            msVar3.b = this.mOrientationHelper.a(childClosestToEnd);
            iJ = this.mOrientationHelper.a(childClosestToEnd) - this.mOrientationHelper.f();
        } else {
            View childClosestToStart = getChildClosestToStart();
            this.mLayoutState.h += this.mOrientationHelper.j();
            ms msVar4 = this.mLayoutState;
            msVar4.e = true != this.mShouldReverseLayout ? -1 : 1;
            int position2 = getPosition(childClosestToStart);
            ms msVar5 = this.mLayoutState;
            msVar4.d = position2 + msVar5.e;
            msVar5.b = this.mOrientationHelper.d(childClosestToStart);
            iJ = (-this.mOrientationHelper.d(childClosestToStart)) + this.mOrientationHelper.j();
        }
        ms msVar6 = this.mLayoutState;
        msVar6.c = i2;
        if (z) {
            msVar6.c = i2 - iJ;
        }
        msVar6.g = iJ;
    }

    private void updateLayoutStateToFillEnd(int i, int i2) {
        this.mLayoutState.c = this.mOrientationHelper.f() - i2;
        ms msVar = this.mLayoutState;
        msVar.e = true != this.mShouldReverseLayout ? 1 : -1;
        msVar.d = i;
        msVar.f = 1;
        msVar.b = i2;
        msVar.g = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i, int i2) {
        this.mLayoutState.c = i2 - this.mOrientationHelper.j();
        ms msVar = this.mLayoutState;
        msVar.d = i;
        msVar.e = true != this.mShouldReverseLayout ? -1 : 1;
        msVar.f = -1;
        msVar.b = i2;
        msVar.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.np
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    protected void calculateExtraLayoutSpace(oe oeVar, int[] iArr) {
        int extraLayoutSpace = getExtraLayoutSpace(oeVar);
        int i = this.mLayoutState.f;
        int i2 = i == -1 ? 0 : extraLayoutSpace;
        if (i != -1) {
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i2;
    }

    @Override // defpackage.np
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // defpackage.np
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // defpackage.np
    public void collectAdjacentPrefetchPositions(int i, int i2, oe oeVar, nn nnVar) {
        int i3 = this.mOrientation;
        if (getChildCount() != 0) {
            if (i3 != 0) {
                i = i2;
            }
            if (i != 0) {
                ensureLayoutState();
                updateLayoutState(i > 0 ? 1 : -1, Math.abs(i), true, oeVar);
                collectPrefetchPositionsForLayoutState(oeVar, this.mLayoutState, nnVar);
            }
        }
    }

    @Override // defpackage.np
    public void collectInitialPrefetchPositions(int i, nn nnVar) {
        boolean z;
        int i2;
        mt mtVar = this.mPendingSavedState;
        if (mtVar == null || !mtVar.b()) {
            resolveShouldLayoutReverse();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = mtVar.c;
            i2 = mtVar.a;
        }
        int i3 = true != z ? 1 : -1;
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            nnVar.a(i2, 0);
            i2 += i3;
        }
    }

    public void collectPrefetchPositionsForLayoutState(oe oeVar, ms msVar, nn nnVar) {
        int i = msVar.d;
        if (i < 0 || i >= oeVar.a()) {
            return;
        }
        nnVar.a(i, Math.max(0, msVar.g));
    }

    @Override // defpackage.np
    public int computeHorizontalScrollExtent(oe oeVar) {
        return computeScrollExtent(oeVar);
    }

    @Override // defpackage.np
    public int computeHorizontalScrollOffset(oe oeVar) {
        return computeScrollOffset(oeVar);
    }

    @Override // defpackage.np
    public int computeHorizontalScrollRange(oe oeVar) {
        return computeScrollRange(oeVar);
    }

    @Override // defpackage.oc
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        float f = (i < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(f, 0.0f) : new PointF(0.0f, f);
    }

    @Override // defpackage.np
    public int computeVerticalScrollExtent(oe oeVar) {
        return computeScrollExtent(oeVar);
    }

    @Override // defpackage.np
    public int computeVerticalScrollOffset(oe oeVar) {
        return computeScrollOffset(oeVar);
    }

    @Override // defpackage.np
    public int computeVerticalScrollRange(oe oeVar) {
        return computeScrollRange(oeVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001c, code lost:
    
        if (r5.mOrientation == 1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int convertFocusDirectionToLayoutDirection(int r6) {
        /*
            r5 = this;
            r0 = -1
            r1 = 1
            if (r6 == r1) goto L32
            r2 = 2
            if (r6 == r2) goto L27
            r2 = 17
            r3 = 0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r2) goto L20
            r2 = 33
            if (r6 == r2) goto L21
            r0 = 66
            if (r6 == r0) goto L1f
            r0 = 130(0x82, float:1.82E-43)
            if (r6 != r0) goto L25
            int r5 = r5.mOrientation
            if (r5 != r1) goto L25
            goto L3c
        L1f:
            r0 = r1
        L20:
            r1 = r3
        L21:
            int r5 = r5.mOrientation
            if (r5 == r1) goto L3d
        L25:
            r0 = r4
            goto L3d
        L27:
            int r6 = r5.mOrientation
            if (r6 == r1) goto L3c
            boolean r5 = r5.isLayoutRTL()
            if (r5 == 0) goto L3c
            goto L3d
        L32:
            int r6 = r5.mOrientation
            if (r6 == r1) goto L3d
            boolean r5 = r5.isLayoutRTL()
            if (r5 == 0) goto L3d
        L3c:
            r0 = r1
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.convertFocusDirectionToLayoutDirection(int):int");
    }

    public ms createLayoutState() {
        return new ms();
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(nv nvVar, ms msVar, oe oeVar, boolean z) {
        int i = msVar.c;
        int i2 = msVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                msVar.g = i2 + i;
            }
            recycleByLayoutState(nvVar, msVar);
        }
        int i3 = msVar.c + msVar.h;
        mr mrVar = this.mLayoutChunkResult;
        while (true) {
            if ((!msVar.m && i3 <= 0) || !msVar.c(oeVar)) {
                break;
            }
            mrVar.a = 0;
            mrVar.b = false;
            mrVar.c = false;
            mrVar.d = false;
            layoutChunk(nvVar, oeVar, msVar, mrVar);
            if (!mrVar.b) {
                int i4 = msVar.b;
                int i5 = mrVar.a;
                msVar.b = i4 + (msVar.f * i5);
                if (!mrVar.c || msVar.l != null || !oeVar.g) {
                    msVar.c -= i5;
                    i3 -= i5;
                }
                int i6 = msVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    msVar.g = i7;
                    int i8 = msVar.c;
                    if (i8 < 0) {
                        msVar.g = i7 + i8;
                    }
                    recycleByLayoutState(nvVar, msVar);
                }
                if (z && mrVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - msVar.c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findFirstFocusableChildClosestToEnd() {
        int i;
        int childCount;
        int childCount2;
        if (this.mShouldReverseLayout) {
            childCount2 = getChildCount();
            i = 1;
            childCount = 0;
        } else {
            i = -1;
            childCount = getChildCount() - 1;
            childCount2 = -1;
        }
        while (childCount != childCount2) {
            View childAt = getChildAt(childCount);
            if (childAt != null && childAt.hasFocusable()) {
                return childAt;
            }
            childCount += i;
        }
        return null;
    }

    public View findFirstFocusableChildClosestToStart() {
        int childCount;
        int i;
        int childCount2;
        if (this.mShouldReverseLayout) {
            childCount = -1;
            childCount2 = getChildCount() - 1;
            i = -1;
        } else {
            childCount = getChildCount();
            i = 1;
            childCount2 = 0;
        }
        while (childCount2 != childCount) {
            View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.hasFocusable()) {
                return childAt;
            }
            childCount2 += i;
        }
        return null;
    }

    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z, z2) : findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    public View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z, z2) : findOneVisibleChild(0, getChildCount(), z, z2);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild != null) {
            return getPosition(viewFindOneVisibleChild);
        }
        return -1;
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild != null) {
            return getPosition(viewFindOneVisibleChild);
        }
        return -1;
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        int i3;
        int i4;
        ensureLayoutState();
        if (i2 <= i && i2 >= i) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.d(getChildAt(i)) < this.mOrientationHelper.j()) {
            i3 = 16388;
            i4 = 16644;
        } else {
            i3 = 4097;
            i4 = 4161;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i, i2, i4, i3) : this.mVerticalBoundCheck.a(i, i2, i4, i3);
    }

    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        ensureLayoutState();
        int i3 = this.mOrientation;
        int i4 = true != z ? 320 : 24579;
        int i5 = true != z2 ? 0 : 320;
        return i3 == 0 ? this.mHorizontalBoundCheck.a(i, i2, i4, i5) : this.mVerticalBoundCheck.a(i, i2, i4, i5);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    public View findReferenceChild(nv nvVar, oe oeVar, boolean z, boolean z2) {
        int i;
        int i2;
        int childCount;
        ensureLayoutState();
        int childCount2 = getChildCount();
        if (z2) {
            i = -1;
            childCount = getChildCount() - 1;
            i2 = -1;
        } else {
            i = childCount2;
            i2 = 1;
            childCount = 0;
        }
        int iA = oeVar.a();
        int iJ = this.mOrientationHelper.j();
        int iF = this.mOrientationHelper.f();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            int iD = this.mOrientationHelper.d(childAt);
            int iA2 = this.mOrientationHelper.a(childAt);
            if (position >= 0 && position < iA) {
                if (!((nq) childAt.getLayoutParams()).gN()) {
                    boolean z3 = iA2 <= iJ && iD < iJ;
                    boolean z4 = iD >= iF && iA2 > iF;
                    if (!z3 && !z4) {
                        return childAt;
                    }
                    if (z) {
                        if (z4) {
                            view2 = childAt;
                        } else if (view == null) {
                            view = childAt;
                        }
                    } else if (z3) {
                        view2 = childAt;
                    } else if (view == null) {
                        view = childAt;
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            childCount += i2;
        }
        if (view == null) {
            return view2 != null ? view2 : view3;
        }
        return view;
    }

    @Override // defpackage.np
    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    @Override // defpackage.np
    public nq generateDefaultLayoutParams() {
        return new nq(-2, -2);
    }

    @Deprecated
    protected int getExtraLayoutSpace(oe oeVar) {
        if (oeVar.c()) {
            return this.mOrientationHelper.k();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // defpackage.np
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    protected boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // defpackage.np
    public boolean isLayoutReversed() {
        return this.mReverseLayout;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public void layoutChunk(nv nvVar, oe oeVar, ms msVar, mr mrVar) {
        int iC;
        int i;
        int paddingLeft;
        int i2;
        int iC2;
        int i3;
        View viewA = msVar.a(nvVar);
        if (viewA == null) {
            mrVar.b = true;
            return;
        }
        nq nqVar = (nq) viewA.getLayoutParams();
        List list = msVar.l;
        boolean z = this.mShouldReverseLayout;
        if (list == null) {
            if (z == (msVar.f == -1)) {
                addView(viewA);
            } else {
                addView(viewA, 0);
            }
        } else {
            if (z == (msVar.f == -1)) {
                addDisappearingView(viewA);
            } else {
                addDisappearingView(viewA, 0);
            }
        }
        measureChildWithMargins(viewA, 0, 0);
        mrVar.a = this.mOrientationHelper.b(viewA);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iC2 = getWidth() - getPaddingRight();
                paddingLeft = iC2 - this.mOrientationHelper.c(viewA);
            } else {
                paddingLeft = getPaddingLeft();
                iC2 = this.mOrientationHelper.c(viewA) + paddingLeft;
            }
            if (msVar.f == -1) {
                i3 = msVar.b;
                i2 = i3 - mrVar.a;
            } else {
                i2 = msVar.b;
                i3 = mrVar.a + i2;
            }
            iC = i3;
            i = iC2;
        } else {
            int paddingTop = getPaddingTop();
            iC = this.mOrientationHelper.c(viewA) + paddingTop;
            if (msVar.f == -1) {
                int i4 = msVar.b;
                i = i4;
                paddingLeft = i4 - mrVar.a;
            } else {
                int i5 = msVar.b;
                i = mrVar.a + i5;
                paddingLeft = i5;
            }
            i2 = paddingTop;
        }
        layoutDecoratedWithMargins(viewA, paddingLeft, i2, i, iC);
        if (nqVar.gN() || nqVar.gM()) {
            mrVar.c = true;
        }
        mrVar.d = viewA.hasFocusable();
    }

    @Override // defpackage.np
    public void onDetachedFromWindow(RecyclerView recyclerView, nv nvVar) {
        super.onDetachedFromWindow(recyclerView, nvVar);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(nvVar);
            nvVar.c();
        }
    }

    @Override // defpackage.np
    public View onFocusEnter(int i, nv nvVar, oe oeVar) {
        int iConvertFocusDirectionToLayoutDirection;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        int iA = (iConvertFocusDirectionToLayoutDirection == -1) ^ this.mShouldReverseLayout ? oeVar.a() - 1 : 0;
        if (findViewByPosition(iA) != null) {
            smoothScrollToPosition(this.mRecyclerView, oeVar, iA);
        } else {
            this.mPendingScrollPosition = iA;
            onLayoutChildrenInt(nvVar, oeVar);
        }
        View viewFindFirstFocusableChildClosestToEnd = iConvertFocusDirectionToLayoutDirection == -1 ? findFirstFocusableChildClosestToEnd() : findFirstFocusableChildClosestToStart();
        return (viewFindFirstFocusableChildClosestToEnd == null || !viewFindFirstFocusableChildClosestToEnd.hasFocusable()) ? onFocusSearchFailedInternal(i, nvVar, oeVar) : viewFindFirstFocusableChildClosestToEnd;
    }

    @Override // defpackage.np
    public View onFocusSearchFailed(View view, int i, nv nvVar, oe oeVar) {
        return onFocusSearchFailedInternal(i, nvVar, oeVar);
    }

    @Override // defpackage.np
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // defpackage.np
    public void onInitializeAccessibilityNodeInfo(nv nvVar, oe oeVar, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(nvVar, oeVar, bbzVar);
        nh nhVar = this.mRecyclerView.m;
        if (nhVar == null || nhVar.a() <= 0) {
            return;
        }
        bbzVar.k(bby.i);
    }

    @Override // defpackage.np
    public void onLayoutChildren(nv nvVar, oe oeVar) {
        onLayoutChildrenInt(nvVar, oeVar);
    }

    @Override // defpackage.np
    public void onLayoutCompleted(oe oeVar) {
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.d();
    }

    @Override // defpackage.np
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof mt) {
            mt mtVar = (mt) parcelable;
            this.mPendingSavedState = mtVar;
            if (this.mPendingScrollPosition != -1) {
                mtVar.a();
            }
            requestLayout();
        }
    }

    @Override // defpackage.np
    public Parcelable onSaveInstanceState() {
        mt mtVar = this.mPendingSavedState;
        if (mtVar != null) {
            return new mt(mtVar);
        }
        mt mtVar2 = new mt();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            mtVar2.c = z;
            if (z) {
                View childClosestToEnd = getChildClosestToEnd();
                mtVar2.b = this.mOrientationHelper.f() - this.mOrientationHelper.a(childClosestToEnd);
                mtVar2.a = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                mtVar2.a = getPosition(childClosestToStart);
                mtVar2.b = this.mOrientationHelper.d(childClosestToStart) - this.mOrientationHelper.j();
            }
        } else {
            mtVar2.a();
        }
        return mtVar2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    @Override // defpackage.np
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        int iMin;
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.mOrientation == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 >= 0) {
                    RecyclerView recyclerView = this.mRecyclerView;
                    iMin = Math.min(i2, getRowCountForAccessibility(recyclerView.e, recyclerView.O) - 1);
                    if (iMin >= 0) {
                        scrollToPositionWithOffset(iMin, 0);
                        return true;
                    }
                }
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 >= 0) {
                    RecyclerView recyclerView2 = this.mRecyclerView;
                    iMin = Math.min(i3, getColumnCountForAccessibility(recyclerView2.e, recyclerView2.O) - 1);
                    if (iMin >= 0) {
                        scrollToPositionWithOffset(iMin, 0);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.pu
    public void prepareForDrop(View view, View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        boolean z = this.mShouldReverseLayout;
        byte b = position < position2 ? (byte) 1 : (byte) -1;
        if (z) {
            nd ndVar = this.mOrientationHelper;
            if (b == 1) {
                scrollToPositionWithOffset(position2, ndVar.f() - (this.mOrientationHelper.d(view2) + this.mOrientationHelper.b(view)));
                return;
            } else {
                scrollToPositionWithOffset(position2, ndVar.f() - this.mOrientationHelper.a(view2));
                return;
            }
        }
        nd ndVar2 = this.mOrientationHelper;
        if (b == -1) {
            scrollToPositionWithOffset(position2, ndVar2.d(view2));
        } else {
            scrollToPositionWithOffset(position2, ndVar2.a(view2) - this.mOrientationHelper.b(view));
        }
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.h() == 0 && this.mOrientationHelper.e() == 0;
    }

    public void resolveShouldLayoutReverse() {
        this.mShouldReverseLayout = (this.mOrientation == 1 || !isLayoutRTL()) ? this.mReverseLayout : !this.mReverseLayout;
    }

    public int scrollBy(int i, nv nvVar, oe oeVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        updateLayoutState(i2, iAbs, true, oeVar);
        ms msVar = this.mLayoutState;
        int iFill = msVar.g + fill(nvVar, msVar, oeVar, false);
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i = i2 * iFill;
        }
        this.mOrientationHelper.n(-i);
        this.mLayoutState.k = i;
        return i;
    }

    @Override // defpackage.np
    public int scrollHorizontallyBy(int i, nv nvVar, oe oeVar) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, nvVar, oeVar);
    }

    @Override // defpackage.np
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        mt mtVar = this.mPendingSavedState;
        if (mtVar != null) {
            mtVar.a();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        mt mtVar = this.mPendingSavedState;
        if (mtVar != null) {
            mtVar.a();
        }
        requestLayout();
    }

    @Override // defpackage.np
    public int scrollVerticallyBy(int i, nv nvVar, oe oeVar) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, nvVar, oeVar);
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a.bR(i, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.mOrientation || this.mOrientationHelper == null) {
            nd ndVarP = nd.p(this, i);
            this.mOrientationHelper = ndVarP;
            this.mAnchorInfo.a = ndVarP;
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z != this.mReverseLayout) {
            this.mReverseLayout = z;
            requestLayout();
        }
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd != z) {
            this.mStackFromEnd = z;
            requestLayout();
        }
    }

    @Override // defpackage.np
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // defpackage.np
    public void smoothScrollToPosition(RecyclerView recyclerView, oe oeVar, int i) {
        od odVar = new od(recyclerView.getContext());
        odVar.b = i;
        startSmoothScroll(odVar);
    }

    @Override // defpackage.np
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    void validateChildOrder() {
        getChildCount();
        if (getChildCount() > 0) {
            int position = getPosition(getChildAt(0));
            int iD = this.mOrientationHelper.d(getChildAt(0));
            if (this.mShouldReverseLayout) {
                for (int i = 1; i < getChildCount(); i++) {
                    View childAt = getChildAt(i);
                    int position2 = getPosition(childAt);
                    int iD2 = this.mOrientationHelper.d(childAt);
                    if (position2 < position) {
                        logChildren();
                        StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                        sb.append(iD2 < iD);
                        throw new RuntimeException(sb.toString());
                    }
                    if (iD2 > iD) {
                        logChildren();
                        throw new RuntimeException("detected invalid location");
                    }
                }
                return;
            }
            for (int i2 = 1; i2 < getChildCount(); i2++) {
                View childAt2 = getChildAt(i2);
                int position3 = getPosition(childAt2);
                int iD3 = this.mOrientationHelper.d(childAt2);
                if (position3 < position) {
                    logChildren();
                    StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                    sb2.append(iD3 < iD);
                    throw new RuntimeException(sb2.toString());
                }
                if (iD3 < iD) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
        }
    }

    private void updateLayoutStateToFillEnd(mq mqVar) {
        updateLayoutStateToFillEnd(mqVar.b, mqVar.c);
    }

    private void updateLayoutStateToFillStart(mq mqVar) {
        updateLayoutStateToFillStart(mqVar.b, mqVar.c);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new mq();
        this.mLayoutChunkResult = new mr();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public void onAnchorReady(nv nvVar, oe oeVar, mq mqVar, int i) {
    }
}
