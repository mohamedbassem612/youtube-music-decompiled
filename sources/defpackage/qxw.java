package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qxw extends buk {
    float[] e;
    private float f;
    private int g = 0;
    private float h = 1.0f;
    private rjr i;
    private qxv j;

    @Override // defpackage.buj
    public final void f(ByteBuffer byteBuffer) {
        ahno.O(h());
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        if (iLimit != 0) {
            ByteBuffer byteBufferL = l(iLimit);
            int i = iLimit / 4;
            for (int i2 = 0; i2 < i; i2++) {
                float f = byteBuffer.getFloat();
                float[] fArr = this.e;
                int i3 = this.g;
                float f2 = fArr[i3];
                fArr[i3] = f;
                this.g = (i3 + 1) % fArr.length;
                float fMin = Math.min(1.0f, 0.9f / Math.abs(f));
                qxv qxvVar = this.j;
                float f3 = -fMin;
                float[] fArr2 = qxvVar.a;
                int i4 = qxvVar.b;
                fArr2[nqy.k(i4, fArr2.length)] = f3;
                qxvVar.b = i4 + 1;
                float fMax = Math.max(qxvVar.g, f3);
                qxvVar.g = fMax;
                int i5 = qxvVar.f;
                int i6 = qxvVar.c;
                if (i5 == i6) {
                    qxvVar.h = -3.4028235E38f;
                    qxvVar.i = fMax;
                    qxvVar.g = -3.4028235E38f;
                    int i7 = qxvVar.b;
                    int i8 = qxvVar.e;
                    if (i7 - i8 > (i8 - i6) + 1) {
                        qxvVar.c = i8;
                        int i9 = ((i7 - i6) / 2) + i8;
                        qxvVar.e = i9;
                        qxvVar.d = qxvVar.c + Math.min(i8 - i5, i9 - i8);
                        for (int i10 = qxvVar.e; i10 != qxvVar.b; i10++) {
                            float f4 = qxvVar.g;
                            float[] fArr3 = qxvVar.a;
                            qxvVar.g = Math.max(f4, fArr3[nqy.k(i10, fArr3.length)]);
                        }
                        int i11 = qxvVar.e;
                        while (true) {
                            i11--;
                            if (i11 == qxvVar.d - 1) {
                                break;
                            }
                            float[] fArr4 = qxvVar.a;
                            int length = i11 % fArr4.length;
                            float fMax2 = Math.max(qxvVar.h, fArr4[length]);
                            qxvVar.h = fMax2;
                            fArr4[length] = fMax2;
                        }
                    } else {
                        qxvVar.c = i8;
                        qxvVar.e = i7;
                        qxvVar.d = i7;
                    }
                    int i12 = qxvVar.f;
                    int i13 = qxvVar.c;
                    if (i12 == i13) {
                        qxvVar.h = -3.4028235E38f;
                        qxvVar.i = qxvVar.g;
                        qxvVar.g = -3.4028235E38f;
                        i13 = qxvVar.e;
                        qxvVar.d = i13;
                        qxvVar.c = i13;
                        if (i12 == i13) {
                            i12--;
                            qxvVar.f = i12;
                        }
                    }
                    i6 = i13;
                    i5 = i12;
                    float[] fArr5 = qxvVar.a;
                    fArr5[nqy.k(qxvVar.b, fArr5.length)] = -3.4028235E38f;
                }
                qxvVar.f = i5 + 1;
                int i14 = qxvVar.d;
                if (i14 != i6) {
                    int i15 = i14 - 1;
                    qxvVar.d = i15;
                    float[] fArr6 = qxvVar.a;
                    int iK = nqy.k(i15, fArr6.length);
                    float fMax3 = Math.max(qxvVar.h, fArr6[iK]);
                    qxvVar.h = fMax3;
                    fArr6[iK] = fMax3;
                }
                float[] fArr7 = qxvVar.a;
                float f5 = -Math.max(fArr7[nqy.k(qxvVar.f, fArr7.length)], Math.max(qxvVar.i, qxvVar.g));
                float f6 = this.h;
                if (f5 <= f6) {
                    this.h = f5;
                } else {
                    f5 = f6 + ((fMin - f6) * this.f);
                    this.h = f5;
                }
                rjr rjrVar = this.i;
                float[] fArr8 = rjrVar.b;
                long j = rjrVar.c;
                long j2 = rjrVar.a;
                fArr8[(int) (j % j2)] = f5;
                long j3 = j + 1;
                rjrVar.c = j3;
                float f7 = 0.0f;
                if (j3 != 0) {
                    long jMin = Math.min(j3, j2);
                    for (int i16 = 0; i16 < jMin; i16++) {
                        f7 += fArr8[i16];
                    }
                    f7 /= jMin;
                }
                byteBufferL.putFloat(f2 * f7);
            }
            byteBufferL.flip();
        }
    }

    @Override // defpackage.buk
    public final bug k(bug bugVar) throws bui {
        if (bugVar.d != 4) {
            throw new bui("Unhandled input format:", bugVar);
        }
        int i = bugVar.c;
        int i2 = (bugVar.b / 1000) * i;
        this.f = 1.0f / ((i2 * 10) + 1);
        int i3 = i2 << 1;
        this.e = new float[i + i3];
        this.i = new rjr(i3);
        this.j = new qxv(i3 + (i2 * 5));
        return bugVar;
    }

    @Override // defpackage.buk
    public final void m() {
        Arrays.fill(this.e, 0.0f);
        this.j.a();
        this.i.c = 0L;
        this.h = 1.0f;
    }
}
