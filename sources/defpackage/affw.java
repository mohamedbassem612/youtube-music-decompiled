package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class affw implements afgg {
    private final abhh a;

    public affw(abhh abhhVar) {
        this.a = abhhVar;
    }

    @Override // defpackage.afgg
    public final ListenableFuture a(affd affdVar) {
        ListenableFuture listenableFutureR = ((abhh) ((abhh) this.a.b).b).r();
        vzs vzsVar = new vzs(affdVar, 17);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), vzsVar);
        int i = ahcs.c;
        ahcr ahcrVar = new ahcr(listenableFutureR, afwiVar);
        listenableFutureR.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
        afwi afwiVar2 = new afwi(afty.c(false), new abzy(7));
        Executor executorDirectExecutor2 = MoreExecutors.directExecutor();
        int i2 = ahbz.d;
        ahby ahbyVar = new ahby(ahcrVar, IllegalArgumentException.class, afwiVar2);
        ahcrVar.addListener(ahbyVar, MoreExecutors.c(executorDirectExecutor2, ahbyVar));
        afwi afwiVar3 = new afwi(afty.c(false), new abzy(8));
        Executor executorDirectExecutor3 = MoreExecutors.directExecutor();
        ahcr ahcrVar2 = new ahcr(ahbyVar, afwiVar3);
        ahbyVar.addListener(ahcrVar2, MoreExecutors.c(executorDirectExecutor3, ahcrVar2));
        return ahcrVar2;
    }
}
