package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahde extends IdentityHashMap implements AutoCloseable {
    public final ahud a = new ahud(this, (byte[]) null);
    private volatile boolean b;
    private volatile CountDownLatch c;

    final ListenableFuture a(ahdf ahdfVar, Object obj) {
        ahde ahdeVar = new ahde();
        try {
            Object objA = ahdfVar.a(ahdeVar.a, obj);
            return objA == null ? aher.a : new aher(objA);
        } finally {
            b(ahdeVar, MoreExecutors.directExecutor());
        }
    }

    public final void b(AutoCloseable autoCloseable, Executor executor) {
        synchronized (this) {
            if (this.b) {
                ahdm.f(autoCloseable, executor);
            } else {
                put(autoCloseable, executor);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (!this.b) {
                this.b = true;
                for (Map.Entry entry : entrySet()) {
                    ahdm.f((AutoCloseable) entry.getKey(), (Executor) entry.getValue());
                }
                clear();
                CountDownLatch countDownLatch = this.c;
            }
        }
    }
}
