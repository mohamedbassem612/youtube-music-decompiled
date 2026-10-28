package defpackage;

import org.chromium.base.TraceEvent;
import org.chromium.base.task.TaskRunnerImpl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axjz implements Runnable {
    private final Runnable a;

    public axjz(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(long j) {
        TaskRunnerImpl.e(j, this.a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TraceEvent traceEventC = TraceEvent.c("PreNativeTask.run");
        try {
            this.a.run();
            if (traceEventC != null) {
                TraceEvent.b(0L);
            }
        } catch (Throwable th) {
            if (traceEventC != null) {
                try {
                    TraceEvent.b(0L);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
