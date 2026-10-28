package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acnp implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public acnp(adtj adtjVar, acjx acjxVar, int i) {
        this.$cid = i;
        this.a = acjxVar;
        this.b = adtjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v34, types: [avlc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [acjx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [acjx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r13v13, types: [avmn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v28, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r13v60, types: [java.lang.Object, qnx] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                acoi acoiVar = (acoi) this.a;
                acoiVar.T = false;
                acoiVar.z.g(false);
                int i = acoiVar.U;
                if (i != 0) {
                    acoiVar.z.e(i);
                    acoiVar.U = 0;
                }
                this.b.run();
                acoiVar.V = null;
                break;
            case 1:
                acig acigVar = (acig) this.b;
                if (this.a == acigVar.e) {
                    acigVar.e = null;
                    acigVar.h = null;
                    acigVar.b();
                }
                break;
            case 2:
                acoi acoiVar2 = (acoi) this.a;
                if (acoiVar2.getView() != null) {
                    alqc alqcVar = (alqc) this.b;
                    if (alqcVar.A.isEmpty()) {
                        acoiVar2.bV.b();
                    } else {
                        apji apjiVar = (apji) alqcVar.A.get(0);
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(apdl.a);
                        apjiVar.c(aihlVarCheckIsLite);
                        if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apdl.a);
                            apjiVar.c(aihlVarCheckIsLite2);
                            Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                            apdk apdkVar = (apdk) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                            if ((apdkVar.b & 2) != 0) {
                                aetm aetmVar = acoiVar2.bV;
                                aqpq aqpqVar = apdkVar.d;
                                if (aqpqVar == null) {
                                    aqpqVar = aqpq.a;
                                }
                                aetmVar.c(aqpqVar);
                            }
                        }
                    }
                    if (alqcVar.z.isEmpty()) {
                        acoiVar2.bW.a();
                    } else {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = alqcVar.z.iterator();
                        while (it.hasNext()) {
                            aqpq aqpqVar2 = ((apzr) it.next()).b;
                            if (aqpqVar2 == null) {
                                aqpqVar2 = aqpq.a;
                            }
                            arrayList.add(aqpqVar2);
                        }
                        acoiVar2.bW.b(arrayList);
                    }
                }
                break;
            case 3:
                acoi acoiVar3 = ((acoa) this.a).b;
                if (acoiVar3.isAdded()) {
                    acoiVar3.W((ajwo) this.b);
                }
                break;
            case 4:
                ((acph) this.a).d((apfp) this.b);
                break;
            case 5:
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    ((acsv) this.a).e((ajwo) it2.next());
                }
                break;
            case 6:
                ((acqz) this.a).r.h(this.b);
                break;
            case 7:
                ((acrs) this.b).Q((acra) this.a);
                break;
            case 8:
                ((acrv) this.a).a.a(this.b);
                break;
            case 9:
                ((acrv) this.b).a.jj((toe) this.a);
                break;
            case 10:
                ((acrw) this.a).f((alqc) this.b);
                break;
            case 11:
                int i2 = aczo.g;
                oso osoVar = (oso) this.b;
                ViewParent parent = osoVar.a().getParent();
                Object obj = this.a;
                if (parent != obj) {
                    ViewGroup viewGroup = (ViewGroup) obj;
                    viewGroup.removeAllViews();
                    viewGroup.addView(osoVar.a());
                }
                break;
            case 12:
                nze nzeVar = (nze) ((qcb) this.a).a;
                Supplier supplier = nzeVar.d;
                long jB = ((abfv) this.b).a.b();
                nzeVar.b(aslg.DEBUG_COUNTER_TYPE_JS_CONTROLLER_CREATE_DISPOSE_COUNT, ((Integer) supplier.get()).intValue());
                nzeVar.b(aslg.DEBUG_COUNTER_TYPE_JS_CONTROLLER_CREATE_COUNT, ((Integer) nzeVar.e.get()).intValue());
                nzeVar.b(aslg.DEBUG_COUNTER_TYPE_JS_CONTROLLER_DISPOSE_COUNT, ((Integer) nzeVar.f.get()).intValue());
                nzeVar.b(aslg.DEBUG_COUNTER_TYPE_DJINNI_JNI_GLOBAL_REF_COUNT, ((Integer) nzeVar.g.get()).intValue());
                if (jB - nzeVar.h >= nzeVar.b) {
                    EnumMap enumMap = nzeVar.c;
                    if (!enumMap.isEmpty()) {
                        Object obj2 = nzeVar.a.get();
                        agke<nzd> agkeVarN = agke.n(enumMap.values());
                        aihf aihfVarCreateBuilder = akrz.a.createBuilder();
                        for (nzd nzdVar : agkeVarN) {
                            aihf aihfVarCreateBuilder2 = akry.a.createBuilder();
                            Object obj3 = nzdVar.d;
                            aihfVarCreateBuilder2.copyOnWrite();
                            akry akryVar = (akry) aihfVarCreateBuilder2.instance;
                            akryVar.c = ((aslg) obj3).f;
                            akryVar.b |= 1;
                            long j = nzdVar.a;
                            aihfVarCreateBuilder2.copyOnWrite();
                            akry akryVar2 = (akry) aihfVarCreateBuilder2.instance;
                            akryVar2.b |= 2;
                            akryVar2.d = j;
                            long j2 = nzdVar.b;
                            aihfVarCreateBuilder2.copyOnWrite();
                            akry akryVar3 = (akry) aihfVarCreateBuilder2.instance;
                            akryVar3.b |= 4;
                            akryVar3.e = j2;
                            long j3 = nzdVar.c;
                            aihfVarCreateBuilder2.copyOnWrite();
                            akry akryVar4 = (akry) aihfVarCreateBuilder2.instance;
                            akryVar4.b |= 8;
                            akryVar4.f = j3;
                            akry akryVar5 = (akry) aihfVarCreateBuilder2.build();
                            aihfVarCreateBuilder.copyOnWrite();
                            akrz akrzVar = (akrz) aihfVarCreateBuilder.instance;
                            akryVar5.getClass();
                            aiie aiieVar = akrzVar.b;
                            if (!aiieVar.c()) {
                                akrzVar.b = aihn.mutableCopy(aiieVar);
                            }
                            akrzVar.b.add(akryVar5);
                        }
                        xeu xeuVar = (xeu) ((ci) obj2).a;
                        if (xeuVar.b) {
                            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.ELEMENTS_DEBUG_COUNTERS);
                            ztf ztfVar = xffVarA.k.e;
                            xffVarA.l = ztfVar.a();
                            ztfVar.k(xffVarA);
                        } else {
                            alos alosVar = (alos) alou.a.createBuilder();
                            alosVar.copyOnWrite();
                            alou alouVar = (alou) alosVar.instance;
                            akrz akrzVar2 = (akrz) aihfVarCreateBuilder.build();
                            akrzVar2.getClass();
                            alouVar.d = akrzVar2;
                            alouVar.c = 470;
                            xeuVar.b((alou) alosVar.build());
                        }
                        enumMap.clear();
                    }
                    nzeVar.h = jB;
                }
                break;
            case 13:
                ((adbr) this.b).a((adbp) this.a);
                break;
            case 14:
                ((avlb) this.a).kp(this.b);
                break;
            case 15:
                ((adnd) this.b).a((oh) this.a);
                break;
            case 16:
                ((adnd) this.b).a((oh) this.a);
                break;
            case 17:
                adtn adtnVarA = adto.a(((aciz) this.a).b);
                adtnVarA.f = new adtl(true);
                ((adtv) this.b).aK(adtnVarA.a());
                break;
            case 18:
                adtn adtnVarA2 = adto.a(this.a);
                adtnVarA2.f = new adtl(true);
                ((adtj) this.b).c.aK(adtnVarA2.a());
                break;
            case 19:
                ((adwg) this.a).az.a = true;
                Runnable runnableC = ((aecu) this.b).c();
                if (runnableC != null) {
                    runnableC.run();
                }
                break;
            default:
                ((adys) ((adyt) this.b).h.a).j(this.a);
                break;
        }
    }

    public /* synthetic */ acnp(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ acnp(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
