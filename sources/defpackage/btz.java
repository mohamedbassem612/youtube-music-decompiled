package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class btz {
    public static final btz a = new btz(0, 0, 1.0f);
    public final int b;
    public final int c;
    public final float d;

    static {
        int i = bwp.a;
    }

    public btz(int i, int i2, float f) {
        this.b = i;
        this.c = i2;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof btz) {
            btz btzVar = (btz) obj;
            if (this.b == btzVar.b && this.c == btzVar.c && this.d == btzVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b + 217) * 31) + this.c) * 31) + Float.floatToIntBits(this.d);
    }
}
