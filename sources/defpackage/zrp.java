package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.youtube.offline.transfer.service.OfflineKeepAliveService;
import j$.util.Optional;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.security.Key;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zrp implements aupn {
    public static zry b(awmd awmdVar) {
        zry zryVar = (zry) awmdVar.io();
        zryVar.getClass();
        return zryVar;
    }

    public static tgg c(tqj tqjVar, aunn aunnVar, aunn aunnVar2) {
        int i = tqr.a;
        tgg tggVarAJ = zik.aJ(tqjVar, 1073829877, aunnVar, aunnVar2);
        tggVarAJ.getClass();
        return tggVarAJ;
    }

    public static tgg d(tqj tqjVar, aunn aunnVar, aunn aunnVar2) {
        int i = tqr.a;
        tgg tggVarAJ = zik.aJ(tqjVar, 1073829878, aunnVar, aunnVar2);
        tggVarAJ.getClass();
        return tggVarAJ;
    }

    public static tgg e(tqj tqjVar, aunn aunnVar, aunn aunnVar2) {
        int i = tqr.a;
        tgg tggVarAJ = zik.aJ(tqjVar, 1073829879, aunnVar, aunnVar2);
        tggVarAJ.getClass();
        return tggVarAJ;
    }

    public static tir f(tgm tgmVar, tgl tglVar, ExecutorService executorService, awut awutVar, ExecutorService executorService2, awut awutVar2, Executor executor) {
        tgh tghVar = new tgh();
        tghVar.e(false);
        tghVar.g();
        tghVar.b(new tnn());
        tghVar.f(tglVar);
        tghVar.e = "netRequest-noncaching";
        tghVar.a = Optional.of(executorService2);
        tghVar.b = Optional.of(awutVar2);
        tghVar.c = Optional.of(executorService);
        tghVar.d = Optional.of(awutVar);
        tghVar.d(executor);
        tghVar.e(true);
        tir tirVar = (tir) tgmVar.a(tghVar.a());
        tirVar.getClass();
        return tirVar;
    }

    public static tgg g(tgm tgmVar, tgl tglVar, ExecutorService executorService, ExecutorService executorService2, Executor executor) {
        tgh tghVar = new tgh();
        tghVar.e(false);
        tghVar.g();
        tghVar.b(new tnn());
        tghVar.f(tglVar);
        tghVar.e = "netRequest-noncaching";
        tghVar.a = Optional.of(executorService2);
        tghVar.c = Optional.of(executorService);
        tghVar.d(executor);
        tgg tggVarA = tgmVar.a(tghVar.a());
        tggVarA.getClass();
        return tggVarA;
    }

    public static Set h(tqj tqjVar, awmd awmdVar) {
        int i = tqr.a;
        Set agqjVar = tqjVar.k(1073830251) ? new agqj((zsz) awmdVar.io()) : agpr.a;
        agqjVar.getClass();
        return agqjVar;
    }

    public static aary i(aarm aarmVar, aarn aarnVar, vxz vxzVar) {
        aary aaryVar = aarmVar;
        if (true == vxzVar.l(142, 45632208L, false)) {
            aaryVar = aarnVar;
        }
        aaryVar.getClass();
        return aaryVar;
    }

    public static String j() {
        String canonicalName = OfflineKeepAliveService.class.getCanonicalName();
        canonicalName.getClass();
        return canonicalName;
    }

    public static abtd k(Map map) {
        try {
            abtd abtdVar = new abtd(map);
            abtdVar.e = new ServerSocket();
            abtdVar.e.bind(new InetSocketAddress(InetAddress.getByAddress("loopback", new byte[]{127, 0, 0, 1}), 0));
            abtdVar.f = Executors.newSingleThreadExecutor(new szw(10, "mediaReq"));
            abtdVar.f.execute(new abta(abtdVar, 0));
            return abtdVar;
        } catch (Exception e) {
            ((agrc) ((agrc) ((agrc) aauv.a.b()).j(e)).k("com/google/android/libraries/youtube/player/MediaServerModule", "provideMediaServer", '0', "MediaServerModule.java")).t("Exception starting MediaServer");
            return null;
        }
    }

    public static zgy l(abtg abtgVar, agfr agfrVar, Key key, zho zhoVar, vyo vyoVar, zjr zjrVar) {
        return new ygm(new ynu(agfrVar, key, zhoVar, vyoVar, zjrVar), abtgVar);
    }

    public static aari m(aaek aaekVar, syn synVar, aaqg aaqgVar, aauk aaukVar, aunn aunnVar) {
        aari aacpVar;
        if (aaekVar.a) {
            aacpVar = aaukVar.b.l(21, 45369751L, false) ? (aari) aunnVar.io() : new aacp(synVar, aaqgVar, aaukVar);
        } else {
            aacpVar = new aarh();
        }
        aacpVar.getClass();
        return aacpVar;
    }

    public static tpq n(Context context, awmd awmdVar, awmd awmdVar2, abxu abxuVar, String str) {
        rrq rrqVar = (rrq) awmdVar.io();
        ahex ahexVarS = abxuVar.s();
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("notification");
        qpqVar.d("notification.pb");
        Uri uriA = qpqVar.a();
        tpr tprVar = new tpr(awmdVar2, new idn(7), new wvk(11), new yns(3), new wql(12), ahexVarS);
        qrn qrnVar = new qrn(context.getApplicationContext(), ahexVarS);
        qrnVar.d("DeviceContextCache.KEY_PROTO", "DeviceContextCache.KEY_TIMESTAMP", "gcm_registration_id", "com.google.android.libraries.youtube.notification.pref.last_notification_registration_time", "pending_notification_registration", "com.google.android.libraries.youtube.notification.pref.last_os_notifications_enabled", "com.google.android.libraries.youtube.notification.pref.LAST_OS_NOTIFICATIONS_CHANGED_TIME_MS", "com.google.android.libraries.youtube.notification.pref.last_notifications_settings_enabled", "device_context_app_last_opened");
        qrnVar.b();
        qrnVar.c = str;
        qrnVar.e(new tpi(6));
        qrp qrpVarA = qrnVar.a();
        qrl qrlVarA = qrm.a();
        atpq atpqVar = atpq.a;
        qrlVarA.e(atpqVar);
        qrlVarA.f(uriA);
        qrlVarA.b(tprVar);
        qrlVarA.b(qrpVarA);
        return new tpn(omj.U(rrqVar.c(qrlVarA.a())), atpqVar);
    }

    public static zgy o(aadb aadbVar, adgf adgfVar, zho zhoVar, vxz vxzVar, ygn ygnVar, vxz vxzVar2) {
        return new ygm(ygnVar, new ygm(new aaoo(aadbVar, adgfVar, zhoVar, vxzVar, vxzVar2), aarb.b));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    public static tgm p(abfv abfvVar, tgm tgmVar) {
        Optional optional = (Optional) abfvVar.b.io();
        optional.getClass();
        tgmVar.getClass();
        return new zyq(abfvVar.a, optional, tgmVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [abvn, java.lang.Object] */
    public static abnc q(ci ciVar) {
        abnc abncVarH = ciVar.a.h();
        abncVarH.getClass();
        return abncVarH;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [abvn, java.lang.Object] */
    public static abvk r(ci ciVar) {
        abvk abvkVarO = ciVar.a.o();
        abvkVarO.getClass();
        return abvkVarO;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [abvn, java.lang.Object] */
    public static acdo s(ci ciVar) {
        acdo acdoVarW = ciVar.a.w();
        acdoVarW.getClass();
        return acdoVarW;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [abvn, java.lang.Object] */
    public static acdq t(ci ciVar) {
        acdq acdqVarX = ciVar.a.x();
        acdqVarX.getClass();
        return acdqVarX;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [abvn, java.lang.Object] */
    public static absg u(ci ciVar) {
        absg absgVarK = ciVar.a.k();
        absgVarK.getClass();
        return absgVarK;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [abvn, java.lang.Object] */
    public static avlh v(ci ciVar) {
        avlh avlhVarH = ciVar.a.H();
        avlhVarH.getClass();
        return avlhVarH;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        throw null;
    }
}
