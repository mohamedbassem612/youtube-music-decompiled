package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abga {
    public final Runnable a = new yas(this, 17, null);
    public ScheduledFuture b;
    public final /* synthetic */ abge c;

    public abga(abge abgeVar) {
        this.c = abgeVar;
    }

    public final synchronized void a() {
        ScheduledFuture scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.b = null;
        }
    }
}
