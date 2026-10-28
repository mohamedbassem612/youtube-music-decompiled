package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeot {
    public final avgj a;
    private final aakt b;
    private final aaje c;

    public aeot(avgj avgjVar, aakt aaktVar, aaje aajeVar) {
        this.a = avgjVar;
        this.b = aaktVar;
        this.c = aajeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeot) {
            aeot aeotVar = (aeot) obj;
            if (this.a.equals(aeotVar.a) && this.b.equals(aeotVar.b) && this.c.equals(aeotVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
    }

    public final String toString() {
        aaje aajeVar = this.c;
        aakt aaktVar = this.b;
        return "CachePolicy{expiryGenerator=" + String.valueOf(this.a) + ", keyConverter=" + String.valueOf(aaktVar) + ", costGenerator=" + String.valueOf(aajeVar) + ", cacheMissFetcher=null}";
    }

    public aeot() {
        throw null;
    }
}
