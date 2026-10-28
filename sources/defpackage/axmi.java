package defpackage;

import java.util.List;
import java.util.Map;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axmi extends UrlResponseInfo {
    private final android.net.http.UrlResponseInfo a;
    private final String b;

    private axmi(android.net.http.UrlResponseInfo urlResponseInfo, String str) {
        this.a = urlResponseInfo;
        this.b = str;
    }

    public static axmi a(android.net.http.UrlResponseInfo urlResponseInfo) {
        if (c(urlResponseInfo)) {
            return null;
        }
        return new axmi(urlResponseInfo, null);
    }

    public static axmi b(android.net.http.UrlResponseInfo urlResponseInfo) {
        if (c(urlResponseInfo)) {
            return null;
        }
        return new axmi(urlResponseInfo, ":0");
    }

    private static boolean c(android.net.http.UrlResponseInfo urlResponseInfo) {
        if (urlResponseInfo == null) {
            return true;
        }
        try {
            urlResponseInfo.getUrl();
            return false;
        } catch (NullPointerException unused) {
            return true;
        }
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final Map getAllHeaders() {
        return this.a.getHeaders().getAsMap();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getAllHeadersAsList() {
        return this.a.getHeaders().getAsList();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final int getHttpStatusCode() {
        return this.a.getHttpStatusCode();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getHttpStatusText() {
        return this.a.getHttpStatusText();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getNegotiatedProtocol() {
        return this.a.getNegotiatedProtocol();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getProxyServer() {
        return this.b;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final long getReceivedByteCount() {
        return this.a.getReceivedByteCount();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getUrl() {
        return this.a.getUrl();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getUrlChain() {
        return this.a.getUrlChain();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final boolean wasCached() {
        return this.a.wasCached();
    }
}
