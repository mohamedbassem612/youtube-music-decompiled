package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.runtime.NodeTreeProcessorImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ovk extends qa {
    public int a;
    public int b;
    public View.OnLayoutChangeListener c;
    public RecyclerView d;
    public nh e;
    private final ovi f;
    private boolean g;
    private final Rect h;
    private final int[] i;
    private final List j;
    private final List k;
    private final oqj l;
    private qa m;

    public ovk(oqj oqjVar, ovi oviVar) {
        super((byte[]) null);
        this.a = -1;
        this.b = -1;
        this.g = false;
        this.h = new Rect();
        this.i = new int[2];
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.f = oviVar;
        this.l = oqjVar;
    }

    private static int v(int i, int i2) {
        if (i2 == 0) {
            return -1;
        }
        if (i < 0) {
            return 0;
        }
        return i >= i2 ? i2 - 1 : i;
    }

    private final void w() {
        if (this.g) {
            this.g = false;
            oqj oqjVar = this.l;
            if (oqjVar.f) {
                Set set = oqjVar.h;
                if (set.isEmpty()) {
                    return;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((zj) it.next()).b(oqjVar.e, false);
                }
                set.clear();
            }
        }
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        t();
        s(recyclerView);
    }

    public final void m() {
        if (this.a >= 0 && this.b >= 0) {
            oqj oqjVar = this.l;
            if (oqjVar.f) {
                Set set = oqjVar.h;
                Set set2 = oqjVar.g;
                set.addAll(set2);
                set2.clear();
            }
            this.g = true;
        }
        this.a = -1;
        this.b = -1;
    }

    public final void o() {
        m();
        w();
    }

    public final void p() {
        nh nhVar = this.e;
        if (nhVar != null) {
            nhVar.y(u());
            this.e = null;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            recyclerView.aE(this);
            View.OnLayoutChangeListener onLayoutChangeListener = this.c;
            if (onLayoutChangeListener != null) {
                this.d.removeOnLayoutChangeListener(onLayoutChangeListener);
            }
            this.d = null;
        }
    }

    public final void q(int i, int i2) {
        int i3;
        int i4 = this.a;
        if (i4 < 0 || (i3 = this.b) < 0 || i2 <= 0 || i > i3 || i + i2 <= i4) {
            return;
        }
        m();
    }

    public final void r() {
        RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x024b  */
    /* JADX WARN: Code duplicated, block: B:119:0x024e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0252  */
    /* JADX WARN: Code duplicated, block: B:123:0x025c  */
    /* JADX WARN: Code duplicated, block: B:125:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0275  */
    /* JADX WARN: Code duplicated, block: B:179:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v9, types: [ovs] */
    /* JADX WARN: Type inference failed for: r20v0, types: [boolean] */
    public final void s(RecyclerView recyclerView) {
        List list;
        List list2;
        int size;
        ovs ovsVar;
        NodeTreeProcessorImpl nodeTreeProcessorImpl;
        long j;
        int i;
        NodeTreeProcessorImpl[] nodeTreeProcessorImplArr;
        ?? r1;
        int i2;
        NodeTreeProcessorImpl nodeTreeProcessorImpl2;
        ?? r2;
        long[] jArr;
        ?? r14;
        ?? rect;
        ovs ovsVar2;
        Point point;
        int i3;
        List list3;
        int[] iArr;
        int i4;
        ovs ovsVar3;
        int i5 = 0;
        if (Memory.peekByte(FlagServices.b().c + 39) == 0) {
            for (int i6 = 0; i6 < recyclerView.getChildCount(); i6++) {
                View childAt = recyclerView.getChildAt(i6);
                if (childAt != null) {
                    if (childAt instanceof ooy) {
                        ((ooy) childAt).B();
                    } else {
                        int i7 = 0;
                        while (true) {
                            list = this.k;
                            if (i7 >= list.size()) {
                                break;
                            }
                            ((ooy) list.get(i7)).B();
                            i7++;
                        }
                        list.clear();
                    }
                }
            }
            return;
        }
        Rect rect2 = this.h;
        boolean globalVisibleRect = recyclerView.getGlobalVisibleRect(rect2);
        int[] iArr2 = this.i;
        recyclerView.getLocationInWindow(iArr2);
        if (!globalVisibleRect) {
            rect2.setEmpty();
        }
        List list4 = this.j;
        list4.clear();
        List list5 = this.k;
        list5.clear();
        for (int i8 = 0; i8 < recyclerView.getChildCount(); i8++) {
            View childAt2 = recyclerView.getChildAt(i8);
            if (childAt2 != null && (childAt2 instanceof ooy)) {
                list4.add((ooy) childAt2);
            }
        }
        int i9 = 0;
        while (true) {
            if (i9 < list4.size()) {
                opl oplVar = ((ooy) list4.get(i9)).b;
                if (oplVar != null) {
                    AutoCloseable autoCloseableC = oplVar.c();
                    if (Memory.peekByte(FlagServices.b().c + 19) == 0 || (size = list4.size()) == 0) {
                        break;
                    }
                    if (Memory.peekByte(FlagServices.b().c + 71) != 0) {
                        ovsVar3 = ((NodeTreeProcessorImpl) autoCloseableC).k;
                        if (!ovsVar3.f.compareAndSet(false, true)) {
                            ovsVar = ovsVar3;
                            ovsVar = null;
                        }
                    } else {
                        ovsVar = ovsVar3;
                        ovsVar = null;
                    }
                    if (ovsVar != null) {
                        try {
                            int length = ovsVar.a.length;
                            if (size > length) {
                                int iMax = Math.max(size, length << 1);
                                ovsVar.a = new NodeTreeProcessorImpl[iMax];
                                ovsVar.b = new long[iMax];
                                ovsVar.c = new int[iMax * 6];
                            }
                        } catch (Throwable th) {
                            th = th;
                            nodeTreeProcessorImpl = null;
                            j = 4611686018427387904L;
                            i = 0;
                            nodeTreeProcessorImplArr = null;
                            r1 = ovsVar;
                            if (nodeTreeProcessorImplArr != null) {
                                for (i2 = 0; i2 < i; i2++) {
                                    nodeTreeProcessorImpl2 = nodeTreeProcessorImplArr[i2];
                                    if (nodeTreeProcessorImpl2 != null) {
                                        if (nodeTreeProcessorImpl2.d.decrementAndGet() == j) {
                                            nodeTreeProcessorImpl2.a.z().execute(new ooz(nodeTreeProcessorImpl2, 14));
                                        }
                                        if (r1 != 0) {
                                            nodeTreeProcessorImplArr[i2] = nodeTreeProcessorImpl;
                                        }
                                    }
                                }
                            }
                            if (r1 != 0) {
                                r1.f.set(false);
                            }
                            throw th;
                        }
                    }
                    nodeTreeProcessorImplArr = ovsVar != null ? ovsVar.a : new NodeTreeProcessorImpl[size];
                    try {
                        if (ovsVar != null) {
                            jArr = ovsVar.b;
                            r14 = ovsVar;
                        } else {
                            jArr = new long[size];
                            r14 = 0;
                        }
                        try {
                            if (ovsVar != null) {
                                rect = ovsVar;
                                r14 = ovsVar.c;
                            } else {
                                rect = 0;
                                r14 = new int[size * 6];
                            }
                            try {
                                if (ovsVar != null) {
                                    ovsVar2 = ovsVar;
                                    rect = ovsVar.d;
                                } else {
                                    rect = new Rect();
                                    ovsVar2 = null;
                                }
                                nodeTreeProcessorImpl = null;
                                try {
                                    if (ovsVar != null) {
                                        point = ovsVar.e;
                                        ovsVar2 = ovsVar;
                                    } else {
                                        point = new Point();
                                        ovsVar2 = null;
                                    }
                                    i = 0;
                                    j = 4611686018427387904L;
                                    int i10 = 0;
                                    while (i10 < size) {
                                        try {
                                            ooy ooyVar = (ooy) list4.get(i10);
                                            if (ooyVar.isAttachedToWindow()) {
                                                NodeTreeProcessor nodeTreeProcessorH = ooyVar.h();
                                                i3 = i5;
                                                if (nodeTreeProcessorH instanceof NodeTreeProcessorImpl) {
                                                    AtomicLong atomicLong = ((NodeTreeProcessorImpl) nodeTreeProcessorH).d;
                                                    list3 = list4;
                                                    iArr = iArr2;
                                                    long j2 = atomicLong.get();
                                                    while (true) {
                                                        if ((j2 & 4611686018427387904L) == 0 && j2 > 0) {
                                                            i4 = size;
                                                            NodeTreeProcessor nodeTreeProcessor = nodeTreeProcessorH;
                                                            if (atomicLong.compareAndSet(j2, j2 + 1)) {
                                                                int i11 = i + 1;
                                                                try {
                                                                    nodeTreeProcessorImplArr[i] = (NodeTreeProcessorImpl) nodeTreeProcessor;
                                                                    jArr[i] = ((NodeTreeProcessorImpl) nodeTreeProcessor).c;
                                                                    if (i == 0) {
                                                                        oph ophVar = ((NodeTreeProcessorImpl) nodeTreeProcessor).b;
                                                                        i = i3;
                                                                    }
                                                                    int left = iArr[i3] + ooyVar.getLeft() + ((int) ooyVar.getTranslationX());
                                                                    int top = iArr[1] + ooyVar.getTop() + ((int) ooyVar.getTranslationY());
                                                                    rect.set(left, top, ooyVar.getWidth() + left, ooyVar.getHeight() + top);
                                                                    if (rect.intersect(rect2)) {
                                                                        point.set(left + ooyVar.getPaddingLeft(), top + ooyVar.getPaddingTop());
                                                                        rect.offset(-point.x, -point.y);
                                                                    } else {
                                                                        point.set(left + ooyVar.getPaddingLeft(), top + ooyVar.getPaddingTop());
                                                                        rect.setEmpty();
                                                                    }
                                                                    int i12 = i * 6;
                                                                    r14[i12] = ((Rect) rect).left;
                                                                    r14[i12 + 1] = ((Rect) rect).top;
                                                                    r14[i12 + 2] = ((Rect) rect).right;
                                                                    r14[i12 + 3] = ((Rect) rect).bottom;
                                                                    r14[i12 + 4] = point.x;
                                                                    r14[i12 + 5] = point.y;
                                                                    i = i11;
                                                                    break;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    i = i11;
                                                                    r1 = ovsVar2;
                                                                    if (nodeTreeProcessorImplArr != null) {
                                                                        while (i2 < i) {
                                                                            nodeTreeProcessorImpl2 = nodeTreeProcessorImplArr[i2];
                                                                            if (nodeTreeProcessorImpl2 != null) {
                                                                                if (nodeTreeProcessorImpl2.d.decrementAndGet() == j) {
                                                                                    nodeTreeProcessorImpl2.a.z().execute(new ooz(nodeTreeProcessorImpl2, 14));
                                                                                }
                                                                                if (r1 != 0) {
                                                                                    nodeTreeProcessorImplArr[i2] = nodeTreeProcessorImpl;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (r1 != 0) {
                                                                        r1.f.set(false);
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                            j2 = atomicLong.get();
                                                            size = i4;
                                                            nodeTreeProcessorH = nodeTreeProcessor;
                                                        }
                                                    }
                                                    i10++;
                                                    i5 = i3;
                                                    iArr2 = iArr;
                                                    list4 = list3;
                                                    size = i4;
                                                }
                                                i4 = size;
                                                i10++;
                                                i5 = i3;
                                                iArr2 = iArr;
                                                list4 = list3;
                                                size = i4;
                                            } else {
                                                i3 = i5;
                                            }
                                            list3 = list4;
                                            iArr = iArr2;
                                            i4 = size;
                                            i10++;
                                            i5 = i3;
                                            iArr2 = iArr;
                                            list4 = list3;
                                            size = i4;
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    }
                                    ?? r20 = i5;
                                    list2 = list4;
                                    if (i > 0) {
                                        NodeTreeProcessorImpl.jniSetVisibleBoundsBatch(jArr, r14, i, r20);
                                    }
                                    if (nodeTreeProcessorImplArr != null) {
                                        for (int i13 = 0; i13 < i; i13++) {
                                            NodeTreeProcessorImpl nodeTreeProcessorImpl3 = nodeTreeProcessorImplArr[i13];
                                            if (nodeTreeProcessorImpl3 != null) {
                                                if (nodeTreeProcessorImpl3.d.decrementAndGet() == 4611686018427387904L) {
                                                    nodeTreeProcessorImpl3.a.z().execute(new ooz(nodeTreeProcessorImpl3, 14));
                                                }
                                                if (ovsVar != null) {
                                                    nodeTreeProcessorImplArr[i13] = null;
                                                }
                                            }
                                        }
                                    }
                                    if (ovsVar != null) {
                                        ovsVar.f.set(false);
                                        i5 = 0;
                                        break;
                                    } else {
                                        i5 = 0;
                                        break;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    j = 4611686018427387904L;
                                    r2 = ovsVar2;
                                    i = 0;
                                    r1 = r2;
                                    if (nodeTreeProcessorImplArr != null) {
                                        while (i2 < i) {
                                            nodeTreeProcessorImpl2 = nodeTreeProcessorImplArr[i2];
                                            if (nodeTreeProcessorImpl2 != null) {
                                                if (nodeTreeProcessorImpl2.d.decrementAndGet() == j) {
                                                    nodeTreeProcessorImpl2.a.z().execute(new ooz(nodeTreeProcessorImpl2, 14));
                                                }
                                                if (r1 != 0) {
                                                    nodeTreeProcessorImplArr[i2] = nodeTreeProcessorImpl;
                                                }
                                            }
                                        }
                                    }
                                    if (r1 != 0) {
                                        r1.f.set(false);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                nodeTreeProcessorImpl = null;
                                j = 4611686018427387904L;
                                r2 = rect;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            nodeTreeProcessorImpl = null;
                            j = 4611686018427387904L;
                            r2 = r14;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        nodeTreeProcessorImpl = null;
                        j = 4611686018427387904L;
                        r2 = ovsVar;
                    }
                } else {
                    i9++;
                }
            }
            list2 = list4;
            break;
        }
        list2.clear();
        while (i5 < list5.size()) {
            ((ooy) list5.get(i5)).B();
            i5++;
        }
        list5.clear();
    }

    public final void t() {
        int iMin;
        int iMax;
        int iMax2;
        int i;
        int iMin2;
        np npVar = ((adgc) this.f).a;
        int itemCount = npVar.getItemCount();
        int i2 = itemCount - 1;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) npVar;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        this.a = Math.min(this.a, i2);
        int iMin3 = Math.min(this.b, i2);
        this.b = iMin3;
        int iV = iFindFirstVisibleItemPosition >= 0 ? v(iFindFirstVisibleItemPosition - 4, itemCount) : -1;
        int iV2 = iFindLastVisibleItemPosition >= 0 ? v(iFindLastVisibleItemPosition + 4, itemCount) : -1;
        int i3 = this.a;
        if (iV == i3 && iV2 == iMin3) {
            w();
            return;
        }
        if (i3 >= 0 && iMin3 >= 0) {
            if (i3 < iV && i3 <= (iMin2 = Math.min(iMin3, iV - 1))) {
                this.l.B(i3, iMin2);
            }
            if (this.b > iV2 && (iMax2 = Math.max(iV2 + 1, this.a)) <= (i = this.b)) {
                this.l.B(iMax2, i);
            }
        }
        if (iV >= 0 && iV2 >= 0) {
            int i4 = this.b;
            if (iV2 > i4 && (iMax = Math.max(i4 + 1, iV)) <= iV2) {
                this.l.A(iMax, iV2);
            }
            int i5 = this.a;
            if (iV < i5 && iV <= (iMin = Math.min(i5 - 1, iV2))) {
                this.l.A(iV, iMin);
            }
        }
        this.a = iV;
        this.b = iV2;
        w();
    }

    public final qa u() {
        qa qaVar = this.m;
        if (qaVar != null) {
            return qaVar;
        }
        ovj ovjVar = new ovj(this);
        this.m = ovjVar;
        return ovjVar;
    }
}
