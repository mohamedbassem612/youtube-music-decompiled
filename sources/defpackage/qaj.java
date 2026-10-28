package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qaj {
    public final agke a;
    public final agkj b;

    public qaj(agke agkeVar, agkj agkjVar) {
        agkeVar.getClass();
        this.a = agkeVar;
        this.b = agkjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qaj) {
            qaj qajVar = (qaj) obj;
            if (awrc.c(this.a, qajVar.a) && awrc.c(this.b, qajVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        agkj agkjVar = this.b;
        return iHashCode + (agkjVar == null ? 0 : agkjVar.hashCode());
    }

    public final String toString() {
        return "GnpChimeSignedInRegistrationData(gaiaAccountNames=" + this.a + ", delegatedGaiaOidToActualAccountName=" + this.b + ')';
    }
}
