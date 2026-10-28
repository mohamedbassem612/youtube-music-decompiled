package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class rez extends rei {
    final /* synthetic */ rfa a;
    private final ListenableFuture b;
    private final rhe c;
    private final rif d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rez(rfa rfaVar, ListenableFuture listenableFuture, rgw rgwVar, rhe rheVar, rgp rgpVar, rif rifVar) {
        super(rfaVar);
        this.a = rfaVar;
        this.b = listenableFuture;
        this.e = Optional.of(rgwVar);
        this.c = rheVar;
        this.d = rifVar;
        f(rgpVar);
    }

    @Override // defpackage.rei
    public final synchronized void a(Duration duration) {
        rif rifVar = this.d;
        rifVar.r();
        this.f.d();
        rifVar.h(duration.minus(this.a.b.c));
    }

    @Override // defpackage.rei
    protected final boolean b(rjg rjgVar) {
        boolean zB = rjgVar.b(rjf.t);
        if (rjgVar.b(rjf.b)) {
            rhe rheVar = this.c;
            rfa rfaVar = this.a;
            rheVar.i(rfaVar.b.c);
            this.d.i(rfaVar.b.d);
            zB = true;
        }
        if (zB) {
            this.d.r();
            this.f.d();
            rgp rgpVar = this.f;
            qup qupVar = this.a.b;
            rgpVar.l(qupVar.c, qupVar.b());
        }
        return zB;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.cancel(false);
        rif rifVar = this.d;
        rifVar.r();
        rifVar.e(null);
        this.f.close();
        rifVar.close();
    }

    @Override // defpackage.rei
    protected final ListenableFuture d() {
        return this.b;
    }
}
