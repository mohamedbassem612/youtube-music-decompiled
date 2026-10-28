package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qhm {
    private static final qhl g = new qhj();
    public final aunn a;
    public final Executor b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public volatile qhl d = g;
    public ScheduledFuture e;
    public ScheduledFuture f;

    public qhm(qeb qebVar, ahey aheyVar, Executor executor, aunn aunnVar, aunn aunnVar2) {
        this.a = aunnVar;
        this.b = executor;
        qebVar.a(new qhk(this, aunnVar2, aheyVar));
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.e = null;
        }
        ScheduledFuture scheduledFuture2 = this.f;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.f = null;
        }
    }
}
