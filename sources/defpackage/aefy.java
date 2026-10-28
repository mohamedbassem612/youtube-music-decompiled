package defpackage;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aefy extends WebChromeClient {
    final /* synthetic */ aega a;

    public aefy(aega aegaVar) {
        this.a = aegaVar;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        super.onCloseWindow(webView);
        fv fvVar = this.a.b;
        if (fvVar != null) {
            fvVar.dismiss();
        }
    }
}
