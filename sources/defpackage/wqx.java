package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wqx extends wnn implements wnf {
    private final zwb c;
    private final wqw d;

    public wqx(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar) {
        super(abxvVar, tggVar);
        this.c = zwbVar;
        this.d = new wqw(wlpVar, tggVar);
    }

    @Override // defpackage.wnf
    public final wlu a(acjx acjxVar) {
        wqs wqsVarG = g();
        wqsVarG.q(acjxVar);
        return wqsVarG;
    }

    @Override // defpackage.wnf
    public final ListenableFuture b(wlu wluVar, wne wneVar, Executor executor) {
        return this.d.g((wqs) wluVar, wneVar, executor, null);
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture d(wlu wluVar, wne wneVar, Executor executor) {
        return b(wluVar, wneVar, executor);
    }

    public final wqs g() {
        return new wqs(this.b, this.c.e());
    }

    @Override // defpackage.wnf
    public final /* synthetic */ void c(wlu wluVar, wne wneVar, zza zzaVar) {
    }
}
