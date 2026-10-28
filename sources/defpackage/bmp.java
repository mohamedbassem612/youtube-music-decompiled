package defpackage;

import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bmp extends InputStream implements DataInput, InputStreamRetargetInterface {
    protected final DataInputStream a;
    protected int b;
    public ByteOrder c;
    public int d;
    private byte[] e;

    public bmp(InputStream inputStream, ByteOrder byteOrder) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.a = dataInputStream;
        dataInputStream.mark(0);
        this.b = 0;
        this.c = byteOrder;
        this.d = inputStream instanceof bmp ? ((bmp) inputStream).d : -1;
    }

    public final long a() {
        return ((long) readInt()) & 4294967295L;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a.available();
    }

    public final void b(int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            DataInputStream dataInputStream = this.a;
            int i3 = i - i2;
            int iSkip = (int) dataInputStream.skip(i3);
            if (iSkip <= 0) {
                if (this.e == null) {
                    this.e = new byte[SemanticState.Multiline];
                }
                iSkip = dataInputStream.read(this.e, 0, Math.min(SemanticState.Multiline, i3));
                if (iSkip == -1) {
                    throw new EOFException(a.bP(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i2 += iSkip;
        }
        this.b += i2;
    }

    public final void c(long j) throws IOException {
        long j2 = this.b;
        if (j2 > j) {
            this.b = 0;
            this.a.reset();
        } else {
            j -= j2;
        }
        b((int) j);
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.b++;
        return this.a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.b++;
        return this.a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws EOFException {
        this.b++;
        int i = this.a.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.b += 2;
        return this.a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.b += bArr.length;
        this.a.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.b += 4;
        DataInputStream dataInputStream = this.a;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i | i2 | i3 | i4) < 0) {
            throw new EOFException();
        }
        if (this.c == ByteOrder.LITTLE_ENDIAN) {
            return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        if (this.c == ByteOrder.BIG_ENDIAN) {
            return i4 + (i << 24) + (i2 << 16) + (i3 << 8);
        }
        ByteOrder byteOrder = this.c;
        Objects.toString(byteOrder);
        throw new IOException("Invalid byte order: ".concat(String.valueOf(byteOrder)));
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        this.b += 8;
        DataInputStream dataInputStream = this.a;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
            throw new EOFException();
        }
        if (this.c == ByteOrder.LITTLE_ENDIAN) {
            return (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8) + ((long) i);
        }
        if (this.c != ByteOrder.BIG_ENDIAN) {
            ByteOrder byteOrder = this.c;
            Objects.toString(byteOrder);
            throw new IOException("Invalid byte order: ".concat(String.valueOf(byteOrder)));
        }
        return ((long) i8) + (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8);
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.b += 2;
        DataInputStream dataInputStream = this.a;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        if (this.c == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i2 << 8) + i);
        }
        if (this.c == ByteOrder.BIG_ENDIAN) {
            return (short) ((i << 8) + i2);
        }
        ByteOrder byteOrder = this.c;
        Objects.toString(byteOrder);
        throw new IOException("Invalid byte order: ".concat(String.valueOf(byteOrder)));
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.b += 2;
        return this.a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.b++;
        return this.a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.b += 2;
        DataInputStream dataInputStream = this.a;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        if (this.c == ByteOrder.LITTLE_ENDIAN) {
            return (i2 << 8) + i;
        }
        if (this.c == ByteOrder.BIG_ENDIAN) {
            return i2 + (i << 8);
        }
        ByteOrder byteOrder = this.c;
        Objects.toString(byteOrder);
        throw new IOException("Invalid byte order: ".concat(String.valueOf(byteOrder)));
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.b += i2;
        this.a.readFully(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.a.read(bArr, i, i2);
        this.b += i3;
        return i3;
    }

    public bmp(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public bmp(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        this.d = bArr.length;
    }

    public bmp(InputStream inputStream, byte[] bArr) {
        this(inputStream);
        if (inputStream.markSupported()) {
            this.a.mark(Alert.DURATION_SHOW_INDEFINITELY);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }

    public bmp(byte[] bArr, byte[] bArr2) {
        this(bArr);
        this.a.mark(Alert.DURATION_SHOW_INDEFINITELY);
    }
}
