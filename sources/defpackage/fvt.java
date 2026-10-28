package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fvt extends Handler implements fvu {
    @Override // defpackage.fvu
    public final void a(Runnable runnable) {
        removeCallbacks(runnable);
    }

    @Override // defpackage.fvu
    public final void c(Runnable runnable) {
        post(runnable);
    }

    @Override // defpackage.fvu
    public final void b() {
    }
}
