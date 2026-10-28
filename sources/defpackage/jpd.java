package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jpd extends ept {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;

    public jpd(int i, int i2, float f, float f2, float f3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = f3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jpd)) {
            return false;
        }
        jpd jpdVar = (jpd) obj;
        return this.a == jpdVar.a && this.b == jpdVar.b && Float.compare(this.c, jpdVar.c) == 0 && Float.compare(this.d, jpdVar.d) == 0 && Float.compare(this.e, jpdVar.e) == 0;
    }

    public final int hashCode() {
        return (((((((this.a * 31) + this.b) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Integer.valueOf(this.a), Integer.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e)};
        String[] strArrSplit = "width;height;x;y;cornerRadius".split(";");
        StringBuilder sb = new StringBuilder("jpd[");
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
