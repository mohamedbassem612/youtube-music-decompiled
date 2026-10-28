package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awkt extends AtomicLong implements axsq, awkb {
    private static final long serialVersionUID = 3293175281126227086L;
    final axsp a;
    final awku b;
    boolean c;
    boolean d;
    awkc e;
    boolean f;
    volatile boolean g;
    long h;

    public awkt(axsp axspVar, awku awkuVar) {
        this.a = axspVar;
        this.b = awkuVar;
    }

    @Override // defpackage.awkb, defpackage.avno
    public final boolean a(Object obj) {
        if (this.g) {
            return true;
        }
        if (obj == awkl.COMPLETE) {
            this.a.kn();
            return true;
        }
        if (obj instanceof awkj) {
            this.a.b(awkl.a(obj));
            return true;
        }
        long j = get();
        if (j == 0) {
            kj();
            this.a.b(new avmx("Could not deliver value due to lack of requests"));
            return true;
        }
        this.a.kk(obj);
        if (j != Long.MAX_VALUE) {
            decrementAndGet();
        }
        return false;
    }

    final void b(Object obj, long j) {
        if (this.g) {
            return;
        }
        if (!this.f) {
            synchronized (this) {
                if (this.g) {
                    return;
                }
                if (this.h == j) {
                    return;
                }
                if (this.d) {
                    awkc awkcVar = this.e;
                    if (awkcVar == null) {
                        awkcVar = new awkc();
                        this.e = awkcVar;
                    }
                    awkcVar.a(obj);
                    return;
                }
                this.c = true;
                this.f = true;
            }
        }
        a(obj);
    }

    @Override // defpackage.axsq
    public final void kj() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.b.aE(this);
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            atqp.B(this, j);
        }
    }
}
