package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hwh implements xzf, xzg, gzh {
    public boolean a = false;
    public final ycp b;
    public final jnm c;

    public hwh(ycp ycpVar, jnm jnmVar) {
        this.b = ycpVar;
        this.c = jnmVar;
    }

    private final boolean e() {
        return this.c.C();
    }

    @Override // defpackage.xzf
    public final void h(xzc xzcVar) {
        xzcVar.Y(e());
    }

    @Override // defpackage.xzf
    public final void jv(xzc xzcVar) {
        xzcVar.Y(e());
    }

    @Override // defpackage.gzh
    public final void w(zwa zwaVar, jnm jnmVar) {
        ycp ycpVar = this.b;
        if (ycpVar.e != null) {
            ycpVar.e.Y(e());
        }
    }

    @Override // defpackage.xzg
    public final void a() {
    }

    @Override // defpackage.xzg
    public final void b() {
    }

    @Override // defpackage.xzg
    public final void c() {
    }

    @Override // defpackage.xzg
    public final void d() {
    }

    @Override // defpackage.xzf
    public final void g(xzc xzcVar) {
    }

    @Override // defpackage.gzh
    public final void v(zwa zwaVar) {
    }
}
