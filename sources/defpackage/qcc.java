package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class qcc extends WebViewClient {
    final /* synthetic */ qcd a;

    public qcc(qcd qcdVar) {
        this.a = qcdVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            this.a.a.startActivity(new Intent("android.intent.action.VIEW").setData(webResourceRequest.getUrl()));
            return true;
        } catch (ActivityNotFoundException e) {
            Log.e("ParentToolsFragment", "Can't open external browser.", e);
            return true;
        }
    }
}
