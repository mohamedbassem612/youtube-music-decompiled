package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public abstract class awjs extends AtomicLong implements avlk, axsq {
    private static final long serialVersionUID = 7917814472626990048L;
    protected final axsp b;
    protected axsq c;
    protected Object d;
    protected long e;

    public awjs(axsp axspVar) {
        this.b = axspVar;
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.c, axsqVar)) {
            this.c = axsqVar;
            this.b.e(this);
        }
    }

    protected final void f(Object obj) {
        long j = this.e;
        if (j != 0) {
            atqp.F(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                d(obj);
                return;
            }
            if ((j2 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                axsp axspVar = this.b;
                axspVar.kk(obj);
                axspVar.kn();
                return;
            }
            this.d = obj;
            if (compareAndSet(0L, Long.MIN_VALUE)) {
                return;
            } else {
                this.d = null;
            }
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.c.kj();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        long j2;
        if (awka.h(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        axsp axspVar = this.b;
                        axspVar.kk(this.d);
                        axspVar.kn();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, atqp.D(j2, j)));
            this.c.ko(j);
        }
    }

    protected void d(Object obj) {
    }
}
