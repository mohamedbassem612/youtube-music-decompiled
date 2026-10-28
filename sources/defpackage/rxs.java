package defpackage;

import android.text.TextUtils;
import j$.time.Duration;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(a = aixg.LAYOUT_TYPE_MEDIA, b = aixo.SLOT_TYPE_PLAYER_BYTES, c = {sjb.class, shn.class}, d = {sic.class, sid.class})
public final class rxs implements rxx, rsu, rsq, sgq, sof {
    private final ruf A;
    private final acm B;
    private final abh C = new abh((char[]) null);
    private final tld D;
    private final aaok E;
    public final boolean a;
    private final rxw b;
    private final vyo c;
    private final rsr d;
    private final tbt e;
    private final smr f;
    private final sko g;
    private final String h;
    private final slb i;
    private final wjf j;
    private final sag k;
    private final awmd l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final slm p;
    private final boolean q;
    private boolean r;
    private boolean s;
    private abnr t;
    private boolean u;
    private final skh v;
    private final PriorityQueue w;
    private final rsk x;
    private final ruk y;
    private final spy z;

    public rxs(rsk rskVar, rxw rxwVar, vyo vyoVar, acm acmVar, rsr rsrVar, ruk rukVar, spy spyVar, tld tldVar, sag sagVar, tbt tbtVar, smr smrVar, sko skoVar, boolean z, tce tceVar, ruf rufVar, awmd awmdVar) {
        this.x = rskVar;
        this.b = rxwVar;
        this.c = vyoVar;
        this.B = acmVar;
        this.d = rsrVar;
        this.y = rukVar;
        this.z = spyVar;
        this.D = tldVar;
        this.e = tbtVar;
        this.f = smrVar;
        this.g = skoVar;
        String str = (String) smrVar.d(sic.class);
        this.h = str;
        slb slbVar = (slb) skoVar.d(sjb.class);
        this.i = slbVar;
        this.a = z;
        this.k = sagVar;
        wjf wjfVar = (wjf) smrVar.d(sid.class);
        this.j = wjfVar;
        slm slmVarF = nrj.f(smrVar, skoVar);
        this.p = slmVarF;
        this.m = slmVarF.equals(slm.PRE_ROLL);
        this.n = slmVarF.equals(slm.MID_ROLL);
        this.o = slmVarF.equals(slm.POST_ROLL);
        this.q = sdi.c(vyoVar, slmVarF, wjfVar);
        this.E = slbVar instanceof sgo ? null : new aaok(tceVar, (smc) slbVar, slmVarF, wjfVar);
        this.v = skh.b(str, wjfVar, slbVar.o);
        this.w = nrj.h(slbVar);
        this.A = rufVar;
        this.l = awmdVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.rxj
    public final void M() {
        wjf wjfVar;
        this.r = true;
        this.d.e(this);
        vyo vyoVar = this.c;
        if (taq.aA(vyoVar)) {
            this.A.a(this);
        }
        boolean z = this.q;
        if (z) {
            this.x.c(this.v, this.f, this.g);
            if (!z) {
                return;
            }
            wjfVar = this.j;
            if (taq.at(vyoVar, wjfVar.V(), wjfVar.P(), this.m, this.n, this.o, false)) {
                return;
            }
        } else {
            wjf wjfVar2 = this.j;
            if (taq.at(vyoVar, wjfVar2.V(), wjfVar2.P(), this.m, this.n, this.o, false) || taq.aY(vyoVar)) {
                this.x.c(this.v, this.f, this.g);
                if (!z) {
                    return;
                }
                wjfVar = this.j;
                if (taq.at(vyoVar, wjfVar.V(), wjfVar.P(), this.m, this.n, this.o, false)) {
                    return;
                }
            }
        }
        try {
            this.b.t();
            acm acmVar = this.B;
            slb slbVar = this.i;
            acmVar.c(slbVar.c(), slbVar.o, this);
        } catch (rso e) {
            this.b.w(new sas(e.getMessage(), e.a), 10);
        }
    }

    @Override // defpackage.rxj
    public final void N(int i) {
        int i2;
        if (!this.r) {
            rmp.l(this.f, this.g, "Stop rendering is already invoked before on this sub media layout");
        }
        vyo vyoVar = this.c;
        if (taq.al(vyoVar)) {
            aixl aixlVarA = nrk.a(i);
            if (aixlVarA != aixl.PHASE_AD_PLAYBACK_TERMINATION_EVENT_UNSPECIFIED) {
                nrk.b((spv) this.l.io(), this.f, skh.b(this.h, this.j, this.i.o), aixn.RENDERING_EVENT_TYPE_PHASE_AD_PLAYBACK_TERMINATION_EVENTS, aixlVarA, this.g);
            }
            this.C.e();
        }
        this.r = false;
        this.s = false;
        if (this.u) {
            this.u = false;
            ruk rukVar = this.y;
            aihh aihhVar = (aihh) ajwo.a.createBuilder();
            aihl aihlVar = apqb.b;
            aihf aihfVarCreateBuilder = apqb.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            apqb apqbVar = (apqb) aihfVarCreateBuilder.instance;
            apqbVar.c |= 2;
            apqbVar.e = false;
            String strG = wfs.g(aius.b.a(), this.i.o);
            aihfVarCreateBuilder.copyOnWrite();
            apqb apqbVar2 = (apqb) aihfVarCreateBuilder.instance;
            strG.getClass();
            apqbVar2.c |= 1;
            apqbVar2.d = strG;
            aihhVar.e(aihlVar, (apqb) aihfVarCreateBuilder.build());
            rukVar.b((ajwo) aihhVar.build(), null);
        }
        this.d.h(this);
        if (taq.aA(vyoVar)) {
            this.A.c.remove(this);
        }
        slb slbVar = this.i;
        boolean z = slbVar instanceof skz;
        if (z && i != 4 && i != 1) {
            spy spyVar = this.z;
            sgm sgmVarB = sgm.b(i);
            taq.d();
            if (spyVar.d != null) {
                spyVar.d.l(sgmVarB);
            }
            this.e.c(new sen(slbVar, sgmVarB));
        }
        if (i == 0 && z && !this.a) {
            this.z.g();
        }
        nrj.n(this.w, slbVar, i, this.y, this.a, this.t, vyoVar);
        if (i != 4) {
            if (i != 1) {
                this.D.f(slbVar);
            }
            i2 = i;
        } else {
            i2 = 4;
        }
        this.z.a();
        aaok aaokVar = this.E;
        if (aaokVar != null) {
            aaokVar.T();
        }
        this.x.e(this.v, this.f, this.g, i2);
    }

    @Override // defpackage.rxj
    public final void S() {
        this.k.d(this.g.a);
    }

    @Override // defpackage.sgq
    public final void T() {
        if (!this.q) {
            vyo vyoVar = this.c;
            wjf wjfVar = this.j;
            if (!taq.at(vyoVar, wjfVar.V(), wjfVar.P(), this.m, this.n, this.o, false)) {
                try {
                    Object obj = this.B.a;
                    if (obj == null) {
                        throw new rso("Null interrupt when trying to stop interstitial video", 68);
                    }
                    ((acie) obj).a();
                    if (((acie) obj).c != null && ((acie) obj).a) {
                        ((acie) obj).a = false;
                        ((acie) obj).b.a.d();
                    }
                } catch (rso e) {
                    this.b.w(new sas(e.getMessage(), e.a), 11);
                    return;
                }
            }
        }
        N(2);
        this.b.u(this.g, 2);
    }

    @Override // defpackage.rxj
    public final sko a() {
        return this.g;
    }

    @Override // defpackage.rsq
    public final void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
        if (this.r) {
            abnr abnrVar3 = this.t;
            abnr abnrVar4 = abnr.FULLSCREEN;
            if (abnrVar3 != abnrVar4 && abnrVar == abnrVar4) {
                slb slbVar = this.i;
                if (slbVar.p() != null) {
                    this.y.c(slbVar.p().l);
                }
            }
            this.t = abnrVar;
        }
    }

    @Override // defpackage.rxj
    public final void b() {
        if (!slb.av(this.i.iJ()) || taq.aA(this.c)) {
            return;
        }
        this.k.c(this.g.a, this);
    }

    @Override // defpackage.rsu
    public final void c() {
        N(0);
        this.b.u(this.g, 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:22:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x004c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0091 A[ADDED_TO_REGION] */
    @Override // defpackage.rsq
    public final void j(aayt aaytVar) {
        boolean z;
        boolean zH;
        boolean zI;
        boolean z2;
        if (this.r) {
            slb slbVar = this.i;
            String str = aaytVar.b;
            String str2 = slbVar.o;
            if (TextUtils.equals(str2, str)) {
                abnv abnvVar = aaytVar.a;
                if (abnvVar == abnv.f && !this.u) {
                    vyo vyoVar = this.c;
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
                                if (this.t != abnr.FULLSCREEN) {
                                    this.u = true;
                                    ruk rukVar = this.y;
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
                        } else if (this.t != abnr.FULLSCREEN) {
                            this.u = true;
                            ruk rukVar2 = this.y;
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
                                if (this.t != abnr.FULLSCREEN) {
                                    this.u = true;
                                    ruk rukVar3 = this.y;
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
                            if (this.t != abnr.FULLSCREEN) {
                                this.u = true;
                                ruk rukVar4 = this.y;
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
                    if (!this.q) {
                        vyo vyoVar2 = this.c;
                        wjf wjfVar = this.j;
                        if (!taq.at(vyoVar2, wjfVar.V(), wjfVar.P(), this.m, this.n, this.o, false)) {
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
        if (this.r && abobVar.h()) {
            slb slbVar = this.i;
            String str3 = slbVar.o;
            if (TextUtils.equals(str3, str2)) {
                aaok aaokVar = this.E;
                if (aaokVar != null) {
                    aaokVar.U(abobVar, str);
                }
                if (this.s || abobVar != abob.f) {
                    return;
                }
                this.s = true;
                vyo vyoVar = this.c;
                if (taq.al(vyoVar)) {
                    this.C.e();
                    skh skhVarB = skh.b(str, this.j, str3);
                    nrk.b((spv) this.l.io(), this.f, skhVarB, aixn.RENDERING_EVENT_TYPE_PHASE_AD_ACTIVE_PLAYBACK_EVENTS, aixj.PHASE_AD_ACTIVE_PLAYBACK_EVENT_AD_PLAYBACK_STARTED, this.g);
                }
                if (slbVar.p() != null) {
                    this.y.c(slbVar.p().b);
                }
                if (this.q) {
                    return;
                }
                wjf wjfVar2 = this.j;
                if (taq.at(vyoVar, wjfVar2.V(), wjfVar2.P(), this.m, this.n, this.o, false) || taq.aY(vyoVar)) {
                    return;
                }
                this.x.c(this.v, this.f, this.g);
            }
        }
    }

    @Override // defpackage.rsq
    public final void m(String str, long j, long j2, long j3, boolean z) {
        if (this.r) {
            slb slbVar = this.i;
            String str2 = slbVar.o;
            if (TextUtils.equals(str, str2)) {
                vyo vyoVar = this.c;
                if (taq.al(vyoVar)) {
                    agke agkeVarD = this.C.d(j, ((long) slbVar.a()) * 1000);
                    int i = ((agpi) agkeVarD).d;
                    for (int i2 = 0; i2 < i; i2++) {
                        aixj aixjVar = (aixj) agkeVarD.get(i2);
                        skh skhVarB = skh.b(this.h, this.j, str2);
                        nrk.b((spv) this.l.io(), this.f, skhVarB, aixn.RENDERING_EVENT_TYPE_PHASE_AD_ACTIVE_PLAYBACK_EVENTS, aixjVar, this.g);
                    }
                }
                while (true) {
                    PriorityQueue priorityQueue = this.w;
                    if (priorityQueue.isEmpty() || j < ((sme) priorityQueue.peek()).a) {
                        break;
                    } else {
                        this.y.b(((sme) priorityQueue.poll()).b, null);
                    }
                }
                Duration durationOfMillis = Duration.ofMillis(taq.Y(vyoVar));
                if (!taq.aA(vyoVar) || !a.y(durationOfMillis) || slbVar.iJ() == 0 || j <= durationOfMillis.toMillis()) {
                    return;
                }
                N(2);
                this.b.u(this.g, 2);
            }
        }
    }

    @Override // defpackage.rsq
    public final void o(int i, String str) {
        if (this.r) {
            vyo vyoVar = this.c;
            wjf wjfVar = this.j;
            if (taq.at(vyoVar, wjfVar.V(), wjfVar.P(), this.m, this.n, this.o, false) && i == 8) {
                s();
                i = 8;
            }
            slb slbVar = this.i;
            if (TextUtils.equals(str, slbVar.o) && i == 4 && slbVar.p() != null) {
                this.y.c(slbVar.p().i);
            }
        }
    }

    @Override // defpackage.rsu
    public final void s() {
        this.b.w(new sas("Internal media error", 46), 10);
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

    @Override // defpackage.sof
    public final /* synthetic */ void u() {
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

    @Override // defpackage.sof
    public final /* synthetic */ void t(seo seoVar) {
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
