package defpackage;

import android.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qpf extends SSLSocketFactory {
    public static qpc a = null;
    private static final String b = "qpf";
    private final KeyManager[] c;
    private final TrustManager[] d;
    private final SecureRandom e;

    public qpf(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, SecureRandom secureRandom) {
        this.c = keyManagerArr;
        this.d = trustManagerArr;
        this.e = secureRandom;
    }

    private final SSLSocketFactory a(Provider provider) {
        try {
            SSLContext sSLContext = provider != null ? SSLContext.getInstance("TLS", provider) : SSLContext.getInstance("TLS");
            TrustManager[] trustManagerArr = this.d;
            if (trustManagerArr == null || trustManagerArr.length <= 0 || !(trustManagerArr[0] instanceof qpg)) {
                sSLContext.init(this.c, trustManagerArr, this.e);
            } else {
                sSLContext.init(null, null, null);
            }
            return sSLContext.getSocketFactory();
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private final SSLSocketFactory b() {
        SSLSocketFactory sSLSocketFactoryA;
        aero aeroVar = aero.c;
        int i = aeroVar.a;
        a.a(aeroVar);
        SSLSocketFactory sSLSocketFactoryA2 = a(null);
        if (sSLSocketFactoryA2 != null && !(sSLSocketFactoryA2 instanceof qpf)) {
            return sSLSocketFactoryA2;
        }
        for (Provider provider : Security.getProviders()) {
            if (!(provider instanceof qpd) && ((provider.stringPropertyNames().contains("SSLContext.TLS") || provider.getService("SSLContext", "TLS") != null) && (sSLSocketFactoryA = a(provider)) != null && !(sSLSocketFactoryA instanceof qpf))) {
                return sSLSocketFactoryA;
            }
        }
        String strConcat = "[";
        for (Provider provider2 : Security.getProviders()) {
            strConcat = strConcat.concat(String.valueOf(provider2.toString())).concat((provider2.stringPropertyNames().contains("SSLContext.TLS") || provider2.getService("SSLContext", "TLS") != null) ? "(true), " : "(false), ");
        }
        Log.e(b, strConcat.concat("]"));
        throw new RuntimeException("Unable to find a default SSL provider.");
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return b().createSocket();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        try {
            return b().getDefaultCipherSuites();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        try {
            return b().getSupportedCipherSuites();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        return b().createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return b().createSocket(str, i, inetAddress, i2);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return b().createSocket(inetAddress, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return b().createSocket(inetAddress, i, inetAddress2, i2);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return b().createSocket(socket, str, i, z);
    }
}
