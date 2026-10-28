package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awfl implements avlw {
    final avlw a;
    final AtomicReference b;

    public awfl(avlw avlwVar, AtomicReference atomicReference) {
        this.a = avlwVar;
        this.b = atomicReference;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        avnr.g(this.b, avmnVar);
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        this.a.kk(obj);
    }

    @Override // defpackage.avlw
    public final void kn() {
        this.a.kn();
    }
}
