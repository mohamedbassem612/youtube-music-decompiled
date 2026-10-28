package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public interface WebViewNavigationListenerBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    void onFirstContentfulPaint(InvocationHandler invocationHandler, long j);

    void onFirstContentfulPaintMillis(InvocationHandler invocationHandler, long j);

    void onLargestContentfulPaintMillis(InvocationHandler invocationHandler, long j);

    void onNavigationCompleted(InvocationHandler invocationHandler);

    void onNavigationRedirected(InvocationHandler invocationHandler);

    void onNavigationRedirected(InvocationHandler invocationHandler, InvocationHandler invocationHandler2);

    void onNavigationStarted(InvocationHandler invocationHandler);

    void onNavigationVisible(InvocationHandler invocationHandler);

    void onPageDOMContentLoadedEventFired(InvocationHandler invocationHandler);

    void onPageDeleted(InvocationHandler invocationHandler);

    void onPageLoadEventFired(InvocationHandler invocationHandler);

    void onPerformanceMarkMillis(InvocationHandler invocationHandler, String str, long j);

    /* JADX INFO: renamed from: org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    public final /* synthetic */ class CC {
        public static void $default$onNavigationRedirected(WebViewNavigationListenerBoundaryInterface webViewNavigationListenerBoundaryInterface, InvocationHandler invocationHandler, InvocationHandler invocationHandler2) {
        }

        public static void $default$onNavigationVisible(WebViewNavigationListenerBoundaryInterface webViewNavigationListenerBoundaryInterface, InvocationHandler invocationHandler) {
        }
    }
}
