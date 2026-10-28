package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class smq {
    public final aixo a;
    public final int b;
    private final Optional c;

    public smq(aixo aixoVar, int i, Optional optional) {
        if (aixoVar == null) {
            throw new NullPointerException("Null slotType");
        }
        this.a = aixoVar;
        this.b = i;
        this.c = optional;
    }

    public static smq a(aixo aixoVar, int i) {
        return new smq(aixoVar, i, Optional.empty());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof smq) {
            smq smqVar = (smq) obj;
            if (this.a.equals(smqVar.a) && this.b == smqVar.b && this.c.equals(smqVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        return "SlotLocation{slotType=" + this.a.toString() + ", slotPhysicalPosition=" + this.b + ", feedId=" + optional.toString() + '}';
    }

    public smq() {
        throw null;
    }
}
