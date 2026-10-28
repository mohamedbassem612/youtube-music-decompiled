package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kml {
    public static boolean a = false;
    public static boolean b = false;

    @Deprecated
    static final AtomicBoolean c = new AtomicBoolean();
    private static final AtomicBoolean d = new AtomicBoolean();

    @Deprecated
    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009d  */
    @Deprecated
    public static int b(Context context, int i) {
        boolean z;
        PackageInfo packageInfo;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        int i2 = 1;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !d.get()) {
            synchronized (kri.a) {
                if (!kri.b) {
                    kri.b = true;
                    try {
                        Bundle bundle = kte.a.a(context).f(context.getPackageName(), SemanticState.Focused).metaData;
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            kri.c = bundle.getInt("com.google.android.gms.version");
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("MetadataValueReader", "This should never happen.", e);
                    }
                }
            }
            int i3 = kri.c;
            if (i3 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i3 != 264205000) {
                throw new GooglePlayServicesIncorrectManifestValueException(i3);
            }
        }
        if (kss.e(context)) {
            z = false;
        } else {
            if (kss.a == null) {
                kss.a = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (kss.a.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
        }
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
            kmm.a(context);
            if (kmm.c(packageInfo2, true)) {
                if (z) {
                    if (packageInfo == null) {
                        throw new NullPointerException("null reference");
                    }
                    if (kmm.c(packageInfo, true)) {
                        if (!packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                        }
                        return i2;
                    }
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                }
                int i4 = packageInfo2.versionCode;
                int i5 = ksu.a;
                if ((i4 != -1 ? i4 / 1000 : -1) < i / 1000) {
                    Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i + " but found " + packageInfo2.versionCode);
                    i2 = 2;
                } else {
                    ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException e2) {
                            Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e2);
                        }
                    }
                    if (applicationInfo.enabled) {
                        return 0;
                    }
                    i2 = 3;
                }
                return i2;
            }
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            i2 = 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
        }
        return i2;
    }

    public static Context c(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    public static void d(Context context, int i) throws kmk, kmj {
        klu kluVar = klu.d;
        int iM = kluVar.m(context, i);
        if (iM != 0) {
            Intent intentN = kluVar.n(context, iM, "e");
            Log.e("GooglePlayServicesUtil", a.bR(iM, "GooglePlayServices not available due to error "));
            if (intentN != null) {
                throw new kmk(iM, "Google Play Services not available", intentN);
            }
            throw new kmj(iM);
        }
    }

    public static boolean e(Context context) {
        try {
            if (!b) {
                PackageInfo packageInfoG = kte.b(context).g("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                kmm.a(context);
                if (packageInfoG == null || kmm.c(packageInfoG, false) || !kmm.c(packageInfoG, true)) {
                    a = false;
                } else {
                    a = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
        } finally {
            b = true;
        }
        return a || !"user".equals(Build.TYPE);
    }

    public static boolean f(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", SemanticState.Multiline).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
