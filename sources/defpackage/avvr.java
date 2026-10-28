package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avvr extends awjs {
    private static final long serialVersionUID = -3740826063558713822L;
    final avnn a;

    public avvr(axsp axspVar, avnn avnnVar) {
        super(axspVar);
        this.a = avnnVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        try {
            f(((avog) this.a).a);
        } catch (Throwable th2) {
            avkz.a(th2);
            this.b.b(new avmw(th, th2));
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        this.e++;
        this.b.kk(obj);
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.b.kn();
    }
}
