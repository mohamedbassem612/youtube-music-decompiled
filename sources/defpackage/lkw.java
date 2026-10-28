package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.net.HttpEngineProviderSingleton;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lkw {
    public static String b = "0";
    private static final String c = "lkw";
    private static kvc e;
    private static boolean f;
    private static final klu d = klu.d;
    public static final Object a = new Object();

    private lkw() {
    }

    public static kvc a() {
        kvc kvcVar;
        synchronized (a) {
            kvcVar = e;
        }
        return kvcVar;
    }

    @Deprecated
    public static void b(Context context) {
        synchronized (a) {
            if (c()) {
                return;
            }
            lky lkyVar = new lky(context, 37401, 1.0f);
            try {
                kro.m(context, "Context must not be null");
                if (HttpEngineProviderSingleton.getInstance(context).shouldUseHttpEngine()) {
                    f = true;
                    lkyVar.a();
                    lkyVar.close();
                    return;
                }
                ClassLoader classLoader = lkw.class.getClassLoader();
                kro.l(classLoader);
                try {
                    classLoader.loadClass("org.chromium.net.CronetEngine");
                    kml.d(context, 11925000);
                    try {
                        kvc kvcVarD = kvc.d(context, kvc.a, "com.google.android.gms.cronet_dynamite");
                        try {
                            Class<?> clsLoadClass = kvcVarD.f.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                            if (clsLoadClass.getClassLoader() == lkw.class.getClassLoader()) {
                                Log.e(c, "ImplVersion class is missing from Cronet module.");
                                throw new kmj(8);
                            }
                            Method method = clsLoadClass.getMethod("getApiLevel", null);
                            Method method2 = clsLoadClass.getMethod("getCronetVersion", null);
                            Integer num = (Integer) method.invoke(null, null);
                            kro.l(num);
                            int iIntValue = num.intValue();
                            String str = (String) method2.invoke(null, null);
                            kro.l(str);
                            b = str;
                            if (iIntValue >= 3) {
                                e = kvcVarD;
                                lkyVar.a();
                                lkyVar.close();
                                return;
                            }
                            Intent intentN = d.n(context, 2, "cr");
                            if (intentN == null) {
                                Log.e(c, "Unable to fetch error resolution intent");
                                throw new kmj(2);
                            }
                            throw new kmk(2, "Google Play Services update is required. The API Level of the client is 3. The API Level of the implementation is " + iIntValue + ". The Cronet implementation version is " + b, intentN);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Exception e2) {
                                Log.e(c, "Unable to read Cronet version from the Cronet module ", e2);
                                throw ((kmj) new kmj(8).initCause(e2));
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (kuy e3) {
                            Log.e(c, "Unable to load Cronet module", e3);
                            throw ((kmj) new kmj(8).initCause(e3));
                        }
                    }
                } catch (ClassNotFoundException e4) {
                    Log.e(c, "Cronet API is not available. Have you included all required dependencies?");
                    throw ((kmj) new kmj(10).initCause(e4));
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    try {
                        lkyVar.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            }
            throw th;
        }
    }

    public static boolean c() {
        boolean z;
        synchronized (a) {
            z = true;
            if (!f) {
                z = a() != null;
            }
        }
        return z;
    }
}
