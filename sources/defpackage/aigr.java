package defpackage;

import app.rive.semantics.SemanticState;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aigr extends aigs {
    private final byte[] b;
    private final int c;
    private int d;
    private int e;
    private final OutputStream f;

    public aigr(OutputStream outputStream, int i) {
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f = outputStream;
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.b = bArr;
        this.c = bArr.length;
    }

    private final void U() throws IOException {
        this.f.write(this.b, 0, this.d);
        this.d = 0;
    }

    private final void V(int i) throws IOException {
        if (this.c - this.d < i) {
            U();
        }
    }

    @Override // defpackage.aigs
    public final void A(long j) throws IOException {
        V(10);
        E(j);
    }

    @Override // defpackage.aigs
    public final void B(byte[] bArr, int i) {
        y(i);
        F(bArr, 0, i);
    }

    final void C(long j) {
        int i = this.d;
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
        this.e += 8;
    }

    final void D(int i) {
        int i2 = this.d;
        int i3 = i2 + 1;
        int i4 = i & (-128);
        int i5 = this.e;
        byte[] bArr = this.b;
        if (i4 == 0) {
            bArr[i2] = (byte) i;
            this.d = i3;
            this.e = i5 + 1;
            return;
        }
        int i6 = i2 + 2;
        bArr[i2] = (byte) (i | SemanticState.Focused);
        int i7 = i >>> 7;
        if ((i7 & (-128)) == 0) {
            bArr[i3] = (byte) i7;
            this.d = i6;
            this.e = i5 + 2;
            return;
        }
        int i8 = i2 + 3;
        bArr[i3] = (byte) (i7 | SemanticState.Focused);
        int i9 = i >>> 14;
        if ((i9 & (-128)) == 0) {
            bArr[i6] = (byte) i9;
            this.d = i8;
            this.e = i5 + 3;
            return;
        }
        int i10 = i2 + 4;
        bArr[i6] = (byte) (i9 | SemanticState.Focused);
        int i11 = i >>> 21;
        if ((i11 & (-128)) == 0) {
            bArr[i8] = (byte) i11;
            this.d = i10;
            this.e = i5 + 4;
        } else {
            bArr[i8] = (byte) (i11 | SemanticState.Focused);
            bArr[i10] = (byte) (i >>> 28);
            this.d = i2 + 5;
            this.e = i5 + 5;
        }
    }

    final void E(long j) {
        int i = this.d;
        int i2 = i + 1;
        long j2 = j & (-128);
        int i3 = (int) j;
        int i4 = this.e;
        byte[] bArr = this.b;
        if (j2 == 0) {
            bArr[i] = (byte) i3;
            this.d = i2;
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
            this.d = i5;
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
            this.d = i7;
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
            this.d = i9;
            this.e = i4 + 4;
            return;
        }
        int i11 = i + 5;
        bArr[i7] = (byte) (i10 | SemanticState.Focused);
        long j9 = j >>> 28;
        int i12 = (int) j9;
        if ((j9 & (-128)) == 0) {
            bArr[i9] = (byte) i12;
            this.d = i11;
            this.e = i4 + 5;
            return;
        }
        int i13 = i + 6;
        bArr[i9] = (byte) (i12 | SemanticState.Focused);
        long j10 = j >>> 35;
        int i14 = (int) j10;
        if ((j10 & (-128)) == 0) {
            bArr[i11] = (byte) i14;
            this.d = i13;
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
            this.d = i15;
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
            this.d = i17;
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
            this.d = i19;
            this.e = i4 + 9;
        } else {
            bArr[i17] = (byte) (i20 | SemanticState.Focused);
            bArr[i19] = (byte) (j >>> 63);
            this.d = i + 10;
            this.e = i4 + 10;
        }
    }

    public final void F(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.c;
        int i4 = this.d;
        int i5 = i3 - i4;
        byte[] bArr2 = this.b;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i4, i2);
            this.d += i2;
            this.e += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i4, i5);
        int i6 = i + i5;
        this.d = i3;
        this.e += i5;
        U();
        int i7 = i2 - i5;
        if (i7 <= i3) {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.d = i7;
        } else {
            this.f.write(bArr, i6, i7);
        }
        this.e += i7;
    }

    @Override // defpackage.aigb
    public final void a(byte[] bArr, int i, int i2) throws IOException {
        F(bArr, i, i2);
    }

    @Override // defpackage.aigs
    public final int b() {
        throw null;
    }

    @Override // defpackage.aigs
    public final int c() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // defpackage.aigs
    public final void d() throws IOException {
        if (this.d > 0) {
            U();
        }
    }

    @Override // defpackage.aigs
    public final void e(byte b) throws IOException {
        if (this.d == this.c) {
            U();
        }
        f(b);
    }

    final void f(byte b) {
        byte[] bArr = this.b;
        int i = this.d;
        bArr[i] = b;
        this.d = i + 1;
        this.e++;
    }

    final void g(int i) {
        int i2 = this.d;
        byte[] bArr = this.b;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.d = i2 + 4;
        this.e += 4;
    }

    @Override // defpackage.aigs
    public final void h(int i, boolean z) throws IOException {
        V(11);
        D(i << 3);
        f(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.aigs
    public final void i(int i, aigj aigjVar) {
        y((i << 3) | 2);
        j(aigjVar);
    }

    @Override // defpackage.aigs
    public final void j(aigj aigjVar) {
        y(aigjVar.d());
        aigjVar.l(this);
    }

    @Override // defpackage.aigs
    public final void k(int i, int i2) throws IOException {
        V(14);
        D((i << 3) | 5);
        g(i2);
    }

    @Override // defpackage.aigs
    public final void l(int i) throws IOException {
        V(4);
        g(i);
    }

    @Override // defpackage.aigs
    public final void m(int i, long j) throws IOException {
        V(18);
        D((i << 3) | 1);
        C(j);
    }

    @Override // defpackage.aigs
    public final void n(long j) throws IOException {
        V(8);
        C(j);
    }

    @Override // defpackage.aigs
    public final void o(int i, int i2) throws IOException {
        V(20);
        D(i << 3);
        if (i2 >= 0) {
            D(i2);
        } else {
            E(i2);
        }
    }

    @Override // defpackage.aigs
    public final void p(int i) throws IOException {
        if (i >= 0) {
            y(i);
        } else {
            A(i);
        }
    }

    @Override // defpackage.aigs
    public final void q(int i, MessageLite messageLite) {
        throw null;
    }

    @Override // defpackage.aigs
    public final void r(MessageLite messageLite) {
        y(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    @Override // defpackage.aigs
    public final void s(int i, MessageLite messageLite) throws IOException {
        y(11);
        x(2, i);
        y(26);
        r(messageLite);
        y(12);
    }

    @Override // defpackage.aigs
    public final void t(int i, aigj aigjVar) throws IOException {
        y(11);
        x(2, i);
        i(3, aigjVar);
        y(12);
    }

    @Override // defpackage.aigs
    public final void u(int i, String str) throws IOException {
        y((i << 3) | 2);
        v(str);
    }

    @Override // defpackage.aigs
    public final void v(String str) throws IOException {
        int iAN;
        int length = str.length() * 3;
        int iNumberOfLeadingZeros = (352 - (Integer.numberOfLeadingZeros(length) * 9)) >>> 6;
        int i = iNumberOfLeadingZeros + length;
        int i2 = this.c;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int iBx = a.bx(str, bArr, 0, length);
            y(iBx);
            F(bArr, 0, iBx);
            return;
        }
        if (i > i2 - this.d) {
            U();
        }
        int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(str.length()) * 9;
        int i3 = this.d;
        int i4 = (352 - iNumberOfLeadingZeros2) >>> 6;
        try {
            if (i4 == iNumberOfLeadingZeros) {
                int i5 = i3 + i4;
                this.d = i5;
                int iBx2 = a.bx(str, this.b, i5, i2 - i5);
                this.d = i3;
                iAN = (iBx2 - i3) - i4;
                D(iAN);
                this.d = iBx2;
            } else {
                iAN = ahng.aN(str);
                D(iAN);
                this.d = a.bx(str, this.b, this.d, iAN);
            }
            this.e += iAN;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new aigq(e);
        }
    }

    @Override // defpackage.aigs
    public final void w(int i, int i2) {
        y((i << 3) | i2);
    }

    @Override // defpackage.aigs
    public final void x(int i, int i2) throws IOException {
        V(20);
        D(i << 3);
        D(i2);
    }

    @Override // defpackage.aigs
    public final void y(int i) {
        V(5);
        D(i);
    }

    @Override // defpackage.aigs
    public final void z(int i, long j) throws IOException {
        V(20);
        D(i << 3);
        E(j);
    }
}
