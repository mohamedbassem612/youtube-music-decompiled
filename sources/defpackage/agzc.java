package defpackage;

import androidx.car.app.model.Alert;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agzc extends AbstractExecutorService implements AutoCloseable {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public boolean g;
    public final ThreadFactory i;
    public final boolean j;
    public final Runnable k;
    public final Runnable l;
    public final agza[] m;
    public final agza[] n;
    public final CountDownLatch o;
    public final AtomicReference p;
    private final int q;
    private boolean r;
    private final boolean s;
    private final agzb[] t;
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final AtomicInteger d = new AtomicInteger();
    public final AtomicInteger e = new AtomicInteger();
    public final AtomicInteger f = new AtomicInteger();
    public final AtomicBoolean h = new AtomicBoolean();

    public agzc(int i, ThreadFactory threadFactory, boolean z, Runnable runnable, Runnable runnable2) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.bR(i, "numThreads must be positive: "));
        }
        this.q = Alert.DURATION_SHOW_INDEFINITELY;
        this.i = threadFactory;
        this.j = z;
        this.k = runnable;
        this.l = runnable2;
        this.s = z;
        this.o = new CountDownLatch(i);
        int i2 = i + 1;
        agza[] agzaVarArr = new agza[i2];
        agza[] agzaVarArr2 = new agza[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            agzaVarArr[i4] = new agza(b, i4);
            agzaVarArr2[i4] = new agza(a, i4);
        }
        this.m = agzaVarArr;
        this.n = agzaVarArr2;
        agzb[] agzbVarArr = new agzb[i];
        agza agzaVar = agzaVarArr[0];
        while (i3 < i) {
            agza agzaVar2 = new agza(agzaVar, i3);
            agzbVarArr[i3] = new agzb(this, i3);
            i3++;
            agzaVar = agzaVar2;
        }
        this.t = agzbVarArr;
        this.p = new AtomicReference(agzaVar);
    }

    public final void a() {
        if (this.s) {
            this.d.decrementAndGet();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.o.await(j, timeUnit);
    }

    public final void b(boolean z) {
        this.r = true;
        while (true) {
            AtomicReference atomicReference = this.p;
            agza agzaVar = (agza) atomicReference.get();
            Object obj = agzaVar.a;
            if (obj == a) {
                return;
            }
            Object obj2 = b;
            if (a.av(atomicReference, agzaVar, (obj != obj2 || z) ? this.n[0] : this.n[agzaVar.b])) {
                while (agzaVar.a != obj2) {
                    agzb agzbVar = this.t[agzaVar.b];
                    Thread thread = agzbVar.b;
                    agzbVar.i = 3;
                    if (thread != null) {
                        LockSupport.unpark(thread);
                    } else {
                        agzbVar.a();
                    }
                    agzaVar = (agza) agzaVar.a;
                }
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.ar(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AtomicInteger atomicInteger;
        int i;
        runnable.getClass();
        if (!this.r) {
            if (this.s) {
                int i2 = this.q;
                if (i2 != Integer.MAX_VALUE) {
                    do {
                        atomicInteger = this.d;
                        i = atomicInteger.get();
                        if (i != i2) {
                        }
                    } while (!atomicInteger.compareAndSet(i, i + 1));
                } else {
                    this.d.incrementAndGet();
                }
            }
            agza agzaVar = new agza(runnable, -1);
            ConcurrentLinkedQueue concurrentLinkedQueue = this.c;
            concurrentLinkedQueue.add(agzaVar);
            while (true) {
                AtomicReference atomicReference = this.p;
                agza agzaVar2 = (agza) atomicReference.get();
                Object obj = agzaVar2.a;
                if (obj == b) {
                    int i3 = agzaVar2.b;
                    int iMin = Math.min(i3 + 1, this.t.length);
                    if (iMin == i3 || a.av(atomicReference, agzaVar2, this.m[iMin])) {
                        return;
                    }
                } else {
                    if (obj == a) {
                        if (concurrentLinkedQueue.remove(agzaVar)) {
                            a();
                            throw new RejectedExecutionException();
                        }
                        return;
                    }
                    int i4 = agzaVar2.b;
                    if (a.av(atomicReference, agzaVar2, (agza) obj)) {
                        agzb agzbVar = this.t[i4];
                        Thread thread = agzbVar.b;
                        agzbVar.i = 1;
                        if (thread != null) {
                            LockSupport.unpark(thread);
                            return;
                        } else {
                            agzbVar.h.e.incrementAndGet();
                            agzbVar.b();
                            return;
                        }
                    }
                }
            }
        }
        throw new RejectedExecutionException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return ((agza) this.p.get()).a == a;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.o.getCount() == 0;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        b(false);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        b(true);
        ArrayList arrayList = new ArrayList();
        if (this.h.compareAndSet(false, true)) {
            while (true) {
                agza agzaVar = (agza) this.c.poll();
                if (agzaVar == null) {
                    break;
                }
                a();
                arrayList.add((Runnable) agzaVar.a);
            }
            this.g = true;
            for (agzb agzbVar : this.t) {
                Thread thread = agzbVar.c;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        return arrayList;
    }
}
