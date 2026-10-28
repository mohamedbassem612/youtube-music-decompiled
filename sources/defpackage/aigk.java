package defpackage;

import androidx.car.app.model.Alert;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aigk extends aigm {
    public boolean a;
    private final byte[] b;
    private final int c;
    private final boolean d;
    private int e;
    private int f;
    private final int m;
    private int n;
    private int o = Alert.DURATION_SHOW_INDEFINITELY;

    public aigk(byte[] bArr, int i, int i2, boolean z) {
        this.b = bArr;
        int i3 = i2 + i;
        this.c = i3;
        this.e = i3;
        this.f = i;
        this.m = i;
        this.d = z;
    }

    @Override // defpackage.aigm
    public final void A(int i) {
        B(i);
    }

    public final void B(int i) {
        this.o = i;
        int i2 = this.c;
        if (i > i2) {
            i = i2;
        }
        this.e = i;
    }

    @Override // defpackage.aigm
    public final void C(int i) throws aiik {
        if (i < 0) {
            throw new aiik("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.e;
        int i3 = this.f;
        if (i > i2 - i3) {
            throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f = i3 + i;
    }

    @Override // defpackage.aigm
    public final boolean D() {
        return this.f == this.e;
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
            if (this.e - this.f < 10) {
                while (i3 < 10) {
                    if (a() < 0) {
                        i3++;
                    }
                }
                throw new aiik("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                byte[] bArr = this.b;
                int i4 = this.f;
                this.f = i4 + 1;
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
        return H(k());
    }

    @Override // defpackage.aigm
    public final byte[] H(int i) throws aiik {
        if (i <= 0) {
            if (i == 0) {
                return aiif.a;
            }
            throw new aiik("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.e;
        int i3 = this.f;
        if (i > i2 - i3) {
            throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = i + i3;
        this.f = i4;
        return Arrays.copyOfRange(this.b, i3, i4);
    }

    public final byte a() throws aiik {
        int i = this.f;
        if (i == this.e) {
            throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.b;
        this.f = i + 1;
        return bArr[i];
    }

    @Override // defpackage.aigm
    public final double b() {
        return Double.longBitsToDouble(r());
    }

    @Override // defpackage.aigm
    public final float c() {
        return Float.intBitsToFloat(j());
    }

    @Override // defpackage.aigm
    public final int d() {
        int i = this.o;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.f;
    }

    @Override // defpackage.aigm
    public final int e() {
        return this.f - this.m;
    }

    @Override // defpackage.aigm
    public final int f(int i) {
        if (i < 0) {
            throw new aiik("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.f;
        int i3 = i2 + i;
        if (i3 < 0) {
            int i4 = i2 - this.m;
            i3 = Alert.DURATION_SHOW_INDEFINITELY;
            if (i > Alert.DURATION_SHOW_INDEFINITELY - i4) {
                throw new aiik("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
        }
        int i5 = this.o;
        if (i3 > i5) {
            throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        B(i3);
        return i5;
    }

    @Override // defpackage.aigm
    public final int g() {
        return k();
    }

    @Override // defpackage.aigm
    public final int h() {
        return j();
    }

    @Override // defpackage.aigm
    public final int i() {
        return k();
    }

    public final int j() throws aiik {
        int i = this.f;
        if (this.e - i < 4) {
            throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.b;
        this.f = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    @Override // defpackage.aigm
    public final int k() throws aiik {
        try {
            int i = this.f;
            byte[] bArr = this.b;
            int i2 = i + 1;
            int i3 = bArr[i];
            if (i3 < 0) {
                int i4 = i + 2;
                int i5 = i3 ^ (bArr[i2] << 7);
                if (i5 < 0) {
                    i3 = i5 ^ (-128);
                } else {
                    i2 = i + 3;
                    int i6 = i5 ^ (bArr[i4] << 14);
                    if (i6 >= 0) {
                        i3 = i6 ^ 16256;
                    } else {
                        i4 = i + 4;
                        int i7 = i6 ^ (bArr[i2] << 21);
                        if (i7 < 0) {
                            i3 = i7 ^ (-2080896);
                        } else {
                            i2 = i + 5;
                            int i8 = bArr[i4];
                            i3 = (i7 ^ (i8 << 28)) ^ 266354560;
                            if (i8 < 0) {
                                i4 = i + 6;
                                if (bArr[i2] < 0) {
                                    i2 = i + 7;
                                    if (bArr[i4] < 0) {
                                        i4 = i + 8;
                                        if (bArr[i2] < 0) {
                                            i2 = i + 9;
                                            if (bArr[i4] < 0) {
                                                int i9 = i + 10;
                                                if (bArr[i2] < 0) {
                                                    throw new aiik("CodedInputStream encountered a malformed varint.");
                                                }
                                                i2 = i9;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i2 = i4;
            }
            this.f = i2;
            if (i2 <= this.e) {
                return i3;
            }
            throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (aiik e) {
            if (this.f > this.e) {
                throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // defpackage.aigm
    public final int l() {
        return j();
    }

    @Override // defpackage.aigm
    public final int m() throws aiik {
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
        return r();
    }

    @Override // defpackage.aigm
    public final long q() {
        return s();
    }

    public final long r() throws aiik {
        int i = this.f;
        if (this.e - i < 8) {
            throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.b;
        this.f = i + 8;
        return (bArr[i] & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    @Override // defpackage.aigm
    public final long s() throws aiik {
        int i;
        long j;
        long j2;
        long j3;
        long j4;
        int i2;
        int i3 = this.f;
        int i4 = this.e;
        long j5 = 0;
        if (i4 != i3) {
            byte[] bArr = this.b;
            int i5 = i3 + 1;
            byte b = bArr[i3];
            if (b >= 0) {
                this.f = i5;
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
                            long j6 = ((long) i9) ^ (((long) bArr[i6]) << 28);
                            if (j6 >= 0) {
                                j2 = 266354560;
                            } else {
                                int i10 = i3 + 6;
                                long j7 = j6 ^ (((long) bArr[i]) << 35);
                                if (j7 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i = i3 + 7;
                                    j6 = j7 ^ (((long) bArr[i10]) << 42);
                                    if (j6 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i3 + 8;
                                        j7 = j6 ^ (((long) bArr[i]) << 49);
                                        if (j7 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i = i3 + 9;
                                            j6 = j7 ^ (((long) bArr[i10]) << 56);
                                            if (j6 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                byte b2 = bArr[i];
                                                long j8 = j6 ^ (((long) b2) << 63);
                                                if (j8 >= 0) {
                                                    int i11 = i3 + 10;
                                                    if (b2 >= 0) {
                                                        j = j8 ^ (-9151873028817141888L);
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                        j4 = j;
                                    }
                                }
                                j = j7 ^ j3;
                                i = i10;
                                j4 = j;
                            }
                            j = j6 ^ j2;
                            j4 = j;
                        }
                    }
                    this.f = i;
                    return j4;
                }
                i2 = i7 ^ (-128);
                i = i6;
                j4 = i2;
                this.f = i;
                return j4;
            }
        }
        for (int i12 = 0; i12 < 64; i12 += 7) {
            byte bA = a();
            j5 |= ((long) (bA & 127)) << i12;
            if ((bA & 128) == 0) {
                return j5;
            }
        }
        throw new aiik("CodedInputStream encountered a malformed varint.");
    }

    @Override // defpackage.aigm
    public final long t() {
        return r();
    }

    @Override // defpackage.aigm
    public final long u() throws aiik {
        long jS = s();
        return (jS >>> 1) ^ (-(jS & 1));
    }

    @Override // defpackage.aigm
    public final long v() {
        return s();
    }

    @Override // defpackage.aigm
    public final aigj w() throws aiik {
        aigj aigjVarH;
        int iK = k();
        if (iK > 0) {
            int i = this.e;
            int i2 = this.f;
            if (iK <= i - i2) {
                if (this.d && this.a) {
                    byte[] bArr = this.b;
                    aigj aigjVar = aigj.d;
                    aigjVarH = new aige(bArr, i2, iK);
                } else {
                    aigjVarH = aigj.H(this.b, i2, iK);
                }
                this.f += iK;
                return aigjVarH;
            }
        }
        return iK == 0 ? aigj.d : aigj.J(H(iK));
    }

    @Override // defpackage.aigm
    public final String x() throws aiik {
        int iK = k();
        if (iK > 0) {
            int i = this.e;
            int i2 = this.f;
            if (iK <= i - i2) {
                String str = new String(this.b, i2, iK, StandardCharsets.UTF_8);
                this.f += iK;
                return str;
            }
        }
        if (iK == 0) {
            return "";
        }
        if (iK < 0) {
            throw new aiik("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.aigm
    public final String y() throws aiik {
        int iK = k();
        if (iK > 0) {
            int i = this.e;
            int i2 = this.f;
            if (iK <= i - i2) {
                String strAI = ahng.aI(this.b, i2, iK);
                this.f += iK;
                return strAI;
            }
        }
        if (iK == 0) {
            return "";
        }
        if (iK <= 0) {
            throw new aiik("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new aiik("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.aigm
    public final void z(int i) throws aiik {
        if (this.n != i) {
            throw new aiik("Protocol message end-group tag did not match expected tag.");
        }
    }
}
