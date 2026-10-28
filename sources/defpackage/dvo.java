package defpackage;

import android.webkit.CookieManager;
import android.webkit.WebStorage;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class dvo {
    private final ProfileBoundaryInterface a;
    private final String b;

    public dvo(ProfileBoundaryInterface profileBoundaryInterface) {
        this.a = profileBoundaryInterface;
        this.b = profileBoundaryInterface.getName();
    }

    public static dvo d(InvocationHandler invocationHandler) {
        return new dvo((ProfileBoundaryInterface) axsn.a(ProfileBoundaryInterface.class, invocationHandler));
    }

    public final CookieManager a() {
        if (dvy.e.d()) {
            return this.a.getCookieManager();
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public final WebStorage b() {
        if (dvy.e.d()) {
            return this.a.getWebStorage();
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public final String c() {
        if (dvy.e.d()) {
            return this.b;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dvo) {
            return this.b.equals(((dvo) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
