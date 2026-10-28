package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tgl {
    public final tfu a;
    public final tgk b;

    public tgl(tfu tfuVar, tgk tgkVar) {
        this.a = tfuVar;
        this.b = tgkVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tgl) {
            tgl tglVar = (tgl) obj;
            if (this.a.equals(tglVar.a)) {
                tgk tgkVar = this.b;
                if (tgkVar == null) {
                    if (tglVar.b == null) {
                        return true;
                    }
                } else if (tgkVar.equals(tglVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        tgk tgkVar = this.b;
        return ((iHashCode * 1000003) ^ (tgkVar == null ? 0 : tgkVar.hashCode())) * (-721379959);
    }

    public final String toString() {
        tgk tgkVar = this.b;
        return "VolleyNetworkConfig{httpClientConfig=" + this.a.toString() + ", networkLogger=" + String.valueOf(tgkVar) + ", interceptor=null, responseModifier=null}";
    }

    public tgl() {
        throw null;
    }
}
