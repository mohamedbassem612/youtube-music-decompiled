package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rqx implements zwh {
    public final rmd a;
    private final affd b;
    private final agfr c;

    public rqx(affd affdVar, axqr axqrVar, rmd rmdVar, tqj tqjVar, Executor executor) {
        rqx rqxVar;
        agfr agfuVar;
        this.b = affdVar;
        this.a = rmdVar;
        int i = tqr.a;
        if (tqjVar.k(1073814311)) {
            rqxVar = this;
            agfuVar = aguu.al(new rqw(rqxVar, axqrVar, affdVar, executor, 0));
        } else {
            rqxVar = this;
            ListenableFuture listenableFutureA = axqrVar.a(affdVar);
            olh olhVar = new olh(rqxVar, 11);
            long j = afwl.a;
            ahcr ahcrVar = new ahcr(listenableFutureA, new afwi(afty.c(false), olhVar));
            listenableFutureA.addListener(ahcrVar, MoreExecutors.c(executor, ahcrVar));
            agfuVar = new agfu(ahcrVar);
        }
        rqxVar.c = agfuVar;
    }

    @Override // defpackage.zwh
    public final zwa hw() {
        try {
            return (zwa) a.i((Future) this.c.io());
        } catch (ExecutionException e) {
            throw new IllegalStateException("DefaultIdentityResolver could not resolve ".concat(this.b.toString()), e);
        }
    }
}
