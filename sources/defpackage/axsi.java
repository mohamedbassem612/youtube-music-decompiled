package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axsi extends InputStream implements InputStreamRetargetInterface {
    public boolean a;
    public ByteBuffer b;
    public IOException c;
    private final axsg d;

    public axsi(axsg axsgVar) {
        this.d = axsgVar;
    }

    private final void a() throws IOException {
        if (this.a) {
            IOException iOException = this.c;
            if (iOException != null) {
                throw iOException;
            }
            return;
        }
        if (b()) {
            return;
        }
        ByteBuffer byteBufferAllocateDirect = this.b;
        if (byteBufferAllocateDirect == null) {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(32768);
            this.b = byteBufferAllocateDirect;
        }
        axsg axsgVar = this.d;
        ByteBuffer byteBuffer = this.b;
        new axjt("CronetHttpURLConnection#getMoreData", 0);
        axsgVar.b.read(byteBuffer);
        axsgVar.a.a(axsgVar.getReadTimeout());
        IOException iOException2 = this.c;
        if (iOException2 != null) {
            throw iOException2;
        }
        ByteBuffer byteBuffer2 = this.b;
        if (byteBuffer2 != null) {
        }
    }

    private final boolean b() {
        ByteBuffer byteBuffer = this.b;
        return byteBuffer != null && byteBuffer.hasRemaining();
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.a) {
            IOException iOException = this.c;
            if (iOException != null) {
                throw iOException;
            }
        } else if (b()) {
            return this.b.remaining();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        a();
        if (!b()) {
            return -1;
        }
        int iMin = Math.min(this.b.limit() - this.b.position(), i2);
        this.b.get(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        a();
        if (b()) {
            return this.b.get() & 255;
        }
        return -1;
    }
}
