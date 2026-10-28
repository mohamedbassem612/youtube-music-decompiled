package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ogk extends ofu {
    protected final ogh a;
    private final boolean b;

    public ogk(ogh oghVar, boolean z) {
        this.a = oghVar;
        this.b = z;
    }

    @Override // defpackage.ofu
    public final double a() {
        return this.a.n;
    }

    @Override // defpackage.ofu
    public final void b(ogh oghVar, ofo ofoVar) {
        ofl oflVar = oghVar.f;
        if (oflVar == null) {
            oflVar = new ofl(0.0d, 0.0d, null, null, null, null);
        }
        d(oghVar, new ogo(oflVar, oghVar.n, oghVar.f().booleanValue()), ofoVar);
        if (this.b) {
            oghVar.p(ofoVar);
        }
        oghVar.q();
    }

    @Override // defpackage.ofu
    public final void c() {
        this.a.q();
    }
}
