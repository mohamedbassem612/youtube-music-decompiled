package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afrc {
    public final afrd a;
    public final long b;

    public afrc(afrd afrdVar, long j) {
        this.a = afrdVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afrc) {
            afrc afrcVar = (afrc) obj;
            if (this.a.equals(afrcVar.a) && this.b == afrcVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "SyncConstraint{constraintType=" + this.a.toString() + ", applicablePeriod=" + this.b + '}';
    }

    public afrc() {
        throw null;
    }
}
