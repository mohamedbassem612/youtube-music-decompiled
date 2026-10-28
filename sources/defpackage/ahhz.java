package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahhz {
    public static final ThreadLocal a = new ahhy();

    public static SecureRandom a() {
        Provider providerA = ahgn.a();
        if (providerA != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", providerA);
            } catch (GeneralSecurityException unused) {
            }
        }
        Provider provider = null;
        try {
            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
        } catch (Throwable unused2) {
        }
        if (provider != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", provider);
            } catch (GeneralSecurityException unused3) {
            }
        }
        return new SecureRandom();
    }
}
