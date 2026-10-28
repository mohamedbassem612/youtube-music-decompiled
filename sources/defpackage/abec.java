package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class abec {
    public final String a;
    public final xhc b;

    public abec(String str, xhc xhcVar) {
        this.a = str;
        this.b = xhcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abec) {
            abec abecVar = (abec) obj;
            String str = this.a;
            if (str != null ? str.equals(abecVar.a) : abecVar.a == null) {
                xhc xhcVar = this.b;
                if (xhcVar == null) {
                    if (abecVar.b == null) {
                        return true;
                    }
                } else if (xhcVar.equals(abecVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        xhc xhcVar = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (xhcVar != null ? xhcVar.a : 0);
    }

    public final String toString() {
        return "WatchScreenParentInfo{parentCsn=" + this.a + ", parentVeType=" + String.valueOf(this.b) + '}';
    }

    public abec() {
        throw null;
    }
}
