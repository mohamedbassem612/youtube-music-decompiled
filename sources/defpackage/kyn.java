package defpackage;

import android.os.Looper;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kyn implements ThreadFactory {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ kyn(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.$cid;
        int i2 = 1;
        if (i == 0) {
            Thread threadNewThread = ((kyp) this.a).newThread(runnable);
            threadNewThread.setName("PunchclockGlobalScheduler");
            threadNewThread.setDaemon(true);
            return threadNewThread;
        }
        if (i == 1) {
            int i3 = bwp.a;
            return new Thread(runnable, (String) this.a);
        }
        if (i == 2) {
            return this.a.newThread(new mbo(runnable, i2));
        }
        Thread threadNewThread2 = this.a.newThread(runnable);
        if (threadNewThread2.getContextClassLoader() != null) {
            return threadNewThread2;
        }
        threadNewThread2.setContextClassLoader(Looper.getMainLooper().getThread().getContextClassLoader());
        return threadNewThread2;
    }
}
