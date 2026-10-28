package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahei implements Runnable {
    final ListenableFuture a;
    final aheh b;

    public ahei(ListenableFuture listenableFuture, aheh ahehVar) {
        this.a = listenableFuture;
        this.b = ahehVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thI;
        ListenableFuture listenableFuture = this.a;
        if ((listenableFuture instanceof ahfq) && (thI = ((ahfq) listenableFuture).i()) != null) {
            this.b.a(thI);
            return;
        }
        try {
            ahno.R(listenableFuture.isDone(), "Future was expected to be done: %s", listenableFuture);
            this.b.b(a.i(listenableFuture));
        } catch (ExecutionException e) {
            this.b.a(e.getCause());
        } catch (Throwable th) {
            this.b.a(th);
        }
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.a(this.b);
        return ageuVarAc.toString();
    }
}
