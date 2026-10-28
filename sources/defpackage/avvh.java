package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avvh extends AtomicInteger implements avlk, axsq {
    private static final long serialVersionUID = 3240706908776709697L;
    final axsp a;
    axsq e;
    volatile boolean f;
    volatile boolean g;
    Throwable h;
    final int i = 2;
    final long b = 1;
    final AtomicLong c = new AtomicLong();
    final Deque d = new ArrayDeque();

    public avvh(axsp axspVar) {
        this.a = axspVar;
    }

    static final void f(Deque deque) {
        synchronized (deque) {
            deque.clear();
        }
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.g) {
            atqp.n(th);
            return;
        }
        this.h = th;
        this.g = true;
        d();
    }

    final void d() {
        boolean zIsEmpty;
        Object objPoll;
        if (getAndIncrement() == 0) {
            Deque deque = this.d;
            axsp axspVar = this.a;
            int iAddAndGet = 1;
            do {
                AtomicLong atomicLong = this.c;
                long j = atomicLong.get();
                long j2 = 0;
                while (true) {
                    boolean z = this.f;
                    if (j2 == j) {
                        if (!z) {
                            boolean z2 = this.g;
                            synchronized (deque) {
                                zIsEmpty = deque.isEmpty();
                            }
                            if (!z2) {
                                break;
                            }
                            Throwable th = this.h;
                            if (th == null) {
                                if (!zIsEmpty) {
                                    break;
                                }
                                axspVar.kn();
                                return;
                            } else {
                                f(deque);
                                axspVar.b(th);
                                return;
                            }
                        }
                        f(deque);
                        return;
                    }
                    if (z) {
                        f(deque);
                        return;
                    }
                    boolean z3 = this.g;
                    synchronized (deque) {
                        objPoll = deque.poll();
                    }
                    if (!z3) {
                        if (objPoll == null) {
                            break;
                        }
                    } else {
                        Throwable th2 = this.h;
                        if (th2 != null) {
                            f(deque);
                            axspVar.b(th2);
                            return;
                        } else if (objPoll == null) {
                            axspVar.kn();
                            return;
                        }
                    }
                    axspVar.kk(objPoll);
                    j2++;
                }
                if (j2 != 0) {
                    atqp.F(atomicLong, j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.e, axsqVar)) {
            this.e = axsqVar;
            this.a.e(this);
            axsqVar.ko(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.f = true;
        this.e.kj();
        if (getAndIncrement() == 0) {
            f(this.d);
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        boolean z;
        boolean z2;
        if (this.g) {
            return;
        }
        Deque deque = this.d;
        synchronized (deque) {
            z = false;
            if (deque.size() == this.b) {
                int i = this.i;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                z2 = true;
                if (i2 == 1) {
                    deque.poll();
                    deque.offer(obj);
                    z = true;
                    z2 = false;
                }
            } else {
                deque.offer(obj);
                z2 = false;
            }
        }
        if (z) {
            return;
        }
        if (!z2) {
            d();
        } else {
            this.e.kj();
            b(new avmx());
        }
    }

    @Override // defpackage.axsp
    public final void kn() {
        this.g = true;
        d();
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j)) {
            atqp.B(this.c, j);
            d();
        }
    }
}
