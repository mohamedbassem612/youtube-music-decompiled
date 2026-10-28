package defpackage;

import android.text.TextUtils;
import java.util.Map;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(a = aixg.LAYOUT_TYPE_MEDIA, b = aixo.SLOT_TYPE_PLAYER_BYTES, c = {sjb.class}, d = {sic.class, sid.class})
public final class rxp implements rxx, rst, sgq, rsq {
    private final smr a;
    private final sko b;
    private final skh c;
    private final vyo d;
    private final sag e;
    private final rxw f;
    private abnr g = abnr.DEFAULT;
    private final rsr h;
    private final PriorityQueue i;
    private final boolean j;
    private final spy k;
    private final rsk l;
    private final ruk m;
    private final ruw n;

    public rxp(spy spyVar, ruw ruwVar, smr smrVar, sko skoVar, rsk rskVar, vyo vyoVar, sag sagVar, rxw rxwVar, ruk rukVar, rsr rsrVar, abmt abmtVar) {
        this.k = spyVar;
        this.a = smrVar;
        this.b = skoVar;
        this.l = rskVar;
        boolean z = true;
        if (!((wjf) smrVar.d(sid.class)).T() && !abmtVar.ao()) {
            z = false;
        }
        this.j = z;
        if (z) {
            this.c = skh.b((String) smrVar.d(sic.class), (wjf) smrVar.d(sid.class), ((slb) skoVar.d(sjb.class)).o);
        } else {
            this.c = skh.a((String) smrVar.d(sic.class), (wjf) smrVar.d(sid.class));
            ruwVar.a(this);
        }
        this.d = vyoVar;
        this.e = sagVar;
        this.f = rxwVar;
        this.m = rukVar;
        this.h = rsrVar;
        this.n = ruwVar;
        if (!smrVar.e(shx.class) && !skoVar.e(sip.class)) {
            rmp.m(smrVar, skoVar, "Slot is missing BreakTypeGetter and layout is also missing InstreamAdBreakGetter. This is unexpected.");
        }
        if (z) {
            sagVar.c(skoVar.a, this);
        }
        this.i = nrj.h((slb) skoVar.d(sjb.class));
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, vxe] */
    @Override // defpackage.rxj
    public final void M() {
        smr smrVar;
        Map map;
        String str;
        Map map2;
        spy spyVar;
        String str2;
        rxp rxpVar = this;
        if (rxpVar.j) {
            rxpVar.h.e(rxpVar);
            rxpVar.n.a(rxpVar);
        }
        sko skoVar = rxpVar.b;
        slb slbVar = (slb) skoVar.d(sjb.class);
        smr smrVar2 = rxpVar.a;
        boolean zE = smrVar2.e(shx.class);
        spy spyVar2 = rxpVar.k;
        if (zE) {
            String str3 = (String) smrVar2.d(sic.class);
            String strG = ((wjf) smrVar2.d(sid.class)).G();
            Long lValueOf = Long.valueOf(((yvs) smrVar2.d(sih.class)).a());
            slm slmVar = (slm) smrVar2.d(shx.class);
            taq.d();
            if (spyVar2.d != null) {
                if (TextUtils.equals(spyVar2.d.i(), slbVar.o)) {
                    skoVar = skoVar;
                    smrVar = smrVar2;
                } else {
                    spyVar2.d.z();
                }
            }
            Map map3 = spyVar2.b;
            String str4 = slbVar.o;
            if (map3.containsKey(str4)) {
                smrVar = smrVar2;
                map2 = map3;
                spyVar = spyVar2;
                str2 = str4;
            } else {
                snz snzVarJ = spyVar2.g.j(slbVar);
                vrn vrnVar = spyVar2.e;
                aaxo aaxoVarC = ((abnc) vrnVar.g).c();
                zdj zdjVarC = vrnVar.c(slbVar);
                sga sgaVarT = ((ayq) vrnVar.e).T();
                Object obj = vrnVar.c;
                awmd awmdVar = vrnVar.a;
                Object obj2 = vrnVar.b;
                str2 = str4;
                spyVar = spyVar2;
                map2 = map3;
                smrVar = smrVar2;
                map2.put(str2, new sqb(snzVarJ, slbVar, str3, aaxoVarC, (adws) vrnVar.f, zdjVarC, sgaVarT, vrnVar.d, strG, lValueOf, slmVar, (vyo) obj2, awmdVar, (abmt) obj));
            }
            spx spxVar = (spx) map2.get(str2);
            spy spyVar3 = spyVar;
            spyVar3.d = spxVar;
            spyVar3.a.c(spyVar3.d.h());
            rxpVar = this;
        } else {
            smrVar = smrVar2;
            String str5 = (String) smrVar.d(sic.class);
            skoVar = skoVar;
            skl sklVar = (skl) skoVar.d(sip.class);
            taq.d();
            if (spyVar2.d != null) {
                if (TextUtils.equals(spyVar2.d.i(), slbVar.o)) {
                    rxpVar = this;
                    skoVar = skoVar;
                    smrVar = smrVar;
                } else {
                    spyVar2.d.z();
                }
            }
            Map map4 = spyVar2.b;
            String str6 = slbVar.o;
            if (map4.containsKey(str6)) {
                map = map4;
                str = str6;
            } else {
                snz snzVarJ2 = spyVar2.g.j(slbVar);
                vrn vrnVar2 = spyVar2.e;
                aaxo aaxoVarC2 = ((abnc) vrnVar2.g).c();
                zdj zdjVarC2 = vrnVar2.c(slbVar);
                sga sgaVarT2 = ((ayq) vrnVar2.e).T();
                Object obj3 = vrnVar2.c;
                awmd awmdVar2 = vrnVar2.a;
                Object obj4 = vrnVar2.b;
                str = str6;
                map = map4;
                map.put(str, new sqb(snzVarJ2, sklVar, slbVar, str5, aaxoVarC2, (adws) vrnVar2.f, zdjVarC2, sgaVarT2, vrnVar2.d, (vyo) obj4, awmdVar2, (abmt) obj3));
            }
            spyVar2.d = (spx) map.get(str);
            spyVar2.a.c(spyVar2.d.h());
            rxpVar = this;
        }
        rxpVar.l.c(rxpVar.c, smrVar, skoVar);
    }

    @Override // defpackage.rxj
    public final void N(int i) {
        int i2;
        if (this.j) {
            this.h.h(this);
            this.n.b(this);
            i2 = i;
            nrj.n(this.i, (slb) this.b.d(sjb.class), i2, this.m, false, this.g, this.d);
        } else {
            i2 = i;
        }
        this.l.e(this.c, this.a, this.b, i2);
    }

    @Override // defpackage.rst
    public final void P(long j, String str) {
        sme smeVar;
        String str2 = ((slb) this.b.d(sjb.class)).o;
        taq.d();
        spy spyVar = this.k;
        if (spyVar.d != null) {
            spyVar.d.n(j);
        }
        nrm nrmVar = spyVar.f;
        if (nrmVar != null) {
            nrmVar.a(j, str2);
        }
        if (!this.j) {
            return;
        }
        while (true) {
            PriorityQueue priorityQueue = this.i;
            if (priorityQueue.isEmpty() || (smeVar = (sme) priorityQueue.peek()) == null || j < smeVar.a) {
                return;
            }
            priorityQueue.remove(smeVar);
            this.m.b(smeVar.b, null);
        }
    }

    @Override // defpackage.rxj
    public final void S() {
        if (this.j) {
            this.e.d(this.b.a);
        }
    }

    @Override // defpackage.sgq
    public final void T() {
        ((rxo) this.f).s(this.b);
    }

    @Override // defpackage.rxj
    public final sko a() {
        return this.b;
    }

    @Override // defpackage.rsq
    public final void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
        this.g = abnrVar;
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.rxj
    public final void b() {
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

    @Override // defpackage.rst
    public final /* synthetic */ void O(String str, String str2, String str3) {
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

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
