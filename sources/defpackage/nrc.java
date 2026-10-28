package defpackage;

import android.graphics.PointF;
import android.util.SizeF;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.OptionalDouble;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nrc {
    public static void a(long j) {
        if (j > 0) {
            while (System.nanoTime() < System.nanoTime() + (j * 1000000)) {
            }
        }
    }

    public static int b(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 != 2) {
            return i2 == 3 ? 3 : 2;
        }
        return 1;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "FAMILY_LINK_ANDROID";
        }
        if (i != 3) {
            return i != 4 ? "null" : "YT_MAIN_ANDROID";
        }
        return "YT_KIDS_ANDROID";
    }

    public static atqx d(qxg qxgVar) {
        aihf aihfVarCreateBuilder = atqx.a.createBuilder();
        long jA = qxgVar.a();
        aihfVarCreateBuilder.copyOnWrite();
        atqx atqxVar = (atqx) aihfVarCreateBuilder.instance;
        atqxVar.b |= 2;
        atqxVar.c = jA;
        return (atqx) aihfVarCreateBuilder.build();
    }

    public static agkz e(Optional optional) {
        aihf aihfVarCreateBuilder = atrb.a.createBuilder();
        if (optional.isPresent()) {
            atqx atqxVarD = d((qxg) optional.get());
            aihfVarCreateBuilder.copyOnWrite();
            atrb atrbVar = (atrb) aihfVarCreateBuilder.instance;
            atqxVarD.getClass();
            atrbVar.d = atqxVarD;
            atrbVar.c |= 2;
        }
        aihfVarCreateBuilder.copyOnWrite();
        atrb atrbVar2 = (atrb) aihfVarCreateBuilder.instance;
        atrbVar2.c |= 16;
        atrbVar2.e = 0L;
        aihh aihhVar = (aihh) ahnj.a.createBuilder();
        aihhVar.e(atrb.b, (atrb) aihfVarCreateBuilder.build());
        ahnj ahnjVar = (ahnj) aihhVar.build();
        aihf aihfVarCreateBuilder2 = atul.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        atul atulVar = (atul) aihfVarCreateBuilder2.instance;
        atulVar.b |= 1;
        atulVar.e = "options";
        aihfVarCreateBuilder2.copyOnWrite();
        atul atulVar2 = (atul) aihfVarCreateBuilder2.instance;
        ahnjVar.getClass();
        atulVar2.d = ahnjVar;
        atulVar2.c = 6;
        return new agqj((atul) aihfVarCreateBuilder2.build());
    }

    public static void g(quu quuVar, qvs qvsVar) {
        quuVar.a = qvsVar.b;
        quuVar.b = qvsVar.c;
        quuVar.c = qvsVar.d;
        quuVar.d = qvsVar.e;
        quuVar.e = qvsVar.f;
        quuVar.h = qvsVar.g;
        quuVar.i = qvsVar.h;
        quuVar.j = qvsVar.j;
        n(quuVar, qvsVar);
    }

    public static OptionalDouble h() {
        Optional optionalOfNullable = Optional.ofNullable(null);
        if (true != optionalOfNullable.isPresent()) {
            optionalOfNullable.isPresent();
            return OptionalDouble.empty();
        }
        throw null;
    }

    public static float i(rjp rjpVar) {
        return (float) h().orElse(rjpVar.f());
    }

    public static double j(rjp rjpVar) {
        return h().orElse(rjpVar.d());
    }

    public static SizeF k(rjp rjpVar) {
        SizeF sizeFM = rjpVar.m();
        return new SizeF((float) h().orElse(sizeFM.getWidth()), (float) h().orElse(sizeFM.getHeight()));
    }

    public static PointF l(rjp rjpVar) {
        PointF pointFJ = rjpVar.j();
        return new PointF((float) h().orElse(pointFJ.x), (float) h().orElse(pointFJ.y));
    }

    private final agke m(agke agkeVar) {
        return (agke) Collection.EL.stream(agkeVar).map(new rhk(this, 3)).collect(aghu.a);
    }

    private static void n(qus qusVar, qvu qvuVar) {
        qusVar.g = qvuVar.o;
        Iterator it = qvuVar.is().iterator();
        while (it.hasNext()) {
            qusVar.c((qvc) it.next());
        }
    }

    public final qup f(qvu qvuVar) {
        qup qupVar;
        qus qutVar;
        qup rckVar;
        if (qvuVar instanceof rcl) {
            rcl rclVar = (rcl) qvuVar;
            rco rcoVarI = rco.i(rclVar.k, rclVar.b);
            g((quu) rcoVarI.b, rclVar);
            return rcoVarI;
        }
        if (qvuVar instanceof rcq) {
            rcq rcqVar = (rcq) qvuVar;
            rckVar = new rct(m(rcqVar.u), m(rcqVar.x()));
        } else {
            if (!(qvuVar instanceof rcj)) {
                if (qvuVar instanceof qvt) {
                    qvt qvtVar = (qvt) qvuVar;
                    qwr qwrVar = qvtVar.k;
                    if (!(qwrVar instanceof qwt)) {
                        throw new IllegalArgumentException("Unsupported image source type: ".concat(String.valueOf(String.valueOf(qwrVar.getClass()))));
                    }
                    qwt qwtVar = (qwt) qwrVar;
                    quv quvVar = qwtVar.b ? new quv(new qwt(qwtVar.a, true)) : new quv(new qwt(qwtVar.a, false));
                    quvVar.l = qvtVar.l;
                    g(quvVar, qvtVar);
                    qutVar = quvVar;
                } else if (qvuVar instanceof qvv) {
                    quw quwVar = new quw();
                    g(quwVar, (qvv) qvuVar);
                    qutVar = quwVar;
                } else if (qvuVar instanceof qvw) {
                    qvw qvwVar = (qvw) qvuVar;
                    qux quxVar = new qux(qvwVar.k);
                    quxVar.l = qvwVar.l;
                    quxVar.m = qvwVar.r;
                    g(quxVar, qvwVar);
                    qutVar = quxVar;
                } else if (qvuVar instanceof qwl) {
                    qwl qwlVar = (qwl) qvuVar;
                    quy quyVar = new quy();
                    quyVar.k = qwlVar.A;
                    quyVar.l = qwlVar.B;
                    float f = qwlVar.C;
                    ahno.F(Math.signum(f) != -1.0f);
                    quyVar.m = f;
                    quyVar.n = qwlVar.D;
                    quyVar.o = qwlVar.E;
                    quyVar.p = qwlVar.F;
                    quyVar.q = qwlVar.G;
                    quyVar.O = qwlVar.af;
                    quyVar.r = qwlVar.H;
                    quyVar.s = qwlVar.I;
                    float f2 = qwlVar.J;
                    ahno.F(Math.signum(f2) != -1.0f);
                    quyVar.t = f2;
                    float f3 = qwlVar.K;
                    ahno.F(Math.signum(f3) != -1.0f);
                    quyVar.u = f3;
                    quyVar.v = qwlVar.L;
                    float f4 = qwlVar.M;
                    ahno.F(Math.signum(f4) != -1.0f);
                    quyVar.w = f4;
                    quyVar.x = qwlVar.N;
                    quyVar.y = qwlVar.O;
                    quyVar.z = qwlVar.P;
                    quyVar.A = qwlVar.Q;
                    float f5 = qwlVar.V;
                    ahno.F(Math.signum(f5) != -1.0f);
                    quyVar.F = f5;
                    quyVar.B = qwlVar.R;
                    quyVar.C = qwlVar.S;
                    quyVar.D = qwlVar.T;
                    ahno.F(true);
                    double d = qwlVar.U;
                    ahno.F(true);
                    quyVar.E = 0.0d;
                    ahno.F(true);
                    float f6 = qwlVar.W;
                    ahno.F(Math.signum(f6) != -1.0f);
                    quyVar.G = f6;
                    ahno.F(true);
                    float f7 = qwlVar.X;
                    ahno.F(Math.signum(f7) != -1.0f);
                    quyVar.H = f7;
                    ahno.F(true);
                    float f8 = qwlVar.Y;
                    ahno.F(Math.signum(f8) != -1.0f);
                    quyVar.I = f8;
                    quyVar.J = qwlVar.Z;
                    float f9 = qwlVar.aa;
                    ahno.F(Math.signum(f9) != -1.0f);
                    quyVar.K = f9;
                    quyVar.L = qwlVar.ab;
                    quyVar.M = qwlVar.ac;
                    quyVar.N = agke.n(qwlVar.ad);
                    g(quyVar, qwlVar);
                    qutVar = quyVar;
                } else if (qvuVar instanceof qwm) {
                    qwm qwmVar = (qwm) qvuVar;
                    quz quzVar = new quz(qwmVar.k);
                    quzVar.p(qwmVar.l);
                    quzVar.m = qwmVar.r;
                    quzVar.n = qwmVar.s;
                    quzVar.o = qwmVar.t;
                    g(quzVar, qwmVar);
                    qutVar = quzVar;
                } else if (qvuVar instanceof qvq) {
                    qvq qvqVar = (qvq) qvuVar;
                    qur qurVar = new qur(qvqVar.b);
                    qurVar.c = nrb.e(qvqVar.c);
                    qurVar.d = qvqVar.e;
                    qurVar.e = qvqVar.f;
                    ((quq) qurVar).a = qvqVar.d;
                    n(qurVar, qvqVar);
                    qutVar = qurVar;
                } else {
                    if (!(qvuVar instanceof qvp)) {
                        if (qvuVar instanceof qvr) {
                            qutVar = new qut();
                        } else {
                            if (!(qvuVar instanceof rfk)) {
                                throw new IllegalArgumentException("Unsupported segment type: ".concat(String.valueOf(String.valueOf(qvuVar.getClass()))));
                            }
                            qupVar = new qup((rfk) qvuVar);
                            qupVar.g(qvuVar.p);
                            qupVar.f(qvuVar.iu());
                        }
                        return qupVar;
                    }
                    qvo qvoVar = new qvo();
                    g(qvoVar, (qvp) qvuVar);
                    qutVar = qvoVar;
                }
                qupVar = new qup(qutVar, qvuVar.m);
                qupVar.g(qvuVar.p);
                qupVar.f(qvuVar.iu());
                return qupVar;
            }
            rckVar = new rck(m(((rcj) qvuVar).w()));
        }
        return rckVar;
    }
}
