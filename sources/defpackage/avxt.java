package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avxt implements avlk {
    private final avxu a;

    public avxt(avxu avxuVar) {
        this.a = avxuVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        avxu avxuVar = this.a;
        awka.f(avxuVar.c);
        avxuVar.a.b(th);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.g(this.a.e, axsqVar)) {
            axsqVar.ko(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        this.a.lazySet(obj);
    }

    @Override // defpackage.axsp
    public final void kn() {
    }
}
