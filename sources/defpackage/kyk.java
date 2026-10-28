package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kyk implements ScheduledFuture, Runnable, kyl {
    private final Runnable a;
    private final ExecutorService b;
    private final ScheduledExecutorService c;
    private final boolean d;
    private final long e;
    private volatile ScheduledFuture g;
    private volatile Future h;
    private volatile Thread i;
    private boolean j;
    private volatile boolean k;
    private volatile boolean l;
    private volatile boolean m;
    private volatile long r;
    private final qcb s;
    private final Object n = new Object();
    private final CountDownLatch o = new CountDownLatch(1);
    private final Runnable p = new kcx(this, 15);
    private Throwable q = null;
    private final long f = kym.a.getAndIncrement();

    public kyk(Runnable runnable, long j, long j2, TimeUnit timeUnit, boolean z, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, qcb qcbVar) {
        this.a = runnable;
        this.d = z;
        this.e = timeUnit.toNanos(j2);
        this.b = executorService;
        this.c = scheduledExecutorService;
        this.s = qcbVar;
        this.r = kym.a(j, timeUnit);
    }

    private final void e(Throwable th) {
        synchronized (this.n) {
            if (this.l || this.k) {
                return;
            }
            this.q = th;
            this.l = true;
            ScheduledFuture scheduledFuture = this.g;
            Future future = this.h;
            this.o.countDown();
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            if (future != null) {
                future.cancel(false);
            }
            qcb qcbVar = this.s;
            if (qcbVar != null) {
                qcbVar.j(this);
            }
        }
    }

    private final void f() {
        try {
            synchronized (this.n) {
                if (this.k || this.l) {
                    return;
                }
                if (this.d) {
                    this.r += this.e;
                } else {
                    this.r = System.nanoTime() + this.e;
                }
                this.g = this.c.schedule(this.p, Math.max(this.r - System.nanoTime(), 0L), TimeUnit.NANOSECONDS);
            }
        } catch (RejectedExecutionException unused) {
            cancel(false);
        } catch (Throwable th) {
            e(th);
        }
    }

    @Override // defpackage.kyl
    public final long a() {
        return this.f;
    }

    @Override // defpackage.kyl
    public final long b() {
        return this.r;
    }

    public final void c() {
        Throwable th;
        try {
            synchronized (this.n) {
                if (this.k || this.l) {
                    return;
                }
                boolean z = true;
                this.j = true;
                try {
                    Future<?> futureSubmit = this.b.submit(this);
                    try {
                        if (this.j) {
                            this.h = futureSubmit;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (z) {
                            throw th;
                        }
                        this.j = false;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z = false;
                }
            }
        } catch (RejectedExecutionException unused) {
            cancel(false);
        } catch (Throwable th4) {
            e(th4);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this.n) {
            if (this.l || this.k) {
                return false;
            }
            this.k = true;
            this.l = true;
            ScheduledFuture scheduledFuture = this.g;
            Future future = this.h;
            Thread thread = this.i;
            if (z && thread != null) {
                this.m = true;
                thread.interrupt();
            }
            this.o.countDown();
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            if (future != null) {
                future.cancel(false);
            }
            qcb qcbVar = this.s;
            if (qcbVar != null) {
                qcbVar.j(this);
            }
            return true;
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        Delayed delayed2 = delayed;
        if (this == delayed2) {
            return 0;
        }
        if (!(delayed2 instanceof kyl)) {
            return Long.compare(getDelay(TimeUnit.NANOSECONDS), delayed2.getDelay(TimeUnit.NANOSECONDS));
        }
        kyl kylVar = (kyl) delayed2;
        int iSignum = Long.signum(this.r - kylVar.b());
        return iSignum != 0 ? iSignum : Long.compare(this.f, kylVar.a());
    }

    final void d() {
        synchronized (this.n) {
            if (this.k || this.l) {
                return;
            }
            this.g = this.c.schedule(this.p, Math.max(this.r - System.nanoTime(), 0L), TimeUnit.NANOSECONDS);
        }
    }

    @Override // java.util.concurrent.Future
    public final /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) throws TimeoutException {
        if (!this.o.await(j, timeUnit)) {
            throw new TimeoutException();
        }
        if (this.k) {
            throw new CancellationException();
        }
        synchronized (this.n) {
            if (this.q != null) {
                throw new ExecutionException(this.q);
            }
        }
        return null;
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.r - System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.k;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            Object obj = this.n;
            synchronized (obj) {
                if (this.k || this.l) {
                    synchronized (this.n) {
                        this.j = false;
                        this.i = null;
                        this.h = null;
                    }
                    if (z) {
                        return;
                    } else {
                        return;
                    }
                }
                this.i = Thread.currentThread();
                this.a.run();
                synchronized (obj) {
                    this.j = false;
                    this.i = null;
                    this.h = null;
                }
                if (this.m) {
                    Thread.interrupted();
                }
                f();
            }
        } catch (Throwable th) {
            try {
                e(th);
            } finally {
                synchronized (this.n) {
                    this.j = false;
                    this.i = null;
                    this.h = null;
                    if (this.m) {
                        Thread.interrupted();
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final /* bridge */ /* synthetic */ Object get() throws InterruptedException {
        this.o.await();
        if (!this.k) {
            synchronized (this.n) {
                if (this.q != null) {
                    throw new ExecutionException(this.q);
                }
            }
            return null;
        }
        throw new CancellationException();
    }
}
