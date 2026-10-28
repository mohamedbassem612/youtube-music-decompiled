package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avxn extends AtomicReference implements Runnable, axsq {
    private static final long serialVersionUID = -2809475196591179431L;
    final axsp a;
    volatile boolean b;

    public avxn(axsp axspVar) {
        this.a = axspVar;
    }

    @Override // defpackage.axsq
    public final void kj() {
        avnr.b(this);
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            this.b = true;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() != avnr.DISPOSED) {
            if (!this.b) {
                lazySet(avns.a);
                this.a.b(new avmx("Can't deliver value due to lack of requests"));
            } else {
                axsp axspVar = this.a;
                axspVar.kk(0L);
                lazySet(avns.a);
                axspVar.kn();
            }
        }
    }
}
