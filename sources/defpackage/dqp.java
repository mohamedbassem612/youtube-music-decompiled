package defpackage;

import app.rive.semantics.SemanticState;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dqp {
    public int a;
    public int b;
    public Object c;
    private int d;

    public dqp() {
        if (wf.a == null) {
            wf.a = new wf();
        }
    }

    public final boolean A() {
        return this.d == this.b;
    }

    public final int a(int i) {
        if (i >= this.d) {
            return 0;
        }
        return ((ByteBuffer) this.c).getShort(this.b + i);
    }

    public final int b(int i) {
        int i2 = i + this.a;
        return i2 + ((ByteBuffer) this.c).getInt(i2) + 4;
    }

    public final int c(int i) {
        int i2 = i + this.a;
        return ((ByteBuffer) this.c).getInt(i2 + ((ByteBuffer) this.c).getInt(i2));
    }

    public final void d(int i, ByteBuffer byteBuffer) {
        short s;
        this.c = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.b = i2;
            s = ((ByteBuffer) this.c).getShort(i2);
        } else {
            s = 0;
            this.a = 0;
            this.b = 0;
        }
        this.d = s;
    }

    public final int e() {
        int iA = a(6);
        if (iA != 0) {
            return c(iA);
        }
        return 0;
    }

    public final int f() {
        return ((this.d - this.b) << 3) - this.a;
    }

    public final int g() {
        ahno.O(this.a == 0);
        return this.b;
    }

    public final int h() {
        return (this.b << 3) + this.a;
    }

    public final int i(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.a += i;
        int i3 = 0;
        while (true) {
            i2 = this.a;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.a = i4;
            Object obj = this.c;
            int i5 = this.b;
            this.b = i5 + 1;
            i3 |= (((byte[]) obj)[i5] & 255) << i4;
        }
        Object obj2 = this.c;
        int i6 = this.b;
        int i7 = i3 | ((((byte[]) obj2)[i6] & 255) >> (8 - i2));
        int i8 = 32 - i;
        if (i2 == 8) {
            this.a = 0;
            this.b = i6 + 1;
        }
        int i9 = ((-1) >>> i8) & i7;
        l();
        return i9;
    }

    public final long j(int i) {
        if (i <= 32) {
            return bwp.E(i(i));
        }
        return (bwp.E(i(i - 32)) << 32) | bwp.E(i(32));
    }

    public final String k(int i, Charset charset) {
        byte[] bArr = new byte[i];
        w(bArr, i);
        return new String(bArr, charset);
    }

    public final void l() {
        int i;
        int i2 = this.b;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.d) || (i2 == i && this.a == 0))) {
            z = true;
        }
        ahno.O(z);
    }

    public final void m() {
        if (this.a != 0) {
            this.a = 0;
            this.b++;
            l();
        }
    }

    public final void n(bwb bwbVar) {
        p(bwbVar.b, bwbVar.d);
        q(bwbVar.c << 3);
    }

    public final void o(byte[] bArr) {
        p(bArr, bArr.length);
    }

    public final void p(byte[] bArr, int i) {
        this.c = bArr;
        this.b = 0;
        this.a = 0;
        this.d = i;
    }

    public final void q(int i) {
        int i2 = i / 8;
        this.b = i2;
        this.a = i - (i2 << 3);
        l();
    }

    public final void r() {
        int i = this.a + 1;
        this.a = i;
        if (i == 8) {
            this.a = 0;
            this.b++;
        }
        l();
    }

    public final void s(int i) {
        int i2 = i / 8;
        int i3 = this.b + i2;
        this.b = i3;
        int i4 = this.a + (i - (i2 << 3));
        this.a = i4;
        if (i4 > 7) {
            this.b = i3 + 1;
            this.a = i4 - 8;
        }
        l();
    }

    public final void t(int i) {
        ahno.O(this.a == 0);
        this.b += i;
        l();
    }

    public final boolean u() {
        int i = ((byte[]) this.c)[this.b] & (SemanticState.Focused >> this.a);
        r();
        return i != 0;
    }

    public final void v(byte[] bArr, int i) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = i >> 3;
            if (i3 >= i2) {
                break;
            }
            Object obj = this.c;
            int i4 = this.b;
            int i5 = i4 + 1;
            this.b = i5;
            byte[] bArr2 = (byte[]) obj;
            byte b = bArr2[i4];
            int i6 = this.a;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (b2 | ((bArr2[i5] & 255) >> (8 - i6)));
            i3++;
        }
        int i7 = i & 7;
        if (i7 != 0) {
            byte b3 = (byte) (bArr[i2] & (255 >> i7));
            bArr[i2] = b3;
            int i8 = this.a;
            if (i8 + i7 > 8) {
                Object obj2 = this.c;
                int i9 = this.b;
                this.b = i9 + 1;
                b3 = (byte) (b3 | ((((byte[]) obj2)[i9] & 255) << i8));
                bArr[i2] = b3;
                i8 -= 8;
            }
            int i10 = i8 + i7;
            this.a = i10;
            Object obj3 = this.c;
            int i11 = this.b;
            bArr[i2] = (byte) (b3 | ((byte) (((((byte[]) obj3)[i11] & 255) >> (8 - i10)) << (8 - i7))));
            if (i10 == 8) {
                this.a = 0;
                this.b = i11 + 1;
            }
            l();
        }
    }

    public final void w(byte[] bArr, int i) {
        ahno.O(this.a == 0);
        System.arraycopy(this.c, this.b, bArr, 0, i);
        this.b += i;
        l();
    }

    public final int x() {
        int i = this.d;
        if (i == this.b) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = ((int[]) this.c)[i];
        this.d = (i + 1) & this.a;
        return i2;
    }

    public final void y(int i) {
        Object obj = this.c;
        int i2 = this.b;
        int[] iArr = (int[]) obj;
        iArr[i2] = i;
        int i3 = (i2 + 1) & this.a;
        this.b = i3;
        int i4 = this.d;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            int[] iArr2 = new int[i6];
            System.arraycopy(obj, i4, iArr2, 0, i5);
            System.arraycopy(this.c, 0, iArr2, i5, this.d);
            this.c = iArr2;
            this.d = 0;
            this.b = length;
            this.a = i6 - 1;
        }
    }

    public final void z() {
        this.b = this.d;
    }

    public dqp(byte[] bArr, int i) {
        this.c = bArr;
        this.d = i;
    }

    public dqp(char[] cArr) {
        this.a = 7;
        this.c = new int[8];
    }

    public dqp(byte[] bArr) {
        this.c = bwp.e;
    }

    public dqp(byte[] bArr, byte[] bArr2) {
        this(bArr, bArr.length);
    }
}
