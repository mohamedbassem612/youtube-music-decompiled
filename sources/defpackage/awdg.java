package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awdg extends avlr {
    final avmb a;
    final long b;
    final long c;
    final TimeUnit d;

    public awdg(long j, long j2, TimeUnit timeUnit, avmb avmbVar) {
        this.b = j;
        this.c = j2;
        this.d = timeUnit;
        this.a = avmbVar;
    }

    @Override // defpackage.avlr
    public final void e(avlw avlwVar) {
        awdf awdfVar = new awdf(avlwVar);
        avlwVar.d(awdfVar);
        avmb avmbVar = this.a;
        if (!(avmbVar instanceof awjk)) {
            avnr.d(awdfVar, avmbVar.d(awdfVar, this.b, this.c, this.d));
            return;
        }
        avma avmaVarA = avmbVar.a();
        avnr.d(awdfVar, avmaVarA);
        avmaVarA.c(awdfVar, this.b, this.c, this.d);
    }
}
