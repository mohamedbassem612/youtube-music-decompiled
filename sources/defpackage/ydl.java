package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ydl extends WebViewClient {
    final /* synthetic */ ydn a;

    public ydl(ydn ydnVar) {
        this.a = ydnVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        ydn ydnVar = this.a;
        ydnVar.d.setVisibility(0);
        ydnVar.c.setVisibility(8);
        ydnVar.d.evaluateJavascript("window.consentFlowCompleted = function(approved) { window.approvalJsInterface.consentFlowCompleted(approved); }", null);
        if (str.contains("oauth/consent")) {
            xgj xgjVar = new xgj(xhb.b(36385));
            amdd amddVarCO = yno.cO(yno.cP(ydnVar.m), ydnVar.q);
            xgn xgnVar = ydnVar.e;
            yno.cN(xgjVar, amddVarCO, xgnVar);
            yno.cN(new xgj(xhb.b(36386)), yno.cO(yno.cP(ydnVar.m), ydnVar.q), xgnVar);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceResponse.getStatusCode() == 400 && webResourceRequest.getUrl().toString().contains("oauth/consent")) {
            ydn ydnVar = this.a;
            ydnVar.a(2, ydnVar.g.getContext().getString(R.string.mdx_tv_signin_error_snackbar_message), null);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return false;
    }
}
