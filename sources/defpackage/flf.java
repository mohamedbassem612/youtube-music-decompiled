package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class flf implements Runnable {
    public final Throwable b;

    private flf(boolean z) {
        if (!z) {
            this.b = null;
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        this.b = new Throwable("Runnable instantiated on thread id: " + threadCurrentThread.getId() + ", name: " + threadCurrentThread.getName());
    }

    public abstract void a(flf flfVar);

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a(this);
        } catch (Throwable th) {
            Throwable th2 = this.b;
            if (th2 != null) {
                Log.w("LithoThreadTracing", "--- start debug trace");
                Log.w("LithoThreadTracing", "Thread tracing stacktrace", th2);
                Log.w("LithoThreadTracing", "--- end debug trace");
            }
            throw th;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public flf(flf flfVar) {
        boolean z = false;
        if (flfVar != null) {
            if (flfVar.b != null) {
                z = true;
            }
        } else {
            boolean z2 = fna.a;
        }
        this(z);
        Throwable th = this.b;
        if (th == null || flfVar == null) {
            return;
        }
        th.initCause(flfVar.b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public flf() {
        this(false);
        boolean z = fna.a;
    }
}
