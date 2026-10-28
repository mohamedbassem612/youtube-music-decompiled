package j$.util;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class OptionalDouble {
    public static final OptionalDouble c = new OptionalDouble();
    public final boolean a;
    public final double b;

    public OptionalDouble() {
        this.a = false;
        this.b = Double.NaN;
    }

    public static OptionalDouble empty() {
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OptionalDouble) {
            OptionalDouble optionalDouble = (OptionalDouble) obj;
            boolean z = optionalDouble.a;
            boolean z2 = this.a;
            if (z2 && z) {
                if (Double.compare(this.b, optionalDouble.b) == 0) {
                    return true;
                }
            } else if (z2 == z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public double orElse(double d) {
        return this.a ? this.b : d;
    }

    public final String toString() {
        if (!this.a) {
            return "OptionalDouble.empty";
        }
        return "OptionalDouble[" + this.b + "]";
    }

    public OptionalDouble(double d) {
        this.a = true;
        this.b = d;
    }
}
