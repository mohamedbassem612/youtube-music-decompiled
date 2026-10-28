package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahfl extends aheb {
    public ListenableFuture a;
    public ScheduledFuture b;

    public ahfl(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.a = listenableFuture;
    }

    @Override // defpackage.ahch
    protected final void gH() {
        l(this.a);
        ScheduledFuture scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.a = null;
        this.b = null;
    }

    @Override // defpackage.ahch
    protected final String jK() {
        ListenableFuture listenableFuture = this.a;
        ScheduledFuture scheduledFuture = this.b;
        if (listenableFuture == null) {
            return null;
        }
        String strCn = a.cn((byte) 93, listenableFuture, "inputFuture=[");
        if (scheduledFuture == null) {
            return strCn;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strCn;
        }
        return strCn + ", remaining delay=[" + delay + " ms]";
    }
}
