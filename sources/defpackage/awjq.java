package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class awjq extends awjr implements avlk, awkn {
    protected final axsp h;
    protected final avos i;
    protected volatile boolean j;
    protected volatile boolean k;

    public awjq(axsp axspVar, avos avosVar) {
        this.h = axspVar;
        this.i = avosVar;
    }

    public void d(axsp axspVar, Object obj) {
        throw null;
    }

    @Override // defpackage.awkn
    public final int g(int i) {
        return this.l.addAndGet(i);
    }

    @Override // defpackage.awkn
    public final long h() {
        return this.m.get();
    }

    public final void i(long j) {
        if (awka.h(j)) {
            atqp.B(this.m, j);
        }
    }

    @Override // defpackage.awkn
    public final boolean j() {
        return this.j;
    }

    @Override // defpackage.awkn
    public final boolean k() {
        return this.k;
    }

    public final boolean l() {
        return this.l.getAndIncrement() == 0;
    }

    public final boolean m() {
        AtomicInteger atomicInteger = this.l;
        return atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1);
    }

    public final void n(Object obj, avmn avmnVar) {
        avos avosVar = this.i;
        axsp axspVar = this.h;
        if (m()) {
            long j = this.m.get();
            if (j == 0) {
                this.j = true;
                avmnVar.dispose();
                axspVar.b(new avmx("Could not emit buffer due to lack of requests"));
                return;
            } else if (avosVar.i()) {
                d(axspVar, obj);
                if (j != Long.MAX_VALUE) {
                    o();
                }
                if (g(-1) == 0) {
                    return;
                }
            } else {
                avosVar.j(obj);
            }
        } else {
            avosVar.j(obj);
            if (!l()) {
                return;
            }
        }
        atqp.t(avosVar, axspVar, avmnVar, this);
    }

    @Override // defpackage.awkn
    public final void o() {
        this.m.addAndGet(-1L);
    }
}
