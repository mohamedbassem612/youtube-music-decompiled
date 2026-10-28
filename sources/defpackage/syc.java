package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class syc extends syh {
    private final Handler c;
    private final Thread d;

    public syc(Handler handler, sxu sxuVar) {
        super(sxuVar);
        handler.getClass();
        this.c = handler;
        this.d = handler.getLooper().getThread();
    }

    @Override // defpackage.syh
    protected final void c(Runnable runnable) {
        if (Thread.currentThread() != this.d) {
            this.c.post(runnable);
        } else {
            runnable.run();
        }
    }
}
