package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vgt extends WebChromeClient {
    final /* synthetic */ vgu a;

    public vgt(vgu vguVar) {
        this.a = vguVar;
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
        this.a.b = bitmap;
    }
}
