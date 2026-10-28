package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tyr {
    private static Method a;

    static {
        try {
            a = ClassLoader.getSystemClassLoader().loadClass("android.os.SystemProperties").getMethod("get", String.class);
        } catch (Exception unused) {
        }
    }

    public static String a(String str) {
        Method method = a;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(null, str);
        } catch (Exception unused) {
            return null;
        }
    }
}
