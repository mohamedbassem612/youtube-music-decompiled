package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avuk extends avrf {
    final avnn c;
    final int d;

    public avuk(avlh avlhVar, avnn avnnVar, int i) {
        super(avlhVar);
        this.c = avnnVar;
        this.d = i;
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        try {
            this.b.ap(new avui(axspVar, this.c, this.d, new ConcurrentHashMap()));
        } catch (Exception e) {
            avkz.a(e);
            axspVar.e(awkf.INSTANCE);
            axspVar.b(e);
        }
    }
}
