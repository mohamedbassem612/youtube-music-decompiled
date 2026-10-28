package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aecc {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;

    public aecc(int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = f;
        this.h = f2;
        this.i = f3;
        this.j = f4;
        this.k = f5;
        this.l = f6;
    }

    public static aecb a() {
        aecb aecbVar = new aecb();
        aecbVar.k(0);
        aecbVar.e(0);
        aecbVar.i(0);
        aecbVar.g(0);
        aecbVar.m(0);
        aecbVar.c(0);
        aecbVar.j(0.0f);
        aecbVar.d(0.0f);
        aecbVar.h(0.0f);
        aecbVar.f(0.0f);
        aecbVar.l(0.0f);
        aecbVar.b(0.0f);
        return aecbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aecc) {
            aecc aeccVar = (aecc) obj;
            if (this.a == aeccVar.a && this.b == aeccVar.b && this.c == aeccVar.c && this.d == aeccVar.d && this.e == aeccVar.e && this.f == aeccVar.f) {
                if (Float.floatToIntBits(this.g) == Float.floatToIntBits(aeccVar.g)) {
                    if (Float.floatToIntBits(this.h) == Float.floatToIntBits(aeccVar.h)) {
                        if (Float.floatToIntBits(this.i) == Float.floatToIntBits(aeccVar.i)) {
                            if (Float.floatToIntBits(this.j) == Float.floatToIntBits(aeccVar.j)) {
                                if (Float.floatToIntBits(this.k) == Float.floatToIntBits(aeccVar.k)) {
                                    if (Float.floatToIntBits(this.l) == Float.floatToIntBits(aeccVar.l)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ Float.floatToIntBits(this.g)) * 1000003) ^ Float.floatToIntBits(this.h)) * 1000003) ^ Float.floatToIntBits(this.i)) * 1000003) ^ Float.floatToIntBits(this.j)) * 1000003) ^ Float.floatToIntBits(this.k)) * 1000003) ^ Float.floatToIntBits(this.l);
    }

    public final String toString() {
        return "ContainerSpacingConfiguration{containerMarginTopPx=" + this.a + ", containerMarginBottomPx=" + this.b + ", containerMarginStartPx=" + this.c + ", containerMarginEndPx=" + this.d + ", rowGapPx=" + this.e + ", columnGapPx=" + this.f + ", containerMarginTopDp=" + this.g + ", containerMarginBottomDp=" + this.h + ", containerMarginStartDp=" + this.i + ", containerMarginEndDp=" + this.j + ", rowGapDp=" + this.k + ", columnGapDp=" + this.l + '}';
    }

    public aecc() {
        throw null;
    }
}
