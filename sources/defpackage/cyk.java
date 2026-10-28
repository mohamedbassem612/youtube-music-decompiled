package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cyk extends cyh {
    public final int a;
    public final int b;
    public final int c;
    public final int[] d;
    public final int[] e;

    public cyk(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
        this.e = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cyk cykVar = (cyk) obj;
            if (this.a == cykVar.a && this.b == cykVar.b && this.c == cykVar.c && Arrays.equals(this.d, cykVar.d) && Arrays.equals(this.e, cykVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e);
    }
}
