package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abpb extends ept {
    public final abri a;
    public final agev b;

    public abpb(abri abriVar, agev agevVar) {
        this.a = abriVar;
        this.b = agevVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof abpb)) {
            return false;
        }
        abpb abpbVar = (abpb) obj;
        return Objects.equals(this.a, abpbVar.a) && Objects.equals(this.b, abpbVar.b);
    }

    public final int hashCode() {
        return a.B(this.a, this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "playerRequest;onesieRequest".split(";");
        StringBuilder sb = new StringBuilder("abpb[");
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
