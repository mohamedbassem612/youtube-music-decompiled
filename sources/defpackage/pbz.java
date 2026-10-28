package defpackage;

import android.os.Bundle;
import j$.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pbz implements qbh {
    private static final agsn a = agsn.h("GnpSdk");
    private static final long b;
    private final pve c;
    private final pvg d;
    private final pav e;
    private final Set f;
    private final awou g;
    private final String h;
    private final tld i;
    private final tld j;
    private final tld k;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        b = 86400000L;
    }

    public pbz(pve pveVar, tld tldVar, tld tldVar2, tld tldVar3, pvg pvgVar, pav pavVar, Set set, awou awouVar) {
        pveVar.getClass();
        tldVar.getClass();
        tldVar2.getClass();
        tldVar3.getClass();
        pavVar.getClass();
        set.getClass();
        awouVar.getClass();
        this.c = pveVar;
        this.k = tldVar;
        this.i = tldVar2;
        this.j = tldVar3;
        this.d = pvgVar;
        this.e = pavVar;
        this.f = set;
        this.g = awouVar;
        this.h = "PERIODIC_TASK";
    }

    private final void h(plx plxVar) {
        paw pawVarB = this.e.b(ahzv.PERIODIC_LOG);
        if (plxVar != null) {
            pawVarB.f(plxVar);
        }
        pawVarB.a();
    }

    @Override // defpackage.qbh
    public final long a() {
        return b;
    }

    @Override // defpackage.qbh
    public final pky b(Bundle bundle) {
        return (pky) awqx.l(this.g, new gmc(this, bundle, (awoq) null, 11));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[LOOP:0: B:32:0x008a->B:53:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r9v0, types: [pbz] */
    @Override // defpackage.qbh
    public final Object c(Bundle bundle, awoq awoqVar) throws Throwable {
        pby pbyVar;
        Object obj;
        ?? it;
        plx plxVar;
        long jB;
        Object objA;
        if (awoqVar instanceof pby) {
            pbyVar = (pby) awoqVar;
            int i = pbyVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbyVar.d = i - Integer.MIN_VALUE;
            } else {
                pbyVar = new pby(this, awoqVar);
            }
        } else {
            pbyVar = new pby(this, awoqVar);
        }
        Object objC = pbyVar.b;
        awox awoxVar = awox.a;
        int i2 = pbyVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                atqp.j(objC);
            } else if (i2 == 2) {
                Object obj2 = pbyVar.a;
                atqp.j(objC);
                it = obj2;
                while (it.hasNext()) {
                    plxVar = (plx) it.next();
                    h(plxVar);
                    pbyVar.a = it;
                    pbyVar.d = 2;
                    if (g(plxVar, pbyVar) == awoxVar) {
                        return awoxVar;
                    }
                }
                pbyVar.a = null;
                pbyVar.d = 3;
                if (g(null, pbyVar) == awoxVar) {
                    return awoxVar;
                }
                pbyVar.d = 4;
                jB = auum.a.io().b();
                if (jB > 0) {
                    Duration durationOfMillis = Duration.ofMillis(jB);
                    durationOfMillis.getClass();
                    Map mapY = atqq.y(new awml(ptj.BUSINESS_EXPERIMENT, durationOfMillis), new awml(ptj.HEALTH_EXPERIMENT, Duration.ofDays(7L)));
                    pvz pvzVar = (pvz) this.d;
                    objA = nxe.a(pvzVar.e, new pvv(pvzVar, mapY, (awoq) null, 0), pbyVar);
                    if (objA != awoxVar) {
                        objA = awmy.a;
                    }
                    if (objA != awoxVar) {
                        objA = awmy.a;
                    }
                } else {
                    objA = awmy.a;
                }
                if (objA == awoxVar) {
                    return awoxVar;
                }
            } else if (i2 == 3) {
                atqp.j(objC);
                pbyVar.d = 4;
                jB = auum.a.io().b();
                if (jB > 0) {
                    Duration durationOfMillis2 = Duration.ofMillis(jB);
                    durationOfMillis2.getClass();
                    Map mapY2 = atqq.y(new awml(ptj.BUSINESS_EXPERIMENT, durationOfMillis2), new awml(ptj.HEALTH_EXPERIMENT, Duration.ofDays(7L)));
                    pvz pvzVar2 = (pvz) this.d;
                    objA = nxe.a(pvzVar2.e, new pvv(pvzVar2, mapY2, (awoq) null, 0), pbyVar);
                    if (objA != awoxVar) {
                        objA = awmy.a;
                    }
                    if (objA != awoxVar) {
                        objA = awmy.a;
                    }
                } else {
                    objA = awmy.a;
                }
                if (objA == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(objC);
            }
            return new pla(awmy.a);
        }
        atqp.j(objC);
        pve pveVar = this.c;
        pbyVar.d = 1;
        objC = pveVar.c(pbyVar);
        if (objC == awoxVar) {
            return awoxVar;
        }
        pky pkyVar = (pky) objC;
        int iAu = a.au(pkyVar);
        if (iAu == 0) {
            obj = ((pla) pkyVar).a;
        } else {
            if (iAu != 1) {
                throw new awmj();
            }
            ((agsj) ((agsj) a.c()).j(((pku) pkyVar).b())).t("Failed fetching accounts from storage");
            obj = awno.a;
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            h(null);
        } else {
            it = list.iterator();
            while (it.hasNext()) {
                plxVar = (plx) it.next();
                h(plxVar);
                pbyVar.a = it;
                pbyVar.d = 2;
                if (g(plxVar, pbyVar) == awoxVar) {
                    return awoxVar;
                }
            }
        }
        pbyVar.a = null;
        pbyVar.d = 3;
        if (g(null, pbyVar) == awoxVar) {
            return awoxVar;
        }
        pbyVar.d = 4;
        jB = auum.a.io().b();
        if (jB > 0) {
            Duration durationOfMillis3 = Duration.ofMillis(jB);
            durationOfMillis3.getClass();
            Map mapY3 = atqq.y(new awml(ptj.BUSINESS_EXPERIMENT, durationOfMillis3), new awml(ptj.HEALTH_EXPERIMENT, Duration.ofDays(7L)));
            pvz pvzVar3 = (pvz) this.d;
            objA = nxe.a(pvzVar3.e, new pvv(pvzVar3, mapY3, (awoq) null, 0), pbyVar);
            if (objA != awoxVar) {
                objA = awmy.a;
            }
            if (objA != awoxVar) {
                objA = awmy.a;
            }
        } else {
            objA = awmy.a;
        }
        if (objA == awoxVar) {
            return awoxVar;
        }
        return new pla(awmy.a);
    }

    @Override // defpackage.qbh
    public final String d() {
        return this.h;
    }

    @Override // defpackage.qbh
    public final boolean e() {
        return true;
    }

    @Override // defpackage.qbh
    public final int f() {
        return auum.d() ? 2 : 3;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:33:0x00df  */
    /* JADX WARN: Code duplicated, block: B:39:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[LOOP:0: B:21:0x009d->B:41:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.Iterator] */
    public final Object g(plx plxVar, awoq awoqVar) throws Throwable {
        pbx pbxVar;
        long jB;
        plx plxVar2;
        ?? it;
        pvf pvfVar;
        pyp pypVar;
        long jA;
        pfl pflVar;
        long jC;
        if (awoqVar instanceof pbx) {
            pbxVar = (pbx) awoqVar;
            int i = pbxVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbxVar.e = i - Integer.MIN_VALUE;
            } else {
                pbxVar = new pbx(this, awoqVar);
            }
        } else {
            pbxVar = new pbx(this, awoqVar);
        }
        Object obj = pbxVar.c;
        awox awoxVar = awox.a;
        int i2 = pbxVar.e;
        if (i2 == 0) {
            atqp.j(obj);
            jB = auwh.a.io().b();
            if (jB > 0) {
                tld tldVar = this.k;
                tld tldVar2 = new tld();
                tldVar2.A("thread_stored_timestamp");
                tldVar2.B("<= ?", Long.valueOf(tldVar.b.f().toEpochMilli() - jB));
                plxVar2 = plxVar;
                ((pfv) tldVar.a).e(plxVar2, agke.q(tldVar2.z()));
                it = this.f.iterator();
                while (it.hasNext()) {
                    pypVar = (pyp) it.next();
                    pbxVar.f = plxVar2;
                    pbxVar.a = it;
                    pbxVar.b = jB;
                    pbxVar.e = 1;
                    if (pypVar.b() != awoxVar) {
                        return awoxVar;
                    }
                }
                if (plxVar2 != null) {
                    pvfVar = (pvf) this.j.C(plxVar2);
                    pbxVar.f = plxVar2;
                    pbxVar.a = null;
                    pbxVar.e = 2;
                    if (pvfVar.a(jB, pbxVar) == awoxVar) {
                        return awoxVar;
                    }
                }
            } else {
                plxVar2 = plxVar;
            }
            auwh auwhVar = auwh.a;
            jA = auwhVar.io().a();
            if (jA > 0) {
                tld tldVar3 = this.k;
                tld tldVar4 = new tld();
                tldVar4.A("_id");
                tldVar4.A(" NOT IN (SELECT ");
                tldVar4.A("_id");
                tldVar4.A(" FROM ");
                tldVar4.A("threads");
                tldVar4.A(" ORDER BY ");
                tldVar4.A("last_notification_version");
                tldVar4.A(" DESC");
                tldVar4.B(" LIMIT ?)", Long.valueOf(jA));
                ((pfv) tldVar3.a).e(plxVar2, agke.q(tldVar4.z()));
            }
            pflVar = (pfl) this.i.C(plxVar2);
            jC = auwhVar.io().c();
            pbxVar.f = null;
            pbxVar.a = null;
            pbxVar.e = 3;
            if (pflVar.c(jC, pbxVar) == awoxVar) {
                return awoxVar;
            }
        } else if (i2 == 1) {
            jB = pbxVar.b;
            Object obj2 = pbxVar.a;
            plxVar2 = pbxVar.f;
            atqp.j(obj);
            it = obj2;
            while (it.hasNext()) {
                pypVar = (pyp) it.next();
                pbxVar.f = plxVar2;
                pbxVar.a = it;
                pbxVar.b = jB;
                pbxVar.e = 1;
                if (pypVar.b() != awoxVar) {
                    return awoxVar;
                }
            }
            if (plxVar2 != null) {
                pvfVar = (pvf) this.j.C(plxVar2);
                pbxVar.f = plxVar2;
                pbxVar.a = null;
                pbxVar.e = 2;
                if (pvfVar.a(jB, pbxVar) == awoxVar) {
                    return awoxVar;
                }
            }
            auwh auwhVar2 = auwh.a;
            jA = auwhVar2.io().a();
            if (jA > 0) {
                tld tldVar5 = this.k;
                tld tldVar6 = new tld();
                tldVar6.A("_id");
                tldVar6.A(" NOT IN (SELECT ");
                tldVar6.A("_id");
                tldVar6.A(" FROM ");
                tldVar6.A("threads");
                tldVar6.A(" ORDER BY ");
                tldVar6.A("last_notification_version");
                tldVar6.A(" DESC");
                tldVar6.B(" LIMIT ?)", Long.valueOf(jA));
                ((pfv) tldVar5.a).e(plxVar2, agke.q(tldVar6.z()));
            }
            pflVar = (pfl) this.i.C(plxVar2);
            jC = auwhVar2.io().c();
            pbxVar.f = null;
            pbxVar.a = null;
            pbxVar.e = 3;
            if (pflVar.c(jC, pbxVar) == awoxVar) {
                return awoxVar;
            }
        } else if (i2 == 2) {
            plx plxVar3 = pbxVar.f;
            atqp.j(obj);
            plxVar2 = plxVar3;
            auwh auwhVar3 = auwh.a;
            jA = auwhVar3.io().a();
            if (jA > 0) {
                tld tldVar7 = this.k;
                tld tldVar8 = new tld();
                tldVar8.A("_id");
                tldVar8.A(" NOT IN (SELECT ");
                tldVar8.A("_id");
                tldVar8.A(" FROM ");
                tldVar8.A("threads");
                tldVar8.A(" ORDER BY ");
                tldVar8.A("last_notification_version");
                tldVar8.A(" DESC");
                tldVar8.B(" LIMIT ?)", Long.valueOf(jA));
                ((pfv) tldVar7.a).e(plxVar2, agke.q(tldVar8.z()));
            }
            pflVar = (pfl) this.i.C(plxVar2);
            jC = auwhVar3.io().c();
            pbxVar.f = null;
            pbxVar.a = null;
            pbxVar.e = 3;
            if (pflVar.c(jC, pbxVar) == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        return awmy.a;
    }
}
