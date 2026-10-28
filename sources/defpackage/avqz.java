package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avqz extends avlb {
    final long a;
    final TimeUnit b;
    final avmb c;

    public avqz(long j, TimeUnit timeUnit, avmb avmbVar) {
        this.a = j;
        this.b = timeUnit;
        this.c = avmbVar;
    }

    @Override // defpackage.avlb
    protected final void H(avlc avlcVar) {
        avqy avqyVar = new avqy(avlcVar);
        avlcVar.d(avqyVar);
        avnr.g(avqyVar, this.c.c(avqyVar, this.a, this.b));
    }
}
