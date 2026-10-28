package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awep extends avlr {
    final Object a;
    final avnn b;

    public awep(Object obj, avnn avnnVar) {
        this.a = obj;
        this.b = avnnVar;
    }

    @Override // defpackage.avlr
    public final void e(avlw avlwVar) {
        try {
            avlu avluVar = (avlu) this.b.a(this.a);
            avluVar.getClass();
            if (!(avluVar instanceof Callable)) {
                avluVar.ak(avlwVar);
                return;
            }
            try {
                Object objCall = ((Callable) avluVar).call();
                if (objCall == null) {
                    avns.d(avlwVar);
                    return;
                }
                aweo aweoVar = new aweo(avlwVar, objCall);
                avlwVar.d(aweoVar);
                aweoVar.run();
            } catch (Throwable th) {
                avkz.a(th);
                avns.g(th, avlwVar);
            }
        } catch (Throwable th2) {
            avns.g(th2, avlwVar);
        }
    }
}
