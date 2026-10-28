package defpackage;

import android.os.Binder;
import android.os.Build;
import androidx.car.app.model.Alert;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mbh extends ThreadPoolExecutor implements AutoCloseable {
    public mbh(TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(0, Alert.DURATION_SHOW_INDEFINITELY, 60L, timeUnit, (BlockingQueue<Runnable>) blockingQueue, threadFactory);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (Build.VERSION.SDK_INT < 31) {
            Binder.flushPendingCommands();
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.ar(this);
    }
}
