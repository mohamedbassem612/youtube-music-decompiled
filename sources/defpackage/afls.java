package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afls implements dzp {
    final Handler a;

    public afls(Handler handler) {
        this.a = handler;
    }

    @Override // defpackage.dzp
    public final void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    @Override // defpackage.dzp
    public final void b(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }
}
