package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.DesugarTimeZone;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oni implements onc {
    public static final /* synthetic */ int e = 0;
    private static final TimeZone f = DesugarTimeZone.getTimeZone("UTC");
    public final Executor a;
    public final Random b;
    public final qrx c;
    public final omj d;

    public oni(qrx qrxVar, omj omjVar, Executor executor, Random random) {
        this.c = qrxVar;
        this.d = omjVar;
        this.a = executor;
        this.b = random;
    }

    public static long f(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f);
        gregorianCalendar.setTimeInMillis(j);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    @Override // defpackage.onc
    public final ListenableFuture a() {
        return this.c.a(new one(4), MoreExecutors.directExecutor());
    }

    @Override // defpackage.onc
    public final ListenableFuture b() {
        AtomicReference atomicReference = new AtomicReference(agpi.a);
        olh olhVar = new olh(atomicReference, 6);
        qrx qrxVar = this.c;
        Executor executor = this.a;
        ListenableFuture listenableFutureA = qrxVar.a(olhVar, executor);
        olh olhVar2 = new olh(atomicReference, 3);
        long j = afwl.a;
        ahcr ahcrVar = new ahcr(listenableFutureA, new afwi(afty.c(false), new afwi(afty.c(false), olhVar2)));
        listenableFutureA.addListener(ahcrVar, MoreExecutors.c(executor, ahcrVar));
        return ahcrVar;
    }

    @Override // defpackage.onc
    public final ListenableFuture c() {
        AtomicReference atomicReference = new AtomicReference(agdf.a);
        ListenableFuture listenableFutureA = this.c.a(new idv(this, atomicReference, 3), MoreExecutors.directExecutor());
        olh olhVar = new olh(atomicReference, 5);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        long j = afwl.a;
        ahcr ahcrVar = new ahcr(listenableFutureA, new afwi(afty.c(false), olhVar));
        listenableFutureA.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
        return ahcrVar;
    }

    @Override // defpackage.onc
    public final ListenableFuture d() {
        ListenableFuture listenableFutureC = this.c.c();
        olm olmVar = new olm(this, 9);
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), olmVar, 1);
        int i = ahcs.c;
        Executor executor = this.a;
        ahcq ahcqVar = new ahcq(listenableFutureC, ahdbVar);
        listenableFutureC.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
        return ahcqVar;
    }

    @Override // defpackage.onc
    public final ListenableFuture e(oit oitVar) {
        return this.c.a(new onn(oitVar, 1), this.a);
    }
}
