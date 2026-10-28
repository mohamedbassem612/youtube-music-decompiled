package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rrb implements afgg {
    private final zwb a;
    private final afho b;

    public rrb(zwb zwbVar, afho afhoVar) {
        this.a = zwbVar;
        this.b = afhoVar;
    }

    @Override // defpackage.afgg
    public final ListenableFuture a(affd affdVar) {
        zwa zwaVarE = this.a.e();
        ListenableFuture listenableFutureA = this.b.a(affdVar);
        olh olhVar = new olh(zwaVarE, 13);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        long j = afwl.a;
        ahcr ahcrVar = new ahcr(listenableFutureA, new afwi(afty.c(false), olhVar));
        listenableFutureA.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
        return ahcrVar;
    }
}
