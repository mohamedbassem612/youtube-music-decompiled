package defpackage;

import android.content.Context;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vhu {
    public final vfq a;
    public final awut b;
    public final Executor c;
    public boolean d;
    public final uyj e;
    private final Context f;
    private final ConcurrentHashMap g;
    private final ahgb h;

    public vhu(vfq vfqVar, Context context, ahgb ahgbVar, awut awutVar, Executor executor) {
        vfqVar.getClass();
        context.getClass();
        awutVar.getClass();
        executor.getClass();
        this.a = vfqVar;
        this.f = context;
        this.h = ahgbVar;
        this.b = awutVar;
        this.c = executor;
        this.g = new ConcurrentHashMap();
        this.e = new uyj(ahgbVar, context, Optional.empty());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(List list, awoq awoqVar) throws Throwable {
        vhr vhrVar;
        if (awoqVar instanceof vhr) {
            vhrVar = (vhr) awoqVar;
            int i = vhrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vhrVar.c = i - Integer.MIN_VALUE;
            } else {
                vhrVar = new vhr(this, awoqVar);
            }
        } else {
            vhrVar = new vhr(this, awoqVar);
        }
        Object objJ = vhrVar.a;
        awox awoxVar = awox.a;
        int i2 = vhrVar.c;
        if (i2 == 0) {
            atqp.j(objJ);
            List listAh = atqq.ah(list);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listAh) {
                if (!this.g.containsKey((String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                uzq uzqVar = new uzq(arrayList, this, (awoq) null, 2);
                vhrVar.c = 1;
                objJ = awrc.J(uzqVar, vhrVar);
                if (objJ == awoxVar) {
                    return awoxVar;
                }
            }
            return awmy.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atqp.j(objJ);
        this.g.putAll((Map) objJ);
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(List list, awoq awoqVar) throws Throwable {
        vhp vhpVar;
        if (awoqVar instanceof vhp) {
            vhpVar = (vhp) awoqVar;
            int i = vhpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vhpVar.c = i - Integer.MIN_VALUE;
            } else {
                vhpVar = new vhp(this, awoqVar);
            }
        } else {
            vhpVar = new vhp(this, awoqVar);
        }
        Object obj = vhpVar.a;
        Object obj2 = awox.a;
        int i2 = vhpVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            ArrayList arrayList = new ArrayList(atqq.N(list, 10));
            ArrayList<aufd> arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                aufd aufdVar = (aufd) obj3;
                if ((aufdVar.c == 5 ? (aufg) aufdVar.d : aufg.a).b != 1) {
                    aufg aufgVar = aufdVar.c == 5 ? (aufg) aufdVar.d : aufg.a;
                    String str = (aufgVar.b == 2 ? (aufm) aufgVar.c : aufm.a).b;
                    str.getClass();
                    if (str.length() > 0) {
                        arrayList2.add(obj3);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList(atqq.N(arrayList2, 10));
            for (aufd aufdVar2 : arrayList2) {
                aufg aufgVar2 = aufdVar2.c == 5 ? (aufg) aufdVar2.d : aufg.a;
                arrayList3.add((aufgVar2.b == 2 ? (aufm) aufgVar2.c : aufm.a).b);
            }
            List listAh = atqq.ah(arrayList3);
            vhpVar.c = 1;
            if (a(listAh, vhpVar) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        return new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [vhu] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public final Object c(List list, List list2, awoq awoqVar) throws Throwable {
        vhq vhqVar;
        ?? r6;
        if (awoqVar instanceof vhq) {
            vhqVar = (vhq) awoqVar;
            int i = vhqVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vhqVar.d = i - Integer.MIN_VALUE;
            } else {
                vhqVar = new vhq(this, awoqVar);
            }
        } else {
            vhqVar = new vhq(this, awoqVar);
        }
        Object obj = vhqVar.b;
        Object arrayList = awox.a;
        int i2 = vhqVar.d;
        if (i2 == 0) {
            atqp.j(obj);
            List listAh = atqq.ah(new ArrayList());
            vhqVar.e = (awno) list;
            vhqVar.a = list2;
            vhqVar.d = 1;
            if (a(listAh, vhqVar) != arrayList) {
            }
            r6 = list2;
            return arrayList;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Object obj2 = vhqVar.a;
        list = vhqVar.e;
        atqp.j(obj);
        r6 = obj2;
        r6 = list2;
        List<awml> listAs = atqq.as(list, r6);
        arrayList = new ArrayList();
        for (awml awmlVar : listAs) {
            auil auilVar = (auil) awmlVar.a;
            appb appbVar = (auilVar.b == 2 ? (auik) auilVar.c : auik.a).b;
            if (appbVar == null) {
                appbVar = appb.a;
            }
            akdx akdxVar = appbVar.f;
            if (akdxVar == null) {
                akdxVar = akdx.a;
            }
            akec akecVar = akdxVar.e;
            if (akecVar == null) {
                akecVar = akec.a;
            }
            String str = akecVar.c;
            str.getClass();
            twu.d("SkottieEffectsController", 6, a.bT(str, "Template composition asset with ID '", "' not found."), null);
        }
        r6 = list2;
        return arrayList;
    }
}
