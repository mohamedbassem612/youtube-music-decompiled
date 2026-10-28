package defpackage;

import android.net.http.BidirectionalStream$Callback;
import android.net.http.HeaderBlock;
import android.net.http.HttpException;
import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;
import org.chromium.base.Callback;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axlr implements BidirectionalStream$Callback {
    public axls a;
    private final BidirectionalStream.Callback b;

    public axlr(BidirectionalStream.Callback callback) {
        this.b = callback;
    }

    public final void onCanceled(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        axmi axmiVarA = axmi.a(urlResponseInfo);
        try {
            this.b.onCanceled(this.a, axmiVarA);
        } finally {
            this.a.a(2, axmiVarA, null);
        }
    }

    public final void onFailed(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        axmi axmiVarA = axmi.a(urlResponseInfo);
        CronetException cronetExceptionB = Callback.Helper.b(httpException);
        try {
            this.b.onFailed(this.a, axmiVarA, cronetExceptionB);
        } finally {
            this.a.a(1, axmiVarA, cronetExceptionB);
        }
    }

    public final void onReadCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.b.onReadCompleted(this.a, axmi.a(urlResponseInfo), byteBuffer, z);
    }

    public final void onResponseHeadersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        this.b.onResponseHeadersReceived(this.a, axmi.a(urlResponseInfo));
    }

    public final void onResponseTrailersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HeaderBlock headerBlock) {
        this.b.onResponseTrailersReceived(this.a, axmi.a(urlResponseInfo), new axlu(headerBlock));
    }

    public final void onStreamReady(android.net.http.BidirectionalStream bidirectionalStream) {
        this.b.onStreamReady(this.a);
    }

    public final void onSucceeded(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        axmi axmiVarA = axmi.a(urlResponseInfo);
        try {
            this.b.onSucceeded(this.a, axmiVarA);
        } finally {
            this.a.a(0, axmiVarA, null);
        }
    }

    public final void onWriteCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.b.onWriteCompleted(this.a, axmi.a(urlResponseInfo), byteBuffer, z);
    }
}
