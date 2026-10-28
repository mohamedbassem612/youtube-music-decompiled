package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awbe extends AtomicReference implements avlw {
    private static final long serialVersionUID = -7449079488798789337L;
    final avlw a;
    final awbf b;

    public awbe(avlw avlwVar, awbf awbfVar) {
        this.a = avlwVar;
        this.b = awbfVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        this.b.dispose();
        this.a.b(th);
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        avnr.g(this, avmnVar);
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        this.a.kk(obj);
    }

    @Override // defpackage.avlw
    public final void kn() {
        awbf awbfVar = this.b;
        awbfVar.g = false;
        awbfVar.e();
    }
}
