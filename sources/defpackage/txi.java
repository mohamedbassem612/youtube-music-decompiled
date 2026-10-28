package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class txi extends ept {
    public final txk[] a;
    public final int[] b;

    public txi(txk[] txkVarArr, int[] iArr) {
        this.a = txkVarArr;
        this.b = iArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof txi)) {
            return false;
        }
        txi txiVar = (txi) obj;
        return Objects.equals(this.a, txiVar.a) && Objects.equals(this.b, txiVar.b);
    }

    public final int hashCode() {
        return a.B(this.a, this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "roots;undeletedItemCounts".split(";");
        StringBuilder sb = new StringBuilder("txi[");
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
