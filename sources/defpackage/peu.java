package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class peu extends pff {
    private static final agsn d = agsn.h("GnpSdk");
    private final pdr e;
    private final pfk f;
    private final String g;

    public peu(pdr pdrVar, pfk pfkVar) {
        pdrVar.getClass();
        pfkVar.getClass();
        this.e = pdrVar;
        this.f = pfkVar;
        this.g = "RPC_BATCH_UPDATE_THREAD_STATE";
    }

    @Override // defpackage.qbh
    public final String d() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [pfk] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
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
        pet petVar;
        pzo pzoVar;
        Object obj;
        ?? r5;
        plx plxVar2 = plxVar;
        if (awoqVar instanceof pet) {
            petVar = (pet) awoqVar;
            int i = petVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                petVar.d = i - Integer.MIN_VALUE;
            } else {
                petVar = new pet(this, awoqVar);
            }
        } else {
            petVar = new pet(this, awoqVar);
        }
        Object objA = petVar.b;
        awox awoxVar = awox.a;
        int i2 = petVar.d;
        int i3 = 1;
        if (i2 == 0) {
            atqp.j(objA);
            if (plxVar2 == null) {
                return k();
            }
            List listB = this.f.b(plxVar2, 100);
            ArrayList arrayList = new ArrayList();
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                try {
                    pzoVar = (pzo) aihn.parseFrom(pzo.a, ((pfj) it.next()).c);
                } catch (aiik e) {
                    ((agsj) ((agsj) d.b()).j(e)).t("Unable to parse SdkBatchedUpdate message");
                    pzoVar = null;
                }
                if (pzoVar != null) {
                    arrayList.add(pzoVar);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                pzo pzoVar2 = (pzo) next;
                aiff aiffVar = pzoVar2.d;
                if (aiffVar == null) {
                    aiffVar = aiff.a;
                }
                aiffVar.getClass();
                String str = pzoVar2.f;
                str.getClass();
                int iBc = a.bc(pzoVar2.e);
                if (iBc == 0) {
                    iBc = i3;
                }
                int iBh = a.bh(pzoVar2.g);
                if (iBh == 0) {
                    iBh = i3;
                }
                int iAT = a.aT(pzoVar2.h);
                if (iAT == 0) {
                    iAT = i3;
                }
                Iterator it3 = it2;
                long j = pzoVar2.i;
                int iA = aewp.A(pzoVar2.k);
                pes pesVar = new pes(aiffVar, str, iBc, iBh, iAT, j, iA == 0 ? 1 : iA);
                Object arrayList2 = linkedHashMap.get(pesVar);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(pesVar, arrayList2);
                }
                ((List) arrayList2).add(next);
                it2 = it3;
                i3 = 1;
            }
            ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                pes pesVar2 = (pes) entry.getKey();
                List list = (List) entry.getValue();
                aihf aihfVarCreateBuilder = pzo.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                nra.f(pesVar2.a, aihfVarCreateBuilder);
                nra.d(pesVar2.b, aihfVarCreateBuilder);
                nra.g(aihfVarCreateBuilder);
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    aiie aiieVar = ((pzo) it4.next()).c;
                    aiieVar.getClass();
                    atqq.aA(arrayList4, aiieVar);
                }
                List listAh = atqq.ah(arrayList4);
                aihfVarCreateBuilder.copyOnWrite();
                pzo pzoVar3 = (pzo) aihfVarCreateBuilder.instance;
                pzoVar3.a();
                aifs.addAll(listAh, pzoVar3.c);
                nra.i(pesVar2.d, aihfVarCreateBuilder);
                nra.k(pesVar2.e, aihfVarCreateBuilder);
                nra.j(pesVar2.f, aihfVarCreateBuilder);
                nra.e(pesVar2.c, aihfVarCreateBuilder);
                int i4 = pesVar2.g;
                if (i4 != 1) {
                    nra.h(i4, aihfVarCreateBuilder);
                }
                arrayList3.add(nra.c(aihfVarCreateBuilder));
            }
            pdr pdrVar = this.e;
            petVar.e = plxVar2;
            petVar.a = listB;
            petVar.d = 1;
            objA = pdrVar.a(plxVar2, arrayList3, aieuVar, petVar);
            r5 = listB;
            obj = awoxVar;
            if (objA != awoxVar) {
            }
            obj = pdqVar;
            return obj;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Object obj2 = petVar.a;
        plx plxVar3 = petVar.e;
        atqp.j(objA);
        r5 = obj2;
        plxVar2 = plxVar3;
        pdq pdqVar = (pdq) objA;
        if (!pdqVar.b() || !pdqVar.d) {
            obj = pdqVar;
            this.f.d(plxVar2, r5);
            obj = pdqVar;
        }
        obj = pdqVar;
        return obj;
    }

    @Override // defpackage.pff
    protected final String h() {
        return "BatchUpdateThreadStateCallback";
    }
}
