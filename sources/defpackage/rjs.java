package defpackage;

import android.os.Looper;
import j$.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rjs {
    private static final Duration b = Duration.ofSeconds(1);
    public static final rbm a = new rbm("rjs");

    static {
        Duration.ofSeconds(1L);
    }

    private rjs() {
    }

    public static void a(Thread thread, Looper looper) {
        looper.quitSafely();
        Duration duration = b;
        thread.join(duration.toMillis());
        if (thread.isAlive()) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            looper.quit();
            thread.interrupt();
            thread.join(duration.toMillis());
            StackTraceElement[] stackTrace2 = thread.getStackTrace();
            rbc rbcVar = new rbc(a, stackTrace2.length > 0 ? rbd.e : rbd.d);
            Exception exc = new Exception("Stack trace sample");
            exc.setStackTrace(stackTrace);
            rbcVar.a = exc;
            rbcVar.c();
            rbcVar.a("Failed to join onto the thread %s even after shutdown, trace: %s, traceAfterInterrupt: %s", thread.getName(), stackTrace, stackTrace2);
        }
    }

    public static void b(ExecutorService executorService, String str) throws InterruptedException {
        executorService.shutdown();
        Duration duration = b;
        if (executorService.awaitTermination(duration.toSeconds(), TimeUnit.SECONDS)) {
            return;
        }
        executorService.shutdownNow();
        boolean zAwaitTermination = executorService.awaitTermination(duration.toSeconds(), TimeUnit.SECONDS);
        rbc rbcVar = new rbc(a, zAwaitTermination ? rbd.d : rbd.e);
        rbcVar.c();
        rbcVar.a("Failed to close %s normally, interruption helped=%b", str, Boolean.valueOf(zAwaitTermination));
    }

    public static void c() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("This should not be called on the main thread.");
        }
    }

    public static boolean d() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }
}
