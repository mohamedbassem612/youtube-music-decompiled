package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fje implements ThreadFactory {
    private static final AtomicInteger b = new AtomicInteger(1);
    public final int a;
    private final AtomicInteger c = new AtomicInteger(1);
    private final int d = b.getAndIncrement();

    public fje(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(new br(this, runnable, 13, (char[]) null), "ComponentLayoutThread" + this.d + '-' + this.c.getAndIncrement());
        thread.setPriority(10);
        return thread;
    }
}
