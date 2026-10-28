package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avvu extends AtomicLong implements axsq {
    private static final long serialVersionUID = -4453897557930727610L;
    final axsp a;
    volatile avvv b;
    long c;

    public avvu(axsp axspVar) {
        this.a = axspVar;
    }

    @Override // defpackage.axsq
    public final void kj() {
        avvv avvvVar;
        if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (avvvVar = this.b) == null) {
            return;
        }
        avvvVar.g(this);
        avvvVar.d();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            atqp.C(this, j);
            avvv avvvVar = this.b;
            if (avvvVar != null) {
                avvvVar.d();
            }
        }
    }
}
