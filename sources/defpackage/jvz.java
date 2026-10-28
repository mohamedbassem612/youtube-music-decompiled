package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jvz extends Thread {
    final CountDownLatch a;
    private final WeakReference b;
    private final long c;

    public jvz(jwb jwbVar, long j) {
        super("AdIdClientAutoDisconnectThread");
        this.b = new WeakReference(jwbVar);
        this.c = j;
        this.a = new CountDownLatch(1);
        start();
    }

    private final void a() {
        jwb jwbVar = (jwb) this.b.get();
        if (jwbVar != null) {
            jwbVar.a();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.a.await(this.c, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
