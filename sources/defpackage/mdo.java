package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mdo implements ThreadFactory {
    private final /* synthetic */ int $cid;
    public final Object a;
    private final Object b;

    public mdo(int i) {
        this.$cid = i;
        this.a = Executors.defaultThreadFactory();
        this.b = new AtomicInteger(1);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (this.$cid == 0) {
            return this.b.newThread(new lfa(this, runnable, 12, (byte[]) null));
        }
        Thread threadNewThread = this.a.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + ((AtomicInteger) this.b).getAndIncrement());
        return threadNewThread;
    }

    public mdo(ThreadFactory threadFactory, mdm mdmVar, int i) {
        this.$cid = i;
        this.b = threadFactory;
        this.a = mdmVar;
    }
}
