package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class exr implements ThreadFactory {
    public final boolean a;
    private final String b;
    private final AtomicInteger c = new AtomicInteger();

    public exr(String str, boolean z) {
        this.b = str;
        this.a = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        exq exqVar = new exq(new br(this, runnable, 12, (char[]) null));
        exqVar.setName("glide-" + this.b + "-thread-" + this.c.getAndIncrement());
        return exqVar;
    }
}
