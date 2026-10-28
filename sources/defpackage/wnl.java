package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class wnl extends wnh {
    public wnl(wlp wlpVar, tgg tggVar, MessageLite messageLite, sya syaVar, sxz sxzVar) {
        super(wlpVar, tggVar, messageLite, syaVar, sxzVar);
    }

    public final ListenableFuture f(wlu wluVar, Executor executor) {
        return g(wluVar, wnn.a, executor, null);
    }

    public final ListenableFuture g(wlu wluVar, wni wniVar, Executor executor, wlt wltVar) {
        return afxd.f(b(wluVar, executor, wltVar)).g(new wnj(this, wniVar, wluVar, 0), MoreExecutors.directExecutor()).c(toe.class, new idm(this, wluVar, 15, null), MoreExecutors.directExecutor());
    }

    public abstract Object h(MessageLite messageLite);

    public final void i(wlu wluVar, zza zzaVar) {
        k(wluVar, wnn.a, zzaVar, null);
    }

    public final void j(wlu wluVar, zza zzaVar, wlt wltVar) {
        k(wluVar, wnn.a, zzaVar, wltVar);
    }

    public final void k(wlu wluVar, wni wniVar, zza zzaVar, wlt wltVar) {
        e(wluVar, new wnk(this, wniVar, wluVar, zzaVar), wltVar);
    }

    public void l(MessageLite messageLite) {
    }

    public void n(wlu wluVar) {
    }

    public void m(wlu wluVar, Object obj) {
    }
}
