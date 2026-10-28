package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agde implements Runnable {
    final /* synthetic */ SettableFuture a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ AtomicReference c;
    final /* synthetic */ ahey d;
    final /* synthetic */ long e;
    final /* synthetic */ long f;
    final /* synthetic */ mbc g;

    public agde(SettableFuture settableFuture, Runnable runnable, AtomicReference atomicReference, ahey aheyVar, long j, long j2, mbc mbcVar) {
        this.a = settableFuture;
        this.b = runnable;
        this.c = atomicReference;
        this.d = aheyVar;
        this.e = j;
        this.f = j2;
        this.g = mbcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            SettableFuture settableFuture = this.a;
            if (settableFuture.isDone()) {
                return;
            }
            this.b.run();
            SettableFuture settableFutureCreate = SettableFuture.create();
            this.c.set(settableFutureCreate);
            if (settableFuture.isDone()) {
                return;
            }
            ahey aheyVar = this.d;
            long j = this.e;
            long j2 = this.f;
            long jB = this.g.b();
            settableFutureCreate.setFuture(aheyVar.schedule(this, jB < j ? (j + j2) - jB : j2 - ((jB - j) % j2), TimeUnit.MILLISECONDS));
        } catch (Throwable th) {
            this.a.setException(th);
        }
    }

    public final String toString() {
        return this.b.toString();
    }
}
