package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avim extends InputStream implements InputStreamRetargetInterface, avaf {
    private final avil a;

    public avim(avil avilVar) {
        avilVar.getClass();
        this.a = avilVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((avee) this.a).a;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.a.b();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.a.d();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        avil avilVar = this.a;
        int i3 = ((avee) avilVar).a;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i3, i2);
        avilVar.j(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.a.c();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        avil avilVar = this.a;
        int iMin = (int) Math.min(((avee) avilVar).a, j);
        avilVar.k(iMin);
        return iMin;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() {
        avil avilVar = this.a;
        if (((avee) avilVar).a == 0) {
            return -1;
        }
        return avilVar.e();
    }
}
