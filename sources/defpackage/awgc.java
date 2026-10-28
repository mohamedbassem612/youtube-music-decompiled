package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
abstract class awgc extends AtomicInteger implements axsq {
    private static final long serialVersionUID = 3100232009247827843L;
    final axsp a;
    final awgb[] b;
    volatile boolean e;
    final awkd c = new awkd();
    final AtomicLong d = new AtomicLong();
    final AtomicInteger f = new AtomicInteger();

    public awgc(axsp axspVar, int i, int i2) {
        this.a = axspVar;
        awgb[] awgbVarArr = new awgb[i];
        for (int i3 = 0; i3 < i; i3++) {
            awgbVarArr[i3] = new awgb(this, i2);
        }
        this.b = awgbVarArr;
        this.f.lazySet(i);
    }

    final void a() {
        for (awgb awgbVar : this.b) {
            awgbVar.e = null;
        }
    }

    public abstract void b();

    public abstract void d();

    public abstract void f(Throwable th);

    public abstract void g(awgb awgbVar, Object obj);

    @Override // defpackage.axsq
    public final void kj() {
        if (this.e) {
            return;
        }
        this.e = true;
        for (awgb awgbVar : this.b) {
            awka.f(awgbVar);
        }
        if (getAndIncrement() == 0) {
            a();
        }
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            atqp.B(this.d, j);
            b();
        }
    }
}
