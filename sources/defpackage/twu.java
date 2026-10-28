package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class twu {
    public static String a = "YT";

    public static String a(String str, boolean z) {
        if (str.length() <= 23) {
            return str;
        }
        String strSubstring = str.substring(0, 23);
        if (!z) {
            d(strSubstring, 5, String.format("Tag [%s] is too long; truncated to [%s]", str, strSubstring), null);
        }
        return strSubstring;
    }

    public static String b(String str) {
        return a(String.format("%s.%s", "YT", str), true);
    }

    public static void c(int i, String str, Throwable th) {
        d(a, i, str, th);
    }

    public static void d(String str, int i, String str2, Throwable th) {
        if (str2 == null) {
            str2 = "null";
        }
        if (i != 4) {
            if (i != 5) {
                Log.e(str, str2, th);
            } else {
                Log.w(str, str2, th);
            }
        }
    }
}
