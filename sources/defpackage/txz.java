package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class txz {
    private static final txz a = new txz();
    private volatile Boolean b;
    private volatile Boolean c;
    private volatile Boolean d;
    private volatile Boolean e;
    private volatile String f;
    private volatile Integer g;

    public static int a(Context context) {
        context.getClass();
        txz txzVar = a;
        if (txzVar.g == null) {
            try {
                txzVar.g = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException e) {
                twu.d(twu.a, 5, "could not retrieve application version code", e);
                txzVar = a;
                txzVar.g = 0;
            }
        }
        return txzVar.g.intValue();
    }

    public static String b(Context context) {
        context.getClass();
        txz txzVar = a;
        String strH = txzVar.f;
        if (strH == null) {
            synchronized (txzVar) {
                strH = txzVar.f;
                if (strH == null) {
                    try {
                        strH = h(context, "pref_override_build_version_name");
                        if (TextUtils.isEmpty(strH)) {
                            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                            strH = packageInfo.versionName != null ? packageInfo.versionName : "Unset";
                        }
                        String strH2 = h(context, "pref_override_build_type");
                        if (!TextUtils.isEmpty(strH2)) {
                            if (strH.lastIndexOf("-") > 0) {
                                strH = strH.substring(0, strH.lastIndexOf(45) - 1);
                            }
                            if (!"RELEASE".equals(strH2)) {
                                strH = a.cl(strH2, (byte) 45, strH);
                            }
                        }
                        if (TextUtils.isEmpty(strH)) {
                            strH = "Unknown";
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        twu.d(twu.a, 5, "could not retrieve application version name", e);
                        strH = "Unknown";
                    }
                    a.f = strH;
                }
            }
        }
        return strH;
    }

    public static void c(Context context, Executor executor, Class cls, int i) {
        context.getClass();
        executor.getClass();
        executor.execute(new kdw(context.getApplicationContext(), cls, i, 3));
    }

    public static boolean d(Context context) {
        context.getClass();
        txz txzVar = a;
        if (txzVar.c == null) {
            txzVar.c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"));
        }
        return txzVar.c.booleanValue();
    }

    public static boolean e(Context context) {
        context.getClass();
        txz txzVar = a;
        if (txzVar.e == null) {
            txzVar.e = Boolean.valueOf(context.getPackageManager().hasSystemFeature("org.chromium.arc"));
        }
        return txzVar.e.booleanValue();
    }

    public static boolean f(Context context) {
        context.getClass();
        txz txzVar = a;
        if (txzVar.b == null) {
            txzVar.b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.television"));
        }
        return txzVar.b.booleanValue();
    }

    public static boolean g(Context context) {
        context.getClass();
        txz txzVar = a;
        if (txzVar.d == null) {
            txzVar.d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return txzVar.d.booleanValue();
    }

    private static String h(Context context, String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (defaultSharedPreferences != null) {
            return defaultSharedPreferences.getString(str, "");
        }
        return null;
    }
}
