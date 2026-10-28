package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avhg extends WeakReference {
    public static final /* synthetic */ int a = 0;
    private static final boolean b = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    private static final RuntimeException c;
    private final ReferenceQueue d;
    private final ConcurrentMap e;
    private final String f;
    private final Reference g;
    private final AtomicBoolean h;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        c = runtimeException;
    }

    public avhg(avhh avhhVar, avax avaxVar, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(avhhVar, referenceQueue);
        this.h = new AtomicBoolean();
        this.g = new SoftReference(b ? new RuntimeException("ManagedChannel allocation site") : c);
        this.f = avaxVar.toString();
        this.d = referenceQueue;
        this.e = concurrentMap;
        concurrentMap.put(this, this);
        b(referenceQueue);
    }

    static void b(ReferenceQueue referenceQueue) {
        while (true) {
            avhg avhgVar = (avhg) referenceQueue.poll();
            if (avhgVar == null) {
                return;
            }
            RuntimeException runtimeException = (RuntimeException) avhgVar.g.get();
            boolean z = avhgVar.h.get();
            avhgVar.c();
            if (!z) {
                Level level = Level.SEVERE;
                Logger logger = avhh.b;
                if (logger.isLoggable(level)) {
                    LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                    logRecord.setLoggerName(logger.getName());
                    logRecord.setParameters(new Object[]{avhgVar.f});
                    logRecord.setThrown(runtimeException);
                    logger.log(logRecord);
                }
            }
        }
    }

    private final void c() {
        super.clear();
        this.e.remove(this);
        this.g.clear();
    }

    public final void a() {
        if (this.h.getAndSet(true)) {
            return;
        }
        clear();
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        c();
        b(this.d);
    }
}
