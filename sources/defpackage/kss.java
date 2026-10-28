package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kss {
    public static Boolean a;
    private static Boolean b;
    private static Boolean c;
    private static Boolean d;

    public static boolean a(Context context) {
        return b(context.getPackageManager());
    }

    public static boolean b(PackageManager packageManager) {
        Boolean boolValueOf = d;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
            d = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean c(Context context) {
        return d(context.getPackageManager());
    }

    public static boolean d(PackageManager packageManager) {
        Boolean boolValueOf = b;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            b = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean e(Context context) {
        Boolean boolValueOf = c;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            c = boolValueOf;
        }
        return boolValueOf.booleanValue() && a.aN();
    }
}
