package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sek {
    public final sdr a;
    public final tpq b;
    public final tun c;
    public final long d;
    public ListenableFuture e;
    public final tfq f;
    public final aboi g;
    public final abnc h;
    private final mbc i;

    public sek(sej sejVar) {
        this.a = sejVar.a;
        mbc mbcVar = sejVar.b;
        this.i = mbcVar;
        this.f = sejVar.e;
        tpq tpqVar = sejVar.c;
        this.b = tpqVar;
        this.c = sejVar.d;
        this.g = sejVar.f;
        this.h = sejVar.g;
        this.d = mbcVar.f().toEpochMilli();
        ListenableFuture listenableFutureA = tpqVar.a();
        olh olhVar = new olh(this, 14);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        int i = ahcs.c;
        ahcr ahcrVar = new ahcr(listenableFutureA, olhVar);
        listenableFutureA.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
        this.e = ahcrVar;
    }

    public final int a() {
        long jLongValue;
        try {
            jLongValue = ((Long) this.e.get()).longValue();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            jLongValue = this.d;
        } catch (ExecutionException e) {
            twu.c(5, "Failed to read last ads timestamp.", e);
            jLongValue = this.d;
        }
        if (jLongValue > 0) {
            long jCeil = (long) Math.ceil((this.i.f().toEpochMilli() - jLongValue) / 1000.0d);
            if (jCeil <= 2147483647L && jCeil > 0) {
                return (int) jCeil;
            }
        }
        return 0;
    }
}
