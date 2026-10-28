package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class emh {
    public static final /* synthetic */ int c = 0;
    private static final Interpolator d = new LinearInterpolator();
    static final boy a = boy.s("t", "s", "e", "o", "i", "h", "to", "ti");
    static final boy b = boy.s("x", "y");

    /* JADX WARN: Code duplicated, block: B:98:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f1  */
    static enn a(emz emzVar, egy egyVar, float f, emw emwVar, boolean z, boolean z2) {
        Interpolator interpolatorB;
        Object obj;
        Interpolator interpolatorB2;
        Interpolator interpolatorB3;
        Interpolator interpolatorB4;
        Object obj2;
        Interpolator interpolator;
        enn ennVar;
        boolean z3;
        Object obj3;
        PointF pointF;
        Object obj4;
        PointF pointF2;
        if (!z) {
            return new enn(emwVar.a(emzVar, f));
        }
        if (!z2) {
            emzVar.h();
            PointF pointFC = null;
            PointF pointFC2 = null;
            PointF pointFC3 = null;
            boolean z4 = false;
            Object objA = null;
            float fA = 0.0f;
            PointF pointFC4 = null;
            Object objA2 = null;
            while (emzVar.n()) {
                switch (emzVar.q(a)) {
                    case 0:
                        fA = (float) emzVar.a();
                        break;
                    case 1:
                        objA = emwVar.a(emzVar, f);
                        break;
                    case 2:
                        objA2 = emwVar.a(emzVar, f);
                        break;
                    case 3:
                        pointFC = emg.c(emzVar, 1.0f);
                        break;
                    case 4:
                        pointFC2 = emg.c(emzVar, 1.0f);
                        break;
                    case 5:
                        z4 = emzVar.b() == 1;
                        break;
                    case 6:
                        pointFC3 = emg.c(emzVar, f);
                        break;
                    case 7:
                        pointFC4 = emg.c(emzVar, f);
                        break;
                    default:
                        emzVar.m();
                        break;
                }
            }
            emzVar.j();
            if (z4) {
                interpolatorB = d;
                obj = objA;
            } else {
                interpolatorB = (pointFC == null || pointFC2 == null) ? d : b(pointFC, pointFC2);
                obj = objA2;
            }
            enn ennVar2 = new enn(egyVar, objA, obj, interpolatorB, fA, (Float) null);
            ennVar2.l = pointFC3;
            ennVar2.m = pointFC4;
            return ennVar2;
        }
        emzVar.h();
        PointF pointFC5 = null;
        PointF pointFC6 = null;
        boolean z5 = false;
        PointF pointFC7 = null;
        PointF pointFC8 = null;
        PointF pointF3 = null;
        Object objA3 = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        float fA2 = 0.0f;
        Object objA4 = null;
        while (emzVar.n()) {
            switch (emzVar.q(a)) {
                case 0:
                    fA2 = (float) emzVar.a();
                    pointFC7 = pointFC7;
                    pointFC8 = pointFC8;
                    z5 = z5;
                    break;
                case 1:
                    objA3 = emwVar.a(emzVar, f);
                    z5 = z5;
                    break;
                case 2:
                    objA4 = emwVar.a(emzVar, f);
                    z5 = z5;
                    break;
                case 3:
                    z3 = z5;
                    PointF pointF7 = pointFC8;
                    obj3 = objA3;
                    PointF pointF8 = pointFC7;
                    if (emzVar.p() == 3) {
                        emzVar.h();
                        float fA3 = 0.0f;
                        float fA4 = 0.0f;
                        float fA5 = 0.0f;
                        float fA6 = 0.0f;
                        while (emzVar.n()) {
                            int iQ = emzVar.q(b);
                            if (iQ == 0) {
                                pointF = pointF8;
                                if (emzVar.p() == 7) {
                                    fA5 = (float) emzVar.a();
                                    pointF8 = pointF;
                                    fA3 = fA5;
                                } else {
                                    emzVar.g();
                                    fA3 = (float) emzVar.a();
                                    fA5 = emzVar.p() == 7 ? (float) emzVar.a() : fA3;
                                    emzVar.i();
                                    pointF8 = pointF;
                                }
                            } else if (iQ != 1) {
                                emzVar.m();
                            } else {
                                pointF = pointF8;
                                if (emzVar.p() == 7) {
                                    fA6 = (float) emzVar.a();
                                    pointF8 = pointF;
                                    fA4 = fA6;
                                } else {
                                    emzVar.g();
                                    fA4 = (float) emzVar.a();
                                    fA6 = emzVar.p() == 7 ? (float) emzVar.a() : fA4;
                                    emzVar.i();
                                    pointF8 = pointF;
                                }
                            }
                        }
                        pointF3 = new PointF(fA3, fA4);
                        pointF4 = new PointF(fA5, fA6);
                        emzVar.j();
                        pointFC7 = pointF8;
                    } else {
                        pointFC7 = emg.c(emzVar, f);
                    }
                    pointFC8 = pointF7;
                    z5 = z3;
                    objA3 = obj3;
                    break;
                case 4:
                    if (emzVar.p() == 3) {
                        emzVar.h();
                        float fA7 = 0.0f;
                        float fA8 = 0.0f;
                        float fA9 = 0.0f;
                        float fA10 = 0.0f;
                        while (emzVar.n()) {
                            boolean z6 = z5;
                            int iQ2 = emzVar.q(b);
                            if (iQ2 != 0) {
                                obj4 = objA3;
                                if (iQ2 != 1) {
                                    emzVar.m();
                                } else {
                                    pointF2 = pointFC7;
                                    if (emzVar.p() == 7) {
                                        fA10 = (float) emzVar.a();
                                        pointFC7 = pointF2;
                                        fA8 = fA10;
                                    } else {
                                        emzVar.g();
                                        fA8 = (float) emzVar.a();
                                        fA10 = emzVar.p() == 7 ? (float) emzVar.a() : fA8;
                                        emzVar.i();
                                        pointFC8 = pointFC8;
                                        pointFC7 = pointF2;
                                    }
                                }
                            } else {
                                pointFC8 = pointFC8;
                                obj4 = objA3;
                                pointF2 = pointFC7;
                                if (emzVar.p() == 7) {
                                    fA9 = (float) emzVar.a();
                                    pointFC8 = pointFC8;
                                    pointFC7 = pointF2;
                                    fA7 = fA9;
                                } else {
                                    emzVar.g();
                                    fA7 = (float) emzVar.a();
                                    fA9 = emzVar.p() == 7 ? (float) emzVar.a() : fA7;
                                    emzVar.i();
                                    pointFC8 = pointFC8;
                                    pointFC7 = pointF2;
                                }
                            }
                            z5 = z6;
                            objA3 = obj4;
                        }
                        z3 = z5;
                        obj3 = objA3;
                        PointF pointF9 = pointFC7;
                        PointF pointF10 = new PointF(fA7, fA8);
                        PointF pointF11 = new PointF(fA9, fA10);
                        emzVar.j();
                        pointF6 = pointF11;
                        pointF5 = pointF10;
                        pointFC7 = pointF9;
                        z5 = z3;
                    } else {
                        obj3 = objA3;
                        pointFC8 = emg.c(emzVar, f);
                    }
                    objA3 = obj3;
                    break;
                case 5:
                    z5 = emzVar.b() == 1;
                    break;
                case 6:
                    pointFC5 = emg.c(emzVar, f);
                    break;
                case 7:
                    pointFC6 = emg.c(emzVar, f);
                    break;
                default:
                    emzVar.m();
                    z5 = z5;
                    break;
            }
        }
        boolean z7 = z5;
        PointF pointF12 = pointFC7;
        PointF pointF13 = pointFC8;
        Object obj5 = objA3;
        emzVar.j();
        if (z7) {
            interpolator = d;
            obj2 = obj5;
        } else {
            if (pointF12 == null || pointF13 == null) {
                if (pointF3 == null || pointF4 == null || pointF5 == null || pointF6 == null) {
                    interpolatorB2 = d;
                } else {
                    interpolatorB3 = b(pointF3, pointF5);
                    interpolatorB4 = b(pointF4, pointF6);
                    obj2 = objA4;
                    interpolator = null;
                }
                if (interpolatorB3 != null) {
                    ennVar = new enn(egyVar, obj5, obj2, interpolatorB3, interpolatorB4, fA2);
                } else {
                    ennVar = new enn(egyVar, obj5, obj2, interpolator, fA2, (Float) null);
                }
                ennVar.l = pointFC5;
                ennVar.m = pointFC6;
                return ennVar;
            }
            interpolatorB2 = b(pointF12, pointF13);
            interpolator = interpolatorB2;
            obj2 = objA4;
        }
        interpolatorB3 = null;
        interpolatorB4 = null;
        if (interpolatorB3 != null) {
            ennVar = new enn(egyVar, obj5, obj2, interpolatorB3, interpolatorB4, fA2);
        } else {
            ennVar = new enn(egyVar, obj5, obj2, interpolator, fA2, (Float) null);
        }
        ennVar.l = pointFC5;
        ennVar.m = pointFC6;
        return ennVar;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        float f = pointF.x;
        int i = enh.a;
        pointF.x = Math.max(-1.0f, Math.min(1.0f, f));
        pointF.y = Math.max(-100.0f, Math.min(100.0f, pointF.y));
        pointF2.x = Math.max(-1.0f, Math.min(1.0f, pointF2.x));
        pointF2.y = Math.max(-100.0f, Math.min(100.0f, pointF2.y));
        float f2 = pointF.x;
        float f3 = pointF.y;
        float f4 = pointF2.x;
        float f5 = pointF2.y;
        ThreadLocal threadLocal = enm.a;
        try {
            return new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            return "The Path cannot loop back on itself.".equals(e.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }
}
