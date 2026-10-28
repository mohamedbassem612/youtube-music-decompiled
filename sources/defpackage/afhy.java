package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afhy {
    public final String a;
    public final afhx b;

    public afhy(String str, afhx afhxVar) {
        this.a = str;
        this.b = afhxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afhy) {
            afhy afhyVar = (afhy) obj;
            if (this.a.equals(afhyVar.a) && this.b.equals(afhyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "AccountProviderConfig{type=" + this.a + ", provider=" + String.valueOf(this.b) + '}';
    }

    public afhy() {
        throw null;
    }
}
