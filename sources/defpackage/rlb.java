package defpackage;

import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rlb implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ rlb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, rsq] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        wgi wgiVar;
        ofg ofgVarK;
        int i = 9;
        switch (this.$cid) {
            case 0:
                this.a.invoke(obj);
                return;
            case 1:
                this.a.invoke(obj);
                return;
            case 2:
                this.a.invoke(obj);
                return;
            case 3:
                aihf aihfVar = (aihf) obj;
                rrq rrqVar = (rrq) this.a;
                if (((vxz) rrqVar.e).l(0, 45371409L, false)) {
                    xeu xeuVar = (xeu) rrqVar.c;
                    if (xeuVar.b) {
                        xff xffVarA = xeuVar.a(aihfVar, alot.NETWORK_CRONET_RTT_SUMMARY);
                        ztf ztfVar = xffVarA.k.e;
                        xffVarA.l = ztfVar.a();
                        ztfVar.k(xffVarA);
                        return;
                    }
                    alos alosVar = (alos) alou.a.createBuilder();
                    alosVar.copyOnWrite();
                    alou alouVar = (alou) alosVar.instance;
                    aobe aobeVar = (aobe) aihfVar.build();
                    aobeVar.getClass();
                    alouVar.d = aobeVar;
                    alouVar.c = 433;
                    xeuVar.b((alou) alosVar.build());
                    return;
                }
                return;
            case 4:
                rrs rrsVar = (rrs) obj;
                aobj aobjVar = rrsVar.b;
                Object obj2 = this.a;
                rrt rrtVar = (rrt) obj2;
                rrtVar.b = aobjVar;
                toi toiVar = rrsVar.a;
                List list = rrtVar.d;
                synchronized (list) {
                    if (list.isEmpty()) {
                        ((rrt) obj2).e(toiVar);
                    } else {
                        vxz vxzVar = ((rrt) obj2).e;
                        if (vxzVar.l(9, 45420219L, false)) {
                            AtomicBoolean atomicBoolean = ((rrt) obj2).c;
                            if (atomicBoolean.get()) {
                                ((rrt) obj2).d(rrsVar.b);
                                ((rrt) obj2).e(toiVar);
                                atomicBoolean.set(false);
                            }
                        }
                        if (Math.abs(toiVar.b - ((toi) list.get(0)).b) >= vxzVar.c(0, 45371410L, 0L) * 1000) {
                            ((rrt) obj2).d(aobjVar);
                            ((rrt) obj2).e(toiVar);
                        } else {
                            synchronized (list) {
                                try {
                                    list.add(toiVar);
                                    if (vxzVar.c(1, 45371411L, 0L) > 0 && list.size() >= vxzVar.c(1, 45371411L, 0L)) {
                                        synchronized (list) {
                                            try {
                                                if (!list.isEmpty() && list.size() != 1) {
                                                    list.remove(0);
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    }
                    break;
                }
                return;
            case 5:
                Object obj3 = this.a;
                List list2 = ((rrt) obj3).d;
                rrr rrrVar = (rrr) obj;
                synchronized (list2) {
                    if (!list2.isEmpty()) {
                        ((rrt) obj3).d(rrrVar.a);
                        list2.clear();
                    }
                    break;
                }
                return;
            case 6:
                aobj aobjVar2 = (aobj) obj;
                rrz rrzVar = (rrz) this.a;
                rrzVar.c = aobjVar2;
                rrm rrmVarA = rrn.a();
                rrmVarA.b(aobjVar2);
                tfq tfqVar = (tfq) rrzVar.a.io();
                int i2 = tfqVar.j(0) ? 2 : tfqVar.j(1) ? 3 : 1;
                awku awkuVar = rrzVar.b;
                rrmVarA.a = i2;
                awkuVar.kk(rrmVarA.a());
                return;
            case 7:
                ((rts) this.a).s.a("upt", String.format(Locale.US, "luat.%d", (Long) obj));
                return;
            case 8:
                acip acipVar = (acip) obj;
                ((rts) this.a).j(acipVar.au(), acipVar.a());
                return;
            case 9:
                ((rts) this.a).k(((aaxl) obj).a);
                return;
            case 10:
                rme rmeVar = new rme((aaxa) obj, i);
                rts rtsVar = (rts) this.a;
                rtsVar.i(rmeVar, taq.ac(rtsVar.D) ? agkz.q(rtsVar.C, rtsVar.i) : new agqj(rtsVar.i));
                return;
            case 11:
                this.a.e((aaxa) obj);
                return;
            case 12:
                aaza aazaVar = (aaza) obj;
                boolean z = aazaVar.g;
                Object obj4 = this.a;
                if (!z) {
                    ((ruw) obj4).b = Optional.empty();
                    return;
                }
                ruw ruwVar = (ruw) obj4;
                if (ruwVar.b.isPresent()) {
                    rmp.n(null, "Unexpected update to expectedAdStartTimeMs");
                }
                long j = aazaVar.f;
                if (j < 0 && !aazaVar.d.equals(aazaVar.a)) {
                    rmp.n(null, "Expected valid expectedAdStartTimeMs");
                }
                ruwVar.b = Optional.of(aazaVar);
                rst rstVar = ruwVar.c;
                String str = aazaVar.b;
                String str2 = aazaVar.a;
                String str3 = aazaVar.d;
                ((sbt) rstVar).c(str2);
                Iterator it = ruwVar.a.iterator();
                while (it.hasNext()) {
                    ((rst) it.next()).O(str, str2, str3);
                }
                if ((aazaVar.j.T() || ruwVar.e.ao()) && !str2.equals(str3)) {
                    ruu ruuVar = (ruu) ruwVar.d.io();
                    Locale locale = Locale.US;
                    long j2 = aazaVar.e;
                    ruuVar.a("ster", String.format(locale, "ccpn.%s;ocpn.%s;tmtms.%d;adstms.%d", str2, str, Long.valueOf(j2), Long.valueOf(j)));
                    ruwVar.c(aazaVar, j2 - j);
                    return;
                }
                return;
            case 13:
                aazk aazkVar = (aazk) obj;
                ruw ruwVar2 = (ruw) this.a;
                if (ruwVar2.b.isEmpty()) {
                    return;
                }
                aaza aazaVar2 = (aaza) ruwVar2.b.get();
                long j3 = aazkVar.a - aazaVar2.f;
                if (j3 < 0) {
                    if (ruwVar2.e.ao()) {
                        rmp.k(null, "Expected current position after ad video start time");
                    } else {
                        rmp.n(null, "Expected current position after ad video start time");
                    }
                }
                ruwVar2.c(aazaVar2, j3);
                return;
            case 14:
                ((rxh) this.a).w(((aazm) obj).b);
                return;
            case 15:
                aayw aaywVar = (aayw) obj;
                if (aaywVar.b != abnw.e || (wgiVar = aaywVar.d) == null) {
                    return;
                }
                ((rxh) this.a).w(wgiVar);
                return;
            case 16:
                ((snv) this.a).b.h(8);
                return;
            case 17:
                aazn aaznVar = (aazn) obj;
                snv snvVar = (snv) this.a;
                if (snvVar.f) {
                    snvVar.b.h(aaznVar.a);
                    return;
                }
                return;
            case 18:
                ((snv) this.a).f = ((aazj) obj).a.c(abob.c);
                return;
            case 19:
                acip acipVar2 = ((aazr) obj).a;
                avlh avlhVarT = acipVar2.T();
                Object obj5 = this.a;
                int i3 = 12;
                avlhVarT.al(new rlb(obj5, 16), new jeh(i3));
                acipVar2.aq().al(new rlb(obj5, 17), new jeh(i3));
                acipVar2.am().al(new aawl(new rlb(obj5, 18), "ANC", 1), new jeh(i3));
                return;
            default:
                aaxo aaxoVar = (aaxo) obj;
                spz spzVar = (spz) this.a;
                abnr abnrVar = spzVar.e.a;
                abnr abnrVar2 = aaxoVar.a;
                abnr abnrVar3 = abnr.FULLSCREEN;
                abnr abnrVar4 = abnr.MINIMIZED;
                abnr abnrVar5 = abnr.DEFAULT;
                spzVar.e = aaxoVar;
                aaxo aaxoVar2 = spzVar.e;
                sga sgaVar = spzVar.c;
                sgaVar.b = aaxoVar2;
                if (abnrVar != abnrVar5 && abnrVar2 == abnrVar5) {
                    smc smcVar = spzVar.b;
                    if (smcVar.p() != null) {
                        spzVar.B(smcVar.p().u, new zzi[0]);
                    }
                }
                if (abnrVar != abnrVar4 && abnrVar2 == abnrVar4) {
                    smc smcVar2 = spzVar.b;
                    if (smcVar2.p() != null) {
                        spzVar.B(smcVar2.p().v, new zzi[0]);
                    }
                }
                boolean z2 = abnrVar2 == abnrVar3;
                if (abnrVar == abnrVar3) {
                    if (z2) {
                        return;
                    }
                    zdj zdjVar = spzVar.g;
                    ofgVarK = zdjVar != null ? zdjVar.k() : null;
                    smc smcVar3 = spzVar.b;
                    if (smcVar3.p() != null) {
                        spzVar.A(smcVar3.p().q, ofgVarK, sgaVar);
                    }
                    spzVar.C(smcVar3.T(), ofgVarK);
                    return;
                }
                if (z2) {
                    zdj zdjVar2 = spzVar.g;
                    ofgVarK = zdjVar2 != null ? zdjVar2.l() : null;
                    smc smcVar4 = spzVar.b;
                    if (smcVar4.p() != null) {
                        spzVar.A(smcVar4.p().l, ofgVarK, sgaVar);
                    }
                    spzVar.C(smcVar4.W(), ofgVarK);
                    return;
                }
                return;
        }
    }
}
