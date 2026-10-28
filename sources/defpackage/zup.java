package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zup {
    public static final /* synthetic */ int g = 0;
    private static final long h;
    public final akwf a;
    public final long b;
    public final zup c;
    public akwf d;
    public int e;
    public int f;
    private final int i;
    private final int j;
    private ScheduledFuture k;
    private volatile long l;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        h = 43200L;
    }

    public zup(akwf akwfVar, zup zupVar, int i, int i2, long j) {
        this.c = zupVar == null ? this : zupVar;
        this.d = akwfVar;
        this.a = akwfVar;
        this.e = i;
        this.i = i;
        this.f = i2;
        this.j = i2;
        this.b = Math.max(-1L, Math.min(j, h));
    }

    public final zup a(ScheduledExecutorService scheduledExecutorService, long j) {
        long jA = tym.A(this.b, -1L, h);
        synchronized (this) {
            this.d = this.a;
            this.e = this.i;
            this.f = this.j;
            if (jA > 0) {
                this.l = j;
                ScheduledFuture scheduledFuture = this.k;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.k = scheduledExecutorService.schedule(new jup(this, j, 18), jA, TimeUnit.MINUTES);
            }
        }
        return this;
    }

    public final synchronized void b(long j) {
        if (j != this.l) {
            return;
        }
        this.k = null;
        this.l = 0L;
        zup zupVar = this.c;
        this.e = zupVar.i;
        this.f = zupVar.j;
        this.d = zupVar.a;
    }
}
