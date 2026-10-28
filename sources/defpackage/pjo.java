package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pjo extends awpk implements awqg {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    int f;
    final /* synthetic */ List g;
    final /* synthetic */ List h;
    final /* synthetic */ plx i;
    final /* synthetic */ pjv j;
    final /* synthetic */ pbh k;
    final /* synthetic */ pax l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjo(List list, List list2, plx plxVar, pjv pjvVar, pbh pbhVar, pax paxVar, awoq awoqVar) {
        super(1, awoqVar);
        this.g = list;
        this.h = list2;
        this.i = plxVar;
        this.j = pjvVar;
        this.k = pbhVar;
        this.l = paxVar;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new pjo(this.g, this.h, this.i, this.j, this.k, this.l, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((pjo) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:32:0x010c A[LOOP:0: B:28:0x00de->B:32:0x010c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        String[] strArr;
        Object obj2;
        Iterator it;
        pjv pjvVar;
        Object obj3;
        plx plxVar;
        ?? it2;
        pjv pjvVar2;
        Object obj4;
        pjo pjoVar;
        List list;
        pjv pjvVar3;
        plx plxVar2;
        pbh pbhVar;
        String str;
        String strE;
        pjo pjoVar2;
        awox awoxVar = awox.a;
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                it = (Iterator) this.c;
                strArr = (String[]) this.b;
                Object obj5 = this.a;
                atqp.j(obj);
                obj2 = obj5;
            } else if (i != 2) {
                atqp.j(obj);
                pjoVar = this;
            } else {
                Object obj6 = this.e;
                obj3 = this.d;
                plx plxVar3 = (plx) this.c;
                pjvVar = (pjv) this.b;
                obj2 = this.a;
                atqp.j(obj);
                plxVar = plxVar3;
                it2 = obj6;
                pjvVar2 = pjvVar;
                obj4 = obj2;
                while (it2.hasNext()) {
                    str = (String) it2.next();
                    strE = pjx.e((pcu) obj4, str);
                    this.a = obj4;
                    this.b = pjvVar2;
                    this.c = plxVar;
                    this.d = obj3;
                    this.e = it2;
                    this.f = 2;
                    agsn agsnVar = pjv.a;
                    pjoVar2 = this;
                    if (pjvVar2.r(strE, str, plxVar, null, null, (pax) obj3, pjoVar2) != awoxVar) {
                        return awoxVar;
                    }
                    this = pjoVar2;
                }
                pjoVar = this;
                list = pjoVar.h;
                if (!list.isEmpty() && (pbhVar = pjoVar.k) != null) {
                    pjv pjvVar4 = pjoVar.j;
                    plx plxVar4 = pjoVar.i;
                    pax paxVar = pjoVar.l;
                    agsn agsnVar2 = pjv.a;
                    pjvVar4.q(plxVar4, list, pbhVar, paxVar);
                }
                pjvVar3 = pjoVar.j;
                plxVar2 = pjoVar.i;
                pjoVar.a = null;
                pjoVar.b = null;
                pjoVar.c = null;
                pjoVar.d = null;
                pjoVar.e = null;
                pjoVar.f = 3;
                agsn agsnVar3 = pjv.a;
                if (pjvVar3.e(plxVar2, list, pjoVar) == awoxVar) {
                    return awoxVar;
                }
            }
            agsn agsnVar4 = pjv.a;
            return pjoVar.h;
        }
        atqp.j(obj);
        List list2 = this.g;
        if (list2.isEmpty()) {
            agsn agsnVar5 = pjv.a;
            return this.h;
        }
        pcu pcuVarA = nvu.a(this.i);
        strArr = (String[]) list2.toArray(new String[0]);
        pjv pjvVar5 = this.j;
        agsn agsnVar6 = pjv.a;
        obj2 = pcuVarA;
        it = pjvVar5.h.E(pcuVarA, list2).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            pjw pjwVar = (pjw) entry.getValue();
            if (pjwVar == null) {
                agsn agsnVar7 = pjv.a;
            } else {
                pjv pjvVar6 = this.j;
                agsn agsnVar8 = pjv.a;
                this.a = obj2;
                this.b = strArr;
                this.c = it;
                this.f = 1;
                if (pjvVar6.k(pjvVar6.b, pjwVar, this) == awoxVar) {
                    return awoxVar;
                }
            }
        }
        pjvVar = this.j;
        agsn agsnVar9 = pjv.a;
        plx plxVar5 = this.i;
        pjvVar.g.s(plxVar5, (String[]) Arrays.copyOf(strArr, strArr.length));
        List list3 = this.h;
        ArrayList arrayList = new ArrayList(atqq.N(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList.add(((pot) it3.next()).q);
        }
        Set setAw = atqq.aw(arrayList);
        obj3 = this.l;
        plxVar = plxVar5;
        it2 = setAw.iterator();
        pjvVar2 = pjvVar;
        obj4 = obj2;
        while (it2.hasNext()) {
            str = (String) it2.next();
            strE = pjx.e((pcu) obj4, str);
            this.a = obj4;
            this.b = pjvVar2;
            this.c = plxVar;
            this.d = obj3;
            this.e = it2;
            this.f = 2;
            agsn agsnVar10 = pjv.a;
            pjoVar2 = this;
            if (pjvVar2.r(strE, str, plxVar, null, null, (pax) obj3, pjoVar2) != awoxVar) {
                return awoxVar;
            }
            this = pjoVar2;
        }
        pjoVar = this;
        list = pjoVar.h;
        if (!list.isEmpty()) {
            pjv pjvVar7 = pjoVar.j;
            plx plxVar6 = pjoVar.i;
            pax paxVar2 = pjoVar.l;
            agsn agsnVar11 = pjv.a;
            pjvVar7.q(plxVar6, list, pbhVar, paxVar2);
        }
        pjvVar3 = pjoVar.j;
        plxVar2 = pjoVar.i;
        pjoVar.a = null;
        pjoVar.b = null;
        pjoVar.c = null;
        pjoVar.d = null;
        pjoVar.e = null;
        pjoVar.f = 3;
        agsn agsnVar12 = pjv.a;
        if (pjvVar3.e(plxVar2, list, pjoVar) == awoxVar) {
            return awoxVar;
        }
        agsn agsnVar13 = pjv.a;
        return pjoVar.h;
    }
}
