package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vrq extends ept {
    public final akuj a;
    public final vro b;

    public vrq(akuj akujVar, vro vroVar) {
        this.a = akujVar;
        this.b = vroVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vrq)) {
            return false;
        }
        vrq vrqVar = (vrq) obj;
        return Objects.equals(this.a, vrqVar.a) && Objects.equals(this.b, vrqVar.b);
    }

    public final int hashCode() {
        return a.B(this.a, this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "model;content".split(";");
        StringBuilder sb = new StringBuilder("vrq[");
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
