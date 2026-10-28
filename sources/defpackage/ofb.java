package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ofb {
    private final obk a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private long c = -1;
    private long d = -1;
    private Throwable e = null;
    private final int f;

    public ofb(int i, obk obkVar) {
        this.f = i;
        this.a = obkVar;
    }

    public final void a() {
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.getAndSet(true)) {
            throw new IllegalStateException("Finished trace.");
        }
        this.d = SystemClock.uptimeMillis();
        this.a.b(this.f - 1, atomicBoolean.get() ? this.d - this.c : -1L, this.e, null);
    }

    public final void b(Throwable th) {
        if (this.b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.e = th;
    }

    public final void c() {
        if (this.b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.c = SystemClock.uptimeMillis();
    }
}
