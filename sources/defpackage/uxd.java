package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uxd extends Handler {
    public final Executor a;
    public final ScheduledExecutorService b;
    public final uju c;
    public final aend d;
    public final aaok e;

    public uxd(aend aendVar, Executor executor, ScheduledExecutorService scheduledExecutorService, aaok aaokVar, uju ujuVar) {
        this.d = aendVar;
        this.a = executor;
        this.b = scheduledExecutorService;
        this.e = aaokVar;
        this.c = ujuVar;
    }
}
