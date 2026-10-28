package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.time.Duration;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zyc implements tgk {
    public static final agrf b = agrf.h("com/google/android/libraries/youtube/net/request/LogcatNetworkLogger");
    private final zry c;
    private final mbc d;

    public zyc(zry zryVar, mbc mbcVar) {
        zryVar.getClass();
        this.c = zryVar;
        mbcVar.getClass();
        this.d = mbcVar;
    }

    @Override // defpackage.tgk
    public final long a(tns tnsVar) {
        d(tnsVar);
        return this.d.b();
    }

    @Override // defpackage.tgk
    public final void b(tns tnsVar, tnm tnmVar, Long l) {
        c(tnsVar, tnmVar, Duration.ofMillis(this.d.b() - l.longValue()));
    }

    @Override // defpackage.tgk
    public final void c(tns tnsVar, tnm tnmVar, Duration duration) {
        zry zryVar = this.c;
        ListenableFuture listenableFutureA = zryVar.a();
        ListenableFuture listenableFutureB = zryVar.b();
        ListenableFuture listenableFutureC = zryVar.c();
        ahek ahekVar = new ahek(false, agke.p(new ListenableFuture[]{listenableFutureA, listenableFutureB, listenableFutureC}));
        ahtp ahtpVar = new ahtp(listenableFutureA, listenableFutureB, tnsVar, duration, tnmVar, listenableFutureC, 1);
        long j = afwl.a;
        ListenableFuture listenableFutureA2 = ahekVar.a(new ahcz(afty.c(false), ahtpVar, 1), MoreExecutors.directExecutor());
        hmb hmbVar = new hmb(17);
        Executor executor = taf.a;
        listenableFutureA2.addListener(new ahei(listenableFutureA2, new afwj(afty.c(false), new taa(taf.c, null, hmbVar), 0)), MoreExecutors.directExecutor());
    }

    @Override // defpackage.tgk
    public final void d(tns tnsVar) {
        zry zryVar = this.c;
        ListenableFuture listenableFutureA = zryVar.a();
        ListenableFuture listenableFutureB = zryVar.b();
        ahek ahekVar = new ahek(false, agke.p(new ListenableFuture[]{listenableFutureA, listenableFutureB}));
        iqb iqbVar = new iqb(listenableFutureA, listenableFutureB, tnsVar, 11);
        long j = afwl.a;
        ListenableFuture listenableFutureA2 = ahekVar.a(new ahcz(afty.c(false), iqbVar, 1), MoreExecutors.directExecutor());
        hmb hmbVar = new hmb(16);
        Executor executor = taf.a;
        listenableFutureA2.addListener(new ahei(listenableFutureA2, new afwj(afty.c(false), new taa(taf.c, null, hmbVar), 0)), MoreExecutors.directExecutor());
    }

    @Override // defpackage.tgk
    public final void e(tns tnsVar, Duration duration) {
        zry zryVar = this.c;
        ListenableFuture listenableFutureA = zryVar.a();
        ListenableFuture listenableFutureB = zryVar.b();
        ListenableFuture listenableFutureC = zryVar.c();
        taf.j(ahng.h(listenableFutureA, listenableFutureB, listenableFutureC).a(afwl.j(new hni(listenableFutureA, listenableFutureB, tnsVar, duration, listenableFutureC, 11)), MoreExecutors.directExecutor()), new ztb(3));
    }
}
