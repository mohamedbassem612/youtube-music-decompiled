package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class aqh implements ListenableFuture {
    static final apy b;
    public static final /* synthetic */ int c = 0;
    private static final Object e;
    volatile aqc listeners;
    public volatile Object value;
    volatile aqg waiters;
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger d = Logger.getLogger(aqh.class.getName());

    static {
        apy aqfVar;
        try {
            aqfVar = new aqd(AtomicReferenceFieldUpdater.newUpdater(aqg.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(aqg.class, aqg.class, "next"), AtomicReferenceFieldUpdater.newUpdater(aqh.class, aqg.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(aqh.class, aqc.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(aqh.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            aqfVar = new aqf();
        }
        b = aqfVar;
        if (th != null) {
            d.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        e = new Object();
    }

    protected aqh() {
    }

    static Object a(ListenableFuture listenableFuture) {
        Object aqbVar;
        if (listenableFuture instanceof aqh) {
            Object obj = ((aqh) listenableFuture).value;
            if (!(obj instanceof apz)) {
                return obj;
            }
            apz apzVar = (apz) obj;
            if (!apzVar.c) {
                return obj;
            }
            Throwable th = apzVar.d;
            if (th == null) {
                return apz.b;
            }
            aqbVar = new apz(false, th);
        } else {
            boolean zIsCancelled = listenableFuture.isCancelled();
            if ((!a) && zIsCancelled) {
                return apz.b;
            }
            try {
                Object objI = a.i(listenableFuture);
                return objI == null ? e : objI;
            } catch (CancellationException e2) {
                if (zIsCancelled) {
                    return new apz(false, e2);
                }
                aqbVar = new aqb(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(listenableFuture))), e2));
            } catch (ExecutionException e3) {
                aqbVar = new aqb(e3.getCause());
            } catch (Throwable th2) {
                aqbVar = new aqb(th2);
            }
        }
        return aqbVar;
    }

    static void d(aqh aqhVar) {
        aqc aqcVar;
        aqc aqcVar2;
        aqc aqcVar3 = null;
        while (true) {
            aqg aqgVar = aqhVar.waiters;
            if (b.e(aqhVar, aqgVar, aqg.a)) {
                while (aqgVar != null) {
                    Thread thread = aqgVar.thread;
                    if (thread != null) {
                        aqgVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    aqgVar = aqgVar.next;
                }
                aqhVar.c();
                do {
                    aqcVar = aqhVar.listeners;
                } while (!b.c(aqhVar, aqcVar, aqc.a));
                while (true) {
                    aqcVar2 = aqcVar3;
                    aqcVar3 = aqcVar;
                    if (aqcVar3 == null) {
                        break;
                    }
                    aqcVar = aqcVar3.next;
                    aqcVar3.next = aqcVar2;
                }
                while (aqcVar2 != null) {
                    Runnable runnable = aqcVar2.b;
                    aqc aqcVar4 = aqcVar2.next;
                    if (runnable instanceof aqe) {
                        aqe aqeVar = (aqe) runnable;
                        aqhVar = aqeVar.a;
                        if (aqhVar.value == aqeVar) {
                            if (b.d(aqhVar, aqeVar, a(aqeVar.b))) {
                                aqcVar3 = aqcVar4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        j(runnable, aqcVar2.c);
                    }
                    aqcVar2 = aqcVar4;
                }
                return;
            }
        }
    }

    static void g(Object obj) {
        obj.getClass();
    }

    private final String h(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private final void i(StringBuilder sb) {
        try {
            Object objI = a.i(this);
            sb.append("SUCCESS, result=[");
            sb.append(h(objI));
            sb.append(']');
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append(']');
        }
    }

    private static void j(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            d.log(Level.SEVERE, a.bX(executor, runnable, "RuntimeException while executing runnable ", " with executor "), (Throwable) e2);
        }
    }

    private final void k(aqg aqgVar) {
        aqgVar.thread = null;
        while (true) {
            aqg aqgVar2 = this.waiters;
            if (aqgVar2 != aqg.a) {
                aqg aqgVar3 = null;
                while (aqgVar2 != null) {
                    aqg aqgVar4 = aqgVar2.next;
                    if (aqgVar2.thread != null) {
                        aqgVar3 = aqgVar2;
                    } else if (aqgVar3 != null) {
                        aqgVar3.next = aqgVar4;
                        if (aqgVar3.thread == null) {
                        }
                    } else if (b.e(this, aqgVar2, aqgVar4)) {
                    }
                    aqgVar2 = aqgVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object l(Object obj) throws ExecutionException {
        if (obj instanceof apz) {
            Throwable th = ((apz) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof aqb) {
            throw new ExecutionException(((aqb) obj).b);
        }
        if (obj == e) {
            return null;
        }
        return obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        aqc aqcVar = this.listeners;
        if (aqcVar != aqc.a) {
            aqc aqcVar2 = new aqc(runnable, executor);
            do {
                aqcVar2.next = aqcVar;
                if (b.c(this, aqcVar, aqcVar2)) {
                    return;
                } else {
                    aqcVar = this.listeners;
                }
            } while (aqcVar != aqc.a);
        }
        j(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String b() {
        Object obj = this.value;
        if (obj instanceof aqe) {
            return "setFuture=[" + h(((aqe) obj).b) + ']';
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        apz apzVar;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof aqe)) {
            return false;
        }
        if (a) {
            apzVar = new apz(z, new CancellationException("Future.cancel() was called."));
        } else {
            apzVar = z ? apz.a : apz.b;
        }
        boolean z2 = false;
        while (true) {
            if (b.d(this, obj, apzVar)) {
                d(this);
                if (!(obj instanceof aqe)) {
                    break;
                }
                ListenableFuture listenableFuture = ((aqe) obj).b;
                if (!(listenableFuture instanceof aqh)) {
                    listenableFuture.cancel(z);
                    break;
                }
                this = (aqh) listenableFuture;
                obj = this.value;
                if (!(obj == null) && !(obj instanceof aqe)) {
                    break;
                }
                z2 = true;
            } else {
                obj = this.value;
                if (!(obj instanceof aqe)) {
                    return z2;
                }
            }
        }
        return true;
    }

    public final boolean e(Object obj) {
        if (obj == null) {
            obj = e;
        }
        if (!b.d(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    public final boolean f(Throwable th) {
        g(th);
        if (!b.d(this, null, new aqb(th))) {
            return false;
        }
        d(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof aqe))) {
            return l(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            aqg aqgVar = this.waiters;
            if (aqgVar != aqg.a) {
                aqg aqgVar2 = new aqg();
                while (true) {
                    aqgVar2.a(aqgVar);
                    if (b.e(this, aqgVar, aqgVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                k(aqgVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof aqe))) {
                                return l(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        k(aqgVar2);
                        break;
                    }
                    aqgVar = this.waiters;
                    if (aqgVar == aqg.a) {
                    }
                }
            }
            return l(this.value);
        }
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null) && (!(obj3 instanceof aqe))) {
                return l(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String strConcat = "Waited " + j + ' ' + timeUnit.toString().toLowerCase(Locale.ROOT);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + ' ' + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(a.cd(string, strConcat, " for "));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof apz;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.value;
        return (obj != null) & (!(obj instanceof aqe));
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            i(sb);
        } else {
            try {
                strConcat = b();
            } catch (RuntimeException e2) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(e2.getClass())));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append(']');
            } else if (isDone()) {
                i(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    protected void c() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof aqe))) {
                return l(obj2);
            }
            aqg aqgVar = this.waiters;
            if (aqgVar != aqg.a) {
                aqg aqgVar2 = new aqg();
                do {
                    aqgVar2.a(aqgVar);
                    if (b.e(this, aqgVar, aqgVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                k(aqgVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof aqe))));
                        return l(obj);
                    }
                    aqgVar = this.waiters;
                } while (aqgVar != aqg.a);
            }
            return l(this.value);
        }
        throw new InterruptedException();
    }
}
