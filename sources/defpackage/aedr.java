package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aedr {
    public final int a;
    public final int b;
    public final boolean c;
    private final int d;
    private final boolean e;
    private final int f;
    private final int g;
    private final String h;

    public aedr(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5, String str) {
        this.d = i;
        this.a = i2;
        this.b = i3;
        this.c = z;
        this.e = z2;
        this.f = i4;
        this.g = i5;
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aedr) {
            aedr aedrVar = (aedr) obj;
            if (this.d == aedrVar.d && this.a == aedrVar.a && this.b == aedrVar.b && this.c == aedrVar.c && this.e == aedrVar.e && this.f == aedrVar.f && this.g == aedrVar.g && awrc.c(this.h, aedrVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.h;
        return (((((((((((((this.d * 31) + this.a) * 31) + this.b) * 31) + a.aj(this.c)) * 31) + a.aj(this.e)) * 31) + this.f) * 31) + this.g) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "TypographyTokenData(attrResId=" + this.d + ", fontSizeSp=" + this.a + ", lineHeightSp=" + this.b + ", isHeavy=" + this.c + ", isTall=" + this.e + ", fontWeight=" + this.f + ", marqueeWeight=" + this.g + ", marqueeVariationSettings=" + this.h + ')';
    }
}
