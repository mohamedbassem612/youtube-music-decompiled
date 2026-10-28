package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hpk {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/offline/compat/DownloadsLibraryUtil");
    public final hpy b;
    public final hpd c;
    public final hpb d;
    public final Executor e;
    public final hbf f;
    private final Executor g;
    private final vxz h;

    public hpk(hbf hbfVar, hpy hpyVar, hpd hpdVar, hpb hpbVar, vxz vxzVar, Executor executor, Executor executor2) {
        this.f = hbfVar;
        this.b = hpyVar;
        this.c = hpdVar;
        this.d = hpbVar;
        this.h = vxzVar;
        this.g = executor;
        this.e = executor2;
    }

    private final ListenableFuture j(ListenableFuture listenableFuture, final Function function, final boolean z) {
        afxd afxdVarF = afxd.f(listenableFuture);
        ahcy ahcyVar = new ahcy() { // from class: hpg
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj) {
                Function function2 = function;
                hpk hpkVar = this.a;
                annv annvVar = (annv) obj;
                return z ? hpkVar.b.c((List) function2.apply(annvVar)) : hpkVar.b.b((List) function2.apply(annvVar));
            }
        };
        Executor executor = this.e;
        return afxdVarF.h(ahcyVar, executor).g(new hoh(15), executor);
    }

    public final ListenableFuture a() {
        hpy hpyVar = this.b;
        afxd afxdVarG = afxd.f(hpyVar.a(kro.aq())).g(new hoh(13), MoreExecutors.directExecutor());
        hpyVar.getClass();
        return afxdVarG.h(new hba(hpyVar, 20), MoreExecutors.directExecutor()).g(new hoh(14), MoreExecutors.directExecutor());
    }

    public final ListenableFuture b() {
        afxd afxdVarG = afxd.f(e(hpu.b())).g(new hoh(19), MoreExecutors.directExecutor());
        hpd hpdVar = this.c;
        hpdVar.getClass();
        return afxd.f(afxdVarG.h(new hqj(hpdVar, 1), MoreExecutors.directExecutor()).g(new hnd(this, 11), MoreExecutors.directExecutor())).g(new hoh(12), MoreExecutors.directExecutor());
    }

    public final ListenableFuture c() {
        hpy hpyVar = this.b;
        afxd afxdVarG = afxd.f(hpyVar.a(kro.aq())).g(new hoh(11), MoreExecutors.directExecutor());
        hpyVar.getClass();
        return afxdVarG.h(new hba(hpyVar, 20), MoreExecutors.directExecutor()).g(new hoh(17), MoreExecutors.directExecutor());
    }

    public final ListenableFuture d() {
        afxd afxdVarF = afxd.f(e(hpu.b()));
        hpy hpyVar = this.b;
        hpyVar.getClass();
        return afxdVarF.h(new hba(hpyVar, 20), MoreExecutors.directExecutor()).g(new hoh(10), MoreExecutors.directExecutor());
    }

    public final ListenableFuture e(hpu hpuVar) {
        return ahno.as(this.b.a(kro.aq()), new gqb(this, hpuVar, 7), MoreExecutors.directExecutor());
    }

    public final ListenableFuture f() {
        hpy hpyVar = this.b;
        boolean z = !hpyVar.i() && this.h.m(10, 45616924L);
        ListenableFuture listenableFutureD = z ? hpyVar.d(kro.aq()) : hpyVar.a(kro.aq());
        hoh hohVar = new hoh(16);
        Executor executor = this.e;
        ListenableFuture listenableFutureAr = ahno.ar(listenableFutureD, hohVar, executor);
        ListenableFuture listenableFutureJ = j(listenableFutureAr, new hpa(12), z);
        ListenableFuture listenableFutureJ2 = j(listenableFutureAr, new hpa(13), z);
        afxd afxdVarH = afxd.f(j(listenableFutureAr, new hpa(14), z)).h(new hoy(this, z, 2), executor);
        afxd afxdVarH2 = afxd.f(listenableFutureAr).h(new hoy(this, z, 3), executor);
        afxd afxdVarH3 = afxd.f(listenableFutureAr).h(new hoy(this, z, 4), executor);
        return ahno.av(listenableFutureJ, listenableFutureJ2, afxdVarH, afxdVarH2, afxdVarH3).l(new ojh(this, afxdVarH3, afxdVarH2, afxdVarH, listenableFutureJ, listenableFutureJ2, z, 1), executor);
    }

    public final ListenableFuture g(final Function function) {
        return ahno.as(this.b.a(kro.aq()), new ahcy() { // from class: hpj
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return ahng.n(Boolean.FALSE);
                }
                Function function2 = function;
                hpk hpkVar = this.a;
                return hpkVar.c.i((Collection) function2.apply((annv) optional.get()));
            }
        }, MoreExecutors.directExecutor());
    }

    public final ListenableFuture h() {
        int i = wfs.a;
        ListenableFuture listenableFutureA = this.b.a(wfs.f(257, aigj.x("downloads_library")));
        hqm hqmVar = new hqm(this, 1);
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), hqmVar, 1);
        int i2 = ahcs.c;
        Executor executor = this.g;
        ahcq ahcqVar = new ahcq(listenableFutureA, ahdbVar);
        listenableFutureA.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
        return ahcqVar;
    }

    public final ListenableFuture i() {
        return g(new hpa(4));
    }
}
