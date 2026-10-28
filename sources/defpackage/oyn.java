package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import com.google.android.libraries.multiplatform.elements.NodeViewInternalInterface;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner;
import j$.time.Duration;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class oyn extends View implements NodeViewInterface, NodeViewInternalInterface, PaintUnitOwner, osw {
    public static final ViewOutlineProvider b = new oym();
    private final float a;
    public float c;
    public long d;
    public boolean e;
    public int f;
    public oyi g;
    private NodeTreeProcessor h;
    private ElementsServices i;
    private int j;
    private boolean k;
    private ota l;
    private oul m;
    private oum n;
    private ArrayList o;

    public oyn(NodeTreeProcessor nodeTreeProcessor) {
        super(nodeTreeProcessor.k().c());
        this.e = false;
        this.k = false;
        setWillNotDraw(false);
        setOutlineProvider(b);
        this.h = nodeTreeProcessor;
        this.a = nodeTreeProcessor.k().a();
        this.i = nodeTreeProcessor.k();
    }

    private final void D(PaintUnit paintUnit, NodeTreeProcessor nodeTreeProcessor, boolean z) {
        if (Memory.peekByte(FlagServices.b().c + 45) != 0) {
            if (nodeTreeProcessor.n(paintUnit.p()) == paintUnit) {
                return;
            }
        } else if (z && nodeTreeProcessor.n(paintUnit.p()) == paintUnit) {
            return;
        }
        if (paintUnit.i()) {
            nodeTreeProcessor.x(paintUnit);
            try {
                paintUnit.close();
            } catch (IOException e) {
                ElementsServices elementsServices = this.i;
                if (elementsServices != null) {
                    elementsServices.n().c(aslh.LOG_TYPE_INTERNAL_ERROR, "ElementsView.removeAllChildren() paintUnit threw IOException", e);
                }
            }
        }
    }

    public void B(NodeTreeProcessor nodeTreeProcessor) {
        this.h = nodeTreeProcessor;
        this.i = nodeTreeProcessor.k();
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void C(int i) {
        oum oumVar = this.n;
        if (oumVar == null) {
            oumVar = new oum();
            this.n = oumVar;
            oumVar.a = this.c;
        }
        oumVar.d = i;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void E(float f) {
        if (f != this.c) {
            this.c = f;
            oul oulVar = this.m;
            if (oulVar != null) {
                oulVar.h = f;
            }
            oum oumVar = this.n;
            if (oumVar != null) {
                oumVar.a = f;
            }
            invalidateOutline();
        }
        oyi oyiVar = this.g;
        if (oyiVar != null) {
            oyiVar.g(this, f);
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void F(float f) {
        oum oumVar = this.n;
        if (oumVar == null) {
            oumVar = new oum();
            this.n = oumVar;
            oumVar.a = this.c;
        }
        oumVar.a(f);
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void G() {
        invalidate();
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void H() {
        invalidate();
    }

    protected final void I(PaintUnit paintUnit) {
        if (paintUnit.i()) {
            NodeTreeProcessor nodeTreeProcessor = this.h;
            if (nodeTreeProcessor != null) {
                if (nodeTreeProcessor.n(paintUnit.p()) == paintUnit) {
                    return;
                } else {
                    nodeTreeProcessor.x(paintUnit);
                }
            }
            try {
                paintUnit.close();
            } catch (IOException e) {
                ElementsServices elementsServices = this.i;
                if (elementsServices != null) {
                    elementsServices.n().c(aslh.LOG_TYPE_INTERNAL_ERROR, "NodeViewLeaf.closeDetachedPaintUnit() paintUnit threw IOException", e);
                }
            }
        }
    }

    public final /* synthetic */ void J(Canvas canvas) {
        super.draw(canvas);
    }

    public final void K(boolean z, boolean z2) {
        NodeTreeProcessor nodeTreeProcessor = this.h;
        ArrayList arrayList = this.o;
        if (arrayList != null && nodeTreeProcessor != null && nodeTreeProcessor.C()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                D((PaintUnit) arrayList.get(i), nodeTreeProcessor, z2);
            }
        }
        this.o = null;
        if (z) {
            invalidate();
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void L(long j) {
        this.d = j;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void M(boolean z) {
        if (z != this.k) {
            this.k = z;
            setLayoutDirection(z ? 1 : 0);
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void N(agfr agfrVar, ovd ovdVar) {
        o().v(agfrVar, ovdVar);
    }

    public void O(float f, int i, float f2, float f3) {
        if (this.g == null) {
            oyi oyiVar = new oyi();
            this.g = oyiVar;
            oyiVar.b = getAlpha();
            this.g.g(this, this.c);
        }
        this.g.h(this, this, f, i, f2, f3, this.c);
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void P(boolean z) {
        this.e = z;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void Q(Rect rect) {
        n().a = rect;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void R(int i) {
        this.j = i;
    }

    public void S(int i) {
        this.f = i;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final boolean T() {
        return this.l != null;
    }

    public /* synthetic */ atoc V() {
        return null;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInternalInterface
    public final int W() {
        return this.f;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInternalInterface
    public final void X(Canvas canvas) {
        onDraw(canvas);
        dispatchDraw(canvas);
        onDrawForeground(canvas);
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInternalInterface
    public final void Y(boolean z) {
        if (this.g == null) {
            oyi oyiVar = new oyi();
            this.g = oyiVar;
            oyiVar.b = getAlpha();
            this.g.g(this, this.c);
        }
        this.g.c(this, z);
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInternalInterface
    public final void Z(GestureDetector gestureDetector) {
        n().d = gestureDetector;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final float a() {
        return this.a;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInternalInterface
    public final void aa(otb otbVar) {
        n().e = otbVar;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInternalInterface
    public final boolean ab(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // defpackage.osw
    public final void aj(int i) {
        NodeTreeProcessor nodeTreeProcessor;
        if (!this.e || (nodeTreeProcessor = this.h) == null) {
            return;
        }
        nodeTreeProcessor.D(this.f, i);
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final /* synthetic */ int b() {
        return nta.a(this);
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final int c() {
        return this.j;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final int d() {
        return this.f;
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return osy.c(this, this.f, this.h, false, motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        oyi oyiVar = this.g;
        if (oyiVar != null) {
            oyiVar.b(canvas, this, this.c, new oyl(this, 0));
        } else {
            super.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        oul oulVar = this.m;
        if (oulVar != null) {
            oulVar.u(getDrawableState(), f, f2);
        }
        ota otaVarN = n();
        otaVarN.g = f;
        otaVarN.h = f2;
    }

    @Override // android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        oul oulVar = this.m;
        if (oulVar == null || !T()) {
            return;
        }
        ota otaVarN = n();
        oulVar.u(getDrawableState(), otaVarN.g, otaVarN.h);
    }

    public PaintUnit f() {
        return null;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final long g() {
        return this.d;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        if (osy.b(this.i, this, rect)) {
            return;
        }
        super.getFocusedRect(rect);
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final ElementsServices h() {
        return this.i;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final int ig() {
        ArrayList arrayList = this.o;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public PaintUnit ih(int i) {
        oul oulVar = this.m;
        if (oulVar != null && this.f == i) {
            return oulVar;
        }
        ArrayList arrayList = this.o;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                PaintUnit paintUnitIh = (PaintUnit) arrayList.get(i2);
                if (paintUnitIh.p() == i || ((paintUnitIh instanceof PaintUnitOwner) && (paintUnitIh = ((PaintUnitOwner) paintUnitIh).ih(i)) != null)) {
                    return paintUnitIh;
                }
            }
        }
        return null;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void ii(PaintUnit paintUnit, int i) {
        ArrayList arrayList = this.o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.o = arrayList;
        }
        arrayList.add(i, paintUnit);
        paintUnit.f(this);
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void ij(int i) {
        PaintUnit paintUnit = (PaintUnit) this.o.get(i);
        NodeTreeProcessor nodeTreeProcessor = this.h;
        if (nodeTreeProcessor != null) {
            D(paintUnit, nodeTreeProcessor, false);
        }
        this.o.remove(i);
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void ik(int i) {
        this.o.remove(i);
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

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        oyi oyiVar = this.g;
        if (oyiVar != null) {
            oyiVar.d();
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final PaintUnit j(int i) {
        return (PaintUnit) this.o.get(i);
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        oul oulVar = this.m;
        if (oulVar == null || !T()) {
            return;
        }
        ota otaVarN = n();
        oulVar.u(getDrawableState(), otaVarN.g, otaVarN.h);
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void k(Closeable closeable) {
        NodeTreeProcessor nodeTreeProcessor = this.h;
        if (nodeTreeProcessor != null) {
            nodeTreeProcessor.q(closeable);
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void l(PaintUnit paintUnit) {
        ArrayList arrayList = this.o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.o = arrayList;
        }
        arrayList.add(paintUnit);
        paintUnit.f(this);
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final NodeTreeProcessor m() {
        return this.h;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final ota n() {
        ota otaVar = this.l;
        if (otaVar != null) {
            return otaVar;
        }
        ota otaVar2 = new ota();
        this.l = otaVar2;
        return otaVar2;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final oul o() {
        oul oulVar = this.m;
        if (oulVar != null) {
            return oulVar;
        }
        oul oulVar2 = new oul();
        this.m = oulVar2;
        oulVar2.h = this.c;
        oulVar2.l = this;
        return oulVar2;
    }

    @Override // android.view.View
    protected final void onAttachedToWindow() {
        ota otaVarN;
        Rect rect;
        super.onAttachedToWindow();
        if (!T() || (rect = (otaVarN = n()).a) == null || rect == null) {
            return;
        }
        Object parent = getParent();
        if (parent instanceof View) {
            Rect rect2 = new Rect();
            getHitRect(rect2);
            rect2.top -= otaVarN.a.top;
            rect2.left -= otaVarN.a.left;
            rect2.bottom += otaVarN.a.bottom;
            rect2.right += otaVarN.a.right;
            otaVarN.b = new TouchDelegate(rect2, this);
            ((View) parent).setTouchDelegate(otaVarN.b);
        }
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (T()) {
            n().a(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        oul oulVar = this.m;
        if (oulVar != null) {
            oulVar.t(0, 0, getWidth(), getHeight());
            this.m.f = getClipToOutline();
            this.m.b(canvas);
        }
        ArrayList arrayList = this.o;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((PaintUnit) arrayList.get(i)).b(canvas);
            }
        }
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        super.onDrawForeground(canvas);
        oum oumVar = this.n;
        if (oumVar != null) {
            oumVar.t(0, 0, getWidth(), getHeight());
            this.n.j = getClipToOutline();
            this.n.b(canvas);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (T() && n().b(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        if (rbm.i(this.i) == null || bac.c(this) != null) {
            return super.onHoverEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getActionMasked();
        String.valueOf(T() ? n().e : null);
        oul oulVar = this.m;
        if (oulVar != null) {
            oulVar.u(getDrawableState(), motionEvent.getX(), motionEvent.getY());
        }
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        return T() ? zOnTouchEvent | n().c(this, motionEvent) : zOnTouchEvent;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final String p(NodeTreeProcessor nodeTreeProcessor) {
        throw null;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (T() && n().d()) {
            return true;
        }
        return super.performClick();
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void r(otc otcVar) {
        ota otaVarN = n();
        ArrayList arrayList = otaVarN.f;
        if (arrayList == null) {
            arrayList = new ArrayList();
            otaVarN.f = arrayList;
        }
        arrayList.add(otcVar);
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect, boolean z) {
        if (osy.d(this.i, null)) {
            return false;
        }
        return super.requestRectangleOnScreen(rect, z);
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void s(boolean z) {
        K(z, false);
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        oyi oyiVar = this.g;
        if (oyiVar != null) {
            oyiVar.b = f;
            if (oyiVar.j()) {
                super.setAlpha(1.0f);
                invalidate();
                return;
            }
        }
        super.setAlpha(f);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        o().g = i;
    }

    @Override // android.view.View
    public final void setRotation(float f) {
        super.setRotation(f);
        oyi oyiVar = this.g;
        if (oyiVar != null) {
            oyiVar.e(this);
        }
    }

    public void t(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            setLeftTopRightBottom(i, i2, i3, i4);
            return;
        }
        setLeft(i);
        setTop(i2);
        setRight(i3);
        setBottom(i4);
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void x() {
        oul oulVar = this.m;
        if (oulVar != null) {
            oulVar.g = 0;
            oulVar.h = 0.0f;
        }
    }

    public void y() {
        K(false, true);
        this.h = null;
        this.c = 0.0f;
        this.n = null;
        this.d = 0L;
        this.e = false;
        this.k = false;
        this.l = null;
        this.f = 0;
        setContextClickable(false);
        setOnContextClickListener(null);
        setClickable(false);
        setLongClickable(false);
        oul oulVar = this.m;
        if (oulVar != null) {
            oulVar.v(null, null);
        }
        this.m = null;
        oyi oyiVar = this.g;
        if (oyiVar != null) {
            oyiVar.a(this);
            this.g = null;
        }
        setLayerType(0, null);
        setClipToOutline(false);
        setBackground(null);
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final /* synthetic */ void z(Object obj) {
        nta.b(this, obj);
    }

    public /* synthetic */ void U() {
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
