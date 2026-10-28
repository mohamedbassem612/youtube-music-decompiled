package defpackage;

import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class bmq extends FilterOutputStream {
    final DataOutputStream a;
    public ByteOrder b;

    public bmq(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.a = new DataOutputStream(outputStream);
        this.b = byteOrder;
    }

    public final void a(int i) throws IOException {
        this.a.write(i);
    }

    public final void b(int i) throws IOException {
        if (this.b == ByteOrder.LITTLE_ENDIAN) {
            DataOutputStream dataOutputStream = this.a;
            dataOutputStream.write(i & 255);
            dataOutputStream.write((i >>> 8) & 255);
            dataOutputStream.write((i >>> 16) & 255);
            dataOutputStream.write(i >>> 24);
            return;
        }
        if (this.b == ByteOrder.BIG_ENDIAN) {
            DataOutputStream dataOutputStream2 = this.a;
            dataOutputStream2.write(i >>> 24);
            dataOutputStream2.write((i >>> 16) & 255);
            dataOutputStream2.write((i >>> 8) & 255);
            dataOutputStream2.write(i & 255);
        }
    }

    public final void c(short s) throws IOException {
        if (this.b == ByteOrder.LITTLE_ENDIAN) {
            DataOutputStream dataOutputStream = this.a;
            dataOutputStream.write(s & 255);
            dataOutputStream.write((s >>> 8) & 255);
            return;
        }
        if (this.b == ByteOrder.BIG_ENDIAN) {
            DataOutputStream dataOutputStream2 = this.a;
            dataOutputStream2.write((s >>> 8) & 255);
            dataOutputStream2.write(s & 255);
        }
    }

    public final void d(long j) throws IOException {
        b((int) j);
    }

    public final void e(int i) throws IOException {
        if (i > 65535) {
            throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
        }
        c((short) i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.a.write(bArr, i, i2);
    }
}
