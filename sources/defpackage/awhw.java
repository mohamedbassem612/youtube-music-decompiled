package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awhw extends avmc {
    final long a;
    final TimeUnit b;
    final avmb c;

    public awhw(long j, TimeUnit timeUnit, avmb avmbVar) {
        this.a = j;
        this.b = timeUnit;
        this.c = avmbVar;
    }

    @Override // defpackage.avmc
    protected final void G(avmd avmdVar) {
        awhv awhvVar = new awhv(avmdVar);
        avmdVar.d(awhvVar);
        avnr.g(awhvVar, this.c.c(awhvVar, this.a, this.b));
    }
}
