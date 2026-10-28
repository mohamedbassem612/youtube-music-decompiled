package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aapw extends wnn {
    public final Object c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aapw(wlp wlpVar, abxv abxvVar, zwb zwbVar, awmd awmdVar, awmd awmdVar2, tqj tqjVar) {
        super(abxvVar, tqjVar.k(1073828827) ? (tgg) awmdVar2.io() : (tgg) awmdVar.io());
        int i = tqr.a;
        this.c = zwbVar;
        this.d = f(aluf.a, wlpVar, new wql(13), new wre(8));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zwb] */
    public final aapv a() {
        return new aapv(this.b, this.c.e());
    }

    public final ListenableFuture b(aapv aapvVar, Executor executor) {
        aapvVar.m();
        return ((wnh) this.d).b(aapvVar, executor, null);
    }

    public final ListenableFuture c(wqg wqgVar, Executor executor) {
        ListenableFuture listenableFutureF = ((wnl) this.c).f(wqgVar, executor);
        wvk wvkVar = new wvk(1);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), wvkVar);
        int i = ahcs.c;
        ahcr ahcrVar = new ahcr(listenableFutureF, afwiVar);
        listenableFutureF.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
        return ahcrVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zwb] */
    public final wqg d(List list) {
        return new wqg(this.b, this.d.e(), list);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, zwb] */
    public final wpw g() {
        return new wpw(this.b, this.c.e());
    }

    public final ListenableFuture h(wlu wluVar) {
        return ((wnh) this.d).a(wluVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, zwb] */
    public final wor i() {
        return new wor(this.b, this.c.e());
    }

    public final ListenableFuture j(wor worVar, Executor executor) {
        return f(almo.a, (wlp) this.d, new heo(16), new hep(11)).b(worVar, executor, null);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, zwb] */
    public final ListenableFuture k(byte[] bArr, int i, boolean z, Executor executor) {
        woq woqVar = new woq(this);
        wos wosVar = new wos(this.b, this.c.e());
        wosVar.a = bArr;
        wosVar.c = i;
        wosVar.b = z;
        return woqVar.f(wosVar, executor);
    }

    public aapw(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar, byte[] bArr) {
        super(abxvVar, tggVar);
        this.c = zwbVar;
        this.d = f(alpe.a, wlpVar, new hes(19), new het(17));
    }

    public aapw(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar, wjz wjzVar) {
        super(abxvVar, tggVar);
        this.d = zwbVar;
        this.c = new wqf(this, wjzVar, wlpVar);
    }

    protected aapw() {
        this.c = null;
        this.d = zwd.a;
    }

    public aapw(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar) {
        super(abxvVar, tggVar);
        this.d = zwbVar;
        this.c = f(alsz.a, wlpVar, new wql(4), new wre(2));
    }

    public aapw(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar, byte[] bArr, byte[] bArr2) {
        super(abxvVar, tggVar);
        this.c = zwbVar;
        wlpVar.getClass();
        this.d = wlpVar;
    }
}
