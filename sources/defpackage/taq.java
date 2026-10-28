package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Process;
import android.util.Log;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.backup.Backup;
import com.google.android.libraries.blocks.Container;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;
import org.chromium.net.NetworkException;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class taq {

    @Backup
    public static final String UPLOAD_NETWORK_POLICY = "upload_policy";

    @Backup
    public static final String VIDEO_QUALITY_PROMO_LAST_DISPLAYED = "video_quality_promo_last_displayed";

    private taq() {
    }

    public static boolean A(toe toeVar) {
        return (toeVar instanceof tni) && (toeVar.getCause() instanceof NetworkException);
    }

    public static boolean B(toe toeVar) {
        return (toeVar instanceof tod) || (toeVar instanceof tni);
    }

    public static boolean C(tao taoVar) {
        return b(taoVar.a()).e;
    }

    public static mcs D(tqj tqjVar) {
        return new mcs(H(tqjVar));
    }

    public static ThreadFactory E(String str, ThreadFactory threadFactory) {
        ahfi ahfiVar = new ahfi();
        ahfiVar.c(str.concat(" Thread #%d"));
        ahfiVar.d(threadFactory);
        return ahfi.a(ahfiVar);
    }

    public static Handler F(Context context) {
        return new Handler(context.getMainLooper());
    }

    public static avmb G(ahey aheyVar, tqj tqjVar) {
        int i = tqr.a;
        if (!tqjVar.k(1073815152)) {
            return new awir(aheyVar);
        }
        mcl mclVar = new mcl(aheyVar);
        avmb avmbVar = awlg.a;
        return new awir(mclVar);
    }

    public static int H(tqj tqjVar) {
        int i = tqr.a;
        long jC = tqjVar.c(1075839383);
        int i2 = -1;
        if ((67108864 & jC) == 0 && ((jC & 536870912) == 0 || Process.getThreadPriority(Process.myPid()) >= 0)) {
            i2 = 0;
        }
        int iA = tqjVar.a(1074404098);
        if (iA <= 0) {
            return i2;
        }
        long j = iA;
        if (1 == ((int) ((j >> 9) & 1))) {
            i2 = -19;
        }
        int i3 = (int) ((j >> 5) & 15);
        return i3 > 0 ? i2 + i3 : i2;
    }

    public static int I(tqj tqjVar) {
        int i = tqr.a;
        return tqjVar.a(1074011730) + 10;
    }

    public static ahey J(int i, final int i2, final String str, Collection collection, agev agevVar) {
        ThreadFactory threadFactory = (ThreadFactory) agevVar.d(new agfr() { // from class: sze
            @Override // defpackage.agfr
            public final Object io() {
                return new szw(i2, "yt-".concat(str));
            }
        });
        if (collection.isEmpty()) {
            return MoreExecutors.b(new szx(i, threadFactory));
        }
        szz szzVar = new szz(i, threadFactory);
        ArrayList arrayList = new ArrayList(collection);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            szzVar.b.Q((szy) arrayList.get(i3));
        }
        return MoreExecutors.b(szzVar);
    }

    public static boolean K(Context context) {
        Activity activity;
        context.getClass();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            }
            if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (activity == null) {
            return false;
        }
        tqj tqjVar = tqi.a;
        if (Build.VERSION.SDK_INT < 37 || tqjVar == null) {
            return false;
        }
        int i = tqr.a;
        if (!tqjVar.k(1073830439)) {
            return false;
        }
        try {
            return mdu.d(activity, new hol(activity, 16));
        } catch (RuntimeException e) {
            ((agrc) ((agrc) syy.a.c()).j(e).k("com/google/android/libraries/youtube/common/car/CarDisplayDetector$Companion", "isCarActivity", 95, "CarDisplayDetector.kt")).t("Failed to determine projected car display state");
            return false;
        }
    }

    public static void L(dzu dzuVar, int i, boolean z, Bundle bundle, syj syjVar) {
        int i2;
        byte[] bArrMarshall;
        foc focVar = new foc();
        if (i != 1) {
            i2 = i != 2 ? 1 : 3;
        } else {
            i2 = 2;
        }
        focVar.f(i2);
        focVar.a = z;
        dzuVar.d(focVar.d());
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        dyp dypVarG = null;
        if (bundle2.isEmpty()) {
            bArrMarshall = null;
        } else {
            Parcel parcelObtain = Parcel.obtain();
            bundle2.writeToParcel(parcelObtain, 0);
            bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
        }
        if (bArrMarshall != null) {
            dov dovVar = new dov((byte[]) null);
            dovVar.j("task_extras_key", bArrMarshall);
            dypVarG = dovVar.g();
        }
        if (dypVarG != null) {
            dzuVar.f(dypVarG);
        }
        if (syjVar != null) {
            int i3 = syjVar.a == 0 ? 1 : 2;
            long j = syjVar.b;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            timeUnit.getClass();
            dzuVar.a = true;
            ees eesVar = dzuVar.c;
            eesVar.A = i3;
            long millis = timeUnit.toMillis(j);
            if (millis > 18000000) {
                dzf.b();
                Log.w(ees.a, "Backoff delay duration exceeds maximum value");
            }
            if (millis < 10000) {
                dzf.b();
                Log.w(ees.a, "Backoff delay duration less than minimum value");
            }
            eesVar.n = awro.j(millis, 10000L, 18000000L);
        }
    }

    public static aflg M(Context context) {
        agdf agdfVar = agdf.a;
        String packageName = context.getPackageName();
        packageName.getClass();
        return new aflg(agdfVar, agdfVar, agdfVar, new agfa(packageName), agdfVar, agdfVar, agdfVar, agdfVar, agdfVar);
    }

    public static int N(Context context) {
        klt kltVar = klt.a;
        return kml.a(context);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038  */
    /* JADX WARN: Code duplicated, block: B:17:0x0068  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r7v3, types: [awmd, java.lang.Object] */
    public static String O(awmd awmdVar) {
        String strA;
        int iA;
        wjr wjrVar = (wjr) awmdVar.io();
        int i = tqr.a;
        ?? r0 = wjrVar.a;
        if (!r0.k(1073830138) || (iA = r0.a(1071338)) == 0) {
            tws twsVar = (tws) wjrVar.b.io();
            twsVar.d("device_country");
            strA = lsx.a.a(twsVar.a, twsVar.b("device_country"), null);
            if (r0.k(1073830138) && strA != null && strA.length() == 2) {
                int iCharAt = strA.length() == 2 ? (strA.charAt(0) << '\b') | strA.charAt(1) : 0;
                tqh tqhVarD = r0.d(1);
                tqhVarD.b(1071338, iCharAt);
                tqhVarD.a();
            }
        } else {
            if (iA != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append((char) (iA >> 8));
                sb.append((char) (iA & 255));
                strA = sb.toString();
            } else {
                strA = null;
            }
            if (strA == null) {
                tws twsVar2 = (tws) wjrVar.b.io();
                twsVar2.d("device_country");
                strA = lsx.a.a(twsVar2.a, twsVar2.b("device_country"), null);
                if (r0.k(1073830138)) {
                    if (strA.length() == 2) {
                    }
                    tqh tqhVarD2 = r0.d(1);
                    tqhVarD2.b(1071338, iCharAt);
                    tqhVarD2.a();
                }
            }
        }
        return strA;
    }

    public static bp P(aqtb aqtbVar) {
        aqtbVar.getClass();
        swr swrVar = new swr();
        Bundle bundle = new Bundle();
        bundle.putByteArray("UnlimitedFamilyMessageInterstitialRenderer", aqtbVar.toByteArray());
        swrVar.setArguments(bundle);
        return swrVar;
    }

    public static void U(Container container, awmd awmdVar, Executor executor) {
        lph lphVar = new lph(awmdVar, container, 15, (char[]) null);
        if (awrc.c(Looper.myLooper(), Looper.getMainLooper())) {
            lphVar.run();
        } else {
            executor.execute(afwl.i(lphVar));
        }
    }

    public static float V(vyo vyoVar) {
        aizx aizxVarE = afxw.e(vyoVar);
        if (aizxVarE != null) {
            return aizxVarE.cd;
        }
        return 0.0f;
    }

    public static int W(vyo vyoVar) {
        return afxw.e(vyoVar).co;
    }

    public static int X(vyo vyoVar) {
        aizx aizxVarE = afxw.e(vyoVar);
        if (aizxVarE == null || (aizxVarE.b & 1073741824) == 0) {
            return 3000;
        }
        return aizxVarE.bJ;
    }

    public static long Y(vyo vyoVar) {
        return afxw.e(vyoVar).bl;
    }

    public static long Z(vyo vyoVar) {
        return afxw.e(vyoVar).bc;
    }

    public static boolean aA(vyo vyoVar) {
        return afxw.e(vyoVar).bq;
    }

    public static boolean aB(vyo vyoVar) {
        aizx aizxVarE = afxw.e(vyoVar);
        return aizxVarE != null && aizxVarE.aV;
    }

    public static boolean aC(vyo vyoVar) {
        return afxw.e(vyoVar).ac;
    }

    public static boolean aD(vyo vyoVar) {
        return afxw.e(vyoVar).aa;
    }

    public static boolean aE(vyo vyoVar) {
        return afxw.e(vyoVar).ai;
    }

    public static boolean aF(vyo vyoVar) {
        return afxw.e(vyoVar).ak;
    }

    public static boolean aG(vyo vyoVar) {
        return afxw.e(vyoVar).J;
    }

    public static boolean aH(vyo vyoVar, boolean z) {
        return z ? afxw.e(vyoVar).F : afxw.e(vyoVar).E;
    }

    public static boolean aI(vyo vyoVar) {
        return afxw.e(vyoVar).q;
    }

    public static boolean aJ(vyo vyoVar) {
        return afxw.e(vyoVar).cc;
    }

    public static boolean aK(vyo vyoVar) {
        return afxw.e(vyoVar).bX;
    }

    public static boolean aL(vyo vyoVar) {
        return afxw.e(vyoVar).aX;
    }

    public static boolean aM(vyo vyoVar) {
        return aL(vyoVar) && afxw.e(vyoVar).bv;
    }

    public static boolean aN(vyo vyoVar) {
        return afxw.e(vyoVar).bd;
    }

    public static boolean aO(vyo vyoVar) {
        return afxw.e(vyoVar).bi;
    }

    public static boolean aP(vyo vyoVar) {
        return afxw.e(vyoVar).aq;
    }

    public static boolean aQ(vyo vyoVar) {
        return afxw.e(vyoVar).ar;
    }

    public static boolean aR(vyo vyoVar) {
        return afxw.e(vyoVar).bb;
    }

    public static boolean aS(vyo vyoVar) {
        return afxw.e(vyoVar).i;
    }

    public static boolean aT(vyo vyoVar) {
        return afxw.e(vyoVar).c;
    }

    public static boolean aU(vyo vyoVar) {
        return afxw.e(vyoVar).d;
    }

    public static boolean aV(vyo vyoVar) {
        return afxw.e(vyoVar).h;
    }

    public static boolean aW(vyo vyoVar) {
        return afxw.e(vyoVar).f;
    }

    public static boolean aX(vyo vyoVar) {
        return afxw.e(vyoVar).aB;
    }

    public static boolean aY(vyo vyoVar) {
        return afxw.e(vyoVar).e;
    }

    public static boolean aZ(vyo vyoVar) {
        return afxw.e(vyoVar).x;
    }

    public static long aa(vyo vyoVar) {
        return afxw.e(vyoVar).aY;
    }

    public static String ab(vyo vyoVar) {
        return afxw.e(vyoVar).bh;
    }

    public static boolean ac(vyo vyoVar) {
        return afxw.e(vyoVar).bO;
    }

    public static boolean ad(vyo vyoVar) {
        return afxw.e(vyoVar).w;
    }

    public static boolean ae(vyo vyoVar) {
        return afxw.e(vyoVar).bY;
    }

    public static boolean af(vyo vyoVar) {
        return afxw.e(vyoVar).bW;
    }

    public static boolean ag(vyo vyoVar) {
        return afxw.e(vyoVar).aP;
    }

    public static boolean ah(vyo vyoVar, int i) {
        int i2 = afxw.e(vyoVar).bC;
        return i2 == -1 || i2 == i;
    }

    public static boolean ai(vyo vyoVar) {
        return afxw.e(vyoVar).p;
    }

    public static boolean aj(vyo vyoVar) {
        return afxw.e(vyoVar).aC;
    }

    public static boolean ak(vyo vyoVar) {
        return afxw.e(vyoVar).k;
    }

    public static boolean al(vyo vyoVar) {
        return afxw.e(vyoVar).ce;
    }

    public static boolean am(vyo vyoVar) {
        return afxw.e(vyoVar).cb;
    }

    public static boolean an(vyo vyoVar) {
        return afxw.e(vyoVar).ca;
    }

    public static boolean ao(vyo vyoVar) {
        return afxw.e(vyoVar).bT;
    }

    public static boolean ap(vyo vyoVar) {
        return afxw.e(vyoVar).cy;
    }

    public static boolean aq(vyo vyoVar) {
        return afxw.e(vyoVar).bA;
    }

    public static boolean ar(vyo vyoVar) {
        return afxw.e(vyoVar).cw;
    }

    public static boolean as(vyo vyoVar) {
        return afxw.e(vyoVar).cn;
    }

    public static boolean at(vyo vyoVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        aizx aizxVarE = afxw.e(vyoVar);
        if (z && !z2 && z4) {
            return true;
        }
        if (!z6 || aizxVarE.u) {
            if (aizxVarE.r && z3 && !z2) {
                if (!z || !aizxVarE.bD) {
                    return true;
                }
            } else {
                if (aizxVarE.v && z3 && z2) {
                    return true;
                }
                if (aizxVarE.s && z4) {
                    return true;
                }
                if (aizxVarE.t && z5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean au(vyo vyoVar) {
        return afxw.e(vyoVar).cE;
    }

    public static boolean av(vyo vyoVar) {
        aizx aizxVarE;
        aizx aizxVarE2 = afxw.e(vyoVar);
        return (aizxVarE2 != null && aizxVarE2.aS) || ((aizxVarE = afxw.e(vyoVar)) != null && aizxVarE.aT);
    }

    public static boolean aw(vyo vyoVar) {
        return afxw.e(vyoVar).m;
    }

    public static boolean ax(vyo vyoVar) {
        aizx aizxVarE = afxw.e(vyoVar);
        return aizxVarE != null && aizxVarE.aI;
    }

    public static boolean ay(vyo vyoVar) {
        return afxw.e(vyoVar).bx;
    }

    public static boolean az(vyo vyoVar) {
        return afxw.e(vyoVar).bk;
    }

    public static ajci b(ajvu ajvuVar) {
        ajby ajbyVar = ajvuVar.e;
        if (ajbyVar == null) {
            ajbyVar = ajby.a;
        }
        ajca ajcaVar = ajbyVar.e;
        if (ajcaVar == null) {
            ajcaVar = ajca.a;
        }
        if ((ajcaVar.b & 1) != 0) {
            ajca ajcaVar2 = ajbyVar.e;
            if (ajcaVar2 == null) {
                ajcaVar2 = ajca.a;
            }
            ajci ajciVar = ajcaVar2.c;
            return ajciVar == null ? ajci.a : ajciVar;
        }
        aihf aihfVarCreateBuilder = ajci.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajci ajciVar2 = (ajci) aihfVarCreateBuilder.instance;
        ajciVar2.c = 2;
        ajciVar2.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        ajci ajciVar3 = (ajci) aihfVarCreateBuilder.instance;
        ajciVar3.b |= 32;
        ajciVar3.e = true;
        aihfVarCreateBuilder.copyOnWrite();
        ajci ajciVar4 = (ajci) aihfVarCreateBuilder.instance;
        aiie aiieVar = ajciVar4.f;
        if (!aiieVar.c()) {
            ajciVar4.f = aihn.mutableCopy(aiieVar);
        }
        ajciVar4.f.add("https://youtubei.googleapis.com/generate_204");
        aihf aihfVarCreateBuilder2 = ajch.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ajch ajchVar = (ajch) aihfVarCreateBuilder2.instance;
        ajchVar.b |= 1;
        ajchVar.c = true;
        ajch ajchVar2 = (ajch) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        ajci ajciVar5 = (ajci) aihfVarCreateBuilder.instance;
        ajchVar2.getClass();
        ajciVar5.h = ajchVar2;
        ajciVar5.b |= SemanticState.Hidden;
        return (ajci) aihfVarCreateBuilder.build();
    }

    public static boolean ba(vyo vyoVar, String str) {
        return str != null && afxw.e(vyoVar).cp.contains(str);
    }

    public static aizq bb(vxu vxuVar) {
        if (vxuVar == null || vxuVar.c() == null) {
            return aizq.b;
        }
        aizq aizqVar = vxuVar.c().g;
        return aizqVar == null ? aizq.b : aizqVar;
    }

    public static boolean bc(vxu vxuVar) {
        return bb(vxuVar).f;
    }

    public static boolean bd(vxu vxuVar) {
        return bb(vxuVar).m;
    }

    public static boolean be(vyo vyoVar, abnc abncVar, wja wjaVar) {
        aaxo aaxoVarC = abncVar.c();
        if (aaxoVarC.a != abnr.DEFAULT) {
            return false;
        }
        float fV = V(vyoVar);
        if (fV <= 0.0f) {
            fV = 1.01f;
        }
        if (wjaVar != null) {
            int i = 0;
            while (true) {
                List list = wjaVar.r;
                if (i >= list.size()) {
                    return false;
                }
                wgs wgsVar = (wgs) list.get(i);
                if (wgsVar.d() > 0 && wgsVar.i() > 0 && wgsVar.i() / wgsVar.d() <= fV) {
                    break;
                }
                i++;
            }
        } else {
            int i2 = aaxoVarC.c;
            int i3 = aaxoVarC.d;
            if (i2 <= 0 || i3 <= 0) {
                return false;
            }
            if (i2 / i3 > fV) {
                return false;
            }
        }
        return true;
    }

    public static boolean bf(vyo vyoVar, abnc abncVar) {
        if (afxw.e(vyoVar).bL) {
            aaxo aaxoVarC = abncVar.c();
            if (aaxoVarC.a == abnr.DEFAULT) {
                float fV = V(vyoVar);
                if (fV <= 0.0f) {
                    fV = 1.01f;
                }
                int i = aaxoVarC.c;
                int i2 = aaxoVarC.d;
                if (i > 0 && i2 > 0) {
                    if (i / i2 <= fV) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean bg(vxu vxuVar) {
        return bb(vxuVar).k;
    }

    public static String bh(slm slmVar) {
        return Integer.toString(slmVar.e);
    }

    public static String bi(int i) {
        String str = String.format(Locale.ROOT, "go/asr%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        str.getClass();
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    public static sds bj(Context context, String str, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, mbc mbcVar, awmd awmdVar4, tqj tqjVar, abxu abxuVar, awmd awmdVar5) {
        boolean zK;
        long j;
        int i;
        int iAV;
        if (awmdVar3 != null) {
            int i2 = tqr.a;
            if (!tqjVar.k(1073808343)) {
                awmdVar3.io();
            }
        }
        int i3 = tqr.a;
        ajbd ajbdVar = null;
        if (tqjVar.k(1073808343) || tqjVar.k(1073808284)) {
            zK = tqjVar.k(1073808288);
            int iAV2 = a.aV(tqjVar.a(1073873828));
            if (iAV2 == 0) {
                iAV2 = 1;
            }
            j = 0;
            i = iAV2;
        } else {
            if (awmdVar3 != null) {
                ajbd ajbdVarB = ((vxu) awmdVar3.io()).b();
                if (!ajbd.a.equals(ajbdVarB)) {
                    ajbdVar = ajbdVarB;
                }
            }
            if (ajbdVar != null) {
                zK = ajbdVar.e;
                if ((ajbdVar.b & 1) == 0) {
                    iAV = 1;
                } else {
                    ajbc ajbcVar = ajbdVar.c;
                    if (ajbcVar == null) {
                        ajbcVar = ajbc.a;
                    }
                    iAV = a.aV(ajbcVar.b);
                    if (iAV == 0) {
                        iAV = 1;
                    }
                }
                i = iAV;
                j = ajbdVar.d;
            } else {
                zK = false;
                j = 0;
                i = 1;
            }
        }
        boolean z = zK;
        ajbd ajbdVar2 = ajbdVar;
        if (mbcVar == null) {
            return bl(ajbdVar2, z, context, str, awmdVar, awmdVar2, tqjVar, abxuVar, awmdVar5);
        }
        int i4 = i - 1;
        if (i4 != 1) {
            return i4 != 2 ? bm(ajbdVar2, z, sdr.a, context, str, awmdVar, awmdVar2, mbcVar, awmdVar4, tqjVar, abxuVar, awmdVar5) : bm(ajbdVar2, z, j, context, str, awmdVar, awmdVar2, mbcVar, awmdVar4, tqjVar, abxuVar, awmdVar5);
        }
        return bl(ajbdVar2, z, context, str, awmdVar, awmdVar2, tqjVar, abxuVar, awmdVar5);
    }

    public static tlj bk(awmd awmdVar, awmd awmdVar2, tao taoVar, mbc mbcVar, ajcb ajcbVar, ScheduledExecutorService scheduledExecutorService, tfx tfxVar, Executor executor, tgl tglVar, tmo tmoVar, Optional optional, int i, String str, long j, boolean z, Executor executor2, tli tliVar, tli tliVar2, Optional optional2, Optional optional3, Optional optional4, Optional optional5, awmd awmdVar3, tgv tgvVar, tqj tqjVar, vwt vwtVar, byte b, vxz vxzVar) {
        return new tkr(awmdVar, awmdVar2, taoVar, mbcVar, ajcbVar, scheduledExecutorService, tfxVar, executor, tglVar, tmoVar, optional, i, str, j, z, executor2, tliVar, tliVar2, optional2, optional3, optional4, optional5, awmdVar3, tgvVar, tqjVar, vxzVar, vwtVar);
    }

    private static sds bl(ajbd ajbdVar, boolean z, Context context, String str, awmd awmdVar, awmd awmdVar2, tqj tqjVar, abxu abxuVar, awmd awmdVar3) {
        return tym.av(tqjVar) ? new sdx(context, str, ajbdVar, (vwt) awmdVar2.io(), z, tqjVar, abxuVar, awmdVar3) : new sdv(context, str, ajbdVar, (vwt) awmdVar.io(), z, tqjVar, abxuVar);
    }

    private static sds bm(ajbd ajbdVar, boolean z, long j, Context context, String str, awmd awmdVar, awmd awmdVar2, mbc mbcVar, awmd awmdVar3, tqj tqjVar, abxu abxuVar, awmd awmdVar4) {
        wkv wkvVarA = wkv.a(tqjVar);
        boolean z2 = true;
        boolean z3 = wkvVarA.c(wkt.AD_SIGNALS_INNER_TUBE_CONTEXT) && wkvVarA.e(3);
        int i = tqr.a;
        boolean zK = tqjVar.k(1073808297);
        if ((tqjVar.a(1073960061) & 1) != 0 || (!z3 && !zK)) {
            z2 = false;
        }
        if (tym.av(tqjVar)) {
            if (z2) {
                vwt vwtVar = (vwt) awmdVar2.io();
                awmdVar3.getClass();
                return new seb(context, str, ajbdVar, vwtVar, z, tqjVar, abxuVar, awmdVar4, mbcVar, j, awmdVar3);
            }
            vwt vwtVar2 = (vwt) awmdVar2.io();
            awmdVar3.getClass();
            return new see(context, str, ajbdVar, vwtVar2, z, tqjVar, abxuVar, awmdVar4, mbcVar, j, awmdVar3);
        }
        if (z2) {
            vwt vwtVar3 = (vwt) awmdVar.io();
            awmdVar3.getClass();
            return new sdz(context, str, ajbdVar, vwtVar3, mbcVar, j, awmdVar3, z, tqjVar, abxuVar);
        }
        vwt vwtVar4 = (vwt) awmdVar.io();
        awmdVar3.getClass();
        return new sec(context, str, ajbdVar, vwtVar4, mbcVar, j, awmdVar3, z, tqjVar, abxuVar);
    }

    public static void c() {
        if (a.x()) {
            throw new IllegalStateException("In application's main thread");
        }
    }

    public static void d() {
        if (!a.x()) {
            throw new IllegalStateException("Not in application's main thread");
        }
    }

    public static boolean e() {
        return !a.x();
    }

    public static void f(szy szyVar, Throwable th) {
        if (th != null) {
            szyVar.a(th);
        }
    }

    public static void g(tdi tdiVar) {
        tdiVar.onCreate(tdi.f);
    }

    public static void h(tdi tdiVar) {
        tdiVar.onDestroy(tdi.f);
    }

    public static Object i(aunn aunnVar, awsj awsjVar) {
        awsjVar.getClass();
        return aunnVar.io();
    }

    public static tmf j(tns tnsVar, tlj tljVar) {
        if (!tljVar.L()) {
            return tmf.i;
        }
        tkr tkrVar = (tkr) tljVar;
        if (tkrVar.j) {
            return new tlk(tkrVar.e, tnsVar.h().a());
        }
        ScheduledExecutorService scheduledExecutorService = tkrVar.e;
        long jA = tnsVar.h().a();
        tnsVar.h().g();
        return new tlk(scheduledExecutorService, jA, 60000L);
    }

    public static tnm k(toe toeVar) {
        if (!(toeVar instanceof tob)) {
            return null;
        }
        for (aifv aifvVar : new tyo(toeVar).b()) {
            if (aifvVar.b.equals("type.googleapis.com/youtube.api.pfiinnertube.YoutubeApiInnertube.AnyInnertubeResponse")) {
                try {
                    aifv aifvVar2 = ((ajeg) aihn.parseFrom(ajeg.a, aifvVar.c, ExtensionRegistryLite.getGeneratedRegistry())).b;
                    if (aifvVar2 == null) {
                        aifvVar2 = aifv.a;
                    }
                    if (!aifvVar2.b.startsWith("type.googleapis.com/youtube.api.pfiinnertube.YoutubeApiInnertube") || aifvVar2.c.E()) {
                        return null;
                    }
                    return new tnm(200, aifvVar2.c.G(), false, Collections.EMPTY_LIST);
                } catch (aiik unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public static agke l(UrlResponseInfo urlResponseInfo) {
        List allHeadersAsList = urlResponseInfo.getAllHeadersAsList();
        return allHeadersAsList.isEmpty() ? agpi.a : (agke) j$.util.Collection.EL.stream(allHeadersAsList).map(new snm(5)).collect(aghu.a);
    }

    public static Map m(tns tnsVar, tmt tmtVar) {
        HashMap map = new HashMap();
        if (tmtVar != null) {
            String str = tmtVar.d;
            if (str != null) {
                map.put("If-None-Match", str);
            }
            long j = tmtVar.f;
            if (j > 0) {
                try {
                    int i = tlu.a;
                    map.put("If-Modified-Since", tlt.a().format(new Date(j)));
                } catch (AssertionError unused) {
                }
            }
        }
        int iM = tnsVar.M() - 1;
        if (iM == 1 || iM == 2 || iM == 7) {
            map.put("Content-Type", tnsVar.ac());
        }
        map.putAll(tnsVar.e());
        return map;
    }

    public static void n(tns tnsVar) {
        if (tnsVar.h() != null) {
            tnsVar.h().b();
        }
        tnsVar.O();
        tgs tgsVar = (tgs) tnsVar.p(tgs.class);
        if (tgsVar != null) {
            tgsVar.d();
        }
    }

    public static void o(tns tnsVar) {
        if (tnsVar.h() != null) {
            tnsVar.h().b();
        }
        tgs tgsVar = (tgs) tnsVar.p(tgs.class);
        if (tgsVar != null) {
            tgsVar.e();
        }
    }

    public static void p(tns tnsVar) {
    }

    public static void q(tns tnsVar) {
        tnsVar.O();
        tgs tgsVar = (tgs) tnsVar.p(tgs.class);
        if (tgsVar != null) {
            tgsVar.a();
        }
    }

    public static boolean r(tns tnsVar, toe toeVar) {
        try {
            tnsVar.h().f(toeVar);
            return true;
        } catch (toe unused) {
            return false;
        }
    }

    public static boolean s(tnm tnmVar) {
        Map map;
        String str;
        return (tnmVar == null || (map = tnmVar.e) == null || (str = (String) map.get("content-type")) == null || !ahno.ag(str, "application/x-protobuf")) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009f A[DONT_GENERATE] */
    public static UrlRequest.Builder t(tns tnsVar, Map map, byte[] bArr, tlj tljVar, UrlRequest.Callback callback, tqj tqjVar, tko tkoVar) {
        int i;
        tkq tkqVar;
        tkr tkrVar = (tkr) tljVar;
        awmd awmdVar = tkrVar.a;
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        UrlRequest.Builder builderNewUrlRequestBuilder = ((CronetEngine) awmdVar.io()).newUrlRequestBuilder(tnsVar.s(), new afxe(callback), executorDirectExecutor);
        builderNewUrlRequestBuilder.allowDirectExecutor();
        if (bArr != null) {
            builderNewUrlRequestBuilder.setUploadDataProvider(UploadDataProviders.create(bArr), executorDirectExecutor);
        }
        ((thw) tkrVar.b.io()).b(builderNewUrlRequestBuilder, map.entrySet());
        builderNewUrlRequestBuilder.setHttpMethod(tym.aF(tnsVar.M()));
        int iOrdinal = tnsVar.af().ordinal();
        if (iOrdinal == 0) {
            i = 1;
        } else if (iOrdinal != 2) {
            i = iOrdinal != 3 ? 2 : 4;
        } else {
            i = 3;
        }
        builderNewUrlRequestBuilder.setPriority(i);
        if (tkoVar != null) {
            synchronized (tkoVar.b) {
                tkqVar = tkoVar.c;
                if (tkqVar == null) {
                    if (tkoVar.f == 1 && (tkoVar.a() == 3 || tkoVar.a() == 2)) {
                        tkqVar = null;
                    } else {
                        if (tkoVar.f == 1) {
                            tkoVar.f();
                        }
                        if (tkoVar.b() <= 0 || tkoVar.f == 3) {
                            tkqVar = null;
                        } else {
                            tkqVar = (tkq) awqx.l(awov.a, new dnz(tkoVar, (awoq) null, 16, (byte[]) null));
                        }
                    }
                }
            }
            if (tkqVar != null) {
                builderNewUrlRequestBuilder.setRawCompressionDictionary(tkqVar.a, tkqVar.b, "");
            }
        }
        tnsVar.N();
        int i2 = tqr.a;
        if (tqjVar.k(72618)) {
            if (tnsVar.o().isPresent()) {
                builderNewUrlRequestBuilder.setTrafficStatsTag(((tok) tnsVar.o().get()).az);
            } else {
                builderNewUrlRequestBuilder.setTrafficStatsTag(tok.VOLLEY_REQUEST.az);
            }
        }
        return builderNewUrlRequestBuilder;
    }

    public static UrlRequest u(tns tnsVar, Map map, byte[] bArr, tlj tljVar, tlh tlhVar, the theVar, UrlRequest.Callback callback, tqj tqjVar, tko tkoVar) {
        Executor executor;
        UrlRequest.Builder builderT = t(tnsVar, map, bArr, tljVar, callback, tqjVar, tkoVar);
        builderT.addRequestAnnotation(theVar);
        if (tlhVar != null && (executor = tlhVar.c) != null) {
            builderT.setRequestFinishedListener(new tlg(tlhVar, tlhVar.d, tlhVar.b, executor, tlhVar.f));
        }
        return builderT.build();
    }

    public static boolean v(int i) {
        return (i >= 200 && i < 300) || i == 304;
    }

    public static toe w(tnm tnmVar, int i) {
        if (i == 400) {
            return new tey(tnmVar);
        }
        if (i == 401) {
            return new tmg(tnmVar);
        }
        if (i != 403) {
            return i != 415 ? new tob(tnmVar) : new thb(tnmVar);
        }
        return new tnc(tnmVar);
    }

    public static tit x(tlj tljVar) {
        tkr tkrVar = (tkr) tljVar;
        tfx tfxVar = tkrVar.f;
        if (tfxVar != null) {
            return new tit(tfxVar, tkrVar.g, new glj(tljVar, 9));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static tic y(boolean z) {
        return z ? tid.b : tid.a;
    }

    public static toe z(Throwable th) {
        return th instanceof toe ? (toe) th : new toe(th);
    }

    public final avlh Q() {
        return (avlh) (T() ? a().r().t : a().r().i);
    }

    public final Boolean R() {
        boolean z = false;
        if (a().o() != null && a().o().Y()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final Long S() {
        abvk abvkVarO = a().o();
        acfw acfwVarI = abvkVarO != null ? abvkVarO.i() : null;
        if (acfwVarI != null) {
            return Long.valueOf(acfwVarI.a());
        }
        return null;
    }

    public final boolean T() {
        return a().g().cg();
    }

    public abvn a() {
        throw null;
    }

    protected taq(byte[] bArr, byte[] bArr2, byte[] bArr3) {
    }
}
