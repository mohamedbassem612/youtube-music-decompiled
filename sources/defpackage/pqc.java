package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pqc implements ppx {
    public static final agsn a = agsn.h("GnpSdk");
    public final Context b;
    private final Class c;
    private final pls d;
    private final pwf e;
    private final mbc f;

    public pqc(Context context, Class cls, pls plsVar, pwf pwfVar, mbc mbcVar) {
        context.getClass();
        cls.getClass();
        plsVar.getClass();
        pwfVar.getClass();
        mbcVar.getClass();
        this.b = context;
        this.c = cls;
        this.d = plsVar;
        this.e = pwfVar;
        this.f = mbcVar;
    }

    private static final void d(dzu dzuVar, ppw ppwVar, Long l) {
        dzuVar.b("GNP_SDK_JOB");
        if (l != null) {
            dzuVar.e(l.longValue(), TimeUnit.MILLISECONDS);
        }
        ppwVar.h();
        ppwVar.i();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ppx
    public final Object a(String str, awoq awoqVar) throws Throwable {
        ppz ppzVar;
        if (awoqVar instanceof ppz) {
            ppzVar = (ppz) awoqVar;
            int i = ppzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ppzVar.c = i - Integer.MIN_VALUE;
            } else {
                ppzVar = new ppz(this, awoqVar);
            }
        } else {
            ppzVar = new ppz(this, awoqVar);
        }
        Object obj = ppzVar.a;
        awox awoxVar = awox.a;
        int i2 = ppzVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            dzt dztVarI = bnz.i(this.b);
            str.getClass();
            ListenableFuture listenableFuture = ((dzl) dztVarI.a(str)).c;
            ppzVar.c = 1;
            if (awrc.ad(listenableFuture, ppzVar) == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v4, types: [pqc] */
    /* JADX WARN: Type inference failed for: r10v5, types: [pqc] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v4, types: [ppw] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [ppw] */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v14, types: [agsj] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v9 */
    @Override // defpackage.ppx
    public final Object b(String str, ppw ppwVar, dyp dypVar, dyn dynVar, Long l, awoq awoqVar) throws Throwable {
        pqa pqaVar;
        long jB;
        ?? D;
        ?? r14;
        ?? r13;
        ?? r15;
        ?? r10;
        Exception exc;
        dzk dzkVarG;
        ?? r16;
        ppw ppwVar2;
        pqc pqcVar;
        ?? r12;
        ?? r11;
        ?? r17;
        ?? r18;
        ?? r19;
        Object obj;
        ?? r110;
        pqc pqcVar2;
        if (awoqVar instanceof pqa) {
            pqaVar = (pqa) awoqVar;
            int i = pqaVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pqaVar.e = i - Integer.MIN_VALUE;
            } else {
                pqaVar = new pqa(this, awoqVar);
            }
        } else {
            pqaVar = new pqa(this, awoqVar);
        }
        Object obj2 = pqaVar.c;
        Object plaVar = awox.a;
        int i2 = pqaVar.e;
        try {
            if (i2 == 0) {
                atqp.j(obj2);
                jB = this.f.b();
                str.getClass();
                try {
                    boolean zE = ppwVar.e();
                    Class cls = this.c;
                    if (zE) {
                        try {
                            dzo dzoVar = new dzo(cls, ppwVar.b(), TimeUnit.MILLISECONDS);
                            dzoVar.f(dypVar);
                            dzoVar.d(dynVar);
                            d(dzoVar, ppwVar, l);
                            ayq ayqVarG = dzoVar.g();
                            dzt dztVarI = bnz.i(this.b);
                            int iF = ppwVar.f();
                            dzkVarG = dztVarI.g(str, iF, ayqVarG);
                            r14 = iF;
                        } catch (Exception e) {
                            r13 = str;
                            r15 = ppwVar;
                            r10 = this;
                            exc = e;
                            r17 = r13;
                            r18 = r15;
                            r19 = r10;
                            ((agsj) ((agsj) a.c()).j(exc)).E("Failed to schedule a job for package [%s] with ID: %s, type: %s via WorkManager", r19.b.getApplicationContext().getPackageName(), r17, new Integer(r18.a()));
                            return new pkv(exc, pkx.N);
                        }
                    } else {
                        dzg dzgVar = new dzg(cls);
                        dzgVar.f(dypVar);
                        dzgVar.d(dynVar);
                        d(dzgVar, ppwVar, l);
                        ppwVar.a();
                        this.d.l.getClass();
                        ppwVar.e();
                        dzkVarG = bnz.i(this.b).h(str, 1, dzgVar.g());
                        r14 = l;
                    }
                    D = auum.d();
                    try {
                        if (D != 0) {
                            D = str;
                            str = this;
                            try {
                                ppw ppwVar3 = ppwVar;
                                ahng.x(((dzl) dzkVarG).c, new pqb(str, jB, D, ppwVar3), MoreExecutors.directExecutor());
                                plaVar = new pla(awmy.a);
                                str = str;
                                D = D;
                                r14 = ppwVar3;
                            } catch (Exception e2) {
                                e = e2;
                                r14 = ppwVar;
                                exc = e;
                                r10 = str;
                                r13 = D;
                                r15 = r14;
                                r17 = r13;
                                r18 = r15;
                                r19 = r10;
                                ((agsj) ((agsj) a.c()).j(exc)).E("Failed to schedule a job for package [%s] with ID: %s, type: %s via WorkManager", r19.b.getApplicationContext().getPackageName(), r17, new Integer(r18.a()));
                                return new pkv(exc, pkx.N);
                            }
                        } else {
                            r16 = str;
                            ppwVar2 = ppwVar;
                            pqcVar = this;
                            ListenableFuture listenableFuture = ((dzl) dzkVarG).c;
                            pqaVar.a = ppwVar2;
                            pqaVar.f = r16;
                            pqaVar.b = jB;
                            pqaVar.e = 1;
                            if (awrc.ad(listenableFuture, pqaVar) != plaVar) {
                                str = pqcVar;
                                D = r16;
                                r14 = ppwVar2;
                                r12 = r16;
                                r11 = ppwVar2;
                                pqcVar2 = pqcVar;
                                r110 = r16;
                                obj = ppwVar2;
                            }
                        }
                        str = pqcVar;
                        D = r16;
                        r14 = ppwVar2;
                        return plaVar;
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Exception e4) {
                    e = e4;
                    D = str;
                    r14 = ppwVar;
                    str = this;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j = pqaVar.b;
                String str2 = pqaVar.f;
                Object obj3 = pqaVar.a;
                try {
                    atqp.j(obj2);
                    jB = j;
                    r11 = obj3;
                    pqcVar2 = this;
                    r12 = str2;
                    r110 = obj3;
                    obj = l;
                } catch (Exception e5) {
                    r19 = this;
                    exc = e5;
                    r18 = obj3;
                    r17 = str2;
                    ((agsj) ((agsj) a.c()).j(exc)).E("Failed to schedule a job for package [%s] with ID: %s, type: %s via WorkManager", r19.b.getApplicationContext().getPackageName(), r17, new Integer(r18.a()));
                    return new pkv(exc, pkx.N);
                }
            }
            r11.a();
            pqcVar2.c(jB);
            plaVar = new pla(awmy.a);
            str = pqcVar2;
            D = r110;
            r14 = obj;
            str = pqcVar;
            D = r16;
            r14 = ppwVar2;
            return plaVar;
        } catch (Exception e6) {
            exc = e6;
            r19 = pqcVar2;
            r18 = r11;
            r17 = r12;
            ((agsj) ((agsj) a.c()).j(exc)).E("Failed to schedule a job for package [%s] with ID: %s, type: %s via WorkManager", r19.b.getApplicationContext().getPackageName(), r17, new Integer(r18.a()));
            return new pkv(exc, pkx.N);
        }
    }

    public final void c(long j) {
        long jB = this.f.b() - j;
        Context context = this.b;
        this.e.o(jB, context.getPackageName(), this.d.a, Build.VERSION.SDK_INT, "ENQUEUE_WORKMANAGER");
        context.getApplicationContext().getPackageName();
    }
}
