package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class rei implements AutoCloseable {
    private Runnable a;
    public Optional e;
    public rgp f;
    public Duration g;
    public ListenableFuture h;
    final /* synthetic */ res i;

    protected rei(res resVar) {
        this.i = resVar;
        this.e = Optional.empty();
        this.g = Duration.ZERO;
    }

    public abstract void a(Duration duration);

    protected abstract boolean b(rjg rjgVar);

    protected ren c(Duration duration) {
        rgp rgpVar = this.f;
        rgpVar.getClass();
        ren renVarH = rgpVar.h(duration);
        if (renVarH.b()) {
            rfs rfsVarA = renVarH.a();
            res resVar = this.i;
            qup qupVar = resVar.b;
            resVar.n(rfsVarA, (rjp) qupVar.b, duration.minus(qupVar.c));
        }
        return renVarH;
    }

    protected ListenableFuture d() {
        return aher.a;
    }

    public final void e(Runnable runnable) {
        this.a = runnable;
        rgp rgpVar = this.f;
        if (rgpVar != null) {
            rgpVar.g = runnable;
        }
    }

    public final synchronized void f(rgp rgpVar) {
        ahno.O(this.f == null);
        this.f = rgpVar;
        Runnable runnable = this.a;
        if (runnable != null) {
            rgpVar.g = runnable;
        }
    }

    public rei() {
        this.e = Optional.empty();
    }
}
