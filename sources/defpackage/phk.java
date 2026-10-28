package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class phk implements pgs {
    public static final agsn a = agsn.h("GnpSdk");
    public final aunn b;
    public final phe c;
    public final pve d;
    public final omm e;
    public final tld f;
    private final aunn g;
    private final awou h;
    private final awou i;

    public phk(aunn aunnVar, aunn aunnVar2, phe pheVar, tld tldVar, omm ommVar, pve pveVar, awou awouVar, awou awouVar2) {
        aunnVar.getClass();
        aunnVar2.getClass();
        pheVar.getClass();
        tldVar.getClass();
        ommVar.getClass();
        pveVar.getClass();
        awouVar.getClass();
        awouVar2.getClass();
        this.b = aunnVar;
        this.g = aunnVar2;
        this.c = pheVar;
        this.f = tldVar;
        this.e = ommVar;
        this.d = pveVar;
        this.h = awouVar;
        this.i = awouVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.pgs
    public final Object a(pcu pcuVar, pot potVar, atr atrVar, awoq awoqVar) throws Throwable {
        phf phfVar;
        if (awoqVar instanceof phf) {
            phfVar = (phf) awoqVar;
            int i = phfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                phfVar.c = i - Integer.MIN_VALUE;
            } else {
                phfVar = new phf(this, awoqVar);
            }
        } else {
            phfVar = new phf(this, awoqVar);
        }
        Object objP = phfVar.a;
        awox awoxVar = awox.a;
        int i2 = phfVar.c;
        if (i2 == 0) {
            atqp.j(objP);
            ozj ozjVarB = nvj.b(potVar);
            agev agevVarA = ((pcn) this.g.io()).a(ozjVarB);
            if (agevVarA.g()) {
                awou awouVar = this.h;
                egh eghVar = new egh(agevVarA, pcuVar, ozjVarB, potVar, (awoq) null, 8);
                phfVar.d = atrVar;
                phfVar.c = 1;
                objP = awro.p(awouVar, eghVar, phfVar);
                if (objP == awoxVar) {
                    return awoxVar;
                }
            }
            return awmy.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atrVar = phfVar.d;
        atqp.j(objP);
        Bundle bundle = (Bundle) objP;
        if (bundle != null) {
            Bundle bundleB = atrVar.b();
            bundleB.getClass();
            bundleB.putBundle("EXTRA_REFRESH_APP_PROVIDED_DATA", bundle);
        }
        return awmy.a;
    }

    @Override // defpackage.pgs
    public final Object b(plb plbVar, phb phbVar, awoq awoqVar) {
        Object objA = nxf.a(this.h, this.i, new phh(this, plbVar, phbVar, null), awoqVar);
        return objA != awox.a ? awmy.a : objA;
    }

    @Override // defpackage.pgs
    public final Object c(pxk pxkVar, String str, plb plbVar, aifv aifvVar, phb phbVar, awoq awoqVar) {
        return nxf.a(this.h, this.i, new pqd(this, pxkVar, str, aifvVar, plbVar, phbVar, (awoq) null, 1), awoqVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(pxk pxkVar, awoq awoqVar) throws Throwable {
        phg phgVar;
        if (awoqVar instanceof phg) {
            phgVar = (phg) awoqVar;
            int i = phgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                phgVar.c = i - Integer.MIN_VALUE;
            } else {
                phgVar = new phg(this, awoqVar);
            }
        } else {
            phgVar = new phg(this, awoqVar);
        }
        Object objB = phgVar.a;
        awox awoxVar = awox.a;
        int i2 = phgVar.c;
        if (i2 == 0) {
            atqp.j(objB);
            if (pxkVar == null) {
                return null;
            }
            pve pveVar = this.d;
            phgVar.c = 1;
            objB = pveVar.b(pxkVar, phgVar);
            if (objB == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objB);
        }
        pky pkyVar = (pky) objB;
        int iAu = a.au(pkyVar);
        if (iAu != 0) {
            if (iAu != 1) {
                throw new awmj();
            }
            throw new plu("Failed to fetch account from storage");
        }
        plx plxVar = (plx) ((pla) pkyVar).a;
        if (plxVar != null) {
            return plxVar;
        }
        throw new plu("Account was not in storage");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    public final Object e(pcu pcuVar, List list, plb plbVar, phb phbVar, awoq awoqVar) throws Throwable {
        phi phiVar;
        phb phbVar2;
        pcu pcuVar2;
        Object obj;
        phb phbVar3;
        plb plbVar2;
        if (awoqVar instanceof phi) {
            phiVar = (phi) awoqVar;
            int i = phiVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                phiVar.e = i - Integer.MIN_VALUE;
            } else {
                phiVar = new phi(this, awoqVar);
            }
        } else {
            phiVar = new phi(this, awoqVar);
        }
        phi phiVar2 = phiVar;
        Object obj2 = phiVar2.c;
        awox awoxVar = awox.a;
        int i2 = phiVar2.e;
        if (i2 == 0) {
            atqp.j(obj2);
            if (list.isEmpty()) {
                return awno.a;
            }
            if (auwb.c() || auwe.c()) {
                awou awouVar = this.h;
                gme gmeVar = new gme(this, list, pcuVar, (awoq) null, 9);
                phiVar2.a = pcuVar;
                phiVar2.b = list;
                phiVar2.g = plbVar;
                phbVar2 = phbVar;
                phiVar2.f = phbVar2;
                phiVar2.e = 1;
                if (awro.p(awouVar, gmeVar, phiVar2) == awoxVar) {
                    return awoxVar;
                }
            } else {
                phbVar2 = phbVar;
            }
            pcuVar2 = pcuVar;
            obj = list;
            phbVar3 = phbVar2;
            plbVar2 = plbVar;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list2 = (List) phiVar2.a;
                atqp.j(obj2);
                return list2;
            }
            phb phbVar4 = phiVar2.f;
            plb plbVar3 = phiVar2.g;
            Object obj3 = phiVar2.b;
            pcu pcuVar3 = (pcu) phiVar2.a;
            atqp.j(obj2);
            phbVar3 = phbVar4;
            obj = obj3;
            pcuVar2 = pcuVar3;
            plbVar2 = plbVar3;
        }
        ArrayList arrayList = new ArrayList();
        awou awouVar2 = this.i;
        phj phjVar = new phj(obj, arrayList, this, pcuVar2, plbVar2, phbVar3, null);
        phiVar2.a = arrayList;
        phiVar2.b = null;
        phiVar2.g = null;
        phiVar2.f = null;
        phiVar2.e = 2;
        return awro.p(awouVar2, phjVar, phiVar2) != awoxVar ? arrayList : awoxVar;
    }
}
