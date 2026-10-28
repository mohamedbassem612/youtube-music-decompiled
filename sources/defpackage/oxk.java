package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oxk extends ept {
    public final String a;
    public final int b;
    public final boolean c;

    public oxk(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oxk)) {
            return false;
        }
        oxk oxkVar = (oxk) obj;
        return this.c == oxkVar.c && this.b == oxkVar.b && Objects.equals(this.a, oxkVar.a);
    }

    public final int hashCode() {
        return (((a.aj(this.c) * 31) + this.b) * 31) + Objects.hashCode(this.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c)};
        String[] strArrSplit = "family;weight;italic".split(";");
        StringBuilder sb = new StringBuilder("oxk[");
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
