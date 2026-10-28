package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class npo implements npn {
    private final /* synthetic */ int $cid;
    private final Object a;

    public npo(int i) {
        this.$cid = i;
        this.a = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    @Override // defpackage.npn
    public final void a(long j, Runnable runnable) {
        int i = this.$cid;
        ?? r1 = this.a;
        if (i != 0) {
            r1.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } else {
            ((Handler) r1).postDelayed(runnable, j);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.$cid != 0) {
            this.a.execute(runnable);
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            ((Handler) this.a).post(runnable);
        }
    }

    public npo(ScheduledExecutorService scheduledExecutorService, int i) {
        this.$cid = i;
        this.a = scheduledExecutorService;
    }
}
