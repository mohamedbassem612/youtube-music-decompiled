package defpackage;

import java.security.Provider;
import java.security.Security;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahgn {
    private static final String[] a = {"AndroidOpenSSL", "GmsCore_OpenSSL", "Conscrypt"};

    public static Provider a() {
        String[] strArr = a;
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }
}
