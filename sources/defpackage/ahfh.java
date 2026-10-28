package defpackage;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahfh implements ThreadFactory {
    final /* synthetic */ ThreadFactory a;
    final /* synthetic */ String b;
    final /* synthetic */ AtomicLong c;
    final /* synthetic */ Boolean d;

    public ahfh(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool) {
        this.a = threadFactory;
        this.b = str;
        this.c = atomicLong;
        this.d = bool;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.a.newThread(runnable);
        threadNewThread.getClass();
        String str = this.b;
        if (str != null) {
            AtomicLong atomicLong = this.c;
            atomicLong.getClass();
            threadNewThread.setName(String.format(Locale.ROOT, str, Long.valueOf(atomicLong.getAndIncrement())));
        }
        Boolean bool = this.d;
        if (bool != null) {
            bool.booleanValue();
            threadNewThread.setDaemon(true);
        }
        return threadNewThread;
    }
}
