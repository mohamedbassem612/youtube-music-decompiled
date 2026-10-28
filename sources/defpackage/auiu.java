package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class auiu {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    private final int i;
    private final int j;

    public auiu(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof auiu) {
            auiu auiuVar = (auiu) obj;
            if (this.a == auiuVar.a && this.b == auiuVar.b && this.c == auiuVar.c && this.d == auiuVar.d && this.e == auiuVar.e && this.f == auiuVar.f && this.g == auiuVar.g && this.h == auiuVar.h && this.i == auiuVar.i && this.j == auiuVar.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j;
    }

    public final String toString() {
        return "Palette{section1Color=" + this.a + ", section2Color=" + this.b + ", section3Color=" + this.c + ", section4Color=" + this.d + ", primaryTextColor=" + this.e + ", bodyTextColor=" + this.f + ", activeIconColor=" + this.g + ", inactiveIconColor=" + this.h + ", disabledIconColor=" + this.i + ", surgeColor=" + this.j + '}';
    }

    public auiu() {
        throw null;
    }
}
