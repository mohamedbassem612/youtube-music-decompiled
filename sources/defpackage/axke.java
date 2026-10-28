package defpackage;

import android.net.http.Proxy$HttpConnectCallback;
import java.util.List;
import org.chromium.net.AndroidProxyOptions;
import org.chromium.net.Proxy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axke implements Proxy$HttpConnectCallback {
    private final Proxy.HttpConnectCallback a;

    public axke(Proxy.HttpConnectCallback httpConnectCallback) {
        if (!AndroidProxyOptions.areProxyApisEnabled()) {
            throw new AssertionError("AndroidProxy requires the proxy APIs to be enabled");
        }
        this.a = httpConnectCallback;
    }

    public final void onBeforeRequest(Proxy$HttpConnectCallback.Request request) {
        this.a.onBeforeRequest(new axkf(request));
    }

    public final int onResponseReceived(List list, int i) {
        int iOnResponseReceived = this.a.onResponseReceived(list, i);
        if (iOnResponseReceived == 0) {
            return 0;
        }
        if (iOnResponseReceived == 1) {
            return 1;
        }
        throw new AssertionError(String.format("Unknown OnResponseReceivedAction: %d", Integer.valueOf(iOnResponseReceived)));
    }
}
