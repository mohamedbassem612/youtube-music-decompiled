package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awal extends AtomicReference implements avmd {
    private static final long serialVersionUID = 8042919737683345351L;
    final awam a;
    volatile Object b;

    public awal(awam awamVar) {
        this.a = awamVar;
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        awam awamVar = this.a;
        if (!a.av(awamVar.f, this, null) || !awkh.e(awamVar.d, th)) {
            atqp.n(th);
            return;
        }
        awamVar.g.kj();
        awamVar.d();
        awamVar.f();
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        avnr.d(this, avmnVar);
    }

    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        this.b = obj;
        this.a.f();
    }
}
