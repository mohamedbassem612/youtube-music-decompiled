package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awtp {
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(awtp.class, "b");
    public volatile int b;
    public final awro c;

    public awtp(int i, awro awroVar) {
        this.c = awroVar;
        this.b = i;
    }

    public final int a() {
        return a.decrementAndGet(this);
    }

    public final int b() {
        return a.incrementAndGet(this);
    }

    public final boolean c(int i, int i2) {
        boolean zCompareAndSet = a.compareAndSet(this, i, i2);
        if (!zCompareAndSet || this.c == awts.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
