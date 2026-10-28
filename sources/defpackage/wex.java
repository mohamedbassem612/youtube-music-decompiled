package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wex extends awly {
    public final awly a = new awlo();
    private final avmm b;

    public wex(Runnable runnable) {
        this.b = new avmm(new avmq(runnable));
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        this.a.b(th);
        this.b.dispose();
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        this.b.c(avmnVar);
        this.a.d(avmnVar);
    }

    @Override // defpackage.avlr
    protected final void e(avlw avlwVar) {
        this.a.ak(new wew(avlwVar, this));
    }

    @Override // defpackage.awly
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        this.a.kk(obj);
    }

    @Override // defpackage.avlw
    public final void kn() {
        this.a.kn();
        this.b.dispose();
    }
}
