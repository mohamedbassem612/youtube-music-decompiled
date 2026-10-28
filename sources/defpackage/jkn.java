package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jkn {
    public Runnable a;
    private final Handler b;
    private final long c;

    public jkn(Handler handler, long j) {
        this.b = handler;
        this.c = j;
    }

    public final void a() {
        Runnable runnable = this.a;
        if (runnable != null) {
            this.b.removeCallbacks(runnable);
            this.a = null;
        }
    }

    public final void b(Runnable runnable, boolean z) {
        Runnable runnable2 = this.a;
        if (runnable2 != null) {
            this.b.removeCallbacks(runnable2);
        }
        ihq ihqVar = new ihq(this, runnable, 3);
        this.a = ihqVar;
        this.b.postDelayed(ihqVar, z ? this.c : 0L);
    }
}
