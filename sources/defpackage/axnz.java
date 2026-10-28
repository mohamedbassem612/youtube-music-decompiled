package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axnz implements Executor {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public axnz(axoa axoaVar, Executor executor, int i) {
        this.$cid = i;
        this.a = executor;
        this.b = axoaVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.$cid != 0) {
            this.b.execute(runnable);
            return;
        }
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            ((axoa) this.b).g(e);
        }
    }

    public axnz(Executor executor, bvh bvhVar, int i) {
        this.$cid = i;
        this.b = executor;
        this.a = bvhVar;
    }
}
