package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avyv extends avlm implements Callable {
    final Callable a;

    public avyv(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.avlm
    protected final void G(avln avlnVar) {
        avmq avmqVar = new avmq(avoi.b);
        avlnVar.d(avmqVar);
        if (avmqVar.f()) {
            return;
        }
        try {
            Object objCall = this.a.call();
            if (avmqVar.f()) {
                return;
            }
            if (objCall == null) {
                avlnVar.kn();
            } else {
                avlnVar.ki(objCall);
            }
        } catch (Throwable th) {
            avkz.a(th);
            if (avmqVar.f()) {
                atqp.n(th);
            } else {
                avlnVar.b(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.call();
    }
}
