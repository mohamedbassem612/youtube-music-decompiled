package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sdq {
    public final agke a;
    public final agke b;
    public final agke c;

    public sdq(agke agkeVar, agke agkeVar2, agke agkeVar3) {
        this.a = agkeVar;
        if (agkeVar2 == null) {
            throw new NullPointerException("Null fulfillmentTriggers");
        }
        this.b = agkeVar2;
        if (agkeVar3 == null) {
            throw new NullPointerException("Null expirationTriggers");
        }
        this.c = agkeVar3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sdq) {
            sdq sdqVar = (sdq) obj;
            if (aguu.v(this.a, sdqVar.a) && aguu.v(this.b, sdqVar.b) && aguu.v(this.c, sdqVar.c)) {
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
        agke agkeVar2 = this.b;
        return "SlotTriggers{entryTriggers=" + String.valueOf(this.a) + ", fulfillmentTriggers=" + String.valueOf(agkeVar2) + ", expirationTriggers=" + String.valueOf(agkeVar) + '}';
    }

    public sdq() {
        throw null;
    }
}
