package defpackage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axsf extends UrlRequest.Callback {
    final /* synthetic */ axsg a;

    public axsf(axsg axsgVar) {
        this.a = axsgVar;
    }

    private final void a(IOException iOException) {
        axsg axsgVar = this.a;
        axsgVar.f = iOException;
        axsi axsiVar = axsgVar.c;
        if (axsiVar != null) {
            axsiVar.c = iOException;
            axsiVar.a = true;
            axsiVar.b = null;
        }
        axsj axsjVar = axsgVar.d;
        if (axsjVar != null) {
            axsjVar.d = iOException;
            axsjVar.f = true;
        }
        axsgVar.n = true;
        axsgVar.a.b();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        new axjt("CronetHttpURLConnection.CronetUrlRequestCallback#onCanceled", 0);
        this.a.e = urlResponseInfo;
        a(new IOException("disconnect() called"));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        new axjt("CronetHttpURLConnection.CronetUrlRequestCallback#onFailed", 0);
        if (cronetException == null) {
            throw new IllegalStateException("Exception cannot be null in onFailed.");
        }
        this.a.e = urlResponseInfo;
        a(cronetException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        new axjt("CronetHttpURLConnection.CronetUrlRequestCallback#onReadCompleted", 0);
        axsg axsgVar = this.a;
        axsgVar.e = urlResponseInfo;
        axsgVar.a.b();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        new axjt("CronetHttpURLConnection.CronetUrlRequestCallback#onRedirectReceived", 0);
        axsg axsgVar = this.a;
        axsgVar.g = true;
        try {
            URL url = new URL(str);
            boolean zEquals = url.getProtocol().equals(axsgVar.url.getProtocol());
            if (axsgVar.instanceFollowRedirects) {
                axsgVar.url = url;
            }
            if (axsgVar.instanceFollowRedirects && zEquals) {
                axsgVar.b.followRedirect();
                return;
            }
        } catch (MalformedURLException unused) {
        }
        axsg axsgVar2 = this.a;
        axsgVar2.e = urlResponseInfo;
        axsgVar2.b.cancel();
        a(null);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        new axjt("CronetHttpURLConnection.CronetUrlRequestCallback#onResponseStarted", 0);
        axsg axsgVar = this.a;
        axsgVar.e = urlResponseInfo;
        axsgVar.n = true;
        axsgVar.a.b();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        new axjt("CronetHttpURLConnection.CronetUrlRequestCallback#onSucceeded", 0);
        this.a.e = urlResponseInfo;
        a(null);
    }
}
