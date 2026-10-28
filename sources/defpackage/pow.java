package defpackage;

import android.content.Context;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pow implements pou, kig {
    public static final agsn a = agsn.h("GnpSdk");
    public final pvg b;
    private final llq c;
    private final Set d;
    private final Set e;
    private final mbc f;
    private final awut g;
    private final awmd h;
    private final Context i;
    private final pls j;
    private final Set k;
    private final AtomicBoolean l;

    public pow(pvg pvgVar, llq llqVar, Set set, Set set2, mbc mbcVar, awut awutVar, awmd awmdVar, Context context, pls plsVar) {
        set.getClass();
        set2.getClass();
        mbcVar.getClass();
        awmdVar.getClass();
        context.getClass();
        plsVar.getClass();
        this.b = pvgVar;
        this.c = llqVar;
        this.d = set;
        this.e = set2;
        this.f = mbcVar;
        this.g = awutVar;
        this.h = awmdVar;
        this.i = context;
        this.j = plsVar;
        this.k = atqq.s(atqq.r(set, set2), "CHIME");
        this.l = new AtomicBoolean(false);
    }

    @Override // defpackage.kig
    public final kih a(kih kihVar) throws Throwable {
        String str;
        Object pkwVar;
        String str2;
        String str3;
        kihVar.getClass();
        String str4 = kihVar.h;
        if (str4 != null && this.k.contains(str4) && !((kii) kihVar.a).d() && (str = kihVar.g) != null) {
            Context context = this.i;
            pvg pvgVar = this.b;
            String packageName = context.getPackageName();
            List listH = atqq.H(ptj.BUSINESS_EXPERIMENT);
            pvz pvzVar = (pvz) pvgVar;
            Map map = (Map) pvzVar.d.get();
            if (map != null) {
                pkwVar = new pla(pvz.d(map, str, listH));
            } else {
                awuz awuzVarR = awro.r(pvzVar.c, awov.a, 1, new gme(pvzVar, str, listH, (awoq) null, 11));
                pkwVar = awuzVarR.kI() ? (pky) awuzVarR.f() : new pkw("Experiments are not available yet.", pkx.J);
            }
            if (pkwVar instanceof pla) {
                List list = (List) ((pla) pkwVar).a;
                ArrayList arrayList = new ArrayList(atqq.N(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((ptk) it.next()).c));
                }
                kihVar.j(atqq.az(arrayList));
                str2 = packageName;
                ((pwf) this.h.io()).i(str2, this.j.a, nxo.a(3), "SUCCESS", "");
            } else {
                str2 = packageName;
            }
            if (pkwVar instanceof pku) {
                pku pkuVar = (pku) pkwVar;
                boolean z = pkuVar instanceof pld;
                if (z) {
                    pkuVar.b();
                    nxp.a(str);
                    pkuVar.b().getMessage();
                    str3 = "";
                } else {
                    String simpleName = pkuVar.b().getClass().getSimpleName();
                    simpleName.getClass();
                    ((agsj) ((agsj) a.c()).j(pkuVar.b())).w("Could not retrieve experiments for account %s", nxp.a(str));
                    str3 = simpleName;
                }
                String str5 = true != z ? "FAILURE" : "TRANSIENT_FAILURE";
                ((pwf) this.h.io()).i(str2, this.j.a, nxo.a(3), str5, str3);
            }
        }
        return kihVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0120  */
    /* JADX WARN: Code duplicated, block: B:42:0x0128  */
    /* JADX WARN: Code duplicated, block: B:45:0x0142 A[LOOP:0: B:43:0x013c->B:45:0x0142, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x015a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0166 A[LOOP:1: B:49:0x0160->B:51:0x0166, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0198  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.pou
    public final Object b(String str, List list, List list2, awoq awoqVar) throws Throwable {
        pov povVar;
        String packageName;
        String str2;
        pky pkyVar;
        ArrayList arrayList;
        Iterator it;
        int[] iArrAz;
        Iterator it2;
        if (awoqVar instanceof pov) {
            povVar = (pov) awoqVar;
            int i = povVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                povVar.c = i - Integer.MIN_VALUE;
            } else {
                povVar = new pov(this, awoqVar);
            }
        } else {
            povVar = new pov(this, awoqVar);
        }
        Object objA = povVar.a;
        awox awoxVar = awox.a;
        int i2 = povVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                packageName = povVar.d;
                atqp.j(objA);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str3 = povVar.d;
                atqp.j(objA);
                str2 = str3;
            }
            pkyVar = (pky) objA;
            if (pkyVar instanceof pla) {
                List list3 = (List) ((pla) pkyVar).a;
                arrayList = new ArrayList(atqq.N(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Integer(((ptk) it.next()).c));
                }
                iArrAz = atqq.az(arrayList);
                if (iArrAz.length != 0) {
                    it2 = this.e.iterator();
                    while (it2.hasNext()) {
                        this.c.g(iArrAz, "GNP_NAMESPACE#".concat(String.valueOf(str2)), (String) it2.next());
                    }
                }
                ((pwf) this.h.io()).i(str2, this.j.a, nxo.a(3), "SUCCESS", "");
            }
            if (pkyVar instanceof pku) {
                pku pkuVar = (pku) pkyVar;
                ((agsj) ((agsj) a.c()).j(pkuVar.b())).t("Failed to get experiments, continue without setting external experiment IDs.");
                ((pwf) this.h.io()).i(str2, this.j.a, nxo.a(3), "FAILURE", pkuVar.b().getClass().getSimpleName());
            }
            return awmy.a;
        }
        atqp.j(objA);
        c();
        mbc mbcVar = this.f;
        Context context = this.i;
        Instant instantF = mbcVar.f();
        packageName = context.getPackageName();
        awoa awoaVar = new awoa(10);
        if (!list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(atqq.N(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                int iIntValue = ((Number) it3.next()).intValue();
                ptj ptjVar = ptj.BUSINESS_EXPERIMENT;
                instantF.getClass();
                arrayList2.add(new ptk(0, str, iIntValue, ptjVar, instantF, 3));
            }
            awoaVar.addAll(arrayList2);
        }
        if (!list2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(atqq.N(list2, 10));
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                int iIntValue2 = ((Number) it4.next()).intValue();
                ptj ptjVar2 = ptj.HEALTH_EXPERIMENT;
                instantF.getClass();
                arrayList3.add(new ptk(0, str, iIntValue2, ptjVar2, instantF, 3));
            }
            awoaVar.addAll(arrayList3);
        }
        List listF = awoaVar.f();
        if (!listF.isEmpty()) {
            pvg pvgVar = this.b;
            povVar.d = packageName;
            povVar.c = 1;
            pvz pvzVar = (pvz) pvgVar;
            objA = nxe.a(pvzVar.e, new pvv(pvzVar, listF, (awoq) null, 2), povVar);
            if (objA == awoxVar) {
                return awoxVar;
            }
        }
        pvg pvgVar2 = this.b;
        List listAL = atqq.aL(new ptj[]{ptj.HEALTH_EXPERIMENT, ptj.BUSINESS_EXPERIMENT});
        povVar.d = packageName;
        povVar.c = 2;
        objA = pvgVar2.a(listAL, povVar);
        if (objA != awoxVar) {
            return awoxVar;
        }
        str2 = packageName;
        pkyVar = (pky) objA;
        if (pkyVar instanceof pla) {
            List list4 = (List) ((pla) pkyVar).a;
            arrayList = new ArrayList(atqq.N(list4, 10));
            it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(new Integer(((ptk) it.next()).c));
            }
            iArrAz = atqq.az(arrayList);
            if (iArrAz.length != 0) {
                it2 = this.e.iterator();
                while (it2.hasNext()) {
                    this.c.g(iArrAz, "GNP_NAMESPACE#".concat(String.valueOf(str2)), (String) it2.next());
                }
            }
            ((pwf) this.h.io()).i(str2, this.j.a, nxo.a(3), "SUCCESS", "");
        }
        if (pkyVar instanceof pku) {
            pku pkuVar2 = (pku) pkyVar;
            ((agsj) ((agsj) a.c()).j(pkuVar2.b())).t("Failed to get experiments, continue without setting external experiment IDs.");
            ((pwf) this.h.io()).i(str2, this.j.a, nxo.a(3), "FAILURE", pkuVar2.b().getClass().getSimpleName());
        }
        return awmy.a;
        pky pkyVar2 = (pky) objA;
        if (pkyVar2 instanceof pku) {
            ((agsj) ((agsj) a.c()).j(((pku) pkyVar2).b())).t("Failed to insert experiments, continuing without setting external experiment IDs.");
        }
        pvg pvgVar3 = this.b;
        List listAL2 = atqq.aL(new ptj[]{ptj.HEALTH_EXPERIMENT, ptj.BUSINESS_EXPERIMENT});
        povVar.d = packageName;
        povVar.c = 2;
        objA = pvgVar3.a(listAL2, povVar);
        if (objA != awoxVar) {
            return awoxVar;
        }
        str2 = packageName;
        pkyVar = (pky) objA;
        if (pkyVar instanceof pla) {
            List list5 = (List) ((pla) pkyVar).a;
            arrayList = new ArrayList(atqq.N(list5, 10));
            it = list5.iterator();
            while (it.hasNext()) {
                arrayList.add(new Integer(((ptk) it.next()).c));
            }
            iArrAz = atqq.az(arrayList);
            if (iArrAz.length != 0) {
                it2 = this.e.iterator();
                while (it2.hasNext()) {
                    this.c.g(iArrAz, "GNP_NAMESPACE#".concat(String.valueOf(str2)), (String) it2.next());
                }
            }
            ((pwf) this.h.io()).i(str2, this.j.a, nxo.a(3), "SUCCESS", "");
        }
        if (pkyVar instanceof pku) {
            pku pkuVar3 = (pku) pkyVar;
            ((agsj) ((agsj) a.c()).j(pkuVar3.b())).t("Failed to get experiments, continue without setting external experiment IDs.");
            ((pwf) this.h.io()).i(str2, this.j.a, nxo.a(3), "FAILURE", pkuVar3.b().getClass().getSimpleName());
        }
        return awmy.a;
    }

    public final void c() {
        if (this.l.compareAndSet(false, true)) {
            kii.i(this);
            awro.t(this.g, null, 0, new dnz(this, (awoq) null, 8), 3);
        }
    }
}
