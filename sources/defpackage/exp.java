package defpackage;

import android.text.TextUtils;
import androidx.car.app.model.Alert;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class exp {
    public String a;
    public long b;
    public Function c;
    private final boolean d;
    private final boolean e;
    private int f;
    private int g;

    public exp(boolean z, boolean z2) {
        this.d = z;
        this.e = z2;
        if (z2) {
            this.f = 0;
            this.g = Alert.DURATION_SHOW_INDEFINITELY;
        }
    }

    public final exs a() {
        if (TextUtils.isEmpty(this.a)) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: ".concat(String.valueOf(this.a)));
        }
        exr exrVar = new exr(this.a, this.d);
        BlockingQueue synchronousQueue = this.e ? new SynchronousQueue() : new PriorityBlockingQueue();
        ThreadPoolExecutor exoVar = this.c != null ? new exo(this, this.f, this.g, this.b, TimeUnit.MILLISECONDS, synchronousQueue, exrVar) : new ThreadPoolExecutor(this.f, this.g, this.b, TimeUnit.MILLISECONDS, (BlockingQueue<Runnable>) synchronousQueue, exrVar);
        if (this.b != 0) {
            exoVar.allowCoreThreadTimeOut(true);
        }
        return new exs(exoVar);
    }

    public final void b(int i) {
        if (this.e) {
            throw new UnsupportedOperationException("Thread count cannot be configured on an unlimited source executor");
        }
        this.f = i;
        this.g = i;
    }
}
