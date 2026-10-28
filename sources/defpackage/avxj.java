package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avxj extends avrf {
    final long c;
    final TimeUnit d;
    final avmb e;
    final boolean f;

    public avxj(avlh avlhVar, long j, TimeUnit timeUnit, avmb avmbVar, boolean z) {
        super(avlhVar);
        this.c = j;
        this.d = timeUnit;
        this.e = avmbVar;
        this.f = z;
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        this.b.ap(new avxi(axspVar, this.c, this.d, this.e.a(), this.f));
    }
}
