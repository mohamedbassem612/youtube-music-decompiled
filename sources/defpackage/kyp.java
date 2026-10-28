package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kyp implements ThreadFactory {
    private final /* synthetic */ int $cid;
    private final Object a;

    public kyp(int i, byte[] bArr) {
        this.$cid = i;
        this.a = new AtomicInteger(0);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.$cid;
        if (i == 0) {
            Thread threadNewThread = this.a.newThread(runnable);
            threadNewThread.getClass();
            threadNewThread.setName("punch".concat(String.valueOf(threadNewThread.getName())));
            return threadNewThread;
        }
        if (i != 1) {
            Thread threadNewThread2 = this.a.newThread(runnable);
            threadNewThread2.setName("ScionFrontendApi");
            return threadNewThread2;
        }
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + ((AtomicInteger) this.a).getAndIncrement());
        return thread;
    }

    public kyp(int i) {
        this.$cid = i;
        this.a = Executors.defaultThreadFactory();
    }

    public kyp(int i, char[] cArr) {
        this.$cid = i;
        this.a = Executors.defaultThreadFactory();
    }
}
