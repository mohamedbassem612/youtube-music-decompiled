package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avtz extends avlh implements Callable {
    @Override // defpackage.avlh
    public final void ar(axsp axspVar) {
        awjw awjwVar = new awjw(axspVar);
        axspVar.e(awjwVar);
        try {
            awjwVar.f(Boolean.FALSE);
        } catch (Throwable th) {
            avkz.a(th);
            if (awjwVar.g()) {
                atqp.n(th);
            } else {
                axspVar.b(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Boolean.FALSE;
    }
}
