package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class adba {
    public static final /* synthetic */ int a = 0;

    static {
        nwn nwnVar = adbb.a;
    }

    public static nvn a(int i, Context context) {
        nyl nylVar = null;
        if (i != 0) {
            ClassLoader classLoader = context.getClass().getClassLoader();
            if (classLoader == null) {
                Log.w("NativeMemoryAccountant", "Failed to initialize: no ClassLoader");
            } else {
                try {
                    Class<?> clsLoadClass = classLoader.loadClass("dalvik.system.VMRuntime");
                    nylVar = new nyl(clsLoadClass.getMethod("getRuntime", null).invoke(null, null), clsLoadClass.getMethod("registerNativeAllocation", Long.TYPE));
                } catch (ClassNotFoundException e) {
                    Log.w("NativeMemoryAccountant", "Failed to initialize", e);
                } catch (IllegalAccessException e2) {
                    Log.w("NativeMemoryAccountant", "Failed to initialize", e2);
                } catch (NoSuchMethodException e3) {
                    Log.w("NativeMemoryAccountant", "Failed to initialize", e3);
                } catch (InvocationTargetException e4) {
                    Log.w("NativeMemoryAccountant", "Failed to initialize", e4);
                }
            }
        }
        return nylVar == null ? new adax() : nylVar;
    }

    public static acxk b() {
        try {
            return new acxe();
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return new adaa();
        }
    }

    public static boolean c(tqj tqjVar) {
        return tym.an(tqjVar) != 0;
    }
}
