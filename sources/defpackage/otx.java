package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class otx {
    public final esn a;
    public final ativ b;

    public otx(esn esnVar, ativ ativVar) {
        if (esnVar == null) {
            throw new NullPointerException("Null requestBuilder");
        }
        this.a = esnVar;
        this.b = ativVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof otx) {
            otx otxVar = (otx) obj;
            if (this.a.equals(otxVar.a)) {
                ativ ativVar = this.b;
                if (ativVar == null) {
                    if (otxVar.b == null) {
                        return true;
                    }
                } else if (ativVar.equals(otxVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        ativ ativVar = this.b;
        return (iHashCode * 1000003) ^ (ativVar == null ? 0 : ativVar.hashCode());
    }

    public final String toString() {
        ativ ativVar = this.b;
        return "GlideRequest{requestBuilder=" + this.a.toString() + ", imageSource=" + String.valueOf(ativVar) + '}';
    }

    public otx() {
        throw null;
    }
}
