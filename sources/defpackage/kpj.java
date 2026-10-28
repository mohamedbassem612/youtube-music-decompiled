package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kpj {
    public kpe a;
    public klq[] b;
    private boolean d = false;
    private boolean e = false;
    public int c = 0;

    public final kpk a() {
        kro.d(this.a != null, "execute parameter required");
        if (!this.e) {
            klq[] klqVarArr = this.b;
            this.d = klqVarArr != null && klqVarArr[0].c;
        }
        return new kpi(this, this.b, this.d, this.c);
    }

    public final void b() {
        this.e = true;
        this.d = false;
    }
}
