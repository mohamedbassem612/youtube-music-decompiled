package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oyg {
    public final int a;
    public final int b;
    private final float c;
    private final float d;
    private final float e;

    public oyg(float f, int i, float f2, int i2, float f3) {
        this.c = f;
        boolean zC = c(i, f2);
        boolean zC2 = c(i2, f3);
        this.a = zC ? i : 1;
        this.d = true != zC ? 0.0f : f2;
        this.b = zC2 ? i2 : 1;
        this.e = true != zC2 ? 0.0f : f3;
    }

    private static int b(int i, float f, float f2, int i2) {
        int i3;
        if (yno.G(f) && f > 0.0f && (i3 = i - 1) != 0) {
            if (i3 == 1) {
                return Math.round(f * f2);
            }
            if (i2 > 0) {
                return Math.round(f * i2);
            }
        }
        return 0;
    }

    private static boolean c(int i, float f) {
        return i != 1 && yno.G(f) && f > 0.0f;
    }

    public final void a(int i, int[] iArr) {
        int i2 = this.a;
        float f = this.d;
        float f2 = this.c;
        iArr[0] = b(i2, f, f2, i);
        iArr[1] = b(this.b, this.e, f2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oyg) {
            oyg oygVar = (oyg) obj;
            if (Float.compare(this.c, oygVar.c) == 0 && this.a == oygVar.a && Float.compare(this.d, oygVar.d) == 0 && this.b == oygVar.b && Float.compare(this.e, oygVar.e) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.c), Integer.valueOf(this.a), Float.valueOf(this.d), Integer.valueOf(this.b), Float.valueOf(this.e));
    }
}
