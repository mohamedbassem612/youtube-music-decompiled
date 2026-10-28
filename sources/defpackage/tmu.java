package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tmu {
    public final String a;
    public final Object b;
    private final String c = null;

    public tmu(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tmu) {
            tmu tmuVar = (tmu) obj;
            if (awrc.c(this.a, tmuVar.a) && awrc.c(this.b, tmuVar.b)) {
                String str = tmuVar.c;
                if (awrc.c(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "CacheEntry(key=" + this.a + ", value=" + this.b + ", requestKey=null)";
    }
}
