package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awbo extends awav {
    final long b;
    final TimeUnit c;
    final avmb d;

    public awbo(avlu avluVar, long j, TimeUnit timeUnit, avmb avmbVar) {
        super(avluVar);
        this.b = j;
        this.c = timeUnit;
        this.d = avmbVar;
    }

    @Override // defpackage.avlr
    public final void e(avlw avlwVar) {
        this.a.ak(new awbn(new awkr(avlwVar), this.b, this.c, this.d.a()));
    }
}
