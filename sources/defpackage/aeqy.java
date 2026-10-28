package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aeqy implements Runnable {
    final /* synthetic */ SettableFuture a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ AtomicReference c;
    final /* synthetic */ ahey d;
    final /* synthetic */ long e;
    final /* synthetic */ LinkedList f;
    final /* synthetic */ mbc g;

    public aeqy(SettableFuture settableFuture, Runnable runnable, AtomicReference atomicReference, ahey aheyVar, long j, LinkedList linkedList, mbc mbcVar) {
        this.a = settableFuture;
        this.b = runnable;
        this.c = atomicReference;
        this.d = aheyVar;
        this.e = j;
        this.f = linkedList;
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
            LinkedList linkedList = this.f;
            long jB = this.g.b();
            long jLongValue = ((Long) linkedList.peek()).longValue();
            if (linkedList.size() > 1) {
                linkedList.removeFirst();
            }
            settableFutureCreate.setFuture(aheyVar.schedule(this, jB < j ? (j + jLongValue) - jB : jLongValue - ((jB - j) % jLongValue), TimeUnit.MILLISECONDS));
        } catch (Throwable th) {
            this.a.setException(th);
        }
    }

    public final String toString() {
        return this.b.toString();
    }
}
