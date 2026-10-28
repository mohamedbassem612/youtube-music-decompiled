package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class vml {
    public final float[] a;

    public vml(float[] fArr) {
        this.a = fArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vml)) {
            return false;
        }
        vml vmlVar = (vml) obj;
        boolean z = vmlVar instanceof vml;
        return Arrays.equals(this.a, vmlVar.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) ^ 1000003;
    }

    public final String toString() {
        return "DigitWidthSegmentTree{segmentTree=" + Arrays.toString(this.a) + '}';
    }

    public vml() {
        throw null;
    }
}
