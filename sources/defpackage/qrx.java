package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qrx {
    public final String a;
    public final qry b;
    public final afkb c;
    public final afud e;
    private final ListenableFuture g;
    private final afkb h = new afkb(new qrw(this), MoreExecutors.directExecutor());
    public final Object d = new Object();
    public List f = new ArrayList();
    private final auor i = new auor();

    public qrx(qry qryVar, ListenableFuture listenableFuture, boolean z) {
        this.b = qryVar;
        this.g = listenableFuture;
        this.a = qryVar.f();
        this.c = new afkb(qryVar.a(), MoreExecutors.directExecutor());
        if (z) {
            this.e = new afuc();
        } else {
            this.e = new afub();
        }
        b(new olm(this, 16));
    }

    public final ListenableFuture a(agek agekVar, Executor executor) {
        olm olmVar = new olm(agekVar, 15);
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), olmVar, 1);
        new agfp(agdd.a).e();
        afuu afuuVarB = this.e.b("Update ".concat(String.valueOf(this.a)));
        try {
            ListenableFuture listenableFutureA = this.h.a();
            auor auorVar = this.i;
            auorVar.d(new ojf(listenableFutureA, 11), MoreExecutors.directExecutor());
            ListenableFuture listenableFutureD = auorVar.d(new afwh(afty.c(false), new qrv(this, listenableFutureA, ahdbVar, executor, 0), 0), MoreExecutors.directExecutor());
            ahng.z(listenableFutureD, listenableFutureA);
            ahng.o(this.g);
            agel agelVar = new agel();
            Executor executorDirectExecutor = MoreExecutors.directExecutor();
            int i = ahcs.c;
            ahcr ahcrVar = new ahcr(listenableFutureD, agelVar);
            listenableFutureD.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
            afuuVarB.a(ahcrVar);
            afuuVarB.close();
            return ahcrVar;
        } catch (Throwable th) {
            try {
                afuuVarB.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void b(ahcy ahcyVar) {
        synchronized (this.d) {
            this.f.add(ahcyVar);
        }
    }

    public final ListenableFuture c() {
        ListenableFuture listenableFutureH;
        afud afudVar = this.e;
        afudVar.a();
        new agfp(agdd.a).e();
        afkb afkbVar = this.h;
        if (afkbVar.c()) {
            listenableFutureH = this.b.h();
        } else {
            afuu afuuVarB = afudVar.b("Get ".concat(String.valueOf(this.a)));
            try {
                ListenableFuture listenableFutureA = afkbVar.a();
                olm olmVar = new olm(this, 17);
                long j = afwl.a;
                ahdb ahdbVar = new ahdb(afty.c(false), olmVar, 1);
                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                int i = ahcs.c;
                ahcq ahcqVar = new ahcq(listenableFutureA, ahdbVar);
                listenableFutureA.addListener(ahcqVar, MoreExecutors.c(executorDirectExecutor, ahcqVar));
                afuuVarB.a(ahcqVar);
                afuuVarB.close();
                listenableFutureH = ahcqVar;
            } catch (Throwable th) {
                try {
                    afuuVarB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        ahng.o(this.g);
        return ahng.o(listenableFutureH);
    }
}
