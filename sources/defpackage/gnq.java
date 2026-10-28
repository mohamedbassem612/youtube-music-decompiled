package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gnq {
    public final wfy a;
    public final gnn b;

    public gnq(wfy wfyVar, gnn gnnVar) {
        if (wfyVar == null) {
            throw new NullPointerException("Null response");
        }
        this.a = wfyVar;
        if (gnnVar == null) {
            throw new NullPointerException("Null metadata");
        }
        this.b = gnnVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gnq) {
            gnq gnqVar = (gnq) obj;
            if (this.a.equals(gnqVar.a) && this.b.equals(gnqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        gnn gnnVar = this.b;
        return "BrowseResponseWithMetadata{response=" + this.a.toString() + ", metadata=" + String.valueOf(gnnVar) + '}';
    }

    public gnq() {
        throw null;
    }
}
