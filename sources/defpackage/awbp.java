package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awbp extends avlr {
    final Callable a;

    public awbp(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.avlr
    public final void e(avlw avlwVar) {
        try {
            avlu avluVar = (avlu) this.a.call();
            avluVar.getClass();
            avluVar.ak(avlwVar);
        } catch (Throwable th) {
            avkz.a(th);
            avns.g(th, avlwVar);
        }
    }
}
