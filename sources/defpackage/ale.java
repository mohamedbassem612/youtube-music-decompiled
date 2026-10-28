package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ale {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ale(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ale) {
            ale aleVar = (ale) obj;
            if (Float.compare(this.a, aleVar.a) == 0 && Float.compare(this.b, aleVar.b) == 0 && Float.compare(this.c, aleVar.c) == 0 && Float.compare(this.d, aleVar.d) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        float f = this.d;
        float f2 = this.c;
        float f3 = this.b;
        return "Rect.fromLTRB(" + apb.c(this.a) + ", " + apb.c(f3) + ", " + apb.c(f2) + ", " + apb.c(f) + ')';
    }
}
