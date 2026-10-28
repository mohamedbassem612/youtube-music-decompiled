package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awja extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    final String a;
    final int b;
    final boolean c;

    public awja(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.a + '-' + incrementAndGet();
        Thread awizVar = this.c ? new awiz(runnable, str) : new Thread(runnable, str);
        awizVar.setPriority(this.b);
        awizVar.setDaemon(true);
        return awizVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return "RxThreadFactory[" + this.a + ']';
    }
}
