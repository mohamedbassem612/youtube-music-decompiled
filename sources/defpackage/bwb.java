package defpackage;

import app.rive.semantics.SemanticState;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwb {
    public byte[] b;
    public int c;
    public int d;
    private static final char[] e = {'\r', '\n'};
    private static final char[] f = {'\n'};
    public static final agkz a = agkz.t(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private static final AtomicReference g = new AtomicReference();

    public bwb(int i) {
        this.b = new byte[i];
        this.d = i;
    }

    private final char U(Charset charset, char[] cArr) {
        int iX;
        if (d() < W(charset) || (iX = X(charset)) == 0) {
            return (char) 0;
        }
        long j = iX >>> 8;
        ahno.J(true, "out of range: %s", j);
        int i = (int) j;
        if (Character.isSupplementaryCodePoint(i)) {
            return (char) 0;
        }
        long j2 = i;
        char c = (char) j2;
        ahno.J(((long) c) == j2, "Out of range: %s", j2);
        for (char c2 : cArr) {
            if (c2 == c) {
                this.c += ahng.K(iX & 255);
                return c;
            }
        }
        return (char) 0;
    }

    private static int V(int i, int i2, int i3, int i4) {
        return ((afxw.G(((i & 7) << 2) | ((i2 & 48) >> 4)) & 255) << 16) | ((afxw.G(((i2 & 15) << 4) | ((i3 & 60) >> 2)) & 255) << 8) | (afxw.G(((i3 & 3) << 6) | (i4 & 63)) & 255);
    }

    private static int W(Charset charset) {
        ahno.K(a.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00be  */
    private final int X(Charset charset) {
        int codePoint;
        int i;
        ahno.K(a.contains(charset), "Unsupported charset: %s", charset);
        if (d() < W(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.c + ", limit=" + this.d);
        }
        int i2 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b = this.b[this.c];
            if ((b & 128) != 0) {
                return 0;
            }
            codePoint = b & 255;
        } else if (charset.equals(StandardCharsets.UTF_8)) {
            byte b2 = this.b[this.c];
            if ((b2 & 128) == 0) {
                i = 1;
            } else if ((b2 & 224) == 192 && d() >= 2 && Z(this.b[this.c + 1])) {
                i = 2;
            } else if ((this.b[this.c] & 240) == 224 && d() >= 3) {
                byte[] bArr = this.b;
                int i3 = this.c;
                if (Z(bArr[i3 + 1]) && Z(bArr[i3 + 2])) {
                    i = 3;
                } else if ((this.b[this.c] & 248) == 240) {
                    i = 0;
                } else {
                    i = 0;
                }
            } else if ((this.b[this.c] & 248) == 240 || d() < 4) {
                i = 0;
            } else {
                byte[] bArr2 = this.b;
                int i4 = this.c;
                if (Z(bArr2[i4 + 1]) && Z(bArr2[i4 + 2]) && Z(bArr2[i4 + 3])) {
                    i = 4;
                } else {
                    i = 0;
                }
            }
            if (i == 1) {
                codePoint = this.b[this.c] & 255;
            } else if (i == 2) {
                byte[] bArr3 = this.b;
                int i5 = this.c;
                codePoint = V(0, 0, bArr3[i5], bArr3[i5 + 1]);
            } else if (i == 3) {
                byte[] bArr4 = this.b;
                int i6 = this.c;
                codePoint = V(0, bArr4[i6] & 15, bArr4[i6 + 1], bArr4[i6 + 2]);
            } else {
                if (i != 4) {
                    return 0;
                }
                byte[] bArr5 = this.b;
                int i7 = this.c;
                codePoint = V(bArr5[i7], bArr5[i7 + 1], bArr5[i7 + 2], bArr5[i7 + 3]);
            }
            i2 = i;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cB = b(byteOrder, 0);
            if (!Character.isHighSurrogate(cB) || d() < 4) {
                codePoint = cB;
                i2 = 2;
            } else {
                codePoint = Character.toCodePoint(cB, b(byteOrder, 2));
                i2 = 4;
            }
        }
        return (codePoint << 8) | i2;
    }

    private final void Y(int i, Function function) {
        Boolean bool = (Boolean) g.get();
        if (!(bool != null ? bool.booleanValue() : bsc.c(8)) || d() >= i) {
            return;
        }
        throw ((RuntimeException) function.apply("bytesNeeded= " + i + ", bytesLeft=" + d()));
    }

    private static boolean Z(byte b) {
        return (b & 192) == 128;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8 A[SYNTHETIC] */
    public final String A(Charset charset) {
        byte[] bArr;
        ahno.K(a.contains(charset), "Unsupported charset: %s", charset);
        if (d() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            E();
        }
        int i = 1;
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(StandardCharsets.US_ASCII)) {
            i = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(String.valueOf(charset))));
            }
        }
        int i2 = this.c;
        while (true) {
            int i3 = this.d;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && bwp.ad(this.b[i2])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr2 = this.b;
                if (bArr2[i2] == 0 && bwp.ad(bArr2[i2 + 1])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.b;
                    if (bArr[i2 + 1] == 0 && bwp.ad(bArr[i2])) {
                        break;
                    }
                }
                i2 += i;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.b;
                    if (bArr[i2 + 1] == 0) {
                        continue;
                    }
                }
                i2 += i;
            }
        }
        String strD = D(i2 - this.c, charset);
        if (this.c != this.d && U(charset, e) == '\r') {
            U(charset, f);
        }
        return strD;
    }

    public final String B(int i) {
        Y(i, new bwa(1));
        if (i == 0) {
            return "";
        }
        int i2 = this.c;
        int i3 = (i2 + i) - 1;
        String strM = bwp.M(this.b, i2, (i3 >= this.d || this.b[i3] != 0) ? i : i - 1);
        this.c += i;
        return strM;
    }

    public final String C(int i) {
        return D(i, StandardCharsets.UTF_8);
    }

    public final String D(int i, Charset charset) {
        Y(i, new bwa(1));
        byte[] bArr = this.b;
        int i2 = this.c;
        String str = new String(bArr, i2, i, charset);
        this.c = i2 + i;
        return str;
    }

    public final Charset E() {
        if (d() >= 3) {
            byte[] bArr = this.b;
            int i = this.c;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.c = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (d() >= 2) {
            byte[] bArr2 = this.b;
            int i2 = this.c;
            byte b = bArr2[i2];
            if (b == -2) {
                if (bArr2[i2 + 1] == -1) {
                    this.c = i2 + 2;
                    return StandardCharsets.UTF_16BE;
                }
            } else if (b == -1 && bArr2[i2 + 1] == -2) {
                this.c = i2 + 2;
                return StandardCharsets.UTF_16LE;
            }
        }
        return null;
    }

    public final short F() {
        I(2);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        int i3 = bArr[i] & 255;
        this.c = i + 2;
        return (short) (i3 | ((bArr[i2] & 255) << 8));
    }

    public final short G() {
        I(2);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        int i3 = bArr[i] & 255;
        this.c = i + 2;
        return (short) ((i3 << 8) | (bArr[i2] & 255));
    }

    public final void H(int i) {
        if (i > e()) {
            this.b = Arrays.copyOf(this.b, i);
        }
    }

    public final void I(int i) {
        Y(i, new bwa(0));
    }

    public final void J(ByteBuffer byteBuffer, int i) {
        I(i);
        byteBuffer.put(this.b, this.c, i);
        this.c += i;
    }

    public final void K(byte[] bArr, int i, int i2) {
        I(i2);
        System.arraycopy(this.b, this.c, bArr, i, i2);
        this.c += i2;
    }

    public final void L(int i) {
        N(e() < i ? new byte[i] : this.b, i);
    }

    public final void M(byte[] bArr) {
        N(bArr, bArr.length);
    }

    public final void N(byte[] bArr, int i) {
        this.b = bArr;
        this.d = i;
        this.c = 0;
    }

    public final void O(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.b.length) {
            z = true;
        }
        ahno.F(z);
        this.d = i;
    }

    public final void P(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.d) {
            z = true;
        }
        ahno.F(z);
        this.c = i;
    }

    public final void Q(int i) {
        P(this.c + i);
    }

    public final void R() {
        while ((n() & SemanticState.Focused) != 0) {
        }
    }

    public final String S() {
        if (d() == 0) {
            return null;
        }
        int i = this.c;
        while (i < this.d && this.b[i] != 0) {
            i++;
        }
        byte[] bArr = this.b;
        int i2 = this.c;
        String strM = bwp.M(bArr, i2, i - i2);
        this.c = i;
        if (i < this.d) {
            this.c = i + 1;
        }
        return strM;
    }

    public final void T(dqp dqpVar, int i) {
        K((byte[]) dqpVar.c, 0, i);
        dqpVar.q(0);
    }

    public final byte a() {
        if (d() > 0) {
            byte[] bArr = this.b;
            int i = this.c;
            this.c = i + 1;
            return bArr[i];
        }
        throw new IndexOutOfBoundsException("position=" + this.c + ", limit=" + this.d);
    }

    public final char b(ByteOrder byteOrder, int i) {
        byte b;
        byte b2;
        I(2);
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.b;
        if (byteOrder == byteOrder2) {
            int i2 = this.c + i;
            b = bArr[i2];
            b2 = bArr[i2 + 1];
        } else {
            int i3 = this.c + i;
            b = bArr[i3 + 1];
            b2 = bArr[i3];
        }
        return (char) ((b << 8) | (b2 & 255));
    }

    public final float c() {
        return Float.intBitsToFloat(i());
    }

    public final int d() {
        return Math.max(this.d - this.c, 0);
    }

    public final int e() {
        return this.b.length;
    }

    public final int f(Charset charset) {
        int iX = X(charset);
        if (iX != 0) {
            return ahng.K(iX >>> 8);
        }
        return 1114112;
    }

    public final int g() {
        if (d() >= 4) {
            int i = i();
            this.c -= 4;
            return i;
        }
        throw new IndexOutOfBoundsException("position=" + this.c + ", limit=" + this.d);
    }

    public final int h() {
        I(1);
        return this.b[this.c] & 255;
    }

    public final int i() {
        I(4);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.c = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.c = i6;
        int i7 = bArr[i4] & 255;
        this.c = i + 4;
        return (i3 << 24) | (i5 << 16) | (i7 << 8) | (bArr[i6] & 255);
    }

    public final int j() {
        I(4);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.c = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.c = i6;
        int i7 = bArr[i4] & 255;
        this.c = i + 4;
        return i3 | (i5 << 8) | (i7 << 16) | ((bArr[i6] & 255) << 24);
    }

    public final int k() {
        int iJ = j();
        if (iJ >= 0) {
            return iJ;
        }
        throw new IllegalStateException(a.bR(iJ, "Top bit not zero: "));
    }

    public final int l() {
        I(2);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        int i3 = bArr[i] & 255;
        this.c = i + 2;
        return i3 | ((bArr[i2] & 255) << 8);
    }

    public final int m() {
        return (n() << 21) | (n() << 14) | (n() << 7) | n();
    }

    public final int n() {
        I(1);
        byte[] bArr = this.b;
        int i = this.c;
        this.c = i + 1;
        return bArr[i] & 255;
    }

    public final int o() {
        I(4);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        int i3 = bArr[i] & 255;
        this.c = i + 2;
        int i4 = bArr[i2] & 255;
        this.c = i + 4;
        return (i3 << 8) | i4;
    }

    public final int p() {
        I(3);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.c = i4;
        int i5 = bArr[i2] & 255;
        this.c = i + 3;
        return (i3 << 16) | (i5 << 8) | (bArr[i4] & 255);
    }

    public final int q() {
        int i = i();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException(a.bR(i, "Top bit not zero: "));
    }

    public final int r() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.c == this.d) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jN = n();
            j |= (127 & jN) << (i * 7);
            if ((jN & 128) == 0) {
                break;
            }
        }
        return ahng.K(j);
    }

    public final int s() {
        I(2);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        int i3 = bArr[i] & 255;
        this.c = i + 2;
        return (i3 << 8) | (bArr[i2] & 255);
    }

    public final long t() {
        I(8);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.c = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.c = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.c = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.c = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.c = i7;
        long j6 = bArr[i6];
        int i8 = i + 7;
        this.c = i8;
        long j7 = bArr[i7];
        this.c = i + 8;
        return (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40) | ((j7 & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
    }

    public final long u() {
        I(4);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.c = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.c = i4;
        long j3 = bArr[i3];
        this.c = i + 4;
        return (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    public final long v() {
        I(8);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.c = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.c = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.c = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.c = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.c = i7;
        long j6 = bArr[i6];
        int i8 = i + 7;
        this.c = i8;
        long j7 = bArr[i7];
        this.c = i + 8;
        return ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | ((j7 & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    public final long w() {
        I(4);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.c = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.c = i4;
        long j3 = bArr[i3];
        this.c = i + 4;
        return ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    public final long x() {
        long jV = v();
        if (jV >= 0) {
            return jV;
        }
        throw new IllegalStateException(a.bS(jV, "Top bit not zero: "));
    }

    public final long y() {
        int i;
        I(1);
        long j = this.b[this.c];
        int i2 = 7;
        while (true) {
            i = 0;
            if (i2 < 0) {
                break;
            }
            int i3 = 1 << i2;
            if ((((long) i3) & j) == 0) {
                if (i2 >= 6) {
                    if (i2 != 7) {
                        break;
                    }
                    i = 1;
                    break;
                }
                j &= (long) (i3 - 1);
                i = 7 - i2;
                break;
            }
            i2--;
        }
        if (i == 0) {
            throw new NumberFormatException(a.bS(j, "Invalid UTF-8 sequence first byte: "));
        }
        I(i);
        for (int i4 = 1; i4 < i; i4++) {
            byte b = this.b[this.c + i4];
            if ((b & 192) != 128) {
                throw new NumberFormatException(a.bS(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.c += i;
        return j;
    }

    public final String z() {
        return A(StandardCharsets.UTF_8);
    }

    public bwb() {
        this.b = bwp.e;
    }

    public bwb(byte[] bArr, int i) {
        this.b = bArr;
        this.d = i;
    }

    public bwb(byte[] bArr) {
        this.b = bArr;
        this.d = bArr.length;
    }
}
