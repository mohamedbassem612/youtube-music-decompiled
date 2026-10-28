package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xhs {
    public final String a;
    public final long b;
    public final String c;

    public xhs(String str, long j, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xhs) {
            xhs xhsVar = (xhs) obj;
            if (awrc.c(this.a, xhsVar.a) && this.b == xhsVar.b && awrc.c(this.c, xhsVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.ak(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ScreenMetadata(csn=" + this.a + ", timestamp=" + this.b + ", originalClonedCsn=" + this.c + ')';
    }
}
