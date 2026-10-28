package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kyj extends FutureTask implements ScheduledFuture, kyl {
    public volatile ScheduledFuture a;
    final /* synthetic */ kym b;
    private final long c;
    private final long d;
    private boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyj(kym kymVar, Callable callable, long j, TimeUnit timeUnit) {
        super(callable);
        this.b = kymVar;
        this.c = kym.a.getAndIncrement();
        this.d = kym.a(j, timeUnit);
    }

    @Override // defpackage.kyl
    public final long a() {
        return this.c;
    }

    @Override // defpackage.kyl
    public final long b() {
        return this.d;
    }

    public final void c() {
        if (isCancelled()) {
            return;
        }
        kym kymVar = this.b;
        synchronized (kymVar.c) {
            if (isCancelled() || this.e || !kymVar.d.contains(this)) {
                return;
            }
            this.e = true;
            kymVar.f--;
            try {
                kymVar.b.execute(this);
            } catch (RejectedExecutionException unused) {
                cancel(false);
            } catch (Throwable th) {
                setException(th);
            }
            kym kymVar2 = this.b;
            kymVar2.b();
            kymVar2.c.notifyAll();
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = super.cancel(z);
        kym kymVar = this.b;
        kymVar.d.remove(this);
        ScheduledFuture scheduledFuture = this.a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        Object obj = kymVar.c;
        synchronized (obj) {
            if (zCancel) {
                if (!this.e) {
                    this.e = true;
                    kymVar.f--;
                }
                kymVar.b();
                obj.notifyAll();
            } else {
                kymVar.b();
                obj.notifyAll();
            }
            throw th;
        }
        return zCancel;
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
        int iSignum = Long.signum(this.d - kylVar.b());
        return iSignum != 0 ? iSignum : Long.compare(this.c, kylVar.a());
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        kym kymVar = this.b;
        kymVar.d.remove(this);
        Object obj = kymVar.c;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.d - System.nanoTime(), TimeUnit.NANOSECONDS);
    }
}
