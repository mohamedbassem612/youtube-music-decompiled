package defpackage;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import org.chromium.net.ExperimentalCronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axsh extends URLStreamHandler {
    private final ExperimentalCronetEngine a;

    public axsh(ExperimentalCronetEngine experimentalCronetEngine) {
        this.a = experimentalCronetEngine;
    }

    @Override // java.net.URLStreamHandler
    public final URLConnection openConnection(URL url) {
        return this.a.openConnection(url);
    }

    @Override // java.net.URLStreamHandler
    public final URLConnection openConnection(URL url, Proxy proxy) {
        return this.a.openConnection(url, proxy);
    }
}
