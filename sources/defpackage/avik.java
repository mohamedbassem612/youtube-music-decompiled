package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avik implements avca {
    public static final Logger a = Logger.getLogger(avik.class.getName());
    private static final avjt c = new avjt();
    private static final agfr b = new avfn(2);

    public avik() {
        agfr agfrVar = b;
        avjt avjtVar = c;
        agfrVar.getClass();
        avjtVar.getClass();
    }

    public static final avbz a(InetSocketAddress inetSocketAddress) throws IOException {
        auzs auzsVar;
        try {
            URI uri = new URI("https", null, inetSocketAddress.getHostString(), inetSocketAddress.getPort(), null, null, null);
            ProxySelector proxySelector = ProxySelector.getDefault();
            if (proxySelector == null) {
                a.logp(Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
                return null;
            }
            List<Proxy> listSelect = proxySelector.select(uri);
            if (listSelect == null || listSelect.isEmpty()) {
                String name = proxySelector.getClass().getName();
                StringBuilder sb = new StringBuilder("ProxySelector ");
                sb.append(name);
                sb.append(" returned ");
                sb.append(listSelect == null ? "null" : "an empty list");
                sb.append(", which violates the java.net.ProxySelector#select(URI) contract");
                throw new IOException(sb.toString());
            }
            if (listSelect.size() > 1) {
                a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
            }
            Proxy proxy = listSelect.get(0);
            if (proxy.type() == Proxy.Type.DIRECT) {
                return null;
            }
            InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
            PasswordAuthentication passwordAuthenticationE = avjt.e(inetSocketAddress2.getHostString(), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
            InetSocketAddress inetSocketAddress3 = inetSocketAddress2.isUnresolved() ? new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort()) : inetSocketAddress2;
            Map map = Collections.EMPTY_MAP;
            inetSocketAddress.getClass();
            inetSocketAddress3.getClass();
            if (passwordAuthenticationE == null) {
                auzsVar = new auzs(inetSocketAddress3, inetSocketAddress, map, null, null);
            } else {
                auzsVar = new auzs(inetSocketAddress3, inetSocketAddress, map, passwordAuthenticationE.getUserName(), passwordAuthenticationE.getPassword() != null ? new String(passwordAuthenticationE.getPassword()) : null);
            }
            return auzsVar;
        } catch (URISyntaxException e) {
            a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e);
            return null;
        }
    }
}
