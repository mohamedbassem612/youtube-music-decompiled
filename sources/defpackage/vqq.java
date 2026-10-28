package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vqq extends ept {
    public final vtl a;
    public final int b;

    public vqq(vtl vtlVar, int i) {
        this.a = vtlVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vqq)) {
            return false;
        }
        vqq vqqVar = (vqq) obj;
        return this.b == vqqVar.b && Objects.equals(this.a, vqqVar.a);
    }

    public final int hashCode() {
        return (this.b * 31) + Objects.hashCode(this.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, Integer.valueOf(this.b)};
        String[] strArrSplit = "offsets;pivotBarHeight".split(";");
        StringBuilder sb = new StringBuilder("vqq[");
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
