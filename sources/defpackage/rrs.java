package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rrs {
    public final toi a;
    public final aobj b;

    public rrs(toi toiVar, aobj aobjVar) {
        if (toiVar == null) {
            throw new NullPointerException("Null cronetRttObservation");
        }
        this.a = toiVar;
        if (aobjVar == null) {
            throw new NullPointerException("Null effectiveConnectionType");
        }
        this.b = aobjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rrs) {
            rrs rrsVar = (rrs) obj;
            if (this.a.equals(rrsVar.a) && this.b.equals(rrsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        aobj aobjVar = this.b;
        return "NetworkObservationPair{cronetRttObservation=" + this.a.toString() + ", effectiveConnectionType=" + aobjVar.toString() + '}';
    }

    public rrs() {
        throw null;
    }
}
