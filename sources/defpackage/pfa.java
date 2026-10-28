package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pfa implements peq {
    public static final /* synthetic */ int l = 0;
    private static final agsn m = agsn.h("GnpSdk");
    public final Context a;
    public final pfk b;
    public final mbc c;
    public final aunn d;
    public final aunn e;
    public final aunn f;
    public final aunn g;
    public final aunn h;
    public final aunn i;
    public final aunn j;
    public final aunn k;
    private final qbi n;
    private final aunn o;
    private final pls p;
    private final pwf q;
    private final awou r;
    private final awou s;

    public pfa(Context context, qbi qbiVar, aunn aunnVar, pfk pfkVar, pls plsVar, pwf pwfVar, mbc mbcVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7, aunn aunnVar8, aunn aunnVar9, aunn aunnVar10, aunn aunnVar11, aunn aunnVar12, aunn aunnVar13, awou awouVar, awou awouVar2) {
        context.getClass();
        qbiVar.getClass();
        aunnVar.getClass();
        pfkVar.getClass();
        plsVar.getClass();
        pwfVar.getClass();
        mbcVar.getClass();
        aunnVar2.getClass();
        aunnVar3.getClass();
        aunnVar4.getClass();
        aunnVar5.getClass();
        aunnVar6.getClass();
        aunnVar7.getClass();
        aunnVar8.getClass();
        aunnVar9.getClass();
        aunnVar10.getClass();
        aunnVar11.getClass();
        aunnVar12.getClass();
        aunnVar13.getClass();
        awouVar.getClass();
        awouVar2.getClass();
        this.a = context;
        this.n = qbiVar;
        this.o = aunnVar;
        this.b = pfkVar;
        this.p = plsVar;
        this.q = pwfVar;
        this.c = mbcVar;
        this.d = aunnVar2;
        this.e = aunnVar3;
        this.f = aunnVar5;
        this.g = aunnVar6;
        this.h = aunnVar8;
        this.i = aunnVar9;
        this.j = aunnVar11;
        this.k = aunnVar12;
        this.r = awouVar;
        this.s = awouVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // defpackage.peq
    public final Object a(plx plxVar, long j, aidy aidyVar, awoq awoqVar) throws Throwable {
        pew pewVar;
        if (awoqVar instanceof pew) {
            pewVar = (pew) awoqVar;
            int i = pewVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pewVar.c = i - Integer.MIN_VALUE;
            } else {
                pewVar = new pew(this, awoqVar);
            }
        } else {
            pewVar = new pew(this, awoqVar);
        }
        pew pewVar2 = pewVar;
        Object obj = pewVar2.a;
        awox awoxVar = awox.a;
        int i2 = pewVar2.c;
        if (i2 == 0) {
            atqp.j(obj);
            awou awouVar = this.r;
            ply plyVar = new ply(this, plxVar, j, aidyVar, (awoq) null, 1);
            pewVar2.c = 1;
            if (nxf.a(awouVar, awov.a, plyVar, pewVar2) == awoxVar) {
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
    @Override // defpackage.peq
    public final Object b(plx plxVar, aidy aidyVar, awoq awoqVar) throws Throwable {
        pev pevVar;
        if (awoqVar instanceof pev) {
            pevVar = (pev) awoqVar;
            int i = pevVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pevVar.c = i - Integer.MIN_VALUE;
            } else {
                pevVar = new pev(this, awoqVar);
            }
        } else {
            pevVar = new pev(this, awoqVar);
        }
        Object obj = pevVar.a;
        awox awoxVar = awox.a;
        int i2 = pevVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            awou awouVar = this.r;
            gme gmeVar = new gme(this, plxVar, aidyVar, (awoq) null, 7);
            pevVar.c = 1;
            if (nxf.a(awouVar, awov.a, gmeVar, pevVar) == awoxVar) {
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

    @Override // defpackage.peq
    public final synchronized void c(plx plxVar, aier aierVar) throws Throwable {
        try {
            try {
                aierVar.getClass();
                qpj.b();
                Bundle bundle = new Bundle();
                nvi.b(bundle, plxVar);
                bundle.putInt("com.google.android.libraries.notifications.REGISTRATION_REASON", aierVar.p);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.peq
    public final Object d(plx plxVar, aiff aiffVar, String str, int i, pbh pbhVar, List list, int i2, int i3, awoq awoqVar) throws Throwable {
        pez pezVar;
        if (awoqVar instanceof pez) {
            pezVar = (pez) awoqVar;
            int i4 = pezVar.c;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                pezVar.c = i4 - Integer.MIN_VALUE;
            } else {
                pezVar = new pez(this, awoqVar);
            }
        } else {
            pezVar = new pez(this, awoqVar);
        }
        pez pezVar2 = pezVar;
        Object obj = pezVar2.a;
        awox awoxVar = awox.a;
        int i5 = pezVar2.c;
        if (i5 == 0) {
            atqp.j(obj);
            awou awouVar = this.r;
            pgl pglVar = new pgl(list, this, plxVar, aiffVar, str, i, i3, pbhVar, i2, (awoq) null, 1);
            pezVar2.c = 1;
            if (nxf.a(awouVar, awov.a, pglVar, pezVar2) == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [pfa] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [qbh] */
    /* JADX WARN: Type inference failed for: r12v9 */
    public final Object e(plx plxVar, int i, aunn aunnVar, aunn aunnVar2, Bundle bundle, Long l2, awoq awoqVar) throws Throwable {
        pex pexVar;
        Bundle bundle2;
        qbh qbhVar;
        ?? r12;
        pkx pkxVarC;
        String strName;
        if (awoqVar instanceof pex) {
            pexVar = (pex) awoqVar;
            int i2 = pexVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pexVar.d = i2 - Integer.MIN_VALUE;
            } else {
                pexVar = new pex(this, awoqVar);
            }
        } else {
            pexVar = new pex(this, awoqVar);
        }
        pex pexVar2 = pexVar;
        Object objC = pexVar2.b;
        awox awoxVar = awox.a;
        int i3 = pexVar2.d;
        if (i3 == 0) {
            atqp.j(objC);
            if (auum.e()) {
                Object objIo = aunnVar.io();
                objIo.getClass();
                pexVar2.d = 1;
                Object objF = f(plxVar, (ppw) objIo, bundle, l2, pexVar2);
                if (objF != awoxVar) {
                    return objF;
                }
            } else {
                Object objIo2 = aunnVar2.io();
                objIo2.getClass();
                qbh qbhVar2 = (qbh) objIo2;
                try {
                    qbi qbiVar = this.n;
                    if (l2 == null) {
                        qbiVar.b(plxVar, i, qbhVar2, bundle);
                    } else {
                        bundle2 = bundle;
                        qbhVar = qbhVar2;
                        try {
                            qbiVar.c(plxVar, i, qbhVar, bundle2, l2.longValue());
                        } catch (qbg unused) {
                            pexVar2.a = qbhVar;
                            pexVar2.d = 2;
                            objC = qbhVar.c(bundle2, pexVar2);
                            if (objC != awoxVar) {
                                r12 = qbhVar;
                                pwf pwfVar = this.q;
                                Context context = this.a;
                                pls plsVar = this.p;
                                pky pkyVar = (pky) objC;
                                String packageName = context.getPackageName();
                                int i4 = Build.VERSION.SDK_INT;
                                String strD = r12.d();
                                String strE = pkyVar.e();
                                pkxVarC = pkyVar.c();
                                if (pkxVarC != null) {
                                    strName = "";
                                } else {
                                    strName = "";
                                }
                                pwfVar.c(packageName, plsVar.a, i4, false, strD, true, strE, strName, qnl.ae(context));
                                return pkyVar;
                            }
                            return awoxVar;
                        }
                    }
                    return new pla(awmy.a);
                } catch (qbg unused2) {
                    bundle2 = bundle;
                    qbhVar = qbhVar2;
                }
            }
            return awoxVar;
        }
        if (i3 == 1) {
            atqp.j(objC);
            return objC;
        }
        if (i3 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Object obj = pexVar2.a;
        atqp.j(objC);
        r12 = obj;
        pwf pwfVar2 = this.q;
        Context context2 = this.a;
        pls plsVar2 = this.p;
        pky pkyVar2 = (pky) objC;
        String packageName2 = context2.getPackageName();
        int i5 = Build.VERSION.SDK_INT;
        String strD2 = r12.d();
        String strE2 = pkyVar2.e();
        pkxVarC = pkyVar2.c();
        if (pkxVarC != null || (strName = pkxVarC.name()) == null) {
            strName = "";
        }
        pwfVar2.c(packageName2, plsVar2.a, i5, false, strD2, true, strE2, strName, qnl.ae(context2));
        return pkyVar2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [ppw] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, ppw] */
    /* JADX WARN: Type inference failed for: r12v5 */
    public final Object f(plx plxVar, ppw ppwVar, Bundle bundle, Long l2, awoq awoqVar) throws Throwable {
        pey peyVar;
        ?? r12;
        Bundle bundle2;
        ?? r11;
        pkx pkxVarC;
        String strName;
        if (awoqVar instanceof pey) {
            peyVar = (pey) awoqVar;
            int i = peyVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                peyVar.d = i - Integer.MIN_VALUE;
            } else {
                peyVar = new pey(this, awoqVar);
            }
        } else {
            peyVar = new pey(this, awoqVar);
        }
        pey peyVar2 = peyVar;
        Object objA = peyVar2.b;
        awox awoxVar = awox.a;
        int i2 = peyVar2.d;
        if (i2 != 0) {
            if (i2 == 1) {
                bundle2 = peyVar2.e;
                Object obj = peyVar2.a;
                atqp.j(objA);
                r12 = obj;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = peyVar2.a;
                atqp.j(objA);
                r11 = obj2;
            }
            pwf pwfVar = this.q;
            Context context = this.a;
            pls plsVar = this.p;
            pky pkyVar = (pky) objA;
            String packageName = context.getPackageName();
            int i3 = Build.VERSION.SDK_INT;
            String strD = r11.d();
            String strE = pkyVar.e();
            pkxVarC = pkyVar.c();
            if (pkxVarC != null || (strName = pkxVarC.name()) == null) {
                strName = "";
            }
            pwfVar.c(packageName, plsVar.a, i3, true, strD, true, strE, strName, qnl.ae(context));
            return pkyVar;
        }
        atqp.j(objA);
        Object objIo = this.o.io();
        objIo.getClass();
        peyVar2.a = ppwVar;
        peyVar2.e = bundle;
        peyVar2.d = 1;
        objA = nxk.a((ppy) objIo, ppwVar, plxVar, bundle, l2, peyVar2, 16);
        if (objA == awoxVar) {
            return awoxVar;
        }
        r12 = ppwVar;
        bundle2 = bundle;
        pky pkyVar2 = (pky) objA;
        if (!(pkyVar2 instanceof pku)) {
            return new pla(awmy.a);
        }
        ((agsj) ((agsj) m.c()).j(((pku) pkyVar2).b())).w("Error scheduling RPC. Calling [%s] RPC in the current thread", r12.d());
        peyVar2.a = r12;
        peyVar2.e = null;
        peyVar2.d = 2;
        objA = r12.c(bundle2, peyVar2);
        if (objA == awoxVar) {
            return awoxVar;
        }
        r11 = r12;
        pwf pwfVar2 = this.q;
        Context context2 = this.a;
        pls plsVar2 = this.p;
        pky pkyVar3 = (pky) objA;
        String packageName2 = context2.getPackageName();
        int i4 = Build.VERSION.SDK_INT;
        String strD2 = r11.d();
        String strE2 = pkyVar3.e();
        pkxVarC = pkyVar3.c();
        if (pkxVarC != null) {
            strName = "";
        } else {
            strName = "";
        }
        pwfVar2.c(packageName2, plsVar2.a, i4, true, strD2, true, strE2, strName, qnl.ae(context2));
        return pkyVar3;
    }
}
