package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awfn extends awav {
    final TimeUnit b;
    final avmb c;
    final avlu d;

    public awfn(avlr avlrVar, TimeUnit timeUnit, avmb avmbVar, avlu avluVar) {
        super(avlrVar);
        this.b = timeUnit;
        this.c = avmbVar;
        this.d = avluVar;
    }

    @Override // defpackage.avlr
    protected final void e(avlw avlwVar) {
        awfm awfmVar = new awfm(avlwVar, this.b, this.c.a(), this.d);
        avlwVar.d(awfmVar);
        awfmVar.e(0L);
        this.a.ak(awfmVar);
    }
}
