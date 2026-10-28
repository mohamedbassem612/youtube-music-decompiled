package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nxg {
    public final float a;
    public final float b;

    public nxg(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nxg) {
            nxg nxgVar = (nxg) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(nxgVar.a)) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(nxgVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "TouchLocation{x=" + this.a + ", y=" + this.b + '}';
    }

    public nxg() {
        throw null;
    }
}
