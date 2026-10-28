package com.google.android.libraries.multiplatform.elements.runtime;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Size;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.multiplatform.elements.ElementsRetainedState;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import dalvik.annotation.optimization.FastNative;
import defpackage.afnl;
import defpackage.aga;
import defpackage.agp;
import defpackage.aslh;
import defpackage.atdg;
import defpackage.atdh;
import defpackage.ateu;
import defpackage.atgg;
import defpackage.atmk;
import defpackage.avw;
import defpackage.jup;
import defpackage.ksy;
import defpackage.mew;
import defpackage.mqt;
import defpackage.msh;
import defpackage.oor;
import defpackage.ooy;
import defpackage.ooz;
import defpackage.oph;
import defpackage.osd;
import defpackage.ovl;
import defpackage.ovp;
import defpackage.ovr;
import defpackage.ovs;
import defpackage.qd;
import defpackage.qpj;
import defpackage.vcj;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class NodeTreeProcessorImpl implements NodeTreeProcessor {
    public final ElementsServices a;
    public final oph b;
    public final long c;
    public final ElementsRuntimeImpl elementsRuntime;
    public final RuntimeSharedBuffer j;
    public final ovs k;
    public SparseArray m;
    public aga n;
    public aga o;
    private final osd p;
    public final AtomicLong d = new AtomicLong(1);
    public final AtomicLong e = new AtomicLong(0);
    public final AtomicLong f = new AtomicLong(-1);
    public final AtomicReference g = new AtomicReference();
    public final Object h = new Object();
    public final Object i = new Object();
    private final AtomicReference q = new AtomicReference();
    private final Rect r = new Rect();
    private final Point s = new Point();
    private final int[] t = new int[2];
    public final Object l = new Object();

    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, osd] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, osd] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, osd] */
    public NodeTreeProcessorImpl(ElementsRuntimeImpl elementsRuntimeImpl, ElementsServices elementsServices, oph ophVar) {
        int i;
        int i2;
        this.elementsRuntime = elementsRuntimeImpl;
        this.a = elementsServices;
        this.b = ophVar;
        DisplayMetrics displayMetricsE = elementsServices.e();
        ?? r5 = elementsServices.O().c;
        this.p = r5;
        float fA = elementsServices.a();
        Size sizeA = r5 != 0 ? r5.a() : null;
        if (sizeA == null) {
            fA = (fA <= 0.0f || Float.isNaN(fA) || Float.isInfinite(fA)) ? 1.0f : fA;
            if (displayMetricsE != null) {
                i2 = (int) ((displayMetricsE.widthPixels / fA) + 0.5f);
                i = (int) ((displayMetricsE.heightPixels / fA) + 0.5f);
            } else {
                i = 0;
                i2 = 0;
            }
            sizeA = new Size(i2, i);
        }
        avw avwVarB = r5 != 0 ? r5.b() : null;
        avwVarB = avwVarB == null ? avw.a : avwVarB;
        this.c = jniCreateNodeTreeProcessor(elementsServices.N().a, elementsRuntimeImpl.getHandle(), ophVar.e != null, ophVar.f, elementsServices.O().a - 1, sizeA.getWidth(), sizeA.getHeight(), avwVarB.b, avwVarB.c, avwVarB.d, avwVarB.e, elementsServices.O().b, elementsServices.O().c.e() - 1, elementsServices.O().c.d(), ophVar.g, false);
        if (r5 != 0) {
            r5.f(this);
        }
        this.j = elementsRuntimeImpl.j;
        this.k = elementsRuntimeImpl.k;
    }

    public static long H(int i, int i2, boolean z) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        return z ? j ^ 536870912 : j;
    }

    static List I(aga agaVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (agaVar != null) {
            afnl afnlVar = new afnl(z, arrayList, 1);
            Object[] objArr = agaVar.c;
            long[] jArr = agaVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = ~jArr[i];
                    long j2 = -9187201950435737472L;
                    while (true) {
                        j &= j2;
                        if (j == 0) {
                            break;
                        }
                        afnlVar.invoke(objArr[(i << 3) + (Long.numberOfTrailingZeros(j) >>> 3)]);
                        j2 = (-1) + j;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return arrayList;
    }

    public static boolean N(int i, int i2) {
        return U(i) || U(i2);
    }

    private final long T(int i, int i2, boolean z) {
        if (Memory.peekByte(FlagServices.b().c + 77) == 0) {
            return this.e.incrementAndGet();
        }
        if (!N(i, i2)) {
            this.f.set(-1L);
            return this.e.get();
        }
        AtomicLong atomicLong = this.e;
        AtomicLong atomicLong2 = this.f;
        long jH = H(i, i2, z);
        long jIncrementAndGet = atomicLong.incrementAndGet();
        atomicLong2.set(jH);
        return jIncrementAndGet;
    }

    private static boolean U(int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode != 0) {
            return View.MeasureSpec.getSize(i) != 0 && (mode == 1073741824 || mode == Integer.MIN_VALUE);
        }
        return true;
    }

    public static native boolean jniAnimationTick(long j, long j2);

    private static native String jniBuildElementKeyPath(long j, int i);

    private static native int jniCalculateNodeId(long j, int i);

    private static native void jniClearElement(long j);

    private static native long jniCreateNodeTreeProcessor(long j, long j2, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z2, int i9, boolean z3, boolean z4, boolean z5);

    public static native void jniDeleteNodeTreeProcessor(long j, long j2);

    private static native void jniDetachedFromWindow(long j);

    private static native int jniFindContinuityElement(long j, int i, String str);

    private static native long jniGetAppliedSnapshot(long j);

    private static native String jniGetContinuityKey(long j, int i);

    static native long[] jniGetCrashMetadata();

    private static native String jniGetElementKey(long j, int i);

    private static native long jniGetElementsRetainedStateIfNew(long j);

    private static native int[] jniGetGlobalNodeBounds(long j, int i);

    @FastNative
    private static native long jniGetGlobalNodeBounds2(long j, int i);

    private static native int[] jniGetGlobalNodeVisibleRectAndBounds(long j, int i);

    @FastNative
    private static native long jniGetGlobalNodeVisibleRectAndBounds2(long j, int i);

    private static native long jniGetInstanceCount();

    private static native long[] jniGetLayoutSenderState(long j, int i);

    @FastNative
    private static native long jniGetLayoutSenderState2(long j, int i);

    private static native int[] jniGetNodeBounds(long j, int i);

    @FastNative
    private static native long jniGetNodeBounds2(long j, int i);

    private static native int[] jniGetNodeVisibleRectAndBounds(long j, int i);

    @FastNative
    private static native long jniGetNodeVisibleRectAndBounds2(long j, int i);

    public static native String jniGetRichDiagnostics();

    private static native int jniGetRootNodeKey(long j);

    private static native long[] jniGetSenderState(long j, int i, int i2, float f, float f2);

    @FastNative
    private static native long jniGetSenderState2(long j, int i, int i2, float f, float f2);

    public static native long jniGetSnapshot(long j);

    private static native boolean jniHandleAction(long j, int i, int i2);

    private static native int jniHandleTouchEvent(long j, int i, float f, float f2, long j2);

    public static native boolean jniHasNewSnapshot(long j);

    private static native long jniLatestSnapshotVersion(long j);

    private static native void jniLogGestureEvent(long j, int i, int i2);

    private static native int jniOnTouchHitTest(long j, float f, float f2);

    private static native long jniOnTouchHitTestNearestAncestorView(long j, float f, float f2);

    private static native boolean jniReadLayoutSize(long j, long j2);

    @FastNative
    private static native boolean jniReadLayoutSizeFastNative(long j, long j2);

    public static native boolean jniReadLayoutSizeWithSpec(long j, long j2, int i, int i2, boolean z);

    @FastNative
    public static native boolean jniReadLayoutSizeWithSpecFastNative(long j, long j2, int i, int i2, boolean z);

    private static native void jniRegenerate(long j);

    private static native void jniRelayout(long j, int i);

    public static native void jniSetColorContrastMode(long j, int i);

    private static native void jniSetContentOffset(long j, int i, int i2, int i3);

    public static native void jniSetDimensions(long j, int i, int i2, boolean z);

    public static native void jniSetElement(long j, long j2, long j3, long j4);

    public static native void jniSetElement(long j, byte[] bArr, long j2);

    private static native void jniSetElementAndDimensions(long j, long j2, long j3, long j4, int i, int i2, boolean z);

    public static native void jniSetElementAndDimensions(long j, byte[] bArr, long j2, int i, int i2, boolean z);

    private static native void jniSetElementAndDimensionsProtoPtr(long j, long j2, long j3, int i, int i2, boolean z);

    private static native void jniSetElementProtoPtr(long j, long j2, long j3);

    private static native void jniSetFoldingDisplayInfo(long j, boolean z, int i, int i2, boolean z2, float f, float f2, float f3, float f4);

    public static native void jniSetIsScreenReaderActive(long j, boolean z);

    private static native boolean jniSetNodeVisible(long j, int i, boolean z);

    private static native void jniSetVisibleBounds(long j, int i, int i2, int i3, int i4, int i5, int i6, boolean z);

    @FastNative
    public static native void jniSetVisibleBoundsBatch(long[] jArr, int[] iArr, int i, boolean z);

    public static native void jniSetWindowInsets(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    private static native int[] jniWaitForPrepare(long j, int i, int i2, boolean z);

    private static native void jniWaitForPrepare2(long j, int i, int i2, boolean z, int[] iArr);

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final void A(Rect rect, Point point) {
        long jDecrementAndGet;
        AtomicLong atomicLong = this.d;
        long j = atomicLong.get();
        while (true) {
            if ((j & 4611686018427387904L) != 0 || j <= 0) {
                return;
            }
            if (atomicLong.compareAndSet(j, 1 + j)) {
                int i = 14;
                try {
                    jniSetVisibleBounds(this.c, rect.left, rect.top, rect.right, rect.bottom, point.x, point.y, false);
                    if (jDecrementAndGet == j) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (this.d.decrementAndGet() == 4611686018427387904L) {
                        this.a.z().execute(new ooz(this, i));
                    }
                }
            }
            j = atomicLong.get();
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final boolean B(int i, int i2) {
        AtomicLong atomicLong = this.d;
        long j = atomicLong.get();
        while (true) {
            if ((j & 4611686018427387904L) != 0 || j <= 0) {
                break;
            }
            if (atomicLong.compareAndSet(j, 1 + j)) {
                int i3 = 14;
                try {
                    boolean zJniHandleAction = jniHandleAction(this.c, i, i2);
                } finally {
                    if (this.d.decrementAndGet() == 4611686018427387904L) {
                        this.a.z().execute(new ooz(this, i3));
                    }
                }
            }
            j = atomicLong.get();
        }
        return false;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final boolean C() {
        ovl ovlVar = (ovl) this.q.get();
        return (ovlVar == null || ovlVar.b()) ? false : true;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final void D(int i, int i2) {
        long jDecrementAndGet;
        AtomicLong atomicLong = this.d;
        long j = atomicLong.get();
        while (true) {
            if ((j & 4611686018427387904L) != 0 || j <= 0) {
                return;
            }
            if (atomicLong.compareAndSet(j, 1 + j)) {
                int i3 = 14;
                try {
                    jniLogGestureEvent(this.c, i, i2 - 1);
                    if (jDecrementAndGet == j) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (this.d.decrementAndGet() == 4611686018427387904L) {
                        this.a.z().execute(new ooz(this, i3));
                    }
                }
            }
            j = atomicLong.get();
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final void E(atgg atggVar, int i, int i2, ElementsRetainedState elementsRetainedState) {
        boolean zM = M();
        this.a.z().execute(new ovr(this, atggVar, i, i2, elementsRetainedState, T(i, i2, zM), zM, 0));
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final void F(atgg atggVar, int i, int i2, ElementsRetainedState elementsRetainedState) {
        boolean zM = M();
        R(atggVar, i, i2, elementsRetainedState, T(i, i2, zM), zM);
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final mew G(int i, int i2, float f, float f2) {
        AtomicLong atomicLong = this.d;
        long j = atomicLong.get();
        while (true) {
            mew mewVar = null;
            if ((j & 4611686018427387904L) != 0 || j <= 0) {
                return null;
            }
            if (atomicLong.compareAndSet(j, 1 + j)) {
                int i3 = 14;
                try {
                    byte bPeekByte = Memory.peekByte(FlagServices.b().c + 80);
                    long j2 = this.c;
                    if (bPeekByte != 0) {
                        long jJniGetSenderState2 = jniGetSenderState2(j2, i, i2, f, f2);
                        if (jJniGetSenderState2 != 0) {
                            mewVar = new mew(ksy.aB(Memory.peekLong(8 + jJniGetSenderState2, false), atmk.a, Memory.peekLong(jJniGetSenderState2, false)), (char[][]) null);
                        }
                    } else {
                        long[] jArrJniGetSenderState = jniGetSenderState(j2, i, i2, f, f2);
                        if (jArrJniGetSenderState != null) {
                            mew mewVar2 = new mew(ksy.aB(jArrJniGetSenderState[1], atmk.a, jArrJniGetSenderState[0]), (char[][]) null);
                            if (this.d.decrementAndGet() == 4611686018427387904L) {
                                this.a.z().execute(new ooz(this, i3));
                            }
                            return mewVar2;
                        }
                    }
                    if (atomicLong.decrementAndGet() != 4611686018427387904L) {
                        return mewVar;
                    }
                    this.a.z().execute(new ooz(this, i3));
                    return mewVar;
                } catch (Throwable th) {
                    if (this.d.decrementAndGet() == 4611686018427387904L) {
                        this.a.z().execute(new ooz(this, i3));
                    }
                    throw th;
                }
            }
            j = atomicLong.get();
        }
    }

    public final void J(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PaintUnit paintUnit = (PaintUnit) it.next();
            x(paintUnit);
            try {
                paintUnit.close();
            } catch (IOException e) {
                ElementsServices elementsServices = this.a;
                elementsServices.n().c(aslh.LOG_TYPE_INTERNAL_ERROR, str.concat(" paintUnit threw IOException"), e);
            }
        }
    }

    public final void K(long j) {
        if (Memory.peekByte(FlagServices.b().c + 77) == 0 || this.e.get() == j) {
            return;
        }
        this.f.set(-1L);
    }

    public final void L(ElementsRetainedState elementsRetainedState) {
        if (elementsRetainedState != null) {
            long jJniGetElementsRetainedStateIfNew = jniGetElementsRetainedStateIfNew(this.c);
            if (jJniGetElementsRetainedStateIfNew != 0) {
                AtomicBoolean atomicBoolean = elementsRetainedState.b;
                if (atomicBoolean.get()) {
                    if (jJniGetElementsRetainedStateIfNew != 0) {
                        ElementsRetainedState.jniDisposeElementsRetainedState(jJniGetElementsRetainedStateIfNew);
                        return;
                    }
                    return;
                }
                AtomicLong atomicLong = elementsRetainedState.a;
                long andSet = atomicLong.getAndSet(jJniGetElementsRetainedStateIfNew);
                if (atomicBoolean.get()) {
                    long andSet2 = atomicLong.getAndSet(0L);
                    if (andSet2 != 0) {
                        ElementsRetainedState.jniDisposeElementsRetainedState(andSet2);
                    }
                }
                if (andSet != 0) {
                    ElementsRetainedState.jniDisposeElementsRetainedState(andSet);
                }
            }
        }
    }

    public final boolean M() {
        int i = this.b.i;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 0) {
            throw new RuntimeException(null, null);
        }
        osd osdVar = this.p;
        osdVar.getClass();
        return osdVar.c();
    }

    public final boolean O(int i, int i2, long j) {
        if (j < this.e.get()) {
            return false;
        }
        return N(i, i2);
    }

    public final void P(aga agaVar) {
        ArrayList arrayList;
        synchronized (this.h) {
            aga agaVar2 = this.n;
            arrayList = null;
            if (agaVar2 == null) {
                this.n = agaVar;
            } else if (agaVar != null) {
                if (Memory.peekByte(FlagServices.b().c + 103) != 0) {
                    arrayList = new ArrayList();
                    agaVar.b(new vcj(agaVar2, arrayList, 1));
                }
                agaVar2.g(agaVar);
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        qpj.e(new msh(this, arrayList, 18));
    }

    public final void Q(aga agaVar) {
        synchronized (this.i) {
            aga agaVar2 = this.o;
            if (agaVar2 == null) {
                this.o = agaVar;
            } else if (agaVar != null) {
                agaVar2.g(agaVar);
            }
        }
    }

    public final void R(atgg atggVar, int i, int i2, ElementsRetainedState elementsRetainedState, long j, boolean z) {
        long j2;
        AtomicLong atomicLong = this.d;
        long j3 = atomicLong.get();
        while (true) {
            if ((j3 & 4611686018427387904L) != 0 || j3 <= 0) {
                return;
            }
            if (atomicLong.compareAndSet(j3, 1 + j3)) {
                int i3 = 14;
                try {
                    ElementsRetainedState elementsRetainedState2 = (ElementsRetainedState) this.g.getAndSet(elementsRetainedState);
                    if (elementsRetainedState2 != elementsRetainedState) {
                        L(elementsRetainedState2);
                    }
                    atggVar.bJ();
                    boolean zO = O(i, i2, j);
                    long j4 = this.c;
                    if (zO) {
                        UpbMessage upbMessage = atggVar.b;
                        j2 = 4611686018427387904L;
                        try {
                            jniSetElementAndDimensions(j4, upbMessage.a, upbMessage.c.a, elementsRetainedState != null ? elementsRetainedState.a() : 0L, i, i2, z);
                            K(j);
                        } catch (Throwable th) {
                            th = th;
                            try {
                                this.a.n().c(aslh.LOG_TYPE_INTERNAL_ERROR, jniGetRichDiagnostics(), th);
                                RenderNextCrashReporter.interceptFatalCrash(th);
                                throw th;
                            } catch (Throwable th2) {
                                if (this.d.decrementAndGet() == j2) {
                                    this.a.z().execute(new ooz(this, i3));
                                }
                                throw th2;
                            }
                        }
                    } else {
                        UpbMessage upbMessage2 = atggVar.b;
                        jniSetElement(j4, upbMessage2.a, upbMessage2.c.a, elementsRetainedState != null ? elementsRetainedState.a() : 0L);
                        j2 = 4611686018427387904L;
                    }
                    if (this.d.decrementAndGet() == j2) {
                        this.a.z().execute(new ooz(this, i3));
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    j2 = 4611686018427387904L;
                }
            } else {
                j3 = atomicLong.get();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006d A[Catch: all -> 0x00e9, TryCatch #0 {all -> 0x00e9, blocks: (B:45:0x00c5, B:21:0x003f, B:26:0x005d, B:28:0x0061, B:32:0x007c, B:34:0x0080, B:38:0x009c, B:40:0x00a0, B:44:0x00b1, B:37:0x008d, B:31:0x006d, B:25:0x004e), top: B:59:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008d A[Catch: all -> 0x00e9, TryCatch #0 {all -> 0x00e9, blocks: (B:45:0x00c5, B:21:0x003f, B:26:0x005d, B:28:0x0061, B:32:0x007c, B:34:0x0080, B:38:0x009c, B:40:0x00a0, B:44:0x00b1, B:37:0x008d, B:31:0x006d, B:25:0x004e), top: B:59:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0 A[Catch: all -> 0x00e9, TryCatch #0 {all -> 0x00e9, blocks: (B:45:0x00c5, B:21:0x003f, B:26:0x005d, B:28:0x0061, B:32:0x007c, B:34:0x0080, B:38:0x009c, B:40:0x00a0, B:44:0x00b1, B:37:0x008d, B:31:0x006d, B:25:0x004e), top: B:59:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:58:0x010d A[ORIG_RETURN, RETURN] */
    public final void S(boolean z, int i, int i2, ateu ateuVar) throws Throwable {
        long j;
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        float fIntBitsToFloat3;
        float f;
        float f2;
        float f3;
        float fIntBitsToFloat4;
        float f4;
        AtomicLong atomicLong = this.d;
        for (long j2 = atomicLong.get(); (j2 & 4611686018427387904L) == 0 && j2 > 0; j2 = atomicLong.get()) {
            if (atomicLong.compareAndSet(j2, 1 + j2)) {
                boolean z2 = ateuVar != null;
                int i3 = 14;
                if (ateuVar != null) {
                    try {
                        if (ateuVar.m == null) {
                            j = 4611686018427387904L;
                            try {
                                if ((Memory.peekByte(ateuVar.c + 8) & 16) == 0) {
                                    fIntBitsToFloat = 0.0f;
                                }
                                if (ateuVar.i == null || (Memory.peekByte(ateuVar.c + 8) & 1) != 0) {
                                    fIntBitsToFloat2 = Float.intBitsToFloat(Memory.peekInt(ateuVar.aY().c + 12, false));
                                } else {
                                    fIntBitsToFloat2 = 0.0f;
                                }
                                if (ateuVar.n == null || (Memory.peekByte(ateuVar.c + 8) & 32) != 0) {
                                    fIntBitsToFloat3 = Float.intBitsToFloat(Memory.peekInt(ateuVar.aW().c + 12, false));
                                } else {
                                    fIntBitsToFloat3 = 0.0f;
                                }
                                if (ateuVar.k == null) {
                                    f = fIntBitsToFloat3;
                                    if ((Memory.peekByte(ateuVar.c + 8) & 4) == 0) {
                                        f2 = fIntBitsToFloat2;
                                        f3 = fIntBitsToFloat;
                                        f4 = f;
                                    }
                                    jniSetFoldingDisplayInfo(this.c, z, i - 1, i2 - 1, z2, f3, f2, f4, fIntBitsToFloat4);
                                    if (this.d.decrementAndGet() == j) {
                                        this.a.z().execute(new ooz(this, i3));
                                        return;
                                    }
                                    return;
                                }
                                f = fIntBitsToFloat3;
                                f2 = fIntBitsToFloat2;
                                f3 = fIntBitsToFloat;
                                fIntBitsToFloat4 = Float.intBitsToFloat(Memory.peekInt(ateuVar.aV().c + 12, false));
                                f4 = f;
                                jniSetFoldingDisplayInfo(this.c, z, i - 1, i2 - 1, z2, f3, f2, f4, fIntBitsToFloat4);
                                if (this.d.decrementAndGet() == j) {
                                    this.a.z().execute(new ooz(this, i3));
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                th = th;
                                if (this.d.decrementAndGet() == j) {
                                    this.a.z().execute(new ooz(this, i3));
                                }
                                throw th;
                            }
                        }
                        j = 4611686018427387904L;
                        fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(ateuVar.aX().c + 12, false));
                        if (ateuVar.i == null) {
                            fIntBitsToFloat2 = Float.intBitsToFloat(Memory.peekInt(ateuVar.aY().c + 12, false));
                        } else {
                            fIntBitsToFloat2 = Float.intBitsToFloat(Memory.peekInt(ateuVar.aY().c + 12, false));
                        }
                        if (ateuVar.n == null) {
                            fIntBitsToFloat3 = Float.intBitsToFloat(Memory.peekInt(ateuVar.aW().c + 12, false));
                        } else {
                            fIntBitsToFloat3 = Float.intBitsToFloat(Memory.peekInt(ateuVar.aW().c + 12, false));
                        }
                        if (ateuVar.k == null) {
                            f = fIntBitsToFloat3;
                            if ((Memory.peekByte(ateuVar.c + 8) & 4) == 0) {
                                f2 = fIntBitsToFloat2;
                                f3 = fIntBitsToFloat;
                                f4 = f;
                            }
                            jniSetFoldingDisplayInfo(this.c, z, i - 1, i2 - 1, z2, f3, f2, f4, fIntBitsToFloat4);
                            if (this.d.decrementAndGet() == j) {
                                this.a.z().execute(new ooz(this, i3));
                                return;
                            }
                            return;
                        }
                        f = fIntBitsToFloat3;
                        f2 = fIntBitsToFloat2;
                        f3 = fIntBitsToFloat;
                        fIntBitsToFloat4 = Float.intBitsToFloat(Memory.peekInt(ateuVar.aV().c + 12, false));
                        f4 = f;
                        jniSetFoldingDisplayInfo(this.c, z, i - 1, i2 - 1, z2, f3, f2, f4, fIntBitsToFloat4);
                        if (this.d.decrementAndGet() == j) {
                            this.a.z().execute(new ooz(this, i3));
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        j = 4611686018427387904L;
                        if (this.d.decrementAndGet() == j) {
                            this.a.z().execute(new ooz(this, i3));
                        }
                        throw th;
                    }
                }
                j = 4611686018427387904L;
                f3 = 0.0f;
                f2 = 0.0f;
                f4 = 0.0f;
                fIntBitsToFloat4 = 0.0f;
                jniSetFoldingDisplayInfo(this.c, z, i - 1, i2 - 1, z2, f3, f2, f4, fIntBitsToFloat4);
                if (this.d.decrementAndGet() == j) {
                    this.a.z().execute(new ooz(this, i3));
                    return;
                }
                return;
            }
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final int a(int i) {
        long jDecrementAndGet;
        if (i != -1) {
            long j = this.c;
            if (j != 0) {
                AtomicLong atomicLong = this.d;
                long j2 = atomicLong.get();
                while (true) {
                    if ((j2 & 4611686018427387904L) != 0 || j2 <= 0) {
                        break;
                    }
                    if (atomicLong.compareAndSet(j2, 1 + j2)) {
                        int i2 = 14;
                        try {
                            i = jniCalculateNodeId(j, i);
                            if (jDecrementAndGet != j) {
                                break;
                            }
                            break;
                        } finally {
                            if (this.d.decrementAndGet() == 4611686018427387904L) {
                                this.a.z().execute(new ooz(this, i2));
                            }
                        }
                    }
                    j2 = atomicLong.get();
                }
            }
        }
        return i;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final int b() {
        AtomicLong atomicLong = this.d;
        long j = atomicLong.get();
        while (true) {
            if ((j & 4611686018427387904L) != 0 || j <= 0) {
                break;
            }
            if (atomicLong.compareAndSet(j, 1 + j)) {
                int i = 14;
                try {
                    int iJniGetRootNodeKey = jniGetRootNodeKey(this.c);
                } finally {
                    if (this.d.decrementAndGet() == 4611686018427387904L) {
                        this.a.z().execute(new ooz(this, i));
                    }
                }
            }
            j = atomicLong.get();
        }
        return -1;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final int c(int i, float f, float f2, long j) {
        AtomicLong atomicLong = this.d;
        long j2 = atomicLong.get();
        while (true) {
            if ((j2 & 4611686018427387904L) != 0 || j2 <= 0) {
                break;
            }
            if (atomicLong.compareAndSet(j2, 1 + j2)) {
                int i2 = 14;
                try {
                    int iJniHandleTouchEvent = jniHandleTouchEvent(this.c, i, f, f2, j);
                } finally {
                    if (this.d.decrementAndGet() == 4611686018427387904L) {
                        this.a.z().execute(new ooz(this, i2));
                    }
                }
            }
            j2 = atomicLong.get();
        }
        return -1;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        AtomicLong atomicLong;
        long j;
        aga agaVar;
        aga agaVar2;
        do {
            atomicLong = this.d;
            j = atomicLong.get();
            if ((j & 4611686018427387904L) != 0) {
                return;
            }
        } while (!atomicLong.compareAndSet(j, j | 4611686018427387904L));
        osd osdVar = this.p;
        if (osdVar != null) {
            osdVar.g(this);
        }
        ovl ovlVar = (ovl) this.q.getAndSet(null);
        if (ovlVar != null) {
            try {
                ovlVar.close();
            } catch (IOException e) {
                this.a.n().c(aslh.LOG_TYPE_INTERNAL_ERROR, "Failed to close paint unit closeables", e);
            }
        }
        if (Memory.peekByte(FlagServices.b().c + 103) != 0) {
            synchronized (this.h) {
                agaVar2 = this.n;
                this.n = null;
            }
            J(I(agaVar2, false), "NodeTreeProcessorImpl.close()");
        }
        synchronized (this.l) {
            this.m = null;
        }
        ElementsRuntimeImpl elementsRuntimeImpl = this.elementsRuntime;
        long j2 = this.c;
        if (Memory.peekByte(FlagServices.b().c + 103) != 0) {
            if (qpj.g()) {
                elementsRuntimeImpl.g(j2);
            } else {
                qpj.e(new jup(elementsRuntimeImpl, j2, 9));
            }
        }
        agp agpVar = elementsRuntimeImpl.e;
        synchronized (agpVar) {
            agpVar.e(j2);
        }
        agp agpVar2 = elementsRuntimeImpl.h;
        synchronized (agpVar2) {
            agpVar2.e(j2);
        }
        if (Memory.peekByte(FlagServices.b().c + 65) != 0) {
            agp agpVar3 = elementsRuntimeImpl.f;
            synchronized (agpVar3) {
                agaVar = (aga) agpVar3.e(j2);
            }
            agp agpVar4 = elementsRuntimeImpl.g;
            synchronized (agpVar4) {
                agpVar4.e(j2);
            }
            elementsRuntimeImpl.h(agaVar);
        }
        L((ElementsRetainedState) this.g.getAndSet(null));
        if (this.d.decrementAndGet() == 4611686018427387904L) {
            this.a.z().execute(new ooz(this, 14));
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final int d(float f, float f2) {
        AtomicLong atomicLong = this.d;
        long j = atomicLong.get();
        while (true) {
            if ((j & 4611686018427387904L) != 0 || j <= 0) {
                break;
            }
            if (atomicLong.compareAndSet(j, 1 + j)) {
                int i = 14;
                try {
                    int iJniOnTouchHitTest = jniOnTouchHitTest(this.c, f, f2);
                } finally {
                    if (this.d.decrementAndGet() == 4611686018427387904L) {
                        this.a.z().execute(new ooz(this, i));
                    }
                }
            }
            j = atomicLong.get();
        }
        return -1;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final long e(float f, float f2) {
        AtomicLong atomicLong = this.d;
        long j = atomicLong.get();
        while (true) {
            if ((j & 4611686018427387904L) != 0 || j <= 0) {
                break;
            }
            if (atomicLong.compareAndSet(j, 1 + j)) {
                int i = 14;
                try {
                    long jJniOnTouchHitTestNearestAncestorView = jniOnTouchHitTestNearestAncestorView(this.c, f, f2);
                } finally {
                    if (this.d.decrementAndGet() == 4611686018427387904L) {
                        this.a.z().execute(new ooz(this, i));
                    }
                }
            }
            j = atomicLong.get();
        }
        return -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicLong] */
    /* JADX WARN: Type inference failed for: r1v1, types: [long] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v5, types: [long] */
    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final Rect f(int i) {
        ?? r1;
        Rect rect;
        ?? r0 = this.d;
        ?? r2 = r0.get();
        while ((r2 & 4611686018427387904L) == 0 && r2 > 0) {
            if (r0.compareAndSet(r2, 1 + r2)) {
                r1 = 14;
                r1 = 14;
                r1 = 14;
                r2 = 14;
                r2 = 14;
                r1 = 14;
                try {
                    byte bPeekByte = Memory.peekByte(FlagServices.b().c + 79);
                    long j = this.c;
                    if (bPeekByte != 0) {
                        long jJniGetNodeBounds2 = jniGetNodeBounds2(j, i);
                        if (jJniGetNodeBounds2 == 0) {
                            if (r0.decrementAndGet() != 4611686018427387904L) {
                                break;
                            }
                            this.a.z().execute(new ooz(this, r1));
                            break;
                        }
                        rect = new Rect(Memory.peekInt(jJniGetNodeBounds2, false), Memory.peekInt(4 + jJniGetNodeBounds2, false), Memory.peekInt(8 + jJniGetNodeBounds2, false), Memory.peekInt(jJniGetNodeBounds2 + 12, false));
                        if (r0.decrementAndGet() == 4611686018427387904L) {
                            this.a.z().execute(new ooz(this, r1));
                        }
                    } else {
                        int[] iArrJniGetNodeBounds = jniGetNodeBounds(j, i);
                        Rect rect2 = new Rect(iArrJniGetNodeBounds[0], iArrJniGetNodeBounds[1], iArrJniGetNodeBounds[2], iArrJniGetNodeBounds[3]);
                        if (this.d.decrementAndGet() == 4611686018427387904L) {
                            this.a.z().execute(new ooz(this, r1));
                        }
                        rect = rect2;
                    }
                    return rect;
                } catch (Throwable th) {
                    if (this.d.decrementAndGet() == 4611686018427387904L) {
                        this.a.z().execute(new ooz(this, r1));
                    }
                    throw th;
                }
            }
            r2 = r0.get();
        }
        rect = new Rect();
        r1 = r2;
        return rect;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final Size g() {
        AtomicLong atomicLong = this.d;
        for (long j = atomicLong.get(); (j & 4611686018427387904L) == 0 && j > 0; j = atomicLong.get()) {
            if (atomicLong.compareAndSet(j, 1 + j)) {
                int i = 14;
                try {
                    byte bPeekByte = Memory.peekByte(FlagServices.b().c + 23);
                    long j2 = this.c;
                    if (!(bPeekByte != 0 ? jniReadLayoutSizeFastNative(j2, this.elementsRuntime.getHandle()) : jniReadLayoutSize(j2, this.elementsRuntime.getHandle()))) {
                        if (atomicLong.decrementAndGet() != 4611686018427387904L) {
                            break;
                        }
                        this.a.z().execute(new ooz(this, i));
                        break;
                    }
                    RuntimeSharedBuffer runtimeSharedBuffer = this.j;
                    Size size = new Size(runtimeSharedBuffer.b(), runtimeSharedBuffer.a());
                    if (this.d.decrementAndGet() != 4611686018427387904L) {
                        return size;
                    }
                    this.a.z().execute(new ooz(this, i));
                    return size;
                } catch (Throwable th) {
                    if (this.d.decrementAndGet() == 4611686018427387904L) {
                        this.a.z().execute(new ooz(this, i));
                    }
                    throw th;
                }
            }
        }
        return null;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final Size h(int i, int i2) {
        Size size;
        boolean zM = M();
        if (Memory.peekByte(FlagServices.b().c + 77) != 0) {
            if (N(i, i2)) {
                long jH = H(i, i2, zM);
                if (this.f.getAndSet(jH) != jH) {
                    this.e.incrementAndGet();
                }
            } else {
                this.f.set(-1L);
            }
        }
        AtomicLong atomicLong = this.d;
        for (long j = atomicLong.get(); (j & 4611686018427387904L) == 0 && j > 0; j = atomicLong.get()) {
            if (atomicLong.compareAndSet(j, 1 + j)) {
                int i3 = 14;
                try {
                    byte bPeekByte = Memory.peekByte(FlagServices.b().c + 67);
                    long j2 = this.c;
                    if (bPeekByte != 0) {
                        int[] iArr = this.t;
                        jniWaitForPrepare2(j2, i, i2, zM, iArr);
                        size = new Size(iArr[0], iArr[1]);
                        if (atomicLong.decrementAndGet() == 4611686018427387904L) {
                            this.a.z().execute(new ooz(this, i3));
                        }
                    } else {
                        int[] iArrJniWaitForPrepare = jniWaitForPrepare(j2, i, i2, zM);
                        Size size2 = new Size(iArrJniWaitForPrepare[0], iArrJniWaitForPrepare[1]);
                        if (this.d.decrementAndGet() == 4611686018427387904L) {
                            this.a.z().execute(new ooz(this, i3));
                        }
                        size = size2;
                    }
                    return size;
                } catch (Throwable th) {
                    if (this.d.decrementAndGet() != 4611686018427387904L) {
                        throw th;
                    }
                    this.a.z().execute(new ooz(this, i3));
                    throw th;
                }
            }
        }
        return new Size(0, 0);
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final SparseArray i() {
        SparseArray sparseArray;
        if (Memory.peekByte(FlagServices.b().c + 76) == 0) {
            return null;
        }
        synchronized (this.l) {
            sparseArray = this.m;
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                this.m = sparseArray;
            }
        }
        return sparseArray;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final mqt j(NodeViewInterface nodeViewInterface) {
        boolean z;
        String strP;
        ElementsRetainedState elementsRetainedState = (ElementsRetainedState) this.g.get();
        mqt mqtVar = null;
        if (elementsRetainedState != null && !elementsRetainedState.b.get()) {
            synchronized (elementsRetainedState.c) {
                Map map = elementsRetainedState.d;
                z = true;
                if (map != null && !map.isEmpty()) {
                    z = false;
                }
            }
            if (!z && (strP = nodeViewInterface.p(this)) != null && !elementsRetainedState.b.get()) {
                synchronized (elementsRetainedState.c) {
                    Map map2 = elementsRetainedState.d;
                    mqtVar = map2 != null ? (mqt) map2.remove(strP) : null;
                }
            }
        }
        return mqtVar;
    }

    public native int[] jniApply(long j, long j2, Object obj, float f, float f2, int i, int i2);

    public native boolean jniApply2(long j, long j2, long j3, Object obj, float f, float f2, int i, int i2);

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final ElementsServices k() {
        return this.a;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final oph l() {
        return this.b;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final atdg m(int i) {
        atdg atdgVar;
        ExecutorService executorServiceZ;
        ooz oozVar;
        AtomicLong atomicLong = this.d;
        long j = atomicLong.get();
        while (true) {
            atdgVar = null;
            if ((j & 4611686018427387904L) != 0 || j <= 0) {
                break;
            }
            if (atomicLong.compareAndSet(j, 1 + j)) {
                int i2 = 14;
                try {
                    byte bPeekByte = Memory.peekByte(FlagServices.b().c + 80);
                    long j2 = this.c;
                    if (bPeekByte == 0) {
                        long[] jArrJniGetLayoutSenderState = jniGetLayoutSenderState(j2, i);
                        if (jArrJniGetLayoutSenderState != null) {
                            atdgVar = new atdg(ksy.aB(jArrJniGetLayoutSenderState[1], atdh.a, jArrJniGetLayoutSenderState[0]));
                            if (this.d.decrementAndGet() != 4611686018427387904L) {
                                break;
                            }
                            executorServiceZ = this.a.z();
                            oozVar = new ooz(this, i2);
                            executorServiceZ.execute(oozVar);
                            break;
                        }
                    } else {
                        long jJniGetLayoutSenderState2 = jniGetLayoutSenderState2(j2, i);
                        if (jJniGetLayoutSenderState2 != 0) {
                            atdgVar = new atdg(ksy.aB(Memory.peekLong(8 + jJniGetLayoutSenderState2, false), atdh.a, Memory.peekLong(jJniGetLayoutSenderState2, false)));
                        }
                    }
                    if (atomicLong.decrementAndGet() != 4611686018427387904L) {
                        break;
                    }
                    executorServiceZ = this.a.z();
                    oozVar = new ooz(this, i2);
                    executorServiceZ.execute(oozVar);
                    break;
                } catch (Throwable th) {
                    if (this.d.decrementAndGet() == 4611686018427387904L) {
                        this.a.z().execute(new ooz(this, i2));
                    }
                    throw th;
                }
            }
            j = atomicLong.get();
        }
        return atdgVar;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final Object n(int i) {
        Object objA;
        synchronized (this.h) {
            aga agaVar = this.n;
            objA = agaVar == null ? null : agaVar.a(i);
        }
        return objA;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final String o(int i) {
        AtomicLong atomicLong = this.d;
        long j = atomicLong.get();
        while (true) {
            if ((j & 4611686018427387904L) != 0 || j <= 0) {
                break;
            }
            if (atomicLong.compareAndSet(j, 1 + j)) {
                int i2 = 14;
                try {
                    String strJniBuildElementKeyPath = jniBuildElementKeyPath(this.c, i);
                } finally {
                    if (this.d.decrementAndGet() == 4611686018427387904L) {
                        this.a.z().execute(new ooz(this, i2));
                    }
                }
            }
            j = atomicLong.get();
        }
        return null;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final String p(int i) {
        AtomicLong atomicLong = this.d;
        long j = atomicLong.get();
        while (true) {
            if ((j & 4611686018427387904L) != 0 || j <= 0) {
                break;
            }
            if (atomicLong.compareAndSet(j, 1 + j)) {
                int i2 = 14;
                try {
                    String strJniGetElementKey = jniGetElementKey(this.c, i);
                } finally {
                    if (this.d.decrementAndGet() == 4611686018427387904L) {
                        this.a.z().execute(new ooz(this, i2));
                    }
                }
            }
            j = atomicLong.get();
        }
        return null;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final void q(Closeable closeable) {
        boolean z;
        try {
            ovl ovlVar = (ovl) DesugarAtomicReference.updateAndGet(this.q, new ovp());
            ovlVar.getClass();
            synchronized (ovlVar) {
                if (ovlVar.a) {
                    z = true;
                } else {
                    ovlVar.b.add(closeable);
                    z = false;
                }
            }
            if (z) {
                closeable.close();
            }
        } catch (IOException e) {
            this.a.n().c(aslh.LOG_TYPE_INTERNAL_ERROR, "CompositeCloseable.add() threw IOException", e);
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final void r(int i, Object obj) {
        this.a.z().execute(new qd(this, i, obj, 10, (byte[]) null));
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final void s(byte[] bArr, int i, int i2, ElementsRetainedState elementsRetainedState) {
        boolean zM = M();
        this.a.z().execute(new ovr(this, bArr, i, i2, elementsRetainedState, T(i, i2, zM), zM, 1));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e A[Catch: all -> 0x00ba, TryCatch #0 {all -> 0x00ba, blocks: (B:10:0x0023, B:12:0x0032, B:14:0x0039, B:16:0x0040, B:18:0x0046, B:24:0x0055, B:25:0x005c, B:27:0x0070, B:28:0x007b, B:31:0x009d, B:21:0x004e), top: B:42:0x0023 }] */
    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final void t(ooy ooyVar) {
        boolean zIsAttachedToWindow;
        boolean z;
        long jDecrementAndGet;
        AtomicLong atomicLong = this.d;
        long j = atomicLong.get();
        while (true) {
            if ((j & 4611686018427387904L) != 0 || j <= 0) {
                return;
            }
            if (atomicLong.compareAndSet(j, 1 + j)) {
                int i = 14;
                try {
                    if (Memory.peekByte(FlagServices.b().c + 57) != 0) {
                        zIsAttachedToWindow = true;
                        if (this.b.f != 1) {
                            zIsAttachedToWindow = ooyVar.isAttachedToWindow();
                        } else if (!ooyVar.isAttachedToWindow() || !ooyVar.isLaidOut() || ooyVar.isLayoutRequested()) {
                            z = false;
                        }
                        z = zIsAttachedToWindow;
                    } else {
                        zIsAttachedToWindow = ooyVar.isAttachedToWindow();
                        z = zIsAttachedToWindow;
                    }
                    if (z) {
                        ooyVar.p(this.r, this.s);
                    }
                    ElementsRuntimeImpl elementsRuntimeImpl = this.elementsRuntime;
                    long j2 = this.c;
                    Rect rect = this.r;
                    Point point = this.s;
                    ooy ooyVar2 = (ooy) elementsRuntimeImpl.d.d(j2, ooyVar);
                    if (elementsRuntimeImpl.i == null) {
                        elementsRuntimeImpl.i = new oor(Choreographer.getInstance());
                    }
                    ElementsRuntimeImpl.jniAttachNodeTreeProcessor(elementsRuntimeImpl.a, j2, z, rect.left, rect.top, rect.right, rect.bottom, point.x, point.y);
                    if (ooyVar2 != null && ooyVar2 != ooyVar) {
                        ooyVar2.z(null);
                    }
                    if (jDecrementAndGet == j) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (this.d.decrementAndGet() == 4611686018427387904L) {
                        this.a.z().execute(new ooz(this, i));
                    }
                }
            }
            j = atomicLong.get();
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final void u() {
        long jDecrementAndGet;
        AtomicLong atomicLong = this.d;
        long j = atomicLong.get();
        while (true) {
            if ((j & 4611686018427387904L) != 0 || j <= 0) {
                break;
            }
            if (atomicLong.compareAndSet(j, 1 + j)) {
                int i = 14;
                try {
                    ElementsRuntimeImpl elementsRuntimeImpl = this.elementsRuntime;
                    long j2 = this.c;
                    if (elementsRuntimeImpl.d.e(j2) != null) {
                        ElementsRuntimeImpl.jniDetachNodeTreeProcessor(elementsRuntimeImpl.a, j2);
                    }
                    if (jDecrementAndGet == j) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (this.d.decrementAndGet() == 4611686018427387904L) {
                        this.a.z().execute(new ooz(this, i));
                    }
                }
            }
            j = atomicLong.get();
        }
        this.elementsRuntime.g(this.c);
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final void v() {
        long jDecrementAndGet;
        AtomicLong atomicLong = this.d;
        long j = atomicLong.get();
        while (true) {
            if ((j & 4611686018427387904L) != 0 || j <= 0) {
                return;
            }
            if (atomicLong.compareAndSet(j, 1 + j)) {
                int i = 14;
                try {
                    jniDetachedFromWindow(this.c);
                    if (jDecrementAndGet == j) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (this.d.decrementAndGet() == 4611686018427387904L) {
                        this.a.z().execute(new ooz(this, i));
                    }
                }
            }
            j = atomicLong.get();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final void w(int i, Object obj) {
        AtomicLong atomicLong = this.d;
        for (long j = atomicLong.get(); (j & 4611686018427387904L) == 0 && j > 0; j = atomicLong.get()) {
            if (atomicLong.compareAndSet(j, 1 + j)) {
                int i2 = 14;
                try {
                    ElementsRuntimeImpl elementsRuntimeImpl = this.elementsRuntime;
                    long j2 = this.c;
                    agp agpVar = elementsRuntimeImpl.h;
                    synchronized (agpVar) {
                        aga agaVar = (aga) agpVar.a(j2);
                        if (agaVar == null) {
                            agaVar = new aga(6);
                            agpVar.d(j2, agaVar);
                        }
                        agaVar.d(i, obj);
                    }
                    jniRelayout(this.c, i);
                    if (this.d.decrementAndGet() == 4611686018427387904L) {
                        this.a.z().execute(new ooz(this, i2));
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (this.d.decrementAndGet() == 4611686018427387904L) {
                        this.a.z().execute(new ooz(this, i2));
                    }
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final void x(Closeable closeable) {
        ovl ovlVar = (ovl) this.q.get();
        if (ovlVar != null) {
            ovlVar.a(closeable);
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final void y(NodeViewInterface nodeViewInterface, mqt mqtVar) {
        String strP;
        ElementsRetainedState elementsRetainedState = (ElementsRetainedState) this.g.get();
        if (elementsRetainedState == null || (strP = nodeViewInterface.p(this)) == null) {
            return;
        }
        AtomicBoolean atomicBoolean = elementsRetainedState.b;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (elementsRetainedState.c) {
            if (atomicBoolean.get()) {
                return;
            }
            if (elementsRetainedState.d == null) {
                elementsRetainedState.d = new HashMap();
            }
            elementsRetainedState.d.put(strP, mqtVar);
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeTreeProcessor
    public final void z(int i, int i2, int i3) {
        long jDecrementAndGet;
        AtomicLong atomicLong = this.d;
        long j = atomicLong.get();
        while (true) {
            if ((j & 4611686018427387904L) != 0 || j <= 0) {
                return;
            }
            if (atomicLong.compareAndSet(j, 1 + j)) {
                int i4 = 14;
                try {
                    jniSetContentOffset(this.c, i, i2, i3);
                    if (jDecrementAndGet == j) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (this.d.decrementAndGet() == 4611686018427387904L) {
                        this.a.z().execute(new ooz(this, i4));
                    }
                }
            }
            j = atomicLong.get();
        }
    }
}
