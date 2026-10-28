package defpackage;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class awk {
    public static final /* synthetic */ int a = 0;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            SdkExtensions.getExtensionVersion(30);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            SdkExtensions.getExtensionVersion(31);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            SdkExtensions.getExtensionVersion(33);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            SdkExtensions.getExtensionVersion(1000000);
        }
    }

    public static final boolean a(String str, String str2) {
        if (awrc.c("REL", str2)) {
            return false;
        }
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = str2.toUpperCase(locale);
        upperCase.getClass();
        Locale locale2 = Locale.US;
        locale2.getClass();
        String upperCase2 = str.toUpperCase(locale2);
        upperCase2.getClass();
        Integer numD = d(upperCase);
        Integer numD2 = d(upperCase2);
        if (numD != null) {
            if (numD2 != null) {
                numD.intValue();
                numD2.intValue();
            }
        } else if (numD2 != null || upperCase.compareTo(upperCase2) < 0) {
            return false;
        }
        return true;
    }

    public static final boolean b() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            String str = Build.VERSION.CODENAME;
            str.getClass();
            if (a("S", str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 32) {
            String str = Build.VERSION.CODENAME;
            str.getClass();
            if (a("Tiramisu", str)) {
                return true;
            }
        }
        return false;
    }

    private static final Integer d(String str) {
        return awrc.c(str, "BAKLAVA") ? 0 : null;
    }
}
