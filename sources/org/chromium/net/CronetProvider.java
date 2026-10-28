package org.chromium.net;

import android.content.Context;
import android.net.http.HttpEngine;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.util.Log;
import defpackage.a;
import defpackage.axkg;
import defpackage.axlq;
import defpackage.axnh;
import j$.util.DesugarCollections;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.chromium.base.Callback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class CronetProvider {
    static final int EMBEDDED_CRONET_PROVIDER_SCORE = 5;
    static final int FALLBACK_CRONET_PROVIDER_SCORE = 1;
    private static final String GMS_CORE_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.GmsCoreCronetProvider";
    private static final String HTTPENGINE_PROVIDER_CLASS = "org.chromium.net.impl.HttpEngineNativeProvider";
    private static final String JAVA_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.JavaCronetProvider";
    private static final String NATIVE_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.NativeCronetProvider";
    static final int NOT_PREFERRED_HTTP_ENGINE_PROVIDER_SCORE = 2;
    private static final String PLAY_SERVICES_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.PlayServicesCronetProvider";
    static final int PLAY_SERVICES_CRONET_PROVIDER_SCORE = 3;
    static final int PREFERRED_HTTP_ENGINE_PROVIDER_SCORE = 4;
    static final String PREFERRED_MINIMUM_HTTPENGINE_VERSION_HTTP_FLAG_NAME = "Cronet_PreferredMinimumHttpEngineVersion";
    public static final String PROVIDER_NAME_APP_PACKAGED = "App-Packaged-Cronet-Provider";
    public static final String PROVIDER_NAME_FALLBACK = "Fallback-Cronet-Provider";
    public static final String PROVIDER_NAME_HTTPENGINE_NATIVE = "HttpEngine-Native-Provider";
    static final int RESOURCES_CRONET_PROVIDER_SCORE = 6;
    private static final String RES_KEY_CRONET_IMPL_CLASS = "CronetProviderClassName";
    private static final String TAG = "CronetProvider";
    protected final Context mContext;

    protected CronetProvider(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        }
        this.mContext = context;
    }

    private static boolean addCronetProviderFromResourceFile(Context context, axnh axnhVar, Set set) {
        String string;
        int identifier = context.getResources().getIdentifier(RES_KEY_CRONET_IMPL_CLASS, "string", context.getPackageName());
        if (identifier == 0 || (string = context.getString(identifier)) == null || string.equals(PLAY_SERVICES_CRONET_PROVIDER_CLASS) || string.equals(GMS_CORE_CRONET_PROVIDER_CLASS) || string.equals(JAVA_CRONET_PROVIDER_CLASS) || string.equals(NATIVE_CRONET_PROVIDER_CLASS) || string.equals(HTTPENGINE_PROVIDER_CLASS)) {
            return false;
        }
        if (!addCronetProviderImplByClassName(context, string, 6, axnhVar, set, true)) {
            Log.e("cn_".concat(String.valueOf(TAG)), a.bT(string, "Unable to instantiate Cronet implementation class ", " that is listed as in the app string resource file under CronetProviderClassName key"));
        }
        return true;
    }

    private static boolean addCronetProviderImplByClassName(Context context, String str, int i, axnh axnhVar, Set set, boolean z) {
        try {
            Constructor constructor = context.getClassLoader().loadClass(str).asSubclass(CronetProvider.class).getConstructor(Context.class);
            axkg axkgVar = new axkg();
            axkgVar.a = (CronetProvider) constructor.newInstance(context);
            axkgVar.b = i;
            axkgVar.c = axnhVar;
            set.add(axkgVar);
            return true;
        } catch (ClassNotFoundException e) {
            logReflectiveOperationException(str, z, e);
            return false;
        } catch (IllegalAccessException e2) {
            logReflectiveOperationException(str, z, e2);
            return false;
        } catch (InstantiationException e3) {
            logReflectiveOperationException(str, z, e3);
            return false;
        } catch (NoSuchMethodException e4) {
            logReflectiveOperationException(str, z, e4);
            return false;
        } catch (InvocationTargetException e5) {
            logReflectiveOperationException(str, z, e5);
            return false;
        }
    }

    private static int calculateHttpEngineNativeProviderScore(Context context) {
        return calculateHttpEngineNativeProviderScoreInternal(context, null);
    }

    static int calculateHttpEngineNativeProviderScoreInternal(Context context, String str) {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(31) < 7) {
            return Integer.MIN_VALUE;
        }
        axlq axlqVar = (axlq) Callback.Helper.c(context).d().get(PREFERRED_MINIMUM_HTTPENGINE_VERSION_HTTP_FLAG_NAME);
        String strD = axlqVar == null ? "133.0.6876.3" : axlqVar.d();
        if (str == null) {
            str = HttpEngine.getVersionString();
        }
        return compareVersions(str, strD) >= 0 ? 4 : 2;
    }

    static int compareVersions(String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("The input values cannot be null");
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        if (strArrSplit.length != strArrSplit2.length) {
            throw new IllegalArgumentException(a.ca(str2, str, "Version strings must have an equal number of segments for comparison: ", " vs "));
        }
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                int i2 = Integer.parseInt(strArrSplit[i]);
                int i3 = Integer.parseInt(strArrSplit2[i]);
                if (i2 != i3) {
                    return Integer.compare(i2, i3);
                }
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Unable to convert version segments into integers: " + strArrSplit[i] + " & " + strArrSplit2[i], e);
            }
        }
        return 0;
    }

    static List getAllProviderInfos(Context context) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        addCronetProviderFromResourceFile(context, axnh.CRONET_SOURCE_UNSPECIFIED, linkedHashSet);
        axnh axnhVar = axnh.CRONET_SOURCE_PLAY_SERVICES;
        addCronetProviderImplByClassName(context, PLAY_SERVICES_CRONET_PROVIDER_CLASS, 3, axnhVar, linkedHashSet, false);
        addCronetProviderImplByClassName(context, GMS_CORE_CRONET_PROVIDER_CLASS, 3, axnhVar, linkedHashSet, false);
        addCronetProviderImplByClassName(context, NATIVE_CRONET_PROVIDER_CLASS, 5, axnh.CRONET_SOURCE_STATICALLY_LINKED, linkedHashSet, false);
        addCronetProviderImplByClassName(context, HTTPENGINE_PROVIDER_CLASS, calculateHttpEngineNativeProviderScore(context), axnh.CRONET_SOURCE_PLATFORM, linkedHashSet, false);
        addCronetProviderImplByClassName(context, JAVA_CRONET_PROVIDER_CLASS, 1, axnh.CRONET_SOURCE_FALLBACK, linkedHashSet, false);
        return DesugarCollections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public static List getAllProviders(Context context) {
        ArrayList arrayList = new ArrayList();
        Iterator it = getAllProviderInfos(context).iterator();
        while (it.hasNext()) {
            arrayList.add(((axkg) it.next()).a);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private static void logReflectiveOperationException(String str, boolean z, Exception exc) {
        if (z) {
            Log.e("cn_".concat(String.valueOf(TAG)), "Unable to load provider class: ".concat(String.valueOf(str)), exc);
        }
    }

    public abstract CronetEngine.Builder createBuilder();

    public abstract String getName();

    public abstract String getVersion();

    public abstract boolean isEnabled();

    public String toString() {
        return "[class=" + getClass().getName() + ", name=" + getName() + ", version=" + getVersion() + ", enabled=" + isEnabled() + ']';
    }
}
