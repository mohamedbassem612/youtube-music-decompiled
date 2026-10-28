package com.google.android.gms.net;

import android.content.Context;
import defpackage.kyr;
import defpackage.lqd;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class HttpEngineProviderSingleton {
    private static final String TAG = "com.google.android.gms.net.HttpEngineProviderSingleton";
    private static HttpEngineProviderSingleton httpEngineProviderSingleton;
    private CronetProvider httpEngineProvider;

    private HttpEngineProviderSingleton(Context context) {
        try {
            if (shouldOverrideWithHttpEngine(context)) {
                CronetProvider cronetProvider = (CronetProvider) Class.forName("org.chromium.net.impl.HttpEngineNativeProvider").asSubclass(CronetProvider.class).getConstructor(Context.class).newInstance(context);
                if (cronetProvider.isEnabled()) {
                    this.httpEngineProvider = cronetProvider;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized HttpEngineProviderSingleton getInstance(Context context) {
        HttpEngineProviderSingleton httpEngineProviderSingleton2;
        httpEngineProviderSingleton2 = httpEngineProviderSingleton;
        if (httpEngineProviderSingleton2 == null) {
            httpEngineProviderSingleton2 = new HttpEngineProviderSingleton(context);
            httpEngineProviderSingleton = httpEngineProviderSingleton2;
        }
        return httpEngineProviderSingleton2;
    }

    private boolean getReflectionValueAsBool(Object obj) {
        return obj != null && ((Boolean) obj).booleanValue();
    }

    private boolean shouldOverrideWithHttpEngine(Context context) {
        try {
            return getReflectionValueAsBool(lqd.f(ExperimentalCronetEngine.class, "shouldOverrideWithHttpEngine", new kyr(Context.class, context)));
        } catch (Throwable unused) {
            return false;
        }
    }

    public CronetProvider getHttpEngineProvider() {
        return this.httpEngineProvider;
    }

    public boolean shouldUseHttpEngine() {
        return this.httpEngineProvider != null;
    }
}
