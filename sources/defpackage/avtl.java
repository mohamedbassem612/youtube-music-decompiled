package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avtl extends awjl {
    final avno a;

    public avtl(avok avokVar, avno avnoVar) {
        super(avokVar);
        this.a = avnoVar;
    }

    @Override // defpackage.avok
    public final boolean d(Object obj) {
        if (this.h) {
            return false;
        }
        if (this.i != 0) {
            return this.e.d(null);
        }
        try {
            if (!this.a.a(obj) || !this.e.d(obj)) {
                return false;
            }
        } catch (Throwable th) {
            g(th);
        }
        return true;
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (d(obj)) {
            return;
        }
        this.f.ko(1L);
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        return f(i);
    }

    @Override // defpackage.avot
    public final Object km() {
        avoq avoqVar = this.g;
        while (true) {
            Object objKm = avoqVar.km();
            if (objKm == null) {
                return null;
            }
            if (this.a.a(objKm)) {
                return objKm;
            }
            if (this.i == 2) {
                avoqVar.ko(1L);
            }
        }
    }
}
