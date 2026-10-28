package defpackage;

import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.chromium.base.JniAndroid;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axpr extends axps {
    private final InputStream f;
    private final byte[] g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m = Alert.DURATION_SHOW_INDEFINITELY;

    public axpr(InputStream inputStream) {
        byte[] bArr = axqj.a;
        this.f = inputStream;
        this.g = new byte[SemanticState.Obscured];
        this.h = 0;
        this.j = 0;
        this.l = 0;
    }

    private static int I(InputStream inputStream, byte[] bArr, int i, int i2) throws axqm {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (axqm e) {
            e.a();
            throw e;
        }
    }

    private final List J(int i) throws axqm {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, SemanticState.Obscured);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int I = I(this.f, bArr, i2, iMin - i2);
                if (I == -1) {
                    throw new axqm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.l += I;
                i2 += I;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void K() {
        int i = this.h + this.i;
        this.h = i;
        int i2 = this.l + i;
        int i3 = this.m;
        if (i2 <= i3) {
            this.i = 0;
            return;
        }
        int i4 = i2 - i3;
        this.i = i4;
        this.h = i - i4;
    }

    private final void L(int i) throws axqm {
        if (M(i)) {
            return;
        }
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - this.l) - this.j) {
            throw new axqm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new axqm("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private final boolean M(int i) throws IOException {
        int i2 = this.j;
        int i3 = i2 + i;
        int i4 = this.h;
        if (i3 <= i4) {
            throw new IllegalStateException(a.bP(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.l;
        int i6 = i5 + i2;
        if (a.an(i6, i, Alert.DURATION_SHOW_INDEFINITELY) || a.an(i6, i, this.m)) {
            return false;
        }
        if (i2 > 0) {
            if (i4 > i2) {
                byte[] bArr = this.g;
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            i5 = this.l + i2;
            this.l = i5;
            i4 = this.h - i2;
            this.h = i4;
            this.j = 0;
        }
        try {
            int i7 = this.f.read(this.g, i4, Math.min(4096 - i4, (Alert.DURATION_SHOW_INDEFINITELY - i5) - i4));
            if (i7 != 0 && i7 >= -1 && i7 <= 4096) {
                if (i7 <= 0) {
                    return false;
                }
                this.h += i7;
                K();
                return this.h >= i || M(i);
            }
            throw new IllegalStateException(this.f.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
        } catch (axqm e) {
            e.a();
            throw e;
        }
    }

    private final byte[] N(int i) throws axqm {
        if (i == 0) {
            return axqj.a;
        }
        int i2 = this.l;
        int i3 = this.j;
        int i4 = i2 + i3;
        if (a.an(i4, i, Alert.DURATION_SHOW_INDEFINITELY)) {
            throw new axqm("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.m;
        if (a.an(i4, i, i5)) {
            if (i5 >= i4) {
                E(i5 - i4);
            }
            throw new axqm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = this.h - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.f.available()) {
                    return null;
                }
            } catch (axqm e) {
                e.a();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.g, this.j, bArr, 0, i6);
        this.l += this.h;
        this.j = 0;
        this.h = 0;
        while (i6 < i) {
            int I = I(this.f, bArr, i6, i - i6);
            if (I == -1) {
                throw new axqm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.l += I;
            i6 += I;
        }
        return bArr;
    }

    private final byte[] O(int i) throws axqm {
        byte[] bArrN = N(i);
        if (bArrN != null) {
            return bArrN;
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i3 - i2;
        this.l += i3;
        this.j = 0;
        this.h = 0;
        List<byte[]> listJ = J(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.g, i2, bArr, 0, i4);
        for (byte[] bArr2 : listJ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    @Override // defpackage.axps
    public final boolean A() {
        return this.j == this.h && !M(1);
    }

    @Override // defpackage.axps
    public final boolean B() {
        return z() != 0;
    }

    @Override // defpackage.axps
    public final boolean C(int i) throws axqm {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.h - this.j < 10) {
                while (i3 < 10) {
                    if (a() < 0) {
                        i3++;
                    }
                }
                throw new axqm("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                byte[] bArr = this.g;
                int i4 = this.j;
                this.j = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw new axqm("CodedInputStream encountered a malformed varint.");
        }
        if (i2 == 1) {
            E(8);
        } else if (i2 == 2) {
            E(j());
        } else if (i2 == 3) {
            H();
            x(((i >>> 3) << 3) | 4);
        } else {
            if (i2 == 4) {
                G();
                return false;
            }
            if (i2 != 5) {
                throw new axql();
            }
            E(4);
        }
        return true;
    }

    final long D() throws axqm {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bA = a();
            j |= ((long) (bA & 127)) << i;
            if ((bA & 128) == 0) {
                return j;
            }
        }
        throw new axqm("CodedInputStream encountered a malformed varint.");
    }

    public final void E(int i) throws axqm {
        int i2 = this.h;
        int i3 = this.j;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.j = i3 + i;
            return;
        }
        if (i < 0) {
            throw new axqm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.l + i3;
        if (a.an(i5, i, Alert.DURATION_SHOW_INDEFINITELY)) {
            throw new axqm("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i6 = this.m;
        if (a.an(i5, i, i6)) {
            if (i6 >= i5) {
                E(i6 - i5);
            }
            throw new axqm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.l = i5;
        this.h = 0;
        this.j = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                try {
                    long jSkip = this.f.skip(j);
                    if (jSkip >= 0 && jSkip <= j) {
                        if (jSkip == 0) {
                            break;
                        } else {
                            i4 += (int) jSkip;
                        }
                    } else {
                        throw new IllegalStateException(this.f.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                } catch (axqm e) {
                    e.a();
                    throw e;
                }
            } catch (Throwable th) {
                this.l += i4;
                K();
                throw th;
            }
        }
        this.l += i4;
        K();
        if (i4 >= i) {
            return;
        }
        int i7 = this.h;
        int i8 = i7 - this.j;
        this.j = i7;
        L(1);
        while (true) {
            int i9 = i - i8;
            int i10 = this.h;
            if (i9 <= i10) {
                this.j = i9;
                return;
            } else {
                i8 += i10;
                this.j = i10;
                L(1);
            }
        }
    }

    public final byte a() throws axqm {
        if (this.j == this.h) {
            L(1);
        }
        byte[] bArr = this.g;
        int i = this.j;
        this.j = i + 1;
        return bArr[i];
    }

    @Override // defpackage.axps
    public final double b() {
        return Double.longBitsToDouble(q());
    }

    @Override // defpackage.axps
    public final float c() {
        return Float.intBitsToFloat(i());
    }

    @Override // defpackage.axps
    public final int d() {
        return this.l + this.j;
    }

    @Override // defpackage.axps
    public final int e(int i) throws axqm {
        if (i < 0) {
            throw new axqm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.l + this.j;
        if (i > Alert.DURATION_SHOW_INDEFINITELY - i2) {
            throw new axqm("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.m;
        if (a.an(i2, i, i3)) {
            throw new axqm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.m = i2 + i;
        K();
        return i3;
    }

    @Override // defpackage.axps
    public final int f() {
        return j();
    }

    @Override // defpackage.axps
    public final int g() {
        return i();
    }

    @Override // defpackage.axps
    public final int h() {
        return j();
    }

    public final int i() throws axqm {
        int i = this.j;
        if (this.h - i < 4) {
            L(4);
            i = this.j;
        }
        byte[] bArr = this.g;
        this.j = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j() {
        /*
            r6 = this;
            int r0 = r6.j
            int r1 = r6.h
            if (r1 == r0) goto L6b
            byte[] r2 = r6.g
            int r3 = r0 + 1
            r4 = r2[r0]
            if (r4 < 0) goto L11
            r6.j = r3
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
            r6.j = r1
            goto L70
        L6b:
            long r0 = r6.D()
            int r4 = (int) r0
        L70:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axpr.j():int");
    }

    @Override // defpackage.axps
    public final int k() {
        return i();
    }

    @Override // defpackage.axps
    public final int l() {
        int iJ = j();
        return (iJ >>> 1) ^ (-(iJ & 1));
    }

    @Override // defpackage.axps
    public final int m() throws axqm {
        if (A()) {
            this.k = 0;
            return 0;
        }
        int iJ = j();
        this.k = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw new axqm("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.axps
    public final int n() {
        return j();
    }

    @Override // defpackage.axps
    public final long o() {
        return q();
    }

    @Override // defpackage.axps
    public final long p() {
        return z();
    }

    public final long q() throws axqm {
        int i = this.j;
        if (this.h - i < 8) {
            L(8);
            i = this.j;
        }
        byte[] bArr = this.g;
        this.j = i + 8;
        return (bArr[i] & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    @Override // defpackage.axps
    public final long r() {
        return q();
    }

    @Override // defpackage.axps
    public final long s() {
        long jZ = z();
        return (jZ >>> 1) ^ (-(jZ & 1));
    }

    @Override // defpackage.axps
    public final long t() {
        return z();
    }

    @Override // defpackage.axps
    public final String u() throws axqm {
        int iJ = j();
        if (iJ > 0) {
            int i = this.h;
            int i2 = this.j;
            if (iJ <= i - i2) {
                String str = new String(this.g, i2, iJ, StandardCharsets.UTF_8);
                this.j += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw new axqm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iJ > this.h) {
            return new String(O(iJ), StandardCharsets.UTF_8);
        }
        L(iJ);
        String str2 = new String(this.g, this.j, iJ, StandardCharsets.UTF_8);
        this.j += iJ;
        return str2;
    }

    @Override // defpackage.axps
    public final String v() throws axqm {
        byte[] bArrO;
        int iJ = j();
        int i = this.j;
        int i2 = this.h;
        if (iJ <= i2 - i && iJ > 0) {
            bArrO = this.g;
            this.j = i + iJ;
        } else {
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw new axqm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (iJ <= i2) {
                L(iJ);
                bArrO = this.g;
                this.j = iJ;
            } else {
                bArrO = O(iJ);
            }
        }
        int i3 = axrs.a;
        return iJ != 0 ? JniAndroid.c(bArrO, i, iJ) : "";
    }

    @Override // defpackage.axps
    public final axpo w() throws axqm {
        int iJ = j();
        int i = this.h;
        int i2 = this.j;
        if (iJ <= i - i2 && iJ > 0) {
            axpo axpoVarK = axpo.k(this.g, i2, iJ);
            this.j += iJ;
            return axpoVarK;
        }
        if (iJ == 0) {
            return axpo.d;
        }
        if (iJ < 0) {
            throw new axqm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrN = N(iJ);
        if (bArrN != null) {
            return axpo.k(bArrN, 0, bArrN.length);
        }
        int i3 = this.j;
        int i4 = this.h;
        int i5 = i4 - i3;
        this.l += i4;
        this.j = 0;
        this.h = 0;
        List<byte[]> listJ = J(iJ - i5);
        byte[] bArr = new byte[iJ];
        System.arraycopy(this.g, i3, bArr, 0, i5);
        for (byte[] bArr2 : listJ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return axpo.i(bArr);
    }

    @Override // defpackage.axps
    public final void x(int i) throws axqm {
        if (this.k != i) {
            throw new axqm("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.axps
    public final void y(int i) {
        this.m = i;
        K();
    }

    public final long z() {
        int i;
        long j;
        long j2;
        long j3;
        long j4;
        int i2;
        int i3 = this.j;
        int i4 = this.h;
        if (i4 != i3) {
            byte[] bArr = this.g;
            int i5 = i3 + 1;
            byte b = bArr[i3];
            if (b >= 0) {
                this.j = i5;
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
                                    j = -34093383808L;
                                } else {
                                    i = i3 + 7;
                                    j5 = j6 ^ (((long) bArr[i10]) << 42);
                                    if (j5 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i3 + 8;
                                        j6 = j5 ^ (((long) bArr[i]) << 49);
                                        if (j6 < 0) {
                                            j = -558586000294016L;
                                        } else {
                                            i = i3 + 9;
                                            j5 = j6 ^ (((long) bArr[i10]) << 56);
                                            if (j5 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                i10 = i3 + 10;
                                                j6 = j5 ^ (((long) bArr[i]) << 63);
                                                if (j6 >= 0) {
                                                    j = -9151873028817141888L;
                                                }
                                            }
                                        }
                                    }
                                }
                                j3 = j6 ^ j;
                                i = i10;
                                j4 = j3;
                            }
                            j3 = j5 ^ j2;
                            j4 = j3;
                        }
                    }
                    this.j = i;
                    return j4;
                }
                i2 = i7 ^ (-128);
                i = i6;
                j4 = i2;
                this.j = i;
                return j4;
            }
        }
        return D();
    }
}
