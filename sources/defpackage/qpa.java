package defpackage;

import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContextSpi;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class qpa extends SSLContextSpi {
    private KeyManager[] a;
    private TrustManager[] b;
    private SecureRandom c;

    @Override // javax.net.ssl.SSLContextSpi
    public final SSLEngine engineCreateSSLEngine() {
        return null;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final /* bridge */ /* synthetic */ SSLSessionContext engineGetClientSessionContext() {
        return null;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final /* bridge */ /* synthetic */ SSLSessionContext engineGetServerSessionContext() {
        return null;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final SSLServerSocketFactory engineGetServerSocketFactory() {
        return null;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final SSLSocketFactory engineGetSocketFactory() {
        return new qpf(this.a, this.b, this.c);
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final void engineInit(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, SecureRandom secureRandom) {
        this.a = keyManagerArr;
        this.b = trustManagerArr;
        this.c = secureRandom;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final SSLEngine engineCreateSSLEngine(String str, int i) {
        return null;
    }
}
