package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class byg extends InputStream implements InputStreamRetargetInterface {
    private final bye a;
    private final byi b;
    private long f;
    private boolean d = false;
    private boolean e = false;
    private final byte[] c = new byte[1];

    public byg(bye byeVar, byi byiVar) {
        this.a = byeVar;
        this.b = byiVar;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.a.b(this.b);
        this.d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.a.f();
        this.e = true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ahno.O(!this.e);
        a();
        int iA = this.a.a(bArr, i, i2);
        if (iA == -1) {
            return -1;
        }
        this.f += (long) iA;
        return iA;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (read(bArr) != -1) {
            return bArr[0] & 255;
        }
        return -1;
    }
}
