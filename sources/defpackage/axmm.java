package defpackage;

import java.nio.ByteBuffer;
import java.util.Set;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axmm extends axmn {
    final /* synthetic */ axmo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axmm(axmo axmoVar) {
        super(axmoVar);
        this.a = axmoVar;
    }

    @Override // defpackage.axmn, org.chromium.net.BidirectionalStream.Callback
    public final void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        axmo axmoVar = this.a;
        axmoVar.a(bidirectionalStream);
        if (a.ap(axmoVar.e, bidirectionalStream)) {
            synchronized (axmoVar.a) {
                axmoVar.n.add(bidirectionalStream);
            }
            this.a.c(bidirectionalStream);
        }
        super.onResponseHeadersReceived(bidirectionalStream, urlResponseInfo);
    }

    @Override // defpackage.axmn, org.chromium.net.BidirectionalStream.Callback
    public final void onStreamReady(BidirectionalStream bidirectionalStream) {
        axmo axmoVar = this.a;
        axmoVar.a(bidirectionalStream);
        synchronized (axmoVar.a) {
            axmoVar.n.add(bidirectionalStream);
            for (acrx acrxVar : axmoVar.j) {
                ByteBuffer byteBufferDuplicate = ((ByteBuffer) acrxVar.c).duplicate();
                axmoVar.k.put(byteBufferDuplicate, acrxVar);
                bidirectionalStream.write(byteBufferDuplicate, acrxVar.a);
            }
        }
        bidirectionalStream.flush();
        axmo axmoVar2 = this.a;
        if (axmoVar2.m.compareAndSet(false, true)) {
            axmoVar2.f.onStreamReady(axmoVar2);
        }
    }

    @Override // defpackage.axmn, org.chromium.net.BidirectionalStream.Callback
    public final void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        axmo axmoVar = this.a;
        axmoVar.a(bidirectionalStream);
        synchronized (axmoVar.a) {
            acrx acrxVar = (acrx) axmoVar.k.remove(byteBuffer);
            Object obj = byteBuffer;
            if (acrxVar != null) {
                Set set = axmoVar.l;
                if (set.contains(acrxVar)) {
                    return;
                }
                set.add(acrxVar);
                obj = acrxVar.b;
            }
            ByteBuffer byteBuffer2 = (ByteBuffer) obj;
            axmoVar.f.onWriteCompleted(axmoVar, urlResponseInfo, byteBuffer2, z);
        }
    }
}
