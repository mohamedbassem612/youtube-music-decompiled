package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pfh extends pff {
    private static final agsn d = agsn.h("GnpSdk");
    private final pdr e;
    private final pfk f;
    private final String g;

    public pfh(pdr pdrVar, pfk pfkVar) {
        pdrVar.getClass();
        pfkVar.getClass();
        this.e = pdrVar;
        this.f = pfkVar;
        this.g = "RPC_SET_USER_PREFERENCE";
    }

    @Override // defpackage.qbh
    public final String d() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x011a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r9v1, types: [pfk] */
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
    @Override // defpackage.pff
    public final Object g(Bundle bundle, aieu aieuVar, plx plxVar, awoq awoqVar) throws Throwable {
        pfg pfgVar;
        pdq pdqVarD;
        plx plxVar2;
        Object obj;
        int i;
        Object obj2;
        ?? r13;
        if (awoqVar instanceof pfg) {
            pfgVar = (pfg) awoqVar;
            int i2 = pfgVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pfgVar.d = i2 - Integer.MIN_VALUE;
            } else {
                pfgVar = new pfg(this, awoqVar);
            }
        } else {
            pfgVar = new pfg(this, awoqVar);
        }
        pfg pfgVar2 = pfgVar;
        Object obj3 = pfgVar2.b;
        awox awoxVar = awox.a;
        int i3 = pfgVar2.d;
        if (i3 == 0) {
            atqp.j(obj3);
            if (plxVar == null) {
                return k();
            }
            int i4 = bundle.getInt("com.google.android.libraries.notifications.internal.scheduled.impl.INTENT_EXTRA_INCLUDE_TARGET");
            List listB = this.f.b(plxVar, 6);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                try {
                    aihn aihnVarBuild = ((aihf) aibk.a.createBuilder().mergeFrom(((pfj) it.next()).c)).build();
                    aihnVarBuild.getClass();
                    aibk aibkVar = (aibk) aihnVarBuild;
                    aial aialVar = aibkVar.c;
                    if (aialVar == null) {
                        aialVar = aial.a;
                    }
                    String str = aialVar.c;
                    if (str == null) {
                        throw new NullPointerException("Null key");
                    }
                    ozg ozgVar = new ozg(str, !aialVar.d.isEmpty() ? aialVar.d : null);
                    int iAS = a.aS(aibkVar.d);
                    if (iAS == 0) {
                        iAS = 1;
                    }
                    int i5 = iAS - 1;
                    if (i5 != 1) {
                        i = 2;
                        if (i5 != 2) {
                            i = 1;
                        }
                    } else {
                        i = 3;
                    }
                    ozf ozfVar = new ozf(ozgVar, i);
                    linkedHashMap.put(ozfVar.a, ozfVar);
                } catch (aiik e) {
                    ((agsj) ((agsj) d.b()).j(e)).t("Failed to parse PreferenceEntry from ChimeTaskData");
                }
            }
            List listAp = atqq.ap(linkedHashMap.values());
            if (listAp.isEmpty()) {
                qat qatVarC = pdq.c();
                qatVarC.b = new IllegalArgumentException("No preferences to set.");
                qatVarC.f(false);
                pdqVarD = qatVarC.d();
                plxVar2 = plxVar;
                r13 = listB;
                if (pdqVarD.b() || !pdqVarD.d) {
                    this.f.d(plxVar2, r13);
                }
                pdqVarD.getClass();
                obj2 = pdqVarD;
            } else {
                pdr pdrVar = this.e;
                ozh ozhVar = new ozh(listAp);
                boolean z = i4 == 1;
                pfgVar2.e = plxVar;
                pfgVar2.a = listB;
                pfgVar2.d = 1;
                Object objE = pdrVar.e(plxVar, ozhVar, z, aieuVar, pfgVar2);
                obj2 = awoxVar;
                if (objE != awoxVar) {
                    obj3 = objE;
                    obj = listB;
                    plxVar2 = plxVar;
                }
            }
            return obj2;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Object obj4 = pfgVar2.a;
        plx plxVar3 = pfgVar2.e;
        atqp.j(obj3);
        plxVar2 = plxVar3;
        obj = obj4;
        pdqVarD = (pdq) obj3;
        r13 = obj;
        if (pdqVarD.b()) {
            this.f.d(plxVar2, r13);
        } else {
            this.f.d(plxVar2, r13);
        }
        pdqVarD.getClass();
        obj2 = pdqVarD;
        return obj2;
    }

    @Override // defpackage.pff
    protected final String h() {
        return "SetUserPrereferenceCallback";
    }
}
