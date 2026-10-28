package defpackage;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class qcd extends WebChromeClient {
    final /* synthetic */ qcf a;

    public qcd(qcf qcfVar) {
        this.a = qcfVar;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        if (z) {
            return false;
        }
        WebView webView2 = new WebView(this.a.getContext());
        webView2.getSettings().setAllowContentAccess(false);
        webView2.getSettings().setAllowFileAccess(false);
        webView.addView(webView2);
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        webView2.setWebViewClient(new qcc(this));
        return true;
    }
}
