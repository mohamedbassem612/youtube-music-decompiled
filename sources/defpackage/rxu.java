package defpackage;

import j$.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(a = aixg.LAYOUT_TYPE_MEDIA_BREAK, b = aixo.SLOT_TYPE_PLAYER_BYTES, c = {sjc.class, shn.class}, d = {sic.class, sid.class})
public final class rxu implements rxj, rsu, rsq {
    private final Long A;
    private final boolean B;
    private final spy C;
    private final acm D;
    private final tld E;
    public final saq a;
    public final smr b;
    public final sko c;
    public final slc d;
    public final awmd e;
    public final slm f;
    public rsj g;
    public final rsk m;
    private final rsr n;
    private final CopyOnWriteArrayList o;
    private final vyo p;
    private final String q;
    private final wjf r;
    private final Executor s;
    private final Optional t;
    private final awmd u;
    private final awmd v;
    private final boolean w;
    private final boolean x;
    private final boolean y;
    private final abmt z;
    public int l = 1;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;

    public rxu(rsk rskVar, rsr rsrVar, saq saqVar, CopyOnWriteArrayList copyOnWriteArrayList, smr smrVar, sko skoVar, wjf wjfVar, Executor executor, acm acmVar, vyo vyoVar, tce tceVar, tld tldVar, awmd awmdVar, spy spyVar, abmt abmtVar, rmp rmpVar, awmd awmdVar2, awmd awmdVar3) {
        slc slcVar;
        this.m = rskVar;
        this.n = rsrVar;
        this.a = saqVar;
        this.o = copyOnWriteArrayList;
        this.b = smrVar;
        this.c = skoVar;
        this.r = wjfVar;
        this.q = (String) smrVar.d(sic.class);
        this.s = executor;
        this.D = acmVar;
        if (skoVar.e(sje.class)) {
            slcVar = (slc) skoVar.d(sje.class);
            this.d = slcVar;
        } else {
            slcVar = (slc) skoVar.d(sjc.class);
            this.d = slcVar;
        }
        this.E = tldVar;
        this.p = vyoVar;
        this.e = awmdVar;
        this.C = spyVar;
        this.u = awmdVar2;
        this.v = awmdVar3;
        slm slmVarF = nrj.f(smrVar, skoVar);
        this.f = slmVarF;
        this.w = slmVarF.equals(slm.PRE_ROLL);
        this.x = slmVarF.equals(slm.MID_ROLL);
        this.y = slmVarF.equals(slm.POST_ROLL);
        this.B = sdi.c(vyoVar, slmVarF, wjfVar);
        this.A = nrj.p(smrVar, skoVar, vyoVar);
        this.t = Optional.ofNullable(new aaok(tceVar, (smc) slcVar, slmVarF, wjfVar));
        this.z = abmtVar;
    }

    @Override // defpackage.rxj
    public final void M() {
        if (this.B && this.h) {
            return;
        }
        if (this.f == slm.POST_ROLL) {
            this.s.execute(afwl.i(new rxn(this, 3)));
        } else {
            t();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:18:0x005b  */
    @Override // defpackage.rxj
    public final void N(int i) {
        auzk auzkVarB;
        Object obj;
        String str;
        aixl aixlVarA;
        vyo vyoVar = this.p;
        if (taq.al(vyoVar) && (aixlVarA = nrk.a(i)) != aixl.PHASE_AD_PLAYBACK_TERMINATION_EVENT_UNSPECIFIED) {
            nrk.b((spv) this.u.io(), this.b, skh.b(this.q, this.r, this.d.o), aixn.RENDERING_EVENT_TYPE_PHASE_AD_PLAYBACK_TERMINATION_EVENTS, aixlVarA, this.c);
        }
        if (this.B) {
            this.n.h(this);
            if (i == 0) {
                auzkVarB = ((rug) this.v.io()).b(this.d.o, this.q);
                if (!auzkVarB.a) {
                    obj = auzkVarB.b;
                    if (obj != null) {
                        str = ((aosi) obj).d;
                    } else {
                        str = "Unknown error";
                    }
                    rmp.n(this.b, "Failed to skip clip via CISA Shim API: ".concat(String.valueOf(str)));
                }
            } else if (i == 2) {
                i = 2;
                auzkVarB = ((rug) this.v.io()).b(this.d.o, this.q);
                if (!auzkVarB.a) {
                    obj = auzkVarB.b;
                    if (obj != null) {
                        str = ((aosi) obj).d;
                    } else {
                        str = "Unknown error";
                    }
                    rmp.n(this.b, "Failed to skip clip via CISA Shim API: ".concat(String.valueOf(str)));
                }
            }
        } else {
            wjf wjfVar = this.r;
            if (taq.at(vyoVar, wjfVar.V(), wjfVar.P(), this.w, this.x, this.y, true)) {
                this.D.d();
            }
        }
        if (i == 0 && (this.d instanceof sna)) {
            this.C.g();
        }
        if (i != 4 && i != 1) {
            this.E.f(this.d);
        }
        rsj rsjVar = this.g;
        if (rsjVar != null) {
            rsjVar.a();
            this.g = null;
        }
        this.C.a();
        Optional optional = this.t;
        if (optional.isPresent()) {
            ((aaok) optional.get()).T();
        }
        this.m.d(this.b, this.c, i);
        this.l = 2;
        if (this.f == slm.PRE_ROLL) {
            if (i == 0 || i == 2 || i == 3) {
                boolean zCi = this.z.ci();
                wjf wjfVar2 = this.r;
                if (zCi) {
                    wjfVar2.k().g();
                } else {
                    wjfVar2.k().b("PREROLL_SHOWN", true);
                }
            }
        }
    }

    @Override // defpackage.rsu
    public final void Q() {
        u();
    }

    @Override // defpackage.rxj
    public final void S() {
        if (!this.B || this.h) {
            return;
        }
        this.h = true;
        this.n.h(this);
        rug rugVar = (rug) this.v.io();
        slc slcVar = this.d;
        rugVar.b(slcVar.o, this.q);
        rsj rsjVar = this.g;
        if (rsjVar != null) {
            rsjVar.a();
            this.g = null;
        }
    }

    @Override // defpackage.rxj
    public final sko a() {
        throw null;
    }

    @Override // defpackage.rxj
    public final void b() throws Throwable {
        if (this.B) {
            String str = this.q;
            rsk rskVar = this.m;
            smr smrVar = this.b;
            sko skoVar = this.c;
            if (nrj.o(str, rskVar, smrVar, skoVar)) {
                try {
                    this.n.e(this);
                    sdi.f((rug) this.v.io(), smrVar, str, this.r, this.A.longValue(), agke.q(skoVar), false, this.f, (spv) this.u.io(), this.p);
                } catch (sas e) {
                    this.n.h(this);
                    this.m.u(this.b, this.c, e, 10);
                }
            }
        }
    }

    @Override // defpackage.rsq
    public final void g(aazp aazpVar) {
        if (this.B) {
            this.s.execute(afwl.i(new rhz(this, aazpVar, 17, null)));
        }
    }

    public final void t() {
        if (this.B) {
            if (this.h) {
                return;
            }
            this.j = true;
            if ((this.w || this.i) && !this.k) {
                this.k = true;
                u();
                return;
            }
            return;
        }
        vyo vyoVar = this.p;
        wjf wjfVar = this.r;
        if (!taq.at(vyoVar, wjfVar.V(), wjfVar.P(), this.w, this.x, this.y, true)) {
            u();
            return;
        }
        try {
            acm acmVar = this.D;
            if (acmVar.f()) {
                u();
            } else {
                acmVar.e((acfw) this.b.d(sjy.class), this);
            }
        } catch (rso e) {
            this.m.u(this.b, this.c, new sas(ahno.Z(e.getMessage()), e.a), 10);
        }
    }

    public final void u() {
        spy spyVar = this.C;
        String str = this.q;
        slc slcVar = this.d;
        slm slmVar = this.f;
        spyVar.b(str, slcVar, slmVar, this.A);
        if (this.w) {
            ((run) this.e.io()).s();
        }
        awmd awmdVar = this.e;
        ((run) awmdVar.io()).b(slcVar, slmVar);
        for (rsj rsjVar : this.o) {
            if (rsjVar.b()) {
                ((run) awmdVar.io()).c(slcVar, slmVar);
                this.m.b(this.b, this.c);
                this.g = rsjVar;
                return;
            }
        }
        awmd awmdVar2 = this.e;
        sgm sgmVar = sgm.VIDEO_ERROR;
        ((run) awmdVar2.io()).a(this.d, sgmVar, this.f);
        this.g = null;
        int iA = sgm.a(sgmVar);
        if (iA == 0) {
            this.a.ab(this.c, 0);
            return;
        }
        if (iA == 1) {
            this.m.u(this.b, this.c, new sas("Custom display error", 44), 10);
        } else if (iA != 2) {
            this.m.u(this.b, this.c, new sas(a.bR(iA, "Unrecognized scenario for custom display: "), 45), 10);
        } else {
            this.a.ab(this.c, 2);
        }
    }

    @Override // defpackage.rsu
    public final /* synthetic */ void R() {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.rsu
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.rsu
    public final /* synthetic */ void s() {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void e(aaxa aaxaVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void f(zhz zhzVar) {
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
    public final /* synthetic */ void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
