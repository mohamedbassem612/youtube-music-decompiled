package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class acff extends ept {
    public final long a;
    public final boolean b;
    public final boolean c;

    public acff(long j, boolean z, boolean z2) {
        this.a = j;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acff)) {
            return false;
        }
        acff acffVar = (acff) obj;
        return this.b == acffVar.b && this.c == acffVar.c && this.a == acffVar.a;
    }

    public final int hashCode() {
        return (((a.aj(this.b) * 31) + a.aj(this.c)) * 31) + a.ak(this.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Long.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c)};
        String[] strArrSplit = "timeMillis;isDesiredSeekTimeAvailable;canSeek".split(";");
        StringBuilder sb = new StringBuilder("acff[");
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
