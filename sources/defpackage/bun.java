package defpackage;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bun implements bum {
    final /* synthetic */ buo a;
    private final short[] b;
    private short[] c;
    private short[] d;
    private short[] e;
    private int f;
    private int g;
    private int h;

    public bun(buo buoVar) {
        this.a = buoVar;
        int i = buoVar.e;
        this.b = new short[i];
        int i2 = i * buoVar.a;
        this.c = new short[i2];
        this.d = new short[i2];
        this.e = new short[i2];
    }

    private final int s(short[] sArr, int i, int i2, int i3) {
        int i4 = 1;
        int i5 = 255;
        int i6 = 0;
        int i7 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                int i9 = this.a.a * i;
                iAbs += Math.abs(sArr[i9 + i8] - sArr[(i9 + i2) + i8]);
            }
            if (iAbs * i6 < i4 * i2) {
                i6 = i2;
                i4 = iAbs;
            }
            if (iAbs * i5 > i7 * i2) {
                i5 = i2;
                i7 = iAbs;
            }
            i2++;
        }
        this.f = i4 / i6;
        this.g = i7 / i5;
        return i6;
    }

    private final short[] t(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.a.a;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    @Override // defpackage.bum
    public final int a() {
        return 2;
    }

    @Override // defpackage.bum
    public final int b(int i, int i2, int i3) {
        return s(this.c, i, i2, i3);
    }

    @Override // defpackage.bum
    public final /* synthetic */ Object c() {
        return this.c;
    }

    @Override // defpackage.bum
    public final /* synthetic */ Object d() {
        return this.d;
    }

    @Override // defpackage.bum
    public final /* synthetic */ Object e() {
        return this.e;
    }

    @Override // defpackage.bum
    public final void f(ByteBuffer byteBuffer, int i) {
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = this.c;
        buo buoVar = this.a;
        shortBufferAsShortBuffer.get(sArr, buoVar.g * buoVar.a, i / 2);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // defpackage.bum
    public final void g(ByteBuffer byteBuffer, int i) {
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = this.d;
        int i2 = this.a.a;
        shortBufferAsShortBuffer.put(sArr, 0, i * i2);
        byteBuffer.position(byteBuffer.position() + ((i << 1) * i2));
    }

    @Override // defpackage.bum
    public final void h(int i, int i2) {
        int i3;
        short[] sArr = this.c;
        int i4 = 0;
        while (true) {
            buo buoVar = this.a;
            if (i4 >= buoVar.e / i2) {
                return;
            }
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = buoVar.a;
                i3 = i7 * i2;
                if (i5 < i3) {
                    i6 += sArr[(i7 * i) + (i3 * i4) + i5];
                    i5++;
                }
            }
            this.b[i4] = (short) (i6 / i3);
            i4++;
        }
    }

    @Override // defpackage.bum
    public final void i(int i) {
        this.c = t(this.c, this.a.g, i);
    }

    @Override // defpackage.bum
    public final void j(int i) {
        this.d = t(this.d, this.a.h, i);
    }

    @Override // defpackage.bum
    public final void k(int i) {
        this.e = t(this.e, this.a.i, i);
    }

    @Override // defpackage.bum
    public final void l() {
        this.h = 0;
        this.f = 0;
        this.g = 0;
    }

    @Override // defpackage.bum
    public final void m(int i, long j, long j2) {
        int i2 = 0;
        while (true) {
            buo buoVar = this.a;
            int i3 = buoVar.a;
            if (i2 >= i3) {
                return;
            }
            short[] sArr = this.d;
            int i4 = buoVar.h * i3;
            short[] sArr2 = this.e;
            int i5 = (i * i3) + i2;
            short s = sArr2[i5];
            short s2 = sArr2[i5 + i3];
            long j3 = ((long) buoVar.k) * j;
            int i6 = buoVar.j;
            long j4 = ((long) (i6 + 1)) * j2;
            long j5 = j4 - (((long) i6) * j2);
            long j6 = j4 - j3;
            sArr[i4 + i2] = (short) (((j6 * ((long) s)) + ((j5 - j6) * ((long) s2))) / j5);
            i2++;
        }
    }

    @Override // defpackage.bum
    public final void n(int i, int i2, int i3, int i4, int i5) {
        short[] sArr = this.d;
        short[] sArr2 = this.c;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr2[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    @Override // defpackage.bum
    public final void o() {
        this.h = this.f;
    }

    @Override // defpackage.bum
    public final void p(int i, int i2) {
        for (int i3 = 0; i3 < this.a.a * i2; i3++) {
            this.c[i + i3] = 0;
        }
    }

    @Override // defpackage.bum
    public final boolean q() {
        int i = this.f;
        return i != 0 && this.a.m != 0 && this.g <= i * 3 && (i << 1) > this.h * 3;
    }

    @Override // defpackage.bum
    public final int r(int i, int i2) {
        return s(this.b, 0, i, i2);
    }
}
