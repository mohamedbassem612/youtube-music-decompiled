package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class awro {
    public awro() {
    }

    public static void A(awou awouVar) {
        awwd awwdVar = (awwd) awouVar.get(awwd.d);
        if (awwdVar != null) {
            B(awwdVar);
        }
    }

    public static void B(awwd awwdVar) {
        if (!awwdVar.q()) {
            throw awwdVar.m();
        }
    }

    public static void a(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(obj.getClass().getName() + " cannot be cast to " + str);
        awrc.d(classCastException, awro.class.getName());
        throw classCastException;
    }

    public static boolean b(Object obj, int i) {
        int arity;
        if (!(obj instanceof awmf)) {
            return false;
        }
        if (obj instanceof awqz) {
            arity = ((awqz) obj).getArity();
        } else if (obj instanceof Function0) {
            arity = 0;
        } else if (obj instanceof awqg) {
            arity = 1;
        } else if (obj instanceof awqk) {
            arity = 2;
        } else if (obj instanceof awql) {
            arity = 3;
        } else if (obj instanceof awqm) {
            arity = 4;
        } else if (obj instanceof awqn) {
            arity = 5;
        } else if (obj instanceof awqo) {
            arity = 6;
        } else if (obj instanceof awqp) {
            arity = 7;
        } else if (obj instanceof awqq) {
            arity = 8;
        } else if (obj instanceof awqr) {
            arity = 9;
        } else if (obj instanceof awpw) {
            arity = 10;
        } else if (obj instanceof awpx) {
            arity = 11;
        } else if (obj instanceof awpy) {
            arity = 12;
        } else if (obj instanceof awpz) {
            arity = 13;
        } else if (obj instanceof awqa) {
            arity = 14;
        } else if (obj instanceof awqb) {
            arity = 15;
        } else if (obj instanceof awqc) {
            arity = 16;
        } else if (obj instanceof awqd) {
            arity = 17;
        } else if (obj instanceof awqe) {
            arity = 18;
        } else if (obj instanceof awqf) {
            arity = 19;
        } else if (obj instanceof awqh) {
            arity = 20;
        } else if (obj instanceof awqi) {
            arity = 21;
        } else {
            arity = obj instanceof awqj ? 22 : -1;
        }
        return arity == i;
    }

    public static void c(Object obj, int i) {
        if (obj == null || b(obj, i)) {
            return;
        }
        a(obj, a.bR(i, "kotlin.jvm.functions.Function"));
    }

    public static void d(Object obj) {
        if (!(obj instanceof awrp) || (obj instanceof awrq)) {
            return;
        }
        a(obj, "kotlin.collections.MutableCollection");
    }

    public static double e(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static int f(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static int g(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static int h(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long i(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static long j(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static Comparable k(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2) < 0 ? comparable2 : comparable;
    }

    public static awsa l(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? awsa.d : new awsa(i, i2 - 1);
    }

    public static float m(float f) {
        float f2 = 0.0f;
        if (f >= 0.0f) {
            f2 = 1.0f;
            if (f <= 1.0f) {
                return f;
            }
        }
        return f2;
    }

    public static long n(long j) {
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    public static int o(int i, awsa awsaVar) {
        if (!awsaVar.b()) {
            if (i < awsaVar.d().intValue()) {
                return awsaVar.d().intValue();
            }
            return i > awsaVar.c().intValue() ? awsaVar.c().intValue() : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + awsaVar + '.');
    }

    public static Object p(awou awouVar, awqk awqkVar, awoq awoqVar) throws Throwable {
        Object objB;
        awou context = awoqVar.getContext();
        awou awouVarA = awup.a(context, awouVar);
        A(awouVarA);
        if (awouVarA == context) {
            axdv axdvVar = new axdv(awouVarA, awoqVar);
            objB = awrc.U(axdvVar, true, axdvVar, awqkVar);
        } else {
            ahx ahxVar = awor.j;
            if (awrc.c(awouVarA.get(ahxVar), context.get(ahxVar))) {
                awxm awxmVar = new awxm(awouVarA, awoqVar);
                awou awouVar2 = ((awtt) awxmVar).a;
                Object objB2 = axea.b(awouVar2, null);
                try {
                    Object objU = awrc.U(awxmVar, true, awxmVar, awqkVar);
                    axea.c(awouVar2, objB2);
                    objB = objU;
                } catch (Throwable th) {
                    axea.c(awouVar2, objB2);
                    throw th;
                }
            } else {
                awvf awvfVar = new awvf(awouVarA, awoqVar);
                awrc.X(awqkVar, awvfVar, awvfVar);
                awtp awtpVar = awvfVar.b;
                while (true) {
                    int i = awtpVar.b;
                    if (i != 0) {
                        if (i != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        objB = awwl.b(awvfVar.z());
                        if (!(objB instanceof awum)) {
                            break;
                        }
                        throw ((awum) objB).b;
                    }
                    if (awtpVar.c(0, 1)) {
                        objB = awox.a;
                        break;
                    }
                }
            }
        }
        if (objB == awox.a) {
            awoqVar.getClass();
        }
        return objB;
    }

    public static awuz r(awut awutVar, awou awouVar, int i, awqk awqkVar) throws Throwable {
        awou awouVarB = awup.b(awutVar, awouVar);
        awva awwmVar = i == 2 ? new awwm(awouVarB, awqkVar) : new awva(awouVarB, true);
        awrc.I(i, awqkVar, awwmVar, awwmVar);
        return awwmVar;
    }

    public static awwd s(awut awutVar, awou awouVar, int i, awqk awqkVar) throws Throwable {
        awou awouVarB = awup.b(awutVar, awouVar);
        awtt awwnVar = i == 2 ? new awwn(awouVarB, awqkVar) : new awxe(awouVarB, true);
        awrc.I(i, awqkVar, awwnVar, awwnVar);
        return awwnVar;
    }

    public static /* synthetic */ awwd t(awut awutVar, awou awouVar, int i, awqk awqkVar, int i2) {
        if ((i2 & 1) != 0) {
            awouVar = awov.a;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return s(awutVar, awouVar, i, awqkVar);
    }

    public static /* synthetic */ int u(Object obj) {
        Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof Throwable) {
            return 0;
        }
        return obj instanceof ArrayList ? 1 : -2;
    }

    public static /* synthetic */ int v(Object obj) {
        Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof awvn) {
            return 0;
        }
        return obj instanceof awvz ? 1 : -2;
    }

    public static /* synthetic */ int w(Object obj) {
        Objects.checkIndex(0, 4);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof awwj) {
            return 0;
        }
        if (obj instanceof awvz) {
            return 1;
        }
        return obj instanceof awum ? 2 : -2;
    }

    public static Object x(awwd awwdVar, awoq awoqVar) {
        awwdVar.p(null);
        Object objL = awwdVar.l(awoqVar);
        return objL != awox.a ? awmy.a : objL;
    }

    public static awvk y(awwd awwdVar, boolean z, awwg awwgVar) {
        return awwdVar instanceof awwk ? ((awwk) awwdVar).D(z, awwgVar) : awwdVar.n(awwgVar.b(), z, new acqe(awwgVar, 10, (int[][]) null));
    }

    public static void z(awou awouVar, CancellationException cancellationException) {
        awwd awwdVar = (awwd) awouVar.get(awwd.d);
        if (awwdVar != null) {
            awwdVar.p(cancellationException);
        }
    }

    public awro(byte[] bArr) {
    }
}
