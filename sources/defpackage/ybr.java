package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ybr {
    public final String a;
    public final String b;

    public ybr(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ybr) {
            ybr ybrVar = (ybr) obj;
            if (awrc.c(this.a, ybrVar.a) && awrc.c(this.b, ybrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "ContinuationAndDiscoveryParams(continuation=" + this.a + ", discoveryParams=" + this.b + ')';
    }
}
