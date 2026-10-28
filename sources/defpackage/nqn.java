package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nqn {
    public final esn a;
    public final ncl b;

    public nqn(esn esnVar, ncl nclVar) {
        if (esnVar == null) {
            throw new NullPointerException("Null requestBuilder");
        }
        this.a = esnVar;
        this.b = nclVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nqn) {
            nqn nqnVar = (nqn) obj;
            if (this.a.equals(nqnVar.a)) {
                ncl nclVar = this.b;
                if (nclVar == null) {
                    if (nqnVar.b == null) {
                        return true;
                    }
                } else if (nclVar.equals(nqnVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        ncl nclVar = this.b;
        return (iHashCode * 1000003) ^ (nclVar == null ? 0 : nclVar.hashCode());
    }

    public final String toString() {
        ncl nclVar = this.b;
        return "GlideRequest{requestBuilder=" + this.a.toString() + ", imageSource=" + String.valueOf(nclVar) + '}';
    }

    public nqn() {
        throw null;
    }
}
