package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class rfe extends rei {
    final ListenableFuture a;
    final ria b;
    final rht c;
    final /* synthetic */ rff d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfe(rff rffVar, ListenableFuture listenableFuture, ria riaVar, rht rhtVar, rgp rgpVar) {
        super(rffVar);
        this.d = rffVar;
        this.a = listenableFuture;
        this.b = riaVar;
        this.c = rhtVar;
        f(rgpVar);
    }

    @Override // defpackage.rei
    protected final boolean b(rjg rjgVar) {
        if (!rjgVar.b(rjf.n) && !rjgVar.b(rjf.l) && !rjgVar.b(rjf.i) && !rjgVar.b(rjf.v)) {
            return false;
        }
        rff rffVar = this.d;
        rffVar.q(this.c);
        this.f.d();
        this.b.h(Duration.ZERO, rffVar.c.n());
        return true;
    }

    @Override // defpackage.rei
    public final ren c(Duration duration) {
        ren renVarH = this.f.h(duration);
        if (!renVarH.b()) {
            return renVarH;
        }
        rfs rfsVarA = renVarH.a();
        rff rffVar = this.d;
        rfc rfcVar = (rfc) rffVar.a.get();
        if (rfcVar == null) {
            return ren.a;
        }
        rfsVarA.x(nra.n((quu) rffVar.b.b, rfcVar.a, rffVar.c.n()));
        rfsVarA.t(((quy) rffVar.b.b).b);
        return renVarH;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.cancel(false);
        ria riaVar = this.b;
        riaVar.e(null);
        this.f.close();
        riaVar.close();
        this.d.a.set(null);
    }

    @Override // defpackage.rei
    protected final ListenableFuture d() {
        return this.a;
    }

    @Override // defpackage.rei
    public final void a(Duration duration) {
    }
}
