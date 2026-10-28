package defpackage;

import app.rive.semantics.SemanticState;
import com.google.protobuf.MessageLite;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aigo extends aigs {
    private final byte[] b;
    private final int c;
    private final int d;
    private int e;
    private final aami f;

    public aigo(byte[] bArr, int i, int i2, aami aamiVar) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i3 = i + i2;
        int length = bArr.length;
        if ((i | i2 | (length - i3)) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        this.b = bArr;
        this.c = i;
        this.e = i;
        this.d = i3;
        this.f = aamiVar;
    }

    @Override // defpackage.aigs
    public final void A(long j) throws aigq {
        long j2 = j & (-128);
        int i = this.e;
        try {
            byte[] bArr = this.b;
            if (j2 == 0) {
                bArr[i] = (byte) j;
                this.e = i + 1;
                return;
            }
            bArr[i] = (byte) (((int) j) | SemanticState.Focused);
            int i2 = i + 1;
            long j3 = j >>> 7;
            long j4 = j3 & (-128);
            int i3 = (int) j3;
            if (j4 == 0) {
                bArr[i2] = (byte) i3;
                this.e = i + 2;
                return;
            }
            bArr[i2] = (byte) (i3 | SemanticState.Focused);
            int i4 = i + 2;
            long j5 = j >>> 14;
            long j6 = j5 & (-128);
            int i5 = (int) j5;
            if (j6 == 0) {
                bArr[i4] = (byte) i5;
                this.e = i + 3;
                return;
            }
            bArr[i4] = (byte) (i5 | SemanticState.Focused);
            int i6 = i + 3;
            long j7 = j >>> 21;
            long j8 = j7 & (-128);
            int i7 = (int) j7;
            if (j8 == 0) {
                bArr[i6] = (byte) i7;
                this.e = i + 4;
                return;
            }
            bArr[i6] = (byte) (i7 | SemanticState.Focused);
            int i8 = i + 4;
            long j9 = j >>> 28;
            long j10 = j9 & (-128);
            int i9 = (int) j9;
            if (j10 == 0) {
                bArr[i8] = (byte) i9;
                this.e = i + 5;
                return;
            }
            bArr[i8] = (byte) (i9 | SemanticState.Focused);
            int i10 = i + 5;
            long j11 = j >>> 35;
            long j12 = j11 & (-128);
            int i11 = (int) j11;
            if (j12 == 0) {
                bArr[i10] = (byte) i11;
                this.e = i + 6;
                return;
            }
            bArr[i10] = (byte) (i11 | SemanticState.Focused);
            int i12 = i + 6;
            long j13 = j >>> 42;
            long j14 = j13 & (-128);
            int i13 = (int) j13;
            if (j14 == 0) {
                bArr[i12] = (byte) i13;
                this.e = i + 7;
                return;
            }
            bArr[i12] = (byte) (i13 | SemanticState.Focused);
            int i14 = i + 7;
            long j15 = j >>> 49;
            long j16 = j15 & (-128);
            int i15 = (int) j15;
            if (j16 == 0) {
                bArr[i14] = (byte) i15;
                this.e = i + 8;
                return;
            }
            bArr[i14] = (byte) (i15 | SemanticState.Focused);
            int i16 = i + 8;
            long j17 = j >>> 56;
            int i17 = (int) j17;
            if (((-128) & j17) == 0) {
                bArr[i16] = (byte) i17;
                this.e = i + 9;
            } else {
                bArr[i16] = (byte) (i17 | SemanticState.Focused);
                bArr[i + 9] = (byte) (j >>> 63);
                this.e = i + 10;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new aigq(i, this.d, 1, e);
        }
    }

    @Override // defpackage.aigs
    public final void B(byte[] bArr, int i) throws aigq {
        y(i);
        g(bArr, 0, i);
    }

    @Override // defpackage.aigb
    public final void a(byte[] bArr, int i, int i2) throws aigq {
        g(bArr, i, i2);
    }

    @Override // defpackage.aigs
    public final int b() {
        return this.e - this.c;
    }

    @Override // defpackage.aigs
    public final int c() {
        return this.d - this.e;
    }

    @Override // defpackage.aigs
    public final void d() {
        aami aamiVar = this.f;
        if (aamiVar != null) {
            ((Buffer) aamiVar.b).position(aamiVar.a + b());
        }
    }

    @Override // defpackage.aigs
    public final void e(byte b) throws aigq {
        int i = this.e;
        try {
            int i2 = i + 1;
            try {
                this.b[i] = b;
                this.e = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new aigq(i, this.d, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    public final void f(ByteBuffer byteBuffer) throws aigq {
        int iRemaining = byteBuffer.remaining();
        try {
            byteBuffer.get(this.b, this.e, iRemaining);
            this.e += iRemaining;
        } catch (IndexOutOfBoundsException e) {
            throw new aigq(this.e, this.d, iRemaining, e);
        }
    }

    public final void g(byte[] bArr, int i, int i2) throws aigq {
        try {
            System.arraycopy(bArr, i, this.b, this.e, i2);
            this.e += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new aigq(this.e, this.d, i2, e);
        }
    }

    @Override // defpackage.aigs
    public final void h(int i, boolean z) throws aigq {
        y(i << 3);
        e(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.aigs
    public final void i(int i, aigj aigjVar) throws aigq {
        y((i << 3) | 2);
        j(aigjVar);
    }

    @Override // defpackage.aigs
    public final void j(aigj aigjVar) throws aigq {
        y(aigjVar.d());
        aigjVar.l(this);
    }

    @Override // defpackage.aigs
    public final void k(int i, int i2) throws aigq {
        y((i << 3) | 5);
        l(i2);
    }

    @Override // defpackage.aigs
    public final void l(int i) throws aigq {
        int i2 = this.e;
        try {
            byte[] bArr = this.b;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.e = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new aigq(i2, this.d, 4, e);
        }
    }

    @Override // defpackage.aigs
    public final void m(int i, long j) throws aigq {
        y((i << 3) | 1);
        n(j);
    }

    @Override // defpackage.aigs
    public final void n(long j) throws aigq {
        int i = this.e;
        try {
            byte[] bArr = this.b;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.e = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new aigq(i, this.d, 8, e);
        }
    }

    @Override // defpackage.aigs
    public final void o(int i, int i2) throws aigq {
        y(i << 3);
        p(i2);
    }

    @Override // defpackage.aigs
    public final void p(int i) throws aigq {
        if (i >= 0) {
            y(i);
            return;
        }
        int i2 = this.e;
        try {
            byte[] bArr = this.b;
            long j = i;
            int i3 = i2 + 1;
            try {
                bArr[i2] = (byte) (((int) j) | SemanticState.Focused);
                int i4 = i2 + 2;
                try {
                    bArr[i3] = (byte) (((int) (j >>> 7)) | SemanticState.Focused);
                    int i5 = i2 + 3;
                    bArr[i4] = (byte) (((int) (j >>> 14)) | SemanticState.Focused);
                    i4 = i2 + 4;
                    bArr[i5] = (byte) (((int) (j >>> 21)) | SemanticState.Focused);
                    int i6 = i2 + 5;
                    bArr[i4] = (byte) (((int) (j >>> 28)) | SemanticState.Focused);
                    int i7 = i2 + 6;
                    try {
                        bArr[i6] = -1;
                        int i8 = i2 + 7;
                        bArr[i7] = -1;
                        i7 = i2 + 8;
                        bArr[i8] = -1;
                        i3 = i2 + 9;
                        bArr[i7] = -1;
                        i2 += 10;
                        bArr[i3] = 1;
                        this.e = i2;
                    } catch (IndexOutOfBoundsException e) {
                        e = e;
                        i2 = i7;
                        throw new aigq(i2, this.d, 10, e);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i2 = i4;
                }
            } catch (IndexOutOfBoundsException e3) {
                i2 = i3;
                e = e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            e = e4;
        }
    }

    @Override // defpackage.aigs
    public final void q(int i, MessageLite messageLite) throws aigq {
        y((i << 3) | 2);
        r(messageLite);
    }

    @Override // defpackage.aigs
    public final void r(MessageLite messageLite) throws aigq {
        y(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    @Override // defpackage.aigs
    public final void s(int i, MessageLite messageLite) throws aigq {
        y(11);
        x(2, i);
        q(3, messageLite);
        y(12);
    }

    @Override // defpackage.aigs
    public final void t(int i, aigj aigjVar) throws aigq {
        y(11);
        x(2, i);
        i(3, aigjVar);
        y(12);
    }

    @Override // defpackage.aigs
    public final void u(int i, String str) throws aigq {
        y((i << 3) | 2);
        v(str);
    }

    @Override // defpackage.aigs
    public final void v(String str) throws aigq {
        int i = this.e;
        try {
            int iNumberOfLeadingZeros = (352 - (Integer.numberOfLeadingZeros(str.length()) * 9)) >>> 6;
            int i2 = i + iNumberOfLeadingZeros;
            this.e = i2;
            byte[] bArr = this.b;
            int iBx = (a.bx(str, bArr, i2, bArr.length - i2) - i) - iNumberOfLeadingZeros;
            int iNumberOfLeadingZeros2 = (352 - (Integer.numberOfLeadingZeros(iBx) * 9)) >>> 6;
            if (iNumberOfLeadingZeros2 != iNumberOfLeadingZeros) {
                System.arraycopy(bArr, i2, bArr, i + iNumberOfLeadingZeros2, iBx);
            }
            this.e = i;
            y(iBx);
            this.e = i + iNumberOfLeadingZeros2 + iBx;
        } catch (IndexOutOfBoundsException e) {
            throw new aigq(e);
        }
    }

    @Override // defpackage.aigs
    public final void w(int i, int i2) throws aigq {
        y((i << 3) | i2);
    }

    @Override // defpackage.aigs
    public final void x(int i, int i2) throws aigq {
        y(i << 3);
        y(i2);
    }

    @Override // defpackage.aigs
    public final void y(int i) throws aigq {
        int i2 = this.e;
        int i3 = i & (-128);
        try {
            byte[] bArr = this.b;
            try {
                if (i3 == 0) {
                    int i4 = i2 + 1;
                    bArr[i2] = (byte) i;
                    this.e = i4;
                    i3 = i4;
                } else {
                    int i5 = i2 + 1;
                    bArr[i2] = (byte) (i | SemanticState.Focused);
                    int i6 = i >>> 7;
                    if ((i6 & (-128)) == 0) {
                        int i7 = i2 + 2;
                        bArr[i5] = (byte) i6;
                        this.e = i7;
                        i3 = i5;
                    } else {
                        int i8 = i2 + 2;
                        try {
                            bArr[i5] = (byte) (i6 | SemanticState.Focused);
                            int i9 = i >>> 14;
                            if ((i9 & (-128)) == 0) {
                                int i10 = i2 + 3;
                                bArr[i8] = (byte) i9;
                                this.e = i10;
                                i3 = i9;
                            } else {
                                int i11 = i2 + 3;
                                try {
                                    bArr[i8] = (byte) (i9 | SemanticState.Focused);
                                    int i12 = i >>> 21;
                                    if ((i12 & (-128)) == 0) {
                                        int i13 = i2 + 4;
                                        bArr[i11] = (byte) i12;
                                        this.e = i13;
                                        i3 = i12;
                                    } else {
                                        i8 = i2 + 4;
                                        byte b = (byte) (i12 | SemanticState.Focused);
                                        bArr[i11] = b;
                                        int i14 = i2 + 5;
                                        bArr[i8] = (byte) (i >>> 28);
                                        this.e = i14;
                                        i3 = b;
                                    }
                                } catch (IndexOutOfBoundsException e) {
                                    e = e;
                                    i2 = i11;
                                    throw new aigq(i2, this.d, 1, e);
                                }
                            }
                        } catch (IndexOutOfBoundsException e2) {
                            e = e2;
                            i2 = i8;
                        }
                    }
                }
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
                i2 = i3;
            }
        } catch (IndexOutOfBoundsException e4) {
            e = e4;
        }
    }

    @Override // defpackage.aigs
    public final void z(int i, long j) throws aigq {
        y(i << 3);
        A(j);
    }
}
