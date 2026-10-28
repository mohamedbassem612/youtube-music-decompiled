package defpackage;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vgs extends WebViewClient {
    final /* synthetic */ vgu a;

    public vgs(vgu vguVar) {
        this.a = vguVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.a.a = webView.getTitle();
    }
}
