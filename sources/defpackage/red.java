package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class red extends rei {
    public final rhe a;
    final ListenableFuture b;
    public final rhx c;
    public final /* synthetic */ ree d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public red(ree reeVar, rhx rhxVar, rgw rgwVar) {
        super(reeVar);
        this.d = reeVar;
        rhe rheVar = new rhe();
        this.a = rheVar;
        this.c = rhxVar;
        this.e = Optional.of(rgwVar);
        this.b = ahbz.e(ahcs.e(rhxVar.m, new onn(this, 13), reeVar.a), Exception.class, new onn(this, 14), reeVar.a);
        rheVar.i(reeVar.b.c);
    }

    @Override // defpackage.rei
    public final void a(Duration duration) {
        rhx rhxVar = this.c;
        if (rhxVar.l() && this.f != null) {
            rhxVar.r();
            this.f.d();
        }
        rhxVar.h(duration.minus(this.d.b.c));
    }

    @Override // defpackage.rei
    protected final boolean b(rjg rjgVar) {
        boolean z;
        boolean z2 = false;
        if (rjgVar.b(rjf.b)) {
            rhx rhxVar = this.c;
            ree reeVar = this.d;
            rhxVar.i(reeVar.b.d);
            this.a.i(reeVar.b.c);
            z = true;
        } else {
            z = false;
        }
        boolean zB = rjgVar.b(rjf.t) | z;
        ree reeVar2 = this.d;
        boolean z3 = ((quv) reeVar2.b.b).l && rjgVar.b(rjf.u);
        if (((quv) reeVar2.b.b).p(reeVar2.c.p().n) && rjgVar.b(rjf.j)) {
            z2 = true;
        }
        if (z3 || z2) {
            this.c.v(reeVar2.h());
            zB = true;
        }
        if (!zB || this.f == null) {
            return zB;
        }
        this.c.r();
        this.f.d();
        rgp rgpVar = this.f;
        qup qupVar = reeVar2.b;
        rgpVar.l(qupVar.c, qupVar.b());
        return true;
    }

    @Override // defpackage.rei
    protected final ren c(Duration duration) {
        return this.f == null ? ren.a : super.c(duration);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.cancel(false);
        rhx rhxVar = this.c;
        rhxVar.r();
        rhxVar.e(null);
        rgp rgpVar = this.f;
        if (rgpVar != null) {
            rgpVar.close();
        }
        rhxVar.close();
    }
}
