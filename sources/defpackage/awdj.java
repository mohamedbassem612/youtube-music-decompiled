package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awdj extends avou {
    final avnn f;

    public awdj(avlw avlwVar, avnn avnnVar) {
        super(avlwVar);
        this.f = avnnVar;
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        if (this.d) {
            return;
        }
        if (this.e != 0) {
            this.a.kk(null);
            return;
        }
        try {
            Object objA = this.f.a(obj);
            objA.getClass();
            this.a.kk(objA);
        } catch (Throwable th) {
            g(th);
        }
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        return e(i);
    }

    @Override // defpackage.avot
    public final Object km() {
        Object objKm = this.c.km();
        if (objKm == null) {
            return null;
        }
        Object objA = this.f.a(objKm);
        objA.getClass();
        return objA;
    }
}
