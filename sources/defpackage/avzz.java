package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avzz extends avlm {
    final long a;
    final TimeUnit b;
    final avmb c;

    public avzz(long j, TimeUnit timeUnit, avmb avmbVar) {
        this.a = j;
        this.b = timeUnit;
        this.c = avmbVar;
    }

    @Override // defpackage.avlm
    protected final void G(avln avlnVar) {
        avzy avzyVar = new avzy(avlnVar);
        avlnVar.d(avzyVar);
        avnr.g(avzyVar, this.c.c(avzyVar, this.a, this.b));
    }
}
