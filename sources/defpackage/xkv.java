package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xkv extends ept {
    public final boolean a;
    public final boolean b;

    public xkv(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xkv)) {
            return false;
        }
        xkv xkvVar = (xkv) obj;
        return this.a == xkvVar.a && this.b == xkvVar.b;
    }

    public final int hashCode() {
        return (a.aj(this.a) * 31) + a.aj(this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Boolean.valueOf(this.a), Boolean.valueOf(this.b)};
        String[] strArrSplit = "isAccountChildUnder13;isAccountEduChild".split(";");
        StringBuilder sb = new StringBuilder("xkv[");
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
