package defpackage;

import app.rive.semantics.SemanticState;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class erd extends ByteArrayOutputStream {
    private final eqy a;

    public erd(eqy eqyVar, int i) {
        this.a = eqyVar;
        this.buf = eqyVar.b(Math.max(i, SemanticState.Hidden));
    }

    private final void a(int i) {
        if (this.count + i > this.buf.length) {
            eqy eqyVar = this.a;
            byte[] bArrB = eqyVar.b((this.count + i) << 1);
            System.arraycopy(this.buf, 0, bArrB, 0, this.count);
            eqyVar.a(this.buf);
            this.buf = bArrB;
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.a.a(this.buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        a(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }
}
