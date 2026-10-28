package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bru {
    public static final bru a = new bru(1, 2, 3, null, -1, -1);
    public final int b;
    public final int c;
    public final int d;
    public final byte[] e;
    public final int f;
    public final int g;
    private int h;

    static {
        int i = bwp.a;
    }

    public bru(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = bArr;
        this.f = i4;
        this.g = i5;
    }

    public static int a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i) {
        if (i != 1) {
            if (i == 4) {
                return 10;
            }
            if (i == 13) {
                return 2;
            }
            if (i == 16) {
                return 6;
            }
            if (i == 18) {
                return 7;
            }
            if (i != 6 && i != 7) {
                return -1;
            }
        }
        return 3;
    }

    public static String c(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i != 1) {
            return i != 2 ? a.bR(i, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    public static String d(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i != 1) {
            return i != 2 ? a.bR(i, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    public static String e(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i != 6) {
            return i != 7 ? a.bR(i, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    public static boolean h(bru bruVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (bruVar == null) {
            return true;
        }
        int i5 = bruVar.b;
        return (i5 == -1 || i5 == 1 || i5 == 2) && ((i = bruVar.c) == -1 || i == 2) && (((i2 = bruVar.d) == -1 || i2 == 3) && bruVar.e == null && (((i3 = bruVar.g) == -1 || i3 == 8) && ((i4 = bruVar.f) == -1 || i4 == 8)));
    }

    public static boolean i(bru bruVar) {
        if (bruVar == null) {
            return false;
        }
        int i = bruVar.d;
        return i == 7 || i == 6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bru bruVar = (bru) obj;
            if (this.b == bruVar.b && this.c == bruVar.c && this.d == bruVar.d && Arrays.equals(this.e, bruVar.e) && this.f == bruVar.f && this.g == bruVar.g) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return (this.f == -1 || this.g == -1) ? false : true;
    }

    public final boolean g() {
        return (this.b == -1 || this.c == -1 || this.d == -1) ? false : true;
    }

    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((this.b + 527) * 31) + this.c) * 31) + this.d) * 31) + Arrays.hashCode(this.e)) * 31) + this.f) * 31) + this.g;
        this.h = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str;
        int i = this.f;
        int i2 = this.d;
        int i3 = this.c;
        String strD = d(this.b);
        String strC = c(i3);
        String strE = e(i2);
        String str2 = "NA";
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        int i4 = this.g;
        if (i4 != -1) {
            str2 = i4 + "bit Chroma";
        }
        return "ColorInfo(" + strD + ", " + strC + ", " + strE + ", " + (this.e != null) + ", " + str + ", " + str2 + ')';
    }
}
