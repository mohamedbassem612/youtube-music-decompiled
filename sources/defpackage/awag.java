package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awag extends AtomicReference implements avlw, avlc, avmn {
    private static final long serialVersionUID = -8948264376121066672L;
    final avlw a;
    avlu b;

    public awag(avlw avlwVar, avlu avluVar) {
        this.b = avluVar;
        this.a = avlwVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        avnr.g(this, avmnVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return avnr.c((avmn) get());
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        this.a.kk(obj);
    }

    @Override // defpackage.avlw
    public final void kn() {
        avlu avluVar = this.b;
        if (avluVar == null) {
            this.a.kn();
        } else {
            this.b = null;
            avluVar.ak(this);
        }
    }
}
