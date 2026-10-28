package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avpj implements avlc {
    final AtomicReference a;
    final avlc b;

    public avpj(AtomicReference atomicReference, avlc avlcVar) {
        this.a = atomicReference;
        this.b = avlcVar;
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.b.b(th);
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        avnr.g(this.a, avmnVar);
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        this.b.kn();
    }
}
