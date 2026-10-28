package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dze {
    public Context a;
    public WorkerParameters b;
    public boolean c;
    private final AtomicInteger d = new AtomicInteger(-256);

    public dze(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.a = context;
        this.b = workerParameters;
    }

    public ListenableFuture a() {
        return ape.f(new dza());
    }

    public abstract ListenableFuture b();

    public final int d() {
        return this.b.d;
    }

    public final int e() {
        return this.d.get();
    }

    public final dyp f() {
        return this.b.b;
    }

    public final UUID g() {
        return this.b.a;
    }

    public final Executor h() {
        return this.b.e;
    }

    public final void i(int i) {
        this.d.compareAndSet(-256, i);
    }

    public final boolean j() {
        return this.d.get() != -256;
    }
}
