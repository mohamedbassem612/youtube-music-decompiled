package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avxo extends avlh {
    final avmb b;
    final long c;
    final TimeUnit d;

    public avxo(long j, TimeUnit timeUnit, avmb avmbVar) {
        this.c = j;
        this.d = timeUnit;
        this.b = avmbVar;
    }

    @Override // defpackage.avlh
    public final void ar(axsp axspVar) {
        avxn avxnVar = new avxn(axspVar);
        axspVar.e(avxnVar);
        avnr.h(avxnVar, this.b.c(avxnVar, this.c, this.d));
    }
}
