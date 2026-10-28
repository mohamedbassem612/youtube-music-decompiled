package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class avfi extends avax {
    public final avax a;

    public avfi(avax avaxVar) {
        this.a = avaxVar;
    }

    @Override // defpackage.auyr
    public final auyt a(avbh avbhVar, auyq auyqVar) {
        return this.a.a(avbhVar, auyqVar);
    }

    @Override // defpackage.auyr
    public final String b() {
        return this.a.b();
    }

    @Override // defpackage.avax
    public void d() {
        throw null;
    }

    @Override // defpackage.avax
    public void e() {
        throw null;
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("delegate", this.a);
        return ageuVarAc.toString();
    }
}
