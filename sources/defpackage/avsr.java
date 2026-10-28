package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avsr extends avrf {
    final long c;
    final TimeUnit d;
    final avmb e;

    public avsr(avlh avlhVar, long j, TimeUnit timeUnit, avmb avmbVar) {
        super(avlhVar);
        this.c = j;
        this.d = timeUnit;
        this.e = avmbVar;
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        this.b.ap(new avsq(new awmb(axspVar), this.c, this.d, this.e.a()));
    }
}
