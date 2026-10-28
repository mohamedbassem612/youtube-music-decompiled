package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sdi {
    public static final /* synthetic */ int a = 0;
    private static final agke b = agke.q(aixo.SLOT_TYPE_PLAYER_BYTES);

    public static boolean a(wjf wjfVar) {
        if (wjfVar.R()) {
            return false;
        }
        if (!nre.g(wjfVar.u(), b).isPresent()) {
            aisu aisuVarM = wjfVar.m();
            if (aisuVarM == null || aisuVarM.e.size() == 0) {
                return false;
            }
            Iterator it = aisuVarM.e.iterator();
            while (it.hasNext()) {
                if ((((aisv) it.next()).b & 2) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean b(wjf wjfVar) {
        Optional optionalG = nre.g(wjfVar.u(), b);
        if (optionalG.isEmpty()) {
            return false;
        }
        aivt aivtVar = (aivt) optionalG.get();
        aivu aivuVar = aivtVar.e;
        if (aivuVar == null) {
            aivuVar = aivu.a;
        }
        apji apjiVar = aivuVar.b;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aopo.a);
        apjiVar.c(aihlVarCheckIsLite);
        if (!apjiVar.j.n(aihlVarCheckIsLite.d)) {
            return false;
        }
        aivu aivuVar2 = aivtVar.e;
        if (aivuVar2 == null) {
            aivuVar2 = aivu.a;
        }
        apji apjiVar2 = aivuVar2.b;
        if (apjiVar2 == null) {
            apjiVar2 = apji.a;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aopo.a);
        apjiVar2.c(aihlVarCheckIsLite2);
        Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
        aiuc aiucVar = ((aopn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c;
        if (aiucVar == null) {
            aiucVar = aiuc.a;
        }
        aixg aixgVarA = aixg.a(aiucVar.d);
        if (aixgVarA == null) {
            aixgVarA = aixg.LAYOUT_TYPE_UNSPECIFIED;
        }
        return aixgVarA == aixg.LAYOUT_TYPE_MEDIA;
    }

    public static boolean c(vyo vyoVar, slm slmVar, wjf wjfVar) {
        return d(vyoVar, wjfVar) && slm.PRE_ROLL.equals(slmVar);
    }

    public static boolean d(vyo vyoVar, wjf wjfVar) {
        return (!taq.am(vyoVar) || wjfVar.V() || wjfVar.P()) ? false : true;
    }

    public static boolean e(wjf wjfVar) {
        ainq ainqVarH;
        return wjfVar.k().e("PREROLL_SHOWN") || ((ainqVarH = wjh.h(wjfVar.k().d)) != null && ainqVarH.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v4, types: [skh] */
    /* JADX WARN: Type inference failed for: r20v6, types: [skh] */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2, types: [skh] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v5, types: [skh] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static void f(rug rugVar, smr smrVar, String str, wjf wjfVar, long j, List list, boolean z, slm slmVar, spv spvVar, vyo vyoVar) throws Throwable {
        List<sko> list2;
        sko skoVar;
        String str2;
        ?? IsEmpty;
        ?? r23;
        sko skoVar2;
        auzk auzkVar;
        vyo vyoVar2;
        long j2;
        int iBv;
        boolean zAl = taq.al(vyoVar);
        auzk auzkVar2 = null;
        if (list.isEmpty()) {
            list2 = list;
            skoVar = null;
        } else {
            list2 = list;
            skoVar = (sko) list2.get(0);
        }
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                str2 = null;
                break;
            }
            sko skoVar3 = (sko) it.next();
            if (skoVar3 != null) {
                if (skoVar3.e(sjb.class)) {
                    str2 = ((slb) skoVar3.d(sjb.class)).o;
                    break;
                }
                slc slcVarG = g(skoVar3);
                if (slcVarG != null) {
                    str2 = slcVarG.o;
                    break;
                }
            }
        }
        skh skhVarB = skh.b(str, wjfVar, ahno.Z(str2));
        try {
            agjz agjzVar = new agjz(4);
            for (sko skoVar4 : list2) {
                if (skoVar4.e(sjb.class)) {
                    slb slbVar = (slb) skoVar4.d(sjb.class);
                    agjzVar.h(new abic(slbVar.c(), slbVar.o));
                } else {
                    slc slcVarG2 = g(skoVar4);
                    if (slcVarG2 != null) {
                        agjzVar.h(new abic(null, slcVarG2.o));
                    }
                }
            }
            IsEmpty = TextUtils.isEmpty(str2);
            try {
                try {
                    if (IsEmpty != 0) {
                        aihf aihfVarCreateBuilder = aosi.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        aosi aosiVar = (aosi) aihfVarCreateBuilder.instance;
                        aosiVar.c = acfz.bu(104);
                        aosiVar.b |= 1;
                        aihfVarCreateBuilder.copyOnWrite();
                        aosi aosiVar2 = (aosi) aihfVarCreateBuilder.instance;
                        aosiVar2.b |= 2;
                        aosiVar2.d = "AdCpn is null or empty for CISA scheduling";
                        aajc.i((aosi) aihfVarCreateBuilder.build());
                        throw new sas("AdCpn is null or empty for CISA scheduling", 52);
                    }
                    agqs agqsVarListIterator = smrVar.d.listIterator(0);
                    while (true) {
                        if (!agqsVarListIterator.hasNext()) {
                            vyoVar2 = vyoVar;
                            j2 = j;
                            break;
                        }
                        snk snkVar = (snk) agqsVarListIterator.next();
                        if (snkVar instanceof slk) {
                            slk slkVar = (slk) snkVar;
                            vyoVar2 = vyoVar;
                            if (nrj.i(smrVar, vyoVar2)) {
                                j2 = slkVar.b.a;
                                break;
                            } else {
                                j2 = slkVar.b.b;
                                break;
                            }
                        }
                    }
                    aihf aihfVarCreateBuilder2 = aosh.a.createBuilder();
                    aihf aihfVarCreateBuilder3 = aosg.a.createBuilder();
                    aihfVarCreateBuilder3.copyOnWrite();
                    aosg aosgVar = (aosg) aihfVarCreateBuilder3.instance;
                    aosgVar.b |= 1;
                    aosgVar.c = j;
                    aihfVarCreateBuilder3.copyOnWrite();
                    aosg aosgVar2 = (aosg) aihfVarCreateBuilder3.instance;
                    aosgVar2.b |= 2;
                    aosgVar2.d = j2;
                    aihfVarCreateBuilder2.copyOnWrite();
                    aosh aoshVar = (aosh) aihfVarCreateBuilder2.instance;
                    aosg aosgVar3 = (aosg) aihfVarCreateBuilder3.build();
                    aosgVar3.getClass();
                    aoshVar.d = aosgVar3;
                    aoshVar.b |= 2;
                    aihfVarCreateBuilder2.copyOnWrite();
                    aosh aoshVar2 = (aosh) aihfVarCreateBuilder2.instance;
                    aoshVar2.b |= 1;
                    aoshVar2.c = 0L;
                    wjj wjjVar = new wjj((aosh) aihfVarCreateBuilder2.build(), z);
                    if (zAl) {
                        skh skhVar = skhVarB;
                        nrk.b(spvVar, smrVar, skhVar, aixn.RENDERING_EVENT_TYPE_PHASE_AD_PLAYBACK_SCHEDULING_EVENTS, aixk.PHASE_AD_PLAYBACK_SCHEDULING_EVENT_READY_TO_SCHEDULE, skoVar);
                        IsEmpty = skhVar;
                    } else {
                        IsEmpty = skhVarB;
                    }
                    try {
                        auzk auzkVarS = rugVar.s(agjzVar.g(), wjjVar, str, slmVar);
                        try {
                            ?? r3 = IsEmpty;
                            if (auzkVarS.a) {
                                if (zAl) {
                                    ?? r20 = IsEmpty;
                                    sko skoVar5 = skoVar;
                                    try {
                                        nrk.b(spvVar, smrVar, r20, aixn.RENDERING_EVENT_TYPE_PHASE_AD_PLAYBACK_SCHEDULING_EVENTS, aixk.PHASE_AD_PLAYBACK_SCHEDULING_EVENT_SUCCESS, skoVar5);
                                        r3 = r20;
                                        skoVar = skoVar5;
                                    } catch (Throwable th) {
                                        th = th;
                                        IsEmpty = r20;
                                        skoVar = skoVar5;
                                    }
                                }
                                h(smrVar, auzkVarS, spvVar, vyoVar2, skoVar, r3);
                                return;
                            }
                            auzkVar2 = auzkVarS;
                            if (zAl) {
                                Object obj = auzkVar2.b;
                                if (obj != null) {
                                    iBv = acfz.bv(((aosi) obj).c);
                                    if (iBv == 0) {
                                        iBv = 1;
                                    }
                                } else {
                                    iBv = 0;
                                }
                                ?? r21 = IsEmpty;
                                sko skoVar6 = skoVar;
                                try {
                                    nrk.c(spvVar, smrVar, r21, aixn.RENDERING_EVENT_TYPE_PHASE_AD_PLAYBACK_SCHEDULING_EVENTS, aixk.PHASE_AD_PLAYBACK_SCHEDULING_EVENT_FAILED, skoVar6, iBv);
                                } catch (Throwable th2) {
                                    th = th2;
                                    IsEmpty = r21;
                                    skoVar = skoVar6;
                                }
                            }
                            throw new sas("Failed to schedule layout with unified scheduling api", 46);
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        auzkVar2 = auzkVarS;
                    } catch (RuntimeException e) {
                        aihf aihfVarCreateBuilder4 = aosi.a.createBuilder();
                        String str3 = "Unexpected exception during queuing: " + e.getMessage();
                        aihfVarCreateBuilder4.copyOnWrite();
                        aosi aosiVar3 = (aosi) aihfVarCreateBuilder4.instance;
                        aosiVar3.b |= 2;
                        aosiVar3.d = str3;
                        aajc.i((aosi) aihfVarCreateBuilder4.build());
                        throw new sas("Unexpected exception during queuing: " + e.getMessage(), e);
                    }
                    r23 = IsEmpty;
                    skoVar2 = skoVar;
                    auzkVar = auzkVar2;
                    h(smrVar, auzkVar, spvVar, vyoVar, skoVar2, r23);
                    throw th;
                } catch (Throwable th4) {
                    th = th4;
                    r23 = IsEmpty;
                    skoVar2 = skoVar;
                    auzkVar = null;
                    h(smrVar, auzkVar, spvVar, vyoVar, skoVar2, r23);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            IsEmpty = skhVarB;
        }
    }

    private static slc g(sko skoVar) {
        if (skoVar.e(sje.class)) {
            return (slc) skoVar.d(sje.class);
        }
        if (skoVar.e(sjc.class)) {
            return (slc) skoVar.d(sjc.class);
        }
        return null;
    }

    private static void h(smr smrVar, auzk auzkVar, spv spvVar, vyo vyoVar, sko skoVar, skh skhVar) {
        aqi aqiVar;
        int i;
        if (!smrVar.e(sjg.class) || (aqiVar = (aqi) smrVar.d(sjg.class)) == null) {
            return;
        }
        boolean z = auzkVar != null && auzkVar.a;
        Object obj = null;
        if (z) {
            aqiVar.b(null);
        } else {
            Object obj2 = auzkVar != null ? auzkVar.b : null;
            aqiVar.d(new IllegalStateException("Ad scheduling failed: ".concat(String.valueOf(obj2 != null ? ((aosi) obj2).d : "unknown"))));
        }
        if (taq.al(vyoVar)) {
            aixk aixkVar = z ? aixk.PHASE_AD_PLAYBACK_SCHEDULING_EVENT_PLAYBACK_DEFERRAL_HANDLE_COMPLETED_WITH_SUCCESS : aixk.PHASE_AD_PLAYBACK_SCHEDULING_EVENT_PLAYBACK_DEFERRAL_HANDLE_COMPLETED_WITH_SCHEDULING_FAILURE;
            if (!z && auzkVar != null) {
                obj = auzkVar.b;
            }
            if (obj != null) {
                int iBv = acfz.bv(((aosi) obj).c);
                i = iBv == 0 ? 1 : iBv;
            } else {
                i = 0;
            }
            nrk.c(spvVar, smrVar, skhVar, aixn.RENDERING_EVENT_TYPE_PHASE_AD_PLAYBACK_SCHEDULING_EVENTS, aixkVar, skoVar, i);
        }
    }
}
