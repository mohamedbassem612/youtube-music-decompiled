package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class axmn extends BidirectionalStream.Callback {
    final /* synthetic */ axmo b;

    public axmn(axmo axmoVar) {
        this.b = axmoVar;
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        axmo axmoVar = this.b;
        axmoVar.a(bidirectionalStream);
        if (bidirectionalStream == axmoVar.b) {
            axmoVar.i.b(axnb.f);
        } else {
            axmoVar.i.a(axnb.f);
        }
        if (axmoVar.e.get() == bidirectionalStream || axmoVar.c.getAndSet(true)) {
            axmoVar.f.onCanceled(axmoVar, urlResponseInfo);
            axmoVar.h.c(axmoVar.i);
            axmoVar.g.b(axmoVar);
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        axmo axmoVar = this.b;
        axmoVar.a(bidirectionalStream);
        if (bidirectionalStream == axmoVar.b) {
            axmoVar.i.b(axnb.e);
        } else {
            axmoVar.i.a(axnb.e);
        }
        if (axmoVar.e.get() == bidirectionalStream || axmoVar.c.getAndSet(true)) {
            axmoVar.f.onFailed(axmoVar, urlResponseInfo, cronetException);
            axmoVar.h.c(axmoVar.i);
            axmoVar.g.b(axmoVar);
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        axmo axmoVar = this.b;
        axmoVar.a(bidirectionalStream);
        if (axmoVar.e.get() == bidirectionalStream) {
            axmoVar.f.onReadCompleted(axmoVar, urlResponseInfo, byteBuffer, z);
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        axmo axmoVar = this.b;
        axmoVar.a(bidirectionalStream);
        if (axmoVar.e.get() == bidirectionalStream) {
            axmoVar.f.onResponseHeadersReceived(axmoVar, urlResponseInfo);
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseTrailersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, UrlResponseInfo.HeaderBlock headerBlock) {
        axmo axmoVar = this.b;
        axmoVar.a(bidirectionalStream);
        if (axmoVar.e.get() == bidirectionalStream) {
            axmoVar.f.onResponseTrailersReceived(axmoVar, urlResponseInfo, headerBlock);
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public void onStreamReady(BidirectionalStream bidirectionalStream) {
        axmo axmoVar = this.b;
        axmoVar.a(bidirectionalStream);
        if (a.ap(axmoVar.e, bidirectionalStream)) {
            axmoVar.c(bidirectionalStream);
            axmoVar.f.onStreamReady(axmoVar);
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        axmo axmoVar = this.b;
        axmoVar.a(bidirectionalStream);
        if (bidirectionalStream == axmoVar.b) {
            axmoVar.i.b(axnb.d);
        } else {
            axmoVar.i.a(axnb.d);
        }
        if (axmoVar.e.get() == bidirectionalStream) {
            axmoVar.f.onSucceeded(axmoVar, urlResponseInfo);
            axmoVar.h.c(axmoVar.i);
            axmoVar.g.b(axmoVar);
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        axmo axmoVar = this.b;
        axmoVar.a(bidirectionalStream);
        if (axmoVar.e.get() == bidirectionalStream) {
            axmoVar.f.onWriteCompleted(axmoVar, urlResponseInfo, byteBuffer, z);
        }
    }
}
