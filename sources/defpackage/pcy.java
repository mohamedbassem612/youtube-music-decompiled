package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pcy {
    private static final agsn a = agsn.h("GnpSdk");
    private final Context b;
    private final pls c;
    private final pcb d;
    private final pav e;
    private final awmd f;
    private final ppe g;
    private final mbc h;

    public pcy(Context context, pls plsVar, pcb pcbVar, pav pavVar, awmd awmdVar, ppe ppeVar, mbc mbcVar) {
        context.getClass();
        plsVar.getClass();
        pcbVar.getClass();
        pavVar.getClass();
        awmdVar.getClass();
        ppeVar.getClass();
        mbcVar.getClass();
        this.b = context;
        this.c = plsVar;
        this.d = pcbVar;
        this.e = pavVar;
        this.f = awmdVar;
        this.g = ppeVar;
        this.h = mbcVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0103 A[LOOP:0: B:31:0x00fd->B:33:0x0103, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [paw] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Iterable] */
    static /* synthetic */ Object b(pcy pcyVar, plx plxVar, List list, plb plbVar, pax paxVar, boolean z, boolean z2, boolean z3, boolean z4, awoq awoqVar) throws Throwable {
        pcx pcxVar;
        plb plbVar2;
        pax paxVar2;
        boolean z5;
        boolean z6;
        pcy pcyVar2;
        plx plxVar2;
        ?? r10;
        boolean z7;
        long j;
        ?? r11;
        ArrayList arrayList;
        Iterator it;
        pcb pcbVar;
        if (awoqVar instanceof pcx) {
            pcxVar = (pcx) awoqVar;
            int i = pcxVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                pcxVar.g = i - Integer.MIN_VALUE;
            } else {
                pcxVar = new pcx(pcyVar, awoqVar);
            }
        } else {
            pcxVar = new pcx(pcyVar, awoqVar);
        }
        Object obj = pcxVar.e;
        awox awoxVar = awox.a;
        int i2 = pcxVar.g;
        if (i2 != 0) {
            if (i2 == 1) {
                j = pcxVar.d;
                z6 = pcxVar.c;
                z5 = pcxVar.b;
                paxVar2 = pcxVar.i;
                plbVar2 = pcxVar.k;
                Object obj2 = pcxVar.a;
                plxVar2 = pcxVar.j;
                pcyVar2 = pcxVar.h;
                atqp.j(obj);
                r11 = obj2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(obj);
            }
            return awmy.a;
        }
        atqp.j(obj);
        if (plxVar == null || plxVar.c() || z3 || z2) {
            plbVar2 = plbVar;
            paxVar2 = paxVar;
            z5 = z;
            z6 = z4;
            pcyVar2 = pcyVar;
            plxVar2 = plxVar;
            r10 = list;
            z7 = z2;
        } else {
            long jB = pcyVar.h.b();
            pcxVar.h = pcyVar;
            pcxVar.j = plxVar;
            pcxVar.a = list;
            pcxVar.k = plbVar;
            pcxVar.i = paxVar;
            pcxVar.b = z;
            pcxVar.c = z4;
            pcxVar.d = jB;
            pcxVar.g = 1;
            Object objA = pcyVar.a(plxVar, pcxVar);
            if (objA == awoxVar) {
                return awoxVar;
            }
            pcyVar2 = pcyVar;
            plxVar2 = plxVar;
            j = jB;
            paxVar2 = paxVar;
            r11 = list;
            plbVar2 = plbVar;
            obj = objA;
            z5 = z;
            z6 = z4;
        }
        arrayList = new ArrayList(atqq.N(r10, 10));
        it = r10.iterator();
        while (it.hasNext()) {
            arrayList.add(nxi.c((aiec) it.next()));
        }
        pcbVar = pcyVar2.d;
        pcxVar.h = null;
        pcxVar.j = null;
        pcxVar.a = null;
        pcxVar.k = null;
        pcxVar.i = null;
        pcxVar.g = 2;
        if (pcbVar.a(plxVar2, arrayList, plbVar2, paxVar2, z5, z6, z7, pcxVar) == awoxVar) {
            return awoxVar;
        }
        return awmy.a;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        paxVar2.c = new Long(pcyVar2.h.b() - j);
        if (!zBooleanValue) {
            ?? A = pcyVar2.e.a(ahyy.RECIPIENT_INVALID_CREDENTIALS);
            A.f(plxVar2);
            A.h(r11);
            ((pbc) A).k = paxVar2;
            A.a();
            ((pwf) pcyVar2.f.io()).m(pcyVar2.b.getPackageName(), pcyVar2.c.a, Build.VERSION.SDK_INT, "RECIPIENT_INVALID_CREDENTIALS");
            return awmy.a;
        }
        z7 = false;
        r10 = r11;
        arrayList = new ArrayList(atqq.N(r10, 10));
        it = r10.iterator();
        while (it.hasNext()) {
            arrayList.add(nxi.c((aiec) it.next()));
        }
        pcbVar = pcyVar2.d;
        pcxVar.h = null;
        pcxVar.j = null;
        pcxVar.a = null;
        pcxVar.k = null;
        pcxVar.i = null;
        pcxVar.g = 2;
        if (pcbVar.a(plxVar2, arrayList, plbVar2, paxVar2, z5, z6, z7, pcxVar) == awoxVar) {
            return awoxVar;
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(plx plxVar, awoq awoqVar) throws Throwable {
        pcw pcwVar;
        pky pkyVar;
        if (awoqVar instanceof pcw) {
            pcwVar = (pcw) awoqVar;
            int i = pcwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pcwVar.c = i - Integer.MIN_VALUE;
            } else {
                pcwVar = new pcw(this, awoqVar);
            }
        } else {
            pcwVar = new pcw(this, awoqVar);
        }
        Object objD = pcwVar.a;
        awox awoxVar = awox.a;
        int i2 = pcwVar.c;
        if (i2 == 0) {
            atqp.j(objD);
            if (plxVar == null) {
                return Boolean.TRUE;
            }
            pxk pxkVarB = plxVar.b();
            int iAx = a.ax(pxkVarB);
            if (iAx == 0) {
                ppe ppeVar = this.g;
                String str = ((pxo) pxkVarB).a;
                pcwVar.c = 1;
                objD = ppeVar.d(str, pcwVar);
                if (objD == awoxVar) {
                    return awoxVar;
                }
                pkyVar = (pky) objD;
            } else {
                if (iAx != 1) {
                    if (iAx != 2) {
                        throw new IllegalStateException("Credentials can be checked only for Gaia or delegated Gaia accounts.");
                    }
                    ((agsj) a.c()).t("fitbitAuthDataProvider not found, can't get fitbit auth token.");
                    return Boolean.FALSE;
                }
                String str2 = plxVar.d;
                if (str2 == null || str2.length() == 0) {
                    ((agsj) a.c()).t("Actual account name is empty for delegated Gaia, skipping auth check.");
                    return Boolean.TRUE;
                }
                ppe ppeVar2 = this.g;
                pcwVar.c = 2;
                objD = ppeVar2.d(str2, pcwVar);
                if (objD == awoxVar) {
                    return awoxVar;
                }
                pkyVar = (pky) objD;
            }
        } else if (i2 == 1) {
            atqp.j(objD);
            pkyVar = (pky) objD;
        } else if (i2 == 2) {
            atqp.j(objD);
            pkyVar = (pky) objD;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objD);
            pkyVar = (pky) objD;
        }
        if (pkyVar.h()) {
            pkyVar.f();
            return Boolean.FALSE;
        }
        if (!pkyVar.j()) {
            return Boolean.TRUE;
        }
        pkyVar.f();
        return Boolean.TRUE;
    }
}
