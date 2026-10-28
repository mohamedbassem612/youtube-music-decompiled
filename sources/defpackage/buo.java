package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class buo {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final bum f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public double n;
    private final int o;
    private final int p;
    private final int q;

    public buo(int i, int i2, float f, float f2, int i3, boolean z) {
        this.o = i;
        this.a = i2;
        this.b = f;
        this.c = f2;
        this.d = i / i3;
        this.p = i / 400;
        int i4 = i / 65;
        this.q = i4;
        this.e = i4 << 1;
        this.f = z ? new bul(this) : new bun(this);
    }

    private final void d(int i, int i2) {
        bum bumVar = this.f;
        bumVar.j(i2);
        Object objC = bumVar.c();
        Object objD = bumVar.d();
        int i3 = this.h;
        int i4 = this.a;
        System.arraycopy(objC, i * i4, objD, i3 * i4, i2 * i4);
        this.h += i2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    public final int a() {
        ahno.O((this.h ^ (-1)) >>> 31);
        return this.h * this.a * this.f.a();
    }

    public final int b() {
        return this.g * this.a * this.f.a();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        bum bumVar;
        int i;
        int i2;
        int iR;
        int iR2;
        int i3;
        int i4;
        int i5;
        double d;
        int i6;
        int i7;
        float f;
        int i8;
        int i9;
        long j;
        long j2;
        int i10;
        float f2 = this.b;
        float f3 = this.c;
        double d2 = f2 / f3;
        int i11 = this.h;
        int i12 = 1;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            int i13 = this.g;
            int i14 = this.e;
            if (i13 >= i14) {
                int i15 = 0;
                while (true) {
                    int i16 = this.l;
                    if (i16 > 0) {
                        int iMin = Math.min(i14, i16);
                        d(i15, iMin);
                        this.l -= iMin;
                        i15 += iMin;
                        f3 = f3;
                        d = d2;
                    } else {
                        int i17 = this.o;
                        int i18 = i17 > 4000 ? i17 / 4000 : i12;
                        int i19 = this.a;
                        if (i19 != i12) {
                            bumVar = this.f;
                            bumVar.h(i15, i18);
                            i = this.p;
                            i2 = this.q;
                            iR = bumVar.r(i / i18, i2 / i18);
                            if (i18 != i12) {
                                int i20 = iR * i18;
                                int i21 = i18 << 2;
                                i4 = i20 - i21;
                                if (i4 >= i) {
                                    i = i4;
                                }
                                i5 = i20 + i21;
                                if (i5 <= i2) {
                                    i2 = i5;
                                }
                                if (i19 == i12) {
                                    iR2 = bumVar.b(i15, i, i2);
                                } else {
                                    bumVar.h(i15, i12);
                                    iR2 = bumVar.r(i, i2);
                                }
                            } else {
                                iR2 = iR;
                            }
                            i3 = i19;
                        } else if (i18 == i12) {
                            iR2 = this.f.b(i15, this.p, this.q);
                            i3 = i12;
                        } else {
                            i19 = i12;
                            bumVar = this.f;
                            bumVar.h(i15, i18);
                            i = this.p;
                            i2 = this.q;
                            iR = bumVar.r(i / i18, i2 / i18);
                            if (i18 != i12) {
                                int i22 = iR * i18;
                                int i23 = i18 << 2;
                                i4 = i22 - i23;
                                if (i4 >= i) {
                                    i = i4;
                                }
                                i5 = i22 + i23;
                                if (i5 <= i2) {
                                    i2 = i5;
                                }
                                if (i19 == i12) {
                                    iR2 = bumVar.b(i15, i, i2);
                                } else {
                                    bumVar.h(i15, i12);
                                    iR2 = bumVar.r(i, i2);
                                }
                            } else {
                                iR2 = iR;
                            }
                            i3 = i19;
                        }
                        bum bumVar2 = this.f;
                        int i24 = bumVar2.q() ? this.m : iR2;
                        int i25 = i15 + i24;
                        bumVar2.o();
                        this.m = iR2;
                        double d3 = i24;
                        if (d2 > 1.0d) {
                            double d4 = d2 - 1.0d;
                            double d5 = this.n;
                            if (d2 >= 2.0d) {
                                double d6 = (d3 / d4) + d5;
                                int iRound = (int) Math.round(d6);
                                d = d2;
                                this.n = d6 - ((double) iRound);
                                i7 = iRound;
                            } else {
                                d = d2;
                                double d7 = ((d3 * (2.0d - d)) / d4) + d5;
                                int iRound2 = (int) Math.round(d7);
                                this.l = iRound2;
                                this.n = d7 - ((double) iRound2);
                                i7 = i24;
                            }
                            bumVar2.j(i7);
                            bumVar2.n(i7, i3, this.h, i15, i25);
                            this.h += i7;
                            i15 += i24 + i7;
                        } else {
                            f3 = f3;
                            d = d2;
                            double d8 = 1.0d - d;
                            double d9 = this.n;
                            if (d < 0.5d) {
                                double d10 = ((d3 * d) / d8) + d9;
                                int iRound3 = (int) Math.round(d10);
                                this.n = d10 - ((double) iRound3);
                                i6 = iRound3;
                            } else {
                                double d11 = ((d3 * ((d + d) - 1.0d)) / d8) + d9;
                                int iRound4 = (int) Math.round(d11);
                                this.l = iRound4;
                                this.n = d11 - ((double) iRound4);
                                i6 = i24;
                            }
                            int i26 = i24 + i6;
                            bumVar2.j(i26);
                            System.arraycopy(bumVar2.c(), i15 * i3, bumVar2.d(), this.h * i3, i24 * i3);
                            int i27 = i15;
                            bumVar2.n(i6, i3, this.h + i24, i25, i27);
                            this.h += i26;
                            i15 = i27 + i6;
                        }
                    }
                    if (i15 + i14 > i13) {
                        break;
                    }
                    i12 = i12;
                    i14 = i14;
                    f3 = f3;
                    d2 = d;
                }
                int i28 = this.g - i15;
                bum bumVar3 = this.f;
                int i29 = this.a;
                System.arraycopy(bumVar3.c(), i15 * i29, bumVar3.c(), 0, i29 * i28);
                this.g = i28;
            }
            f = this.d * f3;
            if (f != 1.0f || this.h == i11) {
            }
            int i30 = this.o;
            long j3 = i30;
            long j4 = (long) (i30 / f);
            while (j4 != 0 && j3 != 0 && j4 % 2 == 0 && j3 % 2 == 0) {
                j4 /= 2;
                j3 /= 2;
            }
            int i31 = this.h - i11;
            bum bumVar4 = this.f;
            bumVar4.k(i31);
            int i32 = this.a;
            System.arraycopy(bumVar4.d(), i11 * i32, bumVar4.e(), this.i * i32, i31 * i32);
            this.h = i11;
            this.i += i31;
            int i33 = 0;
            while (true) {
                i8 = this.i - 1;
                if (i33 >= i8) {
                    break;
                }
                while (true) {
                    i9 = this.j + 1;
                    j = i9;
                    long j5 = j * j4;
                    j2 = this.k;
                    i10 = i12;
                    if (j5 <= j2 * j3) {
                        break;
                    }
                    bumVar4.j(i10);
                    bumVar4.m(i33, j3, j4);
                    this.k += i10;
                    this.h += i10;
                }
                this.j = i9;
                if (j == j3) {
                    this.j = 0;
                    ahno.O(j2 == j4 ? i10 : 0);
                    this.k = 0;
                }
                i33++;
                i12 = i10;
            }
            if (i8 != 0) {
                System.arraycopy(bumVar4.e(), i8 * i32, bumVar4.e(), 0, (this.i - i8) * i32);
                this.i -= i8;
                return;
            }
            return;
        }
        d(0, this.g);
        this.g = 0;
        f3 = f3;
        i12 = 1;
        f = this.d * f3;
        if (f != 1.0f) {
        }
    }
}
