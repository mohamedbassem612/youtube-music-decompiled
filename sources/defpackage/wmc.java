package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wmc extends ept {
    public final zwa a;
    public final String b;

    public wmc(zwa zwaVar, String str) {
        this.a = zwaVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wmc)) {
            return false;
        }
        wmc wmcVar = (wmc) obj;
        return Objects.equals(this.a, wmcVar.a) && Objects.equals(this.b, wmcVar.b);
    }

    public final int hashCode() {
        return a.B(this.a, this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "identity;serviceName".split(";");
        StringBuilder sb = new StringBuilder("wmc[");
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
