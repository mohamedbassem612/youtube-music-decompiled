package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avvx extends AtomicLong implements axsq {
    private static final long serialVersionUID = 2845000326761540265L;
    final axsp a;
    final avvy b;
    long c;

    public avvx(axsp axspVar, avvy avvyVar) {
        this.a = axspVar;
        this.b = avvyVar;
    }

    public final boolean a() {
        return get() == Long.MIN_VALUE;
    }

    @Override // defpackage.axsq
    public final void kj() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            avvy avvyVar = this.b;
            avvyVar.g(this);
            avvyVar.d();
        }
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        atqp.C(this, j);
        this.b.d();
    }
}
