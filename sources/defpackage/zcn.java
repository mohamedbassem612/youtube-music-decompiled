package defpackage;

import j$.util.DesugarArrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zcn {
    public final zcf a;
    public long b;
    private final ScheduledExecutorService d;
    private final Object g = new Object();
    private zgi e = zgi.NOT_VALID;
    private volatile ScheduledFuture f = null;
    public xxj c = null;

    public zcn(zcf zcfVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.a = zcfVar;
        this.b = j;
        this.d = scheduledExecutorService;
    }

    final void a(zgi zgiVar) {
        boolean z;
        if (zgiVar != this.e) {
            Object obj = this.g;
            synchronized (obj) {
                synchronized (obj) {
                    try {
                        z = (this.f == null || this.f.isDone()) ? false : true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.e = zgiVar;
                if (this.b > 0 || !DesugarArrays.stream(new zgi[]{zgi.NOT_STARTED, zgi.BUFFERING, zgi.SEEKING}).anyMatch(new xdo(zgiVar, 15))) {
                }
                this.f = this.d.schedule(new zgc(this, zgiVar, 1), this.b, TimeUnit.MILLISECONDS);
                return;
            }
            if (z) {
                this.f.cancel(false);
            }
            this.f = null;
            this.e = zgiVar;
            if (this.b > 0) {
            }
        }
    }
}
