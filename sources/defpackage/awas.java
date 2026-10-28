package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awas extends avlr {
    final avlr a;
    final avnn b;

    public awas(avlr avlrVar, avnn avnnVar) {
        this.a = avlrVar;
        this.b = avnnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [avlp] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // defpackage.avlr
    protected final void e(avlw avlwVar) {
        ?? r2;
        Object objA;
        avnn avnnVar = this.b;
        avlu avluVar = this.a;
        if (!(avluVar instanceof Callable)) {
            avluVar.ak(new awar(avlwVar, avnnVar));
            return;
        }
        try {
            Object objCall = ((Callable) avluVar).call();
            if (objCall != null) {
                objA = avnnVar.a(objCall);
            } else {
                r2 = 0;
            }
            if (r2 == 0) {
                r2 = objA;
                avns.d(avlwVar);
            } else {
                r2 = objA;
                r2.F(new awac(avlwVar));
            }
        } catch (Throwable th) {
            avkz.a(th);
            avns.g(th, avlwVar);
        }
    }
}
