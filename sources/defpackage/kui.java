package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kui {
    public final ktj a;
    public final elq b;

    public kui(ktj ktjVar, elq elqVar) {
        if (ktjVar == null) {
            throw new NullPointerException("Null handle");
        }
        this.a = ktjVar;
        this.b = elqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kui) {
            kui kuiVar = (kui) obj;
            if (this.a.equals(kuiVar.a)) {
                elq elqVar = this.b;
                if (elqVar == null) {
                    if (kuiVar.b == null) {
                        return true;
                    }
                } else if (elqVar.equals(kuiVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        elq elqVar = this.b;
        return (iHashCode * 1000003) ^ (elqVar == null ? 0 : elqVar.hashCode());
    }

    public final String toString() {
        elq elqVar = this.b;
        return "InitializedHandle{handle=" + this.a.toString() + ", appSideVmProcess=" + String.valueOf(elqVar) + '}';
    }

    public kui() {
        throw null;
    }
}
