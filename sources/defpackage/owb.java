package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import androidx.core.widget.NestedScrollView;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class owb extends oyk implements opt {
    public final AtomicBoolean a;
    public final float b;
    owa c;
    public boolean d;
    public NestedScrollView e;
    public HorizontalScrollView f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public int k;
    atlz l;
    public final AtomicInteger m;
    private final Context n;
    private grj o;

    public owb(Context context, NodeTreeProcessor nodeTreeProcessor) {
        super(nodeTreeProcessor);
        this.a = new AtomicBoolean(false);
        this.m = new AtomicInteger(-1);
        this.n = context;
        this.b = nodeTreeProcessor.k().a();
    }

    private final boolean aw(atlz atlzVar) {
        if (atlzVar.aX() || atlzVar.aY()) {
            return true;
        }
        return Memory.peekByte(FlagServices.b().c + 102) != 0 && this.z;
    }

    private final atoc ax(View view, atks atksVar) {
        float f;
        HorizontalScrollView horizontalScrollView;
        NestedScrollView nestedScrollView;
        View childAt = this.c;
        if (childAt == null) {
            if (this.d && (nestedScrollView = this.e) != null && nestedScrollView.getChildCount() > 0) {
                childAt = this.e.getChildAt(0);
            } else if (!this.d && (horizontalScrollView = this.f) != null && horizontalScrollView.getChildCount() > 0) {
                childAt = this.f.getChildAt(0);
            }
        }
        atmx atmxVar = new atmx();
        float width = 0.0f;
        atmxVar.aS(childAt != null ? childAt.getWidth() / this.b : 0.0f);
        atmxVar.aR(childAt != null ? childAt.getHeight() / this.b : 0.0f);
        atna atnaVarAT = atmxVar.aT();
        float fIntBitsToFloat = view.getLayoutDirection() == 0 ? Float.intBitsToFloat(Memory.peekInt(atksVar.c + 12, false)) : (Float.intBitsToFloat(Memory.peekInt(atnaVarAT.c + 12, false)) - (view.getMeasuredWidth() / this.b)) - Float.intBitsToFloat(Memory.peekInt(atksVar.c + 12, false));
        atlo atloVar = new atlo();
        if (atksVar != atloVar.g) {
            atloVar.g = atksVar;
            atloVar.e = true;
        }
        if (atnaVarAT != atloVar.h) {
            atloVar.h = atnaVarAT;
            atloVar.f = true;
        }
        atloVar.aT();
        atloVar.bO(8, 4);
        atloVar.bP(true != atlo.a ? 20 : 12, fIntBitsToFloat);
        if (atloVar.d) {
            atloVar.bG();
        } else {
            atloVar.d = true;
        }
        atls atlsVar = new atls(atloVar.b);
        if (atloVar.g != null) {
            atlsVar.g = atloVar.g;
            atlsVar.e = atloVar.e;
        }
        if (atloVar.h != null) {
            atlsVar.h = atloVar.h;
            atlsVar.f = atloVar.f;
        }
        atlsVar.bJ();
        Point pointA = nut.a(view);
        Point point = new Point(0, 0);
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            width = view2.getWidth();
            float height = view2.getHeight();
            point = nut.a(view2);
            f = height;
        } else {
            f = 0.0f;
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        atdc atdcVar = new atdc();
        atef atefVar = new atef();
        atmx atmxVar2 = new atmx();
        float measuredWidth = view.getMeasuredWidth();
        float f2 = this.b;
        atmxVar2.aS(measuredWidth / f2);
        atmxVar2.aR(view.getMeasuredHeight() / f2);
        atefVar.aV(atmxVar2.aT());
        atkp atkpVar = new atkp();
        atkpVar.aR(pointA.x / f2);
        atkpVar.aS(pointA.y / f2);
        atefVar.aU(atkpVar.aT());
        atei ateiVarAT = atefVar.aT();
        if (ateiVarAT != atdcVar.h) {
            atdcVar.h = ateiVarAT;
            atdcVar.e = true;
        }
        atef atefVar2 = new atef();
        atmx atmxVar3 = new atmx();
        atmxVar3.aS(width / f2);
        atmxVar3.aR(f / f2);
        atefVar2.aV(atmxVar3.aT());
        atkp atkpVar2 = new atkp();
        atkpVar2.aR(point.x / f2);
        atkpVar2.aS(point.y / f2);
        atefVar2.aU(atkpVar2.aT());
        atei ateiVarAT2 = atefVar2.aT();
        if (ateiVarAT2 != atdcVar.i) {
            atdcVar.i = ateiVarAT2;
            atdcVar.f = true;
        }
        atef atefVar3 = new atef();
        atmx atmxVar4 = new atmx();
        atmxVar4.aS(rect.width() / f2);
        atmxVar4.aR(rect.height() / f2);
        atefVar3.aV(atmxVar4.aT());
        atei ateiVarAT3 = atefVar3.aT();
        if (ateiVarAT3 != atdcVar.j) {
            atdcVar.j = ateiVarAT3;
            atdcVar.g = true;
        }
        if (atdcVar.d) {
            atdcVar.bG();
        } else {
            atdcVar.d = true;
        }
        atdg atdgVar = new atdg(atdcVar.b);
        if (atdcVar.h != null) {
            atdgVar.h = atdcVar.h;
            atdgVar.e = atdcVar.e;
        }
        if (atdcVar.i != null) {
            atdgVar.i = atdcVar.i;
            atdgVar.f = atdcVar.f;
        }
        if (atdcVar.j != null) {
            atdgVar.j = atdcVar.j;
            atdgVar.g = atdcVar.g;
        }
        atdgVar.bJ();
        atoc atocVar = new atoc((byte[]) null);
        atocVar.aS(atls.d, atlsVar);
        atocVar.aS(atdg.d, atdgVar);
        return atocVar;
    }

    private final grj ay() {
        grj grjVar = this.o;
        if (grjVar != null) {
            return grjVar;
        }
        grj grjVar2 = new grj((opt) this);
        this.o = grjVar2;
        return grjVar2;
    }

    @Override // defpackage.oyk, com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void B(NodeTreeProcessor nodeTreeProcessor) {
        super.B(nodeTreeProcessor);
        owa owaVar = this.c;
        if (owaVar != null) {
            owaVar.B(nodeTreeProcessor);
        }
    }

    @Override // defpackage.opt
    public final boolean D(int i, int i2) {
        NodeTreeProcessor nodeTreeProcessor = this.w;
        if (nodeTreeProcessor != null) {
            return nodeTreeProcessor.B(i, i2);
        }
        return false;
    }

    @Override // defpackage.opt
    public final /* synthetic */ void J(asut asutVar) {
        nul.a(this, asutVar);
    }

    @Override // defpackage.opt
    public final void K(asvc asvcVar, grj grjVar) {
        View viewF = f();
        if (viewF != null) {
            grj grjVarAy = ay();
            if (rbm.i(h()) != null) {
                ((rbm) grjVarAy.a).g(viewF, new opr(viewF.getContext(), viewF, asvcVar, grjVar));
            }
        }
    }

    @Override // defpackage.oyk, com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void S(int i) {
        this.A = i;
        owa owaVar = this.c;
        if (owaVar != null) {
            owaVar.A = i;
        }
    }

    @Override // defpackage.oyk, com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final atoc V() {
        View viewF = f();
        if (viewF == null) {
            return null;
        }
        atkp atkpVar = new atkp();
        float scrollX = viewF.getScrollX();
        float f = this.b;
        atkpVar.aR(scrollX / f);
        atkpVar.aS(viewF.getScrollY() / f);
        return ax(viewF, atkpVar.aT());
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        owa owaVar = this.c;
        if (owaVar != null) {
            owaVar.addView(view, i);
        } else {
            super.addView(view, i);
        }
    }

    @Override // defpackage.oyk
    protected final void ae() {
        atlz atlzVar;
        if (Memory.peekByte(FlagServices.b().c + 102) == 0 || (atlzVar = this.l) == null) {
            return;
        }
        owb owbVar = true != aw(atlzVar) ? null : this;
        NestedScrollView nestedScrollView = this.e;
        if (nestedScrollView instanceof ovw) {
            ((ovw) nestedScrollView).y(owbVar);
        }
        HorizontalScrollView horizontalScrollView = this.f;
        if (horizontalScrollView instanceof ovv) {
            ((ovv) horizontalScrollView).a(owbVar);
        }
    }

    public final ors af(View view) {
        orr orrVarB = ors.b();
        orrVarB.e(view);
        atkp atkpVar = new atkp();
        float scrollX = view.getScrollX();
        float f = this.b;
        atkpVar.aR(scrollX / f);
        atkpVar.aS(view.getScrollY() / f);
        orrVarB.g = ax(view, atkpVar.aT()).aT();
        return orrVarB.a();
    }

    final void ag(atlz atlzVar) {
        int i;
        long j = atlzVar.c;
        int i2 = 0;
        this.i = Memory.peekByte(11 + j) != 0;
        this.j = Memory.peekByte(10 + j) != 0;
        int iPeekInt = Memory.peekInt(j + (true != atmi.a ? 36L : 16L), false);
        if (iPeekInt == 0) {
            i = 1;
        } else if (iPeekInt == 1) {
            i = 2;
        } else if (iPeekInt != 2) {
            i = iPeekInt != 3 ? 0 : 4;
        } else {
            i = 3;
        }
        if (i == 0) {
            i = 1;
        }
        int i3 = i - 1;
        if (i3 == 1) {
            i2 = 2;
        } else if (i3 != 3) {
            i2 = 1;
        }
        this.k = i2;
    }

    public final void ai(int i, int i2) {
        View view = this.d ? this.e : this.f;
        if (view == null || getChildCount() == 0) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = (i - paddingLeft) - getPaddingRight();
        int paddingBottom = (i2 - paddingTop) - getPaddingBottom();
        if (paddingRight < 0 || paddingBottom < 0) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        view.layout(paddingLeft, paddingTop, paddingRight + paddingLeft, paddingBottom + paddingTop);
    }

    public final void ak(View view, int i) {
        atlz atlzVar = this.l;
        if (i == 0) {
            if (atlzVar == null || !atlzVar.aX()) {
                return;
            }
            h().l().d(atlzVar.ba(), af(view));
            return;
        }
        if (atlzVar != null && atlzVar.aY()) {
            h().l().d(atlzVar.bb(), af(view));
        }
        if (Memory.peekByte(FlagServices.b().c + 102) != 0) {
            aj(3);
        }
        boolean z = this.d;
        AtomicInteger atomicInteger = this.m;
        if (z) {
            atomicInteger.set(view.getScrollY());
        } else {
            atomicInteger.set(view.getScrollX());
        }
    }

    @Override // defpackage.oyk
    public final void al(int i) {
        owa owaVar = this.c;
        if (owaVar != null) {
            owaVar.removeViewAt(i);
        } else {
            removeViewAt(i);
        }
    }

    @Override // defpackage.oyk
    public final void am(View view) {
        owa owaVar = this.c;
        if (owaVar != null) {
            owaVar.removeView(view);
        } else {
            removeView(view);
        }
    }

    public final void an(atlz atlzVar) {
        owa owaVar;
        float f;
        final mew mewVarAZ;
        if (Memory.peekByte(FlagServices.b().c + 51) != 0) {
            View view = this.e;
            if (view != null) {
                super.removeView(view);
                this.e = null;
            }
            View view2 = this.f;
            if (view2 != null) {
                super.removeView(view2);
                this.f = null;
            }
        } else {
            View view3 = this.d ? this.e : this.f;
            if (view3 != null) {
                super.removeView(view3);
            }
        }
        owa owaVar2 = this.c;
        if (owaVar2 == null) {
            owa owaVar3 = new owa(aq());
            this.c = owaVar3;
            owaVar3.A = this.A;
        } else {
            ViewParent parent = owaVar2.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.c);
            }
        }
        setFocusable(true);
        ag(atlzVar);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        if ((atlzVar.j != null || (Memory.peekByte(atlzVar.c + 8) & 4) != 0) && (owaVar = this.c) != null) {
            owaVar.a = true;
            atna atnaVarBc = atlzVar.bc();
            if (Float.intBitsToFloat(Memory.peekInt(atnaVarBc.c + 12, false)) > 0.5d) {
                float fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(atnaVarBc.c + 12, false)) * this.b;
                f = 0.0f;
                double d = fIntBitsToFloat;
                layoutParams.width = (int) (fIntBitsToFloat > 0.0f ? d + 0.5d : d - 0.5d);
                owaVar.b = layoutParams.width;
            } else {
                f = 0.0f;
            }
            if (Float.intBitsToFloat(Memory.peekInt(atnaVarBc.c + 16, false)) > 0.5d) {
                float fIntBitsToFloat2 = Float.intBitsToFloat(Memory.peekInt(atnaVarBc.c + 16, false)) * this.b;
                double d2 = fIntBitsToFloat2;
                layoutParams.height = (int) (fIntBitsToFloat2 > f ? d2 + 0.5d : d2 - 0.5d);
                owaVar.c = layoutParams.height;
            }
        }
        if (this.d) {
            ovw ovwVar = new ovw(this.n);
            ovwVar.k(true);
            ovwVar.setClipToOutline(true);
            ovwVar.setOutlineProvider(ViewOutlineProvider.BOUNDS);
            owa owaVar4 = this.c;
            if (owaVar4 != null) {
                ovwVar.addView(owaVar4, layoutParams);
            }
            mewVarAZ = atlzVar.aW() ? atlzVar.aZ() : null;
            ovwVar.d = new bdb() { // from class: ovy
                @Override // defpackage.bdb
                public final void a(NestedScrollView nestedScrollView, int i, int i2) {
                    owb owbVar = this.a;
                    mew mewVar = mewVarAZ;
                    if (mewVar != null) {
                        owbVar.h().l().d(mewVar, owbVar.af(nestedScrollView));
                    }
                    NodeTreeProcessor nodeTreeProcessor = owbVar.w;
                    if (nodeTreeProcessor != null) {
                        nodeTreeProcessor.z(owbVar.A, i, i2);
                    }
                }
            };
            if (aw(atlzVar)) {
                ovwVar.y(this);
            }
            this.e = ovwVar;
            super.addView(ovwVar, 0, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        mewVarAZ = atlzVar.aW() ? atlzVar.aZ() : null;
        ovv ovvVar = new ovv(this.n);
        ovvVar.setFillViewport(true);
        ovvVar.setClipToOutline(true);
        ovvVar.setOutlineProvider(ViewOutlineProvider.BOUNDS);
        owa owaVar5 = this.c;
        if (owaVar5 != null) {
            ovvVar.addView(owaVar5, layoutParams);
        }
        ovvVar.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: ovz
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view4, int i, int i2, int i3, int i4) {
                owb owbVar = this.a;
                mew mewVar = mewVarAZ;
                if (mewVar != null) {
                    owbVar.h().l().d(mewVar, owbVar.af(view4));
                }
                NodeTreeProcessor nodeTreeProcessor = owbVar.w;
                if (nodeTreeProcessor != null) {
                    nodeTreeProcessor.z(owbVar.A, i, i2);
                }
            }
        });
        if (aw(atlzVar)) {
            ovvVar.a(this);
        }
        this.f = ovvVar;
        super.addView(ovvVar, 0, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // defpackage.oyk
    public final boolean ao() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return ((rbm) ay().a).h(motionEvent);
    }

    @Override // defpackage.oyk, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return ab(motionEvent);
    }

    @Override // defpackage.opt
    public final View f() {
        return this.d ? this.e : this.f;
    }

    @Override // defpackage.oyk
    public final int id() {
        owa owaVar = this.c;
        return owaVar != null ? owaVar.getChildCount() : getChildCount();
    }

    @Override // defpackage.oyk
    public final View ie(int i) {
        owa owaVar = this.c;
        return owaVar != null ? owaVar.getChildAt(i) : super.ie(i);
    }

    @Override // defpackage.oyk
    /* JADX INFO: renamed from: if, reason: not valid java name */
    public final void mo912if(View view, int i) {
        owa owaVar = this.c;
        if (owaVar != null) {
            int childCount = owaVar.getChildCount();
            if (i < 0 || i > childCount) {
                this.c.addView(view);
                return;
            } else {
                this.c.addView(view, i);
                return;
            }
        }
        int childCount2 = getChildCount();
        if (i < 0 || i > childCount2) {
            addView(view);
        } else {
            addView(view, i);
        }
    }

    @Override // defpackage.oyk, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final PaintUnit ih(int i) {
        owa owaVar = this.c;
        return owaVar != null ? owaVar.ih(i) : super.ih(i);
    }

    @Override // defpackage.oyk, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void ii(PaintUnit paintUnit, int i) {
        owa owaVar = this.c;
        if (owaVar != null) {
            owaVar.ii(paintUnit, i);
        } else {
            super.ii(paintUnit, i);
        }
    }

    @Override // defpackage.oyk, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void ij(int i) {
        owa owaVar = this.c;
        if (owaVar != null) {
            owaVar.ij(i);
        } else {
            super.ij(i);
        }
    }

    @Override // defpackage.oyk, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void ik(int i) {
        owa owaVar = this.c;
        if (owaVar != null) {
            owaVar.ik(i);
        } else {
            super.ik(i);
        }
    }

    @Override // defpackage.oyk, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final PaintUnit j(int i) {
        owa owaVar = this.c;
        return owaVar != null ? (PaintUnit) owaVar.D.get(i) : (PaintUnit) this.D.get(i);
    }

    @Override // defpackage.oyk, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void l(PaintUnit paintUnit) {
        owa owaVar = this.c;
        if (owaVar != null) {
            owaVar.l(paintUnit);
        } else {
            super.l(paintUnit);
        }
    }

    @Override // defpackage.oyk, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        grj grjVar;
        super.onDetachedFromWindow();
        View viewF = f();
        if (viewF == null || (grjVar = this.o) == null) {
            return;
        }
        ((rbm) grjVar.a).f(viewF);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        owa owaVar = this.c;
        if (owaVar != null) {
            owaVar.removeView(view);
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        AtomicBoolean atomicBoolean = this.a;
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        post(new ooz(this, 15));
    }

    @Override // defpackage.oyk, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void s(boolean z) {
        byte bPeekByte = Memory.peekByte(FlagServices.b().c + 51);
        owa owaVar = this.c;
        if (bPeekByte == 0) {
            if (owaVar != null) {
                owaVar.s(z);
            }
            super.s(z);
        } else if (owaVar != null) {
            owaVar.s(z);
        } else {
            super.s(z);
        }
    }

    @Override // defpackage.oyk, com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void t(int i, int i2, int i3, int i4) {
        super.t(i, i2, i3, i4);
        ai(i3 - i, i4 - i2);
    }

    @Override // defpackage.oyk, com.google.android.libraries.multiplatform.elements.NodeViewInterface
    public final void y() {
        AtomicInteger atomicInteger = this.m;
        int i = atomicInteger.get();
        aihf aihfVarCreateBuilder = mqu.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        mqu mquVar = (mqu) aihfVarCreateBuilder.instance;
        mquVar.c |= 1;
        mquVar.d = i;
        mqu mquVar2 = (mqu) aihfVarCreateBuilder.build();
        NodeTreeProcessor nodeTreeProcessor = this.w;
        if (nodeTreeProcessor != null) {
            aihh aihhVar = (aihh) mqt.a.createBuilder();
            aihhVar.e(mqu.b, mquVar2);
            nodeTreeProcessor.y(this, (mqt) aihhVar.build());
        }
        if (Memory.peekByte(FlagServices.b().c + 102) != 0) {
            atomicInteger.set(-1);
            this.h = 0;
            this.g = 0;
        }
        if (Memory.peekByte(FlagServices.b().c + 51) != 0) {
            owa owaVar = this.c;
            if (owaVar != null) {
                owaVar.y();
            }
        } else {
            this.c = null;
            this.e = null;
            this.f = null;
        }
        this.l = null;
        super.y();
    }

    @Override // defpackage.opt
    public final /* synthetic */ void I(asuy asuyVar) {
    }
}
