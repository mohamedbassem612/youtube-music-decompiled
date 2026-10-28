package defpackage;

import android.content.Context;
import android.os.Build;
import internal.org.jni_zero.JniZero;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pmg implements pmc {
    public static final agsn a = agsn.h("GnpSdk");
    public final mbc b;
    public final Context c;
    public final Map d;
    public final pls e;
    public final aunn f;
    public final aunn g;
    public final aunn h;
    public final ijt i;
    private final awou j;

    public pmg(mbc mbcVar, Context context, Map map, pls plsVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, awou awouVar, ijt ijtVar) {
        mbcVar.getClass();
        context.getClass();
        plsVar.getClass();
        aunnVar.getClass();
        aunnVar2.getClass();
        aunnVar3.getClass();
        awouVar.getClass();
        ijtVar.getClass();
        this.b = mbcVar;
        this.c = context;
        this.d = map;
        this.e = plsVar;
        this.f = aunnVar;
        this.g = aunnVar2;
        this.h = aunnVar3;
        this.j = awouVar;
        this.i = ijtVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.pmc
    public final Object a(dyp dypVar, int i, awoq awoqVar) throws Throwable {
        pmd pmdVar;
        Throwable th;
        plg plgVar;
        if (awoqVar instanceof pmd) {
            pmdVar = (pmd) awoqVar;
            int i2 = pmdVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pmdVar.c = i2 - Integer.MIN_VALUE;
            } else {
                pmdVar = new pmd(this, awoqVar);
            }
        } else {
            pmdVar = new pmd(this, awoqVar);
        }
        Object obj = pmdVar.a;
        Object obj2 = awox.a;
        int i3 = pmdVar.c;
        if (i3 == 0) {
            atqp.j(obj);
            plg plgVar2 = new plg(1);
            try {
                awou awouVar = this.j;
                pmf pmfVar = new pmf(this, dypVar, i, null);
                pmdVar.d = plgVar2;
                pmdVar.c = 1;
                Object objP = awro.p(awouVar, pmfVar, pmdVar);
                if (objP != obj2) {
                    obj = objP;
                    plgVar = plgVar2;
                }
                return obj2;
            } catch (Throwable th2) {
                th = th2;
                plgVar = plgVar2;
                throw th;
            }
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        plgVar = pmdVar.d;
        try {
            atqp.j(obj);
        } catch (Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (Throwable th4) {
                JniZero.l(plgVar, th);
                throw th4;
            }
        }
        obj2 = (bbl) obj;
        JniZero.l(plgVar, null);
        return obj2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [agfr, java.lang.Object] */
    public final void b(long j, String str, pky pkyVar) {
        String strName;
        str.getClass();
        pwf pwfVar = (pwf) this.f.io();
        long epochMilli = this.b.f().toEpochMilli() - j;
        String packageName = this.c.getPackageName();
        int i = Build.VERSION.SDK_INT;
        String strE = pkyVar.e();
        pkx pkxVarC = pkyVar.c();
        if (pkxVarC == null || (strName = pkxVarC.name()) == null) {
            strName = "";
        }
        ((qtc) pwfVar.e.io()).b(epochMilli, packageName, this.e.a, Integer.valueOf(i), str, strE, strName);
    }
}
