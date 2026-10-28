package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class mce extends ahch implements Runnable, ahew {
    final long a;
    final long b;
    final boolean c;
    final AtomicLong d = new AtomicLong(0);
    Runnable e;
    final /* synthetic */ mcg f;

    public mce(mcg mcgVar, Runnable runnable, long j, long j2, boolean z) {
        this.f = mcgVar;
        this.e = runnable;
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    private final long c() {
        return Math.max(0L, ((this.d.get() * this.b) + this.a) - this.f.a.b());
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Delayed delayed) {
        return mcg.a(this, delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(c(), TimeUnit.MILLISECONDS);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isDone()) {
            return;
        }
        this.d.incrementAndGet();
        try {
            this.e.run();
            boolean z = this.c;
            mcg mcgVar = this.f;
            if (z) {
                mcgVar.b.postDelayed(this, c());
            } else {
                mcgVar.b.postDelayed(this, this.b);
            }
        } catch (Throwable th) {
            this.e = null;
            setException(th);
        }
    }
}
