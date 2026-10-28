package defpackage;

import app.rive.semantics.SemanticState;
import com.google.cardboard.sdk.R;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vxw {
    public final byte[] a;
    public int b = 0;
    public final int c;
    public byte d;
    public boolean e;
    public boolean f;
    public long g;
    public final int h;
    public int i;

    public vxw(byte[] bArr, int i) throws IOException {
        this.a = bArr;
        this.c = i;
        int length = bArr.length;
        if (i > length) {
            throw new IndexOutOfBoundsException(a.bQ(length, i, "Invalid offset 0 or length ", " for byte array of size "));
        }
        int iA = a();
        this.h = iA;
        if (iA >= 0) {
            return;
        }
        this.f = true;
        throw new IOException(a.bR(iA, "Malformed negative num_flags: "));
    }

    private final int f() {
        int i = this.b;
        if (i >= this.c) {
            return -1;
        }
        this.b = i + 1;
        return this.a[i] & 255;
    }

    public final int a() throws IOException {
        int i = this.b;
        if (i >= this.c) {
            this.f = true;
            throw new EOFException("Unexpected EOF reading varint32");
        }
        int i2 = i + 1;
        int i3 = this.a[i];
        this.b = i2;
        if (i3 < 0) {
            i3 &= 127;
            int i4 = 7;
            while (i4 < 32) {
                int iF = f();
                if (iF == -1) {
                    this.f = true;
                    throw new EOFException("Unexpected EOF reading varint32");
                }
                if (i4 == 28) {
                    if ((iF & 112) != 0) {
                        this.f = true;
                        throw new IOException("Malformed varint32: overflow at 5th byte (0x" + Integer.toHexString(iF) + ')');
                    }
                    i4 = 28;
                }
                i3 |= (iF & 127) << i4;
                if ((iF & SemanticState.Focused) != 0) {
                    i4 += 7;
                }
            }
            this.f = true;
            throw new IOException("Malformed varint32: exceeds 5 bytes");
        }
        return i3;
    }

    public final long b() throws IOException {
        int i = 0;
        long j = 0;
        while (i < 64) {
            int iF = f();
            if (iF == -1) {
                this.f = true;
                throw new EOFException("Unexpected EOF reading varint64");
            }
            if (i == 63) {
                if ((iF & R.styleable.AppCompatTheme_windowNoTitle) != 0) {
                    this.f = true;
                    throw new IOException("Malformed varint64: overflow at 10th byte (0x" + Integer.toHexString(iF) + ')');
                }
                i = 63;
            }
            j |= ((long) (iF & 127)) << i;
            if ((iF & SemanticState.Focused) == 0) {
                return j;
            }
            i += 7;
        }
        this.f = true;
        throw new IOException("Malformed varint64: exceeds 10 bytes");
    }

    public final void c() throws IOException {
        if (this.f) {
            throw new IOException("DeltaVarintReader is in a corrupted terminal state");
        }
    }

    public final void d(long j) throws EOFException {
        int i = this.c;
        int i2 = this.b;
        if (i - i2 >= j) {
            this.b = i2 + ((int) j);
        } else {
            this.f = true;
            throw new EOFException("Unexpected EOF skipping bytes");
        }
    }

    public final void e() throws IOException {
        c();
        if (!this.e) {
            throw new IllegalStateException("No pending flag to skip");
        }
        byte b = this.d;
        if (b != 0 && b != 1) {
            if (b == 2) {
                int i = this.b;
                int i2 = this.c;
                byte[] bArr = this.a;
                int i3 = 0;
                while (i3 < 10) {
                    if (i >= i2) {
                        this.b = i;
                        this.f = true;
                        throw new EOFException("Unexpected EOF reading varint64");
                    }
                    int i4 = i + 1;
                    if (bArr[i] >= 0) {
                        this.b = i4;
                        this.e = false;
                        return;
                    } else {
                        i3++;
                        i = i4;
                    }
                }
                this.b = i;
                this.f = true;
                throw new IOException("Malformed varint64: exceeds 10 bytes");
            }
            if (b == 3) {
                d(8L);
            } else {
                int iA = a();
                if (iA < 0) {
                    this.f = true;
                    throw new IOException(a.bR(iA, "Malformed payload length: "));
                }
                if (iA > 65536) {
                    this.f = true;
                    throw new IOException(a.bP(iA, "Payload length exceeds wire safety limit: ", " > 65536"));
                }
                if (iA > 0) {
                    d(iA);
                }
            }
        }
        this.e = false;
    }
}
