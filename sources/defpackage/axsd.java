package defpackage;

import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axsd extends UploadDataProvider {
    final /* synthetic */ axse a;

    public axsd(axse axseVar) {
        this.a = axseVar;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.a.b;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        new axjt("CronetFixedModeOutputStream.UploadDataProviderImpl#read", 0);
        int iRemaining = byteBuffer.remaining();
        axse axseVar = this.a;
        ByteBuffer byteBuffer2 = axseVar.c;
        if (iRemaining >= byteBuffer2.remaining()) {
            byteBuffer.put(byteBuffer2);
            uploadDataSink.onReadSucceeded(false);
            axseVar.a.b();
            return;
        }
        int iLimit = byteBuffer2.limit();
        byteBuffer.put(byteBuffer2);
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
    }
}
