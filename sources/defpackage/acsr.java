package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acsr extends ept implements acsu {
    public final ajwo a;

    public acsr(ajwo ajwoVar) {
        this.a = ajwoVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof acsr) && Objects.equals(this.a, ((acsr) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a};
        String[] strArrSplit = "requestEndpoint".split(";");
        StringBuilder sb = new StringBuilder("acsr[");
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
