package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avzo implements avln {
    final avln a;
    final AtomicReference b;

    public avzo(avln avlnVar, AtomicReference atomicReference) {
        this.a = avlnVar;
        this.b = atomicReference;
    }

    @Override // defpackage.avln
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.avln
    public final void d(avmn avmnVar) {
        avnr.d(this.b, avmnVar);
    }

    @Override // defpackage.avln
    public final void ki(Object obj) {
        this.a.ki(obj);
    }

    @Override // defpackage.avln
    public final void kn() {
        this.a.kn();
    }
}
