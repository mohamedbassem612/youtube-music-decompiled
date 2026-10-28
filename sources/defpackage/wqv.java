package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class wqv implements acjy {
    final /* synthetic */ alsc a;
    private Object b;

    public wqv(alsc alscVar) {
        this.a = alscVar;
    }

    @Override // defpackage.acjy
    public final apjh a() {
        alsc alscVar = this.a;
        if ((alscVar.b & 4) == 0) {
            return null;
        }
        apjh apjhVar = alscVar.d;
        return apjhVar == null ? apjh.a : apjhVar;
    }

    @Override // defpackage.acjy
    public final Object b() {
        return this.b;
    }

    @Override // defpackage.acjy
    public final void c(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.acjy
    public final byte[] d() {
        return this.a.e.G();
    }
}
