package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tkh {
    public final int a;
    public final boolean b;

    public tkh(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tkh) {
            tkh tkhVar = (tkh) obj;
            if (this.a == tkhVar.a && this.b == tkhVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + a.aj(this.b);
    }

    public final String toString() {
        return "ContentLengthEstimate(estimate=" + this.a + ", isConfident=" + this.b + ')';
    }
}
