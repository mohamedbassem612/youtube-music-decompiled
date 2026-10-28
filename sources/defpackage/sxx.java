package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sxx extends syh {
    private final Executor c;

    public sxx(Executor executor, sxu sxuVar) {
        super(sxuVar);
        executor.getClass();
        this.c = executor;
    }

    @Override // defpackage.syh
    protected final void c(Runnable runnable) {
        this.c.execute(runnable);
    }
}
