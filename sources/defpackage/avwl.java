package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avwl extends avlh {
    final Object b;
    final avnn c;

    public avwl(Object obj, avnn avnnVar) {
        this.b = obj;
        this.c = avnnVar;
    }

    @Override // defpackage.avlh
    public final void ar(axsp axspVar) {
        try {
            axso axsoVar = (axso) this.c.a(this.b);
            axsoVar.getClass();
            if (!(axsoVar instanceof Callable)) {
                axsoVar.aq(axspVar);
                return;
            }
            try {
                Object objCall = ((Callable) axsoVar).call();
                if (objCall == null) {
                    awjx.d(axspVar);
                } else {
                    axspVar.e(new awjy(axspVar, objCall));
                }
            } catch (Throwable th) {
                avkz.a(th);
                awjx.f(th, axspVar);
            }
        } catch (Throwable th2) {
            awjx.f(th2, axspVar);
        }
    }
}
