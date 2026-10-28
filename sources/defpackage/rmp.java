package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.backup.Backup;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import j$.util.DesugarArrays;
import j$.util.Optional;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class rmp {

    @Backup
    public static final String ACCOUNT_NAME = "user_account";

    @Backup
    public static final String DATASYNC_ID = "datasync_id";

    @Backup
    public static final String DELEGATION_CONTEXT = "delegation_context";

    @Backup
    public static final String DELEGATION_TYPE = "delegation_type";

    @Backup
    public static final String EXTERNAL_ID = "user_identity_id";

    @Backup
    public static final String IDENTITY_VERSION = "identity_version";

    @Backup
    public static final String IS_GRIFFIN = "HAS_GRIFFIN_POLICY";

    @Backup
    public static final String IS_INCOGNITO = "IS_INCOGNITO_SESSION_IDENTITY";

    @Backup
    public static final String IS_TEENACORN = "IS_CHILD_ACCOUNT_OVER_13";

    @Backup
    public static final String IS_UNICORN = "IS_UNICORN_CHILD_ACCOUNT";

    @Backup
    public static final String NEXT_INCOGNITO_SESSION_INDEX = "NEXT_INCOGNITO_SESSION_INDEX";

    @Backup
    public static final String PAGE_ID = "user_identity";

    @Backup
    public static final String PERSONA_ACCOUNT = "persona_account";

    @Backup
    public static final String USERNAME = "username";

    @Backup
    public static final String USER_SIGNED_OUT = "user_signed_out";
    public static String b;
    public static Boolean c;

    public rmp() {
    }

    public static Uri A(Uri uri, String str) {
        return uri.buildUpon().path(String.valueOf(uri.getPath()).concat(str)).build();
    }

    public static ListenableFuture B(ListenableFuture listenableFuture) {
        agel agelVar = new agel();
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        int i = ahcs.c;
        ahcr ahcrVar = new ahcr(listenableFuture, agelVar);
        listenableFuture.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
        return ahcrVar;
    }

    public static void C(qrz qrzVar, HashMap map) {
        String strA = qrzVar.a();
        ahno.K(!map.containsKey(strA), "There is already a factory registered for the ID %s", strA);
        map.put(strA, qrzVar);
    }

    public static void D(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static File E(Uri uri) throws qqb {
        if (!uri.getScheme().equals("file")) {
            throw new qqb("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new qqb("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new qqb("Did not expect uri to have authority");
    }

    public static Uri F(Uri.Builder builder, agjz agjzVar) {
        return builder.encodedFragment(qql.a(agjzVar.g())).build();
    }

    public static Uri G(String str, String str2, long j) throws qqb {
        Uri.Builder builderPath = new Uri.Builder().scheme("blobstore").authority(str2).path(str);
        agfm agfmVar = qps.a;
        if (str.endsWith(".lease")) {
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
            if (!TextUtils.equals(str, "*.lease")) {
                builderPath.appendQueryParameter("expiryDateSecs", String.valueOf(j));
            }
        }
        Uri uriBuild = builderPath.build();
        List<String> pathSegments = uriBuild.getPathSegments();
        if (pathSegments.size() == 1) {
            String str3 = pathSegments.get(0);
            if (qps.a.h(str3).size() == 1 || (str3.endsWith(".lease") && !TextUtils.equals(str3, ".lease"))) {
                if (TextUtils.isEmpty(uriBuild.getQuery()) || (uriBuild.getQueryParameterNames().size() == 1 && uriBuild.getQueryParameter("expiryDateSecs") != null)) {
                    return uriBuild;
                }
                throw new qqb(String.format("The uri query is malformed, expected %s but found query %s", "expiryDateSecs=<expiryDateSecs>", uriBuild.getQuery()));
            }
        }
        throw new qqb(String.format("The uri is malformed, expected %s or %s but found %s", "<non_empty_checksum>", "<non_empty_checksum>.lease", uriBuild.getPath()));
    }

    public static File H(Context context) {
        return I(context.createDeviceProtectedStorageContext()).getParentFile();
    }

    public static File I(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            SystemClock.sleep(100L);
            filesDir = context.getFilesDir();
            if (filesDir == null) {
                throw new IllegalStateException("getFilesDir returned null twice.");
            }
        }
        return filesDir;
    }

    public static void J(Map map) {
        agqr it = ((agpk) ((agpn) map).entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            afuu afuuVarD = afwt.d(30, (String) entry.getKey(), afux.a, true);
            try {
                ((qnt) ((awmd) entry.getValue()).io()).a();
                afuuVarD.close();
            } catch (Throwable th) {
                try {
                    afuuVarD.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static qrx K(String str, ListenableFuture listenableFuture, MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite, Executor executor, agev agevVar, ayq ayqVar) {
        return new qrx(new qrt(str, listenableFuture, new qsc(messageLite, extensionRegistryLite), executor, ayqVar, agevVar, new afuc()), new aher(""), true);
    }

    public static File L(Uri uri, omj omjVar) throws qqb {
        String scheme = uri.getScheme();
        int iHashCode = scheme.hashCode();
        if (iHashCode != -861391249) {
            if (iHashCode == 3143036 && scheme.equals("file")) {
                return E(uri);
            }
        } else if (scheme.equals("android")) {
            return omjVar.V(uri);
        }
        throw new qqb("Couldn't convert URI to path: ".concat(String.valueOf(String.valueOf(uri))));
    }

    private static void M(zvn zvnVar, smr smrVar, String str) {
        if (smrVar == null) {
            zvp.a(zvnVar, zvm.a, "[Control flow] ".concat(String.valueOf(str)));
            return;
        }
        zvp.a(zvnVar, zvm.a, "[Control flow] " + nre.k(smrVar) + ": " + str);
    }

    private static void N(zvn zvnVar, smr smrVar, sko skoVar, String str) {
        if (smrVar == null) {
            zvp.a(zvnVar, zvm.a, "[Control flow] ".concat(String.valueOf(str)));
            return;
        }
        aixg aixgVar = skoVar.b;
        zvm zvmVar = zvm.a;
        String strK = nre.k(smrVar);
        StringBuilder sb = new StringBuilder(aixgVar.name());
        sb.append(' ');
        nre.l(sb, skoVar.c());
        zvp.a(zvnVar, zvmVar, "[Control flow] " + strK + ", " + sb.toString() + ": " + str);
    }

    private static boolean O(smr smrVar) {
        if (smrVar == null) {
            return false;
        }
        int i = aixf.CONTROL_FLOW_MANAGER_LAYER_EXTERNAL.f;
        int i2 = smrVar.c;
        return i2 == i || i2 == aixf.CONTROL_FLOW_MANAGER_LAYER_SURFACE.f;
    }

    public static void a(zwa zwaVar, wnw wnwVar, String str, rpv rpvVar) {
        rqd rqdVar = new rqd(rpvVar, 0);
        zwaVar.getClass();
        wnwVar.a(zwaVar, rlt.b(str), rqdVar, str, 6);
    }

    public static afhq b(zwa zwaVar) {
        aihh aihhVar = (aihh) afhq.a.createBuilder();
        String strC = c(zwaVar);
        aihhVar.copyOnWrite();
        afhq afhqVar = (afhq) aihhVar.instance;
        afhqVar.b |= SemanticState.Hidden;
        afhqVar.f = strC;
        String strD = d(zwaVar);
        aihhVar.copyOnWrite();
        afhq afhqVar2 = (afhq) aihhVar.instance;
        afhqVar2.b |= 1;
        afhqVar2.c = strD;
        if (zwaVar instanceof rlt) {
            String str = ((rlt) zwaVar).b;
            aihhVar.copyOnWrite();
            afhq afhqVar3 = (afhq) aihhVar.instance;
            afhqVar3.b |= 16;
            afhqVar3.e = str;
        }
        return (afhq) aihhVar.build();
    }

    public static String c(zwa zwaVar) {
        if (zwaVar.g()) {
            return "pseudonymous";
        }
        if (zwaVar.e()) {
            return "youtube-delegated";
        }
        return zwaVar.m() ? "youtube-incognito" : "youtube-direct";
    }

    public static String d(zwa zwaVar) {
        return zwaVar.i().equals("") ? "pseudonymous" : zwaVar.i();
    }

    public static boolean e(zwa zwaVar) {
        if (!(zwaVar instanceof rlt)) {
            return false;
        }
        rlt rltVar = (rlt) zwaVar;
        return rltVar.h || rltVar.i;
    }

    public static boolean f(zwa zwaVar) {
        return (zwaVar instanceof rlt) && e(zwaVar) && ((rlt) zwaVar).l == 3;
    }

    public static zwn g(rly rlyVar) {
        rlyVar.getClass();
        return new rju(rlyVar, 0);
    }

    public static zwn h(rma rmaVar) {
        return new rju(new rjw(rmaVar), 1);
    }

    public static void i(StrictMode.ThreadPolicy threadPolicy) {
        StrictMode.setThreadPolicy(threadPolicy);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            new Handler(Looper.myLooper()).postAtFrontOfQueue(new qca(threadPolicy, 16));
        }
    }

    public static void j(smr smrVar, String str) {
        M(zvn.b, smrVar, str);
    }

    public static void k(smr smrVar, String str) {
        M(zvn.a, smrVar, str);
    }

    public static void l(smr smrVar, sko skoVar, String str) {
        N(zvn.a, smrVar, skoVar, str);
    }

    public static void m(smr smrVar, sko skoVar, String str) {
        if (O(smrVar)) {
            l(smrVar, skoVar, str);
        } else {
            N(zvn.b, smrVar, skoVar, str);
        }
    }

    public static void n(smr smrVar, String str) {
        if (str != null) {
            if (O(smrVar)) {
                k(smrVar, str);
            } else {
                j(smrVar, str);
            }
        }
    }

    public static rsz o() {
        return rsz.a;
    }

    public static rti p() {
        return rti.a;
    }

    public static dlr q(Context context) {
        Object objN;
        try {
            context.getClass();
            we.o();
            if (we.o() >= 5) {
                Object systemService = context.getSystemService((Class<Object>) pw$$ExternalSyntheticApiModelOutline0.m927m());
                systemService.getClass();
                objN = new dlu(pw$$ExternalSyntheticApiModelOutline0.m(systemService));
            } else {
                objN = we.p() >= 9 ? we.n(context, new ank(context, 4)) : null;
            }
            if (objN != null) {
                return new dlq((dls) objN);
            }
            return null;
        } catch (RuntimeException e) {
            zvp.a(zvn.a, zvm.a, "MeasurementManagerFutures.from(context) throws exception: ".concat(String.valueOf(e.getMessage())));
            return null;
        }
    }

    public static sej r(rsi rsiVar, mbc mbcVar, tpq tpqVar, tfq tfqVar, sdr sdrVar, aboi aboiVar, abnc abncVar, tun tunVar) {
        sej sejVar = new sej(mbcVar, tpqVar, tfqVar);
        sdrVar.getClass();
        sejVar.a = sdrVar;
        sejVar.f = aboiVar;
        sejVar.g = abncVar;
        if (rsiVar.h) {
            sejVar.d = tunVar;
        }
        return sejVar;
    }

    public static /* synthetic */ boolean s(wjf wjfVar) {
        if (wjfVar == null) {
            return false;
        }
        return nre.i(nre.c(wjfVar.u()), 4).isPresent();
    }

    public static /* synthetic */ boolean t(wjf wjfVar, boolean z) {
        if (nre.i(nre.c(wjfVar.u()), 2).isPresent()) {
            return true;
        }
        return z && wjfVar.m() != null;
    }

    public static agev u(Context context) {
        try {
            StatFs statFs = new StatFs(context.getFilesDir().getPath());
            return agev.i(Long.valueOf(((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 52428800) * 52428800));
        } catch (RuntimeException unused) {
            return agdf.a;
        }
    }

    public static agke v(File[] fileArr) {
        return (agke) DesugarArrays.stream(fileArr).filter(new gqn(12)).flatMap(new rmm(3)).collect(aghu.a);
    }

    public static ajwo w(ajwo ajwoVar) {
        if (ajwoVar == null) {
            return null;
        }
        aihh aihhVar = (aihh) ajwoVar.toBuilder();
        aihhVar.copyOnWrite();
        ajwo ajwoVar2 = (ajwo) aihhVar.instance;
        ajwoVar2.b &= -2;
        ajwoVar2.c = ajwo.a.c;
        aihhVar.copyOnWrite();
        ((ajwo) aihhVar.instance).d = ajwo.emptyProtobufList();
        aihhVar.d(appx.b);
        aihf aihfVarCreateBuilder = aoar.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
        aoarVar.b |= SemanticState.Hidden;
        aoarVar.i = true;
        aihhVar.e(aoaq.b, (aoar) aihfVarCreateBuilder.build());
        return (ajwo) aihhVar.build();
    }

    public static sds x(Context context, awmd awmdVar, rsi rsiVar, awmd awmdVar2, awmd awmdVar3, mbc mbcVar, awmd awmdVar4, tqj tqjVar, abxu abxuVar, awmd awmdVar5) {
        if (!rsiVar.i) {
            return taq.bj(context, rsiVar.e, awmdVar2, awmdVar3, null, null, null, tqjVar, abxuVar, awmdVar5);
        }
        String str = rsiVar.e;
        mbcVar.getClass();
        return taq.bj(context, str, awmdVar2, awmdVar3, awmdVar, mbcVar, awmdVar4, tqjVar, abxuVar, awmdVar5);
    }

    public static szv y(abxu abxuVar) {
        return szv.l((ahey) abxuVar.w().c, true);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [awmd, java.lang.Object] */
    public static rtl z(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, Optional optional, awmd awmdVar5, achb achbVar, aaqf aaqfVar, awmd awmdVar6, vyo vyoVar, tbt tbtVar) {
        agjz agjzVarF = agke.f(6);
        agjzVarF.h(new snr(awmdVar, awmdVar5, awmdVar6, vyoVar));
        optional.isPresent();
        agjzVarF.h(new snt(awmdVar, awmdVar5, optional.get(), awmdVar6, vyoVar));
        agjzVarF.h(achbVar);
        agjzVarF.h((wny) awmdVar3.io());
        agjzVarF.h((wny) awmdVar4.io());
        return new rtl(aaqfVar, agjzVarF.g(), tbtVar);
    }

    public rmp(byte[] bArr, char[] cArr) {
    }
}
