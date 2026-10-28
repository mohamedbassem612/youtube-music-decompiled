package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aedv {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public aedv(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static aedu a() {
        aedu aeduVar = new aedu();
        aeduVar.c = 1;
        aeduVar.d = 1;
        return aeduVar;
    }

    public static aedv b(int i, int i2) {
        aedu aeduVarA = a();
        aeduVarA.a = i;
        aeduVarA.b = i2;
        return aeduVarA.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aedv) {
            aedv aedvVar = (aedv) obj;
            int i = this.a;
            int i2 = aedvVar.a;
            if (i == 0) {
                throw null;
            }
            if (i == i2) {
                int i3 = this.b;
                int i4 = aedvVar.b;
                if (i3 == 0) {
                    throw null;
                }
                if (i3 == i4) {
                    int i5 = this.c;
                    int i6 = aedvVar.c;
                    if (i5 == 0) {
                        throw null;
                    }
                    if (i5 == i6) {
                        int i7 = this.d;
                        int i8 = aedvVar.d;
                        if (i7 == 0) {
                            throw null;
                        }
                        if (i7 == i8) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        a.bj(i);
        int i2 = this.b;
        a.bj(i2);
        int i3 = this.c;
        a.bj(i3);
        int i4 = this.d;
        a.bj(i4);
        return ((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        int i = this.a;
        String str4 = "null";
        if (i == 1) {
            str = "FONT_ROLE_DISPLAY";
        } else if (i == 2) {
            str = "FONT_ROLE_HEADLINE";
        } else if (i != 3) {
            str = i != 4 ? "null" : "FONT_ROLE_ACTION";
        } else {
            str = "FONT_ROLE_BODY";
        }
        int i2 = this.b;
        if (i2 == 1) {
            str2 = "FONT_SIZE_XS";
        } else if (i2 == 2) {
            str2 = "FONT_SIZE_S";
        } else if (i2 == 3) {
            str2 = "FONT_SIZE_M";
        } else if (i2 != 4) {
            str2 = i2 != 5 ? "null" : "FONT_SIZE_XL";
        } else {
            str2 = "FONT_SIZE_L";
        }
        int i3 = this.c;
        if (i3 != 1) {
            str3 = i3 != 2 ? "null" : "TALL";
        } else {
            str3 = "DEFAULT";
        }
        int i4 = this.d;
        if (i4 == 1) {
            str4 = "DEFAULT";
        } else if (i4 == 2) {
            str4 = "HEAVY";
        }
        return "YouTubeFontAttributes{fontRole=" + str + ", fontSize=" + str2 + ", fontLineHeight=" + str3 + ", fontWeight=" + str4 + '}';
    }

    public aedv() {
        throw null;
    }
}
