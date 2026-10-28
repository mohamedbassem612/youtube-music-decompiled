package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tie {
    public final tmr a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public tie(tmr tmrVar, String str, boolean z, boolean z2) {
        str.getClass();
        this.a = tmrVar;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tie) {
            tie tieVar = (tie) obj;
            if (awrc.c(this.a, tieVar.a) && awrc.c(this.b, tieVar.b) && this.c == tieVar.c && this.d == tieVar.d) {
                boolean z = tieVar.e;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        tmr tmrVar = this.a;
        return ((((((((tmrVar == null ? 0 : tmrVar.hashCode()) * 31) + this.b.hashCode()) * 31) + a.aj(this.c)) * 31) + a.aj(this.d)) * 31) + a.aj(false);
    }

    public final String toString() {
        return "CacheLookupResult(cacheEntry=" + this.a + ", key=" + this.b + ", isFromRequestKey=" + this.c + ", isCollision=" + this.d + ", isFromScopedCache=false)";
    }
}
