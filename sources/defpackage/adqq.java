package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adqq implements adqs {
    public final adqj a;

    public adqq(adqj adqjVar) {
        this.a = adqjVar;
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
        if (this != obj) {
            return (obj instanceof adqq) && awrc.c(this.a, ((adqq) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Paused(session=" + this.a + ')';
    }
}
