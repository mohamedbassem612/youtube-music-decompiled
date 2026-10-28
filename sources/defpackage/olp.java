package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class olp {
    public static volatile boolean a = false;
    public final Context b;
    public final ola c;
    public final omb d;
    public final onp e;
    public final agev f;
    public final Executor g;
    public final agev h;
    public final oii i;
    public final onc j;
    public final ong k;
    public final omn l;
    public final xgg m;
    public final omn n;
    public final isi o;
    public final syn p;
    public final qnl q;

    public olp(Context context, ong ongVar, omn omnVar, omb ombVar, xgg xggVar, ola olaVar, omn omnVar2, qnl qnlVar, onp onpVar, syn synVar, isi isiVar, agev agevVar, Executor executor, agev agevVar2, oii oiiVar, onc oncVar) {
        this.b = context;
        this.k = ongVar;
        this.l = omnVar;
        this.d = ombVar;
        this.m = xggVar;
        this.c = olaVar;
        this.n = omnVar2;
        this.q = qnlVar;
        this.e = onpVar;
        this.p = synVar;
        this.o = isiVar;
        this.f = agevVar;
        this.g = executor;
        this.h = agevVar2;
        this.i = oiiVar;
        this.j = oncVar;
    }

    public static final ListenableFuture f(oip oipVar) {
        long j = oipVar.s;
        return aher.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, omb] */
    public final ListenableFuture a() {
        omn omnVar = this.l;
        return ahno.as(ahno.as(omnVar.d.c(), new oll(omnVar, 9), omnVar.b), new oll(this, 6), this.g);
    }

    public final ListenableFuture b() {
        ListenableFuture listenableFutureB = this.l.b();
        hqm hqmVar = new hqm(this, 15);
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), hqmVar, 1);
        int i = ahcs.c;
        Executor executor = this.g;
        ahcq ahcqVar = new ahcq(listenableFutureB, ahdbVar);
        listenableFutureB.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
        return ahcqVar;
    }

    public final ListenableFuture c(boolean z, ahcy ahcyVar) {
        int i = onb.a;
        ListenableFuture listenableFutureE = e();
        olo oloVar = new olo(this, z, ahcyVar, 0);
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), oloVar, 1);
        int i2 = ahcs.c;
        Executor executor = this.g;
        ahcq ahcqVar = new ahcq(listenableFutureE, ahdbVar);
        listenableFutureE.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
        return ahcqVar;
    }

    public final ListenableFuture d(oiw oiwVar, boolean z) {
        String str = oiwVar.c;
        String str2 = oiwVar.d;
        int i = onb.a;
        return ahno.as(e(), new iak(this, oiwVar, z, 3), this.g);
    }

    public final ListenableFuture e() {
        if (a) {
            return aher.a;
        }
        ooi ooiVarD = ooi.d(aher.a);
        hqm hqmVar = new hqm(this, 20);
        Executor executor = this.g;
        return ooiVarD.f(hqmVar, executor).f(new olm(this, 1), executor).f(new olm(this, 0), executor).f(new olm(this, 2), executor).e(new hys(19), executor);
    }
}
