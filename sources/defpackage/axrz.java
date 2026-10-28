package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axrz extends UploadDataProvider {
    final /* synthetic */ axsa a;

    public axrz(axsa axsaVar) {
        this.a = axsaVar;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        axsa axsaVar = this.a;
        int i = axsaVar.a;
        if (i != -1) {
            return i;
        }
        boolean z = axsaVar.c;
        ByteBuffer byteBuffer = axsaVar.b;
        return z ? byteBuffer.limit() : byteBuffer.position();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        new axjt("CronetBufferedOutputStream.UploadDataProviderImpl#read", 0);
        int iRemaining = byteBuffer.remaining();
        axsa axsaVar = this.a;
        if (iRemaining < axsaVar.b.remaining()) {
            byteBuffer.put(axsaVar.b.array(), axsaVar.b.position(), iRemaining);
            ByteBuffer byteBuffer2 = axsaVar.b;
        } else {
            byteBuffer.put(axsaVar.b);
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        new axjt("CronetBufferedOutputStream.UploadDataProviderImpl#rewind", 0);
        uploadDataSink.onRewindSucceeded();
    }
}
