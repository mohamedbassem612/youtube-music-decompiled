package defpackage;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aefz extends WebViewClient {
    final /* synthetic */ aega a;

    public aefz(aega aegaVar) {
        this.a = aegaVar;
    }

    private final boolean a(Uri uri) {
        Set set = this.a.c;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (aeho.e(uri, (String) it.next())) {
                }
            }
            ((agrc) ((agrc) aega.a.c()).k("com/google/android/libraries/youtube/rendering/ui/webview/GenericWebChromeClient$3", "shouldOverrideUrlLoading", 227, "GenericWebChromeClient.java")).t("Dialog popup navigation blocked by origin allowlist");
            return true;
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        boolean zEquals = str.equals("about:blank");
        aega aegaVar = this.a;
        if (zEquals) {
            fv fvVar = aegaVar.b;
            if (fvVar != null) {
                fvVar.dismiss();
                return;
            }
            return;
        }
        fv fvVar2 = aegaVar.b;
        if (fvVar2 == null || fvVar2.isShowing()) {
            return;
        }
        aegaVar.b.show();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        return a(Uri.parse(str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return a(webResourceRequest.getUrl());
    }
}
