package defpackage;

import app.rive.semantics.SemanticState;
import java.util.Locale;
import org.chromium.base.JniAndroid;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axpk {
    public Object a;
    private final byte[] b;
    private final int c;
    private int d;

    public axpk(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
        }
        this.b = bArr;
        this.d = 0;
        this.c = i;
    }

    public static int a(int i, axpo axpoVar) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + b(axpoVar);
    }

    public static int b(axpo axpoVar) {
        int iB = axpoVar.b();
        return ((352 - (Integer.numberOfLeadingZeros(iB) * 9)) >>> 6) + iB;
    }

    public static int c(String str) {
        int i = axrs.a;
        int iD = JniAndroid.d(str);
        return ((352 - (Integer.numberOfLeadingZeros(iD) * 9)) >>> 6) + iD;
    }

    public final void A(long j) throws axpu {
        long j2 = j & (-128);
        int i = this.d;
        try {
            byte[] bArr = this.b;
            if (j2 == 0) {
                bArr[i] = (byte) j;
                this.d = i + 1;
                return;
            }
            bArr[i] = (byte) (((int) j) | SemanticState.Focused);
            int i2 = i + 1;
            long j3 = j >>> 7;
            long j4 = j3 & (-128);
            int i3 = (int) j3;
            if (j4 == 0) {
                bArr[i2] = (byte) i3;
                this.d = i + 2;
                return;
            }
            bArr[i2] = (byte) (i3 | SemanticState.Focused);
            int i4 = i + 2;
            long j5 = j >>> 14;
            long j6 = j5 & (-128);
            int i5 = (int) j5;
            if (j6 == 0) {
                bArr[i4] = (byte) i5;
                this.d = i + 3;
                return;
            }
            bArr[i4] = (byte) (i5 | SemanticState.Focused);
            int i6 = i + 3;
            long j7 = j >>> 21;
            long j8 = j7 & (-128);
            int i7 = (int) j7;
            if (j8 == 0) {
                bArr[i6] = (byte) i7;
                this.d = i + 4;
                return;
            }
            bArr[i6] = (byte) (i7 | SemanticState.Focused);
            int i8 = i + 4;
            long j9 = j >>> 28;
            long j10 = j9 & (-128);
            int i9 = (int) j9;
            if (j10 == 0) {
                bArr[i8] = (byte) i9;
                this.d = i + 5;
                return;
            }
            bArr[i8] = (byte) (i9 | SemanticState.Focused);
            int i10 = i + 5;
            long j11 = j >>> 35;
            long j12 = j11 & (-128);
            int i11 = (int) j11;
            if (j12 == 0) {
                bArr[i10] = (byte) i11;
                this.d = i + 6;
                return;
            }
            bArr[i10] = (byte) (i11 | SemanticState.Focused);
            int i12 = i + 6;
            long j13 = j >>> 42;
            long j14 = j13 & (-128);
            int i13 = (int) j13;
            if (j14 == 0) {
                bArr[i12] = (byte) i13;
                this.d = i + 7;
                return;
            }
            bArr[i12] = (byte) (i13 | SemanticState.Focused);
            int i14 = i + 7;
            long j15 = j >>> 49;
            long j16 = j15 & (-128);
            int i15 = (int) j15;
            if (j16 == 0) {
                bArr[i14] = (byte) i15;
                this.d = i + 8;
                return;
            }
            bArr[i14] = (byte) (i15 | SemanticState.Focused);
            int i16 = i + 8;
            long j17 = j >>> 56;
            int i17 = (int) j17;
            if (((-128) & j17) == 0) {
                bArr[i16] = (byte) i17;
                this.d = i + 9;
            } else {
                bArr[i16] = (byte) (i17 | SemanticState.Focused);
                bArr[i + 9] = (byte) (j >>> 63);
                this.d = i + 10;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new axpu(i, this.c, 1, e);
        }
    }

    public final void d() {
        if (i() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (i() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    public final void e(int i, double d) throws axpu {
        q(i, Double.doubleToRawLongBits(d));
    }

    public final void f(double d) throws axpu {
        r(Double.doubleToRawLongBits(d));
    }

    public final void g(int i, float f) throws axpu {
        o(i, Float.floatToRawIntBits(f));
    }

    public final void h(float f) throws axpu {
        p(Float.floatToRawIntBits(f));
    }

    public final int i() {
        return this.c - this.d;
    }

    public final void j(byte b) throws axpu {
        int i = this.d;
        try {
            int i2 = i + 1;
            try {
                this.b[i] = b;
                this.d = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new axpu(i, this.c, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    public final void k(byte[] bArr, int i, int i2) throws axpu {
        try {
            System.arraycopy(bArr, i, this.b, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new axpu(this.d, this.c, i2, e);
        }
    }

    public final void l(int i, boolean z) throws axpu {
        y(i << 3);
        j(z ? (byte) 1 : (byte) 0);
    }

    public final void m(int i, axpo axpoVar) throws axpu {
        y((i << 3) | 2);
        n(axpoVar);
    }

    public final void n(axpo axpoVar) throws axpu {
        y(axpoVar.b());
        axpoVar.d(this);
    }

    public final void o(int i, int i2) throws axpu {
        y((i << 3) | 5);
        p(i2);
    }

    public final void p(int i) throws axpu {
        int i2 = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.d = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new axpu(i2, this.c, 4, e);
        }
    }

    public final void q(int i, long j) throws axpu {
        y((i << 3) | 1);
        r(j);
    }

    public final void r(long j) throws axpu {
        int i = this.d;
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
            this.d = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new axpu(i, this.c, 8, e);
        }
    }

    public final void s(int i, int i2) throws axpu {
        y(i << 3);
        t(i2);
    }

    public final void t(int i) throws axpu {
        if (i >= 0) {
            y(i);
            return;
        }
        int i2 = this.d;
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
                        this.d = i2;
                    } catch (IndexOutOfBoundsException e) {
                        e = e;
                        i2 = i7;
                        throw new axpu(i2, this.c, 10, e);
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

    public final void u(axqv axqvVar) throws axpu {
        y(axqvVar.h());
        axqvVar.s(this);
    }

    public final void v(int i, String str) throws axpu {
        y((i << 3) | 2);
        w(str);
    }

    public final void w(String str) throws axpu {
        int i = this.d;
        try {
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(str.length() * 3) * 9;
            int iNumberOfLeadingZeros2 = (352 - (Integer.numberOfLeadingZeros(str.length()) * 9)) >>> 6;
            if (iNumberOfLeadingZeros2 != ((352 - iNumberOfLeadingZeros) >>> 6)) {
                int i2 = axrs.a;
                y(JniAndroid.d(str));
                byte[] bArr = this.b;
                int i3 = this.d;
                this.d = a.bx(str, bArr, i3, bArr.length - i3);
                return;
            }
            int i4 = i + iNumberOfLeadingZeros2;
            this.d = i4;
            byte[] bArr2 = this.b;
            int length = bArr2.length - i4;
            int i5 = axrs.a;
            int iBx = a.bx(str, bArr2, i4, length);
            this.d = i;
            y((iBx - i) - iNumberOfLeadingZeros2);
            this.d = iBx;
        } catch (IndexOutOfBoundsException e) {
            throw new axpu(e);
        }
    }

    public final void x(int i, int i2) throws axpu {
        y(i << 3);
        y(i2);
    }

    public final void y(int i) throws axpu {
        int i2 = this.d;
        int i3 = i & (-128);
        try {
            byte[] bArr = this.b;
            try {
                if (i3 == 0) {
                    int i4 = i2 + 1;
                    bArr[i2] = (byte) i;
                    this.d = i4;
                    i3 = i4;
                } else {
                    int i5 = i2 + 1;
                    bArr[i2] = (byte) (i | SemanticState.Focused);
                    int i6 = i >>> 7;
                    if ((i6 & (-128)) == 0) {
                        int i7 = i2 + 2;
                        bArr[i5] = (byte) i6;
                        this.d = i7;
                        i3 = i5;
                    } else {
                        int i8 = i2 + 2;
                        try {
                            bArr[i5] = (byte) (i6 | SemanticState.Focused);
                            int i9 = i >>> 14;
                            if ((i9 & (-128)) == 0) {
                                int i10 = i2 + 3;
                                bArr[i8] = (byte) i9;
                                this.d = i10;
                                i3 = i9;
                            } else {
                                int i11 = i2 + 3;
                                try {
                                    bArr[i8] = (byte) (i9 | SemanticState.Focused);
                                    int i12 = i >>> 21;
                                    if ((i12 & (-128)) == 0) {
                                        int i13 = i2 + 4;
                                        bArr[i11] = (byte) i12;
                                        this.d = i13;
                                        i3 = i12;
                                    } else {
                                        i8 = i2 + 4;
                                        byte b = (byte) (i12 | SemanticState.Focused);
                                        bArr[i11] = b;
                                        int i14 = i2 + 5;
                                        bArr[i8] = (byte) (i >>> 28);
                                        this.d = i14;
                                        i3 = b;
                                    }
                                } catch (IndexOutOfBoundsException e) {
                                    e = e;
                                    i2 = i11;
                                    throw new axpu(i2, this.c, 1, e);
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

    public final void z(int i, long j) throws axpu {
        y(i << 3);
        A(j);
    }
}
