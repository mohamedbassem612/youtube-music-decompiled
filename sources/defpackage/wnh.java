package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class wnh {
    private final wlp a;
    private final tgg b;
    private final sya c;
    private final sxz d;
    private final MessageLite e;

    public wnh(wlp wlpVar, tgg tggVar, MessageLite messageLite, sya syaVar, sxz sxzVar) {
        wlpVar.getClass();
        this.a = wlpVar;
        tggVar.getClass();
        this.b = tggVar;
        messageLite.getClass();
        this.e = messageLite;
        this.c = syaVar;
        this.d = sxzVar;
    }

    @Deprecated
    public final ListenableFuture a(wlu wluVar) {
        return b(wluVar, MoreExecutors.directExecutor(), null);
    }

    public final ListenableFuture b(wlu wluVar, Executor executor, wlt wltVar) {
        wlo wloVarB;
        wlp wlpVar = this.a;
        if (wltVar == null) {
            wloVarB = wlpVar.a(wluVar, this.e, zyy.a, this.c, this.d);
        } else {
            wloVarB = wlpVar.b(wluVar, this.e, zyy.a, this.c, this.d, wltVar);
        }
        ListenableFuture listenableFutureC = this.b.c(wloVarB);
        thc thcVar = new thc(new syd(wloVarB, 14), 0);
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), thcVar, 1);
        int i = ahcs.c;
        ahcq ahcqVar = new ahcq(listenableFutureC, ahdbVar);
        listenableFutureC.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
        qmd qmdVar = new qmd(3);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        ahcr ahcrVar = new ahcr(ahcqVar, new afwi(afty.c(false), qmdVar));
        ahcqVar.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
        return ahcrVar;
    }

    public final MessageLite c(wlu wluVar) {
        taq.c();
        zyz zyzVar = new zyz();
        d(wluVar, zyzVar);
        return (MessageLite) taf.b(zyzVar, new vxq(8));
    }

    @Deprecated
    public final void d(wlu wluVar, zza zzaVar) {
        sya syaVar = this.c;
        sxz sxzVar = this.d;
        MessageLite messageLite = this.e;
        this.b.b(this.a.a(wluVar, messageLite, zzaVar, syaVar, sxzVar));
    }

    @Deprecated
    public final void e(wlu wluVar, zza zzaVar, wlt wltVar) {
        tgg tggVar = this.b;
        if (wltVar == null) {
            tggVar.b(this.a.a(wluVar, this.e, zzaVar, this.c, this.d));
        } else {
            tggVar.b(this.a.b(wluVar, this.e, zzaVar, this.c, this.d, wltVar));
        }
    }
}
