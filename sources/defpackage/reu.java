package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class reu extends rei {
    final /* synthetic */ rev a;
    private final ria b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public reu(rev revVar, ria riaVar, rgp rgpVar) {
        super(revVar);
        this.a = revVar;
        this.b = riaVar;
        f(rgpVar);
    }

    @Override // defpackage.rei
    protected final boolean b(rjg rjgVar) {
        boolean z;
        if (rjgVar.b(rjf.l)) {
            this.b.i(((quw) this.a.b.b).c);
            z = true;
        } else {
            z = false;
        }
        if (!rjgVar.b(rjf.i) && !rjgVar.b(rjf.v) && !z) {
            return false;
        }
        rgp rgpVar = this.f;
        rgpVar.getClass();
        rgpVar.d();
        this.b.h(Duration.ZERO, this.a.c.n());
        return true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ria riaVar = this.b;
        riaVar.e(null);
        rgp rgpVar = this.f;
        rgpVar.getClass();
        rgpVar.close();
        riaVar.close();
    }

    @Override // defpackage.rei
    public final void a(Duration duration) {
    }
}
