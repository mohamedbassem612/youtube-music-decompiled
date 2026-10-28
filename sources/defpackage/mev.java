package defpackage;

import android.os.Build;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mev extends PhantomReference {
    public static final ReferenceQueue a = new ReferenceQueue();
    public static final AtomicReference b;
    private static final Object f;
    public final long c;
    public mev d;
    public mev e;

    static {
        Object obj = new Object();
        f = obj;
        b = new AtomicReference(obj);
    }

    public mev(Object obj, long j, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.c = j;
    }

    public static void a(Object obj, long j) {
        AtomicReference atomicReference;
        Object obj2;
        Object obj3;
        mev mevVar = new mev(obj, j, a);
        do {
            atomicReference = b;
            obj2 = atomicReference.get();
            obj3 = f;
            mevVar.e = obj2 == obj3 ? null : (mev) obj2;
        } while (!a.av(atomicReference, obj2, mevVar));
        if (Build.VERSION.SDK_INT >= 28) {
            Reference.reachabilityFence(obj);
        }
        if (obj2 == obj3) {
            b();
        }
    }

    private static void b() {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        while (threadGroup.getParent() != null) {
            threadGroup = threadGroup.getParent();
        }
        Thread thread = new Thread(threadGroup, new gkz(5), "UpbCleaner");
        thread.setPriority(5);
        thread.setContextClassLoader(null);
        thread.setDaemon(true);
        thread.start();
    }
}
