package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class bqi {
    private static Handler a;
    public volatile int f = 1;
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();
    public final FutureTask c = new bqh(this, new ub(this, 6));

    public abstract Object a();

    public void b(Object obj) {
        throw null;
    }

    public void c(Object obj) {
        throw null;
    }

    public final void d(Object obj) {
        Handler handler;
        synchronized (bqi.class) {
            handler = a;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                a = handler;
            }
        }
        handler.post(new blq(this, obj, 3));
    }

    final void e(Object obj) {
        if (this.e.get()) {
            return;
        }
        d(obj);
    }

    public final boolean f() {
        return this.d.get();
    }
}
