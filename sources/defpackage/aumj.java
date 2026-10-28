package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aumj {
    public static final aumj a = new aumj(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final aumj b = new aumj(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final aumj c = new aumj(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final aumj d = new aumj(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;
    public final double j;
    public final double k;
    public final double l;
    public final double m;

    public aumj(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.e = d6;
        this.f = d7;
        this.g = d8;
        this.h = d2;
        this.i = d3;
        this.j = d4;
        this.k = d5;
        this.l = d9;
        this.m = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aumj aumjVar = (aumj) obj;
            if (Double.compare(aumjVar.h, this.h) == 0 && Double.compare(aumjVar.i, this.i) == 0 && Double.compare(aumjVar.j, this.j) == 0 && Double.compare(aumjVar.k, this.k) == 0 && Double.compare(aumjVar.l, this.l) == 0 && Double.compare(aumjVar.m, this.m) == 0 && Double.compare(aumjVar.e, this.e) == 0 && Double.compare(aumjVar.f, this.f) == 0 && Double.compare(aumjVar.g, this.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.e);
        long j = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f);
        long j2 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.g);
        long j3 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.h);
        long j4 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.i);
        long j5 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.j);
        long j6 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.k);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.l);
        long j7 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.m);
        return (((((((((((((((((int) j) * 31) + ((int) j2)) * 31) + ((int) j3)) * 31) + ((int) j4)) * 31) + ((int) j5)) * 31) + ((int) j6)) * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31) + ((int) j7)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(a)) {
            return "Rotate 0°";
        }
        if (equals(b)) {
            return "Rotate 90°";
        }
        if (equals(c)) {
            return "Rotate 180°";
        }
        if (equals(d)) {
            return "Rotate 270°";
        }
        double d2 = this.e;
        double d3 = this.f;
        double d4 = this.g;
        double d5 = this.h;
        double d6 = this.i;
        double d7 = this.j;
        double d8 = this.k;
        double d9 = this.l;
        double d10 = this.m;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d2);
        sb.append(", v=");
        sb.append(d3);
        sb.append(", w=");
        sb.append(d4);
        sb.append(", a=");
        sb.append(d5);
        sb.append(", b=");
        sb.append(d6);
        sb.append(", c=");
        sb.append(d7);
        sb.append(", d=");
        sb.append(d8);
        sb.append(", tx=");
        sb.append(d9);
        sb.append(", ty=");
        sb.append(d10);
        sb.append('}');
        return sb.toString();
    }
}
