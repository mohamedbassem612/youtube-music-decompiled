package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class txa extends ept {
    public final byte[][] a;
    public final int b;

    public txa(byte[][] bArr, int i) {
        this.a = bArr;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof txa)) {
            return false;
        }
        txa txaVar = (txa) obj;
        return this.b == txaVar.b && Objects.equals(this.a, txaVar.a);
    }

    public final int hashCode() {
        return (this.b * 31) + Objects.hashCode(this.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, Integer.valueOf(this.b)};
        String[] strArrSplit = "strings;size".split(";");
        StringBuilder sb = new StringBuilder("txa[");
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
