package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xwm {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/pairing/MdxCloudScreenStorage");
    public final qrx b;
    private final xla c;

    public xwm(qrx qrxVar, xla xlaVar) {
        this.b = qrxVar;
        this.c = xlaVar;
    }

    public final ListenableFuture a() {
        ListenableFuture listenableFutureC = this.b.c();
        wvk wvkVar = new wvk(6);
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), wvkVar);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        int i = ahcs.c;
        ahcr ahcrVar = new ahcr(listenableFutureC, afwiVar);
        listenableFutureC.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
        return ahcrVar;
    }

    public final ListenableFuture b(xvz xvzVar) {
        return this.b.a(new xwd(xvzVar, 3), MoreExecutors.directExecutor());
    }

    public final void c(xvk xvkVar) {
        int i = 0;
        taf.i(this.c.aE() ? b(xvkVar.b()) : aher.a, MoreExecutors.directExecutor(), new xwk(i), new xwl(this, xvkVar, i), null);
    }
}
