package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uqw extends ept {
    private final boolean a = false;

    public final boolean equals(Object obj) {
        if (!(obj instanceof uqw)) {
            return false;
        }
        boolean z = ((uqw) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Boolean.FALSE};
        String[] strArrSplit = "shouldHandleGesturesOnPrimaryContent".split(";");
        StringBuilder sb = new StringBuilder("uqw[");
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
