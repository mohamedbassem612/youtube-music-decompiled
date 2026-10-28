package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahbo implements Serializable {
    public static final ahbo a = new ahbo(new int[0]);
    private static final long serialVersionUID = -7031592199741285664L;
    public final int b;
    private final int[] c;

    public ahbo(int[] iArr) {
        int length = iArr.length;
        this.c = iArr;
        this.b = length;
    }

    public static ahbo b(int[] iArr) {
        int length = iArr.length;
        return length == 0 ? a : new ahbo(Arrays.copyOf(iArr, length));
    }

    public static ahbo c(int i) {
        return new ahbo(new int[]{i});
    }

    public static ahbo d(int i, int i2, int i3, int i4) {
        return new ahbo(new int[]{i, i2, i3, i4});
    }

    public static ahbo h(int... iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length + 1];
        iArr2[0] = 0;
        System.arraycopy(iArr, 0, iArr2, 1, length);
        return new ahbo(iArr2);
    }

    public final int a(int i) {
        ahno.W(i, this.b);
        return this.c[i];
    }

    public final boolean e(int i) {
        int i2 = 0;
        while (i2 < this.b) {
            if (this.c[i2] == i) {
                return i2 >= 0;
            }
            i2++;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahbo) {
            ahbo ahboVar = (ahbo) obj;
            int i = this.b;
            if (i == ahboVar.b) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (a(i2) == ahboVar.a(i2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.b == 0;
    }

    public final int[] g() {
        return Arrays.copyOfRange(this.c, 0, this.b);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    Object readResolve() {
        return f() ? a : this;
    }

    public final String toString() {
        if (f()) {
            return "[]";
        }
        int i = this.b;
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.c;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    Object writeReplace() {
        return this.b < this.c.length ? new ahbo(g()) : this;
    }
}
