package defpackage;

import androidx.work.WorkerParameters;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aflv implements aflf {
    public final awmd a;
    private volatile Supplier b = new yoj(16);
    private final jij c;

    public aflv(awmd awmdVar, jij jijVar) {
        this.a = awmdVar;
        this.c = jijVar;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [awmd, java.lang.Object] */
    @Override // defpackage.aflf, defpackage.afln
    public final ListenableFuture a(WorkerParameters workerParameters) {
        afuu afuuVarC = afwt.c(SemanticState.Focused, "NoAccountWorkerFactory startWork()");
        try {
            jij jijVar = this.c;
            aflu afluVar = new aflu(this, afuuVarC, workerParameters, 0);
            Supplier supplier = this.b;
            Set<aext> set = (Set) jijVar.b.io();
            agkx agkxVarI = agkz.i(set.size());
            for (aext aextVar : set) {
                agkxVarI.c(new aflx(supplier));
            }
            ListenableFuture listenableFutureH = ((ahpu) jijVar.c).h(afluVar, agkxVarI.g());
            afuuVarC.close();
            return listenableFutureH;
        } catch (Throwable th) {
            try {
                afuuVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aflf, java.lang.Object] */
    @Override // defpackage.afln
    public final ListenableFuture b(WorkerParameters workerParameters) {
        return this.a.io().b(workerParameters);
    }

    @Override // defpackage.afln
    public final void c(Supplier supplier) {
        this.b = supplier;
    }

    @Override // defpackage.afln
    public final /* synthetic */ void d() {
    }
}
