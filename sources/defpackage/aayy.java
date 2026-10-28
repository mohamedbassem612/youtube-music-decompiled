package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aayy extends ept {
    public final boolean a;

    public aayy(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aayy) && this.a == ((aayy) obj).a;
    }

    public final int hashCode() {
        return a.aj(this.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Boolean.valueOf(this.a)};
        String[] strArrSplit = "skipSilenceEnabled".split(";");
        StringBuilder sb = new StringBuilder("aayy[");
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
