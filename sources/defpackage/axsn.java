package defpackage;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class axsn {
    private static Context a;

    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(axsn.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static void b() throws Throwable {
        try {
            System.loadLibrary("android_gif_drawable_jni");
        } catch (UnsatisfiedLinkError unused) {
            Context context = a;
            if (context == null) {
                try {
                    context = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", null).invoke(null, null);
                    a = context;
                } catch (Exception e) {
                    throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e);
                }
            }
            kro.bc(context, "android_gif_drawable_jni");
        }
    }
}
