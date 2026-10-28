package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aasc {
    public static awkv a() {
        return awku.aC(aash.a);
    }

    public static List b(List list, List list2, float f, agek agekVar) {
        if (f <= 0.0f || list.size() <= 1 || list2.isEmpty()) {
            if (f <= 0.0f) {
                return list;
            }
            list.size();
            return list;
        }
        int iMax = Math.max(1, (int) (list.size() * f));
        HashMap map = new HashMap();
        if (iMax < list2.size()) {
            ArrayList arrayList = new ArrayList(list2);
            Collections.sort(arrayList, new fui(agekVar, 10, null));
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                aamo aamoVar = (aamo) arrayList.get(i);
                if (!map.containsKey(aamoVar.d())) {
                    map.put(aamoVar.d(), aamoVar);
                    i2++;
                }
                i++;
                if (i2 == iMax) {
                    break;
                }
            }
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                aamo aamoVar2 = (aamo) it.next();
                map.put(aamoVar2.d(), aamoVar2);
            }
        }
        map.size();
        for (int i3 = 0; i3 < list.size() && map.size() < list.size(); i3++) {
            aamo aamoVar3 = (aamo) list.get(i3);
            if (!map.containsKey(aamoVar3.d())) {
                map.put(aamoVar3.d(), aamoVar3);
            }
        }
        map.size();
        return new ArrayList(map.values());
    }

    public static boolean c(String str) {
        return !ahno.aa(str) && str.startsWith("PPSS");
    }

    public static final awsd d(abxp abxpVar) {
        abxpVar.getClass();
        int iH = a.H(abxpVar);
        if (iH == 0) {
            int i = awrn.a;
            return new awqv(abxk.class);
        }
        if (iH == 1) {
            int i2 = awrn.a;
            return new awqv(abxo.class);
        }
        if (iH == 2) {
            int i3 = awrn.a;
            return new awqv(abxj.class);
        }
        if (iH != 3) {
            throw new awmj();
        }
        int i4 = awrn.a;
        return new awqv(abxi.class);
    }

    public static final abul e(abul abulVar, List list, boolean z, int i) {
        Integer numValueOf;
        abulVar.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        int i2 = abulVar.b + i;
        int size = list.size();
        int i3 = size - 1;
        if (z) {
            int i4 = i2 % size;
            if (i4 < 0) {
                i4 += size;
            }
            numValueOf = Integer.valueOf(i4);
        } else {
            numValueOf = Integer.valueOf(i2);
            int iIntValue = numValueOf.intValue();
            if (iIntValue < 0 || iIntValue > i3) {
                numValueOf = null;
            }
        }
        if (numValueOf != null) {
            return new abul(numValueOf.intValue(), null);
        }
        return null;
    }

    public static final abun f(abul abulVar, List list) {
        abulVar.getClass();
        list.getClass();
        abun abunVar = (abun) atqq.aa(list, abulVar.b);
        if (abunVar == null) {
            return null;
        }
        Integer num = abulVar.c;
        if (num == null) {
            return abunVar;
        }
        int iIntValue = num.intValue();
        agke agkeVarC = abunVar.c();
        agkeVarC.getClass();
        return (abun) atqq.aa(agkeVarC, iIntValue);
    }

    public static String g(abun abunVar) {
        return String.valueOf(System.identityHashCode(abunVar));
    }
}
