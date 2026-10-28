package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedByInterruptException;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tia extends InputStream implements InputStreamRetargetInterface {
    public volatile ByteBuffer a;
    private final UrlRequest b;
    private final thq c;

    public tia(UrlRequest urlRequest, thq thqVar) {
        this.b = urlRequest;
        this.c = thqVar;
    }

    private final void a() throws ClosedByInterruptException, SocketTimeoutException {
        thq thqVar = this.c;
        if (thqVar.d) {
            thqVar.a();
            return;
        }
        if (this.a == null) {
            this.a = ByteBuffer.allocateDirect(32768);
            this.a.flip();
        }
        if (this.a.hasRemaining()) {
            return;
        }
        this.a.clear();
        UrlRequest urlRequest = this.b;
        urlRequest.read(this.a);
        thqVar.a.b(urlRequest);
        thqVar.a();
        if (this.a != null) {
            this.a.flip();
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.a != null) {
            return this.a.remaining();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws ClosedByInterruptException, SocketTimeoutException {
        thq thqVar = this.c;
        if (thqVar.d) {
            thqVar.a();
            return;
        }
        UrlRequest urlRequest = this.b;
        thqVar.e = true;
        urlRequest.cancel();
        thqVar.a.b(urlRequest);
        thqVar.a();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws ClosedByInterruptException, SocketTimeoutException {
        if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
            a();
            if (this.a == null || !this.a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(this.a.remaining(), i2);
            this.a.get(bArr, i, iMin);
            return iMin;
        }
        throw new ArrayIndexOutOfBoundsException("Tried to read " + i2 + " bytes starting at " + i + " from a buffer of length " + bArr.length);
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() throws ClosedByInterruptException, SocketTimeoutException {
        a();
        if (this.a == null || !this.a.hasRemaining()) {
            return -1;
        }
        return this.a.get() & 255;
    }
}
