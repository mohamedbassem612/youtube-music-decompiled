package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avus extends AtomicLong implements Runnable, axsq {
    private static final long serialVersionUID = -2809475196591179431L;
    final axsp a;
    long b;
    final AtomicReference c = new AtomicReference();

    public avus(axsp axspVar) {
        this.a = axspVar;
    }

    public final void a(avmn avmnVar) {
        avnr.d(this.c, avmnVar);
    }

    @Override // defpackage.axsq
    public final void kj() {
        avnr.b(this.c);
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            atqp.B(this, j);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.c;
        if (atomicReference.get() != avnr.DISPOSED) {
            long j = get();
            axsp axspVar = this.a;
            if (j != 0) {
                long j2 = this.b;
                this.b = j2 + 1;
                axspVar.kk(Long.valueOf(j2));
                atqp.F(this, 1L);
                return;
            }
            axspVar.b(new avmx("Can't deliver value " + this.b + " due to lack of requests"));
            avnr.b(atomicReference);
        }
    }
}
