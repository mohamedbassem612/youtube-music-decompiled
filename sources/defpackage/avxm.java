package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avxm extends avrf {
    final TimeUnit c;
    final avmb d;

    public avxm(avlh avlhVar, TimeUnit timeUnit, avmb avmbVar) {
        super(avlhVar);
        this.c = timeUnit;
        this.d = avmbVar;
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        avxk avxkVar = new avxk(axspVar, this.c, this.d.a());
        axspVar.e(avxkVar);
        avxkVar.d(0L);
        this.b.ap(avxkVar);
    }
}
