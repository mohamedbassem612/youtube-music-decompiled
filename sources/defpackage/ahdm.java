package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.lang.ref.Reference;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahdm {
    public static final boolean b;
    public final ahdk c;
    public static final aheu a = new aheu(ahdm.class);
    private static final int d = new int[]{1, 2}[0];

    static {
        boolean z = true;
        try {
            Reference.class.getMethod("reachabilityFence", Object.class).invoke(null, ahdm.class);
        } catch (IllegalAccessException | NoSuchMethodException unused) {
            z = false;
        } catch (InvocationTargetException e) {
            agfv.d(e.getCause());
            throw new AssertionError(e.getCause());
        }
        b = z;
    }

    public ahdm(ListenableFuture listenableFuture, ahde ahdeVar) {
        this.c = new ahdk(aheo.p(listenableFuture), ahdeVar);
        ahdi.b.add(new ahdi(this));
    }

    @Deprecated
    public static ahdm b(ListenableFuture listenableFuture, Executor executor) {
        ahdm ahdmVar = new ahdm(ahng.o(listenableFuture));
        ahda ahdaVar = new ahda(ahdmVar, executor, 0);
        listenableFuture.addListener(new ahei(listenableFuture, ahdaVar), MoreExecutors.directExecutor());
        return ahdmVar;
    }

    public static void f(AutoCloseable autoCloseable, Executor executor) {
        if (autoCloseable != null) {
            try {
                executor.execute(new acem(autoCloseable, 16));
            } catch (RejectedExecutionException e) {
                aheu aheuVar = a;
                if (aheuVar.a().isLoggable(Level.WARNING)) {
                    aheuVar.a().logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", String.format("while submitting close to %s; will close inline", executor), (Throwable) e);
                }
                f(autoCloseable, MoreExecutors.directExecutor());
            }
        }
    }

    public static aciz h(ahdm ahdmVar, ahdm... ahdmVarArr) {
        return new aciz(new agma(ahdmVar, ahdmVarArr));
    }

    private final ahdm i(aheo aheoVar) {
        try {
            ahdm ahdmVar = new ahdm(aheoVar);
            this.c.a(ahdmVar.c.b);
            return ahdmVar;
        } finally {
            ahng.A(d, this);
        }
    }

    public final ahdm a(Class cls, ahdf ahdfVar, Executor executor) {
        return i((aheo) ahbz.f(this.c.c, cls, new ahdc(this, ahdfVar), executor));
    }

    public final ahdm c(ahdf ahdfVar, Executor executor) {
        return i(this.c.c.r(new ahdb(this, ahdfVar, 0), executor));
    }

    public final ahdm d(ahdd ahddVar, Executor executor) {
        return i(this.c.c.r(new ahdb(this, ahddVar, 2), executor));
    }

    public final void e(ahde ahdeVar) {
        this.c.a(ahdeVar);
    }

    public final aheo g() {
        try {
            return this.c.d();
        } finally {
            ahng.A(d, this);
        }
    }

    public final String toString() {
        return this.c.toString();
    }

    public ahdm(ListenableFuture listenableFuture) {
        this(listenableFuture, new ahde());
    }
}
