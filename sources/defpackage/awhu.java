package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awhu extends avmc {
    final avmf a;
    final long b;
    final TimeUnit c;
    final avmb d;
    final avmf e;

    public awhu(avmf avmfVar, long j, TimeUnit timeUnit, avmb avmbVar, avmf avmfVar2) {
        this.a = avmfVar;
        this.b = j;
        this.c = timeUnit;
        this.d = avmbVar;
        this.e = avmfVar2;
    }

    @Override // defpackage.avmc
    protected final void G(avmd avmdVar) {
        avmf avmfVar = this.e;
        long j = this.b;
        TimeUnit timeUnit = this.c;
        awht awhtVar = new awht(avmdVar, avmfVar, j, timeUnit);
        avmdVar.d(awhtVar);
        avnr.g(awhtVar.b, this.d.c(awhtVar, j, timeUnit));
        this.a.F(awhtVar);
    }
}
