package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class efu implements egd {
    private static final String b = dzf.a("SerialExecutorImpl");
    private final Executor d;
    private Runnable e;
    private final ArrayDeque c = new ArrayDeque();
    final Object a = new Object();

    public efu(Executor executor) {
        this.d = executor;
    }

    final void a() {
        Runnable runnable = (Runnable) this.c.poll();
        this.e = runnable;
        if (runnable != null) {
            try {
                this.d.execute(runnable);
            } catch (Throwable th) {
                dzf.b();
                Log.e(b, "Delegate executor failed to execute", th);
                this.e = null;
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.a) {
            this.c.add(new eft(this, runnable, 0));
            if (this.e == null) {
                a();
            }
        }
    }
}
