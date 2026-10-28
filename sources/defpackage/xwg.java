package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.chromium.net.ApiVersion;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.RequestFinishedInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xwg implements aupn {
    public static Map b(xla xlaVar, vxz vxzVar, Context context, ListenableFuture listenableFuture, xmr xmrVar, awmd awmdVar, String str, awmd awmdVar2) {
        String str2 = Build.MANUFACTURER.toUpperCase(Locale.US) + ' ' + Build.MODEL;
        String strCM = yno.cM(twm.t(context), txz.b(context));
        HashMap map = new HashMap();
        map.put("device", "REMOTE_CONTROL");
        map.put("id", (String) taf.e(listenableFuture, 1L, TimeUnit.SECONDS, ""));
        map.put("name", str2);
        map.put("app", strCM);
        map.put("mdx-version", "3");
        map.put("theme", "m");
        if (xlaVar.aF()) {
            try {
                wmq wmqVar = ((wmr) awmdVar.io()).c;
                String strH = ((sdr) awmdVar2.io()).h();
                String strE = ((sdr) awmdVar2.io()).e();
                boolean zJ = ((sdr) awmdVar2.io()).j();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("user_agent", str);
                jSONObject.put("window_width_points", wmqVar != null ? wmqVar.a : 0);
                jSONObject.put("window_height_points", wmqVar != null ? wmqVar.b : 0);
                jSONObject.put("os_name", "Android");
                jSONObject.put("ms", strH);
                jSONObject.put("advertising_id", strE);
                jSONObject.put("limit_ad_tracking", zJ);
                map.put("deviceContext", jSONObject.toString());
            } catch (JSONException e) {
                ((agrc) ((agrc) ((agrc) xwe.a.b().i(agso.a, "MDX.MdxModule")).j(e)).k("com/google/android/libraries/youtube/mdx/module/MdxSharedModule$SharedModule", "provideStaticBrowserChannelBindParameters", (char) 585, "MdxSharedModule.java")).t("Error building 'deviceContext' data.");
            }
        }
        String strBR = zik.bR(xlaVar, xmrVar, vxzVar);
        if (strBR != null) {
            map.put("capabilities", strBR);
        }
        agkz agkzVarW = xlaVar.W();
        map.put("experiments", agkzVarW.isEmpty() ? "" : TextUtils.join(",", agkzVarW));
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, thm] */
    public static CronetEngine c(Object obj, vxz vxzVar, aunn aunnVar) {
        final abzo abzoVar = (abzo) obj;
        CronetEngine cronetEngineA = abzoVar.d.a(new syb() { // from class: yeg
            /* JADX WARN: Code duplicated, block: B:16:0x0041  */
            /* JADX WARN: Code duplicated, block: B:51:0x0102 A[Catch: all -> 0x0127, TryCatch #0 {all -> 0x0127, blocks: (B:21:0x0079, B:23:0x0081, B:25:0x008d, B:27:0x0097, B:29:0x00a4, B:31:0x00a8, B:33:0x00c0, B:37:0x00c7, B:39:0x00d3, B:41:0x00d7, B:43:0x00db, B:45:0x00e6, B:47:0x00f1, B:48:0x00f3, B:50:0x00f7, B:51:0x0102, B:53:0x010b, B:55:0x0115, B:56:0x0117, B:58:0x011b), top: B:63:0x0079 }] */
            /* JADX WARN: Code duplicated, block: B:53:0x010b A[Catch: all -> 0x0127, TryCatch #0 {all -> 0x0127, blocks: (B:21:0x0079, B:23:0x0081, B:25:0x008d, B:27:0x0097, B:29:0x00a4, B:31:0x00a8, B:33:0x00c0, B:37:0x00c7, B:39:0x00d3, B:41:0x00d7, B:43:0x00db, B:45:0x00e6, B:47:0x00f1, B:48:0x00f3, B:50:0x00f7, B:51:0x0102, B:53:0x010b, B:55:0x0115, B:56:0x0117, B:58:0x011b), top: B:63:0x0079 }] */
            /* JADX WARN: Code duplicated, block: B:55:0x0115 A[Catch: all -> 0x0127, TryCatch #0 {all -> 0x0127, blocks: (B:21:0x0079, B:23:0x0081, B:25:0x008d, B:27:0x0097, B:29:0x00a4, B:31:0x00a8, B:33:0x00c0, B:37:0x00c7, B:39:0x00d3, B:41:0x00d7, B:43:0x00db, B:45:0x00e6, B:47:0x00f1, B:48:0x00f3, B:50:0x00f7, B:51:0x0102, B:53:0x010b, B:55:0x0115, B:56:0x0117, B:58:0x011b), top: B:63:0x0079 }] */
            /* JADX WARN: Code duplicated, block: B:58:0x011b A[Catch: all -> 0x0127, TRY_LEAVE, TryCatch #0 {all -> 0x0127, blocks: (B:21:0x0079, B:23:0x0081, B:25:0x008d, B:27:0x0097, B:29:0x00a4, B:31:0x00a8, B:33:0x00c0, B:37:0x00c7, B:39:0x00d3, B:41:0x00d7, B:43:0x00db, B:45:0x00e6, B:47:0x00f1, B:48:0x00f3, B:50:0x00f7, B:51:0x0102, B:53:0x010b, B:55:0x0115, B:56:0x0117, B:58:0x011b), top: B:63:0x0079 }] */
            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.concurrent.Executor] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, tfx] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.concurrent.Executor] */
            /* JADX WARN: Type inference failed for: r4v16, types: [awmd, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v3, types: [awmd, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v4, types: [awmd, java.lang.Object] */
            @Override // defpackage.syb
            public final Object a(Object obj2, Object obj3) {
                String str;
                ?? r0;
                ?? r2;
                aqiy aqiyVar;
                ExperimentalCronetEngine.Builder builder = (ExperimentalCronetEngine.Builder) obj2;
                ExperimentalCronetEngine.Builder builderEnableHttp2 = builder.enableQuic(false).enableHttp2(true);
                abzo abzoVar2 = abzoVar;
                builderEnableHttp2.setLibraryLoader((CronetEngine.Builder.LibraryLoader) new yeh(abzoVar2));
                Object obj4 = abzoVar2.h;
                ajci ajciVarBn = zik.bn(((vxu) obj4).c());
                if (ajciVarBn == null) {
                    str = null;
                } else {
                    ajcf ajcfVar = ajciVarBn.d;
                    if (ajcfVar == null) {
                        ajcfVar = ajcf.a;
                    }
                    if ((ajcfVar.b & 1) != 0) {
                        ajcf ajcfVar2 = ajciVarBn.d;
                        if (ajcfVar2 == null) {
                            ajcfVar2 = ajcf.a;
                        }
                        ajcd ajcdVar = ajcfVar2.c;
                        if (ajcdVar == null) {
                            ajcdVar = ajcd.a;
                        }
                        str = ajcdVar.b;
                    } else {
                        str = null;
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    builder.setExperimentalOptions(str);
                }
                builder.setUserAgent(((String) abzoVar2.f).replaceFirst("(\\(Linux; (U|N|I); Android.+?)\\)", "$1; Cronet/" + ApiVersion.getCronetVersion() + ')'));
                ((CronetEngine.Builder) obj2).enableBrotli(true);
                builder.setThreadPriority(-2);
                try {
                    ExperimentalCronetEngine experimentalCronetEngineBuild = ((ExperimentalCronetEngine.Builder) obj2).build();
                    if (experimentalCronetEngineBuild != null) {
                        if (experimentalCronetEngineBuild.getVersionString().startsWith("CronetHttpURLConnection/")) {
                            zvp.a(zvn.a, zvm.f, "Ignoring JavaCronetEngine");
                            return null;
                        }
                        ajcg ajcgVarBm = zik.bm(((vxu) obj4).c());
                        if (ajcgVarBm != null && ajcgVarBm.b) {
                            ?? r1 = abzoVar2.c;
                            hed hedVar = (hed) abzoVar2.e.io();
                            Object obj5 = abzoVar2.b;
                            ajcg ajcgVarBm2 = zik.bm(((vxu) obj4).c());
                            experimentalCronetEngineBuild.addRequestFinishedListener(new yqv(r1, hedVar, (zjk) obj5, ajcgVarBm2 != null && ajcgVarBm2.c));
                        }
                    }
                    if (experimentalCronetEngineBuild != null && (r0 = abzoVar2.g) != 0 && (r2 = abzoVar2.j) != 0) {
                        Object obj6 = abzoVar2.k;
                        if (((tao) obj6).e() != null) {
                            aqiy aqiyVar2 = ((tao) obj6).e().e;
                            if (aqiyVar2 == null) {
                                aqiyVar2 = aqiy.a;
                            }
                            if (aqiyVar2.l) {
                                experimentalCronetEngineBuild.addRequestFinishedListener(new thd(r0, r2, false, abzoVar2.a));
                            } else if (((tao) obj6).e() != null) {
                                aqiyVar = ((tao) obj6).e().e;
                                if (aqiyVar == null) {
                                    aqiyVar = aqiy.a;
                                }
                                if (aqiyVar.k) {
                                    experimentalCronetEngineBuild.addRequestFinishedListener(new thd(r0, r2, true, abzoVar2.a));
                                }
                            }
                        } else if (((tao) obj6).e() != null) {
                            aqiyVar = ((tao) obj6).e().e;
                            if (aqiyVar == null) {
                                aqiyVar = aqiy.a;
                            }
                            if (aqiyVar.k) {
                                experimentalCronetEngineBuild.addRequestFinishedListener(new thd(r0, r2, true, abzoVar2.a));
                            }
                        }
                    }
                    return experimentalCronetEngineBuild;
                } catch (Throwable th) {
                    zvp.b(zvn.a, zvm.f, "Failed to construct CronetEngine with ".concat((String) obj3), th);
                    return null;
                }
            }
        });
        if (cronetEngineA != null && vxzVar.l(108, 45794490L, false)) {
            cronetEngineA.addRequestFinishedListener((RequestFinishedInfo.Listener) aunnVar.io());
        }
        return cronetEngineA;
    }

    public static zgy d(xeu xeuVar, wis wisVar, zin zinVar, zjr zjrVar, agfr agfrVar) {
        if (!zjrVar.aF()) {
            agfrVar = new cln(12);
        }
        return new zil(zinVar, xeuVar, false, agfrVar, 2, wisVar);
    }

    public static zcj e(zdx zdxVar) {
        zdu zduVar = zdxVar.u;
        zduVar.getClass();
        return zduVar;
    }

    public static yrk f(Optional optional) {
        yrk yrkVar = (yrk) optional.orElse(new yrl());
        yrkVar.getClass();
        return yrkVar;
    }

    public static yrn g(Optional optional) {
        yrn yrnVar = (yrn) optional.orElse(new yrm());
        yrnVar.getClass();
        return yrnVar;
    }

    public static void h(aaci aaciVar) {
        aaciVar.getClass();
    }

    public static syx i() {
        syx syxVar = zzx.b;
        syxVar.getClass();
        return syxVar;
    }

    public static aalm j(vxz vxzVar, aalp aalpVar, aals aalsVar) {
        aalm aalmVar = aalpVar;
        if (true != vxzVar.m(160, 45654411L)) {
            aalmVar = aalsVar;
        }
        aalmVar.getClass();
        return aalmVar;
    }

    public static aasb k(awmd awmdVar, awmd awmdVar2, aauk aaukVar) {
        aasb aasbVar = aaukVar.b().g ? (aasb) awmdVar.io() : (aasb) awmdVar2.io();
        aasbVar.getClass();
        return aasbVar;
    }

    public static aajm l(Optional optional, aajr aajrVar) {
        aajm aajmVar = (aajm) optional.orElse(aajrVar);
        aajmVar.getClass();
        return aajmVar;
    }

    public static yvi m(aanb aanbVar) {
        yvi yviVarA = aanbVar.b().a();
        yviVarA.getClass();
        return yviVarA;
    }

    public static acdm n(Optional optional, abvk abvkVar) {
        acdm acdmVar = (acdm) optional.orElse(abvkVar);
        acdmVar.getClass();
        return acdmVar;
    }

    public static acia o(abwj abwjVar, abur aburVar, abvc abvcVar) {
        acia aciaVar = aburVar;
        if (true != abwjVar.b) {
            aciaVar = abvcVar;
        }
        aciaVar.getClass();
        return aciaVar;
    }

    public static abnz p(Optional optional) {
        abnz abnzVar = (abnz) optional.orElse(abnz.a);
        abnzVar.getClass();
        return abnzVar;
    }

    public static avbs q(Optional optional) {
        avbs avbsVar = (avbs) optional.orElse(aavv.e(false, false, null, 4));
        avbsVar.getClass();
        return avbsVar;
    }

    public static qrx r(Context context, String str, ahex ahexVar, rrq rrqVar) {
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("mdx");
        qpqVar.d("remote.pb");
        Uri uriA = qpqVar.a();
        qrn qrnVarD = qrp.d(context, ahexVar);
        qrnVarD.c = str;
        qrnVarD.b();
        qrnVarD.d("remote_id");
        qrnVarD.e(new vlf(5));
        qrp qrpVarA = qrnVarD.a();
        qrl qrlVarA = qrm.a();
        qrlVarA.f(uriA);
        qrlVarA.e(atpd.a);
        qrlVarA.b(qrpVarA);
        qrx qrxVarC = rrqVar.c(qrlVarA.a());
        qrxVarC.getClass();
        return qrxVarC;
    }

    public static qrx s(Context context, rrq rrqVar) {
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("notification_storage_module");
        qpqVar.d("notification_payload.pb");
        Uri uriA = qpqVar.a();
        qrl qrlVarA = qrm.a();
        qrlVarA.e(axsu.a);
        qrlVarA.f(uriA);
        qrx qrxVarC = rrqVar.c(qrlVarA.a());
        qrxVarC.getClass();
        return qrxVarC;
    }

    public static aajv t(isi isiVar, aunn aunnVar, aunn aunnVar2) {
        aajv aajwVar;
        if (isiVar.Q()) {
            aajwVar = (aajv) aunnVar2.io();
        } else {
            aajwVar = isiVar.P() ? new aajw() : (aajv) aunnVar.io();
        }
        aajwVar.getClass();
        return aajwVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [abvn, java.lang.Object] */
    public static abvc u(ci ciVar) {
        abvc abvcVarN = ciVar.a.n();
        abvcVarN.getClass();
        return abvcVarN;
    }

    public static aazo v(ci ciVar) {
        aazo aazoVar = (aazo) ((gil) ciVar.a).dd.io();
        aazoVar.getClass();
        return aazoVar;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        throw null;
    }
}
