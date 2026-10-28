package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class txj extends ept {
    public final int a;
    public final txb b;

    public txj(int i, txb txbVar) {
        this.a = i;
        this.b = txbVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof txj)) {
            return false;
        }
        txj txjVar = (txj) obj;
        return this.a == txjVar.a && Objects.equals(this.b, txjVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + Objects.hashCode(this.b);
    }

    final boolean t() {
        return this.b == txb.a;
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Integer.valueOf(this.a), this.b};
        String[] strArrSplit = "countUndeletedItems;result".split(";");
        StringBuilder sb = new StringBuilder("txj[");
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
