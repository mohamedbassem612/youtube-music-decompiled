package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class chl extends buk {
    public boolean e;
    public long f;
    private final float g;
    private final short h;
    private final int i;
    private final long j;
    private final long k;
    private int l;
    private int m;
    private byte[] o;
    private byte[] r;
    private int n = 0;
    private int p = 0;
    private int q = 0;

    public chl(long j, float f, long j2, int i, short s) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException();
        }
        this.j = j;
        this.g = f;
        this.k = j2;
        this.i = i;
        this.h = s;
        byte[] bArr = bwp.e;
        this.o = bArr;
        this.r = bArr;
    }

    private final int q(int i) {
        int i2 = this.l;
        return (i / i2) * i2;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    private final int r(int i) {
        int iS = ((s(this.k) - this.n) * this.l) - (this.o.length >> 1);
        ahno.O((iS ^ (-1)) >>> 31);
        return q((int) Math.min((i * this.g) + 0.5f, iS));
    }

    private final int s(long j) {
        return (int) ((j * ((long) this.b.b)) / 1000000);
    }

    private final void t(boolean z) {
        int i;
        int length;
        int i2 = this.q;
        int length2 = this.o.length;
        if (i2 != length2) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        if (this.n == 0) {
            if (z) {
                u(i2, 3);
                length = i2;
            } else {
                ahno.O(i2 >= (length2 >> 1));
                length = this.o.length >> 1;
                u(length, 0);
            }
            i = length;
        } else {
            int i3 = length2 >> 1;
            int i4 = i2 - i3;
            if (z) {
                int iR = r(i4) + (this.o.length >> 1);
                u(iR, 2);
                int i5 = i3 + i4;
                i = iR;
                length = i5;
            } else {
                int iR2 = r(i4);
                u(iR2, 1);
                i = iR2;
                length = i4;
            }
        }
        ahno.Q(length % this.l == 0, "bytesConsumed is not aligned to frame size: %s", length);
        ahno.O(i2 >= i);
        this.q -= length;
        int i6 = this.p + length;
        this.p = i6;
        this.p = i6 % this.o.length;
        int i7 = this.n;
        int i8 = this.l;
        this.n = i7 + (i / i8);
        this.f += (long) ((length - i) / i8);
    }

    private final void u(int i, int i2) {
        int i3;
        if (i != 0) {
            ahno.F(this.q >= i);
            int i4 = this.p;
            if (i2 == 2) {
                int i5 = this.q;
                int i6 = i4 + i5;
                byte[] bArr = this.o;
                int length = bArr.length;
                if (i6 <= length) {
                    System.arraycopy(bArr, i6 - i, this.r, 0, i);
                } else {
                    int i7 = i5 - (length - i4);
                    byte[] bArr2 = this.r;
                    if (i7 >= i) {
                        System.arraycopy(bArr, i7 - i, bArr2, 0, i);
                    } else {
                        int i8 = i - i7;
                        System.arraycopy(bArr, length - i8, bArr2, 0, i8);
                        System.arraycopy(this.o, 0, this.r, i8, i7);
                    }
                }
            } else {
                int i9 = i4 + i;
                byte[] bArr3 = this.o;
                int length2 = bArr3.length;
                byte[] bArr4 = this.r;
                if (i9 <= length2) {
                    System.arraycopy(bArr3, i4, bArr4, 0, i);
                } else {
                    int i10 = length2 - i4;
                    System.arraycopy(bArr3, i4, bArr4, 0, i10);
                    System.arraycopy(this.o, 0, this.r, i10, i - i10);
                }
            }
            ahno.I(i % this.l == 0, "sizeToOutput is not aligned to frame size: %s", i);
            ahno.O(this.p < this.o.length);
            byte[] bArr5 = this.r;
            ahno.I(i % this.l == 0, "byteOutput size is not aligned to frame size %s", i);
            if (i2 != 3) {
                int i11 = (i / this.l) - 1;
                for (int i12 = 0; i12 < i; i12 += 2) {
                    int i13 = i12 + 1;
                    byte b = bArr5[i13];
                    int i14 = bArr5[i12] & 255;
                    int i15 = b << 8;
                    if (i2 == 0) {
                        int i16 = i12 / this.l;
                        i3 = this.i;
                        if (i11 != 0) {
                            i3 = (((i3 - 100) * ((i16 * 1000) / i11)) / 1000) + 100;
                        }
                    } else if (i2 == 2) {
                        int i17 = i12 / this.l;
                        if (i11 == 0) {
                            i3 = 100;
                        } else {
                            int i18 = this.i;
                            i3 = i18 + ((((100 - i18) * (i17 * 1000)) / i11) / 1000);
                        }
                    } else {
                        i3 = this.i;
                    }
                    int i19 = ((i14 | i15) * i3) / 100;
                    if (i19 >= 32767) {
                        bArr5[i12] = -1;
                        bArr5[i13] = 127;
                    } else if (i19 <= -32768) {
                        bArr5[i12] = 0;
                        bArr5[i13] = -128;
                    } else {
                        bArr5[i12] = (byte) (i19 & 255);
                        bArr5[i13] = (byte) (i19 >> 8);
                    }
                }
            }
            l(i).put(bArr5, 0, i).flip();
        }
    }

    private final boolean v(byte b, byte b2) {
        return Math.abs((b2 & 255) | (b << 8)) > this.h;
    }

    @Override // defpackage.buj
    public final void f(ByteBuffer byteBuffer) {
        int iLimit;
        int i;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.d.hasRemaining()) {
            if (this.m != 0) {
                ahno.O(this.p < this.o.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    } else {
                        if (v(byteBuffer.get(iPosition2), byteBuffer.get(iPosition2 - 1))) {
                            int i2 = this.l;
                            iLimit = i2 * (iPosition2 / i2);
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i3 = this.p;
                int i4 = this.q;
                int i5 = i3 + i4;
                int length = this.o.length;
                if (i5 < length) {
                    i = length - i5;
                } else {
                    i5 = i4 - (length - i3);
                    i = i3 - i5;
                }
                int iMin = Math.min(iPosition3, i);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.o, i5, iMin);
                int i6 = this.q + iMin;
                this.q = i6;
                ahno.O(i6 <= this.o.length);
                boolean z = iLimit < iLimit2 && iPosition3 < i;
                t(z);
                if (z) {
                    this.m = 0;
                    this.n = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.o.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (v(byteBuffer.get(iLimit4), byteBuffer.get(iLimit4 - 1))) {
                            int i7 = this.l;
                            iPosition = ((iLimit4 / i7) * i7) + i7;
                            break;
                        }
                        iLimit4 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.m = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    l(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // defpackage.buk, defpackage.buj
    public final boolean h() {
        return super.h() && this.e;
    }

    @Override // defpackage.buk
    protected final bug k(bug bugVar) throws bui {
        if (bugVar.d == 2) {
            return bugVar.b == -1 ? bug.a : bugVar;
        }
        throw new bui("Unhandled input format:", bugVar);
    }

    @Override // defpackage.buk
    public final void n() {
        if (this.q > 0) {
            t(true);
            this.n = 0;
        }
    }

    @Override // defpackage.buk
    public final void o() {
        this.e = false;
        byte[] bArr = bwp.e;
        this.o = bArr;
        this.r = bArr;
    }

    @Override // defpackage.buk
    public final void p() {
        if (h()) {
            this.l = this.b.c << 1;
            int iQ = q((s(this.j) * this.l) / 2) << 1;
            if (this.o.length != iQ) {
                this.o = new byte[iQ];
                this.r = new byte[iQ];
            }
        }
        this.m = 0;
        this.f = 0L;
        this.n = 0;
        this.p = 0;
        this.q = 0;
    }
}
