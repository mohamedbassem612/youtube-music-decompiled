package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class emd implements emw {
    private int a;

    public emd(int i) {
        this.a = i;
    }

    @Override // defpackage.emw
    public final /* bridge */ /* synthetic */ Object a(emz emzVar, float f) {
        int i;
        float[] fArrCopyOf;
        int iArgb;
        int i2;
        float f2;
        int iArgb2;
        float f3;
        float f4;
        ArrayList arrayList = new ArrayList();
        int iP = emzVar.p();
        int i3 = 1;
        if (iP == 1) {
            emzVar.g();
        }
        while (emzVar.n()) {
            arrayList.add(Float.valueOf((float) emzVar.a()));
        }
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.a = 2;
        }
        if (iP == 1) {
            emzVar.i();
        }
        int size = this.a;
        if (size == -1) {
            size = arrayList.size() / 4;
            this.a = size;
        }
        float[] fArr = new float[size];
        int[] iArr = new int[size];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = this.a << 2;
            if (i4 >= i) {
                break;
            }
            int i7 = i4 / 4;
            double dFloatValue = ((Float) arrayList.get(i4)).floatValue();
            int i8 = i4 % 4;
            if (i8 == 0) {
                float f5 = (float) dFloatValue;
                if (i7 <= 0 || fArr[i7 - 1] < f5) {
                    fArr[i7] = f5;
                } else {
                    fArr[i7] = f5 + 0.01f;
                }
            } else if (i8 == 1) {
                i5 = (int) (dFloatValue * 255.0d);
            } else if (i8 == 2) {
                i6 = (int) (dFloatValue * 255.0d);
            } else if (i8 == 3) {
                iArr[i7] = Color.argb(255, i5, i6, (int) (dFloatValue * 255.0d));
            }
            i4++;
        }
        eko ekoVar = new eko(fArr, iArr);
        if (arrayList.size() <= i) {
            return ekoVar;
        }
        float[] fArr2 = ekoVar.a;
        int[] iArr2 = ekoVar.b;
        int size2 = (arrayList.size() - i) / 2;
        float[] fArr3 = new float[size2];
        float[] fArr4 = new float[size2];
        int i9 = 0;
        while (i < arrayList.size()) {
            if (i % 2 == 0) {
                fArr3[i9] = ((Float) arrayList.get(i)).floatValue();
            } else {
                fArr4[i9] = ((Float) arrayList.get(i)).floatValue();
                i9++;
            }
            i++;
        }
        int length = fArr2.length;
        if (length == 0) {
            fArrCopyOf = fArr3;
        } else if (size2 == 0) {
            fArrCopyOf = fArr2;
        } else {
            int i10 = length + size2;
            fArrCopyOf = new float[i10];
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                float f6 = i12 < fArr2.length ? fArr2[i12] : Float.NaN;
                float f7 = i13 < size2 ? fArr3[i13] : Float.NaN;
                if (Float.isNaN(f7) || f6 < f7) {
                    fArrCopyOf[i14] = f6;
                    i12++;
                } else {
                    i13++;
                    if (Float.isNaN(f6) || f7 < f6) {
                        fArrCopyOf[i14] = f7;
                    } else {
                        i12++;
                        fArrCopyOf[i14] = f6;
                        i11++;
                    }
                }
            }
            if (i11 != 0) {
                fArrCopyOf = Arrays.copyOf(fArrCopyOf, i10 - i11);
            }
        }
        int length2 = fArrCopyOf.length;
        int[] iArr3 = new int[length2];
        int i15 = 0;
        while (i15 < length2) {
            float f8 = fArrCopyOf[i15];
            int iBinarySearch = Arrays.binarySearch(fArr2, f8);
            int iBinarySearch2 = Arrays.binarySearch(fArr3, f8);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f9 = fArr4[iBinarySearch2];
                if (iArr2.length < 2 || f8 == fArr2[0]) {
                    iArgb = iArr2[0];
                } else {
                    int i16 = 1;
                    while (true) {
                        int length3 = fArr2.length;
                        if (i16 >= length3) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        i2 = length3 - 1;
                        f2 = fArr2[i16];
                        if (f2 >= f8 || i16 == i2) {
                            break;
                        }
                        i16++;
                    }
                    int i17 = (int) (f9 * 255.0f);
                    if (i16 != i2 || f8 < f2) {
                        int i18 = i16 - 1;
                        float f10 = fArr2[i18];
                        int iD = qa.D((f8 - f10) / (f2 - f10), iArr2[i18], iArr2[i16]);
                        iArgb = Color.argb(i17, Color.red(iD), Color.green(iD), Color.blue(iD));
                    } else {
                        iArgb = Color.argb(i17, Color.red(iArr2[i16]), Color.green(iArr2[i16]), Color.blue(iArr2[i16]));
                    }
                }
                iArr3[i15] = iArgb;
            } else {
                int i19 = iArr2[iBinarySearch];
                if (size2 < 2 || f8 <= fArr3[0]) {
                    iArgb2 = Color.argb((int) (fArr4[0] * 255.0f), Color.red(i19), Color.green(i19), Color.blue(i19));
                } else {
                    int i20 = i3;
                    while (true) {
                        if (i20 >= size2) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f3 = fArr3[i20];
                        if (f3 >= f8 || i20 == size2 - 1) {
                            break;
                        }
                        i20++;
                    }
                    if (f3 <= f8) {
                        f4 = fArr4[i20];
                    } else {
                        int i21 = i20 - 1;
                        float f11 = fArr3[i21];
                        float f12 = f3 - f11;
                        float f13 = f8 - f11;
                        float f14 = fArr4[i21];
                        float f15 = fArr4[i20];
                        int i22 = enh.a;
                        f4 = f14 + ((f13 / f12) * (f15 - f14));
                    }
                    iArgb2 = Color.argb((int) (f4 * 255.0f), Color.red(i19), Color.green(i19), Color.blue(i19));
                }
                iArr3[i15] = iArgb2;
            }
            i15++;
            i3 = 1;
        }
        return new eko(fArrCopyOf, iArr3);
    }
}
