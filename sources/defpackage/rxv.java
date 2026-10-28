package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@sdn(a = aixg.LAYOUT_TYPE_MEDIA, b = aixo.SLOT_TYPE_PLAYER_BYTES, c = {sjb.class, shn.class}, d = {sid.class, sjy.class, sic.class})
public final class rxv implements rxj, rsu, rsq {
    private boolean A;
    private final rsk B;
    private final vxu C;
    private final ruk D;
    private final sdo E;
    private final acm F;
    private final tld H;
    private final rsr b;
    private final saq c;
    private final smr d;
    private final sko e;
    private final wjf f;
    private final String g;
    private final Executor h;
    private final agev i;
    private final tbt j;
    private final slb k;
    private final awmd l;
    private final vyo m;
    private final awmd n;
    private final PriorityQueue o;
    private final agev p;
    private final awmd q;
    private abnr r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private final slm v;
    private final Long w;
    private final abmt x;
    private final boolean y;
    private boolean z;
    private final abh G = new abh((char[]) null);
    public int a = 1;

    public rxv(rsk rskVar, rsr rsrVar, saq saqVar, rus rusVar, smr smrVar, sko skoVar, wjf wjfVar, Executor executor, acm acmVar, sdo sdoVar, vyo vyoVar, vxu vxuVar, rmp rmpVar, tbt tbtVar, tld tldVar, ruk rukVar, awmd awmdVar, tce tceVar, abmt abmtVar, awmd awmdVar2, awmd awmdVar3) {
        snh snhVar = null;
        this.B = rskVar;
        this.b = rsrVar;
        this.c = saqVar;
        this.d = smrVar;
        this.e = skoVar;
        this.f = wjfVar;
        this.g = (String) smrVar.d(sic.class);
        this.h = executor;
        this.F = acmVar;
        this.E = sdoVar;
        this.m = vyoVar;
        this.C = vxuVar;
        this.n = awmdVar;
        this.j = tbtVar;
        this.k = (slb) skoVar.d(sjb.class);
        this.H = tldVar;
        this.D = rukVar;
        this.l = awmdVar2;
        this.q = awmdVar3;
        slb slbVar = (slb) skoVar.d(sjb.class);
        agke agkeVar = smrVar.d;
        int i = ((agpi) agkeVar).d;
        int i2 = 0;
        while (i2 < i) {
            snk snkVar = (snk) agkeVar.get(i2);
            i2++;
            if (snkVar instanceof slk) {
                long j = ((slk) snkVar).b.a;
                snhVar = new snh((-15000) + j, j);
                break;
            }
        }
        this.i = snhVar == null ? agdf.a : agev.i(new eqq(rusVar, slbVar, snhVar));
        slm slmVarF = nrj.f(smrVar, skoVar);
        this.v = slmVarF;
        this.s = slmVarF.equals(slm.PRE_ROLL);
        this.t = slmVarF.equals(slm.MID_ROLL);
        this.u = slmVarF.equals(slm.POST_ROLL);
        this.y = sdi.c(vyoVar, slmVarF, wjfVar);
        this.w = nrj.p(smrVar, skoVar, vyoVar);
        this.p = agev.h(new aaok(tceVar, (smc) this.k, slmVarF, wjfVar));
        this.o = nrj.h(this.k);
        this.x = abmtVar;
    }

    private final long u() {
        if (this.t) {
            smr smrVar = this.d;
            if (!nrj.i(smrVar, this.m) && smrVar.e(sjf.class)) {
                return -((aopn) smrVar.d(sjf.class)).h;
            }
        }
        return 0L;
    }

    private final List v() {
        sko skoVar = this.e;
        wjf wjfVarC = ((slb) skoVar.d(sjb.class)).c();
        smr smrVar = this.d;
        boolean z = false;
        if (smrVar.e(shl.class) && nrj.j((wgk) smrVar.d(shl.class), this.m)) {
            z = true;
            wjfVarC.k().b("dibs", true);
        }
        ArrayList arrayList = new ArrayList();
        agev agevVarH = agev.h(sdo.l(((slb) skoVar.d(sjb.class)).c(), ((slb) skoVar.d(sjb.class)).o, (acfw) smrVar.d(sjy.class), abnp.a().a(), z));
        if (agevVarH.g()) {
            arrayList.add((aciw) agevVarH.c());
        }
        return arrayList;
    }

    private final void w(int i) {
        this.a = 4;
        this.b.h(this);
        if (this.v == slm.PRE_ROLL) {
            if (i == 0 || i == 2 || i == 3) {
                boolean zCi = this.x.ci();
                wjf wjfVar = this.f;
                if (zCi) {
                    wjfVar.k().g();
                } else {
                    wjfVar.k().b("PREROLL_SHOWN", true);
                }
            }
        }
    }

    private final void x() {
        if (this.s) {
            ((run) this.n.io()).s();
        }
    }

    private final boolean y() {
        if (this.f.f().ac()) {
            if (!this.s) {
                return true;
            }
        } else if (!this.F.f() && !this.s) {
            vyo vyoVar = this.m;
            if (taq.aP(vyoVar) || taq.aQ(vyoVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rxj
    public final void M() {
        this.a = 2;
        if (this.v == slm.POST_ROLL) {
            this.h.execute(afwl.i(new rxn(this, 4)));
        } else {
            t();
        }
    }

    @Override // defpackage.rxj
    public final void N(int i) {
        int i2;
        if (this.a == 3) {
            rmp.l(this.d, this.e, "Stop rendering is already invoked before on this single media layout.");
        }
        vyo vyoVar = this.m;
        if (taq.al(vyoVar)) {
            aixl aixlVarA = nrk.a(i);
            if (aixlVarA != aixl.PHASE_AD_PLAYBACK_TERMINATION_EVENT_UNSPECIFIED) {
                nrk.b((spv) this.q.io(), this.d, skh.b(this.g, this.f, this.k.o), aixn.RENDERING_EVENT_TYPE_PHASE_AD_PLAYBACK_TERMINATION_EVENTS, aixlVarA, this.e);
            }
            this.G.e();
        }
        this.z = false;
        this.a = 3;
        boolean z = true;
        if (this.A) {
            this.A = false;
            ruk rukVar = this.D;
            aihh aihhVar = (aihh) ajwo.a.createBuilder();
            aihl aihlVar = apqb.b;
            aihf aihfVarCreateBuilder = apqb.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            apqb apqbVar = (apqb) aihfVarCreateBuilder.instance;
            apqbVar.c |= 2;
            apqbVar.e = false;
            String strG = wfs.g(aius.b.a(), this.k.o);
            aihfVarCreateBuilder.copyOnWrite();
            apqb apqbVar2 = (apqb) aihfVarCreateBuilder.instance;
            strG.getClass();
            apqbVar2.c |= 1;
            apqbVar2.d = strG;
            aihhVar.e(aihlVar, (apqb) aihfVarCreateBuilder.build());
            rukVar.b((ajwo) aihhVar.build(), null);
        }
        PriorityQueue priorityQueue = this.o;
        slb slbVar = this.k;
        nrj.n(priorityQueue, slbVar, i, this.D, false, this.r, vyoVar);
        if (i != 4 && i != 1) {
            this.H.f(slbVar);
            if (slbVar instanceof skz) {
                this.j.c(new sen(slbVar, sgm.b(i)));
            }
        }
        agev agevVar = this.p;
        if (agevVar.g()) {
            ((aaok) agevVar.c()).T();
        }
        rsk rskVar = this.B;
        smr smrVar = this.d;
        sko skoVar = this.e;
        rskVar.d(smrVar, skoVar, i);
        if (this.y) {
            if (i != 4) {
                auzk auzkVarB = ((rug) this.l.io()).b(slbVar.o, this.g);
                if (!auzkVarB.a) {
                    Object obj = auzkVarB.b;
                    rmp.n(smrVar, "Failed to skip clip via CISA Shim API: ".concat(String.valueOf(obj != null ? ((aosi) obj).d : "Unknown error")));
                }
            }
            w(i);
            return;
        }
        wjf wjfVar = this.f;
        boolean z2 = this.s;
        boolean z3 = this.t;
        boolean z4 = this.u;
        if (taq.at(vyoVar, wjfVar.V(), wjfVar.P(), z2, z3, z4, true) && i != 4) {
            String str = ((slb) skoVar.d(sjb.class)).o;
            try {
                abmt abmtVar = this.x;
                if ((abmtVar.az() && z2) || (abmtVar.ay() && z3)) {
                    acfw acfwVar = (acfw) smrVar.d(sjy.class);
                    if (i == 0) {
                        i2 = i;
                        z = false;
                    } else if (i != 2) {
                        i2 = i;
                    } else {
                        z = false;
                        i2 = 2;
                    }
                    sdo.k(acfwVar, z, z3, false, str);
                    if (i2 == 2) {
                        sdo.j((acfw) smrVar.d(sjy.class));
                    }
                } else if (!nrj.i(smrVar, vyoVar) || !taq.bg(this.C)) {
                    sdo.k((acfw) smrVar.d(sjy.class), i != 0 || z4, z3, z4, str);
                }
            } catch (rso e) {
                rmp.n(this.d, e.toString());
            }
        }
        w(i);
    }

    @Override // defpackage.rxj
    public final void S() {
        this.b.h(this);
    }

    @Override // defpackage.rxj
    public final sko a() {
        throw null;
    }

    @Override // defpackage.rsq
    public final void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
        if (this.a == 2) {
            abnr abnrVar3 = this.r;
            abnr abnrVar4 = abnr.FULLSCREEN;
            if (abnrVar3 != abnrVar4 && abnrVar == abnrVar4) {
                slb slbVar = this.k;
                if (slbVar.p() != null) {
                    this.D.c(slbVar.p().l);
                }
            }
            this.r = abnrVar;
        }
    }

    @Override // defpackage.rxj
    public final void b() throws Throwable {
        if (!this.y) {
            vyo vyoVar = this.m;
            wjf wjfVar = this.f;
            boolean z = this.s;
            boolean z2 = this.t;
            boolean z3 = this.u;
            if (taq.at(vyoVar, wjfVar.V(), wjfVar.P(), z, z2, z3, true) && y()) {
                try {
                    List listV = v();
                    acfw acfwVar = (acfw) this.d.d(sjy.class);
                    if (!listV.isEmpty()) {
                        x();
                        this.E.h(acfwVar, (z3 && taq.aQ(vyoVar)) ? acfwVar.b() : this.w.longValue(), false, u(), (aciw[]) listV.toArray(new aciw[0]));
                    }
                } catch (rso e) {
                    this.B.u(this.d, this.e, new sas(ahno.Z(e.getMessage()), e.a), 9);
                    return;
                }
            }
            if (this.i.g()) {
                this.b.e(this);
                return;
            }
            return;
        }
        String str = this.g;
        rsk rskVar = this.B;
        smr smrVar = this.d;
        sko skoVar = this.e;
        if (nrj.o(str, rskVar, smrVar, skoVar)) {
            if (this.s || y()) {
                try {
                    rug rugVar = (rug) this.l.io();
                    wjf wjfVar2 = this.f;
                    long jLongValue = this.w.longValue();
                    agke agkeVarQ = agke.q(skoVar);
                    vyo vyoVar2 = this.m;
                    sdi.f(rugVar, smrVar, str, wjfVar2, jLongValue, agkeVarQ, !nrj.i(smrVar, vyoVar2), this.v, (spv) this.q.io(), vyoVar2);
                } catch (sas e2) {
                    this.B.u(this.d, this.e, e2, 10);
                    return;
                }
            }
            if (this.i.g()) {
                this.b.e(this);
            }
        }
    }

    @Override // defpackage.rsu
    public final void c() {
        this.c.ab(this.e, 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x004d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0091 A[ADDED_TO_REGION] */
    @Override // defpackage.rsq
    public final void j(aayt aaytVar) {
        boolean z;
        boolean zH;
        boolean zI;
        boolean z2;
        if (this.a == 2) {
            slb slbVar = this.k;
            String str = aaytVar.b;
            String str2 = slbVar.o;
            if (TextUtils.equals(str2, str)) {
                abnv abnvVar = aaytVar.a;
                if (abnvVar == abnv.f && !this.A) {
                    vyo vyoVar = this.m;
                    boolean zAK = taq.aK(vyoVar);
                    boolean zAJ = taq.aJ(vyoVar);
                    if (zAK) {
                        z = false;
                        if (slbVar != null || slbVar.c() == null) {
                            zH = false;
                            zI = false;
                        } else {
                            wja wjaVarG = slbVar.c().g();
                            zI = nsf.i(wjaVarG);
                            zH = nsf.h(wjaVarG);
                        }
                        if (zI || !zAK) {
                            if (zH && zAJ) {
                                zH = true;
                                zAJ = true;
                                if (this.r != abnr.FULLSCREEN) {
                                    this.A = true;
                                    ruk rukVar = this.D;
                                    aihh aihhVar = (aihh) ajwo.a.createBuilder();
                                    aihl aihlVar = apqb.b;
                                    aihf aihfVarCreateBuilder = apqb.a.createBuilder();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    apqb apqbVar = (apqb) aihfVarCreateBuilder.instance;
                                    apqbVar.c |= 2;
                                    apqbVar.e = true;
                                    if (zI || !zAK) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    aihfVarCreateBuilder.copyOnWrite();
                                    apqb apqbVar2 = (apqb) aihfVarCreateBuilder.instance;
                                    apqbVar2.c |= 32;
                                    apqbVar2.g = z2;
                                    if (zH && zAJ) {
                                        z = true;
                                    }
                                    aihfVarCreateBuilder.copyOnWrite();
                                    apqb apqbVar3 = (apqb) aihfVarCreateBuilder.instance;
                                    apqbVar3.c |= 16;
                                    apqbVar3.f = z;
                                    String strG = wfs.g(aius.b.a(), str2);
                                    aihfVarCreateBuilder.copyOnWrite();
                                    apqb apqbVar4 = (apqb) aihfVarCreateBuilder.instance;
                                    strG.getClass();
                                    apqbVar4.c |= 1;
                                    apqbVar4.d = strG;
                                    aihhVar.e(aihlVar, (apqb) aihfVarCreateBuilder.build());
                                    rukVar.b((ajwo) aihhVar.build(), null);
                                }
                            }
                        } else if (this.r != abnr.FULLSCREEN) {
                            this.A = true;
                            ruk rukVar2 = this.D;
                            aihh aihhVar2 = (aihh) ajwo.a.createBuilder();
                            aihl aihlVar2 = apqb.b;
                            aihf aihfVarCreateBuilder2 = apqb.a.createBuilder();
                            aihfVarCreateBuilder2.copyOnWrite();
                            apqb apqbVar5 = (apqb) aihfVarCreateBuilder2.instance;
                            apqbVar5.c |= 2;
                            apqbVar5.e = true;
                            if (zI) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            aihfVarCreateBuilder2.copyOnWrite();
                            apqb apqbVar6 = (apqb) aihfVarCreateBuilder2.instance;
                            apqbVar6.c |= 32;
                            apqbVar6.g = z2;
                            if (zH) {
                                z = true;
                            }
                            aihfVarCreateBuilder2.copyOnWrite();
                            apqb apqbVar7 = (apqb) aihfVarCreateBuilder2.instance;
                            apqbVar7.c |= 16;
                            apqbVar7.f = z;
                            String strG2 = wfs.g(aius.b.a(), str2);
                            aihfVarCreateBuilder2.copyOnWrite();
                            apqb apqbVar8 = (apqb) aihfVarCreateBuilder2.instance;
                            strG2.getClass();
                            apqbVar8.c |= 1;
                            apqbVar8.d = strG2;
                            aihhVar2.e(aihlVar2, (apqb) aihfVarCreateBuilder2.build());
                            rukVar2.b((ajwo) aihhVar2.build(), null);
                        }
                    } else if (zAJ) {
                        zAJ = true;
                        z = false;
                        if (slbVar != null) {
                            zH = false;
                            zI = false;
                        } else {
                            zH = false;
                            zI = false;
                        }
                        if (zI) {
                            if (zH) {
                                zH = true;
                                zAJ = true;
                                if (this.r != abnr.FULLSCREEN) {
                                    this.A = true;
                                    ruk rukVar3 = this.D;
                                    aihh aihhVar3 = (aihh) ajwo.a.createBuilder();
                                    aihl aihlVar3 = apqb.b;
                                    aihf aihfVarCreateBuilder3 = apqb.a.createBuilder();
                                    aihfVarCreateBuilder3.copyOnWrite();
                                    apqb apqbVar9 = (apqb) aihfVarCreateBuilder3.instance;
                                    apqbVar9.c |= 2;
                                    apqbVar9.e = true;
                                    if (zI) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                    }
                                    aihfVarCreateBuilder3.copyOnWrite();
                                    apqb apqbVar10 = (apqb) aihfVarCreateBuilder3.instance;
                                    apqbVar10.c |= 32;
                                    apqbVar10.g = z2;
                                    if (zH) {
                                        z = true;
                                    }
                                    aihfVarCreateBuilder3.copyOnWrite();
                                    apqb apqbVar11 = (apqb) aihfVarCreateBuilder3.instance;
                                    apqbVar11.c |= 16;
                                    apqbVar11.f = z;
                                    String strG3 = wfs.g(aius.b.a(), str2);
                                    aihfVarCreateBuilder3.copyOnWrite();
                                    apqb apqbVar12 = (apqb) aihfVarCreateBuilder3.instance;
                                    strG3.getClass();
                                    apqbVar12.c |= 1;
                                    apqbVar12.d = strG3;
                                    aihhVar3.e(aihlVar3, (apqb) aihfVarCreateBuilder3.build());
                                    rukVar3.b((ajwo) aihhVar3.build(), null);
                                }
                            }
                        } else if (zH) {
                            zH = true;
                            zAJ = true;
                            if (this.r != abnr.FULLSCREEN) {
                                this.A = true;
                                ruk rukVar4 = this.D;
                                aihh aihhVar4 = (aihh) ajwo.a.createBuilder();
                                aihl aihlVar4 = apqb.b;
                                aihf aihfVarCreateBuilder4 = apqb.a.createBuilder();
                                aihfVarCreateBuilder4.copyOnWrite();
                                apqb apqbVar13 = (apqb) aihfVarCreateBuilder4.instance;
                                apqbVar13.c |= 2;
                                apqbVar13.e = true;
                                if (zI) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                aihfVarCreateBuilder4.copyOnWrite();
                                apqb apqbVar14 = (apqb) aihfVarCreateBuilder4.instance;
                                apqbVar14.c |= 32;
                                apqbVar14.g = z2;
                                if (zH) {
                                    z = true;
                                }
                                aihfVarCreateBuilder4.copyOnWrite();
                                apqb apqbVar15 = (apqb) aihfVarCreateBuilder4.instance;
                                apqbVar15.c |= 16;
                                apqbVar15.f = z;
                                String strG4 = wfs.g(aius.b.a(), str2);
                                aihfVarCreateBuilder4.copyOnWrite();
                                apqb apqbVar16 = (apqb) aihfVarCreateBuilder4.instance;
                                strG4.getClass();
                                apqbVar16.c |= 1;
                                apqbVar16.d = strG4;
                                aihhVar4.e(aihlVar4, (apqb) aihfVarCreateBuilder4.build());
                                rukVar4.b((ajwo) aihhVar4.build(), null);
                            }
                        }
                    }
                }
                if (abnvVar == abnv.h) {
                    if (!this.y) {
                        vyo vyoVar2 = this.m;
                        wjf wjfVar = this.f;
                        if (!taq.at(vyoVar2, wjfVar.V(), wjfVar.P(), this.s, this.t, this.u, true)) {
                            return;
                        }
                    }
                    c();
                }
            }
        }
    }

    @Override // defpackage.rsq
    public final void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
        if (this.a == 2 && abobVar.h()) {
            slb slbVar = this.k;
            String str3 = slbVar.o;
            if (TextUtils.equals(str3, str2)) {
                ((aaok) this.p.c()).U(abobVar, str);
                if (this.z || abobVar != abob.f) {
                    return;
                }
                this.z = true;
                if (taq.al(this.m)) {
                    this.G.e();
                    skh skhVarB = skh.b(str, this.f, str3);
                    nrk.b((spv) this.q.io(), this.d, skhVarB, aixn.RENDERING_EVENT_TYPE_PHASE_AD_ACTIVE_PLAYBACK_EVENTS, aixj.PHASE_AD_ACTIVE_PLAYBACK_EVENT_AD_PLAYBACK_STARTED, this.e);
                }
                if (slbVar.p() != null) {
                    this.D.c(slbVar.p().b);
                }
            }
        }
    }

    @Override // defpackage.rsq
    public final void m(String str, long j, long j2, long j3, boolean z) {
        String str2 = this.g;
        if (TextUtils.equals(str, str2)) {
            agev agevVar = this.i;
            if (agevVar.g() && this.a == 1) {
                ((eqq) agevVar.c()).c(j);
            }
        }
        slb slbVar = this.k;
        String str3 = slbVar.o;
        if (!TextUtils.equals(str, str3) || this.a != 2) {
            return;
        }
        if (taq.al(this.m)) {
            agke agkeVarD = this.G.d(j, ((long) slbVar.a()) * 1000);
            int i = ((agpi) agkeVarD).d;
            for (int i2 = 0; i2 < i; i2++) {
                aixj aixjVar = (aixj) agkeVarD.get(i2);
                skh skhVarB = skh.b(str2, this.f, str3);
                nrk.b((spv) this.q.io(), this.d, skhVarB, aixn.RENDERING_EVENT_TYPE_PHASE_AD_ACTIVE_PLAYBACK_EVENTS, aixjVar, this.e);
            }
        }
        while (true) {
            PriorityQueue priorityQueue = this.o;
            if (priorityQueue.isEmpty() || j < ((sme) priorityQueue.peek()).a) {
                return;
            }
            this.D.b(((sme) priorityQueue.poll()).b, null);
        }
    }

    @Override // defpackage.rsq
    public final void o(int i, String str) {
        if (this.a == 2) {
            vyo vyoVar = this.m;
            wjf wjfVar = this.f;
            if (taq.at(vyoVar, wjfVar.V(), wjfVar.P(), this.s, this.t, this.u, true) && i == 8) {
                s();
                i = 8;
            }
            slb slbVar = this.k;
            if (TextUtils.equals(str, slbVar.o) && i == 4 && slbVar.p() != null) {
                this.D.c(slbVar.p().i);
            }
        }
    }

    @Override // defpackage.rsu
    public final void s() {
        this.B.u(this.d, this.e, new sas("Internal media error", 46), 10);
    }

    public final void t() {
        this.b.e(this);
        rsk rskVar = this.B;
        smr smrVar = this.d;
        rskVar.b(smrVar, this.e);
        if (this.y) {
            return;
        }
        vyo vyoVar = this.m;
        wjf wjfVar = this.f;
        if (!taq.at(vyoVar, wjfVar.V(), wjfVar.P(), this.s, this.t, this.u, true)) {
            try {
                x();
                acm acmVar = this.F;
                slb slbVar = this.k;
                acmVar.c(slbVar.c(), slbVar.o, this);
                return;
            } catch (rso e) {
                this.B.u(this.d, this.e, new sas(ahno.Z(e.getMessage()), e.a), 10);
                return;
            }
        }
        if (y()) {
            return;
        }
        if (this.F.f() || wjfVar.f().ac()) {
            try {
                List listV = v();
                if (!listV.isEmpty()) {
                    x();
                    this.E.i((acfw) smrVar.d(sjy.class), false, u(), (aciw[]) listV.toArray(new aciw[0]));
                }
            } catch (rso e2) {
                this.B.u(this.d, this.e, new sas(ahno.Z(e2.getMessage()), e2.a), 9);
            }
            this.F.d();
        }
    }

    @Override // defpackage.rsu
    public final /* synthetic */ void Q() {
    }

    @Override // defpackage.rsu
    public final /* synthetic */ void R() {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void e(aaxa aaxaVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void f(zhz zhzVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void g(aazp aazpVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void h(aazs aazsVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void i(String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void k(aayw aaywVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void d(String str, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void n(wgi wgiVar, String str, wjf wjfVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void p(String str, long j, int i) {
    }
}
