package defpackage;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bul implements bum {
    final /* synthetic */ buo a;
    private final float[] b;
    private float[] c;
    private float[] d;
    private float[] e;
    private double f;
    private double g;
    private double h;

    public bul(buo buoVar) {
        this.a = buoVar;
        int i = buoVar.e;
        this.b = new float[i];
        int i2 = i * buoVar.a;
        this.c = new float[i2];
        this.d = new float[i2];
        this.e = new float[i2];
    }

    private final int s(float[] fArr, int i, int i2, int i3) {
        int i4 = 255;
        int i5 = 0;
        double d = 0.0d;
        double d2 = 1.0d;
        int i6 = i2;
        while (true) {
            double d3 = i4;
            double d4 = i5;
            if (i6 > i3) {
                this.f = d2 / d4;
                this.g = d / d3;
                return i5;
            }
            int i7 = 0;
            double dAbs = 0.0d;
            while (i7 < i6) {
                int i8 = this.a.a * i;
                dAbs += (double) Math.abs(fArr[i8 + i7] - fArr[(i8 + i6) + i7]);
                i7++;
                i4 = i4;
            }
            int i9 = i4;
            double d5 = i6;
            if (d4 * dAbs < d2 * d5) {
                i5 = i6;
                d2 = dAbs;
            }
            if (d3 * dAbs > d5 * d) {
                i4 = i6;
                d = dAbs;
            } else {
                i4 = i9;
            }
            i6++;
        }
    }

    private final float[] t(float[] fArr, int i, int i2) {
        int length = fArr.length;
        int i3 = this.a.a;
        int i4 = length / i3;
        return i + i2 <= i4 ? fArr : Arrays.copyOf(fArr, (((i4 * 3) / 2) + i2) * i3);
    }

    @Override // defpackage.bum
    public final int a() {
        return 4;
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
        FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.c;
        buo buoVar = this.a;
        floatBufferAsFloatBuffer.get(fArr, buoVar.g * buoVar.a, i / 4);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // defpackage.bum
    public final void g(ByteBuffer byteBuffer, int i) {
        FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.d;
        int i2 = this.a.a;
        floatBufferAsFloatBuffer.put(fArr, 0, i * i2);
        byteBuffer.position(byteBuffer.position() + ((i << 2) * i2));
    }

    @Override // defpackage.bum
    public final void h(int i, int i2) {
        int i3;
        int i4 = 0;
        while (true) {
            buo buoVar = this.a;
            if (i4 >= buoVar.e / i2) {
                return;
            }
            double d = 0.0d;
            int i5 = 0;
            while (true) {
                int i6 = buoVar.a;
                i3 = i6 * i2;
                if (i5 < i3) {
                    d += (double) this.c[(i6 * i) + (i3 * i4) + i5];
                    i5++;
                }
            }
            this.b[i4] = (float) (d / ((double) i3));
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
        this.h = 0.0d;
        this.f = 0.0d;
        this.g = 0.0d;
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
            float[] fArr = this.d;
            int i4 = buoVar.h * i3;
            float[] fArr2 = this.e;
            int i5 = (i * i3) + i2;
            float f = fArr2[i5];
            float f2 = fArr2[i5 + i3];
            long j3 = ((long) buoVar.k) * j;
            int i6 = buoVar.j;
            long j4 = ((long) (i6 + 1)) * j2;
            long j5 = j4 - j3;
            long j6 = j4 - (((long) i6) * j2);
            fArr[i4 + i2] = ((j5 * f) + ((j6 - j5) * f2)) / j6;
            i2++;
        }
    }

    @Override // defpackage.bum
    public final void n(int i, int i2, int i3, int i4, int i5) {
        float[] fArr = this.d;
        float[] fArr2 = this.c;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                fArr[i9] = ((fArr2[i7] * (i - i10)) + (fArr2[i8] * i10)) / i;
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
            this.c[i + i3] = 0.0f;
        }
    }

    @Override // defpackage.bum
    public final boolean q() {
        double d = this.f;
        return d != 0.0d && this.a.m != 0 && this.g <= d * 3.0d && d + d > this.h * 3.0d;
    }

    @Override // defpackage.bum
    public final int r(int i, int i2) {
        return s(this.b, 0, i, i2);
    }
}
