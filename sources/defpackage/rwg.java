package defpackage;

import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rwg implements rvq {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ rvo a;

    public /* synthetic */ rwg(rvo rvoVar, int i) {
        this.$cid = i;
        this.a = rvoVar;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.rvq
    public final sko a(smr smrVar, sko skoVar) {
        snh snhVar;
        agke agkeVarG;
        if (this.$cid != 0) {
            wjf wjfVar = (wjf) smrVar.d(sid.class);
            yvs yvsVar = (yvs) smrVar.d(sih.class);
            String str = (String) smrVar.d(sic.class);
            acfw acfwVar = (acfw) smrVar.d(sjy.class);
            boolean zE = smrVar.e(shl.class);
            rvo rvoVar = this.a;
            if (zE) {
                aixg aixgVar = skoVar.b;
                if (aixgVar != aixg.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES && aixgVar != aixg.LAYOUT_TYPE_MEDIA && aixgVar != aixg.LAYOUT_TYPE_MEDIA_BREAK) {
                    return null;
                }
                ((rwd) rvoVar).b.s(skoVar, yvsVar.a);
            } else {
                if (skoVar == null) {
                    ((rwd) rvoVar).c.g((acfw) smrVar.d(sjy.class), yvsVar.a);
                    return null;
                }
                aixg aixgVar2 = skoVar.b;
                if (aixgVar2 == aixg.LAYOUT_TYPE_AD_BREAK_RESPONSE) {
                    xte xteVar = ((rwd) rvoVar).f;
                    ((roq) xteVar.a.io()).f(11, skh.a(str, wjfVar), new rzr(xteVar, (wgk) skoVar.d(shl.class), str, wjfVar, acfwVar, 1));
                    return null;
                }
                if (aixgVar2 != aixg.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES && aixgVar2 != aixg.LAYOUT_TYPE_MEDIA && aixgVar2 != aixg.LAYOUT_TYPE_MEDIA_BREAK) {
                    if (!skoVar.f(aixg.LAYOUT_TYPE_FORECASTING, sil.class, sip.class)) {
                        return null;
                    }
                    ((rwd) rvoVar).e.e(smrVar, str, acfwVar, wjfVar, (skl) skoVar.d(sip.class), skoVar.e(shk.class) ? Optional.of((wgj) skoVar.d(shk.class)) : Optional.empty(), (ski) skoVar.d(sil.class));
                    return null;
                }
                ((rwd) rvoVar).b.s(skoVar, yvsVar.a);
            }
        } else {
            wjf wjfVar2 = (wjf) smrVar.d(sid.class);
            String str2 = (String) smrVar.d(sic.class);
            acfw acfwVar2 = (acfw) smrVar.d(sjy.class);
            if (skoVar == null) {
                return null;
            }
            aixg aixgVar3 = skoVar.b;
            if (aixgVar3 != aixg.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES && aixgVar3 != aixg.LAYOUT_TYPE_MEDIA && aixgVar3 != aixg.LAYOUT_TYPE_MEDIA_BREAK) {
                rvo rvoVar2 = this.a;
                if (skoVar.f(aixg.LAYOUT_TYPE_FORECASTING, sil.class, sip.class)) {
                    ((rwh) rvoVar2).g.e(smrVar, str2, acfwVar2, wjfVar2, (skl) skoVar.d(sip.class), skoVar.e(shk.class) ? Optional.of((wgj) skoVar.d(shk.class)) : Optional.empty(), (ski) skoVar.d(sil.class));
                    return null;
                }
                if (!skoVar.f(aixg.LAYOUT_TYPE_UNSPECIFIED, sjr.class)) {
                    return null;
                }
                rzv rzvVar = ((rwh) rvoVar2).c;
                agke agkeVar = smrVar.d;
                int i = 0;
                while (true) {
                    if (i >= ((agpi) agkeVar).d) {
                        snhVar = null;
                        break;
                    }
                    snk snkVar = (snk) agkeVar.get(i);
                    i++;
                    if (snkVar instanceof slk) {
                        snhVar = ((slk) snkVar).b;
                        break;
                    }
                }
                if (snhVar == null) {
                    return null;
                }
                aixo aixoVarC = smrVar.c();
                aixo aixoVar = aixo.SLOT_TYPE_PLAYER_BYTES;
                if (aixoVarC != aixoVar) {
                    return null;
                }
                List list = rzvVar.d;
                aaok aaokVar = (aaok) rzvVar.c.io();
                String str3 = (String) smrVar.d(sic.class);
                skl sklVar = (skl) smrVar.d(sip.class);
                shh shhVar = smrVar.g;
                xsc xscVar = (xsc) aaokVar.d;
                String strAa = xscVar.aa();
                wjf wjfVar3 = shhVar.e(sid.class) ? (wjf) shhVar.d(sid.class) : null;
                agjz agjzVar = new agjz(4);
                aixr aixrVar = aixr.TRIGGER_TYPE_ON_SLOT_CANCELLATION_REQUESTED;
                agjzVar.h(new slx(xscVar.Z(aixrVar), aixrVar, false, strAa));
                aixr aixrVar2 = aixr.TRIGGER_TYPE_SLOT_ID_EXITED;
                agjzVar.h(new smv(xscVar.Z(aixrVar2), aixrVar2, false, strAa));
                aixr aixrVar3 = aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID;
                agjzVar.h(new slt(xscVar.Z(aixrVar3), aixrVar3, false, str3, true));
                aixr aixrVar4 = aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE;
                agke agkeVarQ = agke.q(slk.c(xscVar.Z(aixrVar4), str3, snhVar, true));
                String strZ = xscVar.Z(aixrVar4);
                long jV = aaokVar.V(sklVar);
                long j = snhVar.a;
                slk slkVarC = slk.c(strZ, str3, new snh(j - jV, j), false);
                aixr aixrVar5 = aixr.TRIGGER_TYPE_SLOT_ID_ENTERED;
                agke agkeVarR = agke.r(slkVarC, new smu(xscVar.Z(aixrVar5), aixrVar5, false, strAa));
                if (wjfVar3 == null || !taq.at((vyo) aaokVar.c, wjfVar3.V(), wjfVar3.P(), false, true, false, false)) {
                    agkeVarG = agjzVar.g();
                } else {
                    aixr aixrVar6 = aixr.TRIGGER_TYPE_ON_PLAYBACK_DESTROYED;
                    agjzVar.h(new slv(xscVar.Z(aixrVar6), aixrVar6, false, str3));
                    agkeVarG = agjzVar.g();
                }
                list.add(new eqq(smr.b(strAa, aixoVar, 1, 1, agkeVarQ, agkeVarR, agkeVarG, shhVar, aaok.ah(sklVar)), snhVar, skh.a(rzvVar.a, rzvVar.b)));
                return null;
            }
        }
        return skoVar;
    }
}
