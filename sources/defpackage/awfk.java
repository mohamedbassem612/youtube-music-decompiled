package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awfk extends awav {
    final long b;
    final TimeUnit c;
    final avmb d;

    public awfk(avlu avluVar, long j, TimeUnit timeUnit, avmb avmbVar) {
        super(avluVar);
        this.b = j;
        this.c = timeUnit;
        this.d = avmbVar;
    }

    @Override // defpackage.avlr
    public final void e(avlw avlwVar) {
        this.a.ak(new awfj(new awkr(avlwVar), this.b, this.c, this.d.a()));
    }
}
