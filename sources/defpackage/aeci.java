package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeci {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final amjy i;
    public final aecc j;
    public final int k;
    public final int l;
    private final int m;

    public aeci(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, amjy amjyVar, aecc aeccVar) {
        this.a = z;
        this.k = i;
        this.l = i2;
        this.b = i3;
        this.c = i4;
        this.m = i5;
        this.d = i6;
        this.e = i7;
        this.f = i8;
        this.g = i9;
        this.h = i10;
        if (amjyVar == null) {
            throw new NullPointerException("Null spacingConfigurationDp");
        }
        this.i = amjyVar;
        this.j = aeccVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeci) {
            aeci aeciVar = (aeci) obj;
            if (this.a == aeciVar.a && this.k == aeciVar.k && this.l == aeciVar.l && this.b == aeciVar.b && this.c == aeciVar.c && this.m == aeciVar.m && this.d == aeciVar.d && this.e == aeciVar.e && this.f == aeciVar.f && this.g == aeciVar.g && this.h == aeciVar.h && this.i.equals(aeciVar.i) && this.j.equals(aeciVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.a;
        int iHashCode = this.i.hashCode();
        int i = true != z ? 1237 : 1231;
        int i2 = this.k;
        int i3 = this.c;
        int i4 = this.m;
        int i5 = this.d;
        int i6 = this.e;
        int i7 = this.f;
        return ((((((((((((((((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ this.l) * 1000003) ^ this.b) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ i6) * 1000003) ^ i7) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ iHashCode) * 1000003) ^ this.j.hashCode();
    }

    public final String toString() {
        int i = this.l;
        amjy amjyVar = this.i;
        return "ResponsiveContainerProperties{usingResponsiveContainerConfiguration=" + this.a + ", containerSizeClassification=" + Integer.toString(this.k - 1) + ", containerType=" + Integer.toString(i - 1) + ", maxWidthPx=" + this.b + ", maxHeightPx=" + this.c + ", containerMaxWidthDp=" + this.m + ", minColumnSizePx=" + this.d + ", columnMultiplier=" + this.e + ", columnAdder=" + this.f + ", minColumnCount=" + this.g + ", maxColumnCount=" + this.h + ", spacingConfigurationDp=" + amjyVar.toString() + ", containerSpacingConfigurationPx=" + this.j.toString() + '}';
    }

    public aeci() {
        throw null;
    }
}
