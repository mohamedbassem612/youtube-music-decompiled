package defpackage;

import android.net.Uri;
import android.webkit.WebView;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dva {
    public static final /* synthetic */ int a = 0;
    private static final WeakHashMap b;

    static {
        Uri.parse("*");
        Uri.parse("");
        b = new WeakHashMap();
    }

    public static boolean a() {
        if (dvy.b.d()) {
            return dwa.a.b().isMultiProcessEnabled();
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static elq b(WebView webView) {
        if (!dvy.h.d()) {
            return new elq(c(webView));
        }
        WeakHashMap weakHashMap = b;
        elq elqVar = (elq) weakHashMap.get(webView);
        if (elqVar != null) {
            return elqVar;
        }
        elq elqVar2 = new elq(c(webView));
        weakHashMap.put(webView, elqVar2);
        return elqVar2;
    }

    private static WebViewProviderBoundaryInterface c(WebView webView) {
        return dwa.a.c(webView);
    }
}
