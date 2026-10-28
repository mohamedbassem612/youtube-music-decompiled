package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agfv {
    public static final /* synthetic */ int a = 0;
    private static final Object b;

    static {
        Object objInvoke = null;
        try {
            objInvoke = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (Throwable th) {
            f(th);
        }
        b = objInvoke;
        if (objInvoke != null) {
            e("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (objInvoke != null) {
            g(objInvoke);
        }
    }

    public static String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static Throwable b(Throwable th, Class cls) {
        try {
            return (Throwable) cls.cast(th.getCause());
        } catch (ClassCastException e) {
            e.initCause(th);
            throw e;
        }
    }

    public static void c(Throwable th, Class cls) throws Throwable {
        if (cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    public static void d(Throwable th) {
        th.getClass();
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    private static Method e(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (Throwable th) {
            f(th);
            return null;
        }
    }

    private static void f(Throwable th) {
        if (th.getClass().getName().equals("java.lang.ThreadDeath")) {
            throw ((Error) th);
        }
    }

    private static void g(Object obj) {
        try {
            Method methodE = e("getStackTraceDepth", Throwable.class);
            if (methodE != null) {
                methodE.invoke(obj, new Throwable());
            }
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
        }
    }
}
