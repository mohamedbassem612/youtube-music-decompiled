package defpackage;

import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hmt {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/offline/actionscontroller/MusicOfflineTrackEntityActionsController");
    public final cf b;
    public final huh c;
    public final hpy d;
    public final hpd e;
    public final aaug f;
    public final abvk g;
    public final abvc h;
    public final tbt i;
    public final hlp j;
    public final aaps k;
    public final avmb l;
    public final aanb m;
    public final gmj n;
    public final xsc o;
    private final tts p;
    private final aauk q;
    private final tfq r;
    private final abfv s;

    public hmt(cf cfVar, huh huhVar, hpy hpyVar, hpd hpdVar, tts ttsVar, gmj gmjVar, xsc xscVar, aaug aaugVar, abvk abvkVar, abvc abvcVar, tbt tbtVar, hlp hlpVar, tfq tfqVar, abfv abfvVar, aanb aanbVar, aaps aapsVar, avmb avmbVar, aauk aaukVar) {
        this.b = cfVar;
        this.c = huhVar;
        this.d = hpyVar;
        this.e = hpdVar;
        this.p = ttsVar;
        this.n = gmjVar;
        this.o = xscVar;
        this.f = aaugVar;
        this.g = abvkVar;
        this.h = abvcVar;
        this.i = tbtVar;
        this.j = hlpVar;
        this.r = tfqVar;
        this.s = abfvVar;
        this.m = aanbVar;
        this.k = aapsVar;
        this.l = avmbVar;
        this.q = aaukVar;
    }

    public final void a(String str, String str2, boolean z) {
        this.o.az(R.string.remove_from_offline_dialog_title, Integer.valueOf(R.string.remove_track_from_offline_dialog_message), new hms(this, z, str2, str), R.string.remove_offline_confirmed_button, 295330);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    public final void b(aanu aanuVar, String str) {
        String strAH = kro.aH(str);
        if (aanuVar == aanu.f) {
            this.n.d(R.string.add_video_to_offline_error);
            return;
        }
        if (aanuVar == aanu.d) {
            this.n.d(R.string.video_already_added_to_offline);
            return;
        }
        hlp hlpVar = this.j;
        int i = 18;
        if (hlpVar.k() || txz.g(this.b)) {
            taf.k(this.b, this.d.a(kro.aq()), new gnx(i), new hcq(this, strAH, 7));
            return;
        }
        gmj gmjVar = this.n;
        atpr atprVarS = hlpVar.s();
        atpr atprVar = atpr.UNMETERED_WIFI_OR_UNMETERED_MOBILE;
        int i2 = R.string.add_to_offline_wifi_unavailable;
        if (atprVarS == atprVar) {
            tfq tfqVar = this.r;
            if (!tfqVar.j(1)) {
                aauk aaukVar = this.q;
                if (aaukVar.p() && tfqVar.k()) {
                    if (atprVarS == atpr.UNMETERED_WIFI || this.r.j(1)) {
                        i2 = R.string.add_to_offline_start;
                    }
                } else if (aaukVar.p() && this.s.z()) {
                    i2 = R.string.add_to_offline_waiting_for_wifi_or_unmetered;
                }
            } else if (atprVarS == atpr.UNMETERED_WIFI) {
                i2 = R.string.add_to_offline_start;
            } else {
                i2 = R.string.add_to_offline_start;
            }
        } else if (atprVarS == atpr.UNMETERED_WIFI) {
            i2 = R.string.add_to_offline_start;
        } else {
            i2 = R.string.add_to_offline_start;
        }
        Object obj = gmjVar.b;
        jin jinVar = (jin) obj;
        jinVar.d(((kwq) gmjVar.e).s(i2, new fuc(gmjVar, str, i), ((vxz) gmjVar.a).m(58, 45813924L)));
    }

    public final void c(String str) {
        String str2;
        avlr avlrVarJ;
        if (!this.r.i()) {
            this.p.a();
            return;
        }
        huh huhVar = this.c;
        aihf aihfVarCreateBuilder = aofh.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aofh aofhVar = (aofh) aihfVarCreateBuilder.instance;
        aofhVar.c = 3;
        aofhVar.b |= 1;
        String strAH = kro.aH(str);
        aihfVarCreateBuilder.copyOnWrite();
        aofh aofhVar2 = (aofh) aihfVarCreateBuilder.instance;
        strAH.getClass();
        aofhVar2.b |= 2;
        aofhVar2.d = strAH;
        aihh aihhVar = (aihh) aofg.b.createBuilder();
        aogf aogfVar = aogf.OFFLINE_REQUEST_SOURCE_MANUAL_OFFLINE;
        int iK = hmy.k(2, 28, aogfVar);
        aihhVar.copyOnWrite();
        aofg aofgVar = (aofg) aihhVar.instance;
        aofgVar.c |= 1;
        aofgVar.d = iK;
        aihhVar.o(aoff.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK);
        aihl aihlVar = anyr.b;
        aihf aihfVarCreateBuilder2 = anyr.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        anyr anyrVar = (anyr) aihfVarCreateBuilder2.instance;
        anyrVar.l = aogfVar.e;
        anyrVar.c |= SemanticState.LiveRegion;
        aihhVar.e(aihlVar, (anyr) aihfVarCreateBuilder2.build());
        aihfVarCreateBuilder.copyOnWrite();
        aofh aofhVar3 = (aofh) aihfVarCreateBuilder.instance;
        aofg aofgVar2 = (aofg) aihhVar.build();
        aofgVar2.getClass();
        aofhVar3.e = aofgVar2;
        aofhVar3.b |= 4;
        aofh aofhVar4 = (aofh) aihfVarCreateBuilder.build();
        try {
            avlrVarJ = huhVar.b.a(aofhVar4);
            str2 = str;
        } catch (aaob e) {
            str2 = str;
            ((agrc) ((agrc) ((agrc) huh.a.b().i(agso.a, "Offline")).j(e)).k("com/google/android/apps/youtube/music/offline/orchestration/MusicTrackDownloadController", "retryTrack", (char) 154, "MusicTrackDownloadController.java")).w("Couldn't delete single track through orchestration: %s", str2);
            avlrVarJ = avlr.J(new aanv(aofhVar4, aanu.f));
        }
        avlrVarJ.B(new gkq(12)).am().s(this.l).C(new gkr(this, str2, 7), new gkr(this, str2, 8));
    }

    public final void d(String str, boolean z) {
        if (z) {
            this.o.az(R.string.readd_to_offline_video, null, new hml(new hmp(this, str), 5), R.string.confirm_download, 295762);
        } else {
            c(str);
        }
    }

    public final void e(final String str, final aoia aoiaVar, final xgn xgnVar, final aodn aodnVar) {
        typ.f(str);
        if (!this.r.i()) {
            this.p.a();
        } else {
            taf.k(this.b, ahng.k(agke.r(this.d.a(kro.aq()), this.e.g(str))), new gnx(17), new twi() { // from class: hmq
                /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
                @Override // defpackage.twi
                public final void a(Object obj) {
                    avlr avlrVarJ;
                    Object obj2;
                    boolean zBooleanValue;
                    List list = (List) obj;
                    hmt hmtVar = this.a;
                    int iBc = 0;
                    if (list != null) {
                        Optional optionalOfNullable = (Optional) list.get(0);
                        hth hthVar = (hth) list.get(1);
                        if (hthVar != null && !hthVar.a().isEmpty() && !hthVar.b().isEmpty()) {
                            if (((anyo) hthVar.b().get()).e()) {
                                hpd hpdVar = hmtVar.e;
                                if (hpdVar.q(hthVar)) {
                                    zBooleanValue = hpdVar.v(hthVar.f(), hthVar.c());
                                    if (!zBooleanValue) {
                                        hmtVar.n.d(R.string.video_already_added_to_offline);
                                        return;
                                    }
                                }
                            } else {
                                hpd hpdVar2 = hmtVar.e;
                                if (hpdVar2.q(hthVar)) {
                                    zBooleanValue = hpdVar2.v(hthVar.f(), hthVar.c());
                                } else {
                                    String strB = ((weh) hthVar.a().get()).b();
                                    if (optionalOfNullable != null) {
                                        hlx hlxVar = new hlx(strB, 3);
                                        if (true == optionalOfNullable.isPresent()) {
                                            Object obj3 = optionalOfNullable.get();
                                            Object obj4 = hlxVar.a;
                                            annv annvVar = (annv) ((weh) obj3);
                                            optionalOfNullable = Optional.ofNullable(Boolean.valueOf((annvVar.h().contains(obj4) || annvVar.f().contains(obj4)) ? false : true));
                                        }
                                        zBooleanValue = ((Boolean) optionalOfNullable.orElse(Boolean.TRUE)).booleanValue();
                                    }
                                }
                                if (!zBooleanValue) {
                                    hmtVar.n.d(R.string.video_already_added_to_offline);
                                    return;
                                }
                            }
                        }
                    }
                    aoia aoiaVar2 = aoiaVar;
                    if (aoiaVar2 == null) {
                        hmtVar.n.d(R.string.add_video_to_offline_error);
                        return;
                    }
                    xgn xgnVar2 = xgnVar;
                    String str2 = str;
                    if (!aoiaVar2.c) {
                        aohy aohyVar = aoiaVar2.d;
                        if (aohyVar == null) {
                            aohyVar = aohy.a;
                        }
                        if ((aohyVar.b & 2) != 0) {
                            aohy aohyVar2 = aoiaVar2.d;
                            if (aohyVar2 == null) {
                                aohyVar2 = aohy.a;
                            }
                            obj2 = aohyVar2.d;
                            if (obj2 == null) {
                                obj2 = arat.a;
                            }
                        } else {
                            aohy aohyVar3 = aoiaVar2.d;
                            if (((aohyVar3 == null ? aohy.a : aohyVar3).b & 1) != 0) {
                                if (aohyVar3 == null) {
                                    aohyVar3 = aohy.a;
                                }
                                obj2 = aohyVar3.c;
                                if (obj2 == null) {
                                    obj2 = akmh.a;
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        Object obj5 = obj2;
                        if (obj5 != null) {
                            taf.k(hmtVar.b, hmtVar.d.a(kro.aq()), new gnx(15), new hmo(hmtVar, str2, obj5, xgnVar2, 0));
                            return;
                        }
                        return;
                    }
                    aohx aohxVarE = hmtVar.j.e();
                    byte[] bArrG = (aoiaVar2.b & SemanticState.Hidden) != 0 ? aoiaVar2.g.G() : vzh.b;
                    aodn aodnVar2 = aodnVar;
                    aamn aamnVar = aamn.OFFLINE_IMMEDIATELY;
                    aaja.c(aoiaVar2, xgnVar2, str2, null, aohxVarE, aamnVar, (aodnVar2 == null || (aodnVar2.b & 2) == 0 || (iBc = a.bc(aodnVar2.c)) != 0) ? iBc : 1);
                    huh huhVar = hmtVar.c;
                    aihf aihfVarCreateBuilder = aofh.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    aofh aofhVar = (aofh) aihfVarCreateBuilder.instance;
                    aofhVar.c = 4;
                    aofhVar.b |= 1;
                    String strAy = kro.ay("PPSV");
                    aihfVarCreateBuilder.copyOnWrite();
                    aofh aofhVar2 = (aofh) aihfVarCreateBuilder.instance;
                    strAy.getClass();
                    aofhVar2.b |= 2;
                    aofhVar2.d = strAy;
                    aihh aihhVar = (aihh) aofg.b.createBuilder();
                    int iK = hmy.k(5, huhVar.c.intValue(), aogf.OFFLINE_REQUEST_SOURCE_MANUAL_OFFLINE);
                    aihhVar.copyOnWrite();
                    aofg aofgVar = (aofg) aihhVar.instance;
                    aofgVar.c |= 1;
                    aofgVar.d = iK;
                    aihl aihlVar = anue.b;
                    aihf aihfVarCreateBuilder2 = anue.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    anue anueVar = (anue) aihfVarCreateBuilder2.instance;
                    str2.getClass();
                    anueVar.d = 6;
                    anueVar.e = str2;
                    aigj aigjVarV = aigj.v(bArrG);
                    aihfVarCreateBuilder2.copyOnWrite();
                    anue anueVar2 = (anue) aihfVarCreateBuilder2.instance;
                    aigjVarV.getClass();
                    anueVar2.c |= 1;
                    anueVar2.f = aigjVarV;
                    int i = aamnVar.h;
                    aihfVarCreateBuilder2.copyOnWrite();
                    anue anueVar3 = (anue) aihfVarCreateBuilder2.instance;
                    anueVar3.c |= 8;
                    anueVar3.i = i;
                    aihhVar.e(aihlVar, (anue) aihfVarCreateBuilder2.build());
                    aihfVarCreateBuilder.copyOnWrite();
                    aofh aofhVar3 = (aofh) aihfVarCreateBuilder.instance;
                    aofg aofgVar2 = (aofg) aihhVar.build();
                    aofgVar2.getClass();
                    aofhVar3.e = aofgVar2;
                    aofhVar3.b |= 4;
                    aofh aofhVar4 = (aofh) aihfVarCreateBuilder.build();
                    try {
                        avlrVarJ = huhVar.b.a(aofhVar4);
                    } catch (aaob e) {
                        ((agrc) ((agrc) ((agrc) huh.a.b().i(agso.a, "Offline")).j(e)).k("com/google/android/apps/youtube/music/offline/orchestration/MusicTrackDownloadController", "saveSingleTrack", '|', "MusicTrackDownloadController.java")).w("Couldn't save single track through orchestration: %s", str2);
                        str2 = str2;
                        avlrVarJ = avlr.J(new aanv(aofhVar4, aanu.f));
                    }
                    avlrVarJ.B(new hhw(hmtVar, 2)).am().s(hmtVar.l).C(new gkr(hmtVar, str2, 9), new gkr(hmtVar, str2, 10));
                }
            });
        }
    }
}
