package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wrq implements wnf {
    public boolean a;
    private final wrv b;

    public wrq(wrv wrvVar, boolean z) {
        wrvVar.getClass();
        this.b = wrvVar;
        this.a = z;
    }

    @Override // defpackage.wnf
    public final wlu a(acjx acjxVar) {
        acjxVar.getClass();
        boolean z = this.a;
        wrv wrvVar = this.b;
        if (z) {
            wrw wrwVarB = wrvVar.b();
            wrwVarB.s(acjxVar);
            return wrwVarB;
        }
        wrw wrwVarA = wrvVar.a();
        wrwVarA.q(acjxVar);
        return wrwVarA;
    }

    @Override // defpackage.wnf
    public final ListenableFuture b(wlu wluVar, wne wneVar, Executor executor) {
        wluVar.getClass();
        wneVar.getClass();
        return this.a ? this.b.g(wluVar, wneVar, executor) : zik.ch(this, wluVar, wneVar);
    }

    @Override // defpackage.wnf
    public final void c(wlu wluVar, wne wneVar, zza zzaVar) {
        wluVar.getClass();
        wneVar.getClass();
        boolean z = this.a;
        wrv wrvVar = this.b;
        if (z) {
            ahng.x(wrvVar.g(wluVar, wneVar, MoreExecutors.directExecutor()), afwl.g(new ryh(zzaVar, 5)), wrvVar.e);
        } else {
            wrvVar.g.k((wrw) wluVar, wneVar, zzaVar, null);
        }
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture d(wlu wluVar, wne wneVar, Executor executor) {
        return b(wluVar, wneVar, executor);
    }
}
