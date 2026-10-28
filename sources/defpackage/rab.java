package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rab {
    public final String a;
    public final float b;
    public final float c;
    public final float d;

    public rab(String str, float f, float f2, float f3) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rab) {
            rab rabVar = (rab) obj;
            if (this.a.equals(rabVar.a)) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(rabVar.b)) {
                    if (Float.floatToIntBits(this.c) == Float.floatToIntBits(rabVar.c)) {
                        if (Float.floatToIntBits(this.d) == Float.floatToIntBits(rabVar.d)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "ControlInputValues{name=" + this.a + ", defaultValue=" + this.b + ", minValue=" + this.c + ", maxValue=" + this.d + '}';
    }

    public rab() {
        throw null;
    }
}
