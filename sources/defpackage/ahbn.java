package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahbn implements Serializable {
    public static final ahbn a = new ahbn(new double[0]);
    private static final long serialVersionUID = 679347448744984100L;
    public final int b;
    private final double[] c;

    public ahbn(double[] dArr) {
        int length = dArr.length;
        this.c = dArr;
        this.b = length;
    }

    public static ahbn d() {
        return new ahbn(new double[]{2.0d, 2.0d, 2.0d, 2.0d});
    }

    public final double a(int i) {
        ahno.W(i, this.b);
        return this.c[i];
    }

    public final boolean b() {
        return this.b == 0;
    }

    public final double[] c() {
        return Arrays.copyOfRange(this.c, 0, this.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahbn) {
            ahbn ahbnVar = (ahbn) obj;
            int i = this.b;
            if (i == ahbnVar.b) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (Double.doubleToLongBits(a(i2)) == Double.doubleToLongBits(ahbnVar.a(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.c[i2]);
            i = (i * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i;
    }

    Object readResolve() {
        return b() ? a : this;
    }

    public final String toString() {
        if (b()) {
            return "[]";
        }
        int i = this.b;
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        double[] dArr = this.c;
        sb.append(dArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(dArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    Object writeReplace() {
        return this.b < this.c.length ? new ahbn(c()) : this;
    }
}
