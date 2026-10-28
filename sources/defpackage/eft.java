package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eft implements Runnable {
    private final /* synthetic */ int $cid;
    final Object a;
    final Object b;

    public eft(ListenableFuture listenableFuture, awuc awucVar, int i) {
        this.$cid = i;
        this.a = listenableFuture;
        this.b = awucVar;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [awoq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [awuc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v10, types: [awuc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [awoq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [awuc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [awoq, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            try {
                this.b.run();
                Object obj = this.a;
                synchronized (((efu) obj).a) {
                    ((efu) obj).a();
                }
                return;
            } catch (Throwable th) {
                Object obj2 = this.a;
                synchronized (((efu) obj2).a) {
                    ((efu) obj2).a();
                    throw th;
                }
            }
        }
        ?? r1 = this.a;
        if (i != 1) {
            if (r1.isCancelled()) {
                this.b.f(null);
                return;
            }
            try {
                this.b.resumeWith(a.i(r1));
                return;
            } catch (ExecutionException e) {
                this.b.resumeWith(new awmm(awrc.ae(e)));
                return;
            }
        }
        if (r1.isCancelled()) {
            this.b.f(null);
            return;
        }
        try {
            this.b.resumeWith(eca.b(r1));
        } catch (ExecutionException e2) {
            this.b.resumeWith(new awmm(eca.c(e2)));
        }
    }

    public eft(efu efuVar, Runnable runnable, int i) {
        this.$cid = i;
        this.a = efuVar;
        this.b = runnable;
    }
}
