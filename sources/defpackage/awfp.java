package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awfp extends avlr {
    final avmb a;
    final long b;
    final TimeUnit c;

    public awfp(long j, TimeUnit timeUnit, avmb avmbVar) {
        this.b = j;
        this.c = timeUnit;
        this.a = avmbVar;
    }

    @Override // defpackage.avlr
    public final void e(avlw avlwVar) {
        awfo awfoVar = new awfo(avlwVar);
        avlwVar.d(awfoVar);
        avnr.h(awfoVar, this.a.c(awfoVar, this.b, this.c));
    }
}
