package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awer extends awav {
    final avnf b;
    final Callable c;

    public awer(avlu avluVar, Callable callable, avnf avnfVar) {
        super(avluVar);
        this.b = avnfVar;
        this.c = callable;
    }

    @Override // defpackage.avlr
    public final void e(avlw avlwVar) {
        try {
            this.a.ak(new aweq(avlwVar, this.b, ((avog) this.c).a));
        } catch (Throwable th) {
            avkz.a(th);
            avns.g(th, avlwVar);
        }
    }
}
