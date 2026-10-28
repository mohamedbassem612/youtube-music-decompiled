package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aehs {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public aehs(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        awmdVar.getClass();
        this.e = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
        awmdVar3.getClass();
        this.d = awmdVar3;
        this.f = awmdVar4;
        awmdVar5.getClass();
        this.b = awmdVar5;
        awmdVar6.getClass();
        this.h = awmdVar6;
        awmdVar7.getClass();
        this.c = awmdVar7;
        awmdVar8.getClass();
        this.i = awmdVar8;
        awmdVar9.getClass();
        this.g = awmdVar9;
    }

    private static final Optional A(wjf wjfVar, Optional optional, String str) {
        return optional.isPresent() ? ((wgk) optional.get()).e(str) : nre.e(wjfVar.u(), str);
    }

    private static final List B(wjf wjfVar, Optional optional) {
        ArrayList arrayList = new ArrayList();
        if (!optional.isPresent()) {
            return wjfVar.H();
        }
        aisu aisuVarD = ((wgk) optional.get()).d();
        return aisuVarD != null ? agke.q(aisuVarD) : arrayList;
    }

    public static /* synthetic */ void l(List list, aisu aisuVar) {
        list.add(new shk(new wgj(aisuVar)));
    }

    public static final aiua r(slb slbVar) {
        if (slbVar == null) {
            return null;
        }
        Optional optionalE = slbVar.e();
        if (true == optionalE.isPresent()) {
            aiua aiuaVar = ((ambn) optionalE.get()).m;
            if (aiuaVar == null) {
                aiuaVar = aiua.a;
            }
            optionalE = Optional.ofNullable(aiuaVar);
        }
        return (aiua) optionalE.orElse(null);
    }

    public static final sko s(ajlh ajlhVar, skm skmVar, wjf wjfVar, agke agkeVar, agke agkeVar2, agke agkeVar3, amco amcoVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new siq(skmVar));
        arrayList.add(new sid(wjfVar));
        aihf aihfVarCreateBuilder = akck.a.createBuilder();
        apji apjiVar = ajlhVar.c;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        akrn akrnVar = (akrn) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        aihfVarCreateBuilder.copyOnWrite();
        akck akckVar = (akck) aihfVarCreateBuilder.instance;
        akrnVar.getClass();
        akckVar.c = akrnVar;
        akckVar.b |= 32;
        arrayList.add(new sia((akck) aihfVarCreateBuilder.build()));
        arrayList.add(new shu(ajlhVar));
        aiuc aiucVar = ajlhVar.b;
        if (aiucVar == null) {
            aiucVar = aiuc.a;
        }
        String str = aiucVar.c;
        aiuc aiucVar2 = ajlhVar.b;
        if (aiucVar2 == null) {
            aiucVar2 = aiuc.a;
        }
        aixg aixgVarA = aixg.a(aiucVar2.d);
        if (aixgVarA == null) {
            aixgVarA = aixg.LAYOUT_TYPE_UNSPECIFIED;
        }
        skn sknVarA = sko.a();
        sknVarA.l(str);
        sknVarA.a = aixgVarA;
        sknVarA.m(1);
        sknVarA.g(agkeVar);
        sknVarA.i(agkeVar2);
        sknVarA.e(agkeVar3);
        aiuc aiucVar3 = ajlhVar.b;
        if (aiucVar3 == null) {
            aiucVar3 = aiuc.a;
        }
        aiua aiuaVar = aiucVar3.e;
        if (aiuaVar == null) {
            aiuaVar = aiua.a;
        }
        sknVarA.b(aiuaVar);
        sknVarA.c(amcoVar);
        sknVarA.c = shh.a(arrayList);
        return sknVarA.a();
    }

    public static final String t(akuf akufVar) {
        akuj akujVar;
        String str;
        int i = akufVar.b;
        if (i == 138681066) {
            akujVar = i == 138681066 ? (akuj) akufVar.c : akuj.b;
        } else {
            akujVar = null;
        }
        if (akujVar == null) {
            return null;
        }
        int i2 = akujVar.e;
        if (i2 == 1) {
            str = i2 == 1 ? (String) akujVar.f : "";
        } else {
            str = null;
        }
        if (str != null) {
            return str;
        }
        rmp.n(null, "Ad engagement panel has no panel ID.");
        return null;
    }

    private static boolean w(aopn aopnVar, aigw aigwVar) {
        if ((aopnVar.b & 2) != 0) {
            apji apjiVar = aopnVar.d;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aigwVar);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                return true;
            }
        }
        return false;
    }

    private final sko x(smr smrVar, String str, aixg aixgVar, agev agevVar, String str2, skm skmVar, List list, ajwo ajwoVar, Map map, String str3, sgn sgnVar) {
        if (list.size() == 0) {
            return null;
        }
        List listK = k(list, smrVar.a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new shr(list));
        arrayList.add(new sin(listK));
        if (ajwoVar != null && map != null) {
            arrayList.add(new sjv(ajwoVar));
            arrayList.add(new sjt(map));
        }
        agjz agjzVar = new agjz(4);
        Object obj = this.f;
        aixr aixrVar = aixr.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED;
        xsc xscVar = (xsc) obj;
        agjzVar.h(new sln(xscVar.Z(aixrVar), aixrVar, false, str2, aixo.SLOT_TYPE_PLAYER_BYTES, aixg.LAYOUT_TYPE_MEDIA));
        boolean z = smrVar.e(sit.class) && ((Boolean) smrVar.d(sit.class)).booleanValue() && smrVar.e(sic.class);
        if (z) {
            aixr aixrVar2 = aixr.TRIGGER_TYPE_MEDIA_RESUMED;
            agjzVar.h(new sli(xscVar.Z(aixrVar2), aixrVar2, false, false, (String) smrVar.d(sic.class)));
            vyo vyoVar = (vyo) this.b;
            if (afxw.e(vyoVar).N) {
                aixr aixrVar3 = aixr.TRIGGER_TYPE_MEDIA_FULLSCREEN_ENTERED;
                agjzVar.h(new sld(xscVar.Z(aixrVar3), aixrVar3, false, (String) smrVar.d(sic.class)));
            }
            if (afxw.e(vyoVar).O) {
                aixr aixrVar4 = aixr.TRIGGER_TYPE_MEDIA_FULLSCREEN_EXITED;
                agjzVar.h(new sle(xscVar.Z(aixrVar4), aixrVar4, false, (String) smrVar.d(sic.class)));
            }
        }
        aixr aixrVar5 = aixr.TRIGGER_TYPE_ON_NEXT_SLOT_ENTER_REQUESTED;
        agjzVar.h(new slu(xscVar.Z(aixrVar5), aixrVar5, false, agke.q(aixo.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE)));
        if (skmVar instanceof skm) {
            smc smcVar = skmVar.a;
            if (smcVar instanceof skz) {
                skz skzVar = (skz) smcVar;
                if (skzVar.C() || skzVar.z() || skzVar.D()) {
                    aixr aixrVar6 = aixr.TRIGGER_TYPE_SURVEY_SUBMITTED;
                    agjzVar.h(new sne(xscVar.Z(aixrVar6), aixrVar6, false, str));
                }
                if (skzVar.D()) {
                    aixr aixrVar7 = aixr.TRIGGER_TYPE_SURVEY_DISMISSED;
                    agjzVar.h(new snb(xscVar.Z(aixrVar7), aixrVar7, false, str));
                }
            }
        }
        if (sgnVar.c > 1 && !taq.ai((vyo) this.b) && !z) {
            agjzVar.h(skt.e(xscVar.Z(aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON), str3, 0));
        }
        amco amcoVarAi = ((vwt) this.a).ai(smrVar, str, aixgVar, (aiua) agevVar.f());
        skn sknVarA = sko.a();
        sknVarA.l(str);
        sknVarA.a = aixgVar;
        sknVarA.m(1);
        sknVarA.g(agjzVar.g());
        sknVarA.c(amcoVarAi);
        sknVarA.c = shh.a(arrayList);
        if (agevVar.g()) {
            sknVarA.b((aiua) agevVar.c());
        }
        return sknVarA.a();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    private final agke y(String str, String str2, String str3, skm skmVar, sgn sgnVar) {
        boolean z;
        agjz agjzVar = new agjz(4);
        aixr aixrVar = aixr.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED;
        xsc xscVar = (xsc) this.f;
        agjzVar.h(new sln(xscVar.Z(aixrVar), aixrVar, false, str3, aixo.SLOT_TYPE_PLAYER_BYTES, aixg.LAYOUT_TYPE_MEDIA));
        boolean z2 = skmVar instanceof skm;
        if (z2) {
            smc smcVar = skmVar.a;
            if (smcVar instanceof skz) {
                skz skzVar = (skz) smcVar;
                if (skzVar.C() || skzVar.z() || skzVar.D()) {
                    aixr aixrVar2 = aixr.TRIGGER_TYPE_SURVEY_SUBMITTED;
                    agjzVar.h(new sne(xscVar.Z(aixrVar2), aixrVar2, false, str));
                }
                if (skzVar.D()) {
                    aixr aixrVar3 = aixr.TRIGGER_TYPE_SURVEY_DISMISSED;
                    agjzVar.h(new snb(xscVar.Z(aixrVar3), aixrVar3, false, str));
                }
            }
        }
        vyo vyoVar = (vyo) this.b;
        if (afxw.e(vyoVar).z) {
            aixr aixrVar4 = aixr.TRIGGER_TYPE_LAYOUT_EXITED_AFTER_TIMEOUT;
            agjzVar.h(new skq(xscVar.Z(aixrVar4), aixrVar4, str2));
        }
        if (z2) {
            smc smcVar2 = skmVar.a;
            if (smcVar2 instanceof skz) {
                arcg arcgVar = ((skz) smcVar2).b;
                if ((arcgVar.b & 67108864) == 0 || !arcgVar.t) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (afxw.e(vyoVar).y || z) {
            aixr aixrVar5 = aixr.TRIGGER_TYPE_LAYOUT_ID_EXITED;
            agjzVar.h(new skw(xscVar.Z(aixrVar5), aixrVar5, false, str2));
        } else if (sgnVar.c > 1) {
            agjzVar.h(skt.e(xscVar.Z(aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON), str2, 0));
        }
        return agjzVar.g();
    }

    private static final sgn z(skz skzVar) {
        return new sgn(1, 1, skzVar.a() * 1000, false, agev.h(skzVar.ax()), agev.h((aivw) skzVar.s().orElse(null)), agdf.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [awmd, java.lang.Object] */
    public final wjf a(aqph aqphVar, wjf wjfVar) {
        aohq aohqVar;
        Pair pair;
        wgs wgsVar;
        String strG = wjfVar.G();
        agqs agqsVarListIterator = aqphVar.e().listIterator(0);
        do {
            if (!agqsVarListIterator.hasNext()) {
                aohqVar = null;
                break;
            }
            aohqVar = (aohq) agqsVarListIterator.next();
        } while (!wfs.h(aohqVar.b()).equals(strG));
        if (aohqVar != null) {
            List streamsProgressModels = aohqVar.getStreamsProgressModels();
            wgs wgsVar2 = null;
            wgs wgsVar3 = null;
            for (int i = 0; i < ((agpi) streamsProgressModels).d && (wgsVar3 == null || wgsVar2 == null); i++) {
                aqdp aqdpVar = ((aqdo) streamsProgressModels.get(i)).a;
                int iAV = a.aV(aqdpVar.e);
                if (iAV == 0) {
                    iAV = 1;
                }
                if ((aqdpVar.b & 16) == 0 || iAV == 1) {
                    wgsVar = wgsVar2;
                    wgsVar2 = wgsVar;
                } else {
                    try {
                        alaw alawVar = (alaw) aihn.parseFrom(alaw.b, aqdpVar.g, ExtensionRegistryLite.getGeneratedRegistry());
                        int i2 = iAV;
                        wgsVar = wgsVar2;
                        Uri uriG = isi.G((abtd) this.g.io(), strG, alawVar.e, alawVar.r, alawVar.q, alawVar.p, this.a.b() + 18000000);
                        aihh aihhVar = (aihh) alawVar.toBuilder();
                        String string = uriG == null ? "" : uriG.toString();
                        aihhVar.copyOnWrite();
                        alaw alawVar2 = (alaw) aihhVar.instance;
                        string.getClass();
                        alawVar2.c |= 2;
                        alawVar2.f = string;
                        wgs wgsVar4 = new wgs((alaw) aihhVar.build(), strG, false, null);
                        if (i2 == 2) {
                            wgsVar3 = wgsVar4;
                            wgsVar2 = wgsVar;
                        } else {
                            wgsVar2 = wgsVar4;
                        }
                    } catch (aiik unused) {
                        wgsVar = wgsVar2;
                    }
                }
            }
            wgs wgsVar5 = wgsVar2;
            if (wgsVar3 == null && wgsVar5 == null) {
                pair = null;
            } else {
                pair = new Pair(wgsVar5, wgsVar3);
            }
        } else {
            pair = null;
        }
        if (pair != null) {
            return isi.I(wjfVar, (wjb) this.i.io(), (wgs) pair.first, (wgs) pair.second, this.a.b(), aael.b, false, (aauk) this.f);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    public final sko b(String str, skl sklVar, Optional optional, ski skiVar) {
        String strX;
        ArrayList arrayList = new ArrayList();
        Object obj = this.f;
        if (skiVar == null) {
            strX = ((xsc) obj).X(aixg.LAYOUT_TYPE_FORECASTING, str);
        } else {
            strX = ((xsc) obj).X(aixg.LAYOUT_TYPE_FORECASTING, str);
            arrayList.add(new sil(skiVar));
        }
        if (sklVar != null) {
            arrayList.add(new sip(sklVar));
        }
        saa saaVar = new saa(arrayList, 5);
        if (true == optional.isPresent()) {
            l(saaVar.a, (aisu) optional.get());
        }
        skn sknVarA = sko.a();
        sknVarA.l(strX);
        sknVarA.a = aixg.LAYOUT_TYPE_FORECASTING;
        sknVarA.m(1);
        Object obj2 = this.f;
        aixr aixrVar = aixr.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED;
        sknVarA.g(agke.q(new slr(((xsc) obj2).Z(aixrVar), aixrVar, false, strX)));
        sknVarA.c = shh.a(arrayList);
        return sknVarA.a();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:43:0x020d  */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.util.List] */
    public final sko c(String str, skl sklVar, Optional optional, List list) {
        sgn sgnVar;
        saa saaVar;
        skn sknVarA;
        aiua aiuaVarIL;
        int i = 4;
        if (list.size() == 1) {
            smc smcVar = (smc) list.get(0);
            if (smcVar instanceof slc) {
                slc slcVar = (slc) smcVar;
                Object obj = this.f;
                String str2 = slcVar.o;
                aixg aixgVar = aixg.LAYOUT_TYPE_MEDIA_BREAK;
                xsc xscVar = (xsc) obj;
                String strX = xscVar.X(aixgVar, str);
                agjz agjzVar = new agjz(4);
                agjz agjzVar2 = new agjz(4);
                agjz agjzVar3 = new agjz(4);
                aixr aixrVar = aixr.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED;
                agjzVar2.h(new slr(xscVar.Z(aixrVar), aixrVar, false, strX));
                agjzVar.h(new slr(xscVar.Z(aixrVar), aixrVar, false, strX));
                ArrayList arrayList = new ArrayList();
                arrayList.add(new sip(sklVar));
                arrayList.add(new sjc(slcVar));
                arrayList.add(new shn(sgn.a));
                arrayList.add(new sik(Long.valueOf(slcVar.p)));
                saa saaVar2 = new saa(arrayList, i);
                if (true == optional.isPresent()) {
                    l(saaVar2.a, (aisu) optional.get());
                }
                skn sknVarA2 = sko.a();
                sknVarA2.l(strX);
                sknVarA2.a = aixgVar;
                sknVarA2.m(1);
                sknVarA2.g(agjzVar.g());
                sknVarA2.i(agjzVar2.g());
                sknVarA2.e(agjzVar3.g());
                sknVarA2.c = shh.a(arrayList);
                aiua aiuaVarIL2 = slcVar.iL();
                if (aiuaVarIL2 != null) {
                    sknVarA2.b(aiuaVarIL2);
                }
                return sknVarA2.a();
            }
            if (smcVar instanceof slb) {
                slb slbVar = (slb) smcVar;
                if (slbVar instanceof sgo) {
                    throw new IllegalStateException("Unexpected mediaAd type: Ad intro should never be a single media ad.");
                }
                Object obj2 = this.f;
                String str3 = slbVar.o;
                aixg aixgVar2 = aixg.LAYOUT_TYPE_MEDIA;
                xsc xscVar2 = (xsc) obj2;
                String strX2 = xscVar2.X(aixgVar2, str);
                agjz agjzVar4 = new agjz(4);
                agjz agjzVar5 = new agjz(4);
                agjz agjzVar6 = new agjz(4);
                sgn sgnVar2 = sgn.a;
                if (slbVar.A()) {
                    aixr aixrVar2 = aixr.TRIGGER_TYPE_SKIP_REQUESTED;
                    agjzVar5.h(new smp(xscVar2.Z(aixrVar2), aixrVar2, false, strX2));
                }
                if (!(slbVar instanceof skz)) {
                    if (slbVar instanceof smk) {
                        agev agevVarH = agev.h(((smk) slbVar).ax());
                        agdf agdfVar = agdf.a;
                        sgnVar = new sgn(0, 0, 0, false, agevVarH, agdfVar, agdfVar);
                    }
                    aixr aixrVar3 = aixr.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED;
                    agjzVar4.h(new slr(xscVar2.Z(aixrVar3), aixrVar3, false, strX2));
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new sip(sklVar));
                    arrayList2.add(new sjb(slbVar));
                    arrayList2.add(new shn(sgnVar2));
                    arrayList2.add(new sik(Long.valueOf(slbVar.p)));
                    saaVar = new saa(arrayList2, 3);
                    if (true == optional.isPresent()) {
                        l(saaVar.a, (aisu) optional.get());
                    }
                    arrayList2.add(new sib(strX2));
                    sknVarA = sko.a();
                    sknVarA.l(strX2);
                    sknVarA.a = aixgVar2;
                    sknVarA.m(1);
                    sknVarA.g(agjzVar4.g());
                    sknVarA.i(agjzVar5.g());
                    sknVarA.e(agjzVar6.g());
                    sknVarA.b = ((tld) this.g).c(slbVar, strX2);
                    sknVarA.c = shh.a(arrayList2);
                    aiuaVarIL = slbVar.iL();
                    if (aiuaVarIL != null) {
                        sknVarA.b(aiuaVarIL);
                    }
                    return sknVarA.a();
                }
                skz skzVar = (skz) slbVar;
                sgnVar = z(skzVar);
                aixr aixrVar4 = aixr.TRIGGER_TYPE_SKIP_REQUESTED;
                agjzVar6.h(new smp(xscVar2.Z(aixrVar4), aixrVar4, false, strX2));
                if (skzVar.C() || skzVar.D()) {
                    aixr aixrVar5 = aixr.TRIGGER_TYPE_SURVEY_SUBMITTED;
                    agjzVar5.h(new sne(xscVar2.Z(aixrVar5), aixrVar5, false, strX2));
                }
                if (skzVar.D()) {
                    aixr aixrVar6 = aixr.TRIGGER_TYPE_SURVEY_DISMISSED;
                    agjzVar5.h(new snb(xscVar2.Z(aixrVar6), aixrVar6, false, strX2));
                }
                if (skzVar.y()) {
                    agjzVar5.h(skt.e(xscVar2.Z(aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON), strX2, 1));
                }
                sgnVar2 = sgnVar;
                aixr aixrVar7 = aixr.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED;
                agjzVar4.h(new slr(xscVar2.Z(aixrVar7), aixrVar7, false, strX2));
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new sip(sklVar));
                arrayList3.add(new sjb(slbVar));
                arrayList3.add(new shn(sgnVar2));
                arrayList3.add(new sik(Long.valueOf(slbVar.p)));
                saaVar = new saa(arrayList3, 3);
                if (true == optional.isPresent()) {
                    l(saaVar.a, (aisu) optional.get());
                }
                arrayList3.add(new sib(strX2));
                sknVarA = sko.a();
                sknVarA.l(strX2);
                sknVarA.a = aixgVar2;
                sknVarA.m(1);
                sknVarA.g(agjzVar4.g());
                sknVarA.i(agjzVar5.g());
                sknVarA.e(agjzVar6.g());
                sknVarA.b = ((tld) this.g).c(slbVar, strX2);
                sknVarA.c = shh.a(arrayList3);
                aiuaVarIL = slbVar.iL();
                if (aiuaVarIL != null) {
                    sknVarA.b(aiuaVarIL);
                }
                return sknVarA.a();
            }
        }
        if (!list.isEmpty()) {
            if (list.get(0) instanceof ski) {
                return b(str, sklVar, optional, (ski) list.get(0));
            }
            if (list.get(0) instanceof snf) {
                snf snfVar = (snf) list.get(0);
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(new sjr(snfVar));
                saa saaVar3 = new saa(arrayList4, 6);
                if (true == optional.isPresent()) {
                    l(saaVar3.a, (aisu) optional.get());
                }
                Object obj3 = this.d;
                skn sknVarA3 = sko.a();
                sknVarA3.l(((rnj) obj3).e());
                sknVarA3.a = aixg.LAYOUT_TYPE_UNSPECIFIED;
                sknVarA3.m(1);
                sknVarA3.c = shh.a(arrayList4);
                return sknVarA3.a();
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            smc smcVar2 = (smc) it.next();
            if (smcVar2 instanceof slb) {
                Object obj4 = this.f;
                String str4 = smcVar2.o;
                arrayList5.add(((xsc) obj4).X(aixg.LAYOUT_TYPE_MEDIA, str));
            } else {
                if (!(smcVar2 instanceof slc)) {
                    throw new IllegalStateException("Unexpected playerAd type: ".concat(String.valueOf(String.valueOf(smcVar2))));
                }
                Object obj5 = this.f;
                String str5 = smcVar2.o;
                arrayList5.add(((xsc) obj5).X(aixg.LAYOUT_TYPE_MEDIA_BREAK, str));
            }
        }
        Object obj6 = this.f;
        aixg aixgVar3 = aixg.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES;
        xsc xscVar3 = (xsc) obj6;
        String strX3 = xscVar3.X(aixgVar3, str);
        List<sko> listJ = j(sklVar, list, arrayList5, strX3);
        if (listJ.isEmpty()) {
            return null;
        }
        agjz agjzVar7 = new agjz(4);
        agjz agjzVar8 = new agjz(4);
        agjz agjzVar9 = new agjz(4);
        for (sko skoVar : listJ) {
            if (skoVar.e(sjb.class)) {
                slb slbVar2 = (slb) skoVar.d(sjb.class);
                if (slbVar2.A() && !smc.av(slbVar2.iJ())) {
                    aixr aixrVar8 = aixr.TRIGGER_TYPE_SKIP_REQUESTED;
                    agjzVar8.h(new smp(xscVar3.Z(aixrVar8), aixrVar8, false, skoVar.a));
                }
                if (slbVar2 instanceof skz) {
                    skz skzVar2 = (skz) slbVar2;
                    aixr aixrVar9 = aixr.TRIGGER_TYPE_SKIP_REQUESTED;
                    String strZ = xscVar3.Z(aixrVar9);
                    String str6 = skoVar.a;
                    agjzVar9.h(new smp(strZ, aixrVar9, false, str6));
                    if (skzVar2.C() || skzVar2.D()) {
                        aixr aixrVar10 = aixr.TRIGGER_TYPE_SURVEY_SUBMITTED;
                        agjzVar8.h(new sne(xscVar3.Z(aixrVar10), aixrVar10, false, strX3));
                    }
                    if (skzVar2.D()) {
                        aixr aixrVar11 = aixr.TRIGGER_TYPE_SURVEY_DISMISSED;
                        agjzVar8.h(new snb(xscVar3.Z(aixrVar11), aixrVar11, false, strX3));
                    }
                    if (skzVar2.y()) {
                        agjzVar8.h(skt.e(xscVar3.Z(aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON), str6, 1));
                    }
                }
            } else if (skoVar.e(sjc.class) && !smc.av(((slc) skoVar.d(sjc.class)).iJ())) {
                aixr aixrVar12 = aixr.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED;
                agjzVar8.h(new slr(xscVar3.Z(aixrVar12), aixrVar12, false, skoVar.a));
            }
        }
        aixr aixrVar13 = aixr.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED;
        agjzVar7.h(new slr(xscVar3.Z(aixrVar13), aixrVar13, false, strX3));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new sip(sklVar));
        arrayList6.add(new sjq(listJ));
        saa saaVar4 = new saa(arrayList6, 2);
        if (true == optional.isPresent()) {
            l(saaVar4.a, (aisu) optional.get());
        }
        skn sknVarA4 = sko.a();
        sknVarA4.l(strX3);
        sknVarA4.a = aixgVar3;
        sknVarA4.m(1);
        sknVarA4.g(agjzVar7.g());
        sknVarA4.i(agjzVar8.g());
        sknVarA4.e(agjzVar9.g());
        sknVarA4.c = shh.a(arrayList6);
        return sknVarA4.a();
    }

    public final sko d(smr smrVar, aixo aixoVar, String str) {
        aixg aixgVar;
        int iOrdinal = aixoVar.ordinal();
        if (iOrdinal == 11) {
            aixgVar = (smrVar.e(siv.class) && ((Boolean) smrVar.d(siv.class)).booleanValue()) ? aixg.LAYOUT_TYPE_AD_INFO_OVERLAY : aixg.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY_LIGHTWEIGHT;
        } else if (iOrdinal == 15) {
            aixgVar = aixg.LAYOUT_TYPE_AD_MEDIA_CONTROLS_BAR;
        } else {
            if (iOrdinal != 16) {
                throw new IllegalArgumentException("Illegal slot type for building mdx layout: ".concat(String.valueOf(aixoVar.name())));
            }
            aixgVar = aixg.LAYOUT_TYPE_AD_MEDIA_CONTROLS_BAR_EXPANDABLE;
        }
        xsc xscVar = (xsc) this.f;
        String strX = xscVar.X(aixgVar, smrVar.a);
        amco amcoVarAi = ((vwt) this.a).ai(smrVar, strX, aixgVar, null);
        skn sknVarA = sko.a();
        sknVarA.l(strX);
        sknVarA.a = aixgVar;
        sknVarA.m(1);
        aixr aixrVar = aixr.TRIGGER_TYPE_LAYOUT_ID_EXITED;
        sknVarA.g(agke.q(new skw(xscVar.Z(aixrVar), aixrVar, false, str)));
        sknVarA.c(amcoVarAi);
        sknVarA.c = shh.b(new sht[0]);
        return sknVarA.a();
    }

    public final sko e(smr smrVar, aixg aixgVar, wjf wjfVar, wgk wgkVar, String str) {
        xsc xscVar = (xsc) this.f;
        String str2 = smrVar.a;
        String strX = xscVar.X(aixgVar, str2);
        amco amcoVarAi = ((vwt) this.a).ai(smrVar, strX, aixgVar, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new sid(wjfVar));
        arrayList.add(new shl(wgkVar));
        arrayList.add(new sic(str));
        if (smrVar.e(sip.class)) {
            arrayList.add(new sip((skl) smrVar.d(sip.class)));
        }
        if (smrVar.e(sih.class)) {
            arrayList.add(new sih((yvs) smrVar.d(sih.class)));
        }
        if (smrVar.e(shj.class)) {
            arrayList.add(new shj(((Integer) smrVar.d(shj.class)).intValue()));
        }
        skn sknVarA = sko.a();
        sknVarA.l(strX);
        sknVarA.a = aixgVar;
        sknVarA.m(1);
        aixr aixrVar = aixr.TRIGGER_TYPE_ON_OPPORTUNITY_TYPE_RECEIVED;
        sknVarA.g(agke.q(new sly(xscVar.Z(aixrVar), aixrVar, str2)));
        sknVarA.c(amcoVarAi);
        sknVarA.c = shh.a(arrayList);
        return sknVarA.a();
    }

    /* JADX WARN: Code duplicated, block: B:262:0x0789  */
    /* JADX WARN: Code duplicated, block: B:273:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:276:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:316:0x0797 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x0783 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.lang.Object, java.util.List] */
    public final sko f(aopn aopnVar, wjf wjfVar, String str, Optional optional, boolean z) throws sas {
        agke agkeVarC;
        agke agkeVarC2;
        agke agkeVarC3;
        aiuc aiucVar;
        aixg aixgVarA;
        slc slcVar;
        int iA;
        ArrayList arrayList;
        ArrayList arrayList2;
        sgn sgnVar;
        sml sgwVar;
        String str2;
        ArrayList arrayList3;
        Optional optional2;
        sml sgxVar;
        sna snaVarF;
        int i;
        int i2;
        sgt sgtVarA;
        optional = optional;
        apji apjiVar = aopnVar.d;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aopr aoprVar = (aopr) aavv.s(apjiVar, aops.a);
        if (aoprVar == null) {
            throw new sas("Unable to create a composite layout due to missing the sequential layout renderer.", 117);
        }
        ArrayList<smc> arrayList4 = new ArrayList();
        Iterator it = aoprVar.b.iterator();
        smr smrVar = null;
        skz skzVarB = null;
        int i3 = 0;
        while (it.hasNext()) {
            aopn aopnVar2 = (aopn) aavv.s((apji) it.next(), aopo.a);
            if (aopnVar2 == null) {
                throw new sas("Unable to parse the sub-layout renderer from the parent sequential layout renderer.", 117);
            }
            if (w(aopnVar2, aitx.a)) {
                apji apjiVar2 = aopnVar2.d;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aitx.a);
                apjiVar2.c(aihlVarCheckIsLite);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite.d);
                aitw aitwVar = (aitw) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                xsc xscVar = (xsc) this.f;
                String strY = xscVar.Y();
                String strY2 = xscVar.Y();
                long jE = wjfVar.e();
                String str3 = sgo.a;
                arrayList4.add(new sgo(wjfVar.G(), wjfVar.ab(), wjfVar.A(), strY, wjfVar.R(), strY2, Long.MAX_VALUE, (wjf) (aitwVar.b == 1 ? Optional.ofNullable(wji.aj(((aigj) aitwVar.c).G(), jE)) : Optional.empty()).orElseThrow(new ieu(10))));
            } else if (w(aopnVar2, arch.a)) {
                Object obj = this.h;
                apji apjiVar3 = aopnVar2.d;
                if (apjiVar3 == null) {
                    apjiVar3 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arch.a);
                apjiVar3.c(aihlVarCheckIsLite2);
                Object objK2 = apjiVar3.j.k(aihlVarCheckIsLite2.d);
                Object objC = objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2);
                int i4 = i3 + 1;
                xsc xscVar2 = (xsc) this.f;
                vyo vyoVar = (vyo) this.b;
                sdo sdoVar = (sdo) obj;
                skzVarB = sdoVar.b((arcg) objC, wjfVar, xscVar2.Y(), xscVar2.Y(), i3, taq.aA(vyoVar));
                arrayList4.add(skzVarB);
                if (skzVarB.l()) {
                    if (taq.aG(vyoVar)) {
                        skzVarB.E();
                        String strY3 = xscVar2.Y();
                        i3 += 2;
                        aizx aizxVar = ((vyo) sdoVar.b).b().o;
                        if (aizxVar == null) {
                            aizxVar = aizx.a;
                        }
                        boolean z2 = aizxVar.I;
                        arrayList4.add(new sgt(skzVarB, strY3, i4));
                    } else {
                        String strY4 = xscVar2.Y();
                        aizx aizxVar2 = ((vyo) sdoVar.b).b().o;
                        if (aizxVar2 == null) {
                            aizxVar2 = aizx.a;
                        }
                        arrayList4.add(new sgt(skzVarB, strY4, aizxVar2.I));
                    }
                }
                i3 = i4;
            } else {
                if (!w(aopnVar2, aiwb.a)) {
                    i = i3;
                    if (w(aopnVar2, aqfy.a)) {
                        apji apjiVar4 = aopnVar2.d;
                        if (apjiVar4 == null) {
                            apjiVar4 = apji.a;
                        }
                        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aqfy.a);
                        apjiVar4.c(aihlVarCheckIsLite3);
                        Object objK3 = apjiVar4.j.k(aihlVarCheckIsLite3.d);
                        Object objC2 = objK3 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK3);
                        i3 = i + 1;
                        xsc xscVar3 = (xsc) this.f;
                        arrayList4.add(sdo.d((aqfv) objC2, wjfVar, xscVar3.Y(), xscVar3.Y(), i));
                    } else {
                        if (!w(aopnVar2, aqhj.a)) {
                            throw new sas("Unable to create a player ad due to the unsupported rendering content.", 117);
                        }
                        apji apjiVar5 = aopnVar2.d;
                        if (apjiVar5 == null) {
                            apjiVar5 = apji.a;
                        }
                        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aqhj.a);
                        apjiVar5.c(aihlVarCheckIsLite4);
                        Object objK4 = apjiVar5.j.k(aihlVarCheckIsLite4.d);
                        Object objC3 = objK4 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK4);
                        xsc xscVar4 = (xsc) this.f;
                        arrayList4.add(new snc(wjfVar.G(), wjfVar.ab(), wjfVar.A(), xscVar4.Y(), wjfVar.R(), wjfVar.f(), xscVar4.Y(), (aqhi) objC3));
                        i3 = i;
                    }
                } else if (skzVarB == null) {
                    rmp.n(smrVar, "No media ad found before the endcap.");
                } else {
                    if (taq.aG((vyo) this.b)) {
                        skzVarB.E();
                        Object obj2 = this.h;
                        apji apjiVar6 = aopnVar2.d;
                        if (apjiVar6 == null) {
                            apjiVar6 = apji.a;
                        }
                        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aiwb.a);
                        apjiVar6.c(aihlVarCheckIsLite5);
                        Object objK5 = apjiVar6.j.k(aihlVarCheckIsLite5.d);
                        Object objC4 = objK5 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK5);
                        i2 = i3 + 1;
                        xsc xscVar5 = (xsc) this.f;
                        sgtVarA = ((sdo) obj2).a((aiwa) objC4, wjfVar, xscVar5.Y(), xscVar5.Y(), i3, skzVarB);
                    } else {
                        i2 = i3;
                        Object obj3 = this.h;
                        apji apjiVar7 = aopnVar2.d;
                        if (apjiVar7 == null) {
                            apjiVar7 = apji.a;
                        }
                        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aiwb.a);
                        apjiVar7.c(aihlVarCheckIsLite6);
                        Object objK6 = apjiVar7.j.k(aihlVarCheckIsLite6.d);
                        Object objC5 = objK6 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK6);
                        xsc xscVar6 = (xsc) this.f;
                        sgtVarA = ((sdo) obj3).a((aiwa) objC5, wjfVar, xscVar6.Y(), xscVar6.Y(), 0, skzVarB);
                    }
                    i3 = i2;
                    arrayList4.add(sgtVarA);
                    skzVarB.e = 1;
                }
                smrVar = null;
            }
            i = i3;
            i3 = i;
            smrVar = null;
        }
        wjfVar = wjfVar;
        boolean z3 = true;
        int i5 = 0;
        int iA2 = 0;
        boolean z4 = false;
        int i6 = 0;
        for (smc smcVar : arrayList4) {
            if (smcVar instanceof skz) {
                int i7 = i6 + 1;
                iA2 += ((skz) smcVar).a() * 1000;
                if (i7 != 1 || smcVar.A()) {
                    i6 = i7;
                } else {
                    i6 = i7;
                    z4 = true;
                }
            }
        }
        aiuc aiucVar2 = aopnVar.c;
        if (aiucVar2 == null) {
            aiucVar2 = aiuc.a;
        }
        String str4 = aiucVar2.c;
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList4.iterator();
        int i8 = iA2;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int i11 = 7;
            if (!it2.hasNext()) {
                ArrayList<sko> arrayList6 = arrayList5;
                agke agkeVar = agpi.a;
                try {
                    agkeVarC = nrj.c(aopnVar.e, Optional.empty());
                    try {
                        Object obj4 = this.b;
                        agkeVarC2 = taq.aG((vyo) obj4) ? nrj.c((agke) Collection.EL.stream(aopnVar.f).filter(new sco(arrayList6, i11)).collect(aghu.a), Optional.empty()) : nrj.c(aopnVar.f, Optional.empty());
                        try {
                            agkeVarC3 = nrj.c(aopnVar.g, Optional.empty());
                            try {
                                long jY = taq.Y((vyo) obj4);
                                if (taq.az((vyo) obj4) && jY > 0) {
                                    agkeVar = (agke) Collection.EL.stream(arrayList6).filter(new sco(this, 6)).map(new sdj(this, jY, i5)).collect(aghu.a);
                                }
                            } catch (sav e) {
                                e = e;
                                rmp.n(null, "Failed to create a client trigger. ".concat(String.valueOf(e.getMessage())));
                            }
                        } catch (sav e2) {
                            e = e2;
                            agkeVarC3 = agkeVar;
                        }
                    } catch (sav e3) {
                        e = e3;
                        agkeVarC2 = agkeVar;
                        agkeVarC3 = agkeVarC2;
                        rmp.n(null, "Failed to create a client trigger. ".concat(String.valueOf(e.getMessage())));
                        agjz agjzVar = new agjz(4);
                        for (sko skoVar : arrayList6) {
                            if (skoVar.e(sjc.class)) {
                                slcVar = (slc) skoVar.d(sjc.class);
                                if (!(slcVar instanceof sgt)) {
                                }
                            }
                        }
                        agke agkeVarG = agjzVar.g();
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(new sjq(arrayList6));
                        skn sknVarA = sko.a();
                        sknVarA.l(str4);
                        aiucVar = aopnVar.c;
                        if (aiucVar == null) {
                            aiucVar = aiuc.a;
                        }
                        aixgVarA = aixg.a(aiucVar.d);
                        if (aixgVarA == null) {
                            aixgVarA = aixg.LAYOUT_TYPE_UNSPECIFIED;
                        }
                        sknVarA.a = aixgVarA;
                        sknVarA.m(1);
                        sknVarA.g(agkeVarC);
                        agjz agjzVar2 = new agjz(4);
                        agjzVar2.j(agkeVarC2);
                        agjzVar2.j(agkeVarG);
                        agjzVar2.j(agkeVar);
                        sknVarA.i(agjzVar2.g());
                        sknVarA.e(agkeVarC3);
                        sknVarA.c = shh.a(arrayList7);
                        sknVarA.p(agke.n(arrayList6));
                        return sknVarA.a();
                    }
                } catch (sav e4) {
                    e = e4;
                    agkeVarC = agkeVar;
                    agkeVarC2 = agkeVarC;
                }
                agjz agjzVar3 = new agjz(4);
                while (r8.hasNext()) {
                    if (skoVar.e(sjc.class)) {
                        slcVar = (slc) skoVar.d(sjc.class);
                        if (!(slcVar instanceof sgt) && !smc.av(slcVar.iJ()) && !((sgt) slcVar).b) {
                            Object obj5 = this.f;
                            aixr aixrVar = aixr.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED;
                            agjzVar3.h(new slr(((xsc) obj5).Z(aixrVar), aixrVar, false, skoVar.a));
                        }
                    }
                }
                agke agkeVarG2 = agjzVar3.g();
                ArrayList arrayList8 = new ArrayList();
                arrayList8.add(new sjq(arrayList6));
                skn sknVarA2 = sko.a();
                sknVarA2.l(str4);
                aiucVar = aopnVar.c;
                if (aiucVar == null) {
                    aiucVar = aiuc.a;
                }
                aixgVarA = aixg.a(aiucVar.d);
                if (aixgVarA == null) {
                    aixgVarA = aixg.LAYOUT_TYPE_UNSPECIFIED;
                }
                sknVarA2.a = aixgVarA;
                sknVarA2.m(1);
                sknVarA2.g(agkeVarC);
                agjz agjzVar4 = new agjz(4);
                agjzVar4.j(agkeVarC2);
                agjzVar4.j(agkeVarG2);
                agjzVar4.j(agkeVar);
                sknVarA2.i(agjzVar4.g());
                sknVarA2.e(agkeVarC3);
                sknVarA2.c = shh.a(arrayList8);
                sknVarA2.p(agke.n(arrayList6));
                return sknVarA2.a();
            }
            smc smcVar2 = (smc) it2.next();
            if (!(smcVar2 instanceof sgt) || ((sgt) smcVar2).b) {
                int i12 = 2;
                iA = i8;
                boolean z5 = z3;
                if (smcVar2 instanceof slc) {
                    slc slcVar2 = (slc) smcVar2;
                    int i13 = i9 + 1;
                    apji apjiVar8 = (apji) aoprVar.b.get(i9);
                    aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aopo.a);
                    apjiVar8.c(aihlVarCheckIsLite7);
                    Object objK7 = apjiVar8.j.k(aihlVarCheckIsLite7.d);
                    aopn aopnVar3 = (aopn) (objK7 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK7));
                    ArrayList arrayList9 = new ArrayList();
                    aiuc aiucVar3 = aopnVar3.c;
                    if (aiucVar3 == null) {
                        aiucVar3 = aiuc.a;
                    }
                    String str5 = aiucVar3.c;
                    Optional optionalA = A(wjfVar, optional, str5);
                    saa saaVar = new saa(arrayList9, i11);
                    ArrayList arrayList10 = arrayList9;
                    if (z5 == optionalA.isPresent()) {
                        saaVar.a.add(new sio((aivt) optionalA.get()));
                    }
                    if (slcVar2 instanceof sna) {
                        sml smlVarC = nrl.c((sna) slcVar2);
                        apji apjiVar9 = aopnVar3.d;
                        if (apjiVar9 == null) {
                            apjiVar9 = apji.a;
                        }
                        aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aqfy.a);
                        apjiVar9.c(aihlVarCheckIsLite8);
                        Object objK8 = apjiVar9.j.k(aihlVarCheckIsLite8.d);
                        aqfv aqfvVar = (aqfv) (objK8 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK8));
                        if (optionalA.isPresent()) {
                            wjfVar = wjfVar;
                            snaVarF = sdo.e(aqfvVar, (aivt) optionalA.get(), wjfVar, slcVar2.l, slcVar2.o, slcVar2.iI());
                            arrayList3 = arrayList5;
                            str2 = str5;
                        } else {
                            wjfVar = wjfVar;
                            arrayList3 = arrayList5;
                            snaVarF = sdo.f(B(wjfVar, optional), aqfvVar, wjfVar, str5, slcVar2.l, slcVar2.o, slcVar2.iI(), optional);
                            str2 = str5;
                        }
                        optional2 = optional;
                        arrayList10.add(new sje(snaVarF));
                        sgxVar = smlVarC;
                    } else {
                        wjfVar = wjfVar;
                        str2 = str5;
                        arrayList3 = arrayList5;
                        optional2 = optional;
                        i13 = i13;
                        i12 = 2;
                        arrayList10 = arrayList10;
                        aopnVar3 = aopnVar3;
                        if (slcVar2 instanceof snc) {
                            snc sncVar = (snc) slcVar2;
                            sncVar.getClass();
                            sgxVar = new shb(sncVar);
                        } else {
                            if (!(slcVar2 instanceof sgt)) {
                                throw new sas("Unable to create a sub media break layout due to the unsupported player ad type.", 117);
                            }
                            sgt sgtVar = (sgt) slcVar2;
                            sgtVar.getClass();
                            sgxVar = new sgx(sgtVar);
                        }
                    }
                    arrayList10.add(new sjc(slcVar2));
                    arrayList10.add(new shn(sgn.a));
                    arrayList10.add(new sik(Long.valueOf(slcVar2.p)));
                    skn sknVarA3 = sko.a();
                    sknVarA3.l(str2);
                    aiuc aiucVar4 = aopnVar3.c;
                    if (aiucVar4 == null) {
                        aiucVar4 = aiuc.a;
                    }
                    aixg aixgVarA2 = aixg.a(aiucVar4.d);
                    if (aixgVarA2 == null) {
                        aixgVarA2 = aixg.LAYOUT_TYPE_UNSPECIFIED;
                    }
                    sknVarA3.a = aixgVarA2;
                    sknVarA3.m(i12);
                    aiuc aiucVar5 = aopnVar3.c;
                    if (aiucVar5 == null) {
                        aiucVar5 = aiuc.a;
                    }
                    aiua aiuaVar = aiucVar5.e;
                    if (aiuaVar == null) {
                        aiuaVar = aiua.a;
                    }
                    sknVarA3.b(aiuaVar);
                    sknVarA3.c = shh.a(arrayList10);
                    sknVarA3.n(sgxVar);
                    ArrayList arrayList11 = arrayList3;
                    arrayList11.add(sknVarA3.a());
                    optional = optional2;
                    arrayList5 = arrayList11;
                    i8 = iA;
                    i9 = i13;
                } else {
                    arrayList = arrayList5;
                    Optional optional3 = optional;
                    if (smcVar2 instanceof slb) {
                        slb slbVar = (slb) smcVar2;
                        if (smcVar2 instanceof skz) {
                            i10++;
                            iA -= ((skz) smcVar2).a() * 1000;
                        }
                        int i14 = i10;
                        int i15 = i9 + 1;
                        apji apjiVar10 = (apji) aoprVar.b.get(i9);
                        aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aopo.a);
                        apjiVar10.c(aihlVarCheckIsLite9);
                        Object objK9 = apjiVar10.j.k(aihlVarCheckIsLite9.d);
                        aopn aopnVar4 = (aopn) (objK9 == null ? aihlVarCheckIsLite9.b : aihlVarCheckIsLite9.c(objK9));
                        aiuc aiucVar6 = aopnVar4.c;
                        if (aiucVar6 == null) {
                            aiucVar6 = aiuc.a;
                        }
                        String str6 = aiucVar6.c;
                        sgn sgnVar2 = sgn.a;
                        ArrayList arrayList12 = new ArrayList();
                        if (slbVar instanceof sgo) {
                            sgo sgoVar = (sgo) slbVar;
                            sgoVar.getClass();
                            sgwVar = new sgw(sgoVar);
                            aoprVar = aoprVar;
                            aopnVar4 = aopnVar4;
                            arrayList2 = arrayList12;
                        } else {
                            if (!(slbVar instanceof skz)) {
                                throw new sas("Unable to create a sub media layout due to the unsupported player ad type.", 117);
                            }
                            skz skzVar = (skz) slbVar;
                            sml smlVarB = nrl.b(skzVar);
                            if (A(wjfVar, optional3, str6).isEmpty()) {
                                Object obj6 = this.h;
                                List listB = B(wjfVar, optional3);
                                apji apjiVar11 = aopnVar4.d;
                                if (apjiVar11 == null) {
                                    apjiVar11 = apji.a;
                                }
                                aihl aihlVarCheckIsLite10 = aihn.checkIsLite(arch.a);
                                apjiVar11.c(aihlVarCheckIsLite10);
                                Object objK10 = apjiVar11.j.k(aihlVarCheckIsLite10.d);
                                arrayList2 = arrayList12;
                                skz skzVarC = ((sdo) obj6).c(listB, (arcg) (objK10 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK10)), wjfVar, skzVar.c, str6, slbVar.l, slbVar.o, slbVar.iI());
                                arrayList2.add(new sjd(skzVarC));
                                if (taq.aG((vyo) this.b) && slbVar.l()) {
                                    skzVarC.E();
                                }
                                sgnVar = new sgn(i14, i6, iA, false, agev.h(skzVarC.ax()), agev.h((aivw) skzVarC.s().orElse(null)), agdf.a);
                            } else {
                                arrayList2 = arrayList12;
                                agdf agdfVar = agdf.a;
                                sgnVar = new sgn(i14, i6, iA, false, agdfVar, agdfVar, agdfVar);
                            }
                            sgnVar2 = sgnVar;
                            sgwVar = smlVarB;
                        }
                        arrayList2.add(new sjb(slbVar));
                        arrayList2.add(new shn(sgnVar2));
                        arrayList2.add(new sik(Long.valueOf(slbVar.p)));
                        arrayList2.add(new sib(str4));
                        arrayList2.add(new six(z4));
                        boolean z6 = wjfVar.f().av() && z;
                        skn sknVarA4 = sko.a();
                        sknVarA4.l(str6);
                        aiuc aiucVar7 = aopnVar4.c;
                        if (aiucVar7 == null) {
                            aiucVar7 = aiuc.a;
                        }
                        aixg aixgVarA3 = aixg.a(aiucVar7.d);
                        if (aixgVarA3 == null) {
                            aixgVarA3 = aixg.LAYOUT_TYPE_UNSPECIFIED;
                        }
                        sknVarA4.a = aixgVarA3;
                        sknVarA4.m(2);
                        aizx aizxVarE = afxw.e((vyo) this.b);
                        sknVarA4.b = (aizxVarE != null && aizxVarE.au && z6) ? agpn.b : ((tld) this.g).c(slbVar, str6);
                        aiuc aiucVar8 = aopnVar4.c;
                        if (aiucVar8 == null) {
                            aiucVar8 = aiuc.a;
                        }
                        aiua aiuaVar2 = aiucVar8.e;
                        if (aiuaVar2 == null) {
                            aiuaVar2 = aiua.a;
                        }
                        sknVarA4.b(aiuaVar2);
                        sknVarA4.c = shh.a(arrayList2);
                        sknVarA4.n(sgwVar);
                        arrayList.add(sknVarA4.a());
                        arrayList5 = arrayList;
                        i10 = i14;
                        i8 = iA;
                        i9 = i15;
                    }
                    aoprVar = aoprVar;
                }
                z3 = true;
            } else {
                Object obj7 = this.f;
                skn sknVarA5 = sko.a();
                String str7 = smcVar2.o;
                aixg aixgVar = aixg.LAYOUT_TYPE_MEDIA_BREAK;
                sknVarA5.l(((xsc) obj7).X(aixgVar, str));
                sknVarA5.a = aixgVar;
                sknVarA5.m(2);
                sht[] shtVarArr = new sht[3];
                shtVarArr[0] = new sjc((slc) smcVar2);
                shtVarArr[z3 ? 1 : 0] = new shn(sgn.a);
                iA = i8;
                shtVarArr[2] = new sik(Long.valueOf(smcVar2.p));
                sknVarA5.c = shh.b(shtVarArr);
                aiua aiuaVarIL = smcVar2.iL();
                if (aiuaVarIL != null) {
                    sknVarA5.b(aiuaVarIL);
                }
                arrayList5.add(sknVarA5.a());
                arrayList = arrayList5;
            }
            aoprVar = aoprVar;
            arrayList5 = arrayList;
            i8 = iA;
            aoprVar = aoprVar;
            z3 = true;
        }
    }

    public final sko g(aopn aopnVar, wjf wjfVar, Optional optional) throws sas {
        agke agkeVarC;
        String str;
        sna snaVarF;
        apji apjiVar = aopnVar.d;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aqfv aqfvVar = (aqfv) aavv.s(apjiVar, aqfy.a);
        if (aqfvVar == null) {
            throw new sas("Not able to create a single media break layout due to the invalid rendering content.", 117);
        }
        aiuc aiucVar = aopnVar.c;
        if (aiucVar == null) {
            aiucVar = aiuc.a;
        }
        Object obj = this.f;
        String str2 = aiucVar.c;
        xsc xscVar = (xsc) obj;
        String strY = xscVar.Y();
        String strY2 = xscVar.Y();
        sna snaVarD = sdo.d(aqfvVar, wjfVar, strY, strY2, 0);
        agke agkeVarC2 = agpi.a;
        try {
            agkeVarC = nrj.c(aopnVar.e, Optional.empty());
            try {
                agkeVarC2 = nrj.c(aopnVar.f, Optional.empty());
            } catch (sav e) {
                e = e;
                rmp.n(null, "Failed to create a client trigger. ".concat(String.valueOf(e.getMessage())));
            }
        } catch (sav e2) {
            e = e2;
            agkeVarC = agkeVarC2;
        }
        agke agkeVar = agkeVarC2;
        agke agkeVar2 = agkeVarC;
        sml smlVarC = nrl.c(snaVarD);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new sjc(snaVarD));
        arrayList.add(new shn(sgn.a));
        arrayList.add(new sik(Long.valueOf(snaVarD.p)));
        arrayList.add(new sib(str2));
        Optional optionalA = A(wjfVar, optional, str2);
        if (optionalA.isPresent()) {
            arrayList.add(new sio((aivt) optionalA.get()));
            snaVarF = sdo.e(aqfvVar, (aivt) optionalA.get(), wjfVar, strY, strY2, 0);
            str = str2;
        } else {
            str = str2;
            snaVarF = sdo.f(B(wjfVar, optional), aqfvVar, wjfVar, str, strY, strY2, 0, optional);
        }
        arrayList.add(new sje(snaVarF));
        skn sknVarA = sko.a();
        sknVarA.l(str);
        aiuc aiucVar2 = aopnVar.c;
        if (aiucVar2 == null) {
            aiucVar2 = aiuc.a;
        }
        aixg aixgVarA = aixg.a(aiucVar2.d);
        if (aixgVarA == null) {
            aixgVarA = aixg.LAYOUT_TYPE_UNSPECIFIED;
        }
        sknVarA.a = aixgVarA;
        sknVarA.m(1);
        sknVarA.g(agkeVar2);
        sknVarA.i(agkeVar);
        aiuc aiucVar3 = aopnVar.c;
        if (aiucVar3 == null) {
            aiucVar3 = aiuc.a;
        }
        aiua aiuaVar = aiucVar3.e;
        if (aiuaVar == null) {
            aiuaVar = aiua.a;
        }
        sknVarA.b(aiuaVar);
        sknVarA.c = shh.a(arrayList);
        sknVarA.n(smlVarC);
        return sknVarA.a();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x012c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0172  */
    /* JADX WARN: Code duplicated, block: B:50:0x0183  */
    /* JADX WARN: Code duplicated, block: B:53:0x018d  */
    /* JADX WARN: Code duplicated, block: B:56:0x01be  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c4  */
    public final sko h(aopn aopnVar, wjf wjfVar, Optional optional) throws sas {
        agke agkeVar;
        agke agkeVarC;
        agke agkeVarC2;
        agke agkeVarC3;
        agke agkeVar2;
        sml smlVarB;
        ArrayList arrayList;
        sml smlVar;
        String str;
        ArrayList arrayList2;
        aiuc aiucVar;
        aixg aixgVarA;
        aiuc aiucVar2;
        aiua aiuaVar;
        vyo vyoVar;
        agke agkeVarQ;
        apji apjiVar = aopnVar.d;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        arcg arcgVar = (arcg) aavv.s(apjiVar, arch.a);
        if (arcgVar == null) {
            throw new sas("Not able to create a single media layout due to the invalid rendering content.", 117);
        }
        aiuc aiucVar3 = aopnVar.c;
        if (aiucVar3 == null) {
            aiucVar3 = aiuc.a;
        }
        Object obj = this.f;
        Object obj2 = this.h;
        String str2 = aiucVar3.c;
        xsc xscVar = (xsc) obj;
        String strY = xscVar.Y();
        String strY2 = xscVar.Y();
        skz skzVarB = ((sdo) obj2).b(arcgVar, wjfVar, strY, strY2, 0, false);
        agke agkeVar3 = agpi.a;
        try {
            agkeVarC = nrj.c(aopnVar.e, Optional.empty());
            try {
                agkeVarC2 = nrj.c(aopnVar.f, Optional.empty());
                try {
                    agkeVarC3 = nrj.c(aopnVar.g, Optional.empty());
                    try {
                        Object obj3 = this.b;
                        long jY = taq.Y((vyo) obj3);
                        if (taq.az((vyo) obj3) && jY > 0 && skzVarB.A()) {
                            aixr aixrVar = aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE_PING;
                            agkeVar = agkeVar3;
                            arcgVar = arcgVar;
                            try {
                                agkeVarQ = agke.q(new slj(((xsc) obj).Z(aixrVar), aixrVar, false, skzVarB.o, new snh(jY, 9223372036854775806L), true, false));
                            } catch (sav e) {
                                e = e;
                                rmp.n(null, "Failed to create a client trigger. ".concat(String.valueOf(e.getMessage())));
                                agkeVar2 = agkeVar;
                            }
                        } else {
                            arcgVar = arcgVar;
                            agkeVarQ = agkeVar3;
                        }
                        agkeVar2 = agkeVarQ;
                    } catch (sav e2) {
                        e = e2;
                        agkeVar = agkeVar3;
                        arcgVar = arcgVar;
                    }
                } catch (sav e3) {
                    e = e3;
                    agkeVar = agkeVar3;
                    arcgVar = arcgVar;
                    agkeVarC3 = agkeVar;
                }
            } catch (sav e4) {
                e = e4;
                agkeVar = agkeVar3;
                agkeVarC2 = agkeVar;
                agkeVarC3 = agkeVarC2;
                rmp.n(null, "Failed to create a client trigger. ".concat(String.valueOf(e.getMessage())));
                agkeVar2 = agkeVar;
                agke agkeVar4 = agkeVarC;
                agke agkeVar5 = agkeVarC2;
                agke agkeVar6 = agkeVarC3;
                sgn sgnVarZ = z(skzVarB);
                smlVarB = nrl.b(skzVarB);
                arrayList = new ArrayList();
                arrayList.add(new sjb(skzVarB));
                arrayList.add(new shn(sgnVarZ));
                arrayList.add(new sik(Long.valueOf(skzVarB.p)));
                arrayList.add(new sib(str2));
                arrayList.add(new six(false));
                if (A(wjfVar, optional, str2).isEmpty()) {
                    vyoVar = (vyo) this.b;
                    if (nrj.k(aopnVar, vyoVar)) {
                        smlVar = smlVarB;
                        str = str2;
                        arrayList2 = arrayList;
                    } else {
                        smlVar = smlVarB;
                        str = str2;
                        arrayList2 = arrayList;
                    }
                } else {
                    smlVar = smlVarB;
                    str = str2;
                    arrayList2 = arrayList;
                }
                skn sknVarA = sko.a();
                sknVarA.l(str);
                aiucVar = aopnVar.c;
                if (aiucVar == null) {
                    aiucVar = aiuc.a;
                }
                aixgVarA = aixg.a(aiucVar.d);
                if (aixgVarA == null) {
                    aixgVarA = aixg.LAYOUT_TYPE_UNSPECIFIED;
                }
                sknVarA.a = aixgVarA;
                sknVarA.m(1);
                sknVarA.g(agkeVar4);
                agjz agjzVar = new agjz(4);
                agjzVar.j(agkeVar5);
                agjzVar.j(agkeVar2);
                sknVarA.i(agjzVar.g());
                sknVarA.e(agkeVar6);
                sknVarA.b = ((tld) this.g).c(skzVarB, str);
                aiucVar2 = aopnVar.c;
                if (aiucVar2 == null) {
                    aiucVar2 = aiuc.a;
                }
                aiuaVar = aiucVar2.e;
                if (aiuaVar == null) {
                    aiuaVar = aiua.a;
                }
                sknVarA.b(aiuaVar);
                sknVarA.c = shh.a(arrayList2);
                sknVarA.n(smlVar);
                return sknVarA.a();
            }
        } catch (sav e5) {
            e = e5;
            agkeVar = agkeVar3;
            agkeVarC = agkeVar;
            agkeVarC2 = agkeVarC;
        }
        agke agkeVar7 = agkeVarC;
        agke agkeVar8 = agkeVarC2;
        agke agkeVar9 = agkeVarC3;
        sgn sgnVarZ2 = z(skzVarB);
        smlVarB = nrl.b(skzVarB);
        arrayList = new ArrayList();
        arrayList.add(new sjb(skzVarB));
        arrayList.add(new shn(sgnVarZ2));
        arrayList.add(new sik(Long.valueOf(skzVarB.p)));
        arrayList.add(new sib(str2));
        arrayList.add(new six(false));
        if (A(wjfVar, optional, str2).isEmpty()) {
            vyoVar = (vyo) this.b;
            if (nrj.k(aopnVar, vyoVar) || (optional.isPresent() && nrj.j((wgk) optional.get(), vyoVar))) {
                smlVar = smlVarB;
                str = str2;
                arrayList2 = arrayList;
            } else {
                Object obj4 = this.h;
                List listB = B(wjfVar, optional);
                wjf wjfVar2 = skzVarB.c;
                str = str2;
                smlVar = smlVarB;
                arrayList2 = arrayList;
                arrayList2.add(new sjd(((sdo) obj4).c(listB, arcgVar, wjfVar, wjfVar2, str, strY, strY2, 0)));
            }
        } else {
            smlVar = smlVarB;
            str = str2;
            arrayList2 = arrayList;
        }
        skn sknVarA2 = sko.a();
        sknVarA2.l(str);
        aiucVar = aopnVar.c;
        if (aiucVar == null) {
            aiucVar = aiuc.a;
        }
        aixgVarA = aixg.a(aiucVar.d);
        if (aixgVarA == null) {
            aixgVarA = aixg.LAYOUT_TYPE_UNSPECIFIED;
        }
        sknVarA2.a = aixgVarA;
        sknVarA2.m(1);
        sknVarA2.g(agkeVar7);
        agjz agjzVar2 = new agjz(4);
        agjzVar2.j(agkeVar8);
        agjzVar2.j(agkeVar2);
        sknVarA2.i(agjzVar2.g());
        sknVarA2.e(agkeVar9);
        sknVarA2.b = ((tld) this.g).c(skzVarB, str);
        aiucVar2 = aopnVar.c;
        if (aiucVar2 == null) {
            aiucVar2 = aiuc.a;
        }
        aiuaVar = aiucVar2.e;
        if (aiuaVar == null) {
            aiuaVar = aiua.a;
        }
        sknVarA2.b(aiuaVar);
        sknVarA2.c = shh.a(arrayList2);
        sknVarA2.n(smlVar);
        return sknVarA2.a();
    }

    public final amco i(snk snkVar, aivt aivtVar, aiuc aiucVar) {
        aivs aivsVar = aivtVar.c;
        if (aivsVar == null) {
            aivsVar = aivs.a;
        }
        String str = aivsVar.c;
        aivs aivsVar2 = aivtVar.c;
        if (aivsVar2 == null) {
            aivsVar2 = aivs.a;
        }
        aixo aixoVarA = aixo.a(aivsVar2.d);
        if (aixoVarA == null) {
            aixoVarA = aixo.SLOT_TYPE_UNSPECIFIED;
        }
        aixo aixoVar = aixoVarA;
        agke agkeVarQ = agke.q(snkVar);
        aivs aivsVar3 = aivtVar.c;
        if (aivsVar3 == null) {
            aivsVar3 = aivs.a;
        }
        int i = aivsVar3.e;
        String str2 = aiucVar.c;
        aixg aixgVarA = aixg.a(aiucVar.d);
        if (aixgVarA == null) {
            aixgVarA = aixg.LAYOUT_TYPE_UNSPECIFIED;
        }
        aixg aixgVar = aixgVarA;
        aiua aiuaVar = aiucVar.e;
        if (aiuaVar == null) {
            aiuaVar = aiua.a;
        }
        return ((vwt) this.a).aj(str, aixoVar, agkeVarQ, i, str2, aixgVar, aiuaVar);
    }

    public final List j(skl sklVar, List list, List list2, String str) {
        char c;
        char c2;
        char c3;
        int i;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int iA = 0;
        int i2 = 0;
        boolean z = false;
        while (true) {
            c = 1;
            if (!it.hasNext()) {
                break;
            }
            smc smcVar = (smc) it.next();
            if (smcVar instanceof skz) {
                i2++;
                iA += ((skz) smcVar).a() * 1000;
                if (i2 == 1 && !smcVar.A()) {
                    z = true;
                }
            }
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < list.size()) {
            smc smcVar2 = (smc) list.get(i3);
            if (smcVar2 instanceof sgo) {
                skn sknVarA = sko.a();
                c2 = c;
                sknVarA.l((String) list2.get(i3));
                sknVarA.a = aixg.LAYOUT_TYPE_MEDIA;
                sknVarA.m(2);
                sht[] shtVarArr = new sht[4];
                shtVarArr[0] = new sjb((sgo) smcVar2);
                shtVarArr[c2] = new shn(sgn.a);
                shtVarArr[2] = new sip(sklVar);
                shtVarArr[3] = new sib(str);
                sknVarA.c = shh.b(shtVarArr);
                aiua aiuaVarIL = smcVar2.iL();
                if (aiuaVarIL != null) {
                    sknVarA.b(aiuaVarIL);
                }
                arrayList.add(sknVarA.a());
            } else {
                c2 = c;
                if (smcVar2 instanceof slb) {
                    slb slbVar = (slb) smcVar2;
                    boolean z2 = smcVar2 instanceof skz;
                    sgn sgnVar = sgn.a;
                    if (z2) {
                        skz skzVar = (skz) smcVar2;
                        iA -= skzVar.a() * 1000;
                        int i5 = i4 + 1;
                        sgnVar = new sgn(i5, i2, iA, false, agev.h(skzVar.ax()), agev.h((aivw) skzVar.s().orElse(null)), agdf.a);
                        i4 = i5;
                        c3 = 4;
                        smcVar2 = smcVar2;
                        i = 2;
                    } else {
                        c3 = 4;
                        i = 2;
                        if (smcVar2 instanceof smk) {
                            agev agevVarH = agev.h(((smk) smcVar2).ax());
                            agdf agdfVar = agdf.a;
                            sgnVar = new sgn(0, 0, 0, false, agevVarH, agdfVar, agdfVar);
                        }
                    }
                    skn sknVarA2 = sko.a();
                    sknVarA2.l((String) list2.get(i3));
                    sknVarA2.a = aixg.LAYOUT_TYPE_MEDIA;
                    sknVarA2.m(i);
                    char c4 = c3;
                    sknVarA2.b = ((tld) this.g).c(slbVar, (String) list2.get(i3));
                    sht[] shtVarArr2 = new sht[6];
                    shtVarArr2[0] = new sjb(slbVar);
                    shtVarArr2[c2] = new shn(sgnVar);
                    shtVarArr2[i] = new sip(sklVar);
                    shtVarArr2[3] = new sib(str);
                    int i6 = iA;
                    shtVarArr2[c4] = new sik(Long.valueOf(smcVar2.p));
                    shtVarArr2[5] = new six(z);
                    sknVarA2.c = shh.b(shtVarArr2);
                    aiua aiuaVarIL2 = smcVar2.iL();
                    if (aiuaVarIL2 != null) {
                        sknVarA2.b(aiuaVarIL2);
                    }
                    arrayList.add(sknVarA2.a());
                    iA = i6;
                } else {
                    if (!(smcVar2 instanceof slc)) {
                        throw new IllegalStateException("Unexpected playerAd type: ".concat(String.valueOf(String.valueOf(smcVar2))));
                    }
                    skn sknVarA3 = sko.a();
                    sknVarA3.l((String) list2.get(i3));
                    sknVarA3.a = aixg.LAYOUT_TYPE_MEDIA_BREAK;
                    sknVarA3.m(2);
                    sht[] shtVarArr3 = new sht[4];
                    shtVarArr3[0] = new sjc((slc) smcVar2);
                    shtVarArr3[c2] = new shn(sgn.a);
                    shtVarArr3[2] = new sip(sklVar);
                    shtVarArr3[3] = new sik(Long.valueOf(smcVar2.p));
                    sknVarA3.c = shh.b(shtVarArr3);
                    aiua aiuaVarIL3 = smcVar2.iL();
                    if (aiuaVarIL3 != null) {
                        sknVarA3.b(aiuaVarIL3);
                    }
                    arrayList.add(sknVarA3.a());
                }
            }
            i3++;
            c = c2;
        }
        return arrayList;
    }

    public final List k(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            akuf akufVar = (akuf) it.next();
            String strT = t(akufVar);
            if (TextUtils.isEmpty(strT)) {
                rmp.n(null, "Missing panel ID for ads engagement panel. Slot id: ".concat(String.valueOf(str)));
            } else {
                if (taq.aw((vyo) this.b)) {
                    if (((akufVar.b == 138681066 ? (akuj) akufVar.c : akuj.b).c & 67108864) == 0) {
                    }
                }
                arrayList.add(strT);
            }
        }
        return arrayList;
    }

    public final sko m(smr smrVar, String str, skm skmVar, akck akckVar, wjf wjfVar, String str2, sgn sgnVar) {
        aiua aiuaVar;
        if ((akckVar.b & SemanticState.LiveRegion) != 0) {
            ajlh ajlhVar = akckVar.f;
            if (ajlhVar == null) {
                ajlhVar = ajlh.a;
            }
            Object obj = this.a;
            aiuc aiucVar = ajlhVar.b;
            if (aiucVar == null) {
                aiucVar = aiuc.a;
            }
            String str3 = aiucVar.c;
            aiuc aiucVar2 = ajlhVar.b;
            aixg aixgVarA = aixg.a((aiucVar2 == null ? aiuc.a : aiucVar2).d);
            if (aixgVarA == null) {
                aixgVarA = aixg.LAYOUT_TYPE_UNSPECIFIED;
            }
            if (aiucVar2 == null) {
                aiucVar2 = aiuc.a;
            }
            aiua aiuaVar2 = aiucVar2.e;
            if (aiuaVar2 == null) {
                aiuaVar2 = aiua.a;
            }
            amco amcoVarAi = ((vwt) obj).ai(smrVar, str3, aixgVarA, aiuaVar2);
            aiuc aiucVar3 = ajlhVar.b;
            if (aiucVar3 == null) {
                aiucVar3 = aiuc.a;
            }
            agke agkeVarY = y(aiucVar3.c, str2, str, skmVar, sgnVar);
            ajlh ajlhVar2 = ajlhVar;
            agke agkeVar = agpi.a;
            return s(ajlhVar2, skmVar, wjfVar, agkeVarY, agkeVar, agkeVar, amcoVarAi);
        }
        if (taq.aD((vyo) this.b)) {
            rmp.n(smrVar, "belowPlayerAdLayoutRenderer field is missing from the companion ad.");
        }
        if ((akckVar.b & SemanticState.Hidden) != 0) {
            aiub aiubVar = akckVar.e;
            if (aiubVar == null) {
                aiubVar = aiub.a;
            }
            aiuaVar = aiubVar.b;
            if (aiuaVar == null) {
                aiuaVar = aiua.a;
            }
        } else {
            aiuaVar = null;
        }
        Object obj2 = this.f;
        String str4 = smrVar.a;
        aixg aixgVar = aixg.LAYOUT_TYPE_COMPANION;
        String strX = ((xsc) obj2).X(aixgVar, str4);
        amco amcoVarAi2 = ((vwt) this.a).ai(smrVar, strX, aixgVar, aiuaVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new siq(skmVar));
        arrayList.add(new sid(wjfVar));
        arrayList.add(new sia(akckVar));
        skn sknVarA = sko.a();
        sknVarA.l(strX);
        sknVarA.a = aixgVar;
        sknVarA.m(1);
        sknVarA.g(y(strX, str2, str, skmVar, sgnVar));
        sknVarA.c(amcoVarAi2);
        sknVarA.c = shh.a(arrayList);
        if (aiuaVar != null) {
            sknVarA.b(aiuaVar);
        }
        return sknVarA.a();
    }

    @Deprecated
    public final sko n(smr smrVar, String str, skm skmVar, ajlj ajljVar) {
        aixg aixgVarA;
        String strX;
        aiuc aiucVar = ajljVar.c;
        if (aiucVar == null) {
            aiucVar = aiuc.a;
        }
        int i = aiucVar.b;
        if ((i & 2) != 0) {
            aixgVarA = aixg.a(aiucVar.d);
            if (aixgVarA == null) {
                aixgVarA = aixg.LAYOUT_TYPE_UNSPECIFIED;
            }
        } else {
            aixgVarA = aixg.LAYOUT_TYPE_PANEL;
        }
        aixg aixgVar = aixgVarA;
        if ((i & 1) != 0) {
            strX = aiucVar.c;
        } else {
            strX = ((xsc) this.f).X(aixgVar, smrVar.a);
        }
        String str2 = strX;
        aiuc aiucVar2 = ajljVar.c;
        if (aiucVar2 == null) {
            aiucVar2 = aiuc.a;
        }
        aiua aiuaVar = aiucVar2.e;
        if (aiuaVar == null) {
            aiuaVar = aiua.a;
        }
        agev agevVarI = agev.i(aiuaVar);
        apji apjiVar = ajljVar.d;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aitn.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        return o(smrVar, str2, aixgVar, agevVarI, str, skmVar, ((aitm) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c);
    }

    public final sko o(smr smrVar, String str, aixg aixgVar, agev agevVar, String str2, skm skmVar, List list) {
        if (list.size() == 0) {
            return null;
        }
        List listK = k(list, smrVar.a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new shr(list));
        arrayList.add(new sin(listK));
        agjz agjzVar = new agjz(4);
        Object obj = this.f;
        aixr aixrVar = aixr.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED;
        xsc xscVar = (xsc) obj;
        agjzVar.h(new sln(xscVar.Z(aixrVar), aixrVar, false, str2, aixo.SLOT_TYPE_PLAYER_BYTES, aixg.LAYOUT_TYPE_MEDIA));
        if (skmVar instanceof skm) {
            smc smcVar = skmVar.a;
            if (smcVar instanceof skz) {
                skz skzVar = (skz) smcVar;
                if (skzVar.C() || skzVar.D()) {
                    aixr aixrVar2 = aixr.TRIGGER_TYPE_SURVEY_SUBMITTED;
                    agjzVar.h(new sne(xscVar.Z(aixrVar2), aixrVar2, false, str));
                }
                if (skzVar.D()) {
                    aixr aixrVar3 = aixr.TRIGGER_TYPE_SURVEY_DISMISSED;
                    agjzVar.h(new snb(xscVar.Z(aixrVar3), aixrVar3, false, str));
                }
            }
        }
        amco amcoVarAi = ((vwt) this.a).ai(smrVar, str, aixgVar, (aiua) agevVar.f());
        skn sknVarA = sko.a();
        sknVarA.l(str);
        sknVarA.a = aixgVar;
        sknVarA.m(1);
        sknVarA.g(agjzVar.g());
        sknVarA.c(amcoVarAi);
        sknVarA.c = shh.a(arrayList);
        if (agevVar.g()) {
            sknVarA.b((aiua) agevVar.c());
        }
        return sknVarA.a();
    }

    @Deprecated
    public final sko p(smr smrVar, String str, skm skmVar, ajlj ajljVar, ajwo ajwoVar, Map map, String str2, sgn sgnVar) {
        aiuc aiucVar = ajljVar.c;
        if (aiucVar == null) {
            aiucVar = aiuc.a;
        }
        String str3 = aiucVar.c;
        aiuc aiucVar2 = ajljVar.c;
        aixg aixgVarA = aixg.a((aiucVar2 == null ? aiuc.a : aiucVar2).d);
        if (aixgVarA == null) {
            aixgVarA = aixg.LAYOUT_TYPE_UNSPECIFIED;
        }
        if (aiucVar2 == null) {
            aiucVar2 = aiuc.a;
        }
        aiua aiuaVar = aiucVar2.e;
        if (aiuaVar == null) {
            aiuaVar = aiua.a;
        }
        agev agevVarI = agev.i(aiuaVar);
        apji apjiVar = ajljVar.d;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aitn.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        return x(smrVar, str3, aixgVarA, agevVarI, str, skmVar, ((aitm) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c, ajwoVar, map, str2, sgnVar);
    }

    @Deprecated
    public final sko q(smr smrVar, String str, skm skmVar, List list, ajwo ajwoVar, Map map, String str2, sgn sgnVar) {
        if (taq.aD((vyo) this.b)) {
            rmp.n(smrVar, "adEngagementPanels field from WN response is still in use.");
        }
        aiua aiuaVarIL = null;
        if (skmVar instanceof skm) {
            smc smcVar = skmVar.a;
            if (smcVar instanceof skz) {
                aiuaVarIL = ((skz) smcVar).iL();
            }
        }
        Object obj = this.f;
        String str3 = smrVar.a;
        aiua aiuaVar = aiuaVarIL;
        aixg aixgVar = aixg.LAYOUT_TYPE_IMMERSIVE;
        return x(smrVar, ((xsc) obj).X(aixgVar, str3), aixgVar, agev.h(aiuaVar), str, skmVar, list, ajwoVar, map, str2, sgnVar);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, rmu] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, rmw] */
    /* JADX WARN: Type inference failed for: r8v0, types: [awmd, java.lang.Object] */
    public final rlx u() {
        Object obj = this.a;
        ?? r8 = this.b;
        tbt tbtVar = (tbt) obj;
        rqa rqaVar = (rqa) this.h;
        omj omjVar = (omj) this.g;
        return new rlx(this.c, this.f, (rly) this.d, (rre) this.i, omjVar, rqaVar, r8, tbtVar, this.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [awmd, java.lang.Object] */
    public final jce v(View view) {
        jgc jgcVar = (jgc) this.a.io();
        abzo abzoVar = (abzo) this.f.io();
        jgc jgcVar2 = (jgc) this.i.io();
        aczl aczlVar = (aczl) this.e.io();
        abzi abziVar = (abzi) this.g.io();
        xsc xscVar = (xsc) this.b.io();
        kyr kyrVar = (kyr) this.h.io();
        xsc xscVar2 = (xsc) this.d.io();
        aehs aehsVar = (aehs) this.c.io();
        view.getClass();
        return new jce(jgcVar, abzoVar, jgcVar2, aczlVar, abziVar, xscVar, kyrVar, xscVar2, aehsVar, view);
    }

    public aehs(rnj rnjVar, tld tldVar, xsc xscVar, vwt vwtVar, rmp rmpVar, nrj nrjVar, sdo sdoVar, vyo vyoVar, ayq ayqVar) {
        this.d = rnjVar;
        this.g = tldVar;
        this.f = xscVar;
        this.a = vwtVar;
        this.e = rmpVar;
        this.i = nrjVar;
        this.h = sdoVar;
        this.b = vyoVar;
        this.c = ayqVar;
    }

    public aehs(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        awmdVar.getClass();
        this.i = awmdVar;
        this.g = awmdVar2;
        this.a = awmdVar3;
        this.d = awmdVar4;
        this.h = awmdVar5;
        this.c = awmdVar6;
        this.f = awmdVar7;
        this.b = awmdVar8;
        awmdVar9.getClass();
        this.e = awmdVar9;
    }

    public aehs(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, byte[] bArr, char[] cArr) {
        this.a = awmdVar;
        this.f = awmdVar2;
        this.i = awmdVar3;
        this.e = awmdVar4;
        this.g = awmdVar5;
        this.b = awmdVar6;
        this.h = awmdVar7;
        this.d = awmdVar8;
        this.c = awmdVar9;
    }

    public aehs(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, char[] cArr, byte[] bArr) {
        awmdVar.getClass();
        this.e = awmdVar;
        this.f = awmdVar2;
        this.d = awmdVar3;
        this.b = awmdVar4;
        this.g = awmdVar5;
        this.h = awmdVar6;
        awmdVar7.getClass();
        this.i = awmdVar7;
        awmdVar8.getClass();
        this.a = awmdVar8;
        awmdVar9.getClass();
        this.c = awmdVar9;
    }

    public aehs(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.e = awmdVar;
        this.d = awmdVar2;
        awmdVar3.getClass();
        this.g = awmdVar3;
        awmdVar4.getClass();
        this.a = awmdVar4;
        awmdVar5.getClass();
        this.b = awmdVar5;
        awmdVar6.getClass();
        this.h = awmdVar6;
        awmdVar7.getClass();
        this.f = awmdVar7;
        this.c = awmdVar8;
        this.i = awmdVar9;
    }

    public aehs(rmu rmuVar, rmw rmwVar, rly rlyVar, rre rreVar, omj omjVar, rqa rqaVar, awmd awmdVar, tbt tbtVar, aunn aunnVar) {
        rmuVar.getClass();
        this.c = rmuVar;
        rmwVar.getClass();
        this.f = rmwVar;
        rlyVar.getClass();
        this.d = rlyVar;
        rreVar.getClass();
        this.i = rreVar;
        omjVar.getClass();
        this.g = omjVar;
        rqaVar.getClass();
        this.h = rqaVar;
        this.b = awmdVar;
        tbtVar.getClass();
        this.a = tbtVar;
        aunnVar.getClass();
        this.e = aunnVar;
    }

    public aehs(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, char[] cArr) {
        awmdVar.getClass();
        this.e = awmdVar;
        awmdVar2.getClass();
        this.h = awmdVar2;
        awmdVar3.getClass();
        this.i = awmdVar3;
        awmdVar4.getClass();
        this.a = awmdVar4;
        awmdVar5.getClass();
        this.d = awmdVar5;
        this.c = awmdVar6;
        this.g = awmdVar7;
        awmdVar8.getClass();
        this.b = awmdVar8;
        awmdVar9.getClass();
        this.f = awmdVar9;
    }

    public aehs(mbc mbcVar, aauk aaukVar, awmd awmdVar, wco wcoVar, awmd awmdVar2, zwb zwbVar, awmd awmdVar3, aaul aaulVar, tqj tqjVar) {
        this.a = mbcVar;
        this.f = aaukVar;
        this.g = awmdVar;
        this.c = wcoVar;
        this.h = awmdVar2;
        this.b = zwbVar;
        this.i = awmdVar3;
        this.d = aaulVar;
        this.e = tqjVar;
        aaukVar.M();
    }

    public aehs(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, byte[] bArr) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.e = awmdVar2;
        this.d = awmdVar3;
        awmdVar4.getClass();
        this.b = awmdVar4;
        this.c = awmdVar5;
        this.f = awmdVar6;
        this.g = awmdVar7;
        awmdVar8.getClass();
        this.h = awmdVar8;
        awmdVar9.getClass();
        this.i = awmdVar9;
    }

    public aehs(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9) {
        this.a = awmdVar;
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        this.g = awmdVar4;
        this.d = awmdVar5;
        this.h = awmdVar6;
        this.e = awmdVar7;
        this.f = awmdVar8;
        this.i = awmdVar9;
    }
}
