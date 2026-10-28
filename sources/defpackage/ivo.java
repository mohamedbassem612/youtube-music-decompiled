package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ivo implements jlf {
    public aqgx a;
    private final ivu b;
    private boolean c;
    private final kjs d;

    public ivo(ivu ivuVar, kjs kjsVar) {
        this.b = ivuVar;
        this.d = kjsVar;
    }

    @Override // defpackage.jlf
    public final void a() {
        this.c = true;
    }

    @Override // defpackage.jlf
    public final void b() {
        aqgx aqgxVar;
        if (!this.c || (aqgxVar = this.a) == null) {
            return;
        }
        this.b.e(aqgxVar, 2);
    }

    public final void c() {
        this.a = null;
    }

    public final void d() {
        this.d.f(this);
    }

    public final void e() {
        this.d.g(this);
    }
}
