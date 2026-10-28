package defpackage;

import android.view.animation.AnimationUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class drw extends dsb implements bla {
    public boolean b;
    public boolean c;
    public blf e;
    public Runnable f;
    public final /* synthetic */ dsa g;
    public long a = -1;
    public int d = 0;
    public final yre h = new yre();

    public drw(dsa dsaVar) {
        this.g = dsaVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x008d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0091  */
    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0 A[SYNTHETIC] */
    private final void k() {
        long[] jArr;
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr2;
        float f;
        float fD;
        int i;
        int i2;
        int i3;
        long j4;
        float[] fArr;
        float f2;
        float fD2;
        long j5;
        float f3;
        float f4;
        int i4;
        int i5;
        float f5;
        if (this.e == null) {
            yre yreVar = this.h;
            yreVar.c(AnimationUtils.currentAnimationTimeMillis(), this.a);
            this.e = new blf(new ble());
            blg blgVar = new blg();
            blgVar.c(1.0f);
            blgVar.e(200.0f);
            blf blfVar = this.e;
            blfVar.p = blgVar;
            blfVar.h(this.a);
            this.e.f(this);
            blf blfVar2 = this.e;
            int i6 = yreVar.a;
            long j6 = Long.MIN_VALUE;
            int i7 = 0;
            if (i6 != 0) {
                jArr = (long[]) yreVar.b;
                j = jArr[i6];
                j2 = j;
                while (true) {
                    j3 = jArr[i6];
                    c = 20;
                    if (j3 != j6) {
                        jArr2 = jArr;
                        f = 0.0f;
                        break;
                    }
                    jArr2 = jArr;
                    f = 0.0f;
                    float fAbs = Math.abs(j3 - j2);
                    if (j - j3 <= 100.0f && fAbs <= 40.0f) {
                        if (i6 == 0) {
                            i6 = 20;
                        }
                        i6--;
                        i7++;
                        if (i7 >= 20) {
                            break;
                        }
                        j2 = j3;
                        jArr = jArr2;
                        j6 = Long.MIN_VALUE;
                    } else {
                        break;
                    }
                }
                if (i7 < 2) {
                    fD = f;
                } else if (i7 == 2) {
                    i4 = yreVar.a;
                    if (i4 == 0) {
                        i5 = 19;
                    } else {
                        i5 = i4 - 1;
                    }
                    f5 = jArr2[i4] - jArr2[i5];
                    if (f5 == f) {
                        fD = f;
                    } else {
                        float[] fArr2 = (float[]) yreVar.c;
                        fD = 1000.0f * ((fArr2[i4] - fArr2[i5]) / f5);
                    }
                } else {
                    int i8 = yreVar.a;
                    int i9 = ((i8 - i7) + 21) % 20;
                    i = (i8 + 21) % 20;
                    Object obj = yreVar.c;
                    i2 = i9 + 1;
                    i3 = i2 % 20;
                    j4 = jArr2[i9];
                    fArr = (float[]) obj;
                    f2 = fArr[i9];
                    fD2 = f;
                    while (i3 != i) {
                        j5 = jArr2[i3];
                        char c2 = c;
                        f3 = f;
                        f4 = j5 - j4;
                        if (f4 != f3) {
                            float f6 = fArr[i3];
                            float f7 = (f6 - f2) / f4;
                            fD2 += (f7 - yre.d(fD2)) * Math.abs(f7);
                            if (i3 == i2) {
                                fD2 *= 0.5f;
                            }
                            f2 = f6;
                            j4 = j5;
                        }
                        i3 = (i3 + 1) % 20;
                        c = c2;
                        f = f3;
                    }
                    fD = 1000.0f * yre.d(fD2);
                }
            } else if (((long[]) yreVar.b)[0] == Long.MIN_VALUE) {
                fD = 0.0f;
            } else {
                i6 = 0;
                jArr = (long[]) yreVar.b;
                j = jArr[i6];
                j2 = j;
                while (true) {
                    j3 = jArr[i6];
                    c = 20;
                    if (j3 != j6) {
                        jArr2 = jArr;
                        f = 0.0f;
                        break;
                    }
                    jArr2 = jArr;
                    f = 0.0f;
                    float fAbs2 = Math.abs(j3 - j2);
                    if (j - j3 <= 100.0f) {
                        break;
                    }
                    break;
                    break;
                    j2 = j3;
                    jArr = jArr2;
                    j6 = Long.MIN_VALUE;
                }
                if (i7 < 2) {
                    fD = f;
                } else if (i7 == 2) {
                    i4 = yreVar.a;
                    if (i4 == 0) {
                        i5 = 19;
                    } else {
                        i5 = i4 - 1;
                    }
                    f5 = jArr2[i4] - jArr2[i5];
                    if (f5 == f) {
                        fD = f;
                    } else {
                        float[] fArr3 = (float[]) yreVar.c;
                        fD = 1000.0f * ((fArr3[i4] - fArr3[i5]) / f5);
                    }
                } else {
                    int i10 = yreVar.a;
                    int i11 = ((i10 - i7) + 21) % 20;
                    i = (i10 + 21) % 20;
                    Object obj2 = yreVar.c;
                    i2 = i11 + 1;
                    i3 = i2 % 20;
                    j4 = jArr2[i11];
                    fArr = (float[]) obj2;
                    f2 = fArr[i11];
                    fD2 = f;
                    while (i3 != i) {
                        j5 = jArr2[i3];
                        char c3 = c;
                        f3 = f;
                        f4 = j5 - j4;
                        if (f4 != f3) {
                            float f8 = fArr[i3];
                            float f9 = (f8 - f2) / f4;
                            fD2 += (f9 - yre.d(fD2)) * Math.abs(f9);
                            if (i3 == i2) {
                                fD2 *= 0.5f;
                            }
                            f2 = f8;
                            j4 = j5;
                        }
                        i3 = (i3 + 1) % 20;
                        c = c3;
                        f = f3;
                    }
                    fD = 1000.0f * yre.d(fD2);
                }
            }
            blfVar2.g = fD;
            blf blfVar3 = this.e;
            blfVar3.m = h() + 1;
            blfVar3.n = -1.0f;
            blfVar3.g(4.0f);
            this.e.e(new acyp(this, 1));
        }
    }

    @Override // defpackage.dsb, defpackage.drx
    public final void a(dsa dsaVar) {
        this.c = true;
    }

    public final long h() {
        return this.g.p;
    }

    public final void i() {
        if (this.b) {
            k();
            this.e.i(h() + 1);
        } else {
            this.d = 1;
            this.f = null;
        }
    }

    public final void j(Runnable runnable) {
        this.f = runnable;
        if (!this.b) {
            this.d = 2;
        } else {
            k();
            this.e.i(0.0f);
        }
    }

    @Override // defpackage.bla
    public final void l(float f) {
        long jMax = Math.max(-1L, Math.min(h() + 1, Math.round(f)));
        this.g.y(jMax, this.a);
        this.a = jMax;
    }
}
