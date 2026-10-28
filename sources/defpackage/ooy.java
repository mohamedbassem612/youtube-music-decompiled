package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import android.util.Size;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner;
import com.google.android.libraries.multiplatform.elements.runtime.NodeTreeProcessorImpl;
import com.google.android.libraries.multiplatform.elements.runtime.RenderNextCrashReporter;
import com.google.android.libraries.multiplatform.elements.runtime.RuntimeSharedBuffer;
import com.google.android.libraries.multiplatform.elements.uibuilder.UiBuilderCallbackImpl;
import j$.time.Duration;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ooy extends ViewGroup implements PaintUnitOwner, opt {
    private static int l;
    public ElementsServices a;
    public opl b;
    public Runnable c;
    public boolean d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public opa j;
    public int k;
    private oph m;
    private ArrayList n;
    private int o;
    private int p;
    private final Rect q;
    private final Point r;
    private final int[] s;
    private int t;
    private int u;
    private int v;

    public ooy(Context context, int i) {
        super(context);
        this.o = 0;
        this.p = 0;
        this.g = false;
        this.h = false;
        this.i = false;
        this.q = new Rect();
        this.r = new Point();
        this.s = new int[2];
        this.t = -1;
        this.u = -1;
        this.v = 0;
        setWillNotDraw(false);
        setClipChildren(false);
        setDescendantFocusability(262144);
        setDefaultFocusHighlightEnabled(false);
        this.k = i;
    }

    static boolean E(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            if (size != i2) {
                return false;
            }
        } else if (mode == Integer.MIN_VALUE && size < i2) {
            return false;
        }
        return true;
    }

    private final int L(int i) {
        return Math.max(0, i + getPaddingTop() + getPaddingBottom());
    }

    private final int M(int i) {
        return Math.max(0, i + getPaddingLeft() + getPaddingRight());
    }

    private final opa N() {
        opa opaVar = this.j;
        if (opaVar != null) {
            return opaVar;
        }
        opa opaVar2 = new opa(this);
        this.j = opaVar2;
        return opaVar2;
    }

    private final void O(boolean z, NodeTreeProcessor nodeTreeProcessor) {
        opa opaVarN = N();
        if (rbm.i(this.a) != null) {
            ooy ooyVar = opaVarN.a;
            Runnable runnable = opaVarN.c;
            ooyVar.removeCallbacks(runnable);
            opaVarN.d = false;
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j = opaVarN.b;
            if (j == 0 || z || jUptimeMillis - j >= 250) {
                opaVarN.b = jUptimeMillis;
                opaVarN.b(nodeTreeProcessor);
            } else {
                opaVarN.d = true;
                ooyVar.postDelayed(runnable, 64L);
            }
        }
    }

    public static int a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        return mode != 0 ? View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(i) - i2), mode) : i;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.AutoCloseable] */
    public final void B() {
        opl oplVar;
        this.h = false;
        if (Memory.peekByte(FlagServices.b().c + 19) == 0 || (oplVar = this.b) == null || !isAttachedToWindow()) {
            return;
        }
        Rect rect = this.q;
        Point point = this.r;
        p(rect, point);
        oplVar.c().A(rect, point);
    }

    public final boolean C(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (NullPointerException e) {
            if (e.getMessage() == null || !e.getMessage().contains("mPrivateFlags")) {
                throw e;
            }
            Log.w("SafeFrameLayout", "Intercepted mPrivateFlags NPE during touch dispatch", e);
            return true;
        }
    }

    @Override // defpackage.opt
    public final boolean D(int i, int i2) {
        NodeTreeProcessor nodeTreeProcessorG = g();
        if (nodeTreeProcessorG != null) {
            return nodeTreeProcessorG.B(i, i2);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.AutoCloseable, java.lang.Object] */
    public final void F() {
        Size size;
        boolean z;
        aga agaVar;
        boolean z2;
        ExecutorService executorServiceZ;
        ooz oozVar;
        ooy ooyVar;
        ooy ooyVar2;
        ooy ooyVar3;
        ooy ooyVar4 = this;
        opl oplVar = ooyVar4.b;
        if (oplVar == null) {
            return;
        }
        ?? C = oplVar.c();
        NodeTreeProcessorImpl nodeTreeProcessorImpl = (NodeTreeProcessorImpl) C;
        AtomicLong atomicLong = nodeTreeProcessorImpl.d;
        long j = atomicLong.get();
        while (true) {
            long j2 = 4611686018427387904L;
            long j3 = 0;
            if ((j & 4611686018427387904L) != 0 || j <= 0) {
                return;
            }
            if (atomicLong.compareAndSet(j, j + 1)) {
                int i = 14;
                try {
                    boolean zJniHasNewSnapshot = NodeTreeProcessorImpl.jniHasNewSnapshot(((NodeTreeProcessorImpl) C).c);
                    AtomicLong atomicLong2 = nodeTreeProcessorImpl.d;
                    if (atomicLong2.decrementAndGet() == 4611686018427387904L) {
                        nodeTreeProcessorImpl.a.z().execute(new ooz(C, i));
                    }
                    if (zJniHasNewSnapshot) {
                        try {
                            float paddingLeft = ooyVar4.getPaddingLeft();
                            float paddingTop = ooyVar4.getPaddingTop();
                            int i2 = ooyVar4.v;
                            int i3 = l + 1;
                            l = i3;
                            long j4 = atomicLong2.get();
                            while (true) {
                                long j5 = j2;
                                if ((j4 & j2) != j3 || j4 <= j3) {
                                    z = false;
                                    size = new Size(0, 0);
                                    ooyVar4 = ooyVar4;
                                    break;
                                }
                                if (atomicLong2.compareAndSet(j4, j4 + 1)) {
                                    try {
                                        synchronized (((NodeTreeProcessorImpl) C).h) {
                                        }
                                        synchronized (((NodeTreeProcessorImpl) C).i) {
                                            agaVar = ((NodeTreeProcessorImpl) C).o;
                                            ((NodeTreeProcessorImpl) C).o = null;
                                        }
                                        ElementsServices elementsServices = ((NodeTreeProcessorImpl) C).a;
                                        opn opnVarJ = elementsServices.J();
                                        ((UiBuilderCallbackImpl) opnVarJ).a = agaVar;
                                        try {
                                            if (Memory.peekByte(FlagServices.b().c + 66) == 0) {
                                                z2 = false;
                                                ooy ooyVar5 = this;
                                                int[] iArrJniApply = ((NodeTreeProcessorImpl) C).jniApply(((NodeTreeProcessorImpl) C).c, ((UiBuilderCallbackImpl) opnVarJ).b, ooyVar5, paddingLeft, paddingTop, i2, i3);
                                                if (iArrJniApply == null) {
                                                    size = null;
                                                    ooyVar3 = ooyVar5;
                                                } else {
                                                    size = new Size(iArrJniApply[0], iArrJniApply[1]);
                                                    ooyVar = ooyVar5;
                                                    if (((NodeTreeProcessorImpl) C).d.decrementAndGet() == j5) {
                                                        executorServiceZ = ((NodeTreeProcessorImpl) C).a.z();
                                                        oozVar = new ooz(C, i);
                                                        ooyVar2 = ooyVar5;
                                                        executorServiceZ.execute(oozVar);
                                                        ooyVar = ooyVar2;
                                                    }
                                                }
                                                z = z2;
                                                ooyVar4 = ooyVar;
                                                break;
                                            }
                                            z2 = false;
                                            if (((NodeTreeProcessorImpl) C).jniApply2(((NodeTreeProcessorImpl) C).c, ((NodeTreeProcessorImpl) C).elementsRuntime.getHandle(), ((UiBuilderCallbackImpl) opnVarJ).b, ooyVar4, paddingLeft, paddingTop, i2, i3)) {
                                                RuntimeSharedBuffer runtimeSharedBuffer = ((NodeTreeProcessorImpl) C).j;
                                                size = new Size(runtimeSharedBuffer.b(), runtimeSharedBuffer.a());
                                            } else {
                                                size = null;
                                            }
                                            ooyVar3 = this;
                                            ooyVar = ooyVar3;
                                            if (((NodeTreeProcessorImpl) C).d.decrementAndGet() == j5) {
                                                executorServiceZ = elementsServices.z();
                                                oozVar = new ooz(C, i);
                                                ooyVar2 = ooyVar3;
                                                executorServiceZ.execute(oozVar);
                                                ooyVar = ooyVar2;
                                            }
                                            z = z2;
                                            ooyVar4 = ooyVar;
                                            break;
                                        } catch (Throwable th) {
                                            th = th;
                                            ooyVar4 = this;
                                            try {
                                                RenderNextCrashReporter.interceptFatalCrash(th);
                                                throw th;
                                            } catch (Throwable th2) {
                                                if (((NodeTreeProcessorImpl) C).d.decrementAndGet() == j5) {
                                                    ((NodeTreeProcessorImpl) C).a.z().execute(new ooz(C, i));
                                                }
                                                throw th2;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                } else {
                                    i3 = i3;
                                    j2 = j5;
                                    j3 = 0;
                                    paddingLeft = paddingLeft;
                                    paddingTop = paddingTop;
                                    j4 = atomicLong2.get();
                                }
                            }
                            ooyVar4.v = l;
                            ooyVar4.O(z, C);
                            if (size != null) {
                                Runnable runnable = ooyVar4.c;
                                if (runnable != null) {
                                    runnable.run();
                                }
                                int iM = ooyVar4.M(size.getWidth());
                                int iL = ooyVar4.L(size.getHeight());
                                if (iM == ooyVar4.o && iL == ooyVar4.p) {
                                    return;
                                }
                                ooyVar4.o = iM;
                                ooyVar4.p = iL;
                                ooyVar4.requestLayout();
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            ooyVar4.r("Failed to apply node tree", e);
                            return;
                        }
                    }
                    return;
                } catch (Throwable th4) {
                    if (nodeTreeProcessorImpl.d.decrementAndGet() == 4611686018427387904L) {
                        nodeTreeProcessorImpl.a.z().execute(new ooz(C, i));
                    }
                    throw th4;
                }
            }
            j = atomicLong.get();
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void G() {
        invalidate();
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void H() {
        invalidate();
    }

    @Override // defpackage.opt
    public final /* synthetic */ void J(asut asutVar) {
        nul.a(this, asutVar);
    }

    public final int b(int i) {
        return a(i, getPaddingTop() + getPaddingBottom());
    }

    public final int c(int i) {
        return a(i, getPaddingLeft() + getPaddingRight());
    }

    public final int d() {
        NodeTreeProcessor nodeTreeProcessorH = h();
        if (nodeTreeProcessorH != null) {
            return nodeTreeProcessorH.b();
        }
        return -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return N().e.h(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return osy.c(this, d(), h(), true, motionEvent);
    }

    @Override // defpackage.opt
    public final /* synthetic */ View f() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.AutoCloseable] */
    public final NodeTreeProcessor g() {
        opl oplVar = this.b;
        if (oplVar == null) {
            return null;
        }
        return oplVar.c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        if (osy.b(this.a, this, rect)) {
            return;
        }
        super.getFocusedRect(rect);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.AutoCloseable] */
    public final NodeTreeProcessor h() {
        opl oplVar = this.b;
        if (oplVar != null) {
            return oplVar.c();
        }
        return null;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final int ig() {
        ArrayList arrayList = this.n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final PaintUnit ih(int i) {
        PaintUnit paintUnitIh;
        PaintUnit paintUnitIh2;
        ArrayList arrayList = this.n;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                PaintUnit paintUnit = (PaintUnit) arrayList.get(i2);
                if (paintUnit.p() == i) {
                    return paintUnit;
                }
                if ((paintUnit instanceof PaintUnitOwner) && (paintUnitIh2 = ((PaintUnitOwner) paintUnit).ih(i)) != null) {
                    return paintUnitIh2;
                }
            }
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            KeyEvent.Callback childAt = getChildAt(i3);
            if ((childAt instanceof PaintUnitOwner) && (paintUnitIh = ((PaintUnitOwner) childAt).ih(i)) != null) {
                return paintUnitIh;
            }
        }
        return null;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void ii(PaintUnit paintUnit, int i) {
        ArrayList arrayList = this.n;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.n = arrayList;
        }
        arrayList.add(i, paintUnit);
        paintUnit.f(this);
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void ij(int i) {
        PaintUnit paintUnit = (PaintUnit) this.n.get(i);
        NodeTreeProcessor nodeTreeProcessorG = g();
        if ((Memory.peekByte(FlagServices.b().c + 45) == 0 || nodeTreeProcessorG == null || nodeTreeProcessorG.n(paintUnit.p()) != paintUnit) && paintUnit.i()) {
            if (nodeTreeProcessorG != null) {
                nodeTreeProcessorG.x(paintUnit);
            }
            try {
                paintUnit.close();
            } catch (IOException e) {
                ElementsServices elementsServices = this.a;
                if (elementsServices != null) {
                    elementsServices.n().c(aslh.LOG_TYPE_INTERNAL_ERROR, "ElementsView.removeAllChildren() paintUnit threw IOException", e);
                }
            }
        }
        this.n.remove(i);
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void ik(int i) {
        this.n.remove(i);
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void il(Drawable drawable, Runnable runnable, long j) {
        Duration durationOfMillis = Duration.ofMillis(j - SystemClock.uptimeMillis());
        Duration duration = oop.a;
        postOnAnimationDelayed(runnable, (durationOfMillis.compareTo(duration) <= 0 ? Duration.ZERO : durationOfMillis.minus(duration)).toMillis());
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void im(Drawable drawable, Runnable runnable) {
        removeCallbacks(runnable);
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final PaintUnit j(int i) {
        return (PaintUnit) this.n.get(i);
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void k(Closeable closeable) {
        NodeTreeProcessor nodeTreeProcessorG = g();
        if (nodeTreeProcessorG != null) {
            nodeTreeProcessorG.q(closeable);
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void l(PaintUnit paintUnit) {
        ArrayList arrayList = this.n;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.n = arrayList;
        }
        arrayList.add(paintUnit);
        paintUnit.f(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.AutoCloseable] */
    public final void m(boolean z) {
        opl oplVar = this.b;
        if (oplVar != null) {
            O(z, oplVar.c());
        }
    }

    public final void n() {
        this.c = null;
        this.g = false;
        this.i = false;
        opa opaVar = this.j;
        if (opaVar != null) {
            opaVar.a();
        }
        t(false, true);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.AutoCloseable] */
    public final void o() {
        opl oplVar = this.b;
        if (oplVar != null) {
            oplVar.c().u();
            this.v = 0;
            try {
                oplVar.close();
            } catch (Exception e) {
                r("Failed to close node tree processor", e);
            } finally {
                this.b = null;
            }
        }
    }

    @Override // android.view.View
    public final void offsetLeftAndRight(int i) {
        super.offsetLeftAndRight(i);
        if (!this.i || Memory.peekByte(FlagServices.b().c + 39) == 0) {
            B();
        }
    }

    @Override // android.view.View
    public final void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        if (!this.i || Memory.peekByte(FlagServices.b().c + 39) == 0) {
            B();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.AutoCloseable] */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        boolean zIsLaidOut = isLaidOut();
        super.onAttachedToWindow();
        opl oplVar = this.b;
        if (oplVar != null) {
            ?? C = oplVar.c();
            if (Memory.peekByte(FlagServices.b().c + 57) != 0) {
                oph ophVar = this.m;
                if (ophVar == null) {
                    ophVar = ((NodeTreeProcessorImpl) C).b;
                }
                if (ophVar == null || ophVar.f != 1 || (zIsLaidOut && !isLayoutRequested())) {
                    Rect rect = this.q;
                    Point point = this.r;
                    p(rect, point);
                    C.A(rect, point);
                } else {
                    this.h = true;
                }
            } else {
                Rect rect2 = this.q;
                Point point2 = this.r;
                p(rect2, point2);
                C.A(rect2, point2);
            }
            O(false, C);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.AutoCloseable] */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        opa opaVar = this.j;
        if (opaVar != null) {
            opaVar.a();
        }
        if (this.k == 1) {
            n();
        } else {
            opl oplVar = this.b;
            if (oplVar != null) {
                if (Memory.peekByte(FlagServices.b().c + 85) != 0) {
                    qpj.e(new msh(this, oplVar, 13));
                } else {
                    oplVar.c().v();
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        ArrayList arrayList = this.n;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((PaintUnit) arrayList.get(i)).b(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int i = this.t;
        if (i >= 0 || this.u >= 0) {
            new bbz(accessibilityNodeInfo).y(zs.f(i, this.u));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z || this.h) {
            this.h = false;
            B();
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x01f5 A[Catch: all -> 0x02e1, TryCatch #1 {all -> 0x02e1, blocks: (B:48:0x015b, B:50:0x015f, B:52:0x0163, B:54:0x016d, B:56:0x0171, B:59:0x0177, B:60:0x018b, B:62:0x018f, B:64:0x0193, B:66:0x0197, B:68:0x019b, B:71:0x01a1, B:73:0x01a9, B:75:0x01b1, B:77:0x01ca, B:79:0x01d0, B:81:0x01e4, B:83:0x01f5, B:84:0x021d, B:87:0x0239, B:92:0x0258, B:93:0x0260, B:94:0x0269, B:98:0x0273, B:101:0x0283, B:103:0x0290, B:109:0x02c2, B:105:0x02a3, B:107:0x02b0, B:108:0x02c1, B:90:0x024b, B:110:0x02c7, B:113:0x02d5, B:100:0x027b), top: B:124:0x015b, outer: #4, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.AutoCloseable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v34, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.AutoCloseable, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:95:0x026d
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // android.view.View
    protected final void onMeasure(int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ooy.onMeasure(int, int):void");
    }

    public final void p(Rect rect, Point point) {
        if (getGlobalVisibleRect(rect, point)) {
            point.offset(getPaddingLeft(), getPaddingTop());
            rect.offset(-point.x, -point.y);
        } else {
            int[] iArr = this.s;
            getLocationInWindow(iArr);
            point.set(iArr[0] + getPaddingLeft(), iArr[1] + getPaddingTop());
            rect.setEmpty();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, oov] */
    public final void r(String str, Throwable th) {
        ElementsServices elementsServices = this.a;
        if (elementsServices == null) {
            Log.e("RENDER_NEXT", str, th);
        } else {
            elementsServices.L().io().c().c(aslh.LOG_TYPE_INTERNAL_ERROR, str, th);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (osy.d(this.a, view2)) {
            return;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect, boolean z) {
        if (osy.d(this.a, null)) {
            return false;
        }
        return super.requestRectangleOnScreen(rect, z);
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void s(boolean z) {
        t(z, false);
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        B();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        B();
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x010b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor] */
    public final void t(boolean z, boolean z2) {
        opl oplVar;
        opo opoVarK;
        ArrayList arrayList = new ArrayList(getChildCount());
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof NodeViewInterface) {
                arrayList.add((NodeViewInterface) childAt);
            }
        }
        removeAllViewsInLayout();
        if (z) {
            invalidate();
        }
        ArrayList arrayList2 = this.n;
        AutoCloseable autoCloseableC = null;
        this.n = null;
        this.v = 0;
        if (z2) {
            opl oplVar2 = this.b;
            if (oplVar2 != null && !oplVar2.d()) {
                oplVar2.c().u();
            }
            this.b = null;
            oplVar = oplVar2;
        } else {
            oplVar = null;
        }
        if (oplVar == null || oplVar.d()) {
            opl oplVar3 = this.b;
            if (oplVar3 != null && !oplVar3.d()) {
                autoCloseableC = this.b.c();
            }
        } else {
            autoCloseableC = oplVar.c();
        }
        ?? r5 = autoCloseableC;
        if (z2 && (Memory.peekByte(FlagServices.b().c + 36) != 0 || Memory.peekByte(FlagServices.b().c + 85) != 0)) {
            qpj.e(new oox(this, this.a, arrayList, arrayList2, (NodeTreeProcessor) r5, oplVar, 0));
            return;
        }
        ElementsServices elementsServices = this.a;
        if (elementsServices != null && (opoVarK = elementsServices.K()) != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                opoVarK.b((NodeViewInterface) arrayList.get(i2));
            }
        }
        if (arrayList2 != null && r5 != 0 && r5.C()) {
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                PaintUnit paintUnit = (PaintUnit) arrayList2.get(i3);
                if (Memory.peekByte(FlagServices.b().c + 45) != 0) {
                    if (r5.n(paintUnit.p()) != paintUnit) {
                        if (paintUnit.i()) {
                            r5.x(paintUnit);
                            try {
                                paintUnit.close();
                            } catch (IOException e) {
                                ElementsServices elementsServices2 = this.a;
                                if (elementsServices2 != null) {
                                    elementsServices2.n().c(aslh.LOG_TYPE_INTERNAL_ERROR, "ElementsView.removeAllChildren() paintUnit threw IOException", e);
                                }
                            }
                        }
                    }
                } else if (!z2 || r5.n(paintUnit.p()) != paintUnit) {
                    if (paintUnit.i()) {
                        r5.x(paintUnit);
                        paintUnit.close();
                    }
                }
            }
        }
        if (oplVar != null) {
            try {
                oplVar.close();
            } catch (Exception e2) {
                r("Failed to close processor", e2);
            }
        }
    }

    public final void x(int i, int i2) {
        this.t = i;
        this.u = i2;
    }

    public final void y(ElementsServices elementsServices, oph ophVar) {
        ElementsServices elementsServices2 = this.a;
        if (elementsServices == elementsServices2 && ophVar == this.m) {
            return;
        }
        if (elementsServices2 != null || this.m != null) {
            o();
        }
        this.a = elementsServices;
        this.m = ophVar;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.AutoCloseable] */
    public final void z(opl oplVar) {
        boolean z;
        zh zhVar;
        opl oplVar2 = this.b;
        if (oplVar2 != null && oplVar != null && oplVar2.c() == oplVar.c()) {
            if (Memory.peekByte(FlagServices.b().c + 103) == 0 || oplVar == oplVar2 || (zhVar = (zh) oplVar.a.get()) == null || zhVar != oplVar2.a.get()) {
                return;
            }
            try {
                oplVar.close();
                return;
            } catch (Exception e) {
                r("Failed to close rejected processor reference", e);
                return;
            }
        }
        if (oplVar != null) {
            y(((NodeTreeProcessorImpl) oplVar.c()).a, ((NodeTreeProcessorImpl) oplVar.c()).b);
            z = false;
        } else {
            z = true;
        }
        o();
        if (Memory.peekByte(FlagServices.b().c + 47) != 0) {
            t(false, false);
            this.v = 0;
        } else if (this.k == 2) {
            t(false, false);
        }
        this.b = oplVar;
        this.i = !z;
        this.d = true;
        this.h = true;
        if (oplVar != null) {
            oplVar.c().t(this);
        }
    }

    @Override // defpackage.opt
    public final /* synthetic */ void I(asuy asuyVar) {
    }

    @Override // defpackage.opt
    public final /* synthetic */ void K(asvc asvcVar, grj grjVar) {
    }
}
