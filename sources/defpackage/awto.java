package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awto {
    private static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(awto.class, "b");
    private volatile int b;
    private final awro c;

    public awto(boolean z, awro awroVar) {
        this.c = awroVar;
        this.b = z ? 1 : 0;
    }

    public final boolean a() {
        return this.b != 0;
    }

    public final boolean b() {
        boolean zCompareAndSet = a.compareAndSet(this, 0, 1);
        if (!zCompareAndSet || this.c == awts.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final void c() {
        this.b = 1;
    }

    public final String toString() {
        return String.valueOf(a());
    }
}
