package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ppg {
    public final String a;
    public final long b;
    public final Long c;

    public ppg(String str, long j, Long l) {
        this.a = str;
        this.b = j;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ppg) {
            ppg ppgVar = (ppg) obj;
            if (awrc.c(this.a, ppgVar.a) && this.b == ppgVar.b && awrc.c(this.c, ppgVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.c;
        return ((iHashCode + a.ak(this.b)) * 31) + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "AuthToken(token=" + this.a + ", authTimeMillis=" + this.b + ", expirationTimeSecs=" + this.c + ')';
    }
}
