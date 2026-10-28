package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pdk {
    private static final agsn a = agsn.h("GnpSdk");
    private final pfk b;
    private final qbi c;
    private final aunn d;
    private final pdl e;
    private final ppw f;

    public pdk(pfk pfkVar, qbi qbiVar, aunn aunnVar, pdl pdlVar, ppw ppwVar) {
        pfkVar.getClass();
        qbiVar.getClass();
        aunnVar.getClass();
        this.b = pfkVar;
        this.c = qbiVar;
        this.d = aunnVar;
        this.e = pdlVar;
        this.f = ppwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r6v5 */
    static /* synthetic */ Object b(pdk pdkVar, plx plxVar, List list, awoq awoqVar) throws Throwable {
        pdh pdhVar;
        pdk pdkVar2;
        ?? it;
        if (awoqVar instanceof pdh) {
            pdhVar = (pdh) awoqVar;
            int i = pdhVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pdhVar.d = i - Integer.MIN_VALUE;
            } else {
                pdhVar = new pdh(pdkVar, awoqVar);
            }
        } else {
            pdhVar = new pdh(pdkVar, awoqVar);
        }
        Object obj = pdhVar.b;
        awox awoxVar = awox.a;
        int i2 = pdhVar.d;
        if (i2 == 0) {
            atqp.j(obj);
            if (!list.isEmpty()) {
                pdkVar.b.d(plxVar, list);
                ArrayList arrayList = new ArrayList(atqq.N(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new Integer(((pfj) it2.next()).b));
                }
                pdkVar2 = pdkVar;
                it = atqq.ah(arrayList).iterator();
            }
            return awmy.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Object obj2 = pdhVar.a;
        plxVar = pdhVar.f;
        pdkVar2 = pdhVar.e;
        atqp.j(obj);
        it = obj2;
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            pdhVar.e = pdkVar2;
            pdhVar.f = plxVar;
            pdhVar.a = it;
            pdhVar.d = 1;
            if (pdkVar2.a(plxVar, iIntValue, pdhVar) == awoxVar) {
                return awoxVar;
            }
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r6v3, types: [pfk] */
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
    static /* synthetic */ Object d(pdk pdkVar, plx plxVar, List list, long j, pax paxVar, boolean z, boolean z2, awoq awoqVar) throws Throwable {
        pdi pdiVar;
        ?? r1;
        if (awoqVar instanceof pdi) {
            pdiVar = (pdi) awoqVar;
            int i = pdiVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pdiVar.d = i - Integer.MIN_VALUE;
            } else {
                pdiVar = new pdi(pdkVar, awoqVar);
            }
        } else {
            pdiVar = new pdi(pdkVar, awoqVar);
        }
        Object objC = pdiVar.b;
        awox awoxVar = awox.a;
        int i2 = pdiVar.d;
        if (i2 == 0) {
            atqp.j(objC);
            if (list.isEmpty()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            Bundle bundle = new Bundle();
            nvi.b(bundle, plxVar);
            bundle.putLong("com.google.android.libraries.notifications.DELIVERED_TIMESTAMP", paxVar.a.longValue());
            bundle.putInt("com.google.android.libraries.notifications.MUTE_NOTIFICATION", z ? 1 : 0);
            bundle.putInt("com.google.android.libraries.notifications.FORCE_NOTIFICATION", z2 ? 1 : 0);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                pfj pfjVarA = pdkVar.b.a(plxVar, 5, ((aiec) it.next()).toByteArray());
                if (pfjVarA != null) {
                    arrayList.add(pfjVarA);
                }
            }
            pdiVar.e = pdkVar;
            pdiVar.f = plxVar;
            pdiVar.a = arrayList;
            pdiVar.d = 1;
            objC = pdkVar.c(plxVar, bundle, j, 5, pdiVar);
            if (objC == awoxVar) {
                return awoxVar;
            }
            r1 = arrayList;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj = pdiVar.a;
            plxVar = pdiVar.f;
            pdk pdkVar2 = pdiVar.e;
            atqp.j(objC);
            r1 = obj;
            pdkVar = pdkVar2;
        }
        if (((Boolean) objC).booleanValue()) {
            return r1;
        }
        pdkVar.b.d(plxVar, r1);
        return awno.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(plx plxVar, int i, awoq awoqVar) throws Throwable {
        pdg pdgVar;
        if (awoqVar instanceof pdg) {
            pdgVar = (pdg) awoqVar;
            int i2 = pdgVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pdgVar.c = i2 - Integer.MIN_VALUE;
            } else {
                pdgVar = new pdg(this, awoqVar);
            }
        } else {
            pdgVar = new pdg(this, awoqVar);
        }
        Object obj = pdgVar.a;
        awox awoxVar = awox.a;
        int i3 = pdgVar.c;
        try {
            if (i3 == 0) {
                atqp.j(obj);
                if (this.b.b(plxVar, i).isEmpty()) {
                    if (auum.e()) {
                        int i4 = i == 11 ? 19 : 5;
                        Object objIo = this.d.io();
                        objIo.getClass();
                        pdgVar.c = 1;
                        if (((ppy) objIo).a(i4, plxVar, null, pdgVar) == awoxVar) {
                            return awoxVar;
                        }
                    } else {
                        try {
                            this.c.a(plxVar, i);
                        } catch (qbg e) {
                            ((agsj) ((agsj) a.c()).j(e)).u("Unable to cancel tasks with jobId: [%d]", i);
                        }
                    }
                }
                return awmy.a;
            }
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        } catch (Exception e2) {
            ((agsj) ((agsj) a.c()).j(e2)).t("Failed to cancel scheduled GNP job for received notification");
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(plx plxVar, Bundle bundle, long j, int i, awoq awoqVar) throws Throwable {
        pdj pdjVar;
        if (awoqVar instanceof pdj) {
            pdjVar = (pdj) awoqVar;
            int i2 = pdjVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pdjVar.c = i2 - Integer.MIN_VALUE;
            } else {
                pdjVar = new pdj(this, awoqVar);
            }
        } else {
            pdjVar = new pdj(this, awoqVar);
        }
        pdj pdjVar2 = pdjVar;
        Object objA = pdjVar2.a;
        awox awoxVar = awox.a;
        int i3 = pdjVar2.c;
        boolean zI = true;
        if (i3 == 0) {
            atqp.j(objA);
            if (auum.e()) {
                ppw ppwVar = this.f;
                Object objIo = this.d.io();
                objIo.getClass();
                Long l = new Long(j + 1000);
                pdjVar2.c = 1;
                objA = nxk.a((ppy) objIo, ppwVar, plxVar, bundle, l, pdjVar2, 16);
                if (objA == awoxVar) {
                    return awoxVar;
                }
            } else {
                try {
                    this.c.c(plxVar, i, this.e, bundle, j + 1000);
                } catch (qbg unused) {
                    zI = false;
                }
            }
            return Boolean.valueOf(zI);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atqp.j(objA);
        pky pkyVar = (pky) objA;
        if (pkyVar instanceof pku) {
            ((pku) pkyVar).b();
        }
        zI = pkyVar.i();
        return Boolean.valueOf(zI);
    }
}
