package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awbc extends AtomicReference implements avlw {
    private static final long serialVersionUID = 2620149119579502636L;
    final avlw a;
    final awbd b;

    public awbc(avlw avlwVar, awbd awbdVar) {
        this.a = avlwVar;
        this.b = awbdVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        awbd awbdVar = this.b;
        if (!awkh.e(awbdVar.d, th)) {
            atqp.n(th);
            return;
        }
        if (!awbdVar.f) {
            awbdVar.h.dispose();
        }
        awbdVar.i = false;
        awbdVar.e();
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
        awbd awbdVar = this.b;
        awbdVar.i = false;
        awbdVar.e();
    }
}
