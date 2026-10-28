package defpackage;

import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class laq implements Runnable {
    final long f = System.currentTimeMillis();
    final long g = SystemClock.elapsedRealtime();
    final boolean h;
    final /* synthetic */ lay i;

    public laq(lay layVar, boolean z) {
        this.i = layVar;
        this.h = z;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        if (this.i.d) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            this.i.f(e, false, this.h);
            b();
        }
    }

    protected void b() {
    }
}
