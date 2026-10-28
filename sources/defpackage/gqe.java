package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gqe implements Supplier {
    public final /* synthetic */ gqh a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ woo c;
    public final /* synthetic */ gnl d;

    public /* synthetic */ gqe(gqh gqhVar, Runnable runnable, woo wooVar, gnl gnlVar) {
        this.a = gqhVar;
        this.b = runnable;
        this.c = wooVar;
        this.d = gnlVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, xir] */
    @Override // java.util.function.Supplier
    public final Object get() {
        this.b.run();
        woo wooVar = this.c;
        gzj.a(wooVar);
        gnl gnlVar = this.d;
        Optional optional = gnlVar.b;
        gqh gqhVar = this.a;
        ScheduledExecutorService scheduledExecutorService = gqhVar.d;
        ListenableFuture listenableFutureH = gqhVar.f.h(wooVar, scheduledExecutorService);
        if (optional.isPresent()) {
            optional.get().f(tau.BROWSE_REQUEST_SENT);
        } else {
            gqhVar.c.c(new hal());
        }
        return afxd.f(listenableFutureH).g(new hco(gqhVar, wooVar, gnlVar, 1), scheduledExecutorService);
    }
}
