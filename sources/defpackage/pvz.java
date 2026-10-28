package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pvz implements pvg {
    public static final /* synthetic */ int f = 0;
    private static final agsn g = agsn.h("GnpSdk");
    public final aunn a;
    public final mbc b;
    public final awut c;
    public final AtomicReference d = new AtomicReference(null);
    public final axff e = new axfi(false);

    public pvz(aunn aunnVar, mbc mbcVar, awut awutVar) {
        this.a = aunnVar;
        this.b = mbcVar;
        this.c = awutVar;
    }

    public static final List c(Map map, List list) {
        List listO = atqq.O(map.values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO) {
            if (list.contains(((ptk) obj).d)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List d(Map map, String str, List list) {
        List list2 = (List) map.get(str);
        if (list2 == null) {
            return awno.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (list.contains(((ptk) obj).d)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.pvg
    public final Object a(List list, awoq awoqVar) {
        Map map = (Map) this.d.get();
        return map != null ? new pla(c(map, list)) : nxe.a(this.e, new pvw(this, list, (awoq) null, 0), awoqVar);
    }

    public final void b() {
        this.d.set(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(List list, List list2, int i, awoq awoqVar) throws Throwable {
        pvx pvxVar;
        if (awoqVar instanceof pvx) {
            pvxVar = (pvx) awoqVar;
            int i2 = pvxVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pvxVar.c = i2 - Integer.MIN_VALUE;
            } else {
                pvxVar = new pvx(this, awoqVar);
            }
        } else {
            pvxVar = new pvx(this, awoqVar);
        }
        Object objF = pvxVar.a;
        Object obj = awox.a;
        int i3 = pvxVar.c;
        if (i3 == 0) {
            atqp.j(objF);
            AtomicReference atomicReference = this.d;
            Map map = (Map) atomicReference.get();
            if (map != null) {
                List listAs = atqq.as(list, list2);
                ArrayList<awml> arrayList = new ArrayList();
                for (Object obj2 : listAs) {
                    if (((Number) ((awml) obj2).b).longValue() != -1) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(atqq.N(arrayList, 10));
                for (awml awmlVar : arrayList) {
                    ptk ptkVar = (ptk) awmlVar.a;
                    long jLongValue = ((Number) awmlVar.b).longValue();
                    int i4 = 0;
                    if (jLongValue >= 0 && jLongValue < 2147483648L) {
                        i4 = (int) jLongValue;
                    }
                    arrayList2.add(new ptk(i4, ptkVar.b, ptkVar.c, ptkVar.d, ptkVar.e, ptkVar.f));
                }
                if (arrayList2.isEmpty()) {
                    return awmy.a;
                }
                Map mapE = atqq.E(map);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : arrayList2) {
                    String str = ((ptk) obj3).b;
                    Object arrayList3 = linkedHashMap.get(str);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(str, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    List list3 = (List) entry.getValue();
                    Collection collection = (List) mapE.get(str2);
                    if (collection == null) {
                        collection = awno.a;
                    }
                    ArrayList arrayList4 = new ArrayList(atqq.N(collection, 10));
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(new Integer(((ptk) it.next()).c));
                    }
                    Set setAw = atqq.aw(arrayList4);
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : list3) {
                        if (hashSet.add(new Integer(((ptk) obj4).c))) {
                            arrayList5.add(obj4);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj5 : arrayList5) {
                        if (!setAw.contains(new Integer(((ptk) obj5).c))) {
                            arrayList6.add(obj5);
                        }
                    }
                    mapE.put(str2, atqq.aj(collection, arrayList6));
                }
                atomicReference.set(mapE);
                return awmy.a;
            }
            pvxVar.c = 1;
            objF = f(i, pvxVar);
            if (objF == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objF);
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(int i, awoq awoqVar) {
        pvy pvyVar;
        Exception e;
        pkx pkxVar;
        Object pkvVar;
        if (awoqVar instanceof pvy) {
            pvyVar = (pvy) awoqVar;
            int i2 = pvyVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pvyVar.c = i2 - Integer.MIN_VALUE;
            } else {
                pvyVar = new pvy(this, awoqVar);
            }
        } else {
            pvyVar = new pvy(this, awoqVar);
        }
        Object obj = pvyVar.a;
        awox awoxVar = awox.a;
        int i3 = pvyVar.c;
        if (i3 == 0) {
            atqp.j(obj);
            pkx pkxVar2 = pkx.e;
            try {
                Object objIo = this.a.io();
                List listAR = atqq.aR(ptj.values());
                pvyVar.d = pkxVar2;
                pvyVar.c = 1;
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM gnp_experiments WHERE experiment_source = ? AND experiment_type IN (");
                api.o(sb, listAR.size());
                sb.append(')');
                Object objG = apb.g(((pvu) objIo).a, true, false, new hii(sb.toString(), i, listAR, 2), pvyVar);
                if (objG == awoxVar) {
                    return awoxVar;
                }
                obj = objG;
                pkxVar = pkxVar2;
            } catch (Exception e2) {
                e = e2;
                pkxVar = pkxVar2;
                awro.A(pvyVar.getContext());
                pkvVar = new pkv(e, pkxVar);
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pkxVar = pvyVar.d;
            try {
                atqp.j(obj);
            } catch (Exception e3) {
                e = e3;
                awro.A(pvyVar.getContext());
                pkvVar = new pkv(e, pkxVar);
            }
        }
        pkvVar = new pla(obj);
        if (!(pkvVar instanceof pla)) {
            if (pkvVar instanceof pku) {
                ((agsj) ((agsj) g.c()).j(((pku) pkvVar).b())).t("Failed to get experiments from storage.");
            }
            return new pkv("Failed to get experiments from storage.", pkx.e);
        }
        List list = (List) ((pla) pkvVar).a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            String str = ((ptk) obj2).b;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        this.d.set(linkedHashMap);
        return new pla(awmy.a);
    }
}
