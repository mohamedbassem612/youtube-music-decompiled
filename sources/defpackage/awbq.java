package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awbq extends avou {
    final avng f;
    Object g;
    boolean h;

    public awbq(avlw avlwVar, avng avngVar) {
        super(avlwVar);
        this.f = avngVar;
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        if (this.d) {
            return;
        }
        if (this.e != 0) {
            this.a.kk(obj);
            return;
        }
        try {
            if (this.h) {
                boolean zA = this.f.a(this.g, obj);
                this.g = obj;
                if (zA) {
                    return;
                }
            } else {
                this.h = true;
                this.g = obj;
            }
            this.a.kk(obj);
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
        boolean zA;
        do {
            objKm = this.c.km();
            if (objKm == null) {
                return null;
            }
            if (!this.h) {
                this.h = true;
                this.g = objKm;
                return objKm;
            }
            zA = this.f.a(this.g, objKm);
            this.g = objKm;
        } while (zA);
        return objKm;
    }
}
