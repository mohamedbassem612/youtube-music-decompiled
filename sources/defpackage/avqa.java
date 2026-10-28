package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avqa extends avlb {
    final avnd a;

    public avqa(avnd avndVar) {
        this.a = avndVar;
    }

    @Override // defpackage.avlb
    protected final void H(avlc avlcVar) {
        avmq avmqVar = new avmq(avoi.b);
        avlcVar.d(avmqVar);
        try {
            this.a.a();
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
