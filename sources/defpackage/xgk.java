package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xgk extends ept {
    public final argn a;
    public final long b;
    public final String c;

    public xgk(argn argnVar, long j, String str) {
        this.a = argnVar;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xgk)) {
            return false;
        }
        xgk xgkVar = (xgk) obj;
        return this.b == xgkVar.b && Objects.equals(this.a, xgkVar.a) && Objects.equals(this.c, xgkVar.c);
    }

    public final int hashCode() {
        return (((a.ak(this.b) * 31) + Objects.hashCode(this.a)) * 31) + Objects.hashCode(this.c);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, Long.valueOf(this.b), this.c};
        String[] strArrSplit = "visualElement;timestamp;csn".split(";");
        StringBuilder sb = new StringBuilder("xgk[");
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
