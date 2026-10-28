package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awcv extends avlr implements Callable {
    final Callable a;

    public awcv(Callable callable) {
        this.a = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        Object objCall = this.a.call();
        objCall.getClass();
        return objCall;
    }

    @Override // defpackage.avlr
    public final void e(avlw avlwVar) {
        avpb avpbVar = new avpb(avlwVar);
        avlwVar.d(avpbVar);
        if (avpbVar.f()) {
            return;
        }
        try {
            Object objCall = this.a.call();
            objCall.getClass();
            avpbVar.e(objCall);
        } catch (Throwable th) {
            avkz.a(th);
            if (avpbVar.f()) {
                atqp.n(th);
            } else {
                avlwVar.b(th);
            }
        }
    }
}
