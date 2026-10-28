package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vir {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final agke g;

    public vir(int i, int i2, int i3, int i4, int i5, int i6, agke agkeVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = agkeVar;
    }

    public static viq a() {
        viq viqVar = new viq();
        viqVar.d(0);
        return viqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vir) {
            vir virVar = (vir) obj;
            if (this.a == virVar.a && this.b == virVar.b && this.c == virVar.c && this.d == virVar.d && this.e == virVar.e && this.f == virVar.f && aguu.v(this.g, virVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        return "PickerPages{chipLayoutWidthId=" + this.a + ", chipLayoutHeightId=" + this.b + ", chipBorderColorId=" + this.c + ", chipBorderWidthId=" + this.d + ", chipHorizontalPaddingId=" + this.e + ", chipFooterPaddingOffsetDp=" + this.f + ", themePages=" + String.valueOf(this.g) + '}';
    }

    public vir() {
        throw null;
    }
}
