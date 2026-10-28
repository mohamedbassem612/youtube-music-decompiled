package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abpx {
    public final abnl a;
    public final abnp b;

    public abpx(abnl abnlVar, abnp abnpVar) {
        if (abnlVar == null) {
            throw new NullPointerException("Null playbackStartDescriptor");
        }
        this.a = abnlVar;
        if (abnpVar == null) {
            throw new NullPointerException("Null playbackStartParameters");
        }
        this.b = abnpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abpx) {
            abpx abpxVar = (abpx) obj;
            if (this.a.equals(abpxVar.a) && this.b.equals(abpxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        abnp abnpVar = this.b;
        return "WatchNextFetcherDescriptor{playbackStartDescriptor=" + this.a.toString() + ", playbackStartParameters=" + abnpVar.toString() + '}';
    }

    public abpx() {
        throw null;
    }
}
