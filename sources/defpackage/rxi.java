package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(a = aixg.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY, b = aixo.SLOT_TYPE_IN_PLAYER, d = {sjb.class, sid.class, shq.class, shn.class, shx.class, sjz.class})
@Deprecated
public final class rxi implements rxj, rsq, sog {
    public final ListenableFuture a;
    public final rpi d;
    private final vyo e;
    private final rsr f;
    private final sgv g;
    private final Executor h;
    private final smr i;
    private final sko j;
    private final slb k;
    private final wjf l;
    private final sgs m;
    private final sgn n;
    private final slm o;
    private boolean s;
    private final rsk t;
    private final ruk u;
    private final ruf v;
    private final spy w;
    private final abnc x;
    private int p = -1;
    private int q = -1;
    final sol b = som.a();
    public soi c = soi.a;
    private aiuv r = null;

    public rxi(rsk rskVar, vyo vyoVar, sgv sgvVar, rpi rpiVar, spy spyVar, Executor executor, abnc abncVar, ruk rukVar, ruf rufVar, rsr rsrVar, smr smrVar, sko skoVar) {
        this.t = rskVar;
        this.e = vyoVar;
        this.f = rsrVar;
        this.u = rukVar;
        this.v = rufVar;
        this.g = sgvVar;
        this.d = rpiVar;
        this.w = spyVar;
        this.h = executor;
        this.x = abncVar;
        this.i = smrVar;
        this.j = skoVar;
        this.a = (ListenableFuture) smrVar.d(sjz.class);
        this.k = (slb) smrVar.d(sjb.class);
        this.l = (wjf) smrVar.d(sid.class);
        this.m = (sgs) smrVar.d(shq.class);
        this.n = (sgn) smrVar.d(shn.class);
        this.o = (slm) smrVar.d(shx.class);
    }

    private final boolean A() {
        wjf wjfVarC = this.k.c();
        return (wjfVarC == null || nrl.d(wjfVarC.u().p) == null) ? false : true;
    }

    private final boolean B() {
        wjf wjfVarC = this.k.c();
        return (wjfVarC == null || (wjfVarC.u().b & 536870912) == 0) ? false : true;
    }

    private final void z() {
        if (this.c.j) {
            this.h.execute(afwl.i(new rno(this, 16)));
        }
    }

    @Override // defpackage.rxj
    public final void M() {
        aigj aigjVar;
        try {
            this.v.b(this);
            this.f.e(this);
            vyo vyoVar = this.e;
            int iE = taq.aZ(vyoVar) ? nsf.e(this.k.m()) : nsf.f(this.l.f());
            abnc abncVar = this.x;
            boolean zBf = taq.bf(vyoVar, abncVar);
            soh sohVarA = this.c.a();
            sohVarA.i(zBf);
            soi soiVarA = sohVarA.a();
            this.c = soiVarA;
            boolean z = soiVarA.k && soiVarA.b.g() && (this.c.b.c() instanceof ajvx);
            sol solVar = this.b;
            sgv sgvVar = this.g;
            slb slbVar = this.k;
            sgn sgnVar = this.n;
            nrk.d(solVar, sgvVar, slbVar.H(), slbVar.G(), sgnVar, this.l, this.o, slbVar.A(), slbVar.a(), iE, B(), z);
            nrd.c(solVar, abncVar.e(), (ajnf) slbVar.t().orElse(null), A(), B());
            nre.o(solVar, abncVar.e(), (ajmb) slbVar.u().orElse(null), A(), B());
            nrd.e(solVar, sgnVar);
            solVar.h(true);
            rpm.c(solVar, (aolc) slbVar.r().orElse(null));
            if (slbVar instanceof skz) {
                Optional optionalE = ((skz) slbVar).e();
                if (true == optionalE.isPresent()) {
                    optionalE = Optional.ofNullable(((ambn) optionalE.get()).l);
                }
                aigjVar = (aigj) optionalE.orElse(aigj.d);
            } else {
                aigjVar = aigj.d;
            }
            solVar.q(aigjVar);
            sko skoVar = this.j;
            agev agevVar = skoVar.n;
            if (agevVar.g()) {
                aihf aihfVarCreateBuilder = amdd.a.createBuilder();
                Object objC = agevVar.c();
                aihfVarCreateBuilder.copyOnWrite();
                amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
                amddVar.q = (amco) objC;
                amddVar.c |= SemanticState.ReadOnly;
                solVar.n((amdd) aihfVarCreateBuilder.build());
            }
            ruf rufVar = this.v;
            rufVar.c(new seo(solVar.f().d, this.m));
            rufVar.e(solVar.a());
            ListenableFuture listenableFuture = this.a;
            if (listenableFuture.isDone()) {
                w(listenableFuture);
            } else {
                listenableFuture.addListener(new rno(this, 15), this.h);
            }
            this.t.b(this.i, skoVar);
        } catch (rso e) {
            this.t.u(this.i, this.j, new sas(e.getMessage(), e.a), 10);
        }
    }

    @Override // defpackage.rxj
    public final void N(int i) {
        this.s = true;
        soi soiVar = this.c;
        int i2 = rww.a;
        agev agevVar = soiVar.c;
        seo seoVar = new seo(3, sgs.d);
        ruf rufVar = this.v;
        rufVar.c(seoVar);
        sol solVar = this.b;
        solVar.m();
        rufVar.e(solVar.a());
        rufVar.d(this);
        this.f.h(this);
        this.t.d(this.i, this.j, i);
    }

    @Override // defpackage.rxj
    public final void S() {
        this.v.d(this);
        this.f.h(this);
    }

    @Override // defpackage.rxj
    public final sko a() {
        throw null;
    }

    @Override // defpackage.rsq
    public final void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
        vyo vyoVar = this.e;
        sol solVar = this.b;
        boolean zE = nrk.e(solVar, abnrVar2);
        boolean zP = nre.p(solVar, abnrVar2);
        boolean zD = nrd.d(solVar, abnrVar2);
        boolean z = false;
        if (taq.av(vyoVar) && nrj.q(solVar, abnrVar2)) {
            z = true;
        }
        if (zE || zP || zD || z) {
            this.v.e(solVar.a());
        }
        boolean zBf = taq.bf(vyoVar, this.x);
        soh sohVarA = this.c.a();
        sohVarA.i(zBf);
        this.c = rww.d(sohVarA.a(), abnrVar);
        z();
    }

    @Override // defpackage.rxj
    public final void b() {
        if (B()) {
            abnc abncVar = this.x;
            slb slbVar = this.k;
            abnr abnrVarE = abncVar.e();
            alkd alkdVar = slbVar.c().u().A;
            if (alkdVar == null) {
                alkdVar = alkd.a;
            }
            this.c = rww.a(abnrVarE, alkdVar);
            boolean zBf = taq.bf(this.e, abncVar);
            soh sohVarA = this.c.a();
            sohVarA.i(zBf);
            soi soiVarA = sohVarA.a();
            this.c = soiVarA;
            if (soiVarA.b.g()) {
                this.c.b.c();
            }
        }
        if (taq.av(this.e)) {
            sol solVar = this.b;
            abnr abnrVarE2 = this.x.e();
            sou souVarA = solVar.e().a();
            souVarA.d(abnrVarE2 == abnr.FULLSCREEN);
            solVar.i = souVarA.a();
        }
    }

    @Override // defpackage.rsq
    public final void m(String str, long j, long j2, long j3, boolean z) {
        slb slbVar = this.k;
        if (str.equals(slbVar.o)) {
            int i = (int) j;
            int i2 = (int) j3;
            sol solVar = this.b;
            rpm.b(solVar, i, (int) j2, i2);
            wjf wjfVar = this.l;
            nrd.f(solVar, i2, i, wjfVar.T() || taq.aj(this.e));
            int iE = taq.aZ(this.e) ? nsf.e(slbVar.m()) : nsf.f(wjfVar.f());
            wjfVar.f();
            if (nrk.h(solVar, slbVar.a(), i, iE)) {
                this.w.h();
                this.v.c(new seo(1, this.m));
            }
            this.v.e(solVar.a());
            this.c = rww.c(this.c, j);
            z();
        }
    }

    @Override // defpackage.sog
    public final void s() {
        sol solVar = this.b;
        nrd.b(solVar);
        nre.n(solVar);
        this.v.e(solVar.a());
    }

    @Override // defpackage.sog
    public final void t() {
        sgs sgsVar;
        apzz apzzVar;
        aqaa aqaaVar;
        sol solVar = this.b;
        if (solVar.f().d != 1 || (sgsVar = this.m) == null) {
            rmp.m(this.i, this.j, "Skip ad was clicked but unable to process. skipState: " + solVar.f().d);
            return;
        }
        vyo vyoVar = this.e;
        if (taq.aE(vyoVar)) {
            apzzVar = solVar.f().a;
            sgsVar.d(this.p, this.q);
        } else {
            sgsVar.d(this.p, this.q);
            apzzVar = solVar.f().a;
        }
        if (apzzVar != null) {
            if (!taq.aE(vyoVar)) {
                if ((apzzVar.b & 32) != 0) {
                    new xgj(apzzVar.e, (amud) null);
                    rmp.n(null, "No interactionLogger available for logGesture");
                    return;
                }
                amud amudVar = solVar.f().n;
                if ((amudVar.c & 1) != 0) {
                    new xgj(amudVar);
                    rmp.n(null, "No interactionLogger available for logGesture");
                    return;
                }
                return;
            }
            apji apjiVar = apzzVar.d;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVar = aqab.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = apzzVar.d;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                aqaaVar = (aqaa) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            } else {
                aqaaVar = null;
            }
            if (aqaaVar != null && (aqaaVar.b & 8) != 0) {
                new xgj(aqaaVar.c, (amud) null);
                rmp.n(null, "No interactionLogger available for logGesture");
                return;
            }
            amud amudVar2 = solVar.f().n;
            if ((amudVar2.c & 1) != 0) {
                new xgj(amudVar2);
                rmp.n(null, "No interactionLogger available for logGesture");
            }
        }
    }

    @Override // defpackage.sog
    public final void u(int i, int i2) {
        this.p = i;
        this.q = i2;
    }

    @Override // defpackage.sog
    public final void v() {
        aiuv aiuvVar;
        abfx abfxVarF = this.v.f();
        if (abfxVarF != null) {
            ajwo ajwoVarF = this.k.F();
            if (ajwoVarF == null && (aiuvVar = this.r) != null && (ajwoVarF = aiuvVar.h) == null) {
                ajwoVarF = ajwo.a;
            }
            if (ajwoVarF != null) {
                afv afvVar = new afv(2);
                afvVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", abfxVarF);
                this.u.b(ajwoVarF, afvVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    public final void w(ListenableFuture listenableFuture) {
        aiuv aiuvVar;
        if (this.s) {
            return;
        }
        try {
            wgi wgiVar = (wgi) ahng.v(listenableFuture);
            if (wgiVar != null) {
                alzo alzoVar = wgiVar.a.h;
                if (alzoVar == null) {
                    alzoVar = alzo.a;
                }
                int i = alzoVar.b;
                aiuv aiuvVar2 = null;
                if (i == 62960614) {
                    aiuvVar = i == 62960614 ? (aiuv) alzoVar.c : aiuv.a;
                } else {
                    aiuvVar = null;
                }
                if (aiuvVar == null) {
                    slb slbVar = this.k;
                    if (slbVar.q() != null || slbVar.o() != null || slbVar.F() != null) {
                        if (aiuvVar == null) {
                            aiuvVar2 = aiuv.a;
                        } else {
                            aiuvVar2 = aiuvVar;
                        }
                    }
                } else if (aiuvVar == null) {
                    aiuvVar2 = aiuv.a;
                } else {
                    aiuvVar2 = aiuvVar;
                }
                this.r = aiuvVar2;
                if (aiuvVar2 != null) {
                    sol solVar = this.b;
                    slb slbVar2 = this.k;
                    if (nre.m(solVar, aiuvVar2, slbVar2.o(), slbVar2.q())) {
                        this.v.e(solVar.a());
                    }
                    if (slbVar2.F() != null || (this.r.b & 16384) != 0) {
                        son sonVarA = solVar.b().a();
                        sonVarA.c(true);
                        solVar.c = sonVarA.a();
                    }
                }
                slb slbVar3 = this.k;
                if (slbVar3.c() == null) {
                    rmp.m(this.i, this.j, "Expected MediaAd PlayerResponseModel not to be null.");
                    return;
                }
                if (slbVar3.c().n() != null && (slbVar3.c().n().b & 1) != 0) {
                    this.b.p(true);
                }
                if (slbVar3.c().o() != null && (slbVar3.c().o().c & 1) != 0) {
                    this.b.i(true);
                }
                if (slbVar3.c().n() != null) {
                    this.b.o(slbVar3.c().n().c);
                }
                ruf rufVar = this.v;
                rufVar.h();
                rufVar.e(this.b.a());
            }
        } catch (Exception e) {
            rmp.m(this.i, this.j, e.toString());
        }
    }

    @Override // defpackage.sog
    public final void x() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    @Override // defpackage.sog
    public final void y() {
        aiuv aiuvVar;
        ajwo ajwoVarQ;
        ruk rukVar;
        aiuv aiuvVar2;
        afv afvVar = new afv(1);
        afvVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.v.f());
        afvVar.put(xhd.e, this.b.g());
        slb slbVar = this.k;
        if (slbVar.o() != null || slbVar.q() != null) {
            this.w.e();
            if (!taq.aV(this.e) || (aiuvVar2 = this.r) == null || (aiuvVar2.b & 4) == 0) {
                aiuvVar = this.r;
                if (aiuvVar != null || (aiuvVar.b & 8) == 0) {
                    ajwoVarQ = slbVar.q();
                    rukVar = this.u;
                    if (ajwoVarQ != null) {
                        rukVar.b(slbVar.q(), afvVar);
                    } else {
                        rukVar.b(vxh.c(slbVar.o()), afvVar);
                    }
                } else {
                    ruk rukVar2 = this.u;
                    ajwo ajwoVar = aiuvVar.f;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    rukVar2.b(ajwoVar, afvVar);
                }
            } else {
                alay alayVar = aiuvVar2.e;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                if (alayVar.c.size() <= 0) {
                    aiuvVar = this.r;
                    if (aiuvVar != null) {
                        ajwoVarQ = slbVar.q();
                        rukVar = this.u;
                        if (ajwoVarQ != null) {
                            rukVar.b(slbVar.q(), afvVar);
                        } else {
                            rukVar.b(vxh.c(slbVar.o()), afvVar);
                        }
                    } else {
                        ajwoVarQ = slbVar.q();
                        rukVar = this.u;
                        if (ajwoVarQ != null) {
                            rukVar.b(slbVar.q(), afvVar);
                        } else {
                            rukVar.b(vxh.c(slbVar.o()), afvVar);
                        }
                    }
                } else {
                    alay alayVar2 = this.r.e;
                    if (alayVar2 == null) {
                        alayVar2 = alay.a;
                    }
                    if ((((alba) alayVar2.c.get(0)).b & SemanticState.Modal) != 0) {
                        alay alayVar3 = this.r.e;
                        if (alayVar3 == null) {
                            alayVar3 = alay.a;
                        }
                        ajwo ajwoVar2 = ((alba) alayVar3.c.get(0)).l;
                        if (ajwoVar2 == null) {
                            ajwoVar2 = ajwo.a;
                        }
                        this.u.b(ajwoVar2, afvVar);
                    } else {
                        aiuvVar = this.r;
                        if (aiuvVar != null) {
                            ajwoVarQ = slbVar.q();
                            rukVar = this.u;
                            if (ajwoVarQ != null) {
                                rukVar.b(slbVar.q(), afvVar);
                            } else {
                                rukVar.b(vxh.c(slbVar.o()), afvVar);
                            }
                        } else {
                            ajwoVarQ = slbVar.q();
                            rukVar = this.u;
                            if (ajwoVarQ != null) {
                                rukVar.b(slbVar.q(), afvVar);
                            } else {
                                rukVar.b(vxh.c(slbVar.o()), afvVar);
                            }
                        }
                    }
                }
            }
        }
        if (slbVar.p() != null) {
            this.u.c(slbVar.p().k);
        }
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
    public final /* synthetic */ void j(aayt aaytVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void k(aayw aaywVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void d(String str, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void o(int i, String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void n(wgi wgiVar, String str, wjf wjfVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void p(String str, long j, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
    }
}
