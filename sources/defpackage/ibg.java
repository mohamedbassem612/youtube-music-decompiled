package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ibg {
    public static final long a;
    public final mbc b;
    private final zwb c;
    private final qrx d;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        a = 2505600000L;
    }

    public ibg(mbc mbcVar, zwb zwbVar, qrx qrxVar) {
        this.b = mbcVar;
        this.c = zwbVar;
        this.d = qrxVar;
    }

    public static boolean c(acdq acdqVar) {
        return acdqVar.u().toString().isEmpty() && acdqVar.t().toString().isEmpty();
    }

    public static boolean d(aima aimaVar) {
        return aimaVar.d.isEmpty() && aimaVar.e.isEmpty();
    }

    public final ListenableFuture a() {
        ListenableFuture listenableFutureC = this.d.c();
        gqq gqqVar = new gqq(this, 5);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), gqqVar);
        int i = ahcs.c;
        ahcr ahcrVar = new ahcr(listenableFutureC, afwiVar);
        listenableFutureC.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
        return ahcrVar;
    }

    public final String b() {
        zwb zwbVar = this.c;
        return zwbVar.u() ? zwbVar.e().k() : "signedout";
    }

    public final void e(aima aimaVar) {
        this.d.a(new gqa(this, aimaVar, 18), MoreExecutors.directExecutor());
    }
}
