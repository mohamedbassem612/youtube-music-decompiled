package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahvx {
    private final agro a;
    private final String b;

    public ahvx(agro agroVar, String str) {
        this.a = agroVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahvx) {
            ahvx ahvxVar = (ahvx) obj;
            if (this.a.equals(ahvxVar.a)) {
                String str = this.b;
                if (str == null) {
                    if (ahvxVar.b == null) {
                        return true;
                    }
                } else if (str.equals(ahvxVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "MessageAndLogSite{logSite=" + this.a.toString() + ", message=" + this.b + '}';
    }

    public ahvx() {
        throw null;
    }
}
