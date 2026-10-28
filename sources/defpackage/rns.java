package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.util.Objects;
import j$.util.Optional;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rns implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ rns(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, rmu] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        wgi wgiVarG;
        awlx awlxVar;
        aixg aixgVarA;
        aiua aiuaVar;
        aiua aiuaVarIL = null;
        switch (this.$cid) {
            case 0:
                return (rlt) ((xsc) this.a).a.f((String) obj);
            case 1:
                ((axfd) ((rmo) this.a).g.io()).P((affd) obj);
                return null;
            case 2:
                rov rovVar = (rov) obj;
                if ((rovVar.b & 1) == 0) {
                    return Optional.empty();
                }
                aijp aijpVar = rovVar.d;
                if (aijpVar == null) {
                    aijpVar = aijp.a;
                }
                rou rouVar = (rou) this.a;
                if (!rouVar.b.f().isAfter(ahng.ax(aijpVar))) {
                    return Optional.of(rovVar.c);
                }
                rouVar.d.j(new iqi(7));
                rouVar.c.h("EXPIRED");
                return Optional.empty();
            case 3:
                ((rpa) this.a).f.h("ERROR");
                ((agrc) ((agrc) ((agrc) rpa.a.b()).j((afig) obj)).k("com/google/android/libraries/youtube/account/offline/OfflineAccountSwitcherStoreImpl", "getOfflineAccountsListResponse", 222, "OfflineAccountSwitcherStoreImpl.java")).t("Could not resolve accountId while getting offline account items");
                return Optional.empty();
            case 4:
                File file = (File) obj;
                return (file == null || !file.exists()) ? Optional.empty() : Optional.of(((afhn) this.a).b.c);
            case 5:
                for (afhn afhnVar : (List) obj) {
                    afhq afhqVar = afhnVar.b;
                    if (afhqVar.f.equals("youtube-direct") && afhqVar.e.equals(this.a)) {
                        return afhnVar.a;
                    }
                }
                throw new afig("Could not find direct account with account name.");
            case 6:
                return this.a;
            case 7:
                slb slbVar = (slb) obj;
                boolean zIsEmpty = TextUtils.isEmpty(slbVar.k());
                Object obj2 = this.a;
                if (zIsEmpty) {
                    return null;
                }
                try {
                    if (((rtm) obj2).f.W() && TextUtils.isEmpty(slbVar.v()) && (awlxVar = ((rtm) obj2).e) != null) {
                        wgiVarG = (wgi) awlxVar.z(((rsi) ((rtm) obj2).b.io()).f, TimeUnit.MILLISECONDS).E();
                    } else {
                        String strK = slbVar.k();
                        byte[] bArr = slbVar.j;
                        String strV = slbVar.v();
                        String strI = slbVar.i();
                        wuq wuqVarA = ((rtm) obj2).d.a(null);
                        wuqVarA.d = true;
                        wuqVarA.e();
                        wuqVarA.H(strK);
                        if (bArr.length > 0) {
                            wuqVarA.o(bArr);
                        } else {
                            ((agrc) ((agrc) rtm.a.b()).k("com/google/android/libraries/youtube/ads/controlflow/externalapi/impl/AdWatchNextFetcher", "createWatchNextServiceRequest", 194, "AdWatchNextFetcher.java")).t("Ad Watch Next Request Missing Tracking Params. See b/22612847");
                        }
                        if (true == TextUtils.isEmpty(strV)) {
                            strV = "";
                        }
                        wuqVarA.F(strV);
                        if (true == TextUtils.isEmpty(strI)) {
                            strI = "";
                        }
                        strI.getClass();
                        wuqVarA.c = strI;
                        String strW = slbVar.w();
                        if (!ahno.aa(strW)) {
                            wuqVarA.z = strW;
                        }
                        wgiVarG = ((rtm) obj2).c.g(wuqVarA);
                    }
                    if (wgiVarG != null) {
                        return wgiVarG;
                    }
                    rmp.n(null, "WatchNextResponse was null");
                    return null;
                } catch (wno e) {
                    rmp.n(null, "Error making WatchNextRequest: ".concat(e.toString()));
                    return null;
                }
            case 8:
                smr smrVar = (smr) obj;
                skm skmVar = (skm) smrVar.d(siq.class);
                ajlj ajljVar = (ajlj) smrVar.d(shw.class);
                String str = (String) smrVar.d(sjh.class);
                rva rvaVar = (rva) this.a;
                return rvaVar.b.n(rvaVar.a, str, skmVar, ajljVar);
            case 9:
                smr smrVar2 = (smr) obj;
                String str2 = (String) smrVar2.d(sic.class);
                ajwo ajwoVar = (ajwo) smrVar2.d(sjv.class);
                Map map = (Map) smrVar2.d(sjt.class);
                ajlj ajljVar2 = (ajlj) smrVar2.d(shw.class);
                if (true == Objects.equals(ajwoVar, ajwo.a)) {
                    ajwoVar = null;
                }
                aiuc aiucVar = ajljVar2.c;
                if (aiucVar == null) {
                    aiucVar = aiuc.a;
                }
                Object obj3 = this.a;
                int i = aiucVar.b & 1;
                rvd rvdVar = (rvd) obj3;
                aehs aehsVar = rvdVar.b;
                smr smrVar3 = rvdVar.a;
                String strX = i != 0 ? aiucVar.c : ((xsc) aehsVar.f).X(aixg.LAYOUT_TYPE_PANEL, smrVar3.a);
                int i2 = aiucVar.b;
                int i3 = i2 & 2;
                if (i3 != 0) {
                    aixgVarA = aixg.a(aiucVar.d);
                    if (aixgVarA == null) {
                        aixgVarA = aixg.LAYOUT_TYPE_UNSPECIFIED;
                    }
                } else {
                    aixgVarA = aixg.LAYOUT_TYPE_PANEL;
                }
                if ((i2 & 1) == 0 || i3 == 0) {
                    rmp.j(null, "AdLayoutMetadata is not set properly by server, fallback to default value. AdLayoutMetadata: ".concat(String.valueOf(String.valueOf(aiucVar))));
                }
                if ((aiucVar.b & 4) != 0) {
                    aiua aiuaVar2 = aiucVar.e;
                    if (aiuaVar2 == null) {
                        aiuaVar2 = aiua.a;
                    }
                    aiuaVar = aiuaVar2;
                } else {
                    aiuaVar = null;
                }
                amco amcoVarAi = ((vwt) aehsVar.a).ai(smrVar3, strX, aixgVarA, aiuaVar);
                apji apjiVar = ajljVar2.d;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aitn.a);
                apjiVar.c(aihlVarCheckIsLite);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                aiie aiieVar = ((aitm) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c;
                if (aiieVar.size() == 0) {
                    rmp.j(smrVar3, "No panel exist for discovery ads engagement panel.");
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = aiieVar.iterator();
                while (it.hasNext()) {
                    String strT = aehs.t((akuf) it.next());
                    if (TextUtils.isEmpty(strT)) {
                        Object obj4 = aehsVar.e;
                        rmp.n(smrVar3, "Missing panel ID for discovery ads engagement panel.");
                    } else {
                        arrayList.add(strT);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new shr(aiieVar));
                arrayList2.add(new sin(arrayList));
                if (ajwoVar != null && map != null) {
                    arrayList2.add(new sjv(ajwoVar));
                    arrayList2.add(new sjt(map));
                }
                skn sknVarA = sko.a();
                sknVarA.l(strX);
                sknVarA.a = aixgVarA;
                sknVarA.m(1);
                Object obj5 = aehsVar.f;
                aixr aixrVar = aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID;
                sknVarA.g(agke.q(new slt(((xsc) obj5).Z(aixrVar), aixrVar, false, str2, false)));
                sknVarA.c(amcoVarAi);
                sknVarA.c = shh.a(arrayList2);
                if (aiuaVar != null) {
                    sknVarA.b(aiuaVar);
                }
                return sknVarA.a();
            case 10:
                smr smrVar4 = (smr) obj;
                skm skmVar2 = (skm) smrVar4.d(siq.class);
                akck akckVar = (akck) smrVar4.d(sie.class);
                wjf wjfVar = (wjf) smrVar4.d(sid.class);
                String str3 = (String) smrVar4.d(sjh.class);
                int i4 = akckVar.b & SemanticState.LiveRegion;
                aehs aehsVar2 = ((rvi) this.a).a;
                if (i4 != 0) {
                    ajlh ajlhVar = akckVar.f;
                    if (ajlhVar == null) {
                        ajlhVar = ajlh.a;
                    }
                    ajlh ajlhVar2 = ajlhVar;
                    Object obj6 = aehsVar2.a;
                    aiuc aiucVar2 = ajlhVar2.b;
                    if (aiucVar2 == null) {
                        aiucVar2 = aiuc.a;
                    }
                    String str4 = aiucVar2.c;
                    aiuc aiucVar3 = ajlhVar2.b;
                    aixg aixgVarA2 = aixg.a((aiucVar3 == null ? aiuc.a : aiucVar3).d);
                    if (aixgVarA2 == null) {
                        aixgVarA2 = aixg.LAYOUT_TYPE_UNSPECIFIED;
                    }
                    if (aiucVar3 == null) {
                        aiucVar3 = aiuc.a;
                    }
                    aiua aiuaVar3 = aiucVar3.e;
                    if (aiuaVar3 == null) {
                        aiuaVar3 = aiua.a;
                    }
                    amco amcoVarAi2 = ((vwt) obj6).ai(smrVar4, str4, aixgVarA2, aiuaVar3);
                    Object obj7 = aehsVar2.f;
                    aixr aixrVar2 = aixr.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED;
                    agke agkeVarQ = agke.q(new sln(((xsc) obj7).Z(aixrVar2), aixrVar2, false, str3, aixo.SLOT_TYPE_PLAYER_BYTES, aixg.LAYOUT_TYPE_MEDIA));
                    agke agkeVar = agpi.a;
                    return aehs.s(ajlhVar2, skmVar2, wjfVar, agkeVarQ, agkeVar, agkeVar, amcoVarAi2);
                }
                if (taq.aD((vyo) aehsVar2.b)) {
                    Object obj8 = aehsVar2.e;
                    rmp.n(smrVar4, "belowPlayerAdLayoutRenderer field is missing from the companion persist ad.");
                }
                if ((akckVar.b & SemanticState.Hidden) != 0) {
                    aiub aiubVar = akckVar.e;
                    if (aiubVar == null) {
                        aiubVar = aiub.a;
                    }
                    aiuaVarIL = aiubVar.b;
                    if (aiuaVarIL == null) {
                        aiuaVarIL = aiua.a;
                    }
                }
                Object obj9 = aehsVar2.f;
                String str5 = smrVar4.a;
                aixg aixgVar = aixg.LAYOUT_TYPE_COMPANION;
                xsc xscVar = (xsc) obj9;
                String strX2 = xscVar.X(aixgVar, str5);
                amco amcoVarAi3 = ((vwt) aehsVar2.a).ai(smrVar4, strX2, aixgVar, aiuaVarIL);
                skn sknVarA2 = sko.a();
                sknVarA2.l(strX2);
                sknVarA2.a = aixgVar;
                sknVarA2.m(1);
                aixr aixrVar3 = aixr.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED;
                sknVarA2.g(agke.q(new sln(xscVar.Z(aixrVar3), aixrVar3, false, str3, aixo.SLOT_TYPE_PLAYER_BYTES, aixg.LAYOUT_TYPE_MEDIA)));
                sknVarA2.c(amcoVarAi3);
                sknVarA2.c = shh.b(new siq(skmVar2), new sid(wjfVar), new sia(akckVar));
                if (aiuaVarIL != null) {
                    sknVarA2.b(aiuaVarIL);
                }
                return sknVarA2.a();
            case 11:
                smr smrVar5 = (smr) obj;
                skm skmVar3 = (skm) smrVar5.d(siq.class);
                List list = (List) smrVar5.d(shr.class);
                ajlj ajljVar3 = (ajlj) smrVar5.d(shw.class);
                String str6 = (String) smrVar5.d(sjh.class);
                Object obj10 = this.a;
                if (ajljVar3 != null) {
                    rvj rvjVar = (rvj) obj10;
                    return rvjVar.b.n(rvjVar.a, str6, skmVar3, ajljVar3);
                }
                if (list == null || list.isEmpty()) {
                    return null;
                }
                rvj rvjVar2 = (rvj) obj10;
                aehs aehsVar3 = rvjVar2.b;
                smr smrVar6 = rvjVar2.a;
                if (skmVar3 instanceof skm) {
                    smc smcVar = skmVar3.a;
                    if (smcVar instanceof skz) {
                        aiuaVarIL = ((skz) smcVar).iL();
                    }
                }
                Object obj11 = aehsVar3.f;
                String str7 = smrVar6.a;
                aixg aixgVar2 = aixg.LAYOUT_TYPE_IMMERSIVE;
                return aehsVar3.o(smrVar6, ((xsc) obj11).X(aixgVar2, str7), aixgVar2, agev.h(aiuaVarIL), str6, skmVar3, list);
            case 12:
                smr smrVar7 = (smr) obj;
                return ((rvl) this.a).a.b(smrVar7.a, null, Optional.empty(), (ski) smrVar7.d(sil.class));
            case 13:
                smr smrVar8 = (smr) obj;
                skl sklVar = (skl) smrVar8.d(sip.class);
                wjf wjfVar2 = (wjf) smrVar8.d(sid.class);
                alam alamVar = (alam) smrVar8.d(sim.class);
                wiu wiuVarF = wjfVar2.f();
                rvm rvmVar = (rvm) this.a;
                return rvmVar.c.b(smrVar8.a, null, Optional.empty(), new ski(sklVar, wiuVarF, rvmVar.b.e(), rvmVar.a.f().toEpochMilli(), alamVar));
            case 14:
                String str8 = ((smr) obj).a;
                Object obj12 = ((rvn) this.a).a.f;
                aixg aixgVar3 = aixg.LAYOUT_TYPE_FORECASTING;
                xsc xscVar2 = (xsc) obj12;
                String strX3 = xscVar2.X(aixgVar3, str8);
                skn sknVarA3 = sko.a();
                sknVarA3.l(strX3);
                sknVarA3.a = aixgVar3;
                sknVarA3.m(1);
                aixr aixrVar4 = aixr.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED;
                sknVarA3.g(agke.q(new slr(xscVar2.Z(aixrVar4), aixrVar4, false, strX3)));
                sknVarA3.c = shh.b(new sht[0]);
                return sknVarA3.a();
            case 15:
                smr smrVar9 = (smr) obj;
                String str9 = (String) smrVar9.d(sjh.class);
                aiua aiuaVarR = aehs.r((slb) smrVar9.d(sjb.class));
                String str10 = smrVar9.a;
                aehs aehsVar4 = ((rvs) this.a).a;
                aixg aixgVar4 = aixg.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY;
                xsc xscVar3 = (xsc) aehsVar4.f;
                String strX4 = xscVar3.X(aixgVar4, str10);
                amco amcoVarAi4 = ((vwt) aehsVar4.a).ai(smrVar9, strX4, aixgVar4, aiuaVarR);
                skn sknVarA4 = sko.a();
                sknVarA4.l(strX4);
                sknVarA4.a = aixgVar4;
                sknVarA4.m(1);
                sknVarA4.c(amcoVarAi4);
                aixr aixrVar5 = aixr.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED;
                sknVarA4.i(agke.q(new slr(xscVar3.Z(aixrVar5), aixrVar5, false, strX4)));
                aixr aixrVar6 = aixr.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED;
                sknVarA4.g(agke.q(new sln(xscVar3.Z(aixrVar6), aixrVar6, false, str9, aixo.SLOT_TYPE_PLAYER_BYTES, aixg.LAYOUT_TYPE_MEDIA)));
                sknVarA4.c = shh.b(new sht[0]);
                if (aiuaVarR != null) {
                    sknVarA4.b(aiuaVarR);
                }
                return sknVarA4.a();
            case 16:
                smr smrVar10 = (smr) obj;
                String str11 = (String) smrVar10.d(sij.class);
                apji apjiVar2 = (apji) smrVar10.d(sig.class);
                String str12 = smrVar10.a;
                aehs aehsVar5 = ((rvu) this.a).a;
                Object obj13 = aehsVar5.f;
                aixg aixgVar5 = aixg.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY;
                xsc xscVar4 = (xsc) obj13;
                String strX5 = xscVar4.X(aixgVar5, str12);
                if (((vxz) ((ayq) aehsVar5.c).c).m(72, 45844376L)) {
                    ajvx ajvxVar = (ajvx) aavv.s(apjiVar2, ajvz.a);
                    if (ajvxVar == null) {
                        ajeq ajeqVar = (ajeq) aavv.s(apjiVar2, ajer.a);
                        if (ajeqVar != null && (ajeqVar.b & 64) != 0 && (aiuaVarIL = ajeqVar.e) == null) {
                            aiuaVarIL = aiua.a;
                        }
                    } else if ((ajvxVar.b & SemanticState.Focused) != 0 && (aiuaVarIL = ajvxVar.g) == null) {
                        aiuaVarIL = aiua.a;
                    }
                }
                amco amcoVarAi5 = ((vwt) aehsVar5.a).ai(smrVar10, strX5, aixgVar5, aiuaVarIL);
                skn sknVarA5 = sko.a();
                sknVarA5.l(strX5);
                sknVarA5.a = aixgVar5;
                sknVarA5.m(1);
                aixr aixrVar7 = aixr.TRIGGER_TYPE_LAYOUT_ID_EXITED;
                sknVarA5.g(agke.q(new skw(xscVar4.Z(aixrVar7), aixrVar7, false, str11)));
                sknVarA5.c(amcoVarAi5);
                sknVarA5.c = shh.b(new sig(apjiVar2));
                if (aiuaVarIL != null) {
                    sknVarA5.b(aiuaVarIL);
                }
                return sknVarA5.a();
            case 17:
                smr smrVar11 = (smr) obj;
                String str13 = (String) smrVar11.d(sjh.class);
                aiua aiuaVarR2 = aehs.r((slb) smrVar11.d(sjb.class));
                String str14 = smrVar11.a;
                aehs aehsVar6 = ((rvv) this.a).a;
                aixg aixgVar6 = aixg.LAYOUT_TYPE_AD_INFO_OVERLAY;
                xsc xscVar5 = (xsc) aehsVar6.f;
                String strX6 = xscVar5.X(aixgVar6, str14);
                amco amcoVarAi6 = ((vwt) aehsVar6.a).ai(smrVar11, strX6, aixgVar6, aiuaVarR2);
                skn sknVarA6 = sko.a();
                sknVarA6.l(strX6);
                sknVarA6.a = aixgVar6;
                sknVarA6.m(1);
                aixr aixrVar8 = aixr.TRIGGER_TYPE_LAYOUT_ID_EXITED;
                sknVarA6.g(agke.q(new skw(xscVar5.Z(aixrVar8), aixrVar8, false, str13)));
                sknVarA6.c(amcoVarAi6);
                sknVarA6.c = shh.b(new sht[0]);
                return sknVarA6.a();
            case 18:
                smr smrVar12 = (smr) obj;
                String str15 = (String) smrVar12.d(sjh.class);
                aiua aiuaVarR3 = aehs.r((slb) smrVar12.d(sjb.class));
                String str16 = smrVar12.a;
                aehs aehsVar7 = ((rvw) this.a).a;
                aixg aixgVar7 = aixg.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY;
                xsc xscVar6 = (xsc) aehsVar7.f;
                String strX7 = xscVar6.X(aixgVar7, str16);
                amco amcoVarAi7 = ((vwt) aehsVar7.a).ai(smrVar12, strX7, aixgVar7, aiuaVarR3);
                skn sknVarA7 = sko.a();
                sknVarA7.l(strX7);
                sknVarA7.a = aixgVar7;
                sknVarA7.m(1);
                aixr aixrVar9 = aixr.TRIGGER_TYPE_LAYOUT_ID_EXITED;
                sknVarA7.g(agke.q(new skw(xscVar6.Z(aixrVar9), aixrVar9, false, str15)));
                sknVarA7.c(amcoVarAi7);
                sknVarA7.c = shh.b(new sht[0]);
                if (aiuaVarR3 != null) {
                    sknVarA7.b(aiuaVarR3);
                }
                return sknVarA7.a();
            case 19:
                smr smrVar13 = (smr) obj;
                return ((rvx) this.a).a.d(smrVar13, aixo.SLOT_TYPE_IN_PLAYER, (String) smrVar13.d(sjh.class));
            default:
                smr smrVar14 = (smr) obj;
                return ((rwb) this.a).a.d(smrVar14, aixo.SLOT_TYPE_LOCKSCREEN, (String) smrVar14.d(sjh.class));
        }
    }
}
