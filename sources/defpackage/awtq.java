package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awtq {
    public static final AtomicLongFieldUpdater a = AtomicLongFieldUpdater.newUpdater(awtq.class, "b");
    public volatile long b;
    public final awro c;

    public awtq(long j, awro awroVar) {
        this.c = awroVar;
        this.b = j;
    }

    public final long a(long j) {
        return a.addAndGet(this, j);
    }

    public final long b() {
        return a.getAndIncrement(this);
    }

    public final boolean c(long j, long j2) {
        boolean zCompareAndSet = a.compareAndSet(this, j, j2);
        if (!zCompareAndSet || this.c == awts.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
