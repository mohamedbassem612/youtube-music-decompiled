package defpackage;

import android.net.http.HttpException;
import android.net.http.UrlRequest$Callback;
import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;
import org.chromium.base.Callback;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axmf implements UrlRequest$Callback {
    public final UrlRequest.Callback a;
    public axmh b;

    public axmf(UrlRequest.Callback callback) {
        this.a = callback;
    }

    public final void onCanceled(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        axmi axmiVarB = axmi.b(urlResponseInfo);
        try {
            this.a.onCanceled(this.b, axmiVarB);
        } finally {
            this.b.a(2, axmiVarB, null);
        }
    }

    public final void onFailed(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        axmi axmiVarB = axmi.b(urlResponseInfo);
        CronetException cronetExceptionB = Callback.Helper.b(httpException);
        try {
            this.a.onFailed(this.b, axmiVarB, cronetExceptionB);
        } finally {
            this.b.a(1, axmiVarB, cronetExceptionB);
        }
    }

    public final void onReadCompleted(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws Exception {
        Callback.Helper.a(new axme(this, urlResponseInfo, byteBuffer, 1), Exception.class);
    }

    public final void onRedirectReceived(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) throws Exception {
        Callback.Helper.a(new axme(this, urlResponseInfo, str, 0), Exception.class);
    }

    public final void onResponseStarted(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) throws Exception {
        Callback.Helper.a(new axmd(this, urlResponseInfo, 0), Exception.class);
    }

    public final void onSucceeded(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        axmi axmiVarB = axmi.b(urlResponseInfo);
        try {
            this.a.onSucceeded(this.b, axmiVarB);
        } finally {
            this.b.a(0, axmiVarB, null);
        }
    }
}
