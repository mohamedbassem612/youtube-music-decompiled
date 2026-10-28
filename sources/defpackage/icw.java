package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class icw {
    public final amae a;
    public final alss b;

    public icw(amae amaeVar, alss alssVar) {
        this.a = amaeVar;
        this.b = alssVar;
    }

    public final int a() {
        return this.a != null ? 1 : 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof icw) {
            icw icwVar = (icw) obj;
            amae amaeVar = this.a;
            if (amaeVar != null ? amaeVar.equals(icwVar.a) : icwVar.a == null) {
                alss alssVar = this.b;
                if (alssVar == null) {
                    if (icwVar.b == null) {
                        return true;
                    }
                } else if (alssVar.equals(icwVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        amae amaeVar = this.a;
        int iHashCode = amaeVar == null ? 0 : amaeVar.hashCode();
        alss alssVar = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (alssVar != null ? alssVar.hashCode() : 0);
    }

    public final String toString() {
        alss alssVar = this.b;
        return "QueueResponseWrapper{watchNextResponse=" + String.valueOf(this.a) + ", musicQueueResponse=" + String.valueOf(alssVar) + '}';
    }

    public icw() {
        throw null;
    }
}
