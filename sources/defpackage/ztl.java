package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ztl extends ept {
    public final boolean a;
    public final int b;

    public ztl(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ztl)) {
            return false;
        }
        ztl ztlVar = (ztl) obj;
        return this.a == ztlVar.a && this.b == ztlVar.b;
    }

    public final int hashCode() {
        return (a.aj(this.a) * 31) + this.b;
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Boolean.valueOf(this.a), Integer.valueOf(this.b)};
        String[] strArrSplit = "isEmpty;priority".split(";");
        StringBuilder sb = new StringBuilder("ztl[");
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
