package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahor {
    public final boolean a;
    private final ahpd b;

    public ahor(ahpd ahpdVar, boolean z) {
        this.b = ahpdVar;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ahor)) {
            return false;
        }
        ahor ahorVar = (ahor) obj;
        return ahorVar.b.equals(this.b) && ahorVar.a == this.a;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.a).hashCode();
    }
}
