package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.time.Duration;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afhp extends afho {
    public static final /* synthetic */ int a = 0;
    private final awmd b;
    private final abhh c;

    static {
        Duration.ofDays(365L);
    }

    public afhp(abhh abhhVar, awmd awmdVar) {
        this.c = abhhVar;
        this.b = awmdVar;
    }

    @Override // defpackage.afho
    public final ListenableFuture a(affd affdVar) {
        ListenableFuture listenableFutureY = this.c.y(affdVar);
        abzy abzyVar = new abzy(10);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        long j = afwl.a;
        ahcr ahcrVar = new ahcr(listenableFutureY, new afwi(afty.c(false), abzyVar));
        listenableFutureY.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
        return ahcrVar;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.afho
    public final ListenableFuture b() {
        abhh abhhVar = (abhh) this.c.b;
        return ahno.ar(((abhh) abhhVar.b).r(), new aeni(6), abhhVar.a);
    }

    @Override // defpackage.afho
    public final ListenableFuture c() {
        return this.c.z();
    }

    @Override // defpackage.afho
    public final /* bridge */ /* synthetic */ abhh d() {
        return (abhh) this.b.io();
    }
}
