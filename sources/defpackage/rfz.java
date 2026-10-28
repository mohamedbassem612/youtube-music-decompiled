package defpackage;

import android.content.Context;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rfz implements AutoCloseable {
    public static final rbm c = new rbm("rfz");
    public final rfy a;
    public Throwable b;
    private final rgh d;
    private final rbn e;

    public rfz(Context context, rfn rfnVar, Semaphore semaphore, Semaphore semaphore2, qug qugVar, qua quaVar) {
        int i = 0;
        rgh rghVar = new rgh(context, quaVar, false);
        this.b = null;
        this.d = rghVar;
        rbn rbnVar = new rbn();
        this.e = rbnVar;
        try {
            rfy rfyVar = new rfy(rfnVar, semaphore, semaphore2, rghVar, rbnVar, qugVar);
            this.a = rfyVar;
            rfyVar.setName("surface-texture-adapter-thread");
            Object obj = new Object();
            rfyVar.setUncaughtExceptionHandler(new rfv(this, obj, i));
            rfyVar.start();
            try {
                if (!rfyVar.h()) {
                    synchronized (obj) {
                        while (this.b == null) {
                            obj.wait();
                        }
                    }
                }
                Throwable th = this.b;
                rfy rfyVar2 = this.a;
                if (th == null) {
                    rfyVar2.setUncaughtExceptionHandler(new rdf(2));
                } else {
                    rfyVar2.i();
                    throw new IllegalStateException(this.b);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException("GLThread was unexpectedly interrupted.", e);
            }
        } catch (bvn e2) {
            throw new IllegalStateException(e2);
        }
    }

    public final void a(rft rftVar) {
        this.a.b(rftVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        rfy rfyVar = this.a;
        rfyVar.i();
        rfyVar.join();
    }
}
