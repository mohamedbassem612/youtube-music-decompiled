package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pbh {
    public final ahza a;
    public final agom b;
    public final agom c;
    public final boolean d;

    public pbh(ahza ahzaVar, agom agomVar, agom agomVar2, boolean z) {
        this.a = ahzaVar;
        this.b = agomVar;
        this.c = agomVar2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pbh) {
            pbh pbhVar = (pbh) obj;
            if (this.a == pbhVar.a && awrc.c(this.b, pbhVar.b) && awrc.c(this.c, pbhVar.c) && this.d == pbhVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ahza ahzaVar = this.a;
        int iHashCode = ahzaVar == null ? 0 : ahzaVar.hashCode();
        agom agomVar = this.b;
        int iHashCode2 = agomVar == null ? 0 : agomVar.hashCode();
        int i = iHashCode * 31;
        agom agomVar2 = this.c;
        return ((((i + iHashCode2) * 31) + (agomVar2 != null ? agomVar2.hashCode() : 0)) * 31) + a.aj(this.d);
    }

    public final String toString() {
        return "RemovalInfo(removeReason=" + this.a + ", removeReasonToThreadIds=" + this.b + ", reachedLimitMap=" + this.c + ", dueToAnotherAccountAction=" + this.d + ')';
    }

    public pbh() {
        this(null, null, null, false);
    }
}
