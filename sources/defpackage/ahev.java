package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahev extends FutureTask implements ListenableFuture {
    private final ahdv a;

    public ahev(Runnable runnable) {
        super(runnable, null);
        this.a = new ahdv();
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        ahdv ahdvVar = this.a;
        synchronized (ahdvVar.a) {
            if (ahdvVar.b) {
                ahdv.a(runnable, executor);
            } else {
                ahdvVar.c = new ahto(runnable, executor, ahdvVar.c);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        ahdv ahdvVar = this.a;
        synchronized (ahdvVar.a) {
            if (ahdvVar.b) {
                return;
            }
            ahdvVar.b = true;
            Object obj = ahdvVar.c;
            Object obj2 = null;
            ahdvVar.c = null;
            while (obj != null) {
                ahto ahtoVar = (ahto) obj;
                Object obj3 = ahtoVar.c;
                ahtoVar.c = obj2;
                obj2 = obj;
                obj = obj3;
            }
            while (obj2 != null) {
                ahto ahtoVar2 = (ahto) obj2;
                ahdv.a(ahtoVar2.b, ahtoVar2.a);
                obj2 = ahtoVar2.c;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        return nanos <= 2147483647999999999L ? super.get(j, timeUnit) : super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }

    public ahev(Callable callable) {
        super(callable);
        this.a = new ahdv();
    }
}
