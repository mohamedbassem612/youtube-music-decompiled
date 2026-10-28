package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avmj implements Runnable, avmn {
    private final Handler a;
    private final Runnable b;
    private volatile boolean c;

    public avmj(Handler handler, Runnable runnable) {
        this.a = handler;
        this.b = runnable;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.a.removeCallbacks(this);
        this.c = true;
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            atqp.n(th);
        }
    }
}
