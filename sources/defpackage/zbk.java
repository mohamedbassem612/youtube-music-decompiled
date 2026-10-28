package defpackage;

import java.io.InterruptedIOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zbk {
    private final long b;
    private CyclicBarrier d;
    private final Set a = new HashSet();
    private final Set c = new HashSet();
    private long e = -1;

    public zbk(long j) {
        this.b = j;
    }

    final long a(zbd zbdVar, long j) throws InterruptedIOException {
        synchronized (this) {
            Set set = this.c;
            if (!set.contains(zbdVar)) {
                return j;
            }
            CyclicBarrier cyclicBarrier = this.d;
            if (cyclicBarrier == null) {
                cyclicBarrier = new CyclicBarrier(set.size());
                this.d = cyclicBarrier;
            }
            long j2 = this.e;
            if (j2 == -1 || j2 < j) {
                this.e = j;
            }
            try {
                long j3 = this.b;
                if (j3 > 0) {
                    cyclicBarrier.await(j3, TimeUnit.MILLISECONDS);
                } else {
                    cyclicBarrier.await();
                }
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (BrokenBarrierException | TimeoutException unused2) {
            }
            synchronized (this) {
                this.d = null;
                this.c.clear();
            }
            return this.e;
        }
    }

    final synchronized long b(long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            long jC = ((zbd) it.next()).c(j);
            if (jC != -1) {
                return jC;
            }
        }
        return -1L;
    }

    final synchronized void c(zbd zbdVar) {
        CyclicBarrier cyclicBarrier = this.d;
        if (cyclicBarrier != null) {
            cyclicBarrier.reset();
            this.d = null;
        }
        this.a.add(zbdVar);
    }

    final synchronized void d() {
        CyclicBarrier cyclicBarrier = this.d;
        if (cyclicBarrier != null) {
            cyclicBarrier.reset();
            this.d = null;
        }
        this.c.clear();
    }

    final synchronized void e(zbd zbdVar) {
        CyclicBarrier cyclicBarrier = this.d;
        if (cyclicBarrier != null) {
            cyclicBarrier.reset();
            this.d = null;
        }
        this.a.remove(zbdVar);
    }

    final synchronized void f(zbd zbdVar) {
        if (!this.a.contains(zbdVar)) {
            throw new IllegalArgumentException();
        }
        CyclicBarrier cyclicBarrier = this.d;
        if (cyclicBarrier != null) {
            cyclicBarrier.reset();
            this.d = null;
        }
        this.c.add(zbdVar);
    }
}
