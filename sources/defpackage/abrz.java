package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class abrz extends WebViewClient {
    final /* synthetic */ String a;
    final /* synthetic */ absa b;
    private boolean c = false;

    public abrz(absa absaVar, String str) {
        this.a = str;
        this.b = absaVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (this.c) {
            return;
        }
        Uri uri = Uri.parse(str);
        Uri uri2 = Uri.parse(this.a);
        if (TextUtils.equals(uri.getAuthority(), uri2.getAuthority()) && TextUtils.equals(uri.getHost(), uri2.getHost()) && TextUtils.equals(uri.getPath(), uri2.getPath())) {
            absa absaVar = this.b;
            Activity activity = (Activity) absaVar.a.get();
            if (activity == null || activity.isFinishing()) {
                zvp.a(zvn.a, zvm.k, "AgeVerificationDialog was attempted to be shown although the activity was destroyed.");
            } else {
                absaVar.d.show();
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.c = true;
        this.b.c();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!"youtube://player/KavSuccess".equals(str)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        absa absaVar = this.b;
        absaVar.a();
        absaVar.g.a();
        return true;
    }
}
