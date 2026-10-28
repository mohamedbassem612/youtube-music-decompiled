package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class avfj extends avbt {
    public final avbt b;

    public avfj(avbt avbtVar) {
        this.b = avbtVar;
    }

    @Override // defpackage.avbt
    public final String a() {
        return this.b.a();
    }

    @Override // defpackage.avbt
    public final void b() {
        this.b.b();
    }

    @Override // defpackage.avbt
    public void c() {
        throw null;
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("delegate", this.b);
        return ageuVarAc.toString();
    }
}
