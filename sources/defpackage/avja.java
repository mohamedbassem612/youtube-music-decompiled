package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avja extends auyw {
    long b;
    final /* synthetic */ avjh c;
    private final avjf d;

    public avja(avjh avjhVar, avjf avjfVar) {
        this.c = avjhVar;
        this.d = avjfVar;
    }

    @Override // defpackage.avjt
    public final void c(long j) {
        avjh avjhVar = this.c;
        if (avjhVar.r.f == null) {
            synchronized (avjhVar.m) {
                if (avjhVar.r.f == null) {
                    avjf avjfVar = this.d;
                    if (!avjfVar.b) {
                        long j2 = this.b + j;
                        this.b = j2;
                        long j3 = avjhVar.v;
                        if (j2 <= j3) {
                            return;
                        }
                        if (j2 > avjhVar.n) {
                            avjfVar.c = true;
                        } else {
                            long jF = avjhVar.G.f(j2 - j3);
                            avjhVar.v = this.b;
                            if (jF > avjhVar.o) {
                                avjfVar.c = true;
                            }
                        }
                        Runnable runnableC = avjfVar.c ? avjhVar.c(avjfVar) : null;
                        if (runnableC != null) {
                            runnableC.run();
                        }
                    }
                }
            }
        }
    }
}
