package defpackage;

import app.rive.semantics.SemanticState;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lxg extends lxh {
    public int a;
    private final byte[] c;
    private final int d;
    private int e;
    private final OutputStream f;

    public lxg(OutputStream outputStream) {
        this.f = outputStream;
        byte[] bArr = new byte[SemanticState.Obscured];
        this.c = bArr;
        this.d = bArr.length;
    }

    private final void L(int i) throws IOException {
        if (this.d - this.a < i) {
            y();
        }
    }

    public final void A(String str) throws IOException {
        int iB;
        int length = str.length() * 3;
        int iNumberOfLeadingZeros = (352 - (Integer.numberOfLeadingZeros(length) * 9)) >>> 6;
        int i = iNumberOfLeadingZeros + length;
        int i2 = this.d;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int iA = lzt.a(str, bArr, 0, length);
            s(iA);
            z(bArr, 0, iA);
            return;
        }
        if (i > i2 - this.a) {
            y();
        }
        int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(str.length()) * 9;
        int i3 = this.a;
        int i4 = (352 - iNumberOfLeadingZeros2) >>> 6;
        try {
            if (i4 == iNumberOfLeadingZeros) {
                int i5 = i3 + i4;
                this.a = i5;
                int iA2 = lzt.a(str, this.c, i5, i2 - i5);
                this.a = i3;
                iB = (iA2 - i3) - i4;
                w(iB);
                this.a = iA2;
            } else {
                iB = lzt.b(str);
                w(iB);
                this.a = lzt.a(str, this.c, this.a, iB);
            }
            this.e += iB;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new lxf(e);
        }
    }

    @Override // defpackage.lwt
    public final void a(byte[] bArr, int i, int i2) throws IOException {
        z(bArr, i, i2);
    }

    @Override // defpackage.lxh
    public final int b() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // defpackage.lxh
    public final void c(byte b) throws IOException {
        if (this.a == this.d) {
            y();
        }
        d(b);
    }

    final void d(byte b) {
        byte[] bArr = this.c;
        int i = this.a;
        bArr[i] = b;
        this.a = i + 1;
        this.e++;
    }

    @Override // defpackage.lxh
    public final void e(int i, boolean z) throws IOException {
        L(11);
        w(i << 3);
        d(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.lxh
    public final void f(int i, lxa lxaVar) throws IOException {
        s((i << 3) | 2);
        s(lxaVar.b());
        lxaVar.d(this);
    }

    @Override // defpackage.lxh
    public final void g(int i, int i2) throws IOException {
        L(14);
        w((i << 3) | 5);
        p(i2);
    }

    @Override // defpackage.lxh
    public final void h(int i) throws IOException {
        L(4);
        p(i);
    }

    @Override // defpackage.lxh
    public final void i(int i, long j) throws IOException {
        L(18);
        w((i << 3) | 1);
        v(j);
    }

    @Override // defpackage.lxh
    public final void j(long j) throws IOException {
        L(8);
        v(j);
    }

    @Override // defpackage.lxh
    public final void k(int i, int i2) throws IOException {
        L(20);
        w(i << 3);
        if (i2 >= 0) {
            w(i2);
        } else {
            x(i2);
        }
    }

    @Override // defpackage.lxh
    public final void l(int i) throws IOException {
        if (i >= 0) {
            s(i);
        } else {
            u(i);
        }
    }

    @Override // defpackage.lxh
    public final void m(int i, lyp lypVar) throws IOException {
        s(11);
        r(2, i);
        s(26);
        s(lypVar.q());
        lypVar.G(this);
        s(12);
    }

    @Override // defpackage.lxh
    public final void n(int i, lxa lxaVar) throws IOException {
        s(11);
        r(2, i);
        f(3, lxaVar);
        s(12);
    }

    @Override // defpackage.lxh
    public final void o(int i, String str) throws IOException {
        s((i << 3) | 2);
        A(str);
    }

    final void p(int i) {
        int i2 = this.a;
        byte[] bArr = this.c;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.a = i2 + 4;
        this.e += 4;
    }

    @Override // defpackage.lxh
    public final void q(int i, int i2) throws IOException {
        s((i << 3) | i2);
    }

    @Override // defpackage.lxh
    public final void r(int i, int i2) throws IOException {
        L(20);
        w(i << 3);
        w(i2);
    }

    @Override // defpackage.lxh
    public final void s(int i) throws IOException {
        L(5);
        w(i);
    }

    @Override // defpackage.lxh
    public final void t(int i, long j) throws IOException {
        L(20);
        w(i << 3);
        x(j);
    }

    @Override // defpackage.lxh
    public final void u(long j) throws IOException {
        L(10);
        x(j);
    }

    final void v(long j) {
        int i = this.a;
        byte[] bArr = this.c;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.a = i + 8;
        this.e += 8;
    }

    final void w(int i) {
        int i2 = this.a;
        int i3 = i2 + 1;
        int i4 = i & (-128);
        int i5 = this.e;
        byte[] bArr = this.c;
        if (i4 == 0) {
            bArr[i2] = (byte) i;
            this.a = i3;
            this.e = i5 + 1;
            return;
        }
        int i6 = i2 + 2;
        bArr[i2] = (byte) (i | SemanticState.Focused);
        int i7 = i >>> 7;
        if ((i7 & (-128)) == 0) {
            bArr[i3] = (byte) i7;
            this.a = i6;
            this.e = i5 + 2;
            return;
        }
        int i8 = i2 + 3;
        bArr[i3] = (byte) (i7 | SemanticState.Focused);
        int i9 = i >>> 14;
        if ((i9 & (-128)) == 0) {
            bArr[i6] = (byte) i9;
            this.a = i8;
            this.e = i5 + 3;
            return;
        }
        int i10 = i2 + 4;
        bArr[i6] = (byte) (i9 | SemanticState.Focused);
        int i11 = i >>> 21;
        if ((i11 & (-128)) == 0) {
            bArr[i8] = (byte) i11;
            this.a = i10;
            this.e = i5 + 4;
        } else {
            bArr[i8] = (byte) (i11 | SemanticState.Focused);
            bArr[i10] = (byte) (i >>> 28);
            this.a = i2 + 5;
            this.e = i5 + 5;
        }
    }

    final void x(long j) {
        int i = this.a;
        int i2 = i + 1;
        long j2 = j & (-128);
        int i3 = (int) j;
        int i4 = this.e;
        byte[] bArr = this.c;
        if (j2 == 0) {
            bArr[i] = (byte) i3;
            this.a = i2;
            this.e = i4 + 1;
            return;
        }
        int i5 = i + 2;
        bArr[i] = (byte) (i3 | SemanticState.Focused);
        long j3 = j >>> 7;
        long j4 = j3 & (-128);
        int i6 = (int) j3;
        if (j4 == 0) {
            bArr[i2] = (byte) i6;
            this.a = i5;
            this.e = i4 + 2;
            return;
        }
        int i7 = i + 3;
        bArr[i2] = (byte) (i6 | SemanticState.Focused);
        long j5 = j >>> 14;
        long j6 = j5 & (-128);
        int i8 = (int) j5;
        if (j6 == 0) {
            bArr[i5] = (byte) i8;
            this.a = i7;
            this.e = i4 + 3;
            return;
        }
        int i9 = i + 4;
        bArr[i5] = (byte) (i8 | SemanticState.Focused);
        long j7 = j >>> 21;
        long j8 = j7 & (-128);
        int i10 = (int) j7;
        if (j8 == 0) {
            bArr[i7] = (byte) i10;
            this.a = i9;
            this.e = i4 + 4;
            return;
        }
        int i11 = i + 5;
        bArr[i7] = (byte) (i10 | SemanticState.Focused);
        long j9 = j >>> 28;
        int i12 = (int) j9;
        if ((j9 & (-128)) == 0) {
            bArr[i9] = (byte) i12;
            this.a = i11;
            this.e = i4 + 5;
            return;
        }
        int i13 = i + 6;
        bArr[i9] = (byte) (i12 | SemanticState.Focused);
        long j10 = j >>> 35;
        int i14 = (int) j10;
        if ((j10 & (-128)) == 0) {
            bArr[i11] = (byte) i14;
            this.a = i13;
            this.e = i4 + 6;
            return;
        }
        int i15 = i + 7;
        bArr[i11] = (byte) (i14 | SemanticState.Focused);
        long j11 = j >>> 42;
        long j12 = j11 & (-128);
        int i16 = (int) j11;
        if (j12 == 0) {
            bArr[i13] = (byte) i16;
            this.a = i15;
            this.e = i4 + 7;
            return;
        }
        int i17 = i + 8;
        bArr[i13] = (byte) (i16 | SemanticState.Focused);
        long j13 = j >>> 49;
        long j14 = j13 & (-128);
        int i18 = (int) j13;
        if (j14 == 0) {
            bArr[i15] = (byte) i18;
            this.a = i17;
            this.e = i4 + 8;
            return;
        }
        int i19 = i + 9;
        bArr[i15] = (byte) (i18 | SemanticState.Focused);
        long j15 = j >>> 56;
        long j16 = j15 & (-128);
        int i20 = (int) j15;
        if (j16 == 0) {
            bArr[i17] = (byte) i20;
            this.a = i19;
            this.e = i4 + 9;
        } else {
            bArr[i17] = (byte) (i20 | SemanticState.Focused);
            bArr[i19] = (byte) (j >>> 63);
            this.a = i + 10;
            this.e = i4 + 10;
        }
    }

    public final void y() throws IOException {
        this.f.write(this.c, 0, this.a);
        this.a = 0;
    }

    public final void z(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.d;
        int i4 = this.a;
        int i5 = i3 - i4;
        byte[] bArr2 = this.c;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i4, i2);
            this.a += i2;
            this.e += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i4, i5);
        int i6 = i + i5;
        this.a = i3;
        this.e += i5;
        y();
        int i7 = i2 - i5;
        if (i7 <= i3) {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.a = i7;
        } else {
            this.f.write(bArr, i6, i7);
        }
        this.e += i7;
    }
}
