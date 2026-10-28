package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avwn extends avrf {
    final avnf c;
    final Callable d;

    public avwn(avlh avlhVar, Callable callable, avnf avnfVar) {
        super(avlhVar);
        this.c = avnfVar;
        this.d = callable;
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        try {
            this.b.ap(new avwm(axspVar, this.c, ((avog) this.d).a, avlh.a));
        } catch (Throwable th) {
            avkz.a(th);
            awjx.f(th, axspVar);
        }
    }
}
