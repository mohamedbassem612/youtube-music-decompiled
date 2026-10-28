package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gmu {
    public final String a;
    private final vwn b;

    public gmu(String str, vwn vwnVar) {
        str.getClass();
        vwnVar.getClass();
        this.a = str;
        this.b = vwnVar;
    }

    public final boolean a() {
        vwn vwnVar = this.b;
        return vwnVar == vwn.AVAILABLE || vwnVar == vwn.STALE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gmu) {
            gmu gmuVar = (gmu) obj;
            if (awrc.c(this.a, gmuVar.a) && this.b == gmuVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "BrowseCacheReadResult(browseId=" + this.a + ", expiryStatus=" + this.b + ')';
    }
}
