package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acmk implements vxc {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/reel/internal/endpoint/AbstractReelWatchCommand");
    public final actm b;
    public final mbc c;
    public xzf d;
    public final ycp e;
    public final vxz f;
    private final Context g;
    private final xgm h;
    private final acum i;
    private final aerv k;
    private final abvn l;
    private final aeqw m;
    private final vyo n;
    private final wbz o;
    private final txp p;
    private final acrz q;
    private final acrq r;
    private final tqj s;
    private final aunn t;
    private final vxz u;
    private final hno v;
    private final adyc w;
    private final abxu x;
    private final abfv y;
    private final aerj z;

    public acmk(Context context, ycp ycpVar, actm actmVar, mbc mbcVar, xgm xgmVar, vxz vxzVar, hno hnoVar, abfv abfvVar, acum acumVar, aerv aervVar, abvn abvnVar, abxu abxuVar, aeqw aeqwVar, vyo vyoVar, wbz wbzVar, txp txpVar, acrz acrzVar, adyc adycVar, aunn aunnVar, aerj aerjVar, tqj tqjVar, vxz vxzVar2, aunn aunnVar2) {
        acrq acrqVar = (acrq) aunnVar.io();
        aunnVar2.getClass();
        this.g = context;
        this.e = ycpVar;
        this.b = actmVar;
        this.c = mbcVar;
        this.h = xgmVar;
        this.u = vxzVar;
        this.y = abfvVar;
        this.m = aeqwVar;
        this.n = vyoVar;
        this.v = hnoVar;
        this.o = wbzVar;
        this.p = txpVar;
        this.q = acrzVar;
        this.w = adycVar;
        this.r = acrqVar;
        this.i = acumVar;
        this.k = aervVar;
        this.l = abvnVar;
        this.x = abxuVar;
        vxzVar2.getClass();
        this.f = vxzVar2;
        tqjVar.getClass();
        this.s = tqjVar;
        this.t = aunnVar2;
        this.z = aerjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v2, types: [abvn, java.lang.Object] */
    private final void h(abnl abnlVar) {
        apfp apfpVar;
        abwy abwyVarT;
        if (this.v.aO()) {
            abor aborVarA = this.l.i().a(abnlVar);
            ajwo ajwoVar = abnlVar.b;
            if (aborVarA instanceof abon) {
                abon abonVar = (abon) aborVarA;
                if (ajwoVar != null) {
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                    ajwoVar.c(aihlVarCheckIsLite);
                    Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                    abonVar.j(abnlVar, ((apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).o, (Executor) this.x.f, abnp.a);
                    return;
                }
                return;
            }
            return;
        }
        adyc adycVar = this.w;
        if (adycVar != null) {
            String strW = abnlVar.w();
            abnlVar.e = true;
            ajwo ajwoVar2 = abnlVar.b;
            if (ajwoVar2 != null) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                ajwoVar2.c(aihlVarCheckIsLite2);
                Object objK2 = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
                apfpVar = (apfp) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
            } else {
                apfpVar = null;
            }
            zkj zkjVarB = ((zkh) adycVar.d).io();
            Object obj = adycVar.c;
            arfb arfbVar = arfb.VIDEO_QUALITY_SETTING_UNKNOWN;
            hno hnoVar = (hno) obj;
            int i = -1;
            if (hnoVar.z() && (abwyVarT = adycVar.e.t()) != null) {
                abxo abxoVar = (abxo) abwyVarT.b();
                if (abxoVar instanceof abxl) {
                    abxl abxlVar = (abxl) abxoVar;
                    i = abxlVar.a;
                    arfbVar = abxlVar.d;
                } else if (abxoVar instanceof abxm) {
                    arfbVar = ((abxm) abxoVar).a;
                }
            }
            ((abpd) adycVar.b).s(abnlVar, strW, adycVar.f, aawr.z(((aeiy) adycVar.a).d(apfpVar), true, false, zkjVarB, hnoVar.ba(), i, arfbVar, false, hnoVar.w()));
        }
    }

    private final void i(String str) {
        this.b.f(str);
    }

    private static final void j(alay alayVar) {
        aihf aihfVarCreateBuilder = aocd.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aocd aocdVar = (aocd) aihfVarCreateBuilder.instance;
        alayVar.getClass();
        aocdVar.c = alayVar;
        aocdVar.b |= 1;
        new HashMap();
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aeqw aeqwVar = this.m;
        if (aeqwVar != null) {
            aeqwVar.d();
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        if (this.v.ak()) {
            ajwoVar = aecm.U(ajwoVar);
        }
        HashMap map2 = new HashMap();
        long epochMilli = this.c.f().toEpochMilli();
        xzf xzfVar = this.d;
        if (xzfVar != null) {
            this.e.d(xzfVar);
        }
        if (this.u.m(12, 45368195L) || this.f.l(164, 45673420L, false) || this.e.e == null) {
            g(ajwoVar, epochMilli);
        } else {
            f(ajwoVar, map, map2);
        }
    }

    public final void e(xhc xhcVar) {
        xgn xgnVarHB;
        xgm xgmVar = this.h;
        if (xgmVar == null || (xgnVarHB = xgmVar.hB()) == null) {
            return;
        }
        xgnVarHB.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhcVar), null);
    }

    final void f(ajwo ajwoVar, Map map, Map map2) {
        xgn xgnVarHB;
        yco ycoVar = this.e.e;
        boolean z = ycoVar != null && ycoVar.am();
        try {
            acws acwsVarG = this.y.g(this.g);
            vxz vxzVar = this.f;
            acwsVarG.setTitle(true != vxzVar.l(159, 45659742L, false) ? R.string.reel_cast_stop_casting_title : R.string.play_on_phone_stop_casting_title).setMessage(vxzVar.l(159, 45659742L, false) ? z ? R.string.play_on_phone_stop_casting_speaker_message : R.string.play_on_phone_stop_casting_message : z ? R.string.reel_cast_stop_casting_speaker_message : R.string.reel_cast_stop_casting_message).setPositiveButton(R.string.ok, new hrg(this, ajwoVar, map, 3)).setNegativeButton(R.string.cancel, new xqu(this, 8)).create().show();
            xgm xgmVar = this.h;
            if (xgmVar == null || (xgnVarHB = xgmVar.hB()) == null) {
                return;
            }
            xhc[] xhcVarArr = {xhb.a(192409), xhb.b(135786), xhb.b(192410), xhb.b(192411)};
            for (int i = 0; i < 4; i++) {
                xgnVarHB.l(new xgj(xhcVarArr[i]));
            }
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:124:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:126:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:127:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:130:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:132:0x03da  */
    /* JADX WARN: Code duplicated, block: B:133:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:136:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:139:0x0407  */
    /* JADX WARN: Code duplicated, block: B:145:0x042d  */
    /* JADX WARN: Code duplicated, block: B:147:0x043a  */
    /* JADX WARN: Code duplicated, block: B:152:0x044b A[Catch: all -> 0x047e, DONT_GENERATE, TryCatch #1 {all -> 0x047e, blocks: (B:150:0x0445, B:152:0x044b, B:154:0x044e, B:155:0x045d, B:158:0x0461, B:161:0x0479, B:156:0x045e, B:157:0x0460), top: B:213:0x0445, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x044e A[Catch: all -> 0x047e, TryCatch #1 {all -> 0x047e, blocks: (B:150:0x0445, B:152:0x044b, B:154:0x044e, B:155:0x045d, B:158:0x0461, B:161:0x0479, B:156:0x045e, B:157:0x0460), top: B:213:0x0445, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x0480  */
    /* JADX WARN: Code duplicated, block: B:170:0x0486  */
    /* JADX WARN: Code duplicated, block: B:171:0x048a  */
    /* JADX WARN: Code duplicated, block: B:173:0x048e  */
    /* JADX WARN: Code duplicated, block: B:177:0x049a  */
    /* JADX WARN: Code duplicated, block: B:178:0x04a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:211:0x045e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0445 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x014b  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:81:0x0256  */
    protected final void g(ajwo ajwoVar, long j) {
        boolean z;
        acrq acrqVar;
        aihl aihlVarCheckIsLite;
        Object objK;
        Object objC;
        apfp apfpVar;
        apfu apfuVar;
        Optional optionalOf;
        String str;
        String str2;
        Executor executor;
        tqj tqjVar;
        acux acuxVarB;
        String strY;
        Object obj;
        acqf acqfVar;
        txp txpVar;
        boolean z2;
        wbz wbzVar;
        ajwo ajwoVar2;
        ajwo ajwoVar3 = ajwoVar;
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
        ajwoVar3.c(aihlVarCheckIsLite2);
        Object objK2 = ajwoVar3.j.k(aihlVarCheckIsLite2.d);
        Object objC2 = objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2);
        int i = 17;
        if (!aecm.av((apfp) objC2)) {
            this.v.aE();
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apfp.b);
            ajwoVar3.c(aihlVarCheckIsLite3);
            Object objK3 = ajwoVar3.j.k(aihlVarCheckIsLite3.d);
            if ((((apfp) (objK3 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK3))).c & 16777216) != 0 && (wbzVar = this.o) != null) {
                wby wbyVarC = wbzVar.c();
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apfp.b);
                ajwoVar3.c(aihlVarCheckIsLite4);
                Object objK4 = ajwoVar3.j.k(aihlVarCheckIsLite4.d);
                apfm apfmVar = (apfm) wbyVarC.g(((apfp) (objK4 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK4))).D).g(apfm.class).j(new abxq(9)).u(new wsh(aiik.class, i)).E();
                if (apfmVar != null) {
                    ajwo updatedEndpointProto = apfmVar.getUpdatedEndpointProto();
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(apfp.b);
                    updatedEndpointProto.c(aihlVarCheckIsLite5);
                    if (updatedEndpointProto.j.n(aihlVarCheckIsLite5.d)) {
                        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(apfp.b);
                        ajwoVar3.c(aihlVarCheckIsLite6);
                        Object objK5 = ajwoVar3.j.k(aihlVarCheckIsLite6.d);
                        apfp apfpVar2 = (apfp) (objK5 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK5));
                        aihl aihlVarCheckIsLite7 = aihn.checkIsLite(apfp.b);
                        updatedEndpointProto.c(aihlVarCheckIsLite7);
                        Object objK6 = updatedEndpointProto.j.k(aihlVarCheckIsLite7.d);
                        aihh aihhVar = (aihh) ((apfp) (objK6 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK6))).toBuilder();
                        if ((apfpVar2.d & 2097152) != 0) {
                            aokt aoktVar = apfpVar2.V;
                            if (aoktVar == null) {
                                aoktVar = aokt.a;
                            }
                            aihhVar.copyOnWrite();
                            apfp apfpVar3 = (apfp) aihhVar.instance;
                            aoktVar.getClass();
                            apfpVar3.V = aoktVar;
                            apfpVar3.d |= 2097152;
                        }
                        if (!((apfp) aihhVar.instance).P.equals(apfpVar2.P)) {
                            String str3 = apfpVar2.P;
                            aihhVar.copyOnWrite();
                            apfp apfpVar4 = (apfp) aihhVar.instance;
                            str3.getClass();
                            apfpVar4.d |= SemanticState.Focused;
                            apfpVar4.P = str3;
                        }
                        aihh aihhVar2 = (aihh) ajwoVar3.toBuilder();
                        aihhVar2.e(apfp.b, (apfp) aihhVar.build());
                        ajwoVar2 = (ajwo) aihhVar2.build();
                    } else {
                        ajwoVar2 = ajwoVar3;
                    }
                } else {
                    ajwoVar2 = ajwoVar3;
                }
                wer werVarE = wbyVarC.e();
                aihl aihlVarCheckIsLite8 = aihn.checkIsLite(apfp.b);
                ajwoVar3.c(aihlVarCheckIsLite8);
                Object objK7 = ajwoVar3.j.k(aihlVarCheckIsLite8.d);
                werVarE.j(((apfp) (objK7 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK7))).D);
                werVarE.b().D();
                ajwoVar3 = ajwoVar2;
            }
        }
        aihl aihlVarCheckIsLite9 = aihn.checkIsLite(apfp.b);
        ajwoVar3.c(aihlVarCheckIsLite9);
        Object objK8 = ajwoVar3.j.k(aihlVarCheckIsLite9.d);
        Object objC3 = objK8 == null ? aihlVarCheckIsLite9.b : aihlVarCheckIsLite9.c(objK8);
        hno hnoVar = this.v;
        apfp apfpVar5 = (apfp) objC3;
        if (hnoVar.aE()) {
            String str4 = apfpVar5.q;
            int i2 = actk.b;
            if (aasc.c(str4)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z && apfpVar5.o.isEmpty()) {
            if (((vxz) hnoVar.k).m(38, 45655516L)) {
                j(ackj.c(this.g.getString(R.string.reel_offline_no_videos_found_snackbar_text)));
                return;
            } else if (((vxz) hnoVar.o).m(121, 45625787L)) {
                j(ackj.c(this.g.getString(R.string.reel_offline_shorts_playlist_queued_snackbar_text)));
                return;
            }
        }
        acum acumVar = this.i;
        aerv aervVar = this.k;
        if (abnn.a.containsKey(apfp.b)) {
            abnm abnmVarC = abnn.c(ajwoVar3);
            if (!(abnmVarC instanceof acum)) {
                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/reel/internal/endpoint/AbstractReelWatchCommand", "createPlaybackStartDescriptor", 473, "AbstractReelWatchCommand.java")).w("ReelWatchEndpointCreator is registered but not used. Instead using %s", abnmVarC != null ? abnmVarC.getClass().getSimpleName() : "");
                if (ajwoVar3 != null) {
                    aihl aihlVarCheckIsLite10 = aihn.checkIsLite(apfp.b);
                    ajwoVar3.c(aihlVarCheckIsLite10);
                    if (ajwoVar3.j.n(aihlVarCheckIsLite10.d)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                ((qtf) aervVar.v.io()).b(1L, Boolean.valueOf(z2));
            }
        } else {
            agrf agrfVar = a;
            ((agrc) ((agrc) agrfVar.b()).k("com/google/android/libraries/youtube/reel/internal/endpoint/AbstractReelWatchCommand", "createPlaybackStartDescriptor", 482, "AbstractReelWatchCommand.java")).t("ReelWatchEndpointCreator is not yet registered.");
            ((qtf) aervVar.u.io()).b(1L, new Object[0]);
            if (((vxz) hnoVar.m).l(7, 45650438L, false)) {
                ((agrc) ((agrc) agrfVar.b()).k("com/google/android/libraries/youtube/reel/internal/endpoint/AbstractReelWatchCommand", "createPlaybackStartDescriptor", 485, "AbstractReelWatchCommand.java")).t("Registering ReelWatchEndpointCreator.");
                abnn.h(acumVar);
            }
        }
        abnk abnkVar = new abnk();
        abnkVar.a = ajwoVar3;
        abnkVar.c(z);
        abnl abnlVarA = abnkVar.a();
        tqj tqjVar2 = this.s;
        int i3 = tqr.a;
        tqjVar2.k(1073815615);
        acrz acrzVar = this.q;
        if (acrzVar != null) {
            Optional optionalOfNullable = Optional.ofNullable(this.n);
            if (true == optionalOfNullable.isPresent()) {
                apdy apdyVar = ((vyo) optionalOfNullable.get()).b().r;
                if (apdyVar == null) {
                    apdyVar = apdy.a;
                }
                apeq apeqVar = apdyVar.c;
                if (apeqVar == null) {
                    apeqVar = apeq.a;
                }
                optionalOfNullable = Optional.ofNullable(apeqVar);
            }
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = Optional.ofNullable(Boolean.valueOf(((apeq) optionalOfNullable.get()).b));
            }
            if (!((Boolean) optionalOfNullable.orElse(Boolean.FALSE)).booleanValue()) {
                acrzVar.g();
            }
        }
        if (tqjVar2.k(1073829102)) {
            ((aenu) this.t.io()).e(aewo.u(41, ajwoVar3.c, aecm.V(ajwoVar3), ajwoVar3, 3), Long.valueOf(j));
        }
        actm actmVar = this.b;
        aihl aihlVarCheckIsLite11 = aihn.checkIsLite(apfp.b);
        ajwoVar3.c(aihlVarCheckIsLite11);
        Object objK9 = ajwoVar3.j.k(aihlVarCheckIsLite11.d);
        actmVar.m(0, 2, (apfp) (objK9 == null ? aihlVarCheckIsLite11.b : aihlVarCheckIsLite11.c(objK9)), null, j, "warm", null);
        if (!hnoVar.aD() || !aecm.af(ajwoVar3)) {
            if (aecm.as(ajwoVar3)) {
                acrqVar = this.r;
                if (acrqVar != null) {
                    aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                    ajwoVar3.c(aihlVarCheckIsLite);
                    objK = ajwoVar3.j.k(aihlVarCheckIsLite.d);
                    if (objK == null) {
                        objC = aihlVarCheckIsLite.b;
                    } else {
                        objC = aihlVarCheckIsLite.c(objK);
                    }
                    apfpVar = (apfp) objC;
                    if ((apfpVar.d & 32768) != 0) {
                        apfuVar = apfpVar.R;
                        if (apfuVar == null) {
                            apfuVar = apfu.a;
                        }
                    } else {
                        apfuVar = null;
                    }
                    optionalOf = Optional.of(ajwoVar3.c);
                    optionalOf.isPresent();
                    if (((aigj) optionalOf.get()).E()) {
                        optionalOf = Optional.empty();
                    }
                    str = apfpVar.o;
                    str2 = apfpVar.z;
                    executor = (Executor) this.x.f;
                    if (!ahno.aa(str)) {
                        acrqVar.g.d(acrqVar.a.a(), str, apfuVar);
                    }
                    tqjVar = acrqVar.c;
                    if (tqjVar.a(1073894514) == 0) {
                        acuxVarB = acrqVar.b(str2, null, optionalOf, apfuVar);
                        if (tqjVar.k(1073830483)) {
                            acuxVarB.D = acrt.SHEDDABLE;
                        }
                        strY = acuxVarB.Y();
                        obj = acrqVar.f;
                        synchronized (obj) {
                            if (acrqVar.e(strY) == null) {
                                ListenableFuture listenableFutureD = acrqVar.d(acuxVarB, executor);
                                acqfVar = new acqf(acrqVar.b, acuxVarB.Y(), listenableFutureD);
                                synchronized (obj) {
                                    acrqVar.h = acqfVar;
                                    taf.i(listenableFutureD, MoreExecutors.directExecutor(), new wuy(acrqVar, 17), new yqj(acrqVar, 16), null);
                                }
                            }
                        }
                    } else {
                        acuxVarB = acrqVar.b(str2, null, optionalOf, apfuVar);
                        if (tqjVar.k(1073830483)) {
                            acuxVarB.D = acrt.SHEDDABLE;
                        }
                        strY = acuxVarB.Y();
                        obj = acrqVar.f;
                        synchronized (obj) {
                            if (acrqVar.e(strY) == null) {
                                ListenableFuture listenableFutureD2 = acrqVar.d(acuxVarB, executor);
                                acqfVar = new acqf(acrqVar.b, acuxVarB.Y(), listenableFutureD2);
                                synchronized (obj) {
                                    acrqVar.h = acqfVar;
                                    taf.i(listenableFutureD2, MoreExecutors.directExecutor(), new wuy(acrqVar, 17), new yqj(acrqVar, 16), null);
                                }
                            }
                        }
                    }
                } else if (hnoVar.aO()) {
                    h(abnlVarA);
                } else {
                    txpVar = this.p;
                    if (txpVar != null) {
                        if (aawr.x(ajwoVar3)) {
                            i("r_ofs");
                            h(abnlVarA);
                            i("r_ofe");
                        } else if (acrzVar != null) {
                            actmVar.f("griw_ns");
                            acrzVar.j(ajwoVar3, abnlVarA.q(txpVar), new gtg(this, 13), zzd.a);
                        }
                    }
                }
            } else {
                aihl aihlVarCheckIsLite12 = aihn.checkIsLite(apfp.b);
                ajwoVar3.c(aihlVarCheckIsLite12);
                Object objK10 = ajwoVar3.j.k(aihlVarCheckIsLite12.d);
                if (aecm.av((apfp) (objK10 == null ? aihlVarCheckIsLite12.b : aihlVarCheckIsLite12.c(objK10)))) {
                    acrqVar = this.r;
                    if (acrqVar != null) {
                        aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                        ajwoVar3.c(aihlVarCheckIsLite);
                        objK = ajwoVar3.j.k(aihlVarCheckIsLite.d);
                        if (objK == null) {
                            objC = aihlVarCheckIsLite.b;
                        } else {
                            objC = aihlVarCheckIsLite.c(objK);
                        }
                        apfpVar = (apfp) objC;
                        if ((apfpVar.d & 32768) != 0) {
                            apfuVar = apfpVar.R;
                            if (apfuVar == null) {
                                apfuVar = apfu.a;
                            }
                        } else {
                            apfuVar = null;
                        }
                        optionalOf = Optional.of(ajwoVar3.c);
                        optionalOf.isPresent();
                        if (((aigj) optionalOf.get()).E()) {
                            optionalOf = Optional.empty();
                        }
                        str = apfpVar.o;
                        str2 = apfpVar.z;
                        executor = (Executor) this.x.f;
                        if (!ahno.aa(str)) {
                            acrqVar.g.d(acrqVar.a.a(), str, apfuVar);
                        }
                        tqjVar = acrqVar.c;
                        if (tqjVar.a(1073894514) == 0 || tqjVar.a(1073829819) != 0) {
                            acuxVarB = acrqVar.b(str2, null, optionalOf, apfuVar);
                            if (tqjVar.k(1073830483)) {
                                acuxVarB.D = acrt.SHEDDABLE;
                            }
                            strY = acuxVarB.Y();
                            obj = acrqVar.f;
                            synchronized (obj) {
                                try {
                                    if (acrqVar.e(strY) == null) {
                                        ListenableFuture listenableFutureD3 = acrqVar.d(acuxVarB, executor);
                                        acqfVar = new acqf(acrqVar.b, acuxVarB.Y(), listenableFutureD3);
                                        synchronized (obj) {
                                            try {
                                                acrqVar.h = acqfVar;
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        taf.i(listenableFutureD3, MoreExecutors.directExecutor(), new wuy(acrqVar, 17), new yqj(acrqVar, 16), null);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        } else {
                            ahng.n(alql.a);
                        }
                    } else if (hnoVar.aO()) {
                        h(abnlVarA);
                    } else {
                        txpVar = this.p;
                        if (txpVar != null && !hnoVar.aO()) {
                            if (aawr.x(ajwoVar3)) {
                                i("r_ofs");
                                h(abnlVarA);
                                i("r_ofe");
                            } else if (acrzVar != null) {
                                actmVar.f("griw_ns");
                                acrzVar.j(ajwoVar3, abnlVarA.q(txpVar), new gtg(this, 13), zzd.a);
                            }
                        }
                    }
                } else if (hnoVar.aO()) {
                    h(abnlVarA);
                } else {
                    txpVar = this.p;
                    if (txpVar != null) {
                        if (aawr.x(ajwoVar3)) {
                            i("r_ofs");
                            h(abnlVarA);
                            i("r_ofe");
                        } else if (acrzVar != null) {
                            actmVar.f("griw_ns");
                            acrzVar.j(ajwoVar3, abnlVarA.q(txpVar), new gtg(this, 13), zzd.a);
                        }
                    }
                }
            }
        }
        boolean zK = this.s.k(1073829949);
        ycp ycpVar = this.e;
        if (zK) {
            ycpVar.getClass();
            acnd acndVar = new acnd(ycpVar, 1);
            abxu abxuVar = this.x;
            ahno.at(ahno.ap(acndVar, (Executor) abxuVar.f), new ryh(this, 7), (Executor) abxuVar.a);
        } else if (ycpVar.j()) {
            ycpVar.g();
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor", abnlVarA);
        bundle.putLong("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.CSI_START_BASELINE_KEY", j);
        bundle.putString("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.LOAD_TYPE_KEY", "warm");
        bundle.putBoolean("com.google.android.apps.youtube.ReelWatchActivityIntentCreator.IS_REFERRED_FROM_DISCOVER_KEY", false);
        aerj aerjVar = this.z;
        dd ddVar = (dd) aerjVar.a;
        av avVar = new av(ddVar);
        Object obj2 = aerjVar.b;
        imb imbVarB = imb.b(bundle);
        if (!hmy.an(bundle)) {
            avVar.q(R.id.fragment_container, imbVarB, "FEmusic_immersive_preview");
            avVar.o("FEmusic_immersive_preview");
            if (avVar.j()) {
                return;
            }
            avVar.a(false, true);
            ddVar.ah();
            return;
        }
        cc ccVarG = ddVar.g("FEmusic_immersive");
        if (ccVarG == null) {
            ccVarG = ddVar.g("FEmusic_immersive_preview");
        }
        if (ccVarG instanceof acnl) {
            avVar.l(ccVarG);
            ahfi ahfiVar = (ahfi) aerjVar.f;
            ahfiVar.a = null;
            ahfiVar.b = null;
            ahfiVar.c = null;
        }
        if (((vxz) aerjVar.g).l(31, 45757116L, false)) {
            Object obj3 = aerjVar.e;
            abnl abnlVar = Build.VERSION.SDK_INT >= 33 ? (abnl) bundle.getParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor", abnl.class) : (abnl) bundle.getParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor");
            ajwo ajwoVar4 = abnlVar != null ? abnlVar.b : null;
            hkm hkmVarAd = kro.ad(ajwoVar4, ((hke) aerjVar.d).d("FEmusic_immersive"));
            avVar.s(hkmVarAd.a, hkmVarAd.b, 0);
        }
        avVar.g(R.id.fragment_container, imbVarB, "FEmusic_immersive", 1);
        avVar.e();
        hke hkeVar = (hke) aerjVar.d;
        if (typ.c(hkeVar.c).equals("FEmusic_immersive")) {
            return;
        }
        hkeVar.c = "FEmusic_immersive";
        hkeVar.e(null);
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
