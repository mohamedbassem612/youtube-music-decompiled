package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jmt {
    public final abbd a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final hzo f = new hzo(this);
    private final abct g;

    public jmt(abct abctVar, abbd abbdVar) {
        abctVar.getClass();
        this.g = abctVar;
        abbdVar.getClass();
        this.a = abbdVar;
        abctVar.a.c = this;
    }

    public final void a() {
        if (this.b && this.c && this.d && !this.e) {
            this.g.setVisibility(0);
        } else {
            this.g.setVisibility(8);
        }
    }
}
