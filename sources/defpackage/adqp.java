package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adqp implements adqt {
    public final adql a;
    public final adrj b;
    public final awut c;
    public final awwd d;
    public final awqg e;

    public adqp(adql adqlVar, adrj adrjVar, awut awutVar, awwd awwdVar, awqg awqgVar) {
        this.a = adqlVar;
        this.b = adrjVar;
        this.c = awutVar;
        this.d = awwdVar;
        this.e = awqgVar;
    }

    @Override // defpackage.adqt
    public final /* synthetic */ adqc a() {
        return null;
    }

    @Override // defpackage.adqt
    public final awwd e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof adqp) {
            adqp adqpVar = (adqp) obj;
            if (awrc.c(this.a, adqpVar.a) && awrc.c(this.b, adqpVar.b) && awrc.c(this.c, adqpVar.c) && awrc.c(this.d, adqpVar.d) && awrc.c(this.e, adqpVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "Loading(key=" + this.a + ", source=" + this.b + ", activeScope=" + this.c + ", loadJob=" + this.d + ", defaultsProvider=" + this.e + ')';
    }
}
