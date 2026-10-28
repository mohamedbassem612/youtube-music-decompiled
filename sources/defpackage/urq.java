package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class urq {
    public final utv a;
    public final utw b;
    public final boolean c;
    private final boolean d;

    public urq(utv utvVar, utw utwVar, boolean z) {
        utvVar.getClass();
        this.a = utvVar;
        this.b = utwVar;
        this.d = z;
        this.c = utwVar != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof urq) {
            urq urqVar = (urq) obj;
            if (awrc.c(this.a, urqVar.a) && awrc.c(this.b, urqVar.b) && this.d == urqVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        utw utwVar = this.b;
        return ((iHashCode + (utwVar == null ? 0 : utwVar.hashCode())) * 31) + a.aj(this.d);
    }

    public final String toString() {
        return "MutationOutcome(mutation=" + this.a + ", exception=" + this.b + ", isSkipped=" + this.d + ')';
    }
}
