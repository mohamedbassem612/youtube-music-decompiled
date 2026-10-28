package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avss extends avlh {
    final Callable b;

    public avss(Callable callable) {
        this.b = callable;
    }

    @Override // defpackage.avlh
    public final void ar(axsp axspVar) {
        try {
            axso axsoVar = (axso) this.b.call();
            axsoVar.getClass();
            axsoVar.aq(axspVar);
        } catch (Throwable th) {
            avkz.a(th);
            awjx.f(th, axspVar);
        }
    }
}
