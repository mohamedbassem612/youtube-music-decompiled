package org.chromium.net;

import android.content.Context;
import android.util.Log;
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public abstract class CronvoyProvider {
    private static final String NATIVE_CRONVOY_PROVIDER_CLASS = "org.chromium.net.impl.NativeCronvoyProvider";
    public static final String PROVIDER_NAME_APP_PACKAGED = "App-Packaged-Cronet-Provider";
    public static final String PROVIDER_NAME_FALLBACK = "Fallback-Cronet-Provider";
    private static final String TAG = "CronvoyProvider";
    protected final Context mContext;

    protected CronvoyProvider(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        }
        this.mContext = context;
    }

    private static boolean addCronvoyProviderImplByClassName(Context context, String str, Set set, boolean z) {
        try {
            set.add((CronvoyProvider) context.getClassLoader().loadClass(str).asSubclass(CronvoyProvider.class).getConstructor(Context.class).newInstance(context));
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

    public static List getAllProviders(Context context) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        addCronvoyProviderImplByClassName(context, NATIVE_CRONVOY_PROVIDER_CLASS, linkedHashSet, false);
        return DesugarCollections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    private static void logReflectiveOperationException(String str, boolean z, Exception exc) {
        if (z) {
            Log.e(TAG, "Unable to load provider class: ".concat(String.valueOf(str)), exc);
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
