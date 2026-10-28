package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wbe {
    public final wbi a;
    public final wbk b;
    public final wbi c;

    public wbe(wbi wbiVar, wbk wbkVar, wbi wbiVar2) {
        if (wbiVar == null) {
            throw new NullPointerException("Null write");
        }
        this.a = wbiVar;
        this.b = wbkVar;
        this.c = wbiVar2;
    }

    public final boolean equals(Object obj) {
        wbk wbkVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof wbe) {
            wbe wbeVar = (wbe) obj;
            if (this.a.equals(wbeVar.a) && ((wbkVar = this.b) != null ? wbkVar.equals(wbeVar.b) : wbeVar.b == null) && this.c.equals(wbeVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        wbk wbkVar = this.b;
        return (((iHashCode * 1000003) ^ (wbkVar == null ? 0 : wbkVar.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        wbi wbiVar = this.c;
        wbk wbkVar = this.b;
        return "ImmutableOrderedEdit{write=" + String.valueOf(this.a) + ", update=" + String.valueOf(wbkVar) + ", metadata=" + wbiVar.toString() + '}';
    }

    public wbe() {
        throw null;
    }
}
