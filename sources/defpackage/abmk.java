package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abmk extends ept {
    public final acex a;
    public final abmj b;

    public abmk(acex acexVar, abmj abmjVar) {
        this.a = acexVar;
        this.b = abmjVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof abmk)) {
            return false;
        }
        abmk abmkVar = (abmk) obj;
        return Objects.equals(this.a, abmkVar.a) && Objects.equals(this.b, abmkVar.b);
    }

    public final int hashCode() {
        return a.B(this.a, this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "queueVideoParameters;queueVideoCallback".split(";");
        StringBuilder sb = new StringBuilder("abmk[");
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
