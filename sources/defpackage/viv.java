package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class viv {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public viv(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof viv) {
            viv vivVar = (viv) obj;
            if (this.a == vivVar.a && this.b == vivVar.b && this.c == vivVar.c && this.d == vivVar.d && this.e == vivVar.e && this.f == vivVar.f && this.g == vivVar.g && this.h == vivVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h;
    }

    public final String toString() {
        return "Theme{primarySurface=" + this.a + ", raisedPrimarySurface=" + this.b + ", secondarySurface=" + this.c + ", primaryText=" + this.d + ", secondaryText=" + this.e + ", tertiarySurface=" + this.f + ", primaryTextHint=" + this.g + ", primaryTextCursor=" + this.h + '}';
    }

    public viv() {
        throw null;
    }
}
