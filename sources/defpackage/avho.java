package defpackage;

import io.grpc.Status;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avho extends FilterInputStream implements InputStreamRetargetInterface {
    private final int a;
    private final avjz b;
    private long c;
    private long d;
    private long e;

    public avho(InputStream inputStream, int i, avjz avjzVar) {
        super(inputStream);
        this.e = -1L;
        this.a = i;
        this.b = avjzVar;
    }

    private final void a() {
        if (this.d > this.c) {
            avjz.b(this.b);
            this.c = this.d;
        }
    }

    private final void b() {
        long j = this.d;
        int i = this.a;
        if (j > i) {
            throw new avcg(Status.h.withDescription(a.bR(i, "Decompressed gRPC message exceeds maximum size ")));
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.e = this.d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = this.in.read();
        if (i != -1) {
            this.d++;
        }
        b();
        a();
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.e == -1) {
            throw new IOException("Mark not set");
        }
        this.in.reset();
        this.d = this.e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = this.in.skip(j);
        this.d += jSkip;
        b();
        a();
        return jSkip;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.in.read(bArr, i, i2);
        if (i3 != -1) {
            this.d += (long) i3;
        }
        b();
        a();
        return i3;
    }
}
