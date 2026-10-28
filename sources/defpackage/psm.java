package defpackage;

import android.content.Context;
import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class psm implements ppw {
    public static final /* synthetic */ int b = 0;
    private static final agsn c = agsn.h("GnpSdk");
    public final omr a;
    private final pqn d;
    private final pve e;
    private final awou f;
    private final psw g;
    private final agev h;
    private final pwf i;
    private final Context j;
    private final psz k;
    private final pqg l;
    private final pqm m;
    private final ppy n;
    private final ppw o;
    private final pls p;
    private final String q;
    private final omr r;
    private final omm s;

    public psm(pqn pqnVar, pve pveVar, awou awouVar, omr omrVar, omm ommVar, psw pswVar, agev agevVar, pwf pwfVar, Context context, psz pszVar, pqg pqgVar, pqm pqmVar, ppy ppyVar, ppw ppwVar, pls plsVar, omr omrVar2) {
        pqnVar.getClass();
        pveVar.getClass();
        awouVar.getClass();
        omrVar.getClass();
        ommVar.getClass();
        pwfVar.getClass();
        context.getClass();
        pszVar.getClass();
        pqgVar.getClass();
        pqmVar.getClass();
        ppyVar.getClass();
        plsVar.getClass();
        this.d = pqnVar;
        this.e = pveVar;
        this.f = awouVar;
        this.r = omrVar;
        this.s = ommVar;
        this.g = pswVar;
        this.h = agevVar;
        this.i = pwfVar;
        this.j = context;
        this.k = pszVar;
        this.l = pqgVar;
        this.m = pqmVar;
        this.n = ppyVar;
        this.o = ppwVar;
        this.p = plsVar;
        this.a = omrVar2;
        this.q = "GNP_REGISTRATION";
    }

    @Override // defpackage.ppw
    public final int a() {
        return 15;
    }

    @Override // defpackage.ppw
    public final long b() {
        return 0L;
    }

    @Override // defpackage.ppw
    public final Object c(Bundle bundle, awoq awoqVar) {
        return awro.p(this.f, new psf(this, bundle, null), awoqVar);
    }

    @Override // defpackage.ppw
    public final String d() {
        return this.q;
    }

    @Override // defpackage.ppw
    public final boolean e() {
        return false;
    }

    @Override // defpackage.ppw
    public final /* synthetic */ int f() {
        return 3;
    }

    @Override // defpackage.ppw
    public final int g() {
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(awoq awoqVar) throws Throwable {
        psg psgVar;
        if (awoqVar instanceof psg) {
            psgVar = (psg) awoqVar;
            int i = psgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                psgVar.c = i - Integer.MIN_VALUE;
            } else {
                psgVar = new psg(this, awoqVar);
            }
        } else {
            psgVar = new psg(this, awoqVar);
        }
        Object objC = psgVar.a;
        awox awoxVar = awox.a;
        int i2 = psgVar.c;
        if (i2 == 0) {
            atqp.j(objC);
            pve pveVar = this.e;
            psgVar.c = 1;
            objC = pveVar.c(psgVar);
            if (objC == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objC);
        }
        pky pkyVar = (pky) objC;
        int iAu = a.au(pkyVar);
        if (iAu != 0) {
            if (iAu == 1) {
                return (pku) pkyVar;
            }
            throw new awmj();
        }
        List list = (List) ((pla) pkyVar).a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(awro.f(atqq.u(atqq.N(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(((plx) obj).b(), obj);
        }
        return new pla(linkedHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [omr] */
    /* JADX WARN: Type inference failed for: r16v0, types: [psm] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
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
    public final Object k(pky pkyVar, List list, Map map, aier aierVar, plv plvVar, awoq awoqVar) throws Throwable {
        psh pshVar;
        plv plvVar2;
        ?? r2;
        ?? r1;
        List list2 = list;
        Map map2 = map;
        if (awoqVar instanceof psh) {
            pshVar = (psh) awoqVar;
            int i = pshVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pshVar.e = i - Integer.MIN_VALUE;
            } else {
                pshVar = new psh(this, awoqVar);
            }
        } else {
            pshVar = new psh(this, awoqVar);
        }
        Object obj = pshVar.c;
        awox awoxVar = awox.a;
        int i2 = pshVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                plv plvVar3 = pshVar.f;
                Object obj2 = pshVar.b;
                Object obj3 = pshVar.a;
                atqp.j(obj);
                plvVar2 = plvVar3;
                r1 = obj3;
                r2 = obj2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(obj);
            }
            return awmy.a;
        }
        atqp.j(obj);
        pwf pwfVar = this.i;
        Context context = this.j;
        pls plsVar = this.p;
        String packageName = context.getPackageName();
        String strName = aierVar.name();
        String strName2 = plvVar.name();
        String str = plsVar.a;
        pwfVar.j(packageName, str, "FAILURE", strName, strName2);
        pwfVar.k(list2.size(), context.getPackageName(), str, "FAILURE");
        pkyVar.getClass();
        pshVar.a = list2;
        pshVar.b = map2;
        plvVar2 = plvVar;
        pshVar.f = plvVar2;
        pshVar.e = 1;
        if (n(map2, list2, (pku) pkyVar, pshVar) == awoxVar) {
            r1 = list2;
            r2 = map2;
            return awoxVar;
        }
        r1 = list2;
        r2 = map2;
        ?? r0 = this.r;
        prz przVar = new prz(r1, 2);
        pshVar.a = null;
        pshVar.b = null;
        pshVar.f = null;
        pshVar.e = 2;
        if (r0.a(r2, przVar, plvVar2, pshVar) == awoxVar) {
            return awoxVar;
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [pqg] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [pss] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final Object l(plv plvVar, awoq awoqVar) throws Throwable {
        psi psiVar;
        plv plvVar2;
        ?? r10;
        ?? r2;
        pqm pqmVar;
        pky pkyVar;
        int iAu;
        Object obj;
        if (awoqVar instanceof psi) {
            psiVar = (psi) awoqVar;
            int i = psiVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                psiVar.d = i - Integer.MIN_VALUE;
            } else {
                psiVar = new psi(this, awoqVar);
            }
        } else {
            psiVar = new psi(this, awoqVar);
        }
        Object objB = psiVar.b;
        awox awoxVar = awox.a;
        int i2 = psiVar.d;
        if (i2 == 0) {
            atqp.j(objB);
            if (plvVar.a()) {
                pqg pqgVar = this.l;
                omm ommVar = this.s;
                pss pssVar = pss.a;
                psiVar.e = plvVar;
                psiVar.f = pssVar;
                psiVar.a = pqgVar;
                psiVar.d = 1;
                Object objE = ommVar.e(psiVar);
                if (objE == awoxVar) {
                    return awoxVar;
                }
                plvVar2 = plvVar;
                r10 = pqgVar;
                objB = objE;
                r2 = pssVar;
            } else if (plvVar.b()) {
                pqmVar = this.m;
                psiVar.e = null;
                psiVar.d = 3;
                if (pqmVar.b(psiVar) == awoxVar) {
                    return awoxVar;
                }
            }
            return awmy.a;
        }
        if (i2 == 1) {
            Object obj2 = psiVar.a;
            pss pssVar2 = psiVar.f;
            plvVar2 = psiVar.e;
            atqp.j(objB);
            r2 = pssVar2;
            r10 = obj2;
        } else if (i2 == 2) {
            plvVar = psiVar.e;
            atqp.j(objB);
            pkyVar = (pky) objB;
            iAu = a.au(pkyVar);
            if (iAu != 0) {
                obj = ((pla) pkyVar).a;
            } else {
                if (iAu == 1) {
                    throw new awmj();
                }
                obj = Boolean.TRUE;
            }
            if (((Boolean) obj).booleanValue()) {
                this.l.a();
            }
            if (plvVar.b()) {
                pqmVar = this.m;
                psiVar.e = null;
                psiVar.d = 3;
                if (pqmVar.b(psiVar) == awoxVar) {
                    return awoxVar;
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objB);
        }
        return awmy.a;
        psiVar.e = plvVar2;
        psiVar.f = null;
        psiVar.a = null;
        psiVar.d = 2;
        objB = r2.b(r10, (String) objB, true);
        if (objB == awoxVar) {
            return awoxVar;
        }
        plvVar = plvVar2;
        pkyVar = (pky) objB;
        iAu = a.au(pkyVar);
        if (iAu != 0) {
            obj = ((pla) pkyVar).a;
        } else {
            if (iAu == 1) {
                throw new awmj();
            }
            obj = Boolean.TRUE;
        }
        if (((Boolean) obj).booleanValue()) {
            this.l.a();
        }
        if (plvVar.b()) {
            pqmVar = this.m;
            psiVar.e = null;
            psiVar.d = 3;
            if (pqmVar.b(psiVar) == awoxVar) {
                return awoxVar;
            }
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0126  */
    /* JADX WARN: Code duplicated, block: B:29:0x0132  */
    /* JADX WARN: Code duplicated, block: B:31:0x0139  */
    /* JADX WARN: Code duplicated, block: B:33:0x013f  */
    /* JADX WARN: Code duplicated, block: B:35:0x015a  */
    /* JADX WARN: Code duplicated, block: B:38:0x016e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0175  */
    /* JADX WARN: Code duplicated, block: B:42:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x01be  */
    /* JADX WARN: Code duplicated, block: B:47:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:49:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:51:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:52:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:54:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:56:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:57:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:59:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:62:0x0204  */
    /* JADX WARN: Code duplicated, block: B:64:0x0210  */
    /* JADX WARN: Code duplicated, block: B:66:0x0218  */
    /* JADX WARN: Code duplicated, block: B:68:0x0224  */
    /* JADX WARN: Code duplicated, block: B:70:0x0228  */
    /* JADX WARN: Code duplicated, block: B:73:0x022e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0235  */
    /* JADX WARN: Code duplicated, block: B:77:0x023a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0241  */
    /* JADX WARN: Code duplicated, block: B:85:0x0276  */
    /* JADX WARN: Code duplicated, block: B:86:0x0278  */
    /* JADX WARN: Code duplicated, block: B:88:0x027e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0286  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [pqn] */
    /* JADX WARN: Type inference failed for: r12v4, types: [psm] */
    /* JADX WARN: Type inference failed for: r12v5, types: [psm] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r17v0, types: [psm] */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r9v6, types: [pqn] */
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
    public final Object m(List list, Map map, aier aierVar, plv plvVar, pqo pqoVar, awoq awoqVar) throws Throwable {
        psj psjVar;
        plv plvVar2;
        List list2;
        Object obj;
        aier aierVar2;
        List list3;
        ?? r3;
        pqo pqoVar2;
        psw pswVar;
        Object obj2;
        aier aierVar3;
        pqo pqoVar3;
        psj psjVar2;
        plv plvVar3;
        pqo pqoVar4;
        aier aierVar4;
        List list4;
        pky pkyVar;
        Object objD;
        aiaz aiazVar;
        Object objA;
        pqo pqoVar5;
        aiaz aiazVar2;
        plv plvVar4;
        aier aierVar5;
        pky pkyVar2;
        pky pkyVar3;
        aiaz aiazVar3;
        Object objB;
        List list5;
        ?? r14;
        pky pkyVar4;
        aier aierVar6;
        aiaz aiazVar4;
        plv plvVar5;
        pqo pqoVar6;
        pky pkyVar5;
        aier aierVar7;
        ?? r12;
        pky pkyVar6;
        List list6;
        Object objD2;
        pqq pqqVar;
        Object objD3;
        String str;
        aiby aibyVar;
        aiah aiahVar;
        aiao aiaoVar;
        Object objK;
        pky pkyVar7;
        ?? r13;
        pky pkyVar8;
        if (awoqVar instanceof psj) {
            psjVar = (psj) awoqVar;
            int i = psjVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                psjVar.h = i - Integer.MIN_VALUE;
            } else {
                psjVar = new psj(this, awoqVar);
            }
        } else {
            psjVar = new psj(this, awoqVar);
        }
        psj psjVar3 = psjVar;
        Object objP = psjVar3.f;
        awox awoxVar = awox.a;
        switch (psjVar3.h) {
            case 0:
                atqp.j(objP);
                psw pswVar2 = this.g;
                omm ommVar = this.s;
                psjVar3.a = list;
                psjVar3.b = map;
                psjVar3.i = aierVar;
                plvVar2 = plvVar;
                psjVar3.j = plvVar2;
                psjVar3.k = pqoVar;
                psjVar3.c = pswVar2;
                psjVar3.d = list;
                psjVar3.e = map;
                psjVar3.l = aierVar;
                psjVar3.h = 1;
                Object objD4 = ommVar.d(psjVar3);
                if (objD4 == awoxVar) {
                    return awoxVar;
                }
                list2 = list;
                obj = map;
                aierVar2 = aierVar;
                list3 = list2;
                r3 = obj;
                pqoVar2 = pqoVar;
                pswVar = pswVar2;
                obj2 = objD4;
                aierVar3 = aierVar2;
                psjVar3.a = list2;
                psjVar3.b = obj;
                psjVar3.i = aierVar2;
                psjVar3.j = plvVar2;
                psjVar3.k = pqoVar2;
                psjVar3.c = null;
                psjVar3.d = null;
                psjVar3.e = null;
                psjVar3.l = null;
                psjVar3.h = 2;
                pqoVar3 = pqoVar2;
                psw pswVar3 = pswVar;
                psjVar2 = psjVar3;
                objP = awro.p(pswVar3.e, new psu(pswVar3, plvVar2, list3, aierVar3, (String) obj2, r3, null), psjVar2);
                if (objP != awoxVar) {
                    return awoxVar;
                }
                plvVar3 = plvVar2;
                pqoVar4 = pqoVar3;
                aierVar4 = aierVar2;
                list4 = list2;
                pkyVar = (pky) objP;
                if (pkyVar.g()) {
                    pkyVar.getClass();
                    return (pku) pkyVar;
                }
                objD = pkyVar.d();
                if (objD == null) {
                    throw new IllegalStateException("Registration request is null");
                }
                psz pszVar = this.k;
                aiazVar = (aiaz) objD;
                psjVar2.a = list4;
                psjVar2.b = obj;
                psjVar2.i = aierVar4;
                psjVar2.j = plvVar3;
                psjVar2.k = pqoVar4;
                psjVar2.c = pkyVar;
                psjVar2.d = aiazVar;
                psjVar2.h = 3;
                objA = pszVar.a(pqoVar4, psjVar2);
                if (objA == awoxVar) {
                    return awoxVar;
                }
                pqoVar5 = pqoVar4;
                aiazVar2 = aiazVar;
                plvVar4 = plvVar3;
                aierVar5 = aierVar4;
                pkyVar2 = pkyVar;
                objP = objA;
                pkyVar3 = (pky) objP;
                if (pkyVar3.g()) {
                    pkyVar3.getClass();
                    return (pku) pkyVar3;
                }
                ?? r9 = this.d;
                String str2 = (String) pkyVar3.d();
                psjVar2.a = list4;
                psjVar2.b = obj;
                psjVar2.i = aierVar5;
                psjVar2.j = plvVar4;
                psjVar2.k = pqoVar5;
                psjVar2.c = pkyVar2;
                psjVar2.d = aiazVar2;
                psjVar2.e = pkyVar3;
                psjVar2.h = 4;
                aiazVar3 = aiazVar2;
                psj psjVar4 = psjVar2;
                List list7 = list4;
                ?? r20 = obj;
                objB = r9.b(list7, r20, str2, aiazVar3, psjVar4);
                list5 = list7;
                r14 = r20;
                psjVar3 = psjVar4;
                if (objB != awoxVar) {
                    return awoxVar;
                }
                objP = objB;
                pkyVar4 = pkyVar3;
                aierVar6 = aierVar5;
                aiazVar4 = aiazVar3;
                plvVar5 = plvVar4;
                pqoVar6 = pqoVar5;
                pkyVar5 = (pky) objP;
                if (pkyVar5.g()) {
                    psjVar3.a = pkyVar5;
                    psjVar3.b = null;
                    psjVar3.i = null;
                    psjVar3.j = null;
                    psjVar3.k = null;
                    psjVar3.c = null;
                    psjVar3.d = null;
                    psjVar3.e = null;
                    psjVar3.h = 5;
                    Objects.checkIndex(0, 3);
                    if (pkyVar5 == null) {
                        objK = awmy.a;
                    } else if (pkyVar5 instanceof puj) {
                        objK = l(plvVar5, psjVar3);
                        if (objK != awoxVar) {
                            objK = awmy.a;
                        }
                    } else if (pkyVar5 instanceof pkz) {
                        objK = k(pkyVar5, list5, r14, aierVar6, plvVar5, psjVar3);
                        if (objK != awoxVar) {
                            pkyVar5 = pkyVar5;
                            objK = awmy.a;
                        }
                    } else {
                        objK = awmy.a;
                    }
                    if (objK == awoxVar) {
                        return awoxVar;
                    }
                    pkyVar7 = pkyVar5;
                    pkyVar7.getClass();
                    return (pku) pkyVar7;
                }
                aierVar7 = aierVar6;
                r12 = this;
                pkyVar6 = pkyVar4;
                list6 = list5;
                objD2 = pkyVar5.d();
                if (objD2 == null) {
                    throw new IllegalStateException("Registration response is null");
                }
                pqqVar = (pqq) objD2;
                objD3 = pkyVar2.d();
                if (objD3 == null) {
                    throw new IllegalStateException("Registration request is null");
                }
                int iAo = qnl.ao((aiaz) objD3, list6, r14);
                if (plvVar5.a()) {
                    aibyVar = aiazVar4.d;
                    if (aibyVar == null) {
                        aibyVar = aiby.a;
                    }
                    aiahVar = aibyVar.d;
                    if (aiahVar == null) {
                        aiahVar = aiah.a;
                    }
                    if (aiahVar.b == 1) {
                        aiaoVar = (aiao) aiahVar.c;
                    } else {
                        aiaoVar = aiao.a;
                    }
                    str = aiaoVar.c;
                } else {
                    str = null;
                }
                ?? r0 = r12.d;
                String str3 = (String) pkyVar6.d();
                psjVar3.a = list6;
                psjVar3.b = null;
                psjVar3.i = null;
                psjVar3.j = null;
                psjVar3.k = null;
                psjVar3.c = null;
                psjVar3.d = null;
                psjVar3.e = null;
                psjVar3.h = 6;
                objP = r0.a(list6, r14, pqqVar, str3, iAo, pqoVar6, plvVar5, aierVar7, str, psjVar3);
                r13 = r12;
                if (objP == awoxVar) {
                    return awoxVar;
                }
                pkyVar8 = (pky) objP;
                psjVar3.a = pkyVar8;
                psjVar3.h = 7;
                if (r13.o(pkyVar8, list6, psjVar3) != awoxVar) {
                    return pkyVar8;
                }
                return awoxVar;
            case 1:
                aier aierVar8 = psjVar3.l;
                Map map2 = (Map) psjVar3.e;
                List list8 = (List) psjVar3.d;
                psw pswVar4 = (psw) psjVar3.c;
                pqo pqoVar7 = psjVar3.k;
                plv plvVar6 = psjVar3.j;
                aierVar2 = psjVar3.i;
                obj = psjVar3.b;
                list2 = (List) psjVar3.a;
                atqp.j(objP);
                aierVar3 = aierVar8;
                pqoVar2 = pqoVar7;
                plvVar2 = plvVar6;
                pswVar = pswVar4;
                obj2 = objP;
                r3 = map2;
                list3 = list8;
                psjVar3.a = list2;
                psjVar3.b = obj;
                psjVar3.i = aierVar2;
                psjVar3.j = plvVar2;
                psjVar3.k = pqoVar2;
                psjVar3.c = null;
                psjVar3.d = null;
                psjVar3.e = null;
                psjVar3.l = null;
                psjVar3.h = 2;
                pqoVar3 = pqoVar2;
                psw pswVar5 = pswVar;
                psjVar2 = psjVar3;
                objP = awro.p(pswVar5.e, new psu(pswVar5, plvVar2, list3, aierVar3, (String) obj2, r3, null), psjVar2);
                if (objP != awoxVar) {
                    return awoxVar;
                }
                plvVar3 = plvVar2;
                pqoVar4 = pqoVar3;
                aierVar4 = aierVar2;
                list4 = list2;
                pkyVar = (pky) objP;
                if (pkyVar.g()) {
                    pkyVar.getClass();
                    return (pku) pkyVar;
                }
                objD = pkyVar.d();
                if (objD == null) {
                    throw new IllegalStateException("Registration request is null");
                }
                psz pszVar2 = this.k;
                aiazVar = (aiaz) objD;
                psjVar2.a = list4;
                psjVar2.b = obj;
                psjVar2.i = aierVar4;
                psjVar2.j = plvVar3;
                psjVar2.k = pqoVar4;
                psjVar2.c = pkyVar;
                psjVar2.d = aiazVar;
                psjVar2.h = 3;
                objA = pszVar2.a(pqoVar4, psjVar2);
                if (objA == awoxVar) {
                    return awoxVar;
                }
                pqoVar5 = pqoVar4;
                aiazVar2 = aiazVar;
                plvVar4 = plvVar3;
                aierVar5 = aierVar4;
                pkyVar2 = pkyVar;
                objP = objA;
                pkyVar3 = (pky) objP;
                if (pkyVar3.g()) {
                    pkyVar3.getClass();
                    return (pku) pkyVar3;
                }
                ?? r10 = this.d;
                String str4 = (String) pkyVar3.d();
                psjVar2.a = list4;
                psjVar2.b = obj;
                psjVar2.i = aierVar5;
                psjVar2.j = plvVar4;
                psjVar2.k = pqoVar5;
                psjVar2.c = pkyVar2;
                psjVar2.d = aiazVar2;
                psjVar2.e = pkyVar3;
                psjVar2.h = 4;
                aiazVar3 = aiazVar2;
                psj psjVar5 = psjVar2;
                List list9 = list4;
                ?? r21 = obj;
                objB = r10.b(list9, r21, str4, aiazVar3, psjVar5);
                list5 = list9;
                r14 = r21;
                psjVar3 = psjVar5;
                if (objB != awoxVar) {
                    return awoxVar;
                }
                objP = objB;
                pkyVar4 = pkyVar3;
                aierVar6 = aierVar5;
                aiazVar4 = aiazVar3;
                plvVar5 = plvVar4;
                pqoVar6 = pqoVar5;
                pkyVar5 = (pky) objP;
                if (pkyVar5.g()) {
                    psjVar3.a = pkyVar5;
                    psjVar3.b = null;
                    psjVar3.i = null;
                    psjVar3.j = null;
                    psjVar3.k = null;
                    psjVar3.c = null;
                    psjVar3.d = null;
                    psjVar3.e = null;
                    psjVar3.h = 5;
                    Objects.checkIndex(0, 3);
                    if (pkyVar5 == null) {
                        objK = awmy.a;
                    } else if (pkyVar5 instanceof puj) {
                        objK = l(plvVar5, psjVar3);
                        if (objK != awoxVar) {
                            objK = awmy.a;
                        }
                    } else if (pkyVar5 instanceof pkz) {
                        objK = k(pkyVar5, list5, r14, aierVar6, plvVar5, psjVar3);
                        if (objK != awoxVar) {
                            pkyVar5 = pkyVar5;
                            objK = awmy.a;
                        }
                    } else {
                        objK = awmy.a;
                    }
                    if (objK == awoxVar) {
                        return awoxVar;
                    }
                    pkyVar7 = pkyVar5;
                    pkyVar7.getClass();
                    return (pku) pkyVar7;
                }
                aierVar7 = aierVar6;
                r12 = this;
                pkyVar6 = pkyVar4;
                list6 = list5;
                objD2 = pkyVar5.d();
                if (objD2 == null) {
                    throw new IllegalStateException("Registration response is null");
                }
                pqqVar = (pqq) objD2;
                objD3 = pkyVar2.d();
                if (objD3 == null) {
                    throw new IllegalStateException("Registration request is null");
                }
                int iAo2 = qnl.ao((aiaz) objD3, list6, r14);
                if (plvVar5.a()) {
                    aibyVar = aiazVar4.d;
                    if (aibyVar == null) {
                        aibyVar = aiby.a;
                    }
                    aiahVar = aibyVar.d;
                    if (aiahVar == null) {
                        aiahVar = aiah.a;
                    }
                    if (aiahVar.b == 1) {
                        aiaoVar = (aiao) aiahVar.c;
                    } else {
                        aiaoVar = aiao.a;
                    }
                    str = aiaoVar.c;
                } else {
                    str = null;
                }
                ?? r1 = r12.d;
                String str5 = (String) pkyVar6.d();
                psjVar3.a = list6;
                psjVar3.b = null;
                psjVar3.i = null;
                psjVar3.j = null;
                psjVar3.k = null;
                psjVar3.c = null;
                psjVar3.d = null;
                psjVar3.e = null;
                psjVar3.h = 6;
                objP = r1.a(list6, r14, pqqVar, str5, iAo2, pqoVar6, plvVar5, aierVar7, str, psjVar3);
                r13 = r12;
                if (objP == awoxVar) {
                    return awoxVar;
                }
                pkyVar8 = (pky) objP;
                psjVar3.a = pkyVar8;
                psjVar3.h = 7;
                if (r13.o(pkyVar8, list6, psjVar3) != awoxVar) {
                    return pkyVar8;
                }
                return awoxVar;
            case 2:
                pqoVar4 = psjVar3.k;
                plvVar3 = psjVar3.j;
                aierVar4 = psjVar3.i;
                Object obj3 = psjVar3.b;
                List list10 = (List) psjVar3.a;
                atqp.j(objP);
                obj = obj3;
                list4 = list10;
                psjVar2 = psjVar3;
                pkyVar = (pky) objP;
                if (pkyVar.g()) {
                    pkyVar.getClass();
                    return (pku) pkyVar;
                }
                objD = pkyVar.d();
                if (objD == null) {
                    throw new IllegalStateException("Registration request is null");
                }
                psz pszVar3 = this.k;
                aiazVar = (aiaz) objD;
                psjVar2.a = list4;
                psjVar2.b = obj;
                psjVar2.i = aierVar4;
                psjVar2.j = plvVar3;
                psjVar2.k = pqoVar4;
                psjVar2.c = pkyVar;
                psjVar2.d = aiazVar;
                psjVar2.h = 3;
                objA = pszVar3.a(pqoVar4, psjVar2);
                if (objA == awoxVar) {
                    return awoxVar;
                }
                pqoVar5 = pqoVar4;
                aiazVar2 = aiazVar;
                plvVar4 = plvVar3;
                aierVar5 = aierVar4;
                pkyVar2 = pkyVar;
                objP = objA;
                pkyVar3 = (pky) objP;
                if (pkyVar3.g()) {
                    pkyVar3.getClass();
                    return (pku) pkyVar3;
                }
                ?? r11 = this.d;
                String str6 = (String) pkyVar3.d();
                psjVar2.a = list4;
                psjVar2.b = obj;
                psjVar2.i = aierVar5;
                psjVar2.j = plvVar4;
                psjVar2.k = pqoVar5;
                psjVar2.c = pkyVar2;
                psjVar2.d = aiazVar2;
                psjVar2.e = pkyVar3;
                psjVar2.h = 4;
                aiazVar3 = aiazVar2;
                psj psjVar6 = psjVar2;
                List list11 = list4;
                ?? r22 = obj;
                objB = r11.b(list11, r22, str6, aiazVar3, psjVar6);
                list5 = list11;
                r14 = r22;
                psjVar3 = psjVar6;
                if (objB != awoxVar) {
                    return awoxVar;
                }
                objP = objB;
                pkyVar4 = pkyVar3;
                aierVar6 = aierVar5;
                aiazVar4 = aiazVar3;
                plvVar5 = plvVar4;
                pqoVar6 = pqoVar5;
                pkyVar5 = (pky) objP;
                if (pkyVar5.g()) {
                    psjVar3.a = pkyVar5;
                    psjVar3.b = null;
                    psjVar3.i = null;
                    psjVar3.j = null;
                    psjVar3.k = null;
                    psjVar3.c = null;
                    psjVar3.d = null;
                    psjVar3.e = null;
                    psjVar3.h = 5;
                    Objects.checkIndex(0, 3);
                    if (pkyVar5 == null) {
                        objK = awmy.a;
                    } else if (pkyVar5 instanceof puj) {
                        objK = l(plvVar5, psjVar3);
                        if (objK != awoxVar) {
                            objK = awmy.a;
                        }
                    } else if (pkyVar5 instanceof pkz) {
                        objK = k(pkyVar5, list5, r14, aierVar6, plvVar5, psjVar3);
                        if (objK != awoxVar) {
                            pkyVar5 = pkyVar5;
                            objK = awmy.a;
                        }
                    } else {
                        objK = awmy.a;
                    }
                    if (objK == awoxVar) {
                        return awoxVar;
                    }
                    pkyVar7 = pkyVar5;
                    pkyVar7.getClass();
                    return (pku) pkyVar7;
                }
                aierVar7 = aierVar6;
                r12 = this;
                pkyVar6 = pkyVar4;
                list6 = list5;
                objD2 = pkyVar5.d();
                if (objD2 == null) {
                    throw new IllegalStateException("Registration response is null");
                }
                pqqVar = (pqq) objD2;
                objD3 = pkyVar2.d();
                if (objD3 == null) {
                    throw new IllegalStateException("Registration request is null");
                }
                int iAo3 = qnl.ao((aiaz) objD3, list6, r14);
                if (plvVar5.a()) {
                    aibyVar = aiazVar4.d;
                    if (aibyVar == null) {
                        aibyVar = aiby.a;
                    }
                    aiahVar = aibyVar.d;
                    if (aiahVar == null) {
                        aiahVar = aiah.a;
                    }
                    if (aiahVar.b == 1) {
                        aiaoVar = (aiao) aiahVar.c;
                    } else {
                        aiaoVar = aiao.a;
                    }
                    str = aiaoVar.c;
                } else {
                    str = null;
                }
                ?? r2 = r12.d;
                String str7 = (String) pkyVar6.d();
                psjVar3.a = list6;
                psjVar3.b = null;
                psjVar3.i = null;
                psjVar3.j = null;
                psjVar3.k = null;
                psjVar3.c = null;
                psjVar3.d = null;
                psjVar3.e = null;
                psjVar3.h = 6;
                objP = r2.a(list6, r14, pqqVar, str7, iAo3, pqoVar6, plvVar5, aierVar7, str, psjVar3);
                r13 = r12;
                if (objP == awoxVar) {
                    return awoxVar;
                }
                pkyVar8 = (pky) objP;
                psjVar3.a = pkyVar8;
                psjVar3.h = 7;
                if (r13.o(pkyVar8, list6, psjVar3) != awoxVar) {
                    return pkyVar8;
                }
                return awoxVar;
            case 3:
                aiazVar2 = (aiaz) psjVar3.d;
                pky pkyVar9 = (pky) psjVar3.c;
                pqo pqoVar8 = psjVar3.k;
                plv plvVar7 = psjVar3.j;
                aier aierVar9 = psjVar3.i;
                Object obj4 = psjVar3.b;
                list4 = (List) psjVar3.a;
                atqp.j(objP);
                pkyVar2 = pkyVar9;
                aierVar5 = aierVar9;
                plvVar4 = plvVar7;
                pqoVar5 = pqoVar8;
                obj = obj4;
                psjVar2 = psjVar3;
                pkyVar3 = (pky) objP;
                if (pkyVar3.g()) {
                    pkyVar3.getClass();
                    return (pku) pkyVar3;
                }
                ?? r15 = this.d;
                String str8 = (String) pkyVar3.d();
                psjVar2.a = list4;
                psjVar2.b = obj;
                psjVar2.i = aierVar5;
                psjVar2.j = plvVar4;
                psjVar2.k = pqoVar5;
                psjVar2.c = pkyVar2;
                psjVar2.d = aiazVar2;
                psjVar2.e = pkyVar3;
                psjVar2.h = 4;
                aiazVar3 = aiazVar2;
                psj psjVar7 = psjVar2;
                List list12 = list4;
                ?? r23 = obj;
                objB = r15.b(list12, r23, str8, aiazVar3, psjVar7);
                list5 = list12;
                r14 = r23;
                psjVar3 = psjVar7;
                if (objB != awoxVar) {
                    return awoxVar;
                }
                objP = objB;
                pkyVar4 = pkyVar3;
                aierVar6 = aierVar5;
                aiazVar4 = aiazVar3;
                plvVar5 = plvVar4;
                pqoVar6 = pqoVar5;
                pkyVar5 = (pky) objP;
                if (pkyVar5.g()) {
                    psjVar3.a = pkyVar5;
                    psjVar3.b = null;
                    psjVar3.i = null;
                    psjVar3.j = null;
                    psjVar3.k = null;
                    psjVar3.c = null;
                    psjVar3.d = null;
                    psjVar3.e = null;
                    psjVar3.h = 5;
                    Objects.checkIndex(0, 3);
                    if (pkyVar5 == null) {
                        objK = awmy.a;
                    } else if (pkyVar5 instanceof puj) {
                        objK = l(plvVar5, psjVar3);
                        if (objK != awoxVar) {
                            objK = awmy.a;
                        }
                    } else if (pkyVar5 instanceof pkz) {
                        objK = k(pkyVar5, list5, r14, aierVar6, plvVar5, psjVar3);
                        if (objK != awoxVar) {
                            pkyVar5 = pkyVar5;
                            objK = awmy.a;
                        }
                    } else {
                        objK = awmy.a;
                    }
                    if (objK == awoxVar) {
                        return awoxVar;
                    }
                    pkyVar7 = pkyVar5;
                    pkyVar7.getClass();
                    return (pku) pkyVar7;
                }
                aierVar7 = aierVar6;
                r12 = this;
                pkyVar6 = pkyVar4;
                list6 = list5;
                objD2 = pkyVar5.d();
                if (objD2 == null) {
                    throw new IllegalStateException("Registration response is null");
                }
                pqqVar = (pqq) objD2;
                objD3 = pkyVar2.d();
                if (objD3 == null) {
                    throw new IllegalStateException("Registration request is null");
                }
                int iAo4 = qnl.ao((aiaz) objD3, list6, r14);
                if (plvVar5.a()) {
                    aibyVar = aiazVar4.d;
                    if (aibyVar == null) {
                        aibyVar = aiby.a;
                    }
                    aiahVar = aibyVar.d;
                    if (aiahVar == null) {
                        aiahVar = aiah.a;
                    }
                    if (aiahVar.b == 1) {
                        aiaoVar = (aiao) aiahVar.c;
                    } else {
                        aiaoVar = aiao.a;
                    }
                    str = aiaoVar.c;
                } else {
                    str = null;
                }
                ?? r4 = r12.d;
                String str9 = (String) pkyVar6.d();
                psjVar3.a = list6;
                psjVar3.b = null;
                psjVar3.i = null;
                psjVar3.j = null;
                psjVar3.k = null;
                psjVar3.c = null;
                psjVar3.d = null;
                psjVar3.e = null;
                psjVar3.h = 6;
                objP = r4.a(list6, r14, pqqVar, str9, iAo4, pqoVar6, plvVar5, aierVar7, str, psjVar3);
                r13 = r12;
                if (objP == awoxVar) {
                    return awoxVar;
                }
                pkyVar8 = (pky) objP;
                psjVar3.a = pkyVar8;
                psjVar3.h = 7;
                if (r13.o(pkyVar8, list6, psjVar3) != awoxVar) {
                    return pkyVar8;
                }
                return awoxVar;
            case 4:
                pkyVar4 = (pky) psjVar3.e;
                aiazVar4 = (aiaz) psjVar3.d;
                pkyVar2 = (pky) psjVar3.c;
                pqoVar5 = psjVar3.k;
                plvVar4 = psjVar3.j;
                aierVar6 = psjVar3.i;
                Object obj5 = psjVar3.b;
                list5 = (List) psjVar3.a;
                atqp.j(objP);
                r14 = obj5;
                plvVar5 = plvVar4;
                pqoVar6 = pqoVar5;
                pkyVar5 = (pky) objP;
                if (pkyVar5.g()) {
                    psjVar3.a = pkyVar5;
                    psjVar3.b = null;
                    psjVar3.i = null;
                    psjVar3.j = null;
                    psjVar3.k = null;
                    psjVar3.c = null;
                    psjVar3.d = null;
                    psjVar3.e = null;
                    psjVar3.h = 5;
                    Objects.checkIndex(0, 3);
                    if (pkyVar5 == null) {
                        objK = awmy.a;
                    } else if (pkyVar5 instanceof puj) {
                        objK = l(plvVar5, psjVar3);
                        if (objK != awoxVar) {
                            objK = awmy.a;
                        }
                    } else if (pkyVar5 instanceof pkz) {
                        objK = k(pkyVar5, list5, r14, aierVar6, plvVar5, psjVar3);
                        if (objK != awoxVar) {
                            pkyVar5 = pkyVar5;
                            objK = awmy.a;
                        }
                    } else {
                        objK = awmy.a;
                    }
                    if (objK == awoxVar) {
                        return awoxVar;
                    }
                    pkyVar7 = pkyVar5;
                    pkyVar7.getClass();
                    return (pku) pkyVar7;
                }
                aierVar7 = aierVar6;
                r12 = this;
                pkyVar6 = pkyVar4;
                list6 = list5;
                objD2 = pkyVar5.d();
                if (objD2 == null) {
                    throw new IllegalStateException("Registration response is null");
                }
                pqqVar = (pqq) objD2;
                objD3 = pkyVar2.d();
                if (objD3 == null) {
                    throw new IllegalStateException("Registration request is null");
                }
                int iAo5 = qnl.ao((aiaz) objD3, list6, r14);
                if (plvVar5.a()) {
                    aibyVar = aiazVar4.d;
                    if (aibyVar == null) {
                        aibyVar = aiby.a;
                    }
                    aiahVar = aibyVar.d;
                    if (aiahVar == null) {
                        aiahVar = aiah.a;
                    }
                    if (aiahVar.b == 1) {
                        aiaoVar = (aiao) aiahVar.c;
                    } else {
                        aiaoVar = aiao.a;
                    }
                    str = aiaoVar.c;
                } else {
                    str = null;
                }
                ?? r5 = r12.d;
                String str10 = (String) pkyVar6.d();
                psjVar3.a = list6;
                psjVar3.b = null;
                psjVar3.i = null;
                psjVar3.j = null;
                psjVar3.k = null;
                psjVar3.c = null;
                psjVar3.d = null;
                psjVar3.e = null;
                psjVar3.h = 6;
                objP = r5.a(list6, r14, pqqVar, str10, iAo5, pqoVar6, plvVar5, aierVar7, str, psjVar3);
                r13 = r12;
                if (objP == awoxVar) {
                    return awoxVar;
                }
                pkyVar8 = (pky) objP;
                psjVar3.a = pkyVar8;
                psjVar3.h = 7;
                if (r13.o(pkyVar8, list6, psjVar3) != awoxVar) {
                    return pkyVar8;
                }
                return awoxVar;
            case 5:
                pkyVar7 = (pky) psjVar3.a;
                atqp.j(objP);
                pkyVar7.getClass();
                return (pku) pkyVar7;
            case 6:
                list6 = (List) psjVar3.a;
                atqp.j(objP);
                r13 = this;
                pkyVar8 = (pky) objP;
                psjVar3.a = pkyVar8;
                psjVar3.h = 7;
                if (r13.o(pkyVar8, list6, psjVar3) != awoxVar) {
                    return pkyVar8;
                }
                return awoxVar;
            case 7:
                pky pkyVar10 = (pky) psjVar3.a;
                atqp.j(objP);
                return pkyVar10;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, pxu] */
    public final Object n(Map map, List list, pku pkuVar, awoq awoqVar) throws Throwable {
        psk pskVar;
        if (awoqVar instanceof psk) {
            pskVar = (psk) awoqVar;
            int i = pskVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pskVar.c = i - Integer.MIN_VALUE;
            } else {
                pskVar = new psk(this, awoqVar);
            }
        } else {
            pskVar = new psk(this, awoqVar);
        }
        Object obj = pskVar.a;
        awox awoxVar = awox.a;
        int i2 = pskVar.c;
        try {
            if (i2 == 0) {
                atqp.j(obj);
                Set setKeySet = map.keySet();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : setKeySet) {
                    if (list.contains((pxk) obj2)) {
                        arrayList.add(obj2);
                    } else {
                        arrayList2.add(obj2);
                    }
                }
                awml awmlVar = new awml(arrayList, arrayList2);
                List list2 = (List) awmlVar.a;
                List list3 = (List) awmlVar.b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list3) {
                    plx plxVar = (plx) map.get((pxk) obj3);
                    if (plxVar != null && plxVar.f == 5) {
                        arrayList3.add(obj3);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(awro.f(atqq.u(atqq.N(list2, 10)), 16));
                for (Object obj4 : list2) {
                    linkedHashMap.put(obj4, pkuVar);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(awro.f(atqq.u(atqq.N(arrayList3, 10)), 16));
                for (Object obj5 : arrayList3) {
                    linkedHashMap2.put(obj5, pkuVar);
                }
                ?? r7 = ((agfa) this.h).a;
                pskVar.c = 1;
                if (qnl.W(r7, linkedHashMap, linkedHashMap2, pskVar) == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(obj);
            }
        } catch (Exception e) {
            ((agsj) ((agsj) c.c()).j(e)).t("Failed to report registration results");
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(pky pkyVar, List list, awoq awoqVar) throws Throwable {
        psl pslVar;
        if (awoqVar instanceof psl) {
            pslVar = (psl) awoqVar;
            int i = pslVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pslVar.c = i - Integer.MIN_VALUE;
            } else {
                pslVar = new psl(this, awoqVar);
            }
        } else {
            pslVar = new psl(this, awoqVar);
        }
        psl pslVar2 = pslVar;
        Object objA = pslVar2.a;
        awox awoxVar = awox.a;
        int i2 = pslVar2.c;
        if (i2 == 0) {
            atqp.j(objA);
            if (this.p.j == 0 || (pkyVar.i() && list.isEmpty())) {
                ppy ppyVar = this.n;
                pslVar2.c = 1;
                if (ppyVar.a(17, null, null, pslVar2) == awoxVar) {
                    return awoxVar;
                }
            } else if (pkyVar.i()) {
                ppy ppyVar2 = this.n;
                ppw ppwVar = this.o;
                Bundle bundle = new Bundle();
                Long l = new Long(((prc) ppwVar).a);
                pslVar2.c = 2;
                objA = nxk.a(ppyVar2, ppwVar, null, bundle, l, pslVar2, 16);
                if (objA == awoxVar) {
                    return awoxVar;
                }
            }
        } else if (i2 == 1) {
            atqp.j(objA);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objA);
        }
        return awmy.a;
    }

    @Override // defpackage.ppw
    public final void h() {
    }

    @Override // defpackage.ppw
    public final void i() {
    }
}
