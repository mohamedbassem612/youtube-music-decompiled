package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xct {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    private final Integer f;
    private final Integer g;
    private final boolean h = true;

    public xct(int i, int i2, int i3, int i4, Integer num, int i5, Integer num2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.f = num;
        this.e = i5;
        this.g = num2;
    }

    public final Optional a() {
        return Optional.ofNullable(this.f);
    }

    public final Optional b() {
        return Optional.ofNullable(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xct) {
            xct xctVar = (xct) obj;
            if (this.a == xctVar.a && this.b == xctVar.b && this.c == xctVar.c && this.d == xctVar.d && awrc.c(this.f, xctVar.f) && this.e == xctVar.e && awrc.c(this.g, xctVar.g)) {
                boolean z = xctVar.h;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f;
        int iHashCode = num == null ? 0 : num.hashCode();
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        Integer num2 = this.g;
        return (((((((((((((i * 31) + i2) * 31) + i3) * 31) + i4) * 31) + iHashCode) * 31) + i5) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + 1231;
    }

    public final String toString() {
        return "PollChoiceAnimationColors(baseTextColor=" + this.a + ", selectedEmptyDrawableColor=" + this.b + ", selectedFullDrawableColor=" + this.c + ", selectedResultTextColor=" + this.d + ", unselectedFullDrawableColor=" + this.f + ", unselectedResultTextColor=" + this.e + ", unselectedStrokeColor=" + this.g + ", shouldSetSelectedEmptyDrawableColor=true)";
    }
}
