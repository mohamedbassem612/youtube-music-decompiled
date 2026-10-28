package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ogg {
    public final double a;
    public final double b;
    public final double c;
    public final Integer d;
    public final agke e;
    private final double f;
    private final double g;
    private final double h;
    private final double i;
    private final double j;
    private final double k;
    private final Rect l;
    private final Rect m;

    public ogg(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, Rect rect, Rect rect2, Integer num, agke agkeVar) {
        this.a = d;
        this.f = d2;
        this.g = d3;
        this.b = d4;
        this.h = d5;
        this.i = d6;
        this.c = d7;
        this.j = d8;
        this.k = d9;
        this.l = rect;
        this.m = rect2;
        this.d = num;
        this.e = agkeVar;
    }

    static ogf a() {
        ogf ogfVar = new ogf();
        ogfVar.b(-1.0d);
        ogfVar.c(-1.0d);
        ogfVar.f(-1.0d);
        ogfVar.k(-1.0d);
        ogfVar.e(-1.0d);
        ogfVar.h(-1.0d);
        ogfVar.j(-1.0d);
        ogfVar.d(-1.0d);
        ogfVar.g(-1.0d);
        ogfVar.i(agke.u(0L, 0L, 0L, 0L, 0L));
        return ogfVar;
    }

    private static Double[] g(double d, double d2, double d3) {
        return (d == d2 && d3 == d2) ? new Double[]{Double.valueOf(d2)} : new Double[]{Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3)};
    }

    public final Double[] b() {
        return g(this.g, this.a, this.f);
    }

    public final Double[] c() {
        return g(this.k, this.c, this.j);
    }

    public final Double[] d() {
        return g(this.i, this.b, this.h);
    }

    public final Integer[] e() {
        Rect rect = this.m;
        if (rect != null) {
            return new Integer[]{Integer.valueOf(rect.top), Integer.valueOf(rect.left), Integer.valueOf(rect.bottom), Integer.valueOf(rect.right)};
        }
        return null;
    }

    public final boolean equals(Object obj) {
        Rect rect;
        Rect rect2;
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ogg) {
            ogg oggVar = (ogg) obj;
            if (Double.doubleToLongBits(this.a) == Double.doubleToLongBits(oggVar.a)) {
                if (Double.doubleToLongBits(this.f) == Double.doubleToLongBits(oggVar.f)) {
                    if (Double.doubleToLongBits(this.g) == Double.doubleToLongBits(oggVar.g)) {
                        if (Double.doubleToLongBits(this.b) == Double.doubleToLongBits(oggVar.b)) {
                            if (Double.doubleToLongBits(this.h) == Double.doubleToLongBits(oggVar.h)) {
                                if (Double.doubleToLongBits(this.i) == Double.doubleToLongBits(oggVar.i)) {
                                    if (Double.doubleToLongBits(this.c) == Double.doubleToLongBits(oggVar.c)) {
                                        if (Double.doubleToLongBits(this.j) == Double.doubleToLongBits(oggVar.j)) {
                                            if (Double.doubleToLongBits(this.k) == Double.doubleToLongBits(oggVar.k) && ((rect = this.l) != null ? rect.equals(oggVar.l) : oggVar.l == null) && ((rect2 = this.m) != null ? rect2.equals(oggVar.m) : oggVar.m == null) && ((num = this.d) != null ? num.equals(oggVar.d) : oggVar.d == null) && aguu.v(this.e, oggVar.e)) {
                                                return true;
                                            }
                                        }
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

    public final Integer[] f() {
        Rect rect = this.l;
        return rect != null ? new Integer[]{Integer.valueOf(rect.top), Integer.valueOf(rect.left), Integer.valueOf(rect.bottom), Integer.valueOf(rect.right)} : new Integer[]{0, 0, 0, 0};
    }

    public final int hashCode() {
        double d = this.a;
        long jDoubleToLongBits = (Double.doubleToLongBits(d) >>> 32) ^ Double.doubleToLongBits(d);
        double d2 = this.f;
        long jDoubleToLongBits2 = (Double.doubleToLongBits(d2) >>> 32) ^ Double.doubleToLongBits(d2);
        double d3 = this.g;
        long jDoubleToLongBits3 = (Double.doubleToLongBits(d3) >>> 32) ^ Double.doubleToLongBits(d3);
        double d4 = this.b;
        long jDoubleToLongBits4 = (Double.doubleToLongBits(d4) >>> 32) ^ Double.doubleToLongBits(d4);
        double d5 = this.h;
        long jDoubleToLongBits5 = (Double.doubleToLongBits(d5) >>> 32) ^ Double.doubleToLongBits(d5);
        double d6 = this.i;
        long jDoubleToLongBits6 = (Double.doubleToLongBits(d6) >>> 32) ^ Double.doubleToLongBits(d6);
        double d7 = this.c;
        long jDoubleToLongBits7 = (Double.doubleToLongBits(d7) >>> 32) ^ Double.doubleToLongBits(d7);
        double d8 = this.j;
        long jDoubleToLongBits8 = (Double.doubleToLongBits(d8) >>> 32) ^ Double.doubleToLongBits(d8);
        double d9 = this.k;
        long jDoubleToLongBits9 = (Double.doubleToLongBits(d9) >>> 32) ^ Double.doubleToLongBits(d9);
        Rect rect = this.l;
        int iHashCode = rect == null ? 0 : rect.hashCode();
        int i = (int) jDoubleToLongBits;
        int i2 = (int) jDoubleToLongBits2;
        int i3 = (int) jDoubleToLongBits3;
        int i4 = (int) jDoubleToLongBits4;
        int i5 = (int) jDoubleToLongBits5;
        int i6 = (int) jDoubleToLongBits6;
        int i7 = (int) jDoubleToLongBits7;
        int i8 = (int) jDoubleToLongBits8;
        int i9 = (int) jDoubleToLongBits9;
        Rect rect2 = this.m;
        int iHashCode2 = rect2 == null ? 0 : rect2.hashCode();
        int i10 = ((((((((((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ i6) * 1000003) ^ i7) * 1000003) ^ i8) * 1000003) ^ i9) * 1000003) ^ iHashCode;
        Integer num = this.d;
        return (((((i10 * 1000003) ^ iHashCode2) * 1000003) ^ (num != null ? num.hashCode() : 0)) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        agke agkeVar = this.e;
        Rect rect = this.m;
        return "QuartileSnapshot{exposure=" + this.a + ", maxExposure=" + this.f + ", minExposure=" + this.g + ", volume=" + this.b + ", maxVolume=" + this.h + ", minVolume=" + this.i + ", screenShare=" + this.c + ", maxScreenShare=" + this.j + ", minScreenShare=" + this.k + ", position=" + String.valueOf(this.l) + ", containerPosition=" + String.valueOf(rect) + ", instantaneousState=" + this.d + ", mtosBuckets=" + String.valueOf(agkeVar) + '}';
    }

    public ogg() {
        throw null;
    }
}
