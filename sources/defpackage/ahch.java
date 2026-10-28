package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ahch extends ahco {
    private static Object c(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    ahng.c();
                }
                throw th;
            }
        }
        if (z) {
            ahng.c();
        }
        return obj;
    }

    private final void d(StringBuilder sb) {
        try {
            Object objC = c(this);
            sb.append("SUCCESS, result=[");
            if (objC == null) {
                sb.append("null");
            } else if (objC == this) {
                sb.append("this future");
            } else {
                sb.append(objC.getClass().getName());
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(objC)));
            }
            sb.append(']');
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append(']');
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            h.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", a.cc(executor, runnable, "RuntimeException while executing runnable ", " with executor "), (Throwable) e);
        }
    }

    static Object g(Object obj) throws ExecutionException {
        if (obj instanceof ahca) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((ahca) obj).d);
            throw cancellationException;
        }
        if (obj instanceof ahcd) {
            throw new ExecutionException(((ahcd) obj).b);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(ListenableFuture listenableFuture) {
        Object ahcaVar;
        Throwable thI;
        if (listenableFuture instanceof ahcf) {
            Object ahcaVar2 = ((ahch) listenableFuture).valueField;
            if (ahcaVar2 instanceof ahca) {
                ahca ahcaVar3 = (ahca) ahcaVar2;
                if (ahcaVar3.c) {
                    Throwable th = ahcaVar3.d;
                    ahcaVar2 = th != null ? new ahca(false, th) : ahca.b;
                }
            }
            ahcaVar2.getClass();
            return ahcaVar2;
        }
        if ((listenableFuture instanceof ahfq) && (thI = ((ahfq) listenableFuture).i()) != null) {
            return new ahcd(thI);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!i) && zIsCancelled) {
            ahca ahcaVar4 = ahca.b;
            ahcaVar4.getClass();
            return ahcaVar4;
        }
        try {
            Object objC = c(listenableFuture);
            if (zIsCancelled) {
                objC = new ahca(false, new IllegalArgumentException(a.cp(listenableFuture, "get() did not throw CancellationException, despite reporting isCancelled() == true: ")));
            } else if (objC == null) {
                return g;
            }
            return objC;
        } catch (Error e) {
            e = e;
            return new ahcd(e);
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new ahca(false, e2);
            }
            ahcaVar = new ahcd(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(listenableFuture))), e2));
            return ahcaVar;
        } catch (ExecutionException e3) {
            if (!zIsCancelled) {
                return new ahcd(e3.getCause());
            }
            ahcaVar = new ahca(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(listenableFuture))), e3));
            return ahcaVar;
        } catch (Exception e4) {
            e = e4;
            return new ahcd(e);
        }
    }

    public static void j(ahch ahchVar, boolean z) {
        ahce ahceVar = null;
        while (true) {
            for (ahcn ahcnVarB = ahco.j.b(ahchVar, ahcn.a); ahcnVarB != null; ahcnVarB = ahcnVarB.next) {
                Thread thread = ahcnVarB.thread;
                if (thread != null) {
                    ahcnVarB.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                ahchVar.k();
            }
            ahchVar.gH();
            ahce ahceVar2 = ahceVar;
            ahce ahceVarA = ahco.j.a(ahchVar, ahce.a);
            ahce ahceVar3 = ahceVar2;
            while (ahceVarA != null) {
                ahce ahceVar4 = ahceVarA.next;
                ahceVarA.next = ahceVar3;
                ahceVar3 = ahceVarA;
                ahceVarA = ahceVar4;
            }
            while (ahceVar3 != null) {
                Runnable runnable = ahceVar3.b;
                ahceVar = ahceVar3.next;
                runnable.getClass();
                if (runnable instanceof ahcb) {
                    ahcb ahcbVar = (ahcb) runnable;
                    ahchVar = ahcbVar.a;
                    if (ahchVar.valueField == ahcbVar) {
                        if (ahco.j.f(ahchVar, ahcbVar, h(ahcbVar.b))) {
                            z = false;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = ahceVar3.c;
                    executor.getClass();
                    e(runnable, executor);
                }
                ahceVar3 = ahceVar;
            }
            return;
        }
    }

    public void addListener(Runnable runnable, Executor executor) {
        ahce ahceVar;
        runnable.getClass();
        executor.getClass();
        if (!isDone() && (ahceVar = this.listenersField) != ahce.a) {
            ahce ahceVar2 = new ahce(runnable, executor);
            do {
                ahceVar2.next = ahceVar;
                if (ahco.j.e(this, ahceVar, ahceVar2)) {
                    return;
                } else {
                    ahceVar = this.listenersField;
                }
            } while (ahceVar != ahce.a);
        }
        e(runnable, executor);
    }

    public boolean cancel(boolean z) {
        ahca ahcaVar;
        Object obj = this.valueField;
        if (!(obj == null) && !(obj instanceof ahcb)) {
            return false;
        }
        if (i) {
            ahcaVar = new ahca(z, new CancellationException("Future.cancel() was called."));
        } else {
            ahcaVar = z ? ahca.a : ahca.b;
            ahcaVar.getClass();
        }
        boolean z2 = false;
        while (true) {
            if (ahco.j.f(this, obj, ahcaVar)) {
                j(this, z);
                if (obj instanceof ahcb) {
                    ListenableFuture listenableFuture = ((ahcb) obj).b;
                    if (listenableFuture instanceof ahcf) {
                        this = (ahch) listenableFuture;
                        obj = this.valueField;
                        if ((obj == null) | (obj instanceof ahcb)) {
                            z2 = true;
                        }
                    } else {
                        listenableFuture.cancel(z);
                    }
                }
                return true;
            }
            obj = this.valueField;
            if (!(obj instanceof ahcb)) {
                return z2;
            }
        }
    }

    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof ahcb))) {
            return g(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            ahcn ahcnVar = this.waitersField;
            if (ahcnVar != ahcn.a) {
                ahcn ahcnVar2 = new ahcn();
                while (true) {
                    ahco.j.c(ahcnVar2, ahcnVar);
                    if (super.o(ahcnVar, ahcnVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                super.n(ahcnVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && (!(obj2 instanceof ahcb))) {
                                return g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        super.n(ahcnVar2);
                        break;
                    }
                    ahcnVar = this.waitersField;
                    if (ahcnVar == ahcn.a) {
                    }
                }
            }
            Object obj3 = this.valueField;
            obj3.getClass();
            return g(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && (!(obj4 instanceof ahcb))) {
                return g(obj4);
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

    @Override // defpackage.ahfq
    public final Throwable i() {
        if (this instanceof ahcf) {
            Object obj = this.valueField;
            if (obj instanceof ahcd) {
                return ((ahcd) obj).b;
            }
        }
        return null;
    }

    public boolean isCancelled() {
        return this.valueField instanceof ahca;
    }

    public boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & (!(obj instanceof ahcb));
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String jK() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void l(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(m());
        }
    }

    public final boolean m() {
        Object obj = this.valueField;
        return (obj instanceof ahca) && ((ahca) obj).c;
    }

    public boolean set(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!ahco.j.f(this, null, obj)) {
            return false;
        }
        j(this, false);
        return true;
    }

    public boolean setException(Throwable th) {
        if (!ahco.j.f(this, null, new ahcd(th))) {
            return false;
        }
        j(this, false);
        return true;
    }

    public boolean setFuture(ListenableFuture listenableFuture) {
        ahcd ahcdVar;
        listenableFuture.getClass();
        Object obj = this.valueField;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!ahco.j.f(this, null, h(listenableFuture))) {
                    return false;
                }
                j(this, false);
            } else {
                ahcb ahcbVar = new ahcb(this, listenableFuture);
                if (ahco.j.f(this, null, ahcbVar)) {
                    try {
                        listenableFuture.addListener(ahcbVar, ahds.INSTANCE);
                    } catch (Throwable th) {
                        try {
                            ahcdVar = new ahcd(th);
                        } catch (Error | Exception unused) {
                            ahcdVar = ahcd.a;
                        }
                        ahco.j.f(this, ahcbVar, ahcdVar);
                    }
                } else {
                    obj = this.valueField;
                }
            }
            return true;
        }
        if (!(obj instanceof ahca)) {
            return false;
        }
        listenableFuture.cancel(((ahca) obj).c);
        return false;
    }

    public String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            d(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof ahcb) {
                sb.append(", setFuture=[");
                ListenableFuture listenableFuture = ((ahcb) obj).b;
                try {
                    if (listenableFuture == this) {
                        sb.append("this future");
                    } else {
                        sb.append(listenableFuture);
                    }
                } catch (Throwable th) {
                    ahng.e(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append(']');
            } else {
                try {
                    strConcat = jK();
                    if (true == ahno.aa(strConcat)) {
                        strConcat = null;
                    }
                } catch (Throwable th2) {
                    ahng.e(th2);
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(th2.getClass())));
                }
                if (strConcat != null) {
                    sb.append(", info=[");
                    sb.append(strConcat);
                    sb.append(']');
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                d(sb);
            }
        }
        sb.append(']');
        return sb.toString();
    }

    protected void gH() {
    }

    protected void k() {
    }

    public Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.valueField;
            if ((obj2 != null) & (!(obj2 instanceof ahcb))) {
                return g(obj2);
            }
            ahcn ahcnVar = this.waitersField;
            if (ahcnVar != ahcn.a) {
                ahcn ahcnVar2 = new ahcn();
                do {
                    ahco.j.c(ahcnVar2, ahcnVar);
                    if (super.o(ahcnVar, ahcnVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.valueField;
                            } else {
                                super.n(ahcnVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof ahcb))));
                        return g(obj);
                    }
                    ahcnVar = this.waitersField;
                } while (ahcnVar != ahcn.a);
            }
            Object obj3 = this.valueField;
            obj3.getClass();
            return g(obj3);
        }
        throw new InterruptedException();
    }
}
