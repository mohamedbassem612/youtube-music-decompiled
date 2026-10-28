package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ojf implements ahcx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ojf(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v11, types: [ahcx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r8v42, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v49, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [ahcx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v54, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v55, types: [afne, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v58, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v60, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r8v8, types: [ahcx, java.lang.Object] */
    @Override // defpackage.ahcx
    public final ListenableFuture a() throws Exception {
        ListenableFuture aherVar;
        int i = 6;
        int i2 = 5;
        int i3 = 3;
        int i4 = 1;
        int i5 = 0;
        switch (this.$cid) {
            case 0:
                int i6 = onb.a;
                Object obj = this.a;
                olp olpVar = (olp) obj;
                ooi ooiVarD = ooi.d(olpVar.e());
                olm olmVar = new olm(obj, i3);
                Executor executor = olpVar.g;
                return ooiVarD.f(olmVar, executor).f(new olm(obj, 4), MoreExecutors.directExecutor()).f(new olm(obj, i2), executor);
            case 1:
                this.a.run();
                return aher.a;
            case 2:
                return ahno.ar(this.a.a(), new one(i5), MoreExecutors.directExecutor());
            case 3:
                return ahno.ar(this.a.a(), new one(2), MoreExecutors.directExecutor());
            case 4:
                return ahno.ar(this.a.a(), new one(i4), MoreExecutors.directExecutor());
            case 5:
                return ahno.ar(this.a, new one(i3), MoreExecutors.directExecutor());
            case 6:
                qfy qfyVar = (qfy) this.a;
                return (!qfyVar.n() || qfyVar.c.getAndSet(true)) ? aher.a : qfyVar.p(6, (qfq) qfyVar.b.io(), ((qfs) qfyVar.e.io()).f);
            case 7:
                qfy qfyVar2 = (qfy) this.a;
                if (qfyVar2.n()) {
                    aerj aerjVar = qfyVar2.g;
                    if (((AtomicBoolean) aerjVar.b).getAndSet(false)) {
                        ahng.s(new iud(aerjVar, i2), aerjVar.a);
                    } else {
                        ListenableFuture listenableFuture = aher.a;
                    }
                }
                return aher.a;
            case 8:
                Object obj2 = this.a;
                return mef.d(((qgg) obj2).b, new qca(obj2, 7));
            case 9:
                Object obj3 = this.a;
                olm olmVar2 = new olm(obj3, 12);
                long j = afwl.a;
                ahdb ahdbVar = new ahdb(afty.c(false), olmVar2, 1);
                qrt qrtVar = (qrt) obj3;
                Executor executor2 = qrtVar.b;
                int i7 = ahcs.c;
                ListenableFuture listenableFuture2 = qrtVar.a;
                ahcq ahcqVar = new ahcq(listenableFuture2, ahdbVar);
                listenableFuture2.addListener(ahcqVar, MoreExecutors.c(executor2, ahcqVar));
                return ahng.o(ahcqVar);
            case 10:
                Object obj4 = this.a;
                qrt qrtVar2 = (qrt) obj4;
                ListenableFuture listenableFuture3 = qrtVar2.a;
                ahno.R(listenableFuture3.isDone(), "Future was expected to be done: %s", listenableFuture3);
                try {
                    Object objD = ((qrt) obj4).d((Uri) a.i(listenableFuture3));
                    return objD == null ? aher.a : new aher(objD);
                } catch (IOException e) {
                    qrs qrsVar = new qrs(obj4, 0);
                    agev agevVar = qrtVar2.c;
                    if (!agevVar.g()) {
                        return ahng.m(e);
                    }
                    if ((e instanceof qpx) || (e.getCause() instanceof qpx)) {
                        return ahng.m(e);
                    }
                    ListenableFuture listenableFutureA = ((qrb) agevVar.c()).a(e, qrsVar);
                    qmu qmuVar = new qmu(obj4, i);
                    long j2 = afwl.a;
                    ahdb ahdbVar2 = new ahdb(afty.c(false), qmuVar, 1);
                    Executor executor3 = qrtVar2.b;
                    int i8 = ahcs.c;
                    ahcq ahcqVar2 = new ahcq(listenableFutureA, ahdbVar2);
                    listenableFutureA.addListener(ahcqVar2, MoreExecutors.c(executor3, ahcqVar2));
                    aherVar = ahcqVar2;
                }
                break;
            case 11:
                return this.a;
            case 12:
                aherVar = new aher(this.a);
                break;
            case 13:
                ((aado) this.a).z();
                return aher.a;
            case 14:
                return afip.a((Set) ((afip) this.a).g.io()).a(new okp(10), MoreExecutors.directExecutor());
            case 15:
                return this.a;
            case 16:
                ListenableFuture listenableFutureA2 = this.a.a();
                abzy abzyVar = new abzy(16);
                long j3 = afwl.a;
                afwi afwiVar = new afwi(afty.c(false), abzyVar);
                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                int i9 = ahcs.c;
                ahcr ahcrVar = new ahcr(listenableFutureA2, afwiVar);
                listenableFutureA2.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
                return ahcrVar;
            case 17:
            case 18:
                return this.a;
            default:
                Object objCall = this.a.call();
                if (objCall == null) {
                    return aher.a;
                }
                aherVar = new aher(objCall);
                break;
        }
        return aherVar;
    }
}
