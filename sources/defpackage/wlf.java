package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wlf extends ept {
    public static final wlf a = new wlf(null);
    public final wle b;

    public wlf(wle wleVar) {
        this.b = wleVar;
    }

    public static wlf t(String str) {
        return new wlf(new wle(2, str));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wlf) && Objects.equals(this.b, ((wlf) obj).b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.b};
        String[] strArrSplit = "failure".split(";");
        StringBuilder sb = new StringBuilder("wlf[");
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

    private wlf() {
        throw null;
    }
}
