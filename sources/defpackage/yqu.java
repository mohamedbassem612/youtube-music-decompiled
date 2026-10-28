package defpackage;

import com.google.android.libraries.youtube.media.interfaces.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yqu extends Executor {
    private final ScheduledExecutorService a;

    public yqu(ScheduledExecutorService scheduledExecutorService) {
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.Executor
    public final boolean isOnExecutor() {
        return false;
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.Executor
    public final void schedule(Runnable runnable) {
        if (runnable != null) {
            this.a.execute(runnable);
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.Executor
    public final void scheduleAfter(long j, Runnable runnable) {
        if (runnable != null) {
            this.a.schedule(runnable, j, TimeUnit.MILLISECONDS);
        }
    }
}
