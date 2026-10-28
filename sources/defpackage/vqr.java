package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vqr extends ept {
    public final vtl a;
    public final vun b;
    public final int c;

    public vqr(vtl vtlVar, vun vunVar, int i) {
        this.a = vtlVar;
        this.b = vunVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vqr)) {
            return false;
        }
        vqr vqrVar = (vqr) obj;
        return this.c == vqrVar.c && Objects.equals(this.a, vqrVar.a) && Objects.equals(this.b, vqrVar.b);
    }

    public final int hashCode() {
        return (((this.c * 31) + Objects.hashCode(this.a)) * 31) + Objects.hashCode(this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, Integer.valueOf(this.c)};
        String[] strArrSplit = "offsets;state;pivotBarHeight".split(";");
        StringBuilder sb = new StringBuilder("vqr[");
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
