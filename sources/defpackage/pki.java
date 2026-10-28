package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pki implements pjz {
    public static final agsn a = agsn.h("GnpSdk");
    public final pve b;
    private final Context c;
    private final mbc d;
    private final pls e;
    private final omm f;

    public pki(Context context, omm ommVar, pve pveVar, mbc mbcVar, pls plsVar) {
        context.getClass();
        ommVar.getClass();
        pveVar.getClass();
        mbcVar.getClass();
        plsVar.getClass();
        this.c = context;
        this.f = ommVar;
        this.b = pveVar;
        this.d = mbcVar;
        this.e = plsVar;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0270  */
    /* JADX WARN: Code duplicated, block: B:105:0x027c  */
    /* JADX WARN: Code duplicated, block: B:106:0x027f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0292  */
    /* JADX WARN: Code duplicated, block: B:117:0x029c  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:125:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:127:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:135:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:142:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:145:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:146:0x0302  */
    /* JADX WARN: Code duplicated, block: B:148:0x0305  */
    /* JADX WARN: Code duplicated, block: B:151:0x0314  */
    /* JADX WARN: Code duplicated, block: B:156:0x032a  */
    /* JADX WARN: Code duplicated, block: B:157:0x032c  */
    /* JADX WARN: Code duplicated, block: B:160:0x0333  */
    /* JADX WARN: Code duplicated, block: B:163:0x034e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0371 A[LOOP:3: B:164:0x036b->B:166:0x0371, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:169:0x038d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0320 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x030e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:? A[LOOP:4: B:115:0x0296->B:188:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [pka] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r17v0, types: [pki] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.Map] */
    @Override // defpackage.pjz
    public final Object a(pcu pcuVar, pot potVar, pot potVar2, awoq awoqVar) throws Throwable {
        pkf pkfVar;
        awrm awrmVar;
        StatusBarNotification statusBarNotification;
        pjw pjwVarC;
        Map map;
        awqg awqgVar;
        List listAr;
        awqg awqgVar2;
        Object next;
        boolean zN;
        ?? r14;
        awrm awrmVar2;
        int iB;
        pjw pjwVar;
        pot potVar3;
        ?? r0;
        ?? r3;
        ?? r15;
        pot potVar4;
        ?? r16;
        pjw pjwVar2;
        ?? ValueOf;
        pkc pkcVar;
        ?? C;
        ?? r13;
        ?? r17;
        LinkedHashMap linkedHashMap;
        agkn agknVar;
        ArrayList arrayList;
        Iterator it;
        pka pkaVarC;
        Object obj;
        ?? r2;
        List<pkc> listAr2;
        Iterator it2;
        String str;
        pot potVar5;
        String str2;
        pkc pkcVar2;
        pcu pcuVar2;
        pot potVar6;
        String str3;
        pcu pcuVar3 = pcuVar;
        pot potVar7 = potVar;
        if (awoqVar instanceof pkf) {
            pkfVar = (pkf) awoqVar;
            int i = pkfVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                pkfVar.j = i - Integer.MIN_VALUE;
            } else {
                pkfVar = new pkf(this, awoqVar);
            }
        } else {
            pkfVar = new pkf(this, awoqVar);
        }
        pkf pkfVar2 = pkfVar;
        Object objB = pkfVar2.h;
        awox awoxVar = awox.a;
        int i2 = pkfVar2.j;
        if (i2 != 0) {
            if (i2 == 1) {
                Object obj2 = pkfVar2.e;
                awrm awrmVar3 = (awrm) pkfVar2.d;
                awqgVar2 = (awqg) pkfVar2.c;
                pot potVar8 = (pot) pkfVar2.b;
                pcu pcuVar4 = (pcu) pkfVar2.a;
                atqp.j(objB);
                r15 = obj2;
                awrmVar = awrmVar3;
                potVar7 = potVar8;
                pcuVar3 = pcuVar4;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj3 = pkfVar2.g;
                Object obj4 = pkfVar2.f;
                Object obj5 = pkfVar2.e;
                pjwVarC = (pjw) pkfVar2.d;
                listAr = (List) pkfVar2.c;
                awrmVar2 = (awrm) pkfVar2.b;
                potVar3 = (pot) pkfVar2.a;
                atqp.j(objB);
                r0 = obj3;
                r2 = obj4;
                r3 = obj5;
            }
            listAr2 = atqq.ar((Collection) objB);
            nwt.d(r2, listAr2);
            potVar3.getClass();
            pbj pbjVar = new pbj(nvk.b(potVar3));
            for (pkc pkcVar3 : listAr2) {
                pcuVar2 = pkcVar3.c;
                potVar6 = pkcVar3.d;
                if (potVar6 != null) {
                    str3 = potVar6.a;
                } else {
                    str3 = null;
                }
                if (pcuVar2 == null && str3 != null) {
                    nwt.b(r3, pcuVar2, str3, pbjVar);
                }
            }
            if (!(r0 instanceof Collection) && r0.isEmpty()) {
                pjwVar = null;
                break;
            }
            it2 = r0.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    pjwVar = null;
                    break;
                }
                pkc pkcVar4 = (pkc) it2.next();
                str = potVar3.a;
                potVar5 = pkcVar4.d;
                if (potVar5 != null) {
                    str2 = potVar5.a;
                } else {
                    str2 = null;
                }
                if (awrc.c(str, str2)) {
                    pkcVar2 = (pkc) awrmVar2.a;
                    if (pkcVar2 != null) {
                        listAr2.add(pkcVar2);
                        pjwVar = null;
                        awrmVar2.a = null;
                    } else {
                        pjwVar = null;
                    }
                    pjwVarC = pjwVar;
                    break;
                }
            }
            if (listAr == null) {
                listAr = awno.a;
            }
            listAr = atqq.ar(atqq.aj(listAr, listAr2));
            r16 = r3;
            potVar7 = potVar3;
            pjwVar2 = pjwVarC;
            if (pjwVar2 != null || (obj = awrmVar2.a) == null) {
                ValueOf = pjwVar;
            } else {
                pot potVar9 = ((pkc) obj).d;
                ValueOf = Boolean.valueOf(!awrc.c(potVar9 != null ? potVar9.a : pjwVar, potVar7.a));
            }
            pkcVar = (pkc) awrmVar2.a;
            if (pkcVar != null) {
                C = nwt.c(pkcVar);
            } else {
                C = pjwVar;
            }
            if (listAr != null) {
                arrayList = new ArrayList();
                it = listAr.iterator();
                while (it.hasNext()) {
                    pkaVarC = nwt.c((pkc) it.next());
                    if (pkaVarC != null) {
                        arrayList.add(pkaVarC);
                    }
                }
                if (arrayList.isEmpty()) {
                    r13 = pjwVar;
                } else {
                    r13 = arrayList;
                }
            } else {
                r13 = pjwVar;
            }
            if (r16.isEmpty()) {
                r17 = pjwVar;
            } else {
                linkedHashMap = new LinkedHashMap(atqq.u(r16.size()));
                for (Map.Entry entry : r16.entrySet()) {
                    Object key = entry.getKey();
                    agknVar = new agkn();
                    for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                        agknVar.g(entry2.getValue(), entry2.getKey());
                    }
                    linkedHashMap.put(key, agknVar.e());
                }
                r17 = linkedHashMap;
            }
            return new pjy(pjwVar2, C, r13, r17, ValueOf);
        }
        atqp.j(objB);
        agzf agzfVar = new agzf(new bep((pki) this, (awoq) null, 2));
        awrmVar = new awrm();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Object systemService = this.c.getSystemService((Class<Object>) NotificationManager.class);
        systemService.getClass();
        StatusBarNotification[] statusBarNotificationArrA = nvz.a((NotificationManager) systemService);
        ArrayList arrayList2 = new ArrayList();
        for (StatusBarNotification statusBarNotification2 : statusBarNotificationArrA) {
            if (!ato.e(statusBarNotification2.getNotification())) {
                arrayList2.add(statusBarNotification2);
            }
        }
        ArrayList<StatusBarNotification> arrayList3 = new ArrayList();
        for (Object obj6 : arrayList2) {
            if (pjx.h((StatusBarNotification) obj6, this.e)) {
                arrayList3.add(obj6);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(awro.f(atqq.u(atqq.N(arrayList3, 10)), 16));
        for (StatusBarNotification statusBarNotification3 : arrayList3) {
            pjx pjxVar = pjx.a;
            awml awmlVar = new awml(pjx.k(statusBarNotification3), new pkc(pjx.k(statusBarNotification3), statusBarNotification3, null, null));
            linkedHashMap3.put(awmlVar.a, awmlVar.b);
        }
        Map mapE = atqq.E(linkedHashMap3);
        if (potVar2 != null) {
            Iterator it3 = mapE.values().iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                StatusBarNotification statusBarNotification4 = ((pkc) next).b;
                if (statusBarNotification4 != null) {
                    String str4 = potVar2.a;
                    pjx pjxVar2 = pjx.a;
                    zN = pjx.n(statusBarNotification4, pcuVar3, str4);
                } else {
                    zN = false;
                }
            } while (!zN);
            pkc pkcVar5 = (pkc) next;
            statusBarNotification = pkcVar5 != null ? pkcVar5.b : null;
            if (statusBarNotification != null) {
                nwt.a(mapE, statusBarNotification, pcuVar3, potVar2);
            }
        } else {
            statusBarNotification = null;
        }
        if (nvk.c(potVar7).length() > 0) {
            pkfVar2.a = pcuVar3;
            pkfVar2.b = potVar7;
            pkfVar2.c = agzfVar;
            pkfVar2.d = awrmVar;
            pkfVar2.e = linkedHashMap2;
            pkfVar2.j = 1;
            objB = b(mapE, pcuVar3, potVar7, potVar2, statusBarNotification, agzfVar, pkfVar2);
            if (objB == awoxVar) {
                return awoxVar;
            }
            awqgVar2 = agzfVar;
            r15 = linkedHashMap2;
        } else {
            if (statusBarNotification != null) {
                pjx pjxVar3 = pjx.a;
                awrmVar.a = mapE.get(pjx.k(statusBarNotification));
                pjwVarC = pjx.k(statusBarNotification);
            } else {
                pjwVarC = pjx.c(pcuVar, potVar);
            }
            mapE.put(pjwVarC, new pkc(pjwVarC, null, pcuVar3, potVar7));
            map = mapE;
            awqgVar = agzfVar;
            listAr = null;
            r14 = linkedHashMap2;
        }
        awrmVar2 = awrmVar;
        int size = map.size();
        iB = nvk.b(potVar7);
        if (iB > 0 || iB >= size) {
            pjwVar = null;
            r16 = r14;
        } else {
            List listSubList = atqq.am(map.values(), new pke((pki) this, potVar7, 0)).subList(0, size - nvk.b(potVar7));
            pkfVar2.a = potVar7;
            pkfVar2.b = awrmVar2;
            pkfVar2.c = listAr;
            pkfVar2.d = pjwVarC;
            pkfVar2.e = r14;
            pkfVar2.f = map;
            pkfVar2.g = listSubList;
            pkfVar2.j = 2;
            objB = c(listSubList, awqgVar, pkfVar2);
            if (objB == awoxVar) {
                return awoxVar;
            }
            potVar3 = potVar7;
            r0 = listSubList;
            r3 = r14;
            r2 = map;
            listAr2 = atqq.ar((Collection) objB);
            nwt.d(r2, listAr2);
            potVar3.getClass();
            pbj pbjVar2 = new pbj(nvk.b(potVar3));
            while (r8.hasNext()) {
                pcuVar2 = pkcVar3.c;
                potVar6 = pkcVar3.d;
                if (potVar6 != null) {
                    str3 = potVar6.a;
                } else {
                    str3 = null;
                }
                if (pcuVar2 == null) {
                }
            }
            if (!(r0 instanceof Collection)) {
                it2 = r0.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        pjwVar = null;
                        break;
                    }
                    pkc pkcVar6 = (pkc) it2.next();
                    str = potVar3.a;
                    potVar5 = pkcVar6.d;
                    if (potVar5 != null) {
                        str2 = potVar5.a;
                    } else {
                        str2 = null;
                    }
                    if (awrc.c(str, str2)) {
                        pkcVar2 = (pkc) awrmVar2.a;
                        if (pkcVar2 != null) {
                            listAr2.add(pkcVar2);
                            pjwVar = null;
                            awrmVar2.a = null;
                        } else {
                            pjwVar = null;
                        }
                        pjwVarC = pjwVar;
                        break;
                    }
                }
            } else {
                it2 = r0.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        pjwVar = null;
                        break;
                    }
                    pkc pkcVar7 = (pkc) it2.next();
                    str = potVar3.a;
                    potVar5 = pkcVar7.d;
                    if (potVar5 != null) {
                        str2 = potVar5.a;
                    } else {
                        str2 = null;
                    }
                    if (awrc.c(str, str2)) {
                        pkcVar2 = (pkc) awrmVar2.a;
                        if (pkcVar2 != null) {
                            listAr2.add(pkcVar2);
                            pjwVar = null;
                            awrmVar2.a = null;
                        } else {
                            pjwVar = null;
                        }
                        pjwVarC = pjwVar;
                        break;
                    }
                }
            }
            if (listAr == null) {
                listAr = awno.a;
            }
            listAr = atqq.ar(atqq.aj(listAr, listAr2));
            r16 = r3;
            potVar7 = potVar3;
        }
        pjwVar2 = pjwVarC;
        if (pjwVar2 != null) {
            ValueOf = pjwVar;
        } else {
            ValueOf = pjwVar;
        }
        pkcVar = (pkc) awrmVar2.a;
        if (pkcVar != null) {
            C = nwt.c(pkcVar);
        } else {
            C = pjwVar;
        }
        if (listAr != null) {
            arrayList = new ArrayList();
            it = listAr.iterator();
            while (it.hasNext()) {
                pkaVarC = nwt.c((pkc) it.next());
                if (pkaVarC != null) {
                    arrayList.add(pkaVarC);
                }
            }
            if (arrayList.isEmpty()) {
                r13 = arrayList;
            } else {
                r13 = pjwVar;
            }
        } else {
            r13 = pjwVar;
        }
        if (r16.isEmpty()) {
            linkedHashMap = new LinkedHashMap(atqq.u(r16.size()));
            while (r1.hasNext()) {
                Object key2 = entry.getKey();
                agknVar = new agkn();
                while (r2.hasNext()) {
                    agknVar.g(entry2.getValue(), entry2.getKey());
                }
                linkedHashMap.put(key2, agknVar.e());
            }
            r17 = linkedHashMap;
        } else {
            r17 = pjwVar;
        }
        return new pjy(pjwVar2, C, r13, r17, ValueOf);
        pkb pkbVar = (pkb) objB;
        Map mapE2 = atqq.E(pkbVar.a);
        pkc pkcVar8 = pkbVar.c;
        awrmVar.a = pkcVar8;
        List<pkc> list = pkbVar.d;
        List listAr3 = list != null ? atqq.ar(list) : null;
        pjw pjwVar3 = pkbVar.b;
        potVar7.getClass();
        pbi pbiVar = new pbi(nvk.a(potVar7), nvk.c(potVar7));
        if (pjwVar3 == null) {
            nwt.b(r15, pcuVar3, potVar7.a, pbiVar);
        }
        pcu pcuVar5 = pkcVar8 != null ? pkcVar8.c : null;
        String str5 = (pkcVar8 == null || (potVar4 = pkcVar8.d) == null) ? null : potVar4.a;
        if (pcuVar5 != null && str5 != null && !awrc.c(str5, potVar7.a)) {
            nwt.b(r15, pcuVar5, str5, pbiVar);
        }
        if (list != null) {
            for (pkc pkcVar9 : list) {
                pcu pcuVar6 = pkcVar9.c;
                pot potVar10 = pkcVar9.d;
                String str6 = potVar10 != null ? potVar10.a : null;
                if (pcuVar6 != null && str6 != null && !awrc.c(str6, potVar7.a)) {
                    nwt.b(r15, pcuVar6, str6, pbiVar);
                }
            }
        }
        awqg awqgVar3 = awqgVar2;
        pjwVarC = pjwVar3;
        awqgVar = awqgVar3;
        map = mapE2;
        listAr = listAr3;
        r14 = r15;
        awrmVar2 = awrmVar;
        int size2 = map.size();
        iB = nvk.b(potVar7);
        if (iB > 0) {
        }
        pjwVar = null;
        r16 = r14;
        pjwVar2 = pjwVarC;
        if (pjwVar2 != null) {
            ValueOf = pjwVar;
        } else {
            ValueOf = pjwVar;
        }
        pkcVar = (pkc) awrmVar2.a;
        if (pkcVar != null) {
            C = nwt.c(pkcVar);
        } else {
            C = pjwVar;
        }
        if (listAr != null) {
            arrayList = new ArrayList();
            it = listAr.iterator();
            while (it.hasNext()) {
                pkaVarC = nwt.c((pkc) it.next());
                if (pkaVarC != null) {
                    arrayList.add(pkaVarC);
                }
            }
            if (arrayList.isEmpty()) {
                r13 = arrayList;
            } else {
                r13 = pjwVar;
            }
        } else {
            r13 = pjwVar;
        }
        if (r16.isEmpty()) {
            linkedHashMap = new LinkedHashMap(atqq.u(r16.size()));
            while (r1.hasNext()) {
                Object key3 = entry.getKey();
                agknVar = new agkn();
                while (r2.hasNext()) {
                    agknVar.g(entry2.getValue(), entry2.getKey());
                }
                linkedHashMap.put(key3, agknVar.e());
            }
            r17 = linkedHashMap;
        } else {
            r17 = pjwVar;
        }
        return new pjy(pjwVar2, C, r13, r17, ValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r16v0, types: [pki] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    public final Object b(Map map, pcu pcuVar, pot potVar, pot potVar2, StatusBarNotification statusBarNotification, awqg awqgVar, awoq awoqVar) throws Throwable {
        pkd pkdVar;
        int i;
        List listAr;
        pkc pkcVar;
        pjw pjwVarC;
        List list;
        pkc pkcVar2;
        pot potVar3;
        ?? r2;
        ?? r3;
        Object obj;
        List list2;
        ?? Ar;
        pcu pcuVar2 = pcuVar;
        if (awoqVar instanceof pkd) {
            pkdVar = (pkd) awoqVar;
            int i2 = pkdVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pkdVar.g = i2 - Integer.MIN_VALUE;
            } else {
                pkdVar = new pkd(this, awoqVar);
            }
        } else {
            pkdVar = new pkd(this, awoqVar);
        }
        Object obj2 = pkdVar.e;
        awox awoxVar = awox.a;
        int i3 = pkdVar.g;
        if (i3 == 0) {
            atqp.j(obj2);
            Map mapE = atqq.E(map);
            i = (!awrc.c(nvk.c(potVar), potVar2 != null ? nvk.c(potVar2) : null) || statusBarNotification == null) ? 0 : 1;
            if (i != 0) {
                pjx pjxVar = pjx.a;
                pkcVar = (pkc) mapE.get(pjx.k(statusBarNotification));
                pjwVarC = pjx.k(statusBarNotification);
                mapE.put(pjx.k(statusBarNotification), new pkc(pjx.k(statusBarNotification), statusBarNotification, pcuVar2, potVar));
                list = null;
            } else {
                if (statusBarNotification != null) {
                    pjx pjxVar2 = pjx.a;
                    pkc pkcVar3 = (pkc) mapE.remove(pjx.k(statusBarNotification));
                    if (pkcVar3 != null) {
                        listAr = atqq.ar(atqq.H(pkcVar3));
                    } else {
                        listAr = null;
                    }
                } else {
                    listAr = null;
                }
                pkcVar = null;
                pjwVarC = null;
                list = listAr;
            }
            Collection collectionValues = mapE.values();
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : collectionValues) {
                pkc pkcVar4 = (pkc) obj3;
                StatusBarNotification statusBarNotification2 = pkcVar4.b;
                if (!awrc.c(statusBarNotification2 != null ? pjx.d(statusBarNotification2) : null, nvk.c(potVar))) {
                    pot potVar4 = pkcVar4.d;
                    if (awrc.c(potVar4 != null ? nvk.c(potVar4) : null, nvk.c(potVar))) {
                    }
                }
                arrayList.add(obj3);
            }
            int size = arrayList.size() + (i ^ 1);
            if (nvk.a(potVar) == 0 || size <= nvk.a(potVar)) {
                if (pkcVar == null) {
                    pjwVarC = pjx.c(pcuVar, potVar);
                    mapE.put(pjwVarC, new pkc(pjwVarC, null, pcuVar2, potVar));
                }
                return new pkb(mapE, pjwVarC, pkcVar, list);
            }
            pkdVar.a = pcuVar2;
            pkdVar.h = potVar;
            pkdVar.i = pjwVarC;
            pkdVar.j = pkcVar;
            pkdVar.b = list;
            pkdVar.c = mapE;
            pkdVar.d = i;
            pkdVar.g = 1;
            Object objC = c(arrayList, awqgVar, pkdVar);
            if (objC == awoxVar) {
                return awoxVar;
            }
            pkcVar2 = pkcVar;
            potVar3 = potVar;
            r2 = mapE;
            obj2 = objC;
            obj = pcuVar2;
            r3 = list;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = pkdVar.d;
            Object obj4 = pkdVar.c;
            Object obj5 = pkdVar.b;
            pkcVar2 = pkdVar.j;
            pjw pjwVar = pkdVar.i;
            potVar3 = pkdVar.h;
            Object obj6 = pkdVar.a;
            atqp.j(obj2);
            pjwVarC = pjwVar;
            i = i4;
            obj = obj6;
            r2 = obj4;
            r3 = obj5;
        }
        List listAr2 = atqq.ar((Collection) obj2);
        nwt.d(r2, listAr2);
        if (i == 0) {
            listAr2.add(new pkc(pjw.a, null, (pcu) obj, potVar3));
        }
        List listSubList = atqq.am(listAr2, new pke((pki) this, potVar3, 1)).subList(0, listAr2.size() - nvk.a(potVar3));
        if ((listSubList instanceof Collection) && listSubList.isEmpty()) {
            if (pkcVar2 == null) {
                pkcVar2 = (pkc) atqq.ab(listSubList);
                pjwVarC = pkcVar2.a;
                r2.put(pjwVarC, new pkc(pjwVarC, null, (pcu) obj, potVar3));
                if (listSubList.size() > 1) {
                    listSubList = listSubList.subList(0, listSubList.size() - 1);
                } else {
                    listSubList = awno.a;
                }
            }
            list2 = listSubList;
        } else {
            Iterator it = listSubList.iterator();
            while (true) {
                if (it.hasNext()) {
                    pkc pkcVar5 = (pkc) it.next();
                    String str = potVar3.a;
                    pot potVar5 = pkcVar5.d;
                    if (awrc.c(str, potVar5 != null ? potVar5.a : null)) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj7 : listSubList) {
                            pot potVar6 = ((pkc) obj7).d;
                            if (!awrc.c(str, potVar6 != null ? potVar6.a : null)) {
                                arrayList2.add(obj7);
                            }
                        }
                        list2 = arrayList2;
                        pkcVar2 = null;
                        pjwVarC = null;
                    }
                } else {
                    if (pkcVar2 == null) {
                        pkcVar2 = (pkc) atqq.ab(listSubList);
                        pjwVarC = pkcVar2.a;
                        r2.put(pjwVarC, new pkc(pjwVarC, null, (pcu) obj, potVar3));
                        if (listSubList.size() > 1) {
                            listSubList = listSubList.subList(0, listSubList.size() - 1);
                        } else {
                            listSubList = awno.a;
                        }
                    }
                    list2 = listSubList;
                }
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            r2.remove(((pkc) it2.next()).a);
        }
        if (r3 == 0) {
            if (true == list2.isEmpty()) {
                list2 = null;
            }
            Ar = list2 != null ? atqq.ar(list2) : 0;
        } else {
            r3.addAll(list2);
            Ar = r3;
        }
        return new pkb(r2, pjwVarC, pkcVar2, Ar);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [pki] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c0 -> B:35:0x00c4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(java.util.List r11, defpackage.awqg r12, defpackage.awoq r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pki.c(java.util.List, awqg, awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(int i, awqg awqgVar, awoq awoqVar) throws Throwable {
        pkh pkhVar;
        if (awoqVar instanceof pkh) {
            pkhVar = (pkh) awoqVar;
            int i2 = pkhVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pkhVar.d = i2 - Integer.MIN_VALUE;
            } else {
                pkhVar = new pkh(this, awoqVar);
            }
        } else {
            pkhVar = new pkh(this, awoqVar);
        }
        Object objInvoke = pkhVar.b;
        Object obj = awox.a;
        int i3 = pkhVar.d;
        if (i3 == 0) {
            atqp.j(objInvoke);
            if (i == -1) {
                return pcr.a;
            }
            if (i != 0) {
                pkhVar.a = i;
                pkhVar.d = 1;
                objInvoke = awqgVar.invoke(pkhVar);
                if (objInvoke == obj) {
                    return obj;
                }
            }
            return null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = pkhVar.a;
        atqp.j(objInvoke);
        Iterator it = ((Iterable) objInvoke).iterator();
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                break;
            }
            Object next = it.next();
            if (pjx.i(i, (plx) next)) {
                if (!z) {
                    obj2 = next;
                    z = true;
                }
            }
            obj2 = null;
            break;
        }
        plx plxVar = (plx) obj2;
        if (plxVar != null) {
            return new pcq(plxVar);
        }
        ((agsj) a.b()).u("Couldn't find an account matching the hash %d", i);
        return null;
    }

    public final Long e(int i, pot potVar, pot potVar2) {
        if (i - 1 != 2) {
            if (potVar2 != null) {
                return Long.valueOf(potVar2.c);
            }
            return null;
        }
        if (awrc.c(potVar, potVar2)) {
            return Long.valueOf(this.d.f().toEpochMilli());
        }
        if (potVar2 != null) {
            return Long.valueOf(potVar2.h);
        }
        return null;
    }

    public final long f(StatusBarNotification statusBarNotification) {
        return statusBarNotification != null ? statusBarNotification.getPostTime() : this.d.f().toEpochMilli();
    }
}
