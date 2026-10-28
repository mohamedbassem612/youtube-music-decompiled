package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aujd implements aujf {
    private final Runnable a;
    private final Runnable b;
    private final Handler c;

    public aujd(Runnable runnable, Runnable runnable2, Handler handler) {
        this.a = runnable;
        this.b = runnable2;
        this.c = handler;
    }

    @Override // defpackage.aujf
    public final void a() {
        Handler handler = this.c;
        handler.removeCallbacks(this.a);
        Runnable runnable = this.b;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
    }

    @Override // defpackage.aujf
    public final void b() {
        Runnable runnable = this.b;
        if (runnable != null) {
            this.c.post(runnable);
        }
    }

    @Override // defpackage.aujf
    public final void c() {
        this.c.post(this.a);
    }
}
