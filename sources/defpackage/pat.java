package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pat {
    private static final agsn a = agsn.h("GnpSdk");
    private final pfk b;
    private final phe c;
    private final pav d;
    private final Set e;
    private final axff f;
    private final grj g;
    private final tld h;

    public pat(pve pveVar, pfk pfkVar, tld tldVar, phe pheVar, pav pavVar, Set set, grj grjVar, awou awouVar) {
        pveVar.getClass();
        pfkVar.getClass();
        tldVar.getClass();
        pheVar.getClass();
        pavVar.getClass();
        set.getClass();
        awouVar.getClass();
        this.b = pfkVar;
        this.h = tldVar;
        this.c = pheVar;
        this.d = pavVar;
        this.e = set;
        this.g = grjVar;
        this.f = new axfi(false);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f5 A[Catch: all -> 0x007b, TryCatch #2 {all -> 0x007b, blocks: (B:30:0x0076, B:48:0x00ef, B:50:0x00f5, B:53:0x010f), top: B:69:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0131  */
    /* JADX WARN: Code duplicated, block: B:72:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[LOOP:0: B:48:0x00ef->B:74:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [pat] */
    /* JADX WARN: Type inference failed for: r2v9, types: [pat] */
    /* JADX WARN: Type inference failed for: r8v0, types: [pat] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r8v2, types: [axff] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [axff] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v3, types: [pat] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static /* synthetic */ Object b(pat patVar, plx plxVar, boolean z, awoq awoqVar) throws Throwable {
        pas pasVar;
        axff axffVar;
        ?? r8;
        phe pheVar;
        pbh pbhVarC;
        ?? r2;
        axff axffVar2;
        plx plxVar2;
        axff axffVar3;
        ?? it;
        ?? r3;
        pyp pypVar;
        if (awoqVar instanceof pas) {
            pasVar = (pas) awoqVar;
            int i = pasVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pasVar.e = i - Integer.MIN_VALUE;
            } else {
                pasVar = new pas(patVar, awoqVar);
            }
        } else {
            pasVar = new pas(patVar, awoqVar);
        }
        Object obj = pasVar.c;
        Object obj2 = awox.a;
        int i2 = pasVar.e;
        try {
            if (i2 == 0) {
                atqp.j(obj);
                axffVar = ((pat) patVar).f;
                pasVar.f = patVar;
                pasVar.g = plxVar;
                pasVar.h = (axfi) axffVar;
                pasVar.b = z;
                pasVar.e = 1;
                if (axffVar.a(pasVar) != obj2) {
                }
                r8 = patVar;
                return obj2;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    axffVar2 = pasVar.h;
                    plxVar = pasVar.g;
                    pat patVar2 = pasVar.f;
                    atqp.j(obj);
                    r2 = patVar2;
                    plxVar2 = plxVar;
                    axffVar3 = axffVar2;
                    it = ((pat) r2).e.iterator();
                    r3 = r2;
                    while (it.hasNext()) {
                        pypVar = (pyp) it.next();
                        pasVar.f = r3;
                        pasVar.g = plxVar2;
                        pasVar.h = (axfi) axffVar3;
                        pasVar.a = it;
                        pasVar.e = 3;
                        if (pypVar.c() == obj2) {
                            r8 = patVar;
                            return obj2;
                        }
                    }
                    ((pat) r3).b.c(plxVar2);
                    ((pfv) ((pat) r3).h.a).d(plxVar2);
                    pasVar.f = r3;
                    pasVar.g = plxVar2;
                    pasVar.h = (axfi) axffVar3;
                    pasVar.a = null;
                    pasVar.e = 4;
                    if (r3.a(plxVar2, pasVar) != obj2) {
                        patVar = axffVar3;
                        obj2 = awmy.a;
                        patVar.c();
                    }
                    r8 = patVar;
                    return obj2;
                }
                if (i2 == 3) {
                    Object obj3 = pasVar.a;
                    axffVar3 = pasVar.h;
                    plxVar2 = pasVar.g;
                    pat patVar3 = pasVar.f;
                    try {
                        atqp.j(obj);
                        r3 = patVar3;
                        it = obj3;
                        while (it.hasNext()) {
                            pypVar = (pyp) it.next();
                            pasVar.f = r3;
                            pasVar.g = plxVar2;
                            pasVar.h = (axfi) axffVar3;
                            pasVar.a = it;
                            pasVar.e = 3;
                            if (pypVar.c() == obj2) {
                                r8 = patVar;
                                return obj2;
                            }
                        }
                        ((pat) r3).b.c(plxVar2);
                        ((pfv) ((pat) r3).h.a).d(plxVar2);
                        pasVar.f = r3;
                        pasVar.g = plxVar2;
                        pasVar.h = (axfi) axffVar3;
                        pasVar.a = null;
                        pasVar.e = 4;
                        if (r3.a(plxVar2, pasVar) != obj2) {
                            patVar = axffVar3;
                        }
                        r8 = patVar;
                        return obj2;
                    } catch (Throwable th) {
                        axff axffVar4 = axffVar3;
                        th = th;
                        patVar = axffVar4;
                        patVar.c();
                        throw th;
                    }
                }
                if (i2 == 4) {
                    axfi axfiVar = pasVar.h;
                    plx plxVar3 = pasVar.g;
                    atqp.j(obj);
                    patVar = axfiVar;
                } else {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    axff axffVar5 = (axff) pasVar.f;
                    atqp.j(obj);
                    pky pkyVar = (pky) obj;
                    if (pkyVar instanceof pku) {
                        ((agsj) ((agsj) a.c()).j(((pku) pkyVar).b())).t("Failed deleting account from storage");
                    }
                    patVar = axffVar5;
                    if (pkyVar instanceof pla) {
                        ((Number) ((pla) pkyVar).a).intValue();
                        patVar = axffVar5;
                    }
                }
                obj2 = awmy.a;
                patVar.c();
                r8 = patVar;
                return obj2;
            }
            z = pasVar.b;
            axfi axfiVar2 = pasVar.h;
            plxVar = pasVar.g;
            pat patVar4 = pasVar.f;
            atqp.j(obj);
            axffVar = axfiVar2;
            r8 = patVar4;
            if (z) {
                try {
                    paw pawVarB = ((pat) r8).d.b(ahzv.NOTIFICATION_DATA_CLEANED);
                    pawVarB.f(plxVar);
                    pawVarB.a();
                    pheVar = ((pat) r8).c;
                    xyg xygVar = new xyg();
                    xygVar.d(ahza.ACCOUNT_DATA_CLEANED);
                    pbhVarC = xygVar.c();
                    pasVar.f = r8;
                    pasVar.g = plxVar;
                    pasVar.h = (axfi) axffVar;
                    pasVar.e = 2;
                    if (pheVar.b(plxVar, pbhVarC, pasVar) != obj2) {
                        r2 = r8;
                        axffVar2 = axffVar;
                        plxVar2 = plxVar;
                        axffVar3 = axffVar2;
                        it = ((pat) r2).e.iterator();
                        r3 = r2;
                        while (it.hasNext()) {
                            pypVar = (pyp) it.next();
                            pasVar.f = r3;
                            pasVar.g = plxVar2;
                            pasVar.h = (axfi) axffVar3;
                            pasVar.a = it;
                            pasVar.e = 3;
                            if (pypVar.c() == obj2) {
                            }
                        }
                        ((pat) r3).b.c(plxVar2);
                        ((pfv) ((pat) r3).h.a).d(plxVar2);
                        pasVar.f = r3;
                        pasVar.g = plxVar2;
                        pasVar.h = (axfi) axffVar3;
                        pasVar.a = null;
                        pasVar.e = 4;
                        if (r3.a(plxVar2, pasVar) != obj2) {
                            patVar = axffVar3;
                            obj2 = awmy.a;
                            patVar.c();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    patVar = axffVar;
                    patVar.c();
                    throw th;
                }
            } else {
                pheVar = ((pat) r8).c;
                xyg xygVar2 = new xyg();
                xygVar2.d(ahza.ACCOUNT_DATA_CLEANED);
                pbhVarC = xygVar2.c();
                pasVar.f = r8;
                pasVar.g = plxVar;
                pasVar.h = (axfi) axffVar;
                pasVar.e = 2;
                if (pheVar.b(plxVar, pbhVarC, pasVar) != obj2) {
                    r2 = r8;
                    axffVar2 = axffVar;
                    plxVar2 = plxVar;
                    axffVar3 = axffVar2;
                    it = ((pat) r2).e.iterator();
                    r3 = r2;
                    while (it.hasNext()) {
                        pypVar = (pyp) it.next();
                        pasVar.f = r3;
                        pasVar.g = plxVar2;
                        pasVar.h = (axfi) axffVar3;
                        pasVar.a = it;
                        pasVar.e = 3;
                        if (pypVar.c() == obj2) {
                        }
                    }
                    ((pat) r3).b.c(plxVar2);
                    ((pfv) ((pat) r3).h.a).d(plxVar2);
                    pasVar.f = r3;
                    pasVar.g = plxVar2;
                    pasVar.h = (axfi) axffVar3;
                    pasVar.a = null;
                    pasVar.e = 4;
                    if (r3.a(plxVar2, pasVar) != obj2) {
                        patVar = axffVar3;
                        obj2 = awmy.a;
                        patVar.c();
                    }
                }
            }
            r8 = patVar;
            return obj2;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(plx plxVar, awoq awoqVar) throws Throwable {
        par parVar;
        if (awoqVar instanceof par) {
            parVar = (par) awoqVar;
            int i = parVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                parVar.c = i - Integer.MIN_VALUE;
            } else {
                parVar = new par(this, awoqVar);
            }
        } else {
            parVar = new par(this, awoqVar);
        }
        Object objH = parVar.a;
        awox awoxVar = awox.a;
        int i2 = parVar.c;
        if (i2 == 0) {
            atqp.j(objH);
            if (plxVar != null) {
                grj grjVar = this.g;
                parVar.c = 1;
                objH = grjVar.h(plxVar, parVar);
                if (objH == awoxVar) {
                    return awoxVar;
                }
            }
            return awmy.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atqp.j(objH);
        pky pkyVar = (pky) objH;
        if (pkyVar instanceof pku) {
            ((agsj) ((agsj) a.c()).j(((pku) pkyVar).b())).t("Failed to clear notifications count cache");
        }
        return awmy.a;
    }
}
