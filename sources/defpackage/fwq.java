package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fwq {
    public final float a;
    public final int b;

    public fwq(float f, int i) {
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                i2 = 3;
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalArgumentException(a.bR(i, "Unknown enum value: "));
                    }
                    i2 = 4;
                }
            } else {
                i2 = 2;
            }
        }
        this.a = f;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fwq)) {
            return false;
        }
        fwq fwqVar = (fwq) obj;
        int i = this.b;
        if (i == fwqVar.b) {
            return i == 1 || i == 4 || Float.compare(this.a, fwqVar.a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a) + (this.b - 1);
    }

    public final String toString() {
        int i = this.b - 1;
        if (i == 0) {
            return "undefined";
        }
        if (i == 1) {
            return Float.toString(this.a);
        }
        if (i != 2) {
            return "auto";
        }
        float f = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append(f);
        sb.append('%');
        return sb.toString();
    }
}
