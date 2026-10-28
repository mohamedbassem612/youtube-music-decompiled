package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rmh {
    public final affd a;
    public final Throwable b;

    public rmh(affd affdVar, Throwable th) {
        this.a = affdVar;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rmh) {
            rmh rmhVar = (rmh) obj;
            affd affdVar = this.a;
            if (affdVar != null ? affdVar.equals(rmhVar.a) : rmhVar.a == null) {
                Throwable th = this.b;
                if (th == null) {
                    if (rmhVar.b == null) {
                        return true;
                    }
                } else if (th.equals(rmhVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        affd affdVar = this.a;
        int iHashCode = affdVar == null ? 0 : affdVar.hashCode();
        Throwable th = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        Throwable th = this.b;
        return "IdentityChange{accountId=" + String.valueOf(this.a) + ", error=" + String.valueOf(th) + '}';
    }

    public rmh() {
        throw null;
    }
}
