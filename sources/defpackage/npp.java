package defpackage;

import com.google.android.libraries.elements.interfaces.Closure;
import com.google.android.libraries.elements.interfaces.TaskQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class npp extends TaskQueue {
    public final AtomicInteger a;
    private final Executor b;

    public npp(Executor executor, AtomicInteger atomicInteger) {
        this.b = new ahfg(executor);
        this.a = atomicInteger;
    }

    @Override // com.google.android.libraries.elements.interfaces.TaskQueue
    public final void submit(Closure closure) {
        if (closure != null) {
            this.a.getAndIncrement();
            this.b.execute(afwl.i(new msh(this, closure, 8)));
        }
    }
}
