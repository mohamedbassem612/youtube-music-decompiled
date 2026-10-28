package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axdb {
    public static final axdy a = new axdy("UNDEFINED");
    public static final axdy b = new axdy("REUSABLE_CLAIMED");

    public static final void a(awoq awoqVar, Object obj) throws awve {
        if (!(awoqVar instanceof axda)) {
            awoqVar.resumeWith(obj);
            return;
        }
        axda axdaVar = (axda) awoqVar;
        Object objS = awrc.S(obj);
        awuq awuqVar = axdaVar.a;
        awou context = axdaVar.getContext();
        try {
            boolean zFX = awuqVar.fX(context);
            if (zFX) {
                axdaVar.c = objS;
                axdaVar.e = 1;
                awuq awuqVar2 = axdaVar.a;
                awou context2 = axdaVar.getContext();
                try {
                    awuqVar2.a(context2, axdaVar);
                    return;
                } catch (Throwable th) {
                    throw new awve(th, awuqVar2, context2);
                }
            }
            boolean z = awuv.a;
            ThreadLocal threadLocal = awxh.a;
            awvo awvoVarA = awxh.a();
            if (awvoVarA.q()) {
                axdaVar.c = objS;
                axdaVar.e = 1;
                awvoVarA.o(axdaVar);
                return;
            }
            awvoVarA.p(true);
            try {
                awwd awwdVar = (awwd) axdaVar.getContext().get(awwd.d);
                if (awwdVar == null || awwdVar.q()) {
                    awoq awoqVar2 = axdaVar.b;
                    Object obj2 = axdaVar.d;
                    awou context3 = awoqVar2.getContext();
                    Object objB = axea.b(context3, obj2);
                    awxm awxmVarC = objB != axea.a ? awup.c(awoqVar2, context3, objB) : null;
                    try {
                        awoqVar2.resumeWith(obj);
                        if (awxmVarC == null || awxmVarC.P()) {
                            axea.c(context3, objB);
                        }
                    } catch (Throwable th2) {
                        if (awxmVarC == null || awxmVarC.P()) {
                            axea.c(context3, objB);
                        }
                        throw th2;
                    }
                } else {
                    axdaVar.resumeWith(new awmm(awwdVar.m()));
                }
                while (awvoVarA.s()) {
                }
            } catch (Throwable th3) {
                try {
                    axdaVar.E(th3);
                } finally {
                    awvoVarA.n(true);
                }
            }
        } catch (Throwable th4) {
            throw new awve(th4, awuqVar, context);
        }
    }
}
