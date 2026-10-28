package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
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
/* JADX INFO: loaded from: classes.dex */
public class oyk extends ViewGroup implements NodeViewInterface, NodeViewInternalInterface, PaintUnitOwner, osw {
    public static final /* synthetic */ int E = 0;
    private static final ViewOutlineProvider a = new oyj();
    public int A;
    public oyi B;
    public ouv C;
    public ArrayList D;
    private final float b;
    private ElementsServices c;
    private int d;
    private String e;
    private String f;
    private ota g;
    private oul h;
    private oum i;
    private boolean j;
    public NodeTreeProcessor w;
    public float x;
    public long y;
    public boolean z;

    public oyk(NodeTreeProcessor nodeTreeProcessor) {
        super(nodeTreeProcessor.k().c());
        this.z = false;
        this.j = false;
        setWillNotDraw(false);
        setClipChildren(false);
        setOutlineProvider(a);
        this.w = nodeTreeProcessor;
        this.b = nodeTreeProcessor.k().a();
        this.c = nodeTreeProcessor.k();
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
                ElementsServices elementsServices = this.c;
                if (elementsServices != null) {
                    elementsServices.n().c(aslh.LOG_TYPE_INTERNAL_ERROR, "ElementsView.removeAllChildren() paintUnit threw IOException", e);
                }
            }
        }
    }

    private final void f(boolean z) {
        NodeTreeProcessor nodeTreeProcessor = this.w;
        ArrayList arrayList = this.D;
        if (arrayList != null && nodeTreeProcessor != null && nodeTreeProcessor.C()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                D((PaintUnit) arrayList.get(i), nodeTreeProcessor, z);
            }
        }
        this.D = null;
    }

    public void B(NodeTreeProcessor nodeTreeProcessor) {
        this.w = nodeTreeProcessor;
        this.c = nodeTreeProcessor.k();
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void C(int i) {
        oum oumVar = this.i;
        if (oumVar == null) {
            oumVar = new oum();
            this.i = oumVar;
            oumVar.a = this.x;
        }
        oumVar.d = i;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void E(float f) {
        if (f != this.x) {
            this.x = f;
            oul oulVar = this.h;
            if (oulVar != null) {
                oulVar.h = f;
            }
            oum oumVar = this.i;
            if (oumVar != null) {
                oumVar.a = f;
            }
            invalidateOutline();
        }
        oyi oyiVar = this.B;
        if (oyiVar != null) {
            oyiVar.g(this, f);
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void F(float f) {
        oum oumVar = this.i;
        if (oumVar == null) {
            oumVar = new oum();
            this.i = oumVar;
            oumVar.a = this.x;
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

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void L(long j) {
        this.y = j;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void M(boolean z) {
        if (z != this.j) {
            this.j = z;
            setLayoutDirection(z ? 1 : 0);
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void N(agfr agfrVar, ovd ovdVar) {
        o().v(agfrVar, ovdVar);
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void O(float f, int i, float f2, float f3) {
        ar().h(this, this, f, i, f2, f3, this.x);
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void P(boolean z) {
        boolean z2 = this.z;
        this.z = z;
        if (z2 != z) {
            ae();
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void Q(Rect rect) {
        n().a = rect;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void R(int i) {
        this.d = i;
    }

    public void S(int i) {
        this.A = i;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final boolean T() {
        return this.g != null;
    }

    public /* synthetic */ atoc V() {
        return null;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInternalInterface
    public final int W() {
        return this.A;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInternalInterface
    public final void X(Canvas canvas) {
        onDraw(canvas);
        dispatchDraw(canvas);
        onDrawForeground(canvas);
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInternalInterface
    public final void Y(boolean z) {
        ar().c(this, z);
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInternalInterface
    public final void Z(GestureDetector gestureDetector) {
        n().d = gestureDetector;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final float a() {
        return this.b;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInternalInterface
    public final void aa(otb otbVar) {
        n().e = otbVar;
    }

    public boolean ab(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // defpackage.osw
    public final void aj(int i) {
        NodeTreeProcessor nodeTreeProcessor;
        if (!this.z || (nodeTreeProcessor = this.w) == null) {
            return;
        }
        nodeTreeProcessor.D(this.A, i);
    }

    public void al(int i) {
        throw new UnsupportedOperationException("Virtual views are not supported");
    }

    public void am(View view) {
        throw new UnsupportedOperationException("Virtual views are not supported");
    }

    public boolean ao() {
        return false;
    }

    protected final oph ap() {
        return aq().l();
    }

    public final NodeTreeProcessor aq() {
        NodeTreeProcessor nodeTreeProcessor = this.w;
        nodeTreeProcessor.getClass();
        return nodeTreeProcessor;
    }

    public final oyi ar() {
        if (this.B == null) {
            oyi oyiVar = new oyi();
            this.B = oyiVar;
            oyiVar.b = getAlpha();
            this.B.g(this, this.x);
        }
        return this.B;
    }

    public final String as() {
        NodeTreeProcessor nodeTreeProcessor;
        String str = this.e;
        if (str != null || (nodeTreeProcessor = this.w) == null) {
            return str;
        }
        String strAt = at(nodeTreeProcessor);
        this.e = strAt;
        return strAt;
    }

    public final String at(NodeTreeProcessor nodeTreeProcessor) {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String strP = nodeTreeProcessor.p(this.A);
        this.e = strP;
        return strP;
    }

    public final void au() {
        this.C = null;
    }

    public final /* synthetic */ void av(Canvas canvas) {
        super.draw(canvas);
    }

    public /* synthetic */ int b() {
        return nta.a(this);
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final int c() {
        return this.d;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final int d() {
        return this.A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return osy.c(this, this.A, this.w, false, motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        oyi oyiVar = this.B;
        if (oyiVar != null) {
            oyiVar.b(canvas, this, this.x, new oyl(this, 1));
        } else {
            super.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        oul oulVar = this.h;
        if (oulVar != null) {
            oulVar.u(getDrawableState(), f, f2);
        }
        ota otaVarN = n();
        otaVarN.g = f;
        otaVarN.h = f2;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        oul oulVar = this.h;
        if (oulVar == null || !T()) {
            return;
        }
        ota otaVarN = n();
        oulVar.u(getDrawableState(), otaVarN.g, otaVarN.h);
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final long g() {
        return this.y;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        if (osy.b(h(), this, rect)) {
            return;
        }
        super.getFocusedRect(rect);
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final ElementsServices h() {
        ElementsServices elementsServices = this.c;
        elementsServices.getClass();
        return elementsServices;
    }

    public int id() {
        throw new UnsupportedOperationException("Virtual views are not supported");
    }

    public View ie(int i) {
        throw new UnsupportedOperationException("Virtual views are not supported");
    }

    /* JADX INFO: renamed from: if */
    public void mo912if(View view, int i) {
        throw new UnsupportedOperationException("Virtual views are not supported");
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final int ig() {
        ArrayList arrayList = this.D;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public PaintUnit ih(int i) {
        PaintUnit paintUnitIh;
        oul oulVar = this.h;
        if (oulVar != null && this.A == i) {
            return oulVar;
        }
        ArrayList arrayList = this.D;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                PaintUnit paintUnitIh2 = (PaintUnit) arrayList.get(i2);
                if (paintUnitIh2.p() == i || ((paintUnitIh2 instanceof PaintUnitOwner) && (paintUnitIh2 = ((PaintUnitOwner) paintUnitIh2).ih(i)) != null)) {
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

    public void ii(PaintUnit paintUnit, int i) {
        ArrayList arrayList = this.D;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.D = arrayList;
        }
        arrayList.add(i, paintUnit);
        paintUnit.f(this);
    }

    public void ij(int i) {
        PaintUnit paintUnit = (PaintUnit) this.D.get(i);
        NodeTreeProcessor nodeTreeProcessor = this.w;
        if (nodeTreeProcessor != null) {
            D(paintUnit, nodeTreeProcessor, false);
        }
        this.D.remove(i);
    }

    public void ik(int i) {
        this.D.remove(i);
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
        oyi oyiVar = this.B;
        if (oyiVar != null) {
            oyiVar.d();
        }
    }

    public PaintUnit j(int i) {
        return (PaintUnit) this.D.get(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        oul oulVar = this.h;
        if (oulVar == null || !T()) {
            return;
        }
        ota otaVarN = n();
        oulVar.u(getDrawableState(), otaVarN.g, otaVarN.h);
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void k(Closeable closeable) {
        NodeTreeProcessor nodeTreeProcessor = this.w;
        if (nodeTreeProcessor != null) {
            nodeTreeProcessor.q(closeable);
        }
    }

    public void l(PaintUnit paintUnit) {
        ArrayList arrayList = this.D;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.D = arrayList;
        }
        arrayList.add(paintUnit);
        paintUnit.f(this);
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final NodeTreeProcessor m() {
        return this.w;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final ota n() {
        ota otaVar = this.g;
        if (otaVar != null) {
            return otaVar;
        }
        ota otaVar2 = new ota();
        this.g = otaVar2;
        return otaVar2;
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final oul o() {
        oul oulVar = this.h;
        if (oulVar != null) {
            return oulVar;
        }
        oul oulVar2 = new oul();
        this.h = oulVar2;
        oulVar2.h = this.x;
        oulVar2.l = this;
        return oulVar2;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
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
            otaVarN.b = new osz(rect2, this, this, rect2);
            ((View) parent).setTouchDelegate(otaVarN.b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (T()) {
            n().a(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        oul oulVar = this.h;
        if (oulVar != null) {
            oulVar.t(0, 0, getWidth(), getHeight());
            this.h.f = getClipToOutline();
            this.h.b(canvas);
        }
        ouv ouvVar = this.C;
        if (ouvVar != null) {
            ouvVar.t(0, 0, getWidth(), getHeight());
            this.C.b(canvas);
        }
        ArrayList arrayList = this.D;
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
        oum oumVar = this.i;
        if (oumVar != null) {
            oumVar.t(0, 0, getWidth(), getHeight());
            this.i.j = getClipToOutline();
            this.i.b(canvas);
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
        if (rbm.i(this.c) == null || bac.c(this) != null) {
            return super.onHoverEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getActionMasked();
        String.valueOf(T() ? n().e : null);
        oul oulVar = this.h;
        if (oulVar != null) {
            oulVar.u(getDrawableState(), motionEvent.getX(), motionEvent.getY());
        }
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        return T() ? zOnTouchEvent | n().c(this, motionEvent) : zOnTouchEvent;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final String p(NodeTreeProcessor nodeTreeProcessor) {
        String str = this.f;
        if (str != null) {
            return str;
        }
        String strO = nodeTreeProcessor.o(this.A);
        this.f = strO;
        return strO;
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

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (osy.d(h(), view2)) {
            return;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect, boolean z) {
        if (osy.d(h(), null)) {
            return false;
        }
        return super.requestRectangleOnScreen(rect, z);
    }

    public void s(boolean z) {
        opo opoVarK;
        ElementsServices elementsServices = this.c;
        ArrayList arrayList = null;
        if (elementsServices != null && elementsServices.K() != null) {
            arrayList = new ArrayList(getChildCount());
            for (int i = 0; i < getChildCount(); i++) {
                KeyEvent.Callback childAt = getChildAt(i);
                if (childAt instanceof NodeViewInterface) {
                    arrayList.add((NodeViewInterface) childAt);
                }
            }
        }
        removeAllViews();
        if (z) {
            invalidate();
        }
        f(false);
        if (arrayList == null || (opoVarK = this.c.K()) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            opoVarK.b((NodeViewInterface) arrayList.get(i2));
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        oyi oyiVar = this.B;
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
    public final void setBackgroundColor(int i) {
        o().g = i;
    }

    @Override // android.view.View
    public final void setRotation(float f) {
        super.setRotation(f);
        oyi oyiVar = this.B;
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
        oul oulVar = this.h;
        if (oulVar != null) {
            oulVar.g = 0;
        }
    }

    public void y() {
        f(true);
        this.w = null;
        this.x = 0.0f;
        this.i = null;
        this.y = 0L;
        this.z = false;
        this.g = null;
        this.A = 0;
        this.e = null;
        this.f = null;
        setContextClickable(false);
        setOnContextClickListener(null);
        setClickable(false);
        setLongClickable(false);
        oul oulVar = this.h;
        if (oulVar != null) {
            oulVar.v(null, null);
            oulVar.l = null;
            this.h = null;
        }
        au();
        this.j = false;
        oyi oyiVar = this.B;
        if (oyiVar != null) {
            oyiVar.a(this);
            this.B = null;
        }
        setLayerType(0, null);
        setClipToOutline(false);
        setBackground(null);
        if (getTransitionName() != null) {
            setTransitionName(null);
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final /* synthetic */ void z(Object obj) {
        nta.b(this, obj);
    }

    public /* synthetic */ void U() {
    }

    protected void ae() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
