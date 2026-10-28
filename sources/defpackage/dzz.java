package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dzz implements dzp {
    private final Handler a = aao.c(Looper.getMainLooper());

    @Override // defpackage.dzp
    public final void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    @Override // defpackage.dzp
    public final void b(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }
}
