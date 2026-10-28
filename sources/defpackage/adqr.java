package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adqr implements adqs {
    public final awwd a;
    private final adqj b;

    public adqr(adqj adqjVar, awwd awwdVar) {
        this.b = adqjVar;
        this.a = awwdVar;
    }

    @Override // defpackage.adqs, defpackage.adqt
    public final /* synthetic */ adqc a() {
        return acfz.X(this);
    }

    @Override // defpackage.adqs
    public final adqj b() {
        return this.b;
    }

    @Override // defpackage.adqs
    public final /* synthetic */ adql c() {
        return acfz.Y(this);
    }

    @Override // defpackage.adqs
    public final /* synthetic */ adqr d(awwd awwdVar) {
        return acfz.aa(this, awwdVar);
    }

    @Override // defpackage.adqt
    public final /* synthetic */ awwd e() {
        return acfz.ab(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof adqr) {
            adqr adqrVar = (adqr) obj;
            if (awrc.c(this.b, adqrVar.b) && awrc.c(this.a, adqrVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "PendingCleanup(session=" + this.b + ", cleanupJob=" + this.a + ')';
    }
}
