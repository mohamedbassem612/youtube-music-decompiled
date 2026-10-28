package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ygg {
    public final yez a;
    public final ygt b;

    public ygg(yez yezVar, ygt ygtVar) {
        this.a = yezVar;
        this.b = ygtVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ygg) {
            ygg yggVar = (ygg) obj;
            if (this.a.equals(yggVar.a) && this.b.equals(yggVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ygt ygtVar = this.b;
        return "UncommittedCacheEntry{cacheEntry=" + this.a.toString() + ", youtubeCacheKey=" + ygtVar.toString() + '}';
    }

    public ygg() {
        throw null;
    }
}
