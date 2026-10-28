package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import defpackage.a;
import defpackage.bby;
import defpackage.bbz;
import defpackage.mk;
import defpackage.ml;
import defpackage.mm;
import defpackage.mq;
import defpackage.mr;
import defpackage.ms;
import defpackage.nh;
import defpackage.nn;
import defpackage.nq;
import defpackage.nv;
import defpackage.oe;
import defpackage.oh;
import defpackage.zs;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final Set k = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    boolean a;
    public int b;
    int[] c;
    View[] d;
    final SparseIntArray e;
    final SparseIntArray f;
    public mm g;
    final Rect h;
    int i;
    int j;
    private int l;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new mk();
        this.h = new Rect();
        this.l = -1;
        this.i = -1;
        this.j = -1;
        b(getProperties(context, attributeSet, i, i2).b);
    }

    private final int c(int i) {
        int i2 = this.mOrientation;
        RecyclerView recyclerView = this.mRecyclerView;
        return i2 == 0 ? e(recyclerView.e, recyclerView.O, i) : f(recyclerView.e, recyclerView.O, i);
    }

    private final int d(int i) {
        int i2 = this.mOrientation;
        RecyclerView recyclerView = this.mRecyclerView;
        return i2 == 1 ? e(recyclerView.e, recyclerView.O, i) : f(recyclerView.e, recyclerView.O, i);
    }

    private final int e(nv nvVar, oe oeVar, int i) {
        if (!oeVar.g) {
            return this.g.c(i, this.b);
        }
        int iA = nvVar.a(i);
        if (iA != -1) {
            return this.g.c(iA, this.b);
        }
        Log.w("GridLayoutManager", a.bR(i, "Cannot find span size for pre layout position. "));
        return 0;
    }

    private final int f(nv nvVar, oe oeVar, int i) {
        if (!oeVar.g) {
            return this.g.a(i, this.b);
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iA = nvVar.a(i);
        if (iA != -1) {
            return this.g.a(iA, this.b);
        }
        Log.w("GridLayoutManager", a.bR(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
        return 0;
    }

    private final int g(nv nvVar, oe oeVar, int i) {
        if (!oeVar.g) {
            return this.g.b(i);
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iA = nvVar.a(i);
        if (iA != -1) {
            return this.g.b(iA);
        }
        Log.w("GridLayoutManager", a.bR(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c5, code lost:
    
        if (r13 == (r1 > r11)) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.view.View h(android.view.View r23, int r24, defpackage.nv r25, defpackage.oe r26) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.h(android.view.View, int, nv, oe):android.view.View");
    }

    private final Set i(int i) {
        return k(c(i), i);
    }

    private final Set j(int i) {
        return k(d(i), i);
    }

    private final Set k(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.mRecyclerView;
        int iG = g(recyclerView.e, recyclerView.O, i2);
        for (int i3 = i; i3 < i + iG; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    private final void l(int i) {
        int i2;
        int length;
        int[] iArr = this.c;
        int i3 = this.b;
        int i4 = i3 + 1;
        if (iArr == null || (length = iArr.length) != i4 || iArr[length - 1] != i) {
            iArr = new int[i4];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i / i3;
        int i7 = i % i3;
        int i8 = 0;
        for (int i9 = 1; i9 <= i3; i9++) {
            i5 += i7;
            if (i5 <= 0 || i3 - i5 >= i7) {
                i2 = i6;
            } else {
                i2 = i6 + 1;
                i5 -= i3;
            }
            i8 += i2;
            iArr[i9] = i8;
        }
        this.c = iArr;
    }

    private final void m() {
        View[] viewArr = this.d;
        if (viewArr != null) {
            if (viewArr.length == this.b) {
                return;
            }
        }
        this.d = new View[this.b];
    }

    private final void n(View view, int i, boolean z) {
        int childMeasureSpec;
        int childMeasureSpec2;
        ml mlVar = (ml) view.getLayoutParams();
        Rect rect = mlVar.d;
        int i2 = rect.top + rect.bottom + mlVar.topMargin + mlVar.bottomMargin;
        int i3 = rect.left + rect.right + mlVar.leftMargin + mlVar.rightMargin;
        int iA = a(mlVar.a, mlVar.b);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = getChildMeasureSpec(iA, i, i3, mlVar.width, false);
            childMeasureSpec = getChildMeasureSpec(this.mOrientationHelper.k(), getHeightMode(), i2, mlVar.height, true);
        } else {
            int childMeasureSpec3 = getChildMeasureSpec(iA, i, i2, mlVar.height, false);
            int childMeasureSpec4 = getChildMeasureSpec(this.mOrientationHelper.k(), getWidthMode(), i3, mlVar.width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        o(view, childMeasureSpec2, childMeasureSpec, z);
    }

    private final void o(View view, int i, int i2, boolean z) {
        nq nqVar = (nq) view.getLayoutParams();
        if (z ? shouldReMeasureChild(view, i, i2, nqVar) : shouldMeasureChild(view, i, i2, nqVar)) {
            view.measure(i, i2);
        }
    }

    private final void p() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        l(height - paddingTop);
    }

    final int a(int i, int i2) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.c;
        int i3 = this.b - i;
        return iArr2[i3] - iArr2[i3 - i2];
    }

    public final void b(int i) {
        if (i != this.b) {
            this.a = true;
            if (i <= 0) {
                throw new IllegalArgumentException(a.bR(i, "Span count should be at least 1. Provided "));
            }
            this.b = i;
            this.g.e();
            requestLayout();
        }
    }

    @Override // defpackage.np
    public final boolean checkLayoutParams(nq nqVar) {
        return nqVar instanceof ml;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(oe oeVar, ms msVar, nn nnVar) {
        int iB = this.b;
        for (int i = 0; i < this.b && msVar.c(oeVar) && iB > 0; i++) {
            int i2 = msVar.d;
            nnVar.a(i2, Math.max(0, msVar.g));
            iB -= this.g.b(i2);
            msVar.d += msVar.e;
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final View findReferenceChild(nv nvVar, oe oeVar, boolean z, boolean z2) {
        int i;
        int childCount;
        int i2;
        int childCount2 = getChildCount();
        if (z2) {
            i = -1;
            childCount = getChildCount() - 1;
            i2 = -1;
        } else {
            i = childCount2;
            childCount = 0;
            i2 = 1;
        }
        int iA = oeVar.a();
        ensureLayoutState();
        int iJ = this.mOrientationHelper.j();
        int iF = this.mOrientationHelper.f();
        View view = null;
        View view2 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iA && f(nvVar, oeVar, position) == 0) {
                if (((nq) childAt.getLayoutParams()).gN()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.d(childAt) < iF && this.mOrientationHelper.a(childAt) >= iJ) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i2;
        }
        return view == null ? view2 : view;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final nq generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new ml(-2, -1) : new ml(-1, -2);
    }

    @Override // defpackage.np
    public nq generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new ml((ViewGroup.MarginLayoutParams) layoutParams) : new ml(layoutParams);
    }

    @Override // defpackage.np
    public final int getColumnCountForAccessibility(nv nvVar, oe oeVar) {
        if (this.mOrientation == 1) {
            return Math.min(this.b, getItemCount());
        }
        if (oeVar.a() <= 0) {
            return 0;
        }
        return e(nvVar, oeVar, oeVar.a() - 1) + 1;
    }

    @Override // defpackage.np
    public final int getRowCountForAccessibility(nv nvVar, oe oeVar) {
        if (this.mOrientation == 0) {
            return Math.min(this.b, getItemCount());
        }
        if (oeVar.a() <= 0) {
            return 0;
        }
        return e(nvVar, oeVar, oeVar.a() - 1) + 1;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void layoutChunk(nv nvVar, oe oeVar, ms msVar, mr mrVar) {
        int i;
        int i2;
        int i3;
        int iC;
        int paddingLeft;
        int paddingTop;
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean z;
        View viewA;
        GridLayoutManager gridLayoutManager = this;
        int i4 = gridLayoutManager.mOrientationHelper.i();
        int i5 = gridLayoutManager.getChildCount() > 0 ? gridLayoutManager.c[gridLayoutManager.b] : 0;
        boolean z2 = i4 != 1073741824;
        if (z2) {
            gridLayoutManager.p();
        }
        int i6 = msVar.e;
        int iF = gridLayoutManager.b;
        if (i6 != 1) {
            iF = gridLayoutManager.f(nvVar, oeVar, msVar.d) + gridLayoutManager.g(nvVar, oeVar, msVar.d);
        }
        int i7 = 0;
        while (i7 < gridLayoutManager.b && msVar.c(oeVar) && iF > 0) {
            int i8 = msVar.d;
            int iG = gridLayoutManager.g(nvVar, oeVar, i8);
            if (iG > gridLayoutManager.b) {
                throw new IllegalArgumentException("Item at position " + i8 + " requires " + iG + " spans but GridLayoutManager has only " + gridLayoutManager.b + " spans.");
            }
            iF -= iG;
            if (iF < 0 || (viewA = msVar.a(nvVar)) == null) {
                break;
            }
            gridLayoutManager.d[i7] = viewA;
            i7++;
        }
        if (i7 == 0) {
            mrVar.b = true;
            return;
        }
        if (i6 == 1) {
            i3 = 1;
            i2 = i7;
            i = 0;
        } else {
            i = i7 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i9 = 0;
        while (i != i2) {
            View view = gridLayoutManager.d[i];
            ml mlVar = (ml) view.getLayoutParams();
            int iG2 = gridLayoutManager.g(nvVar, oeVar, gridLayoutManager.getPosition(view));
            mlVar.b = iG2;
            mlVar.a = i9;
            i9 += iG2;
            i += i3;
        }
        float f = 0.0f;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            View view2 = gridLayoutManager.d[i11];
            if (msVar.l != null) {
                z = false;
                if (i6 == 1) {
                    gridLayoutManager.addDisappearingView(view2);
                } else {
                    gridLayoutManager.addDisappearingView(view2, 0);
                }
            } else if (i6 == 1) {
                gridLayoutManager.addView(view2);
                z = false;
            } else {
                z = false;
                gridLayoutManager.addView(view2, 0);
            }
            gridLayoutManager.calculateItemDecorationsForChild(view2, gridLayoutManager.h);
            gridLayoutManager.n(view2, i4, z);
            int iB = gridLayoutManager.mOrientationHelper.b(view2);
            if (iB > i10) {
                i10 = iB;
            }
            float fC = gridLayoutManager.mOrientationHelper.c(view2) / ((ml) view2.getLayoutParams()).b;
            if (fC > f) {
                f = fC;
            }
        }
        if (z2) {
            gridLayoutManager.l(Math.max(Math.round(f * gridLayoutManager.b), i5));
            i10 = 0;
            for (int i12 = 0; i12 < i7; i12++) {
                View view3 = gridLayoutManager.d[i12];
                gridLayoutManager.n(view3, 1073741824, true);
                int iB2 = gridLayoutManager.mOrientationHelper.b(view3);
                if (iB2 > i10) {
                    i10 = iB2;
                }
            }
        }
        for (int i13 = 0; i13 < i7; i13++) {
            View view4 = gridLayoutManager.d[i13];
            if (gridLayoutManager.mOrientationHelper.b(view4) != i10) {
                ml mlVar2 = (ml) view4.getLayoutParams();
                Rect rect = mlVar2.d;
                int i14 = rect.top + rect.bottom + mlVar2.topMargin + mlVar2.bottomMargin;
                int i15 = rect.left + rect.right + mlVar2.leftMargin + mlVar2.rightMargin;
                int iA = gridLayoutManager.a(mlVar2.a, mlVar2.b);
                if (gridLayoutManager.mOrientation == 1) {
                    childMeasureSpec2 = getChildMeasureSpec(iA, 1073741824, i15, mlVar2.width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - i14, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - i15, 1073741824);
                    childMeasureSpec = getChildMeasureSpec(iA, 1073741824, i14, mlVar2.height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                gridLayoutManager.o(view4, childMeasureSpec2, childMeasureSpec, true);
            }
        }
        int i16 = 0;
        mrVar.a = i10;
        if (gridLayoutManager.mOrientation == 1) {
            if (msVar.f == -1) {
                int i17 = msVar.b;
                paddingTop = i17 - i10;
                i16 = i17;
            } else {
                paddingTop = msVar.b;
                i16 = paddingTop + i10;
            }
            paddingLeft = 0;
            iC = 0;
        } else {
            if (msVar.f == -1) {
                int i18 = msVar.b;
                paddingLeft = i18 - i10;
                iC = i18;
            } else {
                int i19 = msVar.b;
                iC = i19 + i10;
                paddingLeft = i19;
            }
            paddingTop = i16;
        }
        int i20 = 0;
        while (true) {
            View[] viewArr = gridLayoutManager.d;
            if (i20 >= i7) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            int iC2 = i16;
            View view5 = viewArr[i20];
            ml mlVar3 = (ml) view5.getLayoutParams();
            if (gridLayoutManager.mOrientation != 1) {
                paddingTop = gridLayoutManager.getPaddingTop() + gridLayoutManager.c[mlVar3.a];
                iC2 = gridLayoutManager.mOrientationHelper.c(view5) + paddingTop;
            } else if (gridLayoutManager.isLayoutRTL()) {
                iC = gridLayoutManager.c[gridLayoutManager.b - mlVar3.a] + gridLayoutManager.getPaddingLeft();
                paddingLeft = iC - gridLayoutManager.mOrientationHelper.c(view5);
            } else {
                paddingLeft = gridLayoutManager.getPaddingLeft() + gridLayoutManager.c[mlVar3.a];
                iC = gridLayoutManager.mOrientationHelper.c(view5) + paddingLeft;
            }
            int i21 = iC;
            int i22 = paddingTop;
            gridLayoutManager.layoutDecoratedWithMargins(view5, paddingLeft, i22, i21, iC2);
            paddingTop = i22;
            iC = i21;
            i16 = iC2;
            if (mlVar3.gN() || mlVar3.gM()) {
                mrVar.c = true;
            }
            mrVar.d |= view5.hasFocusable();
            i20++;
            gridLayoutManager = this;
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void onAnchorReady(nv nvVar, oe oeVar, mq mqVar, int i) {
        p();
        if (oeVar.a() > 0 && !oeVar.g) {
            int iF = f(nvVar, oeVar, mqVar.b);
            if (i == 1) {
                while (iF > 0) {
                    int i2 = mqVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    mqVar.b = i3;
                    iF = f(nvVar, oeVar, i3);
                }
            } else {
                int iA = oeVar.a() - 1;
                int i4 = mqVar.b;
                while (i4 < iA) {
                    int i5 = i4 + 1;
                    int iF2 = f(nvVar, oeVar, i5);
                    if (iF2 <= iF) {
                        break;
                    }
                    i4 = i5;
                    iF = iF2;
                }
                mqVar.b = i4;
            }
        }
        m();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final View onFocusEnter(int i, nv nvVar, oe oeVar) {
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
            onLayoutChildren(nvVar, oeVar);
        }
        View viewFindFirstFocusableChildClosestToEnd = iConvertFocusDirectionToLayoutDirection == -1 ? findFirstFocusableChildClosestToEnd() : findFirstFocusableChildClosestToStart();
        return (viewFindFirstFocusableChildClosestToEnd == null || !viewFindFirstFocusableChildClosestToEnd.hasFocusable()) ? h(null, i, nvVar, oeVar) : viewFindFirstFocusableChildClosestToEnd;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final View onFocusSearchFailed(View view, int i, nv nvVar, oe oeVar) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return h(viewFindContainingItemView, i, nvVar, oeVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final void onInitializeAccessibilityNodeInfo(nv nvVar, oe oeVar, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(nvVar, oeVar, bbzVar);
        bbzVar.v(GridView.class.getName());
        nh nhVar = this.mRecyclerView.m;
        if (nhVar == null || nhVar.a() <= 1) {
            return;
        }
        bbzVar.k(bby.m);
    }

    @Override // defpackage.np
    public final void onInitializeAccessibilityNodeInfoForItem(nv nvVar, oe oeVar, View view, bbz bbzVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ml)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, bbzVar);
            return;
        }
        ml mlVar = (ml) layoutParams;
        int iE = e(nvVar, oeVar, mlVar.gL());
        if (this.mOrientation == 0) {
            bbzVar.y(zs.g(mlVar.a, mlVar.b, iE, 1, false));
        } else {
            bbzVar.y(zs.g(iE, 1, mlVar.a, mlVar.b, false));
        }
    }

    @Override // defpackage.np
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.g.e();
        this.g.d();
    }

    @Override // defpackage.np
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.g.e();
        this.g.d();
    }

    @Override // defpackage.np
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.g.e();
        this.g.d();
    }

    @Override // defpackage.np
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.g.e();
        this.g.d();
    }

    @Override // defpackage.np
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.g.e();
        this.g.d();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public void onLayoutChildren(nv nvVar, oe oeVar) {
        if (oeVar.g) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ml mlVar = (ml) getChildAt(i).getLayoutParams();
                int iGL = mlVar.gL();
                this.e.put(iGL, mlVar.b);
                this.f.put(iGL, mlVar.a);
            }
        }
        super.onLayoutChildren(nvVar, oeVar);
        this.e.clear();
        this.f.clear();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final void onLayoutCompleted(oe oeVar) {
        View viewFindViewByPosition;
        super.onLayoutCompleted(oeVar);
        this.a = false;
        int i = this.l;
        if (i == -1 || (viewFindViewByPosition = findViewByPosition(i)) == null) {
            return;
        }
        viewFindViewByPosition.sendAccessibilityEvent(67108864);
        this.l = -1;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x024b A[EDGE_INSN: B:145:0x024b->B:146:0x024c BREAK  A[LOOP:2: B:111:0x0191->B:119:0x01b9]] */
    /* JADX WARN: Code duplicated, block: B:152:0x025b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x025d  */
    /* JADX WARN: Code duplicated, block: B:169:0x02a4  */
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        int i2;
        View childAt;
        oh ohVarJ;
        int iIntValue;
        int i3 = -1;
        if (i != bby.m.a()) {
            if (i == 16908343) {
                if (bundle != null) {
                    i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                    int i4 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                    if (i2 == -1 && i4 != -1) {
                        int iA = this.mRecyclerView.m.a();
                        for (int i5 = 0; i5 < iA; i5++) {
                            RecyclerView recyclerView = this.mRecyclerView;
                            int iF = f(recyclerView.e, recyclerView.O, i5);
                            RecyclerView recyclerView2 = this.mRecyclerView;
                            int iE = e(recyclerView2.e, recyclerView2.O, i5);
                            if (this.mOrientation != 1) {
                                if (iF == i2 && iE == i4) {
                                    i3 = i5;
                                    break;
                                }
                            } else {
                                if (iF == i4 && iE == i2) {
                                    i3 = i5;
                                    break;
                                }
                            }
                        }
                        if (i3 < 0) {
                            return false;
                        }
                        scrollToPositionWithOffset(i3, 0);
                    }
                } else {
                    i = 16908343;
                }
            }
            return super.performAccessibilityAction(i, bundle);
        }
        if (i == -1) {
            i = -1;
            if (i == 16908343) {
                if (bundle != null) {
                    i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                    int i6 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                    return i2 == -1 ? false : false;
                }
                i = 16908343;
            }
            return super.performAccessibilityAction(i, bundle);
        }
        int i7 = 0;
        while (true) {
            if (i7 >= getChildCount()) {
                childAt = null;
                break;
            }
            View childAt2 = getChildAt(i7);
            childAt2.getClass();
            if (childAt2.isAccessibilityFocused()) {
                childAt = getChildAt(i7);
                break;
            }
            i7++;
        }
        if (childAt == null || bundle == null) {
            return false;
        }
        int i8 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
        if (!k.contains(Integer.valueOf(i8)) || (ohVarJ = this.mRecyclerView.j(childAt)) == null) {
            return false;
        }
        int iA2 = ohVarJ.a();
        int iD = d(iA2);
        int iC = c(iA2);
        if (iD < 0 || iC < 0) {
            return false;
        }
        if (!j(iA2).contains(Integer.valueOf(this.i)) || !i(iA2).contains(Integer.valueOf(this.j))) {
            this.i = iD;
            this.j = iC;
        }
        int i9 = this.i;
        if (i9 == -1) {
            i9 = iD;
        }
        int i10 = this.j;
        if (i10 != -1) {
            iC = i10;
        }
        if (i8 == 17) {
            iIntValue = iA2 - 1;
            while (true) {
                if (iIntValue >= 0) {
                    int iD2 = d(iIntValue);
                    int iC2 = c(iIntValue);
                    if (iD2 >= 0 && iC2 >= 0) {
                        if (this.mOrientation != 1) {
                            if (j(iIntValue).contains(Integer.valueOf(i9)) && iC2 < iC) {
                                this.j = iC2;
                                break;
                            }
                            iIntValue--;
                        } else {
                            if ((iD2 == i9 && iC2 < iC) || iD2 < i9) {
                                this.i = iD2;
                                this.j = iC2;
                                break;
                            }
                            iIntValue--;
                        }
                    }
                }
                iIntValue = -1;
                break;
            }
        }
        if (i8 == 33) {
            iIntValue = iA2 - 1;
            while (true) {
                if (iIntValue >= 0) {
                    int iD3 = d(iIntValue);
                    int iC3 = c(iIntValue);
                    if (iD3 >= 0 && iC3 >= 0) {
                        if (this.mOrientation != 1) {
                            if (iD3 < i9 && iC3 == iC) {
                                this.i = ((Integer) Collections.max(j(iIntValue))).intValue();
                                break;
                            }
                            iIntValue--;
                        } else {
                            if (iD3 < i9 && i(iIntValue).contains(Integer.valueOf(iC))) {
                                this.i = iD3;
                                break;
                            }
                            iIntValue--;
                        }
                    }
                }
                iIntValue = -1;
                break;
            }
        }
        if (i8 == 66) {
            iIntValue = iA2 + 1;
            while (true) {
                if (iIntValue < getItemCount()) {
                    int iD4 = d(iIntValue);
                    int iC4 = c(iIntValue);
                    if (iD4 >= 0 && iC4 >= 0) {
                        if (this.mOrientation != 1) {
                            if (iC4 > iC && j(iIntValue).contains(Integer.valueOf(i9))) {
                                this.j = iC4;
                                break;
                            }
                            iIntValue++;
                        } else {
                            if ((iD4 == i9 && iC4 > iC) || iD4 > i9) {
                                this.i = iD4;
                                this.j = iC4;
                                break;
                            }
                            iIntValue++;
                        }
                    }
                }
                iIntValue = -1;
                break;
            }
        }
        if (i8 != 130) {
            return false;
        }
        iIntValue = iA2 + 1;
        while (true) {
            if (iIntValue < getItemCount()) {
                int iD5 = d(iIntValue);
                int iC5 = c(iIntValue);
                if (iD5 >= 0 && iC5 >= 0) {
                    if (this.mOrientation != 1) {
                        if (iD5 > i9 && iC5 == iC) {
                            this.i = d(iIntValue);
                            break;
                        }
                        iIntValue++;
                    } else {
                        if (iD5 > i9 && (iC5 == iC || i(iIntValue).contains(Integer.valueOf(iC)))) {
                            this.i = iD5;
                            break;
                        }
                        iIntValue++;
                    }
                }
            }
            iIntValue = -1;
            break;
        }
        if (iIntValue == -1) {
            if (this.mOrientation == 0) {
                if (i8 != 17) {
                    if (i8 != 66) {
                        iIntValue = -1;
                        break;
                    }
                    TreeMap treeMap = new TreeMap();
                    int i11 = 0;
                    loop5: while (true) {
                        if (i11 < getItemCount()) {
                            Iterator it = j(i11).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Integer num = (Integer) it.next();
                                    if (num.intValue() >= 0) {
                                        if (!treeMap.containsKey(num)) {
                                            treeMap.put(num, Integer.valueOf(i11));
                                        }
                                    }
                                } else {
                                    i11++;
                                }
                            }
                        } else {
                            Iterator it2 = treeMap.keySet().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Integer num2 = (Integer) it2.next();
                                    int iIntValue2 = num2.intValue();
                                    if (iIntValue2 > iD) {
                                        iIntValue = ((Integer) treeMap.get(num2)).intValue();
                                        this.i = iIntValue2;
                                        this.j = 0;
                                        break;
                                    }
                                }
                            }
                        }
                        iIntValue = -1;
                        break;
                    }
                }
                TreeMap treeMap2 = new TreeMap(Collections.reverseOrder());
                int i12 = 0;
                loop2: while (true) {
                    if (i12 < getItemCount()) {
                        Iterator it3 = j(i12).iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                Integer num3 = (Integer) it3.next();
                                if (num3.intValue() >= 0) {
                                    treeMap2.put(num3, Integer.valueOf(i12));
                                }
                            } else {
                                i12++;
                            }
                        }
                    } else {
                        Iterator it4 = treeMap2.keySet().iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                Integer num4 = (Integer) it4.next();
                                int iIntValue3 = num4.intValue();
                                if (iIntValue3 < iD) {
                                    iIntValue = ((Integer) treeMap2.get(num4)).intValue();
                                    this.i = iIntValue3;
                                    this.j = c(iIntValue);
                                    break;
                                }
                            }
                        }
                    }
                    iIntValue = -1;
                    break;
                }
            }
            iIntValue = -1;
            break;
        }
        if (iIntValue == -1) {
            return false;
        }
        scrollToPosition(iIntValue);
        this.l = iIntValue;
        return true;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final int scrollHorizontallyBy(int i, nv nvVar, oe oeVar) {
        p();
        m();
        return super.scrollHorizontallyBy(i, nvVar, oeVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public final int scrollVerticallyBy(int i, nv nvVar, oe oeVar) {
        p();
        m();
        return super.scrollVerticallyBy(i, nvVar, oeVar);
    }

    @Override // defpackage.np
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        if (this.c == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            iChooseSize2 = chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.c;
            iChooseSize = chooseSize(i, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.c;
            iChooseSize2 = chooseSize(i2, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.np
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.a;
    }

    @Override // defpackage.np
    public final nq generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new ml(context, attributeSet);
    }

    public GridLayoutManager(Context context, int i, int i2) {
        super(context, i2, false);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new mk();
        this.h = new Rect();
        this.l = -1;
        this.i = -1;
        this.j = -1;
        b(i);
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new mk();
        this.h = new Rect();
        this.l = -1;
        this.i = -1;
        this.j = -1;
        b(i);
    }
}
