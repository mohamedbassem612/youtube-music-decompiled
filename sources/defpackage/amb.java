package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class amb extends alo {
    private static final alv o = new alp(6);
    public final amd d;
    public final float e;
    public final float f;
    public final amc g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final alv k;
    public final alv l;
    public final alv m;
    public final alv n;
    private final boolean p;

    /* JADX WARN: Code duplicated, block: B:30:0x014a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public amb(String str, float[] fArr, amd amdVar, float[] fArr2, alv alvVar, alv alvVar2, float f, float f2, amc amcVar, int i) {
        char c;
        char c2;
        int i2;
        float[] fArr3;
        boolean z;
        amb ambVar;
        double d;
        super(str, 12884901888L, i);
        this.d = amdVar;
        this.e = f;
        this.f = f2;
        this.g = amcVar;
        this.k = alvVar;
        final int i3 = 1;
        this.l = new alv() { // from class: alz
            @Override // defpackage.alv
            public final double a(double d2) {
                switch (i3) {
                    case 0:
                        amb ambVar2 = (amb) this;
                        return ambVar2.m.a(awro.e(d2, ambVar2.e, ambVar2.f));
                    case 1:
                        amb ambVar3 = (amb) this;
                        return awro.e(ambVar3.k.a(d2), ambVar3.e, ambVar3.f);
                    case 2:
                        float[] fArr4 = alq.a;
                        return alq.a((amc) this, d2);
                    case 3:
                        float[] fArr5 = alq.a;
                        return alq.c((amc) this, d2);
                    case 4:
                        amc amcVar2 = (amc) this;
                        double d3 = amcVar2.a;
                        double d4 = amcVar2.e;
                        return ace.b(d2, amcVar2.b, amcVar2.c, amcVar2.d, d4, d3);
                    case 5:
                        amc amcVar3 = (amc) this;
                        if (d2 < amcVar3.e) {
                            return (amcVar3.d * d2) + amcVar3.g;
                        }
                        return Math.pow((amcVar3.b * d2) + amcVar3.c, amcVar3.a) + amcVar3.f;
                    case 6:
                        float[] fArr6 = alq.a;
                        return alq.b((amc) this, d2);
                    case 7:
                        float[] fArr7 = alq.a;
                        return alq.d((amc) this, d2);
                    case 8:
                        amc amcVar4 = (amc) this;
                        double d5 = amcVar4.a;
                        double d6 = amcVar4.e;
                        return ace.a(d2, amcVar4.b, amcVar4.c, amcVar4.d, d6, d5);
                    default:
                        amc amcVar5 = (amc) this;
                        double d7 = amcVar5.e;
                        double d8 = amcVar5.d;
                        if (d2 < d7 * d8) {
                            return (d2 - amcVar5.g) / d8;
                        }
                        double d9 = amcVar5.a;
                        double d10 = amcVar5.f;
                        return (Math.pow(d2 - d10, 1.0d / d9) - amcVar5.c) / amcVar5.b;
                }
            }
        };
        this.m = alvVar2;
        final int i4 = 0;
        this.n = new alv() { // from class: alz
            @Override // defpackage.alv
            public final double a(double d2) {
                switch (i4) {
                    case 0:
                        amb ambVar2 = (amb) this;
                        return ambVar2.m.a(awro.e(d2, ambVar2.e, ambVar2.f));
                    case 1:
                        amb ambVar3 = (amb) this;
                        return awro.e(ambVar3.k.a(d2), ambVar3.e, ambVar3.f);
                    case 2:
                        float[] fArr4 = alq.a;
                        return alq.a((amc) this, d2);
                    case 3:
                        float[] fArr5 = alq.a;
                        return alq.c((amc) this, d2);
                    case 4:
                        amc amcVar2 = (amc) this;
                        double d3 = amcVar2.a;
                        double d4 = amcVar2.e;
                        return ace.b(d2, amcVar2.b, amcVar2.c, amcVar2.d, d4, d3);
                    case 5:
                        amc amcVar3 = (amc) this;
                        if (d2 < amcVar3.e) {
                            return (amcVar3.d * d2) + amcVar3.g;
                        }
                        return Math.pow((amcVar3.b * d2) + amcVar3.c, amcVar3.a) + amcVar3.f;
                    case 6:
                        float[] fArr6 = alq.a;
                        return alq.b((amc) this, d2);
                    case 7:
                        float[] fArr7 = alq.a;
                        return alq.d((amc) this, d2);
                    case 8:
                        amc amcVar4 = (amc) this;
                        double d5 = amcVar4.a;
                        double d6 = amcVar4.e;
                        return ace.a(d2, amcVar4.b, amcVar4.c, amcVar4.d, d6, d5);
                    default:
                        amc amcVar5 = (amc) this;
                        double d7 = amcVar5.e;
                        double d8 = amcVar5.d;
                        if (d2 < d7 * d8) {
                            return (d2 - amcVar5.g) / d8;
                        }
                        double d9 = amcVar5.a;
                        double d10 = amcVar5.f;
                        return (Math.pow(d2 - d10, 1.0d / d9) - amcVar5.c) / amcVar5.b;
                }
            }
        };
        int length = fArr.length;
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        float[] fArr4 = new float[6];
        fArr.getClass();
        System.arraycopy(fArr, 0, fArr4, 0, 6);
        this.h = fArr4;
        if (fArr2 == null) {
            float f3 = fArr4[0];
            float f4 = fArr4[1];
            float f5 = fArr4[2];
            float f6 = fArr4[3];
            float f7 = fArr4[4];
            float f8 = fArr4[5];
            c = 5;
            float f9 = amdVar.a;
            c2 = 1;
            float f10 = amdVar.b;
            float f11 = 1.0f - f3;
            float f12 = f11 / f4;
            float f13 = 1.0f - f5;
            float f14 = 1.0f - f7;
            float f15 = (1.0f - f9) / f10;
            float f16 = f3 / f4;
            float f17 = (f7 / f8) - f16;
            float f18 = (f5 / f6) - f16;
            float f19 = (f9 / f10) - f16;
            float f20 = (f13 / f6) - f12;
            float f21 = (((f15 - f12) * f18) - (f20 * f19)) / ((((f14 / f8) - f12) * f18) - (f17 * f20));
            float f22 = (f19 - (f17 * f21)) / f18;
            float f23 = (1.0f - f22) - f21;
            float f24 = f23 / f4;
            float f25 = f22 / f6;
            float f26 = f21 / f8;
            i2 = 0;
            fArr3 = new float[]{f3 * f24, f23, f24 * (f11 - f4), f5 * f25, f22, f25 * (f13 - f6), f7 * f26, f21, f26 * (f14 - f8)};
            this.i = fArr3;
        } else {
            c = 5;
            c2 = 1;
            i2 = 0;
            this.i = fArr2;
            fArr3 = fArr2;
        }
        this.j = ace.f(fArr3);
        float fA = aco.a(fArr4);
        float[] fArr5 = alq.a;
        if (fA / aco.a(alq.b) > 0.9f) {
            float f27 = fArr4[i2];
            float f28 = fArr4[c2];
            float f29 = fArr4[2];
            float f30 = fArr4[3];
            float f31 = fArr4[4];
            float f32 = fArr4[c];
        }
        if (i == 0) {
            z = c2;
        } else {
            float[] fArr6 = alq.a;
            if (fArr4 != fArr6) {
                int i5 = i2;
                while (true) {
                    if (i5 >= 6) {
                        amd amdVar2 = alw.a;
                        if (ace.d(amdVar, alw.d) && f == 0.0f && f2 == 1.0f) {
                            ambVar = alq.e;
                            d = 0.0d;
                            while (true) {
                                if (d <= 1.0d) {
                                    z = c2;
                                } else if (!aco.b(d, alvVar, ambVar.k) && aco.b(d, alvVar2, ambVar.m)) {
                                    d += 0.00392156862745098d;
                                }
                            }
                        }
                    } else if (Float.compare(fArr4[i5], fArr6[i5]) == 0 || Math.abs(fArr4[i5] - fArr6[i5]) <= 0.001f) {
                        i5++;
                    }
                }
            } else {
                amd amdVar3 = alw.a;
                if (ace.d(amdVar, alw.d)) {
                    ambVar = alq.e;
                    d = 0.0d;
                    while (true) {
                        if (d <= 1.0d) {
                            z = c2;
                        } else if (!aco.b(d, alvVar, ambVar.k)) {
                        }
                        d += 0.00392156862745098d;
                    }
                }
            }
            z = i2;
        }
        this.p = z;
    }

    @Override // defpackage.alo
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.alo
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.alo
    public final float c(float f, float f2, float f3) {
        alv alvVar = this.n;
        float fA = (float) alvVar.a(f);
        float fA2 = (float) alvVar.a(f2);
        float fA3 = (float) alvVar.a(f3);
        float[] fArr = this.i;
        return (fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3);
    }

    @Override // defpackage.alo
    public final long d(float f, float f2, float f3) {
        alv alvVar = this.n;
        float fA = (float) alvVar.a(f);
        float fA2 = (float) alvVar.a(f2);
        float fA3 = (float) alvVar.a(f3);
        float[] fArr = this.i;
        int length = fArr.length;
        float f4 = fArr[0] * fA;
        float f5 = fArr[3] * fA2;
        float f6 = fArr[6] * fA3;
        float f7 = fArr[1] * fA;
        float f8 = fArr[4] * fA2;
        return (((long) Float.floatToRawIntBits((f4 + f5) + f6)) << 32) | (((long) Float.floatToRawIntBits(f7 + f8 + (fArr[7] * fA3))) & 4294967295L);
    }

    @Override // defpackage.alo
    public final long e(float f, float f2, float f3, float f4, alo aloVar) {
        float[] fArr = this.j;
        float f5 = fArr[0] * f;
        float f6 = fArr[3] * f2;
        float f7 = fArr[6] * f3;
        float f8 = fArr[1] * f;
        float f9 = fArr[4] * f2;
        float f10 = fArr[7] * f3;
        float f11 = fArr[2] * f;
        float f12 = fArr[5] * f2;
        float f13 = fArr[8] * f3;
        alv alvVar = this.l;
        return aav.a((float) alvVar.a(f5 + f6 + f7), (float) alvVar.a(f8 + f9 + f10), (float) alvVar.a(f11 + f12 + f13), f4, aloVar);
    }

    @Override // defpackage.alo
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            amb ambVar = (amb) obj;
            if (Float.compare(ambVar.e, this.e) == 0 && Float.compare(ambVar.f, this.f) == 0 && awrc.c(this.d, ambVar.d) && Arrays.equals(this.h, ambVar.h)) {
                amc amcVar = this.g;
                if (amcVar != null) {
                    return awrc.c(amcVar, ambVar.g);
                }
                if (ambVar.g == null) {
                    return true;
                }
                if (awrc.c(this.k, ambVar.k)) {
                    return awrc.c(this.m, ambVar.m);
                }
            }
        }
        return false;
    }

    @Override // defpackage.alo
    public final boolean f() {
        return this.p;
    }

    @Override // defpackage.alo
    public final int hashCode() {
        int iHashCode = (((super.hashCode() * 31) + this.d.hashCode()) * 31) + Arrays.hashCode(this.h);
        float f = this.e;
        int iFloatToIntBits = ((iHashCode * 31) + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        amc amcVar = this.g;
        int iHashCode2 = iFloatToIntBits2 + (amcVar != null ? amcVar.hashCode() : 0);
        return amcVar == null ? (((iHashCode2 * 31) + this.k.hashCode()) * 31) + this.m.hashCode() : iHashCode2;
    }

    public amb(String str, float[] fArr, amd amdVar, final amc amcVar, int i) {
        alv alvVar;
        alv alvVar2;
        if (amcVar.a()) {
            final int i2 = 6;
            alvVar = new alv() { // from class: alz
                @Override // defpackage.alv
                public final double a(double d2) {
                    switch (i2) {
                        case 0:
                            amb ambVar2 = (amb) amcVar;
                            return ambVar2.m.a(awro.e(d2, ambVar2.e, ambVar2.f));
                        case 1:
                            amb ambVar3 = (amb) amcVar;
                            return awro.e(ambVar3.k.a(d2), ambVar3.e, ambVar3.f);
                        case 2:
                            float[] fArr4 = alq.a;
                            return alq.a((amc) amcVar, d2);
                        case 3:
                            float[] fArr5 = alq.a;
                            return alq.c((amc) amcVar, d2);
                        case 4:
                            amc amcVar2 = (amc) amcVar;
                            double d3 = amcVar2.a;
                            double d4 = amcVar2.e;
                            return ace.b(d2, amcVar2.b, amcVar2.c, amcVar2.d, d4, d3);
                        case 5:
                            amc amcVar3 = (amc) amcVar;
                            if (d2 < amcVar3.e) {
                                return (amcVar3.d * d2) + amcVar3.g;
                            }
                            return Math.pow((amcVar3.b * d2) + amcVar3.c, amcVar3.a) + amcVar3.f;
                        case 6:
                            float[] fArr6 = alq.a;
                            return alq.b((amc) amcVar, d2);
                        case 7:
                            float[] fArr7 = alq.a;
                            return alq.d((amc) amcVar, d2);
                        case 8:
                            amc amcVar4 = (amc) amcVar;
                            double d5 = amcVar4.a;
                            double d6 = amcVar4.e;
                            return ace.a(d2, amcVar4.b, amcVar4.c, amcVar4.d, d6, d5);
                        default:
                            amc amcVar5 = (amc) amcVar;
                            double d7 = amcVar5.e;
                            double d8 = amcVar5.d;
                            if (d2 < d7 * d8) {
                                return (d2 - amcVar5.g) / d8;
                            }
                            double d9 = amcVar5.a;
                            double d10 = amcVar5.f;
                            return (Math.pow(d2 - d10, 1.0d / d9) - amcVar5.c) / amcVar5.b;
                    }
                }
            };
        } else if (amcVar.b()) {
            final int i3 = 7;
            alvVar = new alv() { // from class: alz
                @Override // defpackage.alv
                public final double a(double d2) {
                    switch (i3) {
                        case 0:
                            amb ambVar2 = (amb) amcVar;
                            return ambVar2.m.a(awro.e(d2, ambVar2.e, ambVar2.f));
                        case 1:
                            amb ambVar3 = (amb) amcVar;
                            return awro.e(ambVar3.k.a(d2), ambVar3.e, ambVar3.f);
                        case 2:
                            float[] fArr4 = alq.a;
                            return alq.a((amc) amcVar, d2);
                        case 3:
                            float[] fArr5 = alq.a;
                            return alq.c((amc) amcVar, d2);
                        case 4:
                            amc amcVar2 = (amc) amcVar;
                            double d3 = amcVar2.a;
                            double d4 = amcVar2.e;
                            return ace.b(d2, amcVar2.b, amcVar2.c, amcVar2.d, d4, d3);
                        case 5:
                            amc amcVar3 = (amc) amcVar;
                            if (d2 < amcVar3.e) {
                                return (amcVar3.d * d2) + amcVar3.g;
                            }
                            return Math.pow((amcVar3.b * d2) + amcVar3.c, amcVar3.a) + amcVar3.f;
                        case 6:
                            float[] fArr6 = alq.a;
                            return alq.b((amc) amcVar, d2);
                        case 7:
                            float[] fArr7 = alq.a;
                            return alq.d((amc) amcVar, d2);
                        case 8:
                            amc amcVar4 = (amc) amcVar;
                            double d5 = amcVar4.a;
                            double d6 = amcVar4.e;
                            return ace.a(d2, amcVar4.b, amcVar4.c, amcVar4.d, d6, d5);
                        default:
                            amc amcVar5 = (amc) amcVar;
                            double d7 = amcVar5.e;
                            double d8 = amcVar5.d;
                            if (d2 < d7 * d8) {
                                return (d2 - amcVar5.g) / d8;
                            }
                            double d9 = amcVar5.a;
                            double d10 = amcVar5.f;
                            return (Math.pow(d2 - d10, 1.0d / d9) - amcVar5.c) / amcVar5.b;
                    }
                }
            };
        } else if (amcVar.f == 0.0d && amcVar.g == 0.0d) {
            final int i4 = 8;
            alvVar = new alv() { // from class: alz
                @Override // defpackage.alv
                public final double a(double d2) {
                    switch (i4) {
                        case 0:
                            amb ambVar2 = (amb) amcVar;
                            return ambVar2.m.a(awro.e(d2, ambVar2.e, ambVar2.f));
                        case 1:
                            amb ambVar3 = (amb) amcVar;
                            return awro.e(ambVar3.k.a(d2), ambVar3.e, ambVar3.f);
                        case 2:
                            float[] fArr4 = alq.a;
                            return alq.a((amc) amcVar, d2);
                        case 3:
                            float[] fArr5 = alq.a;
                            return alq.c((amc) amcVar, d2);
                        case 4:
                            amc amcVar2 = (amc) amcVar;
                            double d3 = amcVar2.a;
                            double d4 = amcVar2.e;
                            return ace.b(d2, amcVar2.b, amcVar2.c, amcVar2.d, d4, d3);
                        case 5:
                            amc amcVar3 = (amc) amcVar;
                            if (d2 < amcVar3.e) {
                                return (amcVar3.d * d2) + amcVar3.g;
                            }
                            return Math.pow((amcVar3.b * d2) + amcVar3.c, amcVar3.a) + amcVar3.f;
                        case 6:
                            float[] fArr6 = alq.a;
                            return alq.b((amc) amcVar, d2);
                        case 7:
                            float[] fArr7 = alq.a;
                            return alq.d((amc) amcVar, d2);
                        case 8:
                            amc amcVar4 = (amc) amcVar;
                            double d5 = amcVar4.a;
                            double d6 = amcVar4.e;
                            return ace.a(d2, amcVar4.b, amcVar4.c, amcVar4.d, d6, d5);
                        default:
                            amc amcVar5 = (amc) amcVar;
                            double d7 = amcVar5.e;
                            double d8 = amcVar5.d;
                            if (d2 < d7 * d8) {
                                return (d2 - amcVar5.g) / d8;
                            }
                            double d9 = amcVar5.a;
                            double d10 = amcVar5.f;
                            return (Math.pow(d2 - d10, 1.0d / d9) - amcVar5.c) / amcVar5.b;
                    }
                }
            };
        } else {
            final int i5 = 9;
            alvVar = new alv() { // from class: alz
                @Override // defpackage.alv
                public final double a(double d2) {
                    switch (i5) {
                        case 0:
                            amb ambVar2 = (amb) amcVar;
                            return ambVar2.m.a(awro.e(d2, ambVar2.e, ambVar2.f));
                        case 1:
                            amb ambVar3 = (amb) amcVar;
                            return awro.e(ambVar3.k.a(d2), ambVar3.e, ambVar3.f);
                        case 2:
                            float[] fArr4 = alq.a;
                            return alq.a((amc) amcVar, d2);
                        case 3:
                            float[] fArr5 = alq.a;
                            return alq.c((amc) amcVar, d2);
                        case 4:
                            amc amcVar2 = (amc) amcVar;
                            double d3 = amcVar2.a;
                            double d4 = amcVar2.e;
                            return ace.b(d2, amcVar2.b, amcVar2.c, amcVar2.d, d4, d3);
                        case 5:
                            amc amcVar3 = (amc) amcVar;
                            if (d2 < amcVar3.e) {
                                return (amcVar3.d * d2) + amcVar3.g;
                            }
                            return Math.pow((amcVar3.b * d2) + amcVar3.c, amcVar3.a) + amcVar3.f;
                        case 6:
                            float[] fArr6 = alq.a;
                            return alq.b((amc) amcVar, d2);
                        case 7:
                            float[] fArr7 = alq.a;
                            return alq.d((amc) amcVar, d2);
                        case 8:
                            amc amcVar4 = (amc) amcVar;
                            double d5 = amcVar4.a;
                            double d6 = amcVar4.e;
                            return ace.a(d2, amcVar4.b, amcVar4.c, amcVar4.d, d6, d5);
                        default:
                            amc amcVar5 = (amc) amcVar;
                            double d7 = amcVar5.e;
                            double d8 = amcVar5.d;
                            if (d2 < d7 * d8) {
                                return (d2 - amcVar5.g) / d8;
                            }
                            double d9 = amcVar5.a;
                            double d10 = amcVar5.f;
                            return (Math.pow(d2 - d10, 1.0d / d9) - amcVar5.c) / amcVar5.b;
                    }
                }
            };
        }
        alv alvVar3 = alvVar;
        if (amcVar.a()) {
            final int i6 = 2;
            alvVar2 = new alv() { // from class: alz
                @Override // defpackage.alv
                public final double a(double d2) {
                    switch (i6) {
                        case 0:
                            amb ambVar2 = (amb) amcVar;
                            return ambVar2.m.a(awro.e(d2, ambVar2.e, ambVar2.f));
                        case 1:
                            amb ambVar3 = (amb) amcVar;
                            return awro.e(ambVar3.k.a(d2), ambVar3.e, ambVar3.f);
                        case 2:
                            float[] fArr4 = alq.a;
                            return alq.a((amc) amcVar, d2);
                        case 3:
                            float[] fArr5 = alq.a;
                            return alq.c((amc) amcVar, d2);
                        case 4:
                            amc amcVar2 = (amc) amcVar;
                            double d3 = amcVar2.a;
                            double d4 = amcVar2.e;
                            return ace.b(d2, amcVar2.b, amcVar2.c, amcVar2.d, d4, d3);
                        case 5:
                            amc amcVar3 = (amc) amcVar;
                            if (d2 < amcVar3.e) {
                                return (amcVar3.d * d2) + amcVar3.g;
                            }
                            return Math.pow((amcVar3.b * d2) + amcVar3.c, amcVar3.a) + amcVar3.f;
                        case 6:
                            float[] fArr6 = alq.a;
                            return alq.b((amc) amcVar, d2);
                        case 7:
                            float[] fArr7 = alq.a;
                            return alq.d((amc) amcVar, d2);
                        case 8:
                            amc amcVar4 = (amc) amcVar;
                            double d5 = amcVar4.a;
                            double d6 = amcVar4.e;
                            return ace.a(d2, amcVar4.b, amcVar4.c, amcVar4.d, d6, d5);
                        default:
                            amc amcVar5 = (amc) amcVar;
                            double d7 = amcVar5.e;
                            double d8 = amcVar5.d;
                            if (d2 < d7 * d8) {
                                return (d2 - amcVar5.g) / d8;
                            }
                            double d9 = amcVar5.a;
                            double d10 = amcVar5.f;
                            return (Math.pow(d2 - d10, 1.0d / d9) - amcVar5.c) / amcVar5.b;
                    }
                }
            };
        } else if (amcVar.b()) {
            final int i7 = 3;
            alvVar2 = new alv() { // from class: alz
                @Override // defpackage.alv
                public final double a(double d2) {
                    switch (i7) {
                        case 0:
                            amb ambVar2 = (amb) amcVar;
                            return ambVar2.m.a(awro.e(d2, ambVar2.e, ambVar2.f));
                        case 1:
                            amb ambVar3 = (amb) amcVar;
                            return awro.e(ambVar3.k.a(d2), ambVar3.e, ambVar3.f);
                        case 2:
                            float[] fArr4 = alq.a;
                            return alq.a((amc) amcVar, d2);
                        case 3:
                            float[] fArr5 = alq.a;
                            return alq.c((amc) amcVar, d2);
                        case 4:
                            amc amcVar2 = (amc) amcVar;
                            double d3 = amcVar2.a;
                            double d4 = amcVar2.e;
                            return ace.b(d2, amcVar2.b, amcVar2.c, amcVar2.d, d4, d3);
                        case 5:
                            amc amcVar3 = (amc) amcVar;
                            if (d2 < amcVar3.e) {
                                return (amcVar3.d * d2) + amcVar3.g;
                            }
                            return Math.pow((amcVar3.b * d2) + amcVar3.c, amcVar3.a) + amcVar3.f;
                        case 6:
                            float[] fArr6 = alq.a;
                            return alq.b((amc) amcVar, d2);
                        case 7:
                            float[] fArr7 = alq.a;
                            return alq.d((amc) amcVar, d2);
                        case 8:
                            amc amcVar4 = (amc) amcVar;
                            double d5 = amcVar4.a;
                            double d6 = amcVar4.e;
                            return ace.a(d2, amcVar4.b, amcVar4.c, amcVar4.d, d6, d5);
                        default:
                            amc amcVar5 = (amc) amcVar;
                            double d7 = amcVar5.e;
                            double d8 = amcVar5.d;
                            if (d2 < d7 * d8) {
                                return (d2 - amcVar5.g) / d8;
                            }
                            double d9 = amcVar5.a;
                            double d10 = amcVar5.f;
                            return (Math.pow(d2 - d10, 1.0d / d9) - amcVar5.c) / amcVar5.b;
                    }
                }
            };
        } else if (amcVar.f == 0.0d && amcVar.g == 0.0d) {
            final int i8 = 4;
            alvVar2 = new alv() { // from class: alz
                @Override // defpackage.alv
                public final double a(double d2) {
                    switch (i8) {
                        case 0:
                            amb ambVar2 = (amb) amcVar;
                            return ambVar2.m.a(awro.e(d2, ambVar2.e, ambVar2.f));
                        case 1:
                            amb ambVar3 = (amb) amcVar;
                            return awro.e(ambVar3.k.a(d2), ambVar3.e, ambVar3.f);
                        case 2:
                            float[] fArr4 = alq.a;
                            return alq.a((amc) amcVar, d2);
                        case 3:
                            float[] fArr5 = alq.a;
                            return alq.c((amc) amcVar, d2);
                        case 4:
                            amc amcVar2 = (amc) amcVar;
                            double d3 = amcVar2.a;
                            double d4 = amcVar2.e;
                            return ace.b(d2, amcVar2.b, amcVar2.c, amcVar2.d, d4, d3);
                        case 5:
                            amc amcVar3 = (amc) amcVar;
                            if (d2 < amcVar3.e) {
                                return (amcVar3.d * d2) + amcVar3.g;
                            }
                            return Math.pow((amcVar3.b * d2) + amcVar3.c, amcVar3.a) + amcVar3.f;
                        case 6:
                            float[] fArr6 = alq.a;
                            return alq.b((amc) amcVar, d2);
                        case 7:
                            float[] fArr7 = alq.a;
                            return alq.d((amc) amcVar, d2);
                        case 8:
                            amc amcVar4 = (amc) amcVar;
                            double d5 = amcVar4.a;
                            double d6 = amcVar4.e;
                            return ace.a(d2, amcVar4.b, amcVar4.c, amcVar4.d, d6, d5);
                        default:
                            amc amcVar5 = (amc) amcVar;
                            double d7 = amcVar5.e;
                            double d8 = amcVar5.d;
                            if (d2 < d7 * d8) {
                                return (d2 - amcVar5.g) / d8;
                            }
                            double d9 = amcVar5.a;
                            double d10 = amcVar5.f;
                            return (Math.pow(d2 - d10, 1.0d / d9) - amcVar5.c) / amcVar5.b;
                    }
                }
            };
        } else {
            final int i9 = 5;
            alvVar2 = new alv() { // from class: alz
                @Override // defpackage.alv
                public final double a(double d2) {
                    switch (i9) {
                        case 0:
                            amb ambVar2 = (amb) amcVar;
                            return ambVar2.m.a(awro.e(d2, ambVar2.e, ambVar2.f));
                        case 1:
                            amb ambVar3 = (amb) amcVar;
                            return awro.e(ambVar3.k.a(d2), ambVar3.e, ambVar3.f);
                        case 2:
                            float[] fArr4 = alq.a;
                            return alq.a((amc) amcVar, d2);
                        case 3:
                            float[] fArr5 = alq.a;
                            return alq.c((amc) amcVar, d2);
                        case 4:
                            amc amcVar2 = (amc) amcVar;
                            double d3 = amcVar2.a;
                            double d4 = amcVar2.e;
                            return ace.b(d2, amcVar2.b, amcVar2.c, amcVar2.d, d4, d3);
                        case 5:
                            amc amcVar3 = (amc) amcVar;
                            if (d2 < amcVar3.e) {
                                return (amcVar3.d * d2) + amcVar3.g;
                            }
                            return Math.pow((amcVar3.b * d2) + amcVar3.c, amcVar3.a) + amcVar3.f;
                        case 6:
                            float[] fArr6 = alq.a;
                            return alq.b((amc) amcVar, d2);
                        case 7:
                            float[] fArr7 = alq.a;
                            return alq.d((amc) amcVar, d2);
                        case 8:
                            amc amcVar4 = (amc) amcVar;
                            double d5 = amcVar4.a;
                            double d6 = amcVar4.e;
                            return ace.a(d2, amcVar4.b, amcVar4.c, amcVar4.d, d6, d5);
                        default:
                            amc amcVar5 = (amc) amcVar;
                            double d7 = amcVar5.e;
                            double d8 = amcVar5.d;
                            if (d2 < d7 * d8) {
                                return (d2 - amcVar5.g) / d8;
                            }
                            double d9 = amcVar5.a;
                            double d10 = amcVar5.f;
                            return (Math.pow(d2 - d10, 1.0d / d9) - amcVar5.c) / amcVar5.b;
                    }
                }
            };
        }
        this(str, fArr, amdVar, null, alvVar3, alvVar2, 0.0f, 1.0f, amcVar, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public amb(String str, float[] fArr, amd amdVar, final double d, float f, float f2, int i) {
        alv alvVar;
        alv alvVar2;
        if (d == 1.0d) {
            alvVar = o;
        } else {
            final int i2 = 1;
            alvVar = new alv() { // from class: ama
                @Override // defpackage.alv
                public final double a(double d2) {
                    if (i2 != 0) {
                        if (d2 < 0.0d) {
                            d2 = 0.0d;
                        }
                        return Math.pow(d2, 1.0d / d);
                    }
                    double d3 = d;
                    if (d2 < 0.0d) {
                        d2 = 0.0d;
                    }
                    return Math.pow(d2, d3);
                }
            };
        }
        alv alvVar3 = alvVar;
        if (d == 1.0d) {
            alvVar2 = o;
        } else {
            final int i3 = 0;
            alvVar2 = new alv() { // from class: ama
                @Override // defpackage.alv
                public final double a(double d2) {
                    if (i3 != 0) {
                        if (d2 < 0.0d) {
                            d2 = 0.0d;
                        }
                        return Math.pow(d2, 1.0d / d);
                    }
                    double d3 = d;
                    if (d2 < 0.0d) {
                        d2 = 0.0d;
                    }
                    return Math.pow(d2, d3);
                }
            };
        }
        this(str, fArr, amdVar, null, alvVar3, alvVar2, f, f2, new amc(d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
