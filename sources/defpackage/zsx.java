package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zsx extends ept {
    public final zsw a;
    public final zsy b;

    public zsx(zsw zswVar, zsy zsyVar) {
        this.a = zswVar;
        this.b = zsyVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zsx)) {
            return false;
        }
        zsx zsxVar = (zsx) obj;
        return Objects.equals(this.a, zsxVar.a) && Objects.equals(this.b, zsxVar.b);
    }

    public final int hashCode() {
        return a.B(this.a, this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "status;whyDelete".split(";");
        StringBuilder sb = new StringBuilder("zsx[");
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
