package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afxd extends ahef {
    public afxd(ListenableFuture listenableFuture) {
        super(listenableFuture);
    }

    public static afxd f(ListenableFuture listenableFuture) {
        return listenableFuture instanceof afxd ? (afxd) listenableFuture : new afxd(listenableFuture);
    }

    public final afxd b(Class cls, agek agekVar, Executor executor) {
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), agekVar);
        int i = ahbz.d;
        ListenableFuture listenableFuture = this.b;
        ahby ahbyVar = new ahby(listenableFuture, cls, afwiVar);
        listenableFuture.addListener(ahbyVar, MoreExecutors.c(executor, ahbyVar));
        return new afxd(ahbyVar);
    }

    public final afxd c(Class cls, ahcy ahcyVar, Executor executor) {
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), ahcyVar, 1);
        int i = ahbz.d;
        ListenableFuture listenableFuture = this.b;
        ahbx ahbxVar = new ahbx(listenableFuture, cls, ahdbVar);
        listenableFuture.addListener(ahbxVar, MoreExecutors.c(executor, ahbxVar));
        return new afxd(ahbxVar);
    }

    public final afxd g(agek agekVar, Executor executor) {
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), agekVar);
        int i = ahcs.c;
        ListenableFuture listenableFuture = this.b;
        ahcr ahcrVar = new ahcr(listenableFuture, afwiVar);
        listenableFuture.addListener(ahcrVar, MoreExecutors.c(executor, ahcrVar));
        return new afxd(ahcrVar);
    }

    public final afxd h(ahcy ahcyVar, Executor executor) {
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), ahcyVar, 1);
        int i = ahcs.c;
        ListenableFuture listenableFuture = this.b;
        ahcq ahcqVar = new ahcq(listenableFuture, ahdbVar);
        listenableFuture.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
        return new afxd(ahcqVar);
    }

    public final void i(aheh ahehVar, Executor executor) {
        long j = afwl.a;
        afwj afwjVar = new afwj(afty.c(false), ahehVar, 0);
        ListenableFuture listenableFuture = this.b;
        listenableFuture.addListener(new ahei(listenableFuture, afwjVar), executor);
    }
}
