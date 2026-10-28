package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ooi extends ahef {
    public static ooi d(ListenableFuture listenableFuture) {
        return listenableFuture instanceof ooi ? (ooi) listenableFuture : new ooi(listenableFuture);
    }

    public final ooi b(Class cls, agek agekVar, Executor executor) {
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), agekVar);
        int i = ahbz.d;
        ListenableFuture listenableFuture = this.b;
        ahby ahbyVar = new ahby(listenableFuture, cls, afwiVar);
        listenableFuture.addListener(ahbyVar, MoreExecutors.c(executor, ahbyVar));
        return new ooi(ahbyVar);
    }

    public final ooi c(Class cls, ahcy ahcyVar, Executor executor) {
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), ahcyVar, 1);
        int i = ahbz.d;
        ListenableFuture listenableFuture = this.b;
        ahbx ahbxVar = new ahbx(listenableFuture, cls, ahdbVar);
        listenableFuture.addListener(ahbxVar, MoreExecutors.c(executor, ahbxVar));
        return new ooi(ahbxVar);
    }

    public final ooi e(agek agekVar, Executor executor) {
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), agekVar);
        int i = ahcs.c;
        ListenableFuture listenableFuture = this.b;
        ahcr ahcrVar = new ahcr(listenableFuture, afwiVar);
        listenableFuture.addListener(ahcrVar, MoreExecutors.c(executor, ahcrVar));
        return new ooi(ahcrVar);
    }

    public final ooi f(ahcy ahcyVar, Executor executor) {
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), ahcyVar, 1);
        int i = ahcs.c;
        ListenableFuture listenableFuture = this.b;
        ahcq ahcqVar = new ahcq(listenableFuture, ahdbVar);
        listenableFuture.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
        return new ooi(ahcqVar);
    }
}
