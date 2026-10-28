package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avlz implements Runnable {
    final Runnable a;
    final avnv b;
    final long c;
    long d;
    long e;
    long f;
    final /* synthetic */ avma g;

    public avlz(avma avmaVar, long j, Runnable runnable, long j2, avnv avnvVar, long j3) {
        this.g = avmaVar;
        this.a = runnable;
        this.b = avnvVar;
        this.c = j3;
        this.e = j2;
        this.f = j;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0033  */
    @Override // java.lang.Runnable
    public final void run() {
        long j;
        this.a.run();
        avnv avnvVar = this.b;
        if (avnvVar.f()) {
            return;
        }
        avma avmaVar = this.g;
        long jD = avma.d(TimeUnit.NANOSECONDS);
        long j2 = avmb.a;
        long j3 = jD + j2;
        long j4 = this.e;
        if (j3 >= j4) {
            long j5 = this.c;
            if (jD < j4 + j5 + j2) {
                long j6 = this.f;
                long j7 = this.d + 1;
                this.d = j7;
                j = j6 + (j7 * j5);
            } else {
                long j8 = this.c;
                long j9 = this.d + 1;
                this.d = j9;
                long j10 = jD + j8;
                this.f = j10 - (j8 * j9);
                j = j10;
            }
        } else {
            long j11 = this.c;
            long j12 = this.d + 1;
            this.d = j12;
            long j13 = jD + j11;
            this.f = j13 - (j11 * j12);
            j = j13;
        }
        this.e = jD;
        avnr.g(avnvVar, avmaVar.b(this, j - jD, TimeUnit.NANOSECONDS));
    }
}
