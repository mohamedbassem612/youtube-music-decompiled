package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awce extends avlr {
    final Callable a;

    public awce(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.avlr
    public final void e(avlw avlwVar) {
        try {
            th = (Throwable) ((avog) this.a).a;
        } catch (Throwable th) {
            th = th;
            avkz.a(th);
        }
        avns.g(th, avlwVar);
    }
}
