package org.chromium.net;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ChromiumNetworkAdapter {
    private ChromiumNetworkAdapter() {
    }

    public static URLConnection openConnection(URL url, java.net.Proxy proxy, NetworkTrafficAnnotationTag networkTrafficAnnotationTag) {
        return url.openConnection(proxy);
    }

    public static InputStream openStream(URL url, NetworkTrafficAnnotationTag networkTrafficAnnotationTag) {
        return url.openStream();
    }

    public static URLConnection openConnection(URL url, NetworkTrafficAnnotationTag networkTrafficAnnotationTag) {
        return url.openConnection();
    }
}
