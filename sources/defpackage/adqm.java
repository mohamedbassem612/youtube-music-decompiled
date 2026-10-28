package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adqm {
    public final boc a;
    public final boe b;
    public final boh c;
    private final bog d;

    public adqm(boc bocVar, boe boeVar, boh bohVar, bog bogVar) {
        this.a = bocVar;
        this.b = boeVar;
        this.c = bohVar;
        this.d = bogVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof adqm) {
            adqm adqmVar = (adqm) obj;
            if (awrc.c(this.a, adqmVar.a) && awrc.c(this.b, adqmVar.b) && awrc.c(this.c, adqmVar.c) && awrc.c(this.d, adqmVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boe boeVar = this.b;
        int iHashCode2 = (iHashCode + (boeVar == null ? 0 : boeVar.hashCode())) * 31;
        boh bohVar = this.c;
        int iHashCode3 = (iHashCode2 + (bohVar == null ? 0 : bohVar.hashCode())) * 31;
        bog bogVar = this.d;
        return iHashCode3 + (bogVar != null ? bogVar.hashCode() : 0);
    }

    public final String toString() {
        return "SessionLifecycleBinding(lifecycle=" + this.a + ", observer=" + this.b + ", localRegistry=" + this.c + ", owner=" + this.d + ')';
    }
}
