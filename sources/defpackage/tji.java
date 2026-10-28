package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tji {
    public final awuz a;
    public final boolean b;

    public tji(awuz awuzVar, boolean z) {
        this.a = awuzVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tji) {
            tji tjiVar = (tji) obj;
            if (awrc.c(this.a, tjiVar.a) && this.b == tjiVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.aj(this.b);
    }

    public final String toString() {
        return "CoalescedResponse(response=" + this.a + ", isCoalesced=" + this.b + ')';
    }
}
