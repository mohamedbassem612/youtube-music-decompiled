package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acsp extends ept implements acsu {
    public final ajwo a;
    public final alqc b;

    public acsp(ajwo ajwoVar, alqc alqcVar) {
        this.a = ajwoVar;
        this.b = alqcVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acsp)) {
            return false;
        }
        acsp acspVar = (acsp) obj;
        return Objects.equals(this.a, acspVar.a) && Objects.equals(this.b, acspVar.b);
    }

    public final int hashCode() {
        return a.B(this.a, this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "requestEndpoint;response".split(";");
        StringBuilder sb = new StringBuilder("acsp[");
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
