package defpackage;

import android.graphics.Matrix;
import android.os.SystemClock;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rfr {
    public UUID a;
    protected long j;
    protected long k;
    protected Matrix b = new Matrix();
    public Matrix c = new Matrix();
    public int d = 0;
    protected UUID e = null;
    public float f = 1.0f;
    public awme g = null;
    public final List h = new ArrayList();
    protected long i = SystemClock.elapsedRealtimeNanos();
    protected Optional l = Optional.empty();
    public Optional m = Optional.empty();

    protected rfr() {
    }

    public final synchronized long a() {
        long jElapsedRealtimeNanos;
        if (this.j == 0) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            jElapsedRealtimeNanos = ((SystemClock.elapsedRealtimeNanos() - this.i) / 1000) + this.k;
        } else {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            jElapsedRealtimeNanos = ((this.j - this.i) / 1000) + this.k;
        }
        return jElapsedRealtimeNanos;
    }

    public final synchronized void b() {
        this.k += a();
        this.i = 0L;
    }

    public final synchronized void c() {
        this.i = SystemClock.elapsedRealtimeNanos();
    }
}
