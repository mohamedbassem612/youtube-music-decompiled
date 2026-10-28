package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tlc extends ept {
    private final String a;
    private final Class b;

    public tlc(String str, Class cls) {
        this.a = str;
        this.b = cls;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tlc)) {
            return false;
        }
        tlc tlcVar = (tlc) obj;
        return Objects.equals(this.a, tlcVar.a) && Objects.equals(this.b, tlcVar.b);
    }

    public final int hashCode() {
        return (Objects.hashCode(this.a) * 31) + Objects.hashCode(this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "cacheKey;responseClass".split(";");
        StringBuilder sb = new StringBuilder("tlc[");
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
