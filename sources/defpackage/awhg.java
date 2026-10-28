package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awhg extends avmc {
    final Callable a;

    public awhg(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.avmc
    protected final void G(avmd avmdVar) {
        avmq avmqVar = new avmq(avoi.b);
        avmdVar.d(avmqVar);
        if (avmqVar.f()) {
            return;
        }
        try {
            Object objCall = this.a.call();
            objCall.getClass();
            if (avmqVar.f()) {
                return;
            }
            avmdVar.ki(objCall);
        } catch (Throwable th) {
            avkz.a(th);
            if (avmqVar.f()) {
                atqp.n(th);
            } else {
                avmdVar.b(th);
            }
        }
    }
}
