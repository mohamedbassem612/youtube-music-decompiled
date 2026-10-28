package defpackage;

import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axsb extends UploadDataProvider {
    final /* synthetic */ axsc a;

    public axsb(axsc axscVar) {
        this.a = axscVar;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return -1L;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        new axjt("CronetChunkedOutputStream.UploadDataProviderImpl#read", 0);
        int iRemaining = byteBuffer.remaining();
        axsc axscVar = this.a;
        ByteBuffer byteBuffer2 = axscVar.b;
        if (iRemaining < byteBuffer2.remaining()) {
            int iLimit = byteBuffer2.limit();
            byteBuffer.put(byteBuffer2);
            uploadDataSink.onReadSucceeded(false);
            return;
        }
        byteBuffer.put(byteBuffer2);
        uploadDataSink.onReadSucceeded(axscVar.c);
        if (axscVar.c) {
            return;
        }
        axscVar.a.b();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
    }
}
