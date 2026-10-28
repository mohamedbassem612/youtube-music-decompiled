package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vht extends awpk implements awqk {
    Object a;
    Object b;
    int c;
    final /* synthetic */ vhu d;
    final /* synthetic */ List e;
    final /* synthetic */ auhs f;
    final /* synthetic */ List g;
    final /* synthetic */ List h;
    final /* synthetic */ usd i;
    final /* synthetic */ vfs j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vht(vhu vhuVar, List list, auhs auhsVar, List list2, List list3, usd usdVar, vfs vfsVar, awoq awoqVar) {
        super(2, awoqVar);
        this.d = vhuVar;
        this.e = list;
        this.f = auhsVar;
        this.g = list2;
        this.h = list3;
        this.i = usdVar;
        this.j = vfsVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new vht(this.d, this.e, this.f, this.g, this.h, this.i, this.j, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((vht) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Object objB;
        Object obj3;
        List list;
        Object objC;
        ?? r0;
        ?? r1;
        List listAj;
        awox awoxVar = awox.a;
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                atqp.j(obj);
                obj2 = (List) obj;
                if (obj2 == null) {
                }
                vhu vhuVar = this.d;
                List list2 = this.e;
                this.a = obj2;
                this.c = 2;
                objB = vhuVar.b(list2, this);
                if (objB != awoxVar) {
                    return awoxVar;
                }
                obj3 = obj2;
                obj = objB;
                vhu vhuVar2 = this.d;
                List list3 = this.g;
                List list4 = this.h;
                list = (List) obj;
                this.a = obj3;
                this.b = list;
                this.c = 3;
                objC = vhuVar2.c(list3, list4, this);
                if (objC == awoxVar) {
                    return awoxVar;
                }
                r0 = list;
                obj = objC;
                r1 = obj3;
            } else if (i != 2) {
                Object obj4 = this.b;
                Object obj5 = this.a;
                atqp.j(obj);
                r0 = obj4;
                r1 = obj5;
            } else {
                Object obj6 = this.a;
                atqp.j(obj);
                obj3 = obj6;
                vhu vhuVar3 = this.d;
                List list5 = this.g;
                List list6 = this.h;
                list = (List) obj;
                this.a = obj3;
                this.b = list;
                this.c = 3;
                objC = vhuVar3.c(list5, list6, this);
                if (objC == awoxVar) {
                    return awoxVar;
                }
                r0 = list;
                obj = objC;
                r1 = obj3;
            }
            listAj = atqq.aj(atqq.aj(r1, r0), (List) obj);
            if (!listAj.isEmpty()) {
                vhu vhuVar4 = this.d;
                vhuVar4.c.execute(afwl.i(new mrh(this.i, listAj, this.j, vhuVar4, 17)));
            }
            return awmy.a;
        }
        atqp.j(obj);
        obj2 = awno.a;
        vhu vhuVar5 = this.d;
        List list7 = this.e;
        this.a = obj2;
        this.c = 2;
        objB = vhuVar5.b(list7, this);
        if (objB != awoxVar) {
            return awoxVar;
        }
        obj3 = obj2;
        obj = objB;
        vhu vhuVar6 = this.d;
        List list8 = this.g;
        List list9 = this.h;
        list = (List) obj;
        this.a = obj3;
        this.b = list;
        this.c = 3;
        objC = vhuVar6.c(list8, list9, this);
        if (objC == awoxVar) {
            return awoxVar;
        }
        r0 = list;
        obj = objC;
        r1 = obj3;
        listAj = atqq.aj(atqq.aj(r1, r0), (List) obj);
        if (!listAj.isEmpty()) {
            vhu vhuVar7 = this.d;
            vhuVar7.c.execute(afwl.i(new mrh(this.i, listAj, this.j, vhuVar7, 17)));
        }
        return awmy.a;
    }
}
