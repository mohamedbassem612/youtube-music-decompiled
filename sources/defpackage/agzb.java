package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agzb implements Runnable {
    final int a;
    Thread b;
    volatile Thread c;
    agza d;
    int e;
    long f;
    volatile long g;
    final /* synthetic */ agzc h;
    volatile int i = 2;

    public agzb(agzc agzcVar, int i) {
        this.h = agzcVar;
        this.a = i;
    }

    private final void d() {
        if (this.h.j) {
            long j = this.f + 1;
            this.f = j;
            this.g = j;
        }
    }

    public final void a() {
        if (this.b != null) {
            this.h.f.incrementAndGet();
        }
        this.b = null;
        this.c = null;
        this.i = 3;
        this.h.o.countDown();
    }

    public final void b() {
        this.h.i.newThread(this).start();
    }

    public final void c(agza agzaVar) {
        int i = this.e;
        if (i < 5) {
            agzaVar.a = this.d;
            agzaVar.b = this.a;
            this.d = agzaVar;
            this.e = i + 1;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zInterrupted;
        int i;
        int i2;
        Thread threadCurrentThread = Thread.currentThread();
        this.b = threadCurrentThread;
        this.c = threadCurrentThread;
        agzc agzcVar = this.h;
        if (agzcVar.h.get()) {
            a();
            return;
        }
        loop0: while (true) {
            agza agzaVar = (agza) agzcVar.c.poll();
            if (agzaVar != null) {
                agzcVar.a();
                Runnable runnable = (Runnable) agzaVar.a;
                c(agzaVar);
                try {
                    agzcVar.k.run();
                    try {
                        runnable.run();
                        try {
                            agzcVar.l.run();
                            d();
                            Thread.interrupted();
                            if (agzcVar.g) {
                                break;
                            }
                        } catch (Throwable th) {
                            d();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            this.h.l.run();
                            throw th2;
                        } finally {
                            d();
                        }
                    }
                } catch (Error | RuntimeException e) {
                    if (this.h.h.get()) {
                        a();
                    } else {
                        b();
                    }
                    throw e;
                }
            } else {
                this.i = 2;
                agza agzaVar2 = null;
                while (true) {
                    AtomicReference atomicReference = agzcVar.p;
                    agza agzaVar3 = (agza) atomicReference.get();
                    Object obj = agzaVar3.a;
                    zInterrupted = false;
                    if (obj == agzc.a) {
                        int i3 = agzaVar3.b;
                        if (i3 == 0) {
                            i = 3;
                            break;
                        } else if (a.av(atomicReference, agzaVar3, agzcVar.n[i3 - 1])) {
                            if (agzaVar2 != null) {
                                c(agzaVar2);
                            }
                            i = 1;
                            break;
                        }
                    } else if (obj != agzc.b || (i2 = agzaVar3.b) <= 0) {
                        if (agzaVar2 == null) {
                            agzaVar2 = this.d;
                            if (agzaVar2 == null) {
                                agzaVar2 = new agza(agzcVar.m[0], this.a);
                            } else {
                                this.d = (agza) agzaVar2.a;
                                this.e--;
                            }
                        }
                        agzaVar2.a = agzaVar3;
                        if (a.av(atomicReference, agzaVar3, agzaVar2)) {
                            i = 2;
                            break;
                        }
                    } else if (a.av(atomicReference, agzaVar3, agzcVar.m[i2 - 1])) {
                        if (agzaVar2 != null) {
                            c(agzaVar2);
                        }
                        i = 1;
                        break;
                    }
                }
                int i4 = i - 1;
                if (i4 == 0) {
                    this.i = 1;
                } else {
                    if (i4 == 2) {
                        this.i = 3;
                        break;
                    }
                    while (true) {
                        LockSupport.park(agzcVar);
                        int i5 = this.i;
                        int i6 = i5 - 1;
                        if (i5 == 0) {
                            throw null;
                        }
                        if (i6 == 0) {
                            if (!zInterrupted) {
                                break;
                            }
                            Thread thread = this.b;
                            thread.getClass();
                            thread.interrupt();
                            break;
                        }
                        if (i6 == 1) {
                            zInterrupted |= Thread.interrupted();
                        } else if (i6 == 2) {
                            break loop0;
                        }
                    }
                }
            }
        }
        a();
    }
}
