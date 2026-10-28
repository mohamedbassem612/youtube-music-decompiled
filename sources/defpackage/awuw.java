package defpackage;

import androidx.car.app.model.Alert;
import internal.org.jni_zero.JniZero;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awuw {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(awoq awoqVar) {
        Object objI;
        if (awoqVar instanceof axda) {
            return ((axda) awoqVar).toString();
        }
        try {
            objI = awoqVar + '@' + b(awoqVar);
        } catch (Throwable th) {
            objI = atqp.i(th);
        }
        if (awmn.a(objI) != null) {
            objI = awoqVar.getClass().getName() + '@' + b(awoqVar);
        }
        return (String) objI;
    }

    public static final void d(awvg awvgVar, awoq awoqVar, boolean z) {
        Object objM = awvgVar.m();
        Throwable thP = awvgVar.p(objM);
        Object awmmVar = thP != null ? new awmm(thP) : awvgVar.l(objM);
        if (!z) {
            awoqVar.resumeWith(awmmVar);
            return;
        }
        axda axdaVar = (axda) awoqVar;
        awoq awoqVar2 = axdaVar.b;
        Object obj = axdaVar.d;
        awou context = awoqVar2.getContext();
        Object objB = axea.b(context, obj);
        awxm awxmVarC = objB != axea.a ? awup.c(awoqVar2, context, objB) : null;
        try {
            awoqVar2.resumeWith(awmmVar);
        } finally {
            if (awxmVarC == null || awxmVarC.P()) {
                axea.c(context, objB);
            }
        }
    }

    public static final Executor e(awuq awuqVar) {
        Executor executorH;
        awvv awvvVar = awuqVar instanceof awvv ? (awvv) awuqVar : null;
        return (awvvVar == null || (executorH = awvvVar.h()) == null) ? new awvh(awuqVar) : executorH;
    }

    public static final awuq f(Executor executor) {
        awuq awuqVar;
        awvh awvhVar = executor instanceof awvh ? (awvh) executor : null;
        return (awvhVar == null || (awuqVar = awvhVar.a) == null) ? new awvw(executor) : awuqVar;
    }

    public static /* synthetic */ int g(Object obj) {
        Objects.checkIndex(0, 2);
        if (obj == null) {
            return -1;
        }
        return !(obj instanceof axdr) ? -2 : 0;
    }

    public static /* synthetic */ awye h(int i, int i2, int i3) {
        awym awymVar;
        if (1 == (i3 & 1)) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if (i != -2) {
            if (i == -1) {
                if (i2 == 1) {
                    return new awym(1, 2);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i != 0) {
                if (i != Integer.MAX_VALUE) {
                    return i2 == 1 ? new awya(i) : new awym(i, i2);
                }
                return new awya(Alert.DURATION_SHOW_INDEFINITELY);
            }
            if (i2 == 1) {
                return new awya(0);
            }
            awymVar = new awym(1, i2);
        } else {
            if (i2 == 1) {
                return new awya(awyd.a);
            }
            awymVar = new awym(1, i2);
        }
        return awymVar;
    }

    public static /* synthetic */ String i(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "DROP_OLDEST";
        }
        return "SUSPEND";
    }

    public static final Object j(awoq awoqVar) {
        Object obj;
        awou context = awoqVar.getContext();
        awro.A(context);
        awoq awoqVarQ = JniZero.q(awoqVar);
        axda axdaVar = awoqVarQ instanceof axda ? (axda) awoqVarQ : null;
        if (axdaVar == null) {
            obj = awmy.a;
        } else {
            awuq awuqVar = axdaVar.a;
            try {
                if (awuqVar.fX(context)) {
                    axdaVar.a(context, awmy.a);
                } else {
                    awxq awxqVar = new awxq();
                    awou awouVarPlus = context.plus(awxqVar);
                    awmy awmyVar = awmy.a;
                    axdaVar.a(awouVarPlus, awmyVar);
                    if (awxqVar.b) {
                        boolean z = awuv.a;
                        ThreadLocal threadLocal = awxh.a;
                        awvo awvoVarA = awxh.a();
                        if (awvoVarA.r()) {
                            obj = awmy.a;
                        } else if (awvoVarA.q()) {
                            axdaVar.c = awmyVar;
                            axdaVar.e = 1;
                            awvoVarA.o(axdaVar);
                            obj = awox.a;
                        } else {
                            awvoVarA.p(true);
                            try {
                                axdaVar.run();
                                do {
                                } while (awvoVarA.s());
                            } catch (Throwable th) {
                                try {
                                    axdaVar.E(th);
                                } catch (Throwable th2) {
                                    awvoVarA.n(true);
                                    throw th2;
                                }
                            }
                            awvoVarA.n(true);
                            obj = awmy.a;
                        }
                    }
                }
                obj = awox.a;
            } catch (Throwable th3) {
                throw new awve(th3, awuqVar, context);
            }
        }
        if (obj != awox.a) {
            return awmy.a;
        }
        awoqVar.getClass();
        return obj;
    }

    public static awph k(awwv awwvVar) {
        if (!awxc.a) {
            return null;
        }
        awsr awsrVar = new awsr(new awss(awqx.f(awwvVar.o(), new awrf() { // from class: awwt
            @Override // defpackage.awrf
            public final Object a(Object obj) {
                return ((awwd) obj).o();
            }
        }), true, awwu.a));
        awph awphVar = (awph) (awsrVar.hasNext() ? awsrVar.next() : null);
        return awphVar == null ? (awph) awwvVar.getContext().get(axci.a) : awphVar;
    }
}
