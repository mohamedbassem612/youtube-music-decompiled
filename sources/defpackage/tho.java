package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tho {
    private static final Object a = new Object();
    private final ExecutorService b;
    private boolean c;
    private boolean d;
    private Future e = new aher(Boolean.FALSE);

    public tho(ExecutorService executorService) {
        this.b = executorService;
    }

    final void a() {
        synchronized (tho.class) {
            if (this.e.isDone() || this.d) {
                return;
            }
            try {
                this.e.get(300L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException e) {
                twu.c(5, a.bP(300, "Timeout of ", " ms reached when loading GMS Cronet"), e);
            } catch (Throwable th) {
                b(th);
            } finally {
                this.d = true;
            }
        }
    }

    final void b(Throwable th) {
        synchronized (a) {
            if (this.c) {
                return;
            }
            this.c = true;
            twu.c(6, "Unexpected error when loading Cronet from GMS Core", th);
        }
    }

    final void c(Context context) {
        try {
            this.e = this.b.submit(new qoh(context, 19));
        } catch (RejectedExecutionException e) {
            twu.c(6, "Unable to schedule GMS Core Cronet loading task", e);
        }
    }

    final boolean d() {
        if (!this.e.isDone() && !this.d) {
            a();
        }
        try {
            return this.e.isDone() && ((Boolean) ahng.v(this.e)).booleanValue();
        } catch (Throwable th) {
            b(th);
            return false;
        }
    }
}
