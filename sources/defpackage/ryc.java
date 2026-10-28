package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ryc implements rye {
    private final rsi a;
    private final awmd b;
    private final awmd c;
    private final awmd d;
    private final awmd e;
    private final awmd f;
    private final awmd g;
    private final awmd h;
    private final awmd i;
    private final awmd j;
    private final awmd k;
    private final awmd l;
    private final awmd m;
    private final awmd n;
    private final Executor o;
    private final spv p;
    private final awmd q;
    private final rti r;
    private final abvn s;
    private final abnc t;
    private final roq u;
    private final rmp v;
    private final vwt w;

    public ryc(rsi rsiVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, awmd awmdVar13, awmd awmdVar14, rti rtiVar, vwt vwtVar, abnc abncVar, abvn abvnVar, Executor executor, rmp rmpVar, roq roqVar, spv spvVar) {
        this.a = rsiVar;
        this.b = awmdVar;
        this.c = awmdVar2;
        this.d = awmdVar3;
        this.e = awmdVar4;
        this.f = awmdVar5;
        this.g = awmdVar6;
        this.i = awmdVar8;
        this.j = awmdVar9;
        this.l = awmdVar10;
        this.m = awmdVar11;
        this.n = awmdVar12;
        this.h = awmdVar7;
        this.u = roqVar;
        this.r = rtiVar;
        this.w = vwtVar;
        this.t = abncVar;
        this.s = abvnVar;
        this.o = executor;
        this.v = rmpVar;
        this.q = awmdVar13;
        this.k = awmdVar14;
        this.p = spvVar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.rye
    public final rxj U(smr smrVar, sko skoVar) throws ryd {
        rxj rxfVar;
        if (nrj.e(rxh.class, smrVar, skoVar)) {
            rsk rskVar = (rsk) this.b.io();
            vyo vyoVar = (vyo) this.e.io();
            vxu vxuVar = (vxu) this.f.io();
            sgv sgvVar = (sgv) this.h.io();
            rpi rpiVar = (rpi) this.m.io();
            spy spyVar = (spy) this.g.io();
            Executor executor = this.o;
            abnc abncVar = this.t;
            ruk rukVar = (ruk) this.n.io();
            ruf rufVar = (ruf) this.l.io();
            roq roqVar = this.u;
            vwt vwtVar = this.w;
            rsr rsrVar = (rsr) this.i.io();
            return new rxh(rskVar, vyoVar, vxuVar, sgvVar, rpiVar, spyVar, executor, abncVar, rukVar, rufVar, roqVar, vwtVar, rsrVar, smrVar, skoVar, (ruw) this.q.io(), (saq) this.c.io(), this.s, (rnj) this.k.io(), this.p);
        }
        if (nrj.e(rxi.class, smrVar, skoVar)) {
            awmd awmdVar = this.e;
            if (taq.ay((vyo) awmdVar.io())) {
                rmp.k(smrVar, "go/instream-selene-player-overlay-abandon-debug: InPlayerOverlayLayoutRenderingAdapter is used.");
            }
            rsk rskVar2 = (rsk) this.b.io();
            vyo vyoVar2 = (vyo) awmdVar.io();
            sgv sgvVar2 = (sgv) this.h.io();
            rpi rpiVar2 = (rpi) this.m.io();
            spy spyVar2 = (spy) this.g.io();
            Executor executor2 = this.o;
            abnc abncVar2 = this.t;
            ruk rukVar2 = (ruk) this.n.io();
            ruf rufVar2 = (ruf) this.l.io();
            rsr rsrVar2 = (rsr) this.i.io();
            rxfVar = new rxi(rskVar2, vyoVar2, sgvVar2, rpiVar2, spyVar2, executor2, abncVar2, rukVar2, rufVar2, rsrVar2, smrVar, skoVar);
        } else if (nrj.e(rxk.class, smrVar, skoVar)) {
            rxfVar = new rxk((rsk) this.b.io(), this.o, (ruf) this.l.io(), smrVar, skoVar);
        } else if (nrj.e(rxc.class, smrVar, skoVar)) {
            if (this.r == rti.a) {
                throw new ryd("No-op cta overlay api set when trying to build discovery InPlayer LRA", 58);
            }
            if (taq.ay((vyo) this.e.io())) {
                rmp.k(smrVar, "go/instream-selene-player-overlay-abandon-debug: DiscoveryInPlayerOverlayLayoutRenderingAdapter is being used.");
            }
            rsk rskVar3 = (rsk) this.b.io();
            rsr rsrVar3 = (rsr) this.i.io();
            rxfVar = new rxc(rskVar3, rsrVar3, (rpi) this.m.io(), this.t, smrVar, skoVar);
        } else if (nrj.e(rxb.class, smrVar, skoVar)) {
            rxfVar = new rxb((rsk) this.b.io(), (ruf) this.l.io(), (ruk) this.n.io(), this.o, smrVar, skoVar);
        } else {
            if (!nrj.e(rxf.class, smrVar, skoVar)) {
                throw new ryd("InPlayerLayoutRenderingAdapterFactory received unrecognized slot/layout pairing", 52);
            }
            if (taq.ay((vyo) this.e.io())) {
                rmp.k(smrVar, "go/instream-selene-player-overlay-abandon-debug: FullscreenLeaveBehindLayoutRenderingAdapter is being used.");
            }
            rsk rskVar4 = (rsk) this.b.io();
            rpi rpiVar3 = (rpi) this.m.io();
            Executor executor3 = this.o;
            abnc abncVar3 = this.t;
            rxfVar = new rxf(rskVar4, rpiVar3, executor3, abncVar3, (rsr) this.i.io(), smrVar, skoVar);
        }
        return rxfVar;
    }
}
