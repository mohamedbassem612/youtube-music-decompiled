package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abqv {
    public final wgi a;
    public final long b;

    public abqv(wgi wgiVar, long j) {
        wgiVar.getClass();
        this.a = wgiVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof abqv) {
            abqv abqvVar = (abqv) obj;
            if (awrc.c(this.a, abqvVar.a) && this.b == abqvVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.ak(this.b);
    }

    public final String toString() {
        return "CacheEntry(response=" + this.a + ", expirationTimeMs=" + this.b + ')';
    }
}
