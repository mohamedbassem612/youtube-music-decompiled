package defpackage;

import com.google.protobuf.MessageLite;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pgr implements per {
    private static final agsn a = agsn.h("GnpSdk");
    private final pct b;
    private final pve c;
    private final pav d;
    private final mbc e;

    public pgr(pct pctVar, pve pveVar, pav pavVar, mbc mbcVar) {
        pctVar.getClass();
        pveVar.getClass();
        pavVar.getClass();
        mbcVar.getClass();
        this.b = pctVar;
        this.c = pveVar;
        this.d = pavVar;
        this.e = mbcVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:44:0x0102  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.per
    public final Object a(plx plxVar, MessageLite messageLite, MessageLite messageLite2, awoq awoqVar) throws Throwable {
        pgq pgqVar;
        aiaw aiawVar;
        aiax aiaxVar;
        aiaw aiawVar2;
        aiax aiaxVar2;
        String str;
        aidy aidyVarA;
        List listAm;
        List list;
        pct pctVar;
        plb plbVarC;
        pax paxVar;
        pky pkyVar;
        if (awoqVar instanceof pgq) {
            pgqVar = (pgq) awoqVar;
            int i = pgqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pgqVar.c = i - Integer.MIN_VALUE;
            } else {
                pgqVar = new pgq(this, awoqVar);
            }
        } else {
            pgqVar = new pgq(this, awoqVar);
        }
        pgq pgqVar2 = pgqVar;
        Object objE = pgqVar2.a;
        awox awoxVar = awox.a;
        int i2 = pgqVar2.c;
        int i3 = 1;
        if (i2 == 0) {
            atqp.j(objE);
            aiawVar = (aiaw) messageLite;
            aiaxVar = (aiax) messageLite2;
            if (plxVar != null && (str = plxVar.b) != null) {
                nxp.a(str);
            }
            if (aiaxVar != null) {
                new Integer(aiaxVar.c.size());
            }
            if (plxVar != null && aiawVar != null && aiaxVar != null) {
                long j = aiaxVar.d;
                if (j > plxVar.j) {
                    plw plwVar = new plw(plxVar);
                    plwVar.j(j);
                    plxVar = plwVar.a();
                    pve pveVar = this.c;
                    List listH = atqq.H(plxVar);
                    pgqVar2.d = aiawVar;
                    pgqVar2.e = aiaxVar;
                    pgqVar2.f = plxVar;
                    pgqVar2.c = 1;
                    objE = pveVar.e(listH, pgqVar2);
                    if (objE == awoxVar) {
                        return awoxVar;
                    }
                    aiawVar2 = aiawVar;
                    aiaxVar2 = aiaxVar;
                    pkyVar = (pky) objE;
                    if (pkyVar instanceof pku) {
                        ((agsj) ((agsj) a.c()).j(((pku) pkyVar).b())).t("Failed to update account");
                    }
                    aiaw aiawVar3 = aiawVar2;
                    aiaxVar = aiaxVar2;
                    aiawVar = aiawVar3;
                    if (aiaxVar.c.size() > 0) {
                        mbc mbcVar = this.e;
                        long micros = TimeUnit.MILLISECONDS.toMicros(mbcVar.f().toEpochMilli());
                        paw pawVarB = this.d.b(ahzv.FETCHED_UPDATED_THREADS);
                        int i4 = pgm.b;
                        aidyVarA = aidy.a(aiawVar.h);
                        if (aidyVarA == null) {
                            aidyVarA = aidy.FETCH_REASON_UNSPECIFIED;
                        }
                        ((pbc) pawVarB).t = qnl.aD(aidyVarA);
                        pawVarB.f(plxVar);
                        aiie aiieVar = aiaxVar.c;
                        aiieVar.getClass();
                        pawVarB.h(aiieVar);
                        pawVarB.i(micros);
                        pawVarB.a();
                        if (auwb.d()) {
                            aiie aiieVar2 = aiaxVar.c;
                            aiieVar2.getClass();
                            listAm = atqq.am(aiieVar2, new rit(i3));
                        } else {
                            listAm = aiaxVar.c;
                            listAm.getClass();
                        }
                        list = listAm;
                        pctVar = this.b;
                        plbVarC = plb.c();
                        paxVar = new pax(new Long(micros), new Long(mbcVar.b()), 5);
                        pgqVar2.d = null;
                        pgqVar2.e = null;
                        pgqVar2.f = null;
                        pgqVar2.c = 2;
                        if (pctVar.b(plxVar, list, plbVarC, paxVar, false, false, pgqVar2) == awoxVar) {
                            return awoxVar;
                        }
                    }
                } else if (aiaxVar.c.size() > 0) {
                    mbc mbcVar2 = this.e;
                    long micros2 = TimeUnit.MILLISECONDS.toMicros(mbcVar2.f().toEpochMilli());
                    paw pawVarB2 = this.d.b(ahzv.FETCHED_UPDATED_THREADS);
                    int i5 = pgm.b;
                    aidyVarA = aidy.a(aiawVar.h);
                    if (aidyVarA == null) {
                        aidyVarA = aidy.FETCH_REASON_UNSPECIFIED;
                    }
                    ((pbc) pawVarB2).t = qnl.aD(aidyVarA);
                    pawVarB2.f(plxVar);
                    aiie aiieVar3 = aiaxVar.c;
                    aiieVar3.getClass();
                    pawVarB2.h(aiieVar3);
                    pawVarB2.i(micros2);
                    pawVarB2.a();
                    if (auwb.d()) {
                        aiie aiieVar4 = aiaxVar.c;
                        aiieVar4.getClass();
                        listAm = atqq.am(aiieVar4, new rit(i3));
                    } else {
                        listAm = aiaxVar.c;
                        listAm.getClass();
                    }
                    list = listAm;
                    pctVar = this.b;
                    plbVarC = plb.c();
                    paxVar = new pax(new Long(micros2), new Long(mbcVar2.b()), 5);
                    pgqVar2.d = null;
                    pgqVar2.e = null;
                    pgqVar2.f = null;
                    pgqVar2.c = 2;
                    if (pctVar.b(plxVar, list, plbVarC, paxVar, false, false, pgqVar2) == awoxVar) {
                        return awoxVar;
                    }
                }
            }
        } else if (i2 == 1) {
            plxVar = pgqVar2.f;
            aiaxVar2 = pgqVar2.e;
            aiawVar2 = pgqVar2.d;
            atqp.j(objE);
            pkyVar = (pky) objE;
            if (pkyVar instanceof pku) {
                ((agsj) ((agsj) a.c()).j(((pku) pkyVar).b())).t("Failed to update account");
            }
            aiaw aiawVar4 = aiawVar2;
            aiaxVar = aiaxVar2;
            aiawVar = aiawVar4;
            if (aiaxVar.c.size() > 0) {
                mbc mbcVar3 = this.e;
                long micros3 = TimeUnit.MILLISECONDS.toMicros(mbcVar3.f().toEpochMilli());
                paw pawVarB3 = this.d.b(ahzv.FETCHED_UPDATED_THREADS);
                int i6 = pgm.b;
                aidyVarA = aidy.a(aiawVar.h);
                if (aidyVarA == null) {
                    aidyVarA = aidy.FETCH_REASON_UNSPECIFIED;
                }
                ((pbc) pawVarB3).t = qnl.aD(aidyVarA);
                pawVarB3.f(plxVar);
                aiie aiieVar5 = aiaxVar.c;
                aiieVar5.getClass();
                pawVarB3.h(aiieVar5);
                pawVarB3.i(micros3);
                pawVarB3.a();
                if (auwb.d()) {
                    aiie aiieVar6 = aiaxVar.c;
                    aiieVar6.getClass();
                    listAm = atqq.am(aiieVar6, new rit(i3));
                } else {
                    listAm = aiaxVar.c;
                    listAm.getClass();
                }
                list = listAm;
                pctVar = this.b;
                plbVarC = plb.c();
                paxVar = new pax(new Long(micros3), new Long(mbcVar3.b()), 5);
                pgqVar2.d = null;
                pgqVar2.e = null;
                pgqVar2.f = null;
                pgqVar2.c = 2;
                if (pctVar.b(plxVar, list, plbVarC, paxVar, false, false, pgqVar2) == awoxVar) {
                    return awoxVar;
                }
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objE);
        }
        return awmy.a;
    }

    @Override // defpackage.per
    public final Object b(plx plxVar, MessageLite messageLite, awoq awoqVar) {
        String str;
        if (plxVar != null && (str = plxVar.b) != null) {
            nxp.a(str);
        }
        return awmy.a;
    }
}
