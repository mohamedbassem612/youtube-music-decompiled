package defpackage;

import android.net.http.Proxy$HttpConnectCallback;
import java.util.List;
import org.chromium.net.AndroidProxyOptions;
import org.chromium.net.Proxy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axkf extends Proxy.HttpConnectCallback.Request {
    private final Proxy$HttpConnectCallback.Request a;

    public axkf(Proxy$HttpConnectCallback.Request request) {
        if (!AndroidProxyOptions.areProxyApisEnabled()) {
            throw new AssertionError("AndroidProxy requires the proxy APIs to be enabled");
        }
        this.a = request;
    }

    @Override // org.chromium.net.Proxy.HttpConnectCallback.Request, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // org.chromium.net.Proxy.HttpConnectCallback.Request
    public final void proceed(List list) {
        this.a.proceed(list);
    }
}
