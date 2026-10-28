package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class avmo extends AtomicReference implements avmn {
    private static final long serialVersionUID = 6545242830671168775L;
    private final boolean a;

    public avmo(Future future) {
        super(future);
        this.a = true;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        Future future = (Future) getAndSet(null);
        if (future != null) {
            future.cancel(this.a);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        Future future = (Future) get();
        return future == null || future.isDone();
    }
}
