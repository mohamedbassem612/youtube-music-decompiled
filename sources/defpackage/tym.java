package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import j$.util.DesugarTimeZone;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class tym {
    private static volatile boolean a;
    private static int b;
    private static String c;

    public tym() {
    }

    public static long A(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    public static boolean B(int i, int i2, int i3) {
        return i2 <= i && i <= i3;
    }

    public static boolean C(int i, int i2) {
        return i >= 0 && i < i2;
    }

    public static long D(File file) {
        if (file != null && file.exists()) {
            try {
                StatFs statFs = new StatFs(file.getAbsolutePath());
                return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
            } catch (IllegalArgumentException unused) {
            }
        }
        return 0L;
    }

    public static long E() {
        if ("mounted".equals(Environment.getExternalStorageState())) {
            return D(Environment.getExternalStorageDirectory());
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0064 A[PHI: r2
      0x0064: PHI (r2v2 int) = (r2v1 int), (r2v1 int), (r2v1 int), (r2v1 int), (r2v0 int) binds: [B:16:0x0033, B:18:0x0039, B:23:0x0046, B:27:0x0062, B:14:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    public static Integer F(Context context) {
        Pair pairQ;
        int i = 720;
        if (twm.d(context) >= 720 || twm.t(context)) {
            int i2 = 1080;
            if (twm.d(context) >= 1080 || twm.j() >= 1080) {
                i = 1440;
                if (twm.d(context) >= 1440 || twm.j() >= 1440) {
                    i2 = 2160;
                    if (twm.d(context) >= 2160 || twm.j() >= 2160) {
                        i = i2;
                    } else {
                        if (twm.c == 0) {
                            twm.s(context);
                        }
                        if (twm.c >= 3840 || ((pairQ = twm.q()) != null && Math.max(((Integer) pairQ.first).intValue(), ((Integer) pairQ.second).intValue()) >= 3840)) {
                            i = i2;
                        }
                    }
                } else {
                    i = i2;
                }
            }
        } else {
            i = 480;
        }
        return Integer.valueOf(i);
    }

    public static int G() {
        int i = b;
        if (i != 0) {
            return i;
        }
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        b = iAvailableProcessors;
        return iAvailableProcessors;
    }

    public static aloj H(Context context, boolean z) {
        if (txz.g(context)) {
            return aloj.WEARABLE_FORM_FACTOR;
        }
        if (txz.d(context)) {
            return aloj.AUTOMOTIVE_FORM_FACTOR;
        }
        if (!z) {
            return aP(twm.k(context));
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display[] displays = Build.VERSION.SDK_INT >= 33 ? displayManager.getDisplays("android.hardware.display.category.ALL_INCLUDING_DISABLED") : displayManager.getDisplays();
        int i = 0;
        for (Display display : displays) {
            if (aaj.b(display) == 1) {
                i++;
            }
        }
        Display[] displayArr = new Display[i];
        int i2 = 0;
        for (Display display2 : displays) {
            if (aaj.b(display2) == 1) {
                displayArr[i2] = display2;
                i2++;
            }
        }
        int iMax = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Display display3 = displayArr[i3];
            Point point = new Point();
            display3.getCurrentSizeRange(point, new Point());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display3.getMetrics(displayMetrics);
            int i4 = point.x;
            agrf agrfVar = twm.a;
            iMax = Math.max((int) ((i4 / displayMetrics.density) + 0.5f), iMax);
        }
        return aP(twm.l(iMax));
    }

    public static String I(Context context) {
        long jC;
        String string;
        String str = c;
        if (str == null) {
            ContentResolver contentResolver = context.getContentResolver();
            try {
                jC = lsx.a.c(contentResolver, 0L);
            } catch (SecurityException unused) {
                jC = 0;
            }
            if (jC != 0) {
                string = String.valueOf(jC);
            } else {
                string = Settings.Secure.getString(contentResolver, "android_id");
                if (string == null) {
                    string = "0";
                }
            }
            str = string;
            c = str;
        }
        return str;
    }

    public static String J() {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.HARDWARE + ';' + tyr.a("ro.board.platform");
        }
        return Build.SOC_MANUFACTURER + ';' + Build.SOC_MODEL;
    }

    public static Activity K(Context context) {
        for (int i = 0; i < 10000; i++) {
            context.getClass();
            if (context instanceof Service) {
                throw new IllegalArgumentException("Cannot get an Activity from a Service");
            }
            if (context instanceof Application) {
                throw new IllegalArgumentException("Cannot get a singular Activity from an Application");
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                throw new IllegalArgumentException("Unknown Context type: ".concat(String.valueOf(context.getClass().getSimpleName())));
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        throw new IllegalStateException("Possible Context wrapper loop - chain of wrappers larger than 10000");
    }

    public static Application L(Context context) {
        for (int i = 0; i < 10000; i++) {
            context.getClass();
            if (context instanceof Application) {
                return (Application) context;
            }
            if (context instanceof Service) {
                return ((Service) context).getApplication();
            }
            if (context instanceof Activity) {
                return ((Activity) context).getApplication();
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : context.getApplicationContext();
        }
        throw new IllegalStateException("Possible Context wrapper loop - chain of wrappers larger than 10000");
    }

    public static agev M(Context context) {
        for (int i = 0; i < 10000 && context != null && !(context instanceof Service) && !(context instanceof Application); i++) {
            if (context instanceof Activity) {
                return agev.i((Activity) context);
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return agdf.a;
    }

    public static Object N(Object obj) {
        Object objP = P(obj);
        if (objP != null) {
            return objP;
        }
        throw new IllegalArgumentException(String.format("%s does not extend %s or %s", obj.getClass().getCanonicalName(), gdl.class.getCanonicalName(), auph.class.getCanonicalName()));
    }

    public static Object O(Context context, Class cls) {
        return cls.cast(N(K(context)));
    }

    public static Object P(Object obj) {
        if (obj instanceof gdl) {
            return ((gdl) obj).a();
        }
        if (obj instanceof auph) {
            return ((auph) obj).generatedComponent();
        }
        return null;
    }

    public static agkz Q(Map map, Object obj) {
        if (!map.containsKey(obj)) {
            return agpr.a;
        }
        Set set = (Set) map.get(obj);
        return (set == null || set.isEmpty()) ? agpr.a : agkz.n(set);
    }

    public static Object R(Map map, Object obj, Object obj2) {
        Object obj3 = map.get(obj);
        return (obj3 != null || map.containsKey(obj)) ? obj3 : obj2;
    }

    public static Object S(Map map, Object obj) {
        if (map == null) {
            return null;
        }
        return map.get(obj);
    }

    public static Object T(Map map, Object obj, Object obj2) {
        Class<?> cls = obj2.getClass();
        Object objS = S(map, obj);
        return cls.isInstance(objS) ? objS : obj2;
    }

    public static Object U(Map map, Object obj, Class cls) {
        Object objS = S(map, obj);
        if (cls.isInstance(objS)) {
            return cls.cast(objS);
        }
        return null;
    }

    public static Set V(Map map, Object obj) {
        return !map.containsKey(obj) ? new HashSet() : (Set) map.get(obj);
    }

    public static void W(Map map, Object obj, Object obj2) {
        Set hashSet = (Set) map.get(obj);
        if (hashSet == null) {
            hashSet = new HashSet();
            map.put(obj, hashSet);
        }
        hashSet.add(obj2);
    }

    public static boolean X(Map map, Object obj, Object obj2) {
        if (!map.containsKey(obj) || !((Set) map.get(obj)).contains(obj2)) {
            return false;
        }
        ((Set) map.get(obj)).remove(obj2);
        return true;
    }

    public static void Y(Map map, Object obj) {
        if (map.containsKey(obj)) {
            Set set = (Set) map.get(obj);
            if (set == null || set.isEmpty()) {
                map.remove(obj);
            }
        }
    }

    public static void Z(View view, Drawable drawable) {
        view.getClass();
        int i = bac.a;
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        view.setBackground(drawable);
        view.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean aA(akww akwwVar, long j) {
        akwx akwxVar = akwx.a;
        akwx akwxVar2 = (akwx) akwwVar.c.get(Long.valueOf(j));
        if (akwxVar2 != null) {
            akwxVar = akwxVar2;
        }
        if (akwxVar.b == 1) {
            return ((Boolean) akwxVar.c).booleanValue();
        }
        return false;
    }

    public static void aB(Context context, tph tphVar) {
        aC(context, tphVar.a, context.getString(tphVar.b), tphVar.c, tphVar.d, tphVar.e);
    }

    public static void aC(Context context, String str, String str2, int i, boolean z, boolean z2) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
        notificationChannel.setShowBadge(z);
        if (!z2) {
            notificationChannel.setSound(null, null);
        }
        try {
            notificationManager.createNotificationChannel(notificationChannel);
        } catch (IllegalArgumentException unused) {
        }
    }

    public static /* synthetic */ String aD(int i) {
        return i != 1 ? "FAILURE" : "SUCCESS";
    }

    public static tpq aE(Context context, ahex ahexVar, ahex ahexVar2, tqj tqjVar, String str, rrq rrqVar, Optional optional) {
        int i = tqr.a;
        int iA = tqjVar.a(1073879726);
        if (iA == 1) {
            ahexVar = ahexVar2;
        } else if (iA == 2) {
            ahexVar = new ahdt();
        }
        optional.isPresent();
        boolean zBooleanValue = ((Boolean) optional.orElse(Boolean.TRUE)).booleanValue();
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("common");
        qpqVar.d("common_settings_bootstrap.pb");
        Uri uriA = qpqVar.a();
        qrl qrlVarA = qrm.a();
        aino ainoVar = aino.a;
        qrlVarA.e(ainoVar);
        qrlVarA.f(uriA);
        qrlVarA.g(zBooleanValue);
        qrn qrnVar = new qrn(context.getApplicationContext(), ahexVar);
        qrnVar.c = str;
        qrnVar.b();
        qrnVar.d("com.google.android.libraries.youtube.innertube.pref.startup_uncaught_exception_count");
        qrnVar.e(new tpi(0));
        qrlVarA.b(qrnVar.a());
        return new tpn(omj.U(rrqVar.c(qrlVarA.a())), ainoVar);
    }

    public static String aF(int i) {
        switch (i - 1) {
            case 0:
                return "GET";
            case 1:
                return "POST";
            case 2:
                return "PUT";
            case 3:
                return "DELETE";
            case 4:
                return "HEAD";
            case 5:
                return "OPTIONS";
            case 6:
                return "TRACE";
            default:
                return "PATCH";
        }
    }

    public static tmt aG(tnm tnmVar, mbc mbcVar, int i) {
        long j;
        long j2;
        long j3;
        boolean z;
        long j4;
        long j5;
        Map map = tnmVar.e;
        if (map != null) {
            long epochMilli = mbcVar.f().toEpochMilli();
            String str = (String) map.get("Date");
            long jAQ = str != null ? aQ(str) : 0L;
            String str2 = (String) map.get("Cache-Control");
            int i2 = 0;
            if (str2 != null) {
                String[] strArrSplit = str2.split(",", 0);
                z = false;
                j2 = 0;
                j3 = 0;
                while (i2 < strArrSplit.length) {
                    String strTrim = strArrSplit[i2].trim();
                    if (!strTrim.equals("no-cache") && !strTrim.equals("no-store")) {
                        if (strTrim.startsWith("max-age=")) {
                            try {
                                j3 = Long.parseLong(strTrim.substring(8));
                            } catch (Exception unused) {
                            }
                        } else if (strTrim.startsWith("stale-while-revalidate=")) {
                            j2 = Long.parseLong(strTrim.substring(23));
                        } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                            z = true;
                        }
                        i2++;
                    }
                }
                j = 0;
                i2 = 1;
            } else {
                j = 0;
                j2 = 0;
                j3 = 0;
                z = false;
            }
            if ((i & 1) != 0 && i2 != 0) {
                j3 = 2592000;
            }
            if ((i & 2) != 0 && i2 != 0) {
                j2 = 2592000;
            }
            String str3 = (String) map.get("Expires");
            long jAQ2 = str3 != null ? aQ(str3) : j;
            String str4 = (String) map.get("Last-Modified");
            long jAQ3 = str4 != null ? aQ(str4) : j;
            String str5 = (String) map.get("ETag");
            if (i2 != 0) {
                j4 = epochMilli + (j3 * 1000);
                if (!z) {
                    Long.signum(j2);
                    j5 = (j2 * 1000) + j4;
                }
                tms tmsVarA = tmt.a();
                tmsVarA.a = str5;
                tmsVarA.f(j4);
                tmsVarA.g(j5);
                tmsVarA.e(jAQ);
                tmsVarA.b(jAQ3);
                tmsVarA.d(map);
                return tmsVarA.a();
            }
            j4 = (jAQ <= j || jAQ2 < jAQ) ? j : epochMilli + (jAQ2 - jAQ);
            j5 = j4;
            tms tmsVarA2 = tmt.a();
            tmsVarA2.a = str5;
            tmsVarA2.f(j4);
            tmsVarA2.g(j5);
            tmsVarA2.e(jAQ);
            tmsVarA2.b(jAQ3);
            tmsVarA2.d(map);
            return tmsVarA2.a();
        }
        return null;
    }

    public static /* synthetic */ String aH(int i) {
        return i != 1 ? "PARSED" : "DATA";
    }

    public static tmp aI(byte[] bArr) {
        bArr.getClass();
        return new tmh(bArr);
    }

    public static synchronized ayq aJ(Context context, boolean z, boolean z2) {
        agjz agjzVar;
        afwv afwvVar;
        mef.g();
        lkk lkkVar = z ? new lkk(context, new qqa(new ConcurrentHashMap()), true) : new lkk(context, new qqa(), false);
        agjzVar = new agjz(4);
        if (z2) {
            agjzVar.h(new nqv());
        }
        afwvVar = new afwv(context);
        afwvVar.b = lkkVar;
        return new ayq((List) agke.r(new qpp(afwvVar), new qpt()), (List) agjzVar.g(), Collections.EMPTY_LIST);
    }

    public static synchronized ayq aK(Context context) {
        return aJ(context, false, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, tqj] */
    public static ayq aL(Context context, Optional optional) {
        optional.isPresent();
        ?? r0 = optional.get();
        int i = tqr.a;
        Optional optionalOfNullable = Optional.ofNullable(Boolean.valueOf(r0.k(1073808139)));
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) optionalOfNullable.orElse(bool)).booleanValue();
        optional.isPresent();
        return aJ(context, zBooleanValue, ((Boolean) Optional.ofNullable(Boolean.valueOf(optional.get().k(1073830459))).orElse(bool)).booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, tqj] */
    public static rrq aM(Executor executor, Optional optional, Optional optional2, ayq ayqVar) {
        ?? DirectExecutor;
        qsb qsbVar = qsb.a;
        HashMap map = new HashMap();
        optional.isPresent();
        optional2.isPresent();
        Object obj = optional.get();
        ?? r5 = optional2.get();
        int i = tqr.a;
        int iA = r5.a(1073879726);
        if (iA == 1) {
            DirectExecutor = obj;
        } else if (iA == 2) {
            DirectExecutor = executor;
            DirectExecutor = MoreExecutors.directExecutor();
        }
        DirectExecutor = executor;
        rmp.C(qrr.a, map);
        return new rrq(DirectExecutor, ayqVar, qsbVar, map);
    }

    private static String aN(File file) {
        try {
            if (file.exists()) {
                return file.isDirectory() ? "dir" : "file";
            }
            return "!exist";
        } catch (SecurityException e) {
            String message = e.getMessage();
            return message == null ? "" : message;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    private static boolean aO(File file) {
        boolean z;
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            z = true;
            for (File file2 : fileArrListFiles) {
                if (!file2.isDirectory() ? !file2.delete() : !aO(file2)) {
                    z = false;
                } else if (z) {
                    z = true;
                } else {
                    z = false;
                }
            }
        } else {
            z = true;
        }
        return file.delete() && z;
    }

    private static aloj aP(int i) {
        if (i == 1 || i == 2) {
            return aloj.SMALL_FORM_FACTOR;
        }
        return (i == 3 || i == 4) ? aloj.LARGE_FORM_FACTOR : aloj.UNKNOWN_FORM_FACTOR;
    }

    private static long aQ(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                Log.e("Volley", "Unable to parse dateStr: %s, falling back to 0".concat(str), e);
            }
            return 0L;
        }
    }

    public static boolean ab(trz trzVar) {
        int i = tqr.a;
        return ac(1077957440, trzVar);
    }

    public static boolean ac(int i, trz trzVar) {
        tqj tqjVar = tqi.a;
        return (tqjVar == null || trzVar.a() < 0 || (tqjVar.c(i) & (1 << trzVar.a())) == 0) ? false : true;
    }

    public static afvx ad(trz trzVar) {
        return trzVar.c() ? afwt.b(54, trzVar.b()) : trr.a;
    }

    public static afvx ae(trz trzVar, qci qciVar) {
        int i = tqr.a;
        return ac(1077957440, trzVar) ? afwt.b(55, qci.a(((tsa) trzVar).ag, qciVar)) : trr.a;
    }

    public static avni af(avni avniVar, trz trzVar, qci qciVar) {
        return ab(trzVar) ? new gto(trzVar, qciVar, avniVar, 13) : avniVar;
    }

    public static void ag(trz trzVar) {
        if (trzVar.c()) {
            afuu afuuVarD = afwt.d(53, ((tsa) trzVar).ag.a, afux.a, true);
            try {
                afuuVarD.a.p(4);
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

    public static boolean ah(ajvu ajvuVar) {
        ajci ajciVarB = taq.b(ajvuVar);
        ajch ajchVar = ajciVarB.h;
        if (ajchVar == null) {
            ajchVar = ajch.a;
        }
        return (ajciVarB.b & SemanticState.Hidden) != 0 && ajchVar.c;
    }

    public static boolean ai(aqiz aqizVar) {
        aqiy aqiyVar = aqizVar.e;
        if (aqiyVar == null) {
            aqiyVar = aqiy.a;
        }
        if (aqiyVar.b) {
            return aqiyVar.c || aqiyVar.e || aqiyVar.f || aqiyVar.g || aqiyVar.o || aqiyVar.m || aqiyVar.n || aqiyVar.q;
        }
        return false;
    }

    public static boolean aj(aqiz aqizVar) {
        if (aqizVar.c) {
            aqiy aqiyVar = aqizVar.e;
            if (aqiyVar == null) {
                aqiyVar = aqiy.a;
            }
            if (aqiyVar.b) {
                return true;
            }
        }
        return false;
    }

    public static boolean ak(tre treVar, tqh tqhVar, ajcd ajcdVar) {
        trd trdVar = treVar.h;
        try {
            byte[] byteArray = ajcdVar.toByteArray();
            int length = byteArray.length;
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(byteArray, 0, length);
                    gZIPOutputStream.close();
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    int i = tqr.a;
                    int i2 = tqg.a;
                    int length2 = byteArray2.length;
                    if (length2 > 1024) {
                        trdVar.p(159);
                        return false;
                    }
                    trdVar.p(158);
                    tqhVar.c(1610625728, byteArray2);
                    tqhVar.b(1074614976, length2);
                    tqhVar.f(1073828557, true);
                    return true;
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (RuntimeException unused) {
            int i3 = tqr.a;
            tqhVar.c(1610625728, new byte[0]);
            tqhVar.b(1074614976, 0L);
            tqhVar.f(1073828557, false);
            trdVar.p(160);
            return false;
        }
    }

    public static int al(tqj tqjVar) {
        int i = tqr.a;
        int iA = tqjVar.a(1073873468);
        if (iA == 1) {
            return 300;
        }
        if (iA == 2) {
            return 500;
        }
        return iA == 3 ? 750 : 0;
    }

    public static int am(tqj tqjVar) {
        int i = tqr.a;
        if (tqjVar.a(1073873466) == 1) {
            return 50;
        }
        if (tqjVar.a(1073873466) != 2) {
            return tqjVar.a(1073873466) == 3 ? 5 : 0;
        }
        return 1;
    }

    public static int an(tqj tqjVar) {
        if (tqjVar == null) {
            return 0;
        }
        int i = tqr.a;
        return tqjVar.a(1073896578);
    }

    public static int ao(tqj tqjVar) {
        if (tqjVar == null) {
            return 0;
        }
        int i = tqr.a;
        return tqjVar.a(1073896576);
    }

    public static boolean ap(tqj tqjVar) {
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.l(1074279055, 2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean aq(tqj tqjVar) {
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.l(1074026855, 2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean ar(tqj tqjVar) {
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.l(1074026855, 4)) {
                return true;
            }
        }
        return false;
    }

    public static boolean as(tqj tqjVar) {
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.l(1074026855, 1)) {
                return true;
            }
        }
        return false;
    }

    public static boolean at(tqj tqjVar) {
        int i = tqr.a;
        return tqjVar.l(1074420144, SemanticState.Focused);
    }

    public static boolean au(tqj tqjVar) {
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.l(1074420144, 16)) {
                return true;
            }
        }
        return false;
    }

    public static boolean av(tqj tqjVar) {
        int i = tqr.a;
        return (tqjVar.a(1074016900) & 1) != 0;
    }

    public static byte[] aw(long[] jArr, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (jArr[i2 >> 3] >> ((i2 & 7) << 3));
        }
        return bArr;
    }

    public static long[] ax(byte[] bArr) {
        long[] jArr = new long[(bArr.length + 7) >> 3];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i >> 3;
            jArr[i2] = jArr[i2] | (((long) (bArr[i] & 255)) << ((i & 7) << 3));
        }
        return jArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static double ay(akww akwwVar, long j) {
        akwx akwxVar = akwx.a;
        akwx akwxVar2 = (akwx) akwwVar.c.get(Long.valueOf(j));
        if (akwxVar2 != null) {
            akwxVar = akwxVar2;
        }
        if (akwxVar.b == 4) {
            return ((Double) akwxVar.c).doubleValue();
        }
        return 0.0d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long az(akww akwwVar, long j) {
        akwx akwxVar = akwx.a;
        akwx akwxVar2 = (akwx) akwwVar.c.get(Long.valueOf(j));
        if (akwxVar2 != null) {
            akwxVar = akwxVar2;
        }
        if (akwxVar.b == 2) {
            return ((Long) akwxVar.c).longValue();
        }
        return 0L;
    }

    public static Intent b(Context context, String str, String str2, String str3, Uri uri) {
        if (str == null) {
            str = context.getString(R.string.share_untitled);
        }
        String strB = axg.a().b(str);
        Intent intentC = c();
        if (str2 == null) {
            str2 = context.getString(R.string.share_subject, strB);
        }
        String string = str3 != null ? context.getString(R.string.share_playlist, str3, uri) : context.getString(R.string.share_text, strB, uri);
        intentC.putExtra("android.intent.extra.SUBJECT", str2);
        intentC.putExtra("android.intent.extra.TEXT", string);
        return intentC;
    }

    public static Intent c() {
        return new Intent().setAction("android.intent.action.SEND").setType("text/plain").setFlags(524288);
    }

    public static List d(PackageManager packageManager) {
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(c(), 65536)) {
            if (resolveInfo != null && resolveInfo.activityInfo != null && resolveInfo.activityInfo.name != null && resolveInfo.activityInfo.applicationInfo != null && resolveInfo.activityInfo.applicationInfo.packageName != null) {
                arrayList.add(resolveInfo);
            }
        }
        return arrayList;
    }

    public static void e(Context context, String str, String str2, Uri uri) {
        Intent intentCreateChooser;
        if (uri == null) {
            intentCreateChooser = null;
        } else {
            intentCreateChooser = Intent.createChooser(b(context, str, str2, str2, uri), context.getText(R.string.send_playlist));
            intentCreateChooser.addFlags(268435456);
            intentCreateChooser.addFlags(262144);
        }
        if (intentCreateChooser != null) {
            context.startActivity(intentCreateChooser);
        } else {
            twu.c(5, "Share playlist error: empty playlist url", null);
        }
    }

    public static void f(Context context, String str) throws Throwable {
        kro.ba(context, str, txz.b(context), new HashSet());
    }

    public static tyh g(int i, int i2) {
        return new tye(new tyl(i, 0), new tyl(i2, 1));
    }

    public static void h(View view, tyh tyhVar, Class cls) {
        if (view.getLayoutParams() != null) {
            i(view, new aeco(cls, view, 1), tyhVar, cls);
        }
    }

    public static void i(View view, awmd awmdVar, tyh tyhVar, Class cls) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ViewGroup.LayoutParams layoutParams2 = (ViewGroup.LayoutParams) awmdVar.io();
            layoutParams2.getClass();
            view.getContext();
            ViewGroup.LayoutParams layoutParamsK = k(cls, layoutParams2);
            if (layoutParamsK != null) {
                tyhVar.a(layoutParamsK);
            }
            view.setLayoutParams(layoutParams2);
            return;
        }
        view.getContext();
        ViewGroup.LayoutParams layoutParamsK2 = k(cls, layoutParams);
        if (layoutParamsK2 == null || !tyhVar.a(layoutParamsK2)) {
            boolean z = a;
        } else {
            view.setLayoutParams(layoutParams);
        }
    }

    public static void j(View view, final int i, final int i2) {
        i(view, new awmd() { // from class: tyd
            @Override // defpackage.awmd, defpackage.awmc
            public final Object io() {
                return new ViewGroup.LayoutParams(i, i2);
            }
        }, g(i, i2), ViewGroup.LayoutParams.class);
    }

    public static ViewGroup.LayoutParams k(Class cls, ViewGroup.LayoutParams layoutParams) {
        try {
            return (ViewGroup.LayoutParams) cls.cast(layoutParams);
        } catch (ClassCastException e) {
            twu.d("SafeLayoutParams", 6, String.format("Error casting %s", layoutParams), e);
            return null;
        }
    }

    public static String l() {
        return UUID.randomUUID().toString();
    }

    static void m(twh twhVar, String str, Throwable th) {
        if (twhVar != null) {
            twhVar.a(str, th);
        }
    }

    public static boolean n(File file, twh twhVar) {
        try {
            Object obj = new tsp(file, 4).a;
            if (obj == null || ((File) obj).delete() || !((File) obj).exists()) {
                return true;
            }
            m(twhVar, "!deleteQuietly, " + aN((File) obj), null);
            return false;
        } catch (Exception e) {
            m(twhVar, "!deleteQuietly", e);
            return false;
        }
    }

    public static boolean o(File file, twh twhVar) {
        try {
            return file.exists();
        } catch (SecurityException e) {
            m(twhVar, "!existsQuietly", e);
            return false;
        }
    }

    public static boolean p(File file, File file2, twh twhVar) {
        try {
            if (file.renameTo(file2) || !file.exists() || (file2.exists() && file2.delete() && file.renameTo(file2))) {
                return true;
            }
            m(twhVar, "!renameQuietly, src=" + aN(file) + ", dst=" + aN(file2), null);
            return false;
        } catch (SecurityException e) {
            m(twhVar, "!renameQuietly", e);
            return false;
        }
    }

    public static void q(Callable callable, twh twhVar) {
        try {
            File file = (File) callable.call();
            if (file != null) {
                file.mkdirs();
            }
        } catch (Exception e) {
            m(twhVar, "!createDirectoryQuietly", e);
        }
    }

    public static void r(File file, twh twhVar) {
        try {
            if (file.exists()) {
                if (!file.isDirectory()) {
                    m(twhVar, "!deleteDirectoryRecursivelyQuietly, !dir", null);
                } else if (!aO(file)) {
                    m(twhVar, "!deleteDirectoryRecursivelyQuietly", null);
                }
            }
        } catch (SecurityException e) {
            m(twhVar, "!deleteDirectoryRecursivelyQuietly", e);
        }
    }

    public static OutputStream s(File file) throws FileNotFoundException {
        try {
            return new FileOutputStream(file, false);
        } catch (FileNotFoundException e) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                throw e;
            }
            parentFile.mkdirs();
            return new FileOutputStream(file);
        }
    }

    public static aihn t(Parcel parcel, aihn aihnVar) {
        Object objH;
        byte[] bArrCreateByteArray = parcel.createByteArray();
        if (bArrCreateByteArray == null) {
            objH = null;
        } else {
            try {
                objH = aihnVar.getParserForType().h(bArrCreateByteArray, ExtensionRegistryLite.getGeneratedRegistry());
            } catch (aiik e) {
                throw new IllegalArgumentException(e);
            }
        }
        return objH != null ? (aihn) objH : aihnVar;
    }

    public static void u(MessageLite messageLite, Parcel parcel) {
        parcel.writeByteArray(messageLite.toByteArray());
    }

    public static boolean v(Parcel parcel) {
        return parcel.readInt() > 0;
    }

    public static String w(int i) {
        try {
            String str = new String(agyn.b(new File(a.bP(i, "/proc/", "/cmdline")), new ahng()), StandardCharsets.ISO_8859_1);
            int iIndexOf = str.indexOf(0);
            return iIndexOf > 0 ? str.substring(0, iIndexOf) : str;
        } catch (Error | Exception unused) {
            return null;
        }
    }

    public static String x(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String y(String str, String str2) {
        int i = typ.a;
        if (ahno.aa(str2)) {
            throw new IllegalArgumentException();
        }
        if (str.indexOf("%s") == str.lastIndexOf("%s")) {
            return String.format(Locale.US, str, str2);
        }
        throw new IllegalArgumentException("only one %s allowed");
    }

    public static float z(float f, float f2, float f3) {
        return (Float.isNaN(f) || f <= f2) ? f2 : Math.min(f, f3);
    }

    public Animation a() {
        return null;
    }

    public void aa(ImageView imageView, Bitmap bitmap) {
        imageView.setImageBitmap(bitmap);
    }

    public tym(char[] cArr) {
    }
}
