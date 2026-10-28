package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qbq extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    Object a;
    int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbq(hub hubVar, String str, htr htrVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = hubVar;
        this.c = str;
        this.e = htrVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, pxk] */
    /* JADX WARN: Type inference failed for: r3v2, types: [htr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        int i = this.$cid;
        if (i == 0) {
            return new qbq((List) this.c, (qbs) this.d, (plx) this.e, awoqVar, 0);
        }
        if (i == 1) {
            Object obj2 = this.d;
            return new qbq((hub) obj2, (String) this.c, (htr) this.e, awoqVar, 1);
        }
        if (i == 2) {
            return new qbq((qbs) this.d, (pxk) this.e, (List) this.c, awoqVar, 2);
        }
        return new qbq((Map) this.c, (ujb) this.e, (ujc) this.d, awoqVar, 3);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((qbq) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 1) {
            return ((qbq) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i != 2) {
            return ((qbq) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((qbq) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e4 A[LOOP:0: B:59:0x01de->B:61:0x01e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x0201  */
    /* JADX WARN: Code duplicated, block: B:70:0x021c  */
    /* JADX WARN: Code duplicated, block: B:75:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.Object, pxk] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v16, types: [paw] */
    /* JADX WARN: Type inference failed for: r1v21, types: [qbs] */
    /* JADX WARN: Type inference failed for: r2v17, types: [qbs] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v10, types: [htr, java.lang.Object] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r0;
        ?? r12;
        ArrayList arrayList;
        agqs agqsVarListIterator;
        ArrayList arrayList2;
        agqs agqsVarListIterator2;
        agke agkeVarT;
        Object next;
        weh wehVar;
        hcg hcgVar;
        Object objAd;
        hcg hcgVar2;
        Object obj2;
        ?? r11;
        int i = this.$cid;
        if (i == 0) {
            awox awoxVar = awox.a;
            if (this.b == 0) {
                atqp.j(obj);
                String[] strArr = (String[]) this.c.toArray(new String[0]);
                Object obj3 = this.d;
                qbs qbsVar = (qbs) obj3;
                plx plxVar = (plx) this.e;
                agke agkeVarR = qbsVar.g.r(plxVar, (String[]) Arrays.copyOf(strArr, strArr.length));
                agkeVarR.getClass();
                if (!agkeVarR.isEmpty()) {
                    pct pctVar = qbsVar.c;
                    pbe pbeVarA = pbf.a();
                    pbeVarA.f = 4;
                    pbeVarA.e(1);
                    pbeVarA.a = "com.google.android.libraries.notifications.NOTIFICATION_DISMISSED";
                    pbeVarA.b = plxVar;
                    pbeVarA.f(agkeVarR);
                    aihf aihfVarCreateBuilder = aiff.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    aiff aiffVar = (aiff) aihfVarCreateBuilder.instance;
                    aiffVar.f = 2;
                    aiffVar.b |= 8;
                    aihfVarCreateBuilder.copyOnWrite();
                    aiff aiffVar2 = (aiff) aihfVarCreateBuilder.instance;
                    aiffVar2.e = 2;
                    aiffVar2.b |= 4;
                    pbeVarA.d((aiff) aihfVarCreateBuilder.build());
                    xyg xygVar = new xyg();
                    xygVar.d(ahza.DISMISSED_BY_API);
                    pbeVarA.e = xygVar.c();
                    pbf pbfVarA = pbeVarA.a();
                    this.a = agkeVarR;
                    this.b = 1;
                    if (pctVar.a(pbfVarA, this) == awoxVar) {
                        r12 = agkeVarR;
                        return awoxVar;
                    }
                    r12 = agkeVarR;
                    r0 = agkeVarR;
                }
                r12 = agkeVarR;
                Object obj4 = this.c;
                arrayList = new ArrayList(atqq.N(r12, 10));
                agqsVarListIterator = ((agke) r12).listIterator(0);
                while (agqsVarListIterator.hasNext()) {
                    arrayList.add(((pot) agqsVarListIterator.next()).a);
                }
                arrayList2 = new ArrayList();
                agqsVarListIterator2 = ((agke) obj4).listIterator(0);
                while (agqsVarListIterator2.hasNext()) {
                    next = agqsVarListIterator2.next();
                    if (!arrayList.contains((String) next)) {
                        arrayList2.add(next);
                    }
                }
                agkeVarT = aguu.T(arrayList2);
                if (!agkeVarT.isEmpty()) {
                    ((agsj) qbs.a.c()).w("Notifications can't be removed as they are not in storage [%s]", agkeVarT);
                }
                return awmy.a;
            }
            Object obj5 = this.a;
            atqp.j(obj);
            r0 = obj5;
            qbs qbsVar2 = (qbs) this.d;
            ?? B = qbsVar2.d.b(ahzv.DISMISSED_BY_API);
            B.f((plx) this.e);
            r0.getClass();
            B.c(r0);
            B.a();
            qbsVar2.g(pqf.C);
            r12 = r0;
            r12 = agkeVarR;
            Object obj6 = this.c;
            arrayList = new ArrayList(atqq.N(r12, 10));
            agqsVarListIterator = ((agke) r12).listIterator(0);
            while (agqsVarListIterator.hasNext()) {
                arrayList.add(((pot) agqsVarListIterator.next()).a);
            }
            arrayList2 = new ArrayList();
            agqsVarListIterator2 = ((agke) obj6).listIterator(0);
            while (agqsVarListIterator2.hasNext()) {
                next = agqsVarListIterator2.next();
                if (!arrayList.contains((String) next)) {
                    arrayList2.add(next);
                }
            }
            agkeVarT = aguu.T(arrayList2);
            if (!agkeVarT.isEmpty()) {
                ((agsj) qbs.a.c()).w("Notifications can't be removed as they are not in storage [%s]", agkeVarT);
            }
            return awmy.a;
        }
        if (i != 1) {
            if (i != 2) {
                awox awoxVar2 = awox.a;
                if (this.b != 0) {
                    Object obj7 = this.a;
                    atqp.j(obj);
                    r11 = obj7;
                } else {
                    atqp.j(obj);
                    Object obj8 = this.c;
                    Object obj9 = this.e;
                    Object obj10 = this.d;
                    this.a = obj8;
                    this.b = 1;
                    Object objB = ((ujb) obj9).b((ujc) obj10, this);
                    if (objB == awoxVar2) {
                        return awoxVar2;
                    }
                    obj = objB;
                    r11 = obj8;
                }
                r11.putAll((Map) obj);
                return awmy.a;
            }
            awox awoxVar3 = awox.a;
            int i2 = this.b;
            if (i2 != 0) {
                if (i2 != 1) {
                    atqp.j(obj);
                } else {
                    obj2 = this.a;
                    atqp.j(obj);
                }
                return awmy.a;
            }
            atqp.j(obj);
            obj2 = this.d;
            ?? r13 = this.e;
            this.a = obj2;
            this.b = 1;
            obj = ((qbs) obj2).e(r13, this);
            if (obj == awoxVar3) {
                return awoxVar3;
            }
            ?? r2 = this.c;
            this.a = null;
            this.b = 2;
            if (((qbs) obj2).f((plx) obj, r2, this) == awoxVar3) {
                return awoxVar3;
            }
            return awmy.a;
        }
        awox awoxVar4 = awox.a;
        int i3 = this.b;
        if (i3 != 0) {
            if (i3 == 1) {
                atqp.j(obj);
            } else if (i3 == 2) {
                wehVar = (weh) this.a;
                atqp.j(obj);
                obj.getClass();
                hcgVar = (hcg) awrc.f((Optional) obj);
                ListenableFuture listenableFutureH = ((hub) this.d).d.h(wehVar);
                this.a = hcgVar;
                this.b = 3;
                objAd = awrc.ad(listenableFutureH, this);
                if (objAd != awoxVar4) {
                    return awoxVar4;
                }
                hcgVar2 = hcgVar;
                obj = objAd;
                obj.getClass();
                this.a = null;
                this.b = 4;
                if (this.e.a(hcgVar2, (hte) obj, this) == awoxVar4) {
                    return awoxVar4;
                }
            } else if (i3 != 3) {
                atqp.j(obj);
            } else {
                hcgVar2 = (hcg) this.a;
                atqp.j(obj);
                obj.getClass();
                this.a = null;
                this.b = 4;
                if (this.e.a(hcgVar2, (hte) obj, this) == awoxVar4) {
                    return awoxVar4;
                }
            }
            return awmy.a;
        }
        atqp.j(obj);
        ListenableFuture listenableFutureK = hpb.k(((hub) this.d).b, (String) this.c, false);
        this.b = 1;
        obj = awrc.ad(listenableFutureK, this);
        if (obj == awoxVar4) {
            return awoxVar4;
        }
        obj.getClass();
        weh wehVar2 = (weh) awrc.f((Optional) obj);
        if (wehVar2 != null) {
            ListenableFuture listenableFutureI = ((hub) this.d).d.i((String) this.c, false);
            this.a = wehVar2;
            this.b = 2;
            Object objAd2 = awrc.ad(listenableFutureI, this);
            if (objAd2 == awoxVar4) {
                return awoxVar4;
            }
            wehVar = wehVar2;
            obj = objAd2;
            obj.getClass();
            hcgVar = (hcg) awrc.f((Optional) obj);
            ListenableFuture listenableFutureH2 = ((hub) this.d).d.h(wehVar);
            this.a = hcgVar;
            this.b = 3;
            objAd = awrc.ad(listenableFutureH2, this);
            if (objAd != awoxVar4) {
                return awoxVar4;
            }
            hcgVar2 = hcgVar;
            obj = objAd;
            obj.getClass();
            this.a = null;
            this.b = 4;
            if (this.e.a(hcgVar2, (hte) obj, this) == awoxVar4) {
                return awoxVar4;
            }
        }
        return awmy.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbq(List list, qbs qbsVar, plx plxVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = list;
        this.d = qbsVar;
        this.e = plxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbq(Map map, ujb ujbVar, ujc ujcVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = map;
        this.e = ujbVar;
        this.d = ujcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbq(qbs qbsVar, pxk pxkVar, List list, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = qbsVar;
        this.e = pxkVar;
        this.c = list;
    }
}
