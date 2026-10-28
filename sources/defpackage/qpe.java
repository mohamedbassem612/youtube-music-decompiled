package defpackage;

import android.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qpe extends SSLServerSocketFactory {
    public static qpc a;
    private static final String b = "qpf";

    private static final SSLServerSocketFactory a(Provider provider) {
        try {
            return provider != null ? SSLContext.getInstance("Default", provider).getServerSocketFactory() : SSLContext.getInstance("Default").getServerSocketFactory();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static final SSLServerSocketFactory b() {
        SSLServerSocketFactory sSLServerSocketFactoryA;
        aero aeroVar = aero.c;
        int i = aeroVar.a;
        a.a(aeroVar);
        SSLServerSocketFactory sSLServerSocketFactoryA2 = a(null);
        if (sSLServerSocketFactoryA2 != null && !(sSLServerSocketFactoryA2 instanceof qpe)) {
            return sSLServerSocketFactoryA2;
        }
        for (Provider provider : Security.getProviders()) {
            if (!(provider instanceof qpd) && ((provider.stringPropertyNames().contains("SSLContext.Default") || provider.getService("SSLContext", "Default") != null) && (sSLServerSocketFactoryA = a(provider)) != null && !(sSLServerSocketFactoryA instanceof qpe))) {
                return sSLServerSocketFactoryA;
            }
        }
        String strConcat = "[";
        for (Provider provider2 : Security.getProviders()) {
            strConcat = strConcat.concat(String.valueOf(provider2.toString())).concat((provider2.stringPropertyNames().contains("SSLContext.Default") || provider2.getService("SSLContext", "Default") != null) ? "(true), " : "(false), ");
        }
        Log.e(b, strConcat.concat("]"));
        throw new RuntimeException("Unable to find a default SSL provider.");
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i) {
        return b().createServerSocket(i);
    }

    @Override // javax.net.ssl.SSLServerSocketFactory
    public final String[] getDefaultCipherSuites() {
        try {
            return b().getDefaultCipherSuites();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // javax.net.ssl.SSLServerSocketFactory
    public final String[] getSupportedCipherSuites() {
        try {
            return b().getSupportedCipherSuites();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i, int i2) {
        return b().createServerSocket(i, i2);
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i, int i2, InetAddress inetAddress) {
        return b().createServerSocket(i, i2, inetAddress);
    }
}
