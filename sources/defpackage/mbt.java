package defpackage;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mbt implements Runnable {
    public static final /* synthetic */ int a = 0;
    private static final agfr b = aguu.al(new jxp(3));
    private static final Logger c = Logger.getLogger("ErrorLoggingExecutor");
    private final Runnable d;
    private final awmd e;

    public mbt(Runnable runnable, awmd awmdVar) {
        this.d = runnable;
        this.e = awmdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.d.run();
        } catch (Throwable th) {
            if (((Boolean) ((agev) ((aupo) this.e).b).e(Boolean.FALSE)).booleanValue()) {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                return;
            }
            try {
                ((agrc) ((agrc) ((agrc) ((agrf) b.io()).b()).j(th)).k("com/google/android/libraries/concurrent/ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable", "run", 95, "ExceptionHandlingExecutorFactory.java")).t("Uncaught exception from runnable");
            } catch (Throwable th2) {
                Logger logger = c;
                logger.logp(Level.SEVERE, "com.google.android.libraries.concurrent.ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable", "run", "GoogleLogger failed to log", th2);
                Log.e("ErrorLoggingExecutor", "GoogleLogger failed to log", th2);
                logger.logp(Level.SEVERE, "com.google.android.libraries.concurrent.ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable", "run", "Uncaught exception from runnable", th);
                Log.e("ErrorLoggingExecutor", "Uncaught exception from runnable", th);
            }
        }
    }

    public final String toString() {
        return this.d.toString();
    }
}
