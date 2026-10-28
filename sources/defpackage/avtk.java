package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avtk extends avlh {
    final Callable b;

    public avtk(Callable callable) {
        this.b = callable;
    }

    @Override // defpackage.avlh
    public final void ar(axsp axspVar) {
        try {
            th = (Throwable) ((avog) this.b).a;
        } catch (Throwable th) {
            th = th;
            avkz.a(th);
        }
        awjx.f(th, axspVar);
    }
}
