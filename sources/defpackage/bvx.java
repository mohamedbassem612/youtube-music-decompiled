package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bvx {
    public static final Object a = new Object();
    private static final bvw b = bvw.a;

    public static String a(String str, Throwable th) {
        String strB = b(th);
        if (TextUtils.isEmpty(strB)) {
            return str;
        }
        return str + "\n  " + strB.replace("\n", "\n  ") + '\n';
    }

    public static String b(Throwable th) {
        if (th == null) {
            return null;
        }
        synchronized (a) {
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                if (cause instanceof UnknownHostException) {
                    return "UnknownHostException (no network)";
                }
            }
            return Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
    }

    public static void c(String str, String str2) {
        synchronized (a) {
            b.a(str, str2, null);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        synchronized (a) {
            b.a(str, str2, th);
        }
    }

    public static void e(String str, String str2) {
        synchronized (a) {
            b.b(str, str2, null);
        }
    }

    public static void f(String str, String str2, Throwable th) {
        synchronized (a) {
            b.b(str, str2, th);
        }
    }

    public static void g(String str) {
        synchronized (a) {
            a(str, null);
        }
    }

    public static void h(String str) {
        synchronized (a) {
            a(str, null);
        }
    }
}
