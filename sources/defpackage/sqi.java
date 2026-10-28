package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sqi extends WebViewClient {
    private final aipt a;
    private final xgn b;
    private final LoadingFrameLayout c;
    private boolean d = true;

    public sqi(aipt aiptVar, xgn xgnVar, LoadingFrameLayout loadingFrameLayout) {
        this.a = aiptVar;
        this.b = xgnVar;
        this.c = loadingFrameLayout;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.d = false;
        this.c.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.c.c();
        xgn xgnVar = this.b;
        if (xgnVar != null) {
            xgnVar.w(new xgj(this.a.c, (amud) null), null);
        } else {
            zvp.a(zvn.b, zvm.a, "Interaction logger is null for AboutThisAdWebViewClient.");
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.d) {
            return false;
        }
        webView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }
}
