package defpackage;

import java.math.RoundingMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahbd {
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static int a(double d, RoundingMode roundingMode) {
        int i;
        boolean zE;
        int i2 = 0;
        ahno.G(d > 0.0d && afxw.Z(d), "x must be positive and finite");
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) < -1022) {
            return a(d * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (ahbc.a[roundingMode.ordinal()]) {
            case 1:
                ahng.U(e(d));
                return exponent;
            case 2:
                return exponent;
            case 3:
                i2 = !e(d) ? 1 : 0;
                if (i2 != 0) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                i = exponent >>> 31;
                zE = e(d);
                i2 = i & (!zE);
                if (i2 != 0) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                i = (exponent ^ (-1)) >>> 31;
                zE = e(d);
                i2 = i & (!zE);
                if (i2 != 0) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x008a, please report this as an issue */
    public static long b(double d, RoundingMode roundingMode) {
        double dRint;
        long j;
        long j2;
        if (!afxw.Z(d)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (ahbc.a[roundingMode.ordinal()]) {
            case 1:
                ahng.U(d(d));
                dRint = d;
                if (((((-9.223372036854776E18d) - dRint) > 1.0d ? 1 : (((-9.223372036854776E18d) - dRint) == 1.0d ? 0 : -1)) & (dRint > 9.223372036854776E18d ? 1 : (dRint == 9.223372036854776E18d ? 0 : -1))) < 0) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + String.valueOf(roundingMode));
            case 2:
                if (d >= 0.0d || d(d)) {
                    dRint = d;
                } else {
                    j = (long) d;
                    j2 = -1;
                    dRint = j + j2;
                }
                if (((((-9.223372036854776E18d) - dRint) > 1.0d ? 1 : (((-9.223372036854776E18d) - dRint) == 1.0d ? 0 : -1)) & (dRint > 9.223372036854776E18d ? 1 : (dRint == 9.223372036854776E18d ? 0 : -1))) < 0) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + String.valueOf(roundingMode));
            case 3:
                if (d <= 0.0d || d(d)) {
                    dRint = d;
                } else {
                    j = (long) d;
                    j2 = 1;
                    dRint = j + j2;
                }
                if (((((-9.223372036854776E18d) - dRint) > 1.0d ? 1 : (((-9.223372036854776E18d) - dRint) == 1.0d ? 0 : -1)) & (dRint > 9.223372036854776E18d ? 1 : (dRint == 9.223372036854776E18d ? 0 : -1))) < 0) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + String.valueOf(roundingMode));
            case 4:
                dRint = d;
                if (((((-9.223372036854776E18d) - dRint) > 1.0d ? 1 : (((-9.223372036854776E18d) - dRint) == 1.0d ? 0 : -1)) & (dRint > 9.223372036854776E18d ? 1 : (dRint == 9.223372036854776E18d ? 0 : -1))) < 0) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + String.valueOf(roundingMode));
            case 5:
                if (d(d)) {
                    dRint = d;
                } else {
                    j = (long) d;
                    j2 = d > 0.0d ? 1 : -1;
                    dRint = j + j2;
                }
                if (((((-9.223372036854776E18d) - dRint) > 1.0d ? 1 : (((-9.223372036854776E18d) - dRint) == 1.0d ? 0 : -1)) & (dRint > 9.223372036854776E18d ? 1 : (dRint == 9.223372036854776E18d ? 0 : -1))) < 0) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + String.valueOf(roundingMode));
            case 6:
                dRint = Math.rint(d);
                if (((((-9.223372036854776E18d) - dRint) > 1.0d ? 1 : (((-9.223372036854776E18d) - dRint) == 1.0d ? 0 : -1)) & (dRint > 9.223372036854776E18d ? 1 : (dRint == 9.223372036854776E18d ? 0 : -1))) < 0) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + String.valueOf(roundingMode));
            case 7:
                dRint = Math.rint(d);
                if (Math.abs(d - dRint) == 0.5d) {
                    dRint = d + Math.copySign(0.5d, d);
                }
                if (((((-9.223372036854776E18d) - dRint) > 1.0d ? 1 : (((-9.223372036854776E18d) - dRint) == 1.0d ? 0 : -1)) & (dRint > 9.223372036854776E18d ? 1 : (dRint == 9.223372036854776E18d ? 0 : -1))) < 0) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + String.valueOf(roundingMode));
            case 8:
                dRint = Math.rint(d);
                if (Math.abs(d - dRint) == 0.5d) {
                    dRint = d;
                }
                if (((((-9.223372036854776E18d) - dRint) > 1.0d ? 1 : (((-9.223372036854776E18d) - dRint) == 1.0d ? 0 : -1)) & (dRint > 9.223372036854776E18d ? 1 : (dRint == 9.223372036854776E18d ? 0 : -1))) < 0) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + String.valueOf(roundingMode));
            default:
                throw new AssertionError();
        }
    }

    public static boolean c(double d, double d2, double d3) {
        if (d3 >= 0.0d) {
            if (Math.copySign(d - d2, 1.0d) <= d3 || d == d2) {
                return true;
            }
            return Double.isNaN(d) && Double.isNaN(d2);
        }
        throw new IllegalArgumentException("tolerance (" + d3 + ") must be >= 0");
    }

    public static boolean d(double d) {
        if (afxw.Z(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(afxw.Y(d)) <= Math.getExponent(d);
        }
        return false;
    }

    public static boolean e(double d) {
        if (d <= 0.0d || !afxw.Z(d)) {
            return false;
        }
        long jY = afxw.Y(d);
        return (jY & ((-1) + jY)) == 0;
    }

    public static int f(double d, double d2) {
        if (c(d, d2, 0.001d)) {
            return 0;
        }
        if (d < d2) {
            return -1;
        }
        if (d > d2) {
            return 1;
        }
        return Boolean.compare(Double.isNaN(d), Double.isNaN(d2));
    }
}
