package defpackage;

import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pgp implements per {
    private static final agsn a = agsn.h("GnpSdk");
    private final pct b;
    private final pve c;
    private final pav d;
    private final Set e;
    private final mbc f;
    private final awmd g;
    private final pou h;
    private final tld i;

    public pgp(pct pctVar, pve pveVar, tld tldVar, pcb pcbVar, pav pavVar, Set set, mbc mbcVar, awmd awmdVar, pou pouVar) {
        pctVar.getClass();
        pveVar.getClass();
        tldVar.getClass();
        pcbVar.getClass();
        pavVar.getClass();
        set.getClass();
        mbcVar.getClass();
        awmdVar.getClass();
        pouVar.getClass();
        this.b = pctVar;
        this.c = pveVar;
        this.i = tldVar;
        this.d = pavVar;
        this.e = set;
        this.f = mbcVar;
        this.g = awmdVar;
        this.h = pouVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:106:0x0305  */
    /* JADX WARN: Code duplicated, block: B:108:0x0308  */
    /* JADX WARN: Code duplicated, block: B:109:0x030a  */
    /* JADX WARN: Code duplicated, block: B:116:0x028f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:? A[LOOP:3: B:43:0x010e->B:131:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:45:0x0114  */
    /* JADX WARN: Code duplicated, block: B:50:0x013f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0145  */
    /* JADX WARN: Code duplicated, block: B:53:0x0153  */
    /* JADX WARN: Code duplicated, block: B:54:0x0166  */
    /* JADX WARN: Code duplicated, block: B:57:0x017d  */
    /* JADX WARN: Code duplicated, block: B:60:0x018f  */
    /* JADX WARN: Code duplicated, block: B:63:0x019a  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:79:0x0247 A[LOOP:0: B:77:0x0241->B:79:0x0247, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:83:0x0272  */
    /* JADX WARN: Code duplicated, block: B:85:0x0283  */
    /* JADX WARN: Code duplicated, block: B:91:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:93:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:99:0x02de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    @Override // defpackage.per
    public final Object a(plx plxVar, MessageLite messageLite, MessageLite messageLite2, awoq awoqVar) throws Throwable {
        pgn pgnVar;
        aiav aiavVar;
        plx plxVarA;
        aiau aiauVar;
        String str;
        aiav aiavVar2;
        plx plxVar2;
        pky pkyVar;
        ?? it;
        agev agevVar;
        Object objA;
        pgp pgpVar;
        aiau aiauVar2;
        pyp pypVar;
        Object objC;
        Object obj;
        plx plxVar3;
        aiau aiauVar3;
        List listAm;
        aidy aidyVarA;
        aidy aidyVarA2;
        int i;
        pax paxVar;
        LinkedHashMap linkedHashMap;
        agqs agqsVarListIterator;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List list;
        List list2;
        pgn pgnVar2;
        pax paxVar2;
        int i2;
        plx plxVar4;
        List list3;
        pct pctVar;
        plb plbVarC;
        aiec aiecVar;
        Long l;
        Long l2;
        boolean z;
        pct pctVar2;
        plb plbVarC2;
        if (awoqVar instanceof pgn) {
            pgnVar = (pgn) awoqVar;
            int i3 = pgnVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pgnVar.h = i3 - Integer.MIN_VALUE;
            } else {
                pgnVar = new pgn(this, awoqVar);
            }
        } else {
            pgnVar = new pgn(this, awoqVar);
        }
        pgn pgnVar3 = pgnVar;
        Object obj2 = pgnVar3.f;
        awox awoxVar = awox.a;
        switch (pgnVar3.h) {
            case 0:
                atqp.j(obj2);
                if (plxVar != null && (str = plxVar.b) != null) {
                    nxp.a(str);
                }
                aiau aiauVar4 = (aiau) messageLite;
                aiavVar = (aiav) messageLite2;
                if (plxVar != null && aiauVar4 != null && aiavVar != null) {
                    plw plwVar = new plw(plxVar);
                    plwVar.j(aiavVar.d);
                    aidy aidyVarA3 = aidy.a(aiauVar4.h);
                    if (aidyVarA3 == null) {
                        aidyVarA3 = aidy.FETCH_REASON_UNSPECIFIED;
                    }
                    if (aidyVarA3 == aidy.GUNS_MIGRATION && plxVar.m == 0) {
                        plwVar.d(aiavVar.e);
                    }
                    plxVarA = plwVar.a();
                    pve pveVar = this.c;
                    List listH = atqq.H(plxVarA);
                    pgnVar3.a = aiauVar4;
                    pgnVar3.b = aiavVar;
                    pgnVar3.c = plxVarA;
                    pgnVar3.h = 1;
                    Object objE = pveVar.e(listH, pgnVar3);
                    if (objE == awoxVar) {
                        return awoxVar;
                    }
                    aiauVar = aiauVar4;
                    obj2 = objE;
                    aiavVar2 = aiavVar;
                    plxVar2 = plxVarA;
                    pkyVar = (pky) obj2;
                    if (pkyVar instanceof pku) {
                        ((agsj) ((agsj) a.c()).j(((pku) pkyVar).b())).t("Failed to update account");
                    }
                    it = this.e.iterator();
                    while (it.hasNext()) {
                        pypVar = (pyp) it.next();
                        pgnVar3.a = aiauVar;
                        pgnVar3.b = aiavVar2;
                        pgnVar3.c = plxVar2;
                        pgnVar3.d = it;
                        pgnVar3.h = 2;
                        if (pypVar.d() == awoxVar) {
                            return awoxVar;
                        }
                    }
                    pgnVar3.a = aiauVar;
                    pgnVar3.b = plxVar2;
                    pgnVar3.c = this;
                    pgnVar3.d = null;
                    pgnVar3.h = 3;
                    if (aiavVar2.c.isEmpty()) {
                        objA = aiavVar2.b;
                        objA.getClass();
                    } else {
                        agevVar = (agev) ((aupo) this.g).b;
                        if (agevVar.g()) {
                            pom pomVar = (pom) agevVar.c();
                            aiavVar2.b.getClass();
                            aiavVar2.c.getClass();
                            objA = pomVar.a();
                        } else {
                            ((agsj) a.c()).t("FetchEncryptionHandler is not present");
                            objA = aiavVar2.b;
                            objA.getClass();
                        }
                    }
                    obj2 = objA;
                    if (obj2 == awoxVar) {
                        return awoxVar;
                    }
                    pgpVar = this;
                    aiauVar2 = aiauVar;
                    pgnVar3.a = aiauVar2;
                    pgnVar3.b = plxVar2;
                    pgnVar3.c = null;
                    pgnVar3.h = 4;
                    objC = pgpVar.c((List) obj2, plxVar2, pgnVar3);
                    if (objC != awoxVar) {
                        return awoxVar;
                    }
                    obj = objC;
                    plxVar3 = plxVar2;
                    aiauVar3 = aiauVar2;
                    listAm = (List) obj;
                    if (!listAm.isEmpty()) {
                        mbc mbcVar = this.f;
                        long micros = TimeUnit.MILLISECONDS.toMicros(mbcVar.f().toEpochMilli());
                        paw pawVarB = this.d.b(ahzv.FETCHED_LATEST_THREADS);
                        int i4 = pgm.b;
                        aidyVarA = aidy.a(aiauVar3.h);
                        if (aidyVarA == null) {
                            aidyVarA = aidy.FETCH_REASON_UNSPECIFIED;
                        }
                        ((pbc) pawVarB).t = qnl.aD(aidyVarA);
                        pawVarB.f(plxVar3);
                        pawVarB.h(listAm);
                        pawVarB.i(micros);
                        pawVarB.a();
                        if (auwb.d()) {
                            listAm = atqq.am(listAm, new awv(20));
                        }
                        aidyVarA2 = aidy.a(aiauVar3.h);
                        if (aidyVarA2 == null) {
                            aidyVarA2 = aidy.FETCH_REASON_UNSPECIFIED;
                        }
                        if (aidyVarA2 == aidy.INBOX) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        paxVar = new pax(new Long(micros), new Long(mbcVar.b()), 4);
                        tld tldVar = this.i;
                        tld tldVar2 = new tld();
                        tldVar2.A("1");
                        agke agkeVarA = ((pfv) tldVar.a).a(plxVar3, agke.q(tldVar2.z()));
                        agkeVarA.getClass();
                        linkedHashMap = new LinkedHashMap(awro.f(atqq.u(atqq.N(agkeVarA, 10)), 16));
                        agqsVarListIterator = agkeVarA.listIterator(0);
                        while (agqsVarListIterator.hasNext()) {
                            pot potVar = (pot) agqsVarListIterator.next();
                            awml awmlVar = new awml(potVar.a, new Long(potVar.c));
                            linkedHashMap.put(awmlVar.a, awmlVar.b);
                        }
                        arrayList = new ArrayList();
                        for (Object obj3 : listAm) {
                            aiec aiecVar2 = (aiec) obj3;
                            l2 = (Long) linkedHashMap.get(aiecVar2.e);
                            if (l2 != null || l2.longValue() <= aiecVar2.j) {
                                arrayList.add(obj3);
                            }
                        }
                        arrayList2 = new ArrayList();
                        arrayList3 = new ArrayList();
                        for (Object obj4 : arrayList) {
                            aiecVar = (aiec) obj4;
                            l = (Long) linkedHashMap.get(aiecVar.e);
                            if (l != null) {
                                if (l.longValue() == aiecVar.j) {
                                    arrayList2.add(obj4);
                                }
                            }
                            arrayList3.add(obj4);
                        }
                        awml awmlVar2 = new awml(arrayList2, arrayList3);
                        list = (List) awmlVar2.a;
                        list2 = (List) awmlVar2.b;
                        if (list.isEmpty()) {
                            pgnVar2 = pgnVar3;
                        } else {
                            pctVar = this.b;
                            plbVarC = plb.c();
                            pgnVar3.a = plxVar3;
                            pgnVar3.b = paxVar;
                            pgnVar3.c = list2;
                            pgnVar3.e = i;
                            pgnVar3.h = 5;
                            pgnVar2 = pgnVar3;
                            if (pctVar.b(plxVar3, list, plbVarC, paxVar, true, true, pgnVar2) == awoxVar) {
                                return awoxVar;
                            }
                        }
                        paxVar2 = paxVar;
                        i2 = i;
                        plxVar4 = plxVar3;
                        list3 = list2;
                        if (!list3.isEmpty()) {
                            if (1 != i2) {
                                z = false;
                            } else {
                                z = true;
                            }
                            pctVar2 = this.b;
                            plbVarC2 = plb.c();
                            pgnVar2.a = null;
                            pgnVar2.b = null;
                            pgnVar2.c = null;
                            pgnVar2.h = 6;
                            if (pctVar2.b(plxVar4, list3, plbVarC2, paxVar2, z, false, pgnVar2) == awoxVar) {
                                return awoxVar;
                            }
                        }
                    }
                }
                return awmy.a;
            case 1:
                plxVarA = (plx) pgnVar3.c;
                aiavVar = (aiav) pgnVar3.b;
                aiau aiauVar5 = (aiau) pgnVar3.a;
                atqp.j(obj2);
                aiauVar = aiauVar5;
                aiavVar2 = aiavVar;
                plxVar2 = plxVarA;
                pkyVar = (pky) obj2;
                if (pkyVar instanceof pku) {
                    ((agsj) ((agsj) a.c()).j(((pku) pkyVar).b())).t("Failed to update account");
                }
                it = this.e.iterator();
                while (it.hasNext()) {
                    pypVar = (pyp) it.next();
                    pgnVar3.a = aiauVar;
                    pgnVar3.b = aiavVar2;
                    pgnVar3.c = plxVar2;
                    pgnVar3.d = it;
                    pgnVar3.h = 2;
                    if (pypVar.d() == awoxVar) {
                        return awoxVar;
                    }
                }
                pgnVar3.a = aiauVar;
                pgnVar3.b = plxVar2;
                pgnVar3.c = this;
                pgnVar3.d = null;
                pgnVar3.h = 3;
                if (aiavVar2.c.isEmpty()) {
                    objA = aiavVar2.b;
                    objA.getClass();
                } else {
                    agevVar = (agev) ((aupo) this.g).b;
                    if (agevVar.g()) {
                        ((agsj) a.c()).t("FetchEncryptionHandler is not present");
                        objA = aiavVar2.b;
                        objA.getClass();
                    } else {
                        pom pomVar2 = (pom) agevVar.c();
                        aiavVar2.b.getClass();
                        aiavVar2.c.getClass();
                        objA = pomVar2.a();
                    }
                }
                obj2 = objA;
                if (obj2 == awoxVar) {
                    return awoxVar;
                }
                pgpVar = this;
                aiauVar2 = aiauVar;
                pgnVar3.a = aiauVar2;
                pgnVar3.b = plxVar2;
                pgnVar3.c = null;
                pgnVar3.h = 4;
                objC = pgpVar.c((List) obj2, plxVar2, pgnVar3);
                if (objC != awoxVar) {
                    return awoxVar;
                }
                obj = objC;
                plxVar3 = plxVar2;
                aiauVar3 = aiauVar2;
                listAm = (List) obj;
                if (!listAm.isEmpty()) {
                    mbc mbcVar2 = this.f;
                    long micros2 = TimeUnit.MILLISECONDS.toMicros(mbcVar2.f().toEpochMilli());
                    paw pawVarB2 = this.d.b(ahzv.FETCHED_LATEST_THREADS);
                    int i5 = pgm.b;
                    aidyVarA = aidy.a(aiauVar3.h);
                    if (aidyVarA == null) {
                        aidyVarA = aidy.FETCH_REASON_UNSPECIFIED;
                    }
                    ((pbc) pawVarB2).t = qnl.aD(aidyVarA);
                    pawVarB2.f(plxVar3);
                    pawVarB2.h(listAm);
                    pawVarB2.i(micros2);
                    pawVarB2.a();
                    if (auwb.d()) {
                        listAm = atqq.am(listAm, new awv(20));
                    }
                    aidyVarA2 = aidy.a(aiauVar3.h);
                    if (aidyVarA2 == null) {
                        aidyVarA2 = aidy.FETCH_REASON_UNSPECIFIED;
                    }
                    if (aidyVarA2 == aidy.INBOX) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    paxVar = new pax(new Long(micros2), new Long(mbcVar2.b()), 4);
                    tld tldVar3 = this.i;
                    tld tldVar4 = new tld();
                    tldVar4.A("1");
                    agke agkeVarA2 = ((pfv) tldVar3.a).a(plxVar3, agke.q(tldVar4.z()));
                    agkeVarA2.getClass();
                    linkedHashMap = new LinkedHashMap(awro.f(atqq.u(atqq.N(agkeVarA2, 10)), 16));
                    agqsVarListIterator = agkeVarA2.listIterator(0);
                    while (agqsVarListIterator.hasNext()) {
                        pot potVar2 = (pot) agqsVarListIterator.next();
                        awml awmlVar3 = new awml(potVar2.a, new Long(potVar2.c));
                        linkedHashMap.put(awmlVar3.a, awmlVar3.b);
                    }
                    arrayList = new ArrayList();
                    while (r1.hasNext()) {
                        aiec aiecVar3 = (aiec) obj3;
                        l2 = (Long) linkedHashMap.get(aiecVar3.e);
                        if (l2 != null) {
                        }
                        arrayList.add(obj3);
                    }
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                    while (r3.hasNext()) {
                        aiecVar = (aiec) obj4;
                        l = (Long) linkedHashMap.get(aiecVar.e);
                        if (l != null) {
                            if (l.longValue() == aiecVar.j) {
                                arrayList2.add(obj4);
                            }
                        }
                        arrayList3.add(obj4);
                    }
                    awml awmlVar4 = new awml(arrayList2, arrayList3);
                    list = (List) awmlVar4.a;
                    list2 = (List) awmlVar4.b;
                    if (list.isEmpty()) {
                        pctVar = this.b;
                        plbVarC = plb.c();
                        pgnVar3.a = plxVar3;
                        pgnVar3.b = paxVar;
                        pgnVar3.c = list2;
                        pgnVar3.e = i;
                        pgnVar3.h = 5;
                        pgnVar2 = pgnVar3;
                        if (pctVar.b(plxVar3, list, plbVarC, paxVar, true, true, pgnVar2) == awoxVar) {
                            return awoxVar;
                        }
                    } else {
                        pgnVar2 = pgnVar3;
                    }
                    paxVar2 = paxVar;
                    i2 = i;
                    plxVar4 = plxVar3;
                    list3 = list2;
                    if (!list3.isEmpty()) {
                        if (1 != i2) {
                            z = false;
                        } else {
                            z = true;
                        }
                        pctVar2 = this.b;
                        plbVarC2 = plb.c();
                        pgnVar2.a = null;
                        pgnVar2.b = null;
                        pgnVar2.c = null;
                        pgnVar2.h = 6;
                        if (pctVar2.b(plxVar4, list3, plbVarC2, paxVar2, z, false, pgnVar2) == awoxVar) {
                            return awoxVar;
                        }
                    }
                }
                return awmy.a;
            case 2:
                Object obj5 = pgnVar3.d;
                plxVar2 = (plx) pgnVar3.c;
                aiavVar2 = (aiav) pgnVar3.b;
                aiauVar = (aiau) pgnVar3.a;
                atqp.j(obj2);
                it = obj5;
                while (it.hasNext()) {
                    pypVar = (pyp) it.next();
                    pgnVar3.a = aiauVar;
                    pgnVar3.b = aiavVar2;
                    pgnVar3.c = plxVar2;
                    pgnVar3.d = it;
                    pgnVar3.h = 2;
                    if (pypVar.d() == awoxVar) {
                        return awoxVar;
                    }
                }
                pgnVar3.a = aiauVar;
                pgnVar3.b = plxVar2;
                pgnVar3.c = this;
                pgnVar3.d = null;
                pgnVar3.h = 3;
                if (aiavVar2.c.isEmpty()) {
                    objA = aiavVar2.b;
                    objA.getClass();
                } else {
                    agevVar = (agev) ((aupo) this.g).b;
                    if (agevVar.g()) {
                        ((agsj) a.c()).t("FetchEncryptionHandler is not present");
                        objA = aiavVar2.b;
                        objA.getClass();
                    } else {
                        pom pomVar3 = (pom) agevVar.c();
                        aiavVar2.b.getClass();
                        aiavVar2.c.getClass();
                        objA = pomVar3.a();
                    }
                }
                obj2 = objA;
                if (obj2 == awoxVar) {
                    return awoxVar;
                }
                pgpVar = this;
                aiauVar2 = aiauVar;
                pgnVar3.a = aiauVar2;
                pgnVar3.b = plxVar2;
                pgnVar3.c = null;
                pgnVar3.h = 4;
                objC = pgpVar.c((List) obj2, plxVar2, pgnVar3);
                if (objC != awoxVar) {
                    return awoxVar;
                }
                obj = objC;
                plxVar3 = plxVar2;
                aiauVar3 = aiauVar2;
                listAm = (List) obj;
                if (!listAm.isEmpty()) {
                    mbc mbcVar3 = this.f;
                    long micros3 = TimeUnit.MILLISECONDS.toMicros(mbcVar3.f().toEpochMilli());
                    paw pawVarB3 = this.d.b(ahzv.FETCHED_LATEST_THREADS);
                    int i6 = pgm.b;
                    aidyVarA = aidy.a(aiauVar3.h);
                    if (aidyVarA == null) {
                        aidyVarA = aidy.FETCH_REASON_UNSPECIFIED;
                    }
                    ((pbc) pawVarB3).t = qnl.aD(aidyVarA);
                    pawVarB3.f(plxVar3);
                    pawVarB3.h(listAm);
                    pawVarB3.i(micros3);
                    pawVarB3.a();
                    if (auwb.d()) {
                        listAm = atqq.am(listAm, new awv(20));
                    }
                    aidyVarA2 = aidy.a(aiauVar3.h);
                    if (aidyVarA2 == null) {
                        aidyVarA2 = aidy.FETCH_REASON_UNSPECIFIED;
                    }
                    if (aidyVarA2 == aidy.INBOX) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    paxVar = new pax(new Long(micros3), new Long(mbcVar3.b()), 4);
                    tld tldVar5 = this.i;
                    tld tldVar6 = new tld();
                    tldVar6.A("1");
                    agke agkeVarA3 = ((pfv) tldVar5.a).a(plxVar3, agke.q(tldVar6.z()));
                    agkeVarA3.getClass();
                    linkedHashMap = new LinkedHashMap(awro.f(atqq.u(atqq.N(agkeVarA3, 10)), 16));
                    agqsVarListIterator = agkeVarA3.listIterator(0);
                    while (agqsVarListIterator.hasNext()) {
                        pot potVar3 = (pot) agqsVarListIterator.next();
                        awml awmlVar5 = new awml(potVar3.a, new Long(potVar3.c));
                        linkedHashMap.put(awmlVar5.a, awmlVar5.b);
                    }
                    arrayList = new ArrayList();
                    while (r1.hasNext()) {
                        aiec aiecVar4 = (aiec) obj3;
                        l2 = (Long) linkedHashMap.get(aiecVar4.e);
                        if (l2 != null) {
                        }
                        arrayList.add(obj3);
                    }
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                    while (r3.hasNext()) {
                        aiecVar = (aiec) obj4;
                        l = (Long) linkedHashMap.get(aiecVar.e);
                        if (l != null) {
                            if (l.longValue() == aiecVar.j) {
                                arrayList2.add(obj4);
                            }
                        }
                        arrayList3.add(obj4);
                    }
                    awml awmlVar6 = new awml(arrayList2, arrayList3);
                    list = (List) awmlVar6.a;
                    list2 = (List) awmlVar6.b;
                    if (list.isEmpty()) {
                        pctVar = this.b;
                        plbVarC = plb.c();
                        pgnVar3.a = plxVar3;
                        pgnVar3.b = paxVar;
                        pgnVar3.c = list2;
                        pgnVar3.e = i;
                        pgnVar3.h = 5;
                        pgnVar2 = pgnVar3;
                        if (pctVar.b(plxVar3, list, plbVarC, paxVar, true, true, pgnVar2) == awoxVar) {
                            return awoxVar;
                        }
                    } else {
                        pgnVar2 = pgnVar3;
                    }
                    paxVar2 = paxVar;
                    i2 = i;
                    plxVar4 = plxVar3;
                    list3 = list2;
                    if (!list3.isEmpty()) {
                        if (1 != i2) {
                            z = false;
                        } else {
                            z = true;
                        }
                        pctVar2 = this.b;
                        plbVarC2 = plb.c();
                        pgnVar2.a = null;
                        pgnVar2.b = null;
                        pgnVar2.c = null;
                        pgnVar2.h = 6;
                        if (pctVar2.b(plxVar4, list3, plbVarC2, paxVar2, z, false, pgnVar2) == awoxVar) {
                            return awoxVar;
                        }
                    }
                }
                return awmy.a;
            case 3:
                pgpVar = (pgp) pgnVar3.c;
                plxVar2 = (plx) pgnVar3.b;
                aiauVar2 = (aiau) pgnVar3.a;
                atqp.j(obj2);
                pgnVar3.a = aiauVar2;
                pgnVar3.b = plxVar2;
                pgnVar3.c = null;
                pgnVar3.h = 4;
                objC = pgpVar.c((List) obj2, plxVar2, pgnVar3);
                if (objC != awoxVar) {
                    return awoxVar;
                }
                obj = objC;
                plxVar3 = plxVar2;
                aiauVar3 = aiauVar2;
                listAm = (List) obj;
                if (!listAm.isEmpty()) {
                    mbc mbcVar4 = this.f;
                    long micros4 = TimeUnit.MILLISECONDS.toMicros(mbcVar4.f().toEpochMilli());
                    paw pawVarB4 = this.d.b(ahzv.FETCHED_LATEST_THREADS);
                    int i7 = pgm.b;
                    aidyVarA = aidy.a(aiauVar3.h);
                    if (aidyVarA == null) {
                        aidyVarA = aidy.FETCH_REASON_UNSPECIFIED;
                    }
                    ((pbc) pawVarB4).t = qnl.aD(aidyVarA);
                    pawVarB4.f(plxVar3);
                    pawVarB4.h(listAm);
                    pawVarB4.i(micros4);
                    pawVarB4.a();
                    if (auwb.d()) {
                        listAm = atqq.am(listAm, new awv(20));
                    }
                    aidyVarA2 = aidy.a(aiauVar3.h);
                    if (aidyVarA2 == null) {
                        aidyVarA2 = aidy.FETCH_REASON_UNSPECIFIED;
                    }
                    if (aidyVarA2 == aidy.INBOX) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    paxVar = new pax(new Long(micros4), new Long(mbcVar4.b()), 4);
                    tld tldVar7 = this.i;
                    tld tldVar8 = new tld();
                    tldVar8.A("1");
                    agke agkeVarA4 = ((pfv) tldVar7.a).a(plxVar3, agke.q(tldVar8.z()));
                    agkeVarA4.getClass();
                    linkedHashMap = new LinkedHashMap(awro.f(atqq.u(atqq.N(agkeVarA4, 10)), 16));
                    agqsVarListIterator = agkeVarA4.listIterator(0);
                    while (agqsVarListIterator.hasNext()) {
                        pot potVar4 = (pot) agqsVarListIterator.next();
                        awml awmlVar7 = new awml(potVar4.a, new Long(potVar4.c));
                        linkedHashMap.put(awmlVar7.a, awmlVar7.b);
                    }
                    arrayList = new ArrayList();
                    while (r1.hasNext()) {
                        aiec aiecVar5 = (aiec) obj3;
                        l2 = (Long) linkedHashMap.get(aiecVar5.e);
                        if (l2 != null) {
                        }
                        arrayList.add(obj3);
                    }
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                    while (r3.hasNext()) {
                        aiecVar = (aiec) obj4;
                        l = (Long) linkedHashMap.get(aiecVar.e);
                        if (l != null) {
                            if (l.longValue() == aiecVar.j) {
                                arrayList2.add(obj4);
                            }
                        }
                        arrayList3.add(obj4);
                    }
                    awml awmlVar8 = new awml(arrayList2, arrayList3);
                    list = (List) awmlVar8.a;
                    list2 = (List) awmlVar8.b;
                    if (list.isEmpty()) {
                        pctVar = this.b;
                        plbVarC = plb.c();
                        pgnVar3.a = plxVar3;
                        pgnVar3.b = paxVar;
                        pgnVar3.c = list2;
                        pgnVar3.e = i;
                        pgnVar3.h = 5;
                        pgnVar2 = pgnVar3;
                        if (pctVar.b(plxVar3, list, plbVarC, paxVar, true, true, pgnVar2) == awoxVar) {
                            return awoxVar;
                        }
                    } else {
                        pgnVar2 = pgnVar3;
                    }
                    paxVar2 = paxVar;
                    i2 = i;
                    plxVar4 = plxVar3;
                    list3 = list2;
                    if (!list3.isEmpty()) {
                        if (1 != i2) {
                            z = false;
                        } else {
                            z = true;
                        }
                        pctVar2 = this.b;
                        plbVarC2 = plb.c();
                        pgnVar2.a = null;
                        pgnVar2.b = null;
                        pgnVar2.c = null;
                        pgnVar2.h = 6;
                        if (pctVar2.b(plxVar4, list3, plbVarC2, paxVar2, z, false, pgnVar2) == awoxVar) {
                            return awoxVar;
                        }
                    }
                }
                return awmy.a;
            case 4:
                plx plxVar5 = (plx) pgnVar3.b;
                aiauVar3 = (aiau) pgnVar3.a;
                atqp.j(obj2);
                plxVar3 = plxVar5;
                obj = obj2;
                listAm = (List) obj;
                if (!listAm.isEmpty()) {
                    mbc mbcVar5 = this.f;
                    long micros5 = TimeUnit.MILLISECONDS.toMicros(mbcVar5.f().toEpochMilli());
                    paw pawVarB5 = this.d.b(ahzv.FETCHED_LATEST_THREADS);
                    int i8 = pgm.b;
                    aidyVarA = aidy.a(aiauVar3.h);
                    if (aidyVarA == null) {
                        aidyVarA = aidy.FETCH_REASON_UNSPECIFIED;
                    }
                    ((pbc) pawVarB5).t = qnl.aD(aidyVarA);
                    pawVarB5.f(plxVar3);
                    pawVarB5.h(listAm);
                    pawVarB5.i(micros5);
                    pawVarB5.a();
                    if (auwb.d()) {
                        listAm = atqq.am(listAm, new awv(20));
                    }
                    aidyVarA2 = aidy.a(aiauVar3.h);
                    if (aidyVarA2 == null) {
                        aidyVarA2 = aidy.FETCH_REASON_UNSPECIFIED;
                    }
                    if (aidyVarA2 == aidy.INBOX) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    paxVar = new pax(new Long(micros5), new Long(mbcVar5.b()), 4);
                    tld tldVar9 = this.i;
                    tld tldVar10 = new tld();
                    tldVar10.A("1");
                    agke agkeVarA5 = ((pfv) tldVar9.a).a(plxVar3, agke.q(tldVar10.z()));
                    agkeVarA5.getClass();
                    linkedHashMap = new LinkedHashMap(awro.f(atqq.u(atqq.N(agkeVarA5, 10)), 16));
                    agqsVarListIterator = agkeVarA5.listIterator(0);
                    while (agqsVarListIterator.hasNext()) {
                        pot potVar5 = (pot) agqsVarListIterator.next();
                        awml awmlVar9 = new awml(potVar5.a, new Long(potVar5.c));
                        linkedHashMap.put(awmlVar9.a, awmlVar9.b);
                    }
                    arrayList = new ArrayList();
                    while (r1.hasNext()) {
                        aiec aiecVar6 = (aiec) obj3;
                        l2 = (Long) linkedHashMap.get(aiecVar6.e);
                        if (l2 != null) {
                        }
                        arrayList.add(obj3);
                    }
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                    while (r3.hasNext()) {
                        aiecVar = (aiec) obj4;
                        l = (Long) linkedHashMap.get(aiecVar.e);
                        if (l != null) {
                            if (l.longValue() == aiecVar.j) {
                                arrayList2.add(obj4);
                            }
                        }
                        arrayList3.add(obj4);
                    }
                    awml awmlVar10 = new awml(arrayList2, arrayList3);
                    list = (List) awmlVar10.a;
                    list2 = (List) awmlVar10.b;
                    if (list.isEmpty()) {
                        pctVar = this.b;
                        plbVarC = plb.c();
                        pgnVar3.a = plxVar3;
                        pgnVar3.b = paxVar;
                        pgnVar3.c = list2;
                        pgnVar3.e = i;
                        pgnVar3.h = 5;
                        pgnVar2 = pgnVar3;
                        if (pctVar.b(plxVar3, list, plbVarC, paxVar, true, true, pgnVar2) == awoxVar) {
                            return awoxVar;
                        }
                    } else {
                        pgnVar2 = pgnVar3;
                    }
                    paxVar2 = paxVar;
                    i2 = i;
                    plxVar4 = plxVar3;
                    list3 = list2;
                    if (!list3.isEmpty()) {
                        if (1 != i2) {
                            z = false;
                        } else {
                            z = true;
                        }
                        pctVar2 = this.b;
                        plbVarC2 = plb.c();
                        pgnVar2.a = null;
                        pgnVar2.b = null;
                        pgnVar2.c = null;
                        pgnVar2.h = 6;
                        if (pctVar2.b(plxVar4, list3, plbVarC2, paxVar2, z, false, pgnVar2) == awoxVar) {
                            return awoxVar;
                        }
                    }
                }
                return awmy.a;
            case 5:
                i2 = pgnVar3.e;
                List list4 = (List) pgnVar3.c;
                paxVar2 = (pax) pgnVar3.b;
                plxVar4 = (plx) pgnVar3.a;
                atqp.j(obj2);
                list3 = list4;
                pgnVar2 = pgnVar3;
                if (!list3.isEmpty()) {
                    if (1 != i2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    pctVar2 = this.b;
                    plbVarC2 = plb.c();
                    pgnVar2.a = null;
                    pgnVar2.b = null;
                    pgnVar2.c = null;
                    pgnVar2.h = 6;
                    if (pctVar2.b(plxVar4, list3, plbVarC2, paxVar2, z, false, pgnVar2) == awoxVar) {
                        return awoxVar;
                    }
                }
                return awmy.a;
            case 6:
                atqp.j(obj2);
                return awmy.a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // defpackage.per
    public final Object b(plx plxVar, MessageLite messageLite, awoq awoqVar) {
        String str;
        if (plxVar != null && (str = plxVar.b) != null) {
            nxp.a(str);
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v9 */
    public final Object c(List list, plx plxVar, awoq awoqVar) throws Throwable {
        pgo pgoVar;
        ?? r11;
        if (awoqVar instanceof pgo) {
            pgoVar = (pgo) awoqVar;
            int i = pgoVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pgoVar.d = i - Integer.MIN_VALUE;
            } else {
                pgoVar = new pgo(this, awoqVar);
            }
        } else {
            pgoVar = new pgo(this, awoqVar);
        }
        Object obj = pgoVar.b;
        Object obj2 = awox.a;
        int i2 = pgoVar.d;
        if (i2 == 0) {
            atqp.j(obj);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aiie aiieVar = ((aiec) it.next()).x;
                aiieVar.getClass();
                ArrayList arrayList2 = new ArrayList(atqq.N(aiieVar, 10));
                Iterator it2 = aiieVar.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new Integer(((aiea) it2.next()).b));
                }
                atqq.aA(arrayList, arrayList2);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                aiie aiieVar2 = ((aiec) it3.next()).w;
                aiieVar2.getClass();
                ArrayList arrayList4 = new ArrayList(atqq.N(aiieVar2, 10));
                Iterator it4 = aiieVar2.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(new Integer(((aidz) it4.next()).b));
                }
                atqq.aA(arrayList3, arrayList4);
            }
            if (!arrayList3.isEmpty() || !arrayList.isEmpty()) {
                r11 = list;
                pou pouVar = this.h;
                String str = plxVar.b;
                str.getClass();
                pgoVar.a = list;
                pgoVar.e = plxVar;
                pgoVar.d = 1;
                r11 = list;
                if (pouVar.b(str, arrayList3, arrayList, pgoVar) != obj2) {
                }
            }
            return obj2;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        plxVar = pgoVar.e;
        Object obj3 = pgoVar.a;
        atqp.j(obj);
        r11 = obj3;
        r11 = list;
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        for (Object obj4 : r11) {
            int i3 = pyn.a;
            if (pyn.a((aiec) obj4)) {
                arrayList5.add(obj4);
            } else {
                arrayList6.add(obj4);
            }
        }
        awml awmlVar = new awml(arrayList5, arrayList6);
        List list2 = (List) awmlVar.a;
        obj2 = (List) awmlVar.b;
        if (!list2.isEmpty()) {
            paw pawVarB = this.d.b(ahzv.FETCHED_COUNTERFACTUAL);
            pawVarB.f(plxVar);
            pawVarB.h(list2);
            pawVarB.a();
        }
        return obj2;
    }
}
