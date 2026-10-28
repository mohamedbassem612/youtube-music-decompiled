package org.chromium.net;

import android.net.http.HttpEngine;
import android.os.Build;
import android.os.ext.SdkExtensions;
import defpackage.axke;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class AndroidProxyOptions {
    private AndroidProxyOptions() {
    }

    public static void apply(HttpEngine.Builder builder, ProxyOptions proxyOptions) {
        if (!areProxyApisEnabled()) {
            throw new UnsupportedOperationException("Proxy APIs are not supported");
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Proxy proxy : proxyOptions.getProxyList()) {
            int i2 = 1;
            if (proxy == null) {
                i = 1;
            } else {
                if (!areProxyApisEnabled()) {
                    throw new AssertionError("AndroidProxy requires the proxy APIs to be enabled");
                }
                int scheme = proxy.getScheme();
                if (!areProxyApisEnabled()) {
                    throw new AssertionError("AndroidProxy requires the proxy APIs to be enabled");
                }
                if (scheme == 0) {
                    i2 = 0;
                } else if (scheme != 1) {
                    throw new AssertionError(String.format("Unknown scheme %d", Integer.valueOf(scheme)));
                }
                arrayList.add(android.net.http.Proxy.createHttpProxy(i2, proxy.getHost(), proxy.getPort(), proxy.getExecutor(), new axke(proxy.getCallback())));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        builder.setProxyOptions(android.net.http.ProxyOptions.fromProxyList(arrayList, i));
    }

    public static boolean areProxyApisEnabled() {
        return Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(31) >= 22;
    }
}
