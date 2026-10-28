package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xxi implements xzf {
    amyu a;
    boolean b;
    abnl c;
    Float d;
    private final avmm e = new avmm();
    private final xxj f;

    public xxi(xxj xxjVar) {
        this.f = xxjVar;
    }

    @Override // defpackage.xzf
    public final void g(xzc xzcVar) {
        this.a = xzcVar.r();
        this.b = xzcVar.an();
        this.c = null;
        this.d = xzcVar.as() ? Float.valueOf(xzcVar.a()) : null;
        this.e.b();
    }

    @Override // defpackage.xzf
    public final void h(xzc xzcVar) {
        this.a = null;
        this.b = false;
        this.c = null;
        this.d = null;
    }

    @Override // defpackage.xzf
    public final void jv(xzc xzcVar) {
        avmm avmmVar = this.e;
        avmmVar.b();
        avlr avlrVarC = xzcVar.m().c();
        xxj xxjVar = this.f;
        xxjVar.getClass();
        avmmVar.c(avlrVarC.af(new xul(xxjVar, 9)));
    }
}
