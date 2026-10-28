package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rud implements sog, rsq, sah, sai, sak {
    public Optional a = Optional.empty();
    private final axfd b;

    public rud(axfd axfdVar) {
        this.b = axfdVar;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v13, types: [awmd, java.lang.Object] */
    @Override // defpackage.sah
    public final void W(smr smrVar, sko skoVar) {
        Optional optionalOfNullable;
        Optional optionalEmpty;
        Optional optionalN = axfd.N(smrVar, skoVar);
        if (true != optionalN.isPresent()) {
            optionalOfNullable = optionalN;
        } else {
            Object obj = optionalN.get();
            optionalOfNullable = Optional.ofNullable(Boolean.valueOf(obj == rue.a || obj == rue.b));
        }
        if (((Boolean) optionalOfNullable.orElse(Boolean.FALSE)).booleanValue()) {
            Object objOrElse = optionalN.orElse(null);
            rue rueVar = rue.a;
            if ((objOrElse == rueVar && ((slb) skoVar.d(sjb.class)).n.D().b) || Collection.EL.stream(skoVar.l.keySet()).anyMatch(new rej(13))) {
                if (this.a.isPresent()) {
                    if (((sgi) this.a.get()).i(skoVar).booleanValue()) {
                        return;
                    }
                    ((sgi) this.a.get()).p();
                    this.a = Optional.empty();
                }
                Optional optionalN2 = axfd.N(smrVar, skoVar);
                if (optionalN2.isEmpty()) {
                    optionalEmpty = Optional.empty();
                } else {
                    axfd axfdVar = this.b;
                    if (optionalN2.get() == rueVar) {
                        amkq amkqVarD = ((slb) skoVar.d(sjb.class)).n.D();
                        if (amkqVarD.b) {
                            smc smcVar = (smc) skoVar.d(sjb.class);
                            zdj zdjVarF = ((ruk) axfdVar.d.io()).f(smcVar.aw(), axfd.M(amkqVarD, false));
                            if (zdjVarF == null) {
                                optionalEmpty = Optional.empty();
                            } else {
                                abnc abncVar = (abnc) axfdVar.a;
                                boolean z = abncVar.c().a == abnr.FULLSCREEN;
                                boolean z2 = abncVar.c().a == abnr.BACKGROUND;
                                abncVar.c();
                                sgk sgkVar = new sgk(skoVar, smcVar, axfdVar, z, z2, zdjVarF, taq.aZ((vyo) axfdVar.e));
                                sgkVar.e = smcVar.o;
                                optionalEmpty = Optional.of(sgkVar);
                            }
                        } else {
                            optionalEmpty = Optional.empty();
                        }
                    } else if (optionalN2.get() == rue.b) {
                        aoqd aoqdVar = ((alvt) skoVar.d(sjj.class)).e;
                        if (aoqdVar == null) {
                            aoqdVar = aoqd.a;
                        }
                        amkq amkqVar = aoqdVar.o;
                        if (amkqVar == null) {
                            amkqVar = amkq.a;
                        }
                        if (amkqVar.b) {
                            alvt alvtVar = (alvt) skoVar.d(sjj.class);
                            abnc abncVar2 = ((smf) skoVar.d(sjl.class)).a;
                            boolean z3 = abncVar2 != null && abncVar2.e() == abnr.FULLSCREEN;
                            ofi ofiVar = (ofi) axfdVar.b.io();
                            sgj sgjVar = new sgj(skoVar, alvtVar, axfdVar, z3, ofiVar, axfd.M(amkqVar, true));
                            sgjVar.e = null;
                            optionalEmpty = Optional.of(sgjVar);
                        } else {
                            optionalEmpty = Optional.empty();
                        }
                    } else {
                        optionalEmpty = Optional.empty();
                    }
                }
                this.a = optionalEmpty;
            }
        }
    }

    @Override // defpackage.rsq
    public final void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
        Optional optional = this.a;
        hkp hkpVar = new hkp(abnrVar, 7);
        if (true == optional.isPresent()) {
            ((sgi) optional.get()).r((abnr) hkpVar.a);
        }
    }

    @Override // defpackage.sai
    public final void b(smr smrVar, sko skoVar, int i) {
        Optional optionalEmpty = this.a;
        rub rubVar = new rub(skoVar, 4);
        if (true == optionalEmpty.isPresent()) {
            if (true != ((sgi) optionalEmpty.get()).i((sko) rubVar.a).booleanValue()) {
                optionalEmpty = Optional.empty();
            }
        }
        if (optionalEmpty.isPresent()) {
            if (i == 4) {
                ((sgi) this.a.get()).j();
            } else if (i == 0) {
                ((sgi) this.a.get()).k();
            } else if (i == 2) {
                ((sgi) this.a.get()).o();
            }
        }
    }

    public final Optional c() {
        Optional optional = this.a;
        return true == optional.isPresent() ? Optional.ofNullable(((sgi) optional.get()).g) : optional;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.rsq
    public final void i(String str) {
        Optional optionalEmpty = this.a;
        rub rubVar = new rub(str, 3);
        if (true == optionalEmpty.isPresent()) {
            if (true != TextUtils.equals(rubVar.a, ((sgi) optionalEmpty.get()).e)) {
                optionalEmpty = Optional.empty();
            }
        }
        if (true == optionalEmpty.isPresent()) {
            ((sgi) optionalEmpty.get()).q();
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.rsq
    public final void m(String str, long j, long j2, long j3, boolean z) {
        Optional optionalEmpty = this.a;
        rub rubVar = new rub(str, 2);
        if (true == optionalEmpty.isPresent()) {
            if (true != TextUtils.equals(rubVar.a, ((sgi) optionalEmpty.get()).e)) {
                optionalEmpty = Optional.empty();
            }
        }
        ruc rucVar = new ruc(z, j);
        if (true == optionalEmpty.isPresent()) {
            ((sgi) optionalEmpty.get()).s(rucVar.a, rucVar.b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.rsq
    public final void o(int i, String str) {
        Optional optionalEmpty = this.a;
        rub rubVar = new rub(str, 1);
        if (true == optionalEmpty.isPresent()) {
            if (true != TextUtils.equals(rubVar.a, ((sgi) optionalEmpty.get()).e)) {
                optionalEmpty = Optional.empty();
            }
        }
        adzy adzyVar = new adzy(i, 1);
        if (true == optionalEmpty.isPresent()) {
            ((sgi) optionalEmpty.get()).t(adzyVar.a);
        }
    }

    @Override // defpackage.sak
    public final void w(sko skoVar) {
        if (this.a.isPresent() && ((sgi) this.a.get()).i(skoVar).booleanValue()) {
            ((sgi) this.a.get()).p();
            this.a = Optional.empty();
        }
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.sog
    public final /* synthetic */ void s() {
    }

    @Override // defpackage.sog
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.sog
    public final /* synthetic */ void v() {
    }

    @Override // defpackage.sog
    public final /* synthetic */ void x() {
    }

    @Override // defpackage.sog
    public final /* synthetic */ void y() {
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
    public final /* synthetic */ void j(aayt aaytVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void k(aayw aaywVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void d(String str, int i) {
    }

    @Override // defpackage.sog
    public final /* synthetic */ void u(int i, int i2) {
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
