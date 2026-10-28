package defpackage;

import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class dvq implements WebMessageListenerBoundaryInterface {
    private final aedi a;

    public dvq(aedi aediVar) {
        this.a = aediVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:19:0x007e  */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public final void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        aami aamiVar;
        aami aamiVar2;
        aedi aediVar;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) axsn.a(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        yi[] yiVarArr = new yi[ports.length];
        for (int i = 0; i < ports.length; i++) {
            yiVarArr[i] = new yi(ports[i]);
        }
        if (dvy.a.d()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) axsn.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type != 0) {
                if (type != 1) {
                    aamiVar2 = null;
                } else {
                    aamiVar = new aami(webMessagePayloadBoundaryInterface.getAsArrayBuffer());
                }
                if (aamiVar2 != null) {
                    dtp dtpVar = (dtp) ((JsReplyProxyBoundaryInterface) axsn.a(JsReplyProxyBoundaryInterface.class, invocationHandler2)).getOrCreatePeer(new fxv(1));
                    aediVar = this.a;
                    webView.getClass();
                    uri.getClass();
                    dtpVar.getClass();
                    if (z) {
                        aediVar.J(aamiVar2, uri);
                    }
                }
            }
            aamiVar = new aami(webMessagePayloadBoundaryInterface.getAsString());
        } else {
            aamiVar = new aami(webMessageBoundaryInterface.getData());
        }
        aamiVar2 = aamiVar;
        if (aamiVar2 != null) {
            dtp dtpVar2 = (dtp) ((JsReplyProxyBoundaryInterface) axsn.a(JsReplyProxyBoundaryInterface.class, invocationHandler2)).getOrCreatePeer(new fxv(1));
            aediVar = this.a;
            webView.getClass();
            uri.getClass();
            dtpVar2.getClass();
            if (z) {
                aediVar.J(aamiVar2, uri);
            }
        }
    }
}
