package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gju implements afnz, afof, afoj, aupg {
    private final ght b;
    private final gkg c;
    private final gju d = this;
    final aupr a = aupm.c(new ghk(1));

    public gju(ght ghtVar, gkg gkgVar) {
        this.b = ghtVar;
        this.c = gkgVar;
        aupn aupnVar = aupt.a;
    }

    @Override // defpackage.afoj
    public final ggg a() {
        return new ggg(this.b, this.c, this.d);
    }

    @Override // defpackage.afof
    public final auod b() {
        return (auod) this.a.io();
    }

    @Override // defpackage.afnz
    public final acda c() {
        return new acda(this.b, this.c, this.d);
    }
}
