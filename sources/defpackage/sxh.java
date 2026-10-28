package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sxh implements aupn {
    public static ttm b(awmd awmdVar, agev agevVar) {
        return (ttm) agevVar.d(new qhs(awmdVar, 14));
    }

    public static String c(Context context, agev agevVar) {
        return (String) agevVar.d(new qhs(context, 12));
    }

    public static String d(Context context, agev agevVar) {
        return (String) agevVar.d(new qhs(context, 13));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    public static String e(Context context, tqj tqjVar) {
        String strValueOf;
        int i = tqr.a;
        if (tqjVar.k(1073814154) || tqjVar.k(1073814147)) {
            long jC = tqjVar.c(4201152);
            if (jC == 0) {
                strValueOf = tym.I(context);
            } else if (tqjVar.k(88318)) {
                strValueOf = Long.toHexString(jC);
                strValueOf.getClass();
                if (strValueOf.length() < 16) {
                    StringBuilder sb = new StringBuilder(16);
                    for (int length = strValueOf.length(); length < 16; length++) {
                        sb.append('0');
                    }
                    sb.append(strValueOf);
                    strValueOf = sb.toString();
                }
            } else {
                strValueOf = String.valueOf(jC);
            }
        } else {
            strValueOf = tym.I(context);
        }
        strValueOf.getClass();
        return strValueOf;
    }

    public static tfu f() {
        tfu tfuVar = tfu.a;
        tfuVar.getClass();
        return tfuVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [agfr, java.lang.Object] */
    public static avlh g(tfm tfmVar) {
        avlh avlhVar = (avlh) tfmVar.f.io();
        avlhVar.getClass();
        return avlhVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [agfr, java.lang.Object] */
    public static avlh h(tfm tfmVar) {
        avlh avlhVar = (avlh) tfmVar.e.io();
        avlhVar.getClass();
        return avlhVar;
    }

    public static tnu i() {
        return tnu.a;
    }

    public static String j(Context context) {
        String strB = txz.b(context);
        context.getClass();
        strB.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append('/');
        sb.append(strB);
        sb.append("(Linux; U; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(Locale.getDefault().toString());
        String str = Build.MODEL;
        if (str.length() > 0) {
            sb.append("; ");
            sb.append(str);
        }
        String str2 = Build.ID;
        if (str2.length() > 0) {
            sb.append(" Build/");
            sb.append(str2);
        }
        sb.append(')');
        return sb.toString();
    }

    public static ajcb k(tao taoVar, tqj tqjVar) {
        int i = tqr.a;
        aihf builder = null;
        if (!tqjVar.k(1073808320)) {
            ajci ajciVarB = taq.b(taoVar.a());
            if ((ajciVarB.b & SemanticState.Focused) != 0) {
                ajcc ajccVar = ajciVarB.g;
                if (ajccVar == null) {
                    ajccVar = ajcc.a;
                }
                ajcb ajcbVar = ajccVar.b;
                if (ajcbVar == null) {
                    ajcbVar = ajcb.a;
                }
                builder = ajcbVar.toBuilder();
            }
        } else if (tqjVar.k(1073810944)) {
            builder = ajcb.a.createBuilder();
            boolean zK = tqjVar.k(1073810945);
            builder.copyOnWrite();
            ajcb ajcbVar2 = (ajcb) builder.instance;
            ajcbVar2.b |= 1;
            ajcbVar2.c = zK;
            boolean zK2 = tqjVar.k(1073810946);
            builder.copyOnWrite();
            ajcb ajcbVar3 = (ajcb) builder.instance;
            ajcbVar3.b |= 2;
            ajcbVar3.d = zK2;
            int iS = (int) tqjVar.s();
            builder.copyOnWrite();
            ajcb ajcbVar4 = (ajcb) builder.instance;
            ajcbVar4.b |= 4;
            ajcbVar4.e = iS;
            int iA = tqjVar.a(1074073099);
            builder.copyOnWrite();
            ajcb ajcbVar5 = (ajcb) builder.instance;
            ajcbVar5.b |= 8;
            ajcbVar5.f = iA;
            int iA2 = tqjVar.a(1074073104);
            builder.copyOnWrite();
            ajcb ajcbVar6 = (ajcb) builder.instance;
            ajcbVar6.b |= 16;
            ajcbVar6.g = iA2;
            int iA3 = tqjVar.a(1074073109);
            builder.copyOnWrite();
            ajcb ajcbVar7 = (ajcb) builder.instance;
            ajcbVar7.b |= 32;
            ajcbVar7.h = iA3;
            int iA4 = tqjVar.a(1074073114);
            builder.copyOnWrite();
            ajcb ajcbVar8 = (ajcb) builder.instance;
            ajcbVar8.b |= 64;
            ajcbVar8.i = iA4;
            boolean zK3 = tqjVar.k(1073810975);
            builder.copyOnWrite();
            ajcb ajcbVar9 = (ajcb) builder.instance;
            ajcbVar9.b |= SemanticState.Focused;
            ajcbVar9.j = zK3;
            boolean zK4 = tqjVar.k(1073810976);
            builder.copyOnWrite();
            ajcb ajcbVar10 = (ajcb) builder.instance;
            ajcbVar10.b |= SemanticState.Hidden;
            ajcbVar10.k = zK4;
        }
        if (builder != null) {
            try {
                tky.b((ajcb) builder.build());
            } catch (RuntimeException e) {
                ((agrc) ((agrc) ((agrc) thg.a.b()).j(e)).k("com/google/android/libraries/youtube/common/network/cronet/dagger/CrolleyConfigDaggerModule", "isValid", '\\', "CrolleyConfigDaggerModule.java")).t("Invalid AndroidCrolleyConfig from server");
                builder = ajcb.a.createBuilder();
                builder.copyOnWrite();
                ajcb ajcbVar11 = (ajcb) builder.instance;
                ajcbVar11.b |= 1;
                ajcbVar11.c = true;
                builder.copyOnWrite();
                ajcb ajcbVar12 = (ajcb) builder.instance;
                ajcbVar12.b |= 2;
                ajcbVar12.d = true;
                builder.copyOnWrite();
                ajcb ajcbVar13 = (ajcb) builder.instance;
                ajcbVar13.b |= 4;
                ajcbVar13.e = 0;
                builder.copyOnWrite();
                ajcb ajcbVar14 = (ajcb) builder.instance;
                ajcbVar14.b |= 8;
                ajcbVar14.f = 1;
                builder.copyOnWrite();
                ajcb ajcbVar15 = (ajcb) builder.instance;
                ajcbVar15.b |= 16;
                ajcbVar15.g = 4;
                builder.copyOnWrite();
                ajcb ajcbVar16 = (ajcb) builder.instance;
                ajcbVar16.b |= 32;
                ajcbVar16.h = 4;
                builder.copyOnWrite();
                ajcb ajcbVar17 = (ajcb) builder.instance;
                ajcbVar17.b |= 64;
                ajcbVar17.i = 4;
                builder.copyOnWrite();
                ajcb ajcbVar18 = (ajcb) builder.instance;
                ajcbVar18.b |= SemanticState.Hidden;
                ajcbVar18.k = false;
            }
        } else {
            builder = ajcb.a.createBuilder();
            builder.copyOnWrite();
            ajcb ajcbVar19 = (ajcb) builder.instance;
            ajcbVar19.b |= 1;
            ajcbVar19.c = true;
            builder.copyOnWrite();
            ajcb ajcbVar110 = (ajcb) builder.instance;
            ajcbVar110.b |= 2;
            ajcbVar110.d = true;
            builder.copyOnWrite();
            ajcb ajcbVar111 = (ajcb) builder.instance;
            ajcbVar111.b |= 4;
            ajcbVar111.e = 0;
            builder.copyOnWrite();
            ajcb ajcbVar112 = (ajcb) builder.instance;
            ajcbVar112.b |= 8;
            ajcbVar112.f = 1;
            builder.copyOnWrite();
            ajcb ajcbVar113 = (ajcb) builder.instance;
            ajcbVar113.b |= 16;
            ajcbVar113.g = 4;
            builder.copyOnWrite();
            ajcb ajcbVar114 = (ajcb) builder.instance;
            ajcbVar114.b |= 32;
            ajcbVar114.h = 4;
            builder.copyOnWrite();
            ajcb ajcbVar115 = (ajcb) builder.instance;
            ajcbVar115.b |= 64;
            ajcbVar115.i = 4;
            builder.copyOnWrite();
            ajcb ajcbVar116 = (ajcb) builder.instance;
            ajcbVar116.b |= SemanticState.Hidden;
            ajcbVar116.k = false;
        }
        ajcb ajcbVar20 = (ajcb) builder.build();
        ajcbVar20.getClass();
        return ajcbVar20;
    }

    public static CronetEngine l(thm thmVar, final Context context, final awmd awmdVar, final File file, final awmd awmdVar2, vxz vxzVar, aunn aunnVar) {
        CronetEngine cronetEngineA = thmVar.a(new syb() { // from class: thh
            @Override // defpackage.syb
            public final Object a(Object obj, Object obj2) {
                Context context2 = context;
                awmd awmdVar3 = awmdVar;
                File file2 = file;
                awmd awmdVar4 = awmdVar2;
                try {
                    ((ExperimentalCronetEngine.Builder) obj).enableQuic(true).enableHttp2(true).setLibraryLoader((CronetEngine.Builder.LibraryLoader) new thi(context2));
                    thl thlVar = (thl) awmdVar3.io();
                    if (thlVar.d() || thlVar.e()) {
                        File file3 = new File(file2, "cronet_metadata_cache");
                        file3.mkdirs();
                        if (file3.isDirectory()) {
                            ((ExperimentalCronetEngine.Builder) obj).setStoragePath(file3.getAbsolutePath());
                            if (thlVar.d()) {
                                ((ExperimentalCronetEngine.Builder) obj).enableHttpCache(2, 0L);
                            }
                        }
                    }
                    String strA = thlVar.a();
                    if (!TextUtils.isEmpty(strA)) {
                        ((ExperimentalCronetEngine.Builder) obj).setExperimentalOptions(strA);
                    }
                    boolean zC = thlVar.c();
                    ((ExperimentalCronetEngine.Builder) obj).enableNetworkQualityEstimator(zC);
                    List listB = thlVar.b();
                    if (listB.isEmpty()) {
                        listB = agke.A("www.googleapis.com", "www.googleadservices.com", "youtubei.googleapis.com", "yt3.ggpht.com", "yt3.googleusercontent.com", "www.gstatic.com", "csi.gstatic.com", "myphonenumbers-pa.googleapis.com", "people-pa.googleapis.com", "i.ytimg.com", "video.google.com", "s.youtube.com", "www.youtube.com", "googleads.g.doubleclick.net", "upload.youtube.com");
                    }
                    Iterator it = listB.iterator();
                    while (it.hasNext()) {
                        ((ExperimentalCronetEngine.Builder) obj).addQuicHint((String) it.next(), 443, 443);
                    }
                    ((CronetEngine.Builder) obj).enableBrotli(true);
                    if (thlVar.f()) {
                        ((ExperimentalCronetEngine.Builder) obj).setThreadPriority(9);
                    } else {
                        ((ExperimentalCronetEngine.Builder) obj).setThreadPriority(-2);
                    }
                    ExperimentalCronetEngine experimentalCronetEngineBuild = ((ExperimentalCronetEngine.Builder) obj).build();
                    if (!zC) {
                        return experimentalCronetEngineBuild;
                    }
                    experimentalCronetEngineBuild.addRttListener((NetworkQualityRttListener) awmdVar4.io());
                    return experimentalCronetEngineBuild;
                } catch (Throwable th) {
                    ((agrc) ((agrc) ((agrc) thj.a.b()).j(th)).k("com/google/android/libraries/youtube/common/network/cronet/dagger/CronetEngineModule", "tryBuildCronetEngine", (char) 199, "CronetEngineModule.java")).w("Failed to construct CronetEngine using %s", obj2);
                    return null;
                }
            }
        });
        if (cronetEngineA == null) {
            throw new IllegalStateException("Could not create CronetEngine");
        }
        if (vxzVar.l(108, 45794490L, false)) {
            cronetEngineA.addRequestFinishedListener((RequestFinishedInfo.Listener) aunnVar.io());
        }
        return cronetEngineA;
    }

    public static avlh m(toj tojVar) {
        avlh avlhVar = (avlh) tojVar.b.io();
        avlhVar.getClass();
        return avlhVar;
    }

    public static avlh n(toj tojVar) {
        avlh avlhVar = tojVar.c;
        avlhVar.getClass();
        return avlhVar;
    }

    public static thl o(tqj tqjVar, awmd awmdVar, awmd awmdVar2) {
        int i = tqr.a;
        thl thlVar = tqjVar.k(1073828557) ? (thl) awmdVar2.io() : (thl) awmdVar.io();
        thlVar.getClass();
        return thlVar;
    }

    public static vlo p(awmd awmdVar, awmd awmdVar2, tqj tqjVar) {
        wkv wkvVarA = wkv.a(tqjVar);
        vlo vloVar = (wkvVarA.c(wkt.DATA_SAVING_REQUEST_CONTEXT) || wkvVarA.c(wkt.MOBILE_DATA_PLAN_REQUEST_CONTEXT)) ? (vlo) awmdVar2.io() : (vlo) awmdVar.io();
        vloVar.getClass();
        return vloVar;
    }

    public static vll q(tfq tfqVar, Executor executor, awmd awmdVar, vyo vyoVar, Context context, Object obj) {
        return new vll(tfqVar, executor, awmdVar, vyoVar, context, (wjr) obj);
    }

    public static ViewGroup r(Activity activity, Map map) {
        ViewGroup viewGroup = (ViewGroup) ((awmd) map.get(activity.getClass())).io();
        viewGroup.getClass();
        return viewGroup;
    }

    public static Integer s(Activity activity, Map map) {
        Integer num = (Integer) ((awmd) map.get(activity.getClass())).io();
        num.getClass();
        return num;
    }

    public static syn t(awmd awmdVar) {
        syn synVar = (syn) awmdVar.io();
        synVar.getClass();
        return synVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [szp] */
    /* JADX WARN: Type inference failed for: r7v4, types: [ahey] */
    /* JADX WARN: Type inference failed for: r7v5, types: [ahey, java.lang.Object] */
    public static ahey u(Set set, Context context, tqj tqjVar, ahey aheyVar, kjc kjcVar, boolean z, agev agevVar) {
        ?? J;
        mdm mdmVarS;
        ThreadFactory mdoVar;
        int iMax = Math.max(4, Runtime.getRuntime().availableProcessors());
        final int iH = taq.H(tqjVar);
        int i = tqr.a;
        if (tqjVar.k(1073807750)) {
            boolean z2 = z && tqjVar.k(1073807751);
            ThreadFactory threadFactory = (ThreadFactory) agevVar.d(new agfr() { // from class: szf
                public final /* synthetic */ String b = "yt-critical";

                @Override // defpackage.agfr
                public final Object io() {
                    return new szw(iH, this.b);
                }
            });
            if (z2) {
                mdmVarS = kjcVar.s(new mdh("yt-critical", iMax, true, mdj.a));
                mdoVar = new mdo(threadFactory, mdmVarS, 0);
            } else {
                mdmVarS = mdm.a;
                mdoVar = threadFactory;
            }
            J = new szp(MoreExecutors.b(new mbr(MoreExecutors.a(new agzc(iMax, mdoVar, false, new rxn(mdmVarS, 19), new rxn(mdmVarS, 20))), aheyVar)));
            agqr it = ((agqj) set).iterator();
            while (it.hasNext()) {
                J.b.Q((szy) it.next());
            }
        } else {
            J = taq.J(iMax, iH, "critical", set, agevVar);
        }
        J.getClass();
        return J;
    }

    public static avlr v(Activity activity, vwt vwtVar) {
        awbl awblVar = new awbl(new tdu(activity, 1));
        avnn avnnVar = atqp.l;
        return awblVar.l(new tzg(vwtVar.y(), 0));
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        throw null;
    }
}
