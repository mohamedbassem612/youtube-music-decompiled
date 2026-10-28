package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awcf extends avou {
    final avno f;

    public awcf(avlw avlwVar, avno avnoVar) {
        super(avlwVar);
        this.f = avnoVar;
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        if (this.e != 0) {
            this.a.kk(null);
            return;
        }
        try {
            if (this.f.a(obj)) {
                this.a.kk(obj);
            }
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
        Object objKm;
        do {
            objKm = this.c.km();
            if (objKm == null) {
                break;
            }
        } while (!this.f.a(objKm));
        return objKm;
    }
}
