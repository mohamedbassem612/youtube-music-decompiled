package org.chromium.base;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.util.ArrayMap;
import dalvik.system.BaseDexClassLoader;
import defpackage.axjn;
import defpackage.axjs;
import j$.util.DesugarCollections;
import java.lang.reflect.Field;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class BundleUtils {
    public static final ArrayMap a = new ArrayMap();
    private static Boolean b;

    static {
        DesugarCollections.synchronizedMap(new ArrayMap());
    }

    public static String a(String str) {
        int iBinarySearch;
        ApplicationInfo applicationInfo = JniAndroid.a.getApplicationInfo();
        String[] strArr = applicationInfo.splitNames;
        if (strArr == null || (iBinarySearch = Arrays.binarySearch(strArr, str)) < 0) {
            return null;
        }
        return applicationInfo.splitSourceDirs[iBinarySearch];
    }

    public static void b(Context context, ClassLoader classLoader) throws IllegalAccessException, NoSuchFieldException {
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        Field declaredField = context.getClass().getDeclaredField("mClassLoader");
        declaredField.setAccessible(true);
        declaredField.set(context, classLoader);
    }

    public static boolean c(String str) {
        Boolean boolValueOf = b;
        if (boolValueOf == null) {
            String[] strArr = JniAndroid.a.getApplicationInfo().splitNames;
            boolValueOf = Boolean.valueOf(strArr != null && strArr.length > 0);
            b = boolValueOf;
        }
        return boolValueOf.booleanValue() && a(str) != null;
    }

    private static String d(String str, String str2) {
        String strA = a(str2);
        if (strA == null) {
            return null;
        }
        ApplicationInfo applicationInfo = JniAndroid.a.getApplicationInfo();
        return strA + "!/lib/" + ((String) applicationInfo.getClass().getField("primaryCpuAbi").get(applicationInfo)) + '/' + System.mapLibraryName(str);
    }

    public static String getNativeLibraryPath(String str, String str2) {
        axjn axjnVarA = axjn.a();
        try {
            String strFindLibrary = ((BaseDexClassLoader) BundleUtils.class.getClassLoader()).findLibrary(str);
            if (strFindLibrary == null) {
                ClassLoader classLoader = JniAndroid.a.getClassLoader();
                if (classLoader instanceof BaseDexClassLoader) {
                    strFindLibrary = ((BaseDexClassLoader) classLoader).findLibrary(str);
                } else if (classLoader instanceof axjs) {
                    throw null;
                }
                if (strFindLibrary == null) {
                    strFindLibrary = d(str, str2);
                }
            }
            axjnVarA.close();
            return strFindLibrary;
        } catch (Throwable th) {
            try {
                axjnVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean hasAnyInstalledSplits() {
        Boolean boolValueOf = b;
        if (boolValueOf == null) {
            String[] strArr = JniAndroid.a.getApplicationInfo().splitNames;
            boolean z = false;
            if (strArr != null && strArr.length > 0) {
                z = true;
            }
            boolValueOf = Boolean.valueOf(z);
            b = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
