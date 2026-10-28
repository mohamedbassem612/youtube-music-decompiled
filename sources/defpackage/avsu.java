package defpackage;

import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avsu extends avrf {
    final avnn c;

    public avsu(avlh avlhVar, avnn avnnVar) {
        super(avlhVar);
        this.c = avnnVar;
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        try {
            this.b.ap(new avst(axspVar, this.c, new HashSet()));
        } catch (Throwable th) {
            avkz.a(th);
            awjx.f(th, axspVar);
        }
    }
}
