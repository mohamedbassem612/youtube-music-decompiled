package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aj {
    public final ahto h;
    private final ak i;
    public int a = 0;
    private int j = 8;
    public int[] b = new int[8];
    public int[] c = new int[8];
    public float[] d = new float[8];
    public int e = -1;
    public int f = -1;
    public boolean g = false;

    public aj(ak akVar, ahto ahtoVar) {
        this.i = akVar;
        this.h = ahtoVar;
    }

    public final float a(an anVar) {
        int i = this.e;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.b[i] == anVar.a) {
                return this.d[i];
            }
            i = this.c[i];
        }
        return 0.0f;
    }

    final float b(int i) {
        int i2 = this.e;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.d[i2];
            }
            i2 = this.c[i2];
        }
        return 0.0f;
    }

    public final float c(an anVar) {
        int i = this.e;
        if (i != -1) {
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.a) {
                int i4 = this.b[i];
                if (i4 == anVar.a) {
                    int i5 = this.e;
                    int[] iArr = this.c;
                    if (i == i5) {
                        this.e = iArr[i];
                    } else {
                        iArr[i3] = iArr[i];
                    }
                    ((an[]) this.h.c)[i4].a(this.i);
                    this.a--;
                    this.b[i] = -1;
                    if (this.g) {
                        this.f = i;
                    }
                    return this.d[i];
                }
                i2++;
                i3 = i;
                i = this.c[i];
            }
        }
        return 0.0f;
    }

    final an d(int i) {
        int i2 = this.e;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return ((an[]) this.h.c)[this.b[i2]];
            }
            i2 = this.c[i2];
        }
        return null;
    }

    public final void e(an anVar, float f) {
        int[] iArr;
        if (f != 0.0f) {
            int i = this.e;
            if (i == -1) {
                this.e = 0;
                this.d[0] = f;
                this.b[0] = anVar.a;
                this.c[0] = -1;
                this.a++;
                if (this.g) {
                    return;
                }
                this.f++;
                return;
            }
            int i2 = -1;
            for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
                int i4 = this.b[i];
                int i5 = anVar.a;
                if (i4 == i5) {
                    float[] fArr = this.d;
                    float f2 = fArr[i] + f;
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        int i6 = this.e;
                        int[] iArr2 = this.c;
                        if (i == i6) {
                            this.e = iArr2[i];
                        } else {
                            iArr2[i2] = iArr2[i];
                        }
                        ((an[]) this.h.c)[i4].a(this.i);
                        if (this.g) {
                            this.f = i;
                        }
                        this.a--;
                        return;
                    }
                    return;
                }
                if (i4 < i5) {
                    i2 = i;
                }
                i = this.c[i];
            }
            int length = this.f;
            int i7 = length + 1;
            if (this.g) {
                int[] iArr3 = this.b;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.b;
            int length2 = iArr4.length;
            if (length < length2 || this.a >= length2) {
                iArr = iArr4;
                break;
            }
            int i8 = 0;
            while (true) {
                iArr = this.b;
                if (i8 >= iArr.length) {
                    iArr4 = iArr;
                    iArr = iArr4;
                    break;
                } else {
                    if (iArr[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int length3 = iArr.length;
            if (length >= length3) {
                int i9 = this.j << 1;
                this.j = i9;
                this.g = false;
                this.f = length3 - 1;
                this.d = Arrays.copyOf(this.d, i9);
                this.b = Arrays.copyOf(this.b, this.j);
                this.c = Arrays.copyOf(this.c, this.j);
                length = length3;
            }
            int[] iArr5 = this.b;
            iArr5[length] = anVar.a;
            this.d[length] = f;
            int[] iArr6 = this.c;
            if (i2 != -1) {
                iArr6[length] = iArr6[i2];
                iArr6[i2] = length;
            } else {
                iArr6[length] = this.e;
                this.e = length;
            }
            this.a++;
            if (!this.g) {
                this.f++;
            }
            int i10 = this.f;
            int length4 = iArr5.length;
            if (i10 >= length4) {
                this.g = true;
                this.f = length4 - 1;
            }
        }
    }

    public final void f(an anVar, float f) {
        int[] iArr;
        if (f == 0.0f) {
            c(anVar);
            return;
        }
        int i = this.e;
        if (i == -1) {
            this.e = 0;
            this.d[0] = f;
            this.b[0] = anVar.a;
            this.c[0] = -1;
            this.a++;
            if (this.g) {
                return;
            }
            this.f++;
            return;
        }
        int i2 = -1;
        for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
            int i4 = this.b[i];
            int i5 = anVar.a;
            if (i4 == i5) {
                this.d[i] = f;
                return;
            }
            if (i4 < i5) {
                i2 = i;
            }
            i = this.c[i];
        }
        int length = this.f;
        int i6 = length + 1;
        if (this.g) {
            int[] iArr2 = this.b;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i6;
        }
        int[] iArr3 = this.b;
        int length2 = iArr3.length;
        if (length < length2 || this.a >= length2) {
            iArr = iArr3;
            break;
        }
        int i7 = 0;
        while (true) {
            iArr = this.b;
            if (i7 >= iArr.length) {
                iArr3 = iArr;
                iArr = iArr3;
                break;
            } else {
                if (iArr[i7] == -1) {
                    length = i7;
                    break;
                }
                i7++;
            }
        }
        int length3 = iArr.length;
        if (length >= length3) {
            int i8 = this.j << 1;
            this.j = i8;
            this.g = false;
            this.f = length3 - 1;
            this.d = Arrays.copyOf(this.d, i8);
            this.b = Arrays.copyOf(this.b, this.j);
            this.c = Arrays.copyOf(this.c, this.j);
            length = length3;
        }
        int[] iArr4 = this.b;
        iArr4[length] = anVar.a;
        this.d[length] = f;
        int[] iArr5 = this.c;
        if (i2 != -1) {
            iArr5[length] = iArr5[i2];
            iArr5[i2] = length;
        } else {
            iArr5[length] = this.e;
            this.e = length;
        }
        int i9 = this.a + 1;
        this.a = i9;
        if (!this.g) {
            this.f++;
        }
        if (i9 >= iArr4.length) {
            this.g = true;
        }
    }

    final void g(ak akVar, ak akVar2) {
        int i = this.e;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
                int i3 = this.b[i];
                an anVar = akVar2.a;
                if (i3 == anVar.a) {
                    float f = this.d[i];
                    c(anVar);
                    aj ajVar = akVar2.d;
                    int i4 = ajVar.e;
                    for (int i5 = 0; i4 != -1 && i5 < ajVar.a; i5++) {
                        e(((an[]) this.h.c)[ajVar.b[i4]], ajVar.d[i4] * f);
                        i4 = ajVar.c[i4];
                    }
                    akVar.b += akVar2.b * f;
                    akVar2.a.a(akVar);
                    i = this.e;
                } else {
                    i = this.c[i];
                }
            }
            return;
        }
    }

    public final String toString() {
        int i = this.e;
        String strConcat = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            String str = strConcat.concat(" -> ") + this.d[i] + " : ";
            an anVar = ((an[]) this.h.c)[this.b[i]];
            Objects.toString(anVar);
            strConcat = str.concat(String.valueOf(anVar));
            i = this.c[i];
        }
        return strConcat;
    }
}
