package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;
import com.google.android.libraries.elements.interfaces.IntersectionEngine;
import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import com.google.android.libraries.elements.interfaces.IntersectionSubscription;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mny implements nwj {
    private static final Rect a = new Rect(0, 0, 0, 0);
    private final Rect b = new Rect();
    private final Rect c = new Rect();
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private final Set g = new HashSet();
    private final boolean h;
    private ViewTreeObserver.OnGlobalLayoutListener i;
    private final hee j;

    public mny(hee heeVar, boolean z) {
        this.j = heeVar;
        this.h = z;
    }

    private static void i(Rect rect, Rect rect2, View view, Rect rect3) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int width = iArr[0] + view.getWidth();
        if (rect2.right > rect.left && rect2.right < rect.right) {
            width = rect2.right;
        }
        int height = iArr[1] + view.getHeight();
        if (rect2.bottom > rect.top && rect2.bottom < rect.bottom) {
            height = rect2.bottom;
        }
        rect3.set(iArr[0], iArr[1], width, height);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [awmd, java.lang.Object] */
    private final void j(String str, int i, Rect rect, Rect rect2, Rect rect3, boolean z) {
        int i2 = i - 1;
        hee heeVar = this.j;
        if (i2 != 2) {
            heeVar.g(str, rect, rect2, rect3, z);
        } else {
            ((IntersectionEngine) heeVar.a.io()).onExit(str, rect, rect2, rect3, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.nwj
    public final nwi a(String str, IntersectionObserver intersectionObserver) {
        final hee heeVar = this.j;
        if (heeVar.b == null) {
            heeVar.b = Collections.newSetFromMap(new WeakHashMap());
        }
        final IntersectionSubscription intersectionSubscriptionSubscribe = ((IntersectionEngine) heeVar.a.io()).subscribe(str, intersectionObserver);
        final nwi nwiVar = new nwi() { // from class: mnq
            @Override // defpackage.nwi
            public final void a() {
                IntersectionSubscription intersectionSubscription = intersectionSubscriptionSubscribe;
                if (intersectionSubscription != null) {
                    intersectionSubscription.cancel();
                }
            }
        };
        ?? r2 = heeVar.b;
        if (r2 != 0) {
            r2.add(nwiVar);
        }
        return new nwi() { // from class: mnr
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Set] */
            @Override // defpackage.nwi
            public final void a() {
                nwi nwiVar2 = nwiVar;
                nwiVar2.a();
                ?? r1 = heeVar.b;
                if (r1 != 0) {
                    r1.remove(nwiVar2);
                }
            }
        };
    }

    @Override // defpackage.nwj
    public final void c(RecyclerView recyclerView) {
        mnx mnxVar = new mnx(this, new FutureTask(new lfa(this, recyclerView, 20, (char[]) null), null), recyclerView, 0);
        this.i = mnxVar;
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(mnxVar);
    }

    @Override // defpackage.nwj
    public final void d(RecyclerView recyclerView) {
        g(recyclerView, 3, -1);
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.i;
        if (onGlobalLayoutListener != null) {
            recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            this.i = null;
        }
    }

    @Override // defpackage.nwj
    public final void e(String str) {
        hee heeVar = this.j;
        if (heeVar.h()) {
            heeVar.g(str, this.d, a, this.b, false);
        }
    }

    @Override // defpackage.nwj
    public final boolean f() {
        return this.j.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    public final void g(RecyclerView recyclerView, int i, int i2) {
        int iC;
        int iE;
        int i3;
        mny mnyVar;
        Set setJ;
        mny mnyVar2;
        int i4;
        mny mnyVar3 = this;
        np npVar = recyclerView.n;
        boolean z = npVar instanceof LinearLayoutManager;
        if (z || (npVar instanceof FlowLayoutManager)) {
            Rect rect = mnyVar3.b;
            recyclerView.getGlobalVisibleRect(rect);
            if (z) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) npVar;
                iC = linearLayoutManager.findFirstVisibleItemPosition();
                iE = linearLayoutManager.findLastVisibleItemPosition();
            } else {
                FlowLayoutManager flowLayoutManager = (FlowLayoutManager) npVar;
                iC = flowLayoutManager.c();
                iE = flowLayoutManager.e();
            }
            int i5 = iE;
            int i6 = 0;
            int i7 = 1;
            if (i2 == -1) {
                np npVar2 = recyclerView.n;
                i3 = (npVar2 == null || npVar2.canScrollVertically()) ? 1 : 0;
            } else {
                i3 = i2;
            }
            hee heeVar = mnyVar3.j;
            if (heeVar.h()) {
                int i8 = iC;
                while (i8 <= i5) {
                    View viewFindViewByPosition = npVar.findViewByPosition(i8);
                    if (viewFindViewByPosition != null) {
                        RecyclerView recyclerView2 = null;
                        if (viewFindViewByPosition instanceof ViewGroup) {
                            mnyVar = mnyVar3;
                            ViewGroup viewGroup = (ViewGroup) viewFindViewByPosition;
                            for (int i9 = i6; i9 < viewGroup.getChildCount(); i9++) {
                                if (viewGroup.getChildAt(i9) instanceof ftl) {
                                    recyclerView2 = ((ftl) viewGroup.getChildAt(i9)).l;
                                    break;
                                }
                            }
                        }
                        if (recyclerView2 != null) {
                            mnyVar.g(recyclerView2, 4, i3);
                        }
                        HashSet hashSet = new HashSet();
                        agke agkeVar = nty.b;
                        int i10 = ((agpi) agkeVar).d;
                        for (int i11 = i6; i11 < i10; i11++) {
                            hashSet.addAll(ket.I(viewFindViewByPosition, ((Integer) agkeVar.get(i11)).intValue()));
                        }
                        boolean z2 = i7 != i3 ? i6 : i7;
                        if (!hashSet.isEmpty()) {
                            Rect rect2 = mnyVar.c;
                            viewFindViewByPosition.getGlobalVisibleRect(rect2);
                            Rect rect3 = mnyVar.d;
                            i(rect, rect2, viewFindViewByPosition, rect3);
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                mnyVar.j((String) it.next(), i, rect3, rect2, rect, z2);
                                i10 = i10;
                            }
                        }
                        int i12 = i10;
                        if (mnyVar.h && (setJ = ket.J(viewFindViewByPosition)) != null && !setJ.isEmpty()) {
                            View[] viewArr = (View[]) setJ.toArray(new View[i6]);
                            int length = viewArr.length;
                            int i13 = i6;
                            while (i13 < length) {
                                View view = viewArr[i13];
                                if (view != null) {
                                    Set set = mnyVar2.g;
                                    set.clear();
                                    while (i6 < i12) {
                                        mnyVar2 = mnyVar;
                                        set.addAll(ket.I(view, ((Integer) agkeVar.get(i6)).intValue()));
                                        i6++;
                                        length = length;
                                    }
                                    mnyVar2 = mnyVar;
                                    int i14 = length;
                                    if (!set.isEmpty()) {
                                        Rect rect4 = mnyVar2.e;
                                        if (view.getGlobalVisibleRect(rect4)) {
                                            Rect rect5 = mnyVar2.f;
                                            i(rect, rect4, view, rect5);
                                            Iterator it2 = set.iterator();
                                            mny mnyVar4 = mnyVar2;
                                            while (it2.hasNext()) {
                                                Rect rect6 = rect5;
                                                mnyVar4.j((String) it2.next(), i, rect6, rect4, rect, z2);
                                                mnyVar4 = this;
                                                i13 = i13;
                                                rect5 = rect6;
                                            }
                                        }
                                    }
                                    i4 = i14;
                                } else {
                                    mnyVar2 = mnyVar;
                                    i4 = length;
                                }
                                i13++;
                                mnyVar2 = this;
                                length = i4;
                                i6 = 0;
                            }
                            mnyVar2 = mnyVar;
                        }
                    } else {
                        mnyVar = mnyVar3;
                    }
                    i8++;
                    i6 = 0;
                    i7 = 1;
                    mnyVar = this;
                }
                mnyVar = mnyVar3;
                ((IntersectionEngine) heeVar.a.io()).checkProminence();
            }
        }
    }

    @Override // defpackage.nwj
    public final void h(RecyclerView recyclerView) {
        g(recyclerView, 1, -1);
    }

    @Override // defpackage.nwj
    public final void b() {
    }
}
