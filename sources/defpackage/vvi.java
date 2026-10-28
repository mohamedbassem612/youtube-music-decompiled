package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vvi extends ept {
    public final String a;
    public final adxd b;

    public vvi(String str, adxd adxdVar) {
        this.a = str;
        this.b = adxdVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vvi)) {
            return false;
        }
        vvi vviVar = (vvi) obj;
        return Objects.equals(this.a, vviVar.a) && Objects.equals(this.b, vviVar.b);
    }

    public final int hashCode() {
        return a.B(this.a, this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "uuid;state".split(";");
        StringBuilder sb = new StringBuilder("vvi[");
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
