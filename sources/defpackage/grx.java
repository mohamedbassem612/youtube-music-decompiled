package defpackage;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class grx extends WebViewClient {
    public final /* synthetic */ gry a;

    public grx(gry gryVar) {
        this.a = gryVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        LoadingFrameLayout loadingFrameLayout;
        gry gryVar = this.a;
        if (!gryVar.j && (loadingFrameLayout = gryVar.h) != null) {
            loadingFrameLayout.h(3);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String string;
        gry gryVar = this.a;
        gryVar.j = true;
        LoadingFrameLayout loadingFrameLayout = gryVar.h;
        if (loadingFrameLayout != null) {
            loadingFrameLayout.c(new gna(this, 2));
            LoadingFrameLayout loadingFrameLayout2 = gryVar.h;
            int i2 = -2;
            if (i == -2) {
                string = gryVar.b.getString(R.string.no_connection);
            } else {
                i2 = i;
                string = str;
            }
            loadingFrameLayout2.f(string, true, false, false);
            i = i2;
        }
        super.onReceivedError(webView, i, str, str2);
    }
}
