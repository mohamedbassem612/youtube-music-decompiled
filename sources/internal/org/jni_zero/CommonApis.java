package internal.org.jni_zero;

import android.content.ComponentCallbacks2;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.IBinder;
import android.os.Looper;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import app.rive.semantics.SemanticState;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import defpackage.a;
import defpackage.ahwo;
import defpackage.ahwp;
import defpackage.ahws;
import defpackage.aihn;
import defpackage.auiz;
import defpackage.aujj;
import defpackage.aujl;
import defpackage.aujz;
import defpackage.aukd;
import defpackage.auke;
import defpackage.aulb;
import defpackage.auph;
import defpackage.axhi;
import defpackage.axoz;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.KeyGenerator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class CommonApis {
    public static int a;
    public static aulb b;
    private static Thread c;
    private static Context d;
    private static volatile Boolean e;

    public static ahwp A(ahwp ahwpVar, double d2, double d3) {
        return new ahwp(ahwpVar.a, d2, d3);
    }

    public static boolean B(double d2) {
        return d2 > 30.0d && d2 <= 80.0d;
    }

    private static synchronized boolean C(Context context) {
        if (e == null) {
            try {
                e = Boolean.valueOf(aukd.a(context.getPackageManager().getPackageInfo(context.getPackageName(), 64), aukd.c, aukd.d, aukd.b));
            } catch (PackageManager.NameNotFoundException e2) {
                throw new IllegalStateException("Unable to find self package info", e2);
            }
        }
        return e.booleanValue();
    }

    public static /* synthetic */ Object a(Object obj) {
        return (axhi) aihn.parseFrom(axhi.a, (byte[]) obj);
    }

    private static Map arrayToMap(Object[] objArr) {
        int length = objArr.length;
        HashMap map = new HashMap(length >> 1);
        for (int i = 0; i < length; i += 2) {
            map.put(objArr[i], objArr[i + 1]);
        }
        return map;
    }

    public static /* synthetic */ int b(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int c(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int d(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int e(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int f(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int g(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int h(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static /* synthetic */ Object i(Object obj) {
        return new ArrayList();
    }

    public static Object j(Context context) {
        ComponentCallbacks2 componentCallbacks2AJ = a.aJ(context.getApplicationContext());
        boolean z = componentCallbacks2AJ instanceof auph;
        Object[] objArr = {componentCallbacks2AJ.getClass()};
        if (z) {
            return ((auph) componentCallbacks2AJ).generatedComponent();
        }
        throw new IllegalArgumentException(String.format("Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: %s", objArr));
    }

    public static void k() {
        if (c == null) {
            c = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != c) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }

    public static String l() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(SemanticState.Focused);
            return Base64.encodeToString(keyGenerator.generateKey().getEncoded(), 0);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String m(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.waze", 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static Object[] mapToArray(Map map) {
        Object[] objArr = new Object[map.size() << 1];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            objArr[i] = entry.getKey();
            objArr[i + 1] = entry.getValue();
            i += 2;
        }
        return objArr;
    }

    public static int[] n() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
    }

    public static Date o(long j) {
        return new Date((j - 2082844800) * 1000);
    }

    public static int p(long j) {
        if (j <= 2147483647L && j >= -2147483648L) {
            return (int) j;
        }
        StringBuilder sb = new StringBuilder(98);
        sb.append("A cast to int has gone wrong. Please contact the mp4parser discussion group (");
        sb.append(j);
        sb.append(')');
        throw new RuntimeException(sb.toString());
    }

    public static int q(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static Context r(Context context) throws auke {
        Context context2 = d;
        if (context2 != null) {
            return context2;
        }
        int vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(context);
        if (vrCoreClientApiVersion < 9) {
            throw new auke(4);
        }
        try {
            Context contextCreatePackageContext = context.createPackageContext("com.google.vr.vrcore", 3);
            d = contextCreatePackageContext;
            a = vrCoreClientApiVersion;
            return contextCreatePackageContext;
        } catch (PackageManager.NameNotFoundException unused) {
            throw new auke(1);
        }
    }

    public static IBinder s(ClassLoader classLoader) {
        try {
            return (IBinder) classLoader.loadClass("com.google.vr.vrcore.library.VrCreator").newInstance();
        } catch (ClassNotFoundException unused) {
            throw new IllegalStateException("Unable to find dynamic class com.google.vr.vrcore.library.VrCreator");
        } catch (IllegalAccessException unused2) {
            throw new IllegalStateException("Unable to call the default constructor of com.google.vr.vrcore.library.VrCreator");
        } catch (InstantiationException unused3) {
            throw new IllegalStateException("Unable to instantiate the remote class com.google.vr.vrcore.library.VrCreator");
        }
    }

    public static boolean t(Context context) {
        return e != null ? e.booleanValue() : C(context);
    }

    public static Uri u(String str, String str2) {
        return new Uri.Builder().scheme("content").authority(str).path(str2).build();
    }

    public static aujl v(Context context) {
        ArrayList<String> arrayList;
        axoz axozVar = null;
        if ("com.google.vr.vrcore".equals(context.getPackageName())) {
            arrayList = new ArrayList();
            arrayList.add("com.google.vr.vrcore.settings");
        } else {
            List<ResolveInfo> listQueryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("android.content.action.VR_SETTINGS_PROVIDER"), 0);
            if (listQueryIntentContentProviders == null || listQueryIntentContentProviders.isEmpty()) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator<ResolveInfo> it = listQueryIntentContentProviders.iterator();
                while (it.hasNext()) {
                    ProviderInfo providerInfo = it.next().providerInfo;
                    String str = providerInfo.packageName;
                    if (str != null && str.startsWith("com.google.")) {
                        try {
                            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
                            if (packageInfo != null && packageInfo.signatures != null && ((t(context) && aukd.a(packageInfo, aukd.b, aukd.f, aukd.c, aukd.d)) || aukd.a(packageInfo, aukd.a, aukd.e))) {
                                arrayList2.add(providerInfo.authority);
                            }
                        } catch (PackageManager.NameNotFoundException e2) {
                            Log.w("VrParamsProviderFactory", "Package not found: ".concat(str), e2);
                        }
                    }
                }
                arrayList = arrayList2;
            }
        }
        if (arrayList != null) {
            for (String str2 : arrayList) {
                ContentProviderClient contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(str2);
                if (contentProviderClientAcquireContentProviderClient != null) {
                    axozVar = new axoz(contentProviderClientAcquireContentProviderClient, str2);
                    break;
                }
            }
        }
        return axozVar != null ? new auiz((ContentProviderClient) axozVar.a, (String) axozVar.b) : new aujj(context);
    }

    public static float w(aujz aujzVar) {
        if (aujzVar == null || (aujzVar.b & 4) == 0) {
            return 0.003f;
        }
        return aujzVar.e;
    }

    public static DisplayMetrics x(Display display) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            int i = displayMetrics.widthPixels;
            displayMetrics.widthPixels = displayMetrics.heightPixels;
            displayMetrics.heightPixels = i;
        }
        float f = displayMetrics.xdpi;
        displayMetrics.xdpi = displayMetrics.ydpi;
        displayMetrics.ydpi = f;
        return displayMetrics;
    }

    public static Display y(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static int z(ahwp ahwpVar) {
        ahws ahwsVarB = ahwo.b(ahwpVar);
        return ((int) ((Math.round(ahwsVarB.c() * 255.0d) << 16) | (Math.round(ahwsVarB.b() * 255.0d) << 8) | Math.round(ahwsVarB.a() * 255.0d))) | (-16777216);
    }
}
