package defpackage;

import j$.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(a = aixg.LAYOUT_TYPE_MEDIA_BREAK, b = aixo.SLOT_TYPE_PLAYER_BYTES, c = {sjc.class, shn.class}, d = {sic.class, sid.class})
public final class rxr implements rxx, rsu {
    public final rxw a;
    public final saq b;
    public final smr c;
    public final sko d;
    public final slc e;
    public final skh f;
    public final awmd g;
    public final slm h;
    public final rsk i;
    private final CopyOnWriteArrayList j;
    private final vyo k;
    private final String l;
    private final wjf m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final Long q;
    private final boolean r;
    private rsj s;
    private final awmd t;
    private final spy u;
    private final acm v;
    private final tld w;
    private final aaok x;

    public rxr(rsk rskVar, rxw rxwVar, saq saqVar, CopyOnWriteArrayList copyOnWriteArrayList, spy spyVar, tld tldVar, vyo vyoVar, tce tceVar, smr smrVar, sko skoVar, acm acmVar, awmd awmdVar, rmp rmpVar, awmd awmdVar2) {
        slc slcVar;
        this.i = rskVar;
        this.a = rxwVar;
        this.b = saqVar;
        this.j = copyOnWriteArrayList;
        this.u = spyVar;
        this.w = tldVar;
        this.k = vyoVar;
        this.c = smrVar;
        this.d = skoVar;
        this.v = acmVar;
        this.g = awmdVar;
        this.t = awmdVar2;
        if (skoVar.e(sje.class)) {
            slcVar = (slc) skoVar.d(sje.class);
            this.e = slcVar;
        } else {
            slcVar = (slc) skoVar.d(sjc.class);
            this.e = slcVar;
        }
        String str = (String) smrVar.d(sic.class);
        this.l = str;
        wjf wjfVar = (wjf) smrVar.d(sid.class);
        this.m = wjfVar;
        slm slmVarF = nrj.f(smrVar, skoVar);
        this.h = slmVarF;
        this.n = slmVarF.equals(slm.PRE_ROLL);
        this.o = slmVarF.equals(slm.MID_ROLL);
        this.p = slmVarF.equals(slm.POST_ROLL);
        this.r = sdi.c(vyoVar, slmVarF, wjfVar);
        this.q = nrj.p(smrVar, skoVar, vyoVar);
        this.x = slcVar instanceof sgt ? null : new aaok(tceVar, (smc) slcVar, slmVarF, wjfVar);
        this.f = skh.a(str, wjfVar);
    }

    private final void g() {
        slc slcVar = this.e;
        smc smcVar = slcVar instanceof sgt ? ((sgt) slcVar).c : slcVar;
        String str = this.l;
        spy spyVar = this.u;
        slm slmVar = this.h;
        spyVar.b(str, smcVar, slmVar, this.q);
        this.a.t();
        awmd awmdVar = this.g;
        ((run) awmdVar.io()).b(slcVar, slmVar);
        for (rsj rsjVar : this.j) {
            if (rsjVar.b()) {
                ((run) awmdVar.io()).c(slcVar, slmVar);
                this.i.c(this.f, this.c, this.d);
                f(Optional.of(rsjVar));
                return;
            }
        }
        awmd awmdVar2 = this.g;
        sgm sgmVar = sgm.VIDEO_ERROR;
        run runVar = (run) awmdVar2.io();
        slc slcVar2 = this.e;
        runVar.a(slcVar2, sgmVar, this.h);
        f(Optional.empty());
        int iA = sgm.a(sgmVar);
        if (iA == 0) {
            N(0);
            this.a.u(this.d, 0);
            return;
        }
        if (iA == 1) {
            this.a.w(new sas("Custom display error", 44), 10);
            return;
        }
        if (iA != 2) {
            this.a.w(new sas(a.bR(iA, "Unrecognized scenario for custom display: "), 45), 10);
        } else if (!slc.av(slcVar2.iJ())) {
            this.b.ab(this.d, 2);
        } else {
            N(2);
            this.a.u(this.d, 2);
        }
    }

    @Override // defpackage.rxj
    public final void M() {
        if (!(this.e instanceof snc)) {
            if (this.r) {
                g();
                return;
            }
            vyo vyoVar = this.k;
            wjf wjfVar = this.m;
            if (!taq.at(vyoVar, wjfVar.V(), wjfVar.P(), this.n, this.o, this.p, false)) {
                g();
                return;
            }
            try {
                acm acmVar = this.v;
                if (acmVar.f()) {
                    g();
                } else {
                    acmVar.e((acfw) this.c.d(sjy.class), this);
                }
                return;
            } catch (rso e) {
                this.a.w(new sas(e.getMessage(), e.a), 10);
                return;
            }
        }
        sko skoVar = this.d;
        boolean zE = skoVar.e(sio.class);
        rsk rskVar = this.i;
        if (!zE) {
            skh skhVar = this.f;
            smr smrVar = this.c;
            rskVar.c(skhVar, smrVar, skoVar);
            rskVar.e(skhVar, smrVar, skoVar, 0);
            this.a.u(skoVar, 0);
            return;
        }
        rskVar.c(this.f, this.c, skoVar);
        for (rsj rsjVar : this.j) {
            if (rsjVar.b()) {
                f(Optional.of(rsjVar));
                return;
            }
        }
        sgm sgmVar = sgm.VIDEO_ERROR;
        f(Optional.empty());
        int iA = sgm.a(sgmVar);
        rsk rskVar2 = this.i;
        if (iA != 0) {
            rskVar2.e(this.f, this.c, this.d, 1);
            this.a.w(new sas(a.bR(iA, "Unrecognized scenario for survey interstitial: "), 45), 10);
            return;
        }
        skh skhVar2 = this.f;
        smr smrVar2 = this.c;
        sko skoVar2 = this.d;
        rskVar2.e(skhVar2, smrVar2, skoVar2, 0);
        this.a.u(skoVar2, 0);
    }

    @Override // defpackage.rxj
    public final void N(int i) {
        aaok aaokVar;
        aixl aixlVarA;
        vyo vyoVar = this.k;
        if (taq.al(vyoVar) && (aixlVarA = nrk.a(i)) != aixl.PHASE_AD_PLAYBACK_TERMINATION_EVENT_UNSPECIFIED) {
            nrk.b((spv) this.t.io(), this.c, skh.b(this.l, this.m, this.e.o), aixn.RENDERING_EVENT_TYPE_PHASE_AD_PLAYBACK_TERMINATION_EVENTS, aixlVarA, this.d);
        }
        if (i == 0) {
            slc slcVar = this.e;
            if ((slcVar instanceof sna) || (slcVar instanceof sgt)) {
                this.u.g();
            }
        }
        if (i != 4 && i != 1) {
            this.w.f(this.e);
        }
        rsj rsjVar = this.s;
        if (rsjVar != null) {
            rsjVar.a();
            this.s = null;
        }
        this.u.a();
        if (!(this.e instanceof sgt) && (aaokVar = this.x) != null) {
            aaokVar.T();
        }
        rsk rskVar = this.i;
        skh skhVar = this.f;
        smr smrVar = this.c;
        rskVar.e(skhVar, smrVar, this.d, i);
        if (this.r) {
            return;
        }
        wjf wjfVar = this.m;
        if (taq.at(vyoVar, wjfVar.V(), wjfVar.P(), this.n, this.o, this.p, false)) {
            this.v.d();
            if (i == 0) {
                try {
                    sdo.j((acfw) smrVar.d(sjy.class));
                } catch (rso e) {
                    rmp.n(this.c, e.toString());
                }
            }
        }
    }

    @Override // defpackage.rsu
    public final void Q() {
        g();
    }

    @Override // defpackage.rxj
    public final sko a() {
        return this.d;
    }

    public final void f(Optional optional) {
        this.s = (rsj) optional.orElse(null);
    }

    @Override // defpackage.rsu
    public final /* synthetic */ void R() {
    }

    @Override // defpackage.rxj
    public final void S() {
    }

    @Override // defpackage.rxj
    public final void b() {
    }

    @Override // defpackage.rsu
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.rsu
    public final /* synthetic */ void s() {
    }
}
