package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jqc {
    public final int[] a;
    public final float[] b;

    public jqc(int[] iArr, float[] fArr) {
        this.a = iArr;
        this.b = fArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jqc) {
            jqc jqcVar = (jqc) obj;
            if (awrc.c(this.a, jqcVar.a) && awrc.c(this.b, jqcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        float[] fArr = this.b;
        return "GradientData(colors=" + Arrays.toString(this.a) + ", positions=" + Arrays.toString(fArr) + ')';
    }
}
