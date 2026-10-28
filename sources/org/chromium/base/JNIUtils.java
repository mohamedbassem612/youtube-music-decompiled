package org.chromium.base;

import android.content.Context;
import android.util.ArrayMap;
import dalvik.system.PathClassLoader;
import defpackage.axjg;
import defpackage.axjn;
import java.util.Locale;
import org.chromium.net.AndroidNetworkLibrary;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class JNIUtils {
    private static final axjg a = new axjg();

    private static ClassLoader getSplitClassLoader(String str) {
        ClassLoader classLoader;
        ClassLoader classLoader2;
        if (!str.isEmpty()) {
            boolean zC = BundleUtils.c(str);
            boolean z = false;
            boolean z2 = true;
            String.format(Locale.US, "Init JNI Classloader for %s. isInstalled=%b", str, Boolean.valueOf(zC));
            if (zC) {
                if (!BundleUtils.c(str)) {
                    return BundleUtils.class.getClassLoader();
                }
                ArrayMap arrayMap = BundleUtils.a;
                synchronized (arrayMap) {
                    classLoader = (ClassLoader) arrayMap.get(str);
                }
                if (classLoader != null) {
                    return classLoader;
                }
                if (BundleUtils.c(str)) {
                    axjn axjnVarA = axjn.a();
                    try {
                        Context contextCreateContextForSplit = JniAndroid.a.createContextForSplit(str);
                        axjnVarA.close();
                        ClassLoader parent = contextCreateContextForSplit.getClassLoader().getParent();
                        Context context = JniAndroid.a;
                        if (!parent.equals(BundleUtils.class.getClassLoader()) && context != null && !parent.equals(context.getClassLoader())) {
                            z = true;
                        }
                        ArrayMap arrayMap2 = BundleUtils.a;
                        synchronized (arrayMap2) {
                            if (z) {
                                if (!arrayMap2.containsKey(str)) {
                                    arrayMap2.put(str, new PathClassLoader(BundleUtils.a(str), context.getClassLoader()));
                                }
                            }
                            ClassLoader classLoader3 = (ClassLoader) arrayMap2.get(str);
                            if (classLoader3 == null) {
                                arrayMap2.put(str, contextCreateContextForSplit.getClassLoader());
                            } else if (!classLoader3.equals(contextCreateContextForSplit.getClassLoader())) {
                                BundleUtils.b(contextCreateContextForSplit, classLoader3);
                            }
                            z2 = z;
                        }
                        AndroidNetworkLibrary.c("Android.IsolatedSplits.ClassLoaderReplaced.".concat(String.valueOf(str)), z2);
                    } catch (Throwable th) {
                        try {
                            axjnVarA.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                ArrayMap arrayMap3 = BundleUtils.a;
                synchronized (arrayMap3) {
                    classLoader2 = (ClassLoader) arrayMap3.get(str);
                }
                return classLoader2;
            }
        }
        return a;
    }
}
