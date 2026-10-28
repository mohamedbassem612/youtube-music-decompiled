package defpackage;

import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Set;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class rzm implements aheh {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ wjf c;
    final /* synthetic */ String d;
    final /* synthetic */ slb e;
    final /* synthetic */ sdo f;

    public rzm(sdo sdoVar, String str, String str2, wjf wjfVar, String str3, slb slbVar) {
        this.a = str;
        this.b = str2;
        this.c = wjfVar;
        this.d = str3;
        this.e = slbVar;
        this.f = sdoVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        zvp.a(zvn.b, zvm.a, "[Control flow] Error resolving WatchNextResponse Future for content video companion opportunity");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [awmd, java.lang.Object] */
    @Override // defpackage.aheh
    public final /* synthetic */ void b(Object obj) {
        final wgi wgiVar = (wgi) obj;
        if (wgiVar != null) {
            int i = wgiVar.a.b;
            if ((i & 64) == 0 || (i & SemanticState.Focused) == 0) {
                return;
            }
            sdo sdoVar = this.f;
            Set set = ((sbj) sdoVar.b.io()).f;
            final String str = this.a;
            if (set.contains(str)) {
                roq roqVar = (roq) sdoVar.c.io();
                final String str2 = this.b;
                final wjf wjfVar = this.c;
                final String str3 = this.d;
                final slb slbVar = this.e;
                roqVar.f(8, skh.a(str2, wjfVar), new Supplier() { // from class: rzl
                    /* JADX WARN: Code duplicated, block: B:24:0x018b  */
                    /* JADX WARN: Type inference failed for: r4v2, types: [awmd, java.lang.Object] */
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        smr smrVarI;
                        ArrayList arrayList = new ArrayList();
                        amae amaeVar = wgiVar.a;
                        akck akckVar = amaeVar.l;
                        if (akckVar == null) {
                            akckVar = akck.a;
                        }
                        rzm rzmVar = this.a;
                        slb slbVar2 = slbVar;
                        String str4 = str;
                        String str5 = str3;
                        wjf wjfVar2 = wjfVar;
                        String str6 = str2;
                        skm skmVar = new skm(slbVar2);
                        ?? r4 = rzmVar.f.d;
                        Object obj2 = ((aaok) r4.io()).d;
                        aixo aixoVar = aixo.SLOT_TYPE_BELOW_PLAYER;
                        xsc xscVar = (xsc) obj2;
                        String strAa = xscVar.aa();
                        shh shhVarB = shh.b(new siq(skmVar), new sjh(str5), new sid(wjfVar2), new sib(str4), new sie(akckVar));
                        aixr aixrVar = aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON;
                        agke agkeVarQ = agke.q(skt.e(xscVar.Z(aixrVar), str4, 0));
                        aixr aixrVar2 = aixr.TRIGGER_TYPE_SLOT_ID_ENTERED;
                        agke agkeVarQ2 = agke.q(new smu(xscVar.Z(aixrVar2), aixrVar2, false, strAa));
                        aixr aixrVar3 = aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID;
                        slt sltVar = new slt(xscVar.Z(aixrVar3), aixrVar3, false, str6, false);
                        aixr aixrVar4 = aixr.TRIGGER_TYPE_SLOT_ID_EXITED;
                        arrayList.add(smr.i(strAa, aixoVar, agkeVarQ, agkeVarQ2, agke.r(sltVar, new smv(xscVar.Z(aixrVar4), aixrVar4, false, strAa)), shhVarB));
                        Object obj3 = ((aaok) r4.io()).d;
                        aixo aixoVar2 = aixo.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE;
                        xsc xscVar2 = (xsc) obj3;
                        String strAa2 = xscVar2.aa();
                        agjz agjzVar = new agjz(4);
                        agjzVar.h(new sjh(str5));
                        agjzVar.h(new siq(skmVar));
                        agjzVar.h(new sid(wjfVar2));
                        agjzVar.h(new sib(str4));
                        apji apjiVar = amaeVar.t;
                        if (apjiVar == null) {
                            apjiVar = apji.a;
                        }
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajlk.a);
                        apjiVar.c(aihlVarCheckIsLite);
                        if (!apjiVar.j.n(aihlVarCheckIsLite.d)) {
                            if (amaeVar.s.size() > 0) {
                                agjzVar.h(new shr(amaeVar.s));
                            } else {
                                smrVarI = null;
                            }
                            if (smrVarI != null) {
                                arrayList.add(smrVarI);
                            }
                            return arrayList;
                        }
                        apji apjiVar2 = amaeVar.t;
                        if (apjiVar2 == null) {
                            apjiVar2 = apji.a;
                        }
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajlk.a);
                        apjiVar2.c(aihlVarCheckIsLite2);
                        Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                        agjzVar.h(new shw((ajlj) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))));
                        smrVarI = smr.i(strAa2, aixoVar2, agke.q(skt.e(xscVar2.Z(aixrVar), str4, 0)), agke.q(new smu(xscVar2.Z(aixrVar2), aixrVar2, false, strAa2)), agke.r(new slt(xscVar2.Z(aixrVar3), aixrVar3, false, str6, false), new smv(xscVar2.Z(aixrVar4), aixrVar4, false, strAa2)), shh.a(agjzVar.g()));
                        if (smrVarI != null) {
                            arrayList.add(smrVarI);
                        }
                        return arrayList;
                    }
                });
            }
        }
    }
}
