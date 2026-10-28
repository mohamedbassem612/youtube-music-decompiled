package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wep {
    public final weh a;
    public final wej b;

    public wep(weh wehVar, wej wejVar) {
        this.a = wehVar;
        this.b = wejVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wep) {
            wep wepVar = (wep) obj;
            if (this.a.equals(wepVar.a) && this.b.equals(wepVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        wej wejVar = this.b;
        return "EntityWithMetadata{entity=" + String.valueOf(this.a) + ", metadata=" + String.valueOf(wejVar) + '}';
    }

    public wep() {
        throw null;
    }
}
