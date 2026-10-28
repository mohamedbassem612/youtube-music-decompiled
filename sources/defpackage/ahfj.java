package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahfj implements Runnable {
    ahfl a;

    public ahfj(ahfl ahflVar) {
        this.a = ahflVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture;
        ahfl ahflVar = this.a;
        if (ahflVar == null || (listenableFuture = ahflVar.a) == null) {
            return;
        }
        this.a = null;
        if (listenableFuture.isDone()) {
            ahflVar.setFuture(listenableFuture);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = ahflVar.b;
            ahflVar.b = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    ahflVar.setException(new ahfk(str));
                    throw th;
                }
            }
            ahflVar.setException(new ahfk(str + ": " + listenableFuture.toString()));
            listenableFuture.cancel(true);
        } catch (Throwable th2) {
            listenableFuture.cancel(true);
            throw th2;
        }
    }
}
