package org.chromium.support_lib_boundary;

import android.os.CancellationSignal;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public interface ProfileBoundaryInterface {
    void addOriginMatchedHeader(String str, String str2, Set set);

    void addQuicHints(Set set);

    void clearAllOriginMatchedHeaders();

    void clearMaxPrefetches();

    void clearMaxPrerenders();

    @Deprecated
    void clearOriginMatchedHeader(String str);

    void clearOriginMatchedHeader(String str, String str2);

    @Deprecated
    void clearPrefetch(String str, Executor executor, InvocationHandler invocationHandler);

    void clearPrefetchTtl();

    void enqueuePreconnect(String str);

    CookieManager getCookieManager();

    Set getCrossOriginIsolatedAllowList();

    GeolocationPermissions getGeoLocationPermissions();

    InvocationHandler getHttpCache();

    int getMaxPrefetches();

    int getMaxPrerenders();

    String getName();

    List getOriginMatchedHeaders(String str, String str2);

    int getPrefetchTtlSeconds();

    ServiceWorkerController getServiceWorkerController();

    WebStorage getWebStorage();

    boolean hasOriginMatchedHeader(String str);

    void preconnect(String str);

    void prefetchUrl(String str, CancellationSignal cancellationSignal, Executor executor, InvocationHandler invocationHandler);

    void prefetchUrl(String str, CancellationSignal cancellationSignal, Executor executor, InvocationHandler invocationHandler, InvocationHandler invocationHandler2);

    void setCrossOriginIsolatedAllowList(Set set);

    void setMaxPrefetches(int i);

    void setMaxPrefetches(Integer num);

    void setMaxPrerenders(int i);

    void setMaxPrerenders(Integer num);

    @Deprecated
    void setOriginMatchedHeader(String str, String str2, Set set);

    void setPrefetchTtlSeconds(int i);

    void setPrefetchTtlSeconds(Integer num);

    void setSpeculativeLoadingConfig(InvocationHandler invocationHandler);

    void warmUpRendererProcess();
}
