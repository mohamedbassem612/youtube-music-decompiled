package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mdk implements ThreadFactory {
    private final /* synthetic */ int $cid;
    private final Object a;

    public mdk(int i, byte[] bArr) {
        this.$cid = i;
        this.a = new AtomicInteger(1);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.$cid;
        if (i == 0) {
            return this.a.newThread(new lei(runnable, 20));
        }
        ?? r3 = this.a;
        if (i == 1) {
            Thread threadNewThread = r3.newThread(runnable);
            threadNewThread.setName("ScionClientUpload");
            return threadNewThread;
        }
        return new Thread(runnable, "CrAsyncTask #" + ((AtomicInteger) r3).getAndIncrement());
    }

    public mdk(int i) {
        this.$cid = i;
        this.a = Executors.defaultThreadFactory();
    }

    public mdk(ThreadFactory threadFactory, int i) {
        this.$cid = i;
        this.a = threadFactory;
    }
}
