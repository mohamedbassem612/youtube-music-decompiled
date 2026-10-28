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
/* JADX INFO: loaded from: classes3.dex */
public class epf implements ListenableFuture {
    static final eow b;
    public static final /* synthetic */ int f = 0;
    private static final Object h;
    volatile Object c;
    volatile epa d;
    volatile epe e;
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger g = Logger.getLogger(epf.class.getName());

    static {
        eow epdVar;
        try {
            epdVar = new epb(AtomicReferenceFieldUpdater.newUpdater(epe.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(epe.class, epe.class, "c"), AtomicReferenceFieldUpdater.newUpdater(epf.class, epe.class, "e"), AtomicReferenceFieldUpdater.newUpdater(epf.class, epa.class, "d"), AtomicReferenceFieldUpdater.newUpdater(epf.class, Object.class, "c"));
            th = null;
        } catch (Throwable th) {
            th = th;
            epdVar = new epd();
        }
        Throwable th2 = th;
        b = epdVar;
        if (th2 != null) {
            g.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        h = new Object();
    }

    protected epf() {
    }

    static void b(epf epfVar) {
        epe epeVar;
        eow eowVar;
        epa epaVar;
        do {
            epeVar = epfVar.e;
            eowVar = b;
        } while (!eowVar.e(epfVar, epeVar, epe.a));
        while (epeVar != null) {
            Thread thread = epeVar.b;
            if (thread != null) {
                epeVar.b = null;
                LockSupport.unpark(thread);
            }
            epeVar = epeVar.c;
        }
        do {
            epaVar = epfVar.d;
        } while (!eowVar.c(epfVar, epaVar, epa.a));
        epa epaVar2 = null;
        while (epaVar != null) {
            epa epaVar3 = epaVar.d;
            epaVar.d = epaVar2;
            epaVar2 = epaVar;
            epaVar = epaVar3;
        }
        while (epaVar2 != null) {
            Runnable runnable = epaVar2.b;
            epa epaVar4 = epaVar2.d;
            if (runnable instanceof epc) {
                epf epfVar2 = ((epc) runnable).a;
                throw null;
            }
            f(runnable, epaVar2.c);
            epaVar2 = epaVar4;
        }
    }

    static void d(Object obj) {
        obj.getClass();
    }

    private final void e(StringBuilder sb) {
        try {
            Object objI = a.i(this);
            sb.append("SUCCESS, result=[");
            sb.append(objI == this ? "this future" : String.valueOf(objI));
            sb.append(']');
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append(']');
        }
    }

    private static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            g.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", a.bX(executor, runnable, "RuntimeException while executing runnable ", " with executor "), (Throwable) e);
        }
    }

    private final void g(epe epeVar) {
        epeVar.b = null;
        while (true) {
            epe epeVar2 = this.e;
            if (epeVar2 != epe.a) {
                epe epeVar3 = null;
                while (epeVar2 != null) {
                    epe epeVar4 = epeVar2.c;
                    if (epeVar2.b != null) {
                        epeVar3 = epeVar2;
                    } else if (epeVar3 != null) {
                        epeVar3.c = epeVar4;
                        if (epeVar3.b == null) {
                        }
                    } else if (b.e(this, epeVar2, epeVar4)) {
                    }
                    epeVar2 = epeVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object h(Object obj) throws ExecutionException {
        if (obj instanceof eox) {
            Throwable th = ((eox) obj).c;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof eoz) {
            throw new ExecutionException(((eoz) obj).a);
        }
        if (obj == h) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String a() {
        Object obj = this.c;
        if (obj instanceof epc) {
            ListenableFuture listenableFuture = ((epc) obj).b;
            return "setFuture=[null]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        epa epaVar = this.d;
        epa epaVar2 = epa.a;
        if (epaVar != epaVar2) {
            epa epaVar3 = new epa(runnable, executor);
            do {
                epaVar3.d = epaVar;
                if (b.c(this, epaVar, epaVar3)) {
                    return;
                } else {
                    epaVar = this.d;
                }
            } while (epaVar != epaVar2);
        }
        f(runnable, executor);
    }

    protected boolean c(Object obj) {
        if (obj == null) {
            obj = h;
        }
        if (!b.d(this, null, obj)) {
            return false;
        }
        b(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        eox eoxVar;
        Object obj = this.c;
        if ((obj == null) | (obj instanceof epc)) {
            if (a) {
                eoxVar = new eox(new CancellationException("Future.cancel() was called."));
            } else {
                eoxVar = z ? eox.a : eox.b;
            }
            while (!b.d(this, obj, eoxVar)) {
                obj = this.c;
                if (!(obj instanceof epc)) {
                }
            }
            b(this);
            if (!(obj instanceof epc)) {
                return true;
            }
            ListenableFuture listenableFuture = ((epc) obj).b;
            throw null;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.c;
        boolean z2 = true;
        if ((obj != null) && (!(obj instanceof epc))) {
            return h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            epe epeVar = this.e;
            epe epeVar2 = epe.a;
            if (epeVar != epeVar2) {
                epe epeVar3 = new epe();
                while (true) {
                    epeVar3.a(epeVar);
                    z = z2;
                    if (b.e(this, epeVar, epeVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                g(epeVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.c;
                            if ((obj2 != null ? z : false) && (!(obj2 instanceof epc))) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        g(epeVar3);
                        break;
                    }
                    epeVar = this.e;
                    if (epeVar != epeVar2) {
                        z2 = z;
                    }
                }
            }
            return h(this.c);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.c;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof epc))) {
                return h(obj3);
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
        return this.c instanceof eox;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.c;
        return (obj != null) & (!(obj instanceof epc));
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            try {
                strConcat = a();
            } catch (RuntimeException e) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(e.getClass())));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append(']');
            } else if (isDone()) {
                e(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.c;
            if ((obj2 != null) & (!(obj2 instanceof epc))) {
                return h(obj2);
            }
            epe epeVar = this.e;
            epe epeVar2 = epe.a;
            if (epeVar != epeVar2) {
                epe epeVar3 = new epe();
                do {
                    epeVar3.a(epeVar);
                    if (b.e(this, epeVar, epeVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.c;
                            } else {
                                g(epeVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof epc))));
                        return h(obj);
                    }
                    epeVar = this.e;
                } while (epeVar != epeVar2);
            }
            return h(this.c);
        }
        throw new InterruptedException();
    }
}
