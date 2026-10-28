package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class shg {
    public final String a;
    public final agke b;
    public final ajnu c;
    private final long d;

    public shg(String str, long j, agke agkeVar, ajnu ajnuVar) {
        this.a = str;
        this.d = j;
        this.b = agkeVar;
        this.c = ajnuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof shg) {
            shg shgVar = (shg) obj;
            if (this.a.equals(shgVar.a) && this.d == shgVar.d && aguu.v(this.b, shgVar.b) && this.c.equals(shgVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.d;
        return (((((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ajnu ajnuVar = this.c;
        return "CachedAd{sourceAdRequestId=" + this.a + ", ingestionTimeEpochMillis=" + this.d + ", adSlotRenderers=" + this.b.toString() + ", cacheContext=" + ajnuVar.toString() + '}';
    }

    public shg() {
        throw null;
    }
}
