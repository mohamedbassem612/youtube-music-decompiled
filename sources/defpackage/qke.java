package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qke {
    public static final /* synthetic */ int a = 0;
    private static Boolean b;
    private static final afv c = new afv();

    public static synchronized Uri a(String str) {
        Uri uri;
        afv afvVar = c;
        uri = (Uri) afvVar.get(str);
        if (uri == null) {
            uri = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode(str))));
            afvVar.put(str, uri);
        }
        return uri;
    }

    public static File b(Context context) {
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

    public static String c(String str) {
        int iIndexOf = str.indexOf("#");
        if (iIndexOf >= 0) {
            return str.substring(0, iIndexOf);
        }
        if (str.contains("@")) {
            throw new IllegalArgumentException("Invalid package name: ".concat(String.valueOf(str)));
        }
        return str;
    }

    public static boolean d() {
        Boolean boolValueOf = b;
        if (boolValueOf == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
                b = boolValueOf;
            } else {
                try {
                    Object objInvoke = Process.class.getMethod("isIsolated", null).invoke(Process.class, null);
                    objInvoke.getClass();
                    boolValueOf = (Boolean) objInvoke;
                    boolValueOf.booleanValue();
                    b = boolValueOf;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                    b = boolValueOf;
                }
            }
        }
        return boolValueOf.booleanValue();
    }

    public static String e(Context context, String str) {
        if (str.contains("#")) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(String.valueOf(str)));
        }
        return str + '#' + context.getPackageName();
    }
}
