package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ryg implements rye, rsq {
    private final awmd A;
    private final rmp B;
    private final awmd a;
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
    private final Executor n;
    private final Executor o;
    private final awmd p;
    private final CopyOnWriteArrayList q;
    private final Map r = new HashMap();
    private final awmd s;
    private final awmd t;
    private final awmd u;
    private final awmd v;
    private final awmd w;
    private final awmd x;
    private final awmd y;
    private final awmd z;

    public ryg(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, awmd awmdVar13, awmd awmdVar14, Executor executor, Executor executor2, CopyOnWriteArrayList copyOnWriteArrayList, rmp rmpVar, awmd awmdVar15, awmd awmdVar16, awmd awmdVar17, awmd awmdVar18, awmd awmdVar19, awmd awmdVar20, awmd awmdVar21, awmd awmdVar22, awmd awmdVar23) {
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
        this.d = awmdVar4;
        this.e = awmdVar5;
        this.f = awmdVar6;
        this.h = awmdVar8;
        this.i = awmdVar9;
        this.j = awmdVar10;
        this.k = awmdVar11;
        this.l = awmdVar12;
        this.m = awmdVar13;
        this.p = awmdVar14;
        this.n = executor;
        this.o = executor2;
        this.q = copyOnWriteArrayList;
        this.B = rmpVar;
        this.s = awmdVar15;
        this.g = awmdVar7;
        this.u = awmdVar16;
        this.v = awmdVar17;
        this.w = awmdVar18;
        this.x = awmdVar19;
        this.y = awmdVar20;
        this.z = awmdVar21;
        this.t = awmdVar22;
        this.A = awmdVar23;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0444  */
    @Override // defpackage.rye
    public final rxj U(smr smrVar, sko skoVar) throws ryd {
        rxx rxrVar;
        rmp rmpVar;
        awmd awmdVar;
        boolean z;
        slb slbVar;
        if (nrj.e(rxt.class, smrVar, skoVar) && (slbVar = (slb) skoVar.d(sjb.class)) != null && slbVar.B()) {
            awmd awmdVar2 = this.a;
            if (taq.ar((vyo) awmdVar2.io())) {
                abvn abvnVar = (abvn) this.A.io();
                if (abvnVar == null || abvnVar.aq() == null) {
                    throw new ryd("Missing VirtualPlaybackCreator for DIBS playback.", 52);
                }
                rsk rskVar = (rsk) this.i.io();
                if (rskVar == null) {
                    throw new NullPointerException("Null callback");
                }
                rsr rsrVar = (rsr) this.d.io();
                if (rsrVar == null) {
                    throw new NullPointerException("Null directorEventsApi");
                }
                saq saqVar = (saq) this.k.io();
                if (saqVar == null) {
                    throw new NullPointerException("Null layoutSelfExitRequestListener");
                }
                if (skoVar == null) {
                    throw new NullPointerException("Null layout");
                }
                sdo sdoVar = (sdo) this.s.io();
                if (sdoVar == null) {
                    throw new NullPointerException("Null playbackTimelineApi");
                }
                rmp rmpVar2 = this.B;
                if (rmpVar2 == null) {
                    throw new NullPointerException("Null eCatcherLogger");
                }
                vyo vyoVar = (vyo) awmdVar2.io();
                if (vyoVar == null) {
                    throw new NullPointerException("Null hotConfigGroupSupplier");
                }
                abxu abxuVarAq = abvnVar.aq();
                if (abxuVarAq != null) {
                    return new rxt(rskVar, rsrVar, saqVar, smrVar, skoVar, sdoVar, rmpVar2, vyoVar, abxuVarAq);
                }
                throw new NullPointerException("Null virtualPlaybackCreator");
            }
        }
        if (nrj.e(rxo.class, smrVar, skoVar)) {
            yvs yvsVar = (yvs) smrVar.d(sih.class);
            Map map = this.r;
            String str = yvsVar.a;
            if (map.containsKey(str)) {
                yvsVar = (yvs) map.get(str);
            }
            yvs yvsVar2 = yvsVar;
            awmd awmdVar3 = this.d;
            rsr rsrVar2 = (rsr) awmdVar3.io();
            awmd awmdVar4 = this.g;
            ruw ruwVar = (ruw) awmdVar4.io();
            awmd awmdVar5 = this.m;
            spy spyVar = (spy) awmdVar5.io();
            tbt tbtVar = (tbt) this.p.io();
            Executor executor = this.n;
            Executor executor2 = this.o;
            rsk rskVar2 = (rsk) this.i.io();
            awmd awmdVar6 = this.j;
            rsk rskVar3 = (rsk) awmdVar6.io();
            awmd awmdVar7 = this.a;
            vyo vyoVar2 = (vyo) awmdVar7.io();
            awmd awmdVar8 = this.x;
            awmd awmdVar9 = this.w;
            rxo rxoVar = new rxo(rsrVar2, ruwVar, spyVar, tbtVar, executor, executor2, smrVar, skoVar, rskVar2, rskVar3, yvsVar2, vyoVar2, awmdVar8, (abmt) awmdVar9.io());
            for (sko skoVar2 : (List) skoVar.d(sjq.class)) {
                if (!nrj.e(rxp.class, smrVar, skoVar2)) {
                    throw new ryd("Unrecognized metadata. slot: " + smrVar.toString() + ", layout: " + String.valueOf(skoVar2), 52);
                }
                rxo rxoVar2 = rxoVar;
                rxp rxpVar = new rxp((spy) awmdVar5.io(), (ruw) awmdVar4.io(), smrVar, skoVar2, (rsk) awmdVar6.io(), (vyo) awmdVar7.io(), (sag) this.l.io(), rxoVar2, (ruk) this.c.io(), (rsr) awmdVar3.io(), (abmt) awmdVar9.io());
                rxoVar = rxoVar2;
                rxoVar.e.add(rxpVar);
            }
            return rxoVar;
        }
        if (nrj.e(rxv.class, smrVar, skoVar)) {
            return new rxv((rsk) this.i.io(), (rsr) this.d.io(), (saq) this.k.io(), (rus) this.f.io(), smrVar, skoVar, (wjf) smrVar.d(sid.class), this.o, (acm) this.e.io(), (sdo) this.s.io(), (vyo) this.a.io(), (vxu) this.b.io(), this.B, (tbt) this.p.io(), (tld) this.h.io(), (ruk) this.c.io(), this.u, (tce) this.v.io(), (abmt) this.w.io(), this.t, this.y);
        }
        if (nrj.e(rxu.class, smrVar, skoVar)) {
            return new rxu((rsk) this.i.io(), (rsr) this.d.io(), (saq) this.k.io(), this.q, smrVar, skoVar, (wjf) smrVar.d(sid.class), this.o, (acm) this.e.io(), (vyo) this.a.io(), (tce) this.v.io(), (tld) this.h.io(), this.u, (spy) this.m.io(), (abmt) this.w.io(), this.B, this.y, this.t);
        }
        if (!nrj.e(rxq.class, smrVar, skoVar)) {
            throw new ryd("PlayerBytesLayoutRenderingAdapterFactory received unsupported slot", 52);
        }
        List list = (List) skoVar.d(sjq.class);
        wjf wjfVar = (wjf) smrVar.d(sid.class);
        rsk rskVar4 = (rsk) this.i.io();
        awmd awmdVar10 = this.j;
        rsk rskVar5 = (rsk) awmdVar10.io();
        awmd awmdVar11 = this.d;
        rsr rsrVar3 = (rsr) awmdVar11.io();
        awmd awmdVar12 = this.k;
        saq saqVar2 = (saq) awmdVar12.io();
        rus rusVar = (rus) this.f.io();
        Executor executor3 = this.o;
        awmd awmdVar13 = this.e;
        acm acmVar = (acm) awmdVar13.io();
        awmd awmdVar14 = this.s;
        sdo sdoVar2 = (sdo) awmdVar14.io();
        awmd awmdVar15 = this.a;
        vyo vyoVar3 = (vyo) awmdVar15.io();
        rmp rmpVar3 = this.B;
        awmd awmdVar16 = this.u;
        abmt abmtVar = (abmt) this.w.io();
        awmd awmdVar17 = this.y;
        rxq rxqVar = new rxq(rskVar4, rskVar5, rsrVar3, saqVar2, rusVar, smrVar, skoVar, wjfVar, executor3, acmVar, sdoVar2, vyoVar3, rmpVar3, awmdVar16, abmtVar, awmdVar17, this.t);
        smr smrVar2 = smrVar;
        sko skoVar3 = skoVar;
        rmp rmpVar4 = rmpVar3;
        awmd awmdVar18 = awmdVar16;
        int i = 0;
        while (i < list.size()) {
            List list2 = (List) skoVar3.d(sjq.class);
            sko skoVar4 = (sko) list2.get(i);
            if (nrj.e(rxs.class, smrVar2, skoVar4)) {
                int i2 = i + 1;
                rsk rskVar6 = (rsk) awmdVar10.io();
                vyo vyoVar4 = (vyo) awmdVar15.io();
                acm acmVar2 = (acm) awmdVar13.io();
                rsr rsrVar4 = (rsr) awmdVar11.io();
                ruk rukVar = (ruk) this.c.io();
                spy spyVar2 = (spy) this.m.io();
                tld tldVar = (tld) this.h.io();
                sag sagVar = (sag) this.l.io();
                tbt tbtVar2 = (tbt) this.p.io();
                if (i2 < list2.size()) {
                    sko skoVar5 = (sko) list2.get(i2);
                    if (skoVar5.e(sjc.class)) {
                        z = skoVar5.d(sjc.class) instanceof sgt;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                rxrVar = new rxs(rskVar6, rxqVar, vyoVar4, acmVar2, rsrVar4, rukVar, spyVar2, tldVar, sagVar, tbtVar2, smrVar2, skoVar4, z, (tce) this.v.io(), (ruf) this.z.io(), awmdVar17);
                rmpVar = rmpVar4;
                awmdVar = awmdVar18;
                i = i2;
            } else {
                if (!nrj.e(rxr.class, smrVar2, skoVar4)) {
                    throw new ryd("Unrecognized metadata. slot: " + smrVar.toString() + ", layout: " + String.valueOf(skoVar4), 52);
                }
                int i3 = i + 1;
                rsk rskVar7 = (rsk) awmdVar10.io();
                saq saqVar3 = (saq) awmdVar12.io();
                CopyOnWriteArrayList copyOnWriteArrayList = this.q;
                spy spyVar3 = (spy) this.m.io();
                tld tldVar2 = (tld) this.h.io();
                vyo vyoVar5 = (vyo) awmdVar15.io();
                tce tceVar = (tce) this.v.io();
                acm acmVar3 = (acm) awmdVar13.io();
                rmpVar = rmpVar4;
                awmdVar = awmdVar18;
                rxrVar = new rxr(rskVar7, rxqVar, saqVar3, copyOnWriteArrayList, spyVar3, tldVar2, vyoVar5, tceVar, smrVar, skoVar4, acmVar3, awmdVar, rmpVar, awmdVar17);
                i = i3;
            }
            rxqVar.a.add(rxrVar);
            smrVar2 = smrVar;
            skoVar3 = skoVar;
            awmdVar18 = awmdVar;
            rmpVar4 = rmpVar;
        }
        return rxqVar;
    }

    @Override // defpackage.rsq
    public final void e(aaxa aaxaVar) {
        yvs yvsVar = aaxaVar.a;
        this.r.put(yvsVar.a, yvsVar);
    }

    @Override // defpackage.rsq
    public final void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
        if (abobVar == abob.a) {
            this.r.clear();
        }
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
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
    public final /* synthetic */ void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
