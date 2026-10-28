package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aagz {
    public final aqpc a;
    public final Optional b;
    public final agke c;

    public aagz(aqpc aqpcVar, Optional optional, agke agkeVar) {
        this.a = aqpcVar;
        this.b = optional;
        this.c = agkeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aagz) {
            aagz aagzVar = (aagz) obj;
            if (this.a.equals(aagzVar.a) && this.b.equals(aagzVar.b) && aguu.v(this.c, aagzVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        agke agkeVar = this.c;
        Optional optional = this.b;
        return "TransferStateWithReasons{transferState=" + String.valueOf(this.a) + ", transferFailureReason=" + String.valueOf(optional) + ", transferStatusReasons=" + String.valueOf(agkeVar) + '}';
    }

    public aagz() {
        throw null;
    }
}
