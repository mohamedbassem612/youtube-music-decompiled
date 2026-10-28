package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ozu implements ozk {
    private static final agsn d = agsn.h("GnpSdk");
    public final pgi a;
    public final axff b;
    public final grj c;
    private final Context e;
    private final pct f;
    private final pav g;
    private final pls h;
    private final awmd i;
    private final pve j;
    private final pat k;
    private final phe l;
    private final aunn m;
    private final pou n;
    private final awou o;
    private final tld p;
    private final aczl q;

    public ozu(Context context, pct pctVar, pgi pgiVar, pav pavVar, pls plsVar, awmd awmdVar, aczl aczlVar, pve pveVar, pat patVar, phe pheVar, aunn aunnVar, tld tldVar, axff axffVar, grj grjVar, pou pouVar, awou awouVar) {
        context.getClass();
        pctVar.getClass();
        pgiVar.getClass();
        pavVar.getClass();
        plsVar.getClass();
        awmdVar.getClass();
        pveVar.getClass();
        patVar.getClass();
        pheVar.getClass();
        aunnVar.getClass();
        tldVar.getClass();
        axffVar.getClass();
        pouVar.getClass();
        awouVar.getClass();
        this.e = context;
        this.f = pctVar;
        this.a = pgiVar;
        this.g = pavVar;
        this.h = plsVar;
        this.i = awmdVar;
        this.q = aczlVar;
        this.j = pveVar;
        this.k = patVar;
        this.l = pheVar;
        this.m = aunnVar;
        this.p = tldVar;
        this.b = axffVar;
        this.c = grjVar;
        this.n = pouVar;
        this.o = awouVar;
    }

    private final void k(pqf pqfVar) {
        ((pwf) this.i.io()).m(this.e.getPackageName(), this.h.a, Build.VERSION.SDK_INT, pqfVar.name());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // defpackage.ozk
    public final Object a(awoq awoqVar) throws Throwable {
        ozm ozmVar;
        Object obj;
        ?? it;
        plx plxVar;
        agkz agkzVar;
        if (awoqVar instanceof ozm) {
            ozmVar = (ozm) awoqVar;
            int i = ozmVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ozmVar.d = i - Integer.MIN_VALUE;
            } else {
                ozmVar = new ozm(this, awoqVar);
            }
        } else {
            ozmVar = new ozm(this, awoqVar);
        }
        Object objC = ozmVar.b;
        awox awoxVar = awox.a;
        int i2 = ozmVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                atqp.j(objC);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = ozmVar.a;
                atqp.j(objC);
                it = obj2;
            }
            while (it.hasNext()) {
                plxVar = (plx) it.next();
                if (!nqx.c(plxVar.f) && (agkzVar = plxVar.h) != null && agkzVar.contains(pya.SYSTEM_TRAY)) {
                    pgi pgiVar = this.a;
                    aidy aidyVar = aidy.REMOTE_DELETED_MESSAGES;
                    ozmVar.a = it;
                    ozmVar.d = 2;
                    if (pgiVar.a(plxVar, null, aidyVar, ozmVar) == awoxVar) {
                        return awoxVar;
                    }
                }
            }
            return awmy.a;
        }
        atqp.j(objC);
        pve pveVar = this.j;
        ozmVar.d = 1;
        objC = pveVar.c(ozmVar);
        if (objC == awoxVar) {
            return awoxVar;
        }
        pky pkyVar = (pky) objC;
        int iAu = a.au(pkyVar);
        if (iAu == 0) {
            obj = ((pla) pkyVar).a;
        } else {
            if (iAu != 1) {
                throw new awmj();
            }
            ((agsj) ((agsj) d.c()).j(((pku) pkyVar).b())).t("Failed fetching accounts from storage, can't delete messages.");
            obj = awno.a;
        }
        List list = (List) obj;
        if (!list.isEmpty()) {
            it = list.iterator();
            while (it.hasNext()) {
                plxVar = (plx) it.next();
                if (!nqx.c(plxVar.f)) {
                }
            }
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // defpackage.ozk
    public final Object b(plx plxVar, aieo aieoVar, plb plbVar, awoq awoqVar) throws Throwable {
        ozo ozoVar;
        if (awoqVar instanceof ozo) {
            ozoVar = (ozo) awoqVar;
            int i = ozoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ozoVar.c = i - Integer.MIN_VALUE;
            } else {
                ozoVar = new ozo(this, awoqVar);
            }
        } else {
            ozoVar = new ozo(this, awoqVar);
        }
        ozo ozoVar2 = ozoVar;
        Object objP = ozoVar2.a;
        awox awoxVar = awox.a;
        int i2 = ozoVar2.c;
        if (i2 == 0) {
            atqp.j(objP);
            if (plxVar == null) {
                ((agsj) d.c()).t("Notification counts are only supported for accounts, received null account.");
                return new pla(awmy.a);
            }
            aiie<aifb> aiieVar = aieoVar.d;
            aiieVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(awro.f(atqq.u(atqq.N(aiieVar, 10)), 16));
            for (aifb aifbVar : aiieVar) {
                awml awmlVar = new awml(aifbVar.b, new Long(aifbVar.c));
                linkedHashMap.put(awmlVar.a, awmlVar.b);
            }
            awou awouVar = this.o;
            pmu pmuVar = new pmu(plbVar, this, plxVar, aieoVar, linkedHashMap, (awoq) null, 1);
            ozoVar2.c = 1;
            objP = awro.p(awouVar, pmuVar, ozoVar2);
            if (objP == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objP);
        }
        pky pkyVar = (pky) objP;
        return pkyVar == null ? new pkv(new TimeoutException("Timeout while updating notifications count"), pkx.q) : pkyVar;
    }

    @Override // defpackage.ozk
    public final Object c(plx plxVar, aifa aifaVar, ahyr ahyrVar, plb plbVar, awoq awoqVar) throws Throwable {
        aiex aiexVarA = aiex.a(aifaVar.b);
        if (aiexVarA == null) {
            aiexVarA = aiex.UNKNOWN_INSTRUCTION;
        }
        switch (aiexVarA.ordinal()) {
            case 1:
                if (plxVar == null) {
                    ((agsj) d.b()).t("Payload with SYNC instruction must have an account");
                } else {
                    paw pawVarB = this.g.b(ahzv.DELIVERED_SYNC_INSTRUCTION);
                    pawVarB.f(plxVar);
                    pawVarB.d(ahyrVar);
                    ((pbc) pawVarB).r = 2;
                    pawVarB.a();
                    k(pqf.d);
                    Object objA = this.a.a(plxVar, new Long(aifaVar.c), aidy.SYNC_INSTRUCTION, awoqVar);
                    if (objA == awox.a) {
                        return objA;
                    }
                }
                break;
            case 2:
                if (plxVar == null) {
                    ((agsj) d.b()).t("Payload with FULL_SYNC instruction must have an account");
                } else {
                    paw pawVarB2 = this.g.b(ahzv.DELIVERED_FULL_SYNC_INSTRUCTION);
                    pawVarB2.f(plxVar);
                    pawVarB2.d(ahyrVar);
                    pawVarB2.a();
                    k(pqf.d);
                    Object objB = this.a.b(plxVar, aidy.FULL_SYNC_INSTRUCTION, awoqVar);
                    if (objB == awox.a) {
                        return objB;
                    }
                }
                break;
            case 3:
                k(pqf.f);
                Object objS = this.q.s(aier.SERVER_SYNC_INSTRUCTION, awoqVar);
                if (objS == awox.a) {
                    return objS;
                }
                break;
            case 4:
                if (plxVar == null) {
                    ((agsj) d.b()).t("Payload with UPDATE_THREAD instruction must have an account");
                } else {
                    aiez aiezVar = aifaVar.d;
                    if (aiezVar == null) {
                        aiezVar = aiez.a;
                    }
                    aiezVar.getClass();
                    Object objG = g(plxVar, aiezVar, ahyrVar, plbVar, awoqVar);
                    if (objG == awox.a) {
                        return objG;
                    }
                }
                break;
            case 5:
                break;
            case 6:
                paw pawVarB3 = this.g.b(ahzv.DELIVERED_REMOVE_STORAGE_INSTRUCTION);
                pawVarB3.f(plxVar);
                pawVarB3.d(ahyrVar);
                pawVarB3.a();
                k(pqf.f);
                Object objB2 = pat.b(this.k, plxVar, true, awoqVar);
                if (objB2 == awox.a) {
                    return objB2;
                }
                break;
            default:
                ((agsj) d.b()).t("Unknown sync instruction.");
                break;
        }
        return awmy.a;
    }

    @Override // defpackage.ozk
    public final Object d(plx plxVar, aiec aiecVar, awoq awoqVar) {
        Object objP;
        return (auvy.c() && (objP = awro.p(this.o, new gme(this, plxVar, aiecVar, (awoq) null, 5), awoqVar)) == awox.a) ? objP : awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0156  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // defpackage.ozk
    public final Object e(plx plxVar, pmi pmiVar, aicw aicwVar, plb plbVar, long j, long j2, awoq awoqVar) throws Throwable {
        ozn oznVar;
        aiec aiecVar;
        pax paxVar;
        aicw aicwVar2;
        plb plbVar2;
        plx plxVar2;
        Object objB;
        ahyr ahyrVar;
        pax paxVar2;
        pct pctVar;
        List listH;
        aieq aieqVar;
        if (awoqVar instanceof ozn) {
            oznVar = (ozn) awoqVar;
            int i = oznVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oznVar.c = i - Integer.MIN_VALUE;
            } else {
                oznVar = new ozn(this, awoqVar);
            }
        } else {
            oznVar = new ozn(this, awoqVar);
        }
        Object obj = oznVar.a;
        Object obj2 = awox.a;
        int i2 = oznVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                ahyrVar = oznVar.g;
                paxVar2 = oznVar.f;
                aiecVar = oznVar.e;
                plbVar2 = oznVar.i;
                aicwVar2 = oznVar.d;
                plxVar2 = oznVar.h;
                atqp.j(obj);
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(obj);
            }
            return awmy.a;
        }
        atqp.j(obj);
        aiec aiecVar2 = aicwVar.e;
        if (aiecVar2 == null) {
            aiecVar2 = aiec.a;
        }
        aiecVar = aiecVar2;
        aiecVar.getClass();
        paxVar = new pax(new Long(j), new Long(j2), 2);
        ahyr ahyrVarB = pmiVar.b();
        if (plxVar != null) {
            oznVar.h = plxVar;
            oznVar.d = aicwVar;
            oznVar.i = plbVar;
            oznVar.e = aiecVar;
            oznVar.f = paxVar;
            oznVar.g = ahyrVarB;
            oznVar.c = 1;
            aiie aiieVar = aiecVar.x;
            aiieVar.getClass();
            ArrayList arrayList = new ArrayList(atqq.N(aiieVar, 10));
            Iterator<E> it = aiieVar.iterator();
            while (it.hasNext()) {
                arrayList.add(new Integer(((aiea) it.next()).b));
            }
            aiie aiieVar2 = aiecVar.w;
            aiieVar2.getClass();
            ArrayList arrayList2 = new ArrayList(atqq.N(aiieVar2, 10));
            Iterator<E> it2 = aiieVar2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new Integer(((aidz) it2.next()).b));
            }
            if (arrayList2.isEmpty() && arrayList.isEmpty()) {
                objB = awmy.a;
            } else {
                pou pouVar = this.n;
                String str = plxVar.b;
                str.getClass();
                objB = pouVar.b(str, arrayList2, arrayList, oznVar);
                if (objB != obj2) {
                    objB = awmy.a;
                }
            }
            if (objB == obj2) {
                return obj2;
            }
            plbVar2 = plbVar;
            plxVar2 = plxVar;
            ahyrVar = ahyrVarB;
            aicwVar2 = aicwVar;
            paxVar2 = paxVar;
        } else {
            int i3 = pyn.a;
            if (pyn.a(aiecVar)) {
                ((agsj) d.b()).t("Counterfactual notifications must have an account.");
                return awmy.a;
            }
            aicwVar2 = aicwVar;
            plbVar2 = plbVar;
            plxVar2 = plxVar;
        }
        pctVar = this.f;
        listH = atqq.H(aiecVar);
        aieqVar = aicwVar2.d;
        if (aieqVar == null) {
            aieqVar = aieq.a;
        }
        boolean z = aieqVar.e;
        oznVar.h = null;
        oznVar.d = null;
        oznVar.i = null;
        oznVar.e = null;
        oznVar.f = null;
        oznVar.g = null;
        oznVar.c = 3;
        if (pctVar.b(plxVar2, listH, plbVar2, paxVar, false, false, oznVar) == obj2) {
            return obj2;
        }
        return awmy.a;
        int i4 = pyn.a;
        if (pyn.a(aiecVar)) {
            paw pawVarB = this.g.b(ahzv.DELIVERED_COUNTERFACTUAL);
            pawVarB.f(plxVar2);
            pawVarB.g(aiecVar);
            ahyrVar.getClass();
            pawVarB.d(ahyrVar);
            ((pbc) pawVarB).k = paxVar2;
            pawVarB.a();
            k(pqf.c);
            oznVar.h = null;
            oznVar.d = null;
            oznVar.i = null;
            oznVar.e = null;
            oznVar.f = null;
            oznVar.g = null;
            oznVar.c = 2;
            if (d(plxVar2, aiecVar, oznVar) == obj2) {
                return obj2;
            }
        } else {
            paxVar = paxVar2;
            pctVar = this.f;
            listH = atqq.H(aiecVar);
            aieqVar = aicwVar2.d;
            if (aieqVar == null) {
                aieqVar = aieq.a;
            }
            boolean z2 = aieqVar.e;
            oznVar.h = null;
            oznVar.d = null;
            oznVar.i = null;
            oznVar.e = null;
            oznVar.f = null;
            oznVar.g = null;
            oznVar.c = 3;
            if (pctVar.b(plxVar2, listH, plbVar2, paxVar, false, false, oznVar) == obj2) {
                return obj2;
            }
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:22:0x0088  */
    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:48:0x0103  */
    /* JADX WARN: Code duplicated, block: B:51:0x010d  */
    /* JADX WARN: Code duplicated, block: B:54:0x011e  */
    /* JADX WARN: Code duplicated, block: B:58:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[LOOP:0: B:18:0x006d->B:61:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:18:0x006d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:20:0x0073
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(defpackage.plx r26, defpackage.aiez r27, defpackage.awoq r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozu.f(plx, aiez, awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009b  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object g(plx plxVar, aiez aiezVar, ahyr ahyrVar, plb plbVar, awoq awoqVar) throws Throwable {
        ozp ozpVar;
        plx plxVar2;
        aiez aiezVar2;
        ahyr ahyrVar2;
        plx plxVar3;
        if (awoqVar instanceof ozp) {
            ozpVar = (ozp) awoqVar;
            int i = ozpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ozpVar.c = i - Integer.MIN_VALUE;
            } else {
                ozpVar = new ozp(this, awoqVar);
            }
        } else {
            ozpVar = new ozp(this, awoqVar);
        }
        Object obj = ozpVar.a;
        Object obj2 = awox.a;
        int i2 = ozpVar.c;
        boolean z = true;
        if (i2 == 0) {
            atqp.j(obj);
            if (plbVar.f()) {
                axff axffVar = this.b;
                ozq ozqVar = new ozq(this, plxVar, aiezVar, ahyrVar, null, 1, null);
                ozpVar.c = 3;
                if (nxe.a(axffVar, ozqVar, ozpVar) == obj2) {
                    return obj2;
                }
            } else {
                try {
                    int i3 = awtl.b;
                    long j = awrc.j(plbVar.a(), awtn.MILLISECONDS);
                    plxVar2 = plxVar;
                    aiezVar2 = aiezVar;
                    ahyrVar2 = ahyrVar;
                    try {
                        egh eghVar = new egh(this, plxVar2, aiezVar2, ahyrVar2, (awoq) null, 5);
                        try {
                            ozpVar.f = plxVar2;
                            aiezVar2 = aiezVar;
                            try {
                                ozpVar.d = aiezVar2;
                                ahyrVar2 = ahyrVar;
                                ozpVar.e = ahyrVar2;
                                ozpVar.c = 1;
                                if (avkz.q(j, eghVar, ozpVar) == obj2) {
                                    return obj2;
                                }
                                plxVar3 = plxVar2;
                                if (!z) {
                                    ozpVar.f = null;
                                    ozpVar.d = null;
                                    ozpVar.e = null;
                                    ozpVar.c = 2;
                                    if (h(plxVar3, aiezVar2, ahyrVar2, ozpVar) == obj2) {
                                        return obj2;
                                    }
                                }
                            } catch (Exception e) {
                                e = e;
                                ahyrVar2 = ahyrVar;
                                plxVar3 = plxVar2;
                                ((agsj) ((agsj) d.c()).j(e)).t("Interrupted or timeout while acquiring lock for update thread instruction.");
                                z = false;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            aiezVar2 = aiezVar;
                            ahyrVar2 = ahyrVar;
                            plxVar3 = plxVar2;
                            ((agsj) ((agsj) d.c()).j(e)).t("Interrupted or timeout while acquiring lock for update thread instruction.");
                            z = false;
                            if (!z) {
                                ozpVar.f = null;
                                ozpVar.d = null;
                                ozpVar.e = null;
                                ozpVar.c = 2;
                                if (h(plxVar3, aiezVar2, ahyrVar2, ozpVar) == obj2) {
                                    return obj2;
                                }
                            }
                            return awmy.a;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        plxVar3 = plxVar2;
                        ((agsj) ((agsj) d.c()).j(e)).t("Interrupted or timeout while acquiring lock for update thread instruction.");
                        z = false;
                    }
                } catch (Exception e4) {
                    e = e4;
                    plxVar2 = plxVar;
                }
            }
        } else if (i2 == 1) {
            ahyr ahyrVar3 = ozpVar.e;
            aiez aiezVar3 = ozpVar.d;
            plxVar3 = ozpVar.f;
            try {
                atqp.j(obj);
                ahyrVar2 = ahyrVar3;
                aiezVar2 = aiezVar3;
            } catch (Exception e5) {
                e = e5;
                ahyrVar2 = ahyrVar3;
                aiezVar2 = aiezVar3;
                ((agsj) ((agsj) d.c()).j(e)).t("Interrupted or timeout while acquiring lock for update thread instruction.");
                z = false;
            }
            if (!z) {
                ozpVar.f = null;
                ozpVar.d = null;
                ozpVar.e = null;
                ozpVar.c = 2;
                if (h(plxVar3, aiezVar2, ahyrVar2, ozpVar) == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b5 A[LOOP:1: B:30:0x00af->B:32:0x00b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(plx plxVar, aiez aiezVar, ahyr ahyrVar, awoq awoqVar) throws Throwable {
        ozr ozrVar;
        plx plxVar2;
        Map map;
        Iterator it;
        plx plxVar3;
        Map.Entry entry;
        ozu ozuVar;
        ArrayList arrayList;
        Iterator it2;
        aiff aiffVar;
        ahza ahzaVar;
        if (awoqVar instanceof ozr) {
            ozrVar = (ozr) awoqVar;
            int i = ozrVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ozrVar.d = i - Integer.MIN_VALUE;
            } else {
                ozrVar = new ozr(this, awoqVar);
            }
        } else {
            ozrVar = new ozr(this, awoqVar);
        }
        ozr ozrVar2 = ozrVar;
        Object objF = ozrVar2.b;
        awox awoxVar = awox.a;
        int i2 = ozrVar2.d;
        if (i2 != 0) {
            if (i2 == 1) {
                ahyrVar = (ahyr) ozrVar2.a;
                plxVar = ozrVar2.e;
                atqp.j(objF);
            } else if (i2 == 2) {
                map = (Map) ozrVar2.a;
                plxVar2 = ozrVar2.e;
                atqp.j(objF);
                it = map.entrySet().iterator();
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) ozrVar2.a;
                plxVar2 = ozrVar2.e;
                atqp.j(objF);
            }
            plxVar3 = plxVar2;
            while (it.hasNext()) {
                entry = (Map.Entry) it.next();
                if (nvf.a((aiff) entry.getKey())) {
                    Iterable iterable = (Iterable) entry.getValue();
                    arrayList = new ArrayList(atqq.N(iterable, 10));
                    it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((aicb) it2.next()).c);
                    }
                    aiffVar = (aiff) entry.getKey();
                    ahzaVar = ahza.DISMISSED_REMOTE;
                    ozrVar2.e = plxVar3;
                    ozrVar2.a = it;
                    ozrVar2.d = 3;
                    ozuVar = this;
                    if (ozuVar.j(plxVar3, arrayList, aiffVar, 5, ahzaVar, ozrVar2) == awoxVar) {
                        return awoxVar;
                    }
                } else {
                    ozuVar = this;
                }
                this = ozuVar;
            }
            return awmy.a;
        }
        atqp.j(objF);
        ozrVar2.e = plxVar;
        ozrVar2.a = ahyrVar;
        ozrVar2.d = 1;
        objF = f(plxVar, aiezVar, ozrVar2);
        if (objF == awoxVar) {
            return awoxVar;
        }
        awml awmlVar = (awml) objF;
        List list = (List) awmlVar.a;
        Map map2 = (Map) awmlVar.b;
        ozrVar2.e = plxVar;
        ozrVar2.a = map2;
        ozrVar2.d = 2;
        if (i(plxVar, ahyrVar, list, ozrVar2) == awoxVar) {
            return awoxVar;
        }
        plxVar2 = plxVar;
        map = map2;
        it = map.entrySet().iterator();
        plxVar3 = plxVar2;
        while (it.hasNext()) {
            entry = (Map.Entry) it.next();
            if (nvf.a((aiff) entry.getKey())) {
                Iterable iterable2 = (Iterable) entry.getValue();
                arrayList = new ArrayList(atqq.N(iterable2, 10));
                it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((aicb) it2.next()).c);
                }
                aiffVar = (aiff) entry.getKey();
                ahzaVar = ahza.DISMISSED_REMOTE;
                ozrVar2.e = plxVar3;
                ozrVar2.a = it;
                ozrVar2.d = 3;
                ozuVar = this;
                if (ozuVar.j(plxVar3, arrayList, aiffVar, 5, ahzaVar, ozrVar2) == awoxVar) {
                    return awoxVar;
                }
            } else {
                ozuVar = this;
            }
            this = ozuVar;
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(plx plxVar, ahyr ahyrVar, List list, awoq awoqVar) throws Throwable {
        ozt oztVar;
        if (awoqVar instanceof ozt) {
            oztVar = (ozt) awoqVar;
            int i = oztVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oztVar.c = i - Integer.MIN_VALUE;
            } else {
                oztVar = new ozt(this, awoqVar);
            }
        } else {
            oztVar = new ozt(this, awoqVar);
        }
        Object objC = oztVar.a;
        awox awoxVar = awox.a;
        int i2 = oztVar.c;
        if (i2 == 0) {
            atqp.j(objC);
            if (!list.isEmpty()) {
                paw pawVarB = this.g.b(ahzv.DELIVERED_UPDATE_THREAD_INSTRUCTION);
                pawVarB.f(plxVar);
                pawVarB.j(list);
                pawVarB.d(ahyrVar);
                pawVarB.a();
                k(pqf.e);
                phe pheVar = this.l;
                pbh pbhVar = new pbh(ahza.DISMISSED_REMOTE, null, null, false);
                oztVar.e = plxVar;
                oztVar.d = ahyrVar;
                oztVar.c = 1;
                objC = pheVar.c(plxVar, list, pbhVar, oztVar);
                if (objC == awoxVar) {
                    return awoxVar;
                }
            }
            return awmy.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahyrVar = oztVar.d;
        plxVar = oztVar.e;
        atqp.j(objC);
        List list2 = (List) objC;
        if (!list2.isEmpty()) {
            paw pawVarB2 = this.g.b(ahzv.DISMISSED_REMOTE);
            pawVarB2.f(plxVar);
            pawVarB2.c(list2);
            pawVarB2.d(ahyrVar);
            pawVarB2.a();
            k(pqf.B);
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final Object j(plx plxVar, List list, aiff aiffVar, int i, ahza ahzaVar, awoq awoqVar) throws Throwable {
        ozs ozsVar;
        Object obj;
        ?? it;
        if (awoqVar instanceof ozs) {
            ozsVar = (ozs) awoqVar;
            int i2 = ozsVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ozsVar.e = i2 - Integer.MIN_VALUE;
            } else {
                ozsVar = new ozs(this, awoqVar);
            }
        } else {
            ozsVar = new ozs(this, awoqVar);
        }
        Object obj2 = ozsVar.c;
        awox awoxVar = awox.a;
        int i3 = ozsVar.e;
        if (i3 == 0) {
            atqp.j(obj2);
            it = ((Set) this.m.io()).iterator();
            obj = list;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj3 = ozsVar.b;
            ahzaVar = ozsVar.g;
            i = ozsVar.h;
            aiffVar = ozsVar.f;
            Object obj4 = ozsVar.a;
            plxVar = ozsVar.i;
            atqp.j(obj2);
            it = obj3;
            obj = obj4;
        }
        while (it.hasNext()) {
            pyp pypVar = (pyp) it.next();
            ozsVar.i = plxVar;
            ozsVar.a = obj;
            ozsVar.f = aiffVar;
            ozsVar.h = i;
            ozsVar.g = ahzaVar;
            ozsVar.b = it;
            ozsVar.e = 1;
            if (pypVar.g() == awoxVar) {
                return awoxVar;
            }
        }
        return awmy.a;
    }
}
