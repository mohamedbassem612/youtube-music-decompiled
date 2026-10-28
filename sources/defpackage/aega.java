package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class aega extends WebChromeClient {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/rendering/ui/webview/GenericWebChromeClient");
    protected fv b;
    public final Set c;
    public final int d;
    private final wby e;
    private final String f;
    private final acwd g;
    private final Context h;

    public aega(wby wbyVar, String str, int i, acwd acwdVar, Context context, Set set) {
        this.e = wbyVar;
        this.f = str;
        this.d = i;
        this.g = acwdVar;
        this.h = context;
        this.c = set;
    }

    private final void a(WebView webView, Message message) {
        fu fuVar = new fu(webView.getContext());
        aefx aefxVar = new aefx(webView.getContext());
        aefxVar.getSettings().setJavaScriptEnabled(true);
        aefxVar.setWebChromeClient(new aefy(this));
        aefxVar.setWebViewClient(new aefz(this));
        aefxVar.getSettings().setAllowContentAccess(false);
        aefxVar.getSettings().setAllowFileAccess(false);
        fuVar.setView(aefxVar);
        ((WebView.WebViewTransport) message.obj).setWebView(aefxVar);
        message.sendToTarget();
        this.b = fuVar.create();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        Message messageObtainMessage;
        if (!z2) {
            return false;
        }
        WebView.HitTestResult hitTestResult = webView.getHitTestResult();
        int type = hitTestResult.getType();
        String strZ = ahno.Z(hitTestResult.getExtra());
        if (type == 8) {
            Handler handler = webView.getHandler();
            if (handler == null || (messageObtainMessage = handler.obtainMessage()) == null) {
                strZ = "";
            } else {
                webView.requestFocusNodeHref(messageObtainMessage);
                strZ = ahno.Z(messageObtainMessage.getData().getString("url"));
            }
        }
        Set set = this.c;
        if (!set.isEmpty() && !strZ.isEmpty()) {
            Uri uri = Uri.parse(strZ);
            Iterator it = set.iterator();
            do {
                if (!it.hasNext()) {
                    ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/rendering/ui/webview/GenericWebChromeClient", "onCreateWindow", 104, "GenericWebChromeClient.java")).t("New window navigation blocked by origin allowlist");
                    return false;
                }
            } while (!aeho.e(uri, (String) it.next()));
        }
        if (z) {
            a(webView, message);
        } else {
            int i = this.d;
            if (i == 0) {
                throw null;
            }
            int i2 = i - 1;
            if (i2 == 1) {
                if (strZ.isEmpty()) {
                    return false;
                }
                webView.loadUrl(strZ);
                return false;
            }
            if (i2 == 3) {
                if (strZ.isEmpty()) {
                    return false;
                }
                this.g.a(this.h, Uri.parse(strZ));
                return false;
            }
            if (i2 != 4) {
                if (strZ.isEmpty()) {
                    return false;
                }
                aeho.g(Uri.parse(strZ), webView.getContext());
                return false;
            }
            a(webView, message);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        aeho.c(this.e, this.f, str);
    }
}
