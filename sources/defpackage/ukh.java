package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ukh extends ept {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ukh(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ukh)) {
            return false;
        }
        ukh ukhVar = (ukh) obj;
        return Float.compare(this.a, ukhVar.a) == 0 && Float.compare(this.b, ukhVar.b) == 0 && Float.compare(this.c, ukhVar.c) == 0 && Float.compare(this.d, ukhVar.d) == 0;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d)};
        String[] strArrSplit = "left;top;right;bottom".split(";");
        StringBuilder sb = new StringBuilder("ukh[");
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append('=');
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
