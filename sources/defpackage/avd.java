package defpackage;

import android.graphics.Path;
import android.media.MediaCodecInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class avd {
    public static Boolean a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(avx[] avxVarArr, Path path) {
        int i;
        float[] fArr;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        avx[] avxVarArr2 = avxVarArr;
        float[] fArr2 = new float[6];
        int length = avxVarArr2.length;
        int i3 = 0;
        int i4 = 0;
        char c = 'm';
        while (i4 < length) {
            avx avxVar = avxVarArr2[i4];
            char c2 = avxVar.a;
            float f10 = fArr2[i3];
            float f11 = fArr2[1];
            float f12 = fArr2[2];
            float f13 = fArr2[3];
            float f14 = fArr2[4];
            int i5 = i3;
            float f15 = fArr2[5];
            switch (c2) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f14, f15);
                    f10 = f14;
                    f12 = f10;
                    f11 = f15;
                    f13 = f11;
                    i = 2;
                    break;
            }
            float f16 = f14;
            float f17 = f15;
            float f18 = f10;
            float f19 = f11;
            int i6 = i5;
            for (float[] fArr3 = avxVar.b; i6 < fArr3.length; fArr3 = fArr) {
                if (c2 == 'A') {
                    fArr = fArr3;
                    i2 = i6;
                    avxVar = avxVar;
                    float f20 = f18;
                    float f21 = f19;
                    i4 = i4;
                    c2 = c2;
                    int i7 = i2 + 6;
                    int i8 = i2 + 5;
                    avx.a(path, f20, f21, fArr[i8], fArr[i7], fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != 0.0f ? 1 : i5, fArr[i2 + 4] != 0.0f ? 1 : i5);
                    f12 = fArr[i8];
                    f = fArr[i7];
                    f13 = f;
                    f2 = f12;
                } else if (c2 == 'C') {
                    fArr = fArr3;
                    i2 = i6;
                    i4 = i4;
                    avxVar = avxVar;
                    c2 = c2;
                    int i9 = i2 + 5;
                    int i10 = i2 + 4;
                    int i11 = i2 + 3;
                    int i12 = i2 + 2;
                    path.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i12], fArr[i11], fArr[i10], fArr[i9]);
                    float f22 = fArr[i10];
                    float f23 = fArr[i9];
                    f12 = fArr[i12];
                    f13 = fArr[i11];
                    f = f23;
                    f2 = f22;
                } else if (c2 == 'H') {
                    fArr = fArr3;
                    i2 = i6;
                    avxVar = avxVar;
                    c2 = c2;
                    f = f19;
                    i4 = i4;
                    path.lineTo(fArr[i2], f);
                    f2 = fArr[i2];
                } else if (c2 == 'Q') {
                    fArr = fArr3;
                    i2 = i6;
                    i4 = i4;
                    avxVar = avxVar;
                    c2 = c2;
                    int i13 = i2 + 3;
                    int i14 = i2 + 2;
                    int i15 = i2 + 1;
                    path.quadTo(fArr[i2], fArr[i15], fArr[i14], fArr[i13]);
                    float f24 = fArr[i2];
                    float f25 = fArr[i15];
                    f2 = fArr[i14];
                    f13 = f25;
                    f = fArr[i13];
                    f12 = f24;
                } else if (c2 == 'V') {
                    fArr = fArr3;
                    i2 = i6;
                    i4 = i4;
                    avxVar = avxVar;
                    f2 = f18;
                    c2 = c2;
                    path.lineTo(f2, fArr[i2]);
                    f = fArr[i2];
                } else if (c2 != 'a') {
                    if (c2 == 'c') {
                        fArr = fArr3;
                        i2 = i6;
                        int i16 = i2 + 5;
                        int i17 = i2 + 4;
                        int i18 = i2 + 3;
                        int i19 = i2 + 2;
                        path.rCubicTo(fArr[i2], fArr[i2 + 1], fArr[i19], fArr[i18], fArr[i17], fArr[i16]);
                        float f26 = fArr[i19] + f18;
                        float f27 = fArr[i18] + f19;
                        f18 += fArr[i17];
                        f19 += fArr[i16];
                        f12 = f26;
                        f13 = f27;
                    } else if (c2 == 'h') {
                        fArr = fArr3;
                        i2 = i6;
                        path.rLineTo(fArr[i2], 0.0f);
                        f18 += fArr[i2];
                    } else if (c2 != 'q') {
                        if (c2 != 'v') {
                            if (c2 != 'L') {
                                if (c2 == 'M') {
                                    fArr = fArr3;
                                    i2 = i6;
                                    f4 = fArr[i2];
                                    f5 = fArr[i2 + 1];
                                    if (i2 > 0) {
                                        path.lineTo(f4, f5);
                                    } else {
                                        path.moveTo(f4, f5);
                                        f16 = f4;
                                        f = f5;
                                        f17 = f;
                                        f2 = f16;
                                    }
                                } else if (c2 != 'S') {
                                    if (c2 == 'T') {
                                        fArr = fArr3;
                                        i2 = i6;
                                        int i20 = i2 + 1;
                                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                            f19 = (f19 + f19) - f13;
                                            f18 = (f18 + f18) - f12;
                                        }
                                        path.quadTo(f18, f19, fArr[i2], fArr[i20]);
                                        float f28 = fArr[i2];
                                        f = fArr[i20];
                                        f12 = f18;
                                        f13 = f19;
                                        f2 = f28;
                                        avxVar = avxVar;
                                    } else if (c2 == 'l') {
                                        fArr = fArr3;
                                        i2 = i6;
                                        int i21 = i2 + 1;
                                        path.rLineTo(fArr[i2], fArr[i21]);
                                        f18 += fArr[i2];
                                        f3 = fArr[i21];
                                    } else if (c2 == 'm') {
                                        fArr = fArr3;
                                        i2 = i6;
                                        float f29 = fArr[i2];
                                        f18 += f29;
                                        float f30 = fArr[i2 + 1];
                                        f19 += f30;
                                        if (i2 > 0) {
                                            path.rLineTo(f29, f30);
                                        } else {
                                            path.rMoveTo(f29, f30);
                                            f2 = f18;
                                            f16 = f2;
                                            f = f19;
                                            f17 = f;
                                        }
                                    } else if (c2 != 's') {
                                        if (c2 == 't') {
                                            int i22 = i6 + 1;
                                            if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                                f8 = f19 - f13;
                                                f9 = f18 - f12;
                                            } else {
                                                f8 = 0.0f;
                                                f9 = 0.0f;
                                            }
                                            path.rQuadTo(f9, f8, fArr3[i6], fArr3[i22]);
                                            float f31 = f9 + f18;
                                            float f32 = f8 + f19;
                                            f18 += fArr3[i6];
                                            f19 += fArr3[i22];
                                            f13 = f32;
                                            f12 = f31;
                                        }
                                        fArr = fArr3;
                                        i2 = i6;
                                    } else {
                                        int i23 = i6 + 3;
                                        int i24 = i6 + 2;
                                        int i25 = i6 + 1;
                                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                            f6 = f19 - f13;
                                            f7 = f18 - f12;
                                        } else {
                                            f7 = 0.0f;
                                            f6 = 0.0f;
                                        }
                                        int i26 = i6;
                                        fArr = fArr3;
                                        i2 = i26;
                                        path.rCubicTo(f7, f6, fArr3[i26], fArr3[i25], fArr3[i24], fArr3[i23]);
                                        float f33 = fArr[i2] + f18;
                                        float f34 = fArr[i25] + f19;
                                        f18 += fArr[i24];
                                        f19 += fArr[i23];
                                        f12 = f33;
                                        f13 = f34;
                                    }
                                    c2 = c2;
                                } else {
                                    fArr = fArr3;
                                    i2 = i6;
                                    int i27 = i2 + 3;
                                    int i28 = i2 + 2;
                                    int i29 = i2 + 1;
                                    if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                        f19 = (f19 + f19) - f13;
                                        f18 = (f18 + f18) - f12;
                                    }
                                    path.cubicTo(f18, f19, fArr[i2], fArr[i29], fArr[i28], fArr[i27]);
                                    f12 = fArr[i2];
                                    f13 = fArr[i29];
                                    f2 = fArr[i28];
                                    f = fArr[i27];
                                }
                                avxVar = avxVar;
                            } else {
                                fArr = fArr3;
                                i2 = i6;
                                int i30 = i2 + 1;
                                path.lineTo(fArr[i2], fArr[i30]);
                                f4 = fArr[i2];
                                f5 = fArr[i30];
                            }
                            f = f5;
                            f2 = f4;
                            avxVar = avxVar;
                        } else {
                            fArr = fArr3;
                            i2 = i6;
                            path.rLineTo(0.0f, fArr[i2]);
                            f3 = fArr[i2];
                        }
                        f19 += f3;
                    } else {
                        fArr = fArr3;
                        i2 = i6;
                        int i31 = i2 + 3;
                        int i32 = i2 + 2;
                        int i33 = i2 + 1;
                        path.rQuadTo(fArr[i2], fArr[i33], fArr[i32], fArr[i31]);
                        float f35 = fArr[i2] + f18;
                        float f36 = fArr[i33] + f19;
                        f18 += fArr[i32];
                        f19 += fArr[i31];
                        f13 = f36;
                        f12 = f35;
                    }
                    f2 = f18;
                    f = f19;
                    c2 = c2;
                } else {
                    fArr = fArr3;
                    i2 = i6;
                    int i34 = i2 + 6;
                    int i35 = i2 + 5;
                    int i36 = i2 + 4;
                    float f37 = fArr[i35] + f18;
                    float f38 = fArr[i34] + f19;
                    avxVar = avxVar;
                    avx.a(path, f18, f19, f37, f38, fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != 0.0f ? 1 : i5, fArr[i36] != 0.0f ? 1 : i5);
                    f2 = f18 + fArr[i35];
                    f = f19 + fArr[i34];
                    f12 = f2;
                    f13 = f;
                }
                i6 = i2 + i;
                path = path;
                avxVar = avxVar;
                c2 = c2;
                i4 = i4;
                f18 = f2;
                f19 = f;
                c = c2;
            }
            fArr2[i5] = f18;
            fArr2[1] = f19;
            fArr2[2] = f12;
            fArr2[3] = f13;
            fArr2[4] = f16;
            fArr2[5] = f17;
            c = avxVar.a;
            i4++;
            avxVarArr2 = avxVarArr;
            i3 = i5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b2 A[Catch: NumberFormatException -> 0x00ce, TryCatch #0 {NumberFormatException -> 0x00ce, blocks: (B:27:0x006d, B:30:0x0081, B:32:0x0087, B:36:0x0093, B:49:0x00ad, B:51:0x00b2, B:54:0x00c3, B:56:0x00c7), top: B:65:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3 A[Catch: NumberFormatException -> 0x00ce, TryCatch #0 {NumberFormatException -> 0x00ce, blocks: (B:27:0x006d, B:30:0x0081, B:32:0x0087, B:36:0x0093, B:49:0x00ad, B:51:0x00b2, B:54:0x00c3, B:56:0x00c7), top: B:65:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e8  */
    public static avx[] b(String str) {
        String strTrim;
        int i;
        float[] fArrD;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char cCharAt = str.charAt(i4);
                if (((cCharAt - 'A') * (cCharAt - 'Z') > 0 && (cCharAt - 'a') * (cCharAt - 'z') > 0) || cCharAt == 'e' || cCharAt == 'E') {
                    i4++;
                } else {
                    strTrim = str.substring(i5, i4).trim();
                    if (strTrim.isEmpty()) {
                        i = i3;
                    } else {
                        if (strTrim.charAt(i3) != 'z' || strTrim.charAt(i3) == 'Z') {
                            i = i3;
                            fArrD = new float[i];
                        } else {
                            try {
                                float[] fArr = new float[strTrim.length()];
                                int length = strTrim.length();
                                int i6 = i2;
                                int i7 = i3;
                                while (i6 < length) {
                                    int i8 = i3;
                                    int i9 = i8;
                                    int i10 = i9;
                                    int i11 = i10;
                                    for (int i12 = i6; i12 < strTrim.length(); i12++) {
                                        char cCharAt2 = strTrim.charAt(i12);
                                        if (cCharAt2 == ' ') {
                                            i9 = 0;
                                            i10 = 1;
                                        } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                            switch (cCharAt2) {
                                                case ',':
                                                    i9 = 0;
                                                    i10 = 1;
                                                    break;
                                                case '-':
                                                    if (i12 == i6 || i9 != 0) {
                                                        i9 = 0;
                                                    } else {
                                                        i9 = 0;
                                                        i10 = 1;
                                                        i11 = 1;
                                                    }
                                                    break;
                                                case '.':
                                                    if (i8 == 0) {
                                                        i8 = 1;
                                                        i9 = 0;
                                                    } else {
                                                        i8 = 1;
                                                        i9 = 0;
                                                        i10 = 1;
                                                        i11 = 1;
                                                    }
                                                    break;
                                                default:
                                                    i9 = 0;
                                                    break;
                                            }
                                        } else {
                                            i9 = 1;
                                        }
                                        if (i10 != 0) {
                                            if (i6 < i12) {
                                                fArr[i7] = Float.parseFloat(strTrim.substring(i6, i12));
                                                i7++;
                                            }
                                            if (i11 != 0) {
                                                i6 = i12;
                                            } else {
                                                i6 = i12 + 1;
                                            }
                                            i3 = 0;
                                        }
                                    }
                                    if (i6 < i12) {
                                        fArr[i7] = Float.parseFloat(strTrim.substring(i6, i12));
                                        i7++;
                                    }
                                    if (i11 != 0) {
                                        i6 = i12;
                                    } else {
                                        i6 = i12 + 1;
                                    }
                                    i3 = 0;
                                }
                                fArrD = d(fArr, i7);
                                i = 0;
                            } catch (NumberFormatException e) {
                                throw new RuntimeException(a.bU((byte) 34, strTrim, "error in parsing \""), e);
                            }
                        }
                        g(arrayList, strTrim.charAt(i), fArrD);
                    }
                    i5 = i4;
                    i4++;
                    i3 = i;
                    i2 = 1;
                }
            }
            strTrim = str.substring(i5, i4).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i3) != 'z') {
                    i = i3;
                    fArrD = new float[i];
                } else {
                    i = i3;
                    fArrD = new float[i];
                }
                g(arrayList, strTrim.charAt(i), fArrD);
            } else {
                i = i3;
            }
            i5 = i4;
            i4++;
            i3 = i;
            i2 = 1;
        }
        if (i4 - i5 == i2 && i5 < str.length()) {
            g(arrayList, str.charAt(i5), new float[i3]);
        }
        return (avx[]) arrayList.toArray(new avx[i3]);
    }

    public static avx[] c(avx[] avxVarArr) {
        avx[] avxVarArr2 = new avx[avxVarArr.length];
        for (int i = 0; i < avxVarArr.length; i++) {
            avxVarArr2[i] = new avx(avxVarArr[i]);
        }
        return avxVarArr2;
    }

    public static float[] d(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int iMin = Math.min(i, fArr.length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static int e(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            bsd bsdVar = new bsd();
            bsdVar.e("video/avc");
            bse bseVar = new bse(bsdVar);
            if (bseVar.q == null) {
                return 0;
            }
            List listF = cma.f(clu.a, bseVar, z, false);
            for (int i = 0; i < ((agpi) listF).d; i++) {
                if (((clo) listF.get(i)).e != null && (videoCapabilities = ((clo) listF.get(i)).e.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                    return f(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60));
                }
            }
            return 0;
        } catch (cly unused) {
            return 0;
        }
    }

    public static int f(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i = 0; i < list.size(); i++) {
            if (alj$$ExternalSyntheticApiModelOutline0.m93m(list.get(i)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }

    private static void g(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new avx(c, fArr));
    }
}
