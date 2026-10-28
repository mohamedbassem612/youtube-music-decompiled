package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oun {
    public float c;
    public boolean d;
    public float e;
    public float f;
    public float g;
    public float h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    private static final float[] q = new float[33];
    private static final float[] r = new float[33];
    public static final float[] a = new float[8];
    public boolean b = true;
    public float m = 1.0f;
    public float n = 1.0f;
    public float o = 1.0f;
    public float p = 1.0f;

    static {
        for (int i = 0; i <= 32; i++) {
            double d = (float) ((((double) i) * 1.5707963267948966d) / 32.0d);
            q[i] = (float) Math.cos(d);
            r[i] = (float) Math.sin(d);
        }
    }

    public static oun g(mew mewVar) {
        oun ounVar = new oun();
        long j = mewVar.c;
        boolean z = (Memory.peekByte(11 + j) & 32) == 0 || Memory.peekByte(20 + j) != 0;
        ounVar.b = z;
        if (z) {
            ounVar.c = Float.intBitsToFloat(Memory.peekInt(j + 44, false));
            ounVar.d = Memory.peekByte(mewVar.c + 19) != 0;
            return ounVar;
        }
        ounVar.e = Float.intBitsToFloat(Memory.peekInt(j + 120, false));
        ounVar.f = Float.intBitsToFloat(Memory.peekInt(mewVar.c + 124, false));
        ounVar.h = Float.intBitsToFloat(Memory.peekInt(mewVar.c + 128, false));
        ounVar.g = Float.intBitsToFloat(Memory.peekInt(mewVar.c + 132, false));
        long j2 = mewVar.c;
        ounVar.i = Memory.peekByte(21 + j2) != 0;
        ounVar.j = Memory.peekByte(22 + j2) != 0;
        ounVar.l = Memory.peekByte(23 + j2) != 0;
        ounVar.k = Memory.peekByte(24 + j2) != 0;
        ounVar.m = (Memory.peekByte(j2 + 12) & 64) != 0 ? Float.intBitsToFloat(Memory.peekInt(j2 + 136, false)) : 1.0f;
        long j3 = mewVar.c;
        ounVar.n = (Memory.peekByte(12 + j3) & 128) != 0 ? Float.intBitsToFloat(Memory.peekInt(j3 + 140, false)) : 1.0f;
        long j4 = mewVar.c;
        ounVar.p = (Memory.peekByte(j4 + 13) & 1) != 0 ? Float.intBitsToFloat(Memory.peekInt(j4 + 144, false)) : 1.0f;
        long j5 = mewVar.c;
        ounVar.o = (Memory.peekByte(13 + j5) & 2) != 0 ? Float.intBitsToFloat(Memory.peekInt(j5 + 148, false)) : 1.0f;
        return ounVar;
    }

    public final float a(float f, float f2, float f3) {
        if (f3 == 1.0f || f3 == 2.0f || f3 == Float.POSITIVE_INFINITY) {
            return Math.max(0.0f, f - f2);
        }
        if (f3 == Float.NEGATIVE_INFINITY) {
            return f;
        }
        if (f3 < 0.0f) {
            return Math.max(0.0f, f - (f2 * 0.414213f));
        }
        return f3 == 0.0f ? Math.max(0.0f, f - (f2 * 0.585786f)) : Math.max(0.0f, f - f2);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:136:0x0304  */
    /* JADX WARN: Code duplicated, block: B:139:0x0311  */
    /* JADX WARN: Code duplicated, block: B:140:0x0314  */
    /* JADX WARN: Code duplicated, block: B:143:0x031f  */
    /* JADX WARN: Code duplicated, block: B:145:0x032a  */
    /* JADX WARN: Code duplicated, block: B:149:0x0336  */
    /* JADX WARN: Code duplicated, block: B:167:0x038c  */
    /* JADX WARN: Code duplicated, block: B:168:0x038f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0393  */
    /* JADX WARN: Code duplicated, block: B:171:0x0397  */
    /* JADX WARN: Code duplicated, block: B:173:0x039c  */
    /* JADX WARN: Code duplicated, block: B:175:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:79:0x0103  */
    final void b(Path path, float f, float f2, float f3, float f4, float f5, float f6, boolean z, Path.Direction direction) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        int i;
        int i2;
        int i3;
        float f27;
        float f28;
        float f29;
        float f30;
        float f31;
        float f32;
        float fPow;
        float fPow2;
        float f33;
        float f34;
        float f35;
        float f36;
        float f37;
        float f38;
        float f39;
        float f40;
        float f41;
        float f42;
        float f43;
        float f44;
        float f45;
        float f46;
        boolean z2;
        float f47;
        float f48;
        float f49;
        float f50;
        float f51;
        float f52;
        float f53;
        boolean z3;
        float f54;
        boolean z4;
        float f55;
        boolean z5;
        int iRound = Math.round(f6 / 1.5707964f);
        Path.Direction direction2 = Path.Direction.CCW;
        if (f3 == 0.0f && f4 == 0.0f) {
            if (z) {
                path.moveTo(f, f2);
                return;
            } else {
                path.lineTo(f, f2);
                return;
            }
        }
        int i4 = 2;
        if (Float.isInfinite(f5)) {
            int i5 = iRound % 4;
            if (i5 != 0) {
                if (i5 == 1) {
                    float f56 = f2 + f4;
                    f50 = f - f3;
                    if (f5 == Float.NEGATIVE_INFINITY) {
                        f53 = f;
                        z3 = true;
                    } else {
                        f53 = f50;
                        z3 = false;
                    }
                    f47 = f53;
                    f2 = f56;
                    f48 = true != z3 ? f56 : f2;
                    f45 = f;
                    f49 = f2;
                } else if (i5 != 2) {
                    float f57 = f + f3;
                    float f58 = f2 - f4;
                    if (f5 == Float.NEGATIVE_INFINITY) {
                        f55 = f;
                        z5 = true;
                    } else {
                        f55 = f57;
                        z5 = false;
                    }
                    f47 = f55;
                    f2 = f58;
                    f48 = true != z5 ? f58 : f2;
                    f49 = f2;
                    f50 = f57;
                    f45 = f;
                } else {
                    float f59 = f2 - f4;
                    float f60 = f - f3;
                    if (f5 == Float.NEGATIVE_INFINITY) {
                        f54 = f;
                        z4 = true;
                    } else {
                        f54 = f60;
                        z4 = false;
                    }
                    f47 = f54;
                    f48 = true != z4 ? f59 : f2;
                    f49 = f59;
                    f45 = f60;
                }
                if (direction == direction2) {
                    f52 = f50;
                    f51 = f49;
                } else {
                    f51 = f2;
                    f52 = f45;
                }
                if (z) {
                    path.moveTo(f52, f51);
                } else {
                    path.lineTo(f52, f51);
                }
                if (direction != direction2) {
                    f45 = f50;
                    f2 = f49;
                }
                path.lineTo(f47, f48);
                path.lineTo(f45, f2);
                return;
            }
            f45 = f + f3;
            float f61 = f2 + f4;
            if (f5 == Float.NEGATIVE_INFINITY) {
                f46 = f;
                z2 = true;
            } else {
                f46 = f45;
                z2 = false;
            }
            f47 = f46;
            f48 = true != z2 ? f61 : f2;
            f49 = f61;
            f50 = f;
            if (direction == direction2) {
                f52 = f50;
                f51 = f49;
            } else {
                f51 = f2;
                f52 = f45;
            }
            if (z) {
                path.moveTo(f52, f51);
            } else {
                path.lineTo(f52, f51);
            }
            if (direction != direction2) {
                f45 = f50;
                f2 = f49;
            }
            path.lineTo(f47, f48);
            path.lineTo(f45, f2);
            return;
        }
        if (f5 == 0.0f) {
            int i6 = iRound % 4;
            if (i6 != 0) {
                if (i6 == 1) {
                    f42 = f - f3;
                    f2 += f4;
                } else if (i6 != 2) {
                    f2 -= f4;
                    f42 = f + f3;
                } else {
                    f2 -= f4;
                    f41 = f - f3;
                }
                f41 = f;
                if (direction == direction2) {
                    f43 = f42;
                    f44 = f2;
                } else {
                    f43 = f41;
                    f44 = f2;
                }
                if (z) {
                    path.moveTo(f43, f44);
                } else {
                    path.lineTo(f43, f44);
                }
                if (direction != direction2) {
                    f41 = f42;
                    f2 = f2;
                }
                path.lineTo(f41, f2);
                return;
            }
            f41 = f + f3;
            f2 += f4;
            f42 = f;
            if (direction == direction2) {
                f43 = f42;
                f44 = f2;
            } else {
                f43 = f41;
                f44 = f2;
            }
            if (z) {
                path.moveTo(f43, f44);
            } else {
                path.lineTo(f43, f44);
            }
            if (direction != direction2) {
                f41 = f42;
                f2 = f2;
            }
            path.lineTo(f41, f2);
            return;
        }
        if (f5 == 1.0f || f5 == 2.0f) {
            float f62 = f5 == 1.0f ? 0.5522847f : 0.909057f;
            float f63 = f3 * f62;
            float f64 = f62 * f4;
            int i7 = iRound % 4;
            if (i7 != 0) {
                if (i7 == 1) {
                    f25 = f2 + f64;
                    f26 = f - f63;
                    f16 = f2 + f4;
                    f15 = f - f3;
                } else if (i7 != 2) {
                    f26 = f + f63;
                    f25 = f2 - f64;
                    f15 = f + f3;
                    f16 = f2 - f4;
                } else {
                    f8 = f2 - f64;
                    f7 = f - f63;
                    f10 = f2 - f4;
                    f9 = f - f3;
                }
                f11 = f25;
                f12 = f26;
                f13 = f15;
                f14 = f16;
                f9 = f;
                f10 = f2;
                if (direction == direction2) {
                    f18 = f10;
                    f17 = f15;
                } else {
                    f17 = f9;
                    f18 = f16;
                }
                if (z) {
                    path.moveTo(f17, f18);
                } else {
                    path.lineTo(f17, f18);
                }
                if (direction == direction2) {
                    f20 = f9;
                    f19 = f16;
                    f24 = f11;
                    f23 = f12;
                    f22 = f13;
                    f21 = f14;
                } else {
                    f19 = f10;
                    f20 = f15;
                    f21 = f11;
                    f22 = f12;
                    f23 = f13;
                    f24 = f14;
                }
                path.cubicTo(f22, f24, f23, f21, f20, f19);
                return;
            }
            f7 = f + f63;
            f8 = f2 + f64;
            f9 = f + f3;
            f10 = f2 + f4;
            f11 = f10;
            f12 = f9;
            f13 = f7;
            f14 = f8;
            f15 = f;
            f16 = f2;
            if (direction == direction2) {
                f18 = f10;
                f17 = f15;
            } else {
                f17 = f9;
                f18 = f16;
            }
            if (z) {
                path.moveTo(f17, f18);
            } else {
                path.lineTo(f17, f18);
            }
            if (direction == direction2) {
                f20 = f9;
                f19 = f16;
                f24 = f11;
                f23 = f12;
                f22 = f13;
                f21 = f14;
            } else {
                f19 = f10;
                f20 = f15;
                f21 = f11;
                f22 = f12;
                f23 = f13;
                f24 = f14;
            }
            path.cubicTo(f22, f24, f23, f21, f20, f19);
            return;
        }
        float fAbs = Math.abs(f5);
        if (fAbs >= 0.5f) {
            double d = fAbs + fAbs;
            float fLog = (float) (Math.log(d) / 0.6931471805599453d);
            float fTanh = ((((float) Math.tanh(((-2.010479f) + fLog) * 2.9149468f)) + 1.0f) * (-0.16622066f)) + 1.2430921f;
            float fExp = 1.0f / (((float) Math.exp(fTanh * 2.010479f)) + 1.0f);
            float fExp2 = 1.0f / (((float) Math.exp(fTanh * (2.010479f - fLog))) + 1.0f);
            float fExp3 = (float) Math.exp(Math.pow(fLog, 1.3473703861236572d) * (-0.2823023200035095d));
            float fPow3 = (float) Math.pow(0.5d, 1.0d / d);
            float f65 = fExp3 * 0.329229f;
            float f66 = fPow3 + f65;
            float f67 = fPow3 - f65;
            float f68 = (fExp2 - fExp) / (1.0f - fExp);
            if (f5 < 0.0f) {
                float f69 = 1.0f - f68;
                f36 = 1.0f - f67;
                f35 = 1.0f - f66;
                f68 = 0.0f;
                f37 = f69;
                f39 = 1.0f - fPow3;
                f40 = f37;
                f38 = 0.0f;
            } else {
                f35 = f67;
                f36 = f66;
                f37 = 1.0f;
                f38 = f68;
                f39 = fPow3;
                f40 = 1.0f;
            }
            float[] fArr = new float[7];
            fArr[0] = 1.0f;
            fArr[1] = f37;
            fArr[2] = f36;
            fArr[3] = f39;
            fArr[4] = f35;
            fArr[5] = f68;
            fArr[6] = 0.0f;
            float[] fArr2 = new float[7];
            fArr2[0] = 0.0f;
            fArr2[1] = f38;
            fArr2[2] = f35;
            fArr2[3] = f39;
            fArr2[4] = f36;
            fArr2[5] = f40;
            fArr2[6] = 1.0f;
            for (int i8 = 0; i8 < 7; i8++) {
                float f70 = fArr[i8];
                float f71 = fArr2[i8];
                int i9 = iRound % 4;
                if (i9 != 0) {
                    if (i9 == 1) {
                        fArr[i8] = -f71;
                        fArr2[i8] = f70;
                    } else if (i9 != 2) {
                        fArr[i8] = f71;
                        fArr2[i8] = -f70;
                    } else {
                        fArr[i8] = -f70;
                        fArr2[i8] = -f71;
                    }
                }
            }
            for (int i10 = 0; i10 < 7; i10++) {
                fArr[i10] = f + (fArr[i10] * f3);
                fArr2[i10] = f2 + (fArr2[i10] * f4);
            }
            char c = direction == direction2 ? (char) 6 : (char) 0;
            if (z) {
                path.moveTo(fArr[c], fArr2[c]);
            } else {
                path.lineTo(fArr[c], fArr2[c]);
            }
            if (direction == direction2) {
                path.cubicTo(fArr[5], fArr2[5], fArr[4], fArr2[4], fArr[3], fArr2[3]);
                path.cubicTo(fArr[2], fArr2[2], fArr[1], fArr2[1], fArr[0], fArr2[0]);
                return;
            } else {
                path.cubicTo(fArr[1], fArr2[1], fArr[2], fArr2[2], fArr[3], fArr2[3]);
                path.cubicTo(fArr[4], fArr2[4], fArr[5], fArr2[5], fArr[6], fArr2[6]);
                return;
            }
        }
        char c2 = 4;
        float fMax = 1.0f / Math.max(0.001f, fAbs);
        if (direction == direction2) {
            i2 = -1;
            i3 = 32;
            i = -1;
        } else {
            i = 33;
            i2 = 1;
            i3 = 0;
        }
        int i11 = i3;
        while (i11 != i) {
            int i12 = iRound % 4;
            if (i12 != 0) {
                f29 = -1.0f;
                if (i12 != 1) {
                    float[] fArr3 = q;
                    if (i12 != i4) {
                        int i13 = 32 - i11;
                        float f72 = fArr3[i13];
                        f28 = r[i13];
                        f30 = f72;
                        f31 = 1.0f;
                    } else {
                        f27 = fArr3[i11];
                        f28 = r[i11];
                    }
                } else {
                    int i14 = 32 - i11;
                    float f73 = q[i14];
                    f28 = r[i14];
                    f30 = f73;
                    f31 = -1.0f;
                    f29 = 1.0f;
                }
                float f74 = f29 * f4;
                f32 = f31 * f3;
                if (f30 == 0.0f) {
                    fPow = 0.0f;
                } else {
                    fPow = (float) Math.pow(f30, fMax);
                }
                if (f28 == 0.0f) {
                    fPow2 = 0.0f;
                } else {
                    fPow2 = (float) Math.pow(f28, fMax);
                }
                if (f5 < 0.0f) {
                    f33 = f + (f32 * (1.0f - fPow2));
                    fPow2 = 1.0f - fPow;
                } else {
                    f33 = f + (f32 * fPow);
                }
                f34 = f2 + (f74 * fPow2);
                if (z || i11 != i3) {
                    path.lineTo(f33, f34);
                } else {
                    path.moveTo(f33, f34);
                }
                i11 += i2;
                c2 = c2;
                i4 = 2;
            } else {
                f27 = q[i11];
                f28 = r[i11];
                f29 = 1.0f;
            }
            f30 = f27;
            f31 = f29;
            float f75 = f29 * f4;
            f32 = f31 * f3;
            if (f30 == 0.0f) {
                fPow = 0.0f;
            } else {
                fPow = (float) Math.pow(f30, fMax);
            }
            if (f28 == 0.0f) {
                fPow2 = 0.0f;
            } else {
                fPow2 = (float) Math.pow(f28, fMax);
            }
            if (f5 < 0.0f) {
                f33 = f + (f32 * (1.0f - fPow2));
                fPow2 = 1.0f - fPow;
            } else {
                f33 = f + (f32 * fPow);
            }
            f34 = f2 + (f75 * fPow2);
            if (z) {
                path.lineTo(f33, f34);
            } else {
                path.lineTo(f33, f34);
            }
            i11 += i2;
            c2 = c2;
            i4 = 2;
        }
    }

    public final void c(RectF rectF, Path path, Path.Direction direction) {
        path.isEmpty();
        boolean zF = f();
        float[] fArr = a;
        if (!zF) {
            d(rectF.width(), rectF.height(), fArr);
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            return;
        }
        d(rectF.width(), rectF.height(), fArr);
        float f = fArr[0] + fArr[2];
        float fMin = f > rectF.width() ? Math.min(1.0f, rectF.width() / f) : 1.0f;
        float f2 = fArr[6] + fArr[4];
        if (f2 > rectF.width()) {
            fMin = Math.min(fMin, rectF.width() / f2);
        }
        float f3 = fArr[1] + fArr[7];
        if (f3 > rectF.height()) {
            fMin = Math.min(fMin, rectF.height() / f3);
        }
        float f4 = fArr[3] + fArr[5];
        if (f4 > rectF.height()) {
            fMin = Math.min(fMin, rectF.height() / f4);
        }
        if (fMin < 1.0f) {
            for (int i = 0; i < 8; i++) {
                fArr[i] = fArr[i] * fMin;
            }
        }
        if (direction == Path.Direction.CCW) {
            float f5 = rectF.left + fArr[0];
            float f6 = rectF.top;
            float f7 = fArr[1];
            b(path, f5, f6 + f7, fArr[0], f7, this.m, 3.1415927f, true, direction);
            float f8 = fArr[6] + rectF.left;
            float f9 = rectF.bottom;
            float f10 = fArr[7];
            b(path, f8, f9 - f10, fArr[6], f10, this.p, 1.5707964f, false, direction);
            float f11 = rectF.right - fArr[4];
            float f12 = rectF.bottom;
            float f13 = fArr[5];
            b(path, f11, f12 - f13, fArr[4], f13, this.o, 0.0f, false, direction);
            float f14 = rectF.right - fArr[2];
            float f15 = rectF.top;
            float f16 = fArr[3];
            b(path, f14, f15 + f16, fArr[2], f16, this.n, 4.712389f, false, direction);
        } else {
            float f17 = rectF.left + fArr[0];
            float f18 = rectF.top;
            float f19 = fArr[1];
            b(path, f17, f18 + f19, fArr[0], f19, this.m, 3.1415927f, true, direction);
            float f20 = rectF.right - fArr[2];
            float f21 = rectF.top;
            float f22 = fArr[3];
            b(path, f20, f21 + f22, fArr[2], f22, this.n, 4.712389f, false, direction);
            float f23 = rectF.right - fArr[4];
            float f24 = rectF.bottom;
            float f25 = fArr[5];
            b(path, f23, f24 - f25, fArr[4], f25, this.o, 0.0f, false, direction);
            float f26 = fArr[6] + rectF.left;
            float f27 = rectF.bottom;
            float f28 = fArr[7];
            b(path, f26, f27 - f28, fArr[6], f28, this.p, 1.5707964f, false, direction);
        }
        path.close();
    }

    public final void d(float f, float f2, float[] fArr) {
        float f3;
        if (e()) {
            if (this.b) {
                boolean z = this.d;
                float f4 = this.c;
                if (z) {
                    f3 = f * f4;
                    f4 *= f2;
                } else {
                    f3 = f4;
                }
                fArr[0] = f3;
                fArr[1] = f4;
                fArr[2] = f3;
                fArr[3] = f4;
                fArr[4] = f3;
                fArr[5] = f4;
                fArr[6] = f3;
                fArr[7] = f4;
                return;
            }
            boolean z2 = this.i;
            float f5 = this.e;
            fArr[0] = z2 ? f5 * f : f5;
            if (z2) {
                f5 *= f2;
            }
            fArr[1] = f5;
            boolean z3 = this.j;
            float f6 = this.f;
            fArr[2] = z3 ? f6 * f : f6;
            if (z3) {
                f6 *= f2;
            }
            fArr[3] = f6;
            boolean z4 = this.k;
            float f7 = this.g;
            fArr[4] = z4 ? f7 * f : f7;
            if (z4) {
                f7 *= f2;
            }
            fArr[5] = f7;
            boolean z5 = this.l;
            float f8 = this.h;
            fArr[6] = z5 ? f * f8 : f8;
            if (z5) {
                f8 *= f2;
            }
            fArr[7] = f8;
        }
    }

    public final boolean e() {
        if (this.b) {
            if (this.c <= 0.0f) {
                return false;
            }
        } else if (this.e <= 0.0f && this.f <= 0.0f && this.h <= 0.0f && this.g <= 0.0f) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oun) {
            oun ounVar = (oun) obj;
            boolean z = this.b;
            if (z == ounVar.b) {
                if (z) {
                    if (Float.compare(ounVar.c, this.c) == 0 && this.d == ounVar.d) {
                        return true;
                    }
                } else if (Float.compare(ounVar.e, this.e) == 0 && Float.compare(ounVar.f, this.f) == 0 && Float.compare(ounVar.g, this.g) == 0 && Float.compare(ounVar.h, this.h) == 0 && this.i == ounVar.i && this.j == ounVar.j && this.k == ounVar.k && this.l == ounVar.l && Float.compare(ounVar.m, this.m) == 0 && Float.compare(ounVar.n, this.n) == 0 && Float.compare(ounVar.o, this.o) == 0 && Float.compare(ounVar.p, this.p) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f() {
        if (this.b) {
            return false;
        }
        return (this.m == 1.0f && this.n == 1.0f && this.o == 1.0f && this.p == 1.0f) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iFloatToIntBits;
        int iFloatToIntBits2;
        boolean z = this.b;
        int i = (z ? 1 : 0) * 31;
        if (z) {
            iFloatToIntBits = (i + Float.floatToIntBits(this.c)) * 31;
            iFloatToIntBits2 = this.d;
        } else {
            iFloatToIntBits = (((((((((((((((((((((i + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31) + Float.floatToIntBits(this.m)) * 31) + Float.floatToIntBits(this.n)) * 31) + Float.floatToIntBits(this.o)) * 31;
            iFloatToIntBits2 = Float.floatToIntBits(this.p);
        }
        return iFloatToIntBits + iFloatToIntBits2;
    }
}
