package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wru implements acjy {
    public final aoll a;
    private Object b;

    public wru(aoll aollVar) {
        this.a = aollVar;
    }

    @Override // defpackage.acjy
    public final apjh a() {
        apjh apjhVar = this.a.e;
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
        return this.a.g.G();
    }
}
