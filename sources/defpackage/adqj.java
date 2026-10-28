package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adqj {
    public final adql a;
    public final adqc b;
    public final awwd c;
    private final adrj d;
    private final awqg e;

    public adqj(adql adqlVar, adrj adrjVar, adqc adqcVar, awqg awqgVar, awwd awwdVar) {
        adqcVar.getClass();
        this.a = adqlVar;
        this.d = adrjVar;
        this.b = adqcVar;
        this.e = awqgVar;
        this.c = awwdVar;
    }

    public static /* synthetic */ adqj b(adqj adqjVar, awqg awqgVar, awwd awwdVar, int i) {
        adql adqlVar = (i & 1) != 0 ? adqjVar.a : null;
        adrj adrjVar = (i & 2) != 0 ? adqjVar.d : null;
        adqc adqcVar = (i & 4) != 0 ? adqjVar.b : null;
        if ((i & 8) != 0) {
            awqgVar = adqjVar.e;
        }
        awqg awqgVar2 = awqgVar;
        if ((i & 16) != 0) {
            awwdVar = adqjVar.c;
        }
        adqlVar.getClass();
        adrjVar.getClass();
        adqcVar.getClass();
        awqgVar2.getClass();
        return new adqj(adqlVar, adrjVar, adqcVar, awqgVar2, awwdVar);
    }

    public final adqn a(awut awutVar, awwd awwdVar) {
        return new adqn(b(this, null, (awwd) ((axcw) awutVar).a.get(awwd.d), 15), awutVar, awwdVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof adqj) {
            adqj adqjVar = (adqj) obj;
            if (awrc.c(this.a, adqjVar.a) && awrc.c(this.d, adqjVar.d) && awrc.c(this.b, adqjVar.b) && awrc.c(this.e, adqjVar.e) && awrc.c(this.c, adqjVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.d.hashCode()) * 31) + this.b.hashCode()) * 31) + this.e.hashCode();
        awwd awwdVar = this.c;
        return (iHashCode * 31) + (awwdVar == null ? 0 : awwdVar.hashCode());
    }

    public final String toString() {
        return "AllocatedSession(key=" + this.a + ", source=" + this.d + ", nativeSession=" + this.b + ", defaultsProvider=" + this.e + ", activeJob=" + this.c + ')';
    }
}
