package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class rfd extends rei {
    final ListenableFuture a;
    final rif b;
    final rht c;
    final rhe d;
    final /* synthetic */ rff j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfd(rff rffVar, ListenableFuture listenableFuture, rif rifVar, rht rhtVar, rgp rgpVar, rhe rheVar) {
        super(rffVar);
        this.j = rffVar;
        this.a = listenableFuture;
        this.b = rifVar;
        this.c = rhtVar;
        this.d = rheVar;
        f(rgpVar);
    }

    @Override // defpackage.rei
    public final void a(Duration duration) {
        rif rifVar = this.b;
        rifVar.r();
        rgp rgpVar = this.f;
        rgpVar.getClass();
        rgpVar.d();
        rifVar.h(duration.minus(this.j.b.c));
    }

    @Override // defpackage.rei
    protected final boolean b(rjg rjgVar) {
        boolean z;
        boolean z2 = true;
        if (rjgVar.b(rjf.b)) {
            rhe rheVar = this.d;
            rff rffVar = this.j;
            rheVar.i(rffVar.b.c);
            this.b.i(rffVar.b.d);
            z = true;
        } else {
            z = false;
        }
        if (rjgVar.b(rjf.n) || rjgVar.b(rjf.l) || rjgVar.b(rjf.i) || rjgVar.b(rjf.v)) {
            rff rffVar2 = this.j;
            rffVar2.q(this.c);
            if (rjgVar.b(rjf.v)) {
                rif rifVar = this.b;
                req reqVar = rffVar2.c;
                rifVar.u(reqVar.n());
                rifVar.t(reqVar.n());
            }
        } else {
            z2 = z;
        }
        if (z2) {
            this.b.r();
            rgp rgpVar = this.f;
            rgpVar.getClass();
            rgpVar.d();
            rgp rgpVar2 = this.f;
            rgpVar2.getClass();
            qup qupVar = this.j.b;
            rgpVar2.l(qupVar.c, qupVar.b());
        }
        return z2;
    }

    @Override // defpackage.rei
    public final ren c(Duration duration) {
        ren renVarH = this.f.h(duration);
        if (!renVarH.b()) {
            return renVarH;
        }
        rfs rfsVarA = renVarH.a();
        rff rffVar = this.j;
        rfc rfcVar = (rfc) rffVar.a.get();
        if (rfcVar == null) {
            return ren.a;
        }
        rfsVarA.x(nra.n((quu) rffVar.b.b, rfcVar.a, rffVar.c.n()));
        duration.minus(rffVar.b.c);
        rfsVarA.t(nrc.i((quy) rffVar.b.b));
        return renVarH;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.cancel(false);
        rif rifVar = this.b;
        rifVar.r();
        rifVar.e(null);
        rgp rgpVar = this.f;
        rgpVar.getClass();
        rgpVar.close();
        rifVar.close();
        this.j.a.set(null);
    }

    @Override // defpackage.rei
    protected final ListenableFuture d() {
        return this.a;
    }
}
