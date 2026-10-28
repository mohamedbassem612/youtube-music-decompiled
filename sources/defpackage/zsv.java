package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zsv extends ept {
    public final String a;

    public zsv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zsv) && Objects.equals(this.a, ((zsv) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a};
        String[] strArrSplit = "identityId".split(";");
        StringBuilder sb = new StringBuilder("zsv[");
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
