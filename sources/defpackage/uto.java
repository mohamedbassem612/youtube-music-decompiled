package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uto extends ept {
    public final String a;
    public final aigu b;

    public uto(String str, aigu aiguVar) {
        this.a = str;
        this.b = aiguVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uto)) {
            return false;
        }
        uto utoVar = (uto) obj;
        return Objects.equals(this.a, utoVar.a) && Objects.equals(this.b, utoVar.b);
    }

    public final int hashCode() {
        return a.B(this.a, this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "uri;sourceStartTime".split(";");
        StringBuilder sb = new StringBuilder("uto[");
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
