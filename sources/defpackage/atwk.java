package defpackage;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atwk implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {
    private float a = 0.0f;
    private float b = 0.0f;
    private float c = 0.0f;
    private final atwh d = new atwh();
    private final HashMap e = new HashMap();
    private final atwg f = new atwg();
    private int g = 1;
    private int h = 1;
    private final atwj i;

    public atwk(atwj atwjVar) {
        this.i = atwjVar;
    }

    private final atsr a(float f, float f2) {
        PointF pointF = new PointF(f, f2);
        b(pointF);
        return c(pointF);
    }

    private final void b(PointF pointF) {
        pointF.x /= this.g;
        pointF.y /= this.h;
    }

    private static final atsr c(PointF pointF) {
        aihf aihfVarCreateBuilder = atsr.a.createBuilder();
        double d = pointF.x;
        aihfVarCreateBuilder.copyOnWrite();
        ((atsr) aihfVarCreateBuilder.instance).b = d;
        double d2 = pointF.y;
        aihfVarCreateBuilder.copyOnWrite();
        ((atsr) aihfVarCreateBuilder.instance).c = d2;
        return (atsr) aihfVarCreateBuilder.build();
    }

    private final void d(int i, MotionEvent motionEvent) {
        aihf aihfVarCreateBuilder = atxe.a.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(motionEvent.getEventTime());
        aihfVarCreateBuilder.copyOnWrite();
        ((atxe) aihfVarCreateBuilder.instance).g = micros;
        aihfVarCreateBuilder.copyOnWrite();
        ((atxe) aihfVarCreateBuilder.instance).f = i - 2;
        atsr atsrVarA = a(motionEvent.getX(), motionEvent.getY());
        aihfVarCreateBuilder.copyOnWrite();
        atxe atxeVar = (atxe) aihfVarCreateBuilder.instance;
        atsrVarA.getClass();
        atxeVar.e = atsrVarA;
        atxeVar.b |= 1;
        int pointerCount = motionEvent.getPointerCount();
        aihfVarCreateBuilder.copyOnWrite();
        ((atxe) aihfVarCreateBuilder.instance).c = pointerCount;
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            atsr atsrVarA2 = a(motionEvent.getX(i2), motionEvent.getY(i2));
            aihfVarCreateBuilder.copyOnWrite();
            atxe atxeVar2 = (atxe) aihfVarCreateBuilder.instance;
            atsrVarA2.getClass();
            aiie aiieVar = atxeVar2.d;
            if (!aiieVar.c()) {
                atxeVar2.d = aihn.mutableCopy(aiieVar);
            }
            atxeVar2.d.add(atsrVarA2);
        }
        atwj atwjVar = this.i;
        aihf aihfVarCreateBuilder2 = atxd.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        atxd atxdVar = (atxd) aihfVarCreateBuilder2.instance;
        atxe atxeVar3 = (atxe) aihfVarCreateBuilder.build();
        atxeVar3.getClass();
        atxdVar.c = atxeVar3;
        atxdVar.b = 6;
        atwjVar.b((atxd) aihfVarCreateBuilder2.build());
    }

    private final void e(int i, ScaleGestureDetector scaleGestureDetector) {
        if (i == 3) {
            this.a = scaleGestureDetector.getCurrentSpan() / scaleGestureDetector.getPreviousSpan();
        } else {
            this.a += (scaleGestureDetector.getCurrentSpan() / scaleGestureDetector.getPreviousSpan()) - 1.0f;
        }
        float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
        atsr atsrVarA = a(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        atwj atwjVar = this.i;
        aihf aihfVarCreateBuilder = atxd.a.createBuilder();
        aihf aihfVarCreateBuilder2 = atxg.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ((atxg) aihfVarCreateBuilder2.instance).f = i - 2;
        double d = this.a;
        aihfVarCreateBuilder2.copyOnWrite();
        ((atxg) aihfVarCreateBuilder2.instance).c = d;
        aihfVarCreateBuilder2.copyOnWrite();
        ((atxg) aihfVarCreateBuilder2.instance).d = currentSpan;
        aihfVarCreateBuilder2.copyOnWrite();
        atxg atxgVar = (atxg) aihfVarCreateBuilder2.instance;
        atsrVarA.getClass();
        atxgVar.e = atsrVarA;
        atxgVar.b |= 1;
        long micros = TimeUnit.MILLISECONDS.toMicros(scaleGestureDetector.getEventTime());
        aihfVarCreateBuilder2.copyOnWrite();
        ((atxg) aihfVarCreateBuilder2.instance).g = micros;
        aihfVarCreateBuilder.copyOnWrite();
        atxd atxdVar = (atxd) aihfVarCreateBuilder.instance;
        atxg atxgVar2 = (atxg) aihfVarCreateBuilder2.build();
        atxgVar2.getClass();
        atxdVar.c = atxgVar2;
        atxdVar.b = 2;
        atwjVar.b((atxd) aihfVarCreateBuilder.build());
    }

    private final void f(int i, MotionEvent motionEvent, float f, float f2) {
        if (i == 3) {
            this.b = 0.0f;
            this.c = 0.0f;
        }
        this.b -= f;
        this.c -= f2;
        aihf aihfVarCreateBuilder = atxf.a.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(motionEvent.getEventTime());
        aihfVarCreateBuilder.copyOnWrite();
        ((atxf) aihfVarCreateBuilder.instance).g = micros;
        aihfVarCreateBuilder.copyOnWrite();
        ((atxf) aihfVarCreateBuilder.instance).f = i - 2;
        PointF pointF = new PointF(this.b, this.c);
        b(pointF);
        PointF pointF2 = new PointF(0.0f, 0.0f);
        pointF.x -= pointF2.x;
        pointF.y -= pointF2.y;
        atsr atsrVarC = c(pointF);
        aihfVarCreateBuilder.copyOnWrite();
        atxf atxfVar = (atxf) aihfVarCreateBuilder.instance;
        atsrVarC.getClass();
        atxfVar.e = atsrVarC;
        atxfVar.b |= 1;
        int pointerCount = motionEvent.getPointerCount();
        aihfVarCreateBuilder.copyOnWrite();
        ((atxf) aihfVarCreateBuilder.instance).c = pointerCount;
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            atsr atsrVarA = a(motionEvent.getX(i2), motionEvent.getY(i2));
            aihfVarCreateBuilder.copyOnWrite();
            atxf atxfVar2 = (atxf) aihfVarCreateBuilder.instance;
            atsrVarA.getClass();
            aiie aiieVar = atxfVar2.d;
            if (!aiieVar.c()) {
                atxfVar2.d = aihn.mutableCopy(aiieVar);
            }
            atxfVar2.d.add(atsrVarA);
        }
        atwj atwjVar = this.i;
        aihf aihfVarCreateBuilder2 = atxd.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        atxd atxdVar = (atxd) aihfVarCreateBuilder2.instance;
        atxf atxfVar3 = (atxf) aihfVarCreateBuilder.build();
        atxfVar3.getClass();
        atxdVar.c = atxfVar3;
        atxdVar.b = 7;
        atwjVar.b((atxd) aihfVarCreateBuilder2.build());
        if (i == 5) {
            this.b = 0.0f;
            this.c = 0.0f;
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        aihf aihfVarCreateBuilder = atxc.a.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(motionEvent.getEventTime());
        aihfVarCreateBuilder.copyOnWrite();
        ((atxc) aihfVarCreateBuilder.instance).f = micros;
        atsr atsrVarA = a(motionEvent.getX(), motionEvent.getY());
        aihfVarCreateBuilder.copyOnWrite();
        atxc atxcVar = (atxc) aihfVarCreateBuilder.instance;
        atsrVarA.getClass();
        atxcVar.e = atsrVarA;
        atxcVar.b |= 1;
        int pointerCount = motionEvent.getPointerCount();
        aihfVarCreateBuilder.copyOnWrite();
        ((atxc) aihfVarCreateBuilder.instance).c = pointerCount;
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            atsr atsrVarA2 = a(motionEvent.getX(i), motionEvent.getY(i));
            aihfVarCreateBuilder.copyOnWrite();
            atxc atxcVar2 = (atxc) aihfVarCreateBuilder.instance;
            atsrVarA2.getClass();
            aiie aiieVar = atxcVar2.d;
            if (!aiieVar.c()) {
                atxcVar2.d = aihn.mutableCopy(aiieVar);
            }
            atxcVar2.d.add(atsrVarA2);
        }
        atwj atwjVar = this.i;
        aihf aihfVarCreateBuilder2 = atxd.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        atxd atxdVar = (atxd) aihfVarCreateBuilder2.instance;
        atxc atxcVar3 = (atxc) aihfVarCreateBuilder.build();
        atxcVar3.getClass();
        atxdVar.c = atxcVar3;
        atxdVar.b = 5;
        atwjVar.b((atxd) aihfVarCreateBuilder2.build());
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        if (motionEvent != null) {
            float fAbs = Math.abs(f2 != 0.0f ? f / f2 : f);
            float fAbs2 = Math.abs(f != 0.0f ? f2 / f : f2);
            if (fAbs > fAbs2) {
                i = f < 0.0f ? 4 : 3;
            } else if (fAbs < fAbs2) {
                i = f2 < 0.0f ? 6 : 5;
            }
            aihf aihfVarCreateBuilder = atxi.a.createBuilder();
            long micros = TimeUnit.MILLISECONDS.toMicros(motionEvent2.getEventTime());
            aihfVarCreateBuilder.copyOnWrite();
            ((atxi) aihfVarCreateBuilder.instance).g = micros;
            aihfVarCreateBuilder.copyOnWrite();
            ((atxi) aihfVarCreateBuilder.instance).c = i - 2;
            atsr atsrVarA = a(motionEvent.getX(), motionEvent.getY());
            aihfVarCreateBuilder.copyOnWrite();
            atxi atxiVar = (atxi) aihfVarCreateBuilder.instance;
            atsrVarA.getClass();
            atxiVar.f = atsrVarA;
            atxiVar.b |= 1;
            int pointerCount = motionEvent.getPointerCount();
            aihfVarCreateBuilder.copyOnWrite();
            ((atxi) aihfVarCreateBuilder.instance).d = pointerCount;
            for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
                atsr atsrVarA2 = a(motionEvent.getX(i2), motionEvent.getY(i2));
                aihfVarCreateBuilder.copyOnWrite();
                atxi atxiVar2 = (atxi) aihfVarCreateBuilder.instance;
                atsrVarA2.getClass();
                aiie aiieVar = atxiVar2.e;
                if (!aiieVar.c()) {
                    atxiVar2.e = aihn.mutableCopy(aiieVar);
                }
                atxiVar2.e.add(atsrVarA2);
            }
            atwj atwjVar = this.i;
            aihf aihfVarCreateBuilder2 = atxd.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            atxd atxdVar = (atxd) aihfVarCreateBuilder2.instance;
            atxi atxiVar3 = (atxi) aihfVarCreateBuilder.build();
            atxiVar3.getClass();
            atxdVar.c = atxiVar3;
            atxdVar.b = 1;
            atwjVar.b((atxd) aihfVarCreateBuilder2.build());
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        atwg atwgVar = this.f;
        atwgVar.a = true;
        atwgVar.b = motionEvent.getActionIndex();
        d(3, motionEvent);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        e(4, scaleGestureDetector);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        e(3, scaleGestureDetector);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        e(5, scaleGestureDetector);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        if (motionEvent == null) {
            return false;
        }
        atwh atwhVar = this.d;
        if (atwhVar.a) {
            i = 4;
        } else {
            atwhVar.a = true;
            i = 3;
        }
        f(i, motionEvent2, f, f2);
        atwhVar.b = motionEvent;
        atwhVar.c = motionEvent2;
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        aihf aihfVarCreateBuilder = atxj.a.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(motionEvent.getEventTime());
        aihfVarCreateBuilder.copyOnWrite();
        ((atxj) aihfVarCreateBuilder.instance).f = micros;
        atsr atsrVarA = a(motionEvent.getX(), motionEvent.getY());
        aihfVarCreateBuilder.copyOnWrite();
        atxj atxjVar = (atxj) aihfVarCreateBuilder.instance;
        atsrVarA.getClass();
        atxjVar.e = atsrVarA;
        atxjVar.b |= 1;
        int pointerCount = motionEvent.getPointerCount();
        aihfVarCreateBuilder.copyOnWrite();
        ((atxj) aihfVarCreateBuilder.instance).c = pointerCount;
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            atsr atsrVarA2 = a(motionEvent.getX(i), motionEvent.getY(i));
            aihfVarCreateBuilder.copyOnWrite();
            atxj atxjVar2 = (atxj) aihfVarCreateBuilder.instance;
            atsrVarA2.getClass();
            aiie aiieVar = atxjVar2.d;
            if (!aiieVar.c()) {
                atxjVar2.d = aihn.mutableCopy(aiieVar);
            }
            atxjVar2.d.add(atsrVarA2);
        }
        atwj atwjVar = this.i;
        aihf aihfVarCreateBuilder2 = atxd.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        atxd atxdVar = (atxd) aihfVarCreateBuilder2.instance;
        atxj atxjVar3 = (atxj) aihfVarCreateBuilder.build();
        atxjVar3.getClass();
        atxdVar.c = atxjVar3;
        atxdVar.b = 4;
        atwjVar.b((atxd) aihfVarCreateBuilder2.build());
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int width = view.getWidth();
        int height = view.getHeight();
        this.g = width;
        this.h = height;
        int actionMasked = motionEvent.getActionMasked();
        int i2 = 3;
        if (actionMasked == 0) {
            i = 3;
        } else {
            if (actionMasked == 1) {
                atwh atwhVar = this.d;
                if (atwhVar.a && motionEvent.getActionIndex() == ((MotionEvent) atwhVar.c).getActionIndex()) {
                    atwhVar.c = motionEvent;
                    f(5, (MotionEvent) atwhVar.c, 0.0f, 0.0f);
                    atwhVar.a = false;
                }
                atwg atwgVar = this.f;
                if (atwgVar.a && motionEvent.getActionIndex() == atwgVar.b) {
                    d(5, motionEvent);
                    atwgVar.a = false;
                }
            } else if (actionMasked == 2) {
                atwg atwgVar2 = this.f;
                if (atwgVar2.a && motionEvent.getActionIndex() == atwgVar2.b) {
                    d(4, motionEvent);
                }
                i = 4;
            } else if (actionMasked == 5) {
                i = 3;
            } else if (actionMasked != 6) {
                return false;
            }
            i = 5;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float x = motionEvent.getX(actionIndex);
        float y = motionEvent.getY(actionIndex);
        HashMap map = this.e;
        Integer numValueOf = Integer.valueOf(pointerId);
        atwi atwiVar = (atwi) map.get(numValueOf);
        if (i == 5) {
            map.remove(numValueOf);
            i2 = i;
        } else if (atwiVar != null) {
            if (i == 4) {
                i2 = (Math.abs(x - atwiVar.a) >= 1.0f || Math.abs(y - atwiVar.b) >= 1.0f) ? 4 : 3;
                return true;
            }
            atwiVar.a = x;
            atwiVar.b = y;
        } else {
            if (i == 4) {
                return false;
            }
            atwiVar = new atwi();
            atwiVar.a = motionEvent.getX(actionIndex);
            atwiVar.b = motionEvent.getY(actionIndex);
            map.put(numValueOf, atwiVar);
        }
        aihf aihfVarCreateBuilder = atxk.a.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(motionEvent.getEventTime());
        aihfVarCreateBuilder.copyOnWrite();
        ((atxk) aihfVarCreateBuilder.instance).h = micros;
        aihfVarCreateBuilder.copyOnWrite();
        ((atxk) aihfVarCreateBuilder.instance).c = pointerId;
        aihfVarCreateBuilder.copyOnWrite();
        ((atxk) aihfVarCreateBuilder.instance).d = i2 - 2;
        float pressure = motionEvent.getPressure(actionIndex);
        aihfVarCreateBuilder.copyOnWrite();
        ((atxk) aihfVarCreateBuilder.instance).g = pressure;
        atsr atsrVarA = a(x, y);
        aihfVarCreateBuilder.copyOnWrite();
        atxk atxkVar = (atxk) aihfVarCreateBuilder.instance;
        atsrVarA.getClass();
        atxkVar.e = atsrVarA;
        atxkVar.b |= 1;
        if (atwiVar != null) {
            atsr atsrVarA2 = a(atwiVar.a, atwiVar.b);
            aihfVarCreateBuilder.copyOnWrite();
            atxk atxkVar2 = (atxk) aihfVarCreateBuilder.instance;
            atsrVarA2.getClass();
            atxkVar2.f = atsrVarA2;
            atxkVar2.b |= 2;
        }
        this.i.c((atxk) aihfVarCreateBuilder.build());
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
