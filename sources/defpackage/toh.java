package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class toh {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/common/network/internal/InsecureRequestsInterceptor");

    public static final void a(String str) throws tog {
        String scheme = Uri.parse(str).getScheme();
        if (scheme == null) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/common/network/internal/InsecureRequestsInterceptor", "processRequest", 22, "InsecureRequestsInterceptor.java")).t("HttpsEnforcer: unexpected null host");
        } else if (!"https".equalsIgnoreCase(scheme)) {
            throw new tog("SSL Required");
        }
    }
}
