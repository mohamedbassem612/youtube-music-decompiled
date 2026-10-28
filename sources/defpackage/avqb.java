package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avqb extends avlb {
    final Runnable a;

    public avqb(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.avlb
    protected final void H(avlc avlcVar) {
        avmq avmqVar = new avmq(avoi.b);
        avlcVar.d(avmqVar);
        try {
            this.a.run();
            if (avmqVar.f()) {
                return;
            }
            avlcVar.kn();
        } catch (Throwable th) {
            avkz.a(th);
            if (avmqVar.f()) {
                atqp.n(th);
            } else {
                avlcVar.b(th);
            }
        }
    }
}
