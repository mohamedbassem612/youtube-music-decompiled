package defpackage;

import android.os.Binder;
import android.os.Process;
import android.os.StrictMode;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mci {
    private static final agrf b = agrf.h("com/google/android/libraries/concurrent/blockable/BlockableFutures");
    public static final ThreadLocal a = new mch();

    public static Object a(Future future) {
        b();
        return future.get();
    }

    public static void b() {
        if (((Boolean) a.get()).booleanValue()) {
            return;
        }
        if (Binder.getCallingPid() != Process.myPid()) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!threadCurrentThread.getName().startsWith("Binder:")) {
                StackTraceElement[] stackTrace = threadCurrentThread.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[length];
                    if (Binder.class.getName().equals(stackTraceElement.getClassName()) && "execTransact".equals(stackTraceElement.getMethodName())) {
                        c();
                        return;
                    }
                }
            } else {
                c();
                return;
            }
        }
        IllegalStateException illegalStateException = new IllegalStateException("Cannot block on non-blocking thread: ".concat(String.valueOf(Thread.currentThread().getName())));
        int iOrdinal = mcj.d.ordinal();
        if (iOrdinal == 0) {
            ((agrc) ((agrc) ((agrc) b.b()).j(illegalStateException)).k("com/google/android/libraries/concurrent/blockable/BlockableFutures", "validateThreadIsBlockable", (char) 139, "BlockableFutures.java")).t("Cannot block on non-blocking thread");
        } else if (iOrdinal == 1) {
            StrictMode.noteSlowCall(illegalStateException.getMessage());
        } else if (iOrdinal == 2) {
            qpj.e(new lei(illegalStateException, 17));
            throw illegalStateException;
        }
    }

    static void c() {
        a.set(Boolean.TRUE);
    }
}
