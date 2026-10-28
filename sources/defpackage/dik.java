package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dik {
    public long a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final Runnable c;
    private long d;
    private boolean e;

    public dik(Runnable runnable) {
        this.c = runnable;
    }

    public final void a(boolean z, long j) {
        if (z) {
            long j2 = this.a;
            if (j2 - j < 30000) {
                this.d = Math.max(this.d, (j + 30000) - j2);
                this.e = true;
            }
        }
    }

    public final void b() {
        this.d = 0L;
        this.e = false;
        this.a = SystemClock.elapsedRealtime();
        this.b.removeCallbacks(this.c);
    }

    public final boolean c() {
        if (this.e) {
            long j = this.d;
            if (j > 0) {
                this.b.postDelayed(this.c, j);
            }
        }
        return this.e;
    }
}
