package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rrp extends sye {
    private final awmd a;

    public rrp(awmd awmdVar) {
        this.a = awmdVar;
    }

    @Override // defpackage.sye
    protected final void a() {
        ListenableFuture listenableFutureC = ((rrh) this.a.io()).c();
        rro rroVar = new rro(0);
        Executor executor = taf.a;
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        taa taaVar = new taa(rroVar, null, taf.b);
        long j = afwl.a;
        listenableFutureC.addListener(new ahei(listenableFutureC, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
    }

    @Override // defpackage.sye
    public final synchronized void b() {
        ((rrh) this.a.io()).d();
    }
}
