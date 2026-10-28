package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gkb implements afpq, aupg {
    private final ght a;
    private final gkg b;
    private final gju c;
    private final gkb d = this;
    private final gjt e;

    public gkb(ght ghtVar, gkg gkgVar, gju gjuVar, gjt gjtVar) {
        this.a = ghtVar;
        this.b = gkgVar;
        this.c = gjuVar;
        this.e = gjtVar;
    }

    @Override // defpackage.afpq
    public final gie a() {
        return new gie(this.a, this.b, this.c, this.e, this.d);
    }
}
