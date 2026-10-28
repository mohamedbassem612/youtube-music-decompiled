package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahbp implements Serializable {
    public static final ahbp a = new ahbp(new long[0]);
    private static final long serialVersionUID = 6402900342693743567L;
    public final int b;
    private final long[] c;

    public ahbp(long[] jArr, int i) {
        this.c = jArr;
        this.b = i;
    }

    public static zh c(int i) {
        ahno.I(true, "Invalid initialCapacity: %s", i);
        return new zh(i, (byte[]) null);
    }

    public final long a(int i) {
        ahno.W(i, this.b);
        return this.c[i];
    }

    public final boolean b() {
        return this.b == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahbp) {
            ahbp ahbpVar = (ahbp) obj;
            int i = this.b;
            if (i == ahbpVar.b) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (a(i2) == ahbpVar.a(i2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iAk = 1;
        for (int i = 0; i < this.b; i++) {
            iAk = (iAk * 31) + a.ak(this.c[i]);
        }
        return iAk;
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
        long[] jArr = this.c;
        sb.append(jArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(jArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    Object writeReplace() {
        long[] jArr = this.c;
        int i = this.b;
        return i < jArr.length ? new ahbp(Arrays.copyOfRange(jArr, 0, i)) : this;
    }

    private ahbp(long[] jArr) {
        this(jArr, jArr.length);
    }
}
