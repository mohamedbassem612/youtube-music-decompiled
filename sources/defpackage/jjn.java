package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jjn implements god, gdx {
    public final dd a;
    private final aunn b;
    private final god c;
    private hek d;
    private final jnm e;
    private final dov f;

    public jjn(dd ddVar, aunn aunnVar, jnm jnmVar, dov dovVar, god godVar) {
        this.a = ddVar;
        this.b = aunnVar;
        this.e = jnmVar;
        this.f = dovVar;
        this.c = godVar;
    }

    @Override // defpackage.gdx
    public final void a() {
        hek hekVar = this.d;
        if (hekVar != null) {
            d(hekVar);
        }
    }

    @Override // defpackage.god
    public final cc b() {
        return this.a.g("FEmusic_tastebuilder");
    }

    @Override // defpackage.god
    public final void d(hek hekVar) {
        dd ddVar = this.a;
        if (jku.e(ddVar)) {
            aunn aunnVar = this.b;
            if (((abvk) aunnVar.io()).X() && !this.e.C()) {
                ((abvk) aunnVar.io()).ap(false, 19);
            }
            this.f.v();
            this.c.c();
            hekVar.i("FEmusic_tastebuilder");
            jjm jjmVar = new jjm();
            jjmVar.y = hekVar;
            jjmVar.gT(ddVar, "FEmusic_tastebuilder");
            hekVar = null;
        }
        this.d = hekVar;
    }

    public final void e() {
        jjm jjmVar = (jjm) this.a.g("FEmusic_tastebuilder");
        if (jjmVar != null) {
            jjmVar.dismiss();
        }
    }

    @Override // defpackage.god
    public final void c() {
    }
}
