package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pse implements pqp {
    public static final agsn a = agsn.h("GnpSdk");
    public final agev b;
    public final axff c;
    private final agev d;
    private final psw e;
    private final pqm f;
    private final awou g;
    private final aunn h;
    private final pqn i;
    private final ppw j;
    private final ppy k;
    private final aunn l;
    private final mbc m;
    private final pls n;
    private final awmd o;
    private final pqg p;
    private final Context q;
    private final pwf r;
    private final agev s;
    private final awmd t;
    private final awmd u;
    private final omm v;
    private final omr w;
    private final omr x;
    private final oml y;
    private final isi z;

    public pse(agev agevVar, isi isiVar, oml omlVar, psw pswVar, pqm pqmVar, awou awouVar, omm ommVar, aunn aunnVar, pqn pqnVar, ppw ppwVar, ppy ppyVar, omr omrVar, aunn aunnVar2, mbc mbcVar, pls plsVar, awmd awmdVar, agev agevVar2, pqg pqgVar, Context context, pwf pwfVar, agev agevVar3, omr omrVar2, awmd awmdVar2, awmd awmdVar3) {
        isiVar.getClass();
        pqmVar.getClass();
        awouVar.getClass();
        ommVar.getClass();
        aunnVar.getClass();
        pqnVar.getClass();
        ppwVar.getClass();
        ppyVar.getClass();
        omrVar.getClass();
        aunnVar2.getClass();
        mbcVar.getClass();
        plsVar.getClass();
        pqgVar.getClass();
        context.getClass();
        pwfVar.getClass();
        awmdVar2.getClass();
        this.d = agevVar;
        this.z = isiVar;
        this.y = omlVar;
        this.e = pswVar;
        this.f = pqmVar;
        this.g = awouVar;
        this.v = ommVar;
        this.h = aunnVar;
        this.i = pqnVar;
        this.j = ppwVar;
        this.k = ppyVar;
        this.w = omrVar;
        this.l = aunnVar2;
        this.m = mbcVar;
        this.n = plsVar;
        this.o = awmdVar;
        this.b = agevVar2;
        this.p = pqgVar;
        this.q = context;
        this.r = pwfVar;
        this.s = agevVar3;
        this.x = omrVar2;
        this.t = awmdVar2;
        this.u = awmdVar3;
        this.c = new axfi(false);
    }

    private final void m(awut awutVar, aier aierVar, String str) {
        awro.t(awutVar, null, 0, new pst(this, aierVar, str, (awoq) null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [agfr, java.lang.Object] */
    private static final void n(pse pseVar, aier aierVar, plv plvVar, String str) {
        ((qtf) pseVar.r.s.io()).b(1L, pseVar.q.getPackageName(), pseVar.n.a, aierVar.name(), str, plvVar.name());
    }

    private final omm o(plv plvVar) {
        if (plvVar.a()) {
            return this.v;
        }
        if (!plvVar.b()) {
            throw new IllegalStateException("Unsupported targetType for GnpRegistrationHandlerImpl");
        }
        Object objIo = this.h.io();
        objIo.getClass();
        return (omm) objIo;
    }

    @Override // defpackage.pqp
    public final Object a(aier aierVar, plv plvVar, String str, awoq awoqVar) {
        return awro.p(this.g, new psd(this, aierVar, plvVar, str, null), awoqVar);
    }

    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0155  */
    /* JADX WARN: Code duplicated, block: B:67:0x0158  */
    /* JADX WARN: Code duplicated, block: B:68:0x015c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0162  */
    /* JADX WARN: Code duplicated, block: B:73:0x0172 A[LOOP:0: B:71:0x016c->B:73:0x0172, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0188  */
    /* JADX WARN: Code duplicated, block: B:79:0x019d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [pve] */
    /* JADX WARN: Type inference failed for: r1v10, types: [awou, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v22 */
    public final Object b(Map map, plv plvVar, awoq awoqVar) throws Throwable {
        prr prrVar;
        Map map2;
        plv plvVar2;
        Map map3;
        Object obj;
        plv plvVar3;
        ?? r2;
        Map map4;
        pky pkyVar;
        int iAu;
        pky pkyVar2;
        int iAu2;
        plv plvVar4 = plvVar;
        if (awoqVar instanceof prr) {
            prrVar = (prr) awoqVar;
            int i = prrVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                prrVar.f = i - Integer.MIN_VALUE;
            } else {
                prrVar = new prr(this, awoqVar);
            }
        } else {
            prrVar = new prr(this, awoqVar);
        }
        Object objC = prrVar.d;
        awox awoxVar = awox.a;
        int i2 = prrVar.f;
        if (i2 != 0) {
            if (i2 == 1) {
                plvVar4 = (plv) prrVar.b;
                map2 = (Map) prrVar.a;
                atqp.j(objC);
            } else {
                if (i2 == 2) {
                    Object obj2 = prrVar.c;
                    map3 = (Map) prrVar.b;
                    plvVar3 = (plv) prrVar.a;
                    atqp.j(objC);
                    obj = obj2;
                    pkyVar = (pky) objC;
                    iAu = a.au(pkyVar);
                    if (iAu != 0) {
                        if (iAu == 1) {
                            return (pku) pkyVar;
                        }
                        throw new awmj();
                    }
                    for (plx plxVar : (List) ((pla) pkyVar).a) {
                        map3.put(plxVar.b(), plxVar);
                    }
                    r2 = obj;
                    plvVar2 = plvVar3;
                    if (!r2.isEmpty()) {
                        ?? F = this.y.f(plvVar2);
                        prrVar.a = map3;
                        prrVar.b = null;
                        prrVar.c = null;
                        prrVar.f = 3;
                        objC = F.e(r2, prrVar);
                        if (objC == awoxVar) {
                            return awoxVar;
                        }
                        map4 = map3;
                    }
                    return new pla(map3);
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map4 = (Map) prrVar.a;
                atqp.j(objC);
            }
            pkyVar2 = (pky) objC;
            iAu2 = a.au(pkyVar2);
            if (iAu2 != 0) {
                if (iAu2 == 1) {
                    return (pku) pkyVar2;
                }
                throw new awmj();
            }
            ((Number) ((pla) pkyVar2).a).intValue();
            map3 = map4;
            return new pla(map3);
        }
        atqp.j(objC);
        pve pveVarF = this.y.f(plvVar4);
        map2 = map;
        prrVar.a = map2;
        prrVar.b = plvVar4;
        prrVar.f = 1;
        objC = pveVarF.c(prrVar);
        if (objC == awoxVar) {
            return awoxVar;
        }
        plvVar2 = plvVar4;
        Map map5 = map2;
        pky pkyVar3 = (pky) objC;
        int iAu3 = a.au(pkyVar3);
        if (iAu3 != 0) {
            if (iAu3 == 1) {
                return (pku) pkyVar3;
            }
            throw new awmj();
        }
        List<plx> list = (List) ((pla) pkyVar3).a;
        map3 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (plx plxVar2 : list) {
            pxk pxkVarB = plxVar2.b();
            map3.put(pxkVarB, plxVar2);
            pxj pxjVar = (pxj) map5.get(pxkVarB);
            if (pxjVar != null) {
                agkz agkzVar = plxVar2.h;
                if (agkzVar == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Set set = pxjVar.a;
                boolean zContainsAll = agkzVar.containsAll(set);
                boolean z = false;
                if ((pxkVarB instanceof pxl) && !awrc.c(plxVar2.d, pxjVar.b)) {
                    z = true;
                }
                if (zContainsAll) {
                    if (z) {
                        z = true;
                    }
                }
                plw plwVar = new plw(plxVar2);
                if (!zContainsAll) {
                    agkz agkzVarN = agkz.n(set);
                    agkzVarN.getClass();
                    plwVar.e = agkzVarN;
                }
                if (z) {
                    plwVar.b = pxjVar.b;
                    plwVar.c = null;
                }
                plx plxVarA = plwVar.a();
                arrayList.add(plxVarA);
                map3.put(pxkVarB, plxVarA);
            }
        }
        Set setKeySet = map5.keySet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : setKeySet) {
            if (!map3.containsKey((pxk) obj3)) {
                arrayList2.add(obj3);
            }
        }
        r2 = arrayList;
        if (!arrayList2.isEmpty()) {
            isi isiVar = this.z;
            prrVar.a = plvVar2;
            prrVar.b = map3;
            prrVar.c = arrayList;
            prrVar.f = 2;
            Object objP = awro.p(isiVar.a, new pwj(isiVar, arrayList2, plvVar2, map5, null), prrVar);
            if (objP == awoxVar) {
                return awoxVar;
            }
            objC = objP;
            obj = arrayList;
            plvVar3 = plvVar2;
            pkyVar = (pky) objC;
            iAu = a.au(pkyVar);
            if (iAu != 0) {
                if (iAu == 1) {
                    return (pku) pkyVar;
                }
                throw new awmj();
            }
            while (r2.hasNext()) {
                map3.put(plxVar.b(), plxVar);
            }
            r2 = obj;
            plvVar2 = plvVar3;
            if (!r2.isEmpty()) {
                ?? F2 = this.y.f(plvVar2);
                prrVar.a = map3;
                prrVar.b = null;
                prrVar.c = null;
                prrVar.f = 3;
                objC = F2.e(r2, prrVar);
                if (objC == awoxVar) {
                    return awoxVar;
                }
                map4 = map3;
                pkyVar2 = (pky) objC;
                iAu2 = a.au(pkyVar2);
                if (iAu2 != 0) {
                    if (iAu2 == 1) {
                        return (pku) pkyVar2;
                    }
                    throw new awmj();
                }
                ((Number) ((pla) pkyVar2).a).intValue();
                map3 = map4;
            }
        } else if (!r2.isEmpty()) {
            ?? F3 = this.y.f(plvVar2);
            prrVar.a = map3;
            prrVar.b = null;
            prrVar.c = null;
            prrVar.f = 3;
            objC = F3.e(r2, prrVar);
            if (objC == awoxVar) {
                return awoxVar;
            }
            map4 = map3;
            pkyVar2 = (pky) objC;
            iAu2 = a.au(pkyVar2);
            if (iAu2 != 0) {
                if (iAu2 == 1) {
                    return (pku) pkyVar2;
                }
                throw new awmj();
            }
            ((Number) ((pla) pkyVar2).a).intValue();
            map3 = map4;
        }
        return new pla(map3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(pxs pxsVar, plv plvVar, awoq awoqVar) throws Throwable {
        prs prsVar;
        pqo pqoVar;
        if (awoqVar instanceof prs) {
            prsVar = (prs) awoqVar;
            int i = prsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                prsVar.c = i - Integer.MIN_VALUE;
            } else {
                prsVar = new prs(this, awoqVar);
            }
        } else {
            prsVar = new prs(this, awoqVar);
        }
        Object objF = prsVar.a;
        awox awoxVar = awox.a;
        int i2 = prsVar.c;
        boolean z = false;
        if (i2 == 0) {
            atqp.j(objF);
            if (qnl.aq(pxsVar) != pqo.UNKNOWN) {
                pqo pqoVarAq = qnl.aq(pxsVar);
                omm ommVarO = o(plvVar);
                prsVar.d = pqoVarAq;
                prsVar.c = 1;
                objF = ommVarO.f(prsVar);
                if (objF == awoxVar) {
                    return awoxVar;
                }
                pqoVar = pqoVarAq;
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pqoVar = prsVar.d;
        atqp.j(objF);
        if (pqoVar != objF) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(pxs pxsVar, String str, plv plvVar, awoq awoqVar) throws Throwable {
        prt prtVar;
        pqo pqoVarAq;
        String str2;
        if (awoqVar instanceof prt) {
            prtVar = (prt) awoqVar;
            int i = prtVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                prtVar.c = i - Integer.MIN_VALUE;
            } else {
                prtVar = new prt(this, awoqVar);
            }
        } else {
            prtVar = new prt(this, awoqVar);
        }
        Object objF = prtVar.a;
        awox awoxVar = awox.a;
        int i2 = prtVar.c;
        boolean z = false;
        if (i2 != 0) {
            if (i2 == 1) {
                pqoVarAq = prtVar.f;
                plvVar = prtVar.e;
                str = prtVar.d;
                atqp.j(objF);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = prtVar.d;
                atqp.j(objF);
            }
            if (!awrc.c(str2, objF)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        atqp.j(objF);
        if (plvVar.a()) {
            return Boolean.FALSE;
        }
        pqoVarAq = qnl.aq(pxsVar);
        omm ommVarO = o(plvVar);
        prtVar.d = str;
        prtVar.e = plvVar;
        prtVar.f = pqoVarAq;
        prtVar.c = 1;
        objF = ommVarO.f(prtVar);
        if (objF == awoxVar) {
            return awoxVar;
        }
        if (objF == pqoVarAq && pqoVarAq == pqo.SIGNED_OUT_ZWIEBACK) {
            omm ommVarO2 = o(plvVar);
            prtVar.d = str;
            prtVar.e = null;
            prtVar.f = null;
            prtVar.c = 2;
            objF = ommVarO2.i(prtVar);
            if (objF == awoxVar) {
                return awoxVar;
            }
            str2 = str;
            if (!awrc.c(str2, objF)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(int i, int i2, String str, plv plvVar, awoq awoqVar) throws Throwable {
        pru pruVar;
        String str2;
        plv plvVar2;
        long epochMilli;
        if (awoqVar instanceof pru) {
            pruVar = (pru) awoqVar;
            int i3 = pruVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pruVar.f = i3 - Integer.MIN_VALUE;
            } else {
                pruVar = new pru(this, awoqVar);
            }
        } else {
            pruVar = new pru(this, awoqVar);
        }
        Object objG = pruVar.d;
        awox awoxVar = awox.a;
        int i4 = pruVar.f;
        if (i4 == 0) {
            atqp.j(objG);
            if (i != 0 && i == i2) {
                omm ommVarO = o(plvVar);
                pruVar.a = str;
                pruVar.b = plvVar;
                pruVar.f = 1;
                objG = ommVarO.g(pruVar);
                if (objG == awoxVar) {
                    return awoxVar;
                }
            }
            return Boolean.TRUE;
        }
        if (i4 == 1) {
            plvVar = (plv) pruVar.b;
            str = (String) pruVar.a;
            atqp.j(objG);
        } else {
            if (i4 == 2) {
                str2 = (String) pruVar.b;
                plvVar2 = (plv) pruVar.a;
                atqp.j(objG);
                if (awrc.c(str2, objG)) {
                    return Boolean.TRUE;
                }
                plvVar = plvVar2;
                if (plvVar.a()) {
                    if (auvj.a.io().i()) {
                        return Boolean.TRUE;
                    }
                    epochMilli = this.m.f().toEpochMilli();
                    omm ommVarO2 = o(plvVar);
                    pruVar.a = null;
                    pruVar.b = null;
                    pruVar.c = epochMilli;
                    pruVar.f = 3;
                    objG = ommVarO2.j(pruVar);
                    if (objG == awoxVar) {
                        return awoxVar;
                    }
                }
                return Boolean.FALSE;
            }
            if (i4 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            epochMilli = pruVar.c;
            atqp.j(objG);
        }
        if (epochMilli - ((Number) objG).longValue() > Math.max(0L, this.n.e)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
        if (awrc.c(objG, this.o.io())) {
            if (str != null) {
                omm ommVarO3 = o(plvVar);
                pruVar.a = plvVar;
                pruVar.b = str;
                pruVar.f = 2;
                objG = ommVarO3.i(pruVar);
                if (objG == awoxVar) {
                    return awoxVar;
                }
                str2 = str;
                plvVar2 = plvVar;
                if (awrc.c(str2, objG)) {
                    return Boolean.TRUE;
                }
                plvVar = plvVar2;
                if (plvVar.a()) {
                    if (auvj.a.io().i()) {
                        return Boolean.TRUE;
                    }
                    epochMilli = this.m.f().toEpochMilli();
                    omm ommVarO4 = o(plvVar);
                    pruVar.a = null;
                    pruVar.b = null;
                    pruVar.c = epochMilli;
                    pruVar.f = 3;
                    objG = ommVarO4.j(pruVar);
                    if (objG == awoxVar) {
                        return awoxVar;
                    }
                    if (epochMilli - ((Number) objG).longValue() > Math.max(0L, this.n.e)) {
                        return Boolean.TRUE;
                    }
                }
            } else if (plvVar.a()) {
                if (auvj.a.io().i()) {
                    return Boolean.TRUE;
                }
                epochMilli = this.m.f().toEpochMilli();
                omm ommVarO5 = o(plvVar);
                pruVar.a = null;
                pruVar.b = null;
                pruVar.c = epochMilli;
                pruVar.f = 3;
                objG = ommVarO5.j(pruVar);
                if (objG == awoxVar) {
                    return awoxVar;
                }
                if (epochMilli - ((Number) objG).longValue() > Math.max(0L, this.n.e)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [pqg] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r6v1, types: [pss] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final Object f(awoq awoqVar) throws Throwable {
        prv prvVar;
        pqg pqgVar;
        pss pssVar;
        ?? r6;
        ?? r2;
        pky pkyVar;
        int iAu;
        if (awoqVar instanceof prv) {
            prvVar = (prv) awoqVar;
            int i = prvVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                prvVar.d = i - Integer.MIN_VALUE;
            } else {
                prvVar = new prv(this, awoqVar);
            }
        } else {
            prvVar = new prv(this, awoqVar);
        }
        Object objE = prvVar.b;
        awox awoxVar = awox.a;
        int i2 = prvVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                Object obj = prvVar.a;
                pss pssVar2 = prvVar.e;
                atqp.j(objE);
                r2 = obj;
                r6 = pssVar2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(objE);
            }
            pkyVar = (pky) objE;
            iAu = a.au(pkyVar);
            if (iAu != 0) {
                return ((Boolean) ((pla) pkyVar).a).booleanValue() ? this.p.a() : new pla(awmy.a);
            }
            if (iAu == 1) {
                return new pqi(((pku) pkyVar).b(), pkx.aG, false);
            }
            throw new awmj();
        }
        atqp.j(objE);
        pqgVar = this.p;
        omm ommVar = this.v;
        pssVar = pss.a;
        prvVar.e = pssVar;
        prvVar.a = pqgVar;
        prvVar.d = 1;
        objE = ommVar.e(prvVar);
        if (objE == awoxVar) {
            r2 = pqgVar;
            r6 = pssVar;
            return awoxVar;
        }
        r2 = pqgVar;
        r6 = pssVar;
        prvVar.e = null;
        prvVar.a = null;
        prvVar.d = 2;
        objE = r6.b(r2, (String) objE, false);
        if (objE == awoxVar) {
            return awoxVar;
        }
        pkyVar = (pky) objE;
        iAu = a.au(pkyVar);
        if (iAu != 0) {
            if (((Boolean) ((pla) pkyVar).a).booleanValue()) {
            }
        }
        if (iAu == 1) {
            return new pqi(((pku) pkyVar).b(), pkx.aG, false);
        }
        throw new awmj();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x017b  */
    /* JADX WARN: Code duplicated, block: B:44:0x017e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0191  */
    /* JADX WARN: Code duplicated, block: B:48:0x0197  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:56:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:59:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:64:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [awou, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r27v0, types: [pse] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [pxs] */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final Object g(awut awutVar, aier aierVar, boolean z, plv plvVar, String str, awoq awoqVar) throws Throwable {
        prw prwVar;
        awut awutVar2;
        boolean z2;
        aier aierVar2;
        plv plvVar2;
        long j;
        String str2;
        Object objB;
        ?? r7;
        boolean z3;
        String str3;
        plv plvVar3;
        ?? r3;
        aier aierVar3;
        awut awutVar3;
        pky pkyVar;
        int iAu;
        LinkedHashMap linkedHashMap;
        Map map;
        pky pkyVar2;
        if (awoqVar instanceof prw) {
            prwVar = (prw) awoqVar;
            int i = prwVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                prwVar.h = i - Integer.MIN_VALUE;
            } else {
                prwVar = new prw(this, awoqVar);
            }
        } else {
            prwVar = new prw(this, awoqVar);
        }
        prw prwVar2 = prwVar;
        Object objP = prwVar2.f;
        awox awoxVar = awox.a;
        int i2 = prwVar2.h;
        if (i2 != 0) {
            if (i2 == 1) {
                j = prwVar2.e;
                z2 = prwVar2.d;
                str2 = prwVar2.k;
                plvVar2 = prwVar2.j;
                aierVar2 = prwVar2.i;
                awutVar2 = (awut) prwVar2.a;
                atqp.j(objP);
            } else if (i2 == 2) {
                boolean z4 = prwVar2.d;
                Object obj = prwVar2.c;
                Object obj2 = prwVar2.b;
                str3 = prwVar2.k;
                plvVar3 = prwVar2.j;
                aier aierVar4 = prwVar2.i;
                awutVar3 = (awut) prwVar2.a;
                atqp.j(objP);
                z3 = z4;
                objB = objP;
                r7 = obj2;
                r3 = obj;
                aierVar3 = aierVar4;
                pkyVar = (pky) objB;
                iAu = a.au(pkyVar);
                if (iAu != 0) {
                    if (iAu == 1) {
                        throw new awmj();
                    }
                    pku pkuVar = (pku) pkyVar;
                    ((agsj) ((agsj) a.c()).j(pkuVar.b())).t("Failed creating GNP accounts.");
                    return pkuVar;
                }
                Map map2 = (Map) ((pla) pkyVar).a;
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map2.entrySet()) {
                    if (((agpn) r7.a()).keySet().contains((pxk) entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                linkedHashMap.size();
                prwVar2.a = linkedHashMap;
                prwVar2.i = null;
                prwVar2.j = null;
                prwVar2.k = null;
                prwVar2.b = null;
                prwVar2.c = null;
                prwVar2.h = 3;
                objP = h(awutVar3, aierVar3, r3, map2, z3, plvVar3, r7, str3, prwVar2);
                if (objP != awoxVar) {
                    return awoxVar;
                }
                map = linkedHashMap;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = (Map) prwVar2.a;
                atqp.j(objP);
            }
            pkyVar2 = (pky) objP;
            if (pkyVar2 instanceof pku) {
                return pkyVar2;
            }
            this.x.b(pkyVar2, atqq.aw(map.values()));
            return pkyVar2;
        }
        atqp.j(objP);
        if (!plvVar.b() && !((Boolean) this.t.io()).booleanValue() && !((Boolean) this.u.io()).booleanValue()) {
            ((agsj) a.c()).t("Non fetch registrations shouldn't be made for non-push-flow clients.");
            return new pla(awmy.a);
        }
        if (aierVar == aier.REGISTRATION_REASON_UNSPECIFIED) {
            return new pkv("Registration reason is unspecified.", pkx.af);
        }
        if (new aihx(auvj.a.io().a().c, poz.a).contains(aierVar)) {
            ((agsj) a.c()).w("Registration is disabled for %s.", aierVar);
            n(this, aierVar, plvVar, "DISABLED");
            Objects.toString(aierVar);
            return new pkv("Registration is disabled for registration reason ".concat(String.valueOf(aierVar)), pkx.ag);
        }
        n(this, aierVar, plvVar, "SUCCESS");
        omm ommVarAp = qnl.ap(this.d, plvVar, this.t);
        long epochMilli = this.m.f().toEpochMilli();
        prwVar2.a = awutVar;
        prwVar2.i = aierVar;
        prwVar2.j = plvVar;
        prwVar2.k = str;
        prwVar2.d = z;
        prwVar2.e = epochMilli;
        prwVar2.h = 1;
        objP = awro.p(ommVarAp.a, new bej(ommVarAp, (awoq) null, 10), prwVar2);
        if (objP == awoxVar) {
            return awoxVar;
        }
        awutVar2 = awutVar;
        z2 = z;
        aierVar2 = aierVar;
        plvVar2 = plvVar;
        j = epochMilli;
        str2 = str;
        pxs pxsVar = (pxs) objP;
        if (pxsVar instanceof pxt) {
            return new pkw("Failed to get registration data.", pkx.an);
        }
        this.r.o(this.m.f().toEpochMilli() - j, this.q.getPackageName(), this.n.a, Build.VERSION.SDK_INT, "REGISTRATION_DATA_FETCH");
        Map mapA = pxsVar.a();
        List listAp = atqq.ap(((agpn) mapA).keySet());
        prwVar2.a = awutVar2;
        prwVar2.i = aierVar2;
        prwVar2.j = plvVar2;
        prwVar2.k = str2;
        prwVar2.b = pxsVar;
        prwVar2.c = listAp;
        prwVar2.d = z2;
        prwVar2.h = 2;
        objB = b(mapA, plvVar2, prwVar2);
        if (objB == awoxVar) {
            return awoxVar;
        }
        r7 = pxsVar;
        z3 = z2;
        str3 = str2;
        plvVar3 = plvVar2;
        r3 = listAp;
        aierVar3 = aierVar2;
        awutVar3 = awutVar2;
        pkyVar = (pky) objB;
        iAu = a.au(pkyVar);
        if (iAu != 0) {
            if (iAu == 1) {
                throw new awmj();
            }
            pku pkuVar2 = (pku) pkyVar;
            ((agsj) ((agsj) a.c()).j(pkuVar2.b())).t("Failed creating GNP accounts.");
            return pkuVar2;
        }
        Map map3 = (Map) ((pla) pkyVar).a;
        linkedHashMap = new LinkedHashMap();
        while (r1.hasNext()) {
            if (((agpn) r7.a()).keySet().contains((pxk) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        linkedHashMap.size();
        prwVar2.a = linkedHashMap;
        prwVar2.i = null;
        prwVar2.j = null;
        prwVar2.k = null;
        prwVar2.b = null;
        prwVar2.c = null;
        prwVar2.h = 3;
        objP = h(awutVar3, aierVar3, r3, map3, z3, plvVar3, r7, str3, prwVar2);
        if (objP != awoxVar) {
            return awoxVar;
        }
        map = linkedHashMap;
        pkyVar2 = (pky) objP;
        if (pkyVar2 instanceof pku) {
            return pkyVar2;
        }
        this.x.b(pkyVar2, atqq.aw(map.values()));
        return pkyVar2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:30:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:32:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:35:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:37:0x0211  */
    /* JADX WARN: Code duplicated, block: B:40:0x0227  */
    /* JADX WARN: Code duplicated, block: B:44:0x024c A[PHI: r2 r4 r5 r6 r7 r8 r9 r10 r11 r14
      0x024c: PHI (r2v15 int) = (r2v13 int), (r2v16 int) binds: [B:39:0x0225, B:43:0x024a] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r4v10 boolean) = (r4v8 boolean), (r4v11 boolean) binds: [B:39:0x0225, B:43:0x024a] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r5v11 java.lang.String) = (r5v9 java.lang.String), (r5v12 java.lang.String) binds: [B:39:0x0225, B:43:0x024a] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r6v12 java.lang.String) = (r6v10 java.lang.String), (r6v13 java.lang.String) binds: [B:39:0x0225, B:43:0x024a] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r7v12 pxs) = (r7v9 pxs), (r7v13 pxs) binds: [B:39:0x0225, B:43:0x024a] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r8v13 plv) = (r8v10 plv), (r8v14 plv) binds: [B:39:0x0225, B:43:0x024a] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r9v13 java.util.Map) = (r9v10 java.util.Map), (r9v14 java.util.Map) binds: [B:39:0x0225, B:43:0x024a] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r10v13 java.util.List) = (r10v10 java.util.List), (r10v14 java.util.List) binds: [B:39:0x0225, B:43:0x024a] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r11v12 aier) = (r11v9 aier), (r11v13 aier) binds: [B:39:0x0225, B:43:0x024a] A[DONT_GENERATE, DONT_INLINE]
      0x024c: PHI (r14v8 awut) = (r14v5 awut), (r14v9 awut) binds: [B:39:0x0225, B:43:0x024a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0252  */
    /* JADX WARN: Code duplicated, block: B:48:0x0271 A[PHI: r2 r4 r5 r6 r7 r8 r9 r10 r11 r14
      0x0271: PHI (r2v18 int) = (r2v15 int), (r2v15 int), (r2v19 int) binds: [B:45:0x0250, B:47:0x026f, B:18:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r4v13 boolean) = (r4v10 boolean), (r4v10 boolean), (r4v14 boolean) binds: [B:45:0x0250, B:47:0x026f, B:18:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r5v14 java.lang.String) = (r5v11 java.lang.String), (r5v11 java.lang.String), (r5v15 java.lang.String) binds: [B:45:0x0250, B:47:0x026f, B:18:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r6v15 java.lang.String) = (r6v12 java.lang.String), (r6v12 java.lang.String), (r6v16 java.lang.String) binds: [B:45:0x0250, B:47:0x026f, B:18:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r7v16 pxs) = (r7v12 pxs), (r7v12 pxs), (r7v18 pxs) binds: [B:45:0x0250, B:47:0x026f, B:18:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r8v17 plv) = (r8v13 plv), (r8v13 plv), (r8v19 plv) binds: [B:45:0x0250, B:47:0x026f, B:18:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r9v17 java.util.Map) = (r9v13 java.util.Map), (r9v13 java.util.Map), (r9v19 java.util.Map) binds: [B:45:0x0250, B:47:0x026f, B:18:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r10v17 java.util.List) = (r10v13 java.util.List), (r10v13 java.util.List), (r10v19 java.util.List) binds: [B:45:0x0250, B:47:0x026f, B:18:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r11v16 aier) = (r11v12 aier), (r11v12 aier), (r11v18 aier) binds: [B:45:0x0250, B:47:0x026f, B:18:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r14v12 awut) = (r14v8 awut), (r14v8 awut), (r14v14 awut) binds: [B:45:0x0250, B:47:0x026f, B:18:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0277  */
    /* JADX WARN: Code duplicated, block: B:58:0x02a5 A[PHI: r2 r4 r5 r6 r7 r8 r9 r10 r11 r14
      0x02a5: PHI (r2v22 int) = (r2v16 int), (r2v18 int), (r2v24 int), (r2v24 int) binds: [B:43:0x024a, B:49:0x0275, B:53:0x0298, B:55:0x029f] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r4v17 boolean) = (r4v11 boolean), (r4v13 boolean), (r4v19 boolean), (r4v19 boolean) binds: [B:43:0x024a, B:49:0x0275, B:53:0x0298, B:55:0x029f] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r5v20 java.lang.String) = (r5v12 java.lang.String), (r5v14 java.lang.String), (r5v22 java.lang.String), (r5v22 java.lang.String) binds: [B:43:0x024a, B:49:0x0275, B:53:0x0298, B:55:0x029f] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r6v19 java.lang.String) = (r6v13 java.lang.String), (r6v15 java.lang.String), (r6v21 java.lang.String), (r6v21 java.lang.String) binds: [B:43:0x024a, B:49:0x0275, B:53:0x0298, B:55:0x029f] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r7v20 pxs) = (r7v13 pxs), (r7v16 pxs), (r7v22 pxs), (r7v22 pxs) binds: [B:43:0x024a, B:49:0x0275, B:53:0x0298, B:55:0x029f] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r8v21 plv) = (r8v14 plv), (r8v17 plv), (r8v23 plv), (r8v23 plv) binds: [B:43:0x024a, B:49:0x0275, B:53:0x0298, B:55:0x029f] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r9v21 java.util.Map) = (r9v14 java.util.Map), (r9v17 java.util.Map), (r9v23 java.util.Map), (r9v23 java.util.Map) binds: [B:43:0x024a, B:49:0x0275, B:53:0x0298, B:55:0x029f] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r10v21 java.util.List) = (r10v14 java.util.List), (r10v17 java.util.List), (r10v23 java.util.List), (r10v23 java.util.List) binds: [B:43:0x024a, B:49:0x0275, B:53:0x0298, B:55:0x029f] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r11v21 aier) = (r11v13 aier), (r11v16 aier), (r11v23 aier), (r11v23 aier) binds: [B:43:0x024a, B:49:0x0275, B:53:0x0298, B:55:0x029f] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r14v15 awut) = (r14v9 awut), (r14v12 awut), (r14v16 awut), (r14v16 awut) binds: [B:43:0x024a, B:49:0x0275, B:53:0x0298, B:55:0x029f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x02af A[PHI: r1 r2 r4 r5 r6 r7 r8 r9 r10 r11
      0x02af: PHI (r1v30 int) = (r1v14 int), (r1v32 int) binds: [B:34:0x01f2, B:58:0x02a5] A[DONT_GENERATE, DONT_INLINE]
      0x02af: PHI (r2v20 boolean) = (r2v10 boolean), (r2v23 boolean) binds: [B:34:0x01f2, B:58:0x02a5] A[DONT_GENERATE, DONT_INLINE]
      0x02af: PHI (r4v15 java.lang.String) = (r4v5 java.lang.String), (r4v18 java.lang.String) binds: [B:34:0x01f2, B:58:0x02a5] A[DONT_GENERATE, DONT_INLINE]
      0x02af: PHI (r5v16 java.lang.String) = (r5v6 java.lang.String), (r5v21 java.lang.String) binds: [B:34:0x01f2, B:58:0x02a5] A[DONT_GENERATE, DONT_INLINE]
      0x02af: PHI (r6v17 pxs) = (r6v6 pxs), (r6v20 pxs) binds: [B:34:0x01f2, B:58:0x02a5] A[DONT_GENERATE, DONT_INLINE]
      0x02af: PHI (r7v19 plv) = (r7v5 plv), (r7v21 plv) binds: [B:34:0x01f2, B:58:0x02a5] A[DONT_GENERATE, DONT_INLINE]
      0x02af: PHI (r8v20 java.util.Map) = (r8v6 java.util.Map), (r8v22 java.util.Map) binds: [B:34:0x01f2, B:58:0x02a5] A[DONT_GENERATE, DONT_INLINE]
      0x02af: PHI (r9v20 java.util.List) = (r9v6 java.util.List), (r9v22 java.util.List) binds: [B:34:0x01f2, B:58:0x02a5] A[DONT_GENERATE, DONT_INLINE]
      0x02af: PHI (r10v20 aier) = (r10v6 aier), (r10v22 aier) binds: [B:34:0x01f2, B:58:0x02a5] A[DONT_GENERATE, DONT_INLINE]
      0x02af: PHI (r11v19 awut) = (r11v5 awut), (r11v22 awut) binds: [B:34:0x01f2, B:58:0x02a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:64:0x031d  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0242, code lost:
    
        if (r1 != r13) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0292, code lost:
    
        if (r1 != r13) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.awut r18, defpackage.aier r19, java.util.List r20, java.util.Map r21, boolean r22, defpackage.plv r23, defpackage.pxs r24, java.lang.String r25, defpackage.awoq r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pse.h(awut, aier, java.util.List, java.util.Map, boolean, plv, pxs, java.lang.String, awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0130  */
    /* JADX WARN: Code duplicated, block: B:38:0x0151  */
    /* JADX WARN: Code duplicated, block: B:40:0x0176  */
    /* JADX WARN: Code duplicated, block: B:43:0x0187  */
    /* JADX WARN: Code duplicated, block: B:45:0x018a  */
    /* JADX WARN: Code duplicated, block: B:47:0x018d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0193  */
    /* JADX WARN: Code duplicated, block: B:51:0x019b  */
    /* JADX WARN: Code duplicated, block: B:54:0x01cd A[LOOP:1: B:52:0x01c7->B:54:0x01cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0219  */
    /* JADX WARN: Code duplicated, block: B:60:0x021f  */
    /* JADX WARN: Code duplicated, block: B:62:0x025b A[PHI: r0 r1 r2 r3 r4 r6 r12 r13 r14 r15
      0x025b: PHI (r0v7 aiaz) = (r0v4 aiaz), (r0v25 aiaz) binds: [B:61:0x0259, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r1v29 java.lang.Object) = (r1v20 java.lang.Object), (r1v1 java.lang.Object) binds: [B:61:0x0259, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r2v18 pse) = (r2v13 pse), (r2v21 pse) binds: [B:61:0x0259, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r3v11 int) = (r3v4 int), (r3v16 int) binds: [B:61:0x0259, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r4v12 java.util.Map) = (r4v5 java.util.Map), (r4v14 java.util.Map) binds: [B:61:0x0259, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r6v10 plv) = (r6v6 plv), (r6v12 plv) binds: [B:61:0x0259, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r12v9 aier) = (r12v6 aier), (r12v11 aier) binds: [B:61:0x0259, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r13v9 pxs) = (r13v6 pxs), (r13v11 pxs) binds: [B:61:0x0259, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r14v15 java.lang.String) = (r14v12 java.lang.String), (r14v17 java.lang.String) binds: [B:61:0x0259, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r15v11 java.util.List) = (r15v8 java.util.List), (r15v13 java.util.List) binds: [B:61:0x0259, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0263  */
    /* JADX WARN: Code duplicated, block: B:66:0x0283  */
    /* JADX WARN: Code duplicated, block: B:69:0x028b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0291  */
    /* JADX WARN: Code duplicated, block: B:73:0x0295  */
    /* JADX WARN: Code duplicated, block: B:76:0x029b  */
    /* JADX WARN: Code duplicated, block: B:79:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:82:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:85:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:95:0x033b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0343  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0147, code lost:
    
        if (k(r9, r12, r2, r5) != r7) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02e9, code lost:
    
        if (r1 != r7) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.util.List r18, java.util.Map r19, java.lang.String r20, defpackage.pky r21, int r22, int r23, defpackage.pxs r24, boolean r25, defpackage.aier r26, defpackage.plv r27, java.lang.String r28, defpackage.awoq r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pse.i(java.util.List, java.util.Map, java.lang.String, pky, int, int, pxs, boolean, aier, plv, java.lang.String, awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:34:0x010c  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [pqn] */
    /* JADX WARN: Type inference failed for: r16v0, types: [pse] */
    /* JADX WARN: Type inference failed for: r17v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object j(List list, Map map, String str, aiaz aiazVar, plv plvVar, Map map2, aier aierVar, String str2, awoq awoqVar) throws Throwable {
        psa psaVar;
        String str3;
        plv plvVar2;
        Object obj;
        aier aierVar2;
        Object obj2;
        Object obj3;
        String str4;
        aier aierVar3;
        String str5;
        Object obj4;
        Object obj5;
        ?? r4;
        pky pkyVar;
        Object objB;
        if (awoqVar instanceof psa) {
            psaVar = (psa) awoqVar;
            int i = psaVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                psaVar.f = i - Integer.MIN_VALUE;
            } else {
                psaVar = new psa(this, awoqVar);
            }
        } else {
            psaVar = new psa(this, awoqVar);
        }
        psa psaVar2 = psaVar;
        Object objB2 = psaVar2.d;
        awox awoxVar = awox.a;
        int i2 = psaVar2.f;
        if (i2 == 0) {
            atqp.j(objB2);
            pqn pqnVar = this.i;
            psaVar2.a = list;
            psaVar2.b = map;
            psaVar2.g = str;
            psaVar2.h = plvVar;
            psaVar2.c = map2;
            psaVar2.i = aierVar;
            str3 = str2;
            psaVar2.j = str3;
            psaVar2.f = 1;
            objB2 = pqnVar.b(list, map, str, aiazVar, psaVar2);
            if (objB2 != awoxVar) {
                plvVar2 = plvVar;
                obj = map2;
                aierVar2 = aierVar;
                obj2 = list;
                obj3 = map;
                str4 = str;
            }
            return awoxVar;
        }
        if (i2 == 1) {
            String str6 = psaVar2.j;
            aierVar2 = psaVar2.i;
            obj = psaVar2.c;
            plvVar2 = psaVar2.h;
            str4 = psaVar2.g;
            obj3 = psaVar2.b;
            obj2 = psaVar2.a;
            atqp.j(objB2);
            str3 = str6;
        } else {
            if (i2 == 2) {
                String str7 = psaVar2.j;
                aier aierVar4 = psaVar2.i;
                obj = psaVar2.c;
                plvVar2 = psaVar2.h;
                String str8 = psaVar2.g;
                Object obj6 = psaVar2.b;
                obj5 = psaVar2.a;
                atqp.j(objB2);
                str3 = str7;
                aierVar3 = aierVar4;
                str5 = str8;
                obj4 = obj6;
                psw pswVar = this.e;
                psaVar2.a = obj5;
                psaVar2.b = obj4;
                psaVar2.g = str5;
                psaVar2.h = null;
                psaVar2.c = null;
                psaVar2.i = null;
                psaVar2.j = null;
                psaVar2.f = 3;
                ?? r18 = obj5;
                objB2 = awro.p(pswVar.e, new psu(pswVar, plvVar2, r18, aierVar3, str3, obj, null), psaVar2);
                r4 = r18;
                if (objB2 != awoxVar) {
                }
                return awoxVar;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(objB2);
                return objB2;
            }
            str5 = psaVar2.g;
            obj4 = psaVar2.b;
            Object obj7 = psaVar2.a;
            atqp.j(objB2);
            r4 = obj7;
        }
        pkyVar = (pky) objB2;
        if (!(pkyVar instanceof pla)) {
            ((agsj) ((agsj) a.c()).j(pkyVar.f())).t("Failed to recreate registration request after token was reset.");
            pkyVar.getClass();
            return (pku) pkyVar;
        }
        ?? r0 = this.i;
        aiaz aiazVar2 = (aiaz) ((pla) pkyVar).a;
        psaVar2.a = null;
        psaVar2.b = null;
        psaVar2.g = null;
        psaVar2.f = 4;
        ?? r17 = r4;
        objB = r0.b(r17, obj4, str5, aiazVar2, psaVar2);
        if (objB != awoxVar) {
            return objB;
        }
        return awoxVar;
        pky pkyVar2 = (pky) objB2;
        if (!(pkyVar2 instanceof puj)) {
            return pkyVar2;
        }
        psaVar2.a = obj2;
        psaVar2.b = obj3;
        psaVar2.g = str4;
        psaVar2.h = plvVar2;
        psaVar2.c = obj;
        psaVar2.i = aierVar2;
        psaVar2.j = str3;
        psaVar2.f = 2;
        if (l(plvVar2, psaVar2) != awoxVar) {
            aierVar3 = aierVar2;
            str5 = str4;
            obj4 = obj3;
            obj5 = obj2;
            psw pswVar2 = this.e;
            psaVar2.a = obj5;
            psaVar2.b = obj4;
            psaVar2.g = str5;
            psaVar2.h = null;
            psaVar2.c = null;
            psaVar2.i = null;
            psaVar2.j = null;
            psaVar2.f = 3;
            ?? r19 = obj5;
            objB2 = awro.p(pswVar2.e, new psu(pswVar2, plvVar2, r19, aierVar3, str3, obj, null), psaVar2);
            r4 = r19;
            if (objB2 != awoxVar) {
                pkyVar = (pky) objB2;
                if (!(pkyVar instanceof pla)) {
                    ((agsj) ((agsj) a.c()).j(pkyVar.f())).t("Failed to recreate registration request after token was reset.");
                    pkyVar.getClass();
                    return (pku) pkyVar;
                }
                ?? r1 = this.i;
                aiaz aiazVar3 = (aiaz) ((pla) pkyVar).a;
                psaVar2.a = null;
                psaVar2.b = null;
                psaVar2.g = null;
                psaVar2.f = 4;
                ?? r110 = r4;
                objB = r1.b(r110, obj4, str5, aiazVar3, psaVar2);
                if (objB != awoxVar) {
                    return objB;
                }
            }
        }
        return awoxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, pxu] */
    public final Object k(List list, Map map, plv plvVar, awoq awoqVar) throws Throwable {
        psb psbVar;
        if (awoqVar instanceof psb) {
            psbVar = (psb) awoqVar;
            int i = psbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                psbVar.c = i - Integer.MIN_VALUE;
            } else {
                psbVar = new psb(this, awoqVar);
            }
        } else {
            psbVar = new psb(this, awoqVar);
        }
        Object obj = psbVar.a;
        awox awoxVar = awox.a;
        int i2 = psbVar.c;
        try {
            if (i2 == 0) {
                atqp.j(obj);
                if (plvVar.a()) {
                    int iU = atqq.u(atqq.N(list, 10));
                    if (iU < 16) {
                        iU = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iU);
                    for (Object obj2 : list) {
                        linkedHashMap.put(obj2, new pla(awmy.a));
                    }
                    Set setQ = atqq.q(map.keySet(), atqq.aw(list));
                    int iU2 = atqq.u(atqq.N(setQ, 10));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iU2 >= 16 ? iU2 : 16);
                    for (Object obj3 : setQ) {
                        linkedHashMap2.put(obj3, new pla(awmy.a));
                    }
                    ?? r8 = ((agfa) this.s).a;
                    psbVar.c = 1;
                    if (qnl.W(r8, linkedHashMap, linkedHashMap2, psbVar) == awoxVar) {
                        return awoxVar;
                    }
                }
                return awmy.a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        } catch (Exception e) {
            ((agsj) ((agsj) a.c()).j(e)).t("Failed to report registration results");
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [pqg] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [pss] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final Object l(plv plvVar, awoq awoqVar) throws Throwable {
        psc pscVar;
        plv plvVar2;
        ?? r10;
        ?? r2;
        pqm pqmVar;
        pky pkyVar;
        int iAu;
        Object obj;
        if (awoqVar instanceof psc) {
            pscVar = (psc) awoqVar;
            int i = pscVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pscVar.d = i - Integer.MIN_VALUE;
            } else {
                pscVar = new psc(this, awoqVar);
            }
        } else {
            pscVar = new psc(this, awoqVar);
        }
        Object objB = pscVar.b;
        awox awoxVar = awox.a;
        int i2 = pscVar.d;
        if (i2 == 0) {
            atqp.j(objB);
            if (plvVar.a()) {
                pqg pqgVar = this.p;
                omm ommVar = this.v;
                pss pssVar = pss.a;
                pscVar.e = plvVar;
                pscVar.f = pssVar;
                pscVar.a = pqgVar;
                pscVar.d = 1;
                Object objE = ommVar.e(pscVar);
                if (objE == awoxVar) {
                    return awoxVar;
                }
                plvVar2 = plvVar;
                r10 = pqgVar;
                objB = objE;
                r2 = pssVar;
            } else if (plvVar.b()) {
                pqmVar = this.f;
                pscVar.e = null;
                pscVar.d = 3;
                if (pqmVar.b(pscVar) == awoxVar) {
                    return awoxVar;
                }
            }
            return awmy.a;
        }
        if (i2 == 1) {
            Object obj2 = pscVar.a;
            pss pssVar2 = pscVar.f;
            plvVar2 = pscVar.e;
            atqp.j(objB);
            r2 = pssVar2;
            r10 = obj2;
        } else if (i2 == 2) {
            plvVar = pscVar.e;
            atqp.j(objB);
            pkyVar = (pky) objB;
            iAu = a.au(pkyVar);
            if (iAu != 0) {
                obj = ((pla) pkyVar).a;
            } else {
                if (iAu == 1) {
                    throw new awmj();
                }
                obj = Boolean.TRUE;
            }
            if (((Boolean) obj).booleanValue()) {
                this.p.a();
            }
            if (plvVar.b()) {
                pqmVar = this.f;
                pscVar.e = null;
                pscVar.d = 3;
                if (pqmVar.b(pscVar) == awoxVar) {
                    return awoxVar;
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objB);
        }
        return awmy.a;
        pscVar.e = plvVar2;
        pscVar.f = null;
        pscVar.a = null;
        pscVar.d = 2;
        objB = r2.b(r10, (String) objB, true);
        if (objB == awoxVar) {
            return awoxVar;
        }
        plvVar = plvVar2;
        pkyVar = (pky) objB;
        iAu = a.au(pkyVar);
        if (iAu != 0) {
            obj = ((pla) pkyVar).a;
        } else {
            if (iAu == 1) {
                throw new awmj();
            }
            obj = Boolean.TRUE;
        }
        if (((Boolean) obj).booleanValue()) {
            this.p.a();
        }
        if (plvVar.b()) {
            pqmVar = this.f;
            pscVar.e = null;
            pscVar.d = 3;
            if (pqmVar.b(pscVar) == awoxVar) {
                return awoxVar;
            }
        }
        return awmy.a;
    }
}
