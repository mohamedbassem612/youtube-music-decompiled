package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahmx {
    public static final ahmx a = new ahmx(new ahmy(2));
    public static final ahmx b = new ahmx(new ahmy(0));
    public static final ahmx c = new ahmx(new ahmy(1));
    private final ahmz d;

    public ahmx(ahmz ahmzVar) {
        this.d = ahmzVar;
    }

    public static List c(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object a(String str) {
        return b(str, Collections.EMPTY_LIST);
    }

    final Object b(String str, List list) throws GeneralSecurityException {
        if (ahgm.a()) {
            list = c("AndroidOpenSSL", "GmsCore_OpenSSL", "Conscrypt");
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            list = c("AndroidOpenSSL", "GmsCore_OpenSSL");
        }
        Iterator it = list.iterator();
        GeneralSecurityException generalSecurityException = null;
        while (it.hasNext()) {
            try {
                return this.d.a(str, (Provider) it.next());
            } catch (GeneralSecurityException e) {
                if (generalSecurityException == null) {
                    generalSecurityException = e;
                }
            }
        }
        if (ahgm.a()) {
            throw new GeneralSecurityException("No good Provider found.", generalSecurityException);
        }
        return this.d.a(str, null);
    }
}
