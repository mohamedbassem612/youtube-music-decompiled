package defpackage;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import org.chromium.net.ExperimentalCronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axsk implements URLStreamHandlerFactory {
    private final ExperimentalCronetEngine a;

    public axsk(ExperimentalCronetEngine experimentalCronetEngine) {
        this.a = experimentalCronetEngine;
    }

    @Override // java.net.URLStreamHandlerFactory
    public final URLStreamHandler createURLStreamHandler(String str) {
        if ("http".equals(str) || "https".equals(str)) {
            return new axsh(this.a);
        }
        return null;
    }
}
