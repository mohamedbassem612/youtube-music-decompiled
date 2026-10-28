package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vxr implements Thread.UncaughtExceptionHandler {
    public final awmd a;
    volatile Thread.UncaughtExceptionHandler b;
    public volatile boolean c;

    public vxr(awmd awmdVar) {
        this.a = awmdVar;
    }

    private final void b(agek agekVar) {
        try {
            ((tpq) this.a.io()).b(agekVar).get();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            zvp.b(zvn.b, zvm.e, "Failed to store uncaught exception crash counter.", e);
        }
    }

    public final void a() {
        b(new vxq(0));
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (!this.c) {
            b(new vxq(1));
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
    }
}
