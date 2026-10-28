package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sgp {
    public final skh a;
    public final Optional b;
    public final Optional c;

    public sgp(skh skhVar, Optional optional, Optional optional2) {
        this.a = skhVar;
        this.b = optional;
        this.c = optional2;
    }

    public static ovo a() {
        ovo ovoVar = new ovo((char[]) null);
        ovoVar.n(skh.a);
        return ovoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sgp) {
            sgp sgpVar = (sgp) obj;
            if (this.a.equals(sgpVar.a) && this.b.equals(sgpVar.b) && this.c.equals(sgpVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        Optional optional2 = this.b;
        return "AdOpportunityContextModel{externalContext=" + String.valueOf(this.a) + ", reelPageIdentifier=" + String.valueOf(optional2) + ", contentCpn=" + String.valueOf(optional) + '}';
    }

    public sgp() {
        throw null;
    }
}
