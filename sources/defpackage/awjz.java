package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class awjz extends AtomicInteger implements axsq {
    private static final long serialVersionUID = -2189523197179400958L;
    axsq f;
    long g;
    final AtomicReference h = new AtomicReference();
    final AtomicLong i = new AtomicLong();
    final AtomicLong j = new AtomicLong();
    volatile boolean k;
    protected boolean l;

    final void d() {
        if (getAndIncrement() == 0) {
            f();
        }
    }

    final void f() {
        int iAddAndGet = 1;
        axsq axsqVar = null;
        long j = 0;
        do {
            AtomicReference atomicReference = this.h;
            axsq axsqVar2 = (axsq) atomicReference.get();
            if (axsqVar2 != null) {
                axsqVar2 = (axsq) atomicReference.getAndSet(null);
            }
            AtomicLong atomicLong = this.i;
            long andSet = atomicLong.get();
            if (andSet != 0) {
                andSet = atomicLong.getAndSet(0L);
            }
            AtomicLong atomicLong2 = this.j;
            long andSet2 = atomicLong2.get();
            if (andSet2 != 0) {
                andSet2 = atomicLong2.getAndSet(0L);
            }
            axsq axsqVar3 = this.f;
            if (this.k) {
                if (axsqVar3 != null) {
                    axsqVar3.kj();
                    this.f = null;
                }
                if (axsqVar2 != null) {
                    axsqVar2.kj();
                }
            } else {
                long j2 = this.g;
                if (j2 != Long.MAX_VALUE) {
                    j2 += andSet;
                    if (j2 < 0) {
                        j2 = Long.MAX_VALUE;
                    }
                    if (j2 != Long.MAX_VALUE) {
                        j2 -= andSet2;
                        if (j2 < 0) {
                            awka.b(j2);
                            j2 = 0;
                        }
                    }
                    this.g = j2;
                }
                if (axsqVar2 != null) {
                    this.f = axsqVar2;
                    if (j2 != 0) {
                        j += j2;
                        if (j < 0) {
                            j = Long.MAX_VALUE;
                        }
                        axsqVar = axsqVar2;
                    }
                } else if (axsqVar3 != null && andSet != 0) {
                    j += andSet;
                    if (j < 0) {
                        j = Long.MAX_VALUE;
                    }
                    axsqVar = axsqVar3;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (j != 0) {
            axsqVar.ko(j);
        }
    }

    public final void g(long j) {
        if (this.l) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            atqp.B(this.j, j);
            d();
            return;
        }
        long j2 = this.g;
        if (j2 != Long.MAX_VALUE) {
            long j3 = j2 - j;
            if (j3 < 0) {
                awka.b(j3);
                j3 = 0;
            }
            this.g = j3;
        }
        if (decrementAndGet() != 0) {
            f();
        }
    }

    public final void h(axsq axsqVar) {
        if (this.k) {
            axsqVar.kj();
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            d();
            return;
        }
        this.f = axsqVar;
        long j = this.g;
        if (decrementAndGet() != 0) {
            f();
        }
        if (j != 0) {
            axsqVar.ko(j);
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        if (this.k) {
            return;
        }
        this.k = true;
        d();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (!awka.h(j) || this.l) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            atqp.B(this.i, j);
            d();
            return;
        }
        long j2 = this.g;
        if (j2 != Long.MAX_VALUE) {
            long j3 = j2 + j;
            if (j3 < 0) {
                j3 = Long.MAX_VALUE;
            }
            this.g = j3;
            if (j3 == Long.MAX_VALUE) {
                this.l = true;
            }
        }
        axsq axsqVar = this.f;
        if (decrementAndGet() != 0) {
            f();
        }
        if (axsqVar != null) {
            axsqVar.ko(j);
        }
    }
}
