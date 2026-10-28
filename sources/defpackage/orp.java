package defpackage;

import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class orp implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, otb {
    public static final /* synthetic */ int g = 0;
    public final osw a;
    public final long b;
    public final atcw c;
    public final orq d;
    public final ElementsServices e;
    public final oph f;
    private final NodeViewInterface h;
    private float i = 1.0f;

    public orp(osw oswVar, NodeViewInterface nodeViewInterface, long j, atcw atcwVar, orq orqVar, ElementsServices elementsServices, oph ophVar) {
        this.a = oswVar;
        this.h = nodeViewInterface;
        this.b = j;
        this.c = atcwVar;
        this.d = orqVar;
        this.e = elementsServices;
        this.f = ophVar;
    }

    public static orr a(ElementsServices elementsServices, oph ophVar) {
        orr orrVarB = ors.b();
        orrVarB.b(elementsServices.a());
        orrVarB.d = ophVar.e;
        Object obj = ophVar.c;
        if (obj != null) {
            orrVarB.b = obj;
        }
        agkj agkjVar = ophVar.d;
        orrVarB.c = ophVar.h;
        return orrVarB;
    }

    public static ors e(agfr agfrVar, mew mewVar, int i, int i2, ElementsServices elementsServices, oph ophVar, SparseArray sparseArray) {
        orr orrVarA = a(elementsServices, ophVar);
        orrVarA.g = mewVar;
        orrVarA.d(i);
        orrVarA.c(i2);
        orrVarA.a = agfrVar;
        orrVarA.e = sparseArray;
        return orrVarA.a();
    }

    private final float f(float f) {
        return (f / this.h.a()) + 0.5f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final orr g() {
        NodeViewInterface nodeViewInterface = this.h;
        orr orrVarA = a(this.e, this.f);
        orrVarA.e((View) nodeViewInterface);
        orrVarA.d(nodeViewInterface.d());
        orrVarA.c(nodeViewInterface.b());
        return orrVarA;
    }

    private final ors h(float f) {
        atdg atdgVarM;
        atds atdsVar = new atds(null);
        if (atdsVar.d) {
            atdsVar.d = false;
            atdsVar.bG();
        }
        atdsVar.bO(8, 1);
        atdsVar.bP(12, f);
        NodeViewInterface nodeViewInterface = this.h;
        atoc atocVarV = nodeViewInterface.V();
        if (atocVarV == null) {
            atocVarV = new atoc((byte[]) null);
        }
        mep mepVar = atdq.d;
        if (atdsVar.d) {
            atdsVar.bG();
        } else {
            atdsVar.d = true;
        }
        atocVarV.aS(mepVar, new atdq(atdsVar.b));
        NodeTreeProcessor nodeTreeProcessorM = nodeViewInterface.m();
        if (nodeTreeProcessorM != null && (atdgVarM = nodeTreeProcessorM.m(nodeViewInterface.d())) != null) {
            atocVarV.aS(atdg.d, atdgVarM);
        }
        orr orrVarG = g();
        orrVarG.g = atocVarV.aT();
        return orrVarG.a();
    }

    private final atdb i(MotionEvent motionEvent) {
        View view = (View) this.h;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float left = view.getLeft() + x + view.getTranslationX();
        float top = view.getTop() + y + view.getTranslationY();
        float f = iArr[0] + x;
        float f2 = iArr[1] + y;
        atcz atczVar = new atcz();
        atkp atkpVar = new atkp();
        atkpVar.aR(f(x));
        atkpVar.aS(f(y));
        atks atksVarAT = atkpVar.aT();
        if (atksVarAT != atczVar.h) {
            atczVar.h = atksVarAT;
            atczVar.e = true;
        }
        atkp atkpVar2 = new atkp();
        atkpVar2.aR(f(left));
        atkpVar2.aS(f(top));
        atks atksVarAT2 = atkpVar2.aT();
        if (atksVarAT2 != atczVar.i) {
            atczVar.i = atksVarAT2;
            atczVar.f = true;
        }
        atkp atkpVar3 = new atkp();
        atkpVar3.aR(f(f));
        atkpVar3.aS(f(f2));
        atks atksVarAT3 = atkpVar3.aT();
        if (atksVarAT3 != atczVar.j) {
            atczVar.j = atksVarAT3;
            atczVar.g = true;
        }
        if (atczVar.d) {
            atczVar.bG();
        } else {
            atczVar.d = true;
        }
        atdb atdbVar = new atdb(atczVar.b);
        if (atczVar.h != null) {
            atdbVar.h = atczVar.h;
            atdbVar.e = atczVar.e;
        }
        if (atczVar.i != null) {
            atdbVar.i = atczVar.i;
            atdbVar.f = atczVar.f;
        }
        if (atczVar.j != null) {
            atdbVar.j = atczVar.j;
            atdbVar.g = atczVar.g;
        }
        atdbVar.bJ();
        return atdbVar;
    }

    public final ors b(MotionEvent motionEvent, long j) {
        float x;
        float y;
        orr orrVarG = g();
        NodeViewInterface nodeViewInterface = this.h;
        NodeTreeProcessor nodeTreeProcessorM = nodeViewInterface.m();
        if (nodeTreeProcessorM != null) {
            if (motionEvent != null) {
                x = motionEvent.getX();
                y = motionEvent.getY();
            } else {
                x = 0.0f;
                y = 0.0f;
            }
            orrVarG.g = nodeTreeProcessorM.G(nodeViewInterface.d(), (int) j, x, y);
        }
        return orrVarG.a();
    }

    public final ors c(otd otdVar) {
        atdg atdgVarM;
        Float f = otdVar.b;
        double dFloatValue = 0.0d;
        if (f != null && otdVar.c != null) {
            dFloatValue = f.floatValue() - otdVar.c.floatValue();
        }
        float degrees = (float) Math.toDegrees(dFloatValue);
        atds atdsVar = new atds();
        if (atdsVar.d) {
            atdsVar.d = false;
            atdsVar.bG();
        }
        atdsVar.bO(8, 1);
        atdsVar.bP(12, degrees);
        NodeViewInterface nodeViewInterface = this.h;
        atoc atocVarV = nodeViewInterface.V();
        if (atocVarV == null) {
            atocVarV = new atoc((byte[]) null);
        }
        mep mepVar = atdw.d;
        if (atdsVar.d) {
            atdsVar.bG();
        } else {
            atdsVar.d = true;
        }
        atocVarV.aS(mepVar, new atdw(atdsVar.b));
        NodeTreeProcessor nodeTreeProcessorM = nodeViewInterface.m();
        if (nodeTreeProcessorM != null && (atdgVarM = nodeTreeProcessorM.m(nodeViewInterface.d())) != null) {
            atocVarV.aS(atdg.d, atdgVarM);
        }
        orr orrVarG = g();
        orrVarG.g = atocVarV.aT();
        return orrVarG.a();
    }

    public final boolean d(otd otdVar) {
        if ((this.b & 1048576) == 0) {
            return false;
        }
        orq orqVar = this.d;
        atcw atcwVar = this.c;
        if (atcwVar.m == null && (Memory.peekByte(atcwVar.c + 10) & 4) != 0) {
            atcwVar.m = new mew(atcwVar.cp(true != atcy.a ? 84 : 160, atcm.a));
        }
        orqVar.d(atcwVar.m == null ? atcl.a : atcwVar.m, c(otdVar));
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return (this.b & 16384) != 0;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if ((this.b & 16384) == 0) {
            return false;
        }
        if (motionEvent.getAction() != 1) {
            return true;
        }
        orq orqVar = this.d;
        atcw atcwVar = this.c;
        if (atcwVar.g == null && (Memory.peekByte(atcwVar.c + 9) & 32) != 0) {
            atcwVar.g = new mew(atcwVar.cp(true != atcy.a ? 64 : 120, atcm.a));
        }
        orqVar.d(atcwVar.g == null ? atcl.a : atcwVar.g, b(motionEvent, 16384L));
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if ((this.b & 128) != 0) {
            orq orqVar = this.d;
            atcw atcwVar = this.c;
            if (atcwVar.o == null) {
                if ((Memory.peekByte(atcwVar.c + 8) & 64) != 0) {
                    atcwVar.o = new mew(atcwVar.cp(true != atcy.a ? 36 : 64, atcm.a));
                }
            }
            orqVar.d(atcwVar.o == null ? atcl.a : atcwVar.o, b(motionEvent, 128L));
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        atdg atdgVarM;
        atdb atdbVarI;
        if ((this.b & 262144) == 0) {
            return false;
        }
        orq orqVar = this.d;
        atcw atcwVar = this.c;
        if (atcwVar.j == null && (Memory.peekByte(atcwVar.c + 10) & 1) != 0) {
            atcwVar.j = new mew(atcwVar.cp(true != atcy.a ? 76 : 144, atcm.a));
        }
        mew mewVar = atcwVar.j == null ? atcl.a : atcwVar.j;
        atdy atdyVar = new atdy();
        atdb atdbVarI2 = i(motionEvent2);
        if (atdbVarI2 != atdyVar.i) {
            atdyVar.i = atdbVarI2;
            atdyVar.f = true;
        }
        atkp atkpVar = new atkp();
        atkpVar.aR(f(f));
        atkpVar.aS(f(f2));
        atks atksVarAT = atkpVar.aT();
        if (atksVarAT != atdyVar.j) {
            atdyVar.j = atksVarAT;
            atdyVar.g = true;
        }
        if (motionEvent != null && (atdbVarI = i(motionEvent)) != atdyVar.h) {
            atdyVar.h = atdbVarI;
            atdyVar.e = true;
        }
        NodeViewInterface nodeViewInterface = this.h;
        atoc atocVarV = nodeViewInterface.V();
        if (atocVarV == null) {
            atocVarV = new atoc((byte[]) null);
        }
        mep mepVar = atec.d;
        if (atdyVar.d) {
            atdyVar.bG();
        } else {
            atdyVar.d = true;
        }
        atec atecVar = new atec(atdyVar.b);
        if (atdyVar.h != null) {
            atecVar.h = atdyVar.h;
            atecVar.e = atdyVar.e;
        }
        if (atdyVar.i != null) {
            atecVar.i = atdyVar.i;
            atecVar.f = atdyVar.f;
        }
        if (atdyVar.j != null) {
            atecVar.j = atdyVar.j;
            atecVar.g = atdyVar.g;
        }
        atecVar.bJ();
        atocVarV.aS(mepVar, atecVar);
        NodeTreeProcessor nodeTreeProcessorM = nodeViewInterface.m();
        if (nodeTreeProcessorM != null && (atdgVarM = nodeTreeProcessorM.m(nodeViewInterface.d())) != null) {
            atocVarV.aS(atdg.d, atdgVarM);
        }
        orr orrVarG = g();
        orrVarG.g = atocVarV.aT();
        orqVar.d(mewVar, orrVarG.a());
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if ((this.b & 4) != 0) {
            orq orqVar = this.d;
            atcw atcwVar = this.c;
            if (atcwVar.h == null && (Memory.peekByte(atcwVar.c + 8) & 2) != 0) {
                atcwVar.h = new mew(atcwVar.cp(true != atcy.a ? 16 : 24, atcm.a));
            }
            orqVar.d(atcwVar.h == null ? atcl.a : atcwVar.h, b(motionEvent, 4L));
            this.a.aj(4);
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.i *= scaleGestureDetector.getScaleFactor();
        if ((this.b & 524288) != 0) {
            orq orqVar = this.d;
            atcw atcwVar = this.c;
            if (atcwVar.k == null && (Memory.peekByte(atcwVar.c + 10) & 2) != 0) {
                atcwVar.k = new mew(atcwVar.cp(true != atcy.a ? 80 : 152, atcm.a));
            }
            orqVar.d(atcwVar.k == null ? atcl.a : atcwVar.k, h(this.i));
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.i = 1.0f;
        long j = this.b;
        return ((524288 & j) == 0 && (j & 2097152) == 0) ? false : true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        if ((this.b & 2097152) != 0) {
            orq orqVar = this.d;
            atcw atcwVar = this.c;
            if (atcwVar.l == null && (Memory.peekByte(atcwVar.c + 10) & 8) != 0) {
                atcwVar.l = new mew(atcwVar.cp(true != atcy.a ? 88 : 168, atcm.a));
            }
            orqVar.d(atcwVar.l == null ? atcl.a : atcwVar.l, h(this.i));
        }
        this.i = 1.0f;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        long j = this.b;
        if ((j & 65536) != 0) {
            orq orqVar = this.d;
            atcw atcwVar = this.c;
            if (atcwVar.p == null && (Memory.peekByte(atcwVar.c + 9) & 128) != 0) {
                atcwVar.p = new mew(atcwVar.cp(true != atcy.a ? 72 : 136, atcm.a));
            }
            orqVar.d(atcwVar.p == null ? atcl.a : atcwVar.p, b(motionEvent2, 65536L));
            z = true;
        } else {
            z = false;
        }
        if ((j & 16777216) == 0) {
            return z;
        }
        orq orqVar2 = this.d;
        atdm atdmVarAR = this.c.aR();
        if (atdmVarAR.d == null && (Memory.peekByte(atdmVarAR.c + 8) & 1) != 0) {
            atdmVarAR.d = new mew(atdmVarAR.cp(true != atdm.a ? 12 : 16, atcm.a));
        }
        orqVar2.d(atdmVarAR.d == null ? atcl.a : atdmVarAR.d, b(motionEvent2, 16777216L));
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if ((this.b & 2) == 0) {
            return false;
        }
        this.d.d(this.c.aT(), b(motionEvent, 2L));
        this.a.aj(2);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
