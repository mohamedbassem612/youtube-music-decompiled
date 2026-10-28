package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class cwi {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public cwi(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cwi cwiVar = (cwi) obj;
            if (this.a == cwiVar.a && this.c == cwiVar.c && this.d == cwiVar.d && Arrays.equals(this.b, cwiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }
}
