package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class rdz extends rei {
    private final ria a;

    public rdz(rea reaVar, ria riaVar, rgp rgpVar) {
        super(reaVar);
        this.a = riaVar;
        f(rgpVar);
    }

    @Override // defpackage.rei
    protected final boolean b(rjg rjgVar) {
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ria riaVar = this.a;
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
