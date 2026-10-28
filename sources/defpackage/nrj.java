package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nrj {
    public static axgy a(axgy axgyVar, long j) {
        aihf builder = axgyVar.toBuilder();
        axgy axgyVar2 = (axgy) builder.instance;
        if ((axgyVar2.b & 2) != 0) {
            long j2 = axgyVar2.d - j;
            builder.copyOnWrite();
            axgy axgyVar3 = (axgy) builder.instance;
            axgyVar3.b |= 2;
            axgyVar3.d = j2;
        }
        axgy axgyVar4 = (axgy) builder.instance;
        if ((axgyVar4.b & 4) != 0) {
            long j3 = axgyVar4.e - j;
            builder.copyOnWrite();
            axgy axgyVar5 = (axgy) builder.instance;
            axgyVar5.b |= 4;
            axgyVar5.e = j3;
        }
        axgy axgyVar6 = (axgy) builder.instance;
        if ((axgyVar6.b & 8) != 0) {
            long j4 = axgyVar6.f - j;
            builder.copyOnWrite();
            axgy axgyVar7 = (axgy) builder.instance;
            axgyVar7.b |= 8;
            axgyVar7.f = j4;
        }
        return (axgy) builder.build();
    }

    public static final snk b(aizs aizsVar, Optional optional) {
        snk skcVar;
        snk sheVar;
        String str;
        try {
            int i = aizsVar.b;
            int iAB = afxw.aB(i);
            int i2 = iAB - 1;
            if (iAB == 0) {
                throw null;
            }
            if (i2 == 36) {
                return new sky(aizsVar.d, aixr.TRIGGER_TYPE_LIVE_STREAM_BREAK_STARTED, aizsVar.f);
            }
            if (i2 == 37) {
                return new skx(aizsVar.d, aixr.TRIGGER_TYPE_LIVE_STREAM_BREAK_ENDED, aizsVar.f);
            }
            if (i2 == 42) {
                return new shf(aizsVar.d, aixr.TRIGGER_TYPE_BELOW_PLAYER_SPACE_TAKEN, aizsVar.f);
            }
            if (i2 == 43) {
                return new skk(aizsVar.d, aixr.TRIGGER_TYPE_IN_PLAYER_SPACE_TAKEN, aizsVar.f, (i == 54 ? (alkc) aizsVar.c : alkc.a).b);
            }
            if (i2 != 49) {
                switch (i2) {
                    case 0:
                        sheVar = new she(aizsVar.d, aixr.TRIGGER_TYPE_BEFORE_CONTENT_VIDEO_ID_STARTED, aizsVar.f, (String) optional.get());
                        return sheVar;
                    case 1:
                        Object obj = optional.get();
                        String str2 = aizsVar.d;
                        aixr aixrVar = aixr.TRIGGER_TYPE_CLOSE_REQUESTED;
                        boolean z = aizsVar.f;
                        String str3 = (aizsVar.b == 16 ? (ajvk) aizsVar.c : ajvk.a).b;
                        int i3 = aizsVar.b;
                        int iAS = a.aS((i3 == 16 ? (ajvk) aizsVar.c : ajvk.a).c);
                        int i4 = iAS == 0 ? 1 : iAS;
                        int iAS2 = a.aS((i3 == 16 ? (ajvk) aizsVar.c : ajvk.a).d);
                        int i5 = iAS2 == 0 ? 1 : iAS2;
                        int iAU = a.aU((i3 == 16 ? (ajvk) aizsVar.c : ajvk.a).e);
                        skcVar = new ska(str2, aixrVar, z, false, (String) obj, str3, i4, i5, iAU == 0 ? 1 : iAU);
                        break;
                    case 2:
                        sheVar = new skb(aizsVar.d, aixr.TRIGGER_TYPE_CONTENT_VIDEO_ID_ENDED, aizsVar.f, (String) optional.get(), (aizsVar.b == 24 ? (akee) aizsVar.c : akee.a).b);
                        return sheVar;
                    case 3:
                        String str4 = aizsVar.d;
                        aixr aixrVar2 = aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON;
                        boolean z2 = aizsVar.f;
                        String str5 = (i == 14 ? (amjz) aizsVar.c : amjz.a).b;
                        int iBg = a.bg((aizsVar.b == 14 ? (amjz) aizsVar.c : amjz.a).c);
                        skcVar = new skt(str4, aixrVar2, z2, str5, ahbo.c(yno.M(iBg != 0 ? iBg : 1)));
                        break;
                    case 4:
                        return new skv(aizsVar.d, aixr.TRIGGER_TYPE_LAYOUT_ID_ENTERED, aizsVar.f, (i == 18 ? (amka) aizsVar.c : amka.a).b);
                    case 5:
                        return new skw(aizsVar.d, aixr.TRIGGER_TYPE_LAYOUT_ID_EXITED, aizsVar.f, (i == 28 ? (amkb) aizsVar.c : amkb.a).b);
                    case 6:
                        sheVar = new sli(aizsVar.d, aixr.TRIGGER_TYPE_MEDIA_RESUMED, aizsVar.f, false, (String) optional.get());
                        return sheVar;
                    default:
                        switch (i2) {
                            case 8:
                                String str6 = aizsVar.d;
                                aixr aixrVar3 = aixr.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED;
                                boolean z3 = aizsVar.f;
                                String str7 = (i == 27 ? (aoil) aizsVar.c : aoil.a).b;
                                int i6 = aizsVar.b;
                                aixo aixoVarA = aixo.a((i6 == 27 ? (aoil) aizsVar.c : aoil.a).c);
                                if (aixoVarA == null) {
                                    aixoVarA = aixo.SLOT_TYPE_UNSPECIFIED;
                                }
                                aixg aixgVarA = aixg.a((i6 == 27 ? (aoil) aizsVar.c : aoil.a).d);
                                if (aixgVarA == null) {
                                    aixgVarA = aixg.LAYOUT_TYPE_UNSPECIFIED;
                                }
                                return new sln(str6, aixrVar3, z3, str7, aixoVarA, aixgVarA);
                            case 9:
                                return new slp(aizsVar.d, aixr.TRIGGER_TYPE_ENGAGEMENT_PANEL_CLOSE_REQUESTED, aizsVar.f, (i == 25 ? (aoin) aizsVar.c : aoin.a).b);
                            case 10:
                                return new slo(aizsVar.d, aixr.TRIGGER_TYPE_ENGAGEMENT_PANEL_AUTO_CLOSE, aizsVar.f, (i == 26 ? (aoim) aizsVar.c : aoim.a).b);
                            case 11:
                                return new slu(aizsVar.d, aixr.TRIGGER_TYPE_ON_NEXT_SLOT_ENTER_REQUESTED, aizsVar.f, agke.n(new aihx((i == 30 ? (aoiq) aizsVar.c : aoiq.b).c, aoiq.a)));
                            case 12:
                                return new slr(aizsVar.d, aixr.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED, aizsVar.f, (i == 5 ? (aoio) aizsVar.c : aoio.a).b);
                            case 13:
                                sheVar = new slt(aizsVar.d, aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID, aizsVar.f, (String) optional.get(), (aizsVar.b == 6 ? (aoip) aizsVar.c : aoip.a).b);
                                break;
                            case 14:
                                sheVar = new slw(aizsVar.d, aixr.TRIGGER_TYPE_ON_PLAYBACK_WITH_CONTENT_VIDEO_ID, aizsVar.f, (String) optional.get());
                                break;
                            default:
                                switch (i2) {
                                    case 17:
                                        sheVar = new slv(aizsVar.d, aixr.TRIGGER_TYPE_ON_PLAYBACK_DESTROYED, aizsVar.f, (String) optional.get());
                                        break;
                                    case 18:
                                        return new slx(aizsVar.d, aixr.TRIGGER_TYPE_ON_SLOT_CANCELLATION_REQUESTED, aizsVar.f, (i == 11 ? (aojj) aizsVar.c : aojj.a).b);
                                    case 19:
                                        return new smh(aizsVar.d, aixr.TRIGGER_TYPE_REEL_ITEM_SEQUENCE_ABANDONED, Optional.empty());
                                    default:
                                        switch (i2) {
                                            case 23:
                                                return new smp(aizsVar.d, aixr.TRIGGER_TYPE_SKIP_REQUESTED, aizsVar.f, (i == 7 ? (aqac) aizsVar.c : aqac.a).b);
                                            case 24:
                                                return new smv(aizsVar.d, aixr.TRIGGER_TYPE_SLOT_ID_EXITED, aizsVar.f, (i == 8 ? (aqao) aizsVar.c : aqao.a).b);
                                            case 25:
                                                return new smu(aizsVar.d, aixr.TRIGGER_TYPE_SLOT_ID_ENTERED, aizsVar.f, (i == 3 ? (aqan) aizsVar.c : aqan.a).b);
                                            case 26:
                                                return new smy(aizsVar.d, aixr.TRIGGER_TYPE_SLOT_ID_SCHEDULED, aizsVar.f, (i == 12 ? (aqaq) aizsVar.c : aqaq.a).b);
                                            case 27:
                                                return new snb(aizsVar.d, aixr.TRIGGER_TYPE_SURVEY_DISMISSED, aizsVar.f, (i == 13 ? (aqfz) aizsVar.c : aqfz.a).b);
                                            case 28:
                                                return new sne(aizsVar.d, aixr.TRIGGER_TYPE_SURVEY_SUBMITTED, aizsVar.f, (i == 9 ? (aqhh) aizsVar.c : aqhh.a).b);
                                            default:
                                                switch (afxw.aB(i)) {
                                                    case 1:
                                                        str = "BEFORE_CONTENT_VIDEO_ID_STARTED_TRIGGER";
                                                        break;
                                                    case 2:
                                                        str = "CLOSE_REQUESTED_TRIGGER";
                                                        break;
                                                    case 3:
                                                        str = "CONTENT_VIDEO_ID_ENDED_TRIGGER";
                                                        break;
                                                    case 4:
                                                        str = "LAYOUT_EXITED_FOR_REASON_TRIGGER";
                                                        break;
                                                    case 5:
                                                        str = "LAYOUT_ID_ENTERED_TRIGGER";
                                                        break;
                                                    case 6:
                                                        str = "LAYOUT_ID_EXITED_TRIGGER";
                                                        break;
                                                    case 7:
                                                        str = "MEDIA_RESUMED_TRIGGER";
                                                        break;
                                                    case 8:
                                                        str = "MEDIA_TIME_RANGE_TRIGGER";
                                                        break;
                                                    case 9:
                                                        str = "ON_DIFFERENT_LAYOUT_ID_ENTERED_TRIGGER";
                                                        break;
                                                    case 10:
                                                        str = "ON_ENGAGEMENT_PANEL_CLOSE_REQUESTED_TRIGGER";
                                                        break;
                                                    case 11:
                                                        str = "ON_ENGAGEMENT_PANEL_AUTO_CLOSE_TRIGGER";
                                                        break;
                                                    case 12:
                                                        str = "ON_NEXT_SLOT_ENTER_REQUESTED_TRIGGER";
                                                        break;
                                                    case 13:
                                                        str = "ON_LAYOUT_SELF_EXIT_REQUESTED_TRIGGER";
                                                        break;
                                                    case 14:
                                                        str = "ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID_TRIGGER";
                                                        break;
                                                    case 15:
                                                        str = "ON_PLAYBACK_WITH_CONTENT_VIDEO_ID_TRIGGER";
                                                        break;
                                                    case 16:
                                                        str = "ON_PAGE_ENTERED_TRIGGER";
                                                        break;
                                                    case 17:
                                                        str = "ON_PAGE_EXITED_TRIGGER";
                                                        break;
                                                    case 18:
                                                        str = "ON_PLAYBACK_DESTROYED_TRIGGER";
                                                        break;
                                                    case 19:
                                                        str = "ON_SLOT_CANCELLATION_REQUESTED_TRIGGER";
                                                        break;
                                                    case 20:
                                                        str = "REEL_ITEM_SEQUENCE_ABANDONED_TRIGGER";
                                                        break;
                                                    case 21:
                                                        str = "SEQUENCE_ITEM_IN_PLAYER_SPACE_AVAILABLE_TRIGGER";
                                                        break;
                                                    case 22:
                                                        str = "SEQUENCE_ITEM_IN_PLAYER_SPACE_AVAILABLE_AND_LAYOUT_SCHEDULED_TRIGGER";
                                                        break;
                                                    case 23:
                                                        str = "SEQUENCE_ITEM_IN_PLAYER_SPACE_UNAVAILABLE_TRIGGER";
                                                        break;
                                                    case 24:
                                                        str = "SKIP_REQUESTED_TRIGGER";
                                                        break;
                                                    case 25:
                                                        str = "SLOT_ID_EXITED_TRIGGER";
                                                        break;
                                                    case 26:
                                                        str = "SLOT_ID_ENTERED_TRIGGER";
                                                        break;
                                                    case 27:
                                                        str = "SLOT_ID_SCHEDULED_TRIGGER";
                                                        break;
                                                    case 28:
                                                        str = "SURVEY_DISMISSED_TRIGGER";
                                                        break;
                                                    case 29:
                                                        str = "SURVEY_SUBMITTED_TRIGGER";
                                                        break;
                                                    case 30:
                                                        str = "TIME_RELATIVE_TO_LAYOUT_ENTER_TRIGGER";
                                                        break;
                                                    case 31:
                                                        str = "DURATION_AFTER_MEDIA_PAUSED_AND_STANDARD_PLAYER_TRIGGER";
                                                        break;
                                                    case 32:
                                                        str = "DURATION_AFTER_MEDIA_PAUSED_AND_FULLSCREEN_PLAYER_TRIGGER";
                                                        break;
                                                    case 33:
                                                        str = "LIVE_STREAM_BREAK_SCHEDULED_DURATION_NOT_MATCHED_TRIGGER";
                                                        break;
                                                    case 34:
                                                        str = "LIVE_STREAM_BREAK_SCHEDULED_DURATION_MATCHED_TRIGGER";
                                                        break;
                                                    case 35:
                                                        str = "NEW_SLOT_SCHEDULED_WITH_BREAK_DURATION_TRIGGER";
                                                        break;
                                                    case 36:
                                                        str = "PREFETCH_CACHE_EXPIRED_TRIGGER";
                                                        break;
                                                    case 37:
                                                        str = "LIVE_STREAM_BREAK_STARTED_TRIGGER";
                                                        break;
                                                    case 38:
                                                        str = "LIVE_STREAM_BREAK_ENDED_TRIGGER";
                                                        break;
                                                    case 39:
                                                        str = "AD_BREAK_STARTED_FALL_BACK_TO_BEFORE_CONTENT_VIDEO_ID_STARTED_TRIGGER";
                                                        break;
                                                    case 40:
                                                        str = "SLOT_ID_SCHEDULED_FALL_BACK_TO_SLOT_ID_ENTERED_TRIGGER";
                                                        break;
                                                    case 41:
                                                        str = "ON_ACTIVATE_EXTERNAL_PLAYBACK_TRIGGER";
                                                        break;
                                                    case 42:
                                                        str = "ON_REEL_ORGANIC_STARTED_TRIGGER";
                                                        break;
                                                    case 43:
                                                        str = "BELOW_PLAYER_SPACE_TAKEN_TRIGGER";
                                                        break;
                                                    case 44:
                                                        str = "IN_PLAYER_SPACE_TAKEN_TRIGGER";
                                                        break;
                                                    case 45:
                                                        str = "REEL_MEDIA_TIME_RANGE_TRIGGER";
                                                        break;
                                                    case 46:
                                                        str = "MINI_APP_PAGE_ENTERED_TRIGGER";
                                                        break;
                                                    case 47:
                                                        str = "MINI_APP_ABANDONED_TRIGGER";
                                                        break;
                                                    case 48:
                                                        str = "MINI_APP_PLAYBACK_ENDED_TRIGGER";
                                                        break;
                                                    case 49:
                                                        str = "MINI_APP_SKIP_REQUESTED_TRIGGER";
                                                        break;
                                                    case 50:
                                                        str = "DURATION_AFTER_LAYOUT_EXITED_TRIGGER";
                                                        break;
                                                    case 51:
                                                        str = "ON_VIDEO_AD_START_PLAYING_TRIGGER";
                                                        break;
                                                    case 52:
                                                        str = "FEED_ITEM_ENGAGEMENT_TRIGGER";
                                                        break;
                                                    case 53:
                                                        str = "TRIGGER_NOT_SET";
                                                        break;
                                                    default:
                                                        str = "null";
                                                        break;
                                                }
                                                throw new sav(a.ce(str, "Unable to find a supported client trigger based on the server trigger type: "), 28);
                                        }
                                }
                                break;
                        }
                        return sheVar;
                }
            } else {
                String str8 = aizsVar.d;
                aixr aixrVar4 = aixr.TRIGGER_TYPE_DURATION_AFTER_LAYOUT_EXITED;
                boolean z4 = aizsVar.f;
                String str9 = (i == 52 ? (akou) aizsVar.c : akou.a).b;
                int i7 = aizsVar.b;
                long j = (i7 == 52 ? (akou) aizsVar.c : akou.a).c;
                int iBg2 = a.bg((i7 == 52 ? (akou) aizsVar.c : akou.a).d);
                skcVar = new skc(str8, aixrVar4, z4, str9, j, ahbo.c(yno.M(iBg2 != 0 ? iBg2 : 1)));
            }
            return skcVar;
        } catch (NullPointerException | NoSuchElementException e) {
            throw new sav("Missing key information to construct a trigger. ", e, 116);
        }
    }

    public static final agke c(List list, Optional optional) {
        agjz agjzVar = new agjz(4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            agjzVar.h(b((aizs) it.next(), optional));
        }
        return agjzVar.g();
    }

    public static boolean d(Class cls, smr smrVar) {
        sdn sdnVar = (sdn) cls.getAnnotation(sdn.class);
        if (sdnVar == null) {
            rmp.j(null, a.co(smrVar, "Null values for FactoryHelper: null, "));
            return false;
        }
        if (sdnVar.b() == aixo.SLOT_TYPE_UNSPECIFIED || sdnVar.b() == smrVar.c()) {
            return smrVar.f(sdnVar.d());
        }
        return false;
    }

    public static boolean e(Class cls, smr smrVar, sko skoVar) {
        sdn sdnVar = (sdn) cls.getAnnotation(sdn.class);
        if (sdnVar != null && skoVar != null) {
            if (sdnVar.b() == aixo.SLOT_TYPE_UNSPECIFIED || sdnVar.b() == smrVar.c()) {
                return (sdnVar.a() == aixg.LAYOUT_TYPE_UNSPECIFIED || sdnVar.a() == skoVar.b) && smrVar.f(sdnVar.d()) && DesugarArrays.stream(sdnVar.c()).allMatch(new sco(skoVar, 8));
            }
            return false;
        }
        rmp.j(null, "Null values for FactoryHelper: " + String.valueOf(sdnVar) + ", " + smrVar.toString() + ", " + String.valueOf(skoVar));
        return false;
    }

    public static slm f(smr smrVar, sko skoVar) {
        if (skoVar.e(sip.class)) {
            return ((skl) skoVar.d(sip.class)).b();
        }
        if (smrVar.e(shx.class)) {
            return (slm) smrVar.d(shx.class);
        }
        throw new IllegalArgumentException("Unable to get a valid break type for an instream ad.");
    }

    public static wja g(smr smrVar, sko skoVar) {
        wja wjaVarR = r(smrVar.g);
        if (wjaVarR == null) {
            return r(skoVar != null ? skoVar.o : null);
        }
        return wjaVarR;
    }

    public static PriorityQueue h(slb slbVar) {
        return slbVar.p() == null ? new PriorityQueue() : (PriorityQueue) Collection.EL.stream(slbVar.p().j).flatMap(new rhk(slbVar, 12)).collect(Collectors.toCollection(new ieu(8)));
    }

    public static boolean i(smr smrVar, vyo vyoVar) {
        if (smrVar.e(sjf.class) && k((aopn) smrVar.d(sjf.class), vyoVar)) {
            return true;
        }
        return smrVar.e(shl.class) && j((wgk) smrVar.d(shl.class), vyoVar);
    }

    public static boolean j(wgk wgkVar, vyo vyoVar) {
        if (wgkVar == null || wgkVar.a() == null) {
            return false;
        }
        return Collection.EL.stream(wgkVar.a()).anyMatch(new jmy(vyoVar, 19));
    }

    public static boolean k(aopn aopnVar, vyo vyoVar) {
        if (aopnVar == null || (aopnVar.b & 2) == 0) {
            return false;
        }
        apji apjiVar = aopnVar.d;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        arcg arcgVar = (arcg) aavv.s(apjiVar, arch.a);
        if (arcgVar != null) {
            return arcgVar.u || (taq.ar(vyoVar) && arcgVar.w);
        }
        return false;
    }

    public static boolean l(smr smrVar) {
        return smrVar.e(sit.class) && Objects.equals(smrVar.d(sit.class), Boolean.TRUE);
    }

    public static boolean m(smr smrVar) {
        return smrVar.e(siu.class) && Objects.equals(smrVar.d(siu.class), Boolean.TRUE);
    }

    public static void n(PriorityQueue priorityQueue, slb slbVar, int i, ruk rukVar, boolean z, abnr abnrVar, vyo vyoVar) {
        if (slbVar.p() != null) {
            ArrayList arrayList = new ArrayList();
            if (abnrVar == null) {
                abnrVar = abnr.DEFAULT;
            }
            aizx aizxVar = vyoVar.b().o;
            if (aizxVar == null) {
                aizxVar = aizx.a;
            }
            boolean z2 = false;
            boolean z3 = aizxVar.T && abnrVar == abnr.FULLSCREEN;
            aizx aizxVar2 = vyoVar.b().o;
            if (aizxVar2 == null) {
                aizxVar2 = aizx.a;
            }
            boolean z4 = aizxVar2.U && abnrVar == abnr.DEFAULT;
            aizx aizxVar3 = vyoVar.b().o;
            if (aizxVar3 == null) {
                aizxVar3 = aizx.a;
            }
            if (aizxVar3.V && abnrVar == abnr.DEFAULT) {
                z2 = true;
            }
            if (i == 0) {
                while (!priorityQueue.isEmpty()) {
                    arrayList.add(((sme) priorityQueue.poll()).b);
                }
                if ((slbVar instanceof skz) && !z) {
                    arrayList.addAll(slbVar.p().s);
                    if (z2) {
                        arrayList.addAll(slbVar.p().t);
                    }
                }
            } else if (i == 1) {
                arrayList.addAll(slbVar.p().c);
            } else if (i == 2) {
                arrayList.addAll(slbVar.p().f);
                if (z3) {
                    arrayList.addAll(slbVar.p().g);
                }
                if (z4) {
                    arrayList.addAll(slbVar.p().h);
                }
            } else if (i == 4) {
                arrayList.addAll(slbVar.p().r);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            rukVar.c(arrayList);
        }
    }

    public static boolean o(String str, rsk rskVar, smr smrVar, sko skoVar) {
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        rskVar.u(smrVar, skoVar, new sas("ContentCpn is null or empty when scheduling ads", 52), 10);
        return false;
    }

    public static Long p(smr smrVar, sko skoVar, vyo vyoVar) {
        if (skoVar.e(sip.class)) {
            return Long.valueOf(((skl) skoVar.d(sip.class)).a());
        }
        slm slmVarF = f(smrVar, skoVar);
        slm slmVar = slm.PRE_ROLL;
        int iOrdinal = slmVarF.ordinal();
        if (iOrdinal == 0) {
            return 0L;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2 && iOrdinal != 3) {
                return 0L;
            }
            return -1L;
        }
        agke agkeVar = smrVar.d;
        int i = 0;
        while (i < ((agpi) agkeVar).d) {
            snk snkVar = (snk) agkeVar.get(i);
            i++;
            if (snkVar instanceof slk) {
                return Long.valueOf(((slk) snkVar).b.a);
            }
        }
        if (!taq.aX(vyoVar)) {
            throw new IllegalArgumentException("Unable to get the offset value from a midroll ad. Slot entry triggers: ".concat(String.valueOf(String.valueOf(s(agkeVar)))));
        }
        rmp.m(smrVar, skoVar, String.format(Locale.US, "Unable to get the offset value from a midroll ad. isLive: %s, isDaiPlayback: %s, isLifa: %s, cuepointId: %s, slotId: %s, Slot entry triggers: %s", Boolean.valueOf(((wjf) smrVar.d(sid.class)).V()), Boolean.valueOf(((wjf) smrVar.d(sid.class)).P()), Boolean.valueOf(((wjf) smrVar.d(sid.class)).T()), smrVar.e(sih.class) ? ((yvs) smrVar.d(sih.class)).a : "no_cuepoint", smrVar.a, s(agkeVar)));
        return -1L;
    }

    public static boolean q(sol solVar, abnr abnrVar) {
        boolean z = solVar.e().a;
        boolean z2 = abnrVar == abnr.FULLSCREEN;
        if (z == z2) {
            return false;
        }
        sou souVarA = solVar.e().a();
        souVarA.d(z2);
        solVar.i = souVarA.a();
        return true;
    }

    private static wja r(shh shhVar) {
        slb slbVar;
        wja wjaVarG;
        skm skmVar;
        wja wjaVarG2;
        if (shhVar != null) {
            if (shhVar.e(siq.class) && (skmVar = (skm) shhVar.d(siq.class)) != null && skmVar.d() != null && (wjaVarG2 = skmVar.d().g()) != null) {
                return wjaVarG2;
            }
            if (shhVar.e(sjb.class) && (slbVar = (slb) shhVar.d(sjb.class)) != null && slbVar.c() != null && (wjaVarG = slbVar.c().g()) != null) {
                return wjaVarG;
            }
        }
        return null;
    }

    private static agke s(List list) {
        return (agke) Collection.EL.stream(list).map(new rxg(5)).collect(aghu.a);
    }
}
