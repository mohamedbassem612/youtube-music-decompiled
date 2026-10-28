package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(b = aixo.SLOT_TYPE_PLAYER_BYTES, d = {sid.class, sih.class, sic.class, sjy.class})
public final class rwd extends rvo {
    public final sdm a;
    public final sbt b;
    public final sdo c;
    public final rnj d;
    public final tld e;
    public final xte f;
    public final aehs g;
    private final Executor h;
    private final Executor j;

    public rwd(rvr rvrVar, Executor executor, Executor executor2, aehs aehsVar, sdm sdmVar, sbt sbtVar, tld tldVar, xte xteVar, sdo sdoVar, rnj rnjVar) {
        super(rvrVar);
        this.h = executor;
        this.j = executor2;
        this.g = aehsVar;
        this.a = sdmVar;
        this.b = sbtVar;
        this.e = tldVar;
        this.f = xteVar;
        this.c = sdoVar;
        this.d = rnjVar;
    }

    @Override // defpackage.rvo
    public final void b() {
        rvr rvrVar = this.i;
        ((acfw) rvrVar.a.d(sjy.class)).a();
        rvrVar.a(new agek() { // from class: rwc
            @Override // defpackage.agek
            public final Object apply(Object obj) {
                wgk wgkVar;
                smr smrVar = (smr) obj;
                wjf wjfVar = (wjf) smrVar.d(sid.class);
                boolean z = smrVar.e(siv.class) && ((Boolean) smrVar.d(siv.class)).booleanValue();
                rwd rwdVar = this.a;
                if (smrVar.e(shl.class)) {
                    wgkVar = (wgk) smrVar.d(shl.class);
                } else {
                    rmp.n(smrVar, "Slot is missing AdBreakResponseModelGetter on the ABR DAI midroll path. This is unexpected.");
                    wgkVar = null;
                }
                if (wgkVar == null) {
                    return null;
                }
                if (!wgkVar.a().isEmpty()) {
                    try {
                        aopn aopnVar = (aopn) smrVar.d(sjf.class);
                        Optional optionalOf = smrVar.e(shl.class) ? Optional.of((wgk) smrVar.d(shl.class)) : Optional.empty();
                        aiuc aiucVar = aopnVar.c;
                        if (aiucVar == null) {
                            aiucVar = aiuc.a;
                        }
                        aixg aixgVarA = aixg.a(aiucVar.d);
                        if (aixgVarA == null) {
                            aixgVarA = aixg.LAYOUT_TYPE_UNSPECIFIED;
                        }
                        int iOrdinal = aixgVarA.ordinal();
                        if (iOrdinal == 1) {
                            return rwdVar.g.h(aopnVar, wjfVar, optionalOf);
                        }
                        if (iOrdinal == 2) {
                            return rwdVar.g.g(aopnVar, wjfVar, optionalOf);
                        }
                        if (iOrdinal == 15) {
                            return rwdVar.g.f(aopnVar, wjfVar, smrVar.a, optionalOf, true);
                        }
                        throw new IllegalStateException("Unable to fulfill a slot due to the unsupported layout type for PlayerBytesCuePointTriggered slot.");
                    } catch (sas e) {
                        throw new IllegalStateException("Unable to create a layout to fulfill a PlayerBytesCuePointTriggered slot.", e);
                    }
                }
                if (!smrVar.e(shj.class)) {
                    rmp.n(smrVar, "Slot is missing AdBreakIndexGetter on the Legacy (non-ABR migration) DAI midroll path. This is unexpected.");
                }
                aisu aisuVarD = wgkVar.d();
                skl sklVar = smrVar.e(sip.class) ? (skl) smrVar.d(sip.class) : new skl(new wgj(aisuVarD), ((Integer) smrVar.d(shj.class)).intValue(), wjfVar.R(), wjfVar.G(), rwdVar.d.e(), wjfVar.A(), wjfVar.ab());
                List<smc> listB = rwdVar.a.b(sklVar, wgkVar.g(), wjfVar);
                aigj aigjVarC = wgkVar.c();
                if (!z) {
                    return rwdVar.g.c(smrVar.a, sklVar, Optional.ofNullable(aisuVarD), listB);
                }
                aehs aehsVar = rwdVar.g;
                if (listB.isEmpty()) {
                    return null;
                }
                if (listB.get(0) instanceof ski) {
                    return aehsVar.b(smrVar.a, sklVar, Optional.of(sklVar.b.a), (ski) listB.get(0));
                }
                ArrayList arrayList = new ArrayList();
                for (smc smcVar : listB) {
                    if (!(smcVar instanceof slb)) {
                        throw new IllegalStateException("Unexpected playerAd type for DAI layout: ".concat(String.valueOf(String.valueOf(smcVar))));
                    }
                    Object obj2 = aehsVar.f;
                    String str = smrVar.a;
                    aixg aixgVar = aixg.LAYOUT_TYPE_MEDIA;
                    String str2 = smcVar.o;
                    arrayList.add(((xsc) obj2).X(aixgVar, str));
                }
                Object obj3 = aehsVar.f;
                String str3 = smrVar.a;
                aixg aixgVar2 = aixg.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES;
                xsc xscVar = (xsc) obj3;
                String strX = xscVar.X(aixgVar2, str3);
                List listJ = aehsVar.j(sklVar, listB, arrayList, strX);
                if (listJ.isEmpty()) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new sip(sklVar));
                arrayList2.add(new sjq(listJ));
                arrayList2.add(new shk(sklVar.b));
                if (aigjVarC != null) {
                    arrayList2.add(new sjp(aigjVarC));
                }
                skn sknVarA = sko.a();
                sknVarA.l(strX);
                sknVarA.a = aixgVar2;
                sknVarA.m(1);
                aixr aixrVar = aixr.TRIGGER_TYPE_LIVE_STREAM_BREAK_ENDED;
                sknVarA.g(agke.q(new skx(xscVar.Z(aixrVar), aixrVar, false)));
                sknVarA.c = shh.a(arrayList2);
                return sknVarA.a();
            }
        }, this.h, this.j, new rwg(this, 1));
    }
}
