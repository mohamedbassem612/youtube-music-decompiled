package app.rive.runtime.kotlin;

import android.view.Surface;
import app.rive.runtime.kotlin.core.RefCount;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SharedSurface implements RefCount {
    public static final int $stable = 8;
    private AtomicInteger refs;
    private final Surface surface;

    public SharedSurface(Surface surface) {
        surface.getClass();
        this.surface = surface;
        this.refs = new AtomicInteger(1);
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public /* synthetic */ int acquire() {
        return getRefs().incrementAndGet();
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public /* synthetic */ int getRefCount() {
        return getRefs().get();
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public AtomicInteger getRefs() {
        return this.refs;
    }

    public final Surface getSurface() {
        return this.surface;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public int release() {
        int iDecrementAndGet = getRefs().decrementAndGet();
        if (iDecrementAndGet != 0) {
            return iDecrementAndGet;
        }
        this.surface.release();
        return 0;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public void setRefs(AtomicInteger atomicInteger) {
        atomicInteger.getClass();
        this.refs = atomicInteger;
    }
}
