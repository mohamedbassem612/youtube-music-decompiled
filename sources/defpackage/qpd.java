package defpackage;

import java.security.Provider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qpd extends Provider {
    public qpd(byte[] bArr) {
        super("Ssl_Guard", 1.01d, "Makes SSL Connections wait for security patches.");
        String name = qpa.class.getName();
        put("SSLContext.SSL", name);
        put("SSLContext.SSLv3", name);
        put("SSLContext.TLS", name);
        put("SSLContext.TLSv1", name);
        put("SSLContext.TLSv1.1", name);
        put("SSLContext.TLSv1.2", name);
        put("SSLContext.Default", name);
    }

    public qpd() {
        throw null;
    }
}
