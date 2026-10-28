package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tzh implements avme {
    public final /* synthetic */ ListenableFuture a;

    public /* synthetic */ tzh(ListenableFuture listenableFuture) {
        this.a = listenableFuture;
    }

    @Override // defpackage.avme
    public final void a(awgm awgmVar) {
        tzd tzdVar = new tzd(awgmVar, 3);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        long j = afwl.a;
        afwj afwjVar = new afwj(afty.c(false), tzdVar, 0);
        ListenableFuture listenableFuture = this.a;
        listenableFuture.addListener(new ahei(listenableFuture, afwjVar), executorDirectExecutor);
        avnr.i(awgmVar, new avnp(new tzf(listenableFuture, 2)));
    }
}
