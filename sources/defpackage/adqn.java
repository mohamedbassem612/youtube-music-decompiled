package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adqn implements adqs {
    public final adqj a;
    public final awut b;
    public final awwd c;

    public adqn(adqj adqjVar, awut awutVar, awwd awwdVar) {
        this.a = adqjVar;
        this.b = awutVar;
        this.c = awwdVar;
    }

    @Override // defpackage.adqs, defpackage.adqt
    public final /* synthetic */ adqc a() {
        return acfz.X(this);
    }

    @Override // defpackage.adqs
    public final adqj b() {
        return this.a;
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
        if (obj instanceof adqn) {
            adqn adqnVar = (adqn) obj;
            if (awrc.c(this.a, adqnVar.a) && awrc.c(this.b, adqnVar.b) && awrc.c(this.c, adqnVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Active(session=" + this.a + ", activeScope=" + this.b + ", loopJob=" + this.c + ')';
    }
}
