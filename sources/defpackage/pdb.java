package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pdb implements pct {
    private static final agsn c = agsn.h("GnpSdk");
    public final pcy a;
    public final awou b;
    private final pdk d;
    private final pdn e;
    private final pls f;
    private final pwf g;
    private final Context h;

    public pdb(pcy pcyVar, pdk pdkVar, pdn pdnVar, awou awouVar, pls plsVar, pwf pwfVar, Context context) {
        pcyVar.getClass();
        pdkVar.getClass();
        awouVar.getClass();
        plsVar.getClass();
        pwfVar.getClass();
        context.getClass();
        this.a = pcyVar;
        this.d = pdkVar;
        this.e = pdnVar;
        this.b = awouVar;
        this.f = plsVar;
        this.g = pwfVar;
        this.h = context;
    }

    @Override // defpackage.pct
    public final Object a(pbf pbfVar, awoq awoqVar) {
        Object objA = this.e.a(pbfVar, awoqVar);
        return objA != awox.a ? awmy.a : objA;
    }

    @Override // defpackage.pct
    public final Object b(plx plxVar, List list, plb plbVar, pax paxVar, boolean z, boolean z2, awoq awoqVar) throws Throwable {
        Object objC = c(plxVar, list, plbVar, paxVar, z, z2, awoqVar);
        return objC != awox.a ? awmy.a : objC;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:56:0x0152  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [pax, plb] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, pax, plb, plx] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    public final Object c(plx plxVar, List list, plb plbVar, pax paxVar, boolean z, boolean z2, awoq awoqVar) throws Throwable {
        pcz pczVar;
        pcz pczVar2;
        ?? r12;
        plx plxVar2;
        ?? r3;
        plb plbVar2;
        pax paxVar2;
        boolean z3;
        boolean z4;
        List list2;
        List list3;
        plx plxVar3;
        Object obj;
        boolean z5;
        Object obj2;
        long j;
        pda pdaVar;
        Object obj3;
        ?? r13;
        ?? r14;
        Object obj4;
        boolean z6;
        ?? r15;
        ?? r16;
        ?? r2;
        pdk pdkVar;
        ?? r17;
        if (awoqVar instanceof pcz) {
            pczVar = (pcz) awoqVar;
            int i = pczVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pczVar.f = i - Integer.MIN_VALUE;
            } else {
                pczVar = new pcz(this, awoqVar);
            }
        } else {
            pczVar = new pcz(this, awoqVar);
        }
        pcz pczVar3 = pczVar;
        Object objD = pczVar3.d;
        awox awoxVar = awox.a;
        int i2 = pczVar3.f;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    boolean z7 = pczVar3.c;
                    boolean z8 = pczVar3.b;
                    paxVar2 = pczVar3.g;
                    plb plbVar3 = pczVar3.i;
                    Object obj5 = pczVar3.a;
                    plx plxVar4 = pczVar3.h;
                    atqp.j(objD);
                    plbVar2 = plbVar3;
                    pczVar2 = pczVar3;
                    r12 = 0;
                    z3 = z8;
                    r3 = obj5;
                    z4 = z7;
                    plxVar2 = plxVar4;
                    list2 = (List) objD;
                    if (!plbVar2.e()) {
                        plbVar2.a();
                        try {
                            int i3 = awtl.b;
                            j = awrc.j(plbVar2.a(), awtn.MILLISECONDS);
                            list3 = list2;
                            try {
                                pdaVar = new pda(this, plxVar2, r3, plbVar2, paxVar2, z3, z4, null, 0);
                                pczVar2.h = plxVar2;
                                pczVar2.a = list3;
                                pczVar2.i = r12;
                                pczVar2.g = r12;
                                pczVar2.f = 3;
                                if (avkz.q(j, pdaVar, pczVar2) != awoxVar) {
                                    return awoxVar;
                                }
                                plxVar3 = plxVar2;
                                obj3 = list3;
                                r17 = r12;
                                z6 = true;
                                r2 = obj3;
                                r16 = r17;
                                if (z6) {
                                    pdkVar = this.d;
                                    pczVar2.h = r16;
                                    pczVar2.a = r16;
                                    pczVar2.i = r16;
                                    pczVar2.g = r16;
                                    pczVar2.f = 4;
                                    if (pdk.b(pdkVar, plxVar3, r2, pczVar2) == awoxVar) {
                                        return awoxVar;
                                    }
                                }
                            } catch (awxi e) {
                                e = e;
                                z5 = false;
                                plxVar3 = plxVar2;
                                obj2 = list3;
                                r15 = r12;
                                ((agsj) ((agsj) c.c()).j(e)).t("Operation hit a timeout, Retrying in scheduled notification receiver.");
                                pwf pwfVar = this.g;
                                Context context = this.h;
                                pls plsVar = this.f;
                                pwfVar.b(context.getPackageName(), plsVar.a, true, nvv.a(e));
                                obj4 = obj2;
                                r14 = r15;
                                z6 = z5;
                                r2 = obj4;
                                r16 = r14;
                            } catch (Exception e2) {
                                e = e2;
                                plxVar3 = plxVar2;
                                obj = list3;
                                r13 = r12;
                                ((agsj) ((agsj) c.c()).j(e)).t("onNotificationReceived operation failed, Retrying in scheduled notification receiver.");
                                pwf pwfVar2 = this.g;
                                Context context2 = this.h;
                                pls plsVar2 = this.f;
                                z5 = false;
                                pwfVar2.b(context2.getPackageName(), plsVar2.a, false, nvv.a(e));
                                obj4 = obj;
                                r14 = r13;
                                z6 = z5;
                                r2 = obj4;
                                r16 = r14;
                            }
                        } catch (awxi e3) {
                            e = e3;
                            list3 = list2;
                        } catch (Exception e4) {
                            e = e4;
                            list3 = list2;
                        }
                    }
                } else if (i2 == 3) {
                    Object obj6 = pczVar3.a;
                    plxVar3 = pczVar3.h;
                    try {
                        atqp.j(objD);
                        pczVar2 = pczVar3;
                        r17 = 0;
                        obj3 = obj6;
                        z6 = true;
                        r2 = obj3;
                        r16 = r17;
                    } catch (awxi e5) {
                        e = e5;
                        pczVar2 = pczVar3;
                        z5 = false;
                        r15 = 0;
                        obj2 = obj6;
                        ((agsj) ((agsj) c.c()).j(e)).t("Operation hit a timeout, Retrying in scheduled notification receiver.");
                        pwf pwfVar3 = this.g;
                        Context context3 = this.h;
                        pls plsVar3 = this.f;
                        pwfVar3.b(context3.getPackageName(), plsVar3.a, true, nvv.a(e));
                        obj4 = obj2;
                        r14 = r15;
                        z6 = z5;
                        r2 = obj4;
                        r16 = r14;
                    } catch (Exception e6) {
                        e = e6;
                        pczVar2 = pczVar3;
                        r13 = 0;
                        obj = obj6;
                        ((agsj) ((agsj) c.c()).j(e)).t("onNotificationReceived operation failed, Retrying in scheduled notification receiver.");
                        pwf pwfVar4 = this.g;
                        Context context4 = this.h;
                        pls plsVar4 = this.f;
                        z5 = false;
                        pwfVar4.b(context4.getPackageName(), plsVar4.a, false, nvv.a(e));
                        obj4 = obj;
                        r14 = r13;
                        z6 = z5;
                        r2 = obj4;
                        r16 = r14;
                    }
                    if (z6 && !r2.isEmpty()) {
                        pdkVar = this.d;
                        pczVar2.h = r16;
                        pczVar2.a = r16;
                        pczVar2.i = r16;
                        pczVar2.g = r16;
                        pczVar2.f = 4;
                        if (pdk.b(pdkVar, plxVar3, r2, pczVar2) == awoxVar) {
                            return awoxVar;
                        }
                    }
                } else if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            atqp.j(objD);
        } else {
            atqp.j(objD);
            if (plbVar.f()) {
                pcy pcyVar = this.a;
                pczVar3.f = 1;
                if (pcy.b(pcyVar, plxVar, list, plbVar, paxVar, z, false, true, z2, pczVar3) == awoxVar) {
                    return awoxVar;
                }
            } else {
                pdk pdkVar2 = this.d;
                long jA = plbVar.a() + 5000;
                pczVar3.h = plxVar;
                pczVar3.a = list;
                pczVar3.i = plbVar;
                pczVar3.g = paxVar;
                pczVar3.b = z;
                pczVar3.c = z2;
                pczVar3.f = 2;
                pczVar2 = pczVar3;
                r12 = 0;
                objD = pdk.d(pdkVar2, plxVar, list, jA, paxVar, z, z2, pczVar2);
                if (objD == awoxVar) {
                    return awoxVar;
                }
                plxVar2 = plxVar;
                r3 = list;
                plbVar2 = plbVar;
                paxVar2 = paxVar;
                z3 = z;
                z4 = z2;
                list2 = (List) objD;
                if (!plbVar2.e()) {
                    plbVar2.a();
                    int i4 = awtl.b;
                    j = awrc.j(plbVar2.a(), awtn.MILLISECONDS);
                    list3 = list2;
                    pdaVar = new pda(this, plxVar2, r3, plbVar2, paxVar2, z3, z4, null, 0);
                    pczVar2.h = plxVar2;
                    pczVar2.a = list3;
                    pczVar2.i = r12;
                    pczVar2.g = r12;
                    pczVar2.f = 3;
                    if (avkz.q(j, pdaVar, pczVar2) != awoxVar) {
                        return awoxVar;
                    }
                    plxVar3 = plxVar2;
                    obj3 = list3;
                    r17 = r12;
                    z6 = true;
                    r2 = obj3;
                    r16 = r17;
                    if (z6) {
                        pdkVar = this.d;
                        pczVar2.h = r16;
                        pczVar2.a = r16;
                        pczVar2.i = r16;
                        pczVar2.g = r16;
                        pczVar2.f = 4;
                        if (pdk.b(pdkVar, plxVar3, r2, pczVar2) == awoxVar) {
                            return awoxVar;
                        }
                    }
                }
            }
        }
        return awmy.a;
    }
}
