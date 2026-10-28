package defpackage;

import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aigl extends aigm {
    public final InputStream a;
    public final byte[] b;
    public int c;
    public int d;
    public int e;
    public int f = Alert.DURATION_SHOW_INDEFINITELY;
    private int m;
    private int n;

    public aigl(InputStream inputStream, int i) {
        this.a = inputStream;
        this.b = new byte[i < 8 ? 8 : i];
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    private final List V(int i) throws aiik {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, SemanticState.Obscured);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int iJ = j(this.a, bArr, i2, iMin - i2);
                if (iJ == -1) {
                    throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.e += iJ;
                i2 += iJ;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void W() {
        int i = this.c + this.m;
        this.c = i;
        int i2 = this.e + i;
        int i3 = this.f;
        if (i2 <= i3) {
            this.m = 0;
            return;
        }
        int i4 = i2 - i3;
        this.m = i4;
        this.c = i - i4;
    }

    private final void X(int i) throws aiik {
        if (Y(i)) {
            return;
        }
        if (!a.an(this.e + this.d, i, this.j)) {
            throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new aiik("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private final boolean Y(int i) throws IOException {
        int i2 = this.d;
        int i3 = i2 + i;
        int i4 = this.c;
        if (i3 <= i4) {
            throw new IllegalStateException(a.bP(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.e + i2;
        if (a.an(i5, i, this.j) || a.an(i5, i, this.f)) {
            return false;
        }
        if (i2 > 0) {
            if (i4 > i2) {
                byte[] bArr = this.b;
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            this.e += i2;
            this.c -= i2;
            this.d = 0;
        }
        while (true) {
            int i6 = this.c;
            if (i6 >= i) {
                return true;
            }
            int i7 = (this.j - this.e) - i6;
            if (i7 <= 0) {
                return false;
            }
            byte[] bArr2 = this.b;
            int length = bArr2.length;
            try {
                int i8 = this.a.read(bArr2, this.c, Math.min(length - i6, i7));
                if (i8 == 0 || i8 < -1 || i8 > length) {
                    throw new IllegalStateException(String.valueOf(this.a.getClass()) + "#read(byte[]) returned invalid result: " + i8 + "\nThe InputStream implementation is buggy.");
                }
                if (i8 <= 0) {
                    return false;
                }
                this.c += i8;
                W();
            } catch (aiik e) {
                e.a();
                throw e;
            }
        }
    }

    private final byte[] Z(int i) throws IOException {
        if (i == 0) {
            return aiif.a;
        }
        if (i < 0) {
            throw new aiik("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.e;
        int i3 = this.d;
        int i4 = i2 + i3;
        if (a.an(i4, i, this.j)) {
            throw new aiik("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.f;
        if (a.an(i4, i, i5)) {
            if (i5 >= i4) {
                C(i5 - i4);
            }
            throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = this.c - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.a.available()) {
                    return null;
                }
            } catch (aiik e) {
                e.a();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.b, this.d, bArr, 0, i6);
        this.e += this.c;
        this.d = 0;
        this.c = 0;
        while (i6 < i) {
            try {
                int i8 = this.a.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.e += i8;
                i6 += i8;
            } catch (aiik e2) {
                e2.a();
                throw e2;
            }
        }
        return bArr;
    }

    public static int j(InputStream inputStream, byte[] bArr, int i, int i2) throws aiik {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (aiik e) {
            e.a();
            throw e;
        }
    }

    @Override // defpackage.aigm
    public final void A(int i) {
        this.f = i;
        W();
    }

    public final long B() throws aiik {
        int i = this.d;
        if (this.c - i < 8) {
            X(8);
            i = this.d;
        }
        byte[] bArr = this.b;
        this.d = i + 8;
        return (bArr[i] & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    @Override // defpackage.aigm
    public final void C(int i) throws aiik {
        int i2 = this.c;
        int i3 = this.d;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.d = i3 + i;
            return;
        }
        if (i < 0) {
            throw new aiik("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.e + i3;
        if (a.an(i5, i, this.j)) {
            throw new aiik("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i6 = this.f;
        if (a.an(i5, i, i6)) {
            if (i6 >= i5) {
                C(i6 - i5);
            }
            throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.e = i5;
        this.c = 0;
        this.d = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                try {
                    long jSkip = this.a.skip(j);
                    if (jSkip >= 0 && jSkip <= j) {
                        if (jSkip == 0) {
                            break;
                        } else {
                            i4 += (int) jSkip;
                        }
                    } else {
                        throw new IllegalStateException(String.valueOf(this.a.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                } catch (aiik e) {
                    e.a();
                    throw e;
                }
            } catch (Throwable th) {
                this.e += i4;
                W();
                throw th;
            }
        }
        this.e += i4;
        W();
        if (i4 >= i) {
            return;
        }
        int i7 = this.c;
        int i8 = i7 - this.d;
        this.d = i7;
        X(1);
        while (true) {
            int i9 = i - i8;
            int i10 = this.c;
            if (i9 <= i10) {
                this.d = i9;
                return;
            } else {
                i8 += i10;
                this.d = i10;
                X(1);
            }
        }
    }

    @Override // defpackage.aigm
    public final boolean D() {
        return this.d == this.c && !Y(1);
    }

    @Override // defpackage.aigm
    public final boolean E() {
        return s() != 0;
    }

    @Override // defpackage.aigm
    public final boolean F(int i) throws aiik {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.c - this.d < 10) {
                while (i3 < 10) {
                    if (a() < 0) {
                        i3++;
                    }
                }
                throw new aiik("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                byte[] bArr = this.b;
                int i4 = this.d;
                this.d = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw new aiik("CodedInputStream encountered a malformed varint.");
        }
        if (i2 == 1) {
            C(8);
        } else if (i2 == 2) {
            C(k());
        } else if (i2 == 3) {
            S();
            z(((i >>> 3) << 3) | 4);
        } else {
            if (i2 == 4) {
                Q();
                return false;
            }
            if (i2 != 5) {
                throw new aiij("Protocol message tag had invalid wire type.");
            }
            C(4);
        }
        return true;
    }

    @Override // defpackage.aigm
    public final byte[] G() {
        throw null;
    }

    @Override // defpackage.aigm
    public final byte[] H(int i) {
        int i2 = this.d;
        if (i > this.c - i2 || i <= 0) {
            return J(i);
        }
        int i3 = i + i2;
        this.d = i3;
        return Arrays.copyOfRange(this.b, i2, i3);
    }

    final long I() throws aiik {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bA = a();
            j |= ((long) (bA & 127)) << i;
            if ((bA & 128) == 0) {
                return j;
            }
        }
        throw new aiik("CodedInputStream encountered a malformed varint.");
    }

    public final byte[] J(int i) {
        byte[] bArrZ = Z(i);
        if (bArrZ != null) {
            return bArrZ;
        }
        int i2 = this.d;
        int i3 = this.c;
        int i4 = i3 - i2;
        this.e += i3;
        this.d = 0;
        this.c = 0;
        List<byte[]> listV = V(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.b, i2, bArr, 0, i4);
        for (byte[] bArr2 : listV) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    public final byte a() throws aiik {
        if (this.d == this.c) {
            X(1);
        }
        byte[] bArr = this.b;
        int i = this.d;
        this.d = i + 1;
        return bArr[i];
    }

    @Override // defpackage.aigm
    public final double b() {
        return Double.longBitsToDouble(B());
    }

    @Override // defpackage.aigm
    public final float c() {
        return Float.intBitsToFloat(r());
    }

    @Override // defpackage.aigm
    public final int d() {
        int i = this.f;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.e + this.d);
    }

    @Override // defpackage.aigm
    public final int e() {
        return this.e + this.d;
    }

    @Override // defpackage.aigm
    public final int f(int i) throws aiik {
        if (i < 0) {
            throw new aiik("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.e + this.d;
        if (i > Alert.DURATION_SHOW_INDEFINITELY - i2) {
            throw new aiik("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.f;
        if (a.an(i2, i, i3)) {
            throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f = i2 + i;
        W();
        return i3;
    }

    @Override // defpackage.aigm
    public final int g() {
        return k();
    }

    @Override // defpackage.aigm
    public final int h() {
        return r();
    }

    @Override // defpackage.aigm
    public final int i() {
        return k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L31;
     */
    @Override // defpackage.aigm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k() {
        /*
            r6 = this;
            int r0 = r6.d
            int r1 = r6.c
            if (r1 == r0) goto L6b
            byte[] r2 = r6.b
            int r3 = r0 + 1
            r4 = r2[r0]
            if (r4 < 0) goto L11
            r6.d = r3
            goto L70
        L11:
            int r1 = r1 - r3
            r5 = 9
            if (r1 < r5) goto L6b
            int r1 = r0 + 2
            r3 = r2[r3]
            int r3 = r3 << 7
            r4 = r4 ^ r3
            if (r4 >= 0) goto L22
            r4 = r4 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L68
        L22:
            int r3 = r0 + 3
            r1 = r2[r1]
            int r1 = r1 << 14
            r4 = r4 ^ r1
            if (r4 < 0) goto L2f
            r4 = r4 ^ 16256(0x3f80, float:2.278E-41)
        L2d:
            r1 = r3
            goto L68
        L2f:
            int r1 = r0 + 4
            r3 = r2[r3]
            int r3 = r3 << 21
            r4 = r4 ^ r3
            if (r4 >= 0) goto L3d
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r4 = r4 ^ r0
            goto L68
        L3d:
            int r3 = r0 + 5
            r1 = r2[r1]
            int r5 = r1 << 28
            r4 = r4 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r4 = r4 ^ r5
            if (r1 >= 0) goto L2d
            int r1 = r0 + 6
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r0 + 7
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r0 + 8
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r0 + 9
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r0 + 10
            r0 = r2[r3]
            if (r0 < 0) goto L6b
        L68:
            r6.d = r1
            goto L70
        L6b:
            long r0 = r6.I()
            int r4 = (int) r0
        L70:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aigl.k():int");
    }

    @Override // defpackage.aigm
    public final int l() {
        return r();
    }

    @Override // defpackage.aigm
    public final int m() {
        int iK = k();
        return (iK >>> 1) ^ (-(iK & 1));
    }

    @Override // defpackage.aigm
    public final int n() throws aiik {
        if (D()) {
            this.n = 0;
            return 0;
        }
        int iK = k();
        this.n = iK;
        if ((iK >>> 3) != 0) {
            return iK;
        }
        throw new aiik("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.aigm
    public final int o() {
        return k();
    }

    @Override // defpackage.aigm
    public final long p() {
        return B();
    }

    @Override // defpackage.aigm
    public final long q() {
        return s();
    }

    public final int r() throws aiik {
        int i = this.d;
        if (this.c - i < 4) {
            X(4);
            i = this.d;
        }
        byte[] bArr = this.b;
        this.d = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    @Override // defpackage.aigm
    public final long s() {
        int i;
        long j;
        long j2;
        long j3;
        long j4;
        int i2;
        int i3 = this.d;
        int i4 = this.c;
        if (i4 != i3) {
            byte[] bArr = this.b;
            int i5 = i3 + 1;
            byte b = bArr[i3];
            if (b >= 0) {
                this.d = i5;
                return b;
            }
            if (i4 - i5 >= 9) {
                int i6 = i3 + 2;
                int i7 = b ^ (bArr[i5] << 7);
                if (i7 >= 0) {
                    i = i3 + 3;
                    int i8 = i7 ^ (bArr[i6] << 14);
                    if (i8 >= 0) {
                        j4 = i8 ^ 16256;
                    } else {
                        i6 = i3 + 4;
                        int i9 = i8 ^ (bArr[i] << 21);
                        if (i9 < 0) {
                            i2 = i9 ^ (-2080896);
                        } else {
                            i = i3 + 5;
                            long j5 = ((long) i9) ^ (((long) bArr[i6]) << 28);
                            if (j5 >= 0) {
                                j2 = 266354560;
                            } else {
                                int i10 = i3 + 6;
                                long j6 = j5 ^ (((long) bArr[i]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i = i3 + 7;
                                    j5 = j6 ^ (((long) bArr[i10]) << 42);
                                    if (j5 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i3 + 8;
                                        j6 = j5 ^ (((long) bArr[i]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i = i3 + 9;
                                            j5 = j6 ^ (((long) bArr[i10]) << 56);
                                            if (j5 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                byte b2 = bArr[i];
                                                long j7 = j5 ^ (((long) b2) << 63);
                                                if (j7 >= 0) {
                                                    int i11 = i3 + 10;
                                                    if (b2 >= 0) {
                                                        j = j7 ^ (-9151873028817141888L);
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                        j4 = j;
                                    }
                                }
                                j = j6 ^ j3;
                                i = i10;
                                j4 = j;
                            }
                            j = j5 ^ j2;
                            j4 = j;
                        }
                    }
                    this.d = i;
                    return j4;
                }
                i2 = i7 ^ (-128);
                i = i6;
                j4 = i2;
                this.d = i;
                return j4;
            }
        }
        return I();
    }

    @Override // defpackage.aigm
    public final long t() {
        return B();
    }

    @Override // defpackage.aigm
    public final long u() {
        long jS = s();
        return (jS >>> 1) ^ (-(jS & 1));
    }

    @Override // defpackage.aigm
    public final long v() {
        return s();
    }

    @Override // defpackage.aigm
    public final aigj w() throws IOException {
        int iK = k();
        int i = this.c;
        int i2 = this.d;
        if (iK <= i - i2 && iK > 0) {
            aigj aigjVarH = aigj.H(this.b, i2, iK);
            this.d += iK;
            return aigjVarH;
        }
        if (iK == 0) {
            return aigj.d;
        }
        if (iK < 0) {
            throw new aiik("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrZ = Z(iK);
        if (bArrZ != null) {
            return aigj.H(bArrZ, 0, bArrZ.length);
        }
        int i3 = this.d;
        int i4 = this.c;
        int i5 = i4 - i3;
        this.e += i4;
        this.d = 0;
        this.c = 0;
        List<byte[]> listV = V(iK - i5);
        byte[] bArr = new byte[iK];
        System.arraycopy(this.b, i3, bArr, 0, i5);
        for (byte[] bArr2 : listV) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        aigj aigjVar = aigj.d;
        try {
            return aigj.J(bArr);
        } catch (aiik e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    @Override // defpackage.aigm
    public final String x() throws aiik {
        int iK = k();
        if (iK > 0) {
            int i = this.c;
            int i2 = this.d;
            if (iK <= i - i2) {
                String str = new String(this.b, i2, iK, StandardCharsets.UTF_8);
                this.d += iK;
                return str;
            }
        }
        if (iK == 0) {
            return "";
        }
        if (iK < 0) {
            throw new aiik("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iK > this.c) {
            return new String(J(iK), StandardCharsets.UTF_8);
        }
        X(iK);
        String str2 = new String(this.b, this.d, iK, StandardCharsets.UTF_8);
        this.d += iK;
        return str2;
    }

    @Override // defpackage.aigm
    public final String y() throws aiik {
        byte[] bArrJ;
        int iK = k();
        int i = this.d;
        int i2 = this.c;
        if (iK <= i2 - i && iK > 0) {
            bArrJ = this.b;
            this.d = i + iK;
        } else {
            if (iK == 0) {
                return "";
            }
            if (iK < 0) {
                throw new aiik("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (iK <= i2) {
                X(iK);
                bArrJ = this.b;
                this.d = iK;
            } else {
                bArrJ = J(iK);
            }
        }
        return iK != 0 ? ahng.aL(bArrJ, i, iK) : "";
    }

    @Override // defpackage.aigm
    public final void z(int i) throws aiik {
        if (this.n != i) {
            throw new aiik("Protocol message end-group tag did not match expected tag.");
        }
    }
}
