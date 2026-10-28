package defpackage;

import app.rive.semantics.SemanticState;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import org.chromium.base.AndroidInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axig implements Cloneable, ByteChannel, Closeable, Flushable, WritableByteChannel, axih {
    public axio a;
    public long b;

    public final byte a(long j) {
        AndroidInfo.c(this.b, j, 1L);
        axio axioVar = this.a;
        axioVar.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                axioVar = axioVar.g;
                axioVar.getClass();
                j2 -= (long) (axioVar.c - axioVar.b);
            }
            axioVar.getClass();
            return axioVar.a[(int) ((((long) axioVar.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = axioVar.c;
            int i2 = axioVar.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                axioVar.getClass();
                return axioVar.a[(int) ((((long) i2) + j) - j3)];
            }
            axioVar = axioVar.f;
            axioVar.getClass();
            j3 = j4;
        }
    }

    public final byte b() {
        long j = this.b;
        if (j == 0) {
            throw new EOFException();
        }
        axio axioVar = this.a;
        axioVar.getClass();
        int i = axioVar.b;
        int i2 = i + 1;
        byte[] bArr = axioVar.a;
        int i3 = axioVar.c;
        byte b = bArr[i];
        this.b = j - 1;
        if (i2 == i3) {
            this.a = axioVar.a();
            axip.b(axioVar);
        } else {
            axioVar.b = i2;
        }
        return b;
    }

    public final int c(byte[] bArr, int i, int i2) {
        AndroidInfo.c(bArr.length, i, i2);
        axio axioVar = this.a;
        if (axioVar == null) {
            return -1;
        }
        int iMin = Math.min(i2, axioVar.c - axioVar.b);
        int i3 = axioVar.b;
        System.arraycopy(axioVar.a, i3, bArr, i, (i3 + iMin) - i3);
        int i4 = axioVar.b + iMin;
        axioVar.b = i4;
        this.b -= (long) iMin;
        if (i4 == axioVar.c) {
            this.a = axioVar.a();
            axip.b(axioVar);
        }
        return iMin;
    }

    public final /* synthetic */ Object clone() {
        axig axigVar = new axig();
        if (this.b != 0) {
            axio axioVar = this.a;
            axioVar.getClass();
            axio axioVarB = axioVar.b();
            axigVar.a = axioVarB;
            axioVarB.g = axioVarB;
            axioVarB.f = axioVarB.g;
            for (axio axioVar2 = axioVar.f; axioVar2 != axioVar; axioVar2 = axioVar2.f) {
                axio axioVar3 = axioVarB.g;
                axioVar3.getClass();
                axioVar2.getClass();
                axioVar3.d(axioVar2.b());
            }
            axigVar.b = this.b;
        }
        return axigVar;
    }

    @Override // defpackage.axih
    public final long d(axii axiiVar) {
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.axir
    public final long e(axig axigVar, long j) {
        axio axioVarB;
        if (j < 0) {
            throw new IllegalArgumentException(a.bS(j, "byteCount < 0: "));
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        long j3 = j > j2 ? j2 : j;
        if (this == axigVar) {
            throw new IllegalArgumentException("source == this");
        }
        AndroidInfo.c(j2, 0L, j3);
        long j4 = j3;
        for (long j5 = 0; j4 > j5; j5 = 0) {
            axio axioVar = this.a;
            axioVar.getClass();
            int i = axioVar.c;
            axioVar.getClass();
            int i2 = i - axioVar.b;
            int i3 = 0;
            if (j4 < i2) {
                axio axioVar2 = axigVar.a;
                axio axioVar3 = axioVar2 != null ? axioVar2.g : null;
                int i4 = (int) j4;
                if (axioVar3 != null && axioVar3.e) {
                    if ((((long) axioVar3.c) + j4) - ((long) (axioVar3.d ? 0 : axioVar3.b)) <= 8192) {
                        axioVar.getClass();
                        axioVar.c(axioVar3, i4);
                        this.b -= j4;
                        axigVar.b += j4;
                        break;
                    }
                }
                axioVar.getClass();
                if (i4 > i2) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i4 >= 1024) {
                    axioVarB = axioVar.b();
                } else {
                    byte[] bArr = axioVar.a;
                    axio axioVarA = axip.a();
                    byte[] bArr2 = axioVarA.a;
                    int i5 = axioVar.b;
                    System.arraycopy(bArr, i5, bArr2, 0, (i5 + i4) - i5);
                    axioVarB = axioVarA;
                }
                axioVarB.c = axioVarB.b + i4;
                axioVar.b += i4;
                axio axioVar4 = axioVar.g;
                axioVar4.getClass();
                axioVar4.d(axioVarB);
                this.a = axioVarB;
            }
            axio axioVar5 = this.a;
            axioVar5.getClass();
            int i6 = axioVar5.c - axioVar5.b;
            this.a = axioVar5.a();
            axio axioVar6 = axigVar.a;
            if (axioVar6 == null) {
                axigVar.a = axioVar5;
                axioVar5.g = axioVar5;
                axioVar5.f = axioVar5.g;
            } else {
                axio axioVar7 = axioVar6.g;
                axioVar7.getClass();
                axioVar7.d(axioVar5);
                axio axioVar8 = axioVar5.g;
                if (axioVar8 == axioVar5) {
                    throw new IllegalStateException("cannot compact");
                }
                axioVar8.getClass();
                if (axioVar8.e) {
                    int i7 = axioVar5.c - axioVar5.b;
                    axioVar8.getClass();
                    int i8 = 8192 - axioVar8.c;
                    axioVar8.getClass();
                    if (!axioVar8.d) {
                        axioVar8.getClass();
                        i3 = axioVar8.b;
                    }
                    if (i7 <= i8 + i3) {
                        axioVar8.getClass();
                        axioVar5.c(axioVar8, i7);
                        axioVar5.a();
                        axip.b(axioVar5);
                    }
                }
            }
            long j6 = i6;
            this.b -= j6;
            axigVar.b += j6;
            j4 -= j6;
        }
        return j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof axig) {
            long j = this.b;
            axig axigVar = (axig) obj;
            if (j == axigVar.b) {
                if (j == 0) {
                    return true;
                }
                axio axioVar = this.a;
                axioVar.getClass();
                axio axioVar2 = axigVar.a;
                axioVar2.getClass();
                int i = axioVar.b;
                int i2 = axioVar2.b;
                long j2 = 0;
                while (j2 < this.b) {
                    long jMin = Math.min(axioVar.c - i, axioVar2.c - i2);
                    long j3 = 0;
                    while (j3 < jMin) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (axioVar.a[i] == axioVar2.a[i2]) {
                            j3++;
                            i = i3;
                            i2 = i4;
                        }
                    }
                    if (i == axioVar.c) {
                        axioVar = axioVar.f;
                        axioVar.getClass();
                        i = axioVar.b;
                    }
                    if (i2 == axioVar2.c) {
                        axioVar2 = axioVar2.f;
                        axioVar2.getClass();
                        i2 = axioVar2.b;
                    }
                    j2 += jMin;
                }
                return true;
            }
        }
        return false;
    }

    public final String f(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.bS(j, "byteCount: "));
        }
        long j2 = this.b;
        if (j2 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        axio axioVar = this.a;
        axioVar.getClass();
        int i = axioVar.b;
        int i2 = axioVar.c;
        if (((long) i) + j > i2) {
            return new String(m(j), charset);
        }
        int i3 = (int) j;
        String str = new String(axioVar.a, i, i3, charset);
        int i4 = i + i3;
        axioVar.b = i4;
        this.b = j2 - j;
        if (i4 == i2) {
            this.a = axioVar.a();
            axip.b(axioVar);
        }
        return str;
    }

    public final String g(long j) {
        return f(j, awtd.a);
    }

    public final axii h(int i) {
        if (i == 0) {
            return axii.a;
        }
        AndroidInfo.c(this.b, 0L, i);
        axio axioVar = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            axioVar.getClass();
            int i5 = axioVar.c;
            int i6 = axioVar.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            axioVar = axioVar.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 << 1];
        axio axioVar2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            axioVar2.getClass();
            bArr[i7] = axioVar2.a;
            i2 += axioVar2.c - axioVar2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = axioVar2.b;
            axioVar2.d = true;
            i7++;
            axioVar2 = axioVar2.f;
        }
        return new axiq(bArr, iArr);
    }

    public final int hashCode() {
        axio axioVar = this.a;
        if (axioVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = axioVar.c;
            for (int i3 = axioVar.b; i3 < i2; i3++) {
                i = (i * 31) + axioVar.a[i3];
            }
            axioVar = axioVar.f;
            axioVar.getClass();
        } while (axioVar != this.a);
        return i;
    }

    public final axio i(int i) {
        axio axioVar = this.a;
        if (axioVar == null) {
            axio axioVarA = axip.a();
            this.a = axioVarA;
            axioVarA.g = axioVarA;
            axioVarA.f = axioVarA;
            return axioVarA;
        }
        axio axioVar2 = axioVar.g;
        axioVar2.getClass();
        if (axioVar2.c + i <= 8192 && axioVar2.e) {
            return axioVar2;
        }
        axio axioVarA2 = axip.a();
        axioVar2.d(axioVarA2);
        return axioVarA2;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void j() {
        k(this.b);
    }

    public final void k(long j) {
        while (j > 0) {
            axio axioVar = this.a;
            if (axioVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, axioVar.c - axioVar.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = axioVar.b + iMin;
            axioVar.b = i;
            if (i == axioVar.c) {
                this.a = axioVar.a();
                axip.b(axioVar);
            }
        }
    }

    @Override // defpackage.axih
    public final boolean l(long j) {
        throw null;
    }

    public final byte[] m(long j) throws EOFException {
        if (this.b < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int iC = c(bArr, i2, i - i2);
            if (iC == -1) {
                throw new EOFException();
            }
            i2 += iC;
        }
        return bArr;
    }

    public final void n(axir axirVar) {
        while (axirVar.e(this, 8192L) != -1) {
        }
    }

    public final void o(int i) {
        axio axioVarI = i(1);
        byte[] bArr = axioVarI.a;
        int i2 = axioVarI.c;
        axioVarI.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    public final void p(int i) {
        axio axioVarI = i(4);
        byte[] bArr = axioVarI.a;
        int i2 = axioVarI.c;
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        axioVarI.c = i2 + 4;
        this.b += 4;
    }

    public final void q(String str, int i, int i2) {
        str.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.bR(i, "beginIndex < 0: "));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(a.bQ(i, i2, "endIndex < beginIndex: ", " < "));
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                axio axioVarI = i(1);
                byte[] bArr = axioVarI.a;
                int i4 = axioVarI.c - i;
                int iMin = Math.min(i2, 8192 - i4);
                bArr[i + i4] = (byte) cCharAt;
                i = i3;
                while (i < iMin) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i + i4] = (byte) cCharAt2;
                    i++;
                }
                int i5 = axioVarI.c;
                int i6 = (i4 + i) - i5;
                axioVarI.c = i5 + i6;
                this.b += (long) i6;
            } else {
                if (cCharAt < 2048) {
                    axio axioVarI2 = i(2);
                    byte[] bArr2 = axioVarI2.a;
                    int i7 = axioVarI2.c;
                    bArr2[i7] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt & '?') | SemanticState.Focused);
                    axioVarI2.c = i7 + 2;
                    this.b += 2;
                } else if (cCharAt >= 55296 && cCharAt < 56320) {
                    char cCharAt3 = i3 < i2 ? str.charAt(i3) : (char) 0;
                    if (cCharAt3 < 56320 || cCharAt3 >= 57344) {
                        o(63);
                    } else {
                        axio axioVarI3 = i(4);
                        byte[] bArr3 = axioVarI3.a;
                        int i8 = axioVarI3.c;
                        int i9 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        bArr3[i8] = (byte) ((i9 >> 18) | 240);
                        bArr3[i8 + 1] = (byte) (((i9 >> 12) & 63) | SemanticState.Focused);
                        bArr3[i8 + 2] = (byte) (((i9 >> 6) & 63) | SemanticState.Focused);
                        bArr3[i8 + 3] = (byte) ((i9 & 63) | SemanticState.Focused);
                        axioVarI3.c = i8 + 4;
                        this.b += 4;
                        i += 2;
                    }
                } else if (cCharAt < 56320 || cCharAt >= 57344) {
                    axio axioVarI4 = i(3);
                    byte[] bArr4 = axioVarI4.a;
                    int i10 = axioVarI4.c;
                    bArr4[i10] = (byte) ((cCharAt >> '\f') | 224);
                    bArr4[i10 + 1] = (byte) (((cCharAt >> 6) & 63) | SemanticState.Focused);
                    bArr4[i10 + 2] = (byte) ((cCharAt & '?') | SemanticState.Focused);
                    axioVarI4.c = i10 + 3;
                    this.b += 3;
                } else {
                    o(63);
                }
                i = i3;
            }
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        axio axioVar = this.a;
        if (axioVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), axioVar.c - axioVar.b);
        byteBuffer.put(axioVar.a, axioVar.b, iMin);
        int i = axioVar.b + iMin;
        axioVar.b = i;
        this.b -= (long) iMin;
        if (i == axioVar.c) {
            this.a = axioVar.a();
            axip.b(axioVar);
        }
        return iMin;
    }

    public final String toString() {
        long j = this.b;
        if (j <= 2147483647L) {
            return h((int) j).toString();
        }
        throw new IllegalStateException(a.bS(j, "size > Int.MAX_VALUE: "));
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            axio axioVarI = i(1);
            int i2 = 8192 - axioVarI.c;
            byte[] bArr = axioVarI.a;
            int iMin = Math.min(i, i2);
            byteBuffer.get(bArr, axioVarI.c, iMin);
            i -= iMin;
            axioVarI.c += iMin;
        }
        this.b += (long) iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.axir
    public final void close() {
    }

    @Override // java.io.Flushable
    public final void flush() {
    }
}
