package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awux extends awvt implements Runnable {
    private static volatile Thread _thread;
    public static final awux a;
    private static volatile int debugStatus;
    private static final long e;

    static {
        Long l;
        awux awuxVar = new awux();
        a = awuxVar;
        awuxVar.p(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        e = timeUnit.toNanos(l.longValue());
    }

    private final synchronized boolean A() {
        if (B()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private static final boolean B() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    private static final void C() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    private final synchronized Thread y() {
        Thread thread = _thread;
        if (thread != null) {
            return thread;
        }
        Thread thread2 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
        _thread = thread2;
        thread2.setContextClassLoader(a.getClass().getClassLoader());
        thread2.setDaemon(true);
        thread2.start();
        return thread2;
    }

    private final synchronized void z() {
        if (B()) {
            debugStatus = 3;
            ((awvt) this).c.c(null);
            this.d.c(null);
            notifyAll();
        }
    }

    @Override // defpackage.awvt, defpackage.awvb
    public final awvk c(long j, Runnable runnable, awou awouVar) {
        return u(j, runnable);
    }

    @Override // defpackage.awvo
    protected final Thread h() {
        Thread thread = _thread;
        return thread == null ? y() : thread;
    }

    @Override // defpackage.awvt
    public final void j(Runnable runnable) {
        if (debugStatus == 4) {
            C();
        }
        super.j(runnable);
    }

    @Override // defpackage.awvo
    protected final void k(long j, awvr awvrVar) {
        C();
    }

    @Override // defpackage.awvt, defpackage.awvo
    public final void l() {
        debugStatus = 4;
        super.l();
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThreadLocal threadLocal = awxh.a;
        awxh.a.set(this);
        try {
            if (A()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jM = m();
                    if (jM == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = e + jNanoTime;
                        }
                        jM = j - jNanoTime;
                        if (jM <= 0) {
                            break;
                        } else if (jM >= Long.MAX_VALUE) {
                            jM = Long.MAX_VALUE;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jM > 0) {
                        if (B()) {
                            break;
                        } else {
                            LockSupport.parkNanos(this, jM);
                        }
                    }
                }
            }
        } finally {
            _thread = null;
            z();
            if (!x()) {
                h();
            }
        }
    }

    @Override // defpackage.awuq
    public final String toString() {
        return "DefaultExecutor";
    }
}
