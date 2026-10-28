package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nxi {
    public static final poo a() {
        poo pooVar = new poo();
        pooVar.c(aidq.a);
        pooVar.B(aiep.a);
        pooVar.g(aidu.DELETION_STATUS_UNKNOWN);
        pooVar.x(1);
        pooVar.z(1);
        pooVar.o(0L);
        pooVar.n(0L);
        pooVar.i(0L);
        pooVar.h(0L);
        pooVar.f(0L);
        pooVar.A("chime_default_group");
        pooVar.m(0L);
        List list = Collections.EMPTY_LIST;
        list.getClass();
        pooVar.p(list);
        List list2 = Collections.EMPTY_LIST;
        list2.getClass();
        pooVar.b(list2);
        pooVar.y(1);
        aigj aigjVar = aigj.d;
        aigjVar.getClass();
        pooVar.r(aigjVar);
        Set set = Collections.EMPTY_SET;
        set.getClass();
        pooVar.j(set);
        pooVar.u(aies.a);
        pooVar.v(0L);
        pooVar.q(null);
        aids aidsVar = aids.a;
        aidsVar.getClass();
        pooVar.e(aidsVar);
        Set set2 = Collections.EMPTY_SET;
        set2.getClass();
        pooVar.d(set2);
        Set set3 = Collections.EMPTY_SET;
        set3.getClass();
        pooVar.k(set3);
        return pooVar;
    }

    public static final List b(List list) {
        ArrayList arrayList = new ArrayList(atqq.N(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(nxh.a((pot) it.next()));
        }
        return arrayList;
    }

    public static final pot c(aiec aiecVar) {
        long jD;
        Iterable iterable;
        aiecVar.getClass();
        poo pooVarA = a();
        String str = aiecVar.e;
        str.getClass();
        pooVarA.l(str);
        aifd aifdVar = aiecVar.h;
        if (aifdVar == null) {
            aifdVar = aifd.a;
        }
        int iB = aiep.b(aifdVar.b);
        if (iB == 0) {
            iB = aiep.a;
        }
        pooVarA.B(iB);
        aifd aifdVar2 = aiecVar.h;
        if (aifdVar2 == null) {
            aifdVar2 = aifd.a;
        }
        aidu aiduVarA = aidu.a(aifdVar2.c);
        if (aiduVarA == null) {
            aiduVarA = aidu.DELETION_STATUS_UNKNOWN;
        }
        pooVarA.g(aiduVarA);
        aifd aifdVar3 = aiecVar.h;
        if (aifdVar3 == null) {
            aifdVar3 = aifd.a;
        }
        int iAS = a.aS(aifdVar3.d);
        if (iAS == 0) {
            iAS = 1;
        }
        pooVarA.x(iAS);
        aifd aifdVar4 = aiecVar.h;
        if (aifdVar4 == null) {
            aifdVar4 = aifd.a;
        }
        int iAS2 = a.aS(aifdVar4.e);
        if (iAS2 == 0) {
            iAS2 = 1;
        }
        pooVarA.z(iAS2);
        pooVarA.o(aiecVar.j);
        pooVarA.n(aiecVar.k);
        aidq aidqVar = aiecVar.c == 12 ? (aidq) aiecVar.d : aidq.a;
        aidqVar.getClass();
        pooVarA.c(aidqVar);
        aiie aiieVar = aiecVar.i;
        aiieVar.getClass();
        pooVarA.p(aiieVar);
        pooVarA.f(aiecVar.g);
        pooVarA.t(aiecVar.m);
        aifv aifvVar = aiecVar.n;
        if (aifvVar == null) {
            aifvVar = aifv.a;
        }
        pooVarA.s(aifvVar);
        pooVarA.w(aiecVar.o);
        pooVarA.i(aiecVar.p);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aigu aiguVar = aiecVar.q;
        if (aiguVar == null) {
            aiguVar = aigu.a;
        }
        pooVarA.h(timeUnit.toMillis(aiguVar.b));
        aies aiesVar = aiecVar.l;
        if (aiesVar == null) {
            aiesVar = aies.a;
        }
        pooVarA.u(aiesVar);
        int iAS3 = a.aS(aiecVar.r);
        pooVarA.y(iAS3 != 0 ? iAS3 : 1);
        aifh aifhVar = aiecVar.s;
        if (aifhVar == null) {
            aifhVar = aifh.a;
        }
        pooVarA.a = aifhVar;
        pooVarA.b |= 8388608;
        aigj aigjVar = aiecVar.t;
        aigjVar.getClass();
        pooVarA.r(aigjVar);
        if ((aiecVar.b & 8388608) != 0) {
            aijp aijpVar = aiecVar.v;
            if (aijpVar == null) {
                aijpVar = aijp.a;
            }
            aikz.d(aijpVar);
            jD = a.d(aext.w(aijpVar.b, 1000000L), aijpVar.c / 1000);
        } else {
            jD = 0;
        }
        pooVarA.v(jD);
        pooVarA.q(aiecVar.f);
        aids aidsVar = aiecVar.y;
        if (aidsVar == null) {
            aidsVar = aids.a;
        }
        aidsVar.getClass();
        pooVarA.e(aidsVar);
        aiie aiieVar2 = aiecVar.w;
        aiieVar2.getClass();
        ArrayList arrayList = new ArrayList(atqq.N(aiieVar2, 10));
        Iterator<E> it = aiieVar2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((aidz) it.next()).b));
        }
        pooVarA.d(atqq.aw(arrayList));
        aiie aiieVar3 = aiecVar.x;
        aiieVar3.getClass();
        ArrayList arrayList2 = new ArrayList(atqq.N(aiieVar3, 10));
        Iterator<E> it2 = aiieVar3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((aiea) it2.next()).b));
        }
        pooVarA.k(atqq.aw(arrayList2));
        String str2 = (aiecVar.c == 12 ? (aidq) aiecVar.d : aidq.a).n;
        str2.getClass();
        if (str2.length() > 0) {
            String str3 = (aiecVar.c == 12 ? (aidq) aiecVar.d : aidq.a).n;
            str3.getClass();
            pooVarA.A(str3);
        }
        aidq aidqVar2 = aiecVar.c == 12 ? (aidq) aiecVar.d : aidq.a;
        aiie aiieVar4 = (aidqVar2.c == 7 ? (aidg) aidqVar2.d : aidg.a).e;
        aiieVar4.getClass();
        if (aiieVar4.isEmpty()) {
            aidq aidqVar3 = aiecVar.c == 12 ? (aidq) aiecVar.d : aidq.a;
            aiie aiieVar5 = (aidqVar3.c == 27 ? (aidn) aidqVar3.d : aidn.a).f;
            aiieVar5.getClass();
            if (aiieVar5.isEmpty()) {
                aidq aidqVar4 = aiecVar.c == 12 ? (aidq) aiecVar.d : aidq.a;
                aiie aiieVar6 = (aidqVar4.c == 29 ? (aidb) aidqVar4.d : aidb.a).f;
                aiieVar6.getClass();
                if (aiieVar6.isEmpty()) {
                    iterable = awno.a;
                } else {
                    aidq aidqVar5 = aiecVar.c == 12 ? (aidq) aiecVar.d : aidq.a;
                    iterable = (aidqVar5.c == 29 ? (aidb) aidqVar5.d : aidb.a).f;
                    iterable.getClass();
                }
            } else {
                aidq aidqVar6 = aiecVar.c == 12 ? (aidq) aiecVar.d : aidq.a;
                iterable = (aidqVar6.c == 27 ? (aidn) aidqVar6.d : aidn.a).f;
                iterable.getClass();
            }
        } else {
            aidq aidqVar7 = aiecVar.c == 12 ? (aidq) aiecVar.d : aidq.a;
            iterable = (aidqVar7.c == 7 ? (aidg) aidqVar7.d : aidg.a).e;
            iterable.getClass();
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = iterable.iterator();
        while (it3.hasNext()) {
            pos posVar = (pos) pos.a((aicf) it3.next()).f();
            if (posVar != null) {
                arrayList3.add(posVar);
            }
        }
        pooVarA.b(arrayList3);
        aihv aihvVar = aiecVar.u;
        aihvVar.getClass();
        if (!aihvVar.isEmpty()) {
            aihv aihvVar2 = aiecVar.u;
            aihvVar2.getClass();
            pooVarA.j(atqq.aw(aihvVar2));
        }
        return pooVarA.a();
    }
}
