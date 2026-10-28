package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fyr implements fyy {
    public final Double a;

    public fyr(Double d) {
        this.a = d == null ? Double.valueOf(Double.NaN) : d;
    }

    @Override // defpackage.fyy
    public final fyy d() {
        return new fyr(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fyr) {
            return this.a.equals(((fyr) obj).a);
        }
        return false;
    }

    @Override // defpackage.fyy
    public final Boolean g() {
        Double d = this.a;
        boolean z = false;
        if (!Double.isNaN(d.doubleValue()) && d.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.fyy
    public final fyy gR(String str, kwq kwqVar, List list) {
        if ("toString".equals(str)) {
            return new fzb(i());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", i(), str));
    }

    @Override // defpackage.fyy
    public final Double h() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.fyy
    public final String i() {
        Double d = this.a;
        if (Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d.doubleValue())) {
            return d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d.doubleValue());
        BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i = Integer.parseInt(str.substring(iIndexOf + 1));
        return (i >= 0 ? i >= 21 : i <= -7) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    @Override // defpackage.fyy
    public final Iterator l() {
        return null;
    }

    public final String toString() {
        return i();
    }
}
