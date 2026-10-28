package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Optional;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rqw implements agfr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rqw(Context context, nuc nucVar, tqj tqjVar, mbc mbcVar, int i) {
        this.$cid = i;
        this.a = context;
        this.b = nucVar;
        this.d = tqjVar;
        this.c = mbcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r1v5, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, nuc] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v5, types: [awmd, java.lang.Object] */
    @Override // defpackage.agfr
    public final Object io() {
        int i = this.$cid;
        if (i == 0) {
            ListenableFuture listenableFutureA = ((axqr) this.b).a((affd) this.c);
            olh olhVar = new olh(this.a, 11);
            long j = afwl.a;
            ahcr ahcrVar = new ahcr(listenableFutureA, new afwi(afty.c(false), olhVar));
            listenableFutureA.addListener(ahcrVar, MoreExecutors.c(this.d, ahcrVar));
            return ahcrVar;
        }
        if (i == 1) {
            ?? r0 = this.d;
            ?? r1 = this.b;
            return ((axfd) this.a).V(this.c, r1, r0);
        }
        if (i != 2) {
            ?? r2 = this.c;
            ?? r3 = this.d;
            return new aczl((Context) this.a, (nuc) this.b, (tqj) r3, (mbc) r2);
        }
        Object obj = this.b;
        boolean zIsEmpty = ((Optional) obj).isEmpty();
        Object obj2 = this.a;
        if (zIsEmpty) {
            return -1L;
        }
        try {
            return Long.valueOf(((asjg) aihn.parseFrom(asjg.a, ((Context) obj2).getAssets().open((String) ((Optional) obj).get()), ExtensionRegistryLite.getGeneratedRegistry())).b);
        } catch (IOException unused) {
            ((zs) this.d.io()).B(12, ((ohp) this.c).c);
            return -1L;
        }
    }

    public /* synthetic */ rqw(axfd axfdVar, ahey aheyVar, aunn aunnVar, awmd awmdVar, int i) {
        this.$cid = i;
        this.a = axfdVar;
        this.c = aheyVar;
        this.b = aunnVar;
        this.d = awmdVar;
    }

    public /* synthetic */ rqw(Optional optional, Context context, awmd awmdVar, ohp ohpVar, int i) {
        this.$cid = i;
        this.b = optional;
        this.a = context;
        this.d = awmdVar;
        this.c = ohpVar;
    }

    public /* synthetic */ rqw(rqx rqxVar, axqr axqrVar, affd affdVar, Executor executor, int i) {
        this.$cid = i;
        this.a = rqxVar;
        this.b = axqrVar;
        this.c = affdVar;
        this.d = executor;
    }
}
