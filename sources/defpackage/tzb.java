package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tzb implements avld {
    public final /* synthetic */ ListenableFuture a;

    public /* synthetic */ tzb(ListenableFuture listenableFuture) {
        this.a = listenableFuture;
    }

    @Override // defpackage.avld
    public final void a(avpr avprVar) {
        tzd tzdVar = new tzd(avprVar, 0);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        long j = afwl.a;
        afwj afwjVar = new afwj(afty.c(false), tzdVar, 0);
        ListenableFuture listenableFuture = this.a;
        listenableFuture.addListener(new ahei(listenableFuture, afwjVar), executorDirectExecutor);
        avprVar.c(new tzf(listenableFuture, 1));
    }
}
