package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ktb implements ThreadFactory {
    private final /* synthetic */ int $cid;
    private final Object a;
    private final Object b;

    public ktb(int i) {
        this.$cid = i;
        this.a = Executors.defaultThreadFactory();
        this.b = new AtomicInteger(1);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (this.$cid == 0) {
            Thread threadNewThread = this.b.newThread(new ktc(runnable));
            threadNewThread.setName((String) this.a);
            return threadNewThread;
        }
        Thread threadNewThread2 = this.a.newThread(runnable);
        threadNewThread2.setName("gads-" + ((AtomicInteger) this.b).getAndIncrement());
        return threadNewThread2;
    }

    public ktb(String str, int i) {
        this.$cid = i;
        this.b = Executors.defaultThreadFactory();
        this.a = str;
    }
}
