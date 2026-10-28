package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vxs {
    public final long[] a;
    public final int b;

    public vxs(long[] jArr, int i) {
        jArr.getClass();
        this.a = jArr;
        this.b = i;
        int length = jArr.length << 6;
        if (i > length) {
            throw new IllegalArgumentException(a.bQ(length, i, "size (", ") must be in 0.."));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vxs) {
            vxs vxsVar = (vxs) obj;
            if (this.b == vxsVar.b && Arrays.equals(this.a, vxsVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + this.b;
    }
}
