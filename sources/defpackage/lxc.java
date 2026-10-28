package defpackage;

import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lxc extends lxd {
    private final InputStream a;
    private final byte[] b;
    private int c;
    private int d;
    private int e;
    private int g;

    public lxc(InputStream inputStream) {
        byte[] bArr = lyf.a;
        this.a = inputStream;
        this.b = new byte[SemanticState.Obscured];
        this.c = 0;
        this.e = 0;
        this.g = 0;
    }

    private static int f(InputStream inputStream, byte[] bArr, int i, int i2) throws lyh {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (lyh e) {
            e.a();
            throw e;
        }
    }

    private final void g() {
        this.c = this.c;
        this.d = 0;
    }

    private final void h() throws lyh {
        if (i()) {
            return;
        }
        if ((Alert.DURATION_SHOW_INDEFINITELY - this.g) - this.e > 0) {
            throw new lyh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new lyh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private final boolean i() throws lyh {
        int i = this.e;
        int i2 = i + 1;
        int i3 = this.c;
        if (i2 <= i3) {
            throw new IllegalStateException(a.bP(1, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i4 = this.g;
        int i5 = i4 + i;
        if (!a.an(i5, 1, Alert.DURATION_SHOW_INDEFINITELY) && !a.an(i5, 1, Alert.DURATION_SHOW_INDEFINITELY)) {
            if (i > 0) {
                if (i3 > i) {
                    byte[] bArr = this.b;
                    System.arraycopy(bArr, i, bArr, 0, i3 - i);
                }
                i4 = this.g + i;
                this.g = i4;
                i3 = this.c - i;
                this.c = i3;
                this.e = 0;
            }
            InputStream inputStream = this.a;
            int iF = f(inputStream, this.b, i3, Math.min(4096 - i3, (Alert.DURATION_SHOW_INDEFINITELY - i4) - i3));
            if (iF == 0 || iF < -1 || iF > 4096) {
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + iF + "\nThe InputStream implementation is buggy.");
            }
            if (iF > 0) {
                this.c += iF;
                g();
                if (this.c > 0 || i()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.lxd
    public final boolean a() {
        return this.e == this.c && !i();
    }

    /* JADX WARN: Code duplicated, block: B:105:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:38:0x007b  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f8 A[LOOP:3: B:65:0x00ec->B:68:0x00f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x017e A[LOOP:4: B:34:0x0071->B:95:0x017e, LOOP_END] */
    @Override // defpackage.lxd
    public final byte[] b() throws lyh {
        long j;
        int i;
        byte[] bArr;
        int i2;
        byte b;
        int i3;
        byte[] bArr2;
        int i4;
        byte[] bArr3;
        byte[] bArr4;
        int iF;
        int i5 = this.e;
        int i6 = this.c;
        if (i6 != i5) {
            bArr2 = this.b;
            i4 = i5 + 1;
            i3 = bArr2[i5];
            if (i3 >= 0) {
                this.e = i4;
            } else if (i6 - i4 >= 9) {
                int i7 = i5 + 2;
                int i8 = i3 ^ (bArr2[i4] << 7);
                if (i8 < 0) {
                    i3 = i8 ^ (-128);
                } else {
                    i4 = i5 + 3;
                    int i9 = i8 ^ (bArr2[i7] << 14);
                    if (i9 >= 0) {
                        i3 = i9 ^ 16256;
                    } else {
                        i7 = i5 + 4;
                        int i10 = i9 ^ (bArr2[i4] << 21);
                        if (i10 < 0) {
                            i3 = i10 ^ (-2080896);
                        } else {
                            i4 = i5 + 5;
                            byte b2 = bArr2[i7];
                            i3 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i7 = i5 + 6;
                                if (bArr2[i4] < 0) {
                                    i4 = i5 + 7;
                                    if (bArr2[i7] < 0) {
                                        i7 = i5 + 8;
                                        if (bArr2[i4] < 0) {
                                            i4 = i5 + 9;
                                            if (bArr2[i7] < 0) {
                                                int i11 = i5 + 10;
                                                if (bArr2[i4] >= 0) {
                                                    i4 = i11;
                                                } else {
                                                    j = 0;
                                                    i = 0;
                                                    while (true) {
                                                        if (i >= 64) {
                                                            throw new lyh("CodedInputStream encountered a malformed varint.");
                                                        }
                                                        if (this.e == this.c) {
                                                            h();
                                                        }
                                                        bArr = this.b;
                                                        int i12 = this.e;
                                                        i2 = i12 + 1;
                                                        this.e = i2;
                                                        b = bArr[i12];
                                                        j |= ((long) (b & 127)) << i;
                                                        if ((b & 128) == 0) {
                                                            i3 = (int) j;
                                                            bArr2 = bArr;
                                                            i4 = i2;
                                                            break;
                                                        }
                                                        i += 7;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.e = i4;
                }
                i4 = i7;
                this.e = i4;
            } else {
                j = 0;
                i = 0;
                while (true) {
                    if (i >= 64) {
                        throw new lyh("CodedInputStream encountered a malformed varint.");
                    }
                    if (this.e == this.c) {
                        h();
                    }
                    bArr = this.b;
                    int i13 = this.e;
                    i2 = i13 + 1;
                    this.e = i2;
                    b = bArr[i13];
                    j |= ((long) (b & 127)) << i;
                    if ((b & 128) == 0) {
                        i3 = (int) j;
                        bArr2 = bArr;
                        i4 = i2;
                        break;
                    }
                    i += 7;
                }
            }
        } else {
            j = 0;
            i = 0;
            while (true) {
                if (i >= 64) {
                    throw new lyh("CodedInputStream encountered a malformed varint.");
                }
                if (this.e == this.c) {
                    h();
                }
                bArr = this.b;
                int i14 = this.e;
                i2 = i14 + 1;
                this.e = i2;
                b = bArr[i14];
                j |= ((long) (b & 127)) << i;
                if ((b & 128) == 0) {
                    i3 = (int) j;
                    bArr2 = bArr;
                    i4 = i2;
                    break;
                }
                i += 7;
            }
        }
        int i15 = this.c - i4;
        if (i3 <= i15 && i3 > 0) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, i4, i4 + i3);
            this.e += i3;
            return bArrCopyOfRange;
        }
        if (i3 < 0) {
            throw new lyh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 == 0) {
            bArr4 = lyf.a;
        } else {
            int i16 = this.g + i4;
            if (a.an(i16, i3, Alert.DURATION_SHOW_INDEFINITELY)) {
                throw new lyh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
            if (a.an(i16, i3, Alert.DURATION_SHOW_INDEFINITELY)) {
                c(Alert.DURATION_SHOW_INDEFINITELY - i16);
                throw new lyh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            int i17 = i3 - i15;
            if (i17 >= 4096) {
                try {
                    if (i17 > this.a.available()) {
                        bArr4 = null;
                    } else {
                        bArr3 = new byte[i3];
                        System.arraycopy(this.b, this.e, bArr3, 0, i15);
                        this.g += this.c;
                        this.e = 0;
                        this.c = 0;
                        while (i15 < i3) {
                            iF = f(this.a, bArr3, i15, i3 - i15);
                            if (iF != -1) {
                                throw new lyh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                            }
                            this.g += iF;
                            i15 += iF;
                        }
                        bArr4 = bArr3;
                    }
                } catch (lyh e) {
                    e.a();
                    throw e;
                }
            } else {
                bArr3 = new byte[i3];
                System.arraycopy(this.b, this.e, bArr3, 0, i15);
                this.g += this.c;
                this.e = 0;
                this.c = 0;
                while (i15 < i3) {
                    iF = f(this.a, bArr3, i15, i3 - i15);
                    if (iF != -1) {
                        throw new lyh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    this.g += iF;
                    i15 += iF;
                }
                bArr4 = bArr3;
            }
        }
        if (bArr4 != null) {
            return bArr4;
        }
        int i18 = this.e;
        int i19 = this.c;
        int i20 = i19 - i18;
        this.g += i19;
        this.e = 0;
        this.c = 0;
        int i21 = i3 - i20;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i21 > 0) {
            int iMin = Math.min(i21, SemanticState.Obscured);
            byte[] bArr5 = new byte[iMin];
            int i22 = 0;
            while (i22 < iMin) {
                int iF2 = f(this.a, bArr5, i22, iMin - i22);
                if (iF2 == -1) {
                    throw new lyh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.g += iF2;
                i22 += iF2;
            }
            i21 -= iMin;
            arrayList.add(bArr5);
        }
        byte[] bArr6 = new byte[i3];
        System.arraycopy(this.b, i18, bArr6, 0, i20);
        for (byte[] bArr7 : arrayList) {
            int length = bArr7.length;
            System.arraycopy(bArr7, 0, bArr6, i20, length);
            i20 += length;
        }
        return bArr6;
    }

    public final void c(int i) throws lyh {
        int i2 = this.c;
        int i3 = this.e;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.e = i3 + i;
            return;
        }
        if (i < 0) {
            throw new lyh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.g + i3;
        if (a.an(i5, i, Alert.DURATION_SHOW_INDEFINITELY)) {
            throw new lyh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        if (a.an(i5, i, Alert.DURATION_SHOW_INDEFINITELY)) {
            c(Alert.DURATION_SHOW_INDEFINITELY - i5);
            throw new lyh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.g = i5;
        this.c = 0;
        this.e = 0;
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
                        throw new IllegalStateException(this.a.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                } catch (lyh e) {
                    e.a();
                    throw e;
                }
            } catch (Throwable th) {
                this.g += i4;
                g();
                throw th;
            }
        }
        this.g += i4;
        g();
        if (i4 >= i) {
            return;
        }
        int i6 = this.c;
        int i7 = i6 - this.e;
        this.e = i6;
        h();
        while (true) {
            int i8 = i - i7;
            int i9 = this.c;
            if (i8 <= i9) {
                this.e = i8;
                return;
            } else {
                i7 += i9;
                this.e = i9;
                h();
            }
        }
    }
}
