package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acsq extends ept implements acsu {
    public final String a;
    public final ajwo b;
    private final toe c;

    public acsq(String str, toe toeVar, ajwo ajwoVar) {
        this.a = str;
        this.c = toeVar;
        this.b = ajwoVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acsq)) {
            return false;
        }
        acsq acsqVar = (acsq) obj;
        return Objects.equals(this.a, acsqVar.a) && Objects.equals(this.c, acsqVar.c) && Objects.equals(this.b, acsqVar.b);
    }

    public final int hashCode() {
        return a.A(this.a, this.c, this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.c, this.b};
        String[] strArrSplit = "cpn;volleyError;command".split(";");
        StringBuilder sb = new StringBuilder("acsq[");
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
