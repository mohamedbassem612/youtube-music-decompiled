package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.elements.interfaces.Closure;
import com.google.android.libraries.elements.interfaces.Executor;
import com.google.android.libraries.elements.interfaces.TaskQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class npq extends Executor {
    public final npn a;
    public final AtomicInteger b = new AtomicInteger(0);
    private final int c;

    public npq(npn npnVar, int i) {
        this.a = npnVar;
        this.c = i;
    }

    @Override // com.google.android.libraries.elements.interfaces.Executor
    public final /* bridge */ /* synthetic */ TaskQueue createTaskQueue() {
        return new npp(this.a, this.b);
    }

    @Override // com.google.android.libraries.elements.interfaces.Executor
    public final boolean currentThreadIsMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // com.google.android.libraries.elements.interfaces.Executor
    public final int numPendingClosures() {
        return this.b.get();
    }

    @Override // com.google.android.libraries.elements.interfaces.Executor
    public final void schedule(Closure closure) {
        if (closure != null) {
            this.b.getAndIncrement();
            this.a.execute(new msh(this, closure, 7));
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.Executor
    public final void scheduleAfter(long j, Closure closure) {
        if (closure != null) {
            this.b.getAndIncrement();
            this.a.a(j, new msh(this, closure, 6));
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.Executor
    public final void scheduleAfterCurrentFrame(Closure closure) {
        if (closure != null) {
            this.b.getAndIncrement();
            new Handler(Looper.getMainLooper()).post(new msh(this, closure, 4));
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.Executor
    public final boolean trySchedule(Closure closure) {
        if (closure != null) {
            AtomicInteger atomicInteger = this.b;
            if (atomicInteger.get() < this.c) {
                atomicInteger.getAndIncrement();
                this.a.execute(new msh(this, closure, 7));
                return true;
            }
        }
        return false;
    }
}
