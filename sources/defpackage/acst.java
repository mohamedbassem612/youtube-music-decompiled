package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acst extends ept implements acsu {
    private final ajwo a;

    public acst(ajwo ajwoVar) {
        this.a = ajwoVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof acst) && Objects.equals(this.a, ((acst) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a};
        String[] strArrSplit = "command".split(";");
        StringBuilder sb = new StringBuilder("acst[");
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
