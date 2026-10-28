package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ablb implements abla {
    private final wgi a;
    private final xhz b;

    public ablb(wgi wgiVar, xhz xhzVar) {
        if (wgiVar == null) {
            throw new NullPointerException("Null model");
        }
        this.a = wgiVar;
        if (xhzVar == null) {
            throw new NullPointerException("Null logger");
        }
        this.b = xhzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ablb) {
            ablb ablbVar = (ablb) obj;
            if (this.a.equals(ablbVar.a) && this.b.equals(ablbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        xhz xhzVar = this.b;
        return "LoggedWatchNextResponse{model=" + this.a.toString() + ", logger=" + xhzVar.toString() + '}';
    }

    public ablb() {
        throw null;
    }
}
