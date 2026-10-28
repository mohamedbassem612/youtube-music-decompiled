package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awkw extends AtomicLong implements axsq {
    private static final long serialVersionUID = 3562861878281475070L;
    final axsp a;
    final awkx b;

    public awkw(axsp axspVar, awkx awkxVar) {
        this.a = axspVar;
        this.b = awkxVar;
    }

    @Override // defpackage.axsq
    public final void kj() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.b.aC(this);
        }
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            atqp.C(this, j);
        }
    }
}
