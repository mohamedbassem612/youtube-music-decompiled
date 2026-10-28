package defpackage;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awjj extends avma implements avmn {
    public volatile boolean c;
    final PriorityBlockingQueue a = new PriorityBlockingQueue();
    private final AtomicInteger d = new AtomicInteger();
    final AtomicInteger b = new AtomicInteger();

    @Override // defpackage.avma
    public final avmn a(Runnable runnable) {
        return e(runnable, d(TimeUnit.MILLISECONDS));
    }

    @Override // defpackage.avma
    public final avmn b(Runnable runnable, long j, TimeUnit timeUnit) {
        long jD = d(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
        return e(new kvx(runnable, this, jD, 2), jD);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.c = true;
    }

    final avmn e(Runnable runnable, long j) {
        if (!this.c) {
            awji awjiVar = new awji(runnable, Long.valueOf(j), this.b.incrementAndGet());
            PriorityBlockingQueue priorityBlockingQueue = this.a;
            priorityBlockingQueue.add(awjiVar);
            AtomicInteger atomicInteger = this.d;
            if (atomicInteger.getAndIncrement() != 0) {
                return new avmq(new awim(this, awjiVar, 2));
            }
            int iAddAndGet = 1;
            while (!this.c) {
                awji awjiVar2 = (awji) priorityBlockingQueue.poll();
                if (awjiVar2 == null) {
                    iAddAndGet = atomicInteger.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                    }
                } else if (!awjiVar2.d) {
                    awjiVar2.a.run();
                }
            }
            priorityBlockingQueue.clear();
            return avns.a;
        }
        return avns.a;
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.c;
    }
}
