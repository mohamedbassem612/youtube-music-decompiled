package defpackage;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eqw {
    public static final String a = "Volley";
    private static final String b = "eqw";

    public static String a(String str, Object... objArr) {
        String str2;
        String str3 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClassName().equals(b)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + '.' + stackTrace[i].getMethodName();
                return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str3);
            }
        }
        str2 = "<unknown>";
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str3);
    }

    public static void b(String str, Object... objArr) {
        Log.e(a, a(str, objArr));
    }

    public static void c(Throwable th, String str, Object... objArr) {
        Log.e(a, a(str, objArr), th);
    }
}
