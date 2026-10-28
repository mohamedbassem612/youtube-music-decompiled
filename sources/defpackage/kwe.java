package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kwe {
    public final String a;
    public final boolean b;
    private final boolean c;
    private final long d;
    private final long e;

    public kwe(String str, boolean z, boolean z2, long j, long j2) {
        this.a = str;
        this.c = z;
        this.b = z2;
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kwe) {
            kwe kweVar = (kwe) obj;
            if (this.a.equals(kweVar.a) && this.c == kweVar.c && this.b == kweVar.b && this.d == kweVar.d && this.e == kweVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.d)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.e);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.a + ", shouldGetAdvertisingId=" + this.c + ", isGooglePlayServicesAvailable=" + this.b + ", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=" + this.d + ", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=" + this.e + '}';
    }

    public kwe() {
        throw null;
    }
}
